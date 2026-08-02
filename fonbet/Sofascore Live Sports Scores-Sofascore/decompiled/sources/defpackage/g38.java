package defpackage;

import com.sofascore.model.crowdsourcing.SuggestStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g38 implements h38 {
    public final int a;
    public final int b;
    public final SuggestStatus c;

    public g38(int i, int i2, SuggestStatus suggestStatus) {
        suggestStatus.getClass();
        this.a = i;
        this.b = i2;
        this.c = suggestStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g38)) {
            return false;
        }
        g38 g38Var = (g38) obj;
        return this.a == g38Var.a && this.b == g38Var.b && this.c == g38Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "Voted(displayHomeScore=", ", displayAwayScore=", ", status=");
        s.append(this.c);
        s.append(")");
        return s.toString();
    }
}
