package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.view;

import Fj.c;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.adultimage.DeliveryAdultImageView;
import ru.ozon.app.android.cscore.checkbox.CsCheckBoxCutOutView;
import ru.ozon.app.android.cscore.orderdetails.molecule.media.presentation.ProductMediaImageView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 B2\u00020\u0001:\u0001BB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<J\u0017\u0010=\u001a\u00020:2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020:H\u0002J\b\u0010A\u001a\u00020:H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010/\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0014R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0011\u00107\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b8\u00104¨\u0006C"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/view/ProductToPayWidgetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "guidelineTop", "Landroidx/constraintlayout/widget/Guideline;", "guidelineStartTextInfo", "imageView", "Lru/ozon/app/android/cscore/adultimage/DeliveryAdultImageView;", "getImageView", "()Lru/ozon/app/android/cscore/adultimage/DeliveryAdultImageView;", "counterBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getCounterBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "productImageView", "Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageView;", "getProductImageView", "()Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageView;", "checkBoxCutOutView", "Lru/ozon/app/android/cscore/checkbox/CsCheckBoxCutOutView;", "getCheckBoxCutOutView", "()Lru/ozon/app/android/cscore/checkbox/CsCheckBoxCutOutView;", "checkBox", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "getCheckBox", "()Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "imageBarrier", "Landroidx/constraintlayout/widget/Barrier;", "getImageBarrier", "()Landroidx/constraintlayout/widget/Barrier;", "titleLayout", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "getTitleLayout", "()Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "subtitleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getSubtitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "captionView", "getCaptionView", "badgeView", "getBadgeView", "minusIconButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getMinusIconButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "countValueTextAtom", "getCountValueTextAtom", "plusIconButton", "getPlusIconButton", "changeProductCounterVisibility", "", "isVisible", "", "updateGuidelineStartTextInfo", "imageWidth", "(Ljava/lang/Integer;)V", "initView", "setupConstraints", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductToPayWidgetView extends ConstraintLayout {

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final TextAtomV2View captionView;

    @NotNull
    private final CheckBoxView checkBox;

    @NotNull
    private final CsCheckBoxCutOutView checkBoxCutOutView;

    @NotNull
    private final TextAtomV2View countValueTextAtom;

    @NotNull
    private final BadgeView counterBadgeView;

    @NotNull
    private final Guideline guidelineStartTextInfo;

    @NotNull
    private final Guideline guidelineTop;

    @NotNull
    private final Barrier imageBarrier;

    @NotNull
    private final DeliveryAdultImageView imageView;

    @NotNull
    private final IconButtonV3View minusIconButton;

    @NotNull
    private final IconButtonV3View plusIconButton;

    @NotNull
    private final ProductMediaImageView productImageView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final HorizontalFlexAtomsLayout titleLayout;
    public static final int $stable = 8;
    private static final int IMAGE_VIEW_SIZE = ResourceExtKt.toPx(56);
    private static final float IMAGE_VIEW_CORNER_RADIUS = UiExtKt.toPxF(8);
    private static final int MARGIN_2 = ResourceExtKt.toPx(2);
    private static final int MARGIN_4 = ResourceExtKt.toPx(4);
    private static final int MARGIN_8 = ResourceExtKt.toPx(8);
    private static final int MARGIN_12 = ResourceExtKt.toPx(12);
    private static final int MARGIN_16 = ResourceExtKt.toPx(16);
    private static final int cutOutSize = ResourceExtKt.toPx(32);

    public /* synthetic */ ProductToPayWidgetView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void initView() {
        setId(View.generateViewId());
        int i11 = MARGIN_12;
        setPaddingRelative(getPaddingStart(), getPaddingTop(), MARGIN_16, i11);
        addView(this.guidelineTop);
        addView(this.guidelineStartTextInfo);
        addView(this.imageView);
        addView(this.counterBadgeView);
        addView(this.productImageView);
        addView(this.checkBoxCutOutView);
        addView(this.checkBox);
        addView(this.imageBarrier);
        addView(this.titleLayout);
        addView(this.subtitleView);
        addView(this.captionView);
        addView(this.badgeView);
        addView(this.minusIconButton);
        addView(this.countValueTextAtom);
        addView(this.plusIconButton);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new ProductToPayWidgetView$setupConstraints$1(this));
    }

    public static /* synthetic */ void updateGuidelineStartTextInfo$default(ProductToPayWidgetView productToPayWidgetView, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        productToPayWidgetView.updateGuidelineStartTextInfo(num);
    }

    public final void changeProductCounterVisibility(boolean isVisible) {
        this.minusIconButton.setVisibility(isVisible ? 0 : 8);
        this.countValueTextAtom.setVisibility(isVisible ? 0 : 8);
        this.plusIconButton.setVisibility(isVisible ? 0 : 8);
    }

    @NotNull
    public final BadgeView getBadgeView() {
        return this.badgeView;
    }

    @NotNull
    public final TextAtomV2View getCaptionView() {
        return this.captionView;
    }

    @NotNull
    public final CheckBoxView getCheckBox() {
        return this.checkBox;
    }

    @NotNull
    public final CsCheckBoxCutOutView getCheckBoxCutOutView() {
        return this.checkBoxCutOutView;
    }

    @NotNull
    public final TextAtomV2View getCountValueTextAtom() {
        return this.countValueTextAtom;
    }

    @NotNull
    public final BadgeView getCounterBadgeView() {
        return this.counterBadgeView;
    }

    @NotNull
    public final Barrier getImageBarrier() {
        return this.imageBarrier;
    }

    @NotNull
    public final DeliveryAdultImageView getImageView() {
        return this.imageView;
    }

    @NotNull
    public final IconButtonV3View getMinusIconButton() {
        return this.minusIconButton;
    }

    @NotNull
    public final IconButtonV3View getPlusIconButton() {
        return this.plusIconButton;
    }

    @NotNull
    public final ProductMediaImageView getProductImageView() {
        return this.productImageView;
    }

    @NotNull
    public final TextAtomV2View getSubtitleView() {
        return this.subtitleView;
    }

    @NotNull
    public final HorizontalFlexAtomsLayout getTitleLayout() {
        return this.titleLayout;
    }

    public final void updateGuidelineStartTextInfo(Integer imageWidth) {
        this.guidelineStartTextInfo.a((imageWidth != null ? imageWidth.intValue() : IMAGE_VIEW_SIZE) + MARGIN_16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductToPayWidgetView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41615V = 0;
        guideline.setLayoutParams(bVar);
        int i12 = MARGIN_12;
        guideline.a(i12);
        this.guidelineTop = guideline;
        Guideline guideline2 = new Guideline(context);
        guideline2.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, 0);
        bVar2.f41615V = 1;
        guideline2.setLayoutParams(bVar2);
        int i13 = IMAGE_VIEW_SIZE;
        guideline2.a(MARGIN_16 + i13);
        this.guidelineStartTextInfo = guideline2;
        DeliveryAdultImageView deliveryAdultImageView = new DeliveryAdultImageView(context, null, 0, 6, null);
        deliveryAdultImageView.setId(View.generateViewId());
        deliveryAdultImageView.setLayoutParams(new ConstraintLayout.b(i13, i13));
        deliveryAdultImageView.setBackgroundColor(a.getColor(context, R$color.layer_floor_1));
        deliveryAdultImageView.setCornerRadius(IMAGE_VIEW_CORNER_RADIUS);
        this.imageView = deliveryAdultImageView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(View.generateViewId());
        badgeView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.counterBadgeView = badgeView;
        ProductMediaImageView productMediaImageView = new ProductMediaImageView(context, null, 0, 6, null);
        productMediaImageView.setId(View.generateViewId());
        productMediaImageView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        setMinWidth(i13);
        setMinHeight(i13);
        this.productImageView = productMediaImageView;
        CsCheckBoxCutOutView csCheckBoxCutOutView = new CsCheckBoxCutOutView(context, null, 0, 6, null);
        csCheckBoxCutOutView.setId(View.generateViewId());
        int i14 = cutOutSize;
        csCheckBoxCutOutView.setLayoutParams(new ConstraintLayout.b(i14, i14));
        csCheckBoxCutOutView.setForeground(new ColorDrawable(context.getColor(UniColors.LAYER_FLOOR_1.getResId())));
        csCheckBoxCutOutView.setVisibility(8);
        this.checkBoxCutOutView = csCheckBoxCutOutView;
        CheckBoxView checkBoxView = new CheckBoxView(context, null, 0, 6, null);
        checkBoxView.setId(View.generateViewId());
        checkBoxView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.checkBox = checkBoxView;
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.setLayoutParams(new ConstraintLayout.b(0, 0));
        barrier.setReferencedIds(new int[]{deliveryAdultImageView.getId(), productMediaImageView.getId(), guideline2.getId()});
        barrier.f(6);
        barrier.e(i12);
        barrier.d(false);
        this.imageBarrier = barrier;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = new HorizontalFlexAtomsLayout(context, null, 0, 6, null);
        horizontalFlexAtomsLayout.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41604K = 2;
        bVar3.f41616W = true;
        bVar3.f41595B = 0;
        horizontalFlexAtomsLayout.setLayoutParams(bVar3);
        this.titleLayout = horizontalFlexAtomsLayout;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b b11 = c.b(0, -2, textAtomV2View);
        b11.f41616W = true;
        b11.f41595B = 0;
        textAtomV2View.setLayoutParams(b11);
        this.subtitleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b b12 = c.b(0, -2, textAtomV2View2);
        b12.f41616W = true;
        b12.f41595B = 0;
        textAtomV2View2.setLayoutParams(b12);
        this.captionView = textAtomV2View2;
        BadgeView badgeView2 = new BadgeView(context, null, 0, 0, 14, null);
        badgeView2.setId(View.generateViewId());
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.f41595B = 0;
        badgeView2.setLayoutParams(bVar4);
        badgeView2.setVisibility(8);
        this.badgeView = badgeView2;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(View.generateViewId());
        iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        iconButtonV3View.setVisibility(8);
        this.minusIconButton = iconButtonV3View;
        TextAtomV2View textAtomV2View3 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b b13 = c.b(0, -2, textAtomV2View3);
        textAtomV2View3.setMinWidth(ResourceExtKt.toPx(26, context));
        textAtomV2View3.setLayoutParams(b13);
        textAtomV2View3.setVisibility(8);
        this.countValueTextAtom = textAtomV2View3;
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View2.setId(View.generateViewId());
        iconButtonV3View2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        iconButtonV3View2.setVisibility(8);
        this.plusIconButton = iconButtonV3View2;
        initView();
        setupConstraints();
    }
}
