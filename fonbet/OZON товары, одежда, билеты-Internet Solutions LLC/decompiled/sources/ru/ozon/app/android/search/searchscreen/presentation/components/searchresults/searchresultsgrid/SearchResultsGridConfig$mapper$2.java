package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import Ib.a;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.TextMeasurer;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchResultsGridConfig$mapper$2 extends AbstractC7737t implements Function0<SearchResultsGridMapper> {
    final /* synthetic */ Context $context;
    final /* synthetic */ a<TextMeasurer> $textMeasurer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultsGridConfig$mapper$2(Context context, a<TextMeasurer> aVar) {
        super(0);
        this.$context = context;
        this.$textMeasurer = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchResultsGridMapper invoke() {
        Context context = this.$context;
        TextMeasurer textMeasurer = this.$textMeasurer.get();
        Intrinsics.checkNotNullExpressionValue(textMeasurer, "get(...)");
        TextMeasurer textMeasurer2 = textMeasurer;
        Context context2 = this.$context;
        if (FavoriteCoreComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FavoriteCoreComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context2, FavoriteCoreComponentApi.class).getDependencyStorage();
        if (FavoriteCoreComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FavoriteCoreComponentApi is not DiComponent");
        }
        return new SearchResultsGridMapper(context, textMeasurer2, ((FavoriteCoreComponentApi) dependencyStorage.b(FavoriteCoreComponentApi.class)).getSelectedProductsManager());
    }
}
