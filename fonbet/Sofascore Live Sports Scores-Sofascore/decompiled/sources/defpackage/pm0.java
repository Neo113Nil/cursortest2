package defpackage;

import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pm0 {
    public final String a;
    public final h5k b;

    public pm0(String str, h5k h5kVar) {
        this.a = str;
        this.b = h5kVar;
        if (StringsKt.R(str)) {
            a70.p("Name can't be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm0)) {
            return false;
        }
        pm0 pm0Var = (pm0) obj;
        return this.a.equals(pm0Var.a) && this.b.equals(pm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: ".concat(this.a);
    }
}
