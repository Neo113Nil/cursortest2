package io.seon.androidsdk.service;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: io.seon.androidsdk.service.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5079z1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f53583a;

    public C5079z1() {
        f53583a = Build.VERSION.SDK_INT < 30 ? 1023 : 65535;
    }

    public static float a(Context context, Lh.a aVar) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return 255.0f;
        }
        for (Method method : powerManager.getClass().getDeclaredMethods()) {
            if (method.getName().equals("getMaximumScreenBrightnessSetting")) {
                method.setAccessible(true);
                try {
                    return ((Integer) method.invoke(powerManager, null)).intValue();
                } catch (Exception e10) {
                    aVar.b(e10);
                }
            }
        }
        for (Field field : powerManager.getClass().getDeclaredFields()) {
            if (field.getName().equals("BRIGHTNESS_ON")) {
                field.setAccessible(true);
                try {
                    return field.getFloat(powerManager);
                } catch (IllegalAccessException e11) {
                    aVar.b(e11);
                }
            }
        }
        return 255.0f;
    }
}
