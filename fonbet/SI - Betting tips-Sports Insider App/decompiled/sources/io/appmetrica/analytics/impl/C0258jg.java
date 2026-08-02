package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258jg implements InterfaceC0155fg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14039a;

    /* renamed from: b, reason: collision with root package name */
    public final C0585wi f14040b;

    /* renamed from: c, reason: collision with root package name */
    public final Ve f14041c;

    /* renamed from: d, reason: collision with root package name */
    public final L7 f14042d;

    /* renamed from: e, reason: collision with root package name */
    public final C0458rg f14043e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f14044f;

    public C0258jg(C0585wi c0585wi, Ve ve2, @NonNull Handler handler) {
        this(c0585wi, ve2, handler, ve2.s());
    }

    public final void a() {
        if (this.f14039a) {
            return;
        }
        C0585wi c0585wi = this.f14040b;
        ResultReceiverC0508tg resultReceiverC0508tg = new ResultReceiverC0508tg(this.f14044f, this);
        c0585wi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC0508tg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3("", "", 4098, 0, anonymousInstance);
        m32.f12738m = bundle;
        F4 f42 = c0585wi.f14844a;
        c0585wi.a(C0585wi.a(m32, f42), f42, 1, (Map) null);
    }

    public C0258jg(C0585wi c0585wi, Ve ve2, Handler handler, boolean z5) {
        this(c0585wi, ve2, handler, z5, new L7(z5), new C0458rg());
    }

    public C0258jg(C0585wi c0585wi, Ve ve2, Handler handler, boolean z5, L7 l72, C0458rg c0458rg) {
        this.f14040b = c0585wi;
        this.f14041c = ve2;
        this.f14039a = z5;
        this.f14042d = l72;
        this.f14043e = c0458rg;
        this.f14044f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0155fg
    public final void a(C0359ng c0359ng) {
        String str = c0359ng == null ? null : c0359ng.f14361a;
        if (this.f14039a) {
            return;
        }
        synchronized (this) {
            L7 l72 = this.f14042d;
            this.f14043e.getClass();
            l72.f12522d = C0458rg.a(str);
            l72.a();
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            L7 l72 = this.f14042d;
            l72.f12521c = deferredDeeplinkParametersListener;
            if (l72.f12519a) {
                l72.a(1);
            } else {
                l72.a();
            }
            this.f14041c.u();
        } catch (Throwable th2) {
            this.f14041c.u();
            throw th2;
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            L7 l72 = this.f14042d;
            l72.f12520b = deferredDeeplinkListener;
            if (l72.f12519a) {
                l72.a(1);
            } else {
                l72.a();
            }
            this.f14041c.u();
        } catch (Throwable th2) {
            this.f14041c.u();
            throw th2;
        }
    }
}
