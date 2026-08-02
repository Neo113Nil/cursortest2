package ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/view/HorizontalIconButtonsContainerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "flow", "Landroidx/constraintlayout/helper/widget/Flow;", "placeViews", "", "views", "", "Landroid/view/View;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HorizontalIconButtonsContainerView extends ConstraintLayout {

    @NotNull
    private final Flow flow;

    public /* synthetic */ HorizontalIconButtonsContainerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void placeViews(@NotNull List<? extends View> views) {
        Intrinsics.checkNotNullParameter(views, "views");
        removeViewsInLayout(1, getChildCount() - 1);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalIconButtonsContainerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Flow flow = new Flow(context);
        flow.setId(R$id.horizontalIconButtonsContainerViewFlow);
        int px = ResourceExtKt.toPx(8, context);
        int px2 = ResourceExtKt.toPx(16, context);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = px2;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = px2;
        flow.setLayoutParams(bVar);
        flow.setOrientation(0);
        flow.setVerticalAlign(2);
        flow.setHorizontalGap(px);
        this.flow = flow;
        addView(flow);
    }
}
