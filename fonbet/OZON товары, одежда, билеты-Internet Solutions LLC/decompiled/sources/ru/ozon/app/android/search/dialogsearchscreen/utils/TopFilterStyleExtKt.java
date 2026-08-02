package ru.ozon.app.android.search.dialogsearchscreen.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchScrollingState;
import ru.ozon.uni.android.controls.tag.CustomTagStyle;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.controls.tag.TagStyle;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"updateStyleByScrollingState", "", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "collapsingState", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchScrollingState;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopFilterStyleExtKt {
    public static final void updateStyleByScrollingState(@NotNull TagButtonView tagButtonView, @NotNull DialogSearchScrollingState collapsingState) {
        Intrinsics.checkNotNullParameter(tagButtonView, "<this>");
        Intrinsics.checkNotNullParameter(collapsingState, "collapsingState");
        Context context = tagButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int color = ResourceExtKt.color(context, UniColors.GRAPHIC_KEY.getResId());
        Context context2 = tagButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int color2 = ResourceExtKt.color(context2, UniColors.TEXT_PRIMARY.getResId());
        Context context3 = tagButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int color3 = ResourceExtKt.color(context3, UniColors.GRAPHIC_KEY_INVERTED.getResId());
        Context context4 = tagButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int color4 = ResourceExtKt.color(context4, UniColors.TEXT_PRIMARY_INVERTED.getResId());
        Context context5 = tagButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int color5 = ResourceExtKt.color(context5, UniColors.BG_PREMIUM_PRIMARY_INVERTED.getResId());
        Context context6 = tagButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        tagButtonView.setStyle(new TagStyle.Custom(new CustomTagStyle(new Color.Solid(ResourceExtKt.color(context6, collapsingState == DialogSearchScrollingState.DEFAULT ? UniColors.LAYER_FLOOR_2.getResId() : UniColors.BG_SECONDARY.getResId())), Integer.valueOf(color2), Integer.valueOf(color), null, 8, null), new CustomTagStyle(new Color.Solid(color5), Integer.valueOf(color4), Integer.valueOf(color3), null, 8, null)));
    }
}
