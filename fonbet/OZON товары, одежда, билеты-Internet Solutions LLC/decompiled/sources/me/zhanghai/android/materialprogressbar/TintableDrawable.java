package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface TintableDrawable {
    void setTint(int i11);

    void setTintList(ColorStateList colorStateList);

    void setTintMode(@NonNull PorterDuff.Mode mode);
}
