package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation;

import Ae.x0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel$clearSubscribeStateFlow$1", f = "SellerHeaderViewModel.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SellerHeaderViewModel$clearSubscribeStateFlow$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ SellerHeaderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerHeaderViewModel$clearSubscribeStateFlow$1(SellerHeaderViewModel sellerHeaderViewModel, d<? super SellerHeaderViewModel$clearSubscribeStateFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = sellerHeaderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SellerHeaderViewModel$clearSubscribeStateFlow$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0<SubscribeEvent> subscribeStateFlow = this.this$0.getSubscribeStateFlow();
            this.label = 1;
            if (subscribeStateFlow.emit(null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SellerHeaderViewModel$clearSubscribeStateFlow$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
