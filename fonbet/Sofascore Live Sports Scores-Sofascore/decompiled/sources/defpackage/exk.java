package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class exk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jxk b;

    public /* synthetic */ exk(jxk jxkVar, int i) {
        this.a = i;
        this.b = jxkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        jxk jxkVar = this.b;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    av8Var.d0(1202768097);
                    Iterator<E> it = jxkVar.d.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        utc utcVar = utc.a;
                        if (hasNext) {
                            cga.j((dze) it.next(), bkh.c(bkh.p(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), r12.f * 2), 1.0f), av8Var, 0);
                        } else {
                            av8Var.s(false);
                            nq8.h(av8Var, bkh.p(utcVar, 6.0f));
                        }
                    }
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    hxk.f(jxkVar, l98.c0(utc.a, 8.0f, 4.0f), av8Var2, 48);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
