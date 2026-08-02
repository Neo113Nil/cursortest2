package wZ;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.B0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: wZ.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10464f {
    @NotNull
    public static final B0 a(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        ComponentCallbacksC5392m parentFragment = componentCallbacksC5392m.getParentFragment();
        if (parentFragment instanceof InterfaceC10463e) {
            return parentFragment;
        }
        r requireActivity = componentCallbacksC5392m.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        return requireActivity;
    }
}
