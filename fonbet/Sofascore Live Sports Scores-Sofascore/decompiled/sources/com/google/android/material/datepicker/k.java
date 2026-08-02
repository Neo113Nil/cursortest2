package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.sofascore.results.R;
import defpackage.g7e;
import defpackage.jy0;
import defpackage.lhk;
import defpackage.ng2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k extends BaseAdapter {
    public static final int f = lhk.e(null).getMaximum(4);
    public static final int g = (lhk.e(null).getMaximum(7) + lhk.e(null).getMaximum(5)) - 1;
    public final Month a;
    public final DateSelector b;
    public ArrayList c;
    public ng2 d;
    public final CalendarConstraints e;

    public k(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints) {
        this.a = month;
        this.b = dateSelector;
        this.e = calendarConstraints;
        this.c = ((SingleDateSelector) dateSelector).a();
    }

    public final int a(int i) {
        do {
            i++;
            if (i > f()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int b(int i) {
        do {
            i--;
            if (i < c()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int c() {
        int i = this.e.e;
        Month month = this.a;
        Calendar calendar = month.a;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + month.d : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < c() || i > f()) {
            return null;
        }
        int c = (i - c()) + 1;
        Calendar c2 = lhk.c(this.a.a);
        c2.set(5, c);
        return Long.valueOf(c2.getTimeInMillis());
    }

    public final boolean e(int i) {
        Long item = getItem(i);
        if (item != null) {
            return item.longValue() >= ((DateValidatorPointForward) this.e.c).a;
        }
        return false;
    }

    public final int f() {
        return (c() + this.a.e) - 1;
    }

    public final void g(TextView textView, long j) {
        boolean z;
        boolean z2;
        jy0 jy0Var;
        boolean z3;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = lhk.d().getTimeInMillis() == j;
        SingleDateSelector singleDateSelector = (SingleDateSelector) this.b;
        singleDateSelector.getClass();
        Iterator it = new ArrayList().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Object obj = ((g7e) it.next()).a;
            if (obj != null && ((Long) obj).longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator it2 = new ArrayList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Object obj2 = ((g7e) it2.next()).b;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar d = lhk.d();
        Calendar e = lhk.e(null);
        e.setTimeInMillis(j);
        String format = d.get(1) == e.get(1) ? lhk.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : lhk.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z4) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        if (z) {
            format = String.format(context.getString(R.string.mtrl_picker_start_date_description), format);
        } else if (z2) {
            format = String.format(context.getString(R.string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (j >= ((DateValidatorPointForward) this.e.c).a) {
            textView.setEnabled(true);
            Iterator it3 = singleDateSelector.a().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else {
                    if (lhk.a(j) == lhk.a(((Long) it3.next()).longValue())) {
                        z3 = true;
                        break;
                    }
                }
            }
            textView.setSelected(z3);
            if (z3) {
                jy0Var = (jy0) this.d.b;
            } else {
                boolean z5 = lhk.d().getTimeInMillis() == j;
                ng2 ng2Var = this.d;
                jy0Var = z5 ? (jy0) ng2Var.c : (jy0) ng2Var.a;
            }
        } else {
            textView.setEnabled(false);
            jy0Var = (jy0) this.d.g;
        }
        jy0Var.g(textView);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Long item;
        Context context = viewGroup.getContext();
        if (this.d == null) {
            this.d = new ng2(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int c = i - c();
        if (c >= 0) {
            Month month = this.a;
            if (c < month.e) {
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(c + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i);
                if (item != null) {
                    return textView;
                }
                g(textView, item.longValue());
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        item = getItem(i);
        if (item != null) {
        }
    }

    public final void h(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month c = Month.c(j);
        Month month = this.a;
        if (c.equals(month)) {
            Calendar c2 = lhk.c(month.a);
            c2.setTimeInMillis(j);
            g((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.b().c() + (c2.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
