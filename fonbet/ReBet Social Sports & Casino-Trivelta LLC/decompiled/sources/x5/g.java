package x5;

import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class g extends f {

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup.MarginLayoutParams f67848e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67849f;

    /* renamed from: g, reason: collision with root package name */
    public final int f67850g;

    /* renamed from: h, reason: collision with root package name */
    public final int f67851h;

    /* renamed from: i, reason: collision with root package name */
    public final int f67852i;

    /* renamed from: j, reason: collision with root package name */
    public final int f67853j;

    /* renamed from: k, reason: collision with root package name */
    public final int f67854k;

    /* renamed from: l, reason: collision with root package name */
    public final int f67855l;

    public /* synthetic */ g(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(marginLayoutParams, (i17 & 2) != 0 ? marginLayoutParams.bottomMargin : i10, (i17 & 4) != 0 ? marginLayoutParams.leftMargin : i11, (i17 & 8) != 0 ? marginLayoutParams.rightMargin : i12, (i17 & 16) != 0 ? marginLayoutParams.topMargin : i13, (i17 & 32) != 0 ? marginLayoutParams.getMarginStart() : i14, (i17 & 64) != 0 ? marginLayoutParams.getMarginEnd() : i15, (i17 & 128) != 0 ? marginLayoutParams.getLayoutDirection() : i16);
    }

    @Override // x5.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g) || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f67848e, gVar.f67848e) && this.f67849f == gVar.f67849f && this.f67850g == gVar.f67850g && this.f67851h == gVar.f67851h && this.f67852i == gVar.f67852i && this.f67853j == gVar.f67853j && this.f67854k == gVar.f67854k && this.f67855l == gVar.f67855l;
    }

    @Override // x5.f
    public int hashCode() {
        return (((((((((((((((super.hashCode() * 31) + this.f67848e.hashCode()) * 31) + this.f67849f) * 31) + this.f67850g) * 31) + this.f67851h) * 31) + this.f67852i) * 31) + this.f67853j) * 31) + this.f67854k) * 31) + this.f67855l;
    }

    @Override // x5.f
    public String toString() {
        return "LayoutParamsViewGroupMargin(endMargin=" + this.f67854k + ", layoutDirection=" + this.f67855l + ", startMargin=" + this.f67853j + ", topMargin=" + this.f67852i + ", rightMargin=" + this.f67851h + ", leftMargin=" + this.f67850g + ", bottomMargin=" + this.f67849f + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        super(marginLayoutParams, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(marginLayoutParams, "marginLayoutParams");
        this.f67848e = marginLayoutParams;
        this.f67849f = i10;
        this.f67850g = i11;
        this.f67851h = i12;
        this.f67852i = i13;
        this.f67853j = i14;
        this.f67854k = i15;
        this.f67855l = i16;
    }
}
