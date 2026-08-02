package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sofascore.results.fantasy.highlights.gameweek.FantasyGameweekHighlightsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class xj7 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xj7(zz0 zz0Var, int i, int i2, yih yihVar, joa joaVar) {
        this.d = zz0Var;
        this.b = i;
        this.c = i2;
        this.e = yihVar;
        this.f = joaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.f;
        int i2 = this.c;
        int i3 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                String str = (String) obj;
                int i4 = FantasyGameweekHighlightsActivity.Z;
                context.getClass();
                str.getClass();
                Intent intent = new Intent(context, (Class<?>) FantasyGameweekHighlightsActivity.class);
                intent.putExtra("competition", (ev6) obj2);
                intent.putExtra("roundId", i3);
                intent.putExtra("roundName", str);
                intent.putExtra("roundSequence", i2);
                context.startActivity(intent);
                return Unit.a;
            case 1:
                zz0 zz0Var = (zz0) obj3;
                aej aejVar = (aej) zz0Var.e;
                yih yihVar = (yih) obj2;
                int intValue = ((Number) ((joa) obj).getValue()).intValue();
                boolean z = yihVar.b;
                boolean z2 = yihVar.l() == z14.a;
                long k = aejVar.k(i3);
                eyc eycVar = aejVar.b;
                int i5 = pej.c;
                int i6 = (int) (k >> 32);
                int i7 = eycVar.f;
                if (eycVar.d(i6) != intValue) {
                    i6 = intValue >= i7 ? aejVar.h(i7 - 1) : aejVar.h(intValue);
                }
                int i8 = (int) (k & 4294967295L);
                if (eycVar.d(i8) != intValue) {
                    i8 = intValue >= i7 ? eycVar.c(i7 - 1, false) : eycVar.c(intValue, false);
                }
                if (i6 == i2) {
                    return zz0Var.d(i8);
                }
                if (i8 == i2) {
                    return zz0Var.d(i6);
                }
                if (!(z ^ z2) ? i3 >= i6 : i3 > i8) {
                    i6 = i8;
                }
                return zz0Var.d(i6);
            default:
                Integer num = (Integer) obj2;
                ((Function1) obj3).invoke(new lhl(i3, i2, num != null ? num.intValue() : 0, (String) obj));
                return Unit.a;
        }
    }

    public /* synthetic */ xj7(Context context, ev6 ev6Var, int i, String str, int i2) {
        this.d = context;
        this.e = ev6Var;
        this.b = i;
        this.f = str;
        this.c = i2;
    }

    public /* synthetic */ xj7(Function1 function1, Integer num, int i, int i2, String str) {
        this.d = function1;
        this.e = num;
        this.b = i;
        this.c = i2;
        this.f = str;
    }
}
