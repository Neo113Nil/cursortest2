package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import kotlin.Unit;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bwm {
    public static final bwm a = new bwm();
    public static final qa3 b = qx9.c();
    public static final qa3 c = qx9.c();

    public static /* synthetic */ Object initializeDependencies$default(bwm bwmVar, String str, rq3 rq3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return bwmVar.b(str, rq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        vtm vtmVar;
        int i;
        try {
            if (sq3Var instanceof vtm) {
                vtmVar = (vtm) sq3Var;
                int i2 = vtmVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vtmVar.t = i2 - Integer.MIN_VALUE;
                    Object obj = vtmVar.r;
                    lu3 lu3Var = lu3.a;
                    i = vtmVar.t;
                    if (i != 0) {
                        y6a.M(obj);
                        hvm hvmVar = new hvm(null);
                        vtmVar.t = 1;
                        if (wba.U(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, hvmVar, vtmVar) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            return Unit.a;
        } catch (qij unused) {
            throw fxl.a;
        }
        vtmVar = new vtm(this, sq3Var);
        Object obj2 = vtmVar.r;
        lu3 lu3Var2 = lu3.a;
        i = vtmVar.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, rq3 rq3Var) {
        tom tomVar;
        lu3 lu3Var;
        int i;
        Object w;
        a9m a9mVar;
        if (rq3Var instanceof tom) {
            tomVar = (tom) rq3Var;
            int i2 = tomVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tomVar.v = i2 - Integer.MIN_VALUE;
                Object obj = tomVar.t;
                lu3Var = lu3.a;
                i = tomVar.v;
                bu3 bu3Var = bu3.a;
                if (i != 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    av4 t = xw3.t(s9a.c(hq4.c.plus(new gu3(bwm.class.getSimpleName())).plus(new slm(bu3Var))), null, new zpm(null), 3);
                    tomVar.r = this;
                    tomVar.s = str;
                    tomVar.v = 1;
                    obj = t.w(tomVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a9mVar = (a9m) tomVar.r;
                        y6a.M(obj);
                        return b.j((a9m) obj, a9mVar);
                    }
                    str = tomVar.s;
                    this = (bwm) tomVar.r;
                    y6a.M(obj);
                }
                a9m a9mVar2 = (a9m) obj;
                hs4 hs4Var2 = z45.a;
                av4 t2 = xw3.t(s9a.c(hq4.c.plus(new gu3(this.getClass().getSimpleName())).plus(new gnm(bu3Var))), null, new ksm(str, null), 3);
                tomVar.r = a9mVar2;
                tomVar.s = null;
                tomVar.v = 2;
                w = t2.w(tomVar);
                if (w != lu3Var) {
                    obj = w;
                    a9mVar = a9mVar2;
                    return b.j((a9m) obj, a9mVar);
                }
                return lu3Var;
            }
        }
        tomVar = new tom(this, rq3Var);
        Object obj2 = tomVar.t;
        lu3Var = lu3.a;
        i = tomVar.v;
        bu3 bu3Var2 = bu3.a;
        if (i != 0) {
        }
        a9m a9mVar22 = (a9m) obj2;
        hs4 hs4Var22 = z45.a;
        av4 t22 = xw3.t(s9a.c(hq4.c.plus(new gu3(this.getClass().getSimpleName())).plus(new gnm(bu3Var2))), null, new ksm(str, null), 3);
        tomVar.r = a9mVar22;
        tomVar.s = null;
        tomVar.v = 2;
        w = t22.w(tomVar);
        if (w != lu3Var) {
        }
        return lu3Var;
    }
}
