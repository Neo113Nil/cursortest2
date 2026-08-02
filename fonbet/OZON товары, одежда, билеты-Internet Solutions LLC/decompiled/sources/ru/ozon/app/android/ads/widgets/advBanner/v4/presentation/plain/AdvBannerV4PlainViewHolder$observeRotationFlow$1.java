package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.AdvBannerV4PlainItemAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewHolder$observeRotationFlow$1", f = "AdvBannerV4PlainViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AdvBannerV4PlainViewHolder$observeRotationFlow$1 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AdvBannerV4PlainViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvBannerV4PlainViewHolder$observeRotationFlow$1(AdvBannerV4PlainViewHolder advBannerV4PlainViewHolder, d<? super AdvBannerV4PlainViewHolder$observeRotationFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = advBannerV4PlainViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdvBannerV4PlainViewHolder$observeRotationFlow$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        int actualCurrentPosition;
        AdvBannerV4PlainItemAdapter advBannerV4PlainItemAdapter;
        AdvBannerV4PlainViewHolder$smoothScroller$1 advBannerV4PlainViewHolder$smoothScroller$1;
        AdvBannerV4PlainView advBannerV4PlainView;
        AdvBannerV4PlainViewHolder$smoothScroller$1 advBannerV4PlainViewHolder$smoothScroller$12;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        z11 = this.this$0.isMostViewHolderVisible;
        if (z11) {
            actualCurrentPosition = this.this$0.getActualCurrentPosition();
            advBannerV4PlainItemAdapter = this.this$0.adapter;
            int i11 = (advBannerV4PlainItemAdapter.getCorrectItemsCount() <= 2 && actualCurrentPosition != 0) ? actualCurrentPosition - 1 : actualCurrentPosition + 1;
            advBannerV4PlainViewHolder$smoothScroller$1 = this.this$0.smoothScroller;
            advBannerV4PlainViewHolder$smoothScroller$1.setTargetPosition(i11);
            advBannerV4PlainView = this.this$0.bannerView;
            RecyclerView.o layoutManager = advBannerV4PlainView.getItemsRv().getLayoutManager();
            if (layoutManager != null) {
                advBannerV4PlainViewHolder$smoothScroller$12 = this.this$0.smoothScroller;
                layoutManager.startSmoothScroll(advBannerV4PlainViewHolder$smoothScroller$12);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((AdvBannerV4PlainViewHolder$observeRotationFlow$1) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
