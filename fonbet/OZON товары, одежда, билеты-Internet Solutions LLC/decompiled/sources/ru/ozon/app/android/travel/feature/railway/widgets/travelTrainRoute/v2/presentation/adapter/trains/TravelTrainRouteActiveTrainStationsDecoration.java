package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/adapter/trains/TravelTrainRouteActiveTrainStationsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "", "firstInd", "lastInd", "<init>", "(Landroid/content/Context;II)V", "Landroid/graphics/Paint;", "createPaint", "()Landroid/graphics/Paint;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/content/Context;", "I", "paint", "Landroid/graphics/Paint;", "leftBiasLine", "circleVerticalBias", "lineVerticalBias", "", "circleRadius", "F", "verticalBias", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainRouteActiveTrainStationsDecoration extends RecyclerView.n {
    private final float circleRadius;
    private final int circleVerticalBias;

    @NotNull
    private final Context context;
    private final int firstInd;
    private final int lastInd;
    private final int leftBiasLine;
    private final int lineVerticalBias;

    @NotNull
    private final Paint paint;
    private final int verticalBias;

    public TravelTrainRouteActiveTrainStationsDecoration(@NotNull Context context, int i11, int i12) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.firstInd = i11;
        this.lastInd = i12;
        this.paint = createPaint();
        this.leftBiasLine = ResourceExtKt.toPx(22, context);
        this.circleVerticalBias = ResourceExtKt.toPx(8, context);
        this.lineVerticalBias = ResourceExtKt.toPx(12, context);
        this.circleRadius = ResourceExtKt.toPxF(4, context);
        this.verticalBias = ResourceExtKt.toPx(4, context);
    }

    private final Paint createPaint() {
        Paint paint = new Paint();
        paint.setStrokeWidth(ResourceExtKt.toPxF(2, this.context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ThemeExtKt.themeColor(this.context, R$attr.bgActionPrimary));
        return paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        View childAt;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        View childAt2 = parent.getChildAt(this.firstInd);
        if (childAt2 == null || (childAt = parent.getChildAt(this.lastInd)) == null) {
            return;
        }
        canvas.drawCircle(childAt2.getX() - this.leftBiasLine, childAt2.getY() + this.circleVerticalBias, this.circleRadius, this.paint);
        canvas.drawCircle(childAt.getX() - this.leftBiasLine, childAt.getY() + this.circleVerticalBias, this.circleRadius, this.paint);
        canvas.drawLine(childAt2.getX() - this.leftBiasLine, childAt2.getY() + this.lineVerticalBias, childAt.getX() - this.leftBiasLine, childAt.getY() + this.verticalBias, this.paint);
    }
}
