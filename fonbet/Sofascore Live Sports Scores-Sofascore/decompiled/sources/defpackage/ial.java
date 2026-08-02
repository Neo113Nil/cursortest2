package defpackage;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ial {
    public final t02 a;
    public final float b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ial(float f, Rect rect) {
        this(new t02(rect), f);
        rect.getClass();
    }

    public final Rect a() {
        t02 t02Var = this.a;
        t02Var.getClass();
        return new Rect(t02Var.a, t02Var.b, t02Var.c, t02Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ial.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ial ialVar = (ial) obj;
        return Intrinsics.c(this.a, ialVar.a) && this.b == ialVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return wt3.n(sb, this.b, ')');
    }

    public ial(t02 t02Var, float f) {
        this.a = t02Var;
        this.b = f;
    }
}
