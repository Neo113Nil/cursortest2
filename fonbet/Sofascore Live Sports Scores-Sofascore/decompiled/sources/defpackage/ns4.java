package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.Menu;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.fantasy.league.settings.bottomsheet.edit.FantasyEditLeagueBottomSheet;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.player.PlayerActivity;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ns4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ns4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        hzd hzdVar;
        int i2 = 3;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ((qs4) this.b).a((iih) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 1:
                g8j g8jVar = (g8j) this.b;
                r8j r8jVar = (r8j) this.c;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean g = av8Var.g(g8jVar);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = goh.b(new ny(0, g8jVar, g8j.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 12));
                        av8Var.n0(O);
                    }
                    ft4.a(r8jVar, (f8j) ((cdi) O).getValue(), av8Var, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                ft4.a((r8j) this.b, (f8j) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                fcp.L((ct8) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 4:
                e1d e1dVar = (e1d) this.b;
                e1d e1dVar2 = (e1d) this.c;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    uic uicVar = uic.f;
                    boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                    utc utcVar = utc.a;
                    Object O2 = av8Var2.O();
                    if (O2 == nf3.a) {
                        O2 = new v30(16, e1dVar2);
                        av8Var2.n0(O2);
                    }
                    uicVar.f(booleanValue, tol.y(utcVar, false, false, false, 0L, null, (Function0) O2, av8Var2, 29), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 5:
                Function1 function1 = (Function1) this.b;
                Object obj3 = this.c;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String str = (String) function1.invoke(obj3);
                    yf8 yf8Var = xth.a;
                    udj.c(str, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var3, 0, 0, 131066);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                t62.e((j05) this.b, (Function1) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                rd0.o((List) this.b, (Collection) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                iz8.g((u75) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                qx9.e((z75) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 10:
                EventActivity eventActivity = (EventActivity) this.b;
                String str2 = (String) this.c;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                if (booleanValue2) {
                    Menu menu = eventActivity.R;
                    if (menu != null) {
                        menu.performIdentifierAction(R.id.share, 0);
                    }
                    nv.u0(eventActivity, null, str2.concat("_popup"));
                } else {
                    wxf wxfVar = EventActivity.h0;
                }
                if (booleanValue3) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = eventActivity.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    SharedPreferences.Editor i3 = dmi.i(sharedPreferences, "PREF_SCREENSHOT_DO_NOT_SHOW_AGAIN", true);
                    Unit unit = Unit.a;
                    i3.apply();
                    nv.z0(eventActivity, kv.CLICK, "screenshot_popup", "popup");
                }
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                z8e.e((rs5) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                o1j.p((js5) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                s9a.e((lm) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                rfo.c((r9k) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 15:
                ov5 ov5Var = (ov5) this.b;
                Context context = (Context) this.c;
                int intValue4 = ((Integer) obj).intValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                if (Intrinsics.c(ov5Var.t().getHasEventPlayerStatistics(), Boolean.TRUE) && dti.e(ok3.s(ov5Var.t()))) {
                    i = intValue4;
                    Event t = ov5Var.t();
                    List list = ov5Var.o;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj4 : list) {
                        linkedHashMap.put(Integer.valueOf(((xoe) obj4).a.getId()), obj4);
                    }
                    Collection values = linkedHashMap.values();
                    values.getClass();
                    hzdVar = f8h.j(t, CollectionsKt.S0(values), i, false, null, null, 56);
                } else {
                    i = intValue4;
                    hzdVar = null;
                }
                UniqueTournament uniqueTournament = ov5Var.t().getTournament().getUniqueTournament();
                int id = uniqueTournament != null ? uniqueTournament.getId() : 0;
                if (hzdVar == null || booleanValue4) {
                    int i4 = PlayerActivity.Z;
                    jle.q(context, i, id, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                } else {
                    PlayerEventStatisticsModal c = jpe.c(hzdVar, null);
                    context.getClass();
                    if (context instanceof csk) {
                        context = ((csk) context).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                    if (appCompatActivity != null) {
                        me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                    }
                }
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                hkg.p((cy5) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                un0.i((ny5) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                pco.f((ko6) this.b, (Function1) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                gr6.a((hr6) this.b, (Function1) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                gr6.b((nr6) this.b, (hp6) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                ml4.r((is6) this.b, (hp6) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                ml4.q((gs6) this.b, (Function1) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 23:
                hu6 hu6Var = (hu6) this.b;
                Function1 function12 = (Function1) this.c;
                of3 of3Var4 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    u77 u77Var = hu6Var.t;
                    xtc e = bkh.e(ml4.f0(n9e.q(d2a.E(bkh.d(utc.a, 1.0f), 8.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var4), oyn.e)), 52.0f);
                    Object O3 = av8Var4.O();
                    if (O3 == nf3.a) {
                        O3 = new yt6(r6 ? 1 : 0);
                        av8Var4.n0(O3);
                    }
                    l98.b(u77Var, e, (Function1) O3, null, null, null, yqo.H(-615752394, av8Var4, new rsh(i2, hu6Var, function12)), av8Var4, 1573248, 56);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                rz8.k((xu6) this.b, (Function0) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                o1j.f((mj7) this.b, (xtc) this.c, (of3) obj, aba.K(49));
                return Unit.a;
            case 26:
                FantasyEditLeagueBottomSheet fantasyEditLeagueBottomSheet = (FantasyEditLeagueBottomSheet) this.b;
                cdi cdiVar = (cdi) this.c;
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                dw6 dw6Var = (dw6) fantasyEditLeagueBottomSheet.B.getValue();
                xw3.L(un0.z(dw6Var), null, null, new mj5(dw6Var, ((j67) cdiVar.getValue()).a, str3, str4, (rq3) null, 1), 3);
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                wkn.e((Long) this.b, (Function0) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 28:
                ((Integer) obj2).getClass();
                tgj.j((FantasyPlayerFixtureUiModel) this.b, (xtc) this.c, (of3) obj, aba.K(49));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                hkg.i((zx6) this.b, (Function0) this.c, (of3) obj, aba.K(1));
                return Unit.a;
        }
    }

    public /* synthetic */ ns4(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
