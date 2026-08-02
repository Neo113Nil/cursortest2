package x5;

import android.widget.RelativeLayout;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: x5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6799d extends g {

    /* renamed from: m, reason: collision with root package name */
    public final RelativeLayout.LayoutParams f67842m;

    @NotNull
    private final int[] rules;

    public /* synthetic */ C6799d(RelativeLayout.LayoutParams layoutParams, int[] iArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutParams, (i10 & 2) != 0 ? layoutParams.getRules() : iArr);
    }

    @Override // x5.g, x5.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6799d) || !super.equals(obj)) {
            return false;
        }
        C6799d c6799d = (C6799d) obj;
        return Intrinsics.areEqual(this.f67842m, c6799d.f67842m) && Arrays.equals(this.rules, c6799d.rules);
    }

    @Override // x5.g, x5.f
    public int hashCode() {
        return (((super.hashCode() * 31) + this.f67842m.hashCode()) * 31) + Arrays.hashCode(this.rules);
    }

    @Override // x5.g, x5.f
    public String toString() {
        return "LayoutParamsRelativeLayout(layoutParams=" + this.f67842m + ", rules=" + Arrays.toString(this.rules) + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6799d(RelativeLayout.LayoutParams layoutParams, int[] rules) {
        super(layoutParams, 0, 0, 0, 0, 0, 0, 0, 254, null);
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f67842m = layoutParams;
        this.rules = rules;
    }
}
