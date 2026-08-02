package com.moloco.sdk.acm.http;

import com.facebook.internal.t;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.l2;
import com.moloco.sdk.q2;
import defpackage.a70;
import defpackage.ak9;
import defpackage.aq4;
import defpackage.bl9;
import defpackage.duf;
import defpackage.h5k;
import defpackage.ij9;
import defpackage.lu3;
import defpackage.ml4;
import defpackage.mqi;
import defpackage.n8k;
import defpackage.p2g;
import defpackage.pm0;
import defpackage.qp3;
import defpackage.sq3;
import defpackage.swd;
import defpackage.u2g;
import defpackage.vh9;
import defpackage.w2g;
import defpackage.wj9;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yj9;
import defpackage.zk9;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e {
    public final vh9 a;
    public final String b;

    public e(vh9 vh9Var, String str) {
        vh9Var.getClass();
        str.getClass();
        this.a = vh9Var;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0101 A[Catch: Exception -> 0x0147, TryCatch #2 {Exception -> 0x0147, blocks: (B:13:0x0037, B:14:0x00f7, B:16:0x0101, B:19:0x0118), top: B:12:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0118 A[Catch: Exception -> 0x0147, TRY_LEAVE, TryCatch #2 {Exception -> 0x0147, blocks: (B:13:0x0037, B:14:0x00f7, B:16:0x0101, B:19:0x0118), top: B:12:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(long j, t tVar, Function1 function1, sq3 sq3Var) {
        d dVar;
        Object obj;
        lu3 lu3Var;
        int i;
        e eVar;
        zk9 zk9Var;
        try {
            if (sq3Var instanceof d) {
                dVar = (d) sq3Var;
                int i2 = dVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.v = i2 - Integer.MIN_VALUE;
                    obj = dVar.t;
                    lu3Var = lu3.a;
                    i = dVar.v;
                    KType kType = null;
                    if (i != 0) {
                        y6a.M(obj);
                        vh9 vh9Var = this.a;
                        String str = this.b;
                        yj9 yj9Var = new yj9();
                        yj9Var.d(ij9.c);
                        pm0 pm0Var = ak9.a;
                        str.getClass();
                        n8k.b(yj9Var.a, str);
                        bl9 bl9Var = new bl9();
                        bl9Var.b(Long.valueOf(j));
                        Unit unit = Unit.a;
                        yj9Var.c(bl9Var);
                        xw3.D(yj9Var, qp3.b);
                        function1.getClass();
                        function1.invoke(yj9Var.a());
                        l2 j2 = q2.j();
                        j2.d((ArrayList) tVar.b);
                        j2.h((ArrayList) tVar.c);
                        GeneratedMessageLite build = j2.build();
                        build.getClass();
                        byte[] byteArray = ((q2) build).toByteArray();
                        byteArray.getClass();
                        if (byteArray instanceof swd) {
                            yj9Var.d = byteArray;
                            yj9Var.b(null);
                        } else {
                            yj9Var.d = byteArray;
                            KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(byte[].class);
                            try {
                                kType = duf.b(byte[].class);
                            } catch (Throwable unused) {
                            }
                            yj9Var.b(new h5k(orCreateKotlinClass, kType));
                        }
                        yj9Var.d(ij9.c);
                        wj9 wj9Var = new wj9(yj9Var, vh9Var);
                        dVar.r = this;
                        dVar.v = 1;
                        obj = wj9Var.i(dVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            zk9Var = dVar.s;
                            eVar = dVar.r;
                            try {
                                y6a.M(obj);
                                String str2 = (String) obj;
                                if (!Intrinsics.c(zk9Var, zk9.c)) {
                                    mqi mqiVar = com.moloco.sdk.acm.services.c.a;
                                    eVar.getClass();
                                    com.moloco.sdk.acm.services.c.g("PostMetricsRequest", "Post Metrics Request Success: " + str2);
                                    p2g p2gVar = w2g.b;
                                    return str2;
                                }
                                mqi mqiVar2 = com.moloco.sdk.acm.services.c.a;
                                eVar.getClass();
                                com.moloco.sdk.acm.services.c.c("PostMetricsRequest", "Post Metrics Request Error: " + str2, 12);
                                p2g p2gVar2 = w2g.b;
                                return new u2g(new Exception("PostMetricsRequest Error: " + zk9Var));
                            } catch (Exception e) {
                                e = e;
                                Exception exc = e;
                                mqi mqiVar3 = com.moloco.sdk.acm.services.c.a;
                                eVar.getClass();
                                com.moloco.sdk.acm.services.c.c("PostMetricsRequest", "Post Metrics Request Exception", 8);
                                p2g p2gVar3 = w2g.b;
                                return new u2g(exc);
                            }
                        }
                        this = dVar.r;
                        y6a.M(obj);
                    }
                    aq4 aq4Var = (aq4) obj;
                    zk9 d = aq4Var.d();
                    dVar.r = this;
                    dVar.s = d;
                    dVar.v = 2;
                    obj = ml4.L(aq4Var, Charsets.UTF_8, dVar);
                    if (obj != lu3Var) {
                        eVar = this;
                        zk9Var = d;
                        String str22 = (String) obj;
                        if (!Intrinsics.c(zk9Var, zk9.c)) {
                        }
                    }
                    return lu3Var;
                }
            }
            if (i != 0) {
            }
            aq4 aq4Var2 = (aq4) obj;
            zk9 d2 = aq4Var2.d();
            dVar.r = this;
            dVar.s = d2;
            dVar.v = 2;
            obj = ml4.L(aq4Var2, Charsets.UTF_8, dVar);
            if (obj != lu3Var) {
            }
            return lu3Var;
        } catch (Exception e2) {
            e = e2;
            eVar = this;
        }
        dVar = new d(this, sq3Var);
        obj = dVar.t;
        lu3Var = lu3.a;
        i = dVar.v;
        KType kType2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(t tVar, Function1 function1, sq3 sq3Var) {
        c cVar;
        int i;
        if (sq3Var instanceof c) {
            cVar = (c) sq3Var;
            int i2 = cVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.t = i2 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.r;
                Serializable serializable = lu3.a;
                i = cVar2.t;
                if (i != 0) {
                    y6a.M(obj);
                    cVar2.t = 1;
                    Serializable a = a(5000L, tVar, function1, cVar2);
                    return a == serializable ? serializable : a;
                }
                if (i == 1) {
                    y6a.M(obj);
                    return ((w2g) obj).a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cVar = new c(this, sq3Var);
        c cVar22 = cVar;
        Object obj2 = cVar22.r;
        Serializable serializable2 = lu3.a;
        i = cVar22.t;
        if (i != 0) {
        }
    }
}
