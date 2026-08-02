package defpackage;

import android.content.Context;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.sofascore.results.view.SofascoreRatingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yt6 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ yt6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 12;
        switch (this.a) {
            case 0:
                r60 r60Var = (r60) obj;
                r60Var.getClass();
                if (r60Var.a() == u77.a || (r60Var.b() == u77.b && r60Var.a() == u77.c)) {
                    r2 = 1;
                }
                return new pp3(uo5.m(s02.h0(250, 0, null, 6), new q13(r2, 18)), uo5.o(s02.h0(250, 0, null, 6), new q13(r2, 19)), 12);
            case 1:
                do7 do7Var = (do7) obj;
                do7Var.getClass();
                return Integer.valueOf(do7Var.a);
            case 2:
                ((do7) obj).getClass();
                return "user_competition_row";
            case 3:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 4:
                Context context = (Context) obj;
                context.getClass();
                SofascoreRatingView sofascoreRatingView = new SofascoreRatingView(context, null, 6);
                sofascoreRatingView.setAllowZeroRating(true);
                sofascoreRatingView.setShouldAnimate(false);
                return sofascoreRatingView;
            case 5:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 6:
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.e(1);
                f4gVar.s(uaa.h(0.5f, 1.0f));
                f4gVar.g(-16.0f);
                return Unit.a;
            case 7:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                float intBitsToFloat = (Float.intBitsToFloat((int) (ymaVar.a.n() >> 32)) * 0.06111111f) / 2.0f;
                ymaVar.a();
                float D0 = ymaVar.D0(intBitsToFloat);
                fkf.D(ymaVar, ia5.a, D0);
                fkf.D(ymaVar, ia5.c, D0);
                return Unit.a;
            case 8:
                ((r60) obj).getClass();
                return new pp3(uo5.n(s02.h0(250, 0, null, 6), new yt6(i)), uo5.p(s02.h0(250, 0, null, 6), new yt6(9)), 12);
            case 9:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 10:
                eo7 eo7Var = (eo7) obj;
                eo7Var.getClass();
                return eo7Var.e;
            case 11:
                ((Integer) obj).getClass();
                return "leaderboard_item";
            case 12:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 13:
                f57 f57Var = (f57) obj;
                f57Var.getClass();
                return f57Var.a;
            case 14:
                ((Integer) obj).getClass();
                return "team_item";
            case 15:
                String str = (String) obj;
                str.getClass();
                return Long.valueOf(str.length() == 0 ? 0L : 300L);
            case 16:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 17:
                n77 n77Var = (n77) obj;
                n77Var.getClass();
                return n77.a(n77Var, null, false, false, true, false, 383);
            case 18:
                n77 n77Var2 = (n77) obj;
                n77Var2.getClass();
                return n77.a(n77Var2, null, true, false, false, false, 479);
            case 19:
                n77 n77Var3 = (n77) obj;
                n77Var3.getClass();
                return n77.a(n77Var3, null, false, false, false, false, 479);
            case 20:
                return n77.a((n77) obj, null, false, true, false, false, 447);
            case 21:
                return n77.a((n77) obj, null, false, false, false, false, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            case 22:
                return n77.a((n77) obj, null, false, false, false, true, 255);
            case 23:
                return n77.a((n77) obj, null, false, false, false, false, 255);
            case 24:
                ((r60) obj).getClass();
                return new pp3(uo5.e(null, 3), uo5.f(null, 3), 12);
            case 25:
                r60 r60Var2 = (r60) obj;
                r60Var2.getClass();
                r2 = ((ho7) r60Var2.a()).a.c >= ((ho7) r60Var2.b()).a.c ? ((ho7) r60Var2.a()).a.c > ((ho7) r60Var2.b()).a.c ? 1 : 0 : -1;
                return new pp3(uo5.m(s02.h0(300, 0, null, 6), new q13(r2, 20)), uo5.o(s02.h0(300, 0, null, 6), new q13(r2, 21)), 12);
            case 26:
                ho7 ho7Var = (ho7) obj;
                ho7Var.getClass();
                return Integer.valueOf(ho7Var.a.a);
            case 27:
                r60 r60Var3 = (r60) obj;
                r60Var3.getClass();
                r2 = ((ho7) r60Var3.a()).a.c >= ((ho7) r60Var3.b()).a.c ? ((ho7) r60Var3.a()).a.c > ((ho7) r60Var3.b()).a.c ? 1 : 0 : -1;
                return new pp3(uo5.m(s02.h0(300, 0, null, 6), new q13(r2, 22)), uo5.o(s02.h0(300, 0, null, 6), new q13(r2, 23)), 12);
            case 28:
                ho7 ho7Var2 = (ho7) obj;
                ho7Var2.getClass();
                return Integer.valueOf(ho7Var2.a.a);
            default:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2));
        }
    }
}
