package A5;

import android.widget.AdapterViewFlipper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: A5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1018f extends C1017e {

    /* renamed from: I, reason: collision with root package name */
    public final AdapterViewFlipper f117I;

    /* renamed from: J, reason: collision with root package name */
    public final int f118J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f119K;

    public /* synthetic */ C1018f(AdapterViewFlipper adapterViewFlipper, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(adapterViewFlipper, (i11 & 2) != 0 ? adapterViewFlipper.getFlipInterval() : i10, (i11 & 4) != 0 ? adapterViewFlipper.isAutoStart() : z10);
    }

    @Override // A5.C1017e, A5.C1019g, A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1018f)) {
            return false;
        }
        C1018f c1018f = (C1018f) obj;
        return Intrinsics.areEqual(this.f117I, c1018f.f117I) && this.f118J == c1018f.f118J && this.f119K == c1018f.f119K;
    }

    @Override // A5.C1017e, A5.C1019g, A5.E, A5.H
    public int hashCode() {
        return (((this.f117I.hashCode() * 31) + Integer.hashCode(this.f118J)) * 31) + Boolean.hashCode(this.f119K);
    }

    @Override // A5.C1017e, A5.C1019g, A5.E, A5.H
    public String toString() {
        return "AdapterViewFlipperMetadata(adapterViewFlipper=" + this.f117I + ", flipInterval=" + this.f118J + ", isAutoStart=" + this.f119K + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1018f(AdapterViewFlipper adapterViewFlipper, int i10, boolean z10) {
        super(adapterViewFlipper, 0, 2, null);
        Intrinsics.checkNotNullParameter(adapterViewFlipper, "adapterViewFlipper");
        this.f117I = adapterViewFlipper;
        this.f118J = i10;
        this.f119K = z10;
    }
}
