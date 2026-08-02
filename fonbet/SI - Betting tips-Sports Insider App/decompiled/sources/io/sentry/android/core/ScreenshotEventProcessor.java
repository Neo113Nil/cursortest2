package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import io.sentry.b5;
import io.sentry.d5;
import io.sentry.d6;
import io.sentry.t4;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ScreenshotEventProcessor implements io.sentry.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final SentryAndroidOptions f15493a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f15494b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f15495c;

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, n0 n0Var) {
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15493a = sentryAndroidOptions;
        this.f15494b = n0Var;
        this.f15495c = new io.sentry.android.core.internal.util.g(2000L, 3);
        if (sentryAndroidOptions.isAttachScreenshot()) {
            rh.g.a("Screenshot");
        }
    }

    @Override // io.sentry.c0
    public final t4 k(t4 t4Var, io.sentry.h0 h0Var) {
        Bitmap b10;
        if (t4Var.d()) {
            SentryAndroidOptions sentryAndroidOptions = this.f15493a;
            if (!sentryAndroidOptions.isAttachScreenshot()) {
                sentryAndroidOptions.getLogger().h(b5.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return t4Var;
            }
            WeakReference weakReference = (WeakReference) n0.f15781b.f15782a;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null && !k2.x.u(h0Var)) {
                boolean a7 = this.f15495c.a();
                sentryAndroidOptions.getBeforeScreenshotCaptureCallback();
                if (!a7 && (b10 = s6.a.b(activity, sentryAndroidOptions.getThreadChecker(), sentryAndroidOptions.getLogger(), this.f15494b)) != null) {
                    h0Var.f16448d = new io.sentry.a(new com.google.firebase.messaging.i(8, this, b10));
                    h0Var.d(activity, "android:activity");
                }
            }
        }
        return t4Var;
    }

    @Override // io.sentry.c0
    public final d5 r(d5 d5Var) {
        return d5Var;
    }

    @Override // io.sentry.c0
    public final d6 c(d6 d6Var, io.sentry.h0 h0Var) {
        return d6Var;
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.e0 n(io.sentry.protocol.e0 e0Var, io.sentry.h0 h0Var) {
        return e0Var;
    }
}
