package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import Ib.a;
import Sc.InterfaceC4008j;
import Sc.k;
import T00.j;
import android.content.Context;
import e10.AbstractC6251a;
import j20.C7244b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.SearchResultsCanParseDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.combiner.SearchResultsPlaceholderCombiner;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.TileLayout;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.TextMeasurer;
import ru.ozon.app.android.search.searchscreen.presentation.components.separator.SearchResultsSeparatorVO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\b\u0017\u0018\u0000 32\u00060\u0001j\u0002`\u0002:\u00013B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00180 H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010/\u001a\b\u0012\u0004\u0012\u00020!0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridConfig;", "Le10/a;", "Lru/ozon/app/android/composer/widgets/base/config/list/CombineListConfig;", "Landroid/content/Context;", "context", "LIb/a;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/TextMeasurer;", "textMeasurer", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/combiner/SearchResultsPlaceholderCombiner;", "combiner", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/SearchResultsCanParseDelegate;", "canParseDelegate", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Landroid/content/Context;LIb/a;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/combiner/SearchResultsPlaceholderCombiner;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/SearchResultsCanParseDelegate;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "", "", "addSeparator", "(Ljava/util/List;)V", "Lj20/b;", "state", "", "parse", "(Lj20/b;)Ljava/util/List;", "", "canParse", "(Lj20/b;)Z", "LT00/j;", "rawWidgets", "", "", "placeholderRawWidgets", "combineWith", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/combiner/SearchResultsPlaceholderCombiner;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/SearchResultsCanParseDelegate;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridMapper;", "mapper", "", "combineKeys", "Ljava/util/Set;", "getCombineKeys", "()Ljava/util/Set;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SearchResultsGridConfig extends AbstractC6251a {

    @NotNull
    private final SearchResultsCanParseDelegate canParseDelegate;

    @NotNull
    private final Set<String> combineKeys;

    @NotNull
    private final SearchResultsPlaceholderCombiner combiner;

    @NotNull
    private final JsonParser jsonDeserializer;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;
    public static final int $stable = 8;

    public SearchResultsGridConfig(@NotNull Context context, @NotNull a<TextMeasurer> textMeasurer, @NotNull SearchResultsPlaceholderCombiner combiner, @NotNull SearchResultsCanParseDelegate canParseDelegate, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(combiner, "combiner");
        Intrinsics.checkNotNullParameter(canParseDelegate, "canParseDelegate");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.combiner = combiner;
        this.canParseDelegate = canParseDelegate;
        this.jsonDeserializer = jsonDeserializer;
        this.mapper = k.b(new SearchResultsGridConfig$mapper$2(context, textMeasurer));
        this.combineKeys = e0.h("shelf-placeholder");
    }

    private final void addSeparator(List<Object> list) {
        list.add(new SearchResultsSeparatorVO(list.hashCode()));
    }

    private final SearchResultsGridMapper getMapper() {
        return (SearchResultsGridMapper) this.mapper.getValue();
    }

    @Override // e10.AbstractC6252b, j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return this.canParseDelegate.canParse(state) == TileLayout.LAYOUT_GRID2;
    }

    @Override // e10.AbstractC6251a
    @NotNull
    public List<j> combineWith(@NotNull List<j> rawWidgets, @NotNull Map<String, ? extends List<j>> placeholderRawWidgets) {
        Intrinsics.checkNotNullParameter(rawWidgets, "rawWidgets");
        Intrinsics.checkNotNullParameter(placeholderRawWidgets, "placeholderRawWidgets");
        return this.combiner.combineGrid(rawWidgets, placeholderRawWidgets);
    }

    @Override // e10.AbstractC6251a
    @NotNull
    public Set<String> getCombineKeys() {
        return this.combineKeys;
    }

    @Override // j20.InterfaceC7243a
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        List<SearchResultsGridVO> map = getMapper().map((SearchResultsGridDTO) this.jsonDeserializer.fromJson(state.b(), SearchResultsGridDTO.class), false);
        if (map.size() % 2 == 0) {
            return map;
        }
        ArrayList W02 = C7714v.W0(map);
        addSeparator(W02);
        return W02;
    }
}
