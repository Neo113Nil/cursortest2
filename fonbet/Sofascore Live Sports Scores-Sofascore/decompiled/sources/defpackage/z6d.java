package defpackage;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class z6d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z6d(float f, v7b v7bVar) {
        this.a = 2;
        this.b = f;
        this.c = v7bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        final float f = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                r60 r60Var = (r60) obj;
                return new pp3(((pp3) function1.invoke(r60Var)).a, ((pp3) function1.invoke(r60Var)).b, f, null);
            case 1:
                axj axjVar = (axj) obj2;
                long longValue = ((Long) obj).longValue();
                boolean i2 = axjVar.i();
                boh bohVar = axjVar.g;
                if (!i2) {
                    if (bohVar.h() == Long.MIN_VALUE) {
                        bohVar.i(longValue);
                        ((eoh) ((e1d) axjVar.a.b)).setValue(Boolean.TRUE);
                    }
                    long h = longValue - bohVar.h();
                    if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        h = wzb.c(h / f);
                    }
                    axjVar.p(h);
                    axjVar.j(h, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return Unit.a;
            default:
                final v7b v7bVar = (v7b) obj2;
                te2 te2Var = (te2) obj;
                te2Var.getClass();
                final float j = te2Var.j() * 1.0f;
                final float j2 = te2Var.j() * 0.75f * f;
                return te2Var.b(new Function1() { // from class: s2k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        v7b v7bVar2 = v7bVar;
                        float f2 = j2;
                        float f3 = j;
                        yma ymaVar = (yma) obj3;
                        ymaVar.getClass();
                        wj2 wj2Var = ymaVar.a;
                        ymaVar.a();
                        float f4 = f;
                        float f5 = 1.0f / (f4 >= 0.01f ? f4 : 0.01f);
                        long O0 = wj2Var.O0();
                        sx2 sx2Var = wj2Var.b;
                        long D = sx2Var.D();
                        sx2Var.t().o();
                        try {
                            ((hpo) sx2Var.a).G(f5, f5, O0);
                            long h2 = njh.h(wj2Var.n(), f4);
                            long O02 = wj2Var.O0();
                            float intBitsToFloat = Float.intBitsToFloat((int) (h2 >> 32));
                            ha5.Y(ymaVar, v7bVar2, dnd.h(O02, dnd.b((Float.floatToRawIntBits(Float.intBitsToFloat((int) (h2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), 2.0f)), h2, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), new jii(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
                            mz1.v(sx2Var, D);
                            return Unit.a;
                        } catch (Throwable th) {
                            mz1.v(sx2Var, D);
                            throw th;
                        }
                    }
                });
        }
    }

    public /* synthetic */ z6d(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }
}
