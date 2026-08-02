package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import defpackage.hoi;
import defpackage.joa;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class E5 extends hoi implements Function2 {
    public E5(rq3 rq3Var) {
        super(2, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new E5(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E5((rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Context context;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            context = AbstractC3424fj.a;
        } catch (Exception e) {
            F5 f5 = F5.a;
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
        if (context == null) {
            return Unit.a;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return Unit.a;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        F5 f52 = F5.a;
        F5.n = memoryInfo.lowMemory;
        return Unit.a;
    }
}
