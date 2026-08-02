package io.sentry.android.core.util;

import android.content.Context;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f51314a = null;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0747a f51315b;

    /* renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0747a {
        Object a(Context context);
    }

    public a(InterfaceC0747a interfaceC0747a) {
        this.f51315b = interfaceC0747a;
    }

    public Object a(Context context) {
        if (this.f51314a == null) {
            synchronized (this) {
                try {
                    if (this.f51314a == null) {
                        this.f51314a = this.f51315b.a(context);
                    }
                } finally {
                }
            }
        }
        return this.f51314a;
    }
}
