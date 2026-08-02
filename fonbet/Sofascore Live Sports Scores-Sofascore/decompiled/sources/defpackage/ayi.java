package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.sofascore.results.player.PlayerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ayi implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dyi b;

    public /* synthetic */ ayi(dyi dyiVar, int i) {
        this.a = i;
        this.b = dyiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final dyi dyiVar = this.b;
        final int i2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(637578743, av8Var, new ayi(dyiVar, i3)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xxi xxiVar = (xxi) rfo.x(dyiVar.s, av8Var2, 0).getValue();
                    boolean i4 = av8Var2.i(dyiVar);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i4 || O == a99Var) {
                        final Object[] objArr3 = objArr == true ? 1 : 0;
                        O = new Function1() { // from class: byi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                Object obj4;
                                TournamentRoundWrapper tournamentRoundWrapper;
                                Object obj5;
                                Tournament tournament;
                                int i5 = objArr3;
                                dyi dyiVar2 = dyiVar;
                                switch (i5) {
                                    case 0:
                                        int intValue3 = ((Integer) obj3).intValue();
                                        Iterator it = dyiVar2.o.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj4 = it.next();
                                                if (((TournamentRoundWrapper) obj4).getId() == intValue3) {
                                                }
                                            } else {
                                                obj4 = null;
                                            }
                                        }
                                        TournamentRoundWrapper tournamentRoundWrapper2 = (TournamentRoundWrapper) obj4;
                                        if (tournamentRoundWrapper2 != null && ((tournamentRoundWrapper = dyiVar2.p) == null || tournamentRoundWrapper2.getId() != tournamentRoundWrapper.getId())) {
                                            dyiVar2.p = tournamentRoundWrapper2;
                                            dyiVar2.r = dyiVar2.n ? qqj.a(tournamentRoundWrapper2) : null;
                                            dyiVar2.o();
                                            Function1 function1 = dyiVar2.t;
                                            if (function1 != null) {
                                                function1.invoke(Integer.valueOf(tournamentRoundWrapper2.getId()));
                                            }
                                        }
                                        break;
                                    default:
                                        int intValue4 = ((Integer) obj3).intValue();
                                        gv9 gv9Var = ((xxi) dyiVar2.s.getValue()).m;
                                        Iterator<E> it2 = gv9Var.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj5 = it2.next();
                                                if (((xoe) obj5).a.getId() == intValue4) {
                                                }
                                            } else {
                                                obj5 = null;
                                            }
                                        }
                                        xoe xoeVar = (xoe) obj5;
                                        if (xoeVar != null) {
                                            Event event = xoeVar.b;
                                            UniqueTournament uniqueTournament = (event == null || (tournament = event.getTournament()) == null) ? null : tournament.getUniqueTournament();
                                            if (event == null || uniqueTournament == null) {
                                                int i6 = PlayerActivity.Z;
                                                Context context = dyiVar2.getContext();
                                                context.getClass();
                                                jle.q(context, intValue4, dyiVar2.g, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                                            } else {
                                                Integer valueOf = Integer.valueOf(event.getId());
                                                String sportSlug = uniqueTournament.getSportSlug();
                                                String type = event.getStatus().getType();
                                                int id = uniqueTournament.getId();
                                                Boolean hasXg = event.getHasXg();
                                                long startTimestamp = event.getStartTimestamp();
                                                sportSlug.getClass();
                                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj6 : gv9Var) {
                                                    if (!((xoe) obj6).a.getDisabled()) {
                                                        arrayList.add(obj6);
                                                    }
                                                }
                                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(valueOf, null, arrayList, sportSlug, false, true, intValue4, type, id, hasXg, startTimestamp, null, null)), fz8.H("ANALYTICS_LOCATION", "team_of_the_round")));
                                                Context context2 = dyiVar2.getContext();
                                                context2.getClass();
                                                if (context2 instanceof csk) {
                                                    context2 = ((csk) context2).getBaseContext();
                                                }
                                                AppCompatActivity appCompatActivity = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                                                if (appCompatActivity != null) {
                                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                                }
                                            }
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O);
                    }
                    Function1 function1 = (Function1) O;
                    boolean i5 = av8Var2.i(dyiVar);
                    Object O2 = av8Var2.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new Function1() { // from class: byi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                Object obj4;
                                TournamentRoundWrapper tournamentRoundWrapper;
                                Object obj5;
                                Tournament tournament;
                                int i52 = i3;
                                dyi dyiVar2 = dyiVar;
                                switch (i52) {
                                    case 0:
                                        int intValue3 = ((Integer) obj3).intValue();
                                        Iterator it = dyiVar2.o.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj4 = it.next();
                                                if (((TournamentRoundWrapper) obj4).getId() == intValue3) {
                                                }
                                            } else {
                                                obj4 = null;
                                            }
                                        }
                                        TournamentRoundWrapper tournamentRoundWrapper2 = (TournamentRoundWrapper) obj4;
                                        if (tournamentRoundWrapper2 != null && ((tournamentRoundWrapper = dyiVar2.p) == null || tournamentRoundWrapper2.getId() != tournamentRoundWrapper.getId())) {
                                            dyiVar2.p = tournamentRoundWrapper2;
                                            dyiVar2.r = dyiVar2.n ? qqj.a(tournamentRoundWrapper2) : null;
                                            dyiVar2.o();
                                            Function1 function12 = dyiVar2.t;
                                            if (function12 != null) {
                                                function12.invoke(Integer.valueOf(tournamentRoundWrapper2.getId()));
                                            }
                                        }
                                        break;
                                    default:
                                        int intValue4 = ((Integer) obj3).intValue();
                                        gv9 gv9Var = ((xxi) dyiVar2.s.getValue()).m;
                                        Iterator<E> it2 = gv9Var.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj5 = it2.next();
                                                if (((xoe) obj5).a.getId() == intValue4) {
                                                }
                                            } else {
                                                obj5 = null;
                                            }
                                        }
                                        xoe xoeVar = (xoe) obj5;
                                        if (xoeVar != null) {
                                            Event event = xoeVar.b;
                                            UniqueTournament uniqueTournament = (event == null || (tournament = event.getTournament()) == null) ? null : tournament.getUniqueTournament();
                                            if (event == null || uniqueTournament == null) {
                                                int i6 = PlayerActivity.Z;
                                                Context context = dyiVar2.getContext();
                                                context.getClass();
                                                jle.q(context, intValue4, dyiVar2.g, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                                            } else {
                                                Integer valueOf = Integer.valueOf(event.getId());
                                                String sportSlug = uniqueTournament.getSportSlug();
                                                String type = event.getStatus().getType();
                                                int id = uniqueTournament.getId();
                                                Boolean hasXg = event.getHasXg();
                                                long startTimestamp = event.getStartTimestamp();
                                                sportSlug.getClass();
                                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj6 : gv9Var) {
                                                    if (!((xoe) obj6).a.getDisabled()) {
                                                        arrayList.add(obj6);
                                                    }
                                                }
                                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(valueOf, null, arrayList, sportSlug, false, true, intValue4, type, id, hasXg, startTimestamp, null, null)), fz8.H("ANALYTICS_LOCATION", "team_of_the_round")));
                                                Context context2 = dyiVar2.getContext();
                                                context2.getClass();
                                                if (context2 instanceof csk) {
                                                    context2 = ((csk) context2).getBaseContext();
                                                }
                                                AppCompatActivity appCompatActivity = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                                                if (appCompatActivity != null) {
                                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                                }
                                            }
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O2);
                    }
                    Function1 function12 = (Function1) O2;
                    boolean i6 = av8Var2.i(dyiVar);
                    Object O3 = av8Var2.O();
                    if (i6 || O3 == a99Var) {
                        final Object[] objArr4 = objArr2 == true ? 1 : 0;
                        O3 = new Function0() { // from class: cyi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i7 = objArr4;
                                dyi dyiVar2 = dyiVar;
                                switch (i7) {
                                    case 0:
                                        TotrSharePayload K = i2a.K((xxi) dyiVar2.s.getValue(), dyiVar2.h, dyiVar2.l || dyiVar2.m, dyiVar2.i, dyiVar2.j, dyiVar2.k);
                                        if (K != null) {
                                            Context context = dyiVar2.getContext();
                                            context.getClass();
                                            nv.u0(context, Integer.valueOf(K.e), "team_of_the_period");
                                            Function1 function13 = dyiVar2.u;
                                            if (function13 != null) {
                                                function13.invoke(K);
                                            }
                                        }
                                        break;
                                    case 1:
                                        dyiVar2.n();
                                        break;
                                    default:
                                        dyiVar2.n();
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O3);
                    }
                    Function0 function0 = (Function0) O3;
                    boolean i7 = av8Var2.i(dyiVar);
                    Object O4 = av8Var2.O();
                    if (i7 || O4 == a99Var) {
                        O4 = new Function0() { // from class: cyi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i72 = i3;
                                dyi dyiVar2 = dyiVar;
                                switch (i72) {
                                    case 0:
                                        TotrSharePayload K = i2a.K((xxi) dyiVar2.s.getValue(), dyiVar2.h, dyiVar2.l || dyiVar2.m, dyiVar2.i, dyiVar2.j, dyiVar2.k);
                                        if (K != null) {
                                            Context context = dyiVar2.getContext();
                                            context.getClass();
                                            nv.u0(context, Integer.valueOf(K.e), "team_of_the_period");
                                            Function1 function13 = dyiVar2.u;
                                            if (function13 != null) {
                                                function13.invoke(K);
                                            }
                                        }
                                        break;
                                    case 1:
                                        dyiVar2.n();
                                        break;
                                    default:
                                        dyiVar2.n();
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O4);
                    }
                    Function0 function02 = (Function0) O4;
                    boolean i8 = av8Var2.i(dyiVar);
                    Object O5 = av8Var2.O();
                    if (i8 || O5 == a99Var) {
                        O5 = new Function0() { // from class: cyi
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i72 = i2;
                                dyi dyiVar2 = dyiVar;
                                switch (i72) {
                                    case 0:
                                        TotrSharePayload K = i2a.K((xxi) dyiVar2.s.getValue(), dyiVar2.h, dyiVar2.l || dyiVar2.m, dyiVar2.i, dyiVar2.j, dyiVar2.k);
                                        if (K != null) {
                                            Context context = dyiVar2.getContext();
                                            context.getClass();
                                            nv.u0(context, Integer.valueOf(K.e), "team_of_the_period");
                                            Function1 function13 = dyiVar2.u;
                                            if (function13 != null) {
                                                function13.invoke(K);
                                            }
                                        }
                                        break;
                                    case 1:
                                        dyiVar2.n();
                                        break;
                                    default:
                                        dyiVar2.n();
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O5);
                    }
                    aik.p(xxiVar, function1, function12, function0, function02, (Function0) O5, null, av8Var2, 0, 64);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
