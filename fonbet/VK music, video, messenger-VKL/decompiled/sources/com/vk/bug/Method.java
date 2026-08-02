package com.vk.bug;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageDownloadLogger.kt */
/* loaded from: classes15.dex */
public final class Method {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Method[] $VALUES;
    public static final Method BY_EXECUTOR;
    public static final Method BY_REQUEST;
    public static final Method CACHE;

    static {
        Method method = new Method("CACHE", 0);
        CACHE = method;
        Method method2 = new Method("BY_EXECUTOR", 1);
        BY_EXECUTOR = method2;
        Method method3 = new Method("BY_REQUEST", 2);
        BY_REQUEST = method3;
        Method[] methodArr = {method, method2, method3};
        $VALUES = methodArr;
        $ENTRIES = new asp(methodArr);
    }

    public Method() {
        throw null;
    }

    public static Method valueOf(String str) {
        return (Method) Enum.valueOf(Method.class, str);
    }

    public static Method[] values() {
        return (Method[]) $VALUES.clone();
    }
}
