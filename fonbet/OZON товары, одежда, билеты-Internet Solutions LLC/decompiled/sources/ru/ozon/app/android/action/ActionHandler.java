package ru.ozon.app.android.action;

import A00.a;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import Vg.f;
import WZ.t;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import d20.AbstractC6065b;
import i10.h;
import i10.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.e;
import l10.i;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.ActionSheetFragment;
import ru.ozon.app.android.action.sheet.ActionSheetRequestIdMissing;
import ru.ozon.app.android.action.sheet.AnalyticsInfo;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandlerForListWidgets;
import ru.ozon.app.android.action.sheet.DisposableActionHandlerImpl;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.flags.SmoothAtomScrollToWidgetFlag;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000 n2\u00020\u0001:\u0002noB÷\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t0\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012&\u0010\u001a\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00190\u00180\u0005\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0017H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0017H\u0014¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0017H\u0014¢\u0006\u0004\b(\u0010)J+\u0010-\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00062\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020+0\u0005H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00192\u0006\u0010$\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00192\u0006\u0010$\u001a\u000202H\u0014¢\u0006\u0004\b3\u00104J\u0011\u00105\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0019H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00192\u0006\u0010$\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00192\u0006\u0010$\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00192\u0006\u0010$\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00192\u0006\u0010$\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00192\u0006\u0010$\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00192\u0006\u0010$\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00192\u0006\u0010$\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010Q\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u00062\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0019\u0010S\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00192\u0006\u0010$\u001a\u00020?H\u0002¢\u0006\u0004\bU\u0010AJ\u001b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010W\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020\u00192\b\u0010[\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\\\u0010TJ\u0017\u0010_\u001a\u00020\u00192\u0006\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\b_\u0010`R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010aR(\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010bR\"\u0010\n\u001a\u0010\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010bR\u001e\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010cR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010dR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010eR\u001d\u0010j\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0016\u0010m\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006p"}, d2 = {"Lru/ozon/app/android/action/ActionHandler;", "Lru/ozon/app/android/action/BaseActionHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lkotlin/Function0;", "", "", "nestedPageProvider", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingDataProvider", "Lru/ozon/composer/ui/widget/l;", "widgetViewItemProvider", "LVg/c;", "handlersStoreProvider", "", "requestId", "Landroid/view/View;", "transitionView", "currentPageUrl", "Lru/ozon/app/android/action/BaseActionHandler$Configs;", "configs", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lkotlin/Function1;", "", "handlers", "", "preProcessHandler", "customAnalyticHandler", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "uiClickInhibitor", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "usageAnalyticsTracking", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Long;Landroid/view/View;Ljava/lang/String;Lru/ozon/app/android/action/BaseActionHandler$Configs;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;)V", "action", "processCustomAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "processDefaultAction", "handleDefaultAnalytics", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "link", "", "parameters", "openDeeplink", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/uni/atoms/af/AtomAction$Dismiss;", "handleDismiss", "(Lru/ozon/uni/atoms/af/AtomAction$Dismiss;)V", "Lru/ozon/uni/atoms/af/AtomAction$DismissRedirect;", "handleDismissRedirect", "(Lru/ozon/uni/atoms/af/AtomAction$DismissRedirect;)V", "getWidgetViewItem", "()Lru/ozon/composer/ui/widget/l;", "closeModal", "()V", "Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "handleRefresh", "(Lru/ozon/uni/atoms/af/AtomAction$Refresh;)V", "Lru/ozon/uni/atoms/af/AtomAction$DismissAndScroll;", "handleDismissAndScroll", "(Lru/ozon/uni/atoms/af/AtomAction$DismissAndScroll;)V", "Lru/ozon/uni/atoms/af/AtomAction$DismissRefresh;", "handleDismissRefresh", "(Lru/ozon/uni/atoms/af/AtomAction$DismissRefresh;)V", "Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidget;", "handleScrollToWidget", "(Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidget;)V", "Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidgetByKey;", "handleScrollToWidgetByKey", "(Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidgetByKey;)V", "Lru/ozon/uni/atoms/af/AtomAction$AppendPayloads;", "appendPayloads", "(Lru/ozon/uni/atoms/af/AtomAction$AppendPayloads;)V", "Lru/ozon/uni/atoms/af/AtomAction$ActionSheet;", "handleActionSheet", "(Lru/ozon/uni/atoms/af/AtomAction$ActionSheet;)V", "actionPath", "Lru/ozon/app/android/action/sheet/AnalyticsInfo;", "analyticsInfo", "openActionSheet", "(Ljava/lang/String;Lru/ozon/app/android/action/sheet/AnalyticsInfo;)V", "dismissAndScroll", "(Ljava/lang/String;)V", "dismissAndRefresh", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "scrollPosition", "Li10/h$b;", "getScrollOneTimePostProcessing", "(Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;)Li10/h$b;", "widgetName", "scrollToWidget", "", "widgetKey", "scrollToWidgetByKey", "(I)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Long;", "Landroid/view/View;", "Ljava/lang/String;", "handlersStore$delegate", "LSc/j;", "getHandlersStore", "()LVg/c;", "handlersStore", "getVoId", "()Ljava/lang/Long;", "voId", "Companion", "Builder", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionHandler extends BaseActionHandler {
    private final String currentPageUrl;

    /* renamed from: handlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handlersStore;
    private final Function0<c> handlersStoreProvider;

    @NotNull
    private final Function0<Map<String, String>> nestedPageProvider;

    @NotNull
    private final ComposerReferences ref;
    private final Long requestId;

    @NotNull
    private final Function0<W10.c> trackingDataProvider;
    private final View transitionView;

    @NotNull
    private final Function0<l> widgetViewItemProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/action/ActionHandler$Companion;", "", "<init>", "()V", "ACTION_HANDLER_VIEW_NAME", "", "KEY_NEED_DISMISS_AFTER_PERFORM", "DISMISS_TYPE", "DISMISS_TYPE_TOP", "DISMISS_TYPE_MODAL", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActionHandler(ComposerReferences composerReferences, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Long l11, View view, String str, BaseActionHandler.Configs configs, Map map, Function1 function1, Function1 function12, HandlersInhibitor handlersInhibitor, ActionUsageAnalyticsTracking actionUsageAnalyticsTracking, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerReferences, function0, function02, function03, function04, l11, view, str, configs, map, function1, function12, handlersInhibitor, actionUsageAnalyticsTracking);
    }

    private final void appendPayloads(AtomAction.AppendPayloads action) {
        this.ref.getTokenizedAnalytics().e(action.getPayloads());
    }

    private final void closeModal() {
        for (ComponentCallbacksC5392m c11 = this.ref.getContainer().c(); c11 != null; c11 = c11.getParentFragment()) {
            if (c11 instanceof C9011c) {
                ((C9011c) c11).close();
                return;
            } else {
                if (c11 instanceof DialogInterfaceOnCancelListenerC5390k) {
                    ((DialogInterfaceOnCancelListenerC5390k) c11).dismiss();
                    return;
                }
            }
        }
        ComposerExtKt.closeNonHostActivity(this.ref.getContainer());
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
        return Intrinsics.d(scrollPosition, AtomAction.ScrollPosition.Top.INSTANCE) ? new h.b(new a.C.C0000a(), null, 2) : new h.b((a.C) null, new l.a.b(0L, null, 3));
    }

    private final Long getVoId() {
        ru.ozon.composer.ui.widget.l invoke = this.widgetViewItemProvider.invoke();
        if (invoke != null) {
            return Long.valueOf(invoke.f());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleActionSheet(AtomAction.ActionSheet action) {
        W10.c invoke = this.trackingDataProvider.invoke();
        openActionSheet(action.getActionName(), new AnalyticsInfo(getVoId(), invoke != null ? invoke.d() : null, invoke != null ? invoke.b() : null));
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

    private final void openActionSheet(String actionPath, AnalyticsInfo analyticsInfo) {
        Long l11 = this.requestId;
        if (l11 == null) {
            throw ActionSheetRequestIdMissing.INSTANCE;
        }
        long longValue = l11.longValue();
        String b11 = Nk.a.b("Action_Sheet_", actionPath);
        G k11 = this.ref.getContainer().k();
        if (k11.g0(b11) != null) {
            return;
        }
        ActionSheetFragment.INSTANCE.newInstance(this.currentPageUrl, actionPath, longValue, analyticsInfo).show(k11, b11);
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
    protected ru.ozon.composer.ui.widget.l getWidgetViewItem() {
        return this.widgetViewItemProvider.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.action.BaseActionHandler
    protected void handleDefaultAnalytics(@NotNull AtomAction action) {
        t mapToTokenizedEvent$default;
        t mapToTokenizedEvent$default2;
        t mapToTokenizedEvent$default3;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.SendAnalytics) {
            if (action instanceof AtomAction.ViewAction) {
                Map<String, TokenizedTrackingInfo> trackingInfo = ((AtomAction.ViewAction) action).getTrackingInfo();
                if (trackingInfo == null || (mapToTokenizedEvent$default3 = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, getVoId(), null, 2, null)) == null) {
                    return;
                }
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), mapToTokenizedEvent$default3, null, 2, null);
                return;
            }
            if (action instanceof AtomAction.IgnoreViewPoolViewAction) {
                Map<String, TokenizedTrackingInfo> trackingInfo2 = ((AtomAction.IgnoreViewPoolViewAction) action).getTrackingInfo();
                if (trackingInfo2 == null || (mapToTokenizedEvent$default2 = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, getVoId(), null, 2, null)) == null) {
                    return;
                }
                TokenizedAnalyticsExtensionsKt.processIgnoreViewPoolViewEvents$default(this.ref.getTokenizedAnalytics(), mapToTokenizedEvent$default2, null, 2, null);
                return;
            }
            Map<String, TokenizedTrackingInfo> trackingInfo3 = ((AtomAction.SendAnalytics) action).getTrackingInfo();
            if (trackingInfo3 == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo3, getVoId(), null, 2, null)) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.ref.getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
        }
    }

    @Override // ru.ozon.app.android.action.BaseActionHandler
    protected void handleDismiss(@NotNull AtomAction.Dismiss action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, String> params = action.getParams();
        if (params == null) {
            super.handleDismiss(action);
            return;
        }
        String str = params.get("type");
        if (str == null) {
            super.handleDismiss(action);
            return;
        }
        if (str.equals("top")) {
            dismiss();
        } else if (str.equals("modal")) {
            closeModal();
        } else {
            super.handleDismiss(action);
        }
    }

    @Override // ru.ozon.app.android.action.BaseActionHandler
    protected void handleDismissRedirect(@NotNull AtomAction.DismissRedirect action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, String> params = action.getParams();
        if (params == null) {
            super.handleDismissRedirect(action);
            return;
        }
        String str = params.get("type");
        if (str == null) {
            super.handleDismissRedirect(action);
            return;
        }
        if (str.equals("top")) {
            dismiss();
        } else {
            if (!str.equals("modal")) {
                super.handleDismissRedirect(action);
                return;
            }
            closeModal();
        }
        String link = action.getLink();
        if (link != null) {
            Map<String, String> params2 = action.getParams();
            if (params2 == null) {
                params2 = U.c();
            }
            openDeeplink(link, params2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r0 == null) goto L6;
     */
    @Override // ru.ozon.app.android.action.BaseActionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void openDeeplink(@NotNull String link, @NotNull Map<String, ? extends Object> parameters) {
        Map c11;
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        View view = this.transitionView;
        if (view != null) {
            view.setTransitionName("transition:handler" + link);
            c11 = U.i(new Pair("transition_view", view));
        }
        c11 = U.c();
        super.openDeeplink(link, U.m(parameters, c11));
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
        performWithThrottling(new ActionHandler$processCustomAction$1(action, this, handler));
        return true;
    }

    @Override // ru.ozon.app.android.action.BaseActionHandler
    protected boolean processDefaultAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (super.processDefaultAction(action)) {
            return true;
        }
        if (action instanceof AtomAction.Refresh) {
            performWithThrottling(new ActionHandler$processDefaultAction$1(this, action));
            return true;
        }
        if (action instanceof AtomAction.DismissAndScroll) {
            performWithThrottling(new ActionHandler$processDefaultAction$2(this, action));
            return true;
        }
        if (action instanceof AtomAction.DismissRefresh) {
            performWithThrottling(new ActionHandler$processDefaultAction$3(this, action));
            return true;
        }
        if (action instanceof AtomAction.ScrollToWidget) {
            performWithThrottling(new ActionHandler$processDefaultAction$4(this, action));
            return true;
        }
        if (action instanceof AtomAction.ScrollToWidgetByKey) {
            performWithThrottling(new ActionHandler$processDefaultAction$5(this, action));
            return true;
        }
        if (action instanceof AtomAction.ActionSheet) {
            performWithThrottling(new ActionHandler$processDefaultAction$6(this, action));
            return true;
        }
        if (action instanceof AtomAction.AppendPayloads) {
            appendPayloads((AtomAction.AppendPayloads) action);
            return true;
        }
        Lm0.a.f17149a.e("Missing action " + action, new Object[0]);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ActionHandler(ComposerReferences composerReferences, Function0<? extends Map<String, String>> function0, Function0<W10.c> function02, Function0<ru.ozon.composer.ui.widget.l> function03, Function0<? extends c> function04, Long l11, View view, String str, BaseActionHandler.Configs configs, Map<Class<? extends AtomAction>, ? extends Function1<? super AtomAction, Unit>> map, Function1<? super AtomAction, Boolean> function1, Function1<? super AtomAction, Boolean> function12, HandlersInhibitor handlersInhibitor, ActionUsageAnalyticsTracking actionUsageAnalyticsTracking) {
        super(configs, map, function1, function12, handlersInhibitor, composerReferences.getNavigator(), function0, actionUsageAnalyticsTracking);
        this.ref = composerReferences;
        this.nestedPageProvider = function0;
        this.trackingDataProvider = function02;
        this.widgetViewItemProvider = function03;
        this.handlersStoreProvider = function04;
        this.requestId = l11;
        this.transitionView = view;
        this.currentPageUrl = str;
        this.handlersStore = k.b(new ActionHandler$handlersStore$2(this));
    }

    @Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0002\b\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u0007¢\u0006\u0004\b\u0004\u0010\tB%\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\b\u001a\u000e\u0012\u0002\b\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u0007¢\u0006\u0004\b\u0004\u0010\fB\u001d\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u0004\u0010\u000fBS\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u0010\u0012\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00150\u0010\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0010¢\u0006\u0004\b\u0004\u0010\u0019BS\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u0010\u0012\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00150\u0010\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0010¢\u0006\u0004\b\u0004\u0010\u001aB7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u001d\u001a\f\u0012\u0004\u0012\u00020\u00170\u001bj\u0002`\u001c\u0012\u0012\u0010!\u001a\u000e\u0012\n\b\u0001\u0012\u00060\u001fj\u0002` 0\u001e¢\u0006\u0004\b\u0004\u0010\"J\u001b\u0010&\u001a\u00020%2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020\u00002\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u0010¢\u0006\u0004\b2\u00103J'\u0010:\u001a\u0002092\u0006\u00104\u001a\u00020#2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020#2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b<\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R$\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00150\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010>R\u0018\u0010-\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010?R \u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010>R,\u0010A\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0018\u00010\u0006j\b\u0012\u0002\b\u0003\u0018\u0001`\u00070@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lru/ozon/app/android/action/ActionHandler$Builder;", "Lru/ozon/app/android/action/BaseActionHandler$Builder;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "vh", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;)V", "Ll10/i;", "container", "(Ll10/i;Lru/ozon/composer/ui/widget/k;)V", "Ld20/b;", "overlayWidgetViewHolder", "(Ll10/i;Ld20/b;)V", "Lkotlin/Function0;", "", "", "nestedPageProvider", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingDataProvider", "Lru/ozon/composer/ui/widget/l;", "widgetViewItemProvider", "(Ll10/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Ljava/lang/Class;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "voClass", "(Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Ljava/lang/Class;)V", "", "requestId", "Lru/ozon/app/android/action/ActionHandler;", "build", "(Ljava/lang/Long;)Lru/ozon/app/android/action/ActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "buildHandler", "()Lkotlin/jvm/functions/Function1;", "currentPageUrl", "setCurrentPageUrl", "(Ljava/lang/String;)Lru/ozon/app/android/action/ActionHandler$Builder;", "LVg/c;", "handlersStoreProvider", "customActionHandlers", "(Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/action/ActionHandler$Builder;", "id", "Landroidx/lifecycle/v;", "lifecycle", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "buildDisposableHandler", "(JLandroidx/lifecycle/v;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;)Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "buildDisposableHandlerForListWidgets", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "weakVh", "Ljava/lang/ref/WeakReference;", "", "transitionViewIdRes", "Ljava/lang/Integer;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder extends BaseActionHandler.Builder<Builder> {
        private String currentPageUrl;
        private Function0<? extends c> handlersStoreProvider;

        @NotNull
        private final ComposerReferences ref;
        private Function0<W10.c> trackingDataProvider;
        private Integer transitionViewIdRes;

        @NotNull
        private WeakReference<ru.ozon.composer.ui.widget.k<?>> weakVh;
        private Function0<ru.ozon.composer.ui.widget.l> widgetViewItemProvider;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.action.ActionHandler$Builder$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function0<Map<String, ? extends String>> {
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends String> invoke() {
                ru.ozon.composer.ui.widget.k kVar = (ru.ozon.composer.ui.widget.k) Builder.this.weakVh.get();
                if (kVar != null) {
                    return kVar.getNestedPages();
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LW10/c;", "invoke", "()LW10/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.action.ActionHandler$Builder$2, reason: invalid class name */
        static final class AnonymousClass2 extends AbstractC7737t implements Function0<W10.c> {
            AnonymousClass2() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final W10.c invoke() {
                ru.ozon.composer.ui.widget.k kVar = (ru.ozon.composer.ui.widget.k) Builder.this.weakVh.get();
                if (kVar != null) {
                    return kVar.getTrackingData();
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/ozon/composer/ui/widget/l;", "invoke", "()Lru/ozon/composer/ui/widget/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.action.ActionHandler$Builder$3, reason: invalid class name */
        static final class AnonymousClass3 extends AbstractC7737t implements Function0<ru.ozon.composer.ui.widget.l> {
            AnonymousClass3() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ru.ozon.composer.ui.widget.l invoke() {
                ru.ozon.composer.ui.widget.k kVar = (ru.ozon.composer.ui.widget.k) Builder.this.weakVh.get();
                if (kVar != null) {
                    return kVar.getViewItem();
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.action.ActionHandler$Builder$4, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass4 extends AbstractC7737t implements Function0<Map<String, ? extends String>> {
            final /* synthetic */ AbstractC6065b<?> $overlayWidgetViewHolder;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AbstractC6065b<?> abstractC6065b) {
                super(0);
                this.$overlayWidgetViewHolder = abstractC6065b;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends String> invoke() {
                return this.$overlayWidgetViewHolder.getNestedPages();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LW10/c;", "invoke", "()LW10/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.action.ActionHandler$Builder$5, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass5 extends AbstractC7737t implements Function0<W10.c> {
            final /* synthetic */ AbstractC6065b<?> $overlayWidgetViewHolder;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(AbstractC6065b<?> abstractC6065b) {
                super(0);
                this.$overlayWidgetViewHolder = abstractC6065b;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final W10.c invoke() {
                return this.$overlayWidgetViewHolder.getTrackingData();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/ozon/composer/ui/widget/l;", "invoke", "()Lru/ozon/composer/ui/widget/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.action.ActionHandler$Builder$6, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass6 extends AbstractC7737t implements Function0<ru.ozon.composer.ui.widget.l> {
            final /* synthetic */ AbstractC6065b<?> $overlayWidgetViewHolder;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(AbstractC6065b<?> abstractC6065b) {
                super(0);
                this.$overlayWidgetViewHolder = abstractC6065b;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ru.ozon.composer.ui.widget.l invoke() {
                return this.$overlayWidgetViewHolder.getViewItem();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.action.ActionHandler$Builder$7, reason: invalid class name */
        static final class AnonymousClass7 extends AbstractC7737t implements Function0<Map<String, ? extends String>> {
            final /* synthetic */ Class<? extends l20.c> $voClass;
            final /* synthetic */ j10.h<ru.ozon.composer.ui.widget.l> $voHelper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(j10.h<ru.ozon.composer.ui.widget.l> hVar, Class<? extends l20.c> cls) {
                super(0);
                this.$voHelper = hVar;
                this.$voClass = cls;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends String> invoke() {
                ru.ozon.composer.ui.widget.l lVar;
                ArrayList a11 = this.$voHelper.a(this.$voClass);
                if (a11 == null || (lVar = (ru.ozon.composer.ui.widget.l) C7714v.M(a11)) == null) {
                    return null;
                }
                return lVar.h();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LW10/c;", "invoke", "()LW10/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.action.ActionHandler$Builder$8, reason: invalid class name */
        static final class AnonymousClass8 extends AbstractC7737t implements Function0<W10.c> {
            final /* synthetic */ Class<? extends l20.c> $voClass;
            final /* synthetic */ j10.h<ru.ozon.composer.ui.widget.l> $voHelper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(j10.h<ru.ozon.composer.ui.widget.l> hVar, Class<? extends l20.c> cls) {
                super(0);
                this.$voHelper = hVar;
                this.$voClass = cls;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final W10.c invoke() {
                ru.ozon.composer.ui.widget.l lVar;
                ArrayList a11 = this.$voHelper.a(this.$voClass);
                if (a11 == null || (lVar = (ru.ozon.composer.ui.widget.l) C7714v.M(a11)) == null) {
                    return null;
                }
                return lVar.n();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/ozon/composer/ui/widget/l;", "invoke", "()Lru/ozon/composer/ui/widget/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.action.ActionHandler$Builder$9, reason: invalid class name */
        static final class AnonymousClass9 extends AbstractC7737t implements Function0<ru.ozon.composer.ui.widget.l> {
            final /* synthetic */ Class<? extends l20.c> $voClass;
            final /* synthetic */ j10.h<ru.ozon.composer.ui.widget.l> $voHelper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(j10.h<ru.ozon.composer.ui.widget.l> hVar, Class<? extends l20.c> cls) {
                super(0);
                this.$voHelper = hVar;
                this.$voClass = cls;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ru.ozon.composer.ui.widget.l invoke() {
                ArrayList a11 = this.$voHelper.a(this.$voClass);
                if (a11 != null) {
                    return (ru.ozon.composer.ui.widget.l) C7714v.M(a11);
                }
                return null;
            }
        }

        private Builder(ComposerReferences composerReferences) {
            super(composerReferences.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(composerReferences.getComposerWidgetComponentStorage()));
            this.ref = composerReferences;
            this.weakVh = new WeakReference<>(null);
        }

        private final ActionHandler build(Long requestId) {
            View view;
            View view2;
            ComposerReferences composerReferences = this.ref;
            BaseActionHandler.Configs configs = getConfigs();
            Function0<Map<String, String>> nestedPageProvider = getNestedPageProvider();
            if (nestedPageProvider == null) {
                nestedPageProvider = ActionHandler$Builder$build$1.INSTANCE;
            }
            Function0<Map<String, String>> function0 = nestedPageProvider;
            Function0<W10.c> function02 = this.trackingDataProvider;
            if (function02 == null) {
                Intrinsics.n("trackingDataProvider");
                throw null;
            }
            Map<Class<? extends AtomAction>, Function1<AtomAction, Unit>> handlers = getHandlers();
            Function1<AtomAction, Boolean> preProcessHandler = getPreProcessHandler();
            Function1<AtomAction, Boolean> customAnalyticHandler = getCustomAnalyticHandler();
            HandlersInhibitor uiClickInhibitor = getUiClickInhibitor();
            Function0<? extends c> function03 = this.handlersStoreProvider;
            ru.ozon.composer.ui.widget.k<?> kVar = this.weakVh.get();
            if (kVar == null || (view2 = kVar.itemView) == null) {
                view = null;
            } else {
                Integer num = this.transitionViewIdRes;
                if (num != null) {
                    view2 = view2.findViewById(num.intValue());
                    Intrinsics.checkNotNullExpressionValue(view2, "findViewById(...)");
                }
                view = view2;
            }
            String str = this.currentPageUrl;
            Function0<ru.ozon.composer.ui.widget.l> function04 = this.widgetViewItemProvider;
            if (function04 != null) {
                return new ActionHandler(composerReferences, function0, function02, function04, function03, requestId, view, str, configs, handlers, preProcessHandler, customAnalyticHandler, uiClickInhibitor, getUsageAnalyticsTracking(), null);
            }
            Intrinsics.n("widgetViewItemProvider");
            throw null;
        }

        static /* synthetic */ ActionHandler build$default(Builder builder, Long l11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = null;
            }
            return builder.build(l11);
        }

        @InterfaceC3999a
        @NotNull
        public final DisposableActionHandler buildDisposableHandler(long id2, @NotNull AbstractC5434v lifecycle, @NotNull ActionSheetEventHandler actionSheetEventHandler) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
            return new DisposableActionHandlerImpl(new ActionHandler$Builder$buildDisposableHandler$handler$1(build(Long.valueOf(id2))), id2, lifecycle, actionSheetEventHandler);
        }

        @InterfaceC3999a
        @NotNull
        public final DisposableActionHandler buildDisposableHandlerForListWidgets(long id2, @NotNull AbstractC5434v lifecycle, @NotNull ActionSheetEventHandler actionSheetEventHandler) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
            return new DisposableActionHandlerForListWidgets(new ActionHandler$Builder$buildDisposableHandlerForListWidgets$handler$1(build(Long.valueOf(id2))), id2, lifecycle, actionSheetEventHandler);
        }

        @Override // ru.ozon.app.android.action.BaseActionHandler.Builder
        @NotNull
        public Function1<AtomAction, Unit> buildHandler() {
            return new ActionHandler$Builder$buildHandler$1(build$default(this, null, 1, null));
        }

        @NotNull
        public final Builder customActionHandlers(@NotNull Function0<? extends c> handlersStoreProvider) {
            Intrinsics.checkNotNullParameter(handlersStoreProvider, "handlersStoreProvider");
            this.handlersStoreProvider = handlersStoreProvider;
            return this;
        }

        @NotNull
        public final Builder setCurrentPageUrl(String currentPageUrl) {
            this.currentPageUrl = currentPageUrl;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ComposerReferences ref, @NotNull ru.ozon.composer.ui.widget.k<?> vh2) {
            this(ref);
            Intrinsics.checkNotNullParameter(ref, "ref");
            Intrinsics.checkNotNullParameter(vh2, "vh");
            this.weakVh = new WeakReference<>(vh2);
            setNestedPageProvider(new AnonymousClass1());
            this.trackingDataProvider = new AnonymousClass2();
            this.widgetViewItemProvider = new AnonymousClass3();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder(@NotNull i container, @NotNull ru.ozon.composer.ui.widget.k<?> vh2) {
            this((ComposerReferences) r2, vh2);
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(vh2, "vh");
            e V11 = container.V();
            Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder(@NotNull i container, @NotNull AbstractC6065b<?> overlayWidgetViewHolder) {
            this((ComposerReferences) r2);
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(overlayWidgetViewHolder, "overlayWidgetViewHolder");
            e V11 = container.V();
            Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
            setNestedPageProvider(new AnonymousClass4(overlayWidgetViewHolder));
            this.trackingDataProvider = new AnonymousClass5(overlayWidgetViewHolder);
            this.widgetViewItemProvider = new AnonymousClass6(overlayWidgetViewHolder);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder(@NotNull i container, @NotNull Function0<? extends Map<String, String>> nestedPageProvider, @NotNull Function0<W10.c> trackingDataProvider, @NotNull Function0<ru.ozon.composer.ui.widget.l> widgetViewItemProvider) {
            this((ComposerReferences) r2);
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(nestedPageProvider, "nestedPageProvider");
            Intrinsics.checkNotNullParameter(trackingDataProvider, "trackingDataProvider");
            Intrinsics.checkNotNullParameter(widgetViewItemProvider, "widgetViewItemProvider");
            e V11 = container.V();
            Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
            setNestedPageProvider(nestedPageProvider);
            this.trackingDataProvider = trackingDataProvider;
            this.widgetViewItemProvider = widgetViewItemProvider;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ComposerReferences ref, @NotNull Function0<? extends Map<String, String>> nestedPageProvider, @NotNull Function0<W10.c> trackingDataProvider, @NotNull Function0<ru.ozon.composer.ui.widget.l> widgetViewItemProvider) {
            this(ref);
            Intrinsics.checkNotNullParameter(ref, "ref");
            Intrinsics.checkNotNullParameter(nestedPageProvider, "nestedPageProvider");
            Intrinsics.checkNotNullParameter(trackingDataProvider, "trackingDataProvider");
            Intrinsics.checkNotNullParameter(widgetViewItemProvider, "widgetViewItemProvider");
            setNestedPageProvider(nestedPageProvider);
            this.trackingDataProvider = trackingDataProvider;
            this.widgetViewItemProvider = widgetViewItemProvider;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ComposerReferences ref, @NotNull j10.h<ru.ozon.composer.ui.widget.l> voHelper, @NotNull Class<? extends l20.c> voClass) {
            this(ref);
            Intrinsics.checkNotNullParameter(ref, "ref");
            Intrinsics.checkNotNullParameter(voHelper, "voHelper");
            Intrinsics.checkNotNullParameter(voClass, "voClass");
            setNestedPageProvider(new AnonymousClass7(voHelper, voClass));
            this.trackingDataProvider = new AnonymousClass8(voHelper, voClass);
            this.widgetViewItemProvider = new AnonymousClass9(voHelper, voClass);
        }
    }
}
