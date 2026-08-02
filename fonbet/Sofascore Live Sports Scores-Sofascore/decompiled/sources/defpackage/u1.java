package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.Country;
import com.sofascore.model.GoogleTranslate;
import com.sofascore.model.GoogleTranslateResult;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.fantasy.FantasyAgeGroup;
import com.sofascore.model.fantasy.FantasyCompetitionAgeGroupsResponse;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.view.ChatActionsModal;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import com.sofascore.results.view.CupTreeView;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u1 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(u6b u6bVar, b1d b1dVar, rq3 rq3Var, ku3 ku3Var, ksa ksaVar) {
        super(2, rq3Var);
        this.r = 24;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = ku3Var;
        this.w = ksaVar;
    }

    private final Object e(Object obj) {
        Boolean valueOf;
        Object u;
        Iterator it;
        CupTreeView cupTreeView = (CupTreeView) this.w;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        Object obj2 = null;
        int i2 = 1;
        if (i == 0) {
            ArrayList u2 = fc6.u(obj);
            Iterator it2 = ((List) this.v).iterator();
            boolean z = true;
            while (it2.hasNext()) {
                CupTree cupTree = (CupTree) it2.next();
                List<CupTreeRound> rounds = cupTree.getRounds();
                ArrayList arrayList = rounds != null ? new ArrayList(rounds) : new ArrayList();
                v02.j(arrayList);
                List B0 = CollectionsKt.B0(arrayList);
                if (cupTree.getType() == i2 && v02.i(B0)) {
                    Context context = cupTreeView.getContext();
                    context.getClass();
                    boolean h = v02.h(cupTreeView.e, context);
                    ArrayList arrayList2 = new ArrayList();
                    int size = B0.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            CupTreeRound cupTreeRound = (CupTreeRound) B0.get(size);
                            int type = cupTreeRound.getType();
                            if (h && type == 8) {
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                v02.m(cupTreeRound.getBlocks(), 8, arrayList3, arrayList4);
                                if (size > 0) {
                                    arrayList2.add(new i94(arrayList3, r8g.a, 8));
                                    gvk gvkVar = gvk.a;
                                    arrayList2.add(new h94(gvkVar));
                                    arrayList2.add(new h94(gvkVar));
                                    arrayList2.add(new i94(arrayList4, r8g.b, 8));
                                } else {
                                    arrayList2.add(new i94(arrayList3, r8g.a, 8));
                                    arrayList2.add(new h94(gvk.e));
                                    arrayList2.add(new i94(arrayList4, r8g.b, 8));
                                }
                                it = it2;
                            } else if (type == 4) {
                                ArrayList arrayList5 = new ArrayList();
                                ArrayList arrayList6 = new ArrayList();
                                v02.m(cupTreeRound.getBlocks(), 4, arrayList5, arrayList6);
                                int size2 = arrayList2.size() / 2;
                                if (size > 0) {
                                    int i4 = size2 + 1;
                                    r8g r8gVar = r8g.a;
                                    if (size2 > 0) {
                                        r8gVar = r8g.c;
                                    }
                                    it = it2;
                                    arrayList2.add(size2, new i94(arrayList5, r8gVar, 4));
                                    gvk gvkVar2 = gvk.b;
                                    arrayList2.add(i4, new h94(gvkVar2));
                                    int i5 = size2 + 3;
                                    arrayList2.add(size2 + 2, new h94(gvkVar2));
                                    r8g r8gVar2 = r8g.b;
                                    if (size2 > 0) {
                                        r8gVar2 = r8g.c;
                                    }
                                    arrayList2.add(i5, new i94(arrayList6, r8gVar2, 4));
                                } else {
                                    it = it2;
                                    int i6 = size2 + 1;
                                    r8g r8gVar3 = r8g.a;
                                    if (size2 > 0) {
                                        r8gVar3 = r8g.c;
                                    }
                                    arrayList2.add(size2, new i94(arrayList5, r8gVar3, 4));
                                    int i7 = size2 + 2;
                                    arrayList2.add(i6, new h94(gvk.d));
                                    r8g r8gVar4 = r8g.b;
                                    if (size2 > 0) {
                                        r8gVar4 = r8g.c;
                                    }
                                    arrayList2.add(i7, new i94(arrayList6, r8gVar4, 4));
                                }
                            } else {
                                it = it2;
                                if (type == 2) {
                                    ArrayList arrayList7 = new ArrayList();
                                    ArrayList arrayList8 = new ArrayList();
                                    v02.m(cupTreeRound.getBlocks(), 2, arrayList7, arrayList8);
                                    int size3 = arrayList2.size() / 2;
                                    if (size > 0) {
                                        int i8 = size3 + 1;
                                        r8g r8gVar5 = r8g.a;
                                        if (size3 > 0) {
                                            r8gVar5 = r8g.c;
                                        }
                                        arrayList2.add(size3, new i94(arrayList7, r8gVar5, 2));
                                        r8g r8gVar6 = r8g.b;
                                        if (size3 > 0) {
                                            r8gVar6 = r8g.c;
                                        }
                                        arrayList2.add(i8, new i94(arrayList8, r8gVar6, 2));
                                    } else {
                                        int i9 = size3 + 1;
                                        r8g r8gVar7 = r8g.a;
                                        if (size3 > 0) {
                                            r8gVar7 = r8g.c;
                                        }
                                        arrayList2.add(size3, new i94(arrayList7, r8gVar7, 2));
                                        int i10 = size3 + 2;
                                        arrayList2.add(i9, new h94(gvk.c));
                                        r8g r8gVar8 = r8g.b;
                                        if (size3 > 0) {
                                            r8gVar8 = r8g.c;
                                        }
                                        arrayList2.add(i10, new i94(arrayList8, r8gVar8, 2));
                                    }
                                } else if (type == 1) {
                                    ArrayList arrayList9 = new ArrayList();
                                    int size4 = cupTreeRound.getBlocks().size();
                                    for (int i11 = 0; i11 < size4; i11++) {
                                        arrayList9.add(cupTreeRound.getBlocks().get(i11));
                                    }
                                    arrayList2.add(arrayList2.size() / 2, new i94(arrayList9, B0.size() > 1 ? r8g.c : r8g.d, 1));
                                }
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size = i3;
                            it2 = it;
                        }
                    } else {
                        it = it2;
                    }
                    ArrayList arrayList10 = new ArrayList(k13.r(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList10.add(xw3.t(ku3Var, null, new hy1(cupTreeView, (j94) it3.next(), null, 27), 3));
                    }
                    u2.addAll(arrayList10);
                    obj2 = null;
                    it2 = it;
                    i2 = 1;
                    z = false;
                } else {
                    obj2 = obj2;
                    it2 = it2;
                    i2 = 1;
                }
            }
            valueOf = Boolean.valueOf(z);
            this.u = obj2;
            this.t = valueOf;
            this.s = 1;
            u = m6k.u(u2, this);
            if (u == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Boolean bool = (Boolean) this.t;
            y6a.M(obj);
            valueOf = bool;
            u = obj;
        }
        return new Pair(valueOf, u);
    }

    private final Object f(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            u6b u6bVar = (u6b) this.t;
            e6b e6bVar = e6b.c;
            rh4 rh4Var = new rh4((b1d) this.u, (FantasyCompetitionFixturesFragment) this.v, (rq3) null, (FantasyCompetitionFixturesFragment) this.w, 21);
            this.s = 1;
            if (b6a.A(u6bVar, e6bVar, rh4Var, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object g(Object obj) {
        mv6 mv6Var = (mv6) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            wi7 wi7Var = mv6Var.c;
            int i2 = mv6Var.d.c;
            String str = (String) this.u;
            String str2 = (String) this.v;
            FantasyLeagueGameType fantasyLeagueGameType = (FantasyLeagueGameType) this.w;
            this.s = 1;
            obj = wi7Var.a(i2, str, str2, fantasyLeagueGameType, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        FantasyUserLeague fantasyUserLeague = (FantasyUserLeague) obj;
        if (fantasyUserLeague != null) {
            return c6o.Q(fantasyUserLeague, mv6Var.e);
        }
        return null;
    }

    private final Object h(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        ia7 ia7Var = (ia7) this.t;
        wi7 wi7Var = ia7Var.e;
        int i2 = ia7Var.f;
        String str = (String) this.u;
        String str2 = (String) this.v;
        FantasyLeagueGameType fantasyLeagueGameType = (FantasyLeagueGameType) this.w;
        this.s = 1;
        Object a = wi7Var.a(i2, str, str2, fantasyLeagueGameType, this);
        return a == lu3Var ? lu3Var : a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0053, code lost:
    
        if (r4 == r3) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Type inference failed for: r8v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        av4 t;
        Object w;
        Object T;
        ev6 ev6Var;
        x2g x2gVar;
        FantasyCompetitionAgeGroupsResponse fantasyCompetitionAgeGroupsResponse;
        gv9 W;
        fdi fdiVar;
        Object value;
        List<FantasyAgeGroup> ageGroups;
        Iterator it;
        q9k q9kVar;
        ta7 ta7Var = (ta7) this.w;
        ku3 ku3Var = (ku3) this.v;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 0;
        int i3 = 1;
        ?? r8 = 0;
        r8 = 0;
        if (i == 0) {
            y6a.M(obj);
            av4 t2 = xw3.t(ku3Var, null, new sa7(ta7Var, r8, i3), 3);
            t = xw3.t(ku3Var, null, new sa7(ta7Var, r8, i2), 3);
            this.v = null;
            this.t = t;
            this.s = 1;
            w = t2.w(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ev6 ev6Var2 = (ev6) this.u;
                y6a.M(obj);
                ev6Var = ev6Var2;
                T = obj;
                x2gVar = (x2g) T;
                if ((x2gVar instanceof t2g) && !(x2gVar instanceof r2g)) {
                    i2 = 1;
                }
                fantasyCompetitionAgeGroupsResponse = (FantasyCompetitionAgeGroupsResponse) yaa.x(x2gVar);
                if (fantasyCompetitionAgeGroupsResponse != null && (ageGroups = fantasyCompetitionAgeGroupsResponse.getAgeGroups()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : ageGroups) {
                        FantasyAgeGroup fantasyAgeGroup = (FantasyAgeGroup) obj2;
                        if (fantasyAgeGroup.getMinAge() != null || fantasyAgeGroup.getMaxAge() != null) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        FantasyAgeGroup fantasyAgeGroup2 = (FantasyAgeGroup) it.next();
                        Integer minAge = fantasyAgeGroup2.getMinAge();
                        Integer maxAge = fantasyAgeGroup2.getMaxAge();
                        int id = fantasyAgeGroup2.getId();
                        boolean isEligibleForCompetition = fantasyAgeGroup2.isEligibleForCompetition();
                        if (minAge != null && maxAge != null) {
                            q9kVar = new q9k(R.string.fantasy_age_confirmation_span, l6g.K(minAge, maxAge));
                        } else if (minAge != null) {
                            q9kVar = new q9k(R.string.fantasy_age_confirmation_over, l6g.K(minAge));
                        } else {
                            if (maxAge == null) {
                                is8.c(fantasyAgeGroup2, "Invalid age group. ");
                                return null;
                            }
                            q9kVar = new q9k(R.string.fantasy_age_confirmation_under, l6g.K(maxAge));
                        }
                        arrayList2.add(new rn6(id, q9kVar, isEligibleForCompetition));
                    }
                    r8 = arrayList2;
                }
                if (r8 == 0) {
                    r8 = km5.a;
                }
                W = l6g.W(r8);
                fdiVar = ta7Var.h;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, ra7.a((ra7) value, (i2 == 0 || ev6Var == null) ? uj7.b : uj7.c, ev6Var, null, false, W, null, false, false, 236)));
                return Unit.a;
            }
            t = (av4) this.t;
            y6a.M(obj);
            w = obj;
        }
        ev6 ev6Var3 = (ev6) w;
        this.v = null;
        this.t = null;
        this.u = ev6Var3;
        this.s = 2;
        T = t.T(this);
        if (T != lu3Var) {
            ev6Var = ev6Var3;
            x2gVar = (x2g) T;
            if (x2gVar instanceof t2g) {
                i2 = 1;
            }
            fantasyCompetitionAgeGroupsResponse = (FantasyCompetitionAgeGroupsResponse) yaa.x(x2gVar);
            if (fantasyCompetitionAgeGroupsResponse != null) {
                ArrayList arrayList3 = new ArrayList();
                while (r0.hasNext()) {
                }
                ArrayList arrayList22 = new ArrayList(k13.r(arrayList3, 10));
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                r8 = arrayList22;
            }
            if (r8 == 0) {
            }
            W = l6g.W(r8);
            fdiVar = ta7Var.h;
            do {
                value = fdiVar.getValue();
            } while (!fdiVar.k(value, ra7.a((ra7) value, (i2 == 0 || ev6Var == null) ? uj7.b : uj7.c, ev6Var, null, false, W, null, false, false, 236)));
            return Unit.a;
        }
        return lu3Var;
    }

    private final Object k(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        tj7 tj7Var = ((vo7) this.t).g;
        ArrayList arrayList = (ArrayList) this.u;
        ho7 ho7Var = (ho7) this.v;
        boolean z = ho7Var.g;
        mj7 mj7Var = ho7Var.a;
        boolean z2 = !mj7Var.o;
        int i2 = mj7Var.a;
        Integer num = ((do7) this.w).c.B;
        int intValue = num != null ? num.intValue() : 0;
        this.s = 1;
        tj7Var.getClass();
        Object P = tz9.P(new sj7(z2, arrayList, tj7Var, i2, intValue, z, null), this);
        return P == lu3Var ? lu3Var : P;
    }

    private final Object l(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            u6b u6bVar = (u6b) this.t;
            e6b e6bVar = e6b.e;
            zi7 zi7Var = new zi7((b1d) this.u, (rq3) null, (ku3) this.v, (ksa) this.w);
            this.s = 1;
            if (b6a.A(u6bVar, e6bVar, zi7Var, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object m(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            i8f i8fVar = (i8f) this.t;
            g6b g6bVar = (g6b) this.u;
            e6b e6bVar = e6b.d;
            zi7 zi7Var = new zi7((CoroutineContext) this.v, (z88) this.w, i8fVar, (rq3) null, 8);
            this.s = 1;
            if (b6a.z(g6bVar, e6bVar, zi7Var, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object n(Object obj) {
        k8f k8fVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            k8f k8fVar2 = (k8f) this.t;
            g6b g6bVar = (g6b) this.u;
            e6b e6bVar = (e6b) this.v;
            yp7 yp7Var = new yp7((z88) this.w, k8fVar2, rq3Var, 11);
            this.t = k8fVar2;
            this.s = 1;
            if (b6a.z(g6bVar, e6bVar, yp7Var, this) == lu3Var) {
                return lu3Var;
            }
            k8fVar = k8fVar2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k8fVar = (k8f) this.t;
            y6a.M(obj);
        }
        ((j8f) k8fVar).r(null);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r9.collect(r5, r8) == r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        fsf fsfVar;
        b98 b98Var;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            b98 b98Var2 = (b98) this.u;
            fsfVar = new fsf();
            fsfVar.a = null;
            this.u = b98Var2;
            this.t = fsfVar;
            this.s = 1;
            if (b98Var2.emit(null, this) != lu3Var) {
                b98Var = b98Var2;
            }
            return lu3Var;
        }
        if (i != 1) {
            if (i == 2) {
                y6a.M(obj);
                return Unit.a;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fsfVar = (fsf) this.t;
        b98Var = (b98) this.u;
        y6a.M(obj);
        v98 v98Var = (v98) this.v;
        m70 m70Var = new m70(5, fsfVar, (g61) this.w, b98Var);
        this.u = null;
        this.t = null;
        this.s = 2;
    }

    private final Object p(Object obj) {
        fsf fsfVar;
        fsf fsfVar2;
        Object obj2 = this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            fsfVar = (fsf) this.v;
            boolean z = obj2 instanceof fo2;
            if (!z) {
                fsfVar.a = obj2;
            }
            b98 b98Var = (b98) this.w;
            if (z) {
                eo2 eo2Var = obj2 instanceof eo2 ? (eo2) obj2 : null;
                Throwable th = eo2Var != null ? eo2Var.a : null;
                if (th != null) {
                    throw th;
                }
                Object obj3 = fsfVar.a;
                if (obj3 != null) {
                    if (obj3 == rid.a) {
                        obj3 = null;
                    }
                    this.u = null;
                    this.t = fsfVar;
                    this.s = 1;
                    if (b98Var.emit(obj3, this) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar2 = fsfVar;
                }
                fsfVar.a = rid.c;
            }
            return Unit.a;
        }
        if (i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fsfVar2 = (fsf) this.t;
        y6a.M(obj);
        fsfVar = fsfVar2;
        fsfVar.a = rid.c;
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                return new u1((AbstractChatFragment) this.t, (View) this.u, (Message) this.v, (ChatUser) obj2, rq3Var, 0);
            case 1:
                u1 u1Var = new u1((Function1) this.u, (i10) this.v, (k5b) obj2, rq3Var, 1);
                u1Var.t = obj;
                return u1Var;
            case 2:
                return new u1(this.t, (q50) this.u, (e1d) this.v, (e1d) obj2, rq3Var, 2);
            case 3:
                u1 u1Var2 = new u1((af0) this.u, (Context) this.v, (e1d) obj2, rq3Var, 3);
                u1Var2.t = obj;
                return u1Var2;
            case 4:
                u6b u6bVar = (u6b) this.t;
                e6b e6bVar = e6b.a;
                return new u1(u6bVar, (b1d) this.u, (Fragment) this.v, rq3Var, (u11) obj2);
            case 5:
                u1 u1Var3 = new u1((zi7) this.v, (va2) obj2, rq3Var, 5);
                u1Var3.u = obj;
                return u1Var3;
            case 6:
                u1 u1Var4 = new u1((Function2) this.v, (va2) obj2, rq3Var, 6);
                u1Var4.u = obj;
                return u1Var4;
            case 7:
                return new u1((br2) obj2, rq3Var, 7);
            case 8:
                return new u1((us2) this.t, (GoogleTranslate) this.u, (Locale) this.v, (String) obj2, rq3Var, 8);
            case 9:
                return new u1((u53) this.t, (lcd) this.u, (Map) this.v, (pkk) obj2, rq3Var, 9);
            case 10:
                u6b u6bVar2 = (u6b) this.t;
                e6b e6bVar2 = e6b.a;
                return new u1(u6bVar2, (b1d) this.u, (CompetitionsFragment) this.v, rq3Var, (CompetitionsFragment) obj2);
            case 11:
                return new u1((xe3) this.t, (ScrollCaptureSession) this.u, (Rect) this.v, (Consumer) obj2, rq3Var, 11);
            case 12:
                u1 u1Var5 = new u1((Function2) this.u, (ad2) this.v, (BroadcastReceiver.PendingResult) obj2, rq3Var, 12);
                u1Var5.t = obj;
                return u1Var5;
            case 13:
                return new u1((q54) this.v, (a64) obj2, rq3Var, 13);
            case 14:
                u1 u1Var6 = new u1((List) this.v, (CupTreeView) obj2, rq3Var, 14);
                u1Var6.u = obj;
                return u1Var6;
            case 15:
                return new u1((ksa) this.t, (Function1) this.u, (kg2) this.v, (IntRange) obj2, rq3Var, 15);
            case 16:
                u1 u1Var7 = new u1((mr5) this.v, (Event) obj2, rq3Var, 16);
                u1Var7.u = obj;
                return u1Var7;
            case 17:
                u6b u6bVar3 = (u6b) this.t;
                e6b e6bVar3 = e6b.a;
                return new u1(u6bVar3, (b1d) this.u, (EventMatchesFragment) this.v, rq3Var, (EventMatchesFragment) obj2);
            case 18:
                return new u1((List) this.t, (lh2) this.u, (c36) this.v, (xs2) obj2, rq3Var, 18);
            case 19:
                u6b u6bVar4 = (u6b) this.t;
                e6b e6bVar4 = e6b.a;
                return new u1(u6bVar4, (b1d) this.u, (FantasyCompetitionFixturesFragment) this.v, rq3Var, (FantasyCompetitionFixturesFragment) obj2);
            case 20:
                return new u1((mv6) this.t, (String) this.u, (String) this.v, (FantasyLeagueGameType) obj2, rq3Var, 20);
            case 21:
                return new u1((ia7) this.t, (String) this.u, (String) this.v, (FantasyLeagueGameType) obj2, rq3Var, 21);
            case 22:
                u1 u1Var8 = new u1((ta7) obj2, rq3Var, 22);
                u1Var8.v = obj;
                return u1Var8;
            case 23:
                return new u1((vo7) this.t, (ArrayList) this.u, (ho7) this.v, (do7) obj2, rq3Var, 23);
            case 24:
                u6b u6bVar5 = (u6b) this.t;
                e6b e6bVar5 = e6b.a;
                return new u1(u6bVar5, (b1d) this.u, rq3Var, (ku3) this.v, (ksa) obj2);
            case 25:
                g6b g6bVar = (g6b) this.u;
                e6b e6bVar6 = e6b.a;
                u1 u1Var9 = new u1(g6bVar, (CoroutineContext) this.v, (z88) obj2, rq3Var);
                u1Var9.t = obj;
                return u1Var9;
            case 26:
                u1 u1Var10 = new u1((g6b) this.u, (e6b) this.v, (z88) obj2, rq3Var, 26);
                u1Var10.t = obj;
                return u1Var10;
            case 27:
                u1 u1Var11 = new u1((v98) this.v, (g61) obj2, rq3Var, 27);
                u1Var11.u = obj;
                return u1Var11;
            case 28:
                u1 u1Var12 = new u1((fsf) this.v, (b98) obj2, rq3Var, 28);
                u1Var12.u = ((go2) obj).a;
                return u1Var12;
            default:
                u1 u1Var13 = new u1((z88) this.v, (ct8) obj2, rq3Var, 29);
                u1Var13.u = obj;
                return u1Var13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                ((u1) create((j20) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            case 2:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((u1) create((i8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((u1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((u1) create((i8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((u1) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((u1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 28:
                Object obj3 = ((go2) obj).a;
                u1 u1Var = new u1((fsf) this.v, (b98) this.w, (rq3) obj2, 28);
                u1Var.u = obj3;
                return u1Var.invokeSuspend(Unit.a);
            default:
                return ((u1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0268, code lost:
    
        if (r0.z(r2, r18) != r1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x040a, code lost:
    
        if (r2 == r1) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0526, code lost:
    
        if (r2 != r1) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04fa, code lost:
    
        if (r0 == r1) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04e9, code lost:
    
        if (r7 == r1) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0692, code lost:
    
        if (r6.e(r18) == r3) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x062e, code lost:
    
        if (r10.Z(r18) != r3) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x065d, code lost:
    
        if (((defpackage.kea) r7).Z(r18) != r3) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0682, code lost:
    
        if (((defpackage.kea) r7).Z(r18) != r3) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x072d, code lost:
    
        if (r7.Z(r18) == r3) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0744, code lost:
    
        if (r7.Z(r18) == r3) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0161, code lost:
    
        if (r0 == r10) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x014c, code lost:
    
        if (r1 == r10) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0611 A[Catch: all -> 0x0621, TRY_LEAVE, TryCatch #0 {all -> 0x0621, blocks: (B:333:0x0603, B:335:0x0611), top: B:332:0x0603 }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x07ef  */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v175 */
    /* JADX WARN: Type inference failed for: r0v176 */
    /* JADX WARN: Type inference failed for: r0v177 */
    /* JADX WARN: Type inference failed for: r0v178 */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i8f i8fVar;
        Object obj2;
        doa z;
        i8f i8fVar2;
        c1d c1dVar;
        c1d C;
        long i;
        ku3 ku3Var;
        aea aeaVar;
        ?? r0;
        aea aeaVar2;
        ku3 ku3Var2;
        yda ydaVar;
        ?? r02;
        gv9 W;
        Object e;
        String str;
        Object e2;
        String str2;
        Object c;
        String str3;
        String id;
        String z2;
        fdi fdiVar;
        Object value;
        Object P;
        Object w;
        Object a;
        Object n;
        String str4;
        q54 q54Var;
        av4 t;
        Object w2;
        Object T;
        nk0 nk0Var;
        int i2 = this.r;
        int i3 = 3;
        int i4 = 0;
        r3 = false;
        boolean z3 = false;
        i4 = 0;
        int i5 = 2;
        Object obj3 = this.w;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        switch (i2) {
            case 0:
                ChatUser chatUser = (ChatUser) obj3;
                Message message = (Message) this.v;
                AbstractChatFragment abstractChatFragment = (AbstractChatFragment) this.t;
                lu3 lu3Var = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(200L, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FragmentActivity activity = abstractChatFragment.getActivity();
                ChatActivity chatActivity = activity instanceof ChatActivity ? (ChatActivity) activity : null;
                if (chatActivity != null) {
                    chatActivity.setHighlightedView((View) this.u);
                }
                FragmentActivity activity2 = abstractChatFragment.getActivity();
                if (activity2 != null) {
                    ChatActionsModal chatActionsModal = new ChatActionsModal((abstractChatFragment.K().isAdmin() || abstractChatFragment.K().isModerator()) ? false : true, abstractChatFragment.K().isAdmin(), message.getIsSystem(), Intrinsics.c(chatUser.getId(), abstractChatFragment.K().getId()), chatUser, true, new s1(i4, abstractChatFragment, message));
                    g6b lifecycle = chatActionsModal.getLifecycle();
                    lifecycle.getClass();
                    lifecycle.a(new t1(lifecycle, chatActionsModal, abstractChatFragment));
                    Unit unit = Unit.a;
                    AppCompatActivity appCompatActivity = activity2 instanceof AppCompatActivity ? (AppCompatActivity) activity2 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(chatActionsModal, appCompatActivity, z4 ? 1 : 0, i3));
                    }
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    h10 h10Var = new h10((j20) this.t, (Function1) this.u, (i10) this.v, (k5b) obj3, null, 0);
                    this.s = 1;
                    if (s9a.r(h10Var, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 2:
                q50 q50Var = (q50) this.u;
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    if (!Intrinsics.c(this.t, ((eoh) q50Var.e).getValue())) {
                        q50 q50Var2 = (q50) this.u;
                        Object obj4 = this.t;
                        e1d e1dVar = (e1d) this.v;
                        g0i g0iVar = a60.a;
                        c80 c80Var = (c80) e1dVar.getValue();
                        this.s = 1;
                        if (q50.a(q50Var2, obj4, c80Var, null, this, 12) == lu3Var3) {
                            return lu3Var3;
                        }
                    }
                    return Unit.a;
                }
                if (i8 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                g0i g0iVar2 = a60.a;
                Function1 function1 = (Function1) ((e1d) obj3).getValue();
                if (function1 != null) {
                    function1.invoke(q50Var.d());
                }
                return Unit.a;
            case 3:
                Context context = (Context) this.v;
                af0 af0Var = (af0) this.u;
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    i8fVar = (i8f) this.t;
                    if (((eoh) af0Var.g).getValue() != null || (z = af0Var.d.z()) == null) {
                        obj2 = null;
                        e1d e1dVar2 = (e1d) obj3;
                        nnh h = snh.h();
                        c1dVar = !(h instanceof c1d) ? (c1d) h : null;
                        if (c1dVar != null || (C = c1dVar.C(null, null)) == null) {
                            a70.r("Cannot create a mutable snapshot of an read-only snapshot");
                            return null;
                        }
                        try {
                            nnh j = C.j();
                            try {
                                re0 re0Var = af0Var.e;
                                e1d e1dVar3 = af0Var.h;
                                int i10 = re0Var.a;
                                if (Integer.MIN_VALUE <= i10 && i10 < -1) {
                                    i4 = 1;
                                }
                                if (i4 == 0) {
                                    Object systemService = context.getSystemService("appwidget");
                                    systemService.getClass();
                                    AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                                    AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(re0Var.a);
                                    if (appWidgetInfo == null) {
                                        i = 0;
                                    } else {
                                        int min = Math.min(appWidgetInfo.minWidth, (1 & appWidgetInfo.resizeMode) != 0 ? appWidgetInfo.minResizeWidth : Integer.MAX_VALUE);
                                        int min2 = Math.min(appWidgetInfo.minHeight, (2 & appWidgetInfo.resizeMode) != 0 ? appWidgetInfo.minResizeHeight : Integer.MAX_VALUE);
                                        float f = displayMetrics.density;
                                        i = hz8.i(min / f, min2 / f);
                                    }
                                    e1dVar2.setValue(new s75(i));
                                    if (((Bundle) ((eoh) e1dVar3).getValue()) == null) {
                                        ((eoh) e1dVar3).setValue(appWidgetManager.getAppWidgetOptions(re0Var.a));
                                    }
                                }
                                if (obj2 != null) {
                                    ((eoh) af0Var.g).setValue(obj2);
                                }
                                i8fVar.setValue(Boolean.TRUE);
                                Unit unit2 = Unit.a;
                                nnh.q(j);
                                C.w().i();
                                C.c();
                                return Unit.a;
                            } catch (Throwable th) {
                                nnh.q(j);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            C.c();
                            throw th2;
                        }
                    }
                    dz8 dz8Var = dz8.a;
                    String str5 = af0Var.a;
                    this.t = i8fVar;
                    this.s = 1;
                    obj2 = dz8Var.c(context, z, str5, this);
                    if (obj2 == lu3Var4) {
                        return lu3Var4;
                    }
                    i8fVar2 = i8fVar;
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i8fVar2 = (i8f) this.t;
                    y6a.M(obj);
                    obj2 = obj;
                }
                i8fVar = i8fVar2;
                e1d e1dVar22 = (e1d) obj3;
                nnh h2 = snh.h();
                if (!(h2 instanceof c1d)) {
                }
                if (c1dVar != null) {
                }
                a70.r("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    u6b u6bVar = (u6b) this.t;
                    e6b e6bVar = e6b.d;
                    g2 g2Var = new g2((b1d) this.u, (Fragment) this.v, (rq3) null, (u11) obj3, 11);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, g2Var, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                va2 va2Var = (va2) obj3;
                lu3 lu3Var6 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    ku3Var = (ku3) this.u;
                    aea aeaVar3 = new aea(bea.x(ku3Var.getCoroutineContext()));
                    try {
                        zi7 zi7Var = (zi7) this.v;
                        fof fofVar = new fof(va2Var, ku3Var.getCoroutineContext().plus(aeaVar3));
                        this.u = ku3Var;
                        this.t = aeaVar3;
                        this.s = 1;
                        if (zi7Var.invoke(fofVar, this) != lu3Var6) {
                            aeaVar = aeaVar3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        aeaVar = aeaVar3;
                        bea.o(aeaVar, "Exception thrown while reading from channel", th);
                        kc2.a(va2Var, th);
                        this.u = null;
                        this.t = null;
                        this.s = 3;
                    }
                    return lu3Var6;
                }
                if (i12 != 1) {
                    if (i12 == 2 || i12 == 3) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    if (i12 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th4 = (Throwable) this.u;
                    y6a.M(obj);
                    throw th4;
                }
                aeaVar = (aea) this.t;
                ku3Var = (ku3) this.u;
                try {
                    y6a.M(obj);
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        bea.o(aeaVar, "Exception thrown while reading from channel", th);
                        kc2.a(va2Var, th);
                        this.u = null;
                        this.t = null;
                        this.s = 3;
                        break;
                    } catch (Throwable th6) {
                        this.u = th6;
                        this.t = null;
                        this.s = 4;
                        if (aeaVar.Z(this) != lu3Var6) {
                            throw th6;
                        }
                    }
                }
                aeaVar.j0();
                if (bea.x(ku3Var.getCoroutineContext()).isCancelled()) {
                    va2Var.a(bea.x(ku3Var.getCoroutineContext()).k());
                }
                this.u = null;
                this.t = null;
                this.s = 2;
                break;
            case 6:
                va2 va2Var2 = (va2) obj3;
                lu3 lu3Var7 = lu3.a;
                int i13 = this.s;
                try {
                    try {
                    } catch (Throwable unused) {
                        p2g p2gVar = w2g.b;
                    }
                } catch (Throwable unused2) {
                    p2g p2gVar2 = w2g.b;
                    r0 = i13;
                }
                switch (i13) {
                    case 0:
                        y6a.M(obj);
                        ku3 ku3Var3 = (ku3) this.u;
                        aeaVar2 = new aea(bea.x(ku3Var3.getCoroutineContext()));
                        try {
                            Function2 function2 = (Function2) this.v;
                            kml kmlVar = new kml(va2Var2, ku3Var3.getCoroutineContext().plus(aeaVar2));
                            this.u = ku3Var3;
                            this.t = aeaVar2;
                            this.s = 1;
                            if (function2.invoke(kmlVar, this) != lu3Var7) {
                                ku3Var2 = ku3Var3;
                                ydaVar = aeaVar2;
                                aeaVar2 = (aea) ydaVar;
                                aeaVar2.j0();
                                try {
                                    if (bea.x(ku3Var2.getCoroutineContext()).isCancelled()) {
                                        va2Var2.a(bea.x(ku3Var2.getCoroutineContext()).k());
                                    }
                                    this.u = ku3Var2;
                                    this.t = null;
                                    this.s = 2;
                                    break;
                                } catch (Throwable th7) {
                                    th = th7;
                                    ydaVar = aeaVar2;
                                    try {
                                        bea.o(ydaVar, "Exception thrown while writing to channel", th);
                                        va2Var2.a(th);
                                        this.u = ku3Var2;
                                        this.t = null;
                                        this.s = 4;
                                        break;
                                    } catch (Throwable th8) {
                                        this.u = ku3Var2;
                                        this.t = th8;
                                        this.s = 6;
                                        r02 = th8;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            ku3Var2 = ku3Var3;
                            ydaVar = aeaVar2;
                            bea.o(ydaVar, "Exception thrown while writing to channel", th);
                            va2Var2.a(th);
                            this.u = ku3Var2;
                            this.t = null;
                            this.s = 4;
                        }
                        return lu3Var7;
                    case 1:
                        ydaVar = (xa3) this.t;
                        ku3Var2 = (ku3) this.u;
                        try {
                            y6a.M(obj);
                            ydaVar = ydaVar;
                            aeaVar2 = (aea) ydaVar;
                            aeaVar2.j0();
                            if (bea.x(ku3Var2.getCoroutineContext()).isCancelled()) {
                            }
                            this.u = ku3Var2;
                            this.t = null;
                            this.s = 2;
                            break;
                        } catch (Throwable th10) {
                            th = th10;
                            bea.o(ydaVar, "Exception thrown while writing to channel", th);
                            va2Var2.a(th);
                            this.u = ku3Var2;
                            this.t = null;
                            this.s = 4;
                            break;
                        }
                    case 2:
                        y6a.M(obj);
                        p2g p2gVar3 = w2g.b;
                        this.u = null;
                        this.s = 3;
                        if (va2Var2.e(this) == lu3Var7) {
                            return lu3Var7;
                        }
                        Unit unit3 = Unit.a;
                        p2g p2gVar4 = w2g.b;
                        return Unit.a;
                    case 3:
                        y6a.M(obj);
                        Unit unit32 = Unit.a;
                        p2g p2gVar42 = w2g.b;
                        return Unit.a;
                    case 4:
                        y6a.M(obj);
                        p2g p2gVar5 = w2g.b;
                        this.u = null;
                        this.s = 5;
                        if (va2Var2.e(this) == lu3Var7) {
                            return lu3Var7;
                        }
                        Unit unit4 = Unit.a;
                        p2g p2gVar422 = w2g.b;
                        return Unit.a;
                    case 5:
                        y6a.M(obj);
                        Unit unit42 = Unit.a;
                        p2g p2gVar4222 = w2g.b;
                        return Unit.a;
                    case 6:
                        Throwable th11 = (Throwable) this.t;
                        y6a.M(obj);
                        r02 = th11;
                        p2g p2gVar6 = w2g.b;
                        this.u = r02;
                        this.t = null;
                        this.s = 7;
                        i13 = r02;
                        break;
                    case 7:
                        ?? r03 = (Throwable) this.u;
                        y6a.M(obj);
                        i13 = r03;
                        Unit unit5 = Unit.a;
                        p2g p2gVar7 = w2g.b;
                        r0 = i13;
                        throw r0;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 7:
                br2 br2Var = (br2) obj3;
                cg4 cg4Var = br2Var.l;
                lu3 lu3Var8 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    vel velVar = vel.a;
                    Set keySet = vel.a().keySet();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = keySet.iterator();
                    while (it.hasNext()) {
                        Country a2 = dv3.a((String) it.next());
                        uv3 uv3Var = a2 != null ? new uv3(a2.getName(), a2.getIso2Alpha(), false) : null;
                        if (uv3Var != null) {
                            arrayList.add(uv3Var);
                        }
                    }
                    Comparator thenComparing = new z(8).thenComparing(new rs2(new vn6(27, Collator.getInstance(Locale.getDefault()), br2Var.i()), i5));
                    thenComparing.getClass();
                    W = l6g.W(CollectionsKt.H0(arrayList, thenComparing));
                    this.t = W;
                    this.s = 1;
                    e = cg4Var.e("CHAT_USER_COUNTRY_FLAG", null, this);
                    break;
                } else if (i14 == 1) {
                    W = (gv9) this.t;
                    y6a.M(obj);
                    e = obj;
                } else {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) this.v;
                        gv9 gv9Var = (gv9) this.t;
                        y6a.M(obj);
                        c = obj;
                        W = gv9Var;
                        UserAccount userAccount = (UserAccount) c;
                        String nickname = userAccount.getNickname();
                        if (nickname.length() <= 0) {
                            nickname = null;
                        }
                        if (nickname == null) {
                            nickname = userAccount.getUserName();
                            if (nickname.length() <= 0) {
                                str3 = null;
                                id = userAccount.getId();
                                if (id.length() <= 0) {
                                    id = null;
                                }
                                z2 = id != null ? pco.z(id) : null;
                                fdiVar = br2Var.e;
                                do {
                                    value = fdiVar.getValue();
                                } while (!fdiVar.k(value, new unb(new ar2(W, str2, str3, z2))));
                                return Unit.a;
                            }
                        }
                        str3 = nickname;
                        id = userAccount.getId();
                        if (id.length() <= 0) {
                        }
                        z2 = id != null ? pco.z(id) : null;
                        fdiVar = br2Var.e;
                        do {
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, new unb(new ar2(W, str2, str3, z2))));
                        return Unit.a;
                    }
                    String str6 = (String) this.u;
                    W = (gv9) this.t;
                    y6a.M(obj);
                    str = str6;
                    e2 = obj;
                    str2 = (String) e2;
                    if (str != null) {
                        if (str.length() <= 0) {
                            str = null;
                        }
                        if (str != null) {
                            str2 = str;
                            bfk bfkVar = br2Var.m;
                            this.t = W;
                            this.u = null;
                            this.v = str2;
                            this.s = 3;
                            c = bfkVar.c(this);
                            break;
                        }
                    }
                    if (str2 == null || str2.length() <= 0) {
                        str2 = null;
                    }
                    bfk bfkVar2 = br2Var.m;
                    this.t = W;
                    this.u = null;
                    this.v = str2;
                    this.s = 3;
                    c = bfkVar2.c(this);
                }
                str = (String) e;
                this.t = W;
                this.u = str;
                this.s = 2;
                e2 = cg4Var.e("WC_26_MY_TEAM_ALPHA2", null, this);
                break;
            case 8:
                Locale locale = (Locale) this.v;
                Object obj5 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    cs2 cs2Var = ((us2) this.t).q;
                    String src = ((GoogleTranslate) this.u).getSrc();
                    String language = locale.getLanguage();
                    language.getClass();
                    this.s = 1;
                    cs2Var.getClass();
                    P = yaa.P(new as2(cs2Var, src, language, (String) obj3, null, 0), this);
                    break;
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                x2g x2gVar = (x2g) P;
                if (!(x2gVar instanceof v2g)) {
                    obj5 = new GoogleTranslate((String) null, (String) null, (String) null, (List) null, (GoogleTranslateResult) null, 31, (DefaultConstructorMarker) null);
                    return obj5;
                }
                GoogleTranslate googleTranslate = (GoogleTranslate) ((v2g) x2gVar).a;
                googleTranslate.setTargetLang(locale.getLanguage());
                return googleTranslate;
            case 9:
                pkk pkkVar = (pkk) obj3;
                Map map = (Map) this.v;
                u53 u53Var = (u53) this.t;
                lu3 lu3Var9 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    av4 av4Var = (av4) u53Var.g;
                    if (av4Var != null) {
                        this.s = 1;
                        w = av4Var.w(this);
                        if (w == lu3Var9) {
                            return lu3Var9;
                        }
                    }
                    lcd lcdVar = (lcd) this.u;
                    ku3 ku3Var4 = (ku3) u53Var.d;
                    hs4 hs4Var = z45.a;
                    xw3.L(ku3Var4, rob.a, null, new t53(u53Var, lcdVar, pkkVar, map, null, 0), 2);
                    return Unit.a;
                }
                if (i16 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w = obj;
                Object obj6 = ((w2g) w).a;
                if (obj6 instanceof u2g) {
                    obj6 = null;
                }
                Bitmap bitmap = (Bitmap) obj6;
                if (bitmap != null) {
                    lcd lcdVar2 = (lcd) this.u;
                    ku3 ku3Var5 = (ku3) u53Var.d;
                    hs4 hs4Var2 = z45.a;
                    xw3.L(ku3Var5, rob.a, null, new w32(lcdVar2, bitmap, u53Var, map, pkkVar, null, 1), 2);
                    return Unit.a;
                }
                lcd lcdVar3 = (lcd) this.u;
                ku3 ku3Var42 = (ku3) u53Var.d;
                hs4 hs4Var3 = z45.a;
                xw3.L(ku3Var42, rob.a, null, new t53(u53Var, lcdVar3, pkkVar, map, null, 0), 2);
                return Unit.a;
            case 10:
                lu3 lu3Var10 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    u6b u6bVar2 = (u6b) this.t;
                    e6b e6bVar2 = e6b.e;
                    g2 g2Var2 = new g2((b1d) this.u, (CompetitionsFragment) this.v, (rq3) null, (CompetitionsFragment) obj3, 23);
                    this.s = 1;
                    if (b6a.A(u6bVar2, e6bVar2, g2Var2, this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                lu3 lu3Var11 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    xe3 xe3Var = (xe3) this.t;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.u;
                    Rect rect = (Rect) this.v;
                    x6a x6aVar = new x6a(rect.left, rect.top, rect.right, rect.bottom);
                    this.s = 1;
                    a = xe3Var.a(scrollCaptureSession, x6aVar, this);
                    if (a == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a = obj;
                }
                ((Consumer) obj3).accept(wba.M((x6a) a));
                return Unit.a;
            case 12:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj3;
                ad2 ad2Var = (ad2) this.v;
                lu3 lu3Var12 = lu3.a;
                int i19 = this.s;
                try {
                    try {
                        if (i19 == 0) {
                            y6a.M(obj);
                            ku3 ku3Var6 = (ku3) this.t;
                            Function2 function22 = (Function2) this.u;
                            this.s = 1;
                            if (function22.invoke(ku3Var6, this) == lu3Var12) {
                                return lu3Var12;
                            }
                        } else {
                            if (i19 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                        }
                    } finally {
                        try {
                            pendingResult.finish();
                        } catch (IllegalStateException unused3) {
                        }
                    }
                } catch (CancellationException e3) {
                    try {
                        throw e3;
                    } finally {
                        s9a.o(ad2Var, null);
                    }
                } catch (Throwable unused4) {
                }
                return Unit.a;
            case 13:
                q54 q54Var2 = (q54) this.v;
                lu3 lu3Var13 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    String obj7 = q54Var2.w.c().c.toString();
                    this.t = q54Var2;
                    this.u = obj7;
                    this.s = 1;
                    n = q54Var2.n(this);
                    if (n != lu3Var13) {
                        str4 = obj7;
                        q54Var = q54Var2;
                    }
                    return lu3Var13;
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    fdi fdiVar2 = q54Var2.t;
                    scj scjVar = new scj("");
                    fdiVar2.getClass();
                    fdiVar2.m(null, scjVar);
                    w1a.E(q54Var2.w, "");
                    fdi fdiVar3 = q54Var2.g;
                    q44 q44Var = q44.a;
                    fdiVar3.getClass();
                    fdiVar3.m(null, q44Var);
                    return Unit.a;
                }
                String str7 = (String) this.u;
                q54 q54Var3 = (q54) this.t;
                y6a.M(obj);
                str4 = str7;
                q54Var = q54Var3;
                n = obj;
                boolean booleanValue = ((Boolean) n).booleanValue();
                q54Var.getClass();
                kxe kxeVar = new kxe(-1, str4, "", "", false, null, booleanValue);
                int ordinal = ((a64) obj3).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        fdi fdiVar4 = q54Var2.q;
                        fdiVar4.getClass();
                        fdiVar4.m(null, kxeVar);
                        if ((q54Var2.o.getValue() instanceof CrowdsourcingIncidentType.Card) && (r2 = (kxe) q54Var2.p.getValue()) != null) {
                            this.t = null;
                            this.u = null;
                            this.s = 2;
                            break;
                        }
                        fdi fdiVar22 = q54Var2.t;
                        scj scjVar2 = new scj("");
                        fdiVar22.getClass();
                        fdiVar22.m(null, scjVar2);
                        w1a.E(q54Var2.w, "");
                        fdi fdiVar32 = q54Var2.g;
                        q44 q44Var2 = q44.a;
                        fdiVar32.getClass();
                        fdiVar32.m(null, q44Var2);
                        return Unit.a;
                    }
                    if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                }
                fdi fdiVar5 = q54Var2.p;
                fdiVar5.getClass();
                fdiVar5.m(null, kxeVar);
                if (q54Var2.o.getValue() instanceof CrowdsourcingIncidentType.Card) {
                    this.t = null;
                    this.u = null;
                    this.s = 2;
                }
                fdi fdiVar222 = q54Var2.t;
                scj scjVar22 = new scj("");
                fdiVar222.getClass();
                fdiVar222.m(null, scjVar22);
                w1a.E(q54Var2.w, "");
                fdi fdiVar322 = q54Var2.g;
                q44 q44Var22 = q44.a;
                fdiVar322.getClass();
                fdiVar322.m(null, q44Var22);
                return Unit.a;
            case 14:
                return e(obj);
            case 15:
                lu3 lu3Var14 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    ksa ksaVar = (ksa) this.t;
                    this.s = 1;
                    t3e t3eVar = oj4.a;
                    Object collect = sea.y(new ni4(ksaVar, i4)).collect(new yn2(ksaVar, (Function1) this.u, (kg2) this.v, (IntRange) obj3, 2), this);
                    if (collect != lu3Var14) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                Event event = (Event) obj3;
                mr5 mr5Var = (mr5) this.v;
                ku3 ku3Var7 = (ku3) this.u;
                lu3 lu3Var15 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    av4 t2 = xw3.t(ku3Var7, null, new cr5(mr5Var, event, z6 ? 1 : 0, 14), 3);
                    t = xw3.t(ku3Var7, null, new cr5(mr5Var, event, z5 ? 1 : 0, 13), 3);
                    this.u = null;
                    this.t = t;
                    this.s = 1;
                    w2 = t2.w(this);
                    break;
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        T = obj;
                        if (((Boolean) T).booleanValue()) {
                            z3 = true;
                        }
                        return Boolean.valueOf(z3);
                    }
                    t = (av4) this.t;
                    y6a.M(obj);
                    w2 = obj;
                }
                if (((Boolean) w2).booleanValue()) {
                    this.u = null;
                    this.t = null;
                    this.s = 2;
                    T = t.T(this);
                    break;
                }
                return Boolean.valueOf(z3);
            case 17:
                lu3 lu3Var16 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    u6b u6bVar3 = (u6b) this.t;
                    e6b e6bVar3 = e6b.c;
                    rh4 rh4Var = new rh4((b1d) this.u, (EventMatchesFragment) this.v, (rq3) null, (EventMatchesFragment) obj3, 14);
                    this.s = 1;
                    if (b6a.A(u6bVar3, e6bVar3, rh4Var, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 18:
                lu3 lu3Var17 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var4 = z45.a;
                    t53 t53Var = new t53((List) this.t, (lh2) this.u, (c36) this.v, (xs2) obj3, null, 3);
                    this.s = 1;
                    if (xw3.R(hs4Var4, t53Var, this) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                return f(obj);
            case 20:
                return g(obj);
            case 21:
                return h(obj);
            case 22:
                return j(obj);
            case 23:
                return k(obj);
            case 24:
                return l(obj);
            case 25:
                return m(obj);
            case 26:
                return n(obj);
            case 27:
                return o(obj);
            case 28:
                return p(obj);
            default:
                b98 b98Var = (b98) this.u;
                lu3 lu3Var18 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    z88 z88Var = (z88) this.v;
                    nk0 nk0Var2 = new nk0((ct8) obj3, b98Var);
                    try {
                        this.u = null;
                        this.t = nk0Var2;
                        this.s = 1;
                        if (z88Var.collect(nk0Var2, this) == lu3Var18) {
                            return lu3Var18;
                        }
                    } catch (f0 e4) {
                        e = e4;
                        nk0Var = nk0Var2;
                        if (e.a == nk0Var) {
                            throw e;
                        }
                        bea.u(getContext());
                        return Unit.a;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nk0Var = (nk0) this.t;
                    try {
                        y6a.M(obj);
                    } catch (f0 e5) {
                        e = e5;
                        if (e.a == nk0Var) {
                        }
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(g6b g6bVar, CoroutineContext coroutineContext, z88 z88Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 25;
        e6b e6bVar = e6b.a;
        this.u = g6bVar;
        this.v = coroutineContext;
        this.w = z88Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(q8 q8Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = q8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(u6b u6bVar, b1d b1dVar, Fragment fragment, rq3 rq3Var, u11 u11Var) {
        super(2, rq3Var);
        this.r = 4;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = fragment;
        this.w = u11Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(u6b u6bVar, b1d b1dVar, EventMatchesFragment eventMatchesFragment, rq3 rq3Var, EventMatchesFragment eventMatchesFragment2) {
        super(2, rq3Var);
        this.r = 17;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = eventMatchesFragment;
        this.w = eventMatchesFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(u6b u6bVar, b1d b1dVar, FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment, rq3 rq3Var, FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment2) {
        super(2, rq3Var);
        this.r = 19;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = fantasyCompetitionFixturesFragment;
        this.w = fantasyCompetitionFixturesFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(u6b u6bVar, b1d b1dVar, CompetitionsFragment competitionsFragment, rq3 rq3Var, CompetitionsFragment competitionsFragment2) {
        super(2, rq3Var);
        this.r = 10;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = competitionsFragment;
        this.w = competitionsFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(Object obj, Object obj2, Object obj3, Object obj4, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
    }
}
