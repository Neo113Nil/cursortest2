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
@e(c = "ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew$delayPackshotIfNeeded$1", f = "AdvVideoBannerV2ViewModelNew.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AdvVideoBannerV2ViewModelNew$delayPackshotIfNeeded$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ x0<AdvVideoBannerV2ViewModelNew.State> $state;
    final /* synthetic */ AdvBannerVideoV2VO $vo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2ViewModelNew$delayPackshotIfNeeded$1(x0<AdvVideoBannerV2ViewModelNew.State> x0Var, AdvBannerVideoV2VO advBannerVideoV2VO, d<? super AdvVideoBannerV2ViewModelNew$delayPackshotIfNeeded$1> dVar) {
        super(2, dVar);
        this.$state = x0Var;
        this.$vo = advBannerVideoV2VO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdvVideoBannerV2ViewModelNew$delayPackshotIfNeeded$1(this.$state, this.$vo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AdvVideoBannerV2ViewModelNew.State value;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        x0<AdvVideoBannerV2ViewModelNew.State> x0Var = this.$state;
        AdvBannerVideoV2VO advBannerVideoV2VO = this.$vo;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, AdvVideoBannerV2ViewModelNew.State.copy$default(value, null, null, false, false, advBannerVideoV2VO.getPackshotVO() != null ? AdvVideoBannerV2ViewModelNew.ProductState.PACKSHOT_VISIBLE : AdvVideoBannerV2ViewModelNew.ProductState.EMPTY_STATE, 15, null)));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdvVideoBannerV2ViewModelNew$delayPackshotIfNeeded$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
