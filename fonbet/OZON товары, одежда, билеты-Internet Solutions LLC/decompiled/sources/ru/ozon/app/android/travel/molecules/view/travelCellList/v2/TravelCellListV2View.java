package ru.ozon.app.android.travel.molecules.view.travelCellList.v2;

import Ef0.c;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\u000e2\u0014\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f0\u001e¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelCellList/v2/TravelCellListV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "cellsTopMargin", "blockBottomMargin", "blockTitleBottomMargin", "", "updateCellListMarginsIfNecessary", "(III)V", "newTopRadius", "newBottomRadius", "newBackgroundColor", "updateCellListBackgroundIfNecessary", "setupConstraint", "()V", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v2/TravelCellListV2VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "bind", "(Lru/ozon/app/android/travel/molecules/view/travelCellList/v2/TravelCellListV2VO;Lkotlin/jvm/functions/Function1;)V", "", "Lkotlin/reflect/d;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "types", "makeCellTransparent", "(Ljava/util/Set;)V", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTextView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellListAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "cellList", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Landroidx/constraintlayout/widget/Barrier;", "horizontalBarrier", "Landroidx/constraintlayout/widget/Barrier;", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "backgroundProducer", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "topRadius", "I", "bottomRadius", "dp4", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelCellListV2View extends ConstraintLayout {

    @NotNull
    private final RoundedBackgroundProducer backgroundProducer;
    private int bottomRadius;

    @NotNull
    private final VerticalAtomsLayout cellList;

    @NotNull
    private final AtomsAdapter cellListAdapter;
    private final int dp4;

    @NotNull
    private final Barrier horizontalBarrier;

    @NotNull
    private final TextAtomV2View subtitleTextView;

    @NotNull
    private final TextAtomView titleTextView;
    private int topRadius;

    public /* synthetic */ TravelCellListV2View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void setupConstraint() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.titleTextView);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.titleTextView);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.titleTextView, this.subtitleTextView, this.dp4);
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, this.titleTextView, this.cellList);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.subtitleTextView, this.titleTextView);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.subtitleTextView);
        ConstraintLayoutExtensionsKt.baselineToBaseline(dVar, this.subtitleTextView, this.titleTextView);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.cellList, this.horizontalBarrier);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.cellList);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.cellList);
        dVar.f(this);
    }

    private final void updateCellListBackgroundIfNecessary(int newTopRadius, int newBottomRadius, int newBackgroundColor) {
        Paint paint;
        Drawable background = this.cellList.getBackground();
        ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable != null && this.topRadius == newTopRadius && this.bottomRadius == newBottomRadius) {
            Paint paint2 = shapeDrawable.getPaint();
            if ((paint2 == null || paint2.getColor() != newBackgroundColor) && (paint = shapeDrawable.getPaint()) != null) {
                paint.setColor(newBackgroundColor);
                return;
            }
            return;
        }
        this.topRadius = newTopRadius;
        this.bottomRadius = newBottomRadius;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(newTopRadius, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float pxF2 = ResourceExtKt.toPxF(newBottomRadius, context2);
        this.cellList.setBackground(this.backgroundProducer.produce(newBackgroundColor, pxF, pxF, pxF2, pxF2));
    }

    private final void updateCellListMarginsIfNecessary(int cellsTopMargin, int blockBottomMargin, int blockTitleBottomMargin) {
        ViewExtKt.updatePadding$default(this, 0, cellsTopMargin, 0, blockBottomMargin, 5, null);
        ViewGroup.LayoutParams layoutParams = this.titleTextView.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null || ((ViewGroup.MarginLayoutParams) bVar).bottomMargin == blockTitleBottomMargin) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = blockTitleBottomMargin;
        this.titleTextView.setLayoutParams(bVar);
    }

    public final void bind(@NotNull TravelCellListV2VO item, Function1<? super AtomAction, Unit> action) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomHolderKt.bindOrGone$default(this.titleTextView, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTextView, item.getSubtitle(), null, 2, null);
        updateCellListMarginsIfNecessary(item.getCellsTopMargin(), item.getBlockBottomMargin(), item.getBlockTitleBottomMargin());
        int topRadius = item.getTopRadius();
        int bottomRadius = item.getBottomRadius();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        updateCellListBackgroundIfNecessary(topRadius, bottomRadius, styleParser.parseColor(context, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        AtomsAdapter atomsAdapter = this.cellListAdapter;
        atomsAdapter.setOnAction(action);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        atomsAdapter.bind(context2, item.getCells());
    }

    public final void makeCellTransparent(@NotNull Set<? extends kotlin.reflect.d<? extends BaseCellWithSubtitleView>> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        VerticalAtomsLayout verticalAtomsLayout = this.cellList;
        int childCount = verticalAtomsLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = verticalAtomsLayout.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (C7714v.A(types, N.b(childAt.getClass()))) {
                childAt.setBackgroundColor(0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCellListV2View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomView.class), context);
        TextAtomView textAtomView = (TextAtomView) g10;
        ConstraintLayout.b b11 = c.b(textAtomView, R$id.travelCellListTitleTextView, -2, -2);
        b11.f41598E = 0.0f;
        b11.f41603J = 1;
        b11.f41616W = true;
        textAtomView.setLayoutParams(b11);
        textAtomView.setVisibility(8);
        addView(g10);
        this.titleTextView = textAtomView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = textAtomV2View == null ? new TextAtomV2View(context, null, 0, 6, null) : textAtomV2View;
        textAtomV2View2.setId(R$id.travelCellListSubtitleTextView);
        textAtomV2View2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View2.setVisibility(8);
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.subtitleTextView = textAtomV2View2;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.cellListAdapter = atomsAdapter;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.travelCellListCellList);
        verticalAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        verticalAtomsLayout.setClipToOutline(true);
        verticalAtomsLayout.setAdapter(atomsAdapter);
        addView(verticalAtomsLayout);
        this.cellList = verticalAtomsLayout;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.travelCellListHorizontalBarrier);
        barrier.f(3);
        barrier.setReferencedIds(new int[]{textAtomView.getId(), textAtomV2View2.getId()});
        addView(barrier);
        this.horizontalBarrier = barrier;
        this.backgroundProducer = new RoundedBackgroundProducer();
        this.dp4 = ResourceExtKt.toPx(4, context);
        setupConstraint();
    }
}
