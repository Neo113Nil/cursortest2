package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a83 implements l83 {
    public final tee a;
    public final tfh b;

    public a83(tee teeVar, tfh tfhVar) {
        teeVar.getClass();
        this.a = teeVar;
        this.b = tfhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a83)) {
            return false;
        }
        a83 a83Var = (a83) obj;
        return Intrinsics.c(this.a, a83Var.a) && this.b == a83Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BasketballShotmapRow(bitmapsByType=" + this.a + ", defaultType=" + this.b + ")";
    }
}
