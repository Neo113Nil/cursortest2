package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.Sports;
import com.sofascore.model.TvType;
import com.sofascore.model.fantasy.FantasyUserRoundSquadResponse;
import com.sofascore.model.fantasy.FantasyUserSquad;
import com.sofascore.model.newNetwork.CountrySport;
import com.sofascore.model.newNetwork.OrderedSportsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import com.sofascore.results.mvvm.base.AbstractFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r3 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(Object obj, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.t;
        switch (i) {
            case 0:
                return new r3((AbstractFragment) obj, rq3Var, 0);
            case 1:
                return new r3((kk) obj, rq3Var, 1);
            case 2:
                return new r3((String) obj, rq3Var, 2);
            case 3:
                return new r3((c92) obj, rq3Var, 3);
            case 4:
                return new r3((g9i) obj, rq3Var, 4);
            case 5:
                return new r3((cs2) obj, rq3Var, 5);
            case 6:
                return new r3((be4) obj, rq3Var, 6);
            case 7:
                return new r3((as2) obj, rq3Var, 7);
            case 8:
                return new r3((ov5) obj, rq3Var, 8);
            case 9:
                return new r3((s96) obj, rq3Var, 9);
            case 10:
                return new r3((nc6) obj, rq3Var, 10);
            case 11:
                return new r3((av4) obj, rq3Var, 11);
            case 12:
                return new r3((e57) obj, rq3Var, 12);
            case 13:
                return new r3((nua) obj, rq3Var, 13);
            case 14:
                return new r3((fwa) obj, rq3Var, 14);
            case 15:
                return new r3((eza) obj, rq3Var, 15);
            case 16:
                return new r3((t9c) obj, rq3Var, 16);
            case 17:
                return new r3((v1e) obj, rq3Var, 17);
            case 18:
                return new r3((e3e) obj, rq3Var, 18);
            case 19:
                return new r3((Function1) obj, rq3Var, 19);
            case 20:
                return new r3((gzh) obj, rq3Var, 20);
            case 21:
                return new r3((d3i) obj, rq3Var, 21);
            case 22:
                return new r3((g2j) obj, rq3Var, 22);
            case 23:
                return new r3((r9j) obj, rq3Var, 23);
            case 24:
                return new r3((tbj) obj, rq3Var, 24);
            case 25:
                return new r3((ykj) obj, rq3Var, 25);
            default:
                return new r3((c0k) obj, rq3Var, 26);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((r3) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        if (r14 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0087, code lost:
    
        if (r3.t(r14) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ff, code lost:
    
        if (r14 == r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d7, code lost:
    
        if (r15.z() == r0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FantasyUserSquad squad;
        int i = this.r;
        Object obj2 = this.t;
        int i2 = 1;
        ?? r6 = 0;
        r6 = 0;
        switch (i) {
            case 0:
                AbstractFragment abstractFragment = (AbstractFragment) obj2;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    abstractFragment.b.e(null);
                    abstractFragment.u();
                    long j = ke0.b * 1000;
                    this.s = 1;
                    if (n4o.y(j, this) == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                if (abstractFragment.g) {
                    abstractFragment.b = abstractFragment.r();
                }
                break;
            case 1:
                Object obj3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = s9a.r(new jk((kk) obj2, (rq3) r6, r2), this);
                    Object obj4 = r;
                    if (r != obj3) {
                        obj4 = Unit.a;
                    }
                    if (obj4 == obj3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        break;
                    } else {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    y6a.M(obj);
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, be5.MILLISECONDS);
                    q3 q3Var = new q3((String) obj2, r6, 6);
                    this.s = 1;
                    Object W = wba.W(R, q3Var, this);
                    if (W == lu3Var2) {
                        break;
                    }
                }
                break;
            case 3:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        break;
                    } else {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = ((c92) obj2).a;
                    this.s = 1;
                    Object buzzerConfig = networkCoroutineAPI.getBuzzerConfig(this);
                    if (buzzerConfig == lu3Var3) {
                        break;
                    }
                }
                break;
            case 4:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((g9i) obj2).Z(this) == lu3Var4) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 5:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        break;
                    } else {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = ((cs2) obj2).b;
                    this.s = 1;
                    Object riskyChatChannels = networkCoroutineAPI2.riskyChatChannels(this);
                    if (riskyChatChannels == lu3Var5) {
                        break;
                    }
                }
                break;
            case 6:
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((be4) obj2).cleanUp(this) == lu3Var6) {
                        break;
                    }
                } else if (i9 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 7:
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        break;
                    } else {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    y6a.M(obj);
                    this.s = 1;
                    Object invoke = ((as2) obj2).invoke(this);
                    if (invoke == lu3Var7) {
                        break;
                    }
                }
                break;
            case 8:
                lu3 lu3Var8 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((ov5) obj2).v(this) == lu3Var8) {
                        break;
                    }
                } else if (i11 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 9:
                lu3 lu3Var9 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        break;
                    } else {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI3 = ((s96) obj2).a;
                    this.s = 1;
                    Object newlyAddedEvents = networkCoroutineAPI3.getNewlyAddedEvents(this);
                    if (newlyAddedEvents == lu3Var9) {
                        break;
                    }
                }
                break;
            case 10:
                lu3 lu3Var10 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        break;
                    } else {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    y6a.M(obj);
                    nc6 nc6Var = (nc6) obj2;
                    t9c t9cVar = nc6Var.e;
                    TvType tvType = TvType.EVENT;
                    int i14 = nc6Var.f;
                    this.s = 1;
                    Object tvCountryChannels = t9cVar.a.getTvCountryChannels(tvType, i14, this);
                    if (tvCountryChannels == lu3Var10) {
                        break;
                    }
                }
                break;
            case 11:
                lu3 lu3Var11 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = ((av4) obj2).w(this);
                    if (obj == lu3Var11) {
                        break;
                    }
                } else if (i15 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                FantasyUserRoundSquadResponse fantasyUserRoundSquadResponse = (FantasyUserRoundSquadResponse) obj;
                if (fantasyUserRoundSquadResponse != null && (squad = fantasyUserRoundSquadResponse.getSquad()) != null) {
                    r6 = squad.getPlayers();
                }
                break;
            case 12:
                lu3 lu3Var12 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((e57) obj2).v(this) == lu3Var12) {
                        break;
                    }
                } else if (i16 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 13:
                Object obj5 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    nua nuaVar = (nua) obj2;
                    int i18 = nuaVar.m;
                    int i19 = nuaVar.n;
                    this.s = 1;
                    Object r2 = s9a.r(new lua(nuaVar, i18, i19, null), this);
                    Object obj6 = r2;
                    if (r2 != obj5) {
                        obj6 = Unit.a;
                    }
                    if (obj6 == obj5) {
                        break;
                    }
                } else if (i17 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 14:
                Object obj7 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    fwa fwaVar = (fwa) obj2;
                    int i21 = fwaVar.n;
                    int i22 = fwaVar.o;
                    boolean z = fwaVar.p;
                    String str = fwaVar.s;
                    this.s = 1;
                    Object r3 = s9a.r(new cwa(fwaVar, i21, i22, z, str, null), this);
                    Object obj8 = r3;
                    if (r3 != obj7) {
                        obj8 = Unit.a;
                    }
                    if (obj8 == obj7) {
                        break;
                    }
                } else if (i20 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 15:
                lu3 lu3Var13 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((eza) obj2).t(this) == lu3Var13) {
                        break;
                    }
                } else if (i23 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 16:
                lu3 lu3Var14 = lu3.a;
                int i24 = this.s;
                if (i24 != 0) {
                    if (i24 == 1) {
                        y6a.M(obj);
                        break;
                    } else {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI4 = ((t9c) obj2).a;
                    this.s = 1;
                    Object sportRadarToken = networkCoroutineAPI4.getSportRadarToken(this);
                    if (sportRadarToken == lu3Var14) {
                        break;
                    }
                }
                break;
            case 17:
                Object obj9 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r4 = s9a.r(new s1e((v1e) obj2, r6, r2), this);
                    Object obj10 = r4;
                    if (r4 != obj9) {
                        obj10 = Unit.a;
                    }
                    if (obj10 == obj9) {
                        break;
                    }
                } else if (i25 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 18:
                Object obj11 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r5 = s9a.r(new d3e((e3e) obj2, r6, r2), this);
                    Object obj12 = r5;
                    if (r5 != obj11) {
                        obj12 = Unit.a;
                    }
                    if (obj12 == obj11) {
                        break;
                    }
                } else if (i26 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 19:
                lu3 lu3Var15 = lu3.a;
                int i27 = this.s;
                if (i27 != 0) {
                    if (i27 == 1) {
                        y6a.M(obj);
                        break;
                    } else {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    y6a.M(obj);
                    this.s = 1;
                    Object invoke2 = ((Function1) obj2).invoke(this);
                    if (invoke2 == lu3Var15) {
                        break;
                    }
                }
                break;
            case 20:
                lu3 lu3Var16 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI5 = ((gzh) obj2).b;
                    ArrayList arrayList = dv3.a;
                    String d = dv3.d(new Integer(ke0.c));
                    if (d == null) {
                        d = "";
                    }
                    this.s = 1;
                    obj = networkCoroutineAPI5.getOrderedSports(d, this);
                    if (obj == lu3Var16) {
                        break;
                    }
                } else if (i28 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                List<CountrySport> countrySportPriorities = ((OrderedSportsResponse) obj).getCountrySportPriorities();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj13 : countrySportPriorities) {
                    if (Sports.INSTANCE.getEntries().contains(((CountrySport) obj13).getSport().getSlug())) {
                        arrayList2.add(obj13);
                    }
                }
                break;
            case 21:
                Object obj14 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    d3i d3iVar = (d3i) obj2;
                    this.s = 1;
                    d3iVar.getClass();
                    Object r7 = s9a.r(new c3i(d3iVar, r6, i2), this);
                    Object obj15 = r7;
                    if (r7 != obj14) {
                        obj15 = Unit.a;
                    }
                    if (obj15 == obj14) {
                        break;
                    }
                } else if (i29 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 22:
                lu3 lu3Var17 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((g2j) obj2).w(this) == lu3Var17) {
                        break;
                    }
                } else if (i30 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 23:
                r9j r9jVar = (r9j) obj2;
                lu3 lu3Var18 = lu3.a;
                int i31 = this.s;
                if (i31 != 0) {
                    if (i31 != 1) {
                        if (i31 == 2) {
                            y6a.M(obj);
                            ((eoh) r9jVar.u.t).setValue(Boolean.TRUE);
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        y6a.M(obj);
                    }
                } else {
                    y6a.M(obj);
                    lcj lcjVar = r9jVar.u;
                    this.s = 1;
                    break;
                }
                eje ejeVar = r9jVar.A;
                if (ejeVar != null) {
                    CharSequence charSequence = r9jVar.u.a.d().c;
                    long j2 = r9jVar.u.a.d().d;
                    this.s = 2;
                    Object d2 = ((kje) ejeVar).d(charSequence, j2, this);
                    if (d2 != lu3Var18) {
                        d2 = Unit.a;
                        break;
                    }
                }
                ((eoh) r9jVar.u.t).setValue(Boolean.TRUE);
                break;
            case 24:
                tbj tbjVar = (tbj) obj2;
                lu3 lu3Var19 = lu3.a;
                int i32 = this.s;
                if (i32 != 0) {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            y6a.M(obj);
                            tbjVar.A = true;
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        y6a.M(obj);
                    }
                } else {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                }
                Pair f = tbjVar.f();
                if (f != null) {
                    String str2 = (String) f.a;
                    long j3 = ((pej) f.b).a;
                    eje ejeVar2 = tbjVar.i;
                    if (ejeVar2 != null) {
                        this.s = 2;
                        Object d3 = ((kje) ejeVar2).d(str2, j3, this);
                        if (d3 != lu3Var19) {
                            d3 = Unit.a;
                            break;
                        }
                    }
                }
                tbjVar.A = true;
                break;
            case 25:
                lu3 lu3Var20 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    ykj ykjVar = (ykj) obj2;
                    this.s = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(this));
                    lj2Var.t();
                    ykjVar.b.R(Boolean.TRUE);
                    ykjVar.c = lj2Var;
                    if (lj2Var.q() == lu3Var20) {
                        break;
                    }
                } else if (i33 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var21 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((c0k) obj2).t(this) == lu3Var21) {
                        break;
                    }
                } else if (i34 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
