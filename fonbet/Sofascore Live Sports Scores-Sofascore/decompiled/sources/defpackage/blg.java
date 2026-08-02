package defpackage;

import android.graphics.Rect;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class blg {
    public final boolean a;
    public final double b;
    public final Rect c;

    public blg(boolean z, double d, Rect rect) {
        this.a = z;
        this.b = d;
        this.c = new Rect(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blg)) {
            return false;
        }
        blg blgVar = (blg) obj;
        return this.a == blgVar.a && Double.compare(blgVar.b, this.b) == 0 && this.c.equals(blgVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Double.valueOf(this.b), this.c});
    }
}
