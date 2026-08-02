package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class idk {
    public static final f80 f = new f80(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final nmk a;
    public long b = Long.MIN_VALUE;
    public f80 c = f;
    public boolean d;
    public float e;

    public idk(c80 c80Var) {
        this.a = c80Var.a(lz.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r13 != com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        if (defpackage.bea.y(r4.getContext()).p(r9, r4) == r3) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r14v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a7 -> B:23:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fa faVar, mi miVar, sq3 sq3Var) {
        hdk hdkVar;
        int i;
        f80 f80Var;
        float f2;
        hdk hdkVar2;
        fa faVar2;
        Function0 function0;
        try {
            if (sq3Var instanceof hdk) {
                hdkVar = (hdk) sq3Var;
                int i2 = hdkVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hdkVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = hdkVar.u;
                    lu3 lu3Var = lu3.a;
                    i = hdkVar.w;
                    f80Var = f;
                    if (i != 0) {
                        y6a.M(obj);
                        if (this.d) {
                            u3a.c("animateToZero called while previous animation is running");
                        }
                        pvc pvcVar = (pvc) hdkVar.getContext().get(kpg.e);
                        float m = pvcVar != null ? pvcVar.m() : 1.0f;
                        this.d = true;
                        f2 = m;
                        hdkVar2 = hdkVar;
                        faVar2 = faVar;
                        function0 = miVar;
                        if (Math.abs(this.e) >= 0.01f) {
                            zz zzVar = new zz(this, f2, faVar2);
                            hdkVar2.r = faVar2;
                            hdkVar2.s = function0;
                            hdkVar2.t = f2;
                            hdkVar2.w = 1;
                            if (bea.y(hdkVar2.getContext()).p(zzVar, hdkVar2) == lu3Var) {
                                return lu3Var;
                            }
                            function0.invoke();
                        } else {
                            if (Math.abs(this.e) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                this.b = Long.MIN_VALUE;
                                this.c = f80Var;
                                this.d = false;
                                return Unit.a;
                            }
                            mwj mwjVar = new mwj(17, this, faVar2);
                            hdkVar2.r = function0;
                            hdkVar2.s = null;
                            hdkVar2.w = 2;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            function0 = (Function0) hdkVar.r;
                            y6a.M(obj);
                            function0.invoke();
                            this.b = Long.MIN_VALUE;
                            this.c = f80Var;
                            this.d = false;
                            return Unit.a;
                        }
                        float f3 = hdkVar.t;
                        Function0 function02 = hdkVar.s;
                        ?? r14 = (Function1) hdkVar.r;
                        y6a.M(obj);
                        hdkVar2 = hdkVar;
                        function0 = function02;
                        f2 = f3;
                        faVar2 = r14;
                        function0.invoke();
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.b = Long.MIN_VALUE;
            this.c = f80Var;
            this.d = false;
            throw th;
        }
        hdkVar = new hdk(this, sq3Var);
        Object obj2 = hdkVar.u;
        lu3 lu3Var2 = lu3.a;
        i = hdkVar.w;
        f80Var = f;
    }
}
