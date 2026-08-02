package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import defpackage.pao;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgc {
    public final int a;
    public final String b;
    public final Object c;

    public zzgc(int i, Object obj, String str) {
        this.a = i;
        this.b = str;
        this.c = obj;
        zzfv.d.a.a.add(this);
    }

    public static void d(int i, String str) {
        new pao(Integer.valueOf(i), str, 1, 1);
    }

    public static pao e(long j, String str) {
        return new pao(Long.valueOf(j), str, 1, 2);
    }

    public static pao f(int i, Boolean bool, String str) {
        return new pao(bool, str, i, 0);
    }

    public static pao g(String str, String str2) {
        return new pao(str2, str, 1, 4);
    }

    public abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    public abstract Object c(SharedPreferences sharedPreferences);
}
