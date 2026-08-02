package ru.ozon.app.android.cart.ui.cartActionProcessor.actionHandlers;

import A00.e;
import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import Vg.f;
import i10.h;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.flags.SmoothAtomScrollToWidgetFlag;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 B2\u00020\u0001:\u0002BCB\u0091\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012&\u0010\u000e\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\f0\t\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010\u001eJ\u0019\u0010+\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b.\u0010,J\u0017\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00106\u001a\u0004\u0018\u0001052\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000bH\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000bH\u0014¢\u0006\u0004\b:\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u001e\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u001d\u0010A\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lru/ozon/app/android/cart/ui/cartActionProcessor/actionHandlers/CartActionHandler;", "Lru/ozon/app/android/action/BaseActionHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lkotlin/Function0;", "LVg/c;", "handlersStoreProvider", "Lru/ozon/app/android/action/BaseActionHandler$Configs;", "configs", "", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lkotlin/Function1;", "", "handlers", "", "preProcessHandler", "customAnalyticHandler", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "uiClickInhibitor", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "usageAnalyticsTracking", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/action/BaseActionHandler$Configs;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;)V", "Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "action", "handleRefresh", "(Lru/ozon/uni/atoms/af/AtomAction$Refresh;)V", "Lru/ozon/uni/atoms/af/AtomAction$DismissRefresh;", "handleDismissRefresh", "(Lru/ozon/uni/atoms/af/AtomAction$DismissRefresh;)V", "Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidget;", "handleScrollToWidget", "(Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidget;)V", "Lru/ozon/uni/atoms/af/AtomAction$DismissAndScroll;", "handleDismissAndScroll", "(Lru/ozon/uni/atoms/af/AtomAction$DismissAndScroll;)V", "Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidgetByKey;", "handleScrollToWidgetByKey", "(Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidgetByKey;)V", "dismissAndRefresh", "", "widgetName", "scrollToWidget", "(Ljava/lang/String;)V", "link", "dismissAndScroll", "", "widgetKey", "scrollToWidgetByKey", "(I)V", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "scrollPosition", "Li10/h$b;", "getScrollOneTimePostProcessing", "(Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;)Li10/h$b;", "processCustomAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "processDefaultAction", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function0;", "handlersStore$delegate", "LSc/j;", "getHandlersStore", "()LVg/c;", "handlersStore", "Companion", "Builder", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartActionHandler extends BaseActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: handlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handlersStore;
    private final Function0<c> handlersStoreProvider;

    @NotNull
    private final ComposerReferences ref;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.ui.cartActionProcessor.actionHandlers.CartActionHandler$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Map<String, ? extends String>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/ui/cartActionProcessor/actionHandlers/CartActionHandler$Builder;", "Lru/ozon/app/android/action/BaseActionHandler$Builder;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/cart/ui/cartActionProcessor/actionHandlers/CartActionHandler;", "build", "()Lru/ozon/app/android/cart/ui/cartActionProcessor/actionHandlers/CartActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "buildHandler", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "LVg/c;", "handlersStoreProvider", "customActionHandlers", "(Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/cart/ui/cartActionProcessor/actionHandlers/CartActionHandler$Builder;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function0;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder extends BaseActionHandler.Builder<Builder> {
        private Function0<? extends c> handlersStoreProvider;

        @NotNull
        private final ComposerReferences ref;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ComposerReferences ref) {
            super(ref.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(ref.getComposerWidgetComponentStorage()));
            Intrinsics.checkNotNullParameter(ref, "ref");
            this.ref = ref;
        }

        private final CartActionHandler build() {
            return new CartActionHandler(this.ref, this.handlersStoreProvider, getConfigs(), getHandlers(), getPreProcessHandler(), getCustomAnalyticHandler(), getUiClickInhibitor(), getUsageAnalyticsTracking(), null);
        }

        @Override // ru.ozon.app.android.action.BaseActionHandler.Builder
        @NotNull
        public Function1<AtomAction, Unit> buildHandler() {
            return new CartActionHandler$Builder$buildHandler$1(build());
        }

        @NotNull
        public final Builder customActionHandlers(@NotNull Function0<? extends c> handlersStoreProvider) {
            Intrinsics.checkNotNullParameter(handlersStoreProvider, "handlersStoreProvider");
            this.handlersStoreProvider = handlersStoreProvider;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/ui/cartActionProcessor/actionHandlers/CartActionHandler$Companion;", "", "<init>", "()V", "KEY_NEED_DISMISS_AFTER_PERFORM", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartActionHandler(ComposerReferences composerReferences, Function0 function0, BaseActionHandler.Configs configs, Map map, Function1 function1, Function1 function12, HandlersInhibitor handlersInhibitor, ActionUsageAnalyticsTracking actionUsageAnalyticsTracking, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerReferences, function0, configs, map, function1, function12, handlersInhibitor, actionUsageAnalyticsTracking);
    }

    private final void dismissAndRefresh(AtomAction.DismissRefresh action) {
        dismiss();
        ComposerExtKt.sendRefreshToTargetFragment$default(this.ref.getContainer(), action.getLink(), getScrollOneTimePostProcessing(action.getScrollPosition()), null, null, 12, null);
    }

    private final void dismissAndScroll(String link) {
        if (link != null) {
            this.ref.getNavigator().popBackStack();
            ComposerExtKt.scrollTargetFragment(this.ref.getContainer(), link);
        }
    }

    private final c getHandlersStore() {
        return (c) this.handlersStore.getValue();
    }

    private final h.b getScrollOneTimePostProcessing(AtomAction.ScrollPosition scrollPosition) {
        if (!Intrinsics.d(scrollPosition, AtomAction.ScrollPosition.Top.INSTANCE)) {
            return new h.b((e) null, new l.a.b(0L, null, 3));
        }
        e.a aVar = new e.a();
        aVar.g(0);
        return new h.b(aVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDismissAndScroll(AtomAction.DismissAndScroll action) {
        dismissAndScroll(action.getLink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDismissRefresh(AtomAction.DismissRefresh action) {
        dismissAndRefresh(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRefresh(AtomAction.Refresh action) {
        InterfaceC7851b.a.a(this.ref.getController(), action.getLink(), null, null, getScrollOneTimePostProcessing(action.getScrollPosition()), 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleScrollToWidget(AtomAction.ScrollToWidget action) {
        scrollToWidget(action.getWidgetName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleScrollToWidgetByKey(AtomAction.ScrollToWidgetByKey action) {
        scrollToWidgetByKey(action.getWidgetKey());
    }

    private final void scrollToWidget(String widgetName) {
        if (widgetName != null) {
            InterfaceC7851b.a.c(this.ref.getController(), widgetName, null, 6);
        }
    }

    private final void scrollToWidgetByKey(int widgetKey) {
        InterfaceC7851b.a.b(this.ref.getController(), widgetKey, 0, ((NetworkComponentApi) this.ref.getComponent(NetworkComponentApi.class)).getFeatureChecker().isEnabled(SmoothAtomScrollToWidgetFlag.INSTANCE), 10);
    }

    @Override // ru.ozon.app.android.action.BaseActionHandler
    protected boolean processCustomAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        if (id2 == null) {
            return false;
        }
        c handlersStore = getHandlersStore();
        f handler = handlersStore != null ? handlersStore.getHandler(id2) : null;
        if (handler == null) {
            return false;
        }
        performWithThrottling(new CartActionHandler$processCustomAction$1(action, this, handler));
        return true;
    }

    @Override // ru.ozon.app.android.action.BaseActionHandler
    protected boolean processDefaultAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (super.processDefaultAction(action)) {
            return true;
        }
        if (action instanceof AtomAction.Refresh) {
            performWithThrottling(new CartActionHandler$processDefaultAction$1(this, action));
            return true;
        }
        if (action instanceof AtomAction.DismissAndScroll) {
            performWithThrottling(new CartActionHandler$processDefaultAction$2(this, action));
            return true;
        }
        if (action instanceof AtomAction.DismissRefresh) {
            performWithThrottling(new CartActionHandler$processDefaultAction$3(this, action));
            return true;
        }
        if (action instanceof AtomAction.ScrollToWidget) {
            performWithThrottling(new CartActionHandler$processDefaultAction$4(this, action));
            return true;
        }
        if (action instanceof AtomAction.ScrollToWidgetByKey) {
            performWithThrottling(new CartActionHandler$processDefaultAction$5(this, action));
            return true;
        }
        a.f17149a.e("Missing action " + action, new Object[0]);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CartActionHandler(ComposerReferences composerReferences, Function0<? extends c> function0, BaseActionHandler.Configs configs, Map<Class<? extends AtomAction>, ? extends Function1<? super AtomAction, Unit>> map, Function1<? super AtomAction, Boolean> function1, Function1<? super AtomAction, Boolean> function12, HandlersInhibitor handlersInhibitor, ActionUsageAnalyticsTracking actionUsageAnalyticsTracking) {
        super(configs, map, function1, function12, handlersInhibitor, composerReferences.getNavigator(), AnonymousClass1.INSTANCE, actionUsageAnalyticsTracking);
        this.ref = composerReferences;
        this.handlersStoreProvider = function0;
        this.handlersStore = k.b(new CartActionHandler$handlersStore$2(this));
    }
}
