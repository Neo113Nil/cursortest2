package ru.ozon.app.android.search.widgets.tapTags.v3.presentation;

import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.search.flags.CatalogInSearchSuggestionsEnabled;
import ru.ozon.app.android.search.widgets.commonTapTags.TapTagsRequestDTO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModelKt;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3DTO;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3MapperKt;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3VO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 82\u00020\u0001:\u000289B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\f2\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020 048F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "request", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;", "suggestedPage", "", "handleSuggestedPage", "(Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;)V", "", "pageLink", "clearSearchTextParams", "(Ljava/lang/String;)Ljava/lang/String;", "onCleared", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "setWidgetInfo", "(Ll20/d;)V", "updateTapTags", "(Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;)V", "onComposerDoneRefreshing", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;", "_tapTags", "Landroidx/lifecycle/V;", "Lxe/B0;", "fetchTapTagsJob", "Lxe/B0;", "lastRequest", "Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "Ll20/d;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel$Action;", "actionLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "", "mustUseCached", "Z", "cachedVo", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;", "Landroidx/lifecycle/P;", "getTapTags", "()Landroidx/lifecycle/P;", "tapTags", "Companion", "Action", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagsV3ViewModel extends w0 {

    @NotNull
    private final V<TapTagsV3VO> _tapTags;

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private TapTagsV3VO cachedVo;

    @NotNull
    private final FeatureChecker featureChecker;
    private B0 fetchTapTagsJob;
    private TapTagsRequestDTO lastRequest;
    private boolean mustUseCached;
    private d widgetInfo;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel$Action;", "", "<init>", "()V", "Error", "SilentRefresh", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel$Action$Error;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel$Action$SilentRefresh;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel$Action$Error;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return -1845069026;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel$Action$SilentRefresh;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel$Action;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/RefreshDataWrapper;", "data", "<init>", "(Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/RefreshDataWrapper;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/RefreshDataWrapper;", "getData", "()Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/RefreshDataWrapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SilentRefresh extends Action {

            @NotNull
            private final RefreshDataWrapper data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SilentRefresh(@NotNull RefreshDataWrapper data) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SilentRefresh) && Intrinsics.d(this.data, ((SilentRefresh) other).data);
            }

            @NotNull
            public final RefreshDataWrapper getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            @NotNull
            public String toString() {
                return "SilentRefresh(data=" + this.data + ")";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public TapTagsV3ViewModel(@NotNull FeatureChecker featureChecker, @NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.featureChecker = featureChecker;
        this.actionV2Repository = actionV2Repository;
        this._tapTags = new V<>();
        this.actionLiveData = new SingleLiveEvent<>();
        this.mustUseCached = true;
        this.cachedVo = TapTagsV3MapperKt.toVO$default(TapTagsV3DTO.Companion.createEmptyDTO$default(TapTagsV3DTO.INSTANCE, null, 1, null), null, 1, null);
    }

    private final String clearSearchTextParams(String pageLink) {
        Uri parse = Uri.parse(pageLink);
        Intrinsics.f(parse);
        String builder = UriExtKt.replaceQueryParameter(UriExtKt.removeQueryParameter(parse, "full_search_text"), "text", "").toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuggestedPage(TapTagsRequestDTO request, TapTagsV3VO.SuggestedPage suggestedPage) {
        String refreshLink;
        boolean isEnabled = this.featureChecker.isEnabled(CatalogInSearchSuggestionsEnabled.INSTANCE);
        boolean z11 = false;
        if (suggestedPage != null && (refreshLink = suggestedPage.getRefreshLink()) != null && ActiveSearchBarViewModelKt.isFreshPage(refreshLink)) {
            z11 = true;
        }
        if (isEnabled && suggestedPage != null && z11) {
            this.actionLiveData.setValue(new Action.SilentRefresh(new RefreshDataWrapper(suggestedPage, request)));
        }
    }

    @NotNull
    public final SingleLiveEvent<Action> getActionLiveData() {
        return this.actionLiveData;
    }

    @NotNull
    public final P<TapTagsV3VO> getTapTags() {
        return this._tapTags;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        B0 b02 = this.fetchTapTagsJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    public final void onComposerDoneRefreshing() {
        if (this.mustUseCached) {
            this._tapTags.setValue(this.cachedVo);
            this.mustUseCached = false;
        }
    }

    public final void setWidgetInfo(@NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.widgetInfo = widgetInfo;
    }

    public final void updateTapTags(@NotNull TapTagsRequestDTO request) {
        String searchText;
        TapTagsV3VO value;
        List<TagButtonDTO> items;
        TapTagsV3VO.SuggestedPage suggestedPage;
        B0 b02;
        Intrinsics.checkNotNullParameter(request, "request");
        boolean isEnabled = this.featureChecker.isEnabled(CatalogInSearchSuggestionsEnabled.INSTANCE);
        boolean isFreshPage = ActiveSearchBarViewModelKt.isFreshPage(request.getLink());
        if (isEnabled && !isFreshPage) {
            Log.d("TapTagsV3ViewModel", "Not allowed to call v3 action from global");
            return;
        }
        B0 b03 = this.fetchTapTagsJob;
        if (b03 != null && b03.isActive() && (b02 = this.fetchTapTagsJob) != null) {
            b02.j(null);
        }
        this.fetchTapTagsJob = null;
        if (h.K(request.getQuery())) {
            String clearSearchTextParams = clearSearchTextParams(request.getLink());
            TapTagsV3VO value2 = this._tapTags.getValue();
            TapTagsV3VO.SuggestedPage copy = (value2 == null || (suggestedPage = value2.getSuggestedPage()) == null) ? null : suggestedPage.copy(clearSearchTextParams, null);
            this.lastRequest = request;
            handleSuggestedPage(request, copy);
            C10727i.c(x0.a(this), null, null, new TapTagsV3ViewModel$updateTapTags$1(request, this, clearSearchTextParams, isFreshPage, null), 3);
            return;
        }
        TapTagsV3VO value3 = this._tapTags.getValue();
        if (value3 == null || (searchText = value3.getSearchText()) == null || !searchText.equals(request.getQuery()) || (value = this._tapTags.getValue()) == null || (items = value.getItems()) == null || !(!items.isEmpty())) {
            this.fetchTapTagsJob = C10727i.c(x0.a(this), null, null, new TapTagsV3ViewModel$updateTapTags$2(this, request, isFreshPage, null), 3);
        }
    }
}
