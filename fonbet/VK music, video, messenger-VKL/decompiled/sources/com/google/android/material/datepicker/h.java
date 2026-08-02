package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import xsna.a09;
import xsna.l2r0;
import xsna.qg90;
import xsna.tz8;

/* compiled from: MonthAdapter.java */
/* loaded from: classes13.dex */
public final class h extends BaseAdapter {
    public static final int h = l2r0.e(null).getMaximum(4);
    public static final int i = (l2r0.e(null).getMaximum(7) + l2r0.e(null).getMaximum(5)) - 1;
    public final Month b;
    public final DateSelector<?> c;
    public Collection<Long> d;
    public a09 e;
    public final CalendarConstraints f;

    @Nullable
    public final DayViewDecorator g;

    public h(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.b = month;
        this.c = dateSelector;
        this.f = calendarConstraints;
        this.g = dayViewDecorator;
        this.d = dateSelector.x3();
    }

    public final int a() {
        int i2 = this.f.f;
        Month month = this.b;
        Calendar calendar = month.b;
        int i3 = calendar.get(7);
        if (i2 <= 0) {
            i2 = calendar.getFirstDayOfWeek();
        }
        int i4 = i3 - i2;
        return i4 < 0 ? i4 + month.e : i4;
    }

    @Override // android.widget.Adapter
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i2) {
        if (i2 < a() || i2 > c()) {
            return null;
        }
        int a = (i2 - a()) + 1;
        Calendar c = l2r0.c(this.b.b);
        c.set(5, a);
        return Long.valueOf(c.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.b.f) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(@Nullable TextView textView, long j, int i2) {
        boolean z;
        boolean z2;
        tz8 tz8Var;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z3 = true;
        boolean z4 = l2r0.d().getTimeInMillis() == j;
        DateSelector<?> dateSelector = this.c;
        Iterator it = dateSelector.ia().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            F f = ((qg90) it.next()).a;
            if (f != 0 && ((Long) f).longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator it2 = dateSelector.ia().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            S s = ((qg90) it2.next()).b;
            if (s != 0 && ((Long) s).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar d = l2r0.d();
        Calendar e = l2r0.e(null);
        e.setTimeInMillis(j);
        String format = d.get(1) == e.get(1) ? l2r0.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : l2r0.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z4) {
            format = String.format(context.getString(R$string.mtrl_picker_today_description), format);
        }
        if (z) {
            format = String.format(context.getString(R$string.mtrl_picker_start_date_description), format);
        } else if (z2) {
            format = String.format(context.getString(R$string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.f.d.Z6(j)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.x3().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else {
                    if (l2r0.a(j) == l2r0.a(((Long) it3.next()).longValue())) {
                        break;
                    }
                }
            }
            textView.setSelected(z3);
            tz8Var = z3 ? this.e.b : l2r0.d().getTimeInMillis() == j ? this.e.c : this.e.a;
        } else {
            textView.setEnabled(false);
            tz8Var = this.e.g;
        }
        if (this.g == null || i2 == -1) {
            tz8Var.b(textView);
            return;
        }
        int i3 = this.b.d;
        tz8Var.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(format);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month d = Month.d(j);
        Month month = this.b;
        if (d.equals(month)) {
            Calendar c = l2r0.c(month.b);
            c.setTimeInMillis(j);
            int i2 = c.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (i2 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i2);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return i;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.b.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    @Override // android.widget.Adapter
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i2, @Nullable View view, @NonNull ViewGroup viewGroup) {
        int i3;
        Long item;
        Context context = viewGroup.getContext();
        if (this.e == null) {
            this.e = new a09(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_day, viewGroup, false);
        }
        int a = i2 - a();
        if (a >= 0) {
            Month month = this.b;
            if (a < month.f) {
                i3 = a + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i3)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i2);
                if (item != null) {
                    return textView;
                }
                d(textView, item.longValue(), i3);
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i3 = -1;
        item = getItem(i2);
        if (item != null) {
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
