package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.database.DisplayType;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.ManagerData;
import com.sofascore.model.mvvm.model.ManagerHeadFlags;
import com.sofascore.model.mvvm.model.MmaOrganisationHeadFlags;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerHeadFlags;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.model.profile.EditorsEventsCountResponse;
import com.sofascore.model.profile.VoteStatistics;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.feed.compose.model.FeedbackType;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.details.PlayerDetailsFragment;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.profile.editor.ProfileEditorSummaryItemView;
import com.sofascore.results.profile.view.ProfilePredictionStatisticsView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class v9b extends ot8 implements Function1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x052d  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String slug;
        Object value;
        Iterable<zxe> iterable;
        Iterator it;
        zxe zxeVar;
        Integer num;
        int D;
        Sport sport;
        String slug2;
        Object obj2;
        final int i = 1;
        switch (this.b) {
            case 0:
                cab cabVar = (cab) this.receiver;
                cab cabVar2 = cab.a;
                cabVar.getClass();
                return cab.k((Number) obj);
            case 1:
                cab cabVar3 = (cab) this.receiver;
                cab cabVar4 = cab.a;
                cabVar3.getClass();
                return cab.k((Number) obj);
            case 2:
                cab cabVar5 = (cab) this.receiver;
                cab cabVar6 = cab.a;
                cabVar5.getClass();
                return cab.k((Number) obj);
            case 3:
                cab cabVar7 = (cab) this.receiver;
                cab cabVar8 = cab.a;
                cabVar7.getClass();
                return cab.k((Number) obj);
            case 4:
                cab cabVar9 = (cab) this.receiver;
                cab cabVar10 = cab.a;
                cabVar9.getClass();
                return cab.k((Number) obj);
            case 5:
                cab cabVar11 = (cab) this.receiver;
                cab cabVar12 = cab.a;
                cabVar11.getClass();
                return cab.k((Number) obj);
            case 6:
                Number number = (Number) obj;
                cab cabVar13 = (cab) this.receiver;
                cab cabVar14 = cab.a;
                cabVar13.getClass();
                return yid.g(number != null ? Double.valueOf(number.doubleValue()) : null);
            case 7:
                Number number2 = (Number) obj;
                cab cabVar15 = (cab) this.receiver;
                cab cabVar16 = cab.a;
                cabVar15.getClass();
                return yid.g(number2 != null ? Double.valueOf(number2.doubleValue()) : null);
            case 8:
                cab cabVar17 = (cab) this.receiver;
                cab cabVar18 = cab.a;
                cabVar17.getClass();
                return cab.k((Number) obj);
            case 9:
                cab cabVar19 = (cab) this.receiver;
                cab cabVar20 = cab.a;
                cabVar19.getClass();
                return cab.k((Number) obj);
            case 10:
                x2g x2gVar = (x2g) obj;
                ManagerActivity managerActivity = (ManagerActivity) this.receiver;
                int i2 = ManagerActivity.R;
                vc Q = managerActivity.Q();
                mqi mqiVar = managerActivity.O;
                Q.l.setRefreshing(false);
                as9.g(managerActivity.R(), managerActivity.X());
                if (x2gVar instanceof v2g) {
                    Object obj3 = ((v2g) x2gVar).a;
                    ManagerHeadFlags managerHeadFlags = (ManagerHeadFlags) obj3;
                    Manager manager = managerHeadFlags.getManager().getManager();
                    ctb ctbVar = (ctb) mqiVar.getValue();
                    ManagerData manager2 = managerHeadFlags.getManager();
                    ctbVar.getClass();
                    manager2.getClass();
                    ctbVar.r = manager2;
                    if (!managerActivity.Q) {
                        managerActivity.Q = true;
                        new bsb(managerActivity, 3);
                        managerActivity.Q().l.setEnabled(false);
                        AdBannerView adBannerView = managerActivity.Q().b;
                        ltb ltbVar = new ltb();
                        ManagerData managerData = ((ctb) mqiVar.getValue()).r;
                        if (managerData == null) {
                            Intrinsics.i("managerData");
                            throw null;
                        }
                        Sport sport2 = managerData.getManager().getSport();
                        if (sport2 != null && (slug = sport2.getSlug()) != null) {
                            ltbVar.put(SearchResponseKt.SPORT_ENTITY, slug);
                        }
                        managerActivity.I(adBannerView, ltbVar.d());
                        manager.getClass();
                        managerActivity.U(tba.s(manager), manager.getTeam(), manager.getRetired(), manager.getDeceased(), null);
                        managerActivity.W(manager.getTeam(), manager.getCountry(), manager.getDeceased());
                    }
                    kp5 kp5Var = atb.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : kp5Var) {
                        if (((Boolean) ((atb) obj4).b.invoke(obj3)).booleanValue()) {
                            arrayList.add(obj4);
                        }
                    }
                    ((ctb) mqiVar.getValue()).x(arrayList);
                }
                return Unit.a;
            case 11:
                DisplayType displayType = (DisplayType) obj;
                displayType.getClass();
                dyb dybVar = (dyb) this.receiver;
                dybVar.getClass();
                fdi fdiVar = dybVar.e;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, byb.a((byb) value, displayType, null, 6)));
                return Unit.a;
            case 12:
                FeedbackType feedbackType = (FeedbackType) obj;
                feedbackType.getClass();
                my7 my7Var = (my7) this.receiver;
                my7Var.getClass();
                fdi fdiVar2 = my7Var.g;
                Set set = (Set) fdiVar2.getValue();
                fdiVar2.m(null, set.contains(feedbackType) ? y9h.d(set, feedbackType) : y9h.g(set, feedbackType));
                return Unit.a;
            case 13:
                gec gecVar = (gec) obj;
                gecVar.getClass();
                w41 w41Var = (w41) this.receiver;
                w41Var.getClass();
                w41Var.n(null, new u2(gecVar, 14));
                fdi fdiVar3 = w41Var.n;
                fdiVar3.getClass();
                fdiVar3.m(null, gecVar);
                return Unit.a;
            case 14:
                rrc rrcVar = (rrc) obj;
                rrcVar.getClass();
                moc mocVar = (moc) this.receiver;
                mocVar.getClass();
                mocVar.e = rrcVar;
                Iterator it2 = mocVar.a().iterator();
                while (it2.hasNext()) {
                    ((lrc) it2.next()).setTextDisplayMode(rrcVar);
                }
                return Unit.a;
            case 15:
                MmaOrganisationHeadFlags mmaOrganisationHeadFlags = (MmaOrganisationHeadFlags) obj;
                mmaOrganisationHeadFlags.getClass();
                MmaOrganisationActivity mmaOrganisationActivity = (MmaOrganisationActivity) this.receiver;
                int i3 = MmaOrganisationActivity.T;
                mmaOrganisationActivity.Q().l.setRefreshing(false);
                UniqueTournament uniqueTournament = mmaOrganisationHeadFlags.getUniqueTournament();
                mmaOrganisationActivity.x.a = Integer.valueOf(((Number) mmaOrganisationActivity.M.getValue()).intValue());
                mqi mqiVar2 = mmaOrganisationActivity.P;
                cqc cqcVar = (cqc) mqiVar2.getValue();
                cqcVar.getClass();
                uniqueTournament.getClass();
                cqcVar.r = uniqueTournament;
                if (!mmaOrganisationActivity.O) {
                    mmaOrganisationActivity.O = true;
                    new bpc(mmaOrganisationActivity, 3);
                    mmaOrganisationActivity.Q().l.setEnabled(false);
                    as9.q(mmaOrganisationActivity.R(), Integer.valueOf(uniqueTournament.getId()), 0, null);
                    mmaOrganisationActivity.R().setBackground(mmaOrganisationActivity.getDrawable(R.drawable.rounded_surface_level_4));
                    mmaOrganisationActivity.Q().d.setBackground(new qy0(uniqueTournament.getId(), 0));
                    CollapsibleToolbarActivity.V(mmaOrganisationActivity, tba.x(uniqueTournament), uniqueTournament.getCountry(), null, 12);
                    iz8.D(mmaOrganisationActivity.Q().f, uniqueTournament, false);
                    Intent intent = mmaOrganisationActivity.getIntent();
                    intent.getClass();
                    nv.f0(mmaOrganisationActivity, uniqueTournament, intent);
                }
                kp5 kp5Var2 = bqc.d;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : kp5Var2) {
                    if (((Boolean) ((bqc) obj5).b.invoke(mmaOrganisationHeadFlags)).booleanValue()) {
                        arrayList2.add(obj5);
                    }
                }
                ((cqc) mqiVar2.getValue()).x(arrayList2);
                return Unit.a;
            case 16:
                return Boolean.valueOf(((nqc) this.receiver).G(((Number) obj).intValue()));
            case 17:
                return Boolean.valueOf(((nqc) this.receiver).G(((Number) obj).intValue()));
            case 18:
                q3d q3dVar = (q3d) this.receiver;
                wck wckVar = q3dVar.a;
                int intValue = ((Number) wckVar.a.a(obj)).intValue();
                String str = (String) CollectionsKt.a0(intValue - wckVar.b, q3dVar.b);
                return str == null ? mz1.o(lnb.t(intValue, "The value ", " of "), wckVar.d, " does not have a corresponding string representation") : str;
            case 19:
                return ((ead) this.receiver).b((rq3) obj);
            case 20:
                return ((gef) this.receiver).a.get(obj);
            case 21:
                return Boolean.valueOf(((l3f) this.receiver).test(obj));
            case 22:
                ((w1k) this.receiver).getClass();
                return Boolean.TRUE;
            case 23:
                final q0e q0eVar = (q0e) obj;
                q0eVar.getClass();
                b1e b1eVar = (b1e) this.receiver;
                b1eVar.getClass();
                if (q0eVar instanceof n0e) {
                    b1eVar.n(null, new Function1() { // from class: z0e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i4 = r2;
                            q0e q0eVar2 = q0eVar;
                            switch (i4) {
                                case 0:
                                    r0e r0eVar = (r0e) obj6;
                                    r0eVar.getClass();
                                    return r0e.a(r0eVar, null, null, u28.a(r0eVar.c, ((n0e) q0eVar2).a, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), null, 11);
                                case 1:
                                    r0e r0eVar2 = (r0e) obj6;
                                    r0eVar2.getClass();
                                    return r0e.a(r0eVar2, null, null, null, u28.a(r0eVar2.d, ((o0e) q0eVar2).a, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), 7);
                                case 2:
                                    r0e r0eVar3 = (r0e) obj6;
                                    r0eVar3.getClass();
                                    return r0e.a(r0eVar3, m28.a(r0eVar3.a, ((m0e) q0eVar2).a, null, 29), null, null, null, 14);
                                default:
                                    r0e r0eVar4 = (r0e) obj6;
                                    r0eVar4.getClass();
                                    return r0e.a(r0eVar4, null, m28.a(r0eVar4.b, ((p0e) q0eVar2).a, null, 29), null, null, 13);
                            }
                        }
                    });
                } else if (q0eVar instanceof o0e) {
                    b1eVar.n(null, new Function1() { // from class: z0e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i4 = i;
                            q0e q0eVar2 = q0eVar;
                            switch (i4) {
                                case 0:
                                    r0e r0eVar = (r0e) obj6;
                                    r0eVar.getClass();
                                    return r0e.a(r0eVar, null, null, u28.a(r0eVar.c, ((n0e) q0eVar2).a, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), null, 11);
                                case 1:
                                    r0e r0eVar2 = (r0e) obj6;
                                    r0eVar2.getClass();
                                    return r0e.a(r0eVar2, null, null, null, u28.a(r0eVar2.d, ((o0e) q0eVar2).a, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), 7);
                                case 2:
                                    r0e r0eVar3 = (r0e) obj6;
                                    r0eVar3.getClass();
                                    return r0e.a(r0eVar3, m28.a(r0eVar3.a, ((m0e) q0eVar2).a, null, 29), null, null, null, 14);
                                default:
                                    r0e r0eVar4 = (r0e) obj6;
                                    r0eVar4.getClass();
                                    return r0e.a(r0eVar4, null, m28.a(r0eVar4.b, ((p0e) q0eVar2).a, null, 29), null, null, 13);
                            }
                        }
                    });
                } else if (q0eVar instanceof m0e) {
                    final int i4 = 2;
                    b1eVar.n(null, new Function1() { // from class: z0e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i42 = i4;
                            q0e q0eVar2 = q0eVar;
                            switch (i42) {
                                case 0:
                                    r0e r0eVar = (r0e) obj6;
                                    r0eVar.getClass();
                                    return r0e.a(r0eVar, null, null, u28.a(r0eVar.c, ((n0e) q0eVar2).a, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), null, 11);
                                case 1:
                                    r0e r0eVar2 = (r0e) obj6;
                                    r0eVar2.getClass();
                                    return r0e.a(r0eVar2, null, null, null, u28.a(r0eVar2.d, ((o0e) q0eVar2).a, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), 7);
                                case 2:
                                    r0e r0eVar3 = (r0e) obj6;
                                    r0eVar3.getClass();
                                    return r0e.a(r0eVar3, m28.a(r0eVar3.a, ((m0e) q0eVar2).a, null, 29), null, null, null, 14);
                                default:
                                    r0e r0eVar4 = (r0e) obj6;
                                    r0eVar4.getClass();
                                    return r0e.a(r0eVar4, null, m28.a(r0eVar4.b, ((p0e) q0eVar2).a, null, 29), null, null, 13);
                            }
                        }
                    });
                } else if (q0eVar instanceof p0e) {
                    final int i5 = 3;
                    b1eVar.n(null, new Function1() { // from class: z0e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i42 = i5;
                            q0e q0eVar2 = q0eVar;
                            switch (i42) {
                                case 0:
                                    r0e r0eVar = (r0e) obj6;
                                    r0eVar.getClass();
                                    return r0e.a(r0eVar, null, null, u28.a(r0eVar.c, ((n0e) q0eVar2).a, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), null, 11);
                                case 1:
                                    r0e r0eVar2 = (r0e) obj6;
                                    r0eVar2.getClass();
                                    return r0e.a(r0eVar2, null, null, null, u28.a(r0eVar2.d, ((o0e) q0eVar2).a, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), 7);
                                case 2:
                                    r0e r0eVar3 = (r0e) obj6;
                                    r0eVar3.getClass();
                                    return r0e.a(r0eVar3, m28.a(r0eVar3.a, ((m0e) q0eVar2).a, null, 29), null, null, null, 14);
                                default:
                                    r0e r0eVar4 = (r0e) obj6;
                                    r0eVar4.getClass();
                                    return r0e.a(r0eVar4, null, m28.a(r0eVar4.b, ((p0e) q0eVar2).a, null, 29), null, null, 13);
                            }
                        }
                    });
                } else {
                    if (!(q0eVar instanceof l0e)) {
                        zzl.b();
                        return null;
                    }
                    fdi fdiVar4 = b1eVar.m;
                    String str2 = ((l0e) q0eVar).a;
                    fdiVar4.getClass();
                    fdiVar4.m(null, str2);
                }
                return Unit.a;
            case 24:
                PlayerHeadFlags playerHeadFlags = (PlayerHeadFlags) obj;
                PlayerActivity playerActivity = (PlayerActivity) this.receiver;
                int i6 = PlayerActivity.Z;
                playerActivity.Q().l.setRefreshing(false);
                if (playerHeadFlags != null) {
                    Player player = playerHeadFlags.getPlayer();
                    aye a0 = playerActivity.a0();
                    a0.getClass();
                    player.getClass();
                    a0.r = player;
                    playerActivity.a0().s = playerHeadFlags.getPlayerStatisticsSeasons();
                    playerActivity.a0().t = Integer.valueOf(((Number) playerActivity.P.getValue()).intValue());
                    playerActivity.a0().u = Integer.valueOf(((Number) playerActivity.Q.getValue()).intValue());
                    playerActivity.a0().v = ((Boolean) playerActivity.R.getValue()).booleanValue();
                    playerActivity.a0().w = playerActivity.T;
                    int Y = playerActivity.Y();
                    Intent intent2 = playerActivity.getIntent();
                    intent2.getClass();
                    FirebaseBundle firebaseBundle = new FirebaseBundle();
                    String F = nv.F(intent2);
                    if (F != null) {
                        firebaseBundle.putString(Payload.CAMPAIGN_ID, F);
                    }
                    nv.h(firebaseBundle, intent2);
                    firebaseBundle.putInt("id", Y);
                    firebaseBundle.putString("location", nv.G(intent2).a);
                    nv.N(playerActivity, firebaseBundle, "open_player");
                    playerActivity.b0(player);
                    if (!playerActivity.U) {
                        playerActivity.U = true;
                        new ile(playerActivity, 6);
                        playerActivity.Q().l.setEnabled(false);
                        AdBannerView adBannerView2 = playerActivity.Q().b;
                        ltb ltbVar2 = new ltb();
                        Team team = playerActivity.a0().J().getTeam();
                        if (team != null && (sport = team.getSport()) != null && (slug2 = sport.getSlug()) != null) {
                            ltbVar2.put(SearchResponseKt.SPORT_ENTITY, slug2);
                        }
                        ltbVar2.put("player_id", String.valueOf(playerActivity.Y()));
                        ltbVar2.put("page", SearchResponseKt.PLAYER_ENTITY);
                        playerActivity.I(adBannerView2, ltbVar2.d());
                        playerActivity.U(tba.t(player), player.getTeam(), player.getRetired(), player.getDeceased(), player.getGender());
                        playerActivity.W(player.getTeam(), player.getCountry(), player.getDeceased());
                        if (!player.getRetired() && !player.getDeceased()) {
                            iz8.D(playerActivity.Q().f, player, false);
                        }
                    }
                    String Z = playerActivity.Z();
                    kp5 kp5Var3 = zxe.j;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : kp5Var3) {
                        if (((Boolean) ((zxe) obj6).b.invoke(playerHeadFlags)).booleanValue()) {
                            arrayList3.add(obj6);
                        }
                    }
                    if (Z != null) {
                        int hashCode = Z.hashCode();
                        if (hashCode != -1721090992) {
                            if (hashCode != -83759494) {
                                iterable = b.j(zxe.d, zxe.e, zxe.f, zxe.g, zxe.c, zxe.h);
                                break;
                            } else {
                                iterable = b.j(zxe.d, zxe.e, zxe.f, zxe.g, zxe.c, zxe.h);
                                break;
                            }
                            xbb b = a.b();
                            for (zxe zxeVar2 : iterable) {
                                if (arrayList3.contains(zxeVar2)) {
                                    b.add(zxeVar2);
                                }
                            }
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                zxe zxeVar3 = (zxe) it.next();
                                if (!b.contains(zxeVar3)) {
                                    b.add(zxeVar3);
                                }
                            }
                            playerActivity.a0().x(a.a(b));
                            zxeVar = playerActivity.S;
                            if (zxeVar != null) {
                                int D2 = playerActivity.a0().D(zxeVar);
                                if (D2 != -1) {
                                    playerActivity.Q().k.c(D2, false);
                                }
                                playerActivity.S = null;
                            }
                            num = playerActivity.T;
                            if (num != null || num.intValue() != 0) {
                                D = playerActivity.a0().D(zxe.h);
                                if (D != -1) {
                                    playerActivity.Q().k.c(D, false);
                                }
                            }
                            zzc zzcVar = playerActivity.X().s;
                            p15 p15Var = new p15(new ord(11, playerActivity, player), i);
                            zzcVar.getClass();
                            zzcVar.a.e(playerActivity, p15Var);
                        } else if (Z.equals(Sports.BASEBALL)) {
                            iterable = b.j(zxe.c, zxe.e, zxe.f, zxe.d, zxe.g, zxe.h);
                            xbb b2 = a.b();
                            while (r1.hasNext()) {
                            }
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            playerActivity.a0().x(a.a(b2));
                            zxeVar = playerActivity.S;
                            if (zxeVar != null) {
                            }
                            num = playerActivity.T;
                            if (num != null) {
                            }
                            D = playerActivity.a0().D(zxe.h);
                            if (D != -1) {
                            }
                            zzc zzcVar2 = playerActivity.X().s;
                            p15 p15Var2 = new p15(new ord(11, playerActivity, player), i);
                            zzcVar2.getClass();
                            zzcVar2.a.e(playerActivity, p15Var2);
                        }
                    }
                    iterable = zxe.j;
                    xbb b22 = a.b();
                    while (r1.hasNext()) {
                    }
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    playerActivity.a0().x(a.a(b22));
                    zxeVar = playerActivity.S;
                    if (zxeVar != null) {
                    }
                    num = playerActivity.T;
                    if (num != null) {
                    }
                    D = playerActivity.a0().D(zxe.h);
                    if (D != -1) {
                    }
                    zzc zzcVar22 = playerActivity.X().s;
                    p15 p15Var22 = new p15(new ord(11, playerActivity, player), i);
                    zzcVar22.getClass();
                    zzcVar22.a.e(playerActivity, p15Var22);
                }
                playerActivity.c0();
                Set set2 = wyh.a;
                if (wyh.i(playerActivity.Z())) {
                    PlayerHeadFlags playerHeadFlags2 = (PlayerHeadFlags) playerActivity.X().q.d();
                    if (Intrinsics.c(playerHeadFlags2 != null ? Boolean.valueOf(playerHeadFlags2.getStatistics()) : null, Boolean.TRUE)) {
                        playerActivity.Q().d.a(new xq5(playerActivity, 5));
                    }
                }
                return Unit.a;
            case 25:
                ((PlayerCareerStatisticsFragment) this.receiver).Q(((Number) obj).intValue());
                return Unit.a;
            case 26:
                ((PlayerCareerStatisticsFragment) this.receiver).Q(((Number) obj).intValue());
                return Unit.a;
            case 27:
                q91 q91Var = (q91) obj;
                q91Var.getClass();
                PlayerDetailsFragment playerDetailsFragment = (PlayerDetailsFragment) this.receiver;
                r91 k = playerDetailsFragment.F().k();
                StatisticsSeasonsResponse statisticsSeasonsResponse = playerDetailsFragment.F().o;
                if (k != null && statisticsSeasonsResponse != null) {
                    Iterator<T> it3 = statisticsSeasonsResponse.getUniqueTournamentSeasons().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            UniqueTournamentSeasons uniqueTournamentSeasons = (UniqueTournamentSeasons) obj2;
                            Integer num2 = k.a;
                            if (num2 != null) {
                                if (uniqueTournamentSeasons.getUniqueTournament().getId() == num2.intValue()) {
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    UniqueTournamentSeasons uniqueTournamentSeasons2 = (UniqueTournamentSeasons) obj2;
                    if (uniqueTournamentSeasons2 == null) {
                        uniqueTournamentSeasons2 = (UniqueTournamentSeasons) CollectionsKt.firstOrNull(statisticsSeasonsResponse.getUniqueTournamentSeasons());
                    }
                    UniqueTournament uniqueTournament2 = uniqueTournamentSeasons2 != null ? uniqueTournamentSeasons2.getUniqueTournament() : null;
                    String str3 = k.f;
                    String str4 = k.b;
                    if (uniqueTournament2 != null && str3 != null && str4 != null) {
                        wj1 wj1Var = q91Var.a;
                        if (wj1Var == null) {
                            wj1Var = k.d;
                        }
                        ((ple) playerDetailsFragment.u.getValue()).k(uniqueTournament2, str3, str4, wj1Var != null ? wj1Var.name() : null);
                    }
                }
                ((dsi) playerDetailsFragment.v.getValue()).f(zxe.d);
                return Unit.a;
            case 28:
                int intValue2 = ((Number) obj).intValue();
                roe roeVar = (roe) this.receiver;
                roeVar.getClass();
                xw3.L(un0.z(roeVar), null, null, new anc(roeVar, intValue2, null, 4), 3);
                return Unit.a;
            default:
                wbf wbfVar = (wbf) obj;
                ProfileActivity profileActivity = (ProfileActivity) this.receiver;
                int i7 = ProfileActivity.Q;
                profileActivity.Q().f.setRefreshing(false);
                if (wbfVar != null) {
                    List list = wbfVar.e;
                    VoteStatistics voteStatistics = wbfVar.d;
                    p4b p4bVar = wbfVar.a;
                    EditorsEventsCountResponse editorsEventsCountResponse = wbfVar.b;
                    if (!profileActivity.O) {
                        profileActivity.O = true;
                        profileActivity.Q().f.setEnabled(false);
                        ((LinearLayout) profileActivity.Q().e.e).removeView((CardView) profileActivity.Q().e.n);
                        k3l k3lVar = wbfVar.f;
                        Integer num3 = k3lVar.a;
                        Integer num4 = k3lVar.b;
                        ((CardView) profileActivity.Q().e.r).setVisibility(p4bVar != null || num4 != null || num3 != null ? 0 : 8);
                        if (p4bVar != null) {
                            av1 av1Var = (av1) profileActivity.Q().e.i;
                            ImageView imageView = av1Var.c;
                            imageView.setVisibility(0);
                            av1Var.f.setVisibility(8);
                            av1Var.e.setText(p4bVar.c);
                            String str5 = p4bVar.d;
                            apf a = ajh.a(imageView.getContext());
                            ht9 ht9Var = new ht9(imageView.getContext());
                            ht9Var.c = str5;
                            vt9.f(ht9Var, imageView);
                            vt9.e(ht9Var, R.drawable.weekly_challenge_trophy_tier_1_locked);
                            vt9.a(ht9Var, R.drawable.weekly_challenge_trophy_tier_1_locked);
                            st9.a(ht9Var, true);
                            a.a(ht9Var.a());
                        } else {
                            ((av1) profileActivity.Q().e.i).b.setVisibility(8);
                        }
                        profileActivity.R((av1) profileActivity.Q().e.j, num3, true);
                        profileActivity.R((av1) profileActivity.Q().e.p, num4, false);
                        boolean z = (editorsEventsCountResponse == null || editorsEventsCountResponse.getEditedEvents() == 0 || editorsEventsCountResponse.getEventOpenings() == 0) ? false : true;
                        if (z && editorsEventsCountResponse != null) {
                            ((CardView) profileActivity.Q().e.k).setVisibility(0);
                            ((ProfileEditorSummaryItemView) profileActivity.Q().e.c).setValue(editorsEventsCountResponse.getEditedEvents());
                            ((ProfileEditorSummaryItemView) profileActivity.Q().e.o).setValue(editorsEventsCountResponse.getEventOpenings());
                            profileActivity.Q().e.b.setOnClickListener(new n8f(profileActivity, i));
                        }
                        ((ProfilePredictionStatisticsView) profileActivity.Q().e.q).setVisibility(voteStatistics != null ? 0 : 8);
                        if (voteStatistics != null) {
                            ProfilePredictionStatisticsView profilePredictionStatisticsView = (ProfilePredictionStatisticsView) profileActivity.Q().e.q;
                            profilePredictionStatisticsView.setTitle(R.string.profile_predictions_all_time);
                            ProfilePredictionStatisticsView.a(profilePredictionStatisticsView, voteStatistics, "ALL", null, 8);
                            profilePredictionStatisticsView.setOnViewMoreClickListener(new n8f(profileActivity, 2));
                        }
                        boolean z2 = wbfVar.c;
                        ((CardView) profileActivity.Q().e.h).setVisibility(z2 ? 0 : 8);
                        if (z2) {
                            ((LinearLayout) profileActivity.Q().e.d).setOnClickListener(new n8f(profileActivity, 3));
                        }
                        if (!list.isEmpty()) {
                            r9f r9fVar = new r9f(profileActivity, true);
                            r9fVar.a.d = new pte(r9fVar, 6);
                            r9fVar.F(list);
                            ((CardView) profileActivity.Q().e.l).setVisibility(list.isEmpty() ? 8 : 0);
                            RecyclerView recyclerView = (RecyclerView) profileActivity.Q().e.m;
                            recyclerView.setAdapter(r9fVar);
                            Context context = recyclerView.getContext();
                            context.getClass();
                            z8e.b0(recyclerView, context, false, false, null, 28);
                            profileActivity.Q().e.f.setOnClickListener(new n8f(profileActivity, 4));
                        }
                        if (p4bVar == null && !z && voteStatistics == null && list.isEmpty()) {
                            ((LinearLayout) profileActivity.Q().e.e).addView((ConstraintLayout) profileActivity.P.getValue());
                        }
                        profileActivity.I(profileActivity.Q().b, null);
                    }
                }
                return Unit.a;
        }
    }
}
