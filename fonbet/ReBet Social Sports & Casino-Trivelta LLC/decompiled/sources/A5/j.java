package A5;

import android.widget.CheckedTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y5.C6855b;

/* loaded from: classes2.dex */
public final class j extends A {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f131A;

    /* renamed from: y, reason: collision with root package name */
    public final CheckedTextView f132y;

    /* renamed from: z, reason: collision with root package name */
    public final C6855b f133z;

    public /* synthetic */ j(CheckedTextView checkedTextView, C6855b c6855b, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(checkedTextView, c6855b, (i10 & 4) != 0 ? checkedTextView.isChecked() : z10);
    }

    @Override // A5.A, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f132y, jVar.f132y) && Intrinsics.areEqual(this.f133z, jVar.f133z) && this.f131A == jVar.f131A;
    }

    @Override // A5.A, A5.H
    public int hashCode() {
        return (((this.f132y.hashCode() * 31) + this.f133z.hashCode()) * 31) + Boolean.hashCode(this.f131A);
    }

    @Override // A5.A, A5.H
    public String toString() {
        return "CheckedTextViewMetadata(checkedTextView=" + this.f132y + ", hierarchyMaskConfiguration=" + this.f133z + ", isChecked=" + this.f131A + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CheckedTextView checkedTextView, C6855b hierarchyMaskConfiguration, boolean z10) {
        super(checkedTextView, hierarchyMaskConfiguration, null, 4, null);
        Intrinsics.checkNotNullParameter(checkedTextView, "checkedTextView");
        Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
        this.f132y = checkedTextView;
        this.f133z = hierarchyMaskConfiguration;
        this.f131A = z10;
    }
}
