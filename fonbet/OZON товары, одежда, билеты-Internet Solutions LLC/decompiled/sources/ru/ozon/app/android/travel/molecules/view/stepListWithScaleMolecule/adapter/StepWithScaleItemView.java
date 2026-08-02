package ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule.adapter;

import F3.G;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule.StepListWithScaleMoleculeVO;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/adapter/StepWithScaleItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp2", "dp12", "dp16", "circleRadius", "", "hornView", "Landroid/view/View;", "tailView", "circleView", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "descriptionTav", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeVO$StepVO;", "addViews", "placeViews", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StepWithScaleItemView extends ConstraintLayout {
    private final float circleRadius;

    @NotNull
    private final View circleView;

    @NotNull
    private final TextAtomV2View descriptionTav;
    private final int dp12;
    private final int dp16;
    private final int dp2;

    @NotNull
    private final View hornView;

    @NotNull
    private final View tailView;

    @NotNull
    private final TextAtomV2View titleTav;

    public /* synthetic */ StepWithScaleItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.hornView);
        addView(this.tailView);
        addView(this.circleView);
        addView(this.titleTav);
        addView(this.descriptionTav);
    }

    private final void placeViews() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, this.circleView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop(dVar, this.circleView.getId(), 0, this.dp2);
        ConstraintSetExtKt.startToStart$default(dVar, this.hornView.getId(), this.circleView.getId(), 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.hornView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.hornView.getId(), this.circleView.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToTop$default(dVar, this.hornView.getId(), this.circleView.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.tailView.getId(), this.circleView.getId(), 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, this.tailView.getId(), this.circleView.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.tailView.getId(), this.circleView.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.tailView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToEnd(dVar, this.titleTav.getId(), this.circleView.getId(), this.dp12);
        ConstraintSetExtKt.topToTop$default(dVar, this.titleTav.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.titleTav.getId(), 0, 0, 4, null);
        dVar.c0(0.0f, this.titleTav.getId());
        dVar.C(this.titleTav.getId(), true);
        ConstraintSetExtKt.topToBottom$default(dVar, this.descriptionTav.getId(), this.titleTav.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.descriptionTav.getId(), this.titleTav.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.descriptionTav.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.descriptionTav.getId(), 0, 0, 4, null);
        dVar.c0(0.0f, this.descriptionTav.getId());
        dVar.f0(0.0f, this.descriptionTav.getId());
        dVar.C(this.descriptionTav.getId(), true);
        dVar.f(this);
    }

    public final void bind(@NotNull StepListWithScaleMoleculeVO.StepVO item) {
        Paint paint;
        Intrinsics.checkNotNullParameter(item, "item");
        this.hornView.setVisibility(item.getHasHorn() ? 0 : 8);
        this.tailView.setVisibility(item.getHasTail() ? 0 : 8);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getHornColor());
        if (parseColor != null) {
            this.hornView.setBackgroundColor(parseColor.intValue());
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, item.getTailColor());
        if (parseColor2 != null) {
            this.tailView.setBackgroundColor(parseColor2.intValue());
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor3 = styleParser.parseColor(context3, item.getCircleColor());
        if (parseColor3 != null) {
            int intValue = parseColor3.intValue();
            Drawable background = this.circleView.getBackground();
            ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
            if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
                paint.setColor(intValue);
            }
        }
        TextHolderKt.bind$default(this.titleTav, item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.descriptionTav, item.getDescription(), null, 2, null);
        TextAtomV2View textAtomV2View = this.descriptionTav;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int marginBottom = item.getMarginBottom();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = ResourceExtKt.toPx(marginBottom, context4);
        textAtomV2View.setLayoutParams(bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepWithScaleItemView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        this.dp12 = ResourceExtKt.toPx(12, context);
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        float f7 = px2 / 2.0f;
        this.circleRadius = f7;
        View view = new View(context);
        view.setId(R$id.stepWithScaleItemViewHornV);
        view.setLayoutParams(new ConstraintLayout.b(px, 0));
        this.hornView = view;
        View view2 = new View(context);
        view2.setId(R$id.stepWithScaleItemViewTailV);
        view2.setLayoutParams(new ConstraintLayout.b(px, 0));
        this.tailView = view2;
        View view3 = new View(context);
        view3.setId(R$id.stepWithScaleItemViewCircleV);
        view3.setLayoutParams(new ConstraintLayout.b(px2, px2));
        view3.setBackground(new RoundedBackgroundProducer().produce(0, f7));
        this.circleView = view3;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            context2 = context;
            textAtomV2View = new TextAtomV2View(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        G.g(textAtomV2View, R$id.stepWithScaleItemViewTitleTav, -2, -2);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context2);
        textAtomV2View2 = textAtomV2View2 == null ? new TextAtomV2View(context2, null, 0, 6, null) : textAtomV2View2;
        G.g(textAtomV2View2, R$id.stepWithScaleItemViewDescriptionTav, -2, -2);
        this.descriptionTav = textAtomV2View2;
        addViews();
        placeViews();
    }
}
