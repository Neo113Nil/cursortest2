package ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation;

import MQ.b;
import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.actions.SearchIntents;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.view.TravelSearchBarInputView;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.travel.utils.extensions.UriExtensionsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import v10.C10183a;

@Metadata(d1 = {"\u0000\u0099\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00017\b\u0001\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001JB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\f2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\u0017\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\f0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010G\u001a\u0004\u0018\u00010D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u00102¨\u0006K"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/presentation/TravelSearchBarWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/presentation/TravelSearchBarVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "", SearchIntents.EXTRA_QUERY, "", "onQueryChanged", "(Ljava/lang/String;)V", "setUpInput", "()V", "releaseInput", "setUpListeners", "removeListeners", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "trackView", "(LWZ/t;)V", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/presentation/TravelSearchBarVO;)V", "onWidgetDestroyed", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/presentation/TravelSearchBarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/b;", "composerController", "Ll10/b;", "Ll10/t;", "composerContainer", "Ll10/t;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "parent", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "view$delegate", "LSc/j;", "getView", "()Landroid/view/View;", "view", "Lru/ozon/app/android/travel/utils/DebouncedTextWatcher;", "debouncedTextWatcher", "Lru/ozon/app/android/travel/utils/DebouncedTextWatcher;", "ru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/presentation/TravelSearchBarWidgetViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/presentation/TravelSearchBarWidgetViewHolder$scrollListener$1;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "isViewBound", "Z", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/view/TravelSearchBarInputView;", "getInputView", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/view/TravelSearchBarInputView;", "inputView", "getMetricView", "metricView", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelSearchBarWidgetViewHolder extends AbstractC6065b<TravelSearchBarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final t composerContainer;

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final DebouncedTextWatcher debouncedTextWatcher;
    private boolean isViewBound;

    @NotNull
    private final LinearLayout parent;

    @NotNull
    private final TravelSearchBarWidgetViewHolder$scrollListener$1 scrollListener;

    @NotNull
    private final l tokenizedAnalytics;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener touchListener;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r9v2, types: [ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation.TravelSearchBarWidgetViewHolder$scrollListener$1] */
    public TravelSearchBarWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.composerController = container.M();
        this.composerContainer = container.K();
        this.tokenizedAnalytics = container.X();
        this.parent = C10183a.o(container.Y());
        this.view = LazyUtilsKt.unsafeLazy(new TravelSearchBarWidgetViewHolder$view$2(viewFactory, this));
        this.debouncedTextWatcher = new DebouncedTextWatcher(0L, null, new TravelSearchBarWidgetViewHolder$debouncedTextWatcher$1(this), 3, null);
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation.TravelSearchBarWidgetViewHolder$scrollListener$1
            /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
            
                r1 = r0.this$0.getInputView();
             */
            @Override // androidx.recyclerview.widget.RecyclerView.t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                TravelSearchBarInputView inputView;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (dy == 0 || inputView == null) {
                    return;
                }
                inputView.hideKeyboard();
            }
        };
        this.touchListener = new b(this, 0);
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$1(TravelSearchBarVO travelSearchBarVO, TravelSearchBarWidgetViewHolder travelSearchBarWidgetViewHolder, View view) {
        AtomAction tapAction = travelSearchBarVO.getTapAction();
        if (tapAction != null) {
            travelSearchBarWidgetViewHolder.actionHandler.invoke(tapAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TravelSearchBarInputView getInputView() {
        View view = getView();
        if (view instanceof TravelSearchBarInputView) {
            return (TravelSearchBarInputView) view;
        }
        return null;
    }

    private final View getView() {
        return (View) this.view.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onQueryChanged(String query) {
        Uri parse;
        Uri.Builder replaceQueryParameter;
        String builder;
        TravelSearchBarVO boundData = getBoundData();
        if (boundData != null && boundData.getIsEnabled()) {
            TravelSearchBarInputView inputView = getInputView();
            if (inputView != null) {
                inputView.setIsClearButtonVisible(query.length() > 0);
            }
            if (Intrinsics.d(query, boundData.getInputValue())) {
                return;
            }
            AtomAction inputOnChangeAction = boundData.getInputOnChangeAction();
            if (inputOnChangeAction instanceof AtomAction.Refresh) {
                String link = ((AtomAction.Refresh) inputOnChangeAction).getLink();
                InterfaceC7851b.a.e(this.composerController, (link == null || (parse = Uri.parse(link)) == null || (replaceQueryParameter = UriExtensionsKt.replaceQueryParameter(parse, "search", query)) == null || (builder = replaceQueryParameter.toString()) == null) ? null : UriExtKt.removeSchema(builder), null, null, 6);
            }
        }
    }

    private final void releaseInput() {
        TravelSearchBarInputView inputView = getInputView();
        if (inputView != null) {
            inputView.removeTextWatcher(this.debouncedTextWatcher);
            inputView.hideKeyboard();
        }
    }

    private final void removeListeners() {
        View view;
        RecyclerView composerRecyclerView;
        ComponentCallbacksC5392m b11 = this.composerContainer.b();
        if (b11 == null || (view = b11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.removeOnScrollListener(this.scrollListener);
        composerRecyclerView.setOnTouchListener(null);
    }

    private final void setUpInput() {
        TravelSearchBarInputView inputView = getInputView();
        if (inputView != null) {
            inputView.addTextWatcher(this.debouncedTextWatcher);
        }
    }

    private final void setUpListeners() {
        View view;
        RecyclerView composerRecyclerView;
        ComponentCallbacksC5392m b11 = this.composerContainer.b();
        if (b11 == null || (view = b11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.addOnScrollListener(this.scrollListener);
        composerRecyclerView.setOnTouchListener(this.touchListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(TravelSearchBarWidgetViewHolder travelSearchBarWidgetViewHolder, View view, MotionEvent motionEvent) {
        TravelSearchBarInputView inputView = travelSearchBarWidgetViewHolder.getInputView();
        if (inputView == null) {
            return false;
        }
        inputView.hideKeyboard();
        return false;
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return getView();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.parent.addView(getView());
        setUpInput();
        setUpListeners();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        removeListeners();
        releaseInput();
        this.parent.removeView(getView());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TravelSearchBarVO item) {
        int i11 = 1;
        Intrinsics.checkNotNullParameter(item, "item");
        final TravelSearchBarInputView inputView = getInputView();
        if (inputView != null) {
            if (!this.isViewBound) {
                inputView.setInputText(item.getInputValue());
                this.isViewBound = true;
            }
            inputView.setInputHint(item.getInputPlaceholder());
            inputView.setIsClearButtonVisible(item.getIsClearButtonVisible());
            inputView.setIsEnabled(item.getIsEnabled());
            if (item.getIsEnabled()) {
                inputView.setOnClickListener(null);
            } else {
                inputView.setOnClickListener(new Hx.b(i11, item, this));
            }
            int i12 = Y.f42258g;
            if (!inputView.isLaidOut() || inputView.isLayoutRequested()) {
                inputView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation.TravelSearchBarWidgetViewHolder$bind$lambda$3$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        TravelSearchBarInputView.this.showKeyboard();
                    }
                });
            } else {
                inputView.showKeyboard();
            }
        }
        trackView(item.getSearchEvent());
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull TravelSearchBarVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        trackView(item.getSearchEvent());
    }

    private final void trackView(WZ.t event) {
        if (event == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, event, null, 2, null);
    }
}
