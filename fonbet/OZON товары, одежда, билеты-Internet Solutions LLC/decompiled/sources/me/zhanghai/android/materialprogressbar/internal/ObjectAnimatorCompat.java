package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class ObjectAnimatorCompat {
    private ObjectAnimatorCompat() {
    }

    @NonNull
    public static ObjectAnimator ofArgb(Object obj, @NonNull String str, int... iArr) {
        return ObjectAnimatorCompatLollipop.ofArgb(obj, str, iArr);
    }

    @NonNull
    public static ObjectAnimator ofFloat(Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        return ObjectAnimatorCompatLollipop.ofFloat(obj, str, str2, path);
    }

    @NonNull
    public static ObjectAnimator ofInt(Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        return ObjectAnimatorCompatLollipop.ofInt(obj, str, str2, path);
    }

    @NonNull
    public static <T> ObjectAnimator ofArgb(T t2, @NonNull Property<T, Integer> property, int... iArr) {
        return ObjectAnimatorCompatLollipop.ofArgb(t2, property, iArr);
    }

    @NonNull
    public static <T> ObjectAnimator ofFloat(T t2, @NonNull Property<T, Float> property, @NonNull Property<T, Float> property2, @NonNull Path path) {
        return ObjectAnimatorCompatLollipop.ofFloat(t2, property, property2, path);
    }

    @NonNull
    public static <T> ObjectAnimator ofInt(T t2, @NonNull Property<T, Integer> property, @NonNull Property<T, Integer> property2, @NonNull Path path) {
        return ObjectAnimatorCompatLollipop.ofInt(t2, property, property2, path);
    }
}
