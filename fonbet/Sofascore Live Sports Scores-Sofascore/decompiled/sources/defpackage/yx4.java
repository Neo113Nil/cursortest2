package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.UniqueTournamentTeamsResponse;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yx4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yx4(int i, Object obj, Serializable serializable, String str, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = serializable;
        this.e = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x023a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r1 != null ? java.lang.Boolean.valueOf(r1.c.w) : null, java.lang.Boolean.FALSE) != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Collection collection;
        gv9<y3b> W;
        List<Team> teams;
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        i3 = 0;
        int i4 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        int i5 = 1;
        switch (i) {
            case 0:
                z6a z6aVar = (z6a) obj3;
                h0d h0dVar = (h0d) obj2;
                if (obj == ((ay4) obj4)) {
                    a70.r("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof qdi) {
                    int i6 = z6aVar.a - i4;
                    int d = h0dVar.d(obj);
                    h0dVar.g(Math.min(i6, d >= 0 ? h0dVar.c[d] : Integer.MAX_VALUE), obj);
                }
                return Unit.a;
            case 1:
                f06 f06Var = (f06) obj4;
                Function1 function1 = (Function1) obj3;
                BaseActivity baseActivity = (BaseActivity) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                if (f06Var.c != null) {
                    esaVar.c("LineupsChips", "LineupsChips", new tc3(1557516880, new wi(i4, f06Var, function1), true));
                }
                esa.d(esaVar, null, null, zm2.c, 3);
                if (f06Var.a != null) {
                    esaVar.f("FootballLineupsField", "FootballLineupsField", new tc3(-1159392757, new c06(i3, f06Var, function1), true));
                }
                esaVar.f("TeamSelector", "TeamSelector", new tc3(135989845, new c06(i5, f06Var, function1), true));
                gv9 gv9Var = f06Var.b.a;
                esaVar.a(gv9Var.size(), null, new xo(gv9Var, 5), new tc3(2039820996, new hs3(gv9Var, f06Var, baseActivity, function1, 3), true));
                esa.b(esaVar, null, zm2.d, 3);
                if (f06Var.f != null) {
                    esaVar.f("AveragePositionsView", "AveragePositionsView", new tc3(-753697804, new c06(function1, f06Var), true));
                }
                return Unit.a;
            case 2:
                gs6 gs6Var = (gs6) obj4;
                Context context = (Context) obj3;
                Function1 function12 = (Function1) obj2;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                if (gs6Var.b != null) {
                    esaVar2.f("header", "header", new tc3(74373685, new w54(gs6Var, i4, context, i5), true));
                }
                if (!gs6Var.d.isEmpty()) {
                    esaVar2.f("public_leagues", "public_leagues", new tc3(898759468, new fs6(gs6Var, function12, i5), true));
                }
                esaVar2.f("small_banner_ad", "small_banner_ad", fd3.a);
                if (gs6Var.c.isEmpty()) {
                    do7 do7Var = gs6Var.b;
                    break;
                }
                esaVar2.f("private_leagues", "private_leagues", new tc3(1346875053, new fs6(gs6Var, function12, i2), true));
                esaVar2.f("large_banner_ad", "large_banner_ad", fd3.b);
                return Unit.a;
            case 3:
                osa osaVar = (osa) obj4;
                Context context2 = (Context) obj3;
                w31 w31Var = (w31) obj2;
                long longValue = ((Long) obj).longValue();
                if (osaVar.c() > 0 && (osaVar.e(0) instanceof fdd)) {
                    i3 = 1;
                }
                nv.B(context2, w31Var, longValue, i4 - i3, false);
                return Unit.a;
            case 4:
                if9 if9Var = (if9) obj4;
                m1c m1cVar = (m1c) obj3;
                qhe qheVar = (qhe) obj2;
                phe pheVar = (phe) obj;
                int i7 = if9Var.b;
                mbj mbjVar = if9Var.a;
                gwj gwjVar = if9Var.c;
                bej bejVar = (bej) if9Var.d.invoke();
                mbjVar.a(ewd.b, b0a.H(pheVar, i7, gwjVar, bejVar != null ? bejVar.a : null, m1cVar.getLayoutDirection() == ema.b, qheVar.a), i4, qheVar.a);
                phe.h(pheVar, qheVar, Math.round(-mbjVar.a.h()), 0);
                return Unit.a;
            case 5:
                o4b o4bVar = (o4b) obj4;
                UniqueTournamentTeamsResponse uniqueTournamentTeamsResponse = (UniqueTournamentTeamsResponse) obj3;
                String str = (String) obj2;
                y3b y3bVar = y3b.f;
                b7 K = l6g.K(new oxh(null, o4bVar.i().getString(R.string.all_teams), null, null, null, false, 252));
                if (uniqueTournamentTeamsResponse == null || (teams = uniqueTournamentTeamsResponse.getTeams()) == null || (collection = CollectionsKt.H0(haa.s(o4bVar.i(), teams), new se7(26))) == null) {
                    collection = rlh.b;
                }
                K.getClass();
                collection.getClass();
                b7 c = K.c(collection);
                y3b.e.getClass();
                if (str.equals(Sports.BASKETBALL)) {
                    W = l6g.W(y3b.k);
                } else if (str.equals(Sports.AMERICAN_FOOTBALL)) {
                    kp5 kp5Var = y3b.k;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : kp5Var) {
                        y3b y3bVar2 = (y3b) obj5;
                        if (y3bVar2 != y3b.h && y3bVar2 != y3b.i) {
                            arrayList.add(obj5);
                        }
                    }
                    W = l6g.W(arrayList);
                } else {
                    kp5 kp5Var2 = y3b.k;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : kp5Var2) {
                        y3b y3bVar3 = (y3b) obj6;
                        if (y3bVar3 != y3b.h && y3bVar3 != y3b.i) {
                            arrayList2.add(obj6);
                        }
                    }
                    W = l6g.W(arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(k13.r(W, 10));
                for (y3b y3bVar4 : W) {
                    arrayList3.add(new oxh(y3bVar4, o4bVar.i().getString(y3bVar4.a), null, null, null, false, 252));
                }
                gv9 W2 = l6g.W(arrayList3);
                m4b m4bVar = (m4b) ((vnb) o4bVar.f.a.getValue()).a();
                return new unb(new m4b(this.b, y3bVar, c, null, W2, m4bVar != null ? m4bVar.f : false, str));
            default:
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("UPDATE pending_notifications SET notificationId = ?,title = ?,message = ? WHERE updatableNotificationId LIKE ?");
                try {
                    V0.q(1, i4);
                    V0.L(2, str2);
                    V0.L(3, str3);
                    V0.L(4, str4);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ yx4(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ yx4(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
