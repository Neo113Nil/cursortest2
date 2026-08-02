package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lnc {
    public final arc a;
    public final arc b;
    public final loc c;

    public lnc(arc arcVar, arc arcVar2, loc locVar) {
        this.a = arcVar;
        this.b = arcVar2;
        this.c = locVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnc)) {
            return false;
        }
        lnc lncVar = (lnc) obj;
        return this.a.equals(lncVar.a) && this.b.equals(lncVar.b) && this.c == lncVar.c;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        loc locVar = this.c;
        return hashCode + (locVar == null ? 0 : locVar.hashCode());
    }

    public final String toString() {
        return "MmaLiveValuesWrapper(homeValues=" + this.a + ", awayValues=" + this.b + ", highlightSide=" + this.c + ")";
    }
}
