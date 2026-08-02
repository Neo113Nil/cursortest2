package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.wv8;
import defpackage.y6a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Im extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Nm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Im(Nm nm, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = nm;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Im im = new Im(this.c, rq3Var);
        im.b = obj;
        return im;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Im im = new Im(this.c, (rq3) obj2);
        im.b = (AbstractC3712qm) obj;
        return im.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        AbstractC3712qm abstractC3712qm;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            AbstractC3712qm abstractC3712qm2 = (AbstractC3712qm) this.b;
            b1d b1dVar = this.c.d;
            this.b = abstractC3712qm2;
            this.a = 1;
            if (b1dVar.emit(abstractC3712qm2, this) == lu3Var) {
                return lu3Var;
            }
            abstractC3712qm = abstractC3712qm2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            abstractC3712qm = (AbstractC3712qm) this.b;
            y6a.M(obj);
        }
        Pn pn = this.c.c.g;
        abstractC3712qm.getClass();
        if (abstractC3712qm instanceof C3299an) {
            Map a = Hk.a(pn.a);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("VideoLoadStarted", a, EnumC3943zk.SDK);
        } else if (abstractC3712qm instanceof C3377dn) {
            Map a2 = Hk.a(pn.a);
            C3839vk c3839vk2 = C3839vk.a;
            C3839vk.b("VideoLoadSuccess", a2, EnumC3943zk.SDK);
        } else if (abstractC3712qm instanceof Jn) {
            boolean[] zArr = pn.b;
            if (!zArr[0]) {
                zArr[0] = true;
                Map a3 = Hk.a(pn.a);
                C3839vk c3839vk3 = C3839vk.a;
                C3839vk.b("VideoStart", a3, EnumC3943zk.SDK);
            }
        } else if (abstractC3712qm instanceof Wm) {
            boolean[] zArr2 = pn.b;
            if (!zArr2[1]) {
                zArr2[1] = true;
                Map a4 = Hk.a(pn.a);
                C3839vk c3839vk4 = C3839vk.a;
                C3839vk.b("VideoFirstQuartile", a4, EnumC3943zk.SDK);
            }
        } else if (abstractC3712qm instanceof Hn) {
            boolean[] zArr3 = pn.b;
            if (!zArr3[2]) {
                zArr3[2] = true;
                Map a5 = Hk.a(pn.a);
                C3839vk c3839vk5 = C3839vk.a;
                C3839vk.b("VideoSecondQuartile", a5, EnumC3943zk.SDK);
            }
        } else if (abstractC3712qm instanceof Qn) {
            boolean[] zArr4 = pn.b;
            if (!zArr4[3]) {
                zArr4[3] = true;
                Map a6 = Hk.a(pn.a);
                C3839vk c3839vk6 = C3839vk.a;
                C3839vk.b("VideoThirdQuartile", a6, EnumC3943zk.SDK);
            }
        } else if (abstractC3712qm instanceof C3660om) {
            boolean[] zArr5 = pn.b;
            if (!zArr5[4]) {
                zArr5[4] = true;
                Map a7 = Hk.a(pn.a);
                C3839vk c3839vk7 = C3839vk.a;
                C3839vk.b("VideoComplete", a7, EnumC3943zk.SDK);
            }
        } else if (abstractC3712qm instanceof C3686pm) {
            LinkedHashMap q = tub.q(Hk.a(pn.a));
            q.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 66);
            C3839vk c3839vk8 = C3839vk.a;
            C3839vk.b("VideoLoadFailure", q, EnumC3943zk.SDK);
        }
        C3582lm c3582lm = this.c.c.f;
        if (abstractC3712qm instanceof C3377dn) {
            c3582lm.b.d = Gl.a(((C3377dn) abstractC3712qm).a);
            c3582lm.c.f.a(C3472hf.a);
        } else if (abstractC3712qm instanceof C3686pm) {
            c3582lm.c.m.a(new ep(wv8.o("[ERRORCODE]", String.valueOf(405)), null, 2));
        } else if (abstractC3712qm instanceof Jn) {
            String str = ((Jn) abstractC3712qm).b;
            if (c3582lm.a.incrementAndGet() > 1) {
                LinkedHashMap i2 = tub.i(new Pair("trigger", str));
                C3839vk c3839vk9 = C3839vk.a;
                C3839vk.b("MultipleVideoReadyFired", i2, EnumC3943zk.SDK);
            }
            Lc lc = c3582lm.c.g;
            C3472hf c3472hf = C3472hf.a;
            lc.a(c3472hf);
            c3582lm.c.h.a(c3472hf);
        } else if (abstractC3712qm instanceof Gn) {
            c3582lm.c.l.a(C3472hf.a);
        } else if (abstractC3712qm instanceof C3635nn) {
            c3582lm.c.k.a(C3472hf.a);
        } else if (abstractC3712qm instanceof Wm) {
            c3582lm.c.b.a(C3472hf.a);
        } else if (abstractC3712qm instanceof Hn) {
            c3582lm.c.c.a(C3472hf.a);
        } else if (abstractC3712qm instanceof Qn) {
            c3582lm.c.d.a(C3472hf.a);
        } else if (abstractC3712qm instanceof C3660om) {
            c3582lm.c.e.a(C3472hf.a);
        } else if (abstractC3712qm instanceof C3868wn) {
            c3582lm.b.e = ((C3868wn) abstractC3712qm).a;
            c3582lm.c.n.a(C3472hf.a);
        } else if (abstractC3712qm instanceof W1) {
            if (((W1) abstractC3712qm).a) {
                c3582lm.c.i.a(C3472hf.a);
            } else {
                c3582lm.c.j.a(C3472hf.a);
            }
        }
        return Unit.a;
    }
}
