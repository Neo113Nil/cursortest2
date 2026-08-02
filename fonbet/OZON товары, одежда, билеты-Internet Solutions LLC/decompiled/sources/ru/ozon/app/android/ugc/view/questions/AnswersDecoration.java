package ru.ozon.app.android.ugc.view.questions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerViewHolder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/view/questions/AnswersDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "dp1", "F", "dp16", "Landroid/graphics/Paint;", "line", "Landroid/graphics/Paint;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnswersDecoration extends RecyclerView.n {
    private final float dp1;
    private final float dp16;

    @NotNull
    private final Paint line;

    public AnswersDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(1);
        this.dp1 = pxF;
        this.dp16 = ResourceExtKt.toPxF(16);
        Paint paint = new Paint();
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        paint.setStrokeWidth(pxF);
        this.line = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        int childCount = parent.getChildCount() - 1;
        int i11 = 0;
        while (i11 < childCount) {
            RecyclerView.C findContainingViewHolder = parent.findContainingViewHolder(parent.getChildAt(i11));
            i11++;
            RecyclerView.C findContainingViewHolder2 = parent.findContainingViewHolder(parent.getChildAt(i11));
            if ((findContainingViewHolder instanceof AnswerViewHolder) && (findContainingViewHolder2 instanceof AnswerViewHolder)) {
                canvas2 = canvas;
                canvas2.drawRect(this.dp16, r1.getBottom(), parent.getWidth(), r1.getBottom() + this.dp1, this.line);
            } else {
                canvas2 = canvas;
            }
            canvas = canvas2;
        }
    }
}
