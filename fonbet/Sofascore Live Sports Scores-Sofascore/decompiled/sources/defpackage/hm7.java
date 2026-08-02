package defpackage;

import android.content.Context;
import com.ironsource.C4427z5;
import com.sofascore.model.Sports;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.fantasy.FantasyAverageScoreTopPlayerWrapper;
import com.sofascore.model.fantasy.FantasyScoreTopPlayerWrapper;
import com.sofascore.model.fantasy.FantasyTopPlayerWrapper;
import com.sofascore.model.fantasy.FantasyTopPlayersResponse;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hm7 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm7(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        Object obj4 = this.v;
        Object obj5 = this.u;
        switch (i) {
            case 0:
                hm7 hm7Var = new hm7((FantasyTopPlayersResponse) obj5, (im7) obj4, (rq3) obj3, 0);
                hm7Var.s = (cm7) obj;
                hm7Var.t = (rz6) obj2;
                return hm7Var.invokeSuspend(Unit.a);
            case 1:
                hm7 hm7Var2 = new hm7((String) obj5, (Charset) obj4, (rq3) obj3, 1);
                hm7Var2.s = (yj9) obj;
                hm7Var2.t = obj2;
                return hm7Var2.invokeSuspend(Unit.a);
            default:
                hm7 hm7Var3 = new hm7((MediaPost) obj5, (u8c) obj4, (rq3) obj3, 2);
                hm7Var3.s = (Event) obj;
                hm7Var3.t = (Team) obj2;
                return hm7Var3.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
    
        if (kotlin.text.c.o(r6.b, r1, true) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a3  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterable<FantasyTopPlayerWrapper> scoreTopPlayers;
        Iterator it;
        String str;
        String valueOf;
        up3 C;
        Charset w;
        int i = this.r;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                im7 im7Var = (im7) obj2;
                FantasyTopPlayersResponse fantasyTopPlayersResponse = (FantasyTopPlayersResponse) obj3;
                cm7 cm7Var = (cm7) this.s;
                rz6 rz6Var = (rz6) this.t;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                int ordinal = cm7Var.ordinal();
                if (ordinal == 0) {
                    if (fantasyTopPlayersResponse != null) {
                        scoreTopPlayers = fantasyTopPlayersResponse.getScoreTopPlayers();
                        if (scoreTopPlayers == null) {
                        }
                        ArrayList arrayList = new ArrayList(k13.r(scoreTopPlayers, 10));
                        while (r1.hasNext()) {
                        }
                        nm7 k = im7Var.k();
                        ArrayList arrayList2 = new ArrayList();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                        }
                        ((eoh) im7Var.g).setValue(nm7.a(k, null, l6g.W(arrayList2), null, null, 29));
                        return Unit.a;
                    }
                    scoreTopPlayers = null;
                    if (scoreTopPlayers == null) {
                    }
                    ArrayList arrayList3 = new ArrayList(k13.r(scoreTopPlayers, 10));
                    while (r1.hasNext()) {
                    }
                    nm7 k2 = im7Var.k();
                    ArrayList arrayList22 = new ArrayList();
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    ((eoh) im7Var.g).setValue(nm7.a(k2, null, l6g.W(arrayList22), null, null, 29));
                    return Unit.a;
                }
                if (ordinal != 1) {
                    zzl.b();
                    return null;
                }
                if (fantasyTopPlayersResponse != null) {
                    scoreTopPlayers = fantasyTopPlayersResponse.getAverageScoreTopPlayers();
                    if (scoreTopPlayers == null) {
                        scoreTopPlayers = km5.a;
                    }
                    ArrayList arrayList32 = new ArrayList(k13.r(scoreTopPlayers, 10));
                    for (FantasyTopPlayerWrapper fantasyTopPlayerWrapper : scoreTopPlayers) {
                        int id = fantasyTopPlayerWrapper.getFantasyPlayer().getId();
                        int id2 = fantasyTopPlayerWrapper.getFantasyPlayer().getPlayer().getId();
                        String t = tba.t(fantasyTopPlayerWrapper.getFantasyPlayer().getPlayer());
                        int id3 = fantasyTopPlayerWrapper.getFantasyPlayer().getTeam().getId();
                        String A = tba.A(im7Var.i(), fantasyTopPlayerWrapper.getFantasyPlayer().getTeam());
                        if (A == null) {
                            Team team = fantasyTopPlayerWrapper.getFantasyPlayer().getPlayer().getTeam();
                            A = team != null ? team.getName() : null;
                            if (A == null) {
                                A = "";
                            }
                        }
                        String str2 = A;
                        f7a f7aVar = rz6.g;
                        String position = fantasyTopPlayerWrapper.getFantasyPlayer().getPosition();
                        f7aVar.getClass();
                        rz6 g = f7a.g(position);
                        int i2 = im7Var.f;
                        Float price = fantasyTopPlayerWrapper.getFantasyPlayer().getPrice();
                        if (price != null) {
                            float floatValue = price.floatValue();
                            Context i3 = im7Var.i();
                            Locale d = dla.d();
                            Set set = o84.a;
                            str = String.format(d, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(i3), Float.valueOf(floatValue)}, 2));
                        } else {
                            str = "-";
                        }
                        String str3 = str;
                        if (fantasyTopPlayerWrapper instanceof FantasyAverageScoreTopPlayerWrapper) {
                            valueOf = String.format("%.1f", Arrays.copyOf(new Object[]{((FantasyAverageScoreTopPlayerWrapper) fantasyTopPlayerWrapper).getAverageScore()}, 1));
                        } else {
                            if (!(fantasyTopPlayerWrapper instanceof FantasyScoreTopPlayerWrapper)) {
                                zzl.b();
                                return null;
                            }
                            valueOf = String.valueOf(((FantasyScoreTopPlayerWrapper) fantasyTopPlayerWrapper).getTotalScore());
                        }
                        arrayList32.add(new dm7(id, id2, id3, t, g, str2, valueOf, i2, str3));
                    }
                    nm7 k22 = im7Var.k();
                    ArrayList arrayList222 = new ArrayList();
                    it = arrayList32.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((dm7) next).e == rz6Var || rz6Var == null) {
                            arrayList222.add(next);
                        }
                    }
                    ((eoh) im7Var.g).setValue(nm7.a(k22, null, l6g.W(arrayList222), null, null, 29));
                    return Unit.a;
                }
                scoreTopPlayers = null;
                if (scoreTopPlayers == null) {
                }
                ArrayList arrayList322 = new ArrayList(k13.r(scoreTopPlayers, 10));
                while (r1.hasNext()) {
                }
                nm7 k222 = im7Var.k();
                ArrayList arrayList2222 = new ArrayList();
                it = arrayList322.iterator();
                while (it.hasNext()) {
                }
                ((eoh) im7Var.g).setValue(nm7.a(k222, null, l6g.W(arrayList2222), null, null, 29));
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                yj9 yj9Var = (yj9) this.s;
                Object obj4 = this.t;
                String str4 = (String) obj3;
                bjb bjbVar = pj9.a;
                t89 t89Var = yj9Var.c;
                m8k m8kVar = yj9Var.a;
                List list = zi9.a;
                if (t89Var.t("Accept-Charset") == null) {
                    pj9.a.l("Adding Accept-Charset=" + str4 + " to " + m8kVar);
                    t89 t89Var2 = yj9Var.c;
                    t89Var2.P(str4);
                    List s = t89Var2.s("Accept-Charset");
                    s.clear();
                    s.add(str4);
                }
                if (!(obj4 instanceof String) || ((C = xw3.C(yj9Var)) != null && !Intrinsics.c(C.c, tp3.a.c))) {
                    return null;
                }
                Charset charset = (Charset) obj2;
                String str5 = (String) obj4;
                up3 up3Var = C == null ? tp3.a : C;
                if (C != null && (w = f5p.w(C)) != null) {
                    charset = w;
                }
                pj9.a.l("Sending request body to " + m8kVar + " as text/plain with charset " + charset);
                up3Var.getClass();
                charset.getClass();
                String name = charset.name();
                name.getClass();
                List<h89> list2 = up3Var.b;
                int size = list2.size();
                if (size != 0) {
                    if (size == 1) {
                        h89 h89Var = (h89) list2.get(0);
                        if (c.o(h89Var.a, C4427z5.N, true)) {
                            break;
                        }
                    } else if (!list2.isEmpty()) {
                        for (h89 h89Var2 : list2) {
                            if (!c.o(h89Var2.a, C4427z5.N, true) || !c.o(h89Var2.b, name, true)) {
                            }
                        }
                    }
                    return new c8j(str5, up3Var);
                }
                up3Var = new up3(up3Var.c, up3Var.d, up3Var.a, CollectionsKt.x0(list2, new h89(C4427z5.N, name)));
                return new c8j(str5, up3Var);
            default:
                Event event = (Event) this.s;
                Team team2 = (Team) this.t;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                MediaPost mediaPost = (MediaPost) obj3;
                int id4 = mediaPost.getId();
                Context context = ((u8c) obj2).a;
                return new z6j(id4, context.getString(R.string.tennis_no_lost_sets_title), context.getString(R.string.tennis_no_lost_sets_body), mediaPost.getCreatedAtTimestamp(), Sports.TENNIS, uxf.F(event, context, false, false, null, null, 62), uxf.J(team2, context, null, false, null, 30), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
        }
    }
}
