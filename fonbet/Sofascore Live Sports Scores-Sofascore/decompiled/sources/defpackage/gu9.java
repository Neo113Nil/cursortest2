package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gu9 {
    public final ImageVector a;
    public final int b;

    public gu9(ImageVector imageVector, int i) {
        this.a = imageVector;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu9)) {
            return false;
        }
        gu9 gu9Var = (gu9) obj;
        return this.a.equals(gu9Var.a) && this.b == gu9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return wv8.j(sb, this.b, ')');
    }
}
