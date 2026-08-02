package io.sentry.android.core;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final /* synthetic */ class g0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScreenshotEventProcessor f67099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f67100b;

    public /* synthetic */ g0(ScreenshotEventProcessor screenshotEventProcessor, Bitmap bitmap) {
        this.f67099a = screenshotEventProcessor;
        this.f67100b = bitmap;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte[] b11;
        b11 = io.sentry.android.core.internal.util.o.b(this.f67100b, this.f67099a.f66970a.getLogger());
        return b11;
    }
}
