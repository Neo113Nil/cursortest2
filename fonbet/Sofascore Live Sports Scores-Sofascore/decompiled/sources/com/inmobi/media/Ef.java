package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ef extends hoi implements Function2 {
    public final /* synthetic */ Gf a;
    public final /* synthetic */ AdConfig.OmidConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef(Gf gf, AdConfig.OmidConfig omidConfig, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = gf;
        this.b = omidConfig;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Ef(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ef(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Qa qa = this.a.a.a;
        qa.getClass();
        return Boolean.valueOf((System.currentTimeMillis() / 1000) - qa.a.getLong("last_ts", 0L) > this.b.getExpiry());
    }
}
