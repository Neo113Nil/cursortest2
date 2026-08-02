package com.inmobi.media;

import android.os.SystemClock;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3457h0 extends hoi implements Function2 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ C3586m0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3457h0(C3586m0 c3586m0, Map map, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = map;
        this.b = c3586m0;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3457h0(this.b, this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Map map = this.a;
        return new C3457h0(this.b, map, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        long j;
        long elapsedRealtime;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Object obj2 = this.a.get(IronSourceConstants.EVENTS_ERROR_CODE);
        Short sh = obj2 instanceof Short ? (Short) obj2 : null;
        Map a = Hk.a(this.b.b);
        C3586m0 c3586m0 = this.b;
        if (sh != null && sh.shortValue() == 2138) {
            j = c3586m0.c.c;
            ku3 ku3Var = Hl.a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else if ((sh == null || sh.shortValue() != 2139) && (sh == null || sh.shortValue() != 2203)) {
            j = c3586m0.c.a;
            ku3 ku3Var2 = Hl.a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j = c3586m0.c.e;
            ku3 ku3Var3 = Hl.a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        a.put(Payload.LATENCY, new Long(elapsedRealtime - j));
        a.putAll(this.a);
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("AdLoadFailed", a, EnumC3943zk.SDK);
        return Unit.a;
    }
}
