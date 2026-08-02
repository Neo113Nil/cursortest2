package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.e1;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.publisher.nativead.n;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import defpackage.a70;
import defpackage.asf;
import defpackage.h2d;
import defpackage.hoi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.i3l;
import defpackage.j2d;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.mj5;
import defpackage.ndd;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public h2d s;
    public int t;
    public Object u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.x = obj;
        this.y = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                return new i((String) obj3, (j) obj2, rq3Var, 0);
            default:
                return new i((com.moloco.sdk.internal.ilrd.e) obj3, (com.moloco.sdk.internal.ilrd.l) obj2, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((i) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:76|(1:(1:(8:80|81|82|83|84|(2:86|(2:88|89)(2:92|93))(1:94)|90|91)(2:108|109))(1:110))(2:146|(2:148|149)(3:150|(1:154)|155))|111|112|(3:114|115|117)(2:121|(8:123|(2:125|(2:130|131)(1:129))|132|(1:134)|135|(3:139|84|(0)(0))|137|138)(2:140|141))|90|91) */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0254, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02a3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0216, code lost:
    
        if (r14.e(r24) == r13) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x018d, code lost:
    
        if (r5.d(r24) == r8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015f A[Catch: all -> 0x0171, TryCatch #1 {all -> 0x0171, blocks: (B:17:0x0039, B:18:0x0152, B:22:0x015f, B:24:0x0175, B:25:0x0177), top: B:16:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0175 A[Catch: all -> 0x0171, TryCatch #1 {all -> 0x0171, blocks: (B:17:0x0039, B:18:0x0152, B:22:0x015f, B:24:0x0175, B:25:0x0177), top: B:16:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:39:0x004c, B:40:0x00e8, B:42:0x0119, B:43:0x011f, B:48:0x014a), top: B:38:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:39:0x004c, B:40:0x00e8, B:42:0x0119, B:43:0x011f, B:48:0x014a), top: B:38:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031e A[Catch: all -> 0x01cb, Exception -> 0x01ce, TryCatch #8 {Exception -> 0x01ce, all -> 0x01cb, blocks: (B:82:0x01c4, B:84:0x0318, B:86:0x031e, B:88:0x0330, B:92:0x0351), top: B:81:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035b  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h2d h2dVar;
        Object putIfAbsent;
        Object R;
        File file;
        File file2;
        h2d h2dVar2;
        Object gVar;
        asf asfVar;
        com.moloco.sdk.internal.ilrd.l lVar;
        h2d h2dVar3;
        com.moloco.sdk.internal.ilrd.e eVar;
        h2d h2dVar4;
        Object R2;
        asf asfVar2;
        h2d h2dVar5;
        Object R3;
        com.moloco.sdk.internal.ilrd.e eVar2;
        asf asfVar3;
        int i = this.r;
        Object obj2 = this.y;
        Object obj3 = this.x;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                j jVar = (j) obj2;
                String str = (String) obj3;
                lu3 lu3Var = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (str.length() != 0) {
                        ConcurrentHashMap concurrentHashMap = jVar.e;
                        Object obj4 = concurrentHashMap.get(str);
                        if (obj4 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj4 = new j2d()))) != null) {
                            obj4 = putIfAbsent;
                        }
                        h2dVar = (h2d) obj4;
                        this.s = h2dVar;
                        this.u = jVar;
                        this.v = str;
                        this.t = 1;
                        break;
                    } else {
                        return f.k;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        file = (File) this.w;
                        file2 = (File) this.v;
                        String str2 = (String) this.u;
                        h2dVar2 = this.s;
                        try {
                            y6a.M(obj);
                            R = obj;
                            gVar = (h) R;
                            if (gVar instanceof g) {
                                h2dVar2.f(null);
                            } else {
                                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                                MolocoLogger.debug$default(molocoLogger, "MediaCacheRepository", "Renaming tmp file to dst file", false, 4, null);
                                if (file.renameTo(file2)) {
                                    gVar = new g(file2);
                                    h2dVar2.f(null);
                                } else {
                                    MolocoLogger.info$default(molocoLogger, "MediaCacheRepository", "Renaming to dst file failed, dstFile exists: " + file2.exists(), null, false, 12, null);
                                    gVar = f.p;
                                    h2dVar2.f(null);
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            h2dVar = h2dVar2;
                            str = str2;
                            Exception exc = e;
                            try {
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheRepository", "Failed to fetch media from url: " + str, exc, false, 8, null);
                                gVar = l.a(exc);
                                h2dVar.f(null);
                                return gVar;
                            } catch (Throwable th) {
                                th = th;
                                h2dVar2 = h2dVar;
                                h2dVar = h2dVar2;
                                h2dVar.f(null);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            h2dVar = h2dVar2;
                            h2dVar.f(null);
                            throw th;
                        }
                        return gVar;
                    }
                    str = (String) this.v;
                    jVar = (j) this.u;
                    h2d h2dVar6 = this.s;
                    y6a.M(obj);
                    h2dVar = h2dVar6;
                }
                l0 c = jVar.c();
                if (!(c instanceof j0)) {
                    if (!(c instanceof k0)) {
                        throw new ndd();
                    }
                    File file3 = (File) ((k0) c).a;
                    String d = i0.d(str);
                    File file4 = new File(file3, d);
                    if (file4.exists()) {
                        if (file4.exists() && n.j(file4).exists()) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "MediaCacheRepository", "Media file was partially downloaded by ChunkedMediaDownloader. Deleting the file and redownloading", null, false, 12, null);
                            file4.delete();
                        } else {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "MediaCacheRepository", "Found asset in cache: ".concat(str), null, false, 12, null);
                            gVar = new g(file4);
                            h2dVar.f(null);
                        }
                    }
                    File file5 = new File(file3, d.concat("TEMP"));
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "MediaCacheRepository", "Asset not found in cache. Downloading to tmp file[already exists == " + file5.exists() + ']', false, 4, null);
                    if (file5.exists()) {
                        file5.delete();
                    }
                    com.facebook.login.i iVar = jVar.a;
                    this.s = h2dVar;
                    this.u = str;
                    this.v = file4;
                    this.w = file5;
                    this.t = 2;
                    hs4 hs4Var = z45.a;
                    R = xw3.R(hq4.c, new mj5(iVar, str, file5, (rq3) null), this);
                    if (R != lu3Var) {
                        file = file5;
                        file2 = file4;
                        h2dVar2 = h2dVar;
                        gVar = (h) R;
                        if (gVar instanceof g) {
                        }
                    }
                    return lu3Var;
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "MediaCacheRepository", "Failed to retrieve storageDir with error code: " + ((y) ((j0) c).a).b, null, false, 12, null);
                switch (((y) ((j0) c).a).b) {
                    case 100:
                        gVar = f.c;
                        break;
                    case 101:
                        gVar = f.b;
                        break;
                    case 102:
                        gVar = f.a;
                        break;
                    default:
                        gVar = f.d;
                        break;
                }
                h2dVar.f(null);
                return gVar;
            default:
                com.moloco.sdk.internal.ilrd.e eVar3 = (com.moloco.sdk.internal.ilrd.e) obj3;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.t;
                try {
                    if (i4 == 0) {
                        y6a.M(obj);
                        asfVar = new asf();
                        j2d j2dVar = eVar3.p;
                        lVar = (com.moloco.sdk.internal.ilrd.l) obj2;
                        this.u = asfVar;
                        this.s = j2dVar;
                        this.v = eVar3;
                        this.w = lVar;
                        this.t = 1;
                        if (j2dVar.e(this) != lu3Var2) {
                            h2dVar3 = j2dVar;
                            eVar = eVar3;
                        }
                        return lu3Var2;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    y6a.M(obj);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            eVar2 = (com.moloco.sdk.internal.ilrd.e) this.v;
                            h2dVar5 = this.s;
                            asfVar3 = (asf) this.u;
                            try {
                                y6a.M(obj);
                                r10 = eVar2.r.size() >= eVar2.e ? 1 : 0;
                                if (r10 != 0) {
                                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "batch size reached", null, false, 12, null);
                                }
                                if (r10 != 0) {
                                    asfVar3.a = true;
                                }
                                Unit unit = Unit.a;
                                h2dVar5.f(null);
                                if (asfVar3.a) {
                                    this.u = null;
                                    this.s = null;
                                    this.v = null;
                                    this.t = 4;
                                    break;
                                }
                                return Unit.a;
                            } catch (Throwable th3) {
                                th = th3;
                                h2dVar5.f(null);
                                throw th;
                            }
                        }
                        lVar = (com.moloco.sdk.internal.ilrd.l) this.w;
                        eVar = (com.moloco.sdk.internal.ilrd.e) this.v;
                        h2dVar4 = this.s;
                        asfVar2 = (asf) this.u;
                        try {
                            y6a.M(obj);
                            e1 a = eVar.a(lVar);
                            ArrayList arrayList = eVar.r;
                            a.getClass();
                            arrayList.add(a);
                            MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                            StringBuilder sb = new StringBuilder("Event id ");
                            sb.append(a.getEventId());
                            sb.append(" added. Count: ");
                            sb.append(arrayList.size());
                            sb.append(", current events in session: ");
                            com.moloco.sdk.internal.ilrd.j jVar2 = eVar.q;
                            sb.append(jVar2 == null ? jVar2.b() : null);
                            MolocoLogger.info$default(molocoLogger2, "IlrdEventsRepository", sb.toString(), null, false, 12, null);
                            this.u = asfVar2;
                            this.s = h2dVar4;
                            this.v = eVar;
                            this.w = null;
                            this.t = 3;
                            R3 = xw3.R(z45.a, new com.moloco.sdk.internal.ilrd.c(eVar, rq3Var, i2), this);
                            if (R3 == lu3Var2) {
                                R3 = Unit.a;
                            }
                            if (R3 != lu3Var2) {
                                eVar2 = eVar;
                                h2dVar5 = h2dVar4;
                                asfVar3 = asfVar2;
                                if (eVar2.r.size() >= eVar2.e) {
                                }
                                if (r10 != 0) {
                                }
                                if (r10 != 0) {
                                }
                                Unit unit2 = Unit.a;
                                h2dVar5.f(null);
                                if (asfVar3.a) {
                                }
                                return Unit.a;
                            }
                            return lu3Var2;
                        } catch (Throwable th4) {
                            th = th4;
                            h2dVar5 = h2dVar4;
                            h2dVar5.f(null);
                            throw th;
                        }
                    }
                    lVar = (com.moloco.sdk.internal.ilrd.l) this.w;
                    eVar = (com.moloco.sdk.internal.ilrd.e) this.v;
                    h2dVar3 = this.s;
                    asfVar = (asf) this.u;
                    y6a.M(obj);
                    eVar.c();
                    eVar.m.a(eVar.d, new com.moloco.sdk.internal.ilrd.b(eVar, rq3Var, r10));
                    com.moloco.sdk.internal.ilrd.j jVar3 = eVar.q;
                    if (jVar3 != null) {
                        lVar.getClass();
                        if (!(lVar instanceof com.moloco.sdk.internal.ilrd.l)) {
                            throw new ndd();
                        }
                        String h = lVar.a.h();
                        h.getClass();
                        String upperCase = h.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        jVar3.a(upperCase);
                    }
                    this.u = asfVar;
                    this.s = h2dVar3;
                    this.v = eVar;
                    this.w = lVar;
                    this.t = 2;
                    com.moloco.sdk.internal.ilrd.j jVar4 = eVar.q;
                    if (jVar4 == null) {
                        R2 = Unit.a;
                    } else {
                        R2 = xw3.R(z45.a, new i3l(jVar4, eVar, rq3Var, 18), this);
                        if (R2 != lu3Var2) {
                            R2 = Unit.a;
                        }
                    }
                    if (R2 != lu3Var2) {
                        h2dVar4 = h2dVar3;
                        asfVar2 = asfVar;
                        e1 a2 = eVar.a(lVar);
                        ArrayList arrayList2 = eVar.r;
                        a2.getClass();
                        arrayList2.add(a2);
                        MolocoLogger molocoLogger22 = MolocoLogger.INSTANCE;
                        StringBuilder sb2 = new StringBuilder("Event id ");
                        sb2.append(a2.getEventId());
                        sb2.append(" added. Count: ");
                        sb2.append(arrayList2.size());
                        sb2.append(", current events in session: ");
                        com.moloco.sdk.internal.ilrd.j jVar22 = eVar.q;
                        sb2.append(jVar22 == null ? jVar22.b() : null);
                        MolocoLogger.info$default(molocoLogger22, "IlrdEventsRepository", sb2.toString(), null, false, 12, null);
                        this.u = asfVar2;
                        this.s = h2dVar4;
                        this.v = eVar;
                        this.w = null;
                        this.t = 3;
                        R3 = xw3.R(z45.a, new com.moloco.sdk.internal.ilrd.c(eVar, rq3Var, i2), this);
                        if (R3 == lu3Var2) {
                        }
                        if (R3 != lu3Var2) {
                        }
                    }
                    return lu3Var2;
                } catch (Throwable th5) {
                    th = th5;
                    h2dVar4 = h2dVar3;
                    h2dVar5 = h2dVar4;
                    h2dVar5.f(null);
                    throw th;
                }
        }
    }
}
