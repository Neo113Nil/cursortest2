package x5;

import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6796a extends g {

    /* renamed from: m, reason: collision with root package name */
    public final FrameLayout.LayoutParams f67836m;

    /* renamed from: n, reason: collision with root package name */
    public final int f67837n;

    public /* synthetic */ C6796a(FrameLayout.LayoutParams layoutParams, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutParams, (i11 & 2) != 0 ? layoutParams.gravity : i10);
    }

    @Override // x5.g, x5.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6796a)) {
            return false;
        }
        C6796a c6796a = (C6796a) obj;
        return Intrinsics.areEqual(this.f67836m, c6796a.f67836m) && this.f67837n == c6796a.f67837n;
    }

    @Override // x5.g, x5.f
    public int hashCode() {
        return (this.f67836m.hashCode() * 31) + Integer.hashCode(this.f67837n);
    }

    @Override // x5.g, x5.f
    public String toString() {
        return "LayoutParamsFrameLayout(layoutParams=" + this.f67836m + ", gravity=" + this.f67837n + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6796a(FrameLayout.LayoutParams layoutParams, int i10) {
        super(layoutParams, 0, 0, 0, 0, 0, 0, 0, 254, null);
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        this.f67836m = layoutParams;
        this.f67837n = i10;
    }
}
