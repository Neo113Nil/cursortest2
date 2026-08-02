package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final f0.f f22660a = f0.f.s();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f22661b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c f22662c = null;

    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f22663a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22664b;

        /* renamed from: c, reason: collision with root package name */
        public final long f22665c;

        /* renamed from: d, reason: collision with root package name */
        public final long f22666d;

        public b(int i10, int i11, long j10, long j11) {
            this.f22663a = i10;
            this.f22664b = i11;
            this.f22665c = j10;
            this.f22666d = j11;
        }

        public static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f22663a);
                dataOutputStream.writeInt(this.f22664b);
                dataOutputStream.writeLong(this.f22665c);
                dataOutputStream.writeLong(this.f22666d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f22664b == bVar.f22664b && this.f22665c == bVar.f22665c && this.f22663a == bVar.f22663a && this.f22666d == bVar.f22666d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f22664b), Long.valueOf(this.f22665c), Integer.valueOf(this.f22663a), Long.valueOf(this.f22666d));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f22667a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f22668b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22669c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f22670d;

        public c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f22667a = i10;
            this.f22669c = z11;
            this.f22668b = z10;
            this.f22670d = z12;
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f22662c = cVar;
        f22660a.o(cVar);
        return f22662c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:33|34|35|(2:74|75)(1:37)|38|(8:45|(1:49)|(1:56)|57|(2:64|65)|61|62|63)|(1:71)(1:(1:73))|(1:49)|(3:51|54|56)|57|(1:59)|64|65|61|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fa, code lost:
    
        r14 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c7, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c c(Context context, boolean z10) {
        boolean z11;
        b a10;
        b bVar;
        int i10;
        c cVar;
        if (!z10 && (cVar = f22662c) != null) {
            return cVar;
        }
        synchronized (f22661b) {
            if (!z10) {
                c cVar2 = f22662c;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            int i11 = 0;
            try {
                AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    z11 = openFd.getLength() > 0;
                    openFd.close();
                } finally {
                }
            } catch (IOException unused) {
                z11 = false;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28 && i12 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z12 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z13 = file2.exists() && length2 > 0;
                try {
                    long a11 = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            a10 = b.a(file3);
                        } catch (IOException unused2) {
                            return b(PKIFailureInfo.unsupportedVersion, z12, z13, z11);
                        }
                    } else {
                        a10 = null;
                    }
                    if (a10 != null && a10.f22665c == a11 && (i10 = a10.f22664b) != 2) {
                        i11 = i10;
                        if (z10 && z13 && i11 != 1) {
                            i11 = 2;
                        }
                        if (a10 != null && a10.f22664b == 2 && i11 == 1 && length < a10.f22666d) {
                            i11 = 3;
                        }
                        int i13 = i11;
                        bVar = new b(1, i13, a11, length2);
                        if (a10 != null || !a10.equals(bVar)) {
                            bVar.b(file3);
                        }
                        return b(i13, z12, z13, z11);
                    }
                    if (z12) {
                        i11 = 1;
                    } else if (z13) {
                        i11 = 2;
                    }
                    if (z10) {
                        i11 = 2;
                    }
                    if (a10 != null) {
                        i11 = 3;
                    }
                    int i132 = i11;
                    bVar = new b(1, i132, a11, length2);
                    if (a10 != null) {
                    }
                    bVar.b(file3);
                    return b(i132, z12, z13, z11);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return b(PKIFailureInfo.notAuthorized, z12, z13, z11);
                }
            }
            return b(PKIFailureInfo.transactionIdInUse, false, false, z11);
        }
    }
}
