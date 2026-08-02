package A5;

import android.widget.Switch;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y5.C6855b;

/* loaded from: classes2.dex */
public final class z extends k {

    /* renamed from: A, reason: collision with root package name */
    public final Switch f191A;

    /* renamed from: B, reason: collision with root package name */
    public final C6855b f192B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f193C;

    public /* synthetic */ z(Switch r12, C6855b c6855b, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r12, c6855b, (i10 & 4) != 0 ? r12.isChecked() : z10);
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(this.f191A, zVar.f191A) && Intrinsics.areEqual(this.f192B, zVar.f192B) && this.f193C == zVar.f193C;
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public int hashCode() {
        return (((this.f191A.hashCode() * 31) + this.f192B.hashCode()) * 31) + Boolean.hashCode(this.f193C);
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public String toString() {
        return "SwitchMetadata(switch=" + this.f191A + ", hierarchyMaskConfiguration=" + this.f192B + ", isChecked=" + this.f193C + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Switch r22, C6855b hierarchyMaskConfiguration, boolean z10) {
        super(r22, hierarchyMaskConfiguration);
        Intrinsics.checkNotNullParameter(r22, "switch");
        Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
        this.f191A = r22;
        this.f192B = hierarchyMaskConfiguration;
        this.f193C = z10;
    }
}
