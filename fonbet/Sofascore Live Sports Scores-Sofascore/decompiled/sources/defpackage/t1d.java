package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import com.sofascore.results.dialog.RemoveAdsYearlyOfferBottomSheet;
import com.sofascore.results.league.fragment.details.view.PlayerOfTheSeasonInfoBottomSheet;
import com.sofascore.results.notifications.ui.MuteNotificationsBottomSheet;
import com.sofascore.results.notifications.ui.NotificationGroupSettingsBottomSheet;
import com.sofascore.results.pots.highestRated.bottomSheet.POTSHighestRatedPlayersFilterBottomSheet;
import com.sofascore.results.profile.editor.ProfileEditorFragment;
import com.sofascore.results.profile.editor.ProfileEditorTournamentsModal;
import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardFragment;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardInfoModal;
import com.sofascore.results.settings.PreferenceFragment;
import com.sofascore.results.stagesport.fragments.raceFlow.bottomsheet.RaceFlowGraphInfoBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class t1d implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t1d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x03c6, code lost:
    
        if (r7 == defpackage.nf3.a) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05ba, code lost:
    
        if (r4 == defpackage.nf3.a) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0220, code lost:
    
        if (r1 > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        dta dtaVar;
        Object obj4;
        kj2 kj2Var;
        ksa ksaVar;
        Object obj5;
        yda ydaVar;
        int i = 6;
        final int i2 = 1;
        switch (this.a) {
            case 0:
                MuteNotificationsBottomSheet muteNotificationsBottomSheet = (MuteNotificationsBottomSheet) this.b;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                a99 a99Var = nf3.a;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    long longValue = ((Number) muteNotificationsBottomSheet.E.getValue()).longValue();
                    boolean i3 = av8Var.i(muteNotificationsBottomSheet);
                    Object O = av8Var.O();
                    if (i3 || O == a99Var) {
                        O = new mnc(muteNotificationsBottomSheet, 10);
                        av8Var.n0(O);
                    }
                    Function1 function1 = (Function1) O;
                    boolean i4 = av8Var.i(muteNotificationsBottomSheet);
                    Object O2 = av8Var.O();
                    if (i4 || O2 == a99Var) {
                        O2 = new u1d(muteNotificationsBottomSheet, i2);
                        av8Var.n0(O2);
                    }
                    b0a.k(longValue, function1, (Function0) O2, av8Var, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                trg trgVar = (trg) this.b;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    trgVar.getContent().invoke(av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                final NotificationGroupSettingsBottomSheet notificationGroupSettingsBottomSheet = (NotificationGroupSettingsBottomSheet) this.b;
                otk otkVar = notificationGroupSettingsBottomSheet.C;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                a99 a99Var2 = nf3.a;
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    e1d x = rfo.x(((yfd) otkVar.getValue()).f, av8Var3, 0);
                    hof hofVar = ((yfd) otkVar.getValue()).h;
                    boolean i5 = av8Var3.i(notificationGroupSettingsBottomSheet);
                    Object O3 = av8Var3.O();
                    if (i5 || O3 == a99Var2) {
                        final int i6 = false ? 1 : 0;
                        O3 = new Function1() { // from class: pfd
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                gv9 gv9Var;
                                int i7 = i6;
                                NotificationGroupSettingsBottomSheet notificationGroupSettingsBottomSheet2 = notificationGroupSettingsBottomSheet;
                                rq3 rq3Var = null;
                                switch (i7) {
                                    case 0:
                                        rfd rfdVar = (rfd) obj6;
                                        rfdVar.getClass();
                                        if (rfdVar.equals(rfd.a)) {
                                            notificationGroupSettingsBottomSheet2.j();
                                            return Unit.a;
                                        }
                                        zzl.b();
                                        return null;
                                    default:
                                        nfd nfdVar = (nfd) obj6;
                                        nfdVar.getClass();
                                        if (nfdVar.equals(jfd.a)) {
                                            Context requireContext = notificationGroupSettingsBottomSheet2.requireContext();
                                            requireContext.getClass();
                                            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                                            intent.putExtra("android.provider.extra.APP_PACKAGE", "com.sofascore.results");
                                            requireContext.startActivity(intent);
                                        } else {
                                            yfd yfdVar = (yfd) notificationGroupSettingsBottomSheet2.C.getValue();
                                            if (nfdVar.equals(kfd.a)) {
                                                vfd vfdVar = (vfd) yfdVar.l().a();
                                                if (vfdVar != null && (gv9Var = vfdVar.a) != null) {
                                                    xw3.L(un0.z(yfdVar), null, null, new gjb(yfdVar, gv9Var, rq3Var, 19), 3);
                                                }
                                            } else if (nfdVar.equals(lfd.a)) {
                                                yfdVar.n(null, new mnc(yfdVar, 15));
                                            } else if (nfdVar instanceof mfd) {
                                                yfdVar.n(null, new lsb(21, yfdVar, nfdVar));
                                            }
                                        }
                                        return Unit.a;
                                }
                            }
                        };
                        av8Var3.n0(O3);
                    }
                    w1a.c(hofVar, null, (Function1) O3, av8Var3, 0, 14);
                    vnb vnbVar = (vnb) x.getValue();
                    unb unbVar = vnbVar instanceof unb ? (unb) vnbVar : null;
                    if (unbVar == null) {
                        av8Var3.d0(-11874159);
                        av8Var3.s(false);
                    } else {
                        av8Var3.d0(-11874158);
                        vfd vfdVar = (vfd) unbVar.a;
                        String str = (String) notificationGroupSettingsBottomSheet.F.getValue();
                        boolean i7 = av8Var3.i(notificationGroupSettingsBottomSheet);
                        Object O4 = av8Var3.O();
                        if (i7 || O4 == a99Var2) {
                            O4 = new Function1() { // from class: pfd
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    gv9 gv9Var;
                                    int i72 = i2;
                                    NotificationGroupSettingsBottomSheet notificationGroupSettingsBottomSheet2 = notificationGroupSettingsBottomSheet;
                                    rq3 rq3Var = null;
                                    switch (i72) {
                                        case 0:
                                            rfd rfdVar = (rfd) obj6;
                                            rfdVar.getClass();
                                            if (rfdVar.equals(rfd.a)) {
                                                notificationGroupSettingsBottomSheet2.j();
                                                return Unit.a;
                                            }
                                            zzl.b();
                                            return null;
                                        default:
                                            nfd nfdVar = (nfd) obj6;
                                            nfdVar.getClass();
                                            if (nfdVar.equals(jfd.a)) {
                                                Context requireContext = notificationGroupSettingsBottomSheet2.requireContext();
                                                requireContext.getClass();
                                                Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                                                intent.putExtra("android.provider.extra.APP_PACKAGE", "com.sofascore.results");
                                                requireContext.startActivity(intent);
                                            } else {
                                                yfd yfdVar = (yfd) notificationGroupSettingsBottomSheet2.C.getValue();
                                                if (nfdVar.equals(kfd.a)) {
                                                    vfd vfdVar2 = (vfd) yfdVar.l().a();
                                                    if (vfdVar2 != null && (gv9Var = vfdVar2.a) != null) {
                                                        xw3.L(un0.z(yfdVar), null, null, new gjb(yfdVar, gv9Var, rq3Var, 19), 3);
                                                    }
                                                } else if (nfdVar.equals(lfd.a)) {
                                                    yfdVar.n(null, new mnc(yfdVar, 15));
                                                } else if (nfdVar instanceof mfd) {
                                                    yfdVar.n(null, new lsb(21, yfdVar, nfdVar));
                                                }
                                            }
                                            return Unit.a;
                                    }
                                }
                            };
                            av8Var3.n0(O4);
                        }
                        ufd.b(vfdVar, (Function1) O4, str, av8Var3, 0);
                        av8Var3.s(false);
                    }
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                yfa.c((lzd) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                cga.g((uzd) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                ((c0e) this.b).a(aba.K(1), (of3) obj);
                return Unit.a;
            case 6:
                POTSHighestRatedPlayersFilterBottomSheet pOTSHighestRatedPlayersFilterBottomSheet = (POTSHighestRatedPlayersFilterBottomSheet) this.b;
                otk otkVar2 = pOTSHighestRatedPlayersFilterBottomSheet.D;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    vnb vnbVar2 = (vnb) rfo.x(((b1e) otkVar2.getValue()).f, av8Var4, 0).getValue();
                    unb unbVar2 = vnbVar2 instanceof unb ? (unb) vnbVar2 : null;
                    if (unbVar2 == null) {
                        av8Var4.d0(250957767);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(250957768);
                        r0e r0eVar = (r0e) unbVar2.a;
                        b1e b1eVar = (b1e) otkVar2.getValue();
                        boolean i8 = av8Var4.i(b1eVar);
                        Object O5 = av8Var4.O();
                        if (i8 || O5 == nf3.a) {
                            v9b v9bVar = new v9b(1, b1eVar, b1e.class, "onAction", "onAction(Lcom/sofascore/results/pots/highestRated/bottomSheet/model/POTSHighestRatedPlayerFilterAction;)V", 0, 23);
                            av8Var4.n0(v9bVar);
                            O5 = v9bVar;
                        }
                        pOTSHighestRatedPlayersFilterBottomSheet.M(r0eVar, (Function1) ((KFunction) O5), null, av8Var4, 0);
                        av8Var4.s(false);
                    }
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                td4.B((osa) this.b, (of3) obj, aba.K(9));
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                w1a.h((gle) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 9:
                sre sreVar = (sre) this.b;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Double d = sreVar.q;
                    ux7 ux7Var = sreVar.m;
                    int i9 = ux7Var.a;
                    String str2 = ux7Var.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    int i10 = sreVar.n.a;
                    String str4 = sreVar.h;
                    yf8 yf8Var = xth.a;
                    l98.o(i9, str3, null, Integer.valueOf(i10), d, str4, true, xth.l(), av8Var5, 1572864, 4);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 10:
                nte nteVar = (nte) this.b;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    lv1 lv1Var = uxf.m;
                    ng0 ng0Var = new ng0(16.0f, true, new a70(6));
                    utc utcVar = utc.a;
                    l8g a = k8g.a(ng0Var, lv1Var, av8Var6, 54);
                    int hashCode = Long.hashCode(av8Var6.T);
                    aee m = av8Var6.m();
                    xtc C = fqj.C(av8Var6, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, a, hf3.g);
                    waa.K(av8Var6, m, hf3.f);
                    waa.K(av8Var6, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var6, hf3.k);
                    waa.K(av8Var6, C, hf3.d);
                    c5n.c(36.0f, 6.0f, 24960, 10, kpg.x(yid.k(nteVar.m), av8Var6), 0L, av8Var6, null);
                    Integer valueOf = nteVar.k.j == Gender.Female ? Integer.valueOf(R.string.player_of_the_match_female) : null;
                    String v = oea.v(valueOf != null ? valueOf.intValue() : R.string.player_of_the_match, av8Var6);
                    yf8 yf8Var2 = xth.a;
                    udj.c(v, null, lz.D(R.color.n_lv_1, av8Var6), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var6, 0, 0, 131066);
                    av8Var6.s(true);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 11:
                PlayerOfTheSeasonInfoBottomSheet playerOfTheSeasonInfoBottomSheet = (PlayerOfTheSeasonInfoBottomSheet) this.b;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Gender gender = (Gender) playerOfTheSeasonInfoBottomSheet.x.getValue();
                    boolean i11 = av8Var7.i(playerOfTheSeasonInfoBottomSheet);
                    Object O6 = av8Var7.O();
                    if (i11 || O6 == nf3.a) {
                        fl8 fl8Var = new fl8(0, playerOfTheSeasonInfoBottomSheet, PlayerOfTheSeasonInfoBottomSheet.class, "onLearnMoreClick", "onLearnMoreClick()V", 0, 14);
                        av8Var7.n0(fl8Var);
                        O6 = fl8Var;
                    }
                    yaa.c(gender, (Function0) ((KFunction) O6), av8Var7, 0);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 12:
                c56 c56Var = (c56) this.b;
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ux7 ux7Var2 = c56Var.m;
                    int i12 = ux7Var2.a;
                    String str5 = ux7Var2.b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    Integer valueOf2 = Integer.valueOf(c56Var.n.a);
                    Double d2 = c56Var.p;
                    String v2 = oea.v(R.string.statistics_snapshot, av8Var8);
                    yf8 yf8Var3 = xth.a;
                    l98.o(i12, str5, null, valueOf2, d2, v2, true, xth.l(), av8Var8, 1572864, 4);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 13:
                uwe uweVar = (uwe) this.b;
                ((ale) obj).getClass();
                ((uke) obj2).getClass();
                uweVar.b.invoke(uweVar.a);
                return Unit.a;
            case 14:
                PreferenceFragment preferenceFragment = (PreferenceFragment) this.b;
                String str6 = (String) obj;
                String str7 = (String) obj2;
                str6.getClass();
                str7.getClass();
                System.out.println((Object) "");
                Context requireContext = preferenceFragment.requireContext();
                requireContext.getClass();
                nv.K(requireContext, str6, str7);
                return Unit.a;
            case 15:
                ProfileEditorFragment profileEditorFragment = (ProfileEditorFragment) this.b;
                of3 of3Var9 = (of3) obj;
                int intValue9 = ((Integer) obj2).intValue();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    o1j.n((q9f) profileEditorFragment.r.getValue(), null, av8Var9, 0);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                o1j.o((vnb) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 17:
                ProfileEditorTournamentsModal profileEditorTournamentsModal = (ProfileEditorTournamentsModal) this.b;
                of3 of3Var10 = (of3) obj;
                int intValue10 = ((Integer) obj2).intValue();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue10 & 1, (intValue10 & 3) != 2)) {
                    e1d x2 = rfo.x(((q9f) profileEditorTournamentsModal.x.getValue()).f, av8Var10, 0);
                    vnb vnbVar3 = (vnb) x2.getValue();
                    if (vnbVar3 instanceof unb) {
                        av8Var10.d0(1764565503);
                        boolean g = av8Var10.g(x2) | av8Var10.i(profileEditorTournamentsModal);
                        Object O7 = av8Var10.O();
                        if (!g) {
                            obj3 = O7;
                            break;
                        }
                        ord ordVar = new ord(28, x2, profileEditorTournamentsModal);
                        av8Var10.n0(ordVar);
                        obj3 = ordVar;
                        v8a.a(null, null, null, null, null, null, false, null, (Function1) obj3, av8Var10, 0, 511);
                        av8Var10.s(false);
                    } else {
                        if (!(vnbVar3 instanceof snb) && !Intrinsics.c(vnbVar3, tnb.a)) {
                            throw dmi.h(av8Var10, -774364046, false);
                        }
                        av8Var10.d0(-774335819);
                        av8Var10.s(false);
                    }
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 18:
                ProfilePredictionsFragment profilePredictionsFragment = (ProfilePredictionsFragment) this.b;
                int intValue11 = ((Integer) obj).intValue();
                VoteType voteType = (VoteType) obj2;
                voteType.getClass();
                Context requireContext2 = profilePredictionsFragment.requireContext();
                requireContext2.getClass();
                lv lvVar = lv.PREDICTIONS;
                y3f.d.getClass();
                nv.z(requireContext2, intValue11, lvVar, x3f.p(voteType), 1);
                ia0 ia0Var = ia0.q;
                if (mz1.C()) {
                    Context requireContext3 = profilePredictionsFragment.requireContext();
                    requireContext3.getClass();
                    zic.X(requireContext3, new oaf(profilePredictionsFragment, intValue11, voteType, false ? 1 : 0));
                } else {
                    profilePredictionsFragment.E(intValue11, voteType);
                }
                return Unit.a;
            case 19:
                ProfileTopLeaderboardFragment profileTopLeaderboardFragment = (ProfileTopLeaderboardFragment) this.b;
                of3 of3Var11 = (of3) obj;
                int intValue12 = ((Integer) obj2).intValue();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue12 & 1, (intValue12 & 3) != 2)) {
                    m6k.n((sbf) profileTopLeaderboardFragment.r.getValue(), (gta) profileTopLeaderboardFragment.s.getValue(), null, av8Var11, 0);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 20:
                ProfileTopLeaderboardInfoModal profileTopLeaderboardInfoModal = (ProfileTopLeaderboardInfoModal) this.b;
                of3 of3Var12 = (of3) obj;
                int intValue13 = ((Integer) obj2).intValue();
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(intValue13 & 1, (intValue13 & 3) != 2)) {
                    gta gtaVar = (gta) profileTopLeaderboardInfoModal.y.getValue();
                    gtaVar.getClass();
                    int ordinal = gtaVar.ordinal();
                    if (ordinal == 0) {
                        dtaVar = new dta(a.c(new a3a(null, Integer.valueOf(R.string.top_predictors_info_bubble), null, null)));
                    } else if (ordinal == 1) {
                        dtaVar = new dta(b.j(new a3a(Integer.valueOf(R.string.contributors_leaderboard_get_to_top), Integer.valueOf(R.string.contributors_leaderboard_top_text_one), Integer.valueOf(R.string.contributors_leaderboard_top_text_two), null), new a3a(Integer.valueOf(R.string.contributors_leaderboard_pts_calculation), Integer.valueOf(R.string.contributors_leaderboard_pts_calculation_text), null, null), new a3a(Integer.valueOf(R.string.contributors_leaderboard_about_rep_score), Integer.valueOf(R.string.contributors_leaderboard_about_rep_score_text), null, null), new a3a(Integer.valueOf(R.string.contributors_leaderboard_badge), Integer.valueOf(R.string.contributors_leaderboard_badge_text), null, null)));
                    } else {
                        if (ordinal != 2) {
                            zzl.b();
                            return null;
                        }
                        dtaVar = new dta(a.c(new a3a(null, Integer.valueOf(R.string.top_editors_leaderboard_info_text), null, null)));
                    }
                    qea.d(dtaVar, av8Var12, 0);
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 21:
                ghf ghfVar = (ghf) this.b;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ghfVar.e.i(floatValue);
                return Unit.a;
            case 22:
                RaceFlowGraphInfoBottomSheet raceFlowGraphInfoBottomSheet = (RaceFlowGraphInfoBottomSheet) this.b;
                of3 of3Var13 = (of3) obj;
                int intValue14 = ((Integer) obj2).intValue();
                av8 av8Var13 = (av8) of3Var13;
                if (av8Var13.T(intValue14 & 1, (intValue14 & 3) != 2)) {
                    qug o0 = hkg.o0(av8Var13);
                    c51 w = raceFlowGraphInfoBottomSheet.w();
                    Integer valueOf3 = Integer.valueOf(o0.a.h());
                    boolean g2 = av8Var13.g(w) | av8Var13.g(o0);
                    Object O8 = av8Var13.O();
                    if (!g2) {
                        obj4 = O8;
                        break;
                    }
                    iv6 iv6Var = new iv6(w, o0, null, i);
                    av8Var13.n0(iv6Var);
                    obj4 = iv6Var;
                    hz8.o(av8Var13, valueOf3, (Function2) obj4);
                    haa.f(yqo.H(-1558825071, av8Var13, new gme(19, o0, raceFlowGraphInfoBottomSheet)), av8Var13, 6);
                } else {
                    av8Var13.W();
                }
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                xpf.b((dqf) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 24:
                kqf kqfVar = (kqf) this.b;
                Set set = (Set) obj;
                synchronized (kqfVar.d) {
                    try {
                        if (((iqf) kqfVar.v.getValue()).compareTo(iqf.e) >= 0) {
                            y0d y0dVar = kqfVar.i;
                            if (set instanceof srg) {
                                y0d y0dVar2 = ((srg) set).a;
                                Object[] objArr = y0dVar2.b;
                                long[] jArr = y0dVar2.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j = jArr[i13];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                if ((255 & j) < 128) {
                                                    Object obj6 = objArr[(i13 << 3) + i15];
                                                    if (!(obj6 instanceof rdi) || ((rdi) obj6).f(1)) {
                                                        y0dVar.a(obj6);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i14 != 8) {
                                            }
                                        }
                                        if (i13 != length) {
                                            i13++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj7 : set) {
                                    if (!(obj7 instanceof rdi) || ((rdi) obj7).f(1)) {
                                        y0dVar.a(obj7);
                                    }
                                }
                            }
                            kj2Var = kqfVar.C();
                        } else {
                            kj2Var = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (kj2Var != null) {
                    p2g p2gVar = w2g.b;
                    ((lj2) kj2Var).resumeWith(Unit.a);
                }
                return Unit.a;
            case 25:
                RemoveAdsYearlyOfferBottomSheet removeAdsYearlyOfferBottomSheet = (RemoveAdsYearlyOfferBottomSheet) this.b;
                of3 of3Var14 = (of3) obj;
                int intValue15 = ((Integer) obj2).intValue();
                a99 a99Var3 = nf3.a;
                av8 av8Var14 = (av8) of3Var14;
                if (av8Var14.T(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Context context = (Context) av8Var14.k(nz.b);
                    long j2 = removeAdsYearlyOfferBottomSheet.y;
                    boolean i16 = av8Var14.i(removeAdsYearlyOfferBottomSheet) | av8Var14.i(context);
                    Object O9 = av8Var14.O();
                    if (i16 || O9 == a99Var3) {
                        O9 = new zbe(24, removeAdsYearlyOfferBottomSheet, context);
                        av8Var14.n0(O9);
                    }
                    Function0 function0 = (Function0) O9;
                    boolean i17 = av8Var14.i(removeAdsYearlyOfferBottomSheet);
                    Object O10 = av8Var14.O();
                    if (i17 || O10 == a99Var3) {
                        O10 = new ate(removeAdsYearlyOfferBottomSheet, 26);
                        av8Var14.n0(O10);
                    }
                    r4a.i(null, j2, function0, (Function0) O10, av8Var14, 0);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
            case 26:
                o85 o85Var = (o85) this.b;
                mze mzeVar = (mze) obj;
                mzeVar.getClass();
                mzeVar.a();
                long j3 = ((dnd) obj2).a;
                ksa ksaVar2 = o85Var.a;
                e1d e1dVar = o85Var.e;
                e1d e1dVar2 = o85Var.d;
                xnh xnhVar = o85Var.f;
                xnhVar.i(Float.intBitsToFloat((int) (j3 & 4294967295L)) + xnhVar.h());
                e1d e1dVar3 = o85Var.c;
                Integer num = (Integer) ((eoh) e1dVar3).getValue();
                if (num != null) {
                    int intValue16 = num.intValue();
                    dsa dsaVar = (dsa) ((eoh) e1dVar2).getValue();
                    if (dsaVar != null) {
                        float h = xnhVar.h() + dsaVar.o;
                        float h2 = xnhVar.h() + dsaVar.o + dsaVar.p;
                        float e = wt3.e(h2, h, 2.0f, h);
                        Iterator it = ksaVar2.j().k.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj5 = it.next();
                                dsa dsaVar2 = (dsa) obj5;
                                int i18 = dsaVar2.o;
                                int i19 = dsaVar2.p + i18;
                                ksaVar = ksaVar2;
                                int i20 = (int) e;
                                if (i18 > i20 || i20 > i19 || dsaVar.a == dsaVar2.a || !(dsaVar2.l instanceof v95)) {
                                    ksaVar2 = ksaVar;
                                }
                            } else {
                                ksaVar = ksaVar2;
                                obj5 = null;
                            }
                        }
                        dsa dsaVar3 = (dsa) obj5;
                        if (dsaVar3 != null) {
                            Object obj8 = dsaVar3.l;
                            obj8.getClass();
                            int i21 = ((v95) obj8).a;
                            Integer num2 = (Integer) ((eoh) e1dVar).getValue();
                            if (num2 == null) {
                                num2 = Integer.MAX_VALUE;
                            }
                            if (i21 != num2.intValue()) {
                                o85Var.b.invoke(num, Integer.valueOf(i21));
                                ((eoh) e1dVar3).setValue(Integer.valueOf(i21));
                                xnhVar.i(xnhVar.h() + (dsaVar.o - dsaVar3.o));
                                ((eoh) e1dVar2).setValue(dsaVar3);
                            } else {
                                ((eoh) e1dVar2).setValue(null);
                                ((eoh) e1dVar3).setValue(null);
                                xnhVar.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                ((eoh) e1dVar).setValue(null);
                            }
                        } else {
                            float f = h - ksaVar.j().l;
                            float f2 = h2 - ksaVar.j().m;
                            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                break;
                            } else {
                                if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f = f2;
                                    if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && intValue16 != 0 && intValue16 != 2) {
                                        o85Var.g.d(Float.valueOf(f));
                                    }
                                }
                                f = 0.0f;
                                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    o85Var.g.d(Float.valueOf(f));
                                }
                            }
                        }
                    }
                }
                return Unit.a;
            case 27:
                e49 e49Var = (e49) this.b;
                iy7 iy7Var = e49Var.t;
                of3 of3Var15 = (of3) obj;
                int intValue17 = ((Integer) obj2).intValue();
                av8 av8Var15 = (av8) of3Var15;
                if (av8Var15.T(intValue17 & 1, (intValue17 & 3) != 2)) {
                    xtc d0 = l98.d0(utc.a, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    String str8 = iy7Var.b;
                    String str9 = str8 == null ? "" : str8;
                    Regex regex = d7g.a;
                    String b = d7g.b((Context) av8Var15.k(nz.b), e49Var.u, false, e49Var.p);
                    Integer num3 = iy7Var.a;
                    gvd.k(str9, num3 != null ? num3.intValue() : 0, e49Var.s, false, d0, b, null, av8Var15, 27648, 64);
                } else {
                    av8Var15.W();
                }
                return Unit.a;
            case 28:
                qcg qcgVar = (qcg) this.b;
                qbg qbgVar = (qbg) obj;
                zjg zjgVar = (zjg) obj2;
                qbgVar.getClass();
                zjgVar.getClass();
                return new pbg(qbgVar, qcgVar, zjgVar);
            default:
                kog kogVar = (kog) this.b;
                int intValue18 = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                f key = element.getKey();
                CoroutineContext.Element element2 = kogVar.s.get(key);
                if (key != uic.g) {
                    if (element != element2) {
                        intValue18 = Integer.MIN_VALUE;
                    }
                    intValue18++;
                } else {
                    yda ydaVar2 = (yda) element2;
                    yda ydaVar3 = (yda) element;
                    while (ydaVar3 != null) {
                        if (ydaVar3 != ydaVar2 && (ydaVar3 instanceof btg)) {
                            jt2 jt2Var = (jt2) rh0.a.getObjectVolatile((btg) ydaVar3, kea.a);
                            ydaVar3 = jt2Var != null ? jt2Var.getParent() : null;
                        } else {
                            ydaVar = ydaVar3;
                            if (ydaVar == ydaVar2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + ydaVar + ", expected child of " + ydaVar2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    ydaVar = null;
                    if (ydaVar == ydaVar2) {
                    }
                }
                return Integer.valueOf(intValue18);
        }
    }

    public /* synthetic */ t1d(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
