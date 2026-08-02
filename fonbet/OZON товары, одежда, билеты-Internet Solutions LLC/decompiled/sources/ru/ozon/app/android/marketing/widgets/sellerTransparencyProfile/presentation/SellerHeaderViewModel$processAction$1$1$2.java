package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation;

import Ae.w0;
import Ae.x0;
import Sc.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.data.SisLikeResponse;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.ShowMessageEvent;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SubscribeEvent;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SisLikeResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerHeaderViewModel$processAction$1$1$2 extends AbstractC7737t implements Function1<ActionV2Response<SisLikeResponse>, Unit> {
    final /* synthetic */ String $actionId;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ boolean $shouldShowMessage;
    final /* synthetic */ SellerHeaderViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel$processAction$1$1$2$1", f = "SellerHeaderViewModel.kt", l = {69, 72}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel$processAction$1$1$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ String $actionId;
        final /* synthetic */ String $currentSellerId;
        final /* synthetic */ NotificationModelWrapper $notification;
        final /* synthetic */ boolean $shouldShowMessage;
        int label;
        final /* synthetic */ SellerHeaderViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SellerHeaderViewModel sellerHeaderViewModel, String str, String str2, boolean z11, NotificationModelWrapper notificationModelWrapper, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = sellerHeaderViewModel;
            this.$actionId = str;
            this.$currentSellerId = str2;
            this.$shouldShowMessage = z11;
            this.$notification = notificationModelWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$actionId, this.$currentSellerId, this.$shouldShowMessage, this.$notification, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        
            if (r1.emit(r3, r6) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
        
            if (r7.emit(r1, r6) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NotificationModelWrapper notificationModelWrapper;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                x0<SubscribeEvent> subscribeStateFlow = this.this$0.getSubscribeStateFlow();
                SubscribeEvent.SuccessfulEvent successfulEvent = new SubscribeEvent.SuccessfulEvent(this.$actionId, this.$currentSellerId);
                this.label = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            if (Intrinsics.d(this.$actionId, "sisLike") && this.$shouldShowMessage && (notificationModelWrapper = this.$notification) != null) {
                w0<ShowMessageEvent> showMessageEventFlow = this.this$0.getShowMessageEventFlow();
                ShowMessageEvent.SuccessfulEvent successfulEvent2 = new ShowMessageEvent.SuccessfulEvent(notificationModelWrapper);
                this.label = 2;
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerHeaderViewModel$processAction$1$1$2(Map<String, String> map, SellerHeaderViewModel sellerHeaderViewModel, String str, boolean z11) {
        super(1);
        this.$params = map;
        this.this$0 = sellerHeaderViewModel;
        this.$actionId = str;
        this.$shouldShowMessage = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<SisLikeResponse> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionV2Response<SisLikeResponse> actionV2Response) {
        Long y02;
        SellerFavoriteService sellerFavoriteService;
        SellerFavoriteService sellerFavoriteService2;
        SisLikeResponse data = actionV2Response.getData();
        NotificationModelWrapper notification = data != null ? data.getNotification() : null;
        Map<String, String> map = this.$params;
        String str = map != null ? map.get("sellerId") : null;
        C10727i.c(androidx.lifecycle.x0.a(this.this$0), null, null, new AnonymousClass1(this.this$0, this.$actionId, str, this.$shouldShowMessage, notification, null), 3);
        if (str == null || (y02 = h.y0(str)) == null) {
            return;
        }
        String str2 = this.$actionId;
        SellerHeaderViewModel sellerHeaderViewModel = this.this$0;
        long longValue = y02.longValue();
        if (Intrinsics.d(str2, "sisLike")) {
            sellerFavoriteService2 = sellerHeaderViewModel.sellerFavoriteService;
            sellerFavoriteService2.addSellerFavoriteLocal(longValue);
        } else {
            sellerFavoriteService = sellerHeaderViewModel.sellerFavoriteService;
            sellerFavoriteService.removeSellerFavoriteLocal(longValue);
        }
    }
}
