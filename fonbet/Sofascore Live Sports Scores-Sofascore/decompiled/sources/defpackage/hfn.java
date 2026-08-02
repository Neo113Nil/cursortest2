package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hfn {
    public final Object a;
    public final int b;

    public hfn(Object obj) {
        this.b = System.identityHashCode(obj);
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hfn)) {
            return false;
        }
        hfn hfnVar = (hfn) obj;
        return this.b == hfnVar.b && this.a == hfnVar.a;
    }

    public final int hashCode() {
        return this.b;
    }
}
