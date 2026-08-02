package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h6e extends d7a {
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public h6e(int i, int i2, int i3, int i4) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h6e)) {
            return false;
        }
        h6e h6eVar = (h6e) obj;
        return this.h == h6eVar.h && this.i == h6eVar.i && this.j == h6eVar.j && this.k == h6eVar.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + Integer.hashCode(this.j) + Integer.hashCode(this.i) + Integer.hashCode(this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i = this.i;
        sb.append(i);
        sb.append(" items (\n                    |   startIndex: ");
        me4.q(sb, this.h, "\n                    |   dropCount: ", i, "\n                    |   newPlaceholdersBefore: ");
        sb.append(this.j);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.k);
        sb.append("\n                    |)\n                    |");
        return dii.d(sb.toString());
    }
}
