package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import x0.C6774c;

/* loaded from: classes3.dex */
public class q extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final int f35419f = w.m().getMaximum(4);

    /* renamed from: g, reason: collision with root package name */
    public static final int f35420g = (w.m().getMaximum(5) + w.m().getMaximum(7)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final Month f35421a;

    /* renamed from: b, reason: collision with root package name */
    public final DateSelector f35422b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f35423c;

    /* renamed from: d, reason: collision with root package name */
    public b f35424d;

    /* renamed from: e, reason: collision with root package name */
    public final CalendarConstraints f35425e;

    public q(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f35421a = month;
        this.f35422b = dateSelector;
        this.f35425e = calendarConstraints;
        this.f35423c = dateSelector.T();
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.f35421a.e(this.f35425e.i());
    }

    public final String c(Context context, long j10) {
        return h.c(context, j10, l(j10), k(j10), g(j10));
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > m()) {
            return null;
        }
        return Long.valueOf(this.f35421a.f(n(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        Long item;
        f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ia.i.f48487t, viewGroup, false);
        }
        int b10 = i10 - b();
        if (b10 >= 0) {
            Month month = this.f35421a;
            if (b10 < month.f35279e) {
                i11 = b10 + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i10);
                if (item != null) {
                    return textView;
                }
                o(textView, item.longValue(), i11);
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i11 = -1;
        item = getItem(i10);
        if (item != null) {
        }
    }

    public final void f(Context context) {
        if (this.f35424d == null) {
            this.f35424d = new b(context);
        }
    }

    public boolean g(long j10) {
        Iterator it = this.f35422b.G().iterator();
        while (it.hasNext()) {
            Object obj = ((C6774c) it.next()).f67818b;
            if (obj != null && ((Long) obj).longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f35420g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f35421a.f35278d;
    }

    public boolean h(int i10) {
        return i10 % this.f35421a.f35278d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(int i10) {
        return (i10 + 1) % this.f35421a.f35278d == 0;
    }

    public final boolean j(long j10) {
        Iterator it = this.f35422b.T().iterator();
        while (it.hasNext()) {
            if (w.a(j10) == w.a(((Long) it.next()).longValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean k(long j10) {
        Iterator it = this.f35422b.G().iterator();
        while (it.hasNext()) {
            Object obj = ((C6774c) it.next()).f67817a;
            if (obj != null && ((Long) obj).longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(long j10) {
        return w.k().getTimeInMillis() == j10;
    }

    public int m() {
        return (b() + this.f35421a.f35279e) - 1;
    }

    public int n(int i10) {
        return (i10 - b()) + 1;
    }

    public final void o(TextView textView, long j10, int i10) {
        a aVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j10));
        if (this.f35425e.g().isValid(j10)) {
            textView.setEnabled(true);
            boolean j11 = j(j10);
            textView.setSelected(j11);
            aVar = j11 ? this.f35424d.f35295b : l(j10) ? this.f35424d.f35296c : this.f35424d.f35294a;
        } else {
            textView.setEnabled(false);
            aVar = this.f35424d.f35300g;
        }
        aVar.d(textView);
    }

    public final void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.c(j10).equals(this.f35421a)) {
            int g10 = this.f35421a.g(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(g10) - materialCalendarGridView.getFirstVisiblePosition()), j10, g10);
        }
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f35423c.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, ((Long) it.next()).longValue());
        }
        DateSelector dateSelector = this.f35422b;
        if (dateSelector != null) {
            Iterator it2 = dateSelector.T().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, ((Long) it2.next()).longValue());
            }
            this.f35423c = this.f35422b.T();
        }
    }

    public boolean r(int i10) {
        return i10 >= b() && i10 <= m();
    }
}
