package com.moloco.sdk.internal.services.usertracker;

import com.moloco.sdk.internal.services.d;
import com.moloco.sdk.internal.services.e;
import defpackage.a70;
import defpackage.h2d;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.util.UUID;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c {
    public final com.facebook.b a;
    public final a b;
    public final j2d c;

    public c(com.facebook.b bVar, a aVar) {
        aVar.getClass();
        this.a = bVar;
        this.b = aVar;
        this.c = new j2d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (r0 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006b, code lost:
    
        if (r11.e(r0) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:26:0x004a, B:27:0x0090, B:29:0x0094, B:34:0x00b2), top: B:25:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r10v12, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        b bVar;
        lu3 lu3Var;
        int i;
        j2d j2dVar;
        h2d h2dVar;
        Object R;
        c cVar;
        h2d h2dVar2;
        String str;
        String str2;
        try {
            if (sq3Var instanceof b) {
                bVar = (b) sq3Var;
                int i2 = bVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.t;
                    lu3Var = lu3.a;
                    i = bVar.v;
                    String str3 = "com.moloco.sdk.mref";
                    rq3 rq3Var = null;
                    if (i != 0) {
                        y6a.M(obj);
                        bVar.r = this;
                        j2dVar = this.c;
                        bVar.s = j2dVar;
                        bVar.v = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                str2 = (String) bVar.s;
                                h2dVar = (h2d) bVar.r;
                                try {
                                    y6a.M(obj);
                                    h2dVar.f(null);
                                    return str2;
                                } catch (Throwable th) {
                                    th = th;
                                    th = th;
                                    h2dVar2 = h2dVar;
                                    h2dVar2.f(null);
                                    throw th;
                                }
                            }
                            h2dVar2 = (h2d) bVar.s;
                            cVar = (c) bVar.r;
                            try {
                                y6a.M(obj);
                                str = (String) obj;
                                if (str == null) {
                                    com.facebook.b bVar2 = cVar.a;
                                    str = UUID.randomUUID().toString();
                                    str.getClass();
                                    a aVar = cVar.b;
                                    bVar.r = h2dVar2;
                                    bVar.s = str;
                                    bVar.v = 3;
                                    Object b = aVar.a.b("com.moloco.sdk.mref", str, bVar);
                                    if (b != lu3Var) {
                                        b = Unit.a;
                                    }
                                }
                                h2dVar = h2dVar2;
                                str2 = str;
                                h2dVar.f(null);
                                return str2;
                            } catch (Throwable th2) {
                                th = th2;
                                h2dVar2.f(null);
                                throw th;
                            }
                        }
                        ?? r10 = (h2d) bVar.s;
                        c cVar2 = (c) bVar.r;
                        y6a.M(obj);
                        j2dVar = r10;
                        this = cVar2;
                    }
                    a aVar2 = this.b;
                    bVar.r = this;
                    bVar.s = j2dVar;
                    bVar.v = 2;
                    e eVar = aVar2.a;
                    eVar.getClass();
                    hs4 hs4Var = z45.a;
                    R = xw3.R(hq4.c, new d(eVar, str3, rq3Var, 0), bVar);
                    if (R != lu3Var) {
                        cVar = this;
                        h2dVar2 = j2dVar;
                        obj = R;
                        str = (String) obj;
                        if (str == null) {
                        }
                        h2dVar = h2dVar2;
                        str2 = str;
                        h2dVar.f(null);
                        return str2;
                    }
                    return lu3Var;
                }
            }
            a aVar22 = this.b;
            bVar.r = this;
            bVar.s = j2dVar;
            bVar.v = 2;
            e eVar2 = aVar22.a;
            eVar2.getClass();
            hs4 hs4Var2 = z45.a;
            R = xw3.R(hq4.c, new d(eVar2, str3, rq3Var, 0), bVar);
            if (R != lu3Var) {
            }
            return lu3Var;
        } catch (Throwable th3) {
            th = th3;
            h2dVar = j2dVar;
            th = th;
            h2dVar2 = h2dVar;
            h2dVar2.f(null);
            throw th;
        }
        bVar = new b(this, sq3Var);
        Object obj2 = bVar.t;
        lu3Var = lu3.a;
        i = bVar.v;
        String str32 = "com.moloco.sdk.mref";
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
    }
}
