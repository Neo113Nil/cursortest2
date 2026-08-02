package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleViewHolder;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleViewHolder$scheduleShowAfterOverlay$1", f = "PromoStickyBubbleViewHolder.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PromoStickyBubbleViewHolder$scheduleShowAfterOverlay$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ PromoStickyBubbleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoStickyBubbleViewHolder$scheduleShowAfterOverlay$1(PromoStickyBubbleViewHolder promoStickyBubbleViewHolder, d<? super PromoStickyBubbleViewHolder$scheduleShowAfterOverlay$1> dVar) {
        super(2, dVar);
        this.this$0 = promoStickyBubbleViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PromoStickyBubbleViewHolder$scheduleShowAfterOverlay$1(this.this$0, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PromoStickyBubbleViewHolder.Companion companion;
        boolean isCoveredByOverlay;
        PromoStickyBubbleView rootView;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            companion = PromoStickyBubbleViewHolder.Companion;
            long m794getSHOW_AFTER_OVERLAY_DELAYUwyO8pc = companion.m794getSHOW_AFTER_OVERLAY_DELAYUwyO8pc();
            this.label = 1;
            if (Y.c(m794getSHOW_AFTER_OVERLAY_DELAYUwyO8pc, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        PromoStickyBubbleV0 promoStickyBubbleV0 = (PromoStickyBubbleV0) this.this$0.getBoundData();
        if (promoStickyBubbleV0 == null) {
            return Unit.f71690a;
        }
        isCoveredByOverlay = this.this$0.isCoveredByOverlay();
        if (isCoveredByOverlay || !promoStickyBubbleV0.getIsVisible()) {
            return Unit.f71690a;
        }
        rootView = this.this$0.getRootView();
        if (rootView != null) {
            rootView.showAfterOverlay();
        }
        this.this$0.scheduleTrackViewShow();
        this.this$0.restartAutoHideTimer(promoStickyBubbleV0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PromoStickyBubbleViewHolder$scheduleShowAfterOverlay$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
