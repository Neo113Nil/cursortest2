package ru.ozon.app.android.payment.ui.createservice;

import An.C2439a;
import GZ.g;
import Sc.o;
import WZ.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.payment.ui.createorder.RootViewContainer;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceDO;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceEvent;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 52\u00020\u0001:\u00015B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J/\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b%\u0010&J;\u0010*\u001a\u00020\u00102\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(\u0018\u00010'2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b*\u0010+J;\u0010,\u001a\u00020\u00102\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(\u0018\u00010'2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b,\u0010+J!\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-2\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/CreateServiceDelegate;", "", "LGZ/g;", "router", "Lkotlin/Function0;", "Lru/ozon/app/android/payment/ui/createorder/RootViewContainer;", "rootViewProvider", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerController", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "<init>", "(LGZ/g;Lkotlin/jvm/functions/Function0;Ll10/b;Lru/ozon/app/android/account/orders/OrderChangePreferences;)V", "", "redirectLink", "", "redirect", "(Ljava/lang/String;)V", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError;", "error", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "widgetId", "showError", "(Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError;LWZ/l;Ljava/lang/Long;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "showDefaultError", "(Ljava/lang/String;Ljava/lang/String;)V", "", "isShow", "setLoaderState", "(Z)V", "Lru/ozon/uni/android/flashbar/model/Action;", "makeFlashBarAction", "(Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError;LWZ/l;Ljava/lang/Long;)Lru/ozon/uni/android/flashbar/model/Action;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "sendClickEvent", "(LWZ/l;Ljava/util/Map;Ljava/lang/Long;)V", "sendViewEvent", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceEvent;", "event", "processEvent", "(Lru/ozon/app/android/payment/ui/createservice/CreateServiceEvent;LWZ/l;)V", "LGZ/g;", "Lkotlin/jvm/functions/Function0;", "Ll10/b;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateServiceDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    @NotNull
    private final Function0<RootViewContainer> rootViewProvider;

    @NotNull
    private final g router;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/CreateServiceDelegate$Companion;", "", "<init>", "()V", "EMPTY_TITLE", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreateServiceDO.CreateServiceError.ErrorAction.TYPE.values().length];
            try {
                iArr[CreateServiceDO.CreateServiceError.ErrorAction.TYPE.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateServiceDO.CreateServiceError.ErrorAction.TYPE.REDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CreateServiceDelegate(@NotNull g router, @NotNull Function0<RootViewContainer> rootViewProvider, @NotNull InterfaceC7851b composerController, @NotNull OrderChangePreferences orderChangePreferences) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(rootViewProvider, "rootViewProvider");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        this.router = router;
        this.rootViewProvider = rootViewProvider;
        this.composerController = composerController;
        this.orderChangePreferences = orderChangePreferences;
    }

    private final Action makeFlashBarAction(CreateServiceDO.CreateServiceError error, l tokenizedAnalytics, Long widgetId) {
        CreateServiceDO.CreateServiceError.ErrorAction action = error.getAction();
        CreateServiceDO.CreateServiceError.ErrorAction.TYPE type = action != null ? action.getType() : null;
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            String title = error.getAction().getTitle();
            return new Action(title == null ? "" : title, false, new CreateServiceDelegate$makeFlashBarAction$1(this, error, tokenizedAnalytics, widgetId), 2, null);
        }
        if (i11 != 2) {
            return null;
        }
        String title2 = error.getAction().getTitle();
        return new Action(title2 == null ? "" : title2, false, new CreateServiceDelegate$makeFlashBarAction$2(error, this, tokenizedAnalytics, widgetId), 2, null);
    }

    private final void redirect(String redirectLink) {
        if (redirectLink == null) {
            return;
        }
        g gVar = this.router;
        GZ.l.a(gVar);
        g.a.a(gVar, redirectLink, null, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendClickEvent(l tokenizedAnalytics, Map<String, TokenizedTrackingInfo> trackingInfo, Long widgetId) {
        if (trackingInfo == null || widgetId == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(tokenizedAnalytics, TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, widgetId, null, 2, null), null, 2, null);
    }

    private final void sendViewEvent(l tokenizedAnalytics, Map<String, TokenizedTrackingInfo> trackingInfo, Long widgetId) {
        if (trackingInfo == null || widgetId == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, widgetId, null, 2, null), null, 2, null);
    }

    private final void setLoaderState(boolean isShow) {
        if (isShow) {
            C2439a.b(0L, null, 3, this.composerController);
        } else {
            this.composerController.hideLoader();
        }
    }

    private final void showDefaultError(String title, String message) {
        RootViewContainer invoke = this.rootViewProvider.invoke();
        if (invoke != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, invoke.getRootView(), OzonSpannableStringKt.toOzonSpannableString(title), OzonSpannableStringKt.toOzonSpannableString(message), null, null, null, invoke.getLifecycleOwner(), 56, null).show();
        }
    }

    private final void showError(CreateServiceDO.CreateServiceError error, l tokenizedAnalytics, Long widgetId) {
        RootViewContainer invoke = this.rootViewProvider.invoke();
        if (invoke != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, invoke.getRootView(), null, OzonSpannableStringKt.toOzonSpannableString(error.getMessage()), null, null, null, error.getImage(), error.getImageTintColor(), null, makeFlashBarAction(error, tokenizedAnalytics, widgetId), null, null, null, error.getDuration(), null, null, invoke.getLifecycleOwner(), 56634, null).show();
            sendViewEvent(tokenizedAnalytics, error.getTrackingInfo(), widgetId);
        }
    }

    public final void processEvent(@NotNull CreateServiceEvent event, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        if (event instanceof CreateServiceEvent.Redirect) {
            this.orderChangePreferences.markAsUpdated();
            redirect(((CreateServiceEvent.Redirect) event).getRedirectLink());
            return;
        }
        if (event instanceof CreateServiceEvent.Error) {
            CreateServiceEvent.Error error = (CreateServiceEvent.Error) event;
            showError(error.getError(), tokenizedAnalytics, error.getWidgetId());
        } else if (event instanceof CreateServiceEvent.CriticalError) {
            showDefaultError(StringProvider.getString(R$string.error_payment_message_unknown_error_title), StringProvider.getString(R$string.error_payment_message_unknown_error_description));
        } else if (event instanceof CreateServiceEvent.HideLoader) {
            setLoaderState(false);
        } else {
            if (!(event instanceof CreateServiceEvent.ShowLoader)) {
                throw new o();
            }
            setLoaderState(true);
        }
    }
}
