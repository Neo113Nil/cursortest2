package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import defpackage.ljn;
import defpackage.mjn;
import defpackage.mxn;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeet {
    public final Context a;
    public mjn b;

    public zzeet(Context context) {
        this.a = context;
    }

    public final void a(mxn mxnVar) {
        ServiceInfo serviceInfo;
        mjn mjnVar = this.b;
        Context context = mjnVar.b;
        if (mjnVar.a()) {
            mxnVar.d(0);
            return;
        }
        int i = mjnVar.a;
        if (i == 1) {
            mxnVar.d(3);
            return;
        }
        if (i == 3) {
            mxnVar.d(3);
            return;
        }
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            mjnVar.a = 0;
            mxnVar.d(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    ljn ljnVar = new ljn(mjnVar, mxnVar);
                    mjnVar.e = ljnVar;
                    try {
                        if (context.bindService(intent2, ljnVar, 1)) {
                            return;
                        }
                        mjnVar.a = 0;
                        mxnVar.d(1);
                        return;
                    } catch (SecurityException unused) {
                        mjnVar.a = 0;
                        mxnVar.d(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        mjnVar.a = 0;
        mxnVar.d(2);
    }
}
