package com.vk.metrics.eventtracking;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import com.vk.core.apps.BuildInfo;
import com.vk.metrics.eventtracking.Event;
import com.vkontakte.android.VKActivity;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import xsna.el3;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.ohp0;
import xsna.ozl;
import xsna.s3q0;
import xsna.sej;

/* compiled from: VkTracker.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class b implements ohp0 {
    public static volatile VkMainTracker c;
    public static final b a = new b();
    public static volatile boolean b = true;
    public static final ConcurrentLinkedQueue<Pair<Throwable, String>> d = new ConcurrentLinkedQueue<>();
    public static final ConcurrentLinkedQueue<Event> e = new ConcurrentLinkedQueue<>();
    public static final sej f = new sej(2);

    @Override // xsna.ohp0
    public final void a(Throwable th) {
        VkMainTracker vkMainTracker = c;
        if (vkMainTracker != null) {
            vkMainTracker.a(th);
        } else {
            d.add(new Pair<>(th, null));
        }
    }

    @Override // xsna.ohp0
    public final void b(ohp0 ohp0Var) {
        o(null).b(ohp0Var);
    }

    @Override // xsna.ohp0
    public final void c(Application application, Bundle bundle, gzs<s3q0> gzsVar) {
        o(null).c(application, bundle, gzsVar);
        b bVar = a;
        while (true) {
            ConcurrentLinkedQueue<Pair<Throwable, String>> concurrentLinkedQueue = d;
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
            Pair<Throwable, String> poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                Throwable d2 = poll.d();
                String g = poll.g();
                if (g == null) {
                    bVar.a(d2);
                } else {
                    bVar.getClass();
                    VkMainTracker vkMainTracker = c;
                    if (vkMainTracker != null) {
                        vkMainTracker.a(d2);
                    } else {
                        concurrentLinkedQueue.add(new Pair<>(d2, g));
                    }
                }
            }
        }
        if (p()) {
            o(null).h(f);
            return;
        }
        while (true) {
            ConcurrentLinkedQueue<Event> concurrentLinkedQueue2 = e;
            if (concurrentLinkedQueue2.isEmpty()) {
                return;
            }
            Event poll2 = concurrentLinkedQueue2.poll();
            if (poll2 != null) {
                k(poll2);
            }
        }
    }

    @Override // xsna.ohp0
    public final void d(long j) {
        ((VkMainTracker) o(null)).d(j);
    }

    @Override // xsna.ohp0
    public final void e(long j) {
        ((VkMainTracker) o(null)).e(j);
    }

    @Override // xsna.ohp0
    public final void f(Bundle bundle) {
        ((VkMainTracker) o(null)).f(bundle);
    }

    @Override // xsna.ohp0
    public final void g() {
        ((VkMainTracker) o(null)).g();
    }

    @Override // xsna.ohp0
    public final String getId() {
        return o(null).getId();
    }

    @Override // xsna.ohp0
    public final void i(VKActivity vKActivity) {
        ((VkMainTracker) o(null)).i(vKActivity);
    }

    @Override // xsna.ohp0
    public final void j(VKActivity vKActivity) {
        ((VkMainTracker) o(null)).j(vKActivity);
    }

    @Override // xsna.ohp0
    public final void k(Event event) {
        ((VkMainTracker) o(null)).k(event);
    }

    @Override // xsna.ohp0
    public final void l(String str) {
        ((VkMainTracker) o(null)).l(str);
    }

    @ozl
    public final void m(Object obj, String str, String str2) {
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g(str);
        aVar.a(obj, str2);
        k(aVar.e());
    }

    @ozl
    public final void n(String str) {
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g(str);
        k(aVar.e());
    }

    public final synchronized ohp0 o(Throwable th) {
        VkMainTracker vkMainTracker;
        vkMainTracker = c;
        if (vkMainTracker == null) {
            throw new IllegalStateException("Tracker isn't attached!", th);
        }
        return vkMainTracker;
    }

    public final synchronized boolean p() {
        VkMainTracker vkMainTracker;
        try {
            vkMainTracker = c;
        } catch (Throwable th) {
            throw th;
        }
        return epx.f(vkMainTracker != null ? vkMainTracker.getId() : null, "TrackerStartupFacade");
    }

    public final void q(Throwable th) {
        if (BuildInfo.h()) {
            ((VkMainTracker) o(th)).t(th);
            return;
        }
        VkMainTracker vkMainTracker = c;
        if (vkMainTracker != null) {
            vkMainTracker.t(th);
        } else {
            d.add(new Pair<>(th, null));
        }
    }

    @Override // xsna.ohp0
    public final void h(izs<? super Event, s3q0> izsVar) {
    }
}
