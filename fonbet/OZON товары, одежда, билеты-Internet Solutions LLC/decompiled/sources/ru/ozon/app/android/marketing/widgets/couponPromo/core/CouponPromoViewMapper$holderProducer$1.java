package ru.ozon.app.android.marketing.widgets.couponPromo.core;

import Pc.a;
import android.view.View;
import androidx.fragment.app.r;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModel;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoViewHolder;", "view", "Landroid/view/View;", "reference", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CouponPromoViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CouponPromoViewHolder> {
    final /* synthetic */ a<CouponViewModelImpl> $pViewModel;
    final /* synthetic */ CouponPromoRouter $router;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponPromoViewMapper$holderProducer$1(CouponPromoRouter couponPromoRouter, a<CouponViewModelImpl> aVar) {
        super(2);
        this.$router = couponPromoRouter;
        this.$pViewModel = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CouponPromoViewHolder invoke(View view, ComposerReferences reference) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(reference, "reference");
        CouponPromoRouter couponPromoRouter = this.$router;
        r i11 = reference.getContainer().i();
        B0 b11 = reference.getViewModelOwnerProvider().b();
        final a<CouponViewModelImpl> aVar = this.$pViewModel;
        Object a11 = new z0(b11, new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.couponPromo.core.CouponPromoViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CouponViewModelImpl couponViewModelImpl = (CouponViewModelImpl) a.this.get();
                Intrinsics.g(couponViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return couponViewModelImpl;
            }
        }).a(CouponViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new CouponPromoViewHolder(view, couponPromoRouter, reference, i11, (CouponViewModel) a11, reference.getContainer().g());
    }
}
