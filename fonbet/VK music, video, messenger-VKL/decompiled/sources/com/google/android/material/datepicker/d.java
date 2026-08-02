package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import xsna.l2r0;
import xsna.qg90;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes13.dex */
public final class d extends RecyclerView.n {
    public final Calendar b = l2r0.e(null);
    public final Calendar c = l2r0.e(null);
    public final /* synthetic */ c d;

    public d(c cVar) {
        this.d = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
        if ((recyclerView.getAdapter() instanceof l) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            l lVar = (l) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            c cVar = this.d;
            Iterator it = cVar.j.ia().iterator();
            while (it.hasNext()) {
                qg90 qg90Var = (qg90) it.next();
                F f = qg90Var.a;
                S s = qg90Var.b;
                if (f != 0 && s != 0) {
                    long longValue = ((Long) f).longValue();
                    Calendar calendar = this.b;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = ((Long) s).longValue();
                    Calendar calendar2 = this.c;
                    calendar2.setTimeInMillis(longValue2);
                    int i = calendar.get(1) - lVar.c.k.b.d;
                    int i2 = calendar2.get(1) - lVar.c.k.b.d;
                    View findViewByPosition = gridLayoutManager.findViewByPosition(i);
                    View findViewByPosition2 = gridLayoutManager.findViewByPosition(i2);
                    int i3 = gridLayoutManager.s;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.s * i6);
                        if (findViewByPosition3 != null) {
                            int top = findViewByPosition3.getTop() + cVar.o.d.a.top;
                            int bottom = findViewByPosition3.getBottom() - cVar.o.d.a.bottom;
                            canvas.drawRect((i6 != i4 || findViewByPosition == null) ? 0 : (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft(), top, (i6 != i5 || findViewByPosition2 == null) ? recyclerView.getWidth() : (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft(), bottom, cVar.o.h);
                        }
                    }
                }
            }
        }
    }
}
