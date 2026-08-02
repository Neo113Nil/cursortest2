package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669d implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f15351a;

    /* renamed from: b, reason: collision with root package name */
    public final U f15352b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0675j f15353c;

    /* renamed from: d, reason: collision with root package name */
    public final gf.i f15354d = gf.k.b(new C0666a(this));

    public C0669d(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f15351a = clientContext;
        this.f15352b = u10;
    }

    public static final Activity.ScreenCaptureCallback d(C0669d c0669d) {
        return (Activity.ScreenCaptureCallback) c0669d.f15354d.getValue();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C0678m c0678m) {
        this.f15353c = c0678m != null ? c0678m.f15382a : null;
    }

    @NotNull
    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f15351a.getActivityLifecycleRegistry().registerListener(new C0668c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
