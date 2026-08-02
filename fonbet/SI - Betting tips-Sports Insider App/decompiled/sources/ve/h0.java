package ve;

import androidx.appcompat.widget.c1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f24724a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24725b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24726c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24727d;

    /* renamed from: e, reason: collision with root package name */
    public final List f24728e;

    /* renamed from: f, reason: collision with root package name */
    public final List f24729f;

    public h0(float f6, float f10, float f11, float f12, List layoutsFirst, List layoutsSecond) {
        Intrinsics.checkNotNullParameter(layoutsFirst, "layoutsFirst");
        Intrinsics.checkNotNullParameter(layoutsSecond, "layoutsSecond");
        this.f24724a = f6;
        this.f24725b = f10;
        this.f24726c = f11;
        this.f24727d = f12;
        this.f24728e = layoutsFirst;
        this.f24729f = layoutsSecond;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Float.compare(this.f24724a, h0Var.f24724a) == 0 && Float.compare(this.f24725b, h0Var.f24725b) == 0 && Float.compare(this.f24726c, h0Var.f24726c) == 0 && Float.compare(this.f24727d, h0Var.f24727d) == 0 && Intrinsics.areEqual(this.f24728e, h0Var.f24728e) && Intrinsics.areEqual(this.f24729f, h0Var.f24729f);
    }

    public final int hashCode() {
        return this.f24729f.hashCode() + ((this.f24728e.hashCode() + ((Float.floatToIntBits(this.f24727d) + ((Float.floatToIntBits(this.f24726c) + ((Float.floatToIntBits(this.f24725b) + (Float.floatToIntBits(this.f24724a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalcSize(textSize=");
        sb2.append(this.f24724a);
        sb2.append(", heightFirst=");
        sb2.append(this.f24725b);
        sb2.append(", heightSecond=");
        sb2.append(this.f24726c);
        sb2.append(", margin=");
        sb2.append(this.f24727d);
        sb2.append(", layoutsFirst=");
        sb2.append(this.f24728e);
        sb2.append(", layoutsSecond=");
        return c1.p(sb2, this.f24729f, ')');
    }
}
