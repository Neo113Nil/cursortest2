package ru.ozon.app.android.session.session.presentation.dataList;

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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/session/session/presentation/dataList/SessionDataDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "drawSeparator", "(Landroid/view/View;Landroid/graphics/Canvas;)V", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "separatorHeight", "F", "startMargin", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionDataDecoration extends RecyclerView.n {

    @NotNull
    private final Paint paint;
    private final float separatorHeight;
    private final float startMargin;

    public SessionDataDecoration(@NotNull Context context) {
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
        canvas.drawRect(view.getLeft() + this.startMargin, view.getTop(), view.getRight(), view.getTop() + this.separatorHeight, this.paint);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator it = l.h(C5316f0.b(parent), new SessionDataDecoration$onDrawOver$1(h.o(1, state.b()), parent)).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return;
            } else {
                drawSeparator((View) aVar.next(), c11);
            }
        }
    }
}
