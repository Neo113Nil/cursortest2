package com.zoho.livechat.android.utils;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import androidx.core.graphics.AbstractC2074d;
import l.AbstractC5335a;
import od.AbstractC5886l;

/* loaded from: classes4.dex */
public abstract class P {
    public static int a(Context context) {
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(AbstractC5335a.f55002q, typedValue, false);
            return typedValue.type == 1 ? context.getResources().getColor(typedValue.data) : typedValue.data;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int b(Context context, float f10, int i10) {
        return AbstractC2074d.k(e(context, i10), (int) ((f10 / 100.0f) * 255.0f));
    }

    public static GradientDrawable c(int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i10);
        gradientDrawable.setColor(i11);
        return gradientDrawable;
    }

    public static GradientDrawable d(int i10, int i11, float f10, int i12, int i13) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i10);
        gradientDrawable.setColor(i11);
        gradientDrawable.setCornerRadius(f10);
        gradientDrawable.setStroke(i12, i13);
        return gradientDrawable;
    }

    public static int e(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, false);
        return typedValue.type == 1 ? context.getResources().getColor(typedValue.data) : typedValue.data;
    }

    public static int f(Context context) {
        return 0;
    }

    public static int g(int i10, int i11) {
        return (i11 < 0 || i11 > 100) ? i10 : (i10 & 16777215) | (((int) ((i11 / 100.0f) * 255.0f)) << 24);
    }

    public static int h(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public static String i(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5886l.f59794Z0, typedValue, true);
        return String.valueOf(typedValue.string);
    }

    public static String j(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context != null) {
            context.getTheme().resolveAttribute(AbstractC5886l.f59846j3, typedValue, true);
        }
        return String.valueOf(typedValue.string);
    }

    public static int k(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5886l.f59819e1, typedValue, true);
        return typedValue.data;
    }

    public static boolean l(Context context) {
        return "DARK".equalsIgnoreCase(j(context));
    }
}
