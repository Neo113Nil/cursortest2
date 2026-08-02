package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.i;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalUpdateResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1", f = "StickyTotalOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1 extends j implements Function2<StickyTotalUpdateResponse, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StickyTotalOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1(StickyTotalOverlayViewHolder stickyTotalOverlayViewHolder, d<? super StickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1> dVar) {
        super(2, dVar);
        this.this$0 = stickyTotalOverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1 stickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1 = new StickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1(this.this$0, dVar);
        stickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1.L$0 = obj;
        return stickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        l20.d c11;
        StickyTotalMapper stickyTotalMapper;
        i iVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        StickyTotalUpdateResponse stickyTotalUpdateResponse = (StickyTotalUpdateResponse) this.L$0;
        Map<String, String> trackingPayloads = stickyTotalUpdateResponse.getTrackingPayloads();
        if (trackingPayloads != null) {
            iVar = this.this$0.container;
            iVar.X().e(trackingPayloads);
        }
        l viewItem = this.this$0.getViewItem();
        if (viewItem != null && (c11 = viewItem.c()) != null) {
            StickyTotalOverlayViewHolder stickyTotalOverlayViewHolder = this.this$0;
            stickyTotalMapper = stickyTotalOverlayViewHolder.mapper;
            StickyTotalVO stickyTotalVO = (StickyTotalVO) C7714v.M(stickyTotalMapper.invoke(stickyTotalUpdateResponse.getDto(), c11));
            if (stickyTotalVO != null) {
                stickyTotalOverlayViewHolder.updateStickyTotal(stickyTotalVO);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StickyTotalUpdateResponse stickyTotalUpdateResponse, d<? super Unit> dVar) {
        return ((StickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1) create(stickyTotalUpdateResponse, dVar)).invokeSuspend(Unit.f71690a);
    }
}
