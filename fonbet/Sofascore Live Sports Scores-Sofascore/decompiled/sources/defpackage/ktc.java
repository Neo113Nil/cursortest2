package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ktc {
    public static final HashMap m = tub.f(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));
    public final knb a;
    public final knb b;
    public final knb c;
    public final knb d;
    public final knb e;
    public final knb f;
    public final knb g;
    public final knb h;
    public final knb i;
    public final knb j;
    public final knb k;
    public final HashMap l;

    public ktc(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.a = (knb) obj;
        Object obj2 = hashMap.get("convs.0.weight");
        if (obj2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.b = gvd.O((knb) obj2);
        Object obj3 = hashMap.get("convs.1.weight");
        if (obj3 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.c = gvd.O((knb) obj3);
        Object obj4 = hashMap.get("convs.2.weight");
        if (obj4 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.d = gvd.O((knb) obj4);
        Object obj5 = hashMap.get("convs.0.bias");
        if (obj5 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.e = (knb) obj5;
        Object obj6 = hashMap.get("convs.1.bias");
        if (obj6 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = (knb) obj6;
        Object obj7 = hashMap.get("convs.2.bias");
        if (obj7 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.g = (knb) obj7;
        Object obj8 = hashMap.get("fc1.weight");
        if (obj8 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.h = gvd.N((knb) obj8);
        Object obj9 = hashMap.get("fc2.weight");
        if (obj9 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.i = gvd.N((knb) obj9);
        Object obj10 = hashMap.get("fc1.bias");
        if (obj10 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.j = (knb) obj10;
        Object obj11 = hashMap.get("fc2.bias");
        if (obj11 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.k = (knb) obj11;
        this.l = new HashMap();
        for (String str : ph0.a0(new String[]{lnb.a(1), lnb.a(2)})) {
            String y = dmi.y(str, ".weight");
            String y2 = dmi.y(str, ".bias");
            knb knbVar = (knb) hashMap.get(y);
            knb knbVar2 = (knb) hashMap.get(y2);
            if (knbVar != null) {
                this.l.put(y, gvd.N(knbVar));
            }
            if (knbVar2 != null) {
                this.l.put(y2, knbVar2);
            }
        }
    }

    public final knb a(knb knbVar, String[] strArr, String str) {
        HashMap hashMap = this.l;
        if (!cw3.a.contains(this)) {
            try {
                knb u = gvd.u(gvd.x(strArr, this.a), this.b);
                gvd.s(u, this.e);
                gvd.K(u);
                knb u2 = gvd.u(u, this.c);
                gvd.s(u2, this.f);
                gvd.K(u2);
                knb I = gvd.I(u2, 2);
                knb u3 = gvd.u(I, this.d);
                gvd.s(u3, this.g);
                gvd.K(u3);
                knb I2 = gvd.I(u, u.a[1]);
                knb I3 = gvd.I(I, I.a[1]);
                knb I4 = gvd.I(u3, u3.a[1]);
                gvd.z(I2);
                gvd.z(I3);
                gvd.z(I4);
                knb w = gvd.w(gvd.t(new knb[]{I2, I3, I4, knbVar}), this.h, this.j);
                gvd.K(w);
                knb w2 = gvd.w(w, this.i, this.k);
                gvd.K(w2);
                knb knbVar2 = (knb) hashMap.get(str.concat(".weight"));
                knb knbVar3 = (knb) hashMap.get(str.concat(".bias"));
                if (knbVar2 != null && knbVar3 != null) {
                    knb w3 = gvd.w(w2, knbVar2, knbVar3);
                    gvd.L(w3);
                    return w3;
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }
}
