package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import d8.n;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final n f6038a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6039b;

    /* renamed from: c, reason: collision with root package name */
    public final d f6040c;

    /* renamed from: d, reason: collision with root package name */
    public final d8.c f6041d;

    public g(Context context, n nVar, d dVar) {
        String str;
        this.f6039b = context.getPackageName();
        this.f6038a = nVar;
        this.f6040c = dVar;
        n nVar2 = d8.e.f8293a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            String str2 = Build.TAGS;
                            if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            }
                        }
                        this.f6041d = new d8.c(context, nVar, h.f6042a);
                        return;
                    }
                }
                n nVar3 = d8.e.f8293a;
                Object[] objArr = new Object[0];
                nVar3.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    Log.w("PlayCore", n.b(nVar3.f8301a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        nVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", n.b(nVar.f8301a, "Phonesky is not installed.", objArr2));
        }
        this.f6041d = null;
    }

    public static Bundle a(g gVar, byte[] bArr, Long l6) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", gVar.f6039b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l6 != null) {
            bundle.putLong("cloud.prj", l6.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d8.j(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d8.j jVar = (d8.j) it.next();
            Bundle bundle2 = new Bundle();
            jVar.getClass();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", jVar.f8298a);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
