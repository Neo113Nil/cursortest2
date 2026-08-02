package c6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import g6.s;
import g6.v;
import io.sentry.android.core.w0;
import java.util.Arrays;
import k2.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static h f3666c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3667a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f3668b;

    public h(Context context) {
        this.f3667a = context.getApplicationContext();
    }

    public static h a(Context context) {
        v.h(context);
        synchronized (h.class) {
            try {
                if (f3666c == null) {
                    p.a(context);
                    f3666c = new h(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f3666c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c(PackageInfo packageInfo, boolean z5) {
        j7.f fVar;
        SigningInfo signingInfo;
        j7.f fVar2;
        int i5;
        if (packageInfo != null) {
            if (z5 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z5 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                fVar = z5 ? o.f3684c : o.f3683b;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        j7.b bVar = j7.e.f18272b;
                        Object[] objArr = {bArr};
                        u6.h.A(1, objArr);
                        fVar2 = new j7.f(1, objArr);
                    } else {
                        j7.b bVar2 = j7.e.f18272b;
                        fVar2 = j7.f.f18273e;
                    }
                } else {
                    if (i10 < 28) {
                        throw new IllegalStateException();
                    }
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null && !signingInfo.hasMultipleSigners() && signingInfo.getSigningCertificateHistory() != null) {
                        j7.b bVar3 = j7.e.f18272b;
                        Object[] objArr2 = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            byte[] byteArray = signingCertificateHistory[i11].toByteArray();
                            byteArray.getClass();
                            int length2 = objArr2.length;
                            int i13 = i12 + 1;
                            if (i13 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i13 <= length2) {
                                i5 = length2;
                            } else {
                                i5 = (length2 >> 1) + length2 + 1;
                                if (i5 < i13) {
                                    int highestOneBit = Integer.highestOneBit(i12);
                                    i5 = highestOneBit + highestOneBit;
                                }
                                if (i5 < 0) {
                                    i5 = Integer.MAX_VALUE;
                                }
                            }
                            if (i5 > length2) {
                                objArr2 = Arrays.copyOf(objArr2, i5);
                            }
                            objArr2[i12] = byteArray;
                            i11++;
                            i12 = i13;
                        }
                        fVar2 = i12 == 0 ? j7.f.f18273e : new j7.f(i12, objArr2);
                    }
                    j7.b bVar4 = j7.e.f18272b;
                    fVar2 = j7.f.f18273e;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z5 ? d(packageInfo, o.f3682a) : d(packageInfo, o.f3682a[0])) != null) {
                }
            }
            if (fVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            j7.e e7 = fVar2.e();
            int size = e7.size();
            int i14 = 0;
            while (i14 < size) {
                byte[] bArr2 = (byte[]) e7.get(i14);
                j7.b listIterator = fVar.listIterator(0);
                do {
                    int i15 = i14 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static l d(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                w0.m("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i5 = 0; i5 < lVarArr.length; i5++) {
                if (lVarArr[i5].equals(mVar)) {
                    return lVarArr[i5];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ad A[LOOP:0: B:6:0x0018->B:13:0x01ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01bf A[EDGE_INSN: B:14:0x01bf->B:15:0x01bf BREAK  A[LOOP:0: B:6:0x0018->B:13:0x01ad], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i5) {
        r b10;
        int length;
        boolean z5;
        ApplicationInfo applicationInfo;
        boolean U;
        String[] packagesForUid = this.f3667a.getPackageManager().getPackagesForUid(i5);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            b10 = r.b("no pkgs");
        } else {
            int i10 = 0;
            b10 = null;
            while (true) {
                if (i10 >= length) {
                    v.h(b10);
                    break;
                }
                String str = packagesForUid[i10];
                if (str == null) {
                    b10 = r.b("null pkg");
                } else if (str.equals(this.f3668b)) {
                    b10 = r.f3691d;
                } else {
                    k kVar = p.f3685a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            p.b();
                            U = ((s) p.f3687c).U();
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } finally {
                        }
                    } catch (RemoteException | u6.b e7) {
                        z5 = true;
                        w0.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                    if (U) {
                        boolean a7 = g.a(this.f3667a);
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            v.h(p.f3689e);
                            try {
                                p.b();
                                v.h(p.f3689e);
                                zzp zzpVar = new zzp(str, a7, false, new t6.b(p.f3689e), false, true, false);
                                try {
                                    s sVar = (s) p.f3687c;
                                    Parcel O = sVar.O();
                                    int i11 = j7.g.f18276a;
                                    O.writeInt(1);
                                    zzpVar.writeToParcel(O, 0);
                                    Parcel f6 = sVar.f(O, 6);
                                    zzr zzrVar = (zzr) j7.g.a(f6, zzr.CREATOR);
                                    f6.recycle();
                                    if (zzrVar.f4629a) {
                                        io.sentry.config.a.E(zzrVar.f4632d);
                                        b10 = new r(true, null, null);
                                    } else {
                                        String str2 = zzrVar.f4630b;
                                        PackageManager.NameNotFoundException nameNotFoundException = x.F(zzrVar.f4631c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        io.sentry.config.a.E(zzrVar.f4632d);
                                        x.F(zzrVar.f4631c);
                                        b10 = new r(false, str2, nameNotFoundException);
                                    }
                                } catch (RemoteException e9) {
                                    w0.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                                    b10 = r.c("module call", e9);
                                }
                            } catch (u6.b e10) {
                                w0.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                                b10 = r.c("module init: ".concat(String.valueOf(e10.getMessage())), e10);
                            }
                            if (b10.f3692a) {
                                this.f3668b = str;
                            }
                            if (b10.f3692a) {
                                break;
                            }
                            i10++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        z5 = true;
                        try {
                            PackageInfo packageInfo = this.f3667a.getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                            boolean a10 = g.a(this.f3667a);
                            if (packageInfo == null) {
                                b10 = r.b("null pkg");
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != z5) {
                                    b10 = r.b("single cert required");
                                } else {
                                    m mVar = new m(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        r c2 = p.c(str3, mVar, a10, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        if (c2.f3692a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                            try {
                                                r c8 = p.c(str3, mVar, false, z5);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                if (c8.f3692a) {
                                                    b10 = r.b("debuggable release cert app rejected");
                                                }
                                            } finally {
                                            }
                                        }
                                        b10 = c2;
                                    } finally {
                                    }
                                }
                            }
                            if (b10.f3692a) {
                            }
                        } catch (PackageManager.NameNotFoundException e11) {
                            b10 = r.c("no pkg ".concat(str), e11);
                        }
                        if (b10.f3692a) {
                        }
                    }
                }
                if (b10.f3692a) {
                }
            }
        }
        if (!b10.f3692a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th3 = b10.f3694c;
            if (th3 != null) {
                Log.d("GoogleCertificatesRslt", b10.a(), th3);
            } else {
                Log.d("GoogleCertificatesRslt", b10.a());
            }
        }
        return b10.f3692a;
    }
}
