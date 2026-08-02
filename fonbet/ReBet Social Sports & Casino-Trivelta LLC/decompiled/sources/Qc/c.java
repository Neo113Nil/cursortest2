package Qc;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.N;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c {
    public static final N a(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        N w10 = fragmentManager.s().w(true);
        Intrinsics.checkNotNullExpressionValue(w10, "setReorderingAllowed(...)");
        return w10;
    }
}
