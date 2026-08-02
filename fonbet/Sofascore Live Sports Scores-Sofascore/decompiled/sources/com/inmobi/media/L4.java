package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import defpackage.ok3;
import defpackage.yp8;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class L4 {
    public final ContextData a;
    public final long b;
    public final String c = "L4";
    public final T4 d = new T4();
    public long e = -1;
    public final AtomicBoolean f = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();

    public L4(ContextData contextData, long j) {
        this.a = contextData;
        this.b = j;
    }

    public static final void a(L4 l4) {
        S4 s4 = S4.a;
        T4 t4 = l4.d;
        t4.getClass();
        synchronized (s4) {
            long currentTimeMillis = System.currentTimeMillis();
            long expiryTime = currentTimeMillis - (S4.c().getContextualData().getExpiryTime() * 1000);
            S4.a(expiryTime, S4.c().getContextualData().getMaxAdRecords() - 1);
            String jSONArray = U4.a(t4, S4.c().getContextualData().getSkipFields()).toString();
            jSONArray.getClass();
            C3385e6 c3385e6 = new C3385e6(AbstractC3411f6.a(jSONArray, S4.e), currentTimeMillis);
            S4.c.add(c3385e6);
            Object clone = S4.c.clone();
            clone.getClass();
            S4.d = (LinkedList) clone;
            ok3.J(new Q4(c3385e6, expiryTime, null));
            Unit unit = Unit.a;
        }
    }

    public final void b() {
        if (!S4.e()) {
            this.c.getClass();
            return;
        }
        if (!this.f.get()) {
            this.c.getClass();
            return;
        }
        a((int) (System.currentTimeMillis() - this.e));
        boolean andSet = this.g.getAndSet(true);
        String str = this.c;
        if (andSet) {
            str.getClass();
            return;
        }
        str.getClass();
        AbstractC3424fj.g.submit(new yp8(this, 4));
    }

    public final void c() {
        ContextData contextData;
        String advertisedContent;
        if (this.g.get() || (contextData = this.a) == null || (advertisedContent = contextData.getAdvertisedContent()) == null) {
            return;
        }
        T4 t4 = this.d;
        t4.getClass();
        t4.a = advertisedContent;
        this.c.getClass();
    }

    public final void d() {
        ContextData contextData;
        Long bidderId;
        if (this.g.get() || (contextData = this.a) == null || (bidderId = contextData.getBidderId()) == null) {
            return;
        }
        this.d.b = bidderId.longValue();
        this.c.getClass();
    }

    public final void e() {
        ContextData contextData;
        if (this.g.get() || (contextData = this.a) == null) {
            return;
        }
        this.d.f = contextData.getCasAdTypeId();
        this.c.getClass();
    }

    public final void f() {
        if (this.g.get()) {
            return;
        }
        this.d.g = 1;
        this.c.getClass();
    }

    public final void g() {
        if (this.g.get()) {
            return;
        }
        this.d.i = 1;
        this.c.getClass();
    }

    public final void h() {
        if (this.g.get()) {
            return;
        }
        this.d.h = 1;
        this.c.getClass();
    }

    public final void i() {
        if (this.g.get()) {
            return;
        }
        this.d.e = this.b;
        this.c.getClass();
    }

    public final void a(long j) {
        if (this.g.get()) {
            return;
        }
        this.d.c = j;
        this.c.getClass();
    }

    public final void a(int i) {
        if (this.g.get()) {
            return;
        }
        this.d.d = i;
        this.c.getClass();
    }

    public final void a() {
        this.c.getClass();
        ContextData contextData = this.a;
        if (contextData != null) {
            S4.a.a(contextData.getEnabled());
        }
        if (S4.e() && !this.f.getAndSet(true)) {
            this.e = System.currentTimeMillis();
            c();
            d();
            i();
            e();
            a(this.e / 1000);
        }
    }
}
