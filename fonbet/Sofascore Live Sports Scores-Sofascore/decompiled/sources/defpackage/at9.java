package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class at9 extends lw9 {
    public sr9 c;
    public wa d;

    @Override // defpackage.lw9
    public final sr9 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof at9)) {
            return false;
        }
        at9 at9Var = (at9) obj;
        wa waVar = at9Var.d;
        if (hashCode() != at9Var.hashCode()) {
            return false;
        }
        wa waVar2 = this.d;
        return (waVar2 != null || waVar == null) && (waVar2 == null || waVar2.equals(waVar)) && this.c.equals(at9Var.c);
    }

    public final int hashCode() {
        wa waVar = this.d;
        return this.c.a.hashCode() + (waVar != null ? waVar.hashCode() : 0);
    }
}
