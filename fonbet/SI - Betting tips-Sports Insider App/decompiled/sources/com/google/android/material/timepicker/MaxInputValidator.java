package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class MaxInputValidator implements InputFilter {
    private int max;

    public MaxInputValidator(int i5) {
        this.max = i5;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i5, int i10, Spanned spanned, int i11, int i12) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i11, i12, charSequence.subSequence(i5, i10).toString());
            if (Integer.parseInt(sb2.toString()) <= this.max) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int i5) {
        this.max = i5;
    }
}
