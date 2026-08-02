package A5;

import android.widget.ProgressBar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class t extends H {

    /* renamed from: w, reason: collision with root package name */
    public final ProgressBar f170w;

    /* renamed from: x, reason: collision with root package name */
    public final int f171x;

    /* renamed from: y, reason: collision with root package name */
    public final int f172y;

    /* renamed from: z, reason: collision with root package name */
    public final int f173z;

    public /* synthetic */ t(ProgressBar progressBar, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(progressBar, (i13 & 2) != 0 ? progressBar.getProgress() : i10, (i13 & 4) != 0 ? progressBar.getMax() : i11, (i13 & 8) != 0 ? progressBar.getSecondaryProgress() : i12);
    }

    @Override // A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t) || !super.equals(obj)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f170w, tVar.f170w) && this.f171x == tVar.f171x && this.f172y == tVar.f172y && this.f173z == tVar.f173z;
    }

    @Override // A5.H
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.f170w.hashCode()) * 31) + this.f171x) * 31) + this.f172y) * 31) + this.f173z;
    }

    @Override // A5.H
    public String toString() {
        return "ProgressBarMetadata(max=" + this.f172y + ", secondaryProgress=" + this.f173z + ", progress=" + this.f171x + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ProgressBar progressBar, int i10, int i11, int i12) {
        super(progressBar, null, 0, false, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 0, false, false, false, null, 1048574, null);
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f170w = progressBar;
        this.f171x = i10;
        this.f172y = i11;
        this.f173z = i12;
    }
}
