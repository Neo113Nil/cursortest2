package ru.ozon.app.android.pdp.widgets.aspectProductV2.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2VO;", "vo", "", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2VO;)V", "Lcom/google/android/material/imageview/ShapeableImageView;", "image", "Lcom/google/android/material/imageview/ShapeableImageView;", "getImage", "()Lcom/google/android/material/imageview/ShapeableImageView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "price", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectProductV2View extends ConstraintLayout {

    @NotNull
    private final ShapeableImageView image;

    @NotNull
    private final PriceAtomView price;

    @NotNull
    private final TextAtomV2View title;

    public /* synthetic */ AspectProductV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull AspectProductV2VO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        TextHolderKt.bindOrGone$default(this.title, vo.getTitle(), null, 2, null);
        PriceAtomHolderKt.bindOrGone$default(this.price, vo.getPrice(), null, 2, null);
        ImageViewExtKt.load$default(this.image, vo.getImage(), C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(Dimens.INSTANCE.getDP_12(), null, 2, null)), null, null, null, false, null, 124, null);
        this.image.setAlpha(vo.getImageAlpha());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x018e, code lost:
    
        if (r11 != (r3 != null ? r3.bottomMargin : 0)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ec, code lost:
    
        if (r7 != (r3 != null ? r3.bottomMargin : 0)) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AspectProductV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setId(R$id.aspectProductImage);
        Dimens dimens = Dimens.INSTANCE;
        shapeableImageView.setLayoutParams(new ConstraintLayout.b(dimens.getDP_56(), dimens.getDP_56()));
        this.image = shapeableImageView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAtomV2View.setId(R$id.aspectProductTitle);
        textAtomV2View.setTextIsSelectable(false);
        this.title = textAtomV2View;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        priceAtomView.setLayoutParams(new ConstraintLayout.b(0, -2));
        priceAtomView.setId(R$id.aspectProductPrice);
        this.price = priceAtomView;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, dimens.getDP_76());
        marginLayoutParams.setMarginStart(dimens.getDP_16());
        marginLayoutParams.bottomMargin = dimens.getDP_16();
        marginLayoutParams.setMarginEnd(dimens.getDP_16());
        setLayoutParams(marginLayoutParams);
        ViewExtKt.updatePadding(this, 0, 0, dimens.getDP_12(), 0);
        setBackground(a.getDrawable(context, R$drawable.bg_aspect_product_v2));
        addView(shapeableImageView);
        addView(textAtomV2View);
        addView(priceAtomView);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, shapeableImageView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, shapeableImageView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, shapeableImageView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToTop$default(dVar, priceAtomView.getId(), textAtomV2View.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, priceAtomView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToEnd$default(dVar, priceAtomView.getId(), shapeableImageView.getId(), 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, priceAtomView.getId(), 0, 0, 4, null);
        dVar.c0(0.0f, priceAtomView.getId());
        dVar.g0(priceAtomView.getId(), 2);
        ConstraintSetExtKt.startToEnd$default(dVar, textAtomV2View.getId(), shapeableImageView.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, textAtomV2View.getId(), priceAtomView.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
        dVar.c0(0.0f, textAtomV2View.getId());
        dVar.g0(textAtomV2View.getId(), 2);
        dVar.C(priceAtomView.getId(), true);
        dVar.C(textAtomV2View.getId(), true);
        dVar.f(this);
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            int i12 = marginLayoutParams2.leftMargin;
            int i13 = marginLayoutParams2.topMargin;
            int i14 = marginLayoutParams2.rightMargin;
            int i15 = marginLayoutParams2.bottomMargin;
            int dp_10 = dimens.getDP_10();
            marginLayoutParams2.leftMargin = dp_10;
            if (i12 == dp_10) {
                ViewGroup.LayoutParams layoutParams2 = shapeableImageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = shapeableImageView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = shapeableImageView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            shapeableImageView.setLayoutParams(marginLayoutParams2);
        }
        ViewGroup.LayoutParams layoutParams5 = priceAtomView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams6 != null) {
            int i16 = marginLayoutParams6.leftMargin;
            int i17 = marginLayoutParams6.topMargin;
            int i18 = marginLayoutParams6.rightMargin;
            int i19 = marginLayoutParams6.bottomMargin;
            int dp_8 = dimens.getDP_8();
            marginLayoutParams6.leftMargin = dp_8;
            if (i16 == dp_8) {
                ViewGroup.LayoutParams layoutParams6 = priceAtomView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                if (i17 == (marginLayoutParams7 != null ? marginLayoutParams7.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams7 = priceAtomView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                    if (i18 == (marginLayoutParams8 != null ? marginLayoutParams8.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams8 = priceAtomView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                    }
                }
            }
            priceAtomView.setLayoutParams(marginLayoutParams6);
        }
        ViewGroup.LayoutParams layoutParams9 = textAtomV2View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
        if (marginLayoutParams10 == null) {
            return;
        }
        int i21 = marginLayoutParams10.leftMargin;
        int i22 = marginLayoutParams10.topMargin;
        int i23 = marginLayoutParams10.rightMargin;
        int i24 = marginLayoutParams10.bottomMargin;
        int dp_82 = dimens.getDP_8();
        marginLayoutParams10.leftMargin = dp_82;
        if (i21 == dp_82) {
            ViewGroup.LayoutParams layoutParams10 = textAtomV2View.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
            if (i22 == (marginLayoutParams11 != null ? marginLayoutParams11.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams11 = textAtomV2View.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
                if (i23 == (marginLayoutParams12 != null ? marginLayoutParams12.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams12 = textAtomV2View.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
                    if (i24 == (marginLayoutParams13 != null ? marginLayoutParams13.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        textAtomV2View.setLayoutParams(marginLayoutParams10);
    }
}
