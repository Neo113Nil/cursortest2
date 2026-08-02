package ru.ozon.app.android.marketing.widgets.couponList.core;

import Pc.a;
import WZ.l;
import a00.C4908c;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModel;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponBlockViewHolder;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponListDecoration;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponBlockViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CouponListViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CouponBlockViewHolder> {
    final /* synthetic */ CouponPromoRouter $couponRouter;
    final /* synthetic */ a<CouponViewModelImpl> $pViewModel;
    final /* synthetic */ CouponListViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponListViewMapper$holderProducer$1(CouponPromoRouter couponPromoRouter, CouponListViewMapper couponListViewMapper, a<CouponViewModelImpl> aVar) {
        super(2);
        this.$couponRouter = couponPromoRouter;
        this.this$0 = couponListViewMapper;
        this.$pViewModel = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CouponBlockViewHolder invoke(View view, ComposerReferences references) {
        CouponListDecoration couponListDecoration;
        AdultHandler adultHandler;
        FeatureChecker featureChecker;
        AdultHandler adultHandler2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        CouponPromoRouter couponPromoRouter = this.$couponRouter;
        C4908c g10 = references.getContainer().g();
        InterfaceC7851b controller = references.getController();
        ComponentCallbacksC5392m j11 = references.getContainer().j();
        couponListDecoration = this.this$0.couponListDecoration;
        adultHandler = this.this$0.adultHandler;
        featureChecker = this.this$0.featureChecker;
        AdultDelegate adultDelegate = new AdultDelegate(adultHandler, featureChecker);
        adultHandler2 = this.this$0.adultHandler;
        l tokenizedAnalytics = references.getTokenizedAnalytics();
        B0 b11 = references.getViewModelOwnerProvider().b();
        final a<CouponViewModelImpl> aVar = this.$pViewModel;
        Object a11 = new z0(b11, new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.couponList.core.CouponListViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CouponViewModelImpl couponViewModelImpl = (CouponViewModelImpl) a.this.get();
                Intrinsics.g(couponViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return couponViewModelImpl;
            }
        }).a(CouponViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new CouponBlockViewHolder(view, couponPromoRouter, g10, controller, j11, couponListDecoration, adultDelegate, adultHandler2, tokenizedAnalytics, (CouponViewModel) a11);
    }
}
