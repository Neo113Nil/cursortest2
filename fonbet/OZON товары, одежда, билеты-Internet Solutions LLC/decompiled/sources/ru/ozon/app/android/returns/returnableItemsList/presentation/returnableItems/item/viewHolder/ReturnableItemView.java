package ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewHolder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.res.g;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ\b\u0010E\u001a\u00020BH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0011\u0010<\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewHolder/ReturnableItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "checkboxMarginStart", "itemMarginEnd", "imageSize", "imageMarginStart", "imageMarginEnd", "subtitleItemsMarginTop", "captionMarginTop", "captionMarginStart", "quantitySelectorButtonMarginTop", "priceViewBarrierMargin", "quantitySelectorTvPaddingVertical", "quantitySelectorTvPaddingHorizontal", "checkbox", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "getCheckbox", "()Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "itemImageIv", "Lcom/google/android/material/imageview/ShapeableImageView;", "getItemImageIv", "()Lcom/google/android/material/imageview/ShapeableImageView;", "titleItemTv", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleItemTv", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitleItemsVal", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getSubtitleItemsVal", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "priceView", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "getPriceView", "()Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "quantityTv", "getQuantityTv", "captionIconIv", "Landroidx/appcompat/widget/AppCompatImageView;", "getCaptionIconIv", "()Landroidx/appcompat/widget/AppCompatImageView;", "captionTv", "getCaptionTv", "itemActionSbbv", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "getItemActionSbbv", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "decreaseSibv", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "getDecreaseSibv", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "quantitySelectorTv", "getQuantitySelectorTv", "increaseSibv", "getIncreaseSibv", "imageBarrier", "Landroidx/constraintlayout/widget/Barrier;", "priceBarrier", "changeQuantitySelectorVisibility", "", "isVisible", "", "setupConstraints", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnableItemView extends ConstraintLayout {

    @NotNull
    private final AppCompatImageView captionIconIv;
    private final int captionMarginStart;
    private final int captionMarginTop;

    @NotNull
    private final TextAtomView captionTv;

    @NotNull
    private final CheckBoxView checkbox;
    private final int checkboxMarginStart;

    @NotNull
    private final SmallIconButtonView decreaseSibv;

    @NotNull
    private final Barrier imageBarrier;
    private final int imageMarginEnd;
    private final int imageMarginStart;
    private final int imageSize;

    @NotNull
    private final SmallIconButtonView increaseSibv;

    @NotNull
    private final SmallBorderlessButtonView itemActionSbbv;

    @NotNull
    private final ShapeableImageView itemImageIv;
    private final int itemMarginEnd;

    @NotNull
    private final Barrier priceBarrier;

    @NotNull
    private final PriceView priceView;
    private final int priceViewBarrierMargin;
    private final int quantitySelectorButtonMarginTop;

    @NotNull
    private final TextAtomView quantitySelectorTv;
    private final int quantitySelectorTvPaddingHorizontal;
    private final int quantitySelectorTvPaddingVertical;

    @NotNull
    private final TextAtomView quantityTv;
    private final int subtitleItemsMarginTop;

    @NotNull
    private final VerticalAtomsLayout subtitleItemsVal;

    @NotNull
    private final TextAtomView titleItemTv;

    public /* synthetic */ ReturnableItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.checkbox);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(dVar, this.checkbox, this.itemImageIv);
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, this.checkbox, this.itemImageIv);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.itemImageIv, this.checkbox);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.itemImageIv);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.titleItemTv, this.imageBarrier);
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, this.titleItemTv, this.priceBarrier);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.titleItemTv);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.subtitleItemsVal, this.imageBarrier);
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, this.subtitleItemsVal, this.priceBarrier);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.subtitleItemsVal, this.titleItemTv);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.priceView);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.priceView, this.priceBarrier);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.priceView);
        ConstraintSetExtKt.layoutConstraintEndToEndOf(dVar, this.quantityTv, this.priceView);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.quantityTv, this.priceBarrier);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.quantityTv, this.priceView);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.captionIconIv, this.imageBarrier);
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, this.captionIconIv, this.captionTv);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.captionTv);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.captionTv, this.captionIconIv);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.captionTv, this.subtitleItemsVal);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.itemActionSbbv, this.imageBarrier);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.itemActionSbbv, this.captionTv);
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, this.decreaseSibv, this.quantitySelectorTv);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.decreaseSibv, this.imageBarrier);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.decreaseSibv, this.itemActionSbbv);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(dVar, this.quantitySelectorTv, this.decreaseSibv);
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, this.quantitySelectorTv, this.increaseSibv);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.quantitySelectorTv, this.decreaseSibv);
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, this.quantitySelectorTv, this.decreaseSibv);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.increaseSibv, this.quantitySelectorTv);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.increaseSibv, this.itemActionSbbv);
        dVar.f(this);
    }

    public final void changeQuantitySelectorVisibility(boolean isVisible) {
        this.decreaseSibv.setVisibility(isVisible ? 0 : 8);
        this.quantitySelectorTv.setVisibility(isVisible ? 0 : 8);
        this.increaseSibv.setVisibility(isVisible ? 0 : 8);
    }

    @NotNull
    public final AppCompatImageView getCaptionIconIv() {
        return this.captionIconIv;
    }

    @NotNull
    public final TextAtomView getCaptionTv() {
        return this.captionTv;
    }

    @NotNull
    public final CheckBoxView getCheckbox() {
        return this.checkbox;
    }

    @NotNull
    public final SmallIconButtonView getDecreaseSibv() {
        return this.decreaseSibv;
    }

    @NotNull
    public final SmallIconButtonView getIncreaseSibv() {
        return this.increaseSibv;
    }

    @NotNull
    public final SmallBorderlessButtonView getItemActionSbbv() {
        return this.itemActionSbbv;
    }

    @NotNull
    public final ShapeableImageView getItemImageIv() {
        return this.itemImageIv;
    }

    @NotNull
    public final PriceView getPriceView() {
        return this.priceView;
    }

    @NotNull
    public final TextAtomView getQuantitySelectorTv() {
        return this.quantitySelectorTv;
    }

    @NotNull
    public final TextAtomView getQuantityTv() {
        return this.quantityTv;
    }

    @NotNull
    public final VerticalAtomsLayout getSubtitleItemsVal() {
        return this.subtitleItemsVal;
    }

    @NotNull
    public final TextAtomView getTitleItemTv() {
        return this.titleItemTv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnableItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(18, context);
        this.checkboxMarginStart = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.itemMarginEnd = px2;
        int px3 = ResourceExtKt.toPx(60, context);
        this.imageSize = px3;
        int px4 = ResourceExtKt.toPx(14, context);
        this.imageMarginStart = px4;
        int px5 = ResourceExtKt.toPx(12, context);
        this.imageMarginEnd = px5;
        int px6 = ResourceExtKt.toPx(4, context);
        this.subtitleItemsMarginTop = px6;
        int px7 = ResourceExtKt.toPx(4, context);
        this.captionMarginTop = px7;
        int px8 = ResourceExtKt.toPx(6, context);
        this.captionMarginStart = px8;
        int px9 = ResourceExtKt.toPx(6, context);
        this.quantitySelectorButtonMarginTop = px9;
        int i12 = -ResourceExtKt.toPx(8, context);
        this.priceViewBarrierMargin = i12;
        int px10 = ResourceExtKt.toPx(8, context);
        this.quantitySelectorTvPaddingVertical = px10;
        int px11 = ResourceExtKt.toPx(12, context);
        this.quantitySelectorTvPaddingHorizontal = px11;
        CheckBoxView checkBoxView = new CheckBoxView(context, null, 0, 6, null);
        checkBoxView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        int i13 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
        int marginEnd = bVar.getMarginEnd();
        int i14 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        bVar.setMarginStart(px);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i13;
        bVar.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i14;
        checkBoxView.setLayoutParams(bVar);
        checkBoxView.setClickable(false);
        checkBoxView.setFocusable(false);
        this.checkbox = checkBoxView;
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(px3, px3);
        int i15 = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
        int marginEnd2 = bVar2.getMarginEnd();
        int i16 = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        bVar2.setMarginStart(px4);
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = i15;
        bVar2.setMarginEnd(marginEnd2);
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = i16;
        shapeableImageView.setLayoutParams(bVar2);
        shapeableImageView.setForeground(g.d(shapeableImageView.getResources(), R$drawable.fg_rounded_layer_overlay_paranja, context.getTheme()));
        shapeableImageView.setClickable(false);
        shapeableImageView.setFocusable(false);
        setMinWidth(px3);
        setMinHeight(px3);
        this.itemImageIv = shapeableImageView;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        textAtomView.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAtomView.setClickable(false);
        textAtomView.setFocusable(false);
        this.titleItemTv = textAtomView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.setMargins(((ViewGroup.MarginLayoutParams) bVar3).leftMargin, px6, ((ViewGroup.MarginLayoutParams) bVar3).rightMargin, ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin);
        bVar3.f41660x = 0;
        verticalAtomsLayout.setLayoutParams(bVar3);
        verticalAtomsLayout.setClickable(false);
        verticalAtomsLayout.setFocusable(false);
        this.subtitleItemsVal = verticalAtomsLayout;
        PriceView priceView = new PriceView(context, null, 0, 6, null);
        priceView.setId(View.generateViewId());
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        int marginStart = bVar4.getMarginStart();
        int i17 = ((ViewGroup.MarginLayoutParams) bVar4).topMargin;
        int i18 = ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin;
        bVar4.setMarginStart(marginStart);
        ((ViewGroup.MarginLayoutParams) bVar4).topMargin = i17;
        bVar4.setMarginEnd(px2);
        ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = i18;
        priceView.setLayoutParams(bVar4);
        priceView.setClickable(false);
        priceView.setFocusable(false);
        this.priceView = priceView;
        TextAtomView textAtomView2 = new TextAtomView(context, null, 0, 6, null);
        textAtomView2.setId(View.generateViewId());
        textAtomView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAtomView2.setClickable(false);
        textAtomView2.setFocusable(false);
        textAtomView2.setTextAlignment(3);
        this.quantityTv = textAtomView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        appCompatImageView.setClickable(false);
        appCompatImageView.setFocusable(false);
        this.captionIconIv = appCompatImageView;
        TextAtomView textAtomView3 = new TextAtomView(context, null, 0, 6, null);
        textAtomView3.setId(View.generateViewId());
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(0, -2);
        int i19 = ((ViewGroup.MarginLayoutParams) bVar5).bottomMargin;
        bVar5.setMarginStart(px8);
        ((ViewGroup.MarginLayoutParams) bVar5).topMargin = px7;
        bVar5.setMarginEnd(px2);
        ((ViewGroup.MarginLayoutParams) bVar5).bottomMargin = i19;
        bVar5.f41594A = 0;
        bVar5.f41660x = 0;
        textAtomView3.setLayoutParams(bVar5);
        textAtomView3.setClickable(false);
        textAtomView3.setFocusable(false);
        this.captionTv = textAtomView3;
        SmallBorderlessButtonView smallBorderlessButtonView = new SmallBorderlessButtonView(context, null, 0, 6, null);
        smallBorderlessButtonView.setId(View.generateViewId());
        ConstraintLayout.b bVar6 = new ConstraintLayout.b(0, -2);
        int marginStart2 = bVar6.getMarginStart();
        int marginEnd3 = bVar6.getMarginEnd();
        int i21 = ((ViewGroup.MarginLayoutParams) bVar6).bottomMargin;
        bVar6.setMarginStart(marginStart2);
        ((ViewGroup.MarginLayoutParams) bVar6).topMargin = px9;
        bVar6.setMarginEnd(marginEnd3);
        ((ViewGroup.MarginLayoutParams) bVar6).bottomMargin = i21;
        bVar6.f41660x = 0;
        smallBorderlessButtonView.setLayoutParams(bVar6);
        this.itemActionSbbv = smallBorderlessButtonView;
        SmallIconButtonView smallIconButtonView = new SmallIconButtonView(context, null, 0, 6, null);
        smallIconButtonView.setId(View.generateViewId());
        ConstraintLayout.b bVar7 = new ConstraintLayout.b(-2, -2);
        bVar7.setMargins(((ViewGroup.MarginLayoutParams) bVar7).leftMargin, px9, ((ViewGroup.MarginLayoutParams) bVar7).rightMargin, ((ViewGroup.MarginLayoutParams) bVar7).bottomMargin);
        bVar7.f41603J = 2;
        smallIconButtonView.setLayoutParams(bVar7);
        this.decreaseSibv = smallIconButtonView;
        TextAtomView textAtomView4 = new TextAtomView(context, null, 0, 6, null);
        textAtomView4.setId(View.generateViewId());
        textAtomView4.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomView4.setPadding(px11, px10, px11, px10);
        textAtomView4.setClickable(true);
        textAtomView4.setFocusable(true);
        this.quantitySelectorTv = textAtomView4;
        SmallIconButtonView smallIconButtonView2 = new SmallIconButtonView(context, null, 0, 6, null);
        smallIconButtonView2.setId(View.generateViewId());
        ConstraintLayout.b bVar8 = new ConstraintLayout.b(-2, -2);
        bVar8.setMargins(((ViewGroup.MarginLayoutParams) bVar8).leftMargin, px9, ((ViewGroup.MarginLayoutParams) bVar8).rightMargin, ((ViewGroup.MarginLayoutParams) bVar8).bottomMargin);
        smallIconButtonView2.setLayoutParams(bVar8);
        this.increaseSibv = smallIconButtonView2;
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.f(6);
        barrier.e(px5);
        barrier.setReferencedIds(new int[]{shapeableImageView.getId()});
        this.imageBarrier = barrier;
        Barrier barrier2 = new Barrier(context);
        barrier2.setId(View.generateViewId());
        barrier2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier2.f(5);
        barrier2.e(i12);
        barrier2.setReferencedIds(new int[]{priceView.getId()});
        this.priceBarrier = barrier2;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        addView(checkBoxView);
        addView(shapeableImageView);
        addView(barrier);
        addView(textAtomView);
        addView(verticalAtomsLayout);
        addView(barrier2);
        addView(priceView);
        addView(textAtomView2);
        addView(appCompatImageView);
        addView(textAtomView3);
        addView(smallBorderlessButtonView);
        addView(smallIconButtonView);
        addView(textAtomView4);
        addView(smallIconButtonView2);
        setupConstraints();
    }
}
