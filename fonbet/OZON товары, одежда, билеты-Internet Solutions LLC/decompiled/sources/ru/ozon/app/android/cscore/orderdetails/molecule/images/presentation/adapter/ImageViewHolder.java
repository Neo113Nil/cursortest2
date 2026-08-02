package ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter;

import NV.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.databinding.ItemImageBinding;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.productMedia.Ratio;
import ru.ozon.uni.android.atom.productMedia.RatioKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/cscore/databinding/ItemImageBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/cscore/databinding/ItemImageBinding;Lkotlin/jvm/functions/Function1;)V", "", "handleClick", "()Z", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "item", "bindAdult", "(Lru/ozon/app/android/cscore/databinding/ItemImageBinding;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;)V", "bindProductMedia", "bindImage", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO$Border;", "border", "bindBorder", "(Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO$Border;)V", "Landroid/graphics/drawable/GradientDrawable;", "createBorderDrawable", "(Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO$Border;)Landroid/graphics/drawable/GradientDrawable;", "bind", "(Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;)V", "Lru/ozon/app/android/cscore/databinding/ItemImageBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "overlayBackground", "Landroid/graphics/drawable/GradientDrawable;", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemImageBinding binding;
    private ImageVO item;

    @NotNull
    private final GradientDrawable overlayBackground;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int BORDER_PADDING = UiExtKt.toPx(6);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder$Companion;", "", "<init>", "()V", "", "ALPHA_TRANSLUCENT", "F", "ALPHA_OPAQUE", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageViewHolder(@NotNull ItemImageBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = actionHandler;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.graphicTertiaryOnLight));
        this.overlayBackground = gradientDrawable;
        binding.counterTav.setTextIsSelectable(false);
        binding.adultIv.setBackground(gradientDrawable);
        binding.adultIv.setClipToOutline(true);
        binding.getConstraintLayout().setOnClickListener(new a(3, this, binding));
        binding.overlay.setBackground(gradientDrawable);
    }

    private final void bindAdult(ItemImageBinding itemImageBinding, ImageVO imageVO) {
        ImageVO imageVO2;
        CornerRadius radius;
        ProductMediaDTO.Width width;
        if (!imageVO.getShouldBlur()) {
            AppCompatImageView adultIv = itemImageBinding.adultIv;
            Intrinsics.checkNotNullExpressionValue(adultIv, "adultIv");
            ViewExtKt.gone(adultIv);
            AppCompatImageView eyeIv = itemImageBinding.eyeIv;
            Intrinsics.checkNotNullExpressionValue(eyeIv, "eyeIv");
            ViewExtKt.gone(eyeIv);
            return;
        }
        ProductMediaDTO productMedia = imageVO.getProductMedia();
        Ratio mapProductMediaRatio = RatioKt.mapProductMediaRatio(productMedia != null ? productMedia.getRatio() : null);
        ProductMediaDTO productMedia2 = imageVO.getProductMedia();
        int px = UiExtKt.toPx((productMedia2 == null || (width = productMedia2.getWidth()) == null) ? 64 : width.getDp());
        int heightRatio = mapProductMediaRatio.getHeightRatio() * (px / mapProductMediaRatio.getWidthRatio());
        itemImageBinding.adultIv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        AppCompatImageView adultIv2 = itemImageBinding.adultIv;
        Intrinsics.checkNotNullExpressionValue(adultIv2, "adultIv");
        ViewGroup.LayoutParams layoutParams = adultIv2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = px;
        layoutParams2.height = heightRatio;
        adultIv2.setLayoutParams(layoutParams2);
        AppCompatImageView adultIv3 = itemImageBinding.adultIv;
        Intrinsics.checkNotNullExpressionValue(adultIv3, "adultIv");
        ViewExtKt.show(adultIv3);
        String blurImageUrl = imageVO.getBlurImageUrl();
        if (blurImageUrl != null) {
            AppCompatImageView adultIv4 = itemImageBinding.adultIv;
            Intrinsics.checkNotNullExpressionValue(adultIv4, "adultIv");
            ImageViewExtKt.load$default(adultIv4, blurImageUrl, null, null, null, new ImageSize(px, heightRatio), false, null, 110, null);
            imageVO2 = imageVO;
        } else {
            ImageBlurManager imageBlurManager = ImageBlurManager.INSTANCE;
            AppCompatImageView adultIv5 = itemImageBinding.adultIv;
            Intrinsics.checkNotNullExpressionValue(adultIv5, "adultIv");
            imageVO2 = imageVO;
            imageBlurManager.setBlurImage(adultIv5, imageVO2);
        }
        ProductMediaView productMediaPmv = itemImageBinding.productMediaPmv;
        Intrinsics.checkNotNullExpressionValue(productMediaPmv, "productMediaPmv");
        ViewExtKt.gone(productMediaPmv);
        Image imageIv = itemImageBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ViewExtKt.gone(imageIv);
        View overlay = itemImageBinding.overlay;
        Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
        ViewExtKt.gone(overlay);
        ProductMediaDTO productMedia3 = imageVO2.getProductMedia();
        if (productMedia3 != null && (radius = productMedia3.getRadius()) != null) {
            float pxF = UiExtKt.toPxF(radius.getPx());
            Drawable background = itemImageBinding.adultIv.getBackground();
            Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            gradientDrawable.setCornerRadius(pxF);
            gradientDrawable.setColor(this.itemView.getContext().getColor(R$color.transparent));
        }
        TextDTO counter = imageVO2.getCounter();
        AppCompatImageView eyeIv2 = itemImageBinding.eyeIv;
        Intrinsics.checkNotNullExpressionValue(eyeIv2, "eyeIv");
        if (counter == null) {
            ViewExtKt.show(eyeIv2);
        } else {
            ViewExtKt.gone(eyeIv2);
        }
    }

    private final void bindBorder(ImageDTO.Border border) {
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        if (border == null) {
            constraintLayout.setBackground(null);
            constraintLayout.setPadding(0, 0, 0, 0);
        } else {
            constraintLayout.setBackground(createBorderDrawable(border));
            int i11 = BORDER_PADDING;
            constraintLayout.setPadding(i11, i11, i11, i11);
        }
    }

    private final void bindImage(ItemImageBinding itemImageBinding, ImageVO imageVO) {
        Image imageIv = itemImageBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ImageHolderKt.bindOrGone(imageIv, imageVO.getImage(), this.actionHandler);
        View overlay = itemImageBinding.overlay;
        Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGoneByPresence(overlay, imageVO.getCounter());
    }

    private final void bindProductMedia(ItemImageBinding itemImageBinding, ImageVO imageVO) {
        ProductMediaDTO productMediaDTO;
        ProductMediaDTO productMedia = imageVO.getProductMedia();
        if (productMedia != null) {
            productMediaDTO = productMedia.copy((r34 & 1) != 0 ? productMedia.context : null, (r34 & 2) != 0 ? productMedia.image : null, (r34 & 4) != 0 ? productMedia.width : null, (r34 & 8) != 0 ? productMedia.ratio : null, (r34 & 16) != 0 ? productMedia.radius : null, (r34 & 32) != 0 ? productMedia.backgroundColor : null, (r34 & 64) != 0 ? productMedia.border : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productMedia.hasParanja : null, (r34 & 256) != 0 ? productMedia.hasOverlay : Boolean.valueOf(imageVO.getCounter() != null), (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productMedia.icon : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productMedia.label : null, (r34 & 2048) != 0 ? productMedia.smallIcon : null, (r34 & 4096) != 0 ? productMedia.smallLabel : null, (r34 & 8192) != 0 ? productMedia.common : null, (r34 & 16384) != 0 ? productMedia.smallIconColor : null, (r34 & 32768) != 0 ? productMedia.smallLabelColor : null);
        } else {
            productMediaDTO = null;
        }
        ProductMediaView productMediaPmv = itemImageBinding.productMediaPmv;
        Intrinsics.checkNotNullExpressionValue(productMediaPmv, "productMediaPmv");
        ProductMediaHolderKt.bindOrGone(productMediaPmv, productMediaDTO, this.actionHandler);
    }

    private final GradientDrawable createBorderDrawable(ImageDTO.Border border) {
        float width = border.getWidth();
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(width, context);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor = styleParser.parseColor(context2, border.getColor(), UniColors.GRAPHIC_ACTION_PRIMARY.getResId());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(px, parseColor);
        gradientDrawable.setCornerRadius(UiExtKt.toPxF(ru.ozon.uni.atoms.data.image.CornerRadius.RADIUS_500.getPx()));
        return gradientDrawable;
    }

    private final boolean handleClick() {
        List<GalleryRequest.GalleryItem> galleryItems;
        CommonControlSettings common;
        AtomActionDTO action;
        CommonControlSettings common2;
        ImageVO imageVO = this.item;
        if (imageVO != null && (common = imageVO.getCommon()) != null && (action = common.getAction()) != null) {
            ImageVO imageVO2 = this.item;
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, (imageVO2 == null || (common2 = imageVO2.getCommon()) == null) ? null : common2.getTrackingInfo());
            if (atomAction != null) {
                this.actionHandler.invoke(atomAction);
                return true;
            }
        }
        ImageVO imageVO3 = this.item;
        if (imageVO3 != null && (galleryItems = imageVO3.getGalleryItems()) != null) {
            List<GalleryRequest.GalleryItem> list = galleryItems.isEmpty() ? null : galleryItems;
            if (list != null) {
                int adapterPosition = getAdapterPosition();
                GalleryRequest galleryRequest = new GalleryRequest(list, adapterPosition >= 0 ? adapterPosition : 0);
                GalleryActivity.Companion companion = GalleryActivity.INSTANCE;
                Context context = this.binding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.binding.getConstraintLayout().getContext().startActivity(companion.newIntent(context, galleryRequest));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(ImageViewHolder imageViewHolder, ItemImageBinding itemImageBinding, View view) {
        if (imageViewHolder.handleClick()) {
            return;
        }
        Object parent = itemImageBinding.getConstraintLayout().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.performClick();
        }
    }

    public final void bind(@NotNull ImageVO item) {
        ru.ozon.uni.atoms.data.image.CornerRadius cornerRadius;
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        ItemImageBinding itemImageBinding = this.binding;
        itemImageBinding.getConstraintLayout().setAlpha(item.getIsTranslucent() ? 0.5f : 1.0f);
        GradientDrawable gradientDrawable = this.overlayBackground;
        ru.ozon.uni.atoms.data.image.ImageDTO image = item.getImage();
        if (image == null || (cornerRadius = image.getCornerRadius()) == null) {
            cornerRadius = ru.ozon.uni.atoms.data.image.CornerRadius.NO_RADIUS;
        }
        gradientDrawable.setCornerRadius(UiExtKt.toPxF(cornerRadius.getPx()));
        if (item.getProductMedia() != null) {
            bindProductMedia(itemImageBinding, item);
        } else {
            bindImage(itemImageBinding, item);
        }
        bindAdult(itemImageBinding, item);
        TextAtomV2View counterTav = itemImageBinding.counterTav;
        Intrinsics.checkNotNullExpressionValue(counterTav, "counterTav");
        TextHolderKt.bindOrGone$default(counterTav, item.getCounter(), null, 2, null);
        BadgeView counterBadge = itemImageBinding.counterBadge;
        Intrinsics.checkNotNullExpressionValue(counterBadge, "counterBadge");
        BadgeHolderKt.bindOrGone$default(counterBadge, item.getBadge(), (Function1) null, 2, (Object) null);
        bindBorder(item.getBorder());
    }
}
