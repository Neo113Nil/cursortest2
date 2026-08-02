package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzw {
    public final Context a;
    public int b;
    public int c = 0;

    public zzw(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = this.a;
        PackageManager packageManager = context.getPackageManager();
        if (Wrappers.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            this.c = 2;
            return 2;
        }
        this.c = 2;
        return 2;
    }

    public final synchronized int b() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = Wrappers.a(this.a).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }
}
