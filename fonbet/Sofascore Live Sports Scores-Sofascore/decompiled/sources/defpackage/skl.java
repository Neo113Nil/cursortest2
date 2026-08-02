package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class skl {
    public final mll a;
    public final mll b;
    public final oll c;

    public skl(mll mllVar, mll mllVar2, oll ollVar) {
        this.a = mllVar;
        this.b = mllVar2;
        this.c = ollVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skl)) {
            return false;
        }
        skl sklVar = (skl) obj;
        return this.a.equals(sklVar.a) && this.b.equals(sklVar.b) && this.c.equals(sklVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WorldCupWidgetCardsUiModel(firstCard=" + this.a + ", secondCard=" + this.b + ", playerCard=" + this.c + ")";
    }
}
