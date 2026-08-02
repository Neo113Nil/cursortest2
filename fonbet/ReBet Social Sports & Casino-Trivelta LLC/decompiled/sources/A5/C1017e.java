package A5;

import android.widget.AdapterViewAnimator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: A5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1017e extends C1019g {

    /* renamed from: G, reason: collision with root package name */
    public final AdapterViewAnimator f115G;

    /* renamed from: H, reason: collision with root package name */
    public final int f116H;

    public /* synthetic */ C1017e(AdapterViewAnimator adapterViewAnimator, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(adapterViewAnimator, (i11 & 2) != 0 ? adapterViewAnimator.getDisplayedChild() : i10);
    }

    @Override // A5.C1019g, A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1017e) || !super.equals(obj)) {
            return false;
        }
        C1017e c1017e = (C1017e) obj;
        return Intrinsics.areEqual(this.f115G, c1017e.f115G) && this.f116H == c1017e.f116H;
    }

    @Override // A5.C1019g, A5.E, A5.H
    public int hashCode() {
        return (((super.hashCode() * 31) + this.f115G.hashCode()) * 31) + Integer.hashCode(this.f116H);
    }

    @Override // A5.C1019g, A5.E, A5.H
    public String toString() {
        return "AdapterViewAnimatorMetadata(displayedChild=" + this.f116H + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1017e(AdapterViewAnimator adapterViewAnimator, int i10) {
        super(adapterViewAnimator, 0, 0, 0L, 0, 0, 0, 126, null);
        Intrinsics.checkNotNullParameter(adapterViewAnimator, "adapterViewAnimator");
        this.f115G = adapterViewAnimator;
        this.f116H = i10;
    }
}
