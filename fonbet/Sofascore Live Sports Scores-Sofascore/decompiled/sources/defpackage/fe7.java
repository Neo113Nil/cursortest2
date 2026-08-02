package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fe7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ cz6 c;

    public /* synthetic */ fe7(int i, cz6 cz6Var, Context context) {
        this.a = i;
        this.b = context;
        this.c = cz6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        cz6 cz6Var = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                int i2 = cz6Var.g.c;
                nj7[] nj7VarArr = nj7.a;
                context.getClass();
                nv.A(context, "open_rules", null);
                StringBuilder sb = new StringBuilder("https://www.sofascore.com/fantasy/rules");
                sb.append("?competitionId=" + i2);
                sb.append("#scoring");
                p4h.w(context, sb.toString());
                break;
            default:
                int i3 = cz6Var.g.c;
                nj7[] nj7VarArr2 = nj7.a;
                context.getClass();
                nv.A(context, "open_rules", null);
                StringBuilder sb2 = new StringBuilder("https://www.sofascore.com/fantasy/rules");
                sb2.append("?competitionId=" + i3);
                sb2.append("#scoring");
                p4h.w(context, sb2.toString());
                break;
        }
        return Unit.a;
    }
}
