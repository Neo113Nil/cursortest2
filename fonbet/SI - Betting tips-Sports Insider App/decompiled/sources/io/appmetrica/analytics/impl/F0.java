package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bb f12211a = new Bb(C0040b4.l().d());

    /* renamed from: b, reason: collision with root package name */
    public final Cb f12212b = new Cb();

    /* renamed from: c, reason: collision with root package name */
    public final Eb f12213c = new Eb();

    public final void a(String str, String str2, String str3) {
        Bb bb2 = this.f12211a;
        if (bb2.f12045c.a((Void) null).f14527a && bb2.f12046d.a(str).f14527a && bb2.f12047e.a(str2).f14527a && bb2.f12048f.a(str3).f14527a) {
            this.f12212b.getClass();
            IHandlerExecutor a7 = C0040b4.l().f13374c.a();
            ((C0651z9) a7).f14990b.post(new com.appsflyer.internal.o(3, this, str, str2, str3));
            return;
        }
        StringBuilder q = r4.k.q("Failed report event from sender: ", str, " with name = ", str2, " and payload = ");
        q.append(str3);
        PublicLogger.INSTANCE.getAnonymousInstance().warning(androidx.appcompat.widget.c1.m("[AppMetricaLibraryAdapterProxy]", q.toString()), new Object[0]);
    }

    public static final void a(F0 f02, String str, String str2, String str3) {
        List list;
        Context a7;
        Eb eb2 = f02.f12213c;
        eb2.getClass();
        if (str == null) {
            str = "null";
        }
        Pair pair = new Pair("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair pair2 = new Pair("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        LinkedHashMap f6 = kotlin.collections.n0.f(pair, pair2, new Pair("payload", str3));
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (eb2) {
            try {
                if (eb2.f12192a == null && (a7 = C0040b4.l().f13378g.a()) != null) {
                    eb2.f12192a = kotlin.collections.u.f(new Pd(), new C0162fn(a7), new Jo());
                }
                list = eb2.f12192a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0491t) it.next()).a(f6);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(f6).build());
    }
}
