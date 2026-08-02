package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.aco;
import defpackage.d1l;
import defpackage.eco;
import defpackage.fco;
import defpackage.gco;
import defpackage.h2d;
import defpackage.hco;
import defpackage.i40;
import defpackage.j2d;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.tbo;
import defpackage.te6;
import defpackage.ubo;
import defpackage.vbo;
import defpackage.xbo;
import defpackage.y6a;
import defpackage.ybo;
import defpackage.ye4;
import defpackage.z88;
import defpackage.zbo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgdh implements zzgbx {
    public final ku3 a;
    public final zzgtm b;
    public final j2d c;
    public final j2d d;
    public final j2d e;
    public boolean f;
    public zzgbv g;
    public boolean h;
    public final ye4 i;
    public final zzdxu j;

    public zzgdh(ye4 ye4Var, d1l d1lVar, zzdxu zzdxuVar, zzgcg zzgcgVar) {
        ye4Var.getClass();
        zzdxuVar.getClass();
        this.j = zzdxuVar;
        this.a = s9a.c(new te6((ExecutorService) d1lVar.b));
        this.b = new zzgtm();
        this.c = new j2d();
        this.d = new j2d();
        this.e = new j2d();
        this.i = ye4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (r8.e(r0) != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        vbo vboVar;
        lu3 lu3Var;
        int i;
        j2d j2dVar;
        Throwable th;
        h2d h2dVar;
        Object a;
        try {
            if (sq3Var instanceof vbo) {
                vboVar = (vbo) sq3Var;
                int i2 = vboVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vboVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = vboVar.s;
                    lu3Var = lu3.a;
                    i = vboVar.u;
                    int i3 = 2;
                    rq3 rq3Var = null;
                    if (i != 0) {
                        y6a.M(obj);
                        j2dVar = this.e;
                        vboVar.r = j2dVar;
                        vboVar.u = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar = vboVar.r;
                            try {
                                y6a.M(obj);
                                h2dVar.f(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                h2dVar.f(null);
                                throw th;
                            }
                        }
                        ?? r2 = vboVar.r;
                        y6a.M(obj);
                        j2dVar = r2;
                    }
                    ye4 ye4Var = this.i;
                    i40 i40Var = new i40(i3, rq3Var, 10);
                    vboVar.r = j2dVar;
                    vboVar.u = 2;
                    a = ye4Var.a(i40Var, vboVar);
                    if (a != lu3Var) {
                        j2d j2dVar2 = j2dVar;
                        obj = a;
                        h2dVar = j2dVar2;
                        h2dVar.f(null);
                        return Unit.a;
                    }
                    return lu3Var;
                }
            }
            ye4 ye4Var2 = this.i;
            i40 i40Var2 = new i40(i3, rq3Var, 10);
            vboVar.r = j2dVar;
            vboVar.u = 2;
            a = ye4Var2.a(i40Var2, vboVar);
            if (a != lu3Var) {
            }
            return lu3Var;
        } catch (Throwable th3) {
            j2d j2dVar3 = j2dVar;
            th = th3;
            h2dVar = j2dVar3;
            h2dVar.f(null);
            throw th;
        }
        vboVar = new vbo(this, sq3Var);
        Object obj2 = vboVar.s;
        lu3Var = lu3.a;
        i = vboVar.u;
        int i32 = 2;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x0044, B:14:0x004a, B:16:0x0057, B:20:0x0070, B:21:0x0073, B:22:0x0076, B:23:0x0079), top: B:10:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x0044, B:14:0x004a, B:16:0x0057, B:20:0x0070, B:21:0x0073, B:22:0x0076, B:23:0x0079), top: B:10:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, sq3 sq3Var) {
        ubo uboVar;
        int i;
        j2d j2dVar;
        zzgbv zzgbvVar;
        try {
            if (sq3Var instanceof ubo) {
                uboVar = (ubo) sq3Var;
                int i2 = uboVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    uboVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = uboVar.t;
                    lu3 lu3Var = lu3.a;
                    i = uboVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        j2d j2dVar2 = this.c;
                        uboVar.s = j2dVar2;
                        uboVar.r = j;
                        uboVar.v = 1;
                        if (j2dVar2.e(uboVar) == lu3Var) {
                            return lu3Var;
                        }
                        j2dVar = j2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = uboVar.r;
                        j2dVar = uboVar.s;
                        y6a.M(obj);
                    }
                    zzgbvVar = this.g;
                    if (zzgbvVar != null) {
                        Intrinsics.i("adQualityDataBuilder");
                        throw null;
                    }
                    long M = j - ((zzgbw) zzgbvVar.b).M();
                    zzgbv zzgbvVar2 = this.g;
                    if (zzgbvVar2 == null) {
                        Intrinsics.i("adQualityDataBuilder");
                        throw null;
                    }
                    long L = M - ((zzgbw) zzgbvVar2.b).L();
                    zzgbvVar.n();
                    ((zzgbw) zzgbvVar.b).X(L);
                    j2dVar.f(null);
                    return Unit.a;
                }
            }
            zzgbvVar = this.g;
            if (zzgbvVar != null) {
            }
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        uboVar = new ubo(this, sq3Var);
        Object obj2 = uboVar.t;
        lu3 lu3Var2 = lu3.a;
        i = uboVar.v;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0059, code lost:
    
        if (r2.e(r0) != r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #2 {all -> 0x009b, blocks: (B:35:0x005b, B:37:0x005f, B:41:0x009d, B:42:0x00a2), top: B:34:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #2 {all -> 0x009b, blocks: (B:35:0x005b, B:37:0x005f, B:41:0x009d, B:42:0x00a2), top: B:34:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        ybo yboVar;
        int i;
        h2d h2dVar;
        zzgbv zzgbvVar;
        j2d j2dVar;
        zzgbw zzgbwVar;
        Throwable th;
        h2d h2dVar2;
        try {
            if (sq3Var instanceof ybo) {
                yboVar = (ybo) sq3Var;
                int i2 = yboVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yboVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = yboVar.t;
                    lu3 lu3Var = lu3.a;
                    i = yboVar.v;
                    rq3 rq3Var = null;
                    if (i != 0) {
                        y6a.M(obj);
                        h2dVar = this.c;
                        yboVar.r = h2dVar;
                        yboVar.v = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                h2dVar2 = (h2d) yboVar.r;
                                try {
                                    y6a.M(obj);
                                    h2dVar2.f(null);
                                    return Unit.a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            j2dVar = yboVar.s;
                            zzgbwVar = (zzgbw) yboVar.r;
                            y6a.M(obj);
                            try {
                                ye4 ye4Var = this.i;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e(zzgbwVar, rq3Var, 7);
                                yboVar.r = j2dVar;
                                yboVar.s = null;
                                yboVar.v = 3;
                                obj = ye4Var.a(eVar, yboVar);
                                if (obj != lu3Var) {
                                    h2dVar2 = j2dVar;
                                    h2dVar2.f(null);
                                    return Unit.a;
                                }
                                return lu3Var;
                            } catch (Throwable th3) {
                                th = th3;
                                h2dVar2 = j2dVar;
                                throw th;
                            }
                        }
                        h2dVar = (h2d) yboVar.r;
                        y6a.M(obj);
                    }
                    zzgbvVar = this.g;
                    if (zzgbvVar != null) {
                        Intrinsics.i("adQualityDataBuilder");
                        throw null;
                    }
                    zzgbw zzgbwVar2 = (zzgbw) zzgbvVar.o();
                    h2dVar.f(null);
                    yboVar.r = zzgbwVar2;
                    j2dVar = this.e;
                    yboVar.s = j2dVar;
                    yboVar.v = 2;
                    if (j2dVar.e(yboVar) != lu3Var) {
                        zzgbwVar = zzgbwVar2;
                        ye4 ye4Var2 = this.i;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e(zzgbwVar, rq3Var, 7);
                        yboVar.r = j2dVar;
                        yboVar.s = null;
                        yboVar.v = 3;
                        obj = ye4Var2.a(eVar2, yboVar);
                        if (obj != lu3Var) {
                        }
                    }
                    return lu3Var;
                }
            }
            zzgbvVar = this.g;
            if (zzgbvVar != null) {
            }
        } finally {
            h2dVar.f(null);
        }
        yboVar = new ybo(this, sq3Var);
        Object obj2 = yboVar.t;
        lu3 lu3Var2 = lu3.a;
        i = yboVar.v;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        if (a(r2) == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0066, code lost:
    
        if (r1 == r3) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.google.android.gms.internal.ads.zzgdh] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h2d] */
    /* JADX WARN: Type inference failed for: r4v17, types: [h2d] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v5, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq3 sq3Var) {
        fco fcoVar;
        ?? r4;
        j2d j2dVar;
        try {
            if (sq3Var instanceof fco) {
                fcoVar = (fco) sq3Var;
                int i = fcoVar.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    fcoVar.u = i - Integer.MIN_VALUE;
                    Object obj = fcoVar.s;
                    lu3 lu3Var = lu3.a;
                    r4 = fcoVar.u;
                    if (r4 != 0) {
                        y6a.M(obj);
                        j2d j2dVar2 = this.e;
                        fcoVar.r = j2dVar2;
                        fcoVar.u = 1;
                        if (j2dVar2.e(fcoVar) != lu3Var) {
                            j2dVar = j2dVar2;
                        }
                        return lu3Var;
                    }
                    if (r4 == 1) {
                        ?? r42 = fcoVar.r;
                        y6a.M(obj);
                        j2dVar = r42;
                    } else {
                        if (r4 != 2) {
                            if (r4 == 3) {
                                y6a.M(obj);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2d h2dVar = fcoVar.r;
                        y6a.M(obj);
                        r4 = h2dVar;
                        zzgca zzgcaVar = (zzgca) obj;
                        if (zzgcaVar == null || zzgcaVar.D() == 0) {
                            return Unit.a;
                        }
                        for (Map.Entry entry : zzgcaVar.E().entrySet()) {
                            zzgbv zzgbvVar = (zzgbv) ((zzgbw) entry.getValue()).w();
                            Object value = entry.getValue();
                            value.getClass();
                            zzgbw zzgbwVar = (zzgbw) value;
                            zzifx P = zzgbwVar.P();
                            Long l = P != null ? (Long) CollectionsKt.j0(P) : null;
                            boolean z = false;
                            boolean z2 = zzgbwVar.Q() > zzgbwVar.R() && !zzgbwVar.J();
                            if (l != null) {
                                if (zzgbwVar.N() - l.longValue() > 5000) {
                                    z = true;
                                }
                            }
                            if (z2 || z) {
                                zzgbvVar.n();
                                ((zzgbw) zzgbvVar.b).a0();
                            }
                            this.j.a((zzgbw) zzgbvVar.o());
                        }
                        fcoVar.r = null;
                        fcoVar.u = 3;
                    }
                    z88 data = this.i.getData();
                    fcoVar.r = j2dVar;
                    fcoVar.u = 2;
                    obj = rd0.A(data, fcoVar);
                    r4 = j2dVar;
                }
            }
            if (r4 != 0) {
            }
            z88 data2 = this.i.getData();
            fcoVar.r = j2dVar;
            fcoVar.u = 2;
            obj = rd0.A(data2, fcoVar);
            r4 = j2dVar;
        } finally {
            r4.f(null);
        }
        fcoVar = new fco(this, sq3Var);
        Object obj2 = fcoVar.s;
        lu3 lu3Var2 = lu3.a;
        r4 = fcoVar.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:11:0x004e, B:13:0x0052, B:17:0x005a), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: all -> 0x0058, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:11:0x004e, B:13:0x0052, B:17:0x005a), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, sq3 sq3Var) {
        zbo zboVar;
        int i;
        String str2;
        j2d j2dVar;
        long j;
        try {
            if (sq3Var instanceof zbo) {
                zboVar = (zbo) sq3Var;
                int i2 = zboVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zboVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = zboVar.t;
                    lu3 lu3Var = lu3.a;
                    i = zboVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        long currentTimeMillis = System.currentTimeMillis();
                        zboVar.w = str;
                        j2d j2dVar2 = this.c;
                        zboVar.r = j2dVar2;
                        zboVar.s = currentTimeMillis;
                        zboVar.v = 1;
                        if (j2dVar2.e(zboVar) == lu3Var) {
                            return lu3Var;
                        }
                        str2 = str;
                        j2dVar = j2dVar2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = zboVar.s;
                        j2dVar = zboVar.r;
                        str2 = zboVar.w;
                        y6a.M(obj);
                    }
                    if (!this.f) {
                        return Unit.a;
                    }
                    this.f = true;
                    zzgbv zzgbvVar = (zzgbv) zzgbw.V().w();
                    this.g = zzgbvVar;
                    zzgbvVar.n();
                    ((zzgbw) zzgbvVar.b).W(str2);
                    zzgbvVar.n();
                    ((zzgbw) zzgbvVar.b).c0(j);
                    j2dVar.f(null);
                    return Unit.a;
                }
            }
            if (!this.f) {
            }
        } finally {
            j2dVar.f(null);
        }
        zboVar = new zbo(this, sq3Var);
        Object obj2 = zboVar.t;
        lu3 lu3Var2 = lu3.a;
        i = zboVar.v;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        if (c(r0) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (b(r5, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0057, code lost:
    
        if (r2.e(r0) != r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #1 {all -> 0x00ac, blocks: (B:24:0x007f, B:26:0x0083, B:29:0x00a6, B:30:0x00ab), top: B:23:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[Catch: all -> 0x00ac, TRY_ENTER, TryCatch #1 {all -> 0x00ac, blocks: (B:24:0x007f, B:26:0x0083, B:29:0x00a6, B:30:0x00ab), top: B:23:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:36:0x0059, B:38:0x005d, B:41:0x0065), top: B:35:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:36:0x0059, B:38:0x005d, B:41:0x0065), top: B:35:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(sq3 sq3Var) {
        xbo xboVar;
        int i;
        j2d j2dVar;
        j2d j2dVar2;
        long j;
        zzgbv zzgbvVar;
        try {
            if (sq3Var instanceof xbo) {
                xboVar = (xbo) sq3Var;
                int i2 = xboVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xboVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = xboVar.t;
                    Object obj2 = lu3.a;
                    i = xboVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        j2dVar = this.d;
                        xboVar.r = j2dVar;
                        xboVar.v = 1;
                    } else if (i == 1) {
                        j2dVar = xboVar.r;
                        y6a.M(obj);
                    } else if (i == 2) {
                        j = xboVar.s;
                        j2dVar2 = xboVar.r;
                        y6a.M(obj);
                        try {
                            zzgbvVar = this.g;
                            if (zzgbvVar != null) {
                                Intrinsics.i("adQualityDataBuilder");
                                throw null;
                            }
                            zzgbvVar.n();
                            ((zzgbw) zzgbvVar.b).f0(j);
                            j2dVar.f(null);
                            xboVar.r = null;
                            xboVar.v = 3;
                        } finally {
                        }
                    } else {
                        if (i != 3) {
                            if (i == 4) {
                                y6a.M(obj);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        xboVar.v = 4;
                    }
                    if (!this.h) {
                        return Unit.a;
                    }
                    this.h = true;
                    Unit unit = Unit.a;
                    j2dVar.f(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    j2dVar2 = this.c;
                    xboVar.r = j2dVar2;
                    xboVar.s = currentTimeMillis;
                    xboVar.v = 2;
                    if (j2dVar2.e(xboVar) != obj2) {
                        j = currentTimeMillis;
                        zzgbvVar = this.g;
                        if (zzgbvVar != null) {
                        }
                    }
                    return obj2;
                }
            }
            if (!this.h) {
            }
        } finally {
        }
        xboVar = new xbo(this, sq3Var);
        Object obj3 = xboVar.t;
        Object obj22 = lu3.a;
        i = xboVar.v;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0048, code lost:
    
        if (r2.e(r0) != r1) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:12:0x0073, B:15:0x0079, B:17:0x0083, B:19:0x0087, B:21:0x00a9, B:23:0x00b9, B:25:0x00bd, B:26:0x00d1, B:27:0x00d4, B:29:0x00d8, B:30:0x00db, B:31:0x00dc, B:32:0x00df, B:33:0x00e0, B:35:0x00e4, B:37:0x00ee, B:39:0x00f2, B:41:0x0114, B:42:0x0128, B:43:0x012b, B:44:0x012c, B:45:0x012f, B:46:0x0130, B:48:0x0134, B:51:0x0144, B:52:0x0147, B:53:0x0148, B:54:0x014b, B:55:0x014c, B:56:0x014f), top: B:11:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c A[Catch: all -> 0x00d5, TryCatch #1 {all -> 0x00d5, blocks: (B:12:0x0073, B:15:0x0079, B:17:0x0083, B:19:0x0087, B:21:0x00a9, B:23:0x00b9, B:25:0x00bd, B:26:0x00d1, B:27:0x00d4, B:29:0x00d8, B:30:0x00db, B:31:0x00dc, B:32:0x00df, B:33:0x00e0, B:35:0x00e4, B:37:0x00ee, B:39:0x00f2, B:41:0x0114, B:42:0x0128, B:43:0x012b, B:44:0x012c, B:45:0x012f, B:46:0x0130, B:48:0x0134, B:51:0x0144, B:52:0x0147, B:53:0x0148, B:54:0x014b, B:55:0x014c, B:56:0x014f), top: B:11:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004e A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:65:0x004a, B:67:0x004e, B:71:0x0058), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(sq3 sq3Var) {
        hco hcoVar;
        int i;
        j2d j2dVar;
        j2d j2dVar2;
        long j;
        zzgbv zzgbvVar;
        try {
            if (sq3Var instanceof hco) {
                hcoVar = (hco) sq3Var;
                int i2 = hcoVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hcoVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = hcoVar.t;
                    lu3 lu3Var = lu3.a;
                    i = hcoVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        j2dVar = this.d;
                        hcoVar.r = j2dVar;
                        hcoVar.v = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = hcoVar.s;
                            j2dVar2 = hcoVar.r;
                            y6a.M(obj);
                            try {
                                zzgbvVar = this.g;
                                if (zzgbvVar != null) {
                                    Intrinsics.i("adQualityDataBuilder");
                                    throw null;
                                }
                                if (((zzgbw) zzgbvVar.b).U() > 0) {
                                    zzgbv zzgbvVar2 = this.g;
                                    if (zzgbvVar2 == null) {
                                        Intrinsics.i("adQualityDataBuilder");
                                        throw null;
                                    }
                                    List unmodifiableList = Collections.unmodifiableList(((zzgbw) zzgbvVar2.b).S());
                                    unmodifiableList.getClass();
                                    Object h0 = CollectionsKt.h0(unmodifiableList);
                                    h0.getClass();
                                    long longValue = j - ((Number) h0).longValue();
                                    zzgbv zzgbvVar3 = this.g;
                                    if (zzgbvVar3 == null) {
                                        Intrinsics.i("adQualityDataBuilder");
                                        throw null;
                                    }
                                    zzgbvVar3.n();
                                    ((zzgbw) zzgbvVar3.b).F();
                                    if (longValue < 5000) {
                                        zzgbv zzgbvVar4 = this.g;
                                        if (zzgbvVar4 == null) {
                                            Intrinsics.i("adQualityDataBuilder");
                                            throw null;
                                        }
                                        int I = ((zzgbw) zzgbvVar4.b).I() + 1;
                                        zzgbvVar4.n();
                                        ((zzgbw) zzgbvVar4.b).Y(I);
                                    }
                                }
                                zzgbv zzgbvVar5 = this.g;
                                if (zzgbvVar5 == null) {
                                    Intrinsics.i("adQualityDataBuilder");
                                    throw null;
                                }
                                if (((zzgbw) zzgbvVar5.b).Q() > 0) {
                                    zzgbv zzgbvVar6 = this.g;
                                    if (zzgbvVar6 == null) {
                                        Intrinsics.i("adQualityDataBuilder");
                                        throw null;
                                    }
                                    List unmodifiableList2 = Collections.unmodifiableList(((zzgbw) zzgbvVar6.b).P());
                                    unmodifiableList2.getClass();
                                    Object h02 = CollectionsKt.h0(unmodifiableList2);
                                    h02.getClass();
                                    long longValue2 = j - ((Number) h02).longValue();
                                    zzgbv zzgbvVar7 = this.g;
                                    if (zzgbvVar7 == null) {
                                        Intrinsics.i("adQualityDataBuilder");
                                        throw null;
                                    }
                                    long L = ((zzgbw) zzgbvVar7.b).L() + longValue2;
                                    zzgbvVar7.n();
                                    ((zzgbw) zzgbvVar7.b).b0(L);
                                }
                                zzgbv zzgbvVar8 = this.g;
                                if (zzgbvVar8 == null) {
                                    Intrinsics.i("adQualityDataBuilder");
                                    throw null;
                                }
                                zzgbvVar8.n();
                                ((zzgbw) zzgbvVar8.b).D(j);
                                j2dVar.f(null);
                                return Unit.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        j2dVar = hcoVar.r;
                        y6a.M(obj);
                    }
                    if (this.h) {
                        return Unit.a;
                    }
                    this.h = false;
                    Unit unit = Unit.a;
                    j2dVar.f(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    j2d j2dVar3 = this.c;
                    hcoVar.r = j2dVar3;
                    hcoVar.s = currentTimeMillis;
                    hcoVar.v = 2;
                    if (j2dVar3.e(hcoVar) != lu3Var) {
                        j2dVar2 = j2dVar3;
                        j = currentTimeMillis;
                        zzgbvVar = this.g;
                        if (zzgbvVar != null) {
                        }
                    }
                    return lu3Var;
                }
            }
            if (this.h) {
            }
        } finally {
            j2dVar.f(null);
        }
        hcoVar = new hco(this, sq3Var);
        Object obj2 = hcoVar.t;
        lu3 lu3Var2 = lu3.a;
        i = hcoVar.v;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ee, code lost:
    
        if (k(r14, r0) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (c(r0) != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[Catch: all -> 0x00f4, TRY_ENTER, TryCatch #0 {all -> 0x00f4, blocks: (B:26:0x008a, B:29:0x0090, B:31:0x009e, B:33:0x00b5, B:35:0x00c3, B:38:0x00f6, B:39:0x00f9, B:40:0x00fa, B:41:0x00fd, B:42:0x00fe, B:43:0x0101, B:44:0x0102, B:45:0x0105), top: B:25:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:26:0x008a, B:29:0x0090, B:31:0x009e, B:33:0x00b5, B:35:0x00c3, B:38:0x00f6, B:39:0x00f9, B:40:0x00fa, B:41:0x00fd, B:42:0x00fe, B:43:0x0101, B:44:0x0102, B:45:0x0105), top: B:25:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0067 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:51:0x0063, B:53:0x0067, B:57:0x0071), top: B:50:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(sq3 sq3Var) {
        eco ecoVar;
        int i;
        h2d h2dVar;
        h2d h2dVar2;
        long j;
        zzgbv zzgbvVar;
        zzgbw zzgbwVar;
        try {
            if (sq3Var instanceof eco) {
                ecoVar = (eco) sq3Var;
                int i2 = ecoVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ecoVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = ecoVar.t;
                    Object obj2 = lu3.a;
                    i = ecoVar.v;
                    j2d j2dVar = this.c;
                    if (i != 0) {
                        y6a.M(obj);
                        ecoVar.r = j2dVar;
                        ecoVar.v = 1;
                        if (j2dVar.e(ecoVar) != obj2) {
                            h2dVar = j2dVar;
                        }
                        return obj2;
                    }
                    if (i == 1) {
                        h2dVar = (h2d) ecoVar.r;
                        y6a.M(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    y6a.M(obj);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            zzgbwVar = (zzgbw) ecoVar.r;
                            y6a.M(obj);
                            if (this.j.a(zzgbwVar)) {
                                String G = zzgbwVar.G();
                                G.getClass();
                                ecoVar.r = null;
                                ecoVar.v = 4;
                            }
                            return Unit.a;
                        }
                        j = ecoVar.s;
                        h2dVar2 = (h2d) ecoVar.r;
                        y6a.M(obj);
                        try {
                            zzgbvVar = this.g;
                            if (zzgbvVar != null) {
                                Intrinsics.i("adQualityDataBuilder");
                                throw null;
                            }
                            long M = j - ((zzgbw) zzgbvVar.b).M();
                            zzgbv zzgbvVar2 = this.g;
                            if (zzgbvVar2 == null) {
                                Intrinsics.i("adQualityDataBuilder");
                                throw null;
                            }
                            long L = M - ((zzgbw) zzgbvVar2.b).L();
                            zzgbvVar.n();
                            ((zzgbw) zzgbvVar.b).X(L);
                            zzgbv zzgbvVar3 = this.g;
                            if (zzgbvVar3 == null) {
                                Intrinsics.i("adQualityDataBuilder");
                                throw null;
                            }
                            zzgbvVar3.n();
                            ((zzgbw) zzgbvVar3.b).e0(j);
                            zzgbv zzgbvVar4 = this.g;
                            if (zzgbvVar4 == null) {
                                Intrinsics.i("adQualityDataBuilder");
                                throw null;
                            }
                            zzgbwVar = (zzgbw) zzgbvVar4.o();
                            h2dVar2.f(null);
                            ecoVar.r = zzgbwVar;
                            ecoVar.v = 3;
                        } finally {
                        }
                    }
                    if (this.f) {
                        return Unit.a;
                    }
                    this.f = false;
                    Unit unit = Unit.a;
                    h2dVar2.f(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    ecoVar.r = j2dVar;
                    ecoVar.s = currentTimeMillis;
                    ecoVar.v = 2;
                    if (j2dVar.e(ecoVar) != obj2) {
                        h2dVar2 = j2dVar;
                        j = currentTimeMillis;
                        zzgbvVar = this.g;
                        if (zzgbvVar != null) {
                        }
                    }
                    return obj2;
                }
            }
            if (this.f) {
            }
        } finally {
        }
        ecoVar = new eco(this, sq3Var);
        Object obj3 = ecoVar.t;
        Object obj22 = lu3.a;
        i = ecoVar.v;
        j2d j2dVar2 = this.c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fc, code lost:
    
        if (k(r14, r0) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
    
        if (c(r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[Catch: all -> 0x0102, TRY_ENTER, TryCatch #0 {all -> 0x0102, blocks: (B:26:0x008a, B:29:0x0090, B:31:0x009e, B:33:0x00b5, B:35:0x00c3, B:37:0x00d1, B:40:0x0104, B:41:0x0107, B:42:0x0108, B:43:0x010b, B:44:0x010c, B:45:0x010f, B:46:0x0110, B:47:0x0113, B:48:0x0114, B:49:0x0117), top: B:25:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114 A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:26:0x008a, B:29:0x0090, B:31:0x009e, B:33:0x00b5, B:35:0x00c3, B:37:0x00d1, B:40:0x0104, B:41:0x0107, B:42:0x0108, B:43:0x010b, B:44:0x010c, B:45:0x010f, B:46:0x0110, B:47:0x0113, B:48:0x0114, B:49:0x0117), top: B:25:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0067 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:55:0x0063, B:57:0x0067, B:61:0x0071), top: B:54:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(sq3 sq3Var) {
        gco gcoVar;
        int i;
        h2d h2dVar;
        h2d h2dVar2;
        long j;
        zzgbv zzgbvVar;
        zzgbw zzgbwVar;
        try {
            if (sq3Var instanceof gco) {
                gcoVar = (gco) sq3Var;
                int i2 = gcoVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gcoVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = gcoVar.t;
                    Object obj2 = lu3.a;
                    i = gcoVar.v;
                    j2d j2dVar = this.c;
                    if (i != 0) {
                        y6a.M(obj);
                        gcoVar.r = j2dVar;
                        gcoVar.v = 1;
                        if (j2dVar.e(gcoVar) != obj2) {
                            h2dVar = j2dVar;
                        }
                        return obj2;
                    }
                    if (i == 1) {
                        h2dVar = (h2d) gcoVar.r;
                        y6a.M(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    y6a.M(obj);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            zzgbwVar = (zzgbw) gcoVar.r;
                            y6a.M(obj);
                            if (this.j.a(zzgbwVar)) {
                                String G = zzgbwVar.G();
                                G.getClass();
                                gcoVar.r = null;
                                gcoVar.v = 4;
                            }
                            return Unit.a;
                        }
                        j = gcoVar.s;
                        h2dVar2 = (h2d) gcoVar.r;
                        y6a.M(obj);
                        try {
                            zzgbvVar = this.g;
                            if (zzgbvVar != null) {
                                Intrinsics.i("adQualityDataBuilder");
                                throw null;
                            }
                            long M = j - ((zzgbw) zzgbvVar.b).M();
                            zzgbv zzgbvVar2 = this.g;
                            if (zzgbvVar2 == null) {
                                Intrinsics.i("adQualityDataBuilder");
                                throw null;
                            }
                            long L = M - ((zzgbw) zzgbvVar2.b).L();
                            zzgbvVar.n();
                            ((zzgbw) zzgbvVar.b).X(L);
                            zzgbv zzgbvVar3 = this.g;
                            if (zzgbvVar3 == null) {
                                Intrinsics.i("adQualityDataBuilder");
                                throw null;
                            }
                            zzgbvVar3.n();
                            ((zzgbw) zzgbvVar3.b).d0(j);
                            zzgbv zzgbvVar4 = this.g;
                            if (zzgbvVar4 == null) {
                                Intrinsics.i("adQualityDataBuilder");
                                throw null;
                            }
                            zzgbvVar4.n();
                            ((zzgbw) zzgbvVar4.b).Z();
                            zzgbv zzgbvVar5 = this.g;
                            if (zzgbvVar5 == null) {
                                Intrinsics.i("adQualityDataBuilder");
                                throw null;
                            }
                            zzgbwVar = (zzgbw) zzgbvVar5.o();
                            h2dVar2.f(null);
                            gcoVar.r = zzgbwVar;
                            gcoVar.v = 3;
                        } finally {
                        }
                    }
                    if (this.f) {
                        return Unit.a;
                    }
                    this.f = false;
                    Unit unit = Unit.a;
                    h2dVar2.f(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    gcoVar.r = j2dVar;
                    gcoVar.s = currentTimeMillis;
                    gcoVar.v = 2;
                    if (j2dVar.e(gcoVar) != obj2) {
                        h2dVar2 = j2dVar;
                        j = currentTimeMillis;
                        zzgbvVar = this.g;
                        if (zzgbvVar != null) {
                        }
                    }
                    return obj2;
                }
            }
            if (this.f) {
            }
        } finally {
        }
        gcoVar = new gco(this, sq3Var);
        Object obj3 = gcoVar.t;
        Object obj22 = lu3.a;
        i = gcoVar.v;
        j2d j2dVar2 = this.c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x0049, B:13:0x004d, B:17:0x005d, B:18:0x0062), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x0063, TRY_ENTER, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x0049, B:13:0x004d, B:17:0x005d, B:18:0x0062), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(sq3 sq3Var) {
        aco acoVar;
        int i;
        j2d j2dVar;
        long j;
        zzgbv zzgbvVar;
        try {
            if (sq3Var instanceof aco) {
                acoVar = (aco) sq3Var;
                int i2 = acoVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    acoVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = acoVar.t;
                    lu3 lu3Var = lu3.a;
                    i = acoVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        long currentTimeMillis = System.currentTimeMillis();
                        j2d j2dVar2 = this.c;
                        acoVar.s = j2dVar2;
                        acoVar.r = currentTimeMillis;
                        acoVar.v = 1;
                        if (j2dVar2.e(acoVar) == lu3Var) {
                            return lu3Var;
                        }
                        j2dVar = j2dVar2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = acoVar.r;
                        j2dVar = acoVar.s;
                        y6a.M(obj);
                    }
                    zzgbvVar = this.g;
                    if (zzgbvVar != null) {
                        Intrinsics.i("adQualityDataBuilder");
                        throw null;
                    }
                    zzgbvVar.n();
                    ((zzgbw) zzgbvVar.b).E(j);
                    j2dVar.f(null);
                    return Unit.a;
                }
            }
            zzgbvVar = this.g;
            if (zzgbvVar != null) {
            }
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        acoVar = new aco(this, sq3Var);
        Object obj2 = acoVar.t;
        lu3 lu3Var2 = lu3.a;
        i = acoVar.v;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, sq3 sq3Var) {
        tbo tboVar;
        Object obj;
        lu3 lu3Var;
        int i;
        String str2;
        j2d j2dVar;
        Throwable th;
        h2d h2dVar;
        try {
            if (sq3Var instanceof tbo) {
                tboVar = (tbo) sq3Var;
                int i2 = tboVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tboVar.v = i2 - Integer.MIN_VALUE;
                    obj = tboVar.t;
                    lu3Var = lu3.a;
                    i = tboVar.v;
                    rq3 rq3Var = null;
                    if (i != 0) {
                        y6a.M(obj);
                        tboVar.r = str;
                        j2d j2dVar2 = this.e;
                        tboVar.s = j2dVar2;
                        tboVar.v = 1;
                        if (j2dVar2.e(tboVar) != lu3Var) {
                            str2 = str;
                            j2dVar = j2dVar2;
                        }
                        return lu3Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2dVar = (h2d) tboVar.r;
                        try {
                            y6a.M(obj);
                            h2dVar.f(null);
                            return Unit.a;
                        } catch (Throwable th2) {
                            th = th2;
                            h2dVar.f(null);
                            throw th;
                        }
                    }
                    j2dVar = tboVar.s;
                    str2 = (String) tboVar.r;
                    y6a.M(obj);
                    ye4 ye4Var = this.i;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e(str2, rq3Var, 6);
                    tboVar.r = j2dVar;
                    tboVar.s = null;
                    tboVar.v = 2;
                    obj = ye4Var.a(eVar, tboVar);
                    if (obj != lu3Var) {
                        h2dVar = j2dVar;
                        h2dVar.f(null);
                        return Unit.a;
                    }
                    return lu3Var;
                }
            }
            ye4 ye4Var2 = this.i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e(str2, rq3Var, 6);
            tboVar.r = j2dVar;
            tboVar.s = null;
            tboVar.v = 2;
            obj = ye4Var2.a(eVar2, tboVar);
            if (obj != lu3Var) {
            }
            return lu3Var;
        } catch (Throwable th3) {
            j2d j2dVar3 = j2dVar;
            th = th3;
            h2dVar = j2dVar3;
            h2dVar.f(null);
            throw th;
        }
        tboVar = new tbo(this, sq3Var);
        obj = tboVar.t;
        lu3Var = lu3.a;
        i = tboVar.v;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
    }
}
