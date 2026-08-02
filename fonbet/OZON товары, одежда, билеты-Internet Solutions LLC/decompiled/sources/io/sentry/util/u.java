package io.sentry.util;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f68601a = new a();

    private static class a extends ThreadLocal<s> {
        @Override // java.lang.ThreadLocal
        protected final s initialValue() {
            return new s();
        }
    }

    @NotNull
    public static s a() {
        return f68601a.get();
    }
}
