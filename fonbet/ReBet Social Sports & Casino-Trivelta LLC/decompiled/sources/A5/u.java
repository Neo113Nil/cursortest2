package A5;

import android.widget.RadioButton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y5.C6855b;

/* loaded from: classes2.dex */
public final class u extends k {

    /* renamed from: A, reason: collision with root package name */
    public final RadioButton f174A;

    /* renamed from: B, reason: collision with root package name */
    public final C6855b f175B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f176C;

    public /* synthetic */ u(RadioButton radioButton, C6855b c6855b, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(radioButton, c6855b, (i10 & 4) != 0 ? radioButton.isSelected() : z10);
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f174A, uVar.f174A) && Intrinsics.areEqual(this.f175B, uVar.f175B) && this.f176C == uVar.f176C;
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public int hashCode() {
        return (((this.f174A.hashCode() * 31) + this.f175B.hashCode()) * 31) + Boolean.hashCode(this.f176C);
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public String toString() {
        return "RadioButtonMetadata(radioButton=" + this.f174A + ", hierarchyMaskConfiguration=" + this.f175B + ", isSelected=" + this.f176C + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(RadioButton radioButton, C6855b hierarchyMaskConfiguration, boolean z10) {
        super(radioButton, hierarchyMaskConfiguration);
        Intrinsics.checkNotNullParameter(radioButton, "radioButton");
        Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
        this.f174A = radioButton;
        this.f175B = hierarchyMaskConfiguration;
        this.f176C = z10;
    }
}
