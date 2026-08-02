package ru.ozon.app.android.yandexsearchsheet;

import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.yandexsearchsheet.adapter.YandexSuggestionsAdapter;

/* loaded from: classes3.dex */
public final class YandexSearchSheetFragment_MembersInjector implements b<YandexSearchSheetFragment> {
    public static void injectPViewModel(YandexSearchSheetFragment yandexSearchSheetFragment, a<YandexSearchSheetViewModelImpl> aVar) {
        yandexSearchSheetFragment.pViewModel = aVar;
    }

    public static void injectRouter(YandexSearchSheetFragment yandexSearchSheetFragment, g gVar) {
        yandexSearchSheetFragment.router = gVar;
    }

    public static void injectSuggestionsAdapter(YandexSearchSheetFragment yandexSearchSheetFragment, YandexSuggestionsAdapter yandexSuggestionsAdapter) {
        yandexSearchSheetFragment.suggestionsAdapter = yandexSuggestionsAdapter;
    }
}
