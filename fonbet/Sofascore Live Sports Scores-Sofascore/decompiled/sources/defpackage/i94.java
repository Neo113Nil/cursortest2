package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i94 implements j94 {
    public final ArrayList a;
    public final r8g b;
    public final int c;

    public i94(ArrayList arrayList, r8g r8gVar, int i) {
        this.a = arrayList;
        this.b = r8gVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i94)) {
            return false;
        }
        i94 i94Var = (i94) obj;
        return this.a.equals(i94Var.a) && this.b == i94Var.b && this.c == i94Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Row(blocks=");
        sb.append(this.a);
        sb.append(", rowType=");
        sb.append(this.b);
        sb.append(", roundType=");
        return fc6.h(this.c, ")", sb);
    }
}
