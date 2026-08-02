package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.NonNull;

@TargetApi(21)
/* loaded from: classes10.dex */
class ObjectAnimatorCompatLollipop {
    private ObjectAnimatorCompatLollipop() {
    }

    @NonNull
    public static ObjectAnimator ofArgb(Object obj, @NonNull String str, int... iArr) {
        return ObjectAnimator.ofArgb(obj, str, iArr);
    }

    @NonNull
    public static ObjectAnimator ofFloat(Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        return ObjectAnimator.ofFloat(obj, str, str2, path);
    }

    @NonNull
    public static ObjectAnimator ofInt(Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        return ObjectAnimator.ofInt(obj, str, str2, path);
    }

    @NonNull
    public static <T> ObjectAnimator ofArgb(T t2, @NonNull Property<T, Integer> property, int... iArr) {
        return ObjectAnimator.ofArgb(t2, property, iArr);
    }

    @NonNull
    public static <T> ObjectAnimator ofFloat(T t2, @NonNull Property<T, Float> property, @NonNull Property<T, Float> property2, @NonNull Path path) {
        return ObjectAnimator.ofFloat(t2, property, property2, path);
    }

    @NonNull
    public static <T> ObjectAnimator ofInt(T t2, @NonNull Property<T, Integer> property, @NonNull Property<T, Integer> property2, @NonNull Path path) {
        return ObjectAnimator.ofInt(t2, property, property2, path);
    }
}
