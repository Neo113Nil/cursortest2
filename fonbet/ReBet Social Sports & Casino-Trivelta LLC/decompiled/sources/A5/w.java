package A5;

import android.widget.RatingBar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w extends C1015c {

    /* renamed from: B, reason: collision with root package name */
    public final RatingBar f179B;

    /* renamed from: C, reason: collision with root package name */
    public final float f180C;

    /* renamed from: D, reason: collision with root package name */
    public final float f181D;

    /* renamed from: E, reason: collision with root package name */
    public final int f182E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f183F;

    public /* synthetic */ w(RatingBar ratingBar, float f10, float f11, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ratingBar, (i11 & 2) != 0 ? ratingBar.getRating() : f10, (i11 & 4) != 0 ? ratingBar.getStepSize() : f11, (i11 & 8) != 0 ? ratingBar.getNumStars() : i10, (i11 & 16) != 0 ? ratingBar.isIndicator() : z10);
    }

    @Override // A5.C1015c, A5.t, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.f179B, wVar.f179B) && Float.compare(this.f180C, wVar.f180C) == 0 && Float.compare(this.f181D, wVar.f181D) == 0 && this.f182E == wVar.f182E && this.f183F == wVar.f183F;
    }

    @Override // A5.C1015c, A5.t, A5.H
    public int hashCode() {
        return (((((((this.f179B.hashCode() * 31) + Float.hashCode(this.f180C)) * 31) + Float.hashCode(this.f181D)) * 31) + Integer.hashCode(this.f182E)) * 31) + Boolean.hashCode(this.f183F);
    }

    @Override // A5.C1015c, A5.t, A5.H
    public String toString() {
        return "RatingBarMetadata(ratingBar=" + this.f179B + ", rating=" + this.f180C + ", stepSize=" + this.f181D + ", numStars=" + this.f182E + ", isIndicator=" + this.f183F + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(RatingBar ratingBar, float f10, float f11, int i10, boolean z10) {
        super(ratingBar);
        Intrinsics.checkNotNullParameter(ratingBar, "ratingBar");
        this.f179B = ratingBar;
        this.f180C = f10;
        this.f181D = f11;
        this.f182E = i10;
        this.f183F = z10;
    }
}
