package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.AdvBannerV4PlainItemViewHolder$bind$2", f = "AdvBannerV4PlainItemViewHolder.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AdvBannerV4PlainItemViewHolder$bind$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AdvBannerV4ItemVO $item;
    int label;
    final /* synthetic */ AdvBannerV4PlainItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvBannerV4PlainItemViewHolder$bind$2(AdvBannerV4PlainItemViewHolder advBannerV4PlainItemViewHolder, AdvBannerV4ItemVO advBannerV4ItemVO, d<? super AdvBannerV4PlainItemViewHolder$bind$2> dVar) {
        super(2, dVar);
        this.this$0 = advBannerV4PlainItemViewHolder;
        this.$item = advBannerV4ItemVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdvBannerV4PlainItemViewHolder$bind$2(this.this$0, this.$item, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (ye.j.c(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.loadBannerImage(this.$item);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdvBannerV4PlainItemViewHolder$bind$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
