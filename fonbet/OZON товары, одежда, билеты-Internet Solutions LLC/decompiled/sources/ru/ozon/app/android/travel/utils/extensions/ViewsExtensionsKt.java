package ru.ozon.app.android.travel.utils.extensions;

import android.view.View;
import android.view.ViewGroup;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/view/View;", "Ljk0/q;", "info", "", "regardBottomContainer", "", "updateHeightRegardingOverlapContainers", "(Landroid/view/View;Ljk0/q;Z)V", "", "locator", "appendContentDescription", "(Landroid/view/View;Ljava/lang/String;)V", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewsExtensionsKt {
    public static final void appendContentDescription(@NotNull View view, @NotNull String locator) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(locator, "locator");
        if (view.getContentDescription() != null) {
            String str = ((Object) view.getContentDescription()) + "." + locator;
            if (str != null) {
                locator = str;
            }
        }
        view.setContentDescription(locator);
    }

    public static final void updateHeightRegardingOverlapContainers(@NotNull View view, @NotNull q info, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        int height = info.a().e().height() + (z11 ? info.a().d().height() : 0);
        if (view.getHeight() == height || height <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = height;
        view.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void updateHeightRegardingOverlapContainers$default(View view, q qVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        updateHeightRegardingOverlapContainers(view, qVar, z11);
    }
}
