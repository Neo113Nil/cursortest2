package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.lmo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhg {
    public final String a;
    public boolean b;
    public String c;
    public final /* synthetic */ lmo d;

    public zzhg(lmo lmoVar, String str) {
        this.d = lmoVar;
        Preconditions.f(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.U().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.d.U().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.c = str;
    }
}
