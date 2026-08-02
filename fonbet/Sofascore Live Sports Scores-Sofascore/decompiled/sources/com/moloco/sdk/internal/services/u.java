package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class u {
    public final Context a;
    public t b;

    public u(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t a() {
        u2g u2gVar;
        Context context = this.a;
        t tVar = this.b;
        if (tVar != null) {
            return tVar;
        }
        try {
            p2g p2gVar = w2g.b;
            String obj = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            PackageInfo a = v.a(context);
            String str = a.packageName;
            str.getClass();
            String str2 = a.versionName;
            str2.getClass();
            t tVar2 = new t(obj, str, str2);
            this.b = tVar2;
            u2gVar = tVar2;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        boolean z = u2gVar instanceof u2g;
        Object obj2 = u2gVar;
        if (z) {
            obj2 = null;
        }
        t tVar3 = (t) obj2;
        return tVar3 == null ? new t("", "", "") : tVar3;
    }
}
