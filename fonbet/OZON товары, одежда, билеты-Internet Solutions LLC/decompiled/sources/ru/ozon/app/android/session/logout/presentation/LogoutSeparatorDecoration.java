package ru.ozon.app.android.session.logout.presentation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/logout/presentation/LogoutSeparatorDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "drawSeparator", "(Landroid/view/View;Landroid/graphics/Canvas;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "separatorHeight", "F", "startMargin", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutSeparatorDecoration extends RecyclerView.n {

    @NotNull
    private final Paint paint;
    private final float separatorHeight;
    private final float startMargin;

    public LogoutSeparatorDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(1, context);
        this.separatorHeight = pxF;
        this.startMargin = ResourceExtKt.toPxF(16, context);
        Paint paint = new Paint(1);
        paint.setColor(ResourceExtKt.color(context, R$color.oz_semantic_separator));
        paint.setStrokeWidth(pxF);
        this.paint = paint;
    }

    private final void drawSeparator(View view, Canvas canvas) {
        canvas.drawRect(view.getLeft() + this.startMargin, view.getBottom() + this.separatorHeight, view.getRight(), view.getBottom(), this.paint);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator it = l.h(l.h(l.w(l.h(C5316f0.b(parent), new LogoutSeparatorDecoration$onDrawOver$1(h.o(0, state.b()), parent)), new LogoutSeparatorDecoration$onDrawOver$2(parent)), LogoutSeparatorDecoration$onDrawOver$$inlined$filterIsInstance$1.INSTANCE), LogoutSeparatorDecoration$onDrawOver$3.INSTANCE).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return;
            }
            View itemView = ((LogoutWidgetViewHolder) aVar.next()).itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            drawSeparator(itemView, canvas);
        }
    }
}
