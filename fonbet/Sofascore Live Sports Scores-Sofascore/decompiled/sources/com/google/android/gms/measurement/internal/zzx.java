package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.lmo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzx {
    public final zzic a;

    public zzx(zzic zzicVar) {
        this.a = zzicVar;
    }

    public final void a(Bundle bundle, String str) {
        String uri;
        zzic zzicVar = this.a;
        zzhz zzhzVar = zzicVar.g;
        lmo lmoVar = zzicVar.e;
        zzic.m(zzhzVar);
        zzhzVar.Q();
        if (zzicVar.c()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        zzic.k(lmoVar);
        lmoVar.x.b(uri);
        zzhe zzheVar = lmoVar.y;
        zzicVar.k.getClass();
        zzheVar.b(System.currentTimeMillis());
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        zzic zzicVar = this.a;
        zzicVar.k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        lmo lmoVar = zzicVar.e;
        zzic.k(lmoVar);
        return currentTimeMillis - lmoVar.y.a() > zzicVar.d.Y(null, zzfy.i0);
    }

    public final boolean c() {
        lmo lmoVar = this.a.e;
        zzic.k(lmoVar);
        return lmoVar.y.a() > 0;
    }
}
