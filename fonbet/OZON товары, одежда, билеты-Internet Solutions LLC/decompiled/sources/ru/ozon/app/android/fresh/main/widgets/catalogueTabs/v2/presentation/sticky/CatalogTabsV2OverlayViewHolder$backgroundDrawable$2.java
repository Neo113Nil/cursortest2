package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2OverlayViewHolder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CatalogTabsV2OverlayViewHolder$backgroundDrawable$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    public static final CatalogTabsV2OverlayViewHolder$backgroundDrawable$2 INSTANCE = new CatalogTabsV2OverlayViewHolder$backgroundDrawable$2();

    CatalogTabsV2OverlayViewHolder$backgroundDrawable$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        CatalogTabsV2OverlayViewHolder.Companion companion;
        CatalogTabsV2OverlayViewHolder.Companion companion2;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        companion = CatalogTabsV2OverlayViewHolder.Companion;
        int default_background_color = companion.getDEFAULT_BACKGROUND_COLOR();
        companion2 = CatalogTabsV2OverlayViewHolder.Companion;
        return new GradientDrawable(orientation, new int[]{default_background_color, companion2.getDEFAULT_BACKGROUND_COLOR()});
    }
}
