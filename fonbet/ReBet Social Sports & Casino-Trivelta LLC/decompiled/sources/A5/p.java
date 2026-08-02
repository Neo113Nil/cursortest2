package A5;

import android.widget.GridView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends C1013a {

    /* renamed from: Y, reason: collision with root package name */
    public final GridView f148Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f149Z;

    /* renamed from: a0, reason: collision with root package name */
    public final int f150a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int f151b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f152c0;

    /* renamed from: d0, reason: collision with root package name */
    public final int f153d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int f154e0;

    /* renamed from: f0, reason: collision with root package name */
    public final int f155f0;

    /* renamed from: g0, reason: collision with root package name */
    public final int f156g0;

    public /* synthetic */ p(GridView gridView, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(gridView, (i18 & 2) != 0 ? gridView.getColumnWidth() : i10, (i18 & 4) != 0 ? gridView.getGravity() : i11, (i18 & 8) != 0 ? gridView.getHorizontalSpacing() : i12, (i18 & 16) != 0 ? gridView.getNumColumns() : i13, (i18 & 32) != 0 ? gridView.getRequestedColumnWidth() : i14, (i18 & 64) != 0 ? gridView.getRequestedHorizontalSpacing() : i15, (i18 & 128) != 0 ? gridView.getStretchMode() : i16, (i18 & 256) != 0 ? gridView.getVerticalSpacing() : i17);
    }

    @Override // A5.C1013a, A5.C1019g, A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f148Y, pVar.f148Y) && this.f149Z == pVar.f149Z && this.f150a0 == pVar.f150a0 && this.f151b0 == pVar.f151b0 && this.f152c0 == pVar.f152c0 && this.f153d0 == pVar.f153d0 && this.f154e0 == pVar.f154e0 && this.f155f0 == pVar.f155f0 && this.f156g0 == pVar.f156g0;
    }

    @Override // A5.C1013a, A5.C1019g, A5.E, A5.H
    public int hashCode() {
        return (((((((((((((((this.f148Y.hashCode() * 31) + Integer.hashCode(this.f149Z)) * 31) + Integer.hashCode(this.f150a0)) * 31) + Integer.hashCode(this.f151b0)) * 31) + Integer.hashCode(this.f152c0)) * 31) + Integer.hashCode(this.f153d0)) * 31) + Integer.hashCode(this.f154e0)) * 31) + Integer.hashCode(this.f155f0)) * 31) + Integer.hashCode(this.f156g0);
    }

    @Override // A5.C1013a, A5.C1019g, A5.E, A5.H
    public String toString() {
        return "GridViewMetadata(gridView=" + this.f148Y + ", columnWidth=" + this.f149Z + ", gravity=" + this.f150a0 + ", horizontalSpacing=" + this.f151b0 + ", numColumns=" + this.f152c0 + ", requestedColumnWidth=" + this.f153d0 + ", requestedHorizontalSpacing=" + this.f154e0 + ", stretchMode=" + this.f155f0 + ", verticalSpacing=" + this.f156g0 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(GridView gridView, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        super(gridView, false, false, 0, 0, null, null, 0, 0, 0, 0, 0, false, false, false, false, false, false, 262142, null);
        Intrinsics.checkNotNullParameter(gridView, "gridView");
        this.f148Y = gridView;
        this.f149Z = i10;
        this.f150a0 = i11;
        this.f151b0 = i12;
        this.f152c0 = i13;
        this.f153d0 = i14;
        this.f154e0 = i15;
        this.f155f0 = i16;
        this.f156g0 = i17;
    }
}
