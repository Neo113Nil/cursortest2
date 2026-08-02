package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzad;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzal;
import com.plaid.internal.EnumC3631g;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3203k {

    /* renamed from: c, reason: collision with root package name */
    public static C3203k f32773c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f32774a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f32775b;

    public C3203k(Context context) {
        this.f32774a = context.getApplicationContext();
    }

    public static C3203k a(Context context) {
        AbstractC3191o.m(context);
        synchronized (C3203k.class) {
            try {
                if (f32773c == null) {
                    E.a(context);
                    f32773c = new C3203k(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f32773c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        SigningInfo signingInfo;
        zzah zzj;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        if (packageInfo == null) {
            return false;
        }
        if (z10 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 0) ? false : true;
        }
        try {
            zzah zzahVar = z10 ? D.f32223b : D.f32222a;
            Object obj = K9.a.f6407a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] bArr = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    bArr = signatureArr[0].toByteArray();
                }
                zzj = bArr != null ? zzah.zzk(bArr) : zzah.zzj();
            } else {
                com.google.android.gms.internal.common.zzr.zza(i10 >= 28);
                signingInfo = packageInfo.signingInfo;
                if (signingInfo != null) {
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    if (!hasMultipleSigners) {
                        signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        if (signingCertificateHistory != null) {
                            int i11 = zzah.zzd;
                            zzad zzadVar = new zzad();
                            signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                            for (Signature signature : signingCertificateHistory2) {
                                zzadVar.zzb(signature.toByteArray());
                            }
                            zzj = zzadVar.zzd();
                        }
                    }
                }
                zzj = zzah.zzj();
            }
            if (zzj.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            zzah zzh = zzj.zzh();
            int size = zzh.size();
            int i12 = 0;
            while (i12 < size) {
                byte[] bArr2 = (byte[]) zzh.get(i12);
                zzal listIterator = zzahVar.listIterator(0);
                do {
                    int i13 = i12 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z10 ? f(packageInfo, D.zza) : f(packageInfo, D.zza[0])) != null;
        }
    }

    public static z f(PackageInfo packageInfo, z... zVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            A a10 = new A(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < zVarArr.length; i10++) {
                if (zVarArr[i10].equals(a10)) {
                    return zVarArr[i10];
                }
            }
        }
        return null;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (AbstractC3175h.g(this.f32774a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        L c10;
        int length;
        String[] packagesForUid = this.f32774a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c10 = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    AbstractC3191o.m(c10);
                    break;
                }
                c10 = e(packagesForUid[i11], false, false);
                if (c10.f32250a) {
                    break;
                }
                i11++;
            }
        } else {
            c10 = L.c("no pkgs");
        }
        c10.e();
        return c10.f32250a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final L e(String str, boolean z10, boolean z11) {
        L c10;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return L.c("null pkg");
        }
        if (str.equals(this.f32775b)) {
            return L.b();
        }
        C c11 = E.f32224a;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                E.b();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
        }
        try {
            if (E.f32230g.zzg()) {
                I i10 = new I(null);
                i10.a(str);
                i10.b(AbstractC3175h.g(this.f32774a));
                i10.c(true);
                c10 = E.c(i10.d());
                if (c10.f32250a) {
                    this.f32775b = str;
                }
                return c10;
            }
            PackageInfo packageInfo = this.f32774a.getPackageManager().getPackageInfo(str, allowThreadDiskReads >= 28 ? 134217792 : 64);
            boolean g10 = AbstractC3175h.g(this.f32774a);
            if (packageInfo == null) {
                c10 = L.c("null pkg");
            } else {
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    c10 = L.c("single cert required");
                } else {
                    A a10 = new A(packageInfo.signatures[0].toByteArray());
                    String str2 = packageInfo.packageName;
                    L d10 = E.d(str2, a10, g10, false);
                    c10 = (!d10.f32250a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !E.d(str2, a10, false, true).f32250a) ? d10 : L.c("debuggable release cert app rejected");
                }
            }
            if (c10.f32250a) {
            }
            return c10;
        } catch (PackageManager.NameNotFoundException e11) {
            return L.d("no pkg ".concat(str), e11);
        }
        allowThreadDiskReads = Build.VERSION.SDK_INT;
    }
}
