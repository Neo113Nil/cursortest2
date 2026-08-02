package com.facebook.login;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.acm.db.MetricsDb_Impl;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.publisher.c0;
import com.moloco.sdk.internal.services.b0;
import com.moloco.sdk.m2;
import com.moloco.sdk.n2;
import com.moloco.sdk.o2;
import com.moloco.sdk.p2;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g1;
import defpackage.a70;
import defpackage.ad2;
import defpackage.ak9;
import defpackage.ccj;
import defpackage.cl;
import defpackage.ddi;
import defpackage.e6b;
import defpackage.e7j;
import defpackage.fdi;
import defpackage.g6b;
import defpackage.gdi;
import defpackage.gk9;
import defpackage.hje;
import defpackage.hoi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.i3l;
import defpackage.ij9;
import defpackage.l6g;
import defpackage.ljg;
import defpackage.lu3;
import defpackage.mj5;
import defpackage.mqi;
import defpackage.n8k;
import defpackage.p2g;
import defpackage.pm0;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.u2g;
import defpackage.uci;
import defpackage.un0;
import defpackage.vh9;
import defpackage.vo3;
import defpackage.w2g;
import defpackage.wj9;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yj9;
import defpackage.ypa;
import defpackage.yso;
import defpackage.yx1;
import defpackage.z45;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public i(int i, ad2 ad2Var) {
        this.a = 6;
        this.b = ad2Var;
        fdi a = gdi.a(i0.a(i, ad2Var, null));
        this.c = a;
        this.d = un0.K(yso.r(new i3l(this, null, 24)), ad2Var, new uci(0L, Long.MAX_VALUE), ((ddi) a.getValue()).getValue());
    }

    public static void a(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, false, 4, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar) {
        com.moloco.sdk.internal.publisher.a0 a0Var = (com.moloco.sdk.internal.publisher.a0) this.b;
        xw3.L(a0Var.j, null, null, new com.moloco.sdk.internal.publisher.y(a0Var, (c0) this.c, aVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Enum d(sq3 sq3Var) {
        com.moloco.sdk.internal.services.bidtoken.u uVar;
        int i;
        l0 l0Var;
        if (sq3Var instanceof com.moloco.sdk.internal.services.bidtoken.u) {
            uVar = (com.moloco.sdk.internal.services.bidtoken.u) sq3Var;
            int i2 = uVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.u = i2 - Integer.MIN_VALUE;
                Object obj = uVar.s;
                lu3 lu3Var = lu3.a;
                i = uVar.u;
                rq3 rq3Var = null;
                char c = 1;
                if (i != 0) {
                    y6a.M(obj);
                    if (((com.moloco.sdk.internal.services.bidtoken.m) this.d).a.length() == 0) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "] cached bidToken is empty, needs refresh", null, false, 12, null);
                        return com.moloco.sdk.internal.services.bidtoken.b.a;
                    }
                    String str = ((com.moloco.sdk.internal.services.bidtoken.m) this.d).a;
                    uVar.r = this;
                    uVar.u = 1;
                    obj = xw3.R(com.moloco.sdk.internal.bidtoken.b.a, new e7j(c == true ? 1 : 0, str, rq3Var), uVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = uVar.r;
                    y6a.M(obj);
                }
                l0Var = (l0) obj;
                if (!(l0Var instanceof j0)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "] Failed to parse cached token for expiration, needs refresh", null, false, 12, null);
                    return com.moloco.sdk.internal.services.bidtoken.b.a;
                }
                if (!(l0Var instanceof k0)) {
                    zzl.b();
                    return null;
                }
                com.moloco.sdk.internal.bidtoken.a aVar = (com.moloco.sdk.internal.bidtoken.a) ((k0) l0Var).a;
                Object obj2 = this.c;
                long currentTimeMillis = System.currentTimeMillis();
                if (com.facebook.appevents.g.h(aVar, currentTimeMillis)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "] Bid token expired, needs refresh", null, false, 12, null);
                    return com.moloco.sdk.internal.services.bidtoken.b.a;
                }
                long millis = TimeUnit.SECONDS.toMillis(aVar.a);
                boolean z = !com.facebook.appevents.g.h(aVar, currentTimeMillis) && millis - currentTimeMillis <= 900000;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder o = ljg.o("[sbt] currentTimeInMillis: ", currentTimeMillis, ", expiryTimeMillis: ");
                o.append(millis);
                o.append(", nearExpiryThresholdMillis: 900000, expiring: ");
                o.append(z);
                MolocoLogger.debugBuildLog$default(molocoLogger, "ServerBidTokenCache", o.toString(), false, 4, null);
                if (z) {
                    MolocoLogger.info$default(molocoLogger, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "] Bid token is near expiry. It will expire soon", null, false, 12, null);
                    return com.moloco.sdk.internal.services.bidtoken.b.b;
                }
                MolocoLogger.info$default(molocoLogger, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "] Bid token has not expired", null, false, 12, null);
                MolocoLogger.info$default(molocoLogger, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "] Bid token doesn't need refresh", null, false, 12, null);
                return com.moloco.sdk.internal.services.bidtoken.b.c;
            }
        }
        uVar = new com.moloco.sdk.internal.services.bidtoken.u(this, sq3Var);
        Object obj3 = uVar.s;
        lu3 lu3Var2 = lu3.a;
        i = uVar.u;
        rq3 rq3Var2 = null;
        char c2 = 1;
        if (i != 0) {
        }
        l0Var = (l0) obj3;
        if (!(l0Var instanceof j0)) {
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public void destroy() {
        ((g6b) this.b).d((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.e) this.d);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:3|(2:5|(7:7|8|9|(1:(1:12)(2:18|19))(3:20|21|(2:23|24))|13|14|15))|27|8|9|(0)(0)|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        defpackage.bea.u(r2.getContext());
        r0 = com.moloco.sdk.acm.services.c.a;
        com.moloco.sdk.acm.services.c.h("ApplicationLifecycleObserver", "Unable to register lifecycle observer [process=" + com.moloco.sdk.acm.services.c.b + ']', 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        defpackage.bea.u(r2.getContext());
        r0 = com.moloco.sdk.acm.services.c.a;
        com.moloco.sdk.acm.services.c.h("ApplicationLifecycleObserver", "Unable to register lifecycle observer [process=" + com.moloco.sdk.acm.services.c.b + ']', 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c6, code lost:
    
        if (r1 != r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f1, code lost:
    
        if (r1 == r4) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(sq3 sq3Var) {
        com.moloco.sdk.acm.eventprocessing.c cVar;
        int i;
        ArrayList arrayList;
        Object b;
        com.moloco.sdk.acm.services.b bVar;
        int i2;
        i iVar = this;
        rq3 rq3Var = null;
        switch (iVar.a) {
            case 2:
                if (sq3Var instanceof com.moloco.sdk.acm.eventprocessing.c) {
                    cVar = (com.moloco.sdk.acm.eventprocessing.c) sq3Var;
                    int i3 = cVar.u;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        cVar.u = i3 - Integer.MIN_VALUE;
                        Object obj = cVar.s;
                        lu3 lu3Var = lu3.a;
                        i = cVar.u;
                        if (i != 0) {
                            y6a.M(obj);
                            com.moloco.sdk.acm.db.j jVar = (com.moloco.sdk.acm.db.j) iVar.c;
                            cVar.r = iVar;
                            cVar.u = 1;
                            MetricsDb_Impl metricsDb_Impl = jVar.a;
                            obj = l6g.c0(cVar, metricsDb_Impl, new cl(metricsDb_Impl, new com.moloco.sdk.acm.db.e(jVar, 0), rq3Var, 29));
                            break;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                iVar = cVar.r;
                                y6a.M(obj);
                                b = ((w2g) obj).a;
                                Object obj2 = b;
                                p2g p2gVar = w2g.b;
                                if (!(obj2 instanceof u2g)) {
                                    mqi mqiVar = com.moloco.sdk.acm.services.c.a;
                                    iVar.getClass();
                                    com.moloco.sdk.acm.services.c.g("RequestAndPurgeDB", "Request Success");
                                }
                                Throwable a = w2g.a(obj2);
                                if (a == null) {
                                    return obj2;
                                }
                                mqi mqiVar2 = com.moloco.sdk.acm.services.c.a;
                                iVar.getClass();
                                com.moloco.sdk.acm.services.c.c("RequestAndPurgeDB", "Request failure: " + a.getMessage(), 12);
                                return obj2;
                            }
                            iVar = cVar.r;
                            y6a.M(obj);
                        }
                        List<com.moloco.sdk.acm.db.b> list = (List) obj;
                        mqi mqiVar3 = com.moloco.sdk.acm.services.c.a;
                        iVar.getClass();
                        com.moloco.sdk.acm.services.c.g("RequestAndPurgeDB", list.size() + " events processed.");
                        ArrayList arrayList2 = new ArrayList();
                        arrayList = new ArrayList();
                        for (com.moloco.sdk.acm.db.b bVar2 : list) {
                            bVar2.getClass();
                            Long l = bVar2.e;
                            List list2 = bVar2.f;
                            String str = bVar2.b;
                            ArrayList arrayList3 = arrayList;
                            if (System.currentTimeMillis() - bVar2.c < 720000) {
                                int i4 = com.moloco.sdk.acm.eventprocessing.b.a[bVar2.d.ordinal()];
                                if (i4 == 1) {
                                    m2 h = n2.h();
                                    h.i(str);
                                    h.d(list2);
                                    if (l != null) {
                                        h.h((int) l.longValue());
                                    }
                                    GeneratedMessageLite build = h.build();
                                    build.getClass();
                                    arrayList = arrayList3;
                                    arrayList.add(build);
                                } else {
                                    if (i4 != 2) {
                                        zzl.b();
                                        return null;
                                    }
                                    o2 i5 = p2.i();
                                    i5.i(str);
                                    i5.d(list2);
                                    if (l != null) {
                                        i5.h(l.longValue());
                                    }
                                    GeneratedMessageLite build2 = i5.build();
                                    build2.getClass();
                                    arrayList2.add(build2);
                                }
                            }
                            arrayList = arrayList3;
                        }
                        com.facebook.internal.t tVar = new com.facebook.internal.t(3, arrayList, arrayList2);
                        if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                            p2g p2gVar2 = w2g.b;
                            return "No metrics to process";
                        }
                        com.moloco.sdk.acm.http.e eVar = (com.moloco.sdk.acm.http.e) iVar.b;
                        Function1 function1 = (Function1) iVar.d;
                        cVar.r = iVar;
                        cVar.u = 2;
                        b = eVar.b(tVar, function1, cVar);
                        break;
                    }
                }
                cVar = new com.moloco.sdk.acm.eventprocessing.c(iVar, sq3Var);
                Object obj3 = cVar.s;
                lu3 lu3Var2 = lu3.a;
                i = cVar.u;
                if (i != 0) {
                }
                List<com.moloco.sdk.acm.db.b> list3 = (List) obj3;
                mqi mqiVar32 = com.moloco.sdk.acm.services.c.a;
                iVar.getClass();
                com.moloco.sdk.acm.services.c.g("RequestAndPurgeDB", list3.size() + " events processed.");
                ArrayList arrayList22 = new ArrayList();
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                }
                com.facebook.internal.t tVar2 = new com.facebook.internal.t(3, arrayList, arrayList22);
                if (!arrayList.isEmpty()) {
                }
                com.moloco.sdk.acm.http.e eVar2 = (com.moloco.sdk.acm.http.e) iVar.b;
                Function1 function12 = (Function1) iVar.d;
                cVar.r = iVar;
                cVar.u = 2;
                b = eVar2.b(tVar2, function12, cVar);
            default:
                if (sq3Var instanceof com.moloco.sdk.acm.services.b) {
                    bVar = (com.moloco.sdk.acm.services.b) sq3Var;
                    int i6 = bVar.t;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        bVar.t = i6 - Integer.MIN_VALUE;
                        Object obj4 = bVar.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = bVar.t;
                        if (i2 != 0) {
                            y6a.M(obj4);
                            hs4 hs4Var = z45.a;
                            r69 r69Var = rob.a.f;
                            hje hjeVar = new hje(iVar, rq3Var, 19);
                            bVar.t = 1;
                            if (xw3.R(r69Var, hjeVar, bVar) == lu3Var3) {
                                return lu3Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj4);
                        }
                        return Unit.a;
                    }
                }
                bVar = new com.moloco.sdk.acm.services.b(iVar, sq3Var);
                Object obj42 = bVar.r;
                lu3 lu3Var32 = lu3.a;
                i2 = bVar.t;
                if (i2 != 0) {
                }
                return Unit.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(com.moloco.sdk.internal.services.bidtoken.m mVar, sq3 sq3Var) {
        com.moloco.sdk.internal.services.bidtoken.v vVar;
        int i;
        l0 l0Var;
        i iVar;
        com.moloco.sdk.internal.bidtoken.a aVar;
        l0 l0Var2;
        if (sq3Var instanceof com.moloco.sdk.internal.services.bidtoken.v) {
            vVar = (com.moloco.sdk.internal.services.bidtoken.v) sq3Var;
            int i2 = vVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.w = i2 - Integer.MIN_VALUE;
                Object obj = vVar.u;
                lu3 lu3Var = lu3.a;
                i = vVar.w;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    a("[Thread: " + Thread.currentThread().getName() + "] Acquired lock, checking for new token expiry");
                    if (Intrinsics.c(((com.moloco.sdk.internal.services.bidtoken.m) this.d).a, "")) {
                        this.d = mVar;
                        a("[Thread: " + Thread.currentThread().getName() + "] Updated cache with new bidToken as existing token was empty");
                        return Unit.a;
                    }
                    String str = mVar.a;
                    vVar.r = this;
                    vVar.s = mVar;
                    vVar.w = 1;
                    obj = xw3.R(com.moloco.sdk.internal.bidtoken.b.a, new e7j(i3, str, rq3Var), vVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar = vVar.t;
                        mVar = vVar.s;
                        iVar = vVar.r;
                        y6a.M(obj);
                        l0Var2 = (l0) obj;
                        if (l0Var2 instanceof k0) {
                            iVar.d = mVar;
                            a("[Thread: " + Thread.currentThread().getName() + "] Current token parsing failed. Updated cache with new bidToken");
                        } else {
                            if (aVar.a > ((com.moloco.sdk.internal.bidtoken.a) ((k0) l0Var2).a).a) {
                                iVar.d = mVar;
                                a("[Thread: " + Thread.currentThread().getName() + "] Updated cache with new bidToken");
                            } else {
                                String str2 = "[Thread: " + Thread.currentThread().getName() + "] New token's expiration is not greater than the existing token's expiration. Cache not updated.";
                                iVar.getClass();
                                a(str2);
                            }
                        }
                        return Unit.a;
                    }
                    mVar = vVar.s;
                    this = vVar.r;
                    y6a.M(obj);
                }
                l0Var = (l0) obj;
                if (l0Var instanceof k0) {
                    String str3 = "[Thread: " + Thread.currentThread().getName() + "] New token parsing failed. Cache not updated.";
                    this.getClass();
                    a(str3);
                    return Unit.a;
                }
                com.moloco.sdk.internal.bidtoken.a aVar2 = (com.moloco.sdk.internal.bidtoken.a) ((k0) l0Var).a;
                Object obj2 = this.b;
                String str4 = ((com.moloco.sdk.internal.services.bidtoken.m) this.d).a;
                vVar.r = this;
                vVar.s = mVar;
                vVar.t = aVar2;
                vVar.w = 2;
                Object R = xw3.R(com.moloco.sdk.internal.bidtoken.b.a, new e7j(i3, str4, rq3Var), vVar);
                if (R != lu3Var) {
                    iVar = this;
                    aVar = aVar2;
                    obj = R;
                    l0Var2 = (l0) obj;
                    if (l0Var2 instanceof k0) {
                    }
                    return Unit.a;
                }
                return lu3Var;
            }
        }
        vVar = new com.moloco.sdk.internal.services.bidtoken.v(this, sq3Var);
        Object obj3 = vVar.u;
        lu3 lu3Var2 = lu3.a;
        i = vVar.w;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        l0Var = (l0) obj3;
        if (l0Var instanceof k0) {
        }
    }

    public Object g(String str, mj5 mj5Var) {
        vh9 vh9Var = (vh9) this.d;
        yj9 yj9Var = new yj9();
        pm0 pm0Var = ak9.a;
        n8k.b(yj9Var.a, str);
        gk9.a(yj9Var, new com.moloco.sdk.acm.db.e(this, 7));
        yj9Var.d(ij9.b);
        return new wj9(yj9Var, vh9Var).i(mj5Var);
    }

    public Object h(String str, com.moloco.sdk.acm.db.c cVar, long j, ArrayList arrayList, hoi hoiVar) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(hq4.c, new vo3(str, this, cVar, j, arrayList, null), hoiVar);
        return R == lu3.a ? R : Unit.a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        cVar.getClass();
        com.moloco.sdk.internal.publisher.a0 a0Var = (com.moloco.sdk.internal.publisher.a0) this.b;
        xw3.L(a0Var.j, null, null, new com.moloco.sdk.internal.publisher.x(a0Var, (c0) this.c, cVar, null), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void a() {
        com.moloco.sdk.internal.publisher.a0 a0Var = (com.moloco.sdk.internal.publisher.a0) this.b;
        xw3.L(a0Var.j, null, null, new ccj(a0Var, (c0) this.c, (com.moloco.sdk.internal.ortb.model.y) this.d, null, 4), 3);
    }

    public i(g6b g6bVar, com.moloco.sdk.acm.services.a aVar) {
        this.a = 3;
        g6bVar.getClass();
        this.b = g6bVar;
        this.c = aVar;
        this.d = new AtomicBoolean(false);
    }

    public i(g6b g6bVar, com.moloco.sdk.internal.publisher.nativead.b bVar, com.moloco.sdk.internal.publisher.nativead.b bVar2) {
        this.a = 10;
        g6bVar.getClass();
        this.b = g6bVar;
        this.c = bVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.e eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.e(2, this, bVar2);
        this.d = eVar;
        g6bVar.a(eVar);
        e6b b = g6bVar.b();
        if (b == e6b.a || b.compareTo(e6b.d) >= 0) {
            return;
        }
        bVar.invoke();
    }

    public i(com.facebook.b bVar, com.moloco.sdk.internal.services.i iVar) {
        this.a = 5;
        this.b = bVar;
        this.c = iVar;
        this.d = new com.moloco.sdk.internal.services.bidtoken.m("", "", com.moloco.sdk.internal.services.bidtoken.f.a);
    }

    public i(com.moloco.sdk.acm.db.j jVar, com.facebook.b bVar, com.moloco.sdk.acm.eventprocessing.f fVar, i iVar) {
        this.a = 1;
        jVar.getClass();
        fVar.getClass();
        iVar.getClass();
        this.b = jVar;
        this.c = fVar;
        this.d = iVar;
    }

    public i(com.moloco.sdk.acm.http.e eVar, com.moloco.sdk.acm.db.j jVar, com.facebook.b bVar, yx1 yx1Var) {
        this.a = 2;
        eVar.getClass();
        jVar.getClass();
        yx1Var.getClass();
        this.b = eVar;
        this.c = jVar;
        this.d = yx1Var;
    }

    public i(com.moloco.sdk.internal.publisher.a0 a0Var, c0 c0Var, com.moloco.sdk.internal.ortb.model.y yVar) {
        this.a = 4;
        this.b = a0Var;
        this.c = c0Var;
        this.d = yVar;
    }

    public i(b0 b0Var, com.moloco.sdk.internal.error.b bVar, vh9 vh9Var) {
        this.a = 7;
        b0Var.getClass();
        bVar.getClass();
        vh9Var.getClass();
        this.b = b0Var;
        this.c = bVar;
        this.d = vh9Var;
    }

    public i(List list, List list2) {
        this.a = 9;
        f1 b = g1.b();
        b.getClass();
        this.b = list;
        this.c = list2;
        this.d = b;
    }

    public i(Set set, com.moloco.sdk.acm.recorder.c cVar) {
        this.a = 8;
        set.getClass();
        this.b = set;
        this.c = cVar;
        this.d = ypa.b(new com.moloco.sdk.acm.services.d(this, 15));
    }
}
