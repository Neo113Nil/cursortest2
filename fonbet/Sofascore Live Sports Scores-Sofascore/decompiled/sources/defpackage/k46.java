package defpackage;

import android.content.Context;
import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class k46 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ k46(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Object obj2;
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                q9g q9gVar = new q9g(context);
                q9gVar.setPlayerClickListener(new k46(1, function1));
                break;
            case 1:
                function1.invoke(new f46(((Integer) obj).intValue()));
                break;
            case 2:
                upb upbVar = (upb) obj;
                upbVar.getClass();
                function1.invoke(new xob(upbVar));
                break;
            case 3:
                fo1 fo1Var = (fo1) obj;
                fo1Var.getClass();
                function1.invoke(new tq6(fo1Var));
                break;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new eq6(str2));
                break;
            case 5:
                kj7 kj7Var = (kj7) obj;
                kj7Var.getClass();
                function1.invoke(new mq6(kj7Var.a, kj7Var.b));
                break;
            case 6:
                cm7 cm7Var = (cm7) obj;
                cm7Var.getClass();
                function1.invoke(new sq6(cm7Var));
                break;
            case 7:
                j67 j67Var = (j67) obj;
                j67Var.getClass();
                function1.invoke(new wr6(j67Var));
                break;
            case 8:
                j67 j67Var2 = (j67) obj;
                j67Var2.getClass();
                function1.invoke(new wr6(j67Var2));
                break;
            case 9:
                ho7 ho7Var = (ho7) obj;
                ho7Var.getClass();
                function1.invoke(new ss6(ho7Var));
                break;
            case 10:
                vl7 vl7Var = (vl7) obj;
                vl7Var.getClass();
                function1.invoke(new ws6(vl7Var));
                break;
            case 11:
                mj7 mj7Var = (mj7) obj;
                mj7Var.getClass();
                function1.invoke(new r47(mj7Var.a));
                break;
            case 12:
                function1.invoke(new h57(((Boolean) obj).booleanValue()));
                break;
            case 13:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new v57(str3));
                break;
            case 14:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new u57(str4));
                break;
            case 15:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new z67(str5));
                break;
            case 16:
                FantasyNewsArticle fantasyNewsArticle = (FantasyNewsArticle) obj;
                fantasyNewsArticle.getClass();
                function1.invoke(fantasyNewsArticle.getLink());
                break;
            case 17:
                oz6 oz6Var = (oz6) obj;
                oz6Var.getClass();
                function1.invoke(new z87(oz6Var));
                break;
            case 18:
                ja7 ja7Var = (ja7) obj;
                ja7Var.getClass();
                function1.invoke(new v97(ja7Var));
                break;
            case 19:
                rn6 rn6Var = (rn6) obj;
                rn6Var.getClass();
                function1.invoke(new la7(rn6Var));
                break;
            case 20:
                String str6 = (String) obj;
                str6.getClass();
                function1.invoke(new na7(str6));
                break;
            case 21:
                function1.invoke(new ka7(((Boolean) obj).booleanValue()));
                break;
            case 22:
                nc7 nc7Var = (nc7) obj;
                nc7Var.getClass();
                function1.invoke(new ic7(nc7Var));
                break;
            case 23:
                nc7 nc7Var2 = (nc7) obj;
                nc7Var2.getClass();
                function1.invoke(new hc7(nc7Var2));
                break;
            case 24:
                ef7 ef7Var = (ef7) obj;
                ef7Var.getClass();
                function1.invoke(new ye7(ef7Var));
                break;
            case 25:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel.getClass();
                function1.invoke(new yk7(fantasyRoundPlayerUiModel));
                break;
            case 26:
                oz6 oz6Var2 = (oz6) obj;
                oz6Var2.getClass();
                function1.invoke(new ap7(oz6Var2));
                break;
            case 27:
                gy7 gy7Var = (gy7) obj;
                gy7Var.getClass();
                function1.invoke(gy7Var);
                break;
            case 28:
                v28 v28Var = (v28) obj;
                if (v28Var != null && (str = v28Var.a) != null) {
                    function1.invoke(str);
                }
                break;
            default:
                String str7 = (String) obj;
                str7.getClass();
                bnf.c.getClass();
                Iterator<E> it = bnf.k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.c(((bnf) obj2).name(), str7)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                bnf bnfVar = (bnf) obj2;
                if (bnfVar == null) {
                    bnfVar = bnf.d;
                }
                function1.invoke(new xz5(bnfVar));
                break;
        }
        return Unit.a;
    }
}
