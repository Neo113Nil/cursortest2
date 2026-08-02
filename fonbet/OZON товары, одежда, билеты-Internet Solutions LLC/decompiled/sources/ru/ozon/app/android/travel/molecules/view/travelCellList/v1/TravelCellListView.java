package ru.ozon.app.android.travel.molecules.view.travelCellList.v1;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gk0.q;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@InterfaceC3999a
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J#\u0010%\u001a\u00020\f2\u0014\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020#0\"0!¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "newTopMargin", "", "updateCellListTopMarginIfNecessary", "(I)V", "newTopRadius", "newBottomRadius", "newBackgroundColor", "updateCellListBackgroundIfNecessary", "(III)V", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "bind", "(Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;Lkotlin/jvm/functions/Function1;)V", "left", "top", "right", "bottom", "updateTitleMargin", "(IIII)V", "", "Lkotlin/reflect/d;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "types", "makeCellTransparent", "(Ljava/util/Set;)V", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTextView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellListAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "cellList", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "backgroundProducer", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "topRadius", "I", "bottomRadius", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelCellListView extends LinearLayout {
    public static final int $stable = 8;

    @NotNull
    private final RoundedBackgroundProducer backgroundProducer;
    private int bottomRadius;

    @NotNull
    private final VerticalAtomsLayout cellList;

    @NotNull
    private final AtomsAdapter cellListAdapter;

    @NotNull
    private final TextAtomView titleTextView;
    private int topRadius;

    public /* synthetic */ TravelCellListView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void updateCellListBackgroundIfNecessary(int newTopRadius, int newBottomRadius, int newBackgroundColor) {
        Paint paint;
        Paint paint2;
        Drawable background = this.cellList.getBackground();
        ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable != null && this.topRadius == newTopRadius && this.bottomRadius == newBottomRadius) {
            if ((shapeDrawable != null && (paint2 = shapeDrawable.getPaint()) != null && paint2.getColor() == newBackgroundColor) || shapeDrawable == null || (paint = shapeDrawable.getPaint()) == null) {
                return;
            }
            paint.setColor(newBackgroundColor);
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

    private final void updateCellListTopMarginIfNecessary(int newTopMargin) {
        ViewGroup.LayoutParams layoutParams = this.cellList.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || layoutParams2.topMargin == newTopMargin) {
            return;
        }
        layoutParams2.topMargin = newTopMargin;
        this.cellList.setLayoutParams(layoutParams2);
    }

    public static /* synthetic */ void updateTitleMargin$default(TravelCellListView travelCellListView, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = travelCellListView.titleTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i11 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        }
        if ((i15 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = travelCellListView.titleTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i12 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        }
        if ((i15 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = travelCellListView.titleTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            i13 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        }
        if ((i15 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = travelCellListView.titleTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            i14 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        }
        travelCellListView.updateTitleMargin(i11, i12, i13, i14);
    }

    public final void bind(@NotNull TravelCellListVO item, Function1<? super AtomAction, Unit> action) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomHolderKt.bindOrGone$default(this.titleTextView, item.getTitle(), null, 2, null);
        updateCellListTopMarginIfNecessary(item.getCellsTopMargin());
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

    public final void makeCellTransparent(@NotNull Set<? extends d<? extends BaseCellWithSubtitleView>> types) {
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

    public final void updateTitleMargin(int left, int top, int right, int bottom) {
        TextAtomView textAtomView = this.titleTextView;
        ViewGroup.LayoutParams layoutParams = textAtomView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(left, top, right, bottom);
        textAtomView.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCellListView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomView textAtomView = (TextAtomView) q.f64554a.g(N.b(TextAtomView.class), context);
        textAtomView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textAtomView.setVisibility(8);
        this.titleTextView = textAtomView;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.cellListAdapter = atomsAdapter;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        verticalAtomsLayout.setClipToOutline(true);
        verticalAtomsLayout.setAdapter(atomsAdapter);
        this.cellList = verticalAtomsLayout;
        this.backgroundProducer = new RoundedBackgroundProducer();
        setOrientation(1);
        addView(textAtomView);
        addView(verticalAtomsLayout);
    }
}
