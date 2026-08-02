package com.vk.prefui.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import androidx.preference.DialogPreference;
import xsna.pcc;
import xsna.tyc0;

/* loaded from: classes5.dex */
public class ColorPreference extends DialogPreference {
    public ContextThemeWrapper W;
    public int X;
    public int Y;

    public ColorPreference(Context context) {
        super(context);
        this.X = 0;
    }

    @Override // androidx.preference.Preference
    public final Context h() {
        ContextThemeWrapper contextThemeWrapper = this.W;
        Context context = this.b;
        if (contextThemeWrapper == null) {
            this.W = new ContextThemeWrapper(context, R.style.Theme.Material.Dialog.Alert);
        }
        return context;
    }

    @Override // androidx.preference.Preference
    public final void s(tyc0 tyc0Var) {
        super.s(tyc0Var);
        tyc0Var.itemView.findViewById(com.vkontakte.android.R.id.color_pref_widget).setBackgroundDrawable(new pcc(this.X));
    }

    @Override // androidx.preference.Preference
    public final Object v(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, -1));
    }

    @Override // androidx.preference.Preference
    public final void z(Object obj, boolean z) {
        if (z) {
            this.X = j(-1);
        } else {
            if (obj == null) {
                this.X = -1;
                return;
            }
            int intValue = ((Integer) obj).intValue();
            this.X = intValue;
            D(intValue);
        }
    }

    public ColorPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.X = 0;
        this.I = com.vkontakte.android.R.layout.color_preference_widget;
    }

    public ColorPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.X = 0;
    }

    public ColorPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.X = 0;
    }
}
