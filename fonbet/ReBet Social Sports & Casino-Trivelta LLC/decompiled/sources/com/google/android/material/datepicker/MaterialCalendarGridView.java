package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import java.util.Calendar;
import x0.C6774c;
import y0.z;

/* loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f35272a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35273b;

    public class a extends C2075a {
        public a() {
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.y0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public static boolean e(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    public final void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().m());
        } else if (i10 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q getAdapter2() {
        return (q) super.getAdapter();
    }

    public final View c(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a10;
        int d10;
        int a11;
        int d11;
        int width;
        int i10;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        q adapter = materialCalendarGridView.getAdapter();
        DateSelector dateSelector = adapter.f35422b;
        b bVar = adapter.f35424d;
        int max = Math.max(adapter.b(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(adapter.m(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        for (C6774c c6774c : dateSelector.G()) {
            Object obj = c6774c.f67817a;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (c6774c.f67818b != null) {
                Long l10 = (Long) obj;
                long longValue = l10.longValue();
                Long l11 = (Long) c6774c.f67818b;
                long longValue2 = l11.longValue();
                if (!e(item, item2, l10, l11)) {
                    boolean j10 = xa.o.j(materialCalendarGridView);
                    if (longValue < item.longValue()) {
                        d10 = adapter.h(max) ? 0 : !j10 ? materialCalendarGridView.c(max - 1).getRight() : materialCalendarGridView.c(max - 1).getLeft();
                        a10 = max;
                    } else {
                        materialCalendarGridView.f35272a.setTimeInMillis(longValue);
                        a10 = adapter.a(materialCalendarGridView.f35272a.get(5));
                        d10 = d(materialCalendarGridView.c(a10));
                    }
                    if (longValue2 > item2.longValue()) {
                        d11 = adapter.i(min) ? materialCalendarGridView.getWidth() : !j10 ? materialCalendarGridView.c(min).getRight() : materialCalendarGridView.c(min).getLeft();
                        a11 = min;
                    } else {
                        materialCalendarGridView.f35272a.setTimeInMillis(longValue2);
                        a11 = adapter.a(materialCalendarGridView.f35272a.get(5));
                        d11 = d(materialCalendarGridView.c(a11));
                    }
                    int itemId = (int) adapter.getItemId(a10);
                    int i11 = max;
                    int i12 = min;
                    int itemId2 = (int) adapter.getItemId(a11);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View c10 = materialCalendarGridView.c(numColumns);
                        int top = c10.getTop() + bVar.f35294a.c();
                        q qVar = adapter;
                        int bottom = c10.getBottom() - bVar.f35294a.b();
                        if (j10) {
                            int i13 = a11 > numColumns2 ? 0 : d11;
                            width = numColumns > a10 ? getWidth() : d10;
                            i10 = i13;
                        } else {
                            i10 = numColumns > a10 ? 0 : d10;
                            width = a11 > numColumns2 ? getWidth() : d11;
                        }
                        canvas.drawRect(i10, top, width, bottom, bVar.f35301h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = qVar;
                    }
                    materialCalendarGridView = this;
                    max = i11;
                    min = i12;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().b() && selectedItemPosition <= getAdapter().m())) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f35273b) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35272a = w.m();
        if (n.v0(getContext())) {
            setNextFocusLeftId(ia.g.f48419a);
            setNextFocusRightId(ia.g.f48425d);
        }
        this.f35273b = n.x0(getContext());
        AbstractC2082d0.l0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof q)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), q.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
