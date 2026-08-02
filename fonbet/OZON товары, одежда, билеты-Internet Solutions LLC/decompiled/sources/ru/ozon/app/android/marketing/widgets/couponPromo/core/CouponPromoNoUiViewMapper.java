package ru.ozon.app.android.marketing.widgets.couponPromo.core;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.marketing.widgets.couponPromo.data.CouponPromoDTO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoVO;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO;", "Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoMapper;", "mapper", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "couponPromoRouter", "<init>", "(Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoMapper;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;)V", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "", "updateDialogWithInfo", "(Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/ViewGroup;", "composerRootView", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoMapper;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoMapper;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CouponPromoNoUiViewMapper extends SingleNoUiViewMapper<CouponPromoDTO, CouponPromoVO> {

    @NotNull
    private final CouponPromoRouter couponPromoRouter;

    @NotNull
    private final CouponPromoMapper mapper;

    public CouponPromoNoUiViewMapper(@NotNull CouponPromoMapper mapper, @NotNull CouponPromoRouter couponPromoRouter) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(couponPromoRouter, "couponPromoRouter");
        this.mapper = mapper;
        this.couponPromoRouter = couponPromoRouter;
    }

    private final void updateDialogWithInfo(l viewObject, ComposerReferences references) {
        c d11 = viewObject.d();
        CouponPromoVO couponPromoVO = d11 instanceof CouponPromoVO ? (CouponPromoVO) d11 : null;
        if (couponPromoVO != null) {
            this.couponPromoRouter.updatePopupWithExtendedInfo(couponPromoVO.getStepsState(), couponPromoVO.getPromoCode(), references.getContainer().a());
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        super.bind(composerRootView, viewObject, references);
        updateDialogWithInfo(viewObject, references);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public CouponPromoMapper getMapper() {
        return this.mapper;
    }
}
