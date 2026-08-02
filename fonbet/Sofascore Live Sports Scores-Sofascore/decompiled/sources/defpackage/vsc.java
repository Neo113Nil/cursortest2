package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.dialog.SettingsItem;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.settings.PreferenceFragment;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.bottomsheet.RaceFlowGraphInfoBottomSheet;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.view.follownotification.FollowButton;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vsc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vsc(tbj tbjVar, ku3 ku3Var, Context context) {
        this.a = 27;
        this.c = tbjVar;
        this.b = ku3Var;
        this.d = context;
    }

    private final Object a(Object obj) {
        Integer e;
        Integer d;
        Integer d2;
        Integer e2;
        aej aejVar;
        aej aejVar2;
        bej bejVar;
        bej bejVar2;
        aej aejVar3;
        aej aejVar4;
        bej bejVar3;
        bej bejVar4;
        Integer d3;
        Integer e3;
        Integer e4;
        Integer d4;
        y3g y3gVar;
        ria riaVar = (ria) this.b;
        raj rajVar = (raj) this.c;
        asf asfVar = (asf) this.d;
        hbj hbjVar = (hbj) obj;
        int i = 27;
        int i2 = 0;
        wcj wcjVar = null;
        switch (riaVar.ordinal()) {
            case 0:
                hbjVar.e.a = null;
                if (hbjVar.g.b.length() > 0) {
                    if (!pej.d(hbjVar.f)) {
                        boolean f = hbjVar.f();
                        long j = hbjVar.f;
                        if (!f) {
                            int f2 = pej.f(j);
                            hbjVar.q(f2, f2);
                            break;
                        } else {
                            int g = pej.g(j);
                            hbjVar.q(g, g);
                            break;
                        }
                    } else {
                        hbjVar.i();
                        Unit unit = Unit.a;
                        break;
                    }
                }
                break;
            case 1:
                hbjVar.e.a = null;
                if (hbjVar.g.b.length() > 0) {
                    if (!pej.d(hbjVar.f)) {
                        boolean f3 = hbjVar.f();
                        long j2 = hbjVar.f;
                        if (!f3) {
                            int g2 = pej.g(j2);
                            hbjVar.q(g2, g2);
                            break;
                        } else {
                            int f4 = pej.f(j2);
                            hbjVar.q(f4, f4);
                            break;
                        }
                    } else {
                        hbjVar.m();
                        Unit unit2 = Unit.a;
                        break;
                    }
                }
                break;
            case 2:
                oej oejVar = hbjVar.e;
                oejVar.a = null;
                q80 q80Var = hbjVar.g;
                String str = q80Var.b;
                String str2 = q80Var.b;
                if (str.length() > 0) {
                    if (!hbjVar.f()) {
                        oejVar.a = null;
                        if (str2.length() > 0 && (e = hbjVar.e()) != null) {
                            int intValue = e.intValue();
                            hbjVar.q(intValue, intValue);
                            break;
                        }
                    } else {
                        oejVar.a = null;
                        if (str2.length() > 0 && (d = hbjVar.d()) != null) {
                            int intValue2 = d.intValue();
                            hbjVar.q(intValue2, intValue2);
                            break;
                        }
                    }
                }
                break;
            case 3:
                oej oejVar2 = hbjVar.e;
                oejVar2.a = null;
                q80 q80Var2 = hbjVar.g;
                String str3 = q80Var2.b;
                String str4 = q80Var2.b;
                if (str3.length() > 0) {
                    if (!hbjVar.f()) {
                        oejVar2.a = null;
                        if (str4.length() > 0 && (d2 = hbjVar.d()) != null) {
                            int intValue3 = d2.intValue();
                            hbjVar.q(intValue3, intValue3);
                            break;
                        }
                    } else {
                        oejVar2.a = null;
                        if (str4.length() > 0 && (e2 = hbjVar.e()) != null) {
                            int intValue4 = e2.intValue();
                            hbjVar.q(intValue4, intValue4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                hbjVar.j();
                break;
            case 5:
                hbjVar.l();
                break;
            case 6:
                hbjVar.o();
                break;
            case 7:
                hbjVar.n();
                break;
            case 8:
                hbjVar.e.a = null;
                if (hbjVar.g.b.length() > 0) {
                    if (!hbjVar.f()) {
                        hbjVar.n();
                        break;
                    } else {
                        hbjVar.o();
                        break;
                    }
                }
                break;
            case 9:
                hbjVar.e.a = null;
                if (hbjVar.g.b.length() > 0) {
                    if (!hbjVar.f()) {
                        hbjVar.o();
                        break;
                    } else {
                        hbjVar.n();
                        break;
                    }
                }
                break;
            case 10:
                if (hbjVar.g.b.length() > 0 && (aejVar = hbjVar.c) != null) {
                    int g3 = hbjVar.g(aejVar, -1);
                    hbjVar.q(g3, g3);
                    break;
                }
                break;
            case 11:
                if (hbjVar.g.b.length() > 0 && (aejVar2 = hbjVar.c) != null) {
                    int g4 = hbjVar.g(aejVar2, 1);
                    hbjVar.q(g4, g4);
                    break;
                }
                break;
            case 12:
            case 48:
                Unit unit3 = Unit.a;
                break;
            case 13:
                if (hbjVar.g.b.length() > 0 && (bejVar = hbjVar.i) != null) {
                    int h = hbjVar.h(bejVar, -1);
                    hbjVar.q(h, h);
                    break;
                }
                break;
            case 14:
                if (hbjVar.g.b.length() > 0 && (bejVar2 = hbjVar.i) != null) {
                    int h2 = hbjVar.h(bejVar2, 1);
                    hbjVar.q(h2, h2);
                    break;
                }
                break;
            case 15:
                hbjVar.e.a = null;
                if (hbjVar.g.b.length() > 0) {
                    hbjVar.q(0, 0);
                    break;
                }
                break;
            case 16:
                hbjVar.e.a = null;
                q80 q80Var3 = hbjVar.g;
                if (q80Var3.b.length() > 0) {
                    int length = q80Var3.b.length();
                    hbjVar.q(length, length);
                    break;
                }
                break;
            case 17:
                rajVar.b.a(false);
                break;
            case 18:
                rajVar.b.o();
                break;
            case 19:
                rajVar.b.c();
                break;
            case 20:
                List a = hbjVar.a(new i1j(25));
                if (a != null) {
                    rajVar.a(a);
                    Unit unit4 = Unit.a;
                    break;
                }
                break;
            case 21:
                List a2 = hbjVar.a(new i1j(26));
                if (a2 != null) {
                    rajVar.a(a2);
                    Unit unit5 = Unit.a;
                    break;
                }
                break;
            case 22:
                List a3 = hbjVar.a(new i1j(i));
                if (a3 != null) {
                    rajVar.a(a3);
                    Unit unit6 = Unit.a;
                    break;
                }
                break;
            case 23:
                List a4 = hbjVar.a(new i1j(28));
                if (a4 != null) {
                    rajVar.a(a4);
                    Unit unit7 = Unit.a;
                    break;
                }
                break;
            case 24:
                List a5 = hbjVar.a(new i1j(29));
                if (a5 != null) {
                    rajVar.a(a5);
                    Unit unit8 = Unit.a;
                    break;
                }
                break;
            case 25:
                List a6 = hbjVar.a(new qaj(i2));
                if (a6 != null) {
                    rajVar.a(a6);
                    Unit unit9 = Unit.a;
                    break;
                }
                break;
            case 26:
                hbjVar.e.a = null;
                q80 q80Var4 = hbjVar.g;
                if (q80Var4.b.length() > 0) {
                    hbjVar.q(0, q80Var4.b.length());
                    break;
                }
                break;
            case 27:
                hbjVar.i();
                hbjVar.p();
                break;
            case 28:
                hbjVar.m();
                hbjVar.p();
                break;
            case 29:
                if (hbjVar.g.b.length() > 0 && (aejVar3 = hbjVar.c) != null) {
                    int g5 = hbjVar.g(aejVar3, -1);
                    hbjVar.q(g5, g5);
                }
                hbjVar.p();
                break;
            case 30:
                if (hbjVar.g.b.length() > 0 && (aejVar4 = hbjVar.c) != null) {
                    int g6 = hbjVar.g(aejVar4, 1);
                    hbjVar.q(g6, g6);
                }
                hbjVar.p();
                break;
            case 31:
                if (hbjVar.g.b.length() > 0 && (bejVar3 = hbjVar.i) != null) {
                    int h3 = hbjVar.h(bejVar3, -1);
                    hbjVar.q(h3, h3);
                }
                hbjVar.p();
                break;
            case 32:
                if (hbjVar.g.b.length() > 0 && (bejVar4 = hbjVar.i) != null) {
                    int h4 = hbjVar.h(bejVar4, 1);
                    hbjVar.q(h4, h4);
                }
                hbjVar.p();
                break;
            case 33:
                hbjVar.e.a = null;
                if (hbjVar.g.b.length() > 0) {
                    hbjVar.q(0, 0);
                }
                hbjVar.p();
                break;
            case 34:
                hbjVar.e.a = null;
                q80 q80Var5 = hbjVar.g;
                if (q80Var5.b.length() > 0) {
                    int length2 = q80Var5.b.length();
                    hbjVar.q(length2, length2);
                }
                hbjVar.p();
                break;
            case 35:
                oej oejVar3 = hbjVar.e;
                oejVar3.a = null;
                q80 q80Var6 = hbjVar.g;
                String str5 = q80Var6.b;
                String str6 = q80Var6.b;
                if (str5.length() > 0) {
                    if (hbjVar.f()) {
                        oejVar3.a = null;
                        if (str6.length() > 0 && (e3 = hbjVar.e()) != null) {
                            int intValue5 = e3.intValue();
                            hbjVar.q(intValue5, intValue5);
                        }
                    } else {
                        oejVar3.a = null;
                        if (str6.length() > 0 && (d3 = hbjVar.d()) != null) {
                            int intValue6 = d3.intValue();
                            hbjVar.q(intValue6, intValue6);
                        }
                    }
                }
                hbjVar.p();
                break;
            case 36:
                oej oejVar4 = hbjVar.e;
                oejVar4.a = null;
                q80 q80Var7 = hbjVar.g;
                String str7 = q80Var7.b;
                String str8 = q80Var7.b;
                if (str7.length() > 0) {
                    if (hbjVar.f()) {
                        oejVar4.a = null;
                        if (str8.length() > 0 && (d4 = hbjVar.d()) != null) {
                            int intValue7 = d4.intValue();
                            hbjVar.q(intValue7, intValue7);
                        }
                    } else {
                        oejVar4.a = null;
                        if (str8.length() > 0 && (e4 = hbjVar.e()) != null) {
                            int intValue8 = e4.intValue();
                            hbjVar.q(intValue8, intValue8);
                        }
                    }
                }
                hbjVar.p();
                break;
            case 37:
                hbjVar.j();
                hbjVar.p();
                break;
            case 38:
                hbjVar.l();
                hbjVar.p();
                break;
            case 39:
                hbjVar.o();
                hbjVar.p();
                break;
            case 40:
                hbjVar.n();
                hbjVar.p();
                break;
            case 41:
                hbjVar.e.a = null;
                if (hbjVar.g.b.length() > 0) {
                    if (hbjVar.f()) {
                        hbjVar.o();
                    } else {
                        hbjVar.n();
                    }
                }
                hbjVar.p();
                break;
            case 42:
                hbjVar.e.a = null;
                if (hbjVar.g.b.length() > 0) {
                    if (hbjVar.f()) {
                        hbjVar.n();
                    } else {
                        hbjVar.o();
                    }
                }
                hbjVar.p();
                break;
            case 43:
                hbjVar.e.a = null;
                if (hbjVar.g.b.length() > 0) {
                    long j3 = hbjVar.f;
                    int i3 = pej.c;
                    int i4 = (int) (j3 & 4294967295L);
                    hbjVar.q(i4, i4);
                    break;
                }
                break;
            case 44:
                if (rajVar.e) {
                    asfVar.a = rajVar.a.x.b.r.b(rajVar.k);
                } else {
                    rajVar.a(a.c(new t43("\n", 1)));
                }
                Unit unit10 = Unit.a;
                break;
            case 45:
                if (rajVar.e) {
                    asfVar.a = false;
                } else {
                    rajVar.a(a.c(new t43("\t", 1)));
                }
                Unit unit11 = Unit.a;
                break;
            case 46:
                rajVar.h.a(wcj.a(hbjVar.h, hbjVar.g, hbjVar.f, 4));
                aak aakVar = rajVar.h;
                y3g y3gVar2 = aakVar.a;
                if (y3gVar2 != null && (y3gVar = (y3g) y3gVar2.b) != null) {
                    aakVar.a = y3gVar;
                    aakVar.c -= ((wcj) y3gVar2.c).a.b.length();
                    aakVar.b = new y3g(i, aakVar.b, (wcj) y3gVar2.c);
                    wcjVar = (wcj) y3gVar.c;
                }
                if (wcjVar != null) {
                    rajVar.j.invoke(wcjVar);
                    Unit unit12 = Unit.a;
                    break;
                }
                break;
            case 47:
                aak aakVar2 = rajVar.h;
                y3g y3gVar3 = aakVar2.b;
                if (y3gVar3 != null) {
                    aakVar2.b = (y3g) y3gVar3.b;
                    wcj wcjVar2 = (wcj) y3gVar3.c;
                    aakVar2.a = new y3g(i, aakVar2.a, wcjVar2);
                    aakVar2.c = wcjVar2.a.b.length() + aakVar2.c;
                    wcjVar = (wcj) y3gVar3.c;
                }
                if (wcjVar != null) {
                    rajVar.j.invoke(wcjVar);
                    Unit unit13 = Unit.a;
                    break;
                }
                break;
            default:
                zzl.b();
                return null;
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function0, rq3] */
    /* JADX WARN: Type inference failed for: r12v5, types: [gv9] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String a;
        FragmentActivity O;
        p80 p80Var;
        int i = this.a;
        int i2 = 5;
        int i3 = 11;
        int i4 = 6;
        int i5 = 3;
        final int i6 = 2;
        ?? r12 = 0;
        r12 = 0;
        final int i7 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                dfh dfhVar = (dfh) obj3;
                xw3.L((ku3) obj4, null, null, new we3(dfhVar, ((Float) obj).floatValue(), r12, r13), 3).n(new xsc(dfhVar, (Function0) obj2, r13));
                return Unit.a;
            case 1:
                cdi cdiVar = (cdi) obj3;
                e1d e1dVar = (e1d) obj2;
                te2 te2Var = (te2) obj;
                te2Var.getClass();
                return te2Var.a(new cuc(new v7b((List) obj4, null, (Float.floatToRawIntBits(((Number) cdiVar.getValue()).floatValue()) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(((Number) cdiVar.getValue()).floatValue() + ((int) (((c7a) e1dVar.getValue()).a >> 32))) << 32) | (Float.floatToRawIntBits((int) (((c7a) e1dVar.getValue()).a & 4294967295L)) & 4294967295L)), i7));
            case 2:
                o8d o8dVar = (o8d) obj4;
                me3 me3Var = (me3) obj3;
                f8d f8dVar = (f8d) obj2;
                if (o8dVar.e != null) {
                    pvd.t("NavigationEventState '", o8dVar, "' is already registered with a NavigationEventHandler '", me3Var, "'.");
                    return null;
                }
                o8dVar.e = me3Var;
                f8d.a(f8dVar, me3Var);
                return new vx0(9, me3Var, o8dVar);
            case 3:
                u6b u6bVar = (u6b) obj4;
                ((o55) obj).getClass();
                ob3 ob3Var = new ob3(i2, (OnboardingViewModel) obj3, (BaseActivity) obj2);
                u6bVar.getLifecycle().a(ob3Var);
                return new vx0(10, u6bVar, ob3Var);
            case 4:
                osa osaVar = (osa) obj4;
                ysd ysdVar = (ysd) obj3;
                Function1 function1 = (Function1) obj2;
                yoa yoaVar = (yoa) obj;
                yoaVar.getClass();
                int c = osaVar.c();
                if (c == 1 && (osaVar.e(0) instanceof msd)) {
                    yoaVar.j(null, new a7d(26), null, zm2.e);
                } else if (c == 1 && (osaVar.e(0) instanceof nsd)) {
                    yoaVar.j(null, new a7d(27), null, zm2.f);
                } else {
                    yoa.m(yoaVar, osaVar.c(), new x83(osaVar, i6), new a7d(28), new tc3(-1497945750, new c61(i3, osaVar, ysdVar, function1), true), 4);
                }
                return Unit.a;
            case 5:
                p3e p3eVar = (p3e) obj3;
                fo foVar = (fo) obj2;
                yma ymaVar = (yma) obj;
                long j = ((njh) ((tj4) obj4).invoke()).a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                if (intBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float H0 = ymaVar.H0(4.0f);
                    wj2 wj2Var = ymaVar.a;
                    float a2 = foVar.a(wzb.b(intBitsToFloat), wzb.b((Float.intBitsToFloat((int) (wj2Var.n() >> 32)) - r9) - ymaVar.H0(p3eVar.c(ymaVar.getLayoutDirection()))), ymaVar.getLayoutDirection()) + ymaVar.H0(p3eVar.b(ymaVar.getLayoutDirection()));
                    float f = intBitsToFloat / 2.0f;
                    float f2 = a2 + f;
                    float f3 = (f2 - f) - H0;
                    float f4 = f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f3;
                    float f5 = f2 + f + H0;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (wj2Var.n() >> 32));
                    float f6 = f5 > intBitsToFloat2 ? intBitsToFloat2 : f5;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
                    float f7 = (-intBitsToFloat3) / 2.0f;
                    float f8 = intBitsToFloat3 / 2.0f;
                    sx2 sx2Var = wj2Var.b;
                    long D = sx2Var.D();
                    sx2Var.t().o();
                    try {
                        ((hpo) sx2Var.a).q(f4, f7, f6, f8, 0);
                        ymaVar.a();
                    } finally {
                        mz1.v(sx2Var, D);
                    }
                } else {
                    ymaVar.a();
                }
                return Unit.a;
            case 6:
                Context context = (Context) obj3;
                xzd xzdVar = (xzd) obj2;
                ((Function1) obj4).invoke(((Boolean) obj).booleanValue() ? yzd.PerCategory : yzd.All);
                nv.z0(context, kv.CHANGE_CHIP, xzdVar.b.a, "player_event_statistics");
                return Unit.a;
            case 7:
                q1e q1eVar = (q1e) obj4;
                osa osaVar2 = (osa) obj3;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esaVar.c("Header", "Header", new tc3(-1999686759, new rsh(i2, q1eVar, (Function1) obj2), true));
                if (q1eVar.c.a() == 0 || osaVar2.c() != 0) {
                    esaVar.f("Disclaimer", "Disclaimer", ao2.i);
                    esaVar.f("Spacing", "Spacing", ao2.j);
                } else {
                    esaVar.f("EmptyState", "EmptyState", ao2.h);
                }
                esaVar.a(osaVar2.c(), new x83(osaVar2, i5), new etd(4), new tc3(428647036, new j4b(osaVar2, r13), true));
                return Unit.a;
            case 8:
                PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse = (PlayerPenaltyHistoryResponse) obj4;
                Player player = (Player) obj3;
                e1d e1dVar2 = (e1d) obj2;
                tue tueVar = (tue) obj;
                tueVar.getClass();
                if (playerPenaltyHistoryResponse != null) {
                    tueVar.p(player.getId(), playerPenaltyHistoryResponse, ((Boolean) e1dVar2.getValue()).booleanValue() ? que.a : que.b);
                } else {
                    tueVar.r();
                }
                return Unit.a;
            case 9:
                ale aleVar = (ale) obj4;
                ((o55) obj).getClass();
                axe axeVar = new axe((View) obj2, (Function1) obj3);
                aleVar.s(axeVar);
                return new vx0(i3, axeVar, aleVar);
            case 10:
                SettingsItem settingsItem = (SettingsItem) obj;
                settingsItem.getClass();
                SharedPreferences.Editor edit = ((PreferenceFragment) obj4).o().edit();
                edit.getClass();
                edit.putString((String) obj2, settingsItem.a);
                edit.apply();
                ((Preference) obj3).u(settingsItem.b);
                return Unit.a;
            case 11:
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                phe pheVar = (phe) obj;
                pheVar.getClass();
                Iterator it = ((ArrayList) obj4).iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        b.q();
                        throw null;
                    }
                    qhe qheVar = (qhe) next;
                    if (((Boolean) arrayList.get(i8)).booleanValue()) {
                        phe.h(pheVar, qheVar, ((Number) arrayList2.get(i8)).intValue(), 0);
                    }
                    i8 = i9;
                }
                return Unit.a;
            case 12:
                ((e1d) obj2).setValue(null);
                ((Function1) obj4).invoke(null);
                ((kie) ((z69) obj3)).a(0);
                return Unit.a;
            case 13:
                ppg ppgVar = (ppg) obj4;
                vpg vpgVar = (vpg) obj2;
                x0d x0dVar = ppgVar.b;
                if (x0dVar.b(obj3)) {
                    ogj.h(lnb.m(obj3, "Key ", " was used multiple times "));
                    return null;
                }
                ppgVar.a.remove(obj3);
                x0dVar.m(obj3, vpgVar);
                return new ha(i4, ppgVar, obj3, vpgVar);
            case 14:
                gv9 gv9Var = (gv9) obj4;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                int i10 = 8;
                esaVar2.a(gv9Var.size(), new wsd(i10, new o43((List) obj3, i6), gv9Var), new dyg(gv9Var, i7), new tc3(2039820996, new l46(gv9Var, gv9Var, (Function1) obj2, i10), true));
                return Unit.a;
            case 15:
                Activity activity = (Activity) obj4;
                Context context2 = (Context) obj3;
                pyg pygVar = (pyg) obj2;
                nxg nxgVar = (nxg) obj;
                nxgVar.getClass();
                if (nxgVar instanceof dxg) {
                    if (activity != null) {
                        activity.finish();
                    }
                } else if (nxgVar instanceof mxg) {
                    int i11 = TeamActivity.Z;
                    jle.r(context2, ((mxg) nxgVar).a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (nxgVar instanceof hxg) {
                    int i12 = PlayerActivity.Z;
                    jle.q(context2, ((hxg) nxgVar).a, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                } else {
                    pygVar.z(nxgVar);
                }
                return Unit.a;
            case 16:
                asf asfVar = (asf) obj2;
                mze mzeVar = (mze) obj;
                if (((jwc) obj4).a(mzeVar.c, (ilg) obj3)) {
                    mzeVar.a();
                    asfVar.a = true;
                }
                return Unit.a;
            case 17:
                xt3 xt3Var = (xt3) obj2;
                Throwable th = (Throwable) obj;
                ((kz3) obj4).invoke(th);
                g62 g62Var = (g62) ((g7h) obj3).d;
                g62Var.c(th, false);
                while (true) {
                    Object a3 = go2.a(g62Var.o());
                    if (a3 == null) {
                        return Unit.a;
                    }
                    xt3Var.invoke(a3, th);
                }
            case 18:
                Function1 function12 = (Function1) obj4;
                e1d e1dVar3 = (e1d) obj3;
                Context context3 = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                int i13 = SofaSeasonActivity.L;
                bitmap.getClass();
                tfi c2 = ((hth) e1dVar3.getValue()).c();
                if (c2 != null && (a = c2.a()) != null) {
                    nv.r0(context3, iv.SHARE, String.valueOf(((hth) e1dVar3.getValue()).b + 1), a);
                }
                function12.invoke(bitmap);
                return Unit.a;
            case 19:
                d3i d3iVar = (d3i) obj4;
                e1d e1dVar4 = (e1d) obj3;
                Context context4 = (Context) obj2;
                final x2i x2iVar = (x2i) obj;
                x2iVar.getClass();
                if (x2iVar.equals(t2i.a)) {
                    a3i a3iVar = (a3i) ((vnb) e1dVar4.getValue()).a();
                    if (a3iVar != null && (O = hkg.O(context4)) != null) {
                        xkf xkfVar = a3iVar.a;
                        gv9 gv9Var2 = a3iVar.b;
                        gv9 gv9Var3 = a3iVar.c;
                        xkfVar.getClass();
                        gv9Var2.getClass();
                        gv9Var3.getClass();
                        RaceFlowGraphInfoBottomSheet raceFlowGraphInfoBottomSheet = new RaceFlowGraphInfoBottomSheet();
                        raceFlowGraphInfoBottomSheet.setArguments(fz8.C(fz8.G("RACE_FLOW_STAGE_TYPE", xkfVar), fz8.I("RACE_ENTRANT_TEAMS_ARG", gv9Var2), fz8.I("RACE_ENTRANT_DRIVERS_ARG", gv9Var3)));
                        AppCompatActivity appCompatActivity = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                        if (appCompatActivity != null) {
                            wca.x(appCompatActivity.getLifecycle()).b(new r1(raceFlowGraphInfoBottomSheet, appCompatActivity, r12, i5));
                        }
                    }
                } else {
                    d3iVar.getClass();
                    if (x2iVar instanceof v2i) {
                        ynb.m(d3iVar, new r3(d3iVar, r12, 21));
                    } else if (x2iVar instanceof s2i) {
                        d3iVar.n(null, new Function1() { // from class: b3i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i14 = i7;
                                x2i x2iVar2 = x2iVar;
                                switch (i14) {
                                    case 0:
                                        a3i a3iVar2 = (a3i) obj5;
                                        a3iVar2.getClass();
                                        ArrayList U0 = CollectionsKt.U0(a3iVar2.f);
                                        RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant = ((s2i) x2iVar2).a;
                                        boolean contains = U0.contains(Integer.valueOf(raceFlowModels$RaceEntrant.a));
                                        Integer valueOf = Integer.valueOf(raceFlowModels$RaceEntrant.a);
                                        if (contains) {
                                            U0.remove(valueOf);
                                        } else {
                                            U0.add(valueOf);
                                        }
                                        Unit unit = Unit.a;
                                        return a3i.a(a3iVar2, null, null, null, null, l6g.W(U0), null, false, 0, 0, 0, null, null, null, 16351);
                                    case 1:
                                        a3i a3iVar3 = (a3i) obj5;
                                        a3iVar3.getClass();
                                        return a3i.a(a3iVar3, null, null, null, ((r2i) x2iVar2).a, null, null, false, 0, 0, 0, null, null, null, 16367);
                                    default:
                                        a3i a3iVar4 = (a3i) obj5;
                                        a3iVar4.getClass();
                                        return a3i.a(a3iVar4, null, null, null, null, null, null, false, 0, 0, 0, ((w2i) x2iVar2).a, null, null, 14335);
                                }
                            }
                        });
                    } else if (x2iVar instanceof r2i) {
                        d3iVar.n(null, new Function1() { // from class: b3i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i14 = r2;
                                x2i x2iVar2 = x2iVar;
                                switch (i14) {
                                    case 0:
                                        a3i a3iVar2 = (a3i) obj5;
                                        a3iVar2.getClass();
                                        ArrayList U0 = CollectionsKt.U0(a3iVar2.f);
                                        RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant = ((s2i) x2iVar2).a;
                                        boolean contains = U0.contains(Integer.valueOf(raceFlowModels$RaceEntrant.a));
                                        Integer valueOf = Integer.valueOf(raceFlowModels$RaceEntrant.a);
                                        if (contains) {
                                            U0.remove(valueOf);
                                        } else {
                                            U0.add(valueOf);
                                        }
                                        Unit unit = Unit.a;
                                        return a3i.a(a3iVar2, null, null, null, null, l6g.W(U0), null, false, 0, 0, 0, null, null, null, 16351);
                                    case 1:
                                        a3i a3iVar3 = (a3i) obj5;
                                        a3iVar3.getClass();
                                        return a3i.a(a3iVar3, null, null, null, ((r2i) x2iVar2).a, null, null, false, 0, 0, 0, null, null, null, 16367);
                                    default:
                                        a3i a3iVar4 = (a3i) obj5;
                                        a3iVar4.getClass();
                                        return a3i.a(a3iVar4, null, null, null, null, null, null, false, 0, 0, 0, ((w2i) x2iVar2).a, null, null, 14335);
                                }
                            }
                        });
                    } else if (x2iVar instanceof u2i) {
                        d3iVar.n(null, new l2i(i5));
                    } else if (x2iVar instanceof w2i) {
                        d3iVar.n(null, new Function1() { // from class: b3i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i14 = i6;
                                x2i x2iVar2 = x2iVar;
                                switch (i14) {
                                    case 0:
                                        a3i a3iVar2 = (a3i) obj5;
                                        a3iVar2.getClass();
                                        ArrayList U0 = CollectionsKt.U0(a3iVar2.f);
                                        RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant = ((s2i) x2iVar2).a;
                                        boolean contains = U0.contains(Integer.valueOf(raceFlowModels$RaceEntrant.a));
                                        Integer valueOf = Integer.valueOf(raceFlowModels$RaceEntrant.a);
                                        if (contains) {
                                            U0.remove(valueOf);
                                        } else {
                                            U0.add(valueOf);
                                        }
                                        Unit unit = Unit.a;
                                        return a3i.a(a3iVar2, null, null, null, null, l6g.W(U0), null, false, 0, 0, 0, null, null, null, 16351);
                                    case 1:
                                        a3i a3iVar3 = (a3i) obj5;
                                        a3iVar3.getClass();
                                        return a3i.a(a3iVar3, null, null, null, ((r2i) x2iVar2).a, null, null, false, 0, 0, 0, null, null, null, 16367);
                                    default:
                                        a3i a3iVar4 = (a3i) obj5;
                                        a3iVar4.getClass();
                                        return a3i.a(a3iVar4, null, null, null, null, null, null, false, 0, 0, 0, ((w2i) x2iVar2).a, null, null, 14335);
                                }
                            }
                        });
                    }
                }
                return Unit.a;
            case 20:
                return new epi((fpi) obj, (kx4) obj4, (Function1) obj3, (Function1) obj2);
            case 21:
                lec lecVar = (lec) obj4;
                asf asfVar2 = (asf) obj3;
                t6j t6jVar = (t6j) obj2;
                Object d = lecVar.d();
                if (asfVar2.a || !((Boolean) t6jVar.invoke(d, obj)).booleanValue()) {
                    asfVar2.a = false;
                    lecVar.j(obj);
                }
                return Unit.a;
            case 22:
                ((Context) obj).getClass();
                FollowButton followButton = new FollowButton((Context) obj4, null, 6);
                followButton.e(((b2j) obj3).w, wu.SQUAD_TAB, (String) obj2);
                return followButton;
            case 23:
                g3j g3jVar = (g3j) obj4;
                c3j c3jVar = (c3j) obj3;
                n3j n3jVar = (n3j) obj2;
                ynj ynjVar = (ynj) obj;
                ynjVar.getClass();
                if (c3jVar.a == h3j.a) {
                    ynj ynjVar2 = (ynj) n3jVar.l().a();
                    if (ynjVar2 != null) {
                        r12 = ynjVar2.b;
                    }
                } else {
                    ynj ynjVar3 = (ynj) n3jVar.l().a();
                    if (ynjVar3 != null) {
                        r12 = ynjVar3.a;
                    }
                }
                return ynj.a(ynjVar, null, null, null, false, g3j.d(g3jVar, null, null, c3jVar, koj.z(r12), null, 1663), 31);
            case 24:
                asf asfVar3 = (asf) obj4;
                p80 p80Var2 = (p80) obj3;
                pwh pwhVar = (pwh) obj2;
                p80 p80Var3 = (p80) obj;
                if (asfVar3.a) {
                    Object obj5 = p80Var3.a;
                    int i14 = p80Var3.c;
                    int i15 = p80Var3.b;
                    if ((obj5 instanceof pwh) && i15 == p80Var2.b && i14 == p80Var2.c) {
                        if (pwhVar == null) {
                            pwhVar = new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65535);
                        }
                        p80Var = new p80(pwhVar, i15, i14);
                        asfVar3.a = p80Var2.equals(p80Var3);
                        return p80Var;
                    }
                }
                p80Var = p80Var3;
                asfVar3.a = p80Var2.equals(p80Var3);
                return p80Var;
            case 25:
                Function1 function13 = (Function1) obj3;
                jdj jdjVar = (jdj) ((fsf) obj2).a;
                wcj f9 = ((fp4) obj4).f((List) obj);
                if (jdjVar != null) {
                    jdjVar.a(null, f9);
                }
                function13.invoke(f9);
                return Unit.a;
            case 26:
                return a(obj);
            case 27:
                final tbj tbjVar = (tbj) obj3;
                ku3 ku3Var = (ku3) obj4;
                Context context5 = (Context) obj2;
                d8j d8jVar = (d8j) obj;
                d8jVar.a();
                l0d l0dVar = d8jVar.a;
                n8j n8jVar = n8j.Autofill;
                boolean z = (pej.d(tbjVar.l().b) || !tbjVar.h() || tbjVar.g == null) ? false : true;
                xbj xbjVar = new xbj(ku3Var, new obj(tbjVar, r12, r13), i7);
                Resources resources = context5.getResources();
                wbj wbjVar = new wbj(xbjVar, r12, i7);
                if (z) {
                    l0dVar.a(new m8j(l6g.e, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, wbjVar));
                }
                n8j n8jVar2 = n8j.Autofill;
                boolean z2 = (pej.d(tbjVar.l().b) || tbjVar.g == null) ? false : true;
                xbj xbjVar2 = new xbj(ku3Var, new obj(tbjVar, r12, i6), i7);
                Resources resources2 = context5.getResources();
                wbj wbjVar2 = new wbj(xbjVar2, r12, i7);
                if (z2) {
                    l0dVar.a(new m8j(l6g.f, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, wbjVar2));
                }
                n8j n8jVar3 = n8j.Autofill;
                boolean z3 = tbjVar.h() && ((Boolean) ((eoh) tbjVar.w).getValue()).booleanValue() && tbjVar.g != null;
                xbj xbjVar3 = new xbj(ku3Var, new obj(tbjVar, r12, i5), i7);
                Resources resources3 = context5.getResources();
                wbj wbjVar3 = new wbj(xbjVar3, r12, i7);
                if (z3) {
                    l0dVar.a(new m8j(l6g.g, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, wbjVar3));
                }
                n8j n8jVar4 = n8j.Autofill;
                boolean z4 = pej.e(tbjVar.l().b) != tbjVar.l().a.b.length();
                Function0 function0 = new Function0() { // from class: ybj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i16 = i7;
                        tbj tbjVar2 = tbjVar;
                        switch (i16) {
                            case 0:
                                break;
                            case 1:
                                wcj b = tbj.b(tbjVar2.l().a, t6a.g(0, tbjVar2.l().a.b.length()));
                                tbjVar2.c.invoke(b);
                                long j2 = b.b;
                                tbjVar2.v = new pej(j2);
                                tbjVar2.t = wcj.a(tbjVar2.t, null, j2, 5);
                                tbjVar2.e(true);
                                break;
                            default:
                                Function0 function02 = tbjVar2.f;
                                if (function02 != null) {
                                    function02.invoke();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                Function0 function02 = new Function0() { // from class: ybj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i16 = r2;
                        tbj tbjVar2 = tbjVar;
                        switch (i16) {
                            case 0:
                                break;
                            case 1:
                                wcj b = tbj.b(tbjVar2.l().a, t6a.g(0, tbjVar2.l().a.b.length()));
                                tbjVar2.c.invoke(b);
                                long j2 = b.b;
                                tbjVar2.v = new pej(j2);
                                tbjVar2.t = wcj.a(tbjVar2.t, null, j2, 5);
                                tbjVar2.e(true);
                                break;
                            default:
                                Function0 function022 = tbjVar2.f;
                                if (function022 != null) {
                                    function022.invoke();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                Resources resources4 = context5.getResources();
                wbj wbjVar4 = new wbj(function02, function0, i7);
                if (z4) {
                    l0dVar.a(new m8j(l6g.h, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, wbjVar4));
                }
                n8j n8jVar5 = n8j.Autofill;
                r13 = (tbjVar.h() && pej.d(tbjVar.l().b)) ? 1 : 0;
                Function0 function03 = new Function0() { // from class: ybj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i16 = i6;
                        tbj tbjVar2 = tbjVar;
                        switch (i16) {
                            case 0:
                                break;
                            case 1:
                                wcj b = tbj.b(tbjVar2.l().a, t6a.g(0, tbjVar2.l().a.b.length()));
                                tbjVar2.c.invoke(b);
                                long j2 = b.b;
                                tbjVar2.v = new pej(j2);
                                tbjVar2.t = wcj.a(tbjVar2.t, null, j2, 5);
                                tbjVar2.e(true);
                                break;
                            default:
                                Function0 function022 = tbjVar2.f;
                                if (function022 != null) {
                                    function022.invoke();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                Resources resources5 = context5.getResources();
                wbj wbjVar5 = new wbj(function03, r12, i7);
                if (r13 != 0) {
                    l0dVar.a(new m8j(n8jVar5.a, resources5.getString(n8jVar5.b), n8jVar5.c, wbjVar5));
                }
                d8jVar.a();
                return Unit.a;
            case 28:
                esf esfVar = (esf) obj4;
                lcj lcjVar = (lcj) obj3;
                esfVar.a = f3h.a(lcjVar.k().c());
                ((esf) obj2).a = 0L;
                lcjVar.v(true);
                dma q = lcjVar.q();
                ((eoh) lcjVar.n).setValue(new dnd(q != null ? q.w(0L) : 9205357640488583168L));
                lcjVar.A(k69.a, esfVar.a);
                return Unit.a;
            default:
                lcj lcjVar2 = (lcj) obj3;
                w9j w9jVar = (w9j) obj2;
                dnd dndVar = (dnd) obj;
                ((deh) obj4).invoke();
                boolean z5 = lcjVar2.i;
                cej cejVar = lcjVar2.b;
                if (z5 && lcjVar2.d) {
                    w9jVar.invoke();
                    if (lcjVar2.a.d().c.length() > 0) {
                        lcjVar2.w(true);
                    }
                    lcjVar2.x(gfj.a);
                    lcjVar2.u(r4a.v(cejVar, cejVar.a(dndVar.a)));
                }
                return Unit.a;
        }
    }

    public /* synthetic */ vsc(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
