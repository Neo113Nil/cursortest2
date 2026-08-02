package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import defpackage.inn;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbix {
    public final int a;
    public final String b;
    public final Object c;
    public final Object d;

    public zzbix(int i, Object obj, Object obj2, String str) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        com.google.android.gms.ads.internal.client.zzba.zzb().a.add(this);
    }

    public static inn g(int i, int i2, String str) {
        return new inn(1, str, Integer.valueOf(i), Integer.valueOf(i2), 1);
    }

    public static inn h(long j, long j2, String str) {
        return new inn(1, str, Long.valueOf(j), Long.valueOf(j2), 2);
    }

    public static inn i(String str, float f, float f2) {
        return new inn(1, str, Float.valueOf(f), Float.valueOf(f2), 3);
    }

    public static void j() {
        com.google.android.gms.ads.internal.client.zzba.zzb().b.add(new inn(1, "gads:sdk_core_constants:experiment_id", null, null, 4));
    }

    public static void k() {
        com.google.android.gms.ads.internal.client.zzba.zzb().c.add(new inn(1, "gads:sdk_core_constants_service:experiment_id", null, null, 4));
    }

    public abstract Object a(Bundle bundle);

    public abstract void b(SharedPreferences.Editor editor, Object obj);

    public abstract Object c(JSONObject jSONObject);

    public abstract Object d(SharedPreferences sharedPreferences);

    public final Object e() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().i ? this.d : this.c;
    }

    public final Object f() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().a(this);
    }
}
