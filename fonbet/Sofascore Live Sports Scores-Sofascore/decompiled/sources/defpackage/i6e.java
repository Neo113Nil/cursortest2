package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i6e extends d7a {
    public final int h;
    public final int i;
    public final int j;

    public i6e(int i, int i2, int i3) {
        this.h = i;
        this.i = i2;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i6e)) {
            return false;
        }
        i6e i6eVar = (i6e) obj;
        return this.h == i6eVar.h && this.i == i6eVar.i && this.j == i6eVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + Integer.hashCode(this.i) + Integer.hashCode(this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i = this.h;
        me4.q(sb, i, " items (\n                    |   dropCount: ", i, "\n                    |   newPlaceholdersBefore: ");
        sb.append(this.i);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.j);
        sb.append("\n                    |)\n                    |");
        return dii.d(sb.toString());
    }
}
