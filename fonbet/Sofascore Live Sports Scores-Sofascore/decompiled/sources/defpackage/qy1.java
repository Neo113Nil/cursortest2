package defpackage;

import android.graphics.RenderEffect;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qy1 {
    public RenderEffect a;
    public final float b;
    public final float c;
    public final int d;

    public qy1(int i, float f, float f2) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect c = qz.c(this.d, this.b, this.c);
        this.a = c;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy1)) {
            return false;
        }
        qy1 qy1Var = (qy1) obj;
        return this.b == qy1Var.b && this.c == qy1Var.c && this.d == qy1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fc6.a(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlurEffect(renderEffect=null, radiusX=");
        sb.append(this.b);
        sb.append(", radiusY=");
        sb.append(this.c);
        sb.append(", edgeTreatment=");
        int i = this.d;
        sb.append((Object) (i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
