package defpackage;

import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyCreateLeagueBottomSheet;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyJoinLeagueBottomSheet;
import com.sofascore.results.fantasy.competition.managerprofile.FantasyManagerProfileActivity;
import com.sofascore.results.fantasy.competition.team.bottomsheet.FantasyOptimiseSquadBottomSheet;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.highlights.gameweek.FantasyGameweekHighlightsActivity;
import com.sofascore.results.fantasy.league.settings.bottomsheet.edit.FantasyEditLeagueBottomSheet;
import com.sofascore.results.fantasy.league.settings.dialog.FantasyLeagueTeamsFullScreenDialog;
import com.sofascore.results.fantasy.teammanagement.transfers.selectreplacement.FantasyTransfersSelectReplacementDialogFragment;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.walkthrough.createteam.selectreplacement.FantasyWalkthroughSelectReplacementDialogFragment;
import com.sofascore.results.fantasy.weekly.FantasyEliteFaceoffRevealDialog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class av6 extends ot8 implements Function0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zrh zrhVar;
        Object value;
        vn7 vn7Var;
        ArrayList arrayList;
        c40 c40Var;
        int i = 14;
        int i2 = 0;
        rq3 rq3Var = null;
        switch (this.b) {
            case 0:
                ((cv6) this.receiver).k();
                return Unit.a;
            case 1:
                ((FantasyCreateLeagueBottomSheet) this.receiver).j();
                return Unit.a;
            case 2:
                ((FantasyEditLeagueBottomSheet) this.receiver).j();
                return Unit.a;
            case 3:
                ((FantasyEliteFaceoffRevealDialog) this.receiver).k(false, false);
                return Unit.a;
            case 4:
                ay6 ay6Var = (ay6) this.receiver;
                ay6Var.getClass();
                xw3.L(un0.z(ay6Var), null, null, new q3(ay6Var, rq3Var, 28), 3);
                return Unit.a;
            case 5:
                ((FantasyFootballPlayerBottomSheet) this.receiver).j();
                return Unit.a;
            case 6:
                ((FantasyGameweekHighlightsActivity) this.receiver).finish();
                return Unit.a;
            case 7:
                h27 h27Var = (h27) this.receiver;
                ((eoh) h27Var.f).setValue(f27.a((f27) ((eoh) h27Var.f).getValue(), true, null, 14));
                xw3.L(un0.z(h27Var), null, null, new rh4(h27Var, rq3Var, 27), 3);
                return Unit.a;
            case 8:
                ((FantasyJoinLeagueBottomSheet) this.receiver).j();
                return Unit.a;
            case 9:
                d47 d47Var = (d47) this.receiver;
                d47Var.getClass();
                xw3.L(un0.z(d47Var), null, null, new hs6(d47Var, rq3Var, 13), 3);
                return Unit.a;
            case 10:
                r57 r57Var = (r57) this.receiver;
                r57Var.getClass();
                xw3.L(un0.z(r57Var), null, null, new hs6(r57Var, rq3Var, i), 3);
                return Unit.a;
            case 11:
                ((FantasyLeagueTeamsFullScreenDialog) this.receiver).k(false, false);
                return Unit.a;
            case 12:
                FantasyManagerProfileActivity fantasyManagerProfileActivity = (FantasyManagerProfileActivity) this.receiver;
                int i3 = FantasyManagerProfileActivity.N;
                pn3 pn3Var = (pn3) ((g9a) fantasyManagerProfileActivity.M.getValue()).h.d();
                if (pn3Var == null || (zrhVar = (zrh) pn3Var.a()) == null) {
                    fantasyManagerProfileActivity.R().n(null, new yt6(17));
                } else {
                    WeakReference weakReference = new WeakReference(fantasyManagerProfileActivity);
                    g6b lifecycle = fantasyManagerProfileActivity.getLifecycle();
                    if (lifecycle.b().compareTo(e6b.e) >= 0) {
                        ((g9a) fantasyManagerProfileActivity.M.getValue()).n(zrhVar, new e77(fantasyManagerProfileActivity, i2));
                        FantasyManagerProfileActivity fantasyManagerProfileActivity2 = (FantasyManagerProfileActivity) weakReference.get();
                        if (fantasyManagerProfileActivity2 != null) {
                            zrhVar.f(fantasyManagerProfileActivity2);
                        }
                    } else {
                        lifecycle.a(new ot6(lifecycle, fantasyManagerProfileActivity, zrhVar, weakReference, 1));
                    }
                }
                return Unit.a;
            case 13:
                ((wb7) this.receiver).k();
                return Unit.a;
            case 14:
                ((wb7) this.receiver).k();
                return Unit.a;
            case 15:
                ((wb7) this.receiver).l();
                return Unit.a;
            case 16:
                ((wb7) this.receiver).l();
                return Unit.a;
            case 17:
                ((FantasyOptimiseSquadBottomSheet) this.receiver).j();
                return Unit.a;
            case 18:
                ((ds8) this.receiver).show();
                return Unit.a;
            case 19:
                ((ds8) this.receiver).dismiss();
                return Unit.a;
            case 20:
                ((gk7) this.receiver).k();
                return Unit.a;
            case 21:
                ((upd) this.receiver).c();
                return Unit.a;
            case 22:
                ((ao7) this.receiver).t();
                return Unit.a;
            case 23:
                ao7 ao7Var = (ao7) this.receiver;
                ao7Var.t = null;
                fdi fdiVar = ao7Var.n;
                do {
                    value = fdiVar.getValue();
                    vn7Var = (vn7) value;
                    gv9<FantasyRoundPlayerUiModel> gv9Var = vn7Var.b;
                    arrayList = new ArrayList(k13.r(gv9Var, 10));
                    for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel : gv9Var) {
                        yy6 yy6Var = fantasyRoundPlayerUiModel.c;
                        int i4 = yy6Var == null ? -1 : zn7.b[yy6Var.ordinal()];
                        arrayList.add((i4 == 1 || i4 == 2) ? FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel, null, 0, false, false, false, null, null, 536870895) : i4 != 3 ? FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel, null, 0, false, false, false, null, null, 536870891) : FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel, yy6.REMOVED, 0, false, false, false, null, null, 536870891));
                    }
                } while (!fdiVar.k(value, vn7.a(vn7Var, null, l6g.W(arrayList), 0.0d, 0, null, null, false, false, false, false, 0, 0, null, null, 16253)));
                ao7Var.o();
                return Unit.a;
            case 24:
                ((FantasyTransfersSelectReplacementDialogFragment) this.receiver).k(false, false);
                return Unit.a;
            case 25:
                ((ds8) this.receiver).show();
                return Unit.a;
            case 26:
                ((ds8) this.receiver).dismiss();
                return Unit.a;
            case 27:
                ((FantasyWalkthroughSelectReplacementDialogFragment) this.receiver).k(false, false);
                return Unit.a;
            case 28:
                ud8 ud8Var = (ud8) this.receiver;
                y0d y0dVar = ud8Var.c;
                y0d y0dVar2 = ud8Var.d;
                yd8 yd8Var = ud8Var.a;
                ne8 g = yd8Var.g();
                if (g == null) {
                    Object[] objArr = y0dVar2.b;
                    long[] jArr = y0dVar2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j & 255) < 128) {
                                        ((nd8) objArr[(i5 << 3) + i7]).J(ie8.d);
                                    }
                                    j >>= 8;
                                }
                                if (i6 != 8) {
                                }
                            }
                            if (i5 != length) {
                                i5++;
                            }
                        }
                    }
                } else if (g.n) {
                    if (y0dVar.c(g)) {
                        g.q1();
                    }
                    ie8 p1 = g.p1();
                    if (!g.a.n) {
                        r3a.b("visitAncestors called on an unattached node");
                    }
                    wtc wtcVar = g.a;
                    wma c0 = c6o.c0(g);
                    int i8 = 0;
                    while (c0 != null) {
                        if ((((wtc) c0.F.g).d & 5120) != 0) {
                            while (wtcVar != null) {
                                int i9 = wtcVar.c;
                                if ((i9 & 5120) != 0) {
                                    if ((i9 & 1024) != 0) {
                                        i8++;
                                    }
                                    if ((wtcVar instanceof nd8) && y0dVar2.c(wtcVar)) {
                                        if (i8 <= 1) {
                                            ((nd8) wtcVar).J(p1);
                                        } else {
                                            ((nd8) wtcVar).J(ie8.b);
                                        }
                                        y0dVar2.l(wtcVar);
                                    }
                                }
                                wtcVar = wtcVar.e;
                            }
                        }
                        c0 = c0.v();
                        wtcVar = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
                    }
                    Object[] objArr2 = y0dVar2.b;
                    long[] jArr2 = y0dVar2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j2 = jArr2[i10];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j2 & 255) < 128) {
                                        ((nd8) objArr2[(i10 << 3) + i12]).J(ie8.d);
                                    }
                                    j2 >>= 8;
                                }
                                if (i11 != 8) {
                                }
                            }
                            if (i10 != length2) {
                                i10++;
                            }
                        }
                    }
                }
                if (yd8Var.g() == null || yd8Var.c.p1() == ie8.d) {
                    yd8Var.d();
                }
                y0dVar.b();
                y0dVar2.b();
                ud8Var.e = false;
                return Unit.a;
            default:
                return Boolean.valueOf(ne8.s1(((se8) this.receiver).v));
        }
    }
}
