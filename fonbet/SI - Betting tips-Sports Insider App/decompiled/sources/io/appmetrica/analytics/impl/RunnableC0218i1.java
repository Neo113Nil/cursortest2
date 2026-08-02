package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0218i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f13917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f13918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f13919d;

    public RunnableC0218i1(C0493t1 c0493t1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f13919d = c0493t1;
        this.f13916a = context;
        this.f13917b = startupParamsCallback;
        this.f13918c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0642z0 c0642z0 = this.f13919d.f14654a;
        Context applicationContext = this.f13916a.getApplicationContext();
        c0642z0.getClass();
        C0617y0 a7 = C0617y0.a(applicationContext);
        a7.f().a(this.f13917b, this.f13918c);
    }
}
