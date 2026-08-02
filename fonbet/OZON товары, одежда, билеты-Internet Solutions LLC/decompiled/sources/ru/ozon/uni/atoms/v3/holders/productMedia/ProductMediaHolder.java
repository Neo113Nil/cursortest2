package ru.ozon.uni.atoms.v3.holders.productMedia;

import BC.a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.productMedia.RatioKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/productMedia/ProductMediaHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/productMedia/ProductMediaView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "bindLabel", "width", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Width;", "bindIcon", "bindSmallLabel", "bindSmallIcon", "bindBackgroundColor", "backgroundColor", "bindFitType", "fitType", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$FitType;", "bindBorder", "border", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Border;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductMediaHolder extends AtomV3<ProductMediaDTO, ProductMediaView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductMediaHolder(@NotNull ProductMediaView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(ProductMediaHolder productMediaHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        ProductMediaDTO productMediaDTO = (ProductMediaDTO) productMediaHolder.getData();
        CommonControlSettings common = productMediaDTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, productMediaDTO.getTrackingInfo())) != null) {
            productMediaHolder.handleAction(atomAction);
            return;
        }
        Object parent = productMediaHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    private final void bindBackgroundColor(String backgroundColor) {
        Color solid;
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_PRIMARY.getToken();
        }
        ProductMediaView containerView = getContainerView();
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(backgroundColor);
        if (gradientByToken == null || (solid = TokensExtKt.toGradient(gradientByToken, getContext())) == null) {
            solid = new Color.Solid(StyleParser.INSTANCE.parseColor(getContext(), backgroundColor, R$color.bg_primary));
        }
        containerView.setBackgroundColor(solid);
    }

    private final void bindBorder(Context context, ProductMediaDTO.Border border) {
        ProductMediaView containerView = getContainerView();
        if (border == null) {
            containerView.clearBorder();
            return;
        }
        Integer width = border.getWidth();
        containerView.setBorder(StyleParser.INSTANCE.parseColor(context, border.getColor()), width != null ? Integer.valueOf(UiExtKt.toPx(width.intValue(), context)) : null, border.getStyle() == ProductMediaDTO.BorderStyle.DASH);
    }

    private final void bindFitType(ProductMediaDTO.FitType fitType) {
        getContainerView().setFitType(fitType == ProductMediaDTO.FitType.FILL_CENTER ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
    }

    private final void bindIcon(ProductMediaDTO item, ProductMediaDTO.Width width) {
        if (ProductMediaUtilsKt.isIconDisabled(item)) {
            getContainerView().clearIcon();
            return;
        }
        CommonAtomIconDTO icon = item.getIcon();
        String icon2 = icon != null ? icon.getIcon() : null;
        CommonAtomIconDTO icon3 = item.getIcon();
        String tintColor = icon3 != null ? icon3.getTintColor() : null;
        int convertWidthToIconSize$uni_release = ProductMediaWidthConverter.INSTANCE.convertWidthToIconSize$uni_release(width);
        int parseColor = StyleParser.INSTANCE.parseColor(getContext(), tintColor, R$color.graphic_tertiary);
        Integer iconResByToken = TokensExtKt.getIconResByToken(getContext(), icon2);
        ProductMediaView containerView = getContainerView();
        containerView.setIconSize(convertWidthToIconSize$uni_release);
        containerView.setIconTint(Integer.valueOf(parseColor));
        containerView.setIcon(iconResByToken);
    }

    private final void bindLabel(ProductMediaDTO item, ProductMediaDTO.Width width) {
        if (ProductMediaUtilsKt.isLabelDisabled(item)) {
            getContainerView().clearLabel();
            return;
        }
        ProductMediaView containerView = getContainerView();
        containerView.setMaxLines(1);
        StyleParser styleParser = StyleParser.INSTANCE;
        ProductMediaDTO.Label label = item.getLabel();
        Integer parseTextStyle = styleParser.parseTextStyle(label != null ? label.getTypographyToken() : null);
        containerView.setTextStyle(parseTextStyle != null ? parseTextStyle.intValue() : ProductMediaWidthConverter.INSTANCE.convertWidthToLabelStyle$uni_release(width));
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ProductMediaDTO.Label label2 = item.getLabel();
        containerView.setTextTintColor(styleParser.parseColor(context, label2 != null ? label2.getColor() : null, R$color.text_primary));
        containerView.setTextPaddingHorizontal(ProductMediaWidthConverter.INSTANCE.convertWidthToTextPaddings$uni_release(width));
        ProductMediaDTO.Label label3 = item.getLabel();
        containerView.setLabel(label3 != null ? label3.getText() : null);
    }

    private final void bindSmallIcon(ProductMediaDTO item, ProductMediaDTO.Width width) {
        if (item.getSmallIcon() == null) {
            if (item.getIcon() == null) {
                getContainerView().clearIcon();
                return;
            }
            return;
        }
        String smallIcon = item.getSmallIcon();
        int color = androidx.core.content.a.getColor(getContext(), R$color.graphic_primary_on_light);
        int convertWidthToSmallIconWidth$uni_release = ProductMediaWidthConverter.INSTANCE.convertWidthToSmallIconWidth$uni_release(width);
        Integer iconResByToken = TokensExtKt.getIconResByToken(getContext(), smallIcon);
        ProductMediaView containerView = getContainerView();
        containerView.setIconSize(convertWidthToSmallIconWidth$uni_release);
        containerView.setIconTint(Integer.valueOf(color));
        containerView.setIcon(iconResByToken);
    }

    private final void bindSmallLabel(ProductMediaDTO item, ProductMediaDTO.Width width) {
        if (ProductMediaUtilsKt.isSmallLabelDisabled(item.getSmallLabel(), width)) {
            if (item.getLabel() == null) {
                getContainerView().clearLabel();
                return;
            }
            return;
        }
        ProductMediaView containerView = getContainerView();
        containerView.setMaxLines(2);
        containerView.setTextStyle(ProductMediaWidthConverter.INSTANCE.convertWidthToSmallLabelStyle$uni_release(width));
        containerView.setTextTintColor(androidx.core.content.a.getColor(containerView.getContext(), R$color.text_primary_on_light));
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setTextPaddingHorizontal(UiExtKt.toPx(8, context));
        containerView.setLabel(item.getSmallLabel());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ProductMediaDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((ProductMediaHolder) item);
        ProductMediaDTO.Width width = item.getWidth();
        if (width == null) {
            width = ProductMediaDTO.Width.WIDTH_500;
        }
        ProductMediaView containerView = getContainerView();
        containerView.setFixedWidth(width.getDp());
        containerView.setAspectRatio(RatioKt.mapProductMediaRatio(item.getRatio()));
        CornerRadius radius = item.getRadius();
        if (radius == null) {
            radius = CornerRadius.RADIUS_300;
        }
        int px = radius.getPx();
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setCornerRadius(ResourceExtKt.toPxF(px, context));
        ProductMediaDTO.Image image = item.getImage();
        containerView.setImage(image != null ? image.getUrl() : null);
        Boolean hasParanja = item.getHasParanja();
        containerView.setHasParanja(hasParanja != null ? hasParanja.booleanValue() : false);
        Boolean hasOverlay = item.getHasOverlay();
        containerView.setHasOverlay(hasOverlay != null ? hasOverlay.booleanValue() : false);
        bindBackgroundColor(item.getBackgroundColor());
        ProductMediaDTO.Image image2 = item.getImage();
        bindFitType(image2 != null ? image2.getFitType() : null);
        bindBorder(getContext(), item.getBorder());
        bindLabel(item, width);
        bindIcon(item, width);
        bindSmallLabel(item, width);
        bindSmallIcon(item, width);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductMediaHolder(@NotNull Context context, String str) {
        this(new ProductMediaView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
