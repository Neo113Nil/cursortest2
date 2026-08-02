package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class v<T> {
    public final T a;
    public final b.a b;
    public final b0 c;
    public boolean d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {
        void a(b0 b0Var);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface b<T> {
        void a(T t);
    }

    private v(T t, b.a aVar) {
        this.d = false;
        this.a = t;
        this.b = aVar;
        this.c = null;
    }

    public boolean a() {
        return this.c == null;
    }

    public static <T> v<T> a(b0 b0Var) {
        return new v<>(b0Var);
    }

    public static <T> v<T> a(T t, b.a aVar) {
        return new v<>(t, aVar);
    }

    private v(b0 b0Var) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = b0Var;
    }
}
