package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e2p extends b2p {
    public final Object a;

    public e2p(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.b2p
    public final boolean d() {
        return true;
    }

    @Override // defpackage.b2p
    public final boolean equals(Object obj) {
        if (obj instanceof e2p) {
            return this.a.equals(((e2p) obj).a);
        }
        return false;
    }

    @Override // defpackage.b2p
    public final Object g() {
        return this.a;
    }

    @Override // defpackage.b2p
    public final Object h(Serializable serializable) {
        return this.a;
    }

    @Override // defpackage.b2p
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    @Override // defpackage.b2p
    public final Object i() {
        return this.a;
    }

    @Override // defpackage.b2p
    public final b2p j(x1p x1pVar) {
        Object apply = x1pVar.apply(this.a);
        if (apply != null) {
            return new e2p(apply);
        }
        yhk.s("the Function passed to Optional.transform() must not return null.");
        return null;
    }

    public final String toString() {
        String obj = this.a.toString();
        return wt3.m("Optional.of(", obj, new StringBuilder(obj.length() + 13), ")");
    }
}
