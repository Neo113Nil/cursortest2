package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f22629a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f22630b;

    /* renamed from: c, reason: collision with root package name */
    public final h.c f22631c;

    /* renamed from: d, reason: collision with root package name */
    public final File f22632d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22633e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22634f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22635g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22636h = false;
    private final byte[] mDesiredVersion = d();
    private d[] mProfile;
    private byte[] mTranscodedProfile;

    public c(AssetManager assetManager, Executor executor, h.c cVar, String str, String str2, String str3, File file) {
        this.f22629a = assetManager;
        this.f22630b = executor;
        this.f22631c = cVar;
        this.f22633e = str;
        this.f22634f = str2;
        this.f22635g = str3;
        this.f22632d = file;
    }

    public static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return n.V015_S;
        }
        switch (i10) {
            case 25:
                return n.V001_N;
            case 26:
                return n.V005_O;
            case 27:
                return n.V009_O_MR1;
            case 28:
            case 29:
            case 30:
                return n.V010_P;
            default:
                return null;
        }
    }

    public static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || i10 == 25;
    }

    public final c b(d[] dVarArr, byte[] bArr) {
        InputStream g10;
        try {
            g10 = g(this.f22629a, this.f22635g);
        } catch (FileNotFoundException e10) {
            this.f22631c.a(9, e10);
        } catch (IOException e11) {
            this.f22631c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.mProfile = null;
            this.f22631c.a(8, e12);
        }
        if (g10 == null) {
            if (g10 != null) {
                g10.close();
            }
            return null;
        }
        try {
            this.mProfile = l.r(g10, l.p(g10, l.MAGIC_PROFM), bArr, dVarArr);
            g10.close();
            return this;
        } catch (Throwable th2) {
            try {
                g10.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void c() {
        if (!this.f22636h) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.mDesiredVersion == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f22632d.exists()) {
            try {
                if (!this.f22632d.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f22632d.canWrite()) {
            k(4, null);
            return false;
        }
        this.f22636h = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f22634f);
        } catch (FileNotFoundException e10) {
            this.f22631c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f22631c.a(7, e11);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f22631c.b(5, null);
            }
            return null;
        }
    }

    public c h() {
        c b10;
        c();
        if (this.mDesiredVersion != null) {
            InputStream f10 = f(this.f22629a);
            if (f10 != null) {
                this.mProfile = i(f10);
            }
            d[] dVarArr = this.mProfile;
            if (dVarArr != null && j() && (b10 = b(dVarArr, this.mDesiredVersion)) != null) {
                return b10;
            }
        }
        return this;
    }

    public final d[] i(InputStream inputStream) {
        try {
            try {
                try {
                    d[] x10 = l.x(inputStream, l.p(inputStream, l.MAGIC_PROF), this.f22633e);
                    try {
                        inputStream.close();
                        return x10;
                    } catch (IOException e10) {
                        this.f22631c.a(7, e10);
                        return x10;
                    }
                } catch (IllegalStateException e11) {
                    this.f22631c.a(8, e11);
                    return null;
                }
            } catch (IOException e12) {
                this.f22631c.a(7, e12);
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f22631c.a(7, e13);
            }
        }
    }

    public final void k(final int i10, final Object obj) {
        this.f22630b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.f22631c.a(i10, obj);
            }
        });
    }

    public c l() {
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.mProfile;
        byte[] bArr = this.mDesiredVersion;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    l.F(byteArrayOutputStream, bArr);
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                this.f22631c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f22631c.a(8, e11);
            }
            if (!l.C(byteArrayOutputStream, bArr, dVarArr)) {
                this.f22631c.a(5, null);
                this.mProfile = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.mTranscodedProfile = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.mProfile = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m() {
        byte[] bArr = this.mTranscodedProfile;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f22632d);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock tryLock = channel.tryLock();
                            try {
                                e.l(byteArrayInputStream, fileOutputStream, tryLock);
                                k(1, null);
                                if (tryLock != null) {
                                    tryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                return false;
            } catch (IOException e11) {
                k(7, e11);
                return false;
            }
        } finally {
            this.mTranscodedProfile = null;
            this.mProfile = null;
        }
    }
}
