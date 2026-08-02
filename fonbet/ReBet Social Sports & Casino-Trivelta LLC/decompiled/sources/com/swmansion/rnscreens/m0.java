package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public SearchView f42006a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f42007b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f42008c;

    public m0(SearchView searchView) {
        Intrinsics.checkNotNullParameter(searchView, "searchView");
        this.f42006a = searchView;
    }

    public final ImageView a() {
        return (ImageView) this.f42006a.findViewById(l.f.f55121z);
    }

    public final EditText b() {
        View findViewById = this.f42006a.findViewById(l.f.f55083E);
        if (findViewById instanceof EditText) {
            return (EditText) findViewById;
        }
        return null;
    }

    public final ImageView c() {
        return (ImageView) this.f42006a.findViewById(l.f.f55120y);
    }

    public final View d() {
        return this.f42006a.findViewById(l.f.f55082D);
    }

    public final void e(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            c().setColorFilter(intValue);
            a().setColorFilter(intValue);
        }
    }

    public final void f(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            EditText b10 = b();
            if (b10 != null) {
                b10.setHintTextColor(intValue);
            }
        }
    }

    public final void g(String placeholder, boolean z10) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        if (z10) {
            this.f42006a.setQueryHint(placeholder);
            return;
        }
        EditText b10 = b();
        if (b10 != null) {
            b10.setHint(placeholder);
        }
    }

    public final void h(Integer num) {
        EditText b10;
        ColorStateList textColors;
        Integer num2 = this.f42007b;
        if (num == null) {
            if (num2 == null || (b10 = b()) == null) {
                return;
            }
            b10.setTextColor(num2.intValue());
            return;
        }
        if (num2 == null) {
            EditText b11 = b();
            this.f42007b = (b11 == null || (textColors = b11.getTextColors()) == null) ? null : Integer.valueOf(textColors.getDefaultColor());
        }
        EditText b12 = b();
        if (b12 != null) {
            b12.setTextColor(num.intValue());
        }
    }

    public final void i(Integer num) {
        Drawable drawable = this.f42008c;
        if (num != null) {
            if (drawable == null) {
                this.f42008c = d().getBackground();
            }
            d().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            d().setBackground(drawable);
        }
    }
}
