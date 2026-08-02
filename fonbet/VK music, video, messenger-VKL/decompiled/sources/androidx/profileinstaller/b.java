package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.profileinstaller.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;
import xsna.atv0;
import xsna.l6m;
import xsna.q0e0;
import xsna.v0e0;
import xsna.z6m;

/* compiled from: DeviceProfileWriter.java */
/* loaded from: classes12.dex */
public final class b {

    @NonNull
    public final AssetManager a;

    @NonNull
    public final Executor b;

    @NonNull
    public final c.InterfaceC0079c c;

    @Nullable
    public final byte[] d;

    @NonNull
    public final File e;

    @NonNull
    public final String f;
    public boolean g = false;

    @Nullable
    public z6m[] h;

    @Nullable
    public byte[] i;

    public b(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull c.InterfaceC0079c interfaceC0079c, @NonNull String str, @NonNull File file) {
        byte[] bArr;
        this.a = assetManager;
        this.b = executor;
        this.c = interfaceC0079c;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 28:
                case 29:
                case 30:
                    bArr = v0e0.b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = v0e0.a;
        }
        this.d = bArr;
    }

    public final boolean a() {
        if (this.d == null) {
            d(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.e;
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    d(4, null);
                    return false;
                }
            } catch (IOException unused) {
                d(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            d(4, null);
            return false;
        }
        this.g = true;
        return true;
    }

    @Nullable
    public final FileInputStream b(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b c() {
        FileInputStream fileInputStream;
        z6m[] z6mVarArr;
        z6m[] z6mVarArr2;
        FileInputStream b;
        AssetManager assetManager = this.a;
        c.InterfaceC0079c interfaceC0079c = this.c;
        if (!this.g) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        byte[] bArr = this.d;
        if (bArr != null) {
            b bVar = null;
            try {
                try {
                    fileInputStream = b(assetManager, "dexopt/baseline.prof");
                } catch (FileNotFoundException e) {
                    interfaceC0079c.a(6, e);
                    fileInputStream = null;
                    if (fileInputStream != null) {
                    }
                    z6mVarArr2 = this.h;
                    if (z6mVarArr2 != null) {
                    }
                    return this;
                } catch (IOException e2) {
                    interfaceC0079c.a(7, e2);
                    fileInputStream = null;
                    if (fileInputStream != null) {
                    }
                    z6mVarArr2 = this.h;
                    if (z6mVarArr2 != null) {
                    }
                    return this;
                }
                if (fileInputStream != null) {
                    try {
                        try {
                        } catch (IOException e3) {
                            interfaceC0079c.a(7, e3);
                            try {
                                fileInputStream.close();
                            } catch (IOException e4) {
                                interfaceC0079c.a(7, e4);
                            }
                            z6mVarArr = null;
                            this.h = z6mVarArr;
                            z6mVarArr2 = this.h;
                            if (z6mVarArr2 != null) {
                                try {
                                    b = b(assetManager, "dexopt/baseline.profm");
                                    if (b == null) {
                                    }
                                } catch (FileNotFoundException e5) {
                                    interfaceC0079c.a(9, e5);
                                } catch (IOException e6) {
                                    interfaceC0079c.a(7, e6);
                                } catch (IllegalStateException e7) {
                                    this.h = null;
                                    interfaceC0079c.a(8, e7);
                                }
                                if (bVar == null) {
                                }
                            }
                            return this;
                        }
                    } catch (IllegalStateException e8) {
                        interfaceC0079c.a(8, e8);
                        fileInputStream.close();
                        z6mVarArr = null;
                        this.h = z6mVarArr;
                        z6mVarArr2 = this.h;
                        if (z6mVarArr2 != null) {
                        }
                        return this;
                    }
                    if (!Arrays.equals(q0e0.a, atv0.o(fileInputStream, 4))) {
                        throw new IllegalStateException("Invalid magic");
                    }
                    z6mVarArr = q0e0.g(fileInputStream, atv0.o(fileInputStream, 4), this.f);
                    this.h = z6mVarArr;
                }
                z6mVarArr2 = this.h;
                if (z6mVarArr2 != null && Build.VERSION.SDK_INT >= 31) {
                    b = b(assetManager, "dexopt/baseline.profm");
                    if (b == null) {
                        try {
                            if (!Arrays.equals(q0e0.b, atv0.o(b, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            this.h = q0e0.d(b, atv0.o(b, 4), bArr, z6mVarArr2);
                            b.close();
                            bVar = this;
                        } catch (Throwable th) {
                            try {
                                b.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else if (b != null) {
                        b.close();
                    }
                    if (bVar == null) {
                        return bVar;
                    }
                }
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e9) {
                    interfaceC0079c.a(7, e9);
                }
            }
        }
        return this;
    }

    public final void d(int i, @Nullable Serializable serializable) {
        this.b.execute(new l6m(this, i, serializable));
    }

    @NonNull
    public final void e() {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        c.InterfaceC0079c interfaceC0079c = this.c;
        z6m[] z6mVarArr = this.h;
        if (z6mVarArr == null || (bArr = this.d) == null) {
            return;
        }
        if (!this.g) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(q0e0.a);
                byteArrayOutputStream.write(bArr);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            interfaceC0079c.a(7, e);
        } catch (IllegalStateException e2) {
            interfaceC0079c.a(8, e2);
        }
        if (q0e0.i(byteArrayOutputStream, bArr, z6mVarArr)) {
            this.i = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.h = null;
        } else {
            interfaceC0079c.a(5, null);
            this.h = null;
            byteArrayOutputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        byte[] bArr = this.i;
        if (bArr != null) {
            if (!this.g) {
                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock tryLock = channel.tryLock();
                                if (tryLock != null) {
                                    try {
                                        if (tryLock.isValid()) {
                                            byte[] bArr2 = new byte[512];
                                            while (true) {
                                                int read = byteArrayInputStream.read(bArr2);
                                                if (read <= 0) {
                                                    d(1, null);
                                                    tryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    return true;
                                                }
                                                fileOutputStream.write(bArr2, 0, read);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    d(6, e);
                    return false;
                } catch (IOException e2) {
                    d(7, e2);
                    return false;
                }
            } finally {
                this.i = null;
                this.h = null;
            }
        }
        return false;
    }
}
