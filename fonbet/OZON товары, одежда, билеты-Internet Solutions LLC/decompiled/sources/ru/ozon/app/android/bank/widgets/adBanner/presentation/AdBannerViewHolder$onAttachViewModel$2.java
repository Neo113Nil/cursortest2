package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerViewHolder$onAttachViewModel$2", f = "AdBannerViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AdBannerViewHolder$onAttachViewModel$2 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AdBannerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdBannerViewHolder$onAttachViewModel$2(AdBannerViewHolder adBannerViewHolder, d<? super AdBannerViewHolder$onAttachViewModel$2> dVar) {
        super(2, dVar);
        this.this$0 = adBannerViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdBannerViewHolder$onAttachViewModel$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        AdBannerViewHolder$smoothScroller$1 adBannerViewHolder$smoothScroller$1;
        int actualCurrentPosition;
        AdBannerView adBannerView;
        AdBannerViewHolder$smoothScroller$1 adBannerViewHolder$smoothScroller$12;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        z11 = this.this$0.isMostViewHolderVisible;
        if (z11) {
            adBannerViewHolder$smoothScroller$1 = this.this$0.smoothScroller;
            actualCurrentPosition = this.this$0.getActualCurrentPosition();
            adBannerViewHolder$smoothScroller$1.setTargetPosition(actualCurrentPosition + 1);
            adBannerView = this.this$0.bannerView;
            RecyclerView.o layoutManager = adBannerView.getAdBannerRv().getLayoutManager();
            if (layoutManager != null) {
                adBannerViewHolder$smoothScroller$12 = this.this$0.smoothScroller;
                layoutManager.startSmoothScroll(adBannerViewHolder$smoothScroller$12);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((AdBannerViewHolder$onAttachViewModel$2) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
