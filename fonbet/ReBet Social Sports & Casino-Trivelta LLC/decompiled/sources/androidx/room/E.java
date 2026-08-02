package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E implements E2.h, InterfaceC2271i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23262b;

    /* renamed from: c, reason: collision with root package name */
    public final File f23263c;

    /* renamed from: d, reason: collision with root package name */
    public final Callable f23264d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23265e;

    /* renamed from: f, reason: collision with root package name */
    public final E2.h f23266f;

    /* renamed from: g, reason: collision with root package name */
    public C2270h f23267g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23268h;

    public E(Context context, String str, File file, Callable callable, int i10, E2.h delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f23261a = context;
        this.f23262b = str;
        this.f23263c = file;
        this.f23264d = callable;
        this.f23265e = i10;
        this.f23266f = delegate;
    }

    public final void B(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f23261a.getDatabasePath(databaseName);
        C2270h c2270h = this.f23267g;
        C2270h c2270h2 = null;
        if (c2270h == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            c2270h = null;
        }
        G2.a aVar = new G2.a(databaseName, this.f23261a.getFilesDir(), c2270h.f23375s);
        try {
            G2.a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    d(databaseFile, z10);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                int d10 = A2.b.d(databaseFile);
                if (d10 == this.f23265e) {
                    aVar.d();
                    return;
                }
                C2270h c2270h3 = this.f23267g;
                if (c2270h3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                } else {
                    c2270h2 = c2270h3;
                }
                if (c2270h2.a(d10, this.f23265e)) {
                    aVar.d();
                    return;
                }
                if (this.f23261a.deleteDatabase(databaseName)) {
                    try {
                        d(databaseFile, z10);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar.d();
                return;
            }
        } catch (Throwable th2) {
            aVar.d();
            throw th2;
        }
        aVar.d();
        throw th2;
    }

    @Override // E2.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.f23268h = false;
    }

    public final void d(File file, boolean z10) {
        ReadableByteChannel newChannel;
        if (this.f23262b != null) {
            newChannel = Channels.newChannel(this.f23261a.getAssets().open(this.f23262b));
            Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f23263c != null) {
            newChannel = new FileInputStream(this.f23263c).getChannel();
            Intrinsics.checkNotNullExpressionValue(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f23264d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                newChannel = Channels.newChannel((InputStream) callable.call());
                Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f23261a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(output, "output");
        A2.c.a(newChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        k(intermediateFile, z10);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    @Override // E2.h
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.room.InterfaceC2271i
    public E2.h getDelegate() {
        return this.f23266f;
    }

    @Override // E2.h
    public E2.g getWritableDatabase() {
        if (!this.f23268h) {
            B(true);
            this.f23268h = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void k(File file, boolean z10) {
        C2270h c2270h = this.f23267g;
        if (c2270h == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            c2270h = null;
        }
        c2270h.getClass();
    }

    public final void r(C2270h databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.f23267g = databaseConfiguration;
    }

    @Override // E2.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        getDelegate().setWriteAheadLoggingEnabled(z10);
    }
}
