package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
final class v extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    static final int f58312f = C.d(null).getMaximum(4);

    /* renamed from: a, reason: collision with root package name */
    final u f58313a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC5846d<?> f58314b;

    /* renamed from: c, reason: collision with root package name */
    private Collection<Long> f58315c;

    /* renamed from: d, reason: collision with root package name */
    C5845c f58316d;

    /* renamed from: e, reason: collision with root package name */
    final C5843a f58317e;

    v(u uVar, InterfaceC5846d<?> interfaceC5846d, C5843a c5843a) {
        this.f58313a = uVar;
        this.f58314b = interfaceC5846d;
        this.f58317e = c5843a;
        this.f58315c = interfaceC5846d.H0();
    }

    private void d(TextView textView, long j11) {
        C5844b c5844b;
        if (textView == null) {
            return;
        }
        if (this.f58317e.f().R(j11)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f58314b.H0().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C.a(j11) == C.a(it.next().longValue())) {
                        c5844b = this.f58316d.f58234b;
                        break;
                    }
                } else {
                    c5844b = C.c().getTimeInMillis() == j11 ? this.f58316d.f58235c : this.f58316d.f58233a;
                }
            }
        } else {
            textView.setEnabled(false);
            c5844b = this.f58316d.f58239g;
        }
        c5844b.d(textView);
    }

    private void e(MaterialCalendarGridView materialCalendarGridView, long j11) {
        u c11 = u.c(j11);
        u uVar = this.f58313a;
        if (c11.equals(uVar)) {
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().f58313a.e() + (uVar.g(j11) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j11);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i11) {
        u uVar = this.f58313a;
        if (i11 < uVar.e() || i11 > c()) {
            return null;
        }
        return Long.valueOf(uVar.f((i11 - uVar.e()) + 1));
    }

    final int c() {
        u uVar = this.f58313a;
        return (uVar.e() + uVar.f58309e) - 1;
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f58315c.iterator();
        while (it.hasNext()) {
            e(materialCalendarGridView, it.next().longValue());
        }
        InterfaceC5846d<?> interfaceC5846d = this.f58314b;
        if (interfaceC5846d != null) {
            Iterator<Long> it2 = interfaceC5846d.H0().iterator();
            while (it2.hasNext()) {
                e(materialCalendarGridView, it2.next().longValue());
            }
            this.f58315c = interfaceC5846d.H0();
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        u uVar = this.f58313a;
        return uVar.f58309e + uVar.e();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return i11 / this.f58313a.f58308d;
    }

    @Override // android.widget.Adapter
    @NonNull
    public final View getView(int i11, View view, @NonNull ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f58316d == null) {
            this.f58316d = new C5845c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        u uVar = this.f58313a;
        int e11 = i11 - uVar.e();
        if (e11 < 0 || e11 >= uVar.f58309e) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i12 = e11 + 1;
            textView.setTag(uVar);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i12)));
            long f7 = uVar.f(i12);
            if (uVar.f58307c == u.d().f58307c) {
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault());
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                textView.setContentDescription(instanceForSkeleton.format(new Date(f7)));
            } else {
                DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault());
                instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                textView.setContentDescription(instanceForSkeleton2.format(new Date(f7)));
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i11);
        if (item == null) {
            return textView;
        }
        d(textView, item.longValue());
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
