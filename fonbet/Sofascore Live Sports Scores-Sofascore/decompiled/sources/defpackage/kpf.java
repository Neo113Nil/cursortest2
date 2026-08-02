package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kpf implements hkh {
    public final jjh a;

    public kpf(jjh jjhVar) {
        this.a = jjhVar;
    }

    @Override // defpackage.hkh
    public final Object c(rq3 rq3Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kpf) {
            return this.a.equals(((kpf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
