package ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation;

import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import cA.ViewOnTouchListenerC5778a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.RegionSearchVO;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.view.RegionSearchView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001*\b\u0000\u0018\u0000 42\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00014B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J)\u0010!\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/view/RegionSearchView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/view/RegionSearchView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchViewModel;)V", "", "newQuery", "", "onSearchQueryChanged", "(Ljava/lang/CharSequence;)V", "updateSearchQuery", "()V", "setupWidget", "cleanupWidget", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchVO;Ll20/d;)V", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/view/RegionSearchView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchViewModel;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "ru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchWidgetViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchWidgetViewHolder$scrollListener$1;", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/DebouncedTextWatcher;", "searchTextWatcher", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/DebouncedTextWatcher;", "Landroid/net/Uri;", "getRefreshLinkUri", "()Landroid/net/Uri;", "refreshLinkUri", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RegionSearchWidgetViewHolder extends k<RegionSearchVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final RegionSearchView containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final RegionSearchWidgetViewHolder$scrollListener$1 scrollListener;

    @NotNull
    private final DebouncedTextWatcher searchTextWatcher;

    @NotNull
    private final l tokenizedAnalytics;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener touchListener;

    @NotNull
    private final RegionSearchViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchWidgetViewHolder$Companion;", "", "<init>", "()V", "SEARCH_QUERY_PARAM_NAME", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.RegionSearchWidgetViewHolder$scrollListener$1] */
    public RegionSearchWidgetViewHolder(@NotNull RegionSearchView containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull RegionSearchViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.touchListener = new ViewOnTouchListenerC5778a(this, 2);
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.RegionSearchWidgetViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                RegionSearchView regionSearchView;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (dy != 0) {
                    regionSearchView = RegionSearchWidgetViewHolder.this.containerView;
                    regionSearchView.closeKeyboard();
                }
            }
        };
        this.searchTextWatcher = new DebouncedTextWatcher(new RegionSearchWidgetViewHolder$searchTextWatcher$1(this));
        setupWidget();
    }

    private final void cleanupWidget() {
        View view;
        RecyclerView composerRecyclerView;
        this.searchTextWatcher.clear();
        RegionSearchView regionSearchView = this.containerView;
        regionSearchView.getSearchField().setTextWatcher(null);
        regionSearchView.closeKeyboard();
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.removeOnScrollListener(this.scrollListener);
        composerRecyclerView.setOnTouchListener(null);
    }

    private final Uri getRefreshLinkUri() {
        RegionSearchVO.TextFieldVO input;
        CommonControlSettings common;
        AtomAction atomAction$default;
        String link;
        RegionSearchVO boundData = getBoundData();
        if (boundData != null && (input = boundData.getInput()) != null && (common = input.getCommon()) != null && (atomAction$default = CommonControlSettingsExtKt.atomAction$default(common, null, 1, null)) != null) {
            AtomAction.Refresh refresh = atomAction$default instanceof AtomAction.Refresh ? (AtomAction.Refresh) atomAction$default : null;
            if (refresh != null && (link = refresh.getLink()) != null) {
                return Uri.parse(link);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSearchQueryChanged(CharSequence newQuery) {
        Uri.Builder replaceQueryParameter;
        String builder;
        if (newQuery == null || newQuery.equals(this.viewModel.getSearchQuery())) {
            return;
        }
        this.viewModel.setSearchQuery(newQuery.toString());
        Uri refreshLinkUri = getRefreshLinkUri();
        InterfaceC7851b.a.e(this.refs.getController(), (refreshLinkUri == null || (replaceQueryParameter = UriExtKt.replaceQueryParameter(refreshLinkUri, "search", newQuery.toString())) == null || (builder = replaceQueryParameter.toString()) == null) ? null : ru.ozon.app.android.utils.UriExtKt.removeSchema(builder), null, null, 6);
    }

    private final void setupWidget() {
        View view;
        RecyclerView composerRecyclerView;
        this.containerView.getSearchField().setTextWatcher(this.searchTextWatcher);
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.addOnScrollListener(this.scrollListener);
        composerRecyclerView.setOnTouchListener(this.touchListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(RegionSearchWidgetViewHolder regionSearchWidgetViewHolder, View view, MotionEvent motionEvent) {
        regionSearchWidgetViewHolder.containerView.closeKeyboard();
        return false;
    }

    private final void updateSearchQuery() {
        String searchQuery = this.viewModel.getSearchQuery();
        Editable inputText = this.containerView.getSearchField().getInputText();
        String obj = inputText != null ? inputText.toString() : null;
        if (searchQuery == null || searchQuery.equals(obj)) {
            return;
        }
        this.containerView.getSearchField().setInputText(searchQuery);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        cleanupWidget();
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RegionSearchVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item);
        DebouncedTextWatcher debouncedTextWatcher = this.searchTextWatcher;
        Long delay = item.getInput().getDelay();
        debouncedTextWatcher.setDebounceMillis(delay != null ? delay.longValue() : 500L);
        updateSearchQuery();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull RegionSearchVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((RegionSearchWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
