package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view;

import android.os.Handler;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.ProductItemViewHolder$ratingCallback$1;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.ProductItemAnimator;

@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"ru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/ProductItemViewHolder$ratingCallback$1", "Lkotlin/Function1;", "", "", "invoke", "rating", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductItemViewHolder$ratingCallback$1 implements Function1<Integer, Unit> {
    final /* synthetic */ InterfaceC6511n<String, Integer, RateItemsV2VO.RateItemVO.RateProductItemVO, Unit> $ratingClickListener;
    final /* synthetic */ ProductItemViewHolder this$0;

    /* JADX WARN: Multi-variable type inference failed */
    ProductItemViewHolder$ratingCallback$1(ProductItemViewHolder productItemViewHolder, InterfaceC6511n<? super String, ? super Integer, ? super RateItemsV2VO.RateItemVO.RateProductItemVO, Unit> interfaceC6511n) {
        this.this$0 = productItemViewHolder;
        this.$ratingClickListener = interfaceC6511n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(InterfaceC6511n interfaceC6511n, ProductItemViewHolder productItemViewHolder, int i11) {
        String deeplink;
        if (interfaceC6511n != null) {
            deeplink = productItemViewHolder.getDeeplink();
            interfaceC6511n.invoke(deeplink, Integer.valueOf(i11), productItemViewHolder.getItem());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public void invoke(final int rating) {
        boolean isScrollWithAnimation;
        Handler handler;
        ProductItemAnimator productItemAnimator;
        this.this$0.getBinding().rating.setTotalRating(rating);
        isScrollWithAnimation = this.this$0.isScrollWithAnimation();
        if (isScrollWithAnimation) {
            productItemAnimator = this.this$0.itemAnimator;
            productItemAnimator.animateProductItem();
        }
        handler = this.this$0.handler;
        final InterfaceC6511n<String, Integer, RateItemsV2VO.RateItemVO.RateProductItemVO, Unit> interfaceC6511n = this.$ratingClickListener;
        final ProductItemViewHolder productItemViewHolder = this.this$0;
        handler.post(new Runnable() { // from class: mW.a
            @Override // java.lang.Runnable
            public final void run() {
                ProductItemViewHolder$ratingCallback$1.invoke$lambda$0(InterfaceC6511n.this, productItemViewHolder, rating);
            }
        });
    }
}
