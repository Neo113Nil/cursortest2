package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Locale;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
final class f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Calendar f58242a;

    /* renamed from: b, reason: collision with root package name */
    private final int f58243b;

    /* renamed from: c, reason: collision with root package name */
    private final int f58244c;

    public f() {
        Calendar d11 = C.d(null);
        this.f58242a = d11;
        this.f58243b = d11.getMaximum(7);
        this.f58244c = d11.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f58243b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i11) {
        int i12 = this.f58243b;
        if (i11 >= i12) {
            return null;
        }
        int i13 = i11 + this.f58244c;
        if (i13 > i12) {
            i13 -= i12;
        }
        return Integer.valueOf(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i11, View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i12 = i11 + this.f58244c;
        int i13 = this.f58243b;
        if (i12 > i13) {
            i12 -= i13;
        }
        Calendar calendar = this.f58242a;
        calendar.set(7, i12);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
