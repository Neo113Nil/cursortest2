package ru.ozon.app.android.commonwidgets.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.refresh.RefreshConfig;
import ru.ozon.app.android.commonwidgets.widgets.refresh.RefreshViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.core.ResultsHeaderConfig;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.core.ResultsHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.share.core.ShareLinkConfig;
import ru.ozon.app.android.commonwidgets.widgets.share.core.ShareLinkViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.themeSelector.ThemeSelectorConfig;
import ru.ozon.app.android.commonwidgets.widgets.themeSelector.ThemeSelectorViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.valuestotal.core.ValuesTotalConfig;
import ru.ozon.app.android.commonwidgets.widgets.valuestotal.core.ValuesTotalViewMapper;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J^\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/commonwidgets/di/StorefrontCommonV1Module;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/di/Widget;", "shareLinkConfig", "Lru/ozon/app/android/commonwidgets/widgets/share/core/ShareLinkConfig;", "shareLinkViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/share/core/ShareLinkViewMapper;", "refreshConfig", "Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshConfig;", "refreshViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshViewMapper;", "valuesTotalConfig", "Lru/ozon/app/android/commonwidgets/widgets/valuestotal/core/ValuesTotalConfig;", "themeSelectorConfig", "Lru/ozon/app/android/commonwidgets/widgets/themeSelector/ThemeSelectorConfig;", "themeSelectorViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/themeSelector/ThemeSelectorViewMapper;", "valuesTotalViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/valuestotal/core/ValuesTotalViewMapper;", "resultsHeaderConfig", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/core/ResultsHeaderConfig;", "resultsHeaderViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/core/ResultsHeaderViewMapper;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StorefrontCommonV1Module {

    @NotNull
    public static final StorefrontCommonV1Module INSTANCE = new StorefrontCommonV1Module();

    private StorefrontCommonV1Module() {
    }

    @NotNull
    public final Set<Widget> provideWidget(@NotNull ShareLinkConfig shareLinkConfig, @NotNull ShareLinkViewMapper shareLinkViewMapper, @NotNull RefreshConfig refreshConfig, @NotNull RefreshViewMapper refreshViewMapper, @NotNull ValuesTotalConfig valuesTotalConfig, @NotNull ThemeSelectorConfig themeSelectorConfig, @NotNull ThemeSelectorViewMapper themeSelectorViewMapper, @NotNull ValuesTotalViewMapper valuesTotalViewMapper, @NotNull ResultsHeaderConfig resultsHeaderConfig, @NotNull ResultsHeaderViewMapper resultsHeaderViewMapper) {
        Intrinsics.checkNotNullParameter(shareLinkConfig, "shareLinkConfig");
        Intrinsics.checkNotNullParameter(shareLinkViewMapper, "shareLinkViewMapper");
        Intrinsics.checkNotNullParameter(refreshConfig, "refreshConfig");
        Intrinsics.checkNotNullParameter(refreshViewMapper, "refreshViewMapper");
        Intrinsics.checkNotNullParameter(valuesTotalConfig, "valuesTotalConfig");
        Intrinsics.checkNotNullParameter(themeSelectorConfig, "themeSelectorConfig");
        Intrinsics.checkNotNullParameter(themeSelectorViewMapper, "themeSelectorViewMapper");
        Intrinsics.checkNotNullParameter(valuesTotalViewMapper, "valuesTotalViewMapper");
        Intrinsics.checkNotNullParameter(resultsHeaderConfig, "resultsHeaderConfig");
        Intrinsics.checkNotNullParameter(resultsHeaderViewMapper, "resultsHeaderViewMapper");
        Widget[] elements = {new Widget("common", "shareLink", shareLinkConfig, new ShareLinkViewMapper[]{shareLinkViewMapper}), new Widget("common", "refresh", refreshConfig, new RefreshViewMapper[]{refreshViewMapper}), new Widget("common", "resultsHeader", resultsHeaderConfig, new ResultsHeaderViewMapper[]{resultsHeaderViewMapper}), new Widget("common", "valuesTotal", valuesTotalConfig, new ValuesTotalViewMapper[]{valuesTotalViewMapper}), new Widget("common", "themeSelector", themeSelectorConfig, new ThemeSelectorViewMapper[]{themeSelectorViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
