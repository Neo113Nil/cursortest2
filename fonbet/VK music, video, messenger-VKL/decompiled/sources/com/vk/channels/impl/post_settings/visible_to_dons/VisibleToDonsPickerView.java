package com.vk.channels.impl.post_settings.visible_to_dons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.design.ui.themehelper.R$styleable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.abg0;
import xsna.b4q0;
import xsna.bzb0;
import xsna.c4q0;
import xsna.c5g;
import xsna.cwb0;
import xsna.dhr0;
import xsna.e3m;
import xsna.enj;
import xsna.epx;
import xsna.izs;
import xsna.j5g;
import xsna.j9x;
import xsna.jjc;
import xsna.jwb0;
import xsna.k9x;
import xsna.m33;
import xsna.msy;
import xsna.pp80;
import xsna.s3q0;
import xsna.wvv0;
import xsna.ykt0;

/* compiled from: VisibleToDonsPickerView.kt */
/* loaded from: classes16.dex */
public final class VisibleToDonsPickerView extends LinearLayout {
    public static final /* synthetic */ int h = 0;
    public final TextView b;
    public final Object c;
    public final ArrayList d;
    public pp80 e;
    public final pp80.a f;
    public izs<? super pp80, s3q0> g;

    public VisibleToDonsPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 1;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new b4q0(context, 1));
        List singletonList = Collections.singletonList(pp80.a.a);
        k9x k9xVar = new k9x(1, 7, 1);
        ArrayList arrayList = new ArrayList(c5g.u(k9xVar, 10));
        j9x it = k9xVar.iterator();
        while (it.d) {
            arrayList.add(new pp80.b(it.nextInt()));
        }
        this.d = j5g.u0(arrayList, singletonList);
        pp80.a aVar = pp80.a.a;
        this.f = aVar;
        LayoutInflater.from(context).inflate(R.layout.post_settings_visible_to_dons_picker_view, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.visible_to_dons_picker_text);
        this.b = textView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.r);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (drawable != null) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 == null) {
                int f = e3m.f(R.attr.vk_ui_field_background, context);
                int f2 = e3m.f(R.attr.vk_ui_field_background, context);
                int f3 = e3m.f(R.attr.vk_ui_stroke_accent, context);
                int f4 = e3m.f(R.attr.vk_ui_field_border_alpha, context);
                int i2 = wvv0.a;
                drawable2 = wvv0.a(context, R.drawable.vkui_bg_edittext, f, f2, f3, f4);
            }
            textView.setBackground(drawable2);
            obtainStyledAttributes.recycle();
            jjc.g(textView, new ykt0(this, i));
            setCurrentSelectedValue(aVar);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static s3q0 a(VisibleToDonsPickerView visibleToDonsPickerView) {
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_icon_accent);
        int c2 = abg0Var.c(R.attr.vk_ui_icon_secondary);
        Drawable a = m33.a(R.drawable.vk_icon_check_circle_off_24, visibleToDonsPickerView.getContext());
        Drawable a2 = m33.a(R.drawable.vk_icon_check_circle_on_24, visibleToDonsPickerView.getContext());
        bzb0 popupVc = visibleToDonsPickerView.getPopupVc();
        ArrayList arrayList = visibleToDonsPickerView.d;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pp80 pp80Var = (pp80) it.next();
            arrayList2.add(new jwb0(visibleToDonsPickerView.c(pp80Var), 0, epx.f(pp80Var, visibleToDonsPickerView.e) ? a2 : a, Integer.valueOf(epx.f(pp80Var, visibleToDonsPickerView.e) ? c : c2), 0, pp80Var, false, null, 978));
        }
        popupVc.b(new cwb0.m(null, null, null, null, null, arrayList2, arrayList, cwb0.c1.c.a, 3071), new c4q0(visibleToDonsPickerView, 7), null);
        return s3q0.a;
    }

    public static s3q0 b(VisibleToDonsPickerView visibleToDonsPickerView, pp80 pp80Var) {
        visibleToDonsPickerView.setCurrentSelectedValue(pp80Var);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final bzb0 getPopupVc() {
        return (bzb0) this.c.getValue();
    }

    private final void setCurrentSelectedValue(pp80 pp80Var) {
        this.e = pp80Var;
        this.b.setText(c(pp80Var == null ? this.f : pp80Var));
        izs<? super pp80, s3q0> izsVar = this.g;
        if (pp80Var == null || izsVar == null) {
            return;
        }
        izsVar.invoke(pp80Var);
    }

    public final String c(pp80 pp80Var) {
        if (epx.f(pp80Var, pp80.a.a)) {
            return getContext().getString(R.string.vkim_channels_post_settings_visible_to_dons_always);
        }
        if (!(pp80Var instanceof pp80.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return enj.f(R.plurals.days, ((pp80.b) pp80Var).a, getContext());
    }

    public final pp80 getVisibilityToDons() {
        pp80 pp80Var = this.e;
        return pp80Var == null ? this.f : pp80Var;
    }

    public final void setEndDrawable(Drawable drawable) {
        this.b.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    public final void setEndDrawablePadding(int i) {
        this.b.setCompoundDrawablePadding(i);
    }

    public final void setOnUpdateListener(izs<? super pp80, s3q0> izsVar) {
        this.g = izsVar;
    }

    public final void setVisibilityToDons(pp80 pp80Var) {
        setCurrentSelectedValue(pp80Var);
        if (pp80Var == null) {
            pp80Var = this.f;
        }
        this.b.setText(c(pp80Var));
    }
}
