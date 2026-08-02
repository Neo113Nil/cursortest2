package com.vk.prefui.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.ListPreference;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.iah0;
import xsna.tyc0;

/* loaded from: classes5.dex */
public class SummaryListPreference extends ListPreference {
    public SummaryListPreference(Context context) {
        super(context);
        S();
    }

    public static ShapeDrawable S() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(dhr0.t.c(R.attr.vk_ui_background_accent));
        float f = 6;
        shapeDrawable.setIntrinsicWidth(iah0.a(f));
        shapeDrawable.setIntrinsicHeight(iah0.a(f));
        return shapeDrawable;
    }

    @Override // androidx.preference.ListPreference
    public final void R(String str) {
        super.R(str);
        I(P());
    }

    @Override // androidx.preference.Preference
    public final void s(tyc0 tyc0Var) {
        super.s(tyc0Var);
        TextView textView = (TextView) tyc0Var.V5(android.R.id.title);
        if (textView != null) {
            textView.setIncludeFontPadding(false);
            textView.setCompoundDrawablePadding(iah0.a(6.0f));
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    public final void y(Object obj) {
        super.y(obj);
        I(P());
    }

    public SummaryListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        S();
    }

    public SummaryListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        S();
    }

    public SummaryListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        S();
    }
}
