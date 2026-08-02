package com.inmobi.media;

import android.os.SystemClock;
import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3483i0 extends hoi implements Function2 {
    public final /* synthetic */ G a;
    public final /* synthetic */ C3586m0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3483i0(G g, C3586m0 c3586m0, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = g;
        this.b = c3586m0;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3483i0(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3483i0(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Map a = Hk.a(this.a);
        C3586m0 c3586m0 = this.b;
        a.put("networkType", F5.o());
        long j = c3586m0.c.f;
        ku3 ku3Var = Hl.a;
        a.put(Payload.LATENCY, new Long(SystemClock.elapsedRealtime() - j));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("ParseSuccess", a, EnumC3943zk.SDK);
        return Unit.a;
    }
}
