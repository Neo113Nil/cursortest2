package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a70;
import defpackage.f1d;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fe extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ He b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fe(He he, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = he;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Fe(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Fe(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            InterfaceC3880x9 l = this.b.l();
            if (l != null) {
                ((C3906y9) l).a("NativeRenderedState", "Track Views Attached to Telemetry Started - waiting for window state change");
            }
            f1d f1dVar = ((Xo) this.b.b.l.getValue()).b;
            Ee ee = new Ee(null);
            this.a = 1;
            if (rd0.z(f1dVar, ee, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        Ie ie = this.b.b;
        ie.b.b = true;
        ie.f.b.e.a(C3472hf.a);
        He he = this.b;
        AbstractC3521jd.a(he.b.c, he.l());
        C3328c0 c3328c0 = this.b.a.a.d;
        c3328c0.getClass();
        c3328c0.e = SystemClock.elapsedRealtime();
        Qc qc = (Qc) this.b.b.g.f.getValue();
        C3525jh c3525jh = this.b.b.c;
        qc.getClass();
        c3525jh.getClass();
        Map a = Hk.a(qc.a);
        ViewGroup parentView = c3525jh.a.getParentView();
        int i2 = 0;
        for (Pair pair : AbstractC3521jd.a(c3525jh)) {
            View view = (View) pair.a;
            short shortValue = ((Number) pair.b).shortValue();
            if (view != null && view.getVisibility() == 0 && Un.a(view, parentView)) {
                i2 |= 1 << shortValue;
            }
        }
        a.put("viewState", Integer.valueOf(i2));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("ViewStateOnParentAttached", a, EnumC3943zk.SDK);
        return Unit.a;
    }
}
