package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter;

import BP.a;
import Sc.InterfaceC4008j;
import Ve.C4636t5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.app.android.marketing.databinding.ItemHighlightProductBinding;
import ru.ozon.app.android.marketing.databinding.ItemHighlightProductMiniBinding;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.HighlightProductsVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;
import y7.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003456B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u001b\u0010+\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0016R\u001b\u0010.\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010\u0016R\u001b\u00103\u001a\u00020/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter$ViewHolder;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter$ViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter$ViewHolder;I)V", "getItemCount", "()I", "", "isMiniWidget", "setIsMiniWidget", "(Z)V", "", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$HighlightProduct;", "newList", "setData", "(Ljava/util/List;)V", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function1;", "Z", "currentList", "Ljava/util/List;", "selectColorAttr", "I", "bxColor", "imageBgColor$delegate", "LSc/j;", "getImageBgColor", "imageBgColor", "miniWidgetPadding$delegate", "getMiniWidgetPadding", "miniWidgetPadding", "Ly7/k;", "miniProductShape$delegate", "getMiniProductShape", "()Ly7/k;", "miniProductShape", "Companion", "ViewContainer", "ViewHolder", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HighlightProductsAdapter extends RecyclerView.g<ViewHolder> {
    private final int bxColor;

    @NotNull
    private final Context context;

    @NotNull
    private List<HighlightProductsVO.HighlightProduct> currentList;

    /* renamed from: imageBgColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageBgColor;
    private boolean isMiniWidget;

    /* renamed from: miniProductShape$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j miniProductShape;

    /* renamed from: miniWidgetPadding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j miniWidgetPadding;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;
    private final int selectColorAttr;
    public static final int $stable = 8;
    private static final float selectRadius = ResourceExtKt.toPxF(12);
    private static final float bxRadius = ResourceExtKt.toPxF(6);
    private static final int bxImagePadding = ResourceExtKt.toPx(2);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter$ViewContainer;", "", "root", "Landroid/widget/FrameLayout;", "productImage", "Lcom/google/android/material/imageview/ShapeableImageView;", "icon", "Landroid/widget/ImageView;", "badgeContainer", "Landroidx/cardview/widget/CardView;", "badge", "<init>", "(Landroid/widget/FrameLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/ImageView;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;)V", "getRoot", "()Landroid/widget/FrameLayout;", "getProductImage", "()Lcom/google/android/material/imageview/ShapeableImageView;", "getIcon", "()Landroid/widget/ImageView;", "getBadgeContainer", "()Landroidx/cardview/widget/CardView;", "getBadge", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewContainer {

        @NotNull
        private final ImageView badge;

        @NotNull
        private final CardView badgeContainer;

        @NotNull
        private final ImageView icon;

        @NotNull
        private final ShapeableImageView productImage;

        @NotNull
        private final FrameLayout root;

        public ViewContainer(@NotNull FrameLayout root, @NotNull ShapeableImageView productImage, @NotNull ImageView icon, @NotNull CardView badgeContainer, @NotNull ImageView badge) {
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(productImage, "productImage");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(badgeContainer, "badgeContainer");
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.root = root;
            this.productImage = productImage;
            this.icon = icon;
            this.badgeContainer = badgeContainer;
            this.badge = badge;
        }

        @NotNull
        public final ImageView getBadge() {
            return this.badge;
        }

        @NotNull
        public final CardView getBadgeContainer() {
            return this.badgeContainer;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final ShapeableImageView getProductImage() {
            return this.productImage;
        }

        @NotNull
        public final FrameLayout getRoot() {
            return this.root;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter$ViewContainer;", "viewsContainer", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter$ViewContainer;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductBadge;", "badgeVO", "Landroid/view/View;", "containerView", "bindBadge", "(Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductBadge;Landroid/view/View;)V", "Landroid/widget/ImageView;", "previewImageView", "", "imageUrl", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductIcon;", "iconVO", "", "bindPreview", "(Landroid/widget/ImageView;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductIcon;)Ljava/lang/Object;", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$HighlightProduct;", "item", "bind", "(Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$HighlightProduct;)V", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter$ViewContainer;", "Lkotlin/jvm/functions/Function1;", "", "defaultIconTintColor", "I", "defaultBadgeTintColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.C {
        private final int defaultBadgeTintColor;
        private final int defaultIconTintColor;

        @NotNull
        private final Function1<AtomAction, Unit> onAction;

        @NotNull
        private final ViewContainer viewsContainer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ViewHolder(@NotNull ViewContainer viewsContainer, @NotNull Function1<? super AtomAction, Unit> onAction) {
            super(viewsContainer.getRoot());
            Intrinsics.checkNotNullParameter(viewsContainer, "viewsContainer");
            Intrinsics.checkNotNullParameter(onAction, "onAction");
            this.viewsContainer = viewsContainer;
            this.onAction = onAction;
            this.defaultIconTintColor = UniColors.BG_ACTION_SECONDARY.getResId();
            this.defaultBadgeTintColor = UniColors.BG_LIGHT_KEY.getResId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$5$lambda$4(HighlightProductsVO.HighlightProduct highlightProduct, ViewHolder viewHolder, View view) {
            AtomAction action = highlightProduct.getAction();
            if (action != null) {
                viewHolder.onAction.invoke(action);
            }
        }

        private final void bindBadge(HighlightProductsVO.ProductBadge badgeVO, View containerView) {
            ViewContainer viewContainer = this.viewsContainer;
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            viewContainer.getBadgeContainer().setCardBackgroundColor(styleParser.parseColor(context, badgeVO.getBackgroundColor(), R$color.oz_text_quaternary));
            ImageViewExtKt.load$default(viewContainer.getBadge(), badgeVO.getImage(), null, null, null, null, false, null, 126, null);
            Context context2 = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ThemeExtKt.tint(viewContainer.getBadge(), Integer.valueOf(styleParser.parseColor(context2, badgeVO.getTintColor(), this.defaultBadgeTintColor)));
        }

        private final Object bindPreview(ImageView previewImageView, String imageUrl, HighlightProductsVO.ProductIcon iconVO) {
            ViewContainer viewContainer = this.viewsContainer;
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = viewContainer.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int parseColor = styleParser.parseColor(context, iconVO != null ? iconVO.getTintColor() : null, this.defaultIconTintColor);
            if (iconVO == null) {
                ViewExtKt.gone(viewContainer.getIcon());
                ImageViewExtKt.load$default(previewImageView, imageUrl, C7714v.a0(ImageTransformation.CropOnWhite.INSTANCE), null, null, null, false, null, 124, null);
                previewImageView.setClipToOutline(false);
                return Unit.f71690a;
            }
            previewImageView.setImageDrawable(null);
            ImageView icon = viewContainer.getIcon();
            ImageViewExtKt.load$default(icon, imageUrl, null, null, null, null, false, null, 126, null);
            ThemeExtKt.tint(icon, Integer.valueOf(parseColor));
            ViewExtKt.show(icon);
            return icon;
        }

        static /* synthetic */ Object bindPreview$default(ViewHolder viewHolder, ImageView imageView, String str, HighlightProductsVO.ProductIcon productIcon, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                productIcon = null;
            }
            return viewHolder.bindPreview(imageView, str, productIcon);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
        
            if (bindPreview$default(r7, r0.getProductImage(), r3, null, 4, null) != null) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void bind(@NotNull HighlightProductsVO.HighlightProduct item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ViewContainer viewContainer = this.viewsContainer;
            String image = item.getImage();
            if (image == null) {
            }
            HighlightProductsVO.ProductIcon icon = item.getIcon();
            if (icon != null) {
                bindPreview(viewContainer.getProductImage(), icon.getIcon(), icon);
            }
            HighlightProductsVO.ProductBadge badge = item.getBadge();
            if (badge != null) {
                bindBadge(badge, viewContainer.getRoot());
                ViewExtKt.show(viewContainer.getBadgeContainer());
            } else {
                ViewExtKt.gone(viewContainer.getBadgeContainer());
            }
            viewContainer.getRoot().setOnClickListener(new a(1, item, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HighlightProductsAdapter(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.context = context;
        this.onAction = onAction;
        this.currentList = K.f71697a;
        this.selectColorAttr = R$attr.clearLightKey300;
        this.bxColor = R$color.oz_bg_primary;
        this.imageBgColor = UtilsKt.unsafeLazy(new HighlightProductsAdapter$imageBgColor$2(this));
        this.miniWidgetPadding = UtilsKt.unsafeLazy(new HighlightProductsAdapter$miniWidgetPadding$2(this));
        this.miniProductShape = UtilsKt.unsafeLazy(new HighlightProductsAdapter$miniProductShape$2(this));
    }

    private final int getImageBgColor() {
        return ((Number) this.imageBgColor.getValue()).intValue();
    }

    private final int getMiniWidgetPadding() {
        return ((Number) this.miniWidgetPadding.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.currentList.size();
    }

    @NotNull
    public final k getMiniProductShape() {
        return (k) this.miniProductShape.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        ViewContainer viewContainer;
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (this.isMiniWidget) {
            ItemHighlightProductMiniBinding inflate = ItemHighlightProductMiniBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            ShapeableImageView shapeableImageView = inflate.highlightProductImage;
            shapeableImageView.setShapeAppearanceModel(getMiniProductShape());
            shapeableImageView.setBackgroundColor(getImageBgColor());
            int miniWidgetPadding = getMiniWidgetPadding();
            shapeableImageView.setPadding(miniWidgetPadding, miniWidgetPadding, miniWidgetPadding, miniWidgetPadding);
            FrameLayout constraintLayout = inflate.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ShapeableImageView highlightProductImage = inflate.highlightProductImage;
            Intrinsics.checkNotNullExpressionValue(highlightProductImage, "highlightProductImage");
            ImageView highlightIcon = inflate.highlightIcon;
            Intrinsics.checkNotNullExpressionValue(highlightIcon, "highlightIcon");
            CardView highlightProductBadgeContainer = inflate.highlightProductBadgeContainer;
            Intrinsics.checkNotNullExpressionValue(highlightProductBadgeContainer, "highlightProductBadgeContainer");
            ImageView highlightProductBadge = inflate.highlightProductBadge;
            Intrinsics.checkNotNullExpressionValue(highlightProductBadge, "highlightProductBadge");
            viewContainer = new ViewContainer(constraintLayout, highlightProductImage, highlightIcon, highlightProductBadgeContainer, highlightProductBadge);
        } else {
            ItemHighlightProductBinding inflate2 = ItemHighlightProductBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            inflate2.highlightProductImage.setBackgroundColor(getImageBgColor());
            FrameLayout constraintLayout2 = inflate2.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            ShapeableImageView highlightProductImage2 = inflate2.highlightProductImage;
            Intrinsics.checkNotNullExpressionValue(highlightProductImage2, "highlightProductImage");
            ImageView highlightIcon2 = inflate2.highlightIcon;
            Intrinsics.checkNotNullExpressionValue(highlightIcon2, "highlightIcon");
            CardView highlightProductBadgeContainer2 = inflate2.highlightProductBadgeContainer;
            Intrinsics.checkNotNullExpressionValue(highlightProductBadgeContainer2, "highlightProductBadgeContainer");
            ImageView highlightProductBadge2 = inflate2.highlightProductBadge;
            Intrinsics.checkNotNullExpressionValue(highlightProductBadge2, "highlightProductBadge");
            viewContainer = new ViewContainer(constraintLayout2, highlightProductImage2, highlightIcon2, highlightProductBadgeContainer2, highlightProductBadge2);
        }
        return new ViewHolder(viewContainer, this.onAction);
    }

    public final void setData(@NotNull List<HighlightProductsVO.HighlightProduct> newList) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        i.c a11 = i.a(new DiffUtilItemCallback(this.currentList, newList), true);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.currentList = newList;
        a11.c(this);
    }

    public final void setIsMiniWidget(boolean isMiniWidget) {
        this.isMiniWidget = isMiniWidget;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.currentList.get(position));
    }
}
