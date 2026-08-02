package x5;

import android.widget.TableLayout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6800e extends C6798c {

    /* renamed from: p, reason: collision with root package name */
    public final TableLayout.LayoutParams f67843p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6800e(TableLayout.LayoutParams layoutParams) {
        super(layoutParams, 0.0f, null, 6, null);
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        this.f67843p = layoutParams;
    }

    @Override // x5.C6798c, x5.g, x5.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6800e) && Intrinsics.areEqual(this.f67843p, ((C6800e) obj).f67843p);
    }

    @Override // x5.C6798c, x5.g, x5.f
    public int hashCode() {
        return this.f67843p.hashCode();
    }

    @Override // x5.C6798c, x5.g, x5.f
    public String toString() {
        return "LayoutParamsTableLayout(layoutParams=" + this.f67843p + ")";
    }
}
