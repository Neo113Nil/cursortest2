package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Sc.InterfaceC4008j;
import Sc.k;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.texts.TextAtomWithIconHolderKt;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ7\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0002\b\u00030\rj\u0006\u0012\u0002\b\u0003`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductButtonSubtitleBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "<init>", "()V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "", "bindFixedSubtitle", "(Lru/ozon/app/android/product/common/product/ProductVO;)V", "bindSubtitle", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "buttonSubtitleView$delegate", "LSc/j;", "getButtonSubtitleView", "()Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "buttonSubtitleView", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductButtonSubtitleBinder extends ProductPropertyBinder<ProductVO> {

    /* renamed from: buttonSubtitleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonSubtitleView = k.b(new ProductButtonSubtitleBinder$buttonSubtitleView$2(this));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductVO.Type.values().length];
            try {
                iArr[ProductVO.Type.GRID2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductVO.Type.GRID3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void bindFixedSubtitle(ProductVO product) {
        TextAtomWithIconView buttonSubtitleView = getButtonSubtitleView();
        if (product.getButtonSubtitleHeight() == 0) {
            ViewExtKt.gone(buttonSubtitleView);
            return;
        }
        ViewGroup.LayoutParams layoutParams = buttonSubtitleView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = product.getButtonSubtitleHeight();
        buttonSubtitleView.setLayoutParams(layoutParams);
        TextAtomWithIconHolderKt.bindOrInvisible$default(buttonSubtitleView, product.getButtonSubtitle(), null, 2, null);
    }

    private final void bindSubtitle(ProductVO product) {
        TextAtomWithIconView buttonSubtitleView = getButtonSubtitleView();
        ViewGroup.LayoutParams layoutParams = buttonSubtitleView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        buttonSubtitleView.setLayoutParams(layoutParams);
        TextAtomWithIconHolderKt.bindOrGone$default(buttonSubtitleView, product.getButtonSubtitle(), null, 2, null);
    }

    private final TextAtomWithIconView getButtonSubtitleView() {
        return (TextAtomWithIconView) this.buttonSubtitleView.getValue();
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public /* bridge */ /* synthetic */ void bind(ProductVO productVO, d dVar, ru.ozon.composer.ui.widget.k kVar) {
        bind2(productVO, dVar, (ru.ozon.composer.ui.widget.k<?>) kVar);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind((ProductButtonSubtitleBinder) product, info, holder);
        int i11 = WhenMappings.$EnumSwitchMapping$0[product.getType().ordinal()];
        if (i11 == 1 || i11 == 2) {
            bindFixedSubtitle(product);
        } else {
            bindSubtitle(product);
        }
    }
}
