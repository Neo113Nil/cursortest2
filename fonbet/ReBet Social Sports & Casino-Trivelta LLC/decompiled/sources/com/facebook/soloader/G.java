package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class G extends C3114f implements InterfaceC3110b {

    /* renamed from: d, reason: collision with root package name */
    public final Context f31557d;
    private String[] mAbis;

    public class a implements FilenameFilter {
        public a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f31559a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f31560b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f31561c;

        public b(boolean z10, File file, n nVar) {
            this.f31559a = z10;
            this.f31560b = file;
            this.f31561c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.f("fb-UnpackingSoSource", "starting syncer worker");
            try {
                try {
                    if (this.f31559a) {
                        SysUtil.f(G.this.f31592a);
                    }
                    G.u(this.f31560b, (byte) 1, this.f31559a);
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + G.this.f31592a + " (from syncer thread)");
                    this.f31561c.close();
                } catch (Throwable th2) {
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + G.this.f31592a + " (from syncer thread)");
                    this.f31561c.close();
                    throw th2;
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f31563a;

        /* renamed from: b, reason: collision with root package name */
        public final String f31564b;

        public c(String str, String str2) {
            this.f31563a = str;
            this.f31564b = str2;
        }
    }

    public static final class d implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final c f31565a;

        /* renamed from: b, reason: collision with root package name */
        public final InputStream f31566b;

        public d(c cVar, InputStream inputStream) {
            this.f31565a = cVar;
            this.f31566b = inputStream;
        }

        public int available() {
            return this.f31566b.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f31566b.close();
        }

        public c k() {
            return this.f31565a;
        }
    }

    public static abstract class e implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public void d(d dVar, byte[] bArr, File file) {
            p.d("fb-UnpackingSoSource", "extracting DSO " + dVar.k().f31563a);
            File file2 = new File(file, dVar.k().f31563a);
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int available = dVar.available();
                        if (available > 1) {
                            SysUtil.d(randomAccessFile.getFD(), available);
                        }
                        SysUtil.a(randomAccessFile, dVar.f31566b, Integer.MAX_VALUE, bArr);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (file2.setExecutable(true, false)) {
                            randomAccessFile.close();
                        } else {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                    } finally {
                    }
                } catch (IOException e10) {
                    p.b("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e10);
                    SysUtil.c(file2);
                    throw e10;
                }
            } finally {
                if (file2.exists() && !file2.setWritable(false)) {
                    p.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
            }
        }

        public abstract c[] k();

        public abstract void r(File file);
    }

    public G(Context context, String str, boolean z10) {
        super(p(context, str), z10 ? 1 : 0);
        this.f31557d = context;
    }

    public static boolean m(int i10) {
        return (i10 & 2) != 0;
    }

    public static File p(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    public static boolean s(int i10) {
        return (i10 & 1) != 0;
    }

    public static void u(File file, byte b10, boolean z10) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b10);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z10) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e10) {
            p.h("fb-UnpackingSoSource", "state file sync failed", e10);
        }
    }

    @Override // com.facebook.soloader.InterfaceC3110b
    public void a() {
        try {
            n i10 = SysUtil.i(this.f31592a, new File(this.f31592a, "dso_lock"));
            if (i10 != null) {
                i10.close();
            }
        } catch (Exception e10) {
            p.c("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.f31592a + "): ", e10);
        }
    }

    @Override // com.facebook.soloader.E
    public void e(int i10) {
        SysUtil.m(this.f31592a);
        if (!this.f31592a.canWrite() && !this.f31592a.setWritable(true)) {
            throw new IOException("error adding " + this.f31592a.getCanonicalPath() + " write permission");
        }
        n nVar = null;
        try {
            try {
                n i11 = SysUtil.i(this.f31592a, new File(this.f31592a, "dso_lock"));
                try {
                    p.f("fb-UnpackingSoSource", "locked dso store " + this.f31592a);
                    if (!this.f31592a.canWrite() && !this.f31592a.setWritable(true)) {
                        throw new IOException("error adding " + this.f31592a.getCanonicalPath() + " write permission");
                    }
                    if (!r(i11, i10)) {
                        p.d("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f31592a);
                        nVar = i11;
                    }
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f31592a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f31592a + " (syncer thread started)");
                    }
                    if (!this.f31592a.canWrite() || this.f31592a.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + this.f31592a.getCanonicalPath() + " write permission");
                } catch (Throwable th2) {
                    th = th2;
                    nVar = i11;
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f31592a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f31592a + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (!this.f31592a.canWrite() || this.f31592a.setWritable(false)) {
                    throw th3;
                }
                throw new IOException("error removing " + this.f31592a.getCanonicalPath() + " write permission");
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void j() {
        File[] listFiles = this.f31592a.listFiles(new a());
        if (listFiles == null) {
            throw new IOException("unable to list directory " + this.f31592a);
        }
        for (File file : listFiles) {
            p.f("fb-UnpackingSoSource", "Deleting " + file);
            SysUtil.c(file);
        }
    }

    public boolean k(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f31592a, "dso_deps"), "rw");
            try {
                if (randomAccessFile.length() != 0) {
                    int length = (int) randomAccessFile.length();
                    byte[] bArr2 = new byte[length];
                    if (randomAccessFile.read(bArr2) == length) {
                        boolean l10 = l(bArr2, bArr);
                        randomAccessFile.close();
                        return l10;
                    }
                    p.f("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                }
                randomAccessFile.close();
                return true;
            } finally {
            }
        } catch (IOException e10) {
            p.h("fb-UnpackingSoSource", "failed to compare whether deps changed", e10);
            return true;
        }
    }

    public boolean l(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    public byte[] n() {
        Parcel obtain = Parcel.obtain();
        e q10 = q();
        try {
            c[] k10 = q10.k();
            obtain.writeInt(k10.length);
            for (c cVar : k10) {
                obtain.writeString(cVar.f31563a);
                obtain.writeString(cVar.f31564b);
            }
            q10.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th2) {
            if (q10 != null) {
                try {
                    q10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public c[] o() {
        e q10 = q();
        try {
            c[] k10 = q10.k();
            q10.close();
            return k10;
        } catch (Throwable th2) {
            if (q10 != null) {
                try {
                    q10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public abstract e q();

    public final boolean r(n nVar, int i10) {
        byte b10;
        RandomAccessFile randomAccessFile;
        File file = new File(this.f31592a, "dso_state");
        byte[] n10 = n();
        if (m(i10) || k(n10)) {
            b10 = 0;
        } else {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                if (randomAccessFile.length() == 1) {
                    try {
                        b10 = randomAccessFile.readByte();
                    } catch (IOException e10) {
                        p.f("fb-UnpackingSoSource", "dso store " + this.f31592a + " regeneration interrupted: " + e10.getMessage());
                    }
                    if (b10 == 1) {
                        p.f("fb-UnpackingSoSource", "dso store " + this.f31592a + " regeneration not needed: state file clean");
                        randomAccessFile.close();
                    }
                }
                b10 = 0;
                randomAccessFile.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b10 == 1) {
            return false;
        }
        boolean z10 = (i10 & 4) == 0;
        p.f("fb-UnpackingSoSource", "so store dirty: regenerating");
        u(file, (byte) 0, z10);
        j();
        e q10 = q();
        try {
            q10.r(this.f31592a);
            q10.close();
            randomAccessFile = new RandomAccessFile(new File(this.f31592a, "dso_deps"), "rw");
            try {
                randomAccessFile.write(n10);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                b bVar = new b(z10, file, nVar);
                if (s(i10)) {
                    new Thread(bVar, "SoSync:" + this.f31592a.getName()).start();
                } else {
                    bVar.run();
                }
                return true;
            } finally {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
        } catch (Throwable th4) {
            if (q10 != null) {
                try {
                    q10.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public void t(String[] strArr) {
        this.mAbis = strArr;
    }

    public G(Context context, String str) {
        this(context, str, true);
    }
}
