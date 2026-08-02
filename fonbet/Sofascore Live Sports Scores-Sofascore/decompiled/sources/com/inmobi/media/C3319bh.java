package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.a70;
import defpackage.hoi;
import defpackage.joa;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.bh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3319bh extends hoi implements Function2 {
    public int a;

    public C3319bh(rq3 rq3Var) {
        super(2, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3319bh(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3319bh((rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        JSONObject jSONObject = null;
        try {
            if (i == 0) {
                y6a.M(obj);
                C3422fh c3422fh = C3422fh.a;
                c3422fh.getClass();
                Context context = AbstractC3424fj.a;
                if (context != null) {
                    Qg qg = C3422fh.d;
                    if (qg == null) {
                        qg = new Qg(context, "pub_signals_store");
                        C3422fh.d = qg;
                    }
                    if (qg == null) {
                        Intrinsics.i("prefDao");
                        throw null;
                    }
                    String a = qg.a("saved_signals");
                    if (a != null) {
                        jSONObject = new JSONObject(a);
                    }
                }
                if (jSONObject == null) {
                    return Unit.a;
                }
                SignalsConfig.PublisherConfig c = C3422fh.c();
                JSONObject a2 = AbstractC3448gh.a(AbstractC3448gh.a(AbstractC3448gh.a(jSONObject, "obj_", c.getObj().getExpiry()), "auto_", c.getAuto().getExpiry()), "dir_", c.getDirect().getExpiry());
                this.a = 1;
                if (c3422fh.a(a2, this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
        return Unit.a;
    }
}
