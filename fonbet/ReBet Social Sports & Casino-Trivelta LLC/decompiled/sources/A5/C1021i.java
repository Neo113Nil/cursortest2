package A5;

import android.widget.CheckBox;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y5.C6855b;

/* renamed from: A5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1021i extends k {

    /* renamed from: A, reason: collision with root package name */
    public final CheckBox f128A;

    /* renamed from: B, reason: collision with root package name */
    public final C6855b f129B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f130C;

    public /* synthetic */ C1021i(CheckBox checkBox, C6855b c6855b, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(checkBox, c6855b, (i10 & 4) != 0 ? checkBox.isChecked() : z10);
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1021i)) {
            return false;
        }
        C1021i c1021i = (C1021i) obj;
        return Intrinsics.areEqual(this.f128A, c1021i.f128A) && Intrinsics.areEqual(this.f129B, c1021i.f129B) && this.f130C == c1021i.f130C;
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public int hashCode() {
        return (((this.f128A.hashCode() * 31) + this.f129B.hashCode()) * 31) + Boolean.hashCode(this.f130C);
    }

    @Override // A5.k, A5.C1020h, A5.A, A5.H
    public String toString() {
        return "CheckboxMetadata(checkbox=" + this.f128A + ", hierarchyMaskConfiguration=" + this.f129B + ", isChecked=" + this.f130C + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1021i(CheckBox checkbox, C6855b hierarchyMaskConfiguration, boolean z10) {
        super(checkbox, hierarchyMaskConfiguration);
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
        this.f128A = checkbox;
        this.f129B = hierarchyMaskConfiguration;
        this.f130C = z10;
    }
}
