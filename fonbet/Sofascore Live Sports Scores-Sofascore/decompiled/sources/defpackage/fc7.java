package defpackage;

import com.sofascore.model.fantasy.FantasyPlayerPostModel;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasySquadResponse;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayer;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fc7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ gc7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc7(gc7 gc7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = gc7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        gc7 gc7Var = this.t;
        switch (i) {
            case 0:
                return new fc7(gc7Var, rq3Var, 0);
            default:
                return new fc7(gc7Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((fc7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x038a, code lost:
    
        if (r1.q(r34, defpackage.ac7.a) == r5) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03cf, code lost:
    
        if (r1.q(r34, r2) == r5) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0379, code lost:
    
        if (r2 == r5) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0329, code lost:
    
        if (r1.q(r34, defpackage.bc7.a) == r5) goto L151;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        Object r;
        Object obj2;
        FantasyTransferPlayers fantasyTransferPlayers;
        double floatValue;
        double floatValue2;
        int i = this.r;
        gc7 gc7Var = this.t;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                g62 g62Var = gc7Var.i;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3 && i3 != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                y6a.M(obj);
                                break;
                            }
                        } else {
                            y6a.M(obj);
                            P = obj;
                            x2g x2gVar = (x2g) P;
                            if (x2gVar instanceof t2g) {
                                this.s = 3;
                                break;
                            } else if (x2gVar instanceof v2g) {
                                List<FantasyRoundPlayer> players = ((FantasySquadResponse) ((v2g) x2gVar).a).getSquad().getPlayers();
                                ArrayList arrayList = new ArrayList(k13.r(players, 10));
                                Iterator<T> it = players.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(hkg.g0((FantasyRoundPlayer) it.next(), gc7Var.i()));
                                }
                                cc7 cc7Var = new cc7(arrayList);
                                this.s = 4;
                                break;
                            } else {
                                zzl.b();
                                break;
                            }
                        }
                    } else {
                        y6a.M(obj);
                    }
                } else {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                }
                List<FantasyRoundPlayerUiModel> list = ((ec7) ((eoh) gc7Var.h).getValue()).a;
                ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel : list) {
                    arrayList2.add(new FantasyPlayerPostModel(fantasyRoundPlayerUiModel.a, fantasyRoundPlayerUiModel.d, fantasyRoundPlayerUiModel.k, fantasyRoundPlayerUiModel.m));
                }
                wi7 wi7Var = gc7Var.e;
                int i4 = gc7Var.f;
                this.s = 2;
                wi7Var.getClass();
                P = yaa.P(new bs2(wi7Var, i4, arrayList2, null, null, 4), this);
                break;
            default:
                e1d e1dVar = gc7Var.h;
                List list2 = gc7Var.g;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    r = s9a.r(new ju6(i2, list2, rq3Var), this);
                    if (r == lu3Var2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    r = obj;
                }
                List<FantasyRoundPlayerUiModel> list3 = (List) r;
                List t0 = CollectionsKt.t0(list2, list3);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!((FantasyRoundPlayerUiModel) obj3).k) {
                        arrayList3.add(obj3);
                    }
                }
                List H0 = CollectionsKt.H0(CollectionsKt.t0(list3, arrayList3), new v66(21));
                List H02 = CollectionsKt.H0(CollectionsKt.t0(arrayList3, list3), new v66(22));
                Iterator it2 = H0.iterator();
                Iterator it3 = H02.iterator();
                ArrayList arrayList4 = new ArrayList(Math.min(k13.r(H0, 10), k13.r(H02, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    Object next = it2.next();
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) it3.next();
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = (FantasyRoundPlayerUiModel) next;
                    FantasyPlayerUiModel fantasyPlayerUiModel = fantasyRoundPlayerUiModel2.g;
                    String str = fantasyPlayerUiModel.g;
                    if (str == null) {
                        str = fantasyPlayerUiModel.f;
                    }
                    FantasyTransferPlayer fantasyTransferPlayer = new FantasyTransferPlayer(str, fantasyPlayerUiModel.b, fantasyPlayerUiModel.a, fantasyRoundPlayerUiModel2.h, fantasyRoundPlayerUiModel2.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fantasyRoundPlayerUiModel2.b, fantasyRoundPlayerUiModel2.q);
                    FantasyPlayerUiModel fantasyPlayerUiModel2 = fantasyRoundPlayerUiModel3.g;
                    String str2 = fantasyPlayerUiModel2.g;
                    if (str2 == null) {
                        str2 = fantasyPlayerUiModel2.f;
                    }
                    arrayList4.add(new FantasyTransferPlayers(new FantasyTransferPlayer(str2, fantasyPlayerUiModel2.b, fantasyPlayerUiModel2.a, fantasyRoundPlayerUiModel3.h, fantasyRoundPlayerUiModel3.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fantasyRoundPlayerUiModel3.b, fantasyRoundPlayerUiModel3.q), fantasyTransferPlayer));
                }
                Iterator it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj2 = it4.next();
                        if (((FantasyRoundPlayerUiModel) obj2).m) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4 = (FantasyRoundPlayerUiModel) obj2;
                if (fantasyRoundPlayerUiModel4 == null) {
                    fantasyRoundPlayerUiModel4 = (FantasyRoundPlayerUiModel) CollectionsKt.Y(list2);
                }
                Iterator it5 = list3.iterator();
                if (it5.hasNext()) {
                    Object next2 = it5.next();
                    if (it5.hasNext()) {
                        Float f = ((FantasyRoundPlayerUiModel) next2).q;
                        float floatValue3 = f != null ? f.floatValue() : 0.0f;
                        do {
                            Object next3 = it5.next();
                            Float f2 = ((FantasyRoundPlayerUiModel) next3).q;
                            float floatValue4 = f2 != null ? f2.floatValue() : 0.0f;
                            if (Float.compare(floatValue3, floatValue4) < 0) {
                                next2 = next3;
                                floatValue3 = floatValue4;
                            }
                        } while (it5.hasNext());
                    }
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel5 = (FantasyRoundPlayerUiModel) next2;
                    if (fantasyRoundPlayerUiModel5.a != fantasyRoundPlayerUiModel4.a) {
                        FantasyPlayerUiModel fantasyPlayerUiModel3 = fantasyRoundPlayerUiModel4.g;
                        String str3 = fantasyPlayerUiModel3.g;
                        if (str3 == null) {
                            str3 = fantasyPlayerUiModel3.f;
                        }
                        FantasyTransferPlayer fantasyTransferPlayer2 = new FantasyTransferPlayer(str3, fantasyPlayerUiModel3.b, fantasyPlayerUiModel3.a, fantasyRoundPlayerUiModel4.h, fantasyRoundPlayerUiModel4.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fantasyRoundPlayerUiModel4.b, fantasyRoundPlayerUiModel4.q);
                        FantasyPlayerUiModel fantasyPlayerUiModel4 = fantasyRoundPlayerUiModel5.g;
                        String str4 = fantasyPlayerUiModel4.g;
                        if (str4 == null) {
                            str4 = fantasyPlayerUiModel4.f;
                        }
                        fantasyTransferPlayers = new FantasyTransferPlayers(new FantasyTransferPlayer(str4, fantasyPlayerUiModel4.b, fantasyPlayerUiModel4.a, fantasyRoundPlayerUiModel5.h, fantasyRoundPlayerUiModel5.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fantasyRoundPlayerUiModel5.b, fantasyRoundPlayerUiModel5.q), fantasyTransferPlayer2);
                    } else {
                        fantasyTransferPlayers = null;
                    }
                    ArrayList arrayList5 = new ArrayList(k13.r(list3, 10));
                    for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel6 : list3) {
                        arrayList5.add(FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel6, null, 0, false, false, fantasyRoundPlayerUiModel6.a == fantasyRoundPlayerUiModel5.a, null, null, 536865791));
                    }
                    ArrayList arrayList6 = new ArrayList(k13.r(t0, 10));
                    Iterator it6 = t0.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(FantasyRoundPlayerUiModel.b((FantasyRoundPlayerUiModel) it6.next(), null, 0, false, true, false, null, null, 536865791));
                    }
                    ArrayList w0 = CollectionsKt.w0(arrayList6, arrayList5);
                    Iterator it7 = arrayList3.iterator();
                    double d = 0.0d;
                    while (it7.hasNext()) {
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel7 = (FantasyRoundPlayerUiModel) it7.next();
                        boolean z = fantasyRoundPlayerUiModel7.m;
                        Float f3 = fantasyRoundPlayerUiModel7.q;
                        if (z) {
                            if (f3 != null) {
                                floatValue2 = f3.floatValue() * 2.0d;
                            }
                            floatValue2 = 0.0d;
                        } else {
                            if (f3 != null) {
                                floatValue2 = f3.floatValue();
                            }
                            floatValue2 = 0.0d;
                        }
                        d += floatValue2;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it8 = w0.iterator();
                    while (it8.hasNext()) {
                        Object next4 = it8.next();
                        if (!((FantasyRoundPlayerUiModel) next4).k) {
                            arrayList7.add(next4);
                        }
                    }
                    Iterator it9 = arrayList7.iterator();
                    double d2 = 0.0d;
                    while (it9.hasNext()) {
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel8 = (FantasyRoundPlayerUiModel) it9.next();
                        boolean z2 = fantasyRoundPlayerUiModel8.m;
                        Float f4 = fantasyRoundPlayerUiModel8.q;
                        if (z2) {
                            if (f4 != null) {
                                floatValue = f4.floatValue() * 2.0d;
                            }
                            floatValue = 0.0d;
                        } else {
                            if (f4 != null) {
                                floatValue = f4.floatValue();
                            }
                            floatValue = 0.0d;
                        }
                        d2 += floatValue;
                    }
                    ec7 ec7Var = (ec7) ((eoh) e1dVar).getValue();
                    Float f5 = new Float((float) (d2 - d));
                    int size = arrayList4.size();
                    int i6 = fantasyTransferPlayers != null ? 1 : 0;
                    ec7Var.getClass();
                    ((eoh) e1dVar).setValue(new ec7(w0, arrayList4, fantasyTransferPlayers, f5, size + i6));
                    break;
                } else {
                    yhk.d();
                    break;
                }
        }
        return null;
    }
}
