package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.bk6;
import defpackage.duf;
import defpackage.fp4;
import defpackage.fuf;
import defpackage.gh0;
import defpackage.gvd;
import defpackage.hoi;
import defpackage.i5k;
import defpackage.jk5;
import defpackage.joa;
import defpackage.kk5;
import defpackage.km5;
import defpackage.lk5;
import defpackage.lu3;
import defpackage.ok3;
import defpackage.rq3;
import defpackage.v9g;
import defpackage.w9h;
import defpackage.y6a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ul, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3814ul extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3814ul(Context context, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = context;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3814ul(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3814ul(this.b, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [km5] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ?? r5;
        ReentrantLock reentrantLock;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        String str = null;
        if (i == 0) {
            y6a.M(obj);
            joa joaVar = AbstractC3750s9.a;
            Context context = AbstractC3424fj.a;
            if (context != null) {
                String[] databaseList = context.databaseList();
                if (databaseList != null) {
                    r5 = new ArrayList();
                    for (String str2 : databaseList) {
                        str2.getClass();
                        if (new Regex("com\\.im_([0-9]+\\.){2}[0-9]+([-.\\w]*).db(-wal)?(-shm)?").f(str2) && !str2.equals("com.im_11.3.0.db")) {
                            r5.add(str2);
                        }
                    }
                } else {
                    r5 = km5.a;
                }
                for (String str3 : r5) {
                    File databasePath = context.getDatabasePath(str3);
                    if (databasePath != null && databasePath.exists()) {
                        context.deleteDatabase(str3);
                    }
                }
            }
            S4 s4 = S4.a;
            ok3.J(new N4(null));
            if (F0.b == null) {
                F0.b = new B0();
            }
            C3694q4 c3694q4 = AbstractC3435g4.a;
            AbstractC3435g4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, F0.d);
            B0 b0 = F0.b;
            if (b0 == null) {
                Intrinsics.i("executor");
                throw null;
            }
            if (!b0.a.get()) {
                B0 b02 = F0.b;
                if (b02 == null) {
                    Intrinsics.i("executor");
                    throw null;
                }
                if (!b02.a.get() && ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                    b02.a();
                }
            }
            Q9.b();
            Q9.a();
            T5 t5 = R5.a;
            AdConfig adConfig = (AdConfig) AbstractC3435g4.a.a(AdConfig.class);
            O0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
            boolean a = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
            R5.e = a;
            if (!a && R5.c == null) {
                Context context2 = AbstractC3424fj.a;
                if (context2 != null) {
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    str = Pa.a(context2, "display_info_store").a.getString("gesture_margin", null);
                }
                R5.c = str;
            }
            if (adConfig.getRendering().getEnableImmersive()) {
                R5.j();
                R5.i();
            }
            AbstractC3603mh.b();
            C3892xl c3892xl = C3892xl.a;
            this.a = 1;
            if (c3892xl.b(this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        Context context3 = this.b;
        context3.getClass();
        try {
            fuf fufVar = duf.a;
            fufVar.getOrCreateKotlinClass(defpackage.gd.class).getSimpleName();
            fufVar.getOrCreateKotlinClass(defpackage.se.class).getSimpleName();
            fufVar.getOrCreateKotlinClass(v9g.class).getSimpleName();
            Set b = w9h.b(new defpackage.gd(new ComponentName(context3, (Class<?>) InMobiAdActivity.class)));
            b.getClass();
            defpackage.se seVar = new defpackage.se(b);
            Context applicationContext = context3.getApplicationContext();
            applicationContext.getClass();
            bk6 bk6Var = bk6.e;
            if (bk6.e == null) {
                reentrantLock = bk6.f;
                reentrantLock.lock();
                try {
                    if (bk6.e == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        applicationContext2.getClass();
                        bk6.e = new bk6(applicationContext2, gvd.C(applicationContext2));
                    }
                    Unit unit = Unit.a;
                    reentrantLock.unlock();
                } finally {
                }
            }
            bk6 bk6Var2 = bk6.e;
            bk6Var2.getClass();
            fp4 fp4Var = bk6Var2.d;
            reentrantLock = bk6.f;
            reentrantLock.lock();
            try {
                fp4Var.getClass();
                gh0 gh0Var = (gh0) fp4Var.b;
                if (!gh0Var.contains(seVar)) {
                    HashMap hashMap = (HashMap) fp4Var.c;
                    gh0 gh0Var2 = (gh0) fp4Var.b;
                    if (!gh0Var2.contains(seVar)) {
                        String a2 = seVar.a();
                        if (a2 == null) {
                            gh0Var2.add(seVar);
                        } else if (hashMap.containsKey(a2)) {
                            i5k.a(gh0Var2).remove((lk5) hashMap.get(a2));
                            hashMap.put(a2, seVar);
                            gh0Var2.add(seVar);
                        } else {
                            hashMap.put(a2, seVar);
                            gh0Var2.add(seVar);
                        }
                    }
                    kk5 kk5Var = bk6Var2.b;
                    if (kk5Var != null) {
                        reentrantLock.lock();
                        try {
                            Set W0 = CollectionsKt.W0(gh0Var);
                            reentrantLock.unlock();
                            ((jk5) kk5Var).d(W0);
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                }
                Unit unit2 = Unit.a;
            } finally {
            }
        } catch (NoClassDefFoundError unused) {
        }
        Context context4 = this.b;
        context4.getClass();
        ConcurrentHashMap concurrentHashMap2 = Qa.b;
        Pa.a(context4, "sdk_version_store").a("sdk_version", "11.3.0", false);
        C3892xl.b = true;
        return Unit.a;
    }
}
