package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.input;

import MN.b;
import Sc.InterfaceC4008j;
import WZ.t;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.Y;
import com.google.android.gms.actions.SearchIntents;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.PassengersDirectoryV3ViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.input.PassengersDirectoryV3InputWidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.view.PassengersDirectoryV3InputView;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.travel.utils.extensions.UriExtensionsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import t10.C9727b;
import v10.C10183a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010#¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/input/PassengersDirectoryV3InputWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/input/PassengersDirectoryV3InputVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/PassengersDirectoryV3ViewModel;", "viewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/PassengersDirectoryV3ViewModel;Ld20/e;)V", "", SearchIntents.EXTRA_QUERY, "", "onQueryChanged", "(Ljava/lang/String;)V", "setUpInput", "()V", "releaseInput", "setUpListeners", "removeListeners", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/input/PassengersDirectoryV3InputVO;)V", "onWidgetCreated", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/PassengersDirectoryV3ViewModel;", "parent", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "view$delegate", "LSc/j;", "getView", "()Landroid/view/View;", "view", "Lru/ozon/app/android/travel/utils/DebouncedTextWatcher;", "debouncedTextWatcher", "Lru/ozon/app/android/travel/utils/DebouncedTextWatcher;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnFocusChangeListener;", "inputOnFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "", "isViewBound", "Z", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/view/PassengersDirectoryV3InputView;", "getInputView", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/view/PassengersDirectoryV3InputView;", "inputView", "getMetricView", "metricView", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV3InputWidgetViewHolder extends AbstractC6065b<PassengersDirectoryV3InputVO> {

    @NotNull
    private final i container;

    @NotNull
    private final DebouncedTextWatcher debouncedTextWatcher;

    @NotNull
    private final View.OnFocusChangeListener inputOnFocusChangeListener;
    private boolean isViewBound;

    @NotNull
    private final LinearLayout parent;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener touchListener;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;

    @NotNull
    private final PassengersDirectoryV3ViewModel viewModel;

    public PassengersDirectoryV3InputWidgetViewHolder(@NotNull i container, @NotNull PassengersDirectoryV3ViewModel viewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.parent = C10183a.o(container.Y());
        this.view = LazyUtilsKt.unsafeLazy(new PassengersDirectoryV3InputWidgetViewHolder$view$2(viewFactory, this));
        this.debouncedTextWatcher = new DebouncedTextWatcher(0L, null, new PassengersDirectoryV3InputWidgetViewHolder$debouncedTextWatcher$1(this), 3, null);
        this.touchListener = new b(this, 0);
        this.inputOnFocusChangeListener = new View.OnFocusChangeListener() { // from class: MN.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                PassengersDirectoryV3InputWidgetViewHolder.inputOnFocusChangeListener$lambda$2(PassengersDirectoryV3InputWidgetViewHolder.this, view, z11);
            }
        };
    }

    private final PassengersDirectoryV3InputView getInputView() {
        View view = getView();
        if (view instanceof PassengersDirectoryV3InputView) {
            return (PassengersDirectoryV3InputView) view;
        }
        return null;
    }

    private final View getView() {
        return (View) this.view.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void inputOnFocusChangeListener$lambda$2(PassengersDirectoryV3InputWidgetViewHolder passengersDirectoryV3InputWidgetViewHolder, View view, boolean z11) {
        PassengersDirectoryV3InputVO boundData;
        t clickEvent;
        if (!z11 || (boundData = passengersDirectoryV3InputWidgetViewHolder.getBoundData()) == null || (clickEvent = boundData.getClickEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(passengersDirectoryV3InputWidgetViewHolder.container.X(), clickEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onQueryChanged(String query) {
        Uri parse;
        Uri.Builder replaceQueryParameter;
        String builder;
        if (this.viewModel.isInputTextChange(query)) {
            this.viewModel.setInputText(query);
            PassengersDirectoryV3InputVO boundData = getBoundData();
            if (boundData == null) {
                return;
            }
            PassengersDirectoryV3InputView inputView = getInputView();
            if (inputView != null) {
                inputView.setIsClearButtonVisible(this.viewModel.getIsClearButtonVisible());
            }
            AtomAction action = boundData.getAction();
            if (action instanceof AtomAction.Refresh) {
                AtomAction.Refresh refresh = (AtomAction.Refresh) action;
                String link = refresh.getLink();
                InterfaceC7851b.a.e(this.container.M(), (link == null || (parse = Uri.parse(link)) == null || (replaceQueryParameter = UriExtensionsKt.replaceQueryParameter(parse, "search", query)) == null || (builder = replaceQueryParameter.toString()) == null) ? null : UriExtKt.removeSchema(builder), null, null, 6);
                this.viewModel.setIsSilentRefresh(true);
                if (Intrinsics.d(refresh.getScrollPosition(), AtomAction.ScrollPosition.Top.INSTANCE)) {
                    this.viewModel.setIsScrollToTop(true);
                }
            }
        }
    }

    private final void releaseInput() {
        PassengersDirectoryV3InputView inputView = getInputView();
        if (inputView != null) {
            inputView.removeTextWatcher(this.debouncedTextWatcher);
            inputView.hideKeyboardInput();
        }
    }

    private final void removeListeners() {
        C9727b.a(this.container, PassengersDirectoryV3InputWidgetViewHolder$removeListeners$1.INSTANCE);
        PassengersDirectoryV3InputView inputView = getInputView();
        if (inputView != null) {
            inputView.setOnFocusChangeListener(null);
        }
    }

    private final void setUpInput() {
        PassengersDirectoryV3InputView inputView = getInputView();
        if (inputView != null) {
            inputView.addTextWatcher(this.debouncedTextWatcher);
        }
    }

    private final void setUpListeners() {
        C9727b.a(this.container, new PassengersDirectoryV3InputWidgetViewHolder$setUpListeners$1(this));
        PassengersDirectoryV3InputView inputView = getInputView();
        if (inputView != null) {
            inputView.setInputOnFocusChangeListener(this.inputOnFocusChangeListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(PassengersDirectoryV3InputWidgetViewHolder passengersDirectoryV3InputWidgetViewHolder, View view, MotionEvent motionEvent) {
        PassengersDirectoryV3InputView inputView = passengersDirectoryV3InputWidgetViewHolder.getInputView();
        if (inputView == null) {
            return false;
        }
        inputView.hideKeyboardInput();
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
    public void bind(@NotNull PassengersDirectoryV3InputVO item) {
        PassengersDirectoryV3InputView inputView;
        Intrinsics.checkNotNullParameter(item, "item");
        String placeholder = item.getPlaceholder();
        if (placeholder != null && (inputView = getInputView()) != null) {
            inputView.setInputHint(placeholder);
        }
        if (!this.isViewBound) {
            PassengersDirectoryV3InputView inputView2 = getInputView();
            if (inputView2 != null) {
                inputView2.setInputText(this.viewModel.getInputText());
            }
            this.isViewBound = true;
        }
        final PassengersDirectoryV3InputView inputView3 = getInputView();
        if (inputView3 != null) {
            inputView3.setIsClearButtonVisible(this.viewModel.getIsClearButtonVisible());
            if (this.viewModel.getIsSilentRefresh()) {
                int i11 = Y.f42258g;
                if (!inputView3.isLaidOut() || inputView3.isLayoutRequested()) {
                    inputView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.input.PassengersDirectoryV3InputWidgetViewHolder$bind$lambda$5$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            Intrinsics.checkNotNullParameter(view, "view");
                            view.removeOnLayoutChangeListener(this);
                            PassengersDirectoryV3InputView.this.showKeyboardInput();
                        }
                    });
                } else {
                    inputView3.showKeyboardInput();
                }
                this.viewModel.setIsSilentRefresh(false);
            }
        }
        if (this.viewModel.getIsScrollToTop()) {
            C9727b.a(this.container, PassengersDirectoryV3InputWidgetViewHolder$bind$3.INSTANCE);
            this.viewModel.setIsScrollToTop(false);
        }
    }
}
