package io.sentry.android.core.util;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private volatile T f67378a = null;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC1104a<T> f67379b;

    /* renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC1104a<T> {
        T a(@NotNull Context context);
    }

    public a(@NotNull InterfaceC1104a<T> interfaceC1104a) {
        this.f67379b = interfaceC1104a;
    }

    public final T a(@NotNull Context context) {
        if (this.f67378a == null) {
            synchronized (this) {
                try {
                    if (this.f67378a == null) {
                        this.f67378a = this.f67379b.a(context);
                    }
                } finally {
                }
            }
        }
        return this.f67378a;
    }
}
