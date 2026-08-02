package A5;

import android.widget.ListView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class s extends C1013a {

    /* renamed from: Y, reason: collision with root package name */
    public final ListView f162Y;

    /* renamed from: Z, reason: collision with root package name */
    public final boolean f163Z;

    /* renamed from: a0, reason: collision with root package name */
    public final boolean f164a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int f165b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f166c0;

    /* renamed from: d0, reason: collision with root package name */
    public final int f167d0;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f168e0;

    /* renamed from: f0, reason: collision with root package name */
    public final int f169f0;

    public /* synthetic */ s(ListView listView, boolean z10, boolean z11, int i10, int i11, int i12, boolean z12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(listView, (i14 & 2) != 0 ? listView.areHeaderDividersEnabled() : z10, (i14 & 4) != 0 ? listView.areFooterDividersEnabled() : z11, (i14 & 8) != 0 ? listView.getDividerHeight() : i10, (i14 & 16) != 0 ? listView.getFooterViewsCount() : i11, (i14 & 32) != 0 ? listView.getHeaderViewsCount() : i12, (i14 & 64) != 0 ? listView.getItemsCanFocus() : z12, (i14 & 128) != 0 ? listView.getMaxScrollAmount() : i13);
    }

    @Override // A5.C1013a, A5.C1019g, A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s) || !super.equals(obj)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f162Y, sVar.f162Y) && this.f163Z == sVar.f163Z && this.f164a0 == sVar.f164a0 && this.f165b0 == sVar.f165b0 && this.f166c0 == sVar.f166c0 && this.f167d0 == sVar.f167d0 && this.f168e0 == sVar.f168e0 && this.f169f0 == sVar.f169f0;
    }

    @Override // A5.C1013a, A5.C1019g, A5.E, A5.H
    public int hashCode() {
        return (((((((((((((((super.hashCode() * 31) + this.f162Y.hashCode()) * 31) + Boolean.hashCode(this.f163Z)) * 31) + Boolean.hashCode(this.f164a0)) * 31) + this.f165b0) * 31) + this.f166c0) * 31) + this.f167d0) * 31) + Boolean.hashCode(this.f168e0)) * 31) + this.f169f0;
    }

    @Override // A5.C1013a, A5.C1019g, A5.E, A5.H
    public String toString() {
        return "ListViewMetadata(itemsCanFocus=" + this.f168e0 + ", maxScrollAmount=" + this.f169f0 + ", headerViewsCount=" + this.f167d0 + ", footerViewsCount=" + this.f166c0 + ", dividerHeight=" + this.f165b0 + ", areFooterDividersEnabled=" + this.f164a0 + ", areHeaderDividersEnabled=" + this.f163Z + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ListView listView, boolean z10, boolean z11, int i10, int i11, int i12, boolean z12, int i13) {
        super(listView, false, false, 0, 0, null, null, 0, 0, 0, 0, 0, false, false, false, false, false, false, 262142, null);
        Intrinsics.checkNotNullParameter(listView, "listView");
        this.f162Y = listView;
        this.f163Z = z10;
        this.f164a0 = z11;
        this.f165b0 = i10;
        this.f166c0 = i11;
        this.f167d0 = i12;
        this.f168e0 = z12;
        this.f169f0 = i13;
    }
}
