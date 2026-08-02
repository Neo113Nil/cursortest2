package yZ;

import androidx.activity.ActivityC5043j;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {
    public static final void a(@NotNull EZ.g navigator, @NotNull EZ.h hVar, @NotNull ActivityC5043j activity) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (!activity.isFinishing() && activity.getLifecycle().b().a(AbstractC5434v.b.INITIALIZED)) {
            activity.getLifecycle().a(new e(navigator, hVar, activity));
        }
    }

    public static final void b(@NotNull EZ.h hVar, @NotNull J lifecycleOwner, @NotNull EZ.g navigator) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (!navigator.getActivity().isFinishing() && lifecycleOwner.getLifecycle().b().a(AbstractC5434v.b.INITIALIZED)) {
            lifecycleOwner.getLifecycle().a(new g(hVar, navigator, lifecycleOwner.getLifecycle()));
        }
    }
}
