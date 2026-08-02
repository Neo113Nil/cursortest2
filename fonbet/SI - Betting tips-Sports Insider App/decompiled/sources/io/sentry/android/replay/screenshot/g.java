package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import gf.k;
import gf.l;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.c0;
import io.sentry.android.replay.v;
import io.sentry.b5;
import io.sentry.b6;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ReplayIntegration f16095a;

    /* renamed from: b, reason: collision with root package name */
    public final b6 f16096b;

    /* renamed from: c, reason: collision with root package name */
    public final v f16097c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f16098d;

    /* renamed from: e, reason: collision with root package name */
    public final f3.b f16099e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16100f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap f16101g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f16102h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f16103i;
    public final AtomicBoolean j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f16104k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f16105l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f16106m;

    public g(c0 executorProvider, ReplayIntegration replayIntegration, b6 options, v config, io.sentry.android.replay.util.b debugOverlayDrawable) {
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(debugOverlayDrawable, "debugOverlayDrawable");
        this.f16095a = replayIntegration;
        this.f16096b = options;
        this.f16097c = config;
        this.f16098d = executorProvider.f15958e;
        this.f16099e = executorProvider.f15957d;
        l lVar = l.f10028b;
        this.f16100f = k.a(lVar, e.f16091g);
        Bitmap createBitmap = Bitmap.createBitmap(config.f16137a, config.f16138b, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.f16101g = createBitmap;
        this.f16102h = k.a(lVar, new f(this, 1));
        this.f16103i = k.a(lVar, new f(this, 0));
        this.j = new AtomicBoolean(false);
        this.f16104k = k.a(lVar, e.f16090f);
        this.f16105l = new AtomicBoolean(false);
        this.f16106m = new AtomicBoolean(false);
    }

    @Override // io.sentry.android.replay.screenshot.h
    public final boolean a() {
        return this.j.get();
    }

    @Override // io.sentry.android.replay.screenshot.h
    public final void b(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Window r5 = rh.g.r(root);
        b6 b6Var = this.f16096b;
        if (r5 == null) {
            b6Var.getLogger().h(b5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.f16106m.get()) {
            b6Var.getLogger().h(b5.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f16105l.set(false);
            PixelCopy.request(r5, this.f16101g, new io.sentry.android.core.internal.util.k(1, this, root), this.f16099e.f9329a);
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.WARNING, "Failed to capture replay recording", th2);
            this.j.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.h
    public final void c() {
        if (this.j.get()) {
            Bitmap bitmap = this.f16101g;
            if (bitmap.isRecycled()) {
                return;
            }
            this.f16095a.O(bitmap);
        }
    }

    @Override // io.sentry.android.replay.screenshot.h
    public final void close() {
        this.f16106m.set(true);
        this.f16098d.submit(new io.sentry.android.replay.util.g(new io.sentry.android.core.f(8, this), "PixelCopyStrategy.close"));
    }

    @Override // io.sentry.android.replay.screenshot.h
    public final void onContentChanged() {
        this.f16105l.set(true);
    }
}
