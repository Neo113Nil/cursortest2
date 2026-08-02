package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class hnh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ csf c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hnh(float f, csf csfVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = f;
        this.c = csfVar;
        this.d = obj;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Object obj2 = this.e;
        Object obj3 = this.d;
        csf csfVar = this.c;
        float f2 = this.b;
        switch (i) {
            case 0:
                oug ougVar = (oug) obj3;
                Function1 function1 = (Function1) obj2;
                b80 b80Var = (b80) obj;
                float abs = Math.abs(((Number) ((eoh) b80Var.e).getValue()).floatValue());
                float abs2 = Math.abs(f2);
                e1d e1dVar = b80Var.e;
                if (abs >= abs2) {
                    float t = kda.t(((Number) ((eoh) e1dVar).getValue()).floatValue(), f2);
                    kda.n(b80Var, ougVar, function1, t - csfVar.a);
                    b80Var.a();
                    csfVar.a = t;
                } else {
                    eoh eohVar = (eoh) e1dVar;
                    kda.n(b80Var, ougVar, function1, ((Number) eohVar.getValue()).floatValue() - csfVar.a);
                    csfVar.a = ((Number) eohVar.getValue()).floatValue();
                }
                break;
            case 1:
                oug ougVar2 = (oug) obj3;
                Function1 function12 = (Function1) obj2;
                b80 b80Var2 = (b80) obj;
                float t2 = kda.t(((Number) ((eoh) b80Var2.e).getValue()).floatValue(), f2);
                float f3 = t2 - csfVar.a;
                try {
                    f = ougVar2.a(f3);
                } catch (CancellationException unused) {
                    b80Var2.a();
                }
                function12.invoke(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || t2 != ((Number) ((eoh) b80Var2.e).getValue()).floatValue()) {
                    b80Var2.a();
                }
                csfVar.a += f;
                break;
            default:
                ax axVar = (ax) obj3;
                csf csfVar2 = (csf) obj2;
                b80 b80Var3 = (b80) obj;
                eoh eohVar2 = (eoh) b80Var3.e;
                if ((((Number) eohVar2.getValue()).floatValue() >= f2 || csfVar.a <= f2) && (((Number) eohVar2.getValue()).floatValue() <= f2 || csfVar.a >= f2)) {
                    axVar.a(((Number) eohVar2.getValue()).floatValue(), ((Number) b80Var3.b()).floatValue());
                    csfVar2.a = ((Number) b80Var3.b()).floatValue();
                    csfVar.a = ((Number) eohVar2.getValue()).floatValue();
                } else {
                    float floatValue = ((Number) eohVar2.getValue()).floatValue();
                    if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f2 = 0.0f;
                    } else if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? floatValue >= f2 : floatValue <= f2) {
                        f2 = floatValue;
                    }
                    axVar.a(f2, ((Number) b80Var3.b()).floatValue());
                    if (!Float.isNaN(((Number) b80Var3.b()).floatValue())) {
                        f = ((Number) b80Var3.b()).floatValue();
                    }
                    csfVar2.a = f;
                    csfVar.a = f2;
                    b80Var3.a();
                }
                break;
        }
        return Unit.a;
    }
}
