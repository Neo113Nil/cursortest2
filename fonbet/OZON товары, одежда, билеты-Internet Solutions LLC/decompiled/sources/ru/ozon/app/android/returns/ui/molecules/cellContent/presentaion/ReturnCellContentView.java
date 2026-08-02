package ru.ozon.app.android.returns.ui.molecules.cellContent.presentaion;

import Fj.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.cellContent.viewObject.ReturnCellContentVO;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020(H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/ReturnCellContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "marginTopDescription", "marginStartPrice", "marginTopButtons", "marginTopSeparator", "marginTopTotals", "marginHorizontal", "separatorHeight", "titleTextAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTextAtomView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "rowsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRowsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "separatorView", "Landroid/view/View;", "totalTextAtomView", "getTotalTextAtomView", "totalPriceAtomView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getTotalPriceAtomView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "descriptionTextAtomView", "getDescriptionTextAtomView", "buttonsVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getButtonsVAL", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "bindSeparator", "", "separator", "Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$Separator;", "setupConstraints", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCellContentView extends ConstraintLayout {

    @NotNull
    private final VerticalAtomsLayout buttonsVAL;

    @NotNull
    private final TextAtomV2View descriptionTextAtomView;
    private final int marginHorizontal;
    private final int marginStartPrice;
    private final int marginTopButtons;
    private final int marginTopDescription;
    private final int marginTopSeparator;
    private final int marginTopTotals;

    @NotNull
    private final RecyclerView rowsRecyclerView;
    private final int separatorHeight;

    @NotNull
    private final View separatorView;

    @NotNull
    private final TextAtomV2View titleTextAtomView;

    @NotNull
    private final PriceAtomView totalPriceAtomView;

    @NotNull
    private final TextAtomV2View totalTextAtomView;

    public /* synthetic */ ReturnCellContentView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new ReturnCellContentView$setupConstraints$1(this));
    }

    public final void bindSeparator(@NotNull ReturnCellContentVO.Separator separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        View view = this.separatorView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(styleParser.parseColor(context, separator.getColor(), UniColors.GRAPHIC_NEUTRAL.getResId()));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        float height = separator.getHeight();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams.height = UiExtKt.toPx(height, context2);
        view.setLayoutParams(layoutParams);
    }

    @NotNull
    public final VerticalAtomsLayout getButtonsVAL() {
        return this.buttonsVAL;
    }

    @NotNull
    public final TextAtomV2View getDescriptionTextAtomView() {
        return this.descriptionTextAtomView;
    }

    @NotNull
    public final RecyclerView getRowsRecyclerView() {
        return this.rowsRecyclerView;
    }

    @NotNull
    public final TextAtomV2View getTitleTextAtomView() {
        return this.titleTextAtomView;
    }

    @NotNull
    public final PriceAtomView getTotalPriceAtomView() {
        return this.totalPriceAtomView;
    }

    @NotNull
    public final TextAtomV2View getTotalTextAtomView() {
        return this.totalTextAtomView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnCellContentView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.marginTopDescription = UiExtKt.toPx(2, context);
        int px = UiExtKt.toPx(8, context);
        this.marginStartPrice = px;
        this.marginTopButtons = UiExtKt.toPx(10, context);
        this.marginTopSeparator = UiExtKt.toPx(12, context);
        this.marginTopTotals = UiExtKt.toPx(12, context);
        int px2 = UiExtKt.toPx(16, context);
        this.marginHorizontal = px2;
        int px3 = UiExtKt.toPx(0.5f, context);
        this.separatorHeight = px3;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b b11 = c.b(0, -2, textAtomV2View);
        int i12 = ((ViewGroup.MarginLayoutParams) b11).topMargin;
        int i13 = ((ViewGroup.MarginLayoutParams) b11).bottomMargin;
        b11.setMarginStart(px2);
        ((ViewGroup.MarginLayoutParams) b11).topMargin = i12;
        b11.setMarginEnd(px2);
        ((ViewGroup.MarginLayoutParams) b11).bottomMargin = i13;
        textAtomV2View.setLayoutParams(b11);
        this.titleTextAtomView = textAtomV2View;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.rowsRecyclerView = recyclerView;
        View view = new View(context);
        view.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, px3);
        int i14 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
        int i15 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        bVar.setMarginStart(px2);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i14;
        bVar.setMarginEnd(px2);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i15;
        view.setLayoutParams(bVar);
        this.separatorView = view;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b b12 = c.b(0, -2, textAtomV2View2);
        int i16 = ((ViewGroup.MarginLayoutParams) b12).topMargin;
        int i17 = ((ViewGroup.MarginLayoutParams) b12).bottomMargin;
        b12.setMarginStart(px2);
        ((ViewGroup.MarginLayoutParams) b12).topMargin = i16;
        b12.setMarginEnd(px);
        ((ViewGroup.MarginLayoutParams) b12).bottomMargin = i17;
        textAtomV2View2.setLayoutParams(b12);
        this.totalTextAtomView = textAtomV2View2;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        priceAtomView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        int marginStart = bVar2.getMarginStart();
        int i18 = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
        int i19 = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        bVar2.setMarginStart(marginStart);
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = i18;
        bVar2.setMarginEnd(px2);
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = i19;
        priceAtomView.setLayoutParams(bVar2);
        this.totalPriceAtomView = priceAtomView;
        TextAtomV2View textAtomV2View3 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View3.setId(View.generateViewId());
        textAtomV2View3.setVisibility(8);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-1, -2);
        int i21 = ((ViewGroup.MarginLayoutParams) bVar3).topMargin;
        int marginEnd = bVar3.getMarginEnd();
        int i22 = ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
        bVar3.setMarginStart(px2);
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = i21;
        bVar3.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = i22;
        bVar3.f41616W = true;
        textAtomV2View3.setLayoutParams(bVar3);
        this.descriptionTextAtomView = textAtomV2View3;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        verticalAtomsLayout.setLayoutParams(new ConstraintLayout.b(-1, -2));
        verticalAtomsLayout.setDecorator(new ButtonsDecoration(context));
        this.buttonsVAL = verticalAtomsLayout;
        setId(View.generateViewId());
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        addView(textAtomV2View);
        addView(recyclerView);
        addView(view);
        addView(textAtomV2View2);
        addView(priceAtomView);
        addView(textAtomV2View3);
        addView(verticalAtomsLayout);
        setupConstraints();
    }
}
