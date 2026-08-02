package me.zhanghai.android.materialprogressbar.internal;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ThemeUtils {
    private ThemeUtils() {
    }

    public static int getColorFromAttrRes(int i11, int i12, @NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i11});
        try {
            return obtainStyledAttributes.getColor(0, i12);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static float getFloatFromAttrRes(int i11, float f7, @NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i11});
        try {
            return obtainStyledAttributes.getFloat(0, f7);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
