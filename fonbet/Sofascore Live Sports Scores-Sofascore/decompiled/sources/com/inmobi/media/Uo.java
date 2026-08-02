package com.inmobi.media;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.joa;
import defpackage.lnb;
import defpackage.me4;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Uo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public Uo(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("left", N3.a(this.a));
            jSONObject.put(PlayerKt.E_SPORTS_TOP, N3.a(this.b));
            jSONObject.put("right", N3.a(this.c));
            jSONObject.put("bottom", N3.a(this.d));
            return jSONObject;
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e));
            return new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uo)) {
            return false;
        }
        Uo uo = (Uo) obj;
        return this.a == uo.a && this.b == uo.b && this.c == uo.c && this.d == uo.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Ai.a(this.c, Ai.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        return me4.i(lnb.s(i, i2, "Insets(left=", ", top=", ", right="), this.c, ", bottom=", this.d, ")");
    }
}
