package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.erf;
import defpackage.g7e;
import defpackage.jy0;
import defpackage.lhk;
import defpackage.qrf;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e extends erf {
    public final Calendar a = lhk.e(null);
    public final Calendar b = lhk.e(null);
    public final /* synthetic */ MaterialCalendar c;

    public e(MaterialCalendar materialCalendar) {
        this.c = materialCalendar;
    }

    @Override // defpackage.erf
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        if ((recyclerView.getAdapter() instanceof q) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            q qVar = (q) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.c;
            ((SingleDateSelector) materialCalendar.c).getClass();
            Iterator it = new ArrayList().iterator();
            while (it.hasNext()) {
                g7e g7eVar = (g7e) it.next();
                Object obj = g7eVar.a;
                if (obj != null && g7eVar.b != null) {
                    long longValue = ((Long) obj).longValue();
                    Calendar calendar = this.a;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = ((Long) g7eVar.b).longValue();
                    Calendar calendar2 = this.b;
                    calendar2.setTimeInMillis(longValue2);
                    int i = calendar.get(1) - qVar.a.d.a.c;
                    int i2 = calendar2.get(1) - qVar.a.d.a.c;
                    View findViewByPosition = gridLayoutManager.findViewByPosition(i);
                    View findViewByPosition2 = gridLayoutManager.findViewByPosition(i2);
                    int i3 = gridLayoutManager.b;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.b * i6);
                        if (findViewByPosition3 != null) {
                            int top = findViewByPosition3.getTop() + ((Rect) ((jy0) materialCalendar.g.d).b).top;
                            int bottom = findViewByPosition3.getBottom() - ((Rect) ((jy0) materialCalendar.g.d).b).bottom;
                            canvas.drawRect((i6 != i4 || findViewByPosition == null) ? 0 : (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft(), top, (i6 != i5 || findViewByPosition2 == null) ? recyclerView.getWidth() : (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft(), bottom, (Paint) materialCalendar.g.h);
                        }
                    }
                }
            }
        }
    }
}
