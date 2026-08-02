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
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.a;
import com.google.android.gms.internal.common.zzad;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzai;
import defpackage.ayn;
import defpackage.dbn;
import defpackage.myo;
import defpackage.pto;
import defpackage.rzo;
import defpackage.u0a;
import defpackage.vro;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class GoogleSignatureVerifier {
    public static GoogleSignatureVerifier c;
    public final Context a;
    public volatile String b;

    public GoogleSignatureVerifier(Context context) {
        this.a = context.getApplicationContext();
    }

    public static GoogleSignatureVerifier a(Context context) {
        GoogleSignatureVerifier googleSignatureVerifier;
        Preconditions.i(context);
        synchronized (GoogleSignatureVerifier.class) {
            googleSignatureVerifier = c;
            if (googleSignatureVerifier == null) {
                ayn aynVar = rzo.a;
                synchronized (rzo.class) {
                    try {
                        if (rzo.i == null) {
                            rzo.i = context.getApplicationContext();
                        }
                    } finally {
                    }
                }
                googleSignatureVerifier = new GoogleSignatureVerifier(context);
                c = googleSignatureVerifier;
            }
        }
        return googleSignatureVerifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c(PackageInfo packageInfo, boolean z) {
        a aVar;
        SigningInfo signingInfo;
        a aVar2;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                aVar = z ? myo.c : myo.b;
                int i = Build.VERSION.SDK_INT;
                if (i < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        dbn dbnVar = zzah.b;
                        Object[] objArr = {bArr};
                        zzai.a(1, objArr);
                        aVar2 = zzah.v(1, objArr);
                    } else {
                        dbn dbnVar2 = zzah.b;
                        aVar2 = a.e;
                    }
                } else {
                    if (i < 28) {
                        throw new IllegalStateException();
                    }
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null && !signingInfo.hasMultipleSigners() && signingInfo.getSigningCertificateHistory() != null) {
                        dbn dbnVar3 = zzah.b;
                        zzad zzadVar = new zzad();
                        for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                            zzadVar.a(signature.toByteArray());
                        }
                        zzadVar.c = true;
                        aVar2 = zzah.v(zzadVar.b, zzadVar.a);
                    }
                    dbn dbnVar4 = zzah.b;
                    aVar2 = a.e;
                }
            } catch (IllegalArgumentException unused) {
                if ((z ? d(packageInfo, myo.a) : d(packageInfo, myo.a[0])) != null) {
                }
            }
            if (aVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            zzah s = aVar2.s();
            int size = s.size();
            int i2 = 0;
            while (i2 < size) {
                byte[] bArr2 = (byte[]) s.get(i2);
                dbn listIterator = aVar.listIterator(0);
                do {
                    int i3 = i2 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static vro d(PackageInfo packageInfo, vro... vroVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        pto ptoVar = new pto(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < vroVarArr.length; i++) {
            if (vroVarArr[i].equals(ptoVar)) {
                return vroVarArr[i];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i) {
        zzy b;
        int length;
        ApplicationInfo applicationInfo;
        boolean zzg;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            b = zzy.b("no pkgs");
        } else {
            b = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Preconditions.i(b);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    b = zzy.b("null pkg");
                } else if (str.equals(this.b)) {
                    b = zzy.c;
                } else {
                    ayn aynVar = rzo.a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        rzo.a();
                        zzg = rzo.g.zzg();
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (RemoteException | DynamiteModule.LoadingException unused) {
                    } finally {
                    }
                    try {
                        if (zzg) {
                            boolean c2 = GooglePlayServicesUtilLight.c(this.a);
                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                Preconditions.i(rzo.i);
                                try {
                                    rzo.a();
                                    Preconditions.i(rzo.i);
                                    try {
                                        zzr E3 = rzo.g.E3(new zzp(str, c2, false, new ObjectWrapper(rzo.i), false, true, false));
                                        if (E3.a) {
                                            zzc.a(E3.d);
                                            b = new zzy(null, null, true);
                                        } else {
                                            String str2 = E3.b;
                                            PackageManager.NameNotFoundException nameNotFoundException = u0a.O(E3.c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                            if (str2 == null) {
                                                str2 = "error checking package certificate";
                                            }
                                            zzc.a(E3.d);
                                            u0a.O(E3.c);
                                            b = new zzy(nameNotFoundException, str2, false);
                                        }
                                    } catch (RemoteException e) {
                                        b = zzy.c("module call", e);
                                    }
                                } catch (DynamiteModule.LoadingException e2) {
                                    b = zzy.c("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                }
                                if (b.a) {
                                    this.b = str;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                        boolean c3 = GooglePlayServicesUtilLight.c(this.a);
                        if (packageInfo == null) {
                            b = zzy.b("null pkg");
                        } else {
                            Signature[] signatureArr = packageInfo.signatures;
                            if (signatureArr == null || signatureArr.length != 1) {
                                b = zzy.b("single cert required");
                            } else {
                                pto ptoVar = new pto(packageInfo.signatures[0].toByteArray());
                                String str3 = packageInfo.packageName;
                                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                try {
                                    zzy b2 = rzo.b(str3, ptoVar, c3, false);
                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    if (b2.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
                                            zzy b3 = rzo.b(str3, ptoVar, false, true);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                                            if (b3.a) {
                                                b = zzy.b("debuggable release cert app rejected");
                                            }
                                        } finally {
                                        }
                                    }
                                    b = b2;
                                } finally {
                                }
                            }
                        }
                        if (b.a) {
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        b = zzy.c("no pkg ".concat(str), e3);
                    }
                }
                if (b.a) {
                    break;
                }
                i2++;
            }
        }
        if (!b.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (b.b != null) {
                b.a();
            } else {
                b.a();
            }
        }
        return b.a;
    }
}
