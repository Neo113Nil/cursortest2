package x5;

import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w5.EnumC6707c;

/* renamed from: x5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6798c extends g {

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout.LayoutParams f67839m;

    /* renamed from: n, reason: collision with root package name */
    public final float f67840n;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC6707c f67841o;

    public /* synthetic */ C6798c(LinearLayout.LayoutParams layoutParams, float f10, EnumC6707c enumC6707c, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutParams, (i10 & 2) != 0 ? layoutParams.weight : f10, (i10 & 4) != 0 ? EnumC6707c.f67427a.a(layoutParams.gravity) : enumC6707c);
    }

    @Override // x5.g, x5.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6798c) || !super.equals(obj)) {
            return false;
        }
        C6798c c6798c = (C6798c) obj;
        return Intrinsics.areEqual(this.f67839m, c6798c.f67839m) && this.f67840n == c6798c.f67840n && this.f67841o == c6798c.f67841o;
    }

    @Override // x5.g, x5.f
    public int hashCode() {
        return (((((super.hashCode() * 31) + this.f67839m.hashCode()) * 31) + Float.hashCode(this.f67840n)) * 31) + this.f67841o.hashCode();
    }

    @Override // x5.g, x5.f
    public String toString() {
        return "LayoutParamsLinearLayout(weight=" + this.f67840n + ", gravity=" + this.f67841o + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6798c(LinearLayout.LayoutParams layoutParams, float f10, EnumC6707c gravity) {
        super(layoutParams, 0, 0, 0, 0, 0, 0, 0, 254, null);
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.f67839m = layoutParams;
        this.f67840n = f10;
        this.f67841o = gravity;
    }
}
