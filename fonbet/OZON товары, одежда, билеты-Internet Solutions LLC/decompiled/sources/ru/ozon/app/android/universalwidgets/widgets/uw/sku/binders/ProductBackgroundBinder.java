package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductBackgroundBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "<init>", "()V", "Lru/ozon/app/android/product/common/product/ProductVO$Type;", "type", "", "getCornerRadius", "(Lru/ozon/app/android/product/common/product/ProductVO$Type;)F", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "", "currentColor", "Ljava/lang/String;", "Landroid/graphics/drawable/GradientDrawable;", "background$delegate", "LSc/j;", "getBackground", "()Landroid/graphics/drawable/GradientDrawable;", "background", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductBackgroundBinder extends ProductPropertyBinder<ProductVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float roundedCorner = ResourceExtKt.toPxF(16);

    @NotNull
    private String currentColor = UniColors.LAYER_FLOOR_1.getToken();

    /* renamed from: background$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j background = k.a(n.NONE, ProductBackgroundBinder$background$2.INSTANCE);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductBackgroundBinder$Companion;", "", "<init>", "()V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductVO.Type.values().length];
            try {
                iArr[ProductVO.Type.SCROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductVO.Type.GRID2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductVO.Type.GRID3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final GradientDrawable getBackground() {
        return (GradientDrawable) this.background.getValue();
    }

    private final float getCornerRadius(ProductVO.Type type) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return roundedCorner;
        }
        return 0.0f;
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
        super.bind((ProductBackgroundBinder) product, info, holder);
        if (Intrinsics.d(this.currentColor, product.getBackgroundColor())) {
            return;
        }
        this.currentColor = product.getBackgroundColor();
        View rootView = getRootView();
        GradientDrawable background = getBackground();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getRootView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String backgroundColor = product.getBackgroundColor();
        Context context2 = getRootView().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        background.setColor(styleParser.parseColor(context, backgroundColor, ThemeExtKt.themeColorRes(context2, R$attr.layerFloor1)));
        background.setCornerRadius(getCornerRadius(product.getType()));
        rootView.setBackground(background);
    }
}
