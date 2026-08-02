package A5;

import android.widget.ExpandableListView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends s {

    /* renamed from: g0, reason: collision with root package name */
    public final ExpandableListView f138g0;

    /* renamed from: h0, reason: collision with root package name */
    public final long f139h0;

    /* renamed from: i0, reason: collision with root package name */
    public final long f140i0;

    public /* synthetic */ m(ExpandableListView expandableListView, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(expandableListView, (i10 & 2) != 0 ? expandableListView.getSelectedId() : j10, (i10 & 4) != 0 ? expandableListView.getSelectedPosition() : j11);
    }

    @Override // A5.s, A5.C1013a, A5.C1019g, A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f138g0, mVar.f138g0) && this.f139h0 == mVar.f139h0 && this.f140i0 == mVar.f140i0;
    }

    @Override // A5.s, A5.C1013a, A5.C1019g, A5.E, A5.H
    public int hashCode() {
        return (((this.f138g0.hashCode() * 31) + Long.hashCode(this.f139h0)) * 31) + Long.hashCode(this.f140i0);
    }

    @Override // A5.s, A5.C1013a, A5.C1019g, A5.E, A5.H
    public String toString() {
        return "ExpandableListViewMetadata(expandableListView=" + this.f138g0 + ", selectedId=" + this.f139h0 + ", selectedPosition=" + this.f140i0 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ExpandableListView expandableListView, long j10, long j11) {
        super(expandableListView, false, false, 0, 0, 0, false, 0, 254, null);
        Intrinsics.checkNotNullParameter(expandableListView, "expandableListView");
        this.f138g0 = expandableListView;
        this.f139h0 = j10;
        this.f140i0 = j11;
    }
}
