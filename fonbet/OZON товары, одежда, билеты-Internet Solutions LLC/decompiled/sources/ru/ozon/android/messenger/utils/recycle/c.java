package ru.ozon.android.messenger.utils.recycle;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.i;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes10.dex */
public final class c extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i.d f91975a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91976b;

    /* renamed from: c, reason: collision with root package name */
    private final int f91977c;

    /* renamed from: d, reason: collision with root package name */
    private View f91978d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f91979e;

    public c(@NotNull i.d headerListener, int i11, int i12) {
        Intrinsics.checkNotNullParameter(headerListener, "headerListener");
        this.f91975a = headerListener;
        this.f91976b = i11;
        this.f91977c = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c11, parent, state);
        Iterator it = l.h(C5316f0.b(parent), new b(this, parent)).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return;
            }
            View view = (View) aVar.next();
            view.setVisibility(view.getTop() > this.f91976b ? 0 : 8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int childAdapterPosition;
        i.d dVar;
        Object obj;
        int save;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c11, parent, state);
        View childAt = parent.getChildAt(0);
        if (childAt == null || (childAdapterPosition = parent.getChildAdapterPosition(childAt)) == -1) {
            return;
        }
        while (true) {
            dVar = this.f91975a;
            if (-1 >= childAdapterPosition) {
                childAdapterPosition = -1;
                break;
            } else if (dVar.b(childAdapterPosition)) {
                break;
            } else {
                childAdapterPosition--;
            }
        }
        if (childAdapterPosition == -1) {
            return;
        }
        View view = this.f91978d;
        dVar.getClass();
        int i11 = R$layout.m_block_date;
        Integer num = this.f91979e;
        if (num == null || num.intValue() != i11 || view == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View inflate = ru.ozon.android.messenger.utils.c.c(context).inflate(i11, (ViewGroup) parent, false);
            Intrinsics.f(inflate);
            s.g(inflate, 0, this.f91976b, 0, 0, 13);
            this.f91979e = Integer.valueOf(i11);
            this.f91978d = inflate;
            view = inflate;
        }
        dVar.a(childAdapterPosition, view);
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824), parent.getPaddingRight() + parent.getPaddingLeft(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0), parent.getPaddingBottom() + parent.getPaddingTop(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        boolean b11 = parent.getChildAdapterPosition(childAt) == -1 ? false : dVar.b(parent.getChildAdapterPosition(childAt));
        int i12 = this.f91976b;
        s.e(view, Boolean.valueOf(!b11 || childAt.getTop() <= i12));
        if (view.getVisibility() == 8) {
            return;
        }
        int bottom = view.getBottom();
        int i13 = this.f91977c;
        int i14 = bottom + i13;
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                obj = null;
                break;
            }
            obj = c5314e0.next();
            View view2 = (View) obj;
            if (view2.getBottom() + i12 > i14 && view2.getTop() <= i14) {
                break;
            }
        }
        View view3 = (View) obj;
        if (view3 != null) {
            if (parent.getChildAdapterPosition(view3) != -1 ? dVar.b(parent.getChildAdapterPosition(view3)) : false) {
                float top = (view3.getTop() - view.getHeight()) - i13;
                save = c11.save();
                c11.translate(0.0f, top);
                try {
                    view.draw(c11);
                    return;
                } finally {
                }
            }
        }
        save = c11.save();
        c11.translate(0.0f, 0.0f);
        try {
            view.draw(c11);
        } finally {
        }
    }
}
