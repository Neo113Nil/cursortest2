package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class mo1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lcj b;

    public /* synthetic */ mo1(lcj lcjVar, int i) {
        this.a = i;
        this.b = lcjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        dma q;
        oqf oqfVar;
        int i = this.a;
        lcj lcjVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                e1d e1dVar = lcjVar.s;
                jwj jwjVar = lcjVar.a;
                boolean d = pej.d(jwjVar.d().d);
                if (((d && ((gfj) ((eoh) e1dVar).getValue()) == gfj.b) || (!d && ((gfj) ((eoh) e1dVar).getValue()) == gfj.c)) && lcjVar.l() == null && ((Boolean) ((eoh) lcjVar.k).getValue()).booleanValue() && (q = lcjVar.q()) != null) {
                    oqf H = pea.H(q);
                    oqf r = jca.r(q.P(H.f()), H.e());
                    dma q2 = lcjVar.q();
                    if (q2 == null) {
                        u3a.d("textLayoutCoordinates should not be null.");
                        pvd.x();
                        break;
                    } else {
                        if (pej.d(jwjVar.d().d)) {
                            oqf k = lcjVar.k();
                            oqfVar = jca.r(q2.P(k.f()), k.e());
                        } else {
                            long P = q2.P(lcjVar.o(true));
                            long P2 = q2.P(lcjVar.o(false));
                            if (lcjVar.b.c() == null) {
                                oqfVar = oqf.e;
                            } else {
                                float intBitsToFloat = Float.intBitsToFloat((int) (q2.P((Float.floatToRawIntBits(r0.c((int) (r7 >> 32)).b) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32)) & 4294967295L));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (q2.P((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(r0.c((int) (r7 & 4294967295L)).b) & 4294967295L)) & 4294967295L));
                                int i2 = (int) (P >> 32);
                                int i3 = (int) (P2 >> 32);
                                oqfVar = new oqf(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(intBitsToFloat, intBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.max(Float.intBitsToFloat((int) (P & 4294967295L)), Float.intBitsToFloat((int) (P2 & 4294967295L))));
                            }
                        }
                        if (oqfVar.i(r)) {
                            break;
                        }
                    }
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                lcjVar.b();
                break;
            case 7:
                break;
            case 8:
                jwj jwjVar2 = lcjVar.a;
                scj scjVar = jwjVar2.a;
                q4a q4aVar = jwjVar2.b;
                haj hajVar = haj.a;
                scjVar.b.a().q();
                l9j l9jVar = scjVar.b;
                cga.P(l9jVar, 0, l9jVar.c.length());
                scjVar.b(q4aVar, true, hajVar);
                scjVar.e(true);
                break;
            default:
                Function0 function0 = lcjVar.l;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
