package defpackage;

import com.sofascore.model.crowdsourcing.TeamSide;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ri implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ri(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(ii.a);
                break;
            case 1:
                function1.invoke(yh.a);
                break;
            case 2:
                function1.invoke(sq2.a);
                break;
            case 3:
                function1.invoke(Boolean.TRUE);
                break;
            case 4:
                function1.invoke(Boolean.FALSE);
                break;
            case 5:
                function1.invoke(a64.b);
                break;
            case 6:
                function1.invoke(Boolean.TRUE);
                break;
            case 7:
                function1.invoke(Boolean.FALSE);
                break;
            case 8:
                function1.invoke(TeamSide.HOME);
                break;
            case 9:
                function1.invoke(TeamSide.HOME);
                break;
            case 10:
                function1.invoke(TeamSide.AWAY);
                break;
            case 11:
                function1.invoke(TeamSide.AWAY);
                break;
            case 12:
                function1.invoke(Boolean.TRUE);
                break;
            case 13:
                function1.invoke(Boolean.FALSE);
                break;
            case 14:
                function1.invoke(new f55(1));
                break;
            case 15:
                function1.invoke(new f55(0));
                break;
            case 16:
                function1.invoke(new ez4("api.sofascore.com/"));
                break;
            case 17:
                function1.invoke(new ez4("master.dev.sofascore.dev/"));
                break;
            case 18:
                function1.invoke(new gz4(true));
                break;
            case 19:
                function1.invoke(az4.a);
                break;
            case 20:
                function1.invoke(zy4.a);
                break;
            case 21:
                function1.invoke(new mz4(true));
                break;
            case 22:
                function1.invoke(yy4.a);
                break;
            case 23:
                function1.invoke(xy4.a);
                break;
            case 24:
                function1.invoke(new dz4(true));
                break;
            case 25:
                function1.invoke(wy4.a);
                break;
            case 26:
                function1.invoke(new gz4(false));
                break;
            case 27:
                function1.invoke(new mz4(false));
                break;
            case 28:
                function1.invoke(ry4.a);
                break;
            default:
                function1.invoke(qr5.a);
                break;
        }
        return Unit.a;
    }
}
