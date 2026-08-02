package defpackage;

import com.sofascore.model.newNetwork.Highlight;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ra9 implements ua9 {
    public final Highlight a;
    public final int b;

    public ra9(Highlight highlight, int i) {
        this.a = highlight;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra9)) {
            return false;
        }
        ra9 ra9Var = (ra9) obj;
        return this.a.equals(ra9Var.a) && this.b == ra9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoHighlightUiModel(highlight=" + this.a + ", eventId=" + this.b + ")";
    }
}
