package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public class i extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f35316d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f35317a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35318b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35319c;

    static {
        f35316d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public i() {
        Calendar m10 = w.m();
        this.f35317a = m10;
        this.f35318b = m10.getMaximum(7);
        this.f35319c = m10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f35318b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public final int b(int i10) {
        int i11 = i10 + this.f35319c;
        int i12 = this.f35318b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f35318b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ia.i.f48488u, viewGroup, false);
        }
        this.f35317a.set(7, b(i10));
        textView.setText(this.f35317a.getDisplayName(7, f35316d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(ia.k.f48502H), this.f35317a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public i(int i10) {
        Calendar m10 = w.m();
        this.f35317a = m10;
        this.f35318b = m10.getMaximum(7);
        this.f35319c = i10;
    }
}
