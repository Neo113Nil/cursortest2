package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerTransparencyProfileWidgetViewHolder$onAttach$1", f = "SellerTransparencyProfileWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SellerTransparencyProfileWidgetViewHolder$onAttach$1 extends j implements Function2<SubscribeEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SellerTransparencyProfileWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerTransparencyProfileWidgetViewHolder$onAttach$1(SellerTransparencyProfileWidgetViewHolder sellerTransparencyProfileWidgetViewHolder, d<? super SellerTransparencyProfileWidgetViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = sellerTransparencyProfileWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SellerTransparencyProfileWidgetViewHolder$onAttach$1 sellerTransparencyProfileWidgetViewHolder$onAttach$1 = new SellerTransparencyProfileWidgetViewHolder$onAttach$1(this.this$0, dVar);
        sellerTransparencyProfileWidgetViewHolder$onAttach$1.L$0 = obj;
        return sellerTransparencyProfileWidgetViewHolder$onAttach$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        SubscribeEvent subscribeEvent = (SubscribeEvent) this.L$0;
        if (subscribeEvent != null) {
            this.this$0.bindButtons(subscribeEvent);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SubscribeEvent subscribeEvent, d<? super Unit> dVar) {
        return ((SellerTransparencyProfileWidgetViewHolder$onAttach$1) create(subscribeEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
