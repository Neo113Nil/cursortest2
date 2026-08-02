package com.tiktok.appevents.edp.proxy;

import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public class TouchProxyHelper {
    public static void proxy(WeakReference<View> v, ITouchListener clickListener) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("getListenerInfo", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(v.get(), null);
            Field declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            declaredField.setAccessible(true);
            View.OnTouchListener onTouchListener = (View.OnTouchListener) declaredField.get(invoke);
            ProxyOnTouchListener proxyOnTouchListener = new ProxyOnTouchListener(clickListener, onTouchListener);
            if (onTouchListener instanceof ProxyOnTouchListener) {
                return;
            }
            declaredField.set(invoke, proxyOnTouchListener);
        } catch (Throwable unused) {
        }
    }
}
