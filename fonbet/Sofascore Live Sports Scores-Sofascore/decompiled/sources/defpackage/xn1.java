package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xn1 implements fed {
    public final oz7 a;

    public xn1(oz7 oz7Var) {
        this.a = oz7Var;
    }

    @Override // defpackage.vm8
    public final wm8 a() {
        return this.a.a();
    }

    @Override // defpackage.vm8
    public final v9e b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xn1) {
            return this.a.equals(((xn1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.a + ')';
    }
}
