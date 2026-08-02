package ru.ozon.app.android.action.sheet;

import RZ.c;
import WZ.l;
import androidx.lifecycle.J;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001/B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\n\u001a\u00060\bj\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetBinder;", "", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel;", "viewModel", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/action/sheet/ActionSheetFragment;", "fragment", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "handler", "", "requestId", "<init>", "(Lru/ozon/app/android/action/sheet/ActionSheetViewModel;Landroidx/lifecycle/J;Lru/ozon/app/android/action/sheet/ActionSheetFragment;LWZ/l;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;J)V", "Lru/ozon/app/android/action/sheet/AnalyticsInfo;", "info", "", "bind", "(Lru/ozon/app/android/action/sheet/AnalyticsInfo;)V", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel;", "getViewModel", "()Lru/ozon/app/android/action/sheet/ActionSheetViewModel;", "Landroidx/lifecycle/J;", "getLifecycleOwner", "()Landroidx/lifecycle/J;", "Lru/ozon/app/android/action/sheet/ActionSheetFragment;", "getFragment", "()Lru/ozon/app/android/action/sheet/ActionSheetFragment;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "getHandler", "()Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "J", "getRequestId", "()J", "Lru/ozon/app/android/action/sheet/ActionSheetView;", "view", "Lru/ozon/app/android/action/sheet/ActionSheetView;", "getView", "()Lru/ozon/app/android/action/sheet/ActionSheetView;", "setView", "(Lru/ozon/app/android/action/sheet/ActionSheetView;)V", "Companion", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionSheetBinder {

    @NotNull
    private final ActionSheetFragment fragment;

    @NotNull
    private final ActionSheetEventHandler handler;

    @NotNull
    private final J lifecycleOwner;
    private final long requestId;

    @NotNull
    private final l tokenizedAnalytics;
    public ActionSheetView view;

    @NotNull
    private final ActionSheetViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final List<d<? extends AtomAction>> UNSUPPORTED_ACTION_TYPES = C7714v.a0(N.b(AtomAction.ViewAction.class));

    @NotNull
    private static final List<d<AtomAction.Dismiss>> UNSUPPORTED_ACTIONS = C7714v.a0(N.b(AtomAction.Dismiss.class));

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetBinder$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/d;", "Lru/ozon/uni/atoms/af/AtomAction;", "UNSUPPORTED_ACTION_TYPES", "Ljava/util/List;", "getUNSUPPORTED_ACTION_TYPES", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction$Dismiss;", "UNSUPPORTED_ACTIONS", "getUNSUPPORTED_ACTIONS", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<d<AtomAction.Dismiss>> getUNSUPPORTED_ACTIONS() {
            return ActionSheetBinder.UNSUPPORTED_ACTIONS;
        }

        @NotNull
        public final List<d<? extends AtomAction>> getUNSUPPORTED_ACTION_TYPES() {
            return ActionSheetBinder.UNSUPPORTED_ACTION_TYPES;
        }

        private Companion() {
        }
    }

    public ActionSheetBinder(@NotNull ActionSheetViewModel viewModel, @NotNull J lifecycleOwner, @NotNull ActionSheetFragment fragment, @NotNull l tokenizedAnalytics, @NotNull ActionSheetEventHandler handler, long j11) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.viewModel = viewModel;
        this.lifecycleOwner = lifecycleOwner;
        this.fragment = fragment;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.handler = handler;
        this.requestId = j11;
    }

    public final void bind(@NotNull AnalyticsInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.getScreenState().observe(this.lifecycleOwner, new ActionSheetBinder$sam$androidx_lifecycle_Observer$0(new ActionSheetBinder$bind$1(this)));
        this.viewModel.getAnalyticIsLoaded().observe(this.lifecycleOwner, new ActionSheetBinder$sam$androidx_lifecycle_Observer$0(new ActionSheetBinder$bind$2(this)));
        Long widgetId = info.getWidgetId();
        String widgetToken = info.getWidgetToken();
        if (widgetId != null && widgetToken != null) {
            if (info.getPageAnalyticsInfo() != null) {
                this.tokenizedAnalytics.c(U.i(new Pair(widgetId, info.getPageAnalyticsInfo())));
            }
            this.tokenizedAnalytics.b(U.i(new Pair(widgetId, new c(info.getWidgetToken()))));
        }
        getView().setActionHandler(new ActionSheetBinder$bind$3(this));
        getView().setOnRefreshClick(new ActionSheetBinder$bind$4(this));
    }

    @NotNull
    public final ActionSheetFragment getFragment() {
        return this.fragment;
    }

    @NotNull
    public final ActionSheetEventHandler getHandler() {
        return this.handler;
    }

    public final long getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @NotNull
    public final ActionSheetView getView() {
        ActionSheetView actionSheetView = this.view;
        if (actionSheetView != null) {
            return actionSheetView;
        }
        Intrinsics.n("view");
        throw null;
    }

    @NotNull
    public final ActionSheetViewModel getViewModel() {
        return this.viewModel;
    }

    public final void setView(@NotNull ActionSheetView actionSheetView) {
        Intrinsics.checkNotNullParameter(actionSheetView, "<set-?>");
        this.view = actionSheetView;
    }
}
