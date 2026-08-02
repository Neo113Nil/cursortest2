package yf;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: yf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10890a {
    public static <T> T a(@NonNull Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C10890a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
