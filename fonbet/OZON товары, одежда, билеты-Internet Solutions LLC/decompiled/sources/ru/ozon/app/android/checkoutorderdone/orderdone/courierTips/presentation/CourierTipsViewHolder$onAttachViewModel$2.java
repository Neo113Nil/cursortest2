package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation;

import Sc.r;
import WZ.l;
import WZ.t;
import WZ.x;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.SendCourierTipsResponse;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001 \u0003*\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LSc/r;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/SendCourierTipsResponse;", "kotlin.jvm.PlatformType", "result", "", "invoke", "(LSc/r;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CourierTipsViewHolder$onAttachViewModel$2 extends AbstractC7737t implements Function1<r<? extends ActionV2Response<SendCourierTipsResponse>>, Unit> {
    final /* synthetic */ CourierTipsViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewHolder$onAttachViewModel$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        final /* synthetic */ SendCourierTipsResponse $data;
        final /* synthetic */ CourierTipsViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SendCourierTipsResponse sendCourierTipsResponse, CourierTipsViewHolder courierTipsViewHolder) {
            super(1);
            this.$data = sendCourierTipsResponse;
            this.this$0 = courierTipsViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction action) {
            Map<String, TokenizedTrackingInfo> trackingInfo;
            l lVar;
            Intrinsics.checkNotNullParameter(action, "action");
            if ((action instanceof AtomAction.ViewAction) && (trackingInfo = this.$data.getNotification().getTrackingInfo()) != null) {
                CourierTipsVO boundedData = this.this$0.getBoundedData();
                Long valueOf = boundedData != null ? Long.valueOf(boundedData.getId()) : null;
                Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
                t b11 = x.b(trackingInfo, valueOf, null);
                if (b11 != null) {
                    lVar = this.this$0.tokenizedAnalytics;
                    TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, b11, null, 2, null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierTipsViewHolder$onAttachViewModel$2(CourierTipsViewHolder courierTipsViewHolder) {
        super(1);
        this.this$0 = courierTipsViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(r<? extends ActionV2Response<SendCourierTipsResponse>> rVar) {
        invoke2(rVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(r<? extends ActionV2Response<SendCourierTipsResponse>> rVar) {
        ComposerReferences composerReferences;
        SendCourierTipsResponse sendCourierTipsResponse;
        Function1 actionHandler;
        ComposerReferences composerReferences2;
        if (rVar.getF26106a() instanceof r.b) {
            if (rVar.getF26106a() instanceof r.b) {
                this.this$0.enableButton();
                return;
            }
            return;
        }
        composerReferences = this.this$0.refs;
        ViewGroup rootView = ContextExtKt.getRootView(composerReferences.getContainer().c());
        if (rootView == null) {
            return;
        }
        Object f26106a = rVar.getF26106a();
        if (f26106a instanceof r.b) {
            f26106a = null;
        }
        ActionV2Response actionV2Response = (ActionV2Response) f26106a;
        if (actionV2Response == null || (sendCourierTipsResponse = (SendCourierTipsResponse) actionV2Response.getData()) == null) {
            return;
        }
        AtomActionDTO action = sendCourierTipsResponse.getAction();
        actionHandler = this.this$0.getActionHandler();
        actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, null));
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(rootView, NotificationBarKt.isAboveBottomWidgets(sendCourierTipsResponse.getNotification()));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(rootView, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        NotificationAtom.NotificationWithIcon notification = sendCourierTipsResponse.getNotification();
        composerReferences2 = this.this$0.refs;
        companion.make(asNotificationLayoutManager, notification, composerReferences2.getContainer().g(), new AnonymousClass2(sendCourierTipsResponse, this.this$0)).show();
    }
}
