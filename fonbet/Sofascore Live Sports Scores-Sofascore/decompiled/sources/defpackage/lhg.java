package defpackage;

import android.widget.RelativeLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class lhg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yhg b;

    public /* synthetic */ lhg(yhg yhgVar, int i) {
        this.a = i;
        this.b = yhgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        yhg yhgVar = this.b;
        switch (i) {
            case 0:
                xag xagVar = yhgVar.t;
                if (xagVar != null) {
                    ((zag) xagVar).i(kig.SKIP, yhgVar.C);
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 1:
                xag xagVar2 = yhgVar.t;
                if (xagVar2 != null) {
                    hs4 hs4Var = z45.a;
                    xw3.L(s9a.c(rob.a), null, null, new phg(xagVar2, yhgVar, (rq3) null), 3);
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 2:
                xag xagVar3 = yhgVar.t;
                if (xagVar3 != null) {
                    ((zag) xagVar3).i(yhgVar.E ? kig.MUTE : kig.UNMUTE, yhgVar.C);
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 3:
                xag xagVar4 = yhgVar.t;
                if (xagVar4 != null) {
                    ((zag) xagVar4).h();
                    mjg mjgVar = yhgVar.c;
                    RelativeLayout relativeLayout = yhgVar.o;
                    if (relativeLayout == null) {
                        Intrinsics.i("measuredView");
                        throw null;
                    }
                    rjg b = mjgVar.b(relativeLayout);
                    if (b != null) {
                        hkg.T().post(new ojg(b, 8));
                    }
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 4:
                return Boolean.valueOf(yhgVar.q == mhg.b);
            default:
                return Boolean.valueOf(yhgVar.q == mhg.b);
        }
    }
}
