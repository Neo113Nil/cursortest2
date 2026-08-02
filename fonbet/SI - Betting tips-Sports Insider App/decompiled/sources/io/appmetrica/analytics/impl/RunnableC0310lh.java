package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0310lh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14208a;

    /* renamed from: b, reason: collision with root package name */
    public final P5 f14209b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f14210c;

    /* renamed from: d, reason: collision with root package name */
    public final C0014a4 f14211d;

    public RunnableC0310lh(Context context, P5 p52, Bundle bundle, C0014a4 c0014a4) {
        this.f14208a = context;
        this.f14209b = p52;
        this.f14210c = bundle;
        this.f14211d = c0014a4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            H3 a7 = H3.a(this.f14208a, this.f14210c);
            if (a7 == null) {
                return;
            }
            P3 a10 = P3.a(a7);
            C0132ej v5 = C0353na.I.v();
            v5.a(a7.f12301b.getAppVersion(), a7.f12301b.getAppBuildNumber());
            v5.a(a7.f12301b.getDeviceType());
            C0397p4 c0397p4 = new C0397p4(new Zl(a7), new C0372o4(a7.f12301b, AbstractC0176gb.c(a7.f12300a.f12060a.getAsString("PROCESS_CFG_CLIDS"))), a7.f12300a.f12061b);
            this.f14211d.a(a10, c0397p4).a(this.f14209b, c0397p4);
        } catch (Throwable th2) {
            Qj qj = AbstractC0387oj.f14425a;
            String str = "Exception during processing event with type: " + this.f14209b.f12730d + " (" + this.f14209b.f12731e + "): " + th2.getMessage();
            qj.getClass();
            qj.a(new C0412pj(str, th2));
        }
    }
}
