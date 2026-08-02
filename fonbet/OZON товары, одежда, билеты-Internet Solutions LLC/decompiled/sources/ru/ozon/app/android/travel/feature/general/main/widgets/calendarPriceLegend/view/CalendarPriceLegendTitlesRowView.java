package ru.ozon.app.android.travel.feature.general.main.widgets.calendarPriceLegend.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0016\u0010\u0016\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0002J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendarPriceLegend/view/CalendarPriceLegendTitlesRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "flow", "Landroidx/constraintlayout/helper/widget/Flow;", "cornerRadius", "", "bgSecondaryColor", "bind", "", "titles", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "clearLayout", "placeViews", "views", "Landroid/view/View;", "prepareViews", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarPriceLegendTitlesRowView extends ConstraintLayout {
    private final int bgSecondaryColor;
    private final float cornerRadius;

    @NotNull
    private final Flow flow;

    public /* synthetic */ CalendarPriceLegendTitlesRowView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void clearLayout() {
        if (Intrinsics.d(getChildAt(0), this.flow)) {
            if (getChildCount() > 1) {
                removeViewsInLayout(1, getChildCount() - 1);
            }
        } else {
            if (getChildCount() != 0) {
                removeViewsInLayout(0, getChildCount());
            }
            Flow flow = this.flow;
            addViewInLayout(flow, 0, flow.getLayoutParams(), true);
        }
    }

    private final void placeViews(List<? extends View> views) {
        int[] iArr = new int[views.size()];
        int i11 = 0;
        for (Object obj : views) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            View view = (View) obj;
            addViewInLayout(view, -1, new ConstraintLayout.b(0, -2), true);
            iArr[i11] = view.getId();
            i11 = i12;
        }
        this.flow.setReferencedIds(iArr);
        requestLayout();
        invalidate();
    }

    private final List<View> prepareViews(List<TextDTO> titles) {
        ArrayList arrayList = new ArrayList();
        for (TextDTO textDTO : titles) {
            TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), getContext());
            if (textAtomV2View == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            }
            textAtomV2View.setId(View.generateViewId());
            TextHolderKt.bind$default(textAtomV2View, textDTO, null, 2, null);
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 8; i11++) {
                fArr[i11] = this.cornerRadius;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(this.bgSecondaryColor);
            textAtomV2View.setBackground(shapeDrawable);
            arrayList.add(textAtomV2View);
        }
        return arrayList;
    }

    public final void bind(@NotNull List<TextDTO> titles) {
        Intrinsics.checkNotNullParameter(titles, "titles");
        clearLayout();
        placeViews(prepareViews(titles));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarPriceLegendTitlesRowView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Flow flow = new Flow(context);
        flow.setId(R$id.calendarPriceLegendTitlesRowViewFlow);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        flow.setLayoutParams(bVar);
        flow.setOrientation(0);
        flow.setVerticalAlign(2);
        flow.setHorizontalStyle(2);
        flow.setHorizontalGap(ResourceExtKt.toPx(8, context));
        this.flow = flow;
        this.cornerRadius = ResourceExtKt.toPxF(6, context);
        this.bgSecondaryColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
        addView(flow);
    }
}
