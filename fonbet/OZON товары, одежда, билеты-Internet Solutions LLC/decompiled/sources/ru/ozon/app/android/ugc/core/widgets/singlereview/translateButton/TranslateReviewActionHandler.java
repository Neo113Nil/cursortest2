package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton;

import Ae.C2399j;
import Ae.C2408n0;
import Pc.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.R$string;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateButtonVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateReviewActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel;", "pTranslateViewModel", "Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "actionAnalyticDelegate", "<init>", "(LPc/a;Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;)V", "translateViewModel", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateButtonVO;", "vo", "Lxe/B0;", "observeTranslation", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateButtonVO;)Lxe/B0;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "", "handleError", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateButtonVO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "showNotification", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getDefaultNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "releaseStateListenerJob", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LPc/a;", "Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "stateListenerJob", "Lxe/B0;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TranslateReviewActionHandler extends CustomActionHandler {

    @NotNull
    private final ActionAnalyticDelegate actionAnalyticDelegate;

    @NotNull
    private final String actionId;

    @NotNull
    private final a<TranslateViewModel> pTranslateViewModel;
    private B0 stateListenerJob;
    public static final int $stable = 8;

    public TranslateReviewActionHandler(@NotNull a<TranslateViewModel> pTranslateViewModel, @NotNull ActionAnalyticDelegate actionAnalyticDelegate) {
        Intrinsics.checkNotNullParameter(pTranslateViewModel, "pTranslateViewModel");
        Intrinsics.checkNotNullParameter(actionAnalyticDelegate, "actionAnalyticDelegate");
        this.pTranslateViewModel = pTranslateViewModel;
        this.actionAnalyticDelegate = actionAnalyticDelegate;
        this.actionId = "translateReview";
    }

    private final NotificationDTO getDefaultNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.reviews_failed_to_translate_notification_title), StringProvider.getString(ru.ozon.app.android.common.actionHandlers.R$string.common_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(CustomActionHandler.HandlerReferences handlerRefs, TranslateButtonVO vo, NotificationDTO notification) {
        handlerRefs.getRefs().getController().update(new TranslateShowLoadingUpdateKey(vo.getId(), false));
        releaseStateListenerJob();
        showNotification(handlerRefs, notification);
        this.actionAnalyticDelegate.sendAnalytics(vo.getErrorTrackingInfo(), null, handlerRefs.getTrackingData());
    }

    private final B0 observeTranslation(TranslateViewModel translateViewModel, CustomActionHandler.HandlerReferences handlerRefs, TranslateButtonVO vo) {
        return C2399j.C(new C2408n0(translateViewModel.getTranslateStates(), new TranslateReviewActionHandler$observeTranslation$1(vo, this, handlerRefs, null)), K.a(handlerRefs.getRefs().getContainer().g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseStateListenerJob() {
        B0 b02;
        B0 b03 = this.stateListenerJob;
        if (b03 != null && b03.isActive() && (b02 = this.stateListenerJob) != null) {
            b02.j(null);
        }
        this.stateListenerJob = null;
    }

    private final void showNotification(CustomActionHandler.HandlerReferences handlerRefs, NotificationDTO notification) {
        ComponentCallbacksC5392m b11 = Sh.a.b(handlerRefs);
        View view = b11 != null ? b11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        if (notification == null) {
            notification = getDefaultNotificationDTO();
        }
        NotificationDTO notificationDTO = notification;
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notificationDTO));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager, notificationDTO, handlerRefs.getRefs().getContainer().g(), null, 8, null).show();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.Click click;
        String link;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.Click) || (link = (click = (AtomAction.Click) action).getLink()) == null || (params = click.getParams()) == null) {
            return;
        }
        TranslateViewModel translateViewModel = (TranslateViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.TranslateReviewActionHandler$processAction$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = TranslateReviewActionHandler.this.pTranslateViewModel;
                TranslateViewModel translateViewModel2 = (TranslateViewModel) aVar.get();
                Intrinsics.g(translateViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return translateViewModel2;
            }
        }).a(TranslateViewModel.class);
        l viewItem = handlerRefs.getViewItem();
        c d11 = viewItem != null ? viewItem.d() : null;
        TranslateButtonVO translateButtonVO = d11 instanceof TranslateButtonVO ? (TranslateButtonVO) d11 : null;
        if (translateButtonVO != null) {
            Intrinsics.f(translateViewModel);
            this.stateListenerJob = observeTranslation(translateViewModel, handlerRefs, translateButtonVO);
            translateViewModel.translate(link, params, translateButtonVO.getId());
        }
    }
}
