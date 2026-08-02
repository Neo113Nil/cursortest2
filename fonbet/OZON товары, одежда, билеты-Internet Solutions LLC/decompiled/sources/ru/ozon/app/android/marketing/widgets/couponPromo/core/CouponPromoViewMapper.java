package ru.ozon.app.android.marketing.widgets.couponPromo.core;

import Pc.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.marketing.widgets.couponPromo.data.CouponPromoDTO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoVO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoViewHolder;
import ru.ozon.app.android.tools.MarkupType;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "router", "Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl;", "pViewModel", "<init>", "(Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoMapper;LPc/a;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoMapper;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CouponPromoViewMapper extends WidgetViewMapper<CouponPromoDTO, CouponPromoVO> {

    @NotNull
    private final Function2<View, ComposerReferences, CouponPromoViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final CouponPromoMapper mapper;

    public CouponPromoViewMapper(@NotNull CouponPromoRouter router, @NotNull CouponPromoMapper mapper, @NotNull a<CouponViewModelImpl> pViewModel) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.mapper = mapper;
        this.layout = R$layout.steps_promos_widget;
        this.holderProducer = new CouponPromoViewMapper$holderProducer$1(router, pViewModel);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof CouponPromoDTO) && ((CouponPromoDTO) state).getStepsText().getTextType() != MarkupType.UNKNOWN;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CouponPromoVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CouponPromoDTO, d, List<CouponPromoVO>> getMapper() {
        return this.mapper;
    }
}
