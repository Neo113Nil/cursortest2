package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ff extends hoi implements Function2 {
    public final /* synthetic */ Gf a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ff(Gf gf, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = gf;
        this.b = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Ff(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ff(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Qg qg = this.a.a;
        String str = this.b;
        qg.getClass();
        str.getClass();
        Qa qa = qg.a;
        ConcurrentHashMap concurrentHashMap = Qa.b;
        qa.a("omid_js_string", str, false);
        qg.a.a("last_ts", System.currentTimeMillis() / 1000, false);
        return Unit.a;
    }
}
