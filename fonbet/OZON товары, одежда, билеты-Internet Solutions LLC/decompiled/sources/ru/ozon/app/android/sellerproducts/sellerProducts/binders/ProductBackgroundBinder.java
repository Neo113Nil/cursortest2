package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

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
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductBackgroundBinder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductPropertyBinder;", "<init>", "()V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;", "type", "", "getCornerRadius", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;)F", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "info", "Lru/ozon/composer/ui/widget/k;", "holder", "", "bind", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "", "currentColor", "Ljava/lang/String;", "Landroid/graphics/drawable/GradientDrawable;", "background$delegate", "LSc/j;", "getBackground", "()Landroid/graphics/drawable/GradientDrawable;", "background", "Companion", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductBackgroundBinder extends ProductPropertyBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float roundedCorner = ResourceExtKt.toPxF(16);

    /* renamed from: background$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j background = k.a(n.NONE, ProductBackgroundBinder$background$2.INSTANCE);
    private String currentColor;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductBackgroundBinder$Companion;", "", "<init>", "()V", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void bind(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(product, info, holder);
        if (Intrinsics.d(this.currentColor, product.getBackgroundColor())) {
            return;
        }
        this.currentColor = product.getBackgroundColor();
        View rootView = getRootView();
        GradientDrawable background = getBackground();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getRootView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        background.setColor(styleParser.parseColor(context, product.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        background.setCornerRadius(getCornerRadius(product.getType()));
        rootView.setBackground(background);
    }
}
