package com.mbridge.msdk.foundation.same.net;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e<T> {
    public com.mbridge.msdk.foundation.same.net.exception.a a = null;
    public com.mbridge.msdk.foundation.same.net.toolbox.a b;
    public T c;

    private e(T t, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.c = t;
        this.b = aVar;
    }

    public static <T> e<T> a(T t, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        return new e<>(t, aVar);
    }
}
