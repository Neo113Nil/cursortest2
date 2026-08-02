package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k6e extends d7a {
    public final f5e h;
    public final f5e i;

    public k6e(f5e f5eVar, f5e f5eVar2) {
        f5eVar2.getClass();
        this.h = f5eVar;
        this.i = f5eVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k6e)) {
            return false;
        }
        f5e f5eVar = this.h;
        int i = f5eVar.c;
        k6e k6eVar = (k6e) obj;
        f5e f5eVar2 = k6eVar.i;
        f5e f5eVar3 = k6eVar.h;
        if (i != f5eVar3.c || f5eVar.d != f5eVar3.d || f5eVar.f() != f5eVar3.f() || f5eVar.b != f5eVar3.b) {
            return false;
        }
        f5e f5eVar4 = this.i;
        return f5eVar4.c == f5eVar2.c && f5eVar4.d == f5eVar2.d && f5eVar4.f() == f5eVar2.f() && f5eVar4.b == f5eVar2.b;
    }

    public final int hashCode() {
        return this.i.hashCode() + this.h.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
        f5e f5eVar = this.h;
        sb.append(f5eVar.c);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(f5eVar.d);
        sb.append("\n                    |       size: ");
        sb.append(f5eVar.f());
        sb.append("\n                    |       dataCount: ");
        sb.append(f5eVar.b);
        sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
        f5e f5eVar2 = this.i;
        sb.append(f5eVar2.c);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(f5eVar2.d);
        sb.append("\n                    |       size: ");
        sb.append(f5eVar2.f());
        sb.append("\n                    |       dataCount: ");
        sb.append(f5eVar2.b);
        sb.append("\n                    |   )\n                    |");
        return dii.d(sb.toString());
    }
}
