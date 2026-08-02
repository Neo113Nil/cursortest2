package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ValueAnimatorCompat {
    private static Method sValueAnimatorGetDurationScaleMethod;
    private static boolean sValueAnimatorGetDurationScaleMethodInitialized;
    private static Field sValueAnimatorSDurationScaleField;
    private static boolean sValueAnimatorSDurationScaleFieldInitialized;

    @NonNull
    private static final Object sValueAnimatorGetDurationScaleMethodLock = new Object();

    @NonNull
    private static final Object sValueAnimatorSDurationScaleFieldLock = new Object();

    private ValueAnimatorCompat() {
    }

    public static boolean areAnimatorsEnabled() {
        return ValueAnimator.areAnimatorsEnabled();
    }

    @SuppressLint({"PrivateApi"})
    private static Method getValueAnimatorGetDurationScaleMethod() {
        Method method;
        synchronized (sValueAnimatorGetDurationScaleMethodLock) {
            if (!sValueAnimatorGetDurationScaleMethodInitialized) {
                try {
                    Method declaredMethod = ValueAnimator.class.getDeclaredMethod("getDurationScale", new Class[0]);
                    sValueAnimatorGetDurationScaleMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                sValueAnimatorGetDurationScaleMethodInitialized = true;
            }
            method = sValueAnimatorGetDurationScaleMethod;
        }
        return method;
    }

    private static Field getValueAnimatorSDurationScaleField() {
        Field field;
        synchronized (sValueAnimatorSDurationScaleFieldLock) {
            if (!sValueAnimatorSDurationScaleFieldInitialized) {
                try {
                    Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                    sValueAnimatorSDurationScaleField = declaredField;
                    declaredField.setAccessible(true);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                sValueAnimatorSDurationScaleFieldInitialized = true;
            }
            field = sValueAnimatorSDurationScaleField;
        }
        return field;
    }
}
