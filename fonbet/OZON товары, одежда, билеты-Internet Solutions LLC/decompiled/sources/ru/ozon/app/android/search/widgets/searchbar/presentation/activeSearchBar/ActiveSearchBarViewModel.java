package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import B0.A0;
import P4.f;
import UZ.a;
import WZ.g;
import android.net.Uri;
import androidx.lifecycle.w0;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.search.flags.CatalogInSearchSuggestionsEnabled;
import ru.ozon.app.android.search.widgets.commonTapTags.TapTagsRequestDTO;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.searchbar.utils.UriUtilsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 T2\u00020\u0001:\u0002TUB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\u0004\u0012\u00020\u00130\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\b2\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\f0!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\f2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b¢\u0006\u0004\b*\u0010+J)\u0010.\u001a\u00020\f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010)\u001a\u00020\b¢\u0006\u0004\b.\u0010/J1\u00105\u001a\u00020\f2\u0006\u00100\u001a\u00020\b2\u0006\u00102\u001a\u0002012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\f0!¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b7\u0010\u000bJ\u0015\u00108\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u000201¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010BR\u0017\u0010J\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\b0N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020H0N8F¢\u0006\u0006\u001a\u0004\bR\u0010P¨\u0006V"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepository;", "searchHistoryRepository", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepository;)V", "", "text", "getSuggestionUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "subscribeForSearchValue", "()V", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/SearchAnalyticsCustomizedParams;", "searchParams", "Lkotlin/Function2;", "LUZ/a;", "LWZ/g;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomizedEventParams;", "pageIdModifier-Usg-XMg", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/SearchAnalyticsCustomizedParams;)Lkotlin/jvm/functions/Function2;", "pageIdModifier", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "newModel", "updateSearchModel", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;)V", "", "searchDelay", "setSearchDelay", "(Ljava/lang/Long;)V", "newQuery", "Lkotlin/Function1;", "setText", "setSearchQuery", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onQueryChanged", "(Ljava/lang/String;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "removeQueryActionName", "onRemoveHistory", "(Ljava/lang/String;Ljava/lang/String;)V", "", "params", "onRemoveAllHistory", "(Ljava/util/Map;Ljava/lang/String;)V", SearchIntents.EXTRA_QUERY, "", "fromBind", "Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "update", "configureTapTagsRequestBody", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "getSearchResultDeeplink", "getSearchDebounce", "(Ljava/lang/String;)J", "isDialogSearch", "()Z", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepository;", "searchModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "LAe/x0;", "_searchQuery", "LAe/x0;", "Lxe/B0;", "searchQueryJob", "Lxe/B0;", "searchDebounce", "J", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel$Action;", "_actionFlow", "pageViewId", "Ljava/lang/String;", "getPageViewId", "()Ljava/lang/String;", "LAe/h;", "getSearchQueryFlow", "()LAe/h;", "searchQueryFlow", "getActionFlow", "actionFlow", "Companion", "Action", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActiveSearchBarViewModel extends w0 {

    @NotNull
    private final x0<Action> _actionFlow;

    @NotNull
    private final x0<String> _searchQuery;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final String pageViewId;
    private long searchDebounce;

    @NotNull
    private final SearchHistoryRepository searchHistoryRepository;
    private ActiveSearchBarVO searchModel;
    private B0 searchQueryJob;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel$Action;", "", "<init>", "()V", "SilentRefresh", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel$Action$SilentRefresh;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel$Action$SilentRefresh;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel$Action;", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SilentRefresh extends Action {
            private final String url;

            /* JADX WARN: Multi-variable type inference failed */
            public SilentRefresh() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SilentRefresh) && Intrinsics.d(this.url, ((SilentRefresh) other).url);
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("SilentRefresh(url=", this.url, ")");
            }

            public SilentRefresh(String str) {
                super(null);
                this.url = str;
            }

            public /* synthetic */ SilentRefresh(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public ActiveSearchBarViewModel(@NotNull FeatureChecker featureChecker, @NotNull SearchHistoryRepository searchHistoryRepository) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(searchHistoryRepository, "searchHistoryRepository");
        this.featureChecker = featureChecker;
        this.searchHistoryRepository = searchHistoryRepository;
        this._searchQuery = O0.a(null);
        this.searchDebounce = 300L;
        this._actionFlow = O0.a(null);
        this.pageViewId = f.b("toString(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2395h<String> getSearchQueryFlow() {
        return new C2406m0(this._searchQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSuggestionUrl(String text) {
        String str;
        ActiveSearchBarVO activeSearchBarVO = this.searchModel;
        if (activeSearchBarVO == null || (str = activeSearchBarVO.getDeeplink()) == null) {
            str = "ozon://searchSuggestions/?text={value}";
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        String uri = UriExtKt.replaceQueryParameter(parse, "text", text).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return ru.ozon.app.android.utils.UriExtKt.removeSchema(uri);
    }

    /* renamed from: pageIdModifier-Usg-XMg$default, reason: not valid java name */
    public static /* synthetic */ Function2 m980pageIdModifierUsgXMg$default(ActiveSearchBarViewModel activeSearchBarViewModel, SearchAnalyticsCustomizedParams searchAnalyticsCustomizedParams, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            searchAnalyticsCustomizedParams = null;
        }
        return activeSearchBarViewModel.m981pageIdModifierUsgXMg(searchAnalyticsCustomizedParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0028, code lost:
    
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void configureTapTagsRequestBody(@NotNull String query, boolean fromBind, @NotNull Function1<? super TapTagsRequestDTO, Unit> update) {
        String link;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(update, "update");
        String str = "";
        if (isDialogSearch()) {
            ActiveSearchBarVO activeSearchBarVO = this.searchModel;
            link = activeSearchBarVO != null ? activeSearchBarVO.getDeeplink() : null;
        } else {
            ActiveSearchBarVO activeSearchBarVO2 = this.searchModel;
            link = activeSearchBarVO2 != null ? activeSearchBarVO2.getLink() : null;
        }
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        Intrinsics.checkNotNullExpressionValue(clearQuery, "clearQuery(...)");
        for (String str2 : queryParameterNames) {
            clearQuery.appendQueryParameter(str2, Intrinsics.d(str2, "text") ? query : parse.getQueryParameter(str2));
        }
        String uri = clearQuery.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        update.invoke(new TapTagsRequestDTO(query, uri, null, fromBind, Long.valueOf(getSearchDebounce(query)), 4, null));
    }

    @NotNull
    public final InterfaceC2395h<Action> getActionFlow() {
        return new C2406m0(this._actionFlow);
    }

    @NotNull
    public final String getPageViewId() {
        return this.pageViewId;
    }

    public final long getSearchDebounce(@NotNull String query) {
        ActiveSearchBarVO activeSearchBarVO;
        String searchText;
        Intrinsics.checkNotNullParameter(query, "query");
        if (h.K(query) || (activeSearchBarVO = this.searchModel) == null || (searchText = activeSearchBarVO.getSearchText()) == null || !(!h.K(searchText))) {
            return 0L;
        }
        return this.searchDebounce;
    }

    @NotNull
    public final String getSearchResultDeeplink(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ActiveSearchBarVO activeSearchBarVO = this.searchModel;
        String str = null;
        String link = activeSearchBarVO != null ? activeSearchBarVO.getLink() : null;
        if (link == null || h.K(link)) {
            String uri = Uri.parse("ozon://search/").buildUpon().appendQueryParameter("text", text).build().toString();
            Intrinsics.f(uri);
            return uri;
        }
        if (link != null) {
            str = link.substring(1);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        Uri parse = Uri.parse("ozon://" + str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        String uri2 = UriUtilsKt.replaceSTextQuery(UriUtilsKt.formatQuery(parse, text), text).toString();
        Intrinsics.f(uri2);
        return uri2;
    }

    public final boolean isDialogSearch() {
        String deeplink;
        boolean isEnabled = this.featureChecker.isEnabled(CatalogInSearchSuggestionsEnabled.INSTANCE);
        ActiveSearchBarVO activeSearchBarVO = this.searchModel;
        return activeSearchBarVO != null && (deeplink = activeSearchBarVO.getDeeplink()) != null && ActiveSearchBarViewModelKt.isFreshPage(deeplink) && isEnabled;
    }

    public final void onQueryChanged(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ActiveSearchBarViewModel$onQueryChanged$1(this, value, null), 3);
    }

    public final void onRemoveAllHistory(@NotNull Map<String, String> params, @NotNull String removeQueryActionName) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(removeQueryActionName, "removeQueryActionName");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ActiveSearchBarViewModel$onRemoveAllHistory$1(this, params, removeQueryActionName, null), 3);
    }

    public final void onRemoveHistory(@NotNull String title, @NotNull String removeQueryActionName) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(removeQueryActionName, "removeQueryActionName");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ActiveSearchBarViewModel$onRemoveHistory$1(this, title, removeQueryActionName, null), 3);
    }

    @NotNull
    /* renamed from: pageIdModifier-Usg-XMg, reason: not valid java name */
    public final Function2<a, g, g> m981pageIdModifierUsgXMg(SearchAnalyticsCustomizedParams searchParams) {
        return new ActiveSearchBarViewModel$pageIdModifier$1(searchParams, this);
    }

    public final void setSearchDelay(Long searchDelay) {
        this.searchDebounce = searchDelay != null ? searchDelay.longValue() : 300L;
    }

    public final void setSearchQuery(@NotNull String newQuery, @NotNull Function1<? super String, Unit> setText) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        Intrinsics.checkNotNullParameter(setText, "setText");
        setText.invoke(newQuery);
    }

    public final void subscribeForSearchValue() {
        B0 b02 = this.searchQueryJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.searchQueryJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ActiveSearchBarViewModel$subscribeForSearchValue$1(this, null), 3);
    }

    public final void updateSearchModel(@NotNull ActiveSearchBarVO newModel) {
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        this.searchModel = newModel;
    }
}
