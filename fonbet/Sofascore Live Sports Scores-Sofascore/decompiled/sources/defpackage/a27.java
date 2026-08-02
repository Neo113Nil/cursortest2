package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a27 implements b27 {
    public final Bitmap a;
    public final String b;

    public a27(Bitmap bitmap, String str) {
        str.getClass();
        this.a = bitmap;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a27)) {
            return false;
        }
        a27 a27Var = (a27) obj;
        return this.a.equals(a27Var.a) && Intrinsics.c(this.b, a27Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareImage(bitmap=" + this.a + ", code=" + this.b + ")";
    }
}
