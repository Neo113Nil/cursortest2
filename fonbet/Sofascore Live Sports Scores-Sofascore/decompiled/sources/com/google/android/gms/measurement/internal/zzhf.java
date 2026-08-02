package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.lmo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhf {
    public final long a;
    public final /* synthetic */ lmo b;

    public /* synthetic */ zzhf(lmo lmoVar, long j) {
        this.b = lmoVar;
        Preconditions.f("health_monitor");
        Preconditions.b(j > 0);
        this.a = j;
    }

    public final void a() {
        lmo lmoVar = this.b;
        lmoVar.Q();
        ((zzic) lmoVar.b).k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = lmoVar.U().edit();
        edit.remove("health_monitor:count");
        edit.remove("health_monitor:value");
        edit.putLong("health_monitor:start", currentTimeMillis);
        edit.apply();
    }
}
