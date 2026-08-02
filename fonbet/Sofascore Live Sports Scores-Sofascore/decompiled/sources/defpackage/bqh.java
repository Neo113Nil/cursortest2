package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bqh {
    public final ImageVector a;
    public final kv1 b;

    public bqh(ImageVector imageVector, kv1 kv1Var) {
        imageVector.getClass();
        this.a = imageVector;
        this.b = kv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqh)) {
            return false;
        }
        bqh bqhVar = (bqh) obj;
        return Intrinsics.c(this.a, bqhVar.a) && this.b.equals(bqhVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SofaButtonIconConfig(icon=" + this.a + ", alignment=" + this.b + ")";
    }
}
