package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379ob {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f14406a;

    /* renamed from: b, reason: collision with root package name */
    public final I2 f14407b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC0404pb f14408c;

    public C0379ob(Handler handler, I2 i22) {
        this.f14406a = handler;
        this.f14407b = i22;
        this.f14408c = new RunnableC0404pb(handler, i22);
    }

    public static void a(Handler handler, I2 i22, Runnable runnable) {
        handler.removeCallbacks(runnable, i22.f12337b.f12301b.getApiKey());
        handler.postAtTime(runnable, i22.f12337b.f12301b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(i22.f12337b.f12301b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
