package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class kj1 extends ot8 implements Function1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj1(int i) {
        super(1, 0, xj1.class, xj1.a, "formatPercentageAsDecimal", "formatPercentageAsDecimal(Ljava/lang/Number;)Ljava/lang/String;");
        this.b = i;
        switch (i) {
            case 1:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 2:
                super(1, 0, xj1.class, xj1.a, "formatPercentageAsDecimal", "formatPercentageAsDecimal(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 3:
                super(1, 0, xj1.class, xj1.a, "formatOneDecimal", "formatOneDecimal(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 4:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 5:
                super(1, 0, xj1.class, xj1.a, "formatOneDecimal", "formatOneDecimal(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = null;
        switch (this.b) {
            case 0:
                Number number = (Number) obj;
                number.getClass();
                ((xj1) this.receiver).getClass();
                return xj1.c(number);
            case 1:
                Number number2 = (Number) obj;
                number2.getClass();
                return fn0.m((xj1) this.receiver, number2);
            case 2:
                Number number3 = (Number) obj;
                number3.getClass();
                ((xj1) this.receiver).getClass();
                return xj1.c(number3);
            case 3:
                Number number4 = (Number) obj;
                number4.getClass();
                ((xj1) this.receiver).getClass();
                return xj1.a(number4);
            case 4:
                Number number5 = (Number) obj;
                number5.getClass();
                return fn0.m((xj1) this.receiver, number5);
            case 5:
                Number number6 = (Number) obj;
                number6.getClass();
                ((xj1) this.receiver).getClass();
                return xj1.a(number6);
            case 6:
                fa1 fa1Var = (fa1) obj;
                fa1Var.getClass();
                ((qk1) this.receiver).u(fa1Var);
                return Unit.a;
            case 7:
                Integer num = (Integer) obj;
                ((rei) this.receiver).getClass();
                return num != null ? mz1.i(wzb.a(num.intValue() / 60.0d), "'") : "";
            case 8:
                return ((hc2) this.receiver).e((rq3) obj);
            case 9:
                uq2 uq2Var = (uq2) obj;
                uq2Var.getClass();
                br2 br2Var = (br2) this.receiver;
                br2Var.getClass();
                if (uq2Var instanceof tq2) {
                    br2Var.n(null, new ox1(uq2Var, 16));
                } else {
                    if (!uq2Var.equals(sq2.a)) {
                        zzl.b();
                        return null;
                    }
                    ar2 ar2Var = (ar2) br2Var.l().a();
                    xw3.L(un0.z(br2Var), null, null, new hy1(br2Var, ar2Var != null ? ar2Var.b : null, rq3Var, 11), 3);
                }
                return Unit.a;
            case 10:
                Context context = (Context) obj;
                context.getClass();
                return ((qa5) this.receiver).l(context);
            case 11:
                Context context2 = (Context) obj;
                context2.getClass();
                return ((qa5) this.receiver).j(context2);
            case 12:
                Context context3 = (Context) obj;
                context3.getClass();
                return ((qa5) this.receiver).c(context3);
            case 13:
                Context context4 = (Context) obj;
                context4.getClass();
                return ((qa5) this.receiver).a(context4);
            case 14:
                Context context5 = (Context) obj;
                context5.getClass();
                return ((qa5) this.receiver).b(context5);
            case 15:
                Context context6 = (Context) obj;
                context6.getClass();
                return ((qa5) this.receiver).d(context6);
            case 16:
                Context context7 = (Context) obj;
                context7.getClass();
                qa5 qa5Var = (qa5) this.receiver;
                qa5Var.getClass();
                return qa5.f(qa5Var, context7, R.drawable.ic_safety_16, Integer.valueOf(R.color.secondary_default), 4);
            case 17:
                Context context8 = (Context) obj;
                context8.getClass();
                qa5 qa5Var2 = (qa5) this.receiver;
                qa5Var2.getClass();
                return qa5.f(qa5Var2, context8, R.drawable.ic_period, Integer.valueOf(R.color.neutral_default), 4);
            case 18:
                Context context9 = (Context) obj;
                context9.getClass();
                qa5 qa5Var3 = (qa5) this.receiver;
                qa5Var3.getClass();
                return qa5.f(qa5Var3, context9, R.drawable.ic_am_football_penalty_16, Integer.valueOf(R.color.rating_65), 4);
            case 19:
                Context context10 = (Context) obj;
                context10.getClass();
                qa5 qa5Var4 = (qa5) this.receiver;
                qa5Var4.getClass();
                return qa5.f(qa5Var4, context10, R.drawable.ic_baseball_pitch, Integer.valueOf(R.color.n_lv_1), 4);
            case 20:
                Context context11 = (Context) obj;
                context11.getClass();
                qa5 qa5Var5 = (qa5) this.receiver;
                qa5Var5.getClass();
                return qa5.f(qa5Var5, context11, R.drawable.ic_baseball_bat, Integer.valueOf(R.color.n_lv_1), 4);
            case 21:
                Context context12 = (Context) obj;
                context12.getClass();
                qa5 qa5Var6 = (qa5) this.receiver;
                qa5Var6.getClass();
                return qa5.f(qa5Var6, context12, R.drawable.ic_half_time, Integer.valueOf(R.color.neutral_default), 4);
            case 22:
                Context context13 = (Context) obj;
                context13.getClass();
                qa5 qa5Var7 = (qa5) this.receiver;
                qa5Var7.getClass();
                return qa5.f(qa5Var7, context13, R.drawable.ic_full_time, Integer.valueOf(R.color.neutral_default), 4);
            case 23:
                Context context14 = (Context) obj;
                context14.getClass();
                qa5 qa5Var8 = (qa5) this.receiver;
                qa5Var8.getClass();
                context14.getClass();
                return qa5.f(qa5Var8, context14, R.drawable.ic_card_yellow_16, null, 6);
            case 24:
                Context context15 = (Context) obj;
                context15.getClass();
                qa5 qa5Var9 = (qa5) this.receiver;
                qa5Var9.getClass();
                context15.getClass();
                return qa5.f(qa5Var9, context15, R.drawable.ic_yellow_double_16, null, 6);
            case 25:
                Context context16 = (Context) obj;
                context16.getClass();
                qa5 qa5Var10 = (qa5) this.receiver;
                qa5Var10.getClass();
                context16.getClass();
                return qa5.f(qa5Var10, context16, R.drawable.ic_card_red_16, null, 6);
            case 26:
                Context context17 = (Context) obj;
                context17.getClass();
                return ((qa5) this.receiver).l(context17);
            case 27:
                Context context18 = (Context) obj;
                context18.getClass();
                return ((qa5) this.receiver).h(context18);
            case 28:
                Context context19 = (Context) obj;
                context19.getClass();
                return ((qa5) this.receiver).j(context19);
            default:
                Context context20 = (Context) obj;
                context20.getClass();
                return ((qa5) this.receiver).h(context20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }
}
