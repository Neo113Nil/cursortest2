package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.u;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPlaceholder;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s26 extends ot8 implements Function1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s26(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [fdi] */
    /* JADX WARN: Type inference failed for: r1v18, types: [fdi] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r5v12, types: [oz6] */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPlaceholder] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPlaceholder] */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v7, types: [fdi] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        ha7 ha7Var;
        Object value2;
        ha7 ha7Var2;
        Object value3;
        ha7 ha7Var3;
        Object value4;
        vn7 vn7Var;
        ArrayList arrayList;
        FantasyRoundPlayerUiModel b;
        Collection collection;
        y4b y4bVar;
        y4b y4bVar2;
        ?? r3;
        Category category;
        int i = 23;
        final int i2 = 2;
        ?? r6 = 1;
        ?? r8 = 0;
        ?? r82 = 0;
        ?? r83 = 0;
        ?? r84 = 0;
        switch (this.b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                EventMatchesFragment eventMatchesFragment = (EventMatchesFragment) this.receiver;
                eventMatchesFragment.getClass();
                int hashCode = str.hashCode();
                if (hashCode != -1822412652) {
                    if (hashCode != 70814) {
                        if (hashCode == 67887760 && str.equals("First")) {
                            eventMatchesFragment.w = lh2.b;
                            eventMatchesFragment.I();
                        }
                    } else if (str.equals("H2H")) {
                        eventMatchesFragment.w = lh2.a;
                        eventMatchesFragment.I();
                    }
                } else if (str.equals("Second")) {
                    eventMatchesFragment.w = lh2.c;
                    eventMatchesFragment.I();
                }
                return Unit.a;
            case 1:
                rrc rrcVar = (rrc) obj;
                rrcVar.getClass();
                jnc jncVar = (jnc) this.receiver;
                jncVar.g = rrcVar;
                Iterator it = jncVar.b().iterator();
                while (it.hasNext()) {
                    ((lrc) it.next()).setTextDisplayMode(rrcVar);
                }
                return Unit.a;
            case 2:
                e66 e66Var = (e66) obj;
                e66Var.getClass();
                l66 l66Var = (l66) this.receiver;
                l66Var.getClass();
                if (e66Var.equals(e66.a)) {
                    ynb.m(l66Var, new ej(l66Var, null, 4));
                    return Unit.a;
                }
                zzl.b();
                return null;
            case 3:
                ((qr6) this.receiver).k((fo1) obj);
                return Unit.a;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                n27 n27Var = (n27) this.receiver;
                n27Var.getClass();
                xw3.L(un0.z(n27Var), null, null, new hs6((d50) n27Var, str2, (rq3) (r8 == true ? 1 : 0), 11), 3);
                return Unit.a;
            case 5:
                ((m47) this.receiver).k((fo1) obj);
                return Unit.a;
            case 6:
                FantasyLeagueGameType fantasyLeagueGameType = (FantasyLeagueGameType) obj;
                fantasyLeagueGameType.getClass();
                ia7 ia7Var = (ia7) this.receiver;
                ia7Var.getClass();
                ?? r1 = ia7Var.g;
                do {
                    value = r1.getValue();
                    ha7Var = (ha7) value;
                    aa7 aa7Var = ha7Var.a;
                    if (aa7Var instanceof y97) {
                        ha7Var = ha7.a(ha7Var, y97.a((y97) aa7Var, null, null, fantasyLeagueGameType, false, false, 59), false, 2);
                    }
                } while (!r1.k(value, ha7Var));
                return Unit.a;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                ia7 ia7Var2 = (ia7) this.receiver;
                ia7Var2.getClass();
                ?? r12 = ia7Var2.g;
                do {
                    value2 = r12.getValue();
                    ha7Var2 = (ha7) value2;
                    aa7 aa7Var2 = ha7Var2.a;
                    if (aa7Var2 instanceof z97) {
                        ha7Var2 = ha7.a(ha7Var2, z97.a((z97) aa7Var2, str3, false, false, !StringsKt.R(str3) && str3.length() == 5, 4), false, 2);
                    }
                } while (!r12.k(value2, ha7Var2));
                return Unit.a;
            case 8:
                String str4 = (String) obj;
                str4.getClass();
                ia7 ia7Var3 = (ia7) this.receiver;
                ia7Var3.getClass();
                ?? r85 = ia7Var3.g;
                do {
                    value3 = r85.getValue();
                    ha7Var3 = (ha7) value3;
                    aa7 aa7Var3 = ha7Var3.a;
                    if (aa7Var3 instanceof z97) {
                        ha7Var3 = ha7.a(ha7Var3, z97.a((z97) aa7Var3, null, false, true, false, 11), false, 2);
                    }
                } while (!r85.k(value3, ha7Var3));
                xw3.L(un0.z(ia7Var3), null, null, new hs6((d50) ia7Var3, str4, (rq3) (r82 == true ? 1 : 0), 17), 3);
                return Unit.a;
            case 9:
                u uVar = (u) obj;
                uVar.getClass();
                ((eca) this.receiver).p(uVar);
                return Unit.a;
            case 10:
                u uVar2 = (u) obj;
                uVar2.getClass();
                ((eca) this.receiver).p(uVar2);
                return Unit.a;
            case 11:
                cm7 cm7Var = (cm7) obj;
                cm7Var.getClass();
                im7 im7Var = (im7) this.receiver;
                im7Var.getClass();
                ((eoh) im7Var.g).setValue(nm7.a(im7Var.k(), null, null, cm7Var, null, 27));
                return Unit.a;
            case 12:
                im7 im7Var2 = (im7) this.receiver;
                ((eoh) im7Var2.g).setValue(nm7.a(im7Var2.k(), null, null, null, (rz6) obj, 23));
                return Unit.a;
            case 13:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel.getClass();
                ao7 ao7Var = (ao7) this.receiver;
                ao7Var.getClass();
                ao7Var.t = fantasyRoundPlayerUiModel;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = ao7Var.s;
                if (fantasyRoundPlayerUiModel2 != null) {
                    ao7Var.w(fantasyRoundPlayerUiModel2);
                } else {
                    fdi fdiVar = ao7Var.n;
                    do {
                        value4 = fdiVar.getValue();
                        vn7Var = (vn7) value4;
                        gv9<FantasyRoundPlayerUiModel> gv9Var = vn7Var.b;
                        arrayList = new ArrayList(k13.r(gv9Var, 10));
                        for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 : gv9Var) {
                            if (fantasyRoundPlayerUiModel3.b == fantasyRoundPlayerUiModel.b) {
                                yy6 yy6Var = fantasyRoundPlayerUiModel3.c;
                                int i3 = yy6Var == null ? -1 : zn7.b[yy6Var.ordinal()];
                                b = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel3, i3 != 1 ? i3 != 2 ? yy6.AVAILABLE : yy6.TRANSFERRING_IN : yy6.AVAILABLE_REMOVED, 0, false, false, false, null, null, 536870907);
                            } else {
                                b = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel3, null, 0, true, false, false, null, null, 536870895);
                            }
                            arrayList.add(b);
                        }
                    } while (!fdiVar.k(value4, vn7.a(vn7Var, null, l6g.W(arrayList), 0.0d, 0, null, null, false, true, false, false, 0, 0, null, null, 15997)));
                }
                return Unit.a;
            case 14:
                vo7 vo7Var = (vo7) this.receiver;
                vo7Var.getClass();
                xw3.L(un0.z(vo7Var), null, null, new uo7((ho7) obj, vo7Var, null), 3);
                return Unit.a;
            case 15:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel4.getClass();
                vp7 vp7Var = (vp7) this.receiver;
                vp7Var.getClass();
                vp7Var.p = fantasyRoundPlayerUiModel4;
                oz6 oz6Var = vp7Var.o;
                if (oz6Var != null) {
                    vp7Var.l(oz6Var);
                } else {
                    qp7 k = vp7Var.k();
                    gv9<??> gv9Var2 = vp7Var.k().d;
                    ArrayList arrayList2 = new ArrayList(k13.r(gv9Var2, 10));
                    for (?? r5 : gv9Var2) {
                        if (r5.getA() == fantasyRoundPlayerUiModel4.b) {
                            if (r5 instanceof FantasyRoundPlayerUiModel) {
                                r5 = FantasyRoundPlayerUiModel.b((FantasyRoundPlayerUiModel) r5, yy6.AVAILABLE, 0, false, false, false, null, null, 536870907);
                            } else if (r5 instanceof FantasyFootballPlayerPlaceholder) {
                                r5 = FantasyFootballPlayerPlaceholder.b((FantasyFootballPlayerPlaceholder) r5, yy6.AVAILABLE, false, 29);
                            }
                        } else if (r5 instanceof FantasyRoundPlayerUiModel) {
                            r5 = FantasyRoundPlayerUiModel.b((FantasyRoundPlayerUiModel) r5, null, 0, true, false, false, null, null, 536870895);
                        } else if (r5 instanceof FantasyFootballPlayerPlaceholder) {
                            r5 = FantasyFootballPlayerPlaceholder.b((FantasyFootballPlayerPlaceholder) r5, null, true, 23);
                        }
                        arrayList2.add(r5);
                    }
                    vp7Var.m(qp7.a(k, l6g.W(arrayList2), 0, false, true, null, null, 439));
                }
                return Unit.a;
            case 16:
                int intValue = ((Number) obj).intValue();
                ((rei) this.receiver).getClass();
                return intValue + "'";
            case 17:
                return Boolean.valueOf(((Number) obj).intValue() == b.i(((ka9) this.receiver).i));
            case 18:
                return Boolean.valueOf(((Number) obj).intValue() == b.i(((ka9) this.receiver).i));
            case 19:
                fz9 fz9Var = (fz9) obj;
                fz9Var.getClass();
                return ((yy9) this.receiver).H(fz9Var);
            case 20:
                Set set = (Set) obj;
                set.getClass();
                taa taaVar = (taa) this.receiver;
                ReentrantLock reentrantLock = taaVar.e;
                reentrantLock.lock();
                try {
                    List<vkd> S0 = CollectionsKt.S0(taaVar.d.values());
                    reentrantLock.unlock();
                    for (vkd vkdVar : S0) {
                        vkdVar.getClass();
                        int[] iArr = vkdVar.b;
                        int length = iArr.length;
                        if (length == 0) {
                            collection = rm5.a;
                        } else if (length != 1) {
                            c9h c9hVar = new c9h();
                            int length2 = iArr.length;
                            int i4 = 0;
                            int i5 = 0;
                            while (i4 < length2) {
                                int i6 = i5 + 1;
                                if (set.contains(Integer.valueOf(iArr[i4]))) {
                                    c9hVar.add(vkdVar.c[i5]);
                                }
                                i4++;
                                i5 = i6;
                            }
                            collection = w9h.a(c9hVar);
                        } else {
                            collection = set.contains(Integer.valueOf(iArr[0])) ? vkdVar.d : rm5.a;
                        }
                        if (!collection.isEmpty()) {
                            wj9 wj9Var = vkdVar.a;
                            wj9Var.getClass();
                            collection.getClass();
                            rqa rqaVar = (rqa) wj9Var.c;
                            if (!((AtomicBoolean) rqaVar.f).get()) {
                                try {
                                    sm9 sm9Var = (sm9) rqaVar.g;
                                    if (sm9Var != null) {
                                        sm9Var.R1(rqaVar.a, (String[]) collection.toArray(new String[0]));
                                    }
                                } catch (RemoteException unused) {
                                }
                            }
                        }
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 21:
                ((cea) this.receiver).m((Throwable) obj);
                return Unit.a;
            case 22:
                ava avaVar = (ava) obj;
                avaVar.getClass();
                LeagueActivity leagueActivity = (LeagueActivity) this.receiver;
                a99 a99Var = LeagueActivity.h0;
                v38 w = leagueActivity.w();
                String str5 = avaVar.a;
                str5.getClass();
                String replace = str5.replace('-', '_');
                replace.getClass();
                w.b("tournament_".concat(replace));
                leagueActivity.w().b("tournament_" + leagueActivity.T());
                leagueActivity.S().i.q();
                new ita(leagueActivity, r6 ? 1 : 0);
                ViewPager2 viewPager2 = leagueActivity.S().l;
                z4b U = leagueActivity.U();
                U.u = str5;
                U.t = Integer.valueOf(leagueActivity.T());
                Tournament n = leagueActivity.R().n();
                U.v = (n == null || (category = n.getCategory()) == null) ? null : category.getSlug();
                Season l = leagueActivity.R().l();
                U.w = l != null ? l.getName() : null;
                viewPager2.setAdapter(U);
                kp5 kp5Var = y4b.m;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : kp5Var) {
                    if (((Boolean) ((y4b) obj2).b.invoke(avaVar)).booleanValue()) {
                        arrayList3.add(obj2);
                    }
                }
                leagueActivity.U().x(arrayList3);
                int i7 = leagueActivity.X;
                if (!leagueActivity.W) {
                    Bundle extras = leagueActivity.getIntent().getExtras();
                    if (extras == null || (y4bVar2 = (y4b) gz8.M(extras, "initialTab", y4b.class)) == null) {
                        y4bVar2 = (str5.equals(Sports.BASKETBALL) || str5.equals(Sports.FOOTBALL)) ? y4b.c : y4b.d;
                    }
                    int D = leagueActivity.U().D(y4bVar2);
                    Integer valueOf = Integer.valueOf(D);
                    if (D < 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        i7 = valueOf.intValue();
                        Unit unit = Unit.a;
                        r3 = false;
                    } else {
                        r3 = true;
                    }
                    leagueActivity.W = true;
                    r6 = r3;
                }
                if (r6 != 0 && (y4bVar = leagueActivity.Z) != null) {
                    int D2 = leagueActivity.U().D(y4bVar);
                    Integer valueOf2 = D2 >= 0 ? Integer.valueOf(D2) : null;
                    if (valueOf2 != null) {
                        i7 = valueOf2.intValue();
                    }
                }
                leagueActivity.S().l.c(i7, false);
                leagueActivity.W();
                if (leagueActivity.T() > 0) {
                    leagueActivity.S().d.a(new xq5(leagueActivity, i2));
                }
                return Unit.a;
            case 23:
                cua cuaVar = (cua) obj;
                cuaVar.getClass();
                nua nuaVar = (nua) this.receiver;
                nuaVar.getClass();
                if (cuaVar.equals(aua.a)) {
                    g9i g9iVar = nuaVar.o;
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    ynb.m(nuaVar, new r3(nuaVar, r84 == true ? 1 : 0, 13));
                } else {
                    if (!(cuaVar instanceof bua)) {
                        zzl.b();
                        return null;
                    }
                    nuaVar.n(null, new ida(cuaVar, 12));
                    g9i g9iVar2 = nuaVar.o;
                    if (g9iVar2 != null) {
                        g9iVar2.e(null);
                    }
                    nuaVar.o = xw3.L(un0.z(nuaVar), null, null, new yp7(nuaVar, cuaVar, (rq3) (r83 == true ? 1 : 0), i), 3);
                }
                return Unit.a;
            case 24:
                rxa rxaVar = (rxa) obj;
                rxaVar.getClass();
                kva kvaVar = (kva) this.receiver;
                kvaVar.getClass();
                sxa sxaVar = (sxa) kvaVar.t.getValue();
                if (sxaVar != null) {
                    int i8 = sxaVar.a;
                    g9i g9iVar3 = kvaVar.v;
                    rq3 rq3Var = null;
                    if (g9iVar3 != null) {
                        g9iVar3.e(null);
                    }
                    kvaVar.v = xw3.L(un0.z(kvaVar), null, null, new ok0(kvaVar, i8, rxaVar, rq3Var, 27), 3);
                }
                return Unit.a;
            case 25:
                int intValue2 = ((Number) obj).intValue();
                LeagueDetailsFragment leagueDetailsFragment = (LeagueDetailsFragment) this.receiver;
                leagueDetailsFragment.getClass();
                int i9 = PlayerActivity.Z;
                Context requireContext = leagueDetailsFragment.requireContext();
                requireContext.getClass();
                UniqueTournament uniqueTournament = leagueDetailsFragment.G().getUniqueTournament();
                jle.q(requireContext, intValue2, uniqueTournament != null ? uniqueTournament.getId() : 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                return Unit.a;
            case 26:
                int intValue3 = ((Number) obj).intValue();
                LeagueDetailsFragment leagueDetailsFragment2 = (LeagueDetailsFragment) this.receiver;
                leagueDetailsFragment2.getClass();
                int i10 = TeamActivity.Z;
                FragmentActivity requireActivity = leagueDetailsFragment2.requireActivity();
                requireActivity.getClass();
                jle.r(requireActivity, intValue3, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 27:
                final rva rvaVar = (rva) obj;
                rvaVar.getClass();
                fwa fwaVar = (fwa) this.receiver;
                fwaVar.getClass();
                rq3 rq3Var2 = null;
                if (rvaVar instanceof pva) {
                    fwaVar.n(null, new Function1() { // from class: zva
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i11 = r2;
                            rva rvaVar2 = rvaVar;
                            switch (i11) {
                                case 0:
                                    xva xvaVar = (xva) obj3;
                                    xvaVar.getClass();
                                    return xva.a(xvaVar, null, null, 0, null, null, null, null, null, null, null, ((pva) rvaVar2).a, 0, false, 61439);
                                case 1:
                                    xva xvaVar2 = (xva) obj3;
                                    xvaVar2.getClass();
                                    return xva.a(xvaVar2, null, null, ((mva) rvaVar2).a, null, null, null, null, null, null, null, null, 0, false, 65531);
                                default:
                                    xva xvaVar3 = (xva) obj3;
                                    xvaVar3.getClass();
                                    return xva.a(xvaVar3, null, null, 0, null, null, null, null, null, null, null, null, ((nva) rvaVar2).a, true, 40959);
                            }
                        }
                    });
                } else if (rvaVar instanceof qva) {
                    fwaVar.n(null, new uf8(20, rvaVar, fwaVar));
                } else if (rvaVar instanceof mva) {
                    final int i11 = r6 ? 1 : 0;
                    fwaVar.n(null, new Function1() { // from class: zva
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i112 = i11;
                            rva rvaVar2 = rvaVar;
                            switch (i112) {
                                case 0:
                                    xva xvaVar = (xva) obj3;
                                    xvaVar.getClass();
                                    return xva.a(xvaVar, null, null, 0, null, null, null, null, null, null, null, ((pva) rvaVar2).a, 0, false, 61439);
                                case 1:
                                    xva xvaVar2 = (xva) obj3;
                                    xvaVar2.getClass();
                                    return xva.a(xvaVar2, null, null, ((mva) rvaVar2).a, null, null, null, null, null, null, null, null, 0, false, 65531);
                                default:
                                    xva xvaVar3 = (xva) obj3;
                                    xvaVar3.getClass();
                                    return xva.a(xvaVar3, null, null, 0, null, null, null, null, null, null, null, null, ((nva) rvaVar2).a, true, 40959);
                            }
                        }
                    });
                } else if (rvaVar instanceof nva) {
                    xva xvaVar = (xva) ((vnb) fwaVar.f.a.getValue()).a();
                    yva yvaVar = xvaVar != null ? xvaVar.m : null;
                    fwaVar.n(null, new Function1() { // from class: zva
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i112 = i2;
                            rva rvaVar2 = rvaVar;
                            switch (i112) {
                                case 0:
                                    xva xvaVar2 = (xva) obj3;
                                    xvaVar2.getClass();
                                    return xva.a(xvaVar2, null, null, 0, null, null, null, null, null, null, null, ((pva) rvaVar2).a, 0, false, 61439);
                                case 1:
                                    xva xvaVar22 = (xva) obj3;
                                    xvaVar22.getClass();
                                    return xva.a(xvaVar22, null, null, ((mva) rvaVar2).a, null, null, null, null, null, null, null, null, 0, false, 65531);
                                default:
                                    xva xvaVar3 = (xva) obj3;
                                    xvaVar3.getClass();
                                    return xva.a(xvaVar3, null, null, 0, null, null, null, null, null, null, null, null, ((nva) rvaVar2).a, true, 40959);
                            }
                        }
                    });
                    xw3.L(un0.z(fwaVar), null, null, new zi7(yvaVar, fwaVar, rvaVar, rq3Var2, 18), 3);
                } else {
                    if (!rvaVar.equals(ova.a)) {
                        zzl.b();
                        return null;
                    }
                    ynb.m(fwaVar, new r3(fwaVar, rq3Var2, 14));
                }
                return Unit.a;
            case 28:
                c4b c4bVar = (c4b) obj;
                c4bVar.getClass();
                ((o4b) this.receiver).t(c4bVar);
                return Unit.a;
            default:
                Number number = (Number) obj;
                cab cabVar = (cab) this.receiver;
                cab cabVar2 = cab.a;
                cabVar.getClass();
                return yid.g(number != null ? Double.valueOf(number.doubleValue()) : null);
        }
    }
}
