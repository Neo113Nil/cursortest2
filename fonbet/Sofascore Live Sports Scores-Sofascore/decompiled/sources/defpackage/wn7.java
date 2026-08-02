package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wn7 extends yn7 {
    public final int b;

    public wn7(int i) {
        super(R.plurals.insufficient_funds_plural_info);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn7) && this.b == ((wn7) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return lnb.k(this.b, "OverBudget(transferCount=", ")");
    }
}
