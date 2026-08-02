package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ezf implements j38 {
    public final int a;
    public final i4k b;
    public final bzf c;
    public final long d;

    public ezf(int i, i4k i4kVar, bzf bzfVar, long j) {
        this.a = i;
        this.b = i4kVar;
        this.c = bzfVar;
        this.d = j;
    }

    @Override // defpackage.c80
    public final nmk a(q4k q4kVar) {
        return new umk(this.a, this.b.a(q4kVar), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ezf) {
            ezf ezfVar = (ezf) obj;
            if (ezfVar.a == this.a && ezfVar.b.equals(this.b) && ezfVar.c == this.c && ezfVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a * 31)) * 31)) * 31);
    }
}
