package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import Ae.x0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew$delayProductPreviewIfNeeded$2", f = "AdvVideoBannerV2ViewModelNew.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AdvVideoBannerV2ViewModelNew$delayProductPreviewIfNeeded$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $id;
    final /* synthetic */ AdvBannerVideoV2VO $item;
    int label;
    final /* synthetic */ AdvVideoBannerV2ViewModelNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2ViewModelNew$delayProductPreviewIfNeeded$2(AdvBannerVideoV2VO advBannerVideoV2VO, AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew, long j11, d<? super AdvVideoBannerV2ViewModelNew$delayProductPreviewIfNeeded$2> dVar) {
        super(2, dVar);
        this.$item = advBannerVideoV2VO;
        this.this$0 = advVideoBannerV2ViewModelNew;
        this.$id = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdvVideoBannerV2ViewModelNew$delayProductPreviewIfNeeded$2(this.$item, this.this$0, this.$id, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long position = 2000 - this.$item.getPosition();
            this.label = 1;
            if (Y.b(position, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        x0 x0Var = (x0) this.this$0.states.get(new Long(this.$id));
        if (x0Var != null) {
            do {
                value = x0Var.getValue();
            } while (!x0Var.b(value, AdvVideoBannerV2ViewModelNew.State.copy$default((AdvVideoBannerV2ViewModelNew.State) value, null, null, false, false, AdvVideoBannerV2ViewModelNew.ProductState.PREVIEW_VISIBLE, 15, null)));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdvVideoBannerV2ViewModelNew$delayProductPreviewIfNeeded$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
