package io.sentry.cache;

import io.sentry.C7165l;
import io.sentry.C7222x2;
import io.sentry.E;
import io.sentry.H2;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7126b0;
import io.sentry.S1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.V1;
import io.sentry.W2;
import io.sentry.Z0;
import io.sentry.h3;
import io.sentry.hints.m;
import io.sentry.hints.n;
import io.sentry.util.p;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class f extends c implements g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f67785j = 0;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f67786f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final WeakHashMap f67787g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f67788h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f67789i;

    public f(@NotNull W2 w22, @NotNull String str, int i11) {
        super(w22, str, i11);
        this.f67787g = new WeakHashMap();
        this.f67788h = new io.sentry.util.a();
        this.f67789i = new io.sentry.util.a();
        this.f67786f = new CountDownLatch(1);
    }

    @NotNull
    private File[] e() {
        File file = this.f67782c;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] listFiles = file.listFiles(new e());
            if (listFiles != null) {
                return listFiles;
            }
        } else {
            this.f67780a.getLogger().c(I2.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    @NotNull
    private File g(@NotNull V1 v12) {
        String str;
        InterfaceC7097a0 a11 = this.f67788h.a();
        WeakHashMap weakHashMap = this.f67787g;
        try {
            if (weakHashMap.containsKey(v12)) {
                str = (String) weakHashMap.get(v12);
            } else {
                String concat = Z0.c().concat(".envelope");
                weakHashMap.put(v12, concat);
                str = concat;
            }
            File file = new File(this.f67782c.getAbsolutePath(), str);
            a11.close();
            return file;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private boolean i(@NotNull V1 v12, @NotNull E e11) {
        W2 w22;
        BufferedReader bufferedReader;
        Throwable th2;
        BufferedReader bufferedReader2;
        Date date;
        Date c11;
        boolean z11;
        boolean z12;
        FileOutputStream fileOutputStream;
        p.b(v12, "Envelope is required.");
        c(e());
        File file = this.f67782c;
        File file2 = new File(file.getAbsolutePath(), "session.json");
        File file3 = new File(file.getAbsolutePath(), "previous_session.json");
        boolean b11 = io.sentry.util.h.b(e11, m.class);
        W2 w23 = this.f67780a;
        if (b11 && !file2.delete()) {
            w23.getLogger().c(I2.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        boolean isInstance = io.sentry.hints.a.class.isInstance(e11.d("sentry:typeCheckHint"));
        io.sentry.util.l<InterfaceC7126b0> lVar = this.f67781b;
        Charset charset = c.f67779e;
        if (isInstance || io.sentry.hints.j.class.isInstance(e11.d("sentry:typeCheckHint"))) {
            Object d11 = e11.d("sentry:typeCheckHint");
            File file4 = new File(file.getAbsolutePath(), "previous_session.json");
            if (file4.exists()) {
                ILogger logger = w23.getLogger();
                I2 i22 = I2.WARNING;
                w22 = w23;
                logger.c(i22, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new FileInputStream(file4), charset));
                    try {
                        h3 h3Var = (h3) lVar.a().c(bufferedReader3, h3.class);
                        if (h3Var != null) {
                            try {
                                if (d11 instanceof io.sentry.hints.a) {
                                    io.sentry.hints.a aVar = (io.sentry.hints.a) d11;
                                    Long a11 = aVar.a();
                                    if (a11 != null) {
                                        try {
                                            c11 = C7165l.c(a11.longValue());
                                            Date h11 = h3Var.h();
                                            if (h11 != null) {
                                                if (c11.before(h11)) {
                                                }
                                            }
                                            w22.getLogger().c(i22, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                            bufferedReader3.close();
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            bufferedReader = bufferedReader3;
                                            try {
                                                bufferedReader.close();
                                                throw th2;
                                            } catch (Throwable th4) {
                                                th2.addSuppressed(th4);
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        c11 = null;
                                    }
                                    bufferedReader2 = bufferedReader3;
                                    h3Var.m(h3.b.Abnormal, null, true, aVar.d());
                                    date = c11;
                                } else {
                                    bufferedReader2 = bufferedReader3;
                                    if (d11 instanceof io.sentry.hints.j) {
                                        Date c12 = C7165l.c(((io.sentry.hints.j) d11).a().longValue());
                                        Date h12 = h3Var.h();
                                        if (h12 != null && !c12.before(h12)) {
                                            h3Var.m(h3.b.Crashed, null, true, null);
                                            date = c12;
                                        }
                                        w22.getLogger().c(i22, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                                    } else {
                                        date = null;
                                    }
                                }
                                h3Var.b(date);
                                l(file4, h3Var);
                            } catch (Throwable th5) {
                                th = th5;
                                th2 = th;
                                bufferedReader.close();
                                throw th2;
                            }
                        } else {
                            bufferedReader2 = bufferedReader3;
                        }
                        bufferedReader2.close();
                    } catch (Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader3;
                    }
                } catch (Throwable th7) {
                    w22.getLogger().a(I2.ERROR, "Error processing previous session.", th7);
                }
            } else {
                w22 = w23;
                w22.getLogger().c(I2.DEBUG, "No previous session file to end.", new Object[0]);
            }
        } else {
            w22 = w23;
        }
        if (n.class.isInstance(e11.d("sentry:typeCheckHint"))) {
            h(file2, file3);
            Iterable<C7222x2> b12 = v12.b();
            if (b12.iterator().hasNext()) {
                C7222x2 next = b12.iterator().next();
                if (H2.Session.equals(next.p().e())) {
                    try {
                        BufferedReader bufferedReader4 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.o()), charset));
                        try {
                            h3 h3Var2 = (h3) lVar.a().c(bufferedReader4, h3.class);
                            if (h3Var2 == null) {
                                w22.getLogger().c(I2.ERROR, "Item of type %s returned null by the parser.", next.p().e());
                            } else {
                                l(file2, h3Var2);
                            }
                            bufferedReader4.close();
                        } finally {
                        }
                    } catch (Throwable th8) {
                        w22.getLogger().a(I2.ERROR, "Item failed to process.", th8);
                    }
                } else {
                    w22.getLogger().c(I2.INFO, "Current envelope has a different envelope type %s", next.p().e());
                }
            } else {
                w22.getLogger().c(I2.INFO, "Current envelope %s is empty", file2.getAbsolutePath());
            }
            if (!new File(w22.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                File file5 = new File(w22.getCacheDirPath(), "last_crash");
                if (file5.exists()) {
                    z11 = false;
                    w22.getLogger().c(I2.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file5.delete()) {
                        w22.getLogger().c(I2.ERROR, "Failed to delete the crash marker file. %s.", file5.getAbsolutePath());
                    }
                    S1.a().c();
                    f();
                }
            }
            z11 = false;
            S1.a().c();
            f();
        } else {
            z11 = false;
        }
        File g10 = g(v12);
        if (g10.exists()) {
            w22.getLogger().c(I2.WARNING, "Not adding Envelope to offline storage because it already exists: %s", g10.getAbsolutePath());
            return true;
        }
        ILogger logger2 = w22.getLogger();
        I2 i23 = I2.DEBUG;
        logger2.c(i23, "Adding Envelope to offline storage: %s", g10.getAbsolutePath());
        if (g10.exists()) {
            w22.getLogger().c(i23, "Overwriting envelope to offline storage: %s", g10.getAbsolutePath());
            if (!g10.delete()) {
                w22.getLogger().c(I2.ERROR, "Failed to delete: %s", g10.getAbsolutePath());
            }
        }
        try {
            fileOutputStream = new FileOutputStream(g10);
            try {
                lVar.a().b(v12, fileOutputStream);
                fileOutputStream.close();
                z12 = true;
            } finally {
                try {
                    fileOutputStream.close();
                    throw th;
                } catch (Throwable th9) {
                    th.addSuppressed(th9);
                }
            }
        } catch (Throwable th10) {
            w22.getLogger().b(I2.ERROR, th10, "Error writing Envelope %s to offline storage", g10.getAbsolutePath());
            z12 = z11;
        }
        if (UncaughtExceptionHandlerIntegration.a.class.isInstance(e11.d("sentry:typeCheckHint"))) {
            try {
                fileOutputStream = new FileOutputStream(new File(w22.getCacheDirPath(), "last_crash"));
                try {
                    fileOutputStream.write(io.sentry.vendor.gson.internal.bind.util.a.b(C7165l.b()).getBytes(charset));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } finally {
                }
            } catch (Throwable th11) {
                w22.getLogger().a(I2.ERROR, "Error writing the crash marker file to the disk", th11);
            }
        }
        return z12;
    }

    private void l(@NotNull File file, @NotNull h3 h3Var) {
        W2 w22 = this.f67780a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c.f67779e));
                try {
                    w22.getLogger().c(I2.DEBUG, "Overwriting session to offline storage: %s", h3Var.g());
                    this.f67781b.a().a(bufferedWriter, h3Var);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            w22.getLogger().b(I2.ERROR, th2, "Error writing Session to offline storage: %s", h3Var.g());
        }
    }

    public void E1(@NotNull V1 v12, @NotNull E e11) {
        i(v12, e11);
    }

    public boolean L1(@NotNull V1 v12, @NotNull E e11) {
        return i(v12, e11);
    }

    @Override // io.sentry.cache.g
    public final void M0(@NotNull V1 v12) {
        p.b(v12, "Envelope is required.");
        File g10 = g(v12);
        boolean delete = g10.delete();
        W2 w22 = this.f67780a;
        if (delete) {
            w22.getLogger().c(I2.DEBUG, "Discarding envelope from cache: %s", g10.getAbsolutePath());
        } else {
            w22.getLogger().c(I2.DEBUG, "Envelope was not cached or could not be deleted: %s", g10.getAbsolutePath());
        }
    }

    public final void f() {
        this.f67786f.countDown();
    }

    public final void h(@NotNull File file, @NotNull File file2) {
        InterfaceC7097a0 a11 = this.f67789i.a();
        try {
            if (!file.exists()) {
                a11.close();
                return;
            }
            boolean exists = file2.exists();
            W2 w22 = this.f67780a;
            if (exists) {
                w22.getLogger().c(I2.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    w22.getLogger().c(I2.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            w22.getLogger().c(I2.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    w22.getLogger().c(I2.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th2) {
                w22.getLogger().a(I2.ERROR, "Error moving current session to previous session.", th2);
            }
            a11.close();
        } catch (Throwable th3) {
            try {
                a11.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V1> iterator() {
        W2 w22 = this.f67780a;
        File[] e11 = e();
        ArrayList arrayList = new ArrayList(e11.length);
        for (File file : e11) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f67781b.a().d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                w22.getLogger().c(I2.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e12) {
                w22.getLogger().a(I2.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e12);
            }
        }
        return arrayList.iterator();
    }

    public final boolean k() {
        W2 w22 = this.f67780a;
        try {
            return this.f67786f.await(w22.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            w22.getLogger().c(I2.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }
}
