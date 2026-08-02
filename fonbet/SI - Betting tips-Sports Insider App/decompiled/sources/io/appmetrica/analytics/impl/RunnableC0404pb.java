package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0404pb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f14470a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f14471b;

    public RunnableC0404pb(Handler handler, I2 i22) {
        this.f14470a = new WeakReference(handler);
        this.f14471b = new WeakReference(i22);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f14470a.get();
        I2 i22 = (I2) this.f14471b.get();
        if (handler == null || i22 == null) {
            return;
        }
        boolean f6 = i22.f12337b.f();
        if (!f6) {
            PublicLogger publicLogger = i22.f12338c;
            Set set = AbstractC0576w9.f14825a;
            EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
            M3 m32 = new M3("", "", 3, 0, publicLogger);
            C0585wi c0585wi = i22.f12343h;
            Fh fh2 = i22.f12337b;
            c0585wi.getClass();
            c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
        }
        if (f6) {
            return;
        }
        C0379ob.a(handler, i22, this);
    }
}
