package ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation;

import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation.view.SearchBarView;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarViewHolder;", "Ld20/d;", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarVO;", "Ll10/i;", "container", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LWZ/l;Ld20/e;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "scrollToTop", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onWidgetDestroyed", "Ll10/i;", "LWZ/l;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarScrollListener;", "scrollListener", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarScrollListener;", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/view/SearchBarView;", "getSearchBarView", "()Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/view/SearchBarView;", "searchBarView", "Landroidx/recyclerview/widget/RecyclerView;", "getComposerRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchBarViewHolder extends AbstractC6067d<SearchBarVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final SearchBarScrollListener scrollListener;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarViewHolder$Companion;", "", "<init>", "()V", "ID_SCROLL_ACTION", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarViewHolder(@NotNull i container, @NotNull l tokenizedAnalytics, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(container, this).onPreProcess(new SearchBarViewHolder$actionHandler$1(this)).buildHandler();
        this.scrollListener = new SearchBarScrollListener(new SearchBarViewHolder$scrollListener$1(this));
    }

    private final RecyclerView getComposerRecyclerView() {
        return ComposerViewExtensionKt.composerRecyclerView(this.container.Y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchBarView getSearchBarView() {
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation.view.SearchBarView");
        return (SearchBarView) view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean scrollToTop(AtomAction action) {
        boolean d11 = Intrinsics.d(action.getId(), "scrollToTop");
        if (d11) {
            getSearchBarView().onScrollDistanceChanged(0);
            this.scrollListener.resetScrollDistance();
            getComposerRecyclerView().smoothScrollToPosition(0);
        }
        return d11;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        getComposerRecyclerView().addOnScrollListener(this.scrollListener);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        getComposerRecyclerView().removeOnScrollListener(this.scrollListener);
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SearchBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getSearchBarView().bind(item, this.actionHandler);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull SearchBarVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((SearchBarViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = CommonControlSettingsExtKt.getTokenizedEvent(item.getCommon(), Long.valueOf(item.getId()));
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
