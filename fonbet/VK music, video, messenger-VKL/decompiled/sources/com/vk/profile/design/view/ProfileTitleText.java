package com.vk.profile.design.view;

import android.content.Context;
import android.text.SpannedString;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.lfo0;

/* compiled from: ProfileTitleText.kt */
/* loaded from: classes5.dex */
public final class ProfileTitleText extends AppCompatTextView {
    public final lfo0 b;
    public boolean c;

    public ProfileTitleText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new lfo0(this);
        this.c = true;
    }

    public static void b(ProfileTitleText profileTitleText, CharSequence charSequence, SpannedString spannedString, boolean z) {
        lfo0 lfo0Var = profileTitleText.b;
        if (charSequence == null) {
            charSequence = "";
        }
        lfo0Var.b = charSequence;
        CharSequence charSequence2 = spannedString;
        if (spannedString == null) {
            charSequence2 = "";
        }
        lfo0Var.c = charSequence2;
        lfo0Var.d = z;
        lfo0Var.g = false;
        lfo0Var.e = 0;
        profileTitleText.requestLayout();
    }

    public final void e(CharSequence charSequence) {
        b(this, this.b.b, (SpannedString) charSequence, true);
    }

    public final boolean getEllipsizeEnabled() {
        return this.c;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.c) {
            lfo0 lfo0Var = this.b;
            if (lfo0Var.e != size && !isInEditMode()) {
                setText(lfo0.b(lfo0Var, size, 0, 6));
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setEllipsizeEnabled(boolean z) {
        this.c = z;
    }
}
