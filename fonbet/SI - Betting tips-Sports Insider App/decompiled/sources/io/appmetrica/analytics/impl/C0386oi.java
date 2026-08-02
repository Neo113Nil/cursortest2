package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386oi {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14423a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C0642z0 f14424b;

    public C0386oi(C0642z0 c0642z0) {
        this.f14424b = c0642z0;
    }

    public static C0386oi a() {
        return AbstractC0361ni.f14365a;
    }

    public final C0183gi a(Context context, String str) {
        C0183gi c0183gi;
        C0183gi c0183gi2 = (C0183gi) this.f14423a.get(str);
        if (c0183gi2 != null) {
            return c0183gi2;
        }
        synchronized (this.f14423a) {
            try {
                c0183gi = (C0183gi) this.f14423a.get(str);
                if (c0183gi == null) {
                    IHandlerExecutor a7 = C0040b4.l().f13374c.a();
                    this.f14424b.getClass();
                    if (C0617y0.f14936e == null) {
                        ((C0651z9) a7).f14990b.post(new RunnableC0336mi(this, context));
                    }
                    c0183gi = new C0183gi(context.getApplicationContext(), str, new C0642z0());
                    this.f14423a.put(str, c0183gi);
                    c0183gi.c(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0183gi;
    }
}
