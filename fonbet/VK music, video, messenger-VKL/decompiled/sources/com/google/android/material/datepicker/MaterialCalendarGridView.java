package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import java.util.Calendar;
import java.util.Iterator;
import xsna.a09;
import xsna.iut0;
import xsna.l2r0;
import xsna.qg90;
import xsna.t1u0;
import xsna.xl10;

/* loaded from: classes13.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar b;
    public final boolean c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = l2r0.e(null);
        if (g.Fn(R.attr.windowFullscreen, getContext())) {
            setNextFocusLeftId(R$id.cancel_button);
            setNextFocusRightId(R$id.confirm_button);
        }
        this.c = g.Fn(R$attr.nestedScrollable, getContext());
        iut0.q(this, new xl10());
    }

    @NonNull
    public final h a() {
        return (h) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public final ListAdapter getAdapter() {
        return (h) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((h) super.getAdapter()).notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int a;
        int width;
        int a2;
        int width2;
        int i;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        h hVar = (h) super.getAdapter();
        DateSelector<?> dateSelector = hVar.c;
        Month month = hVar.b;
        a09 a09Var = hVar.e;
        int max = Math.max(hVar.a(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(hVar.c(), materialCalendarGridView.getLastVisiblePosition());
        Long item = hVar.getItem(max);
        Long item2 = hVar.getItem(min);
        Iterator it = dateSelector.ia().iterator();
        while (it.hasNext()) {
            qg90 qg90Var = (qg90) it.next();
            F f = qg90Var.a;
            S s = qg90Var.b;
            if (f == 0) {
                materialCalendarGridView = this;
            } else if (s != 0) {
                Long l = (Long) f;
                long longValue = l.longValue();
                Long l2 = (Long) s;
                long longValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    month = month;
                    it = it;
                    hVar = hVar;
                } else {
                    boolean d = t1u0.d(materialCalendarGridView);
                    long longValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.b;
                    if (longValue < longValue3) {
                        width = max % month.e == 0 ? 0 : !d ? materialCalendarGridView.b(max - 1).getRight() : materialCalendarGridView.b(max - 1).getLeft();
                        a = max;
                    } else {
                        calendar.setTimeInMillis(longValue);
                        a = hVar.a() + (calendar.get(5) - 1);
                        View b = materialCalendarGridView.b(a);
                        width = (b.getWidth() / 2) + b.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        width2 = (min + 1) % month.e == 0 ? materialCalendarGridView.getWidth() : !d ? materialCalendarGridView.b(min).getRight() : materialCalendarGridView.b(min).getLeft();
                        a2 = min;
                    } else {
                        calendar.setTimeInMillis(longValue2);
                        a2 = hVar.a() + (calendar.get(5) - 1);
                        View b2 = materialCalendarGridView.b(a2);
                        width2 = (b2.getWidth() / 2) + b2.getLeft();
                    }
                    int itemId = (int) hVar.getItemId(a);
                    Iterator it2 = it;
                    Month month2 = month;
                    int itemId2 = (int) hVar.getItemId(a2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        h hVar2 = hVar;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View b3 = materialCalendarGridView.b(numColumns);
                        int top = b3.getTop() + a09Var.a.a.top;
                        int i3 = itemId2;
                        int bottom = b3.getBottom() - a09Var.a.a.bottom;
                        if (d) {
                            int i4 = a2 > numColumns2 ? 0 : width2;
                            int width3 = numColumns > a ? getWidth() : width;
                            i = i4;
                            i2 = width3;
                        } else {
                            i = numColumns > a ? 0 : width;
                            i2 = a2 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top, i2, bottom, a09Var.h);
                        itemId++;
                        materialCalendarGridView = this;
                        hVar = hVar2;
                        itemId2 = i3;
                    }
                    materialCalendarGridView = this;
                    month = month2;
                    it = it2;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((h) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((h) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((h) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((h) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.c) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((h) super.getAdapter()).a()) {
            super.setSelection(((h) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (h) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof h)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), h.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
