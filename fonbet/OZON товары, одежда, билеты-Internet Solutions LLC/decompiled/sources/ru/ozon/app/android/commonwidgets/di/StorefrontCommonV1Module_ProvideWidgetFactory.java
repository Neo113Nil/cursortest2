package ru.ozon.app.android.commonwidgets.di;

import Jb.e;
import Jb.j;
import java.util.Set;
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

/* loaded from: classes6.dex */
public final class StorefrontCommonV1Module_ProvideWidgetFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidget(ShareLinkConfig shareLinkConfig, ShareLinkViewMapper shareLinkViewMapper, RefreshConfig refreshConfig, RefreshViewMapper refreshViewMapper, ValuesTotalConfig valuesTotalConfig, ThemeSelectorConfig themeSelectorConfig, ThemeSelectorViewMapper themeSelectorViewMapper, ValuesTotalViewMapper valuesTotalViewMapper, ResultsHeaderConfig resultsHeaderConfig, ResultsHeaderViewMapper resultsHeaderViewMapper) {
        Set<Widget> provideWidget = StorefrontCommonV1Module.INSTANCE.provideWidget(shareLinkConfig, shareLinkViewMapper, refreshConfig, refreshViewMapper, valuesTotalConfig, themeSelectorConfig, themeSelectorViewMapper, valuesTotalViewMapper, resultsHeaderConfig, resultsHeaderViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
