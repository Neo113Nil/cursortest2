package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay;

import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.domain.tiles.dislike.model.DislikeResult;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/domain/tiles/dislike/model/DislikeResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder$subscribe$1", f = "TileOverlayBinder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class TileOverlayBinder$subscribe$1 extends j implements Function2<DislikeResult, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC4008j<TileOverlayView> $overlayView;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TileOverlayBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TileOverlayBinder$subscribe$1(InterfaceC4008j<? extends TileOverlayView> interfaceC4008j, TileOverlayBinder tileOverlayBinder, d<? super TileOverlayBinder$subscribe$1> dVar) {
        super(2, dVar);
        this.$overlayView = interfaceC4008j;
        this.this$0 = tileOverlayBinder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TileOverlayBinder$subscribe$1 tileOverlayBinder$subscribe$1 = new TileOverlayBinder$subscribe$1(this.$overlayView, this.this$0, dVar);
        tileOverlayBinder$subscribe$1.L$0 = obj;
        return tileOverlayBinder$subscribe$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        TileGrid2DTO.OverlayItem overlayItem;
        RoundMode roundMode;
        Integer num;
        boolean z12;
        NotificationDTO notificationDTO;
        TileGrid2DTO.OverlayItem overlayItem2;
        RoundMode roundMode2;
        Integer num2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        DislikeResult dislikeResult = (DislikeResult) this.L$0;
        if (dislikeResult instanceof DislikeResult.Disliked) {
            if (!this.$overlayView.isInitialized()) {
                TileOverlayView value = this.$overlayView.getValue();
                overlayItem2 = this.this$0.overlayItem;
                roundMode2 = this.this$0.roundMode;
                num2 = this.this$0.topOffset;
                value.bind(overlayItem2, roundMode2, num2);
            }
            this.$overlayView.getValue().setVisibleAnimated(true);
            z12 = this.this$0.needProcessNotifications;
            if (z12 && (notificationDTO = ((DislikeResult.Disliked) dislikeResult).getNotificationDTO()) != null) {
                this.this$0.showNotification(notificationDTO);
            }
        } else {
            if (!(dislikeResult instanceof DislikeResult.Failure)) {
                throw new o();
            }
            if (!this.$overlayView.isInitialized()) {
                TileOverlayView value2 = this.$overlayView.getValue();
                overlayItem = this.this$0.overlayItem;
                roundMode = this.this$0.roundMode;
                num = this.this$0.topOffset;
                value2.bind(overlayItem, roundMode, num);
            }
            this.$overlayView.getValue().setVisibleAnimated(false);
            z11 = this.this$0.needProcessNotifications;
            if (z11) {
                TileOverlayBinder tileOverlayBinder = this.this$0;
                NotificationDTO notificationDTO2 = ((DislikeResult.Failure) dislikeResult).getNotificationDTO();
                if (notificationDTO2 == null) {
                    notificationDTO2 = this.this$0.getDefaultErrorNotification();
                }
                tileOverlayBinder.showNotification(notificationDTO2);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DislikeResult dislikeResult, d<? super Unit> dVar) {
        return ((TileOverlayBinder$subscribe$1) create(dislikeResult, dVar)).invokeSuspend(Unit.f71690a);
    }
}
