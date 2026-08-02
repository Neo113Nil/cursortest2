package A5;

import android.widget.ToggleButton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y5.C6855b;

/* loaded from: classes2.dex */
public final class C extends k {

    /* renamed from: A, reason: collision with root package name */
    public final ToggleButton f65A;

    /* renamed from: B, reason: collision with root package name */
    public final C6855b f66B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f67C;

    public /* synthetic */ C(ToggleButton toggleButton, C6855b c6855b, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(toggleButton, c6855b, (i10 & 4) != 0 ? toggleButton.isChecked() : z10);
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return Intrinsics.areEqual(this.f65A, c10.f65A) && Intrinsics.areEqual(this.f66B, c10.f66B) && this.f67C == c10.f67C;
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public int hashCode() {
        return (((this.f65A.hashCode() * 31) + this.f66B.hashCode()) * 31) + Boolean.hashCode(this.f67C);
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public String toString() {
        return "ToggleButtonMetadata(toggleButton=" + this.f65A + ", hierarchyMaskConfiguration=" + this.f66B + ", isChecked=" + this.f67C + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(ToggleButton toggleButton, C6855b hierarchyMaskConfiguration, boolean z10) {
        super(toggleButton, hierarchyMaskConfiguration);
        Intrinsics.checkNotNullParameter(toggleButton, "toggleButton");
        Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
        this.f65A = toggleButton;
        this.f66B = hierarchyMaskConfiguration;
        this.f67C = z10;
    }
}
