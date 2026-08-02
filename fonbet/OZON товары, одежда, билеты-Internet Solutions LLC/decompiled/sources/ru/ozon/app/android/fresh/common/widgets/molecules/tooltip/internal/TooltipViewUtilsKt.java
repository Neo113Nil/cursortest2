package ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.internal;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"getTooltipView", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipView;", "context", "Landroid/content/Context;", "radius", "", "padding", "", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TooltipViewUtilsKt {
    @NotNull
    public static final TooltipView getTooltipView(@NotNull Context context, float f7, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        TooltipView tooltipView = new TooltipView(context, f7);
        tooltipView.setPadding(i11, i11, i11, i11);
        return tooltipView;
    }

    public static /* synthetic */ TooltipView getTooltipView$default(Context context, float f7, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = UiExtKt.toPxF(16);
        }
        if ((i12 & 4) != 0) {
            i11 = UiExtKt.toPx(12);
        }
        return getTooltipView(context, f7, i11);
    }
}
