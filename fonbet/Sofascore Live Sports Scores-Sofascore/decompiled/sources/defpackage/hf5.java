package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hf5 implements jkk {
    public final e1d a;

    public hf5(e1d e1dVar) {
        this.a = e1dVar;
    }

    @Override // defpackage.jkk
    public final Object a(aee aeeVar) {
        return ((eoh) this.a).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf5) && this.a == ((hf5) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
