package ru.ozon.app.android.marketing.widgets.couponList.core;

import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.marketing.widgets.couponList.data.CouponListDTO;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponBlockViewHolder;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponListDecoration;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BG\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0010\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00170\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R,\u0010;\u001a\u0014\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020:088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/core/CouponListViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/marketing/widgets/couponList/data/CouponListDTO;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO;", "Lru/ozon/app/android/marketing/widgets/couponList/core/CouponMapper;", "sellerMapper", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "couponRouter", "Landroid/content/Context;", "context", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponListDecoration;", "couponListDecoration", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "LPc/a;", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl;", "pViewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/marketing/widgets/couponList/core/CouponMapper;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;Landroid/content/Context;Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponListDecoration;Lru/ozon/app/android/account/adult/presenter/AdultHandler;LPc/a;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "state", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/marketing/widgets/couponList/data/CouponListDTO;Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO;)Lru/ozon/composer/ui/widget/h;", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponListDecoration;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/marketing/widgets/couponList/core/CouponListMapper;", "mapper", "Lru/ozon/app/android/marketing/widgets/couponList/core/CouponListMapper;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/couponList/core/CouponListMapper;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/CouponBlockViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CouponListViewMapper extends WidgetViewMapper<CouponListDTO, BaseCouponVO> {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final CouponListDecoration couponListDecoration;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Function2<View, ComposerReferences, CouponBlockViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final CouponListMapper mapper;

    public CouponListViewMapper(@NotNull CouponMapper sellerMapper, @NotNull CouponPromoRouter couponRouter, @NotNull Context context, @NotNull CouponListDecoration couponListDecoration, @NotNull AdultHandler adultHandler, @NotNull a<CouponViewModelImpl> pViewModel, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(sellerMapper, "sellerMapper");
        Intrinsics.checkNotNullParameter(couponRouter, "couponRouter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(couponListDecoration, "couponListDecoration");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.couponListDecoration = couponListDecoration;
        this.adultHandler = adultHandler;
        this.featureChecker = featureChecker;
        this.layout = R$layout.widget_single_coupon;
        this.mapper = new CouponListMapper(sellerMapper, context);
        this.holderProducer = new CouponListViewMapper$holderProducer$1(couponRouter, this, pViewModel);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        ComposerViewExtensionKt.composerRecyclerView(composerRootView).setItemAnimator(null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(this.couponListDecoration);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<BaseCouponVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CouponListDTO, d, List<BaseCouponVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public ru.ozon.composer.ui.widget.h getWidgetSpan(@NotNull CouponListDTO state, @NotNull BaseCouponVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.b.f94870b;
    }
}
