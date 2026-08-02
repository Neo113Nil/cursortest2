package io.sentry.util;

/* loaded from: classes3.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final b f52785a = new b();

    public static class b extends ThreadLocal {
        public b() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z initialValue() {
            return new z();
        }
    }

    public static z a() {
        return (z) f52785a.get();
    }
}
