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
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import java.util.Iterator;
import s7.C9621p;

/* loaded from: classes9.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f58213a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f58214b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f58213a = C.d(null);
        if (p.E(R.attr.windowFullscreen, getContext())) {
            setNextFocusLeftId(ru.ozon.app.android.R.id.cancel_button);
            setNextFocusRightId(ru.ozon.app.android.R.id.confirm_button);
        }
        this.f58214b = p.E(ru.ozon.app.android.R.attr.nestedScrollable, getContext());
        Y.C(this, new o());
    }

    private View b(int i11) {
        return getChildAt(i11 - getFirstVisiblePosition());
    }

    @NonNull
    public final v a() {
        return (v) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public final ListAdapter getAdapter() {
        return (v) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((v) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(@NonNull Canvas canvas) {
        int e11;
        int width;
        int e12;
        int width2;
        int i11;
        int i12;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        v vVar = (v) super.getAdapter();
        InterfaceC5846d<?> interfaceC5846d = vVar.f58314b;
        C5845c c5845c = vVar.f58316d;
        u uVar = vVar.f58313a;
        int max = Math.max(uVar.e(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(vVar.c(), materialCalendarGridView.getLastVisiblePosition());
        Long item = vVar.getItem(max);
        Long item2 = vVar.getItem(min);
        Iterator<x2.d<Long, Long>> it = interfaceC5846d.B1().iterator();
        while (it.hasNext()) {
            x2.d<Long, Long> next = it.next();
            Long l11 = next.f104935a;
            if (l11 != null) {
                Long l12 = next.f104936b;
                if (l12 != null) {
                    Long l13 = l11;
                    long longValue = l13.longValue();
                    Long l14 = l12;
                    long longValue2 = l14.longValue();
                    if (item == null || item2 == null || l13.longValue() > item2.longValue() || l14.longValue() < item.longValue()) {
                        materialCalendarGridView = this;
                        it = it;
                        vVar = vVar;
                    } else {
                        boolean d11 = C9621p.d(materialCalendarGridView);
                        long longValue3 = item.longValue();
                        int i13 = uVar.f58308d;
                        Iterator<x2.d<Long, Long>> it2 = it;
                        Calendar calendar = materialCalendarGridView.f58213a;
                        if (longValue < longValue3) {
                            width = max % i13 == 0 ? 0 : !d11 ? materialCalendarGridView.b(max - 1).getRight() : materialCalendarGridView.b(max - 1).getLeft();
                            e11 = max;
                        } else {
                            calendar.setTimeInMillis(longValue);
                            e11 = uVar.e() + (calendar.get(5) - 1);
                            View b11 = materialCalendarGridView.b(e11);
                            width = (b11.getWidth() / 2) + b11.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            width2 = (min + 1) % i13 == 0 ? materialCalendarGridView.getWidth() : !d11 ? materialCalendarGridView.b(min).getRight() : materialCalendarGridView.b(min).getLeft();
                            e12 = min;
                        } else {
                            calendar.setTimeInMillis(longValue2);
                            e12 = uVar.e() + (calendar.get(5) - 1);
                            View b12 = materialCalendarGridView.b(e12);
                            width2 = (b12.getWidth() / 2) + b12.getLeft();
                        }
                        int itemId = (int) vVar.getItemId(e11);
                        int itemId2 = (int) vVar.getItemId(e12);
                        while (itemId <= itemId2) {
                            int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                            v vVar2 = vVar;
                            int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                            View b13 = materialCalendarGridView.b(numColumns);
                            int top = b13.getTop() + c5845c.f58233a.c();
                            int i14 = width2;
                            int bottom = b13.getBottom() - c5845c.f58233a.b();
                            if (d11) {
                                int i15 = e12 > numColumns2 ? 0 : i14;
                                int width3 = numColumns > e11 ? getWidth() : width;
                                i11 = i15;
                                i12 = width3;
                            } else {
                                i11 = numColumns > e11 ? 0 : width;
                                i12 = e12 > numColumns2 ? getWidth() : i14;
                            }
                            canvas.drawRect(i11, top, i12, bottom, c5845c.f58240h);
                            itemId++;
                            materialCalendarGridView = this;
                            vVar = vVar2;
                            width2 = i14;
                        }
                        materialCalendarGridView = this;
                        it = it2;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z11, int i11, Rect rect) {
        if (!z11) {
            super.onFocusChanged(false, i11, rect);
            return;
        }
        if (i11 == 33) {
            setSelection(((v) super.getAdapter()).c());
        } else if (i11 == 130) {
            setSelection(((v) super.getAdapter()).f58313a.e());
        } else {
            super.onFocusChanged(true, i11, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (!super.onKeyDown(i11, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((v) super.getAdapter()).f58313a.e()) {
            return true;
        }
        if (19 != i11) {
            return false;
        }
        setSelection(((v) super.getAdapter()).f58313a.e());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i11, int i12) {
        if (!this.f58214b) {
            super.onMeasure(i11, i12);
            return;
        }
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(16777215, LinearLayoutManager.INVALID_OFFSET));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i11) {
        if (i11 < ((v) super.getAdapter()).f58313a.e()) {
            super.setSelection(((v) super.getAdapter()).f58313a.e());
        } else {
            super.setSelection(i11);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (v) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof v)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), v.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
