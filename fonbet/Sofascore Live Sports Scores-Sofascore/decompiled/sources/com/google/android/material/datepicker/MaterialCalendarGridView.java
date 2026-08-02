package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.bsk;
import defpackage.g7e;
import defpackage.jy0;
import defpackage.lhk;
import defpackage.ng2;
import defpackage.sw9;
import defpackage.uyb;
import defpackage.x2a;
import defpackage.xah;
import defpackage.yia;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar a;
    public final boolean b;
    public yia c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = lhk.e(null);
        if (MaterialDatePicker.t(R.attr.windowFullscreen, getContext())) {
            setNextFocusLeftId(com.sofascore.results.R.id.cancel_button);
            setNextFocusRightId(com.sofascore.results.R.id.confirm_button);
        }
        this.b = MaterialDatePicker.t(com.sofascore.results.R.attr.nestedScrollable, getContext());
        bsk.q(this, new uyb(2));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        k kVar = (k) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.p;
        if (x2a.L(context.getTheme(), com.sofascore.results.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            ng2 ng2Var = kVar.d;
            if (ng2Var != null) {
                focusRingDrawable.o.t = (xah) ((jy0) ng2Var.a).f;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final k b() {
        return (k) super.getAdapter();
    }

    public final View c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    public final boolean d(int i, boolean z) {
        yia yiaVar;
        yia yiaVar2;
        int a = z ? ((k) super.getAdapter()).a(i) : ((k) super.getAdapter()).b(i);
        if (a != -1) {
            setSelection(a);
            return true;
        }
        if (!z && (yiaVar2 = this.c) != null) {
            return ((MaterialCalendar) yiaVar2.b).k(false);
        }
        if (!z || (yiaVar = this.c) == null) {
            return true;
        }
        return ((MaterialCalendar) yiaVar.b).k(true);
    }

    public final boolean e(int i) {
        k kVar = (k) super.getAdapter();
        if (!kVar.e(i)) {
            long itemId = kVar.getItemId(i);
            for (int i2 = 1; i2 < kVar.a.d; i2++) {
                int i3 = i + i2;
                if ((i3 < k.g && kVar.getItemId(i3) == itemId && kVar.e(i3)) || ((i3 = i - i2) >= 0 && kVar.getItemId(i3) == itemId && kVar.e(i3))) {
                    i = i3;
                    break;
                }
            }
            i = -1;
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (k) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((k) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.a(MaterialCalendarGridView.this);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int c;
        int width;
        int c2;
        int width2;
        int i;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        k kVar = (k) super.getAdapter();
        DateSelector dateSelector = kVar.b;
        int i3 = kVar.a.d;
        ng2 ng2Var = kVar.d;
        int max = Math.max(kVar.c(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(kVar.f(), materialCalendarGridView.getLastVisiblePosition());
        Long item = kVar.getItem(max);
        Long item2 = kVar.getItem(min);
        ((SingleDateSelector) dateSelector).getClass();
        Iterator it = new ArrayList().iterator();
        while (it.hasNext()) {
            g7e g7eVar = (g7e) it.next();
            Object obj = g7eVar.a;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (g7eVar.b != null) {
                Long l = (Long) obj;
                long longValue = l.longValue();
                Long l2 = (Long) g7eVar.b;
                long longValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    i3 = i3;
                    it = it;
                    kVar = kVar;
                } else {
                    boolean z = materialCalendarGridView.getLayoutDirection() == 1;
                    long longValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.a;
                    if (longValue < longValue3) {
                        width = max % i3 == 0 ? 0 : !z ? materialCalendarGridView.c(max - 1).getRight() : materialCalendarGridView.c(max - 1).getLeft();
                        c = max;
                    } else {
                        calendar.setTimeInMillis(longValue);
                        c = kVar.c() + (calendar.get(5) - 1);
                        View c3 = materialCalendarGridView.c(c);
                        width = (c3.getWidth() / 2) + c3.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        width2 = (min + 1) % i3 == 0 ? materialCalendarGridView.getWidth() : !z ? materialCalendarGridView.c(min).getRight() : materialCalendarGridView.c(min).getLeft();
                        c2 = min;
                    } else {
                        calendar.setTimeInMillis(longValue2);
                        c2 = kVar.c() + (calendar.get(5) - 1);
                        View c4 = materialCalendarGridView.c(c2);
                        width2 = (c4.getWidth() / 2) + c4.getLeft();
                    }
                    int itemId = (int) kVar.getItemId(c);
                    Iterator it2 = it;
                    int i4 = i3;
                    int itemId2 = (int) kVar.getItemId(c2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        k kVar2 = kVar;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View c5 = materialCalendarGridView.c(numColumns);
                        int top = c5.getTop() + ((Rect) ((jy0) ng2Var.a).b).top;
                        int i5 = itemId2;
                        int bottom = c5.getBottom() - ((Rect) ((jy0) ng2Var.a).b).bottom;
                        if (z) {
                            int i6 = c2 > numColumns2 ? 0 : width2;
                            int width3 = numColumns > c ? getWidth() : width;
                            i = i6;
                            i2 = width3;
                        } else {
                            i = numColumns > c ? 0 : width;
                            i2 = c2 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top, i2, bottom, (Paint) ng2Var.h);
                        itemId++;
                        materialCalendarGridView = this;
                        kVar = kVar2;
                        itemId2 = i5;
                    }
                    materialCalendarGridView = this;
                    i3 = i4;
                    it = it2;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int b;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            k kVar = (k) super.getAdapter();
            b = kVar.b(kVar.f() + 1);
        } else if (i == 130 || i == 2) {
            k kVar2 = (k) super.getAdapter();
            b = kVar2.a(kVar2.c() - 1);
        } else {
            b = -1;
        }
        if (b != -1) {
            setSelection(b);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = getLayoutDirection() == 1;
        if (i == 21) {
            return d(selectedItemPosition, z);
        }
        if (i == 22) {
            return d(selectedItemPosition, !z);
        }
        if (i == 61) {
            int b = keyEvent.isShiftPressed() ? ((k) super.getAdapter()).b(selectedItemPosition) : ((k) super.getAdapter()).a(selectedItemPosition);
            if (b == -1) {
                return false;
            }
            setSelection(b);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        k kVar = (k) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || kVar.e(selectedItemPosition2)) {
            return true;
        }
        k kVar2 = (k) super.getAdapter();
        if (!e(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > kVar2.f()) {
                            break;
                        }
                        if (e(numColumns)) {
                            break;
                        }
                        selectedItemPosition2 = getNumColumns();
                    }
                }
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                selectedItemPosition2 -= numColumns2;
                if (selectedItemPosition2 < kVar2.c()) {
                    break;
                }
                if (e(selectedItemPosition2)) {
                    break;
                }
                numColumns2 = getNumColumns();
            }
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof k) {
            super.setAdapter(listAdapter);
        } else {
            sw9.n("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), k.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((k) super.getAdapter()).a(r0.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (k) super.getAdapter();
    }
}
