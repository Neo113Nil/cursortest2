package com.vk.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.vk.design.ui.themehelper.R$styleable;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cvk;
import xsna.e3m;
import xsna.en9;
import xsna.gi8;
import xsna.gzs;
import xsna.izs;
import xsna.j9k;
import xsna.ozl;
import xsna.pvo0;
import xsna.s3q0;
import xsna.sk4;
import xsna.wvv0;
import xsna.xs6;

/* compiled from: FutureDateTimePickerView.kt */
@ozl
/* loaded from: classes17.dex */
public final class FutureDateTimePickerView extends LinearLayout {
    public static final /* synthetic */ int o = 0;
    public final SimpleDateFormat b;
    public final TextView c;
    public final TextView d;
    public Date e;
    public Date f;
    public Date g;
    public final bpn0 h;
    public Integer i;
    public izs<? super Calendar, Boolean> j;
    public gzs<CalendarConstraints> k;
    public izs<? super Date, s3q0> l;
    public izs<? super Date, s3q0> m;
    public izs<? super Date, s3q0> n;

    public FutureDateTimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Context context2;
        this.b = new SimpleDateFormat("HH:mm", Locale.getDefault());
        this.h = new bpn0(new sk4(this));
        this.j = new j9k(this, 15);
        this.k = new xs6(9);
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.future_date_time_picker_view, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.future_date_time_picker_date_text);
        this.c = textView;
        TextView textView2 = (TextView) findViewById(R.id.future_date_time_picker_time_text);
        this.d = textView2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.i);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (drawable != null) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(4);
            if (drawable2 != null) {
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
            }
            bwt0.q0(textView, obtainStyledAttributes.getFloat(2, 3.0f));
            int i = 5;
            bwt0.q0(textView2, obtainStyledAttributes.getFloat(5, 2.0f));
            Drawable drawable3 = obtainStyledAttributes.getDrawable(0);
            if (drawable3 == null) {
                int f = e3m.f(R.attr.vk_ui_field_background, context);
                int f2 = e3m.f(R.attr.vk_ui_field_background, context);
                int f3 = e3m.f(R.attr.vk_ui_stroke_accent, context);
                int f4 = e3m.f(R.attr.vk_ui_field_border_alpha, context);
                int i2 = wvv0.a;
                context2 = context;
                drawable3 = wvv0.a(context2, R.drawable.vkui_bg_edittext, f, f2, f3, f4);
            } else {
                context2 = context;
            }
            textView.setBackground(drawable3);
            Drawable drawable4 = obtainStyledAttributes.getDrawable(3);
            if (drawable4 == null) {
                int f5 = e3m.f(R.attr.vk_ui_field_background, context2);
                int f6 = e3m.f(R.attr.vk_ui_field_background, context2);
                int f7 = e3m.f(R.attr.vk_ui_stroke_accent, context2);
                int f8 = e3m.f(R.attr.vk_ui_field_border_alpha, context2);
                int i3 = wvv0.a;
                drawable4 = wvv0.a(context2, R.drawable.vkui_bg_edittext, f5, f6, f7, f8);
            }
            textView2.setBackground(drawable4);
            obtainStyledAttributes.recycle();
            textView.setOnClickListener(new en9(this, 6));
            textView2.setOnClickListener(new gi8(this, i));
            setCurrentSelectedDate(getDefaultDate());
            d(this.g);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static s3q0 a(FutureDateTimePickerView futureDateTimePickerView, Long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l.longValue());
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance(pvo0.d().getTimeZone());
        calendar2.setTime(futureDateTimePickerView.g);
        calendar2.set(i, i2, i3);
        Integer num = futureDateTimePickerView.i;
        if (!futureDateTimePickerView.j.invoke(calendar2).booleanValue() && num != null) {
            cvk.u(num.intValue(), false);
            return s3q0.a;
        }
        izs<? super Date, s3q0> izsVar = futureDateTimePickerView.l;
        if (izsVar != null) {
            izsVar.invoke(calendar2.getTime());
        }
        futureDateTimePickerView.setCurrentSelectedDate(calendar2.getTime());
        return s3q0.a;
    }

    public static void b(com.google.android.material.timepicker.b bVar, FutureDateTimePickerView futureDateTimePickerView) {
        int Dn = bVar.Dn();
        int En = bVar.En();
        Calendar calendar = Calendar.getInstance(pvo0.d().getTimeZone());
        calendar.setTime(futureDateTimePickerView.g);
        calendar.set(11, Dn);
        calendar.set(12, En);
        calendar.set(13, 0);
        Integer num = futureDateTimePickerView.i;
        if (!futureDateTimePickerView.j.invoke(calendar).booleanValue() && num != null) {
            cvk.u(num.intValue(), false);
            return;
        }
        izs<? super Date, s3q0> izsVar = futureDateTimePickerView.m;
        if (izsVar != null) {
            izsVar.invoke(calendar.getTime());
        }
        futureDateTimePickerView.setCurrentSelectedDate(calendar.getTime());
        bVar.un(false, false);
    }

    private final Date getDefaultDate() {
        return (Date) this.h.getValue();
    }

    private final void setCurrentSelectedDate(Date date) {
        this.g = date;
        d(date);
        izs<? super Date, s3q0> izsVar = this.n;
        if (date == null || izsVar == null) {
            return;
        }
        izsVar.invoke(date);
    }

    public final FragmentManager c() {
        boolean z;
        Context context = getContext();
        while (true) {
            z = context instanceof AppCompatActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) (z ? (Activity) context : null);
        if (appCompatActivity != null) {
            return appCompatActivity.getSupportFragmentManager();
        }
        return null;
    }

    public final void d(Date date) {
        if (date == null) {
            date = getDefaultDate();
        }
        StringBuilder sb = new StringBuilder(pvo0.j(date.getTime(), false, false));
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        this.c.setText(sb.toString());
        this.d.setText(this.b.format(date));
    }

    public final Date getDate() {
        Date date = this.g;
        return date == null ? getDefaultDate() : date;
    }

    public final gzs<CalendarConstraints> getDateConstraints() {
        return this.k;
    }

    public final izs<Calendar, Boolean> getDateTimeValidationMethod() {
        return this.j;
    }

    public final Date getMaxValidDate() {
        return this.f;
    }

    public final Date getMinValidDate() {
        return this.e;
    }

    public final izs<Date, s3q0> getOnOnlyDateUpdateListener() {
        return this.l;
    }

    public final izs<Date, s3q0> getOnOnlyTimeUpdateListener() {
        return this.m;
    }

    public final void setDate(Date date) {
        setCurrentSelectedDate(date);
        d(date);
    }

    public final void setDateConstraints(gzs<CalendarConstraints> gzsVar) {
        this.k = gzsVar;
    }

    public final void setDateEndDrawable(Drawable drawable) {
        this.c.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    public final void setDateEndDrawablePadding(int i) {
        this.c.setCompoundDrawablePadding(i);
    }

    public final void setDateSilently(Date date) {
        izs<? super Date, s3q0> izsVar = this.n;
        this.n = null;
        setDate(date);
        this.n = izsVar;
    }

    public final void setDateTimeValidationMethod(izs<? super Calendar, Boolean> izsVar) {
        this.j = izsVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setEnabledDate(z);
        setEnabledTime(z);
    }

    public final void setEnabledDate(boolean z) {
        TextView textView = this.c;
        textView.setEnabled(z);
        textView.setAlpha(z ? 1.0f : 0.4f);
    }

    public final void setEnabledTime(boolean z) {
        TextView textView = this.d;
        textView.setEnabled(z);
        textView.setAlpha(z ? 1.0f : 0.4f);
    }

    public final void setMaxValidDate(Date date) {
        this.f = date;
    }

    public final void setMinValidDate(Date date) {
        this.e = date;
    }

    public final void setOnDateUpdateListener(izs<? super Date, s3q0> izsVar) {
        this.n = izsVar;
    }

    public final void setOnOnlyDateUpdateListener(izs<? super Date, s3q0> izsVar) {
        this.l = izsVar;
    }

    public final void setOnOnlyTimeUpdateListener(izs<? super Date, s3q0> izsVar) {
        this.m = izsVar;
    }

    public final void setTextResources(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void setTimeEndDrawable(Drawable drawable) {
        this.d.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    public final void setTimeEndDrawablePadding(int i) {
        this.d.setCompoundDrawablePadding(i);
    }
}
