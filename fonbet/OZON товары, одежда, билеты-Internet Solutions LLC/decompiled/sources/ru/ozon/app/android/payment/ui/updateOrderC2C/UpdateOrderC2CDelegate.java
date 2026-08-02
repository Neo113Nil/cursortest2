package ru.ozon.app.android.payment.ui.updateOrderC2C;

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
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.payment.ui.createorder.RootViewContainer;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CEvent;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderDO;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00012B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J/\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b#\u0010$J;\u0010(\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020&\u0018\u00010%2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b(\u0010)J;\u0010*\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020&\u0018\u00010%2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b*\u0010)J!\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CDelegate;", "", "LGZ/g;", "router", "Lkotlin/Function0;", "Lru/ozon/app/android/payment/ui/createorder/RootViewContainer;", "rootViewProvider", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerController", "<init>", "(LGZ/g;Lkotlin/jvm/functions/Function0;Ll10/b;)V", "", "redirectLink", "", "redirect", "(Ljava/lang/String;)V", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO$UpdateOrderError;", "error", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "widgetId", "showError", "(Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO$UpdateOrderError;LWZ/l;Ljava/lang/Long;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "showDefaultError", "(Ljava/lang/String;Ljava/lang/String;)V", "", "isShow", "setLoaderState", "(Z)V", "Lru/ozon/uni/android/flashbar/model/Action;", "makeFlashBarAction", "(Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO$UpdateOrderError;LWZ/l;Ljava/lang/Long;)Lru/ozon/uni/android/flashbar/model/Action;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "sendClickEvent", "(LWZ/l;Ljava/util/Map;Ljava/lang/Long;)V", "sendViewEvent", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;", "event", "processEvent", "(Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;LWZ/l;)V", "LGZ/g;", "Lkotlin/jvm/functions/Function0;", "Ll10/b;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateOrderC2CDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final Function0<RootViewContainer> rootViewProvider;

    @NotNull
    private final g router;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CDelegate$Companion;", "", "<init>", "()V", "EMPTY_TITLE", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            int[] iArr = new int[UpdateOrderDO.UpdateOrderError.ErrorAction.TYPE.values().length];
            try {
                iArr[UpdateOrderDO.UpdateOrderError.ErrorAction.TYPE.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateOrderDO.UpdateOrderError.ErrorAction.TYPE.REDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UpdateOrderC2CDelegate(@NotNull g router, @NotNull Function0<RootViewContainer> rootViewProvider, @NotNull InterfaceC7851b composerController) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(rootViewProvider, "rootViewProvider");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        this.router = router;
        this.rootViewProvider = rootViewProvider;
        this.composerController = composerController;
    }

    private final Action makeFlashBarAction(UpdateOrderDO.UpdateOrderError error, l tokenizedAnalytics, Long widgetId) {
        UpdateOrderDO.UpdateOrderError.ErrorAction action = error.getAction();
        UpdateOrderDO.UpdateOrderError.ErrorAction.TYPE type = action != null ? action.getType() : null;
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            String title = error.getAction().getTitle();
            return new Action(title == null ? "" : title, false, new UpdateOrderC2CDelegate$makeFlashBarAction$1(this, error, tokenizedAnalytics, widgetId), 2, null);
        }
        if (i11 != 2) {
            return null;
        }
        String title2 = error.getAction().getTitle();
        return new Action(title2 == null ? "" : title2, false, new UpdateOrderC2CDelegate$makeFlashBarAction$2(error, this, tokenizedAnalytics, widgetId), 2, null);
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

    private final void showError(UpdateOrderDO.UpdateOrderError error, l tokenizedAnalytics, Long widgetId) {
        RootViewContainer invoke = this.rootViewProvider.invoke();
        if (invoke != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, invoke.getRootView(), null, OzonSpannableStringKt.toOzonSpannableString(error.getMessage()), null, null, null, error.getImage(), error.getImageTintColor(), null, makeFlashBarAction(error, tokenizedAnalytics, widgetId), null, null, null, error.getDuration(), null, null, invoke.getLifecycleOwner(), 56634, null).show();
            sendViewEvent(tokenizedAnalytics, error.getTrackingInfo(), widgetId);
        }
    }

    public final void processEvent(@NotNull UpdateOrderC2CEvent event, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        if (event instanceof UpdateOrderC2CEvent.Redirect) {
            redirect(((UpdateOrderC2CEvent.Redirect) event).getRedirectLink());
            return;
        }
        if (event instanceof UpdateOrderC2CEvent.Error) {
            UpdateOrderC2CEvent.Error error = (UpdateOrderC2CEvent.Error) event;
            showError(error.getError(), tokenizedAnalytics, error.getWidgetId());
        } else if (event instanceof UpdateOrderC2CEvent.CriticalError) {
            showDefaultError(StringProvider.getString(R$string.error_payment_message_unknown_error_title), StringProvider.getString(R$string.error_payment_message_unknown_error_description));
        } else if (event instanceof UpdateOrderC2CEvent.HideLoader) {
            setLoaderState(false);
        } else {
            if (!(event instanceof UpdateOrderC2CEvent.ShowLoader)) {
                throw new o();
            }
            setLoaderState(true);
        }
    }
}
