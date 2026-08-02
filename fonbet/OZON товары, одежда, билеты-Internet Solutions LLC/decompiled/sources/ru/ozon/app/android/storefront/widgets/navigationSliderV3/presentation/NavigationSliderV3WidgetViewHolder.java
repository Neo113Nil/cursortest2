package ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation;

import Vg.c;
import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.utils.NavigationSliderV3Helper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.views.NavigationSliderV3RecyclerView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/NavigationSliderV3WidgetViewHolder;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/NavigationSliderV3BaseWidgetViewHolder;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/views/NavigationSliderV3RecyclerView;", "rootView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper;", "sliderV3Helper", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "actionHandlersStore", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/views/NavigationSliderV3RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper;LVg/c;LWZ/l;)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderV3WidgetViewHolder extends NavigationSliderV3BaseWidgetViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSliderV3WidgetViewHolder(@NotNull NavigationSliderV3RecyclerView rootView, @NotNull ComposerReferences composerReferences, @NotNull NavigationSliderV3Helper sliderV3Helper, @NotNull c actionHandlersStore, @NotNull l tokenizedAnalytics) {
        super(rootView, composerReferences, sliderV3Helper, actionHandlersStore, tokenizedAnalytics);
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(sliderV3Helper, "sliderV3Helper");
        Intrinsics.checkNotNullParameter(actionHandlersStore, "actionHandlersStore");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
    }
}
