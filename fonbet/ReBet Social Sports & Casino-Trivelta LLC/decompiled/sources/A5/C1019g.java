package A5;

import android.widget.Adapter;
import android.widget.AdapterView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: A5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1019g extends E {

    /* renamed from: A, reason: collision with root package name */
    public final int f120A;

    /* renamed from: B, reason: collision with root package name */
    public final int f121B;

    /* renamed from: C, reason: collision with root package name */
    public final long f122C;

    /* renamed from: D, reason: collision with root package name */
    public final int f123D;

    /* renamed from: E, reason: collision with root package name */
    public final int f124E;

    /* renamed from: F, reason: collision with root package name */
    public final int f125F;

    /* renamed from: z, reason: collision with root package name */
    public final AdapterView f126z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1019g(AdapterView adapterView, int i10, int i11, long j10, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(adapterView, r0, r1, r2, r4, r5, r17);
        int i16;
        int count = (i15 & 2) != 0 ? adapterView.getCount() : i10;
        int selectedItemPosition = (i15 & 4) != 0 ? adapterView.getSelectedItemPosition() : i11;
        long selectedItemId = (i15 & 8) != 0 ? adapterView.getSelectedItemId() : j10;
        int firstVisiblePosition = (i15 & 16) != 0 ? adapterView.getFirstVisiblePosition() : i12;
        int lastVisiblePosition = (i15 & 32) != 0 ? adapterView.getLastVisiblePosition() : i13;
        if ((i15 & 64) != 0) {
            Adapter adapter = adapterView.getAdapter();
            i16 = adapter != null ? adapter.getViewTypeCount() : 0;
        } else {
            i16 = i14;
        }
    }

    @Override // A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1019g) || !super.equals(obj)) {
            return false;
        }
        C1019g c1019g = (C1019g) obj;
        return Intrinsics.areEqual(this.f126z, c1019g.f126z) && this.f120A == c1019g.f120A && this.f121B == c1019g.f121B && this.f122C == c1019g.f122C && this.f123D == c1019g.f123D && this.f124E == c1019g.f124E && this.f125F == c1019g.f125F;
    }

    @Override // A5.E, A5.H
    public int hashCode() {
        return (((((((((((((super.hashCode() * 31) + this.f126z.hashCode()) * 31) + Integer.hashCode(this.f120A)) * 31) + Integer.hashCode(this.f121B)) * 31) + Long.hashCode(this.f122C)) * 31) + Integer.hashCode(this.f123D)) * 31) + Integer.hashCode(this.f124E)) * 31) + Integer.hashCode(this.f125F);
    }

    @Override // A5.E, A5.H
    public String toString() {
        return "AdapterViewMetadata(lastVisiblePosition=" + this.f124E + ", adapterViewTypeCount=" + this.f125F + ", firstVisiblePosition=" + this.f123D + ", selectedItemId=" + this.f122C + ", selectedItemPosition=" + this.f121B + ", itemCount=" + this.f120A + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019g(AdapterView adapterView, int i10, int i11, long j10, int i12, int i13, int i14) {
        super(adapterView);
        Intrinsics.checkNotNullParameter(adapterView, "adapterView");
        this.f126z = adapterView;
        this.f120A = i10;
        this.f121B = i11;
        this.f122C = j10;
        this.f123D = i12;
        this.f124E = i13;
        this.f125F = i14;
    }
}
