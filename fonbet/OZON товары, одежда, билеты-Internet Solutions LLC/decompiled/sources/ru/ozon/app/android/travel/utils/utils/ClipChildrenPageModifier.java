package ru.ozon.app.android.travel.utils.utils;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/utils/utils/ClipChildrenPageModifier;", "", "<init>", "()V", "clipChildrenComposerRV", "", "composerRootView", "Landroid/view/ViewGroup;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClipChildrenPageModifier {
    public final void clipChildrenComposerRV(@NotNull ViewGroup composerRootView) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        RecyclerView composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(composerRootView);
        if (composerRecyclerViewOrNull != null) {
            composerRecyclerViewOrNull.setClipChildren(false);
            composerRecyclerViewOrNull.setClipToPadding(false);
        }
    }
}
