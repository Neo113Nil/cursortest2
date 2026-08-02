package defpackage;

import com.sofascore.model.crowdsourcing.TeamSide;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vbc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ vbc(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        mgd mgdVar = mgd.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(d2c.a);
                break;
            case 1:
                function1.invoke(jfd.a);
                break;
            case 2:
                function1.invoke(lfd.a);
                break;
            case 3:
                function1.invoke(kfd.a);
                break;
            case 4:
                function1.invoke(kgd.a);
                break;
            case 5:
                function1.invoke(mgdVar);
                break;
            case 6:
                function1.invoke(qgd.a);
                break;
            case 7:
                function1.invoke(lgd.a);
                break;
            case 8:
                function1.invoke(mgdVar);
                break;
            case 9:
                function1.invoke(ogd.a);
                break;
            case 10:
                function1.invoke(Boolean.TRUE);
                break;
            case 11:
                function1.invoke(Boolean.TRUE);
                break;
            case 12:
                function1.invoke(u0e.a);
                break;
            case 13:
                function1.invoke(ktf.a);
                break;
            case 14:
                function1.invoke(itf.a);
                break;
            case 15:
                function1.invoke(dxg.a);
                break;
            case 16:
                function1.invoke(cxg.a);
                break;
            case 17:
                function1.invoke("No browser found.");
                break;
            case 18:
                function1.invoke(v2i.a);
                break;
            case 19:
                function1.invoke(t2i.a);
                break;
            case 20:
                function1.invoke(u2i.a);
                break;
            case 21:
                function1.invoke(ua.a);
                break;
            case 22:
                function1.invoke(bwi.a);
                break;
            case 23:
                function1.invoke(zvi.a);
                break;
            case 24:
                function1.invoke(yvi.a);
                break;
            case 25:
                function1.invoke(TeamSide.HOME);
                break;
            case 26:
                function1.invoke(TeamSide.AWAY);
                break;
            case 27:
                function1.invoke(f1j.a);
                break;
            case 28:
                function1.invoke(anj.a);
                break;
            default:
                function1.invoke(new s3j(true));
                break;
        }
        return Unit.a;
    }
}
