package A5;

import android.widget.Spinner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x extends AbstractC1016d {

    /* renamed from: H, reason: collision with root package name */
    public final Spinner f184H;

    /* renamed from: I, reason: collision with root package name */
    public final int f185I;

    /* renamed from: J, reason: collision with root package name */
    public final int f186J;

    /* renamed from: K, reason: collision with root package name */
    public final int f187K;

    /* renamed from: L, reason: collision with root package name */
    public final int f188L;

    /* renamed from: M, reason: collision with root package name */
    public final String f189M;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ x(Spinner spinner, int i10, int i11, int i12, int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(spinner, r2, r3, r4, r5, str);
        String obj;
        int gravity = (i14 & 2) != 0 ? spinner.getGravity() : i10;
        int dropDownHorizontalOffset = (i14 & 4) != 0 ? spinner.getDropDownHorizontalOffset() : i11;
        int dropDownVerticalOffset = (i14 & 8) != 0 ? spinner.getDropDownVerticalOffset() : i12;
        int dropDownWidth = (i14 & 16) != 0 ? spinner.getDropDownWidth() : i13;
        if ((i14 & 32) != 0) {
            CharSequence prompt = spinner.getPrompt();
            str = (prompt == null || (obj = prompt.toString()) == null) ? "" : obj;
        }
    }

    @Override // A5.C1019g, A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.f184H, xVar.f184H) && this.f185I == xVar.f185I && this.f186J == xVar.f186J && this.f187K == xVar.f187K && this.f188L == xVar.f188L && Intrinsics.areEqual(this.f189M, xVar.f189M);
    }

    @Override // A5.C1019g, A5.E, A5.H
    public int hashCode() {
        return (((((((((this.f184H.hashCode() * 31) + Integer.hashCode(this.f185I)) * 31) + Integer.hashCode(this.f186J)) * 31) + Integer.hashCode(this.f187K)) * 31) + Integer.hashCode(this.f188L)) * 31) + this.f189M.hashCode();
    }

    @Override // A5.C1019g, A5.E, A5.H
    public String toString() {
        return "SpinnerMetadata(spinner=" + this.f184H + ", gravity=" + this.f185I + ", dropDownHorizontalOffset=" + this.f186J + ", dropDownVerticalOffset=" + this.f187K + ", dropDownWidth=" + this.f188L + ", prompt=" + this.f189M + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Spinner spinner, int i10, int i11, int i12, int i13, String prompt) {
        super(spinner);
        Intrinsics.checkNotNullParameter(spinner, "spinner");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f184H = spinner;
        this.f185I = i10;
        this.f186J = i11;
        this.f187K = i12;
        this.f188L = i13;
        this.f189M = prompt;
    }
}
