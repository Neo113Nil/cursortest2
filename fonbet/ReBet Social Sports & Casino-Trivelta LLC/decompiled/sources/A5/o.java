package A5;

import android.widget.GridLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w5.EnumC6706b;

/* loaded from: classes2.dex */
public final class o extends E {

    /* renamed from: A, reason: collision with root package name */
    public final int f142A;

    /* renamed from: B, reason: collision with root package name */
    public final int f143B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f144C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f145D;

    /* renamed from: E, reason: collision with root package name */
    public final EnumC6706b f146E;

    /* renamed from: z, reason: collision with root package name */
    public final GridLayout f147z;

    public /* synthetic */ o(GridLayout gridLayout, int i10, int i11, boolean z10, boolean z11, EnumC6706b enumC6706b, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(gridLayout, (i12 & 2) != 0 ? gridLayout.getRowCount() : i10, (i12 & 4) != 0 ? gridLayout.getColumnCount() : i11, (i12 & 8) != 0 ? gridLayout.isRowOrderPreserved() : z10, (i12 & 16) != 0 ? gridLayout.isColumnOrderPreserved() : z11, (i12 & 32) != 0 ? EnumC6706b.f67422a.a(gridLayout.getAlignmentMode()) : enumC6706b);
    }

    @Override // A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f147z, oVar.f147z) && this.f142A == oVar.f142A && this.f143B == oVar.f143B && this.f144C == oVar.f144C && this.f145D == oVar.f145D && this.f146E == oVar.f146E;
    }

    @Override // A5.E, A5.H
    public int hashCode() {
        return (((((((((this.f147z.hashCode() * 31) + Integer.hashCode(this.f142A)) * 31) + Integer.hashCode(this.f143B)) * 31) + Boolean.hashCode(this.f144C)) * 31) + Boolean.hashCode(this.f145D)) * 31) + this.f146E.hashCode();
    }

    @Override // A5.E, A5.H
    public String toString() {
        return "GridLayoutMetadata(gridLayout=" + this.f147z + ", rowCount=" + this.f142A + ", columnCount=" + this.f143B + ", isRowOrderPreserved=" + this.f144C + ", isColumnOrderPreserved=" + this.f145D + ", alignmentMode=" + this.f146E + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(GridLayout gridLayout, int i10, int i11, boolean z10, boolean z11, EnumC6706b alignmentMode) {
        super(gridLayout);
        Intrinsics.checkNotNullParameter(gridLayout, "gridLayout");
        Intrinsics.checkNotNullParameter(alignmentMode, "alignmentMode");
        this.f147z = gridLayout;
        this.f142A = i10;
        this.f143B = i11;
        this.f144C = z10;
        this.f145D = z11;
        this.f146E = alignmentMode;
    }
}
