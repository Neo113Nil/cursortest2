package x5;

import android.widget.GridLayout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6797b extends g {

    /* renamed from: m, reason: collision with root package name */
    public final GridLayout.LayoutParams f67838m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6797b(GridLayout.LayoutParams layoutParams) {
        super(layoutParams, 0, 0, 0, 0, 0, 0, 0, 254, null);
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        this.f67838m = layoutParams;
    }

    @Override // x5.g, x5.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6797b) && Intrinsics.areEqual(this.f67838m, ((C6797b) obj).f67838m);
    }

    @Override // x5.g, x5.f
    public int hashCode() {
        return this.f67838m.hashCode();
    }

    @Override // x5.g, x5.f
    public String toString() {
        return "LayoutParamsGridLayout(layoutParams=" + this.f67838m + ")";
    }
}
