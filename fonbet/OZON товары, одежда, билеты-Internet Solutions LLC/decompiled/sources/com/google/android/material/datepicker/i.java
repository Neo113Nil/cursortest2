package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* loaded from: classes9.dex */
final class i extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f58260a = C.d(null);

    /* renamed from: b, reason: collision with root package name */
    private final Calendar f58261b = C.d(null);

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f58262c;

    i(h hVar) {
        this.f58262c = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.A a11) {
        InterfaceC5846d interfaceC5846d;
        Long l11;
        C5845c c5845c;
        C5845c c5845c2;
        C5845c c5845c3;
        if ((recyclerView.getAdapter() instanceof E) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            E e11 = (E) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            h hVar = this.f58262c;
            interfaceC5846d = hVar.f58248c;
            for (x2.d<Long, Long> dVar : interfaceC5846d.B1()) {
                Long l12 = dVar.f104935a;
                if (l12 != null && (l11 = dVar.f104936b) != null) {
                    long longValue = l12.longValue();
                    Calendar calendar = this.f58260a;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = l11.longValue();
                    Calendar calendar2 = this.f58261b;
                    calendar2.setTimeInMillis(longValue2);
                    int g10 = e11.g(calendar.get(1));
                    int g11 = e11.g(calendar2.get(1));
                    View findViewByPosition = gridLayoutManager.findViewByPosition(g10);
                    View findViewByPosition2 = gridLayoutManager.findViewByPosition(g11);
                    int g12 = g10 / gridLayoutManager.g();
                    int g13 = g11 / gridLayoutManager.g();
                    int i11 = g12;
                    while (i11 <= g13) {
                        View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.g() * i11);
                        if (findViewByPosition3 != null) {
                            int top = findViewByPosition3.getTop();
                            c5845c = hVar.f58252g;
                            int c11 = top + c5845c.f58236d.c();
                            int bottom = findViewByPosition3.getBottom();
                            c5845c2 = hVar.f58252g;
                            int b11 = bottom - c5845c2.f58236d.b();
                            int width = i11 == g12 ? (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft() : 0;
                            int width2 = i11 == g13 ? (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft() : recyclerView.getWidth();
                            c5845c3 = hVar.f58252g;
                            canvas.drawRect(width, c11, width2, b11, c5845c3.f58240h);
                        }
                        i11++;
                    }
                }
            }
        }
    }
}
