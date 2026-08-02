package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mnb {
    public final q9k a;
    public final q9k b;

    public mnb(q9k q9kVar, q9k q9kVar2) {
        this.a = q9kVar;
        this.b = q9kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnb)) {
            return false;
        }
        mnb mnbVar = (mnb) obj;
        return this.a.equals(mnbVar.a) && this.b.equals(mnbVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.check_back_later) + lnb.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "MVIError(title=" + this.a + ", subtitle=" + this.b + ", iconVectorRes=2131231286)";
    }
}
