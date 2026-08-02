package ru.ozon.app.android.pdpoldwidgets.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.core.AddToComparisonButtonConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.core.AddToComparisonButtonViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.caption.core.CaptionConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.caption.core.CaptionViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.core.MarketingActionsConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.core.MarketingActionsViewMapper;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/di/PdpOldWidgetsModule;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "addToComparisonButtonConfig", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/core/AddToComparisonButtonConfig;", "addToComparisonButtonViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/core/AddToComparisonButtonViewMapper;", "captionConfig", "Lru/ozon/app/android/pdpoldwidgets/widgets/caption/core/CaptionConfig;", "captionViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/caption/core/CaptionViewMapper;", "marketingActionsConfig", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/core/MarketingActionsConfig;", "marketingActionsViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/core/MarketingActionsViewMapper;", "provideWidgets$pdp_old_widgets_prodGoogleAllVendorsRelease", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PdpOldWidgetsModule {
    @NotNull
    public final Set<Widget2> provideWidgets$pdp_old_widgets_prodGoogleAllVendorsRelease(@NotNull AddToComparisonButtonConfig addToComparisonButtonConfig, @NotNull AddToComparisonButtonViewMapper addToComparisonButtonViewMapper, @NotNull CaptionConfig captionConfig, @NotNull CaptionViewMapper captionViewMapper, @NotNull MarketingActionsConfig marketingActionsConfig, @NotNull MarketingActionsViewMapper marketingActionsViewMapper) {
        Intrinsics.checkNotNullParameter(addToComparisonButtonConfig, "addToComparisonButtonConfig");
        Intrinsics.checkNotNullParameter(addToComparisonButtonViewMapper, "addToComparisonButtonViewMapper");
        Intrinsics.checkNotNullParameter(captionConfig, "captionConfig");
        Intrinsics.checkNotNullParameter(captionViewMapper, "captionViewMapper");
        Intrinsics.checkNotNullParameter(marketingActionsConfig, "marketingActionsConfig");
        Intrinsics.checkNotNullParameter(marketingActionsViewMapper, "marketingActionsViewMapper");
        Widget2[] elements = {new Widget2("pdp", "addToComparisonButton", addToComparisonButtonConfig, new ViewMapper2[]{addToComparisonButtonViewMapper}), new Widget2("pdp", "caption", captionConfig, new ViewMapper2[]{captionViewMapper}), new Widget2("pdp", "marketingActions", marketingActionsConfig, new ViewMapper2[]{marketingActionsViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
