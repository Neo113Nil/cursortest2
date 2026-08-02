package defpackage;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.results.fantasy.competition.articles.FantasyNewsArticlesActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zi implements Function1, qh2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ zi(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((ia) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "odds_comparison_item";
            case 1:
                ((ia) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "signup_link_item";
            case 2:
                return ((ia) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 3:
                return ((ia) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                return ((ia) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 5:
                int intValue = ((Number) obj).intValue();
                return ((tk1) obj3).invoke(Integer.valueOf(intValue), ((gv9) obj2).get(intValue));
            case 6:
                KeyEvent keyEvent = ((sia) obj).a;
                e1d e1dVar = (e1d) obj2;
                if (!((ykj) obj3).b()) {
                    e1dVar.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 7:
                return ((ox1) obj3).invoke(((gv9) obj2).get(((Number) obj).intValue()));
            case 8:
                try {
                    ((pof) obj3).cancel();
                } catch (Throwable unused) {
                }
                return Unit.a;
            case 9:
                return ((q73) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 10:
                KeyEvent keyEvent2 = ((sia) obj).a;
                if (((q5b) obj3).a() == p69.b && keyEvent2.getKeyCode() == 4) {
                    int z2 = u0a.z(keyEvent2);
                    z = true;
                    if (z2 == 1) {
                        ((tbj) obj2).d(null);
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 11:
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                ((g9i) obj2).e(null);
                return Unit.a;
            case 12:
                int intValue2 = ((Number) obj).intValue();
                return ((xt3) obj3).invoke(Integer.valueOf(intValue2), ((gv9) obj2).get(intValue2));
            case 13:
                return ((q73) obj3).invoke(((gv9) obj2).get(((Number) obj).intValue()));
            case 14:
                int intValue3 = ((Number) obj).intValue();
                return ((xt3) obj3).invoke(Integer.valueOf(intValue3), ((gv9) obj2).get(intValue3));
            case 15:
                return ((q73) obj3).invoke(((gv9) obj2).get(((Number) obj).intValue()));
            case 16:
                return ((qz4) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 17:
                int intValue4 = ((Number) obj).intValue();
                return ((o81) obj3).invoke(Integer.valueOf(intValue4), ((List) obj2).get(intValue4));
            case 18:
                return ((au5) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 19:
                return ((au5) obj3).invoke(((gv9) obj2).get(((Number) obj).intValue()));
            case 20:
                return ((yn6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 21:
                ((yn6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "competition_card";
            case 22:
                return ((yn6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 23:
                ((yn6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "competition_card";
            case 24:
                return ((yn6) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 25:
                return ((yt6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 26:
                ((yt6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "user_competition_row";
            case 27:
                s77 s77Var = (s77) obj;
                s77Var.getClass();
                Function1 function1 = (Function1) obj3;
                String str = s77Var.b;
                if (str == null) {
                    str = "";
                }
                function1.invoke(new s47(str, ((z47) obj2).b.a));
                return Unit.a;
            case 28:
                int intValue5 = ((Number) obj).intValue();
                return ((sc6) obj3).invoke(Integer.valueOf(intValue5), ((List) obj2).get(intValue5));
            default:
                ((FantasyNewsArticle) obj).getClass();
                FantasyNewsArticlesActivity fantasyNewsArticlesActivity = (FantasyNewsArticlesActivity) obj3;
                nv.A(fantasyNewsArticlesActivity, "open_news", null);
                p4h.w(fantasyNewsArticlesActivity, ((FantasyNewsArticle) obj2).getLink());
                return Unit.a;
        }
    }

    @Override // defpackage.qh2
    public void onFailure(ah2 ah2Var, IOException iOException) {
        if (((pof) ah2Var).q) {
            return;
        }
        lj2 lj2Var = (lj2) this.b;
        p2g p2gVar = w2g.b;
        lj2Var.resumeWith(new u2g(iOException));
    }

    @Override // defpackage.qh2
    public void onResponse(ah2 ah2Var, d2g d2gVar) {
        lj2 lj2Var = (lj2) this.b;
        p2g p2gVar = w2g.b;
        lj2Var.resumeWith(d2gVar);
    }
}
