package ru.ozon.app.android.fresh.checkout.widgets.searchBankList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.searchBankList.data.SearchBankListConfig;
import ru.ozon.app.android.fresh.checkout.widgets.searchBankList.mapper.SearchBankListViewMapper;

/* loaded from: classes6.dex */
public final class SearchBankListWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(SearchBankListConfig searchBankListConfig, SearchBankListViewMapper searchBankListViewMapper) {
        Widget2 provideWidget = SearchBankListWidgetModule.INSTANCE.provideWidget(searchBankListConfig, searchBankListViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
