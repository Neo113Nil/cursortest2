package ru.ozon.uni.android.atom.aspect;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"isCustomBackgroundColorDisabled", "", "Lru/ozon/uni/android/atom/aspect/AspectViewState;", "isDottedLine", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AspectViewStateKt {
    public static final boolean isCustomBackgroundColorDisabled(@NotNull AspectViewState aspectViewState) {
        Intrinsics.checkNotNullParameter(aspectViewState, "<this>");
        return aspectViewState == AspectViewState.UNAVAILABLE || aspectViewState == AspectViewState.SELECTED_UNAVAILABLE;
    }

    public static final boolean isDottedLine(@NotNull AspectViewState aspectViewState) {
        Intrinsics.checkNotNullParameter(aspectViewState, "<this>");
        return aspectViewState == AspectViewState.PARTIALLY_AVAILABLE;
    }
}
