package defpackage;

import com.sofascore.model.newNetwork.Highlight;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nw7 implements pw7 {
    public final int a;
    public final int b;
    public final Highlight c;

    public nw7(int i, int i2, Highlight highlight) {
        this.a = i;
        this.b = i2;
        this.c = highlight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw7)) {
            return false;
        }
        nw7 nw7Var = (nw7) obj;
        return this.a == nw7Var.a && this.b == nw7Var.b && this.c.equals(nw7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "SingleVideoHighlightClickAction(postId=", ", eventId=", ", highlight=");
        s.append(this.c);
        s.append(")");
        return s.toString();
    }
}
