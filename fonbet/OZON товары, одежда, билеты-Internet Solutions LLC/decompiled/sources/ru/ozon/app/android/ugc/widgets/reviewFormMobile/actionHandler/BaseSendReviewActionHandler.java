package ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler;

import UZ.a;
import WZ.g;
import WZ.l;
import WZ.t;
import WZ.x;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import dV.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/actionHandler/BaseSendReviewActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "", "", "", "trackingInfo", "", "sendSubmitEvent", "(Ljava/util/Map;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "", "notificationShown", "Z", "", "voId", "Ljava/lang/Long;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "setTokenizedAnalytics", "(LWZ/l;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "submitOnBackConfig", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "getSubmitOnBackConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "setSubmitOnBackConfig", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseSendReviewActionHandler extends CustomActionHandler {
    private boolean notificationShown;
    private ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfig;
    private l tokenizedAnalytics;
    private Long voId;

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSubmitEvent(Map<String, ? extends Object> trackingInfo) {
        Map<String, TokenizedTrackingInfo> submitActionTrackingInfo;
        t b11;
        l lVar;
        ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO = this.submitOnBackConfig;
        if (submitOnBackConfigVO != null && (submitActionTrackingInfo = submitOnBackConfigVO.getSubmitActionTrackingInfo()) != null && (b11 = x.b(submitActionTrackingInfo, this.voId, null)) != null && (lVar = this.tokenizedAnalytics) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents(lVar, b11, new c(trackingInfo, 1));
        }
        this.tokenizedAnalytics = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g sendSubmitEvent$lambda$3$lambda$2(Map map, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    private final void showNotification(NotificationDTO notification, ComposerReferences refs) {
        ViewGroup rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11 = refs.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        final NotificationBar make$default = NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, a11, null, 8, null);
        make$default.addCallback(new NotificationBar.Callback() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler.BaseSendReviewActionHandler$showNotification$1
            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason reason) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                Intrinsics.checkNotNullParameter(reason, "reason");
                notificationBar.removeCallback(this);
            }

            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onShown(NotificationBar notificationBar) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                BaseSendReviewActionHandler.this.notificationShown = true;
            }
        });
        make$default.show();
        G d11 = refs.getContainer().d();
        if (d11 != null) {
            d11.Y0(new G.m() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler.BaseSendReviewActionHandler$showNotification$2
                @Override // androidx.fragment.app.G.m
                public void onFragmentPaused(G fm, ComponentCallbacksC5392m fragment) {
                    boolean z11;
                    Intrinsics.checkNotNullParameter(fm, "fm");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    z11 = BaseSendReviewActionHandler.this.notificationShown;
                    if (z11) {
                        make$default.dismiss();
                        fm.t1(this);
                    }
                }
            }, false);
        }
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull final CustomActionHandler.HandlerReferences handlerRefs) {
        NotificationDTO submitNotification;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        ReviewFormViewModel reviewFormViewModel = (ReviewFormViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler.BaseSendReviewActionHandler$processAction$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ReviewFormViewModel formViewModel = ((ReviewFormComponent) CustomActionHandler.HandlerReferences.this.getRefs().getComposerWidgetComponentStorage().getComponent(ReviewFormComponent.class)).getFormViewModel();
                Intrinsics.g(formViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return formViewModel;
            }
        }).a(ReviewFormViewModel.class);
        this.voId = handlerRefs.getVoId();
        ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO = this.submitOnBackConfig;
        if (submitOnBackConfigVO != null && (submitNotification = submitOnBackConfigVO.getSubmitNotification()) != null) {
            showNotification(submitNotification, handlerRefs.getRefs());
        }
        reviewFormViewModel.processCreateReviewActionFromBackButton(CoroutineUtilsKt.getSafeScope(), action, new BaseSendReviewActionHandler$processAction$2(this));
    }

    public final void setSubmitOnBackConfig(ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO) {
        this.submitOnBackConfig = submitOnBackConfigVO;
    }

    public final void setTokenizedAnalytics(l lVar) {
        this.tokenizedAnalytics = lVar;
    }
}
