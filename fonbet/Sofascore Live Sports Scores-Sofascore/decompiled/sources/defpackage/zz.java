package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zz(idk idkVar, float f, Function1 function1) {
        this.a = 2;
        this.c = idkVar;
        this.b = f;
        this.d = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        if (r0 > r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r0 < r3) goto L18;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        float floatValue;
        int i = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Object obj2 = this.d;
        float f2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                a10 a10Var = (a10) obj3;
                ay1 ay1Var = (ay1) obj2;
                yma ymaVar = (yma) obj;
                ymaVar.a();
                sx2 sx2Var = ymaVar.a.b;
                long D = sx2Var.D();
                sx2Var.t().o();
                try {
                    hpo hpoVar = (hpo) sx2Var.a;
                    hpoVar.I(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    hpoVar.F(0L, 45.0f);
                    ha5.x(ymaVar, a10Var, 0L, ay1Var, 46);
                    mz1.v(sx2Var, D);
                    return Unit.a;
                } catch (Throwable th) {
                    mz1.v(sx2Var, D);
                    throw th;
                }
            case 1:
                csf csfVar = (csf) obj3;
                fsa fsaVar = (fsa) obj2;
                b80 b80Var = (b80) obj;
                if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        floatValue = ((Number) ((eoh) b80Var.e).getValue()).floatValue();
                        break;
                    }
                } else {
                    floatValue = ((Number) ((eoh) b80Var.e).getValue()).floatValue();
                    break;
                }
                float f3 = f - csfVar.a;
                if (f3 != fsaVar.a(f3) || f != ((Number) ((eoh) b80Var.e).getValue()).floatValue()) {
                    b80Var.a();
                }
                csfVar.a += f3;
                return Unit.a;
            default:
                idk idkVar = (idk) obj3;
                Function1 function1 = (Function1) obj2;
                long longValue = ((Long) obj).longValue();
                long j = idkVar.b;
                if (j == Long.MIN_VALUE) {
                    idkVar.b = longValue;
                    j = longValue;
                }
                float f4 = idkVar.e;
                f80 f80Var = new f80(f4);
                f80 f80Var2 = idk.f;
                long d = f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? idkVar.a.d(new f80(f4), f80Var2, idkVar.c) : wzb.c((longValue - j) / f2);
                float f5 = ((f80) idkVar.a.z(d, f80Var, f80Var2, idkVar.c)).a;
                idkVar.c = (f80) idkVar.a.u(d, f80Var, f80Var2, idkVar.c);
                idkVar.b = longValue;
                float f6 = idkVar.e - f5;
                idkVar.e = f5;
                function1.invoke(Float.valueOf(f6));
                return Unit.a;
        }
    }

    public /* synthetic */ zz(float f, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }
}
