package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class DayViewDecorator implements Parcelable {
    public ColorStateList getBackgroundColor(@NonNull Context context, int i5, int i10, int i11, boolean z5, boolean z7) {
        return null;
    }

    public Drawable getCompoundDrawableBottom(@NonNull Context context, int i5, int i10, int i11, boolean z5, boolean z7) {
        return null;
    }

    public Drawable getCompoundDrawableLeft(@NonNull Context context, int i5, int i10, int i11, boolean z5, boolean z7) {
        return null;
    }

    public Drawable getCompoundDrawableRight(@NonNull Context context, int i5, int i10, int i11, boolean z5, boolean z7) {
        return null;
    }

    public Drawable getCompoundDrawableTop(@NonNull Context context, int i5, int i10, int i11, boolean z5, boolean z7) {
        return null;
    }

    public ColorStateList getTextColor(@NonNull Context context, int i5, int i10, int i11, boolean z5, boolean z7) {
        return null;
    }

    public void initialize(@NonNull Context context) {
    }

    public CharSequence getContentDescription(@NonNull Context context, int i5, int i10, int i11, boolean z5, boolean z7, CharSequence charSequence) {
        return charSequence;
    }
}
