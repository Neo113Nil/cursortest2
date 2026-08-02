package io.sentry.android.ndk;

import io.sentry.F3;
import io.sentry.android.core.C0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.ndk.NativeModuleListLoader;
import io.sentry.util.C4843a;
import io.sentry.util.w;

/* loaded from: classes3.dex */
public final class a implements C0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C4843a f51386c = new C4843a();

    /* renamed from: a, reason: collision with root package name */
    public final F3 f51387a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeModuleListLoader f51388b;

    public a(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.f51387a = (F3) w.c(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f51388b = (NativeModuleListLoader) w.c(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}
