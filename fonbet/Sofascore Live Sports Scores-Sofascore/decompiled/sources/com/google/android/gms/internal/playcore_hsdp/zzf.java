package com.google.android.gms.internal.playcore_hsdp;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import defpackage.lnb;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzf {
    public static final zzd a;

    static {
        zzd zzdVar = new zzd();
        lnb.j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PhoneskyVerificationUtils");
        a = zzdVar;
    }

    public static boolean a(Context context) {
        Signature[] signatureArr;
        String str;
        zzd zzdVar = a;
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            zzdVar.getClass();
        }
        if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
            zzdVar.getClass();
            return false;
        }
        try {
            signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
        } catch (PackageManager.NameNotFoundException unused2) {
            zzdVar.getClass();
        }
        if (signatureArr == null || (signatureArr.length) == 0) {
            zzdVar.getClass();
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            byte[] byteArray = signature.toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                str = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (NoSuchAlgorithmException unused3) {
                str = "";
            }
            arrayList.add(str);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                return true;
            }
            String str2 = Build.TAGS;
            if ((str2.contains("dev-keys") || str2.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ", ");
            }
        }
        zzdVar.getClass();
        return false;
    }
}
