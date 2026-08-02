package com.sofascore.results.fantasy.teammanagement.player;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.teammanagement.player.FantasyFootballPlayerTransfersBottomSheet;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import defpackage.ao7;
import defpackage.duf;
import defpackage.mqi;
import defpackage.otk;
import defpackage.ph0;
import defpackage.ps4;
import defpackage.rse;
import defpackage.s67;
import defpackage.vz6;
import defpackage.ypa;
import defpackage.yy6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/teammanagement/player/FantasyFootballPlayerTransfersBottomSheet;", "Lcom/sofascore/results/fantasy/competition/team/player/FantasyFootballPlayerBottomSheet;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyFootballPlayerTransfersBottomSheet extends FantasyFootballPlayerBottomSheet {
    public final otk D;

    public FantasyFootballPlayerTransfersBottomSheet() {
        mqi b = ypa.b(new ps4(this, 1));
        vz6 vz6Var = new vz6(b, 0);
        this.D = new otk(duf.a.getOrCreateKotlinClass(ao7.class), vz6Var, new vz6(b, 2), new vz6(b, 1));
    }

    @Override // com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet
    public final rse L() {
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = M().j;
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: uz6
            public final /* synthetic */ FantasyFootballPlayerTransfersBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                Object value;
                vn7 vn7Var;
                ArrayList arrayList;
                Object value2;
                vn7 vn7Var2;
                ArrayList arrayList2;
                int n;
                int l;
                int i2 = i;
                FantasyFootballPlayerTransfersBottomSheet fantasyFootballPlayerTransfersBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        otk otkVar = fantasyFootballPlayerTransfersBottomSheet.D;
                        ((ao7) otkVar.getValue()).z(fantasyFootballPlayerTransfersBottomSheet.M().j, true);
                        wz6 wz6Var = new wz6(((ao7) otkVar.getValue()).f.a.a, ((ao7) otkVar.getValue()).f.a.j);
                        wz6Var.a.put(SearchResponseKt.PLAYER_ENTITY, hkg.A(fantasyFootballPlayerTransfersBottomSheet.M().j));
                        v8a.D(fantasyFootballPlayerTransfersBottomSheet, wz6Var);
                        break;
                    case 1:
                        ((ao7) fantasyFootballPlayerTransfersBottomSheet.D.getValue()).z(fantasyFootballPlayerTransfersBottomSheet.M().j, false);
                        break;
                    default:
                        ao7 ao7Var = (ao7) fantasyFootballPlayerTransfersBottomSheet.D.getValue();
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = fantasyFootballPlayerTransfersBottomSheet.M().j;
                        fdi fdiVar = ao7Var.n;
                        fantasyRoundPlayerUiModel2.getClass();
                        int i3 = fantasyRoundPlayerUiModel2.a;
                        ArrayList arrayList3 = ao7Var.r;
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            obj = null;
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((zz6) obj2).b.a == i3) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        zz6 zz6Var = (zz6) obj2;
                        if (zz6Var != null) {
                            Iterator it2 = ao7Var.h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (((FantasyRoundPlayerUiModel) next).a == zz6Var.a.a) {
                                        obj = next;
                                    }
                                }
                            }
                            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = (FantasyRoundPlayerUiModel) obj;
                            if (fantasyRoundPlayerUiModel3 != null) {
                                arrayList3.remove(zz6Var);
                                do {
                                    value2 = fdiVar.getValue();
                                    vn7Var2 = (vn7) value2;
                                    gv9<FantasyRoundPlayerUiModel> gv9Var = vn7Var2.b;
                                    arrayList2 = new ArrayList(k13.r(gv9Var, 10));
                                    for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4 : gv9Var) {
                                        if (fantasyRoundPlayerUiModel4.a == i3) {
                                            fantasyRoundPlayerUiModel4 = fantasyRoundPlayerUiModel3;
                                        }
                                        arrayList2.add(fantasyRoundPlayerUiModel4);
                                    }
                                    n = ao7Var.n(((vn7) fdiVar.getValue()).g);
                                    l = ao7Var.l(((vn7) fdiVar.getValue()).g);
                                } while (!fdiVar.k(value2, vn7.a(vn7Var2, null, l6g.W(arrayList2), ao7Var.m(arrayList2), n, null, null, false, false, false, false, arrayList3.size(), l, null, null, 13297)));
                            }
                        } else {
                            do {
                                value = fdiVar.getValue();
                                vn7Var = (vn7) value;
                                gv9<FantasyRoundPlayerUiModel> gv9Var2 = vn7Var.b;
                                arrayList = new ArrayList(k13.r(gv9Var2, 10));
                                for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel5 : gv9Var2) {
                                    if (fantasyRoundPlayerUiModel5.a == i3) {
                                        fantasyRoundPlayerUiModel5 = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel5, null, 0, false, false, false, null, null, 536870891);
                                    }
                                    arrayList.add(fantasyRoundPlayerUiModel5);
                                }
                            } while (!fdiVar.k(value, vn7.a(vn7Var, null, l6g.W(arrayList), ao7Var.m(arrayList), 0, null, null, false, false, false, false, 0, 0, null, null, 16377)));
                        }
                        ao7Var.o();
                        break;
                }
                return Unit.a;
            }
        };
        final int i2 = 1;
        Function0 function02 = new Function0(this) { // from class: uz6
            public final /* synthetic */ FantasyFootballPlayerTransfersBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                Object value;
                vn7 vn7Var;
                ArrayList arrayList;
                Object value2;
                vn7 vn7Var2;
                ArrayList arrayList2;
                int n;
                int l;
                int i22 = i2;
                FantasyFootballPlayerTransfersBottomSheet fantasyFootballPlayerTransfersBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        otk otkVar = fantasyFootballPlayerTransfersBottomSheet.D;
                        ((ao7) otkVar.getValue()).z(fantasyFootballPlayerTransfersBottomSheet.M().j, true);
                        wz6 wz6Var = new wz6(((ao7) otkVar.getValue()).f.a.a, ((ao7) otkVar.getValue()).f.a.j);
                        wz6Var.a.put(SearchResponseKt.PLAYER_ENTITY, hkg.A(fantasyFootballPlayerTransfersBottomSheet.M().j));
                        v8a.D(fantasyFootballPlayerTransfersBottomSheet, wz6Var);
                        break;
                    case 1:
                        ((ao7) fantasyFootballPlayerTransfersBottomSheet.D.getValue()).z(fantasyFootballPlayerTransfersBottomSheet.M().j, false);
                        break;
                    default:
                        ao7 ao7Var = (ao7) fantasyFootballPlayerTransfersBottomSheet.D.getValue();
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = fantasyFootballPlayerTransfersBottomSheet.M().j;
                        fdi fdiVar = ao7Var.n;
                        fantasyRoundPlayerUiModel2.getClass();
                        int i3 = fantasyRoundPlayerUiModel2.a;
                        ArrayList arrayList3 = ao7Var.r;
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            obj = null;
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((zz6) obj2).b.a == i3) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        zz6 zz6Var = (zz6) obj2;
                        if (zz6Var != null) {
                            Iterator it2 = ao7Var.h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (((FantasyRoundPlayerUiModel) next).a == zz6Var.a.a) {
                                        obj = next;
                                    }
                                }
                            }
                            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = (FantasyRoundPlayerUiModel) obj;
                            if (fantasyRoundPlayerUiModel3 != null) {
                                arrayList3.remove(zz6Var);
                                do {
                                    value2 = fdiVar.getValue();
                                    vn7Var2 = (vn7) value2;
                                    gv9<FantasyRoundPlayerUiModel> gv9Var = vn7Var2.b;
                                    arrayList2 = new ArrayList(k13.r(gv9Var, 10));
                                    for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4 : gv9Var) {
                                        if (fantasyRoundPlayerUiModel4.a == i3) {
                                            fantasyRoundPlayerUiModel4 = fantasyRoundPlayerUiModel3;
                                        }
                                        arrayList2.add(fantasyRoundPlayerUiModel4);
                                    }
                                    n = ao7Var.n(((vn7) fdiVar.getValue()).g);
                                    l = ao7Var.l(((vn7) fdiVar.getValue()).g);
                                } while (!fdiVar.k(value2, vn7.a(vn7Var2, null, l6g.W(arrayList2), ao7Var.m(arrayList2), n, null, null, false, false, false, false, arrayList3.size(), l, null, null, 13297)));
                            }
                        } else {
                            do {
                                value = fdiVar.getValue();
                                vn7Var = (vn7) value;
                                gv9<FantasyRoundPlayerUiModel> gv9Var2 = vn7Var.b;
                                arrayList = new ArrayList(k13.r(gv9Var2, 10));
                                for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel5 : gv9Var2) {
                                    if (fantasyRoundPlayerUiModel5.a == i3) {
                                        fantasyRoundPlayerUiModel5 = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel5, null, 0, false, false, false, null, null, 536870891);
                                    }
                                    arrayList.add(fantasyRoundPlayerUiModel5);
                                }
                            } while (!fdiVar.k(value, vn7.a(vn7Var, null, l6g.W(arrayList), ao7Var.m(arrayList), 0, null, null, false, false, false, false, 0, 0, null, null, 16377)));
                        }
                        ao7Var.o();
                        break;
                }
                return Unit.a;
            }
        };
        final int i3 = 2;
        Function0 function03 = new Function0(this) { // from class: uz6
            public final /* synthetic */ FantasyFootballPlayerTransfersBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                Object value;
                vn7 vn7Var;
                ArrayList arrayList;
                Object value2;
                vn7 vn7Var2;
                ArrayList arrayList2;
                int n;
                int l;
                int i22 = i3;
                FantasyFootballPlayerTransfersBottomSheet fantasyFootballPlayerTransfersBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        otk otkVar = fantasyFootballPlayerTransfersBottomSheet.D;
                        ((ao7) otkVar.getValue()).z(fantasyFootballPlayerTransfersBottomSheet.M().j, true);
                        wz6 wz6Var = new wz6(((ao7) otkVar.getValue()).f.a.a, ((ao7) otkVar.getValue()).f.a.j);
                        wz6Var.a.put(SearchResponseKt.PLAYER_ENTITY, hkg.A(fantasyFootballPlayerTransfersBottomSheet.M().j));
                        v8a.D(fantasyFootballPlayerTransfersBottomSheet, wz6Var);
                        break;
                    case 1:
                        ((ao7) fantasyFootballPlayerTransfersBottomSheet.D.getValue()).z(fantasyFootballPlayerTransfersBottomSheet.M().j, false);
                        break;
                    default:
                        ao7 ao7Var = (ao7) fantasyFootballPlayerTransfersBottomSheet.D.getValue();
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = fantasyFootballPlayerTransfersBottomSheet.M().j;
                        fdi fdiVar = ao7Var.n;
                        fantasyRoundPlayerUiModel2.getClass();
                        int i32 = fantasyRoundPlayerUiModel2.a;
                        ArrayList arrayList3 = ao7Var.r;
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            obj = null;
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((zz6) obj2).b.a == i32) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        zz6 zz6Var = (zz6) obj2;
                        if (zz6Var != null) {
                            Iterator it2 = ao7Var.h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (((FantasyRoundPlayerUiModel) next).a == zz6Var.a.a) {
                                        obj = next;
                                    }
                                }
                            }
                            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = (FantasyRoundPlayerUiModel) obj;
                            if (fantasyRoundPlayerUiModel3 != null) {
                                arrayList3.remove(zz6Var);
                                do {
                                    value2 = fdiVar.getValue();
                                    vn7Var2 = (vn7) value2;
                                    gv9<FantasyRoundPlayerUiModel> gv9Var = vn7Var2.b;
                                    arrayList2 = new ArrayList(k13.r(gv9Var, 10));
                                    for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4 : gv9Var) {
                                        if (fantasyRoundPlayerUiModel4.a == i32) {
                                            fantasyRoundPlayerUiModel4 = fantasyRoundPlayerUiModel3;
                                        }
                                        arrayList2.add(fantasyRoundPlayerUiModel4);
                                    }
                                    n = ao7Var.n(((vn7) fdiVar.getValue()).g);
                                    l = ao7Var.l(((vn7) fdiVar.getValue()).g);
                                } while (!fdiVar.k(value2, vn7.a(vn7Var2, null, l6g.W(arrayList2), ao7Var.m(arrayList2), n, null, null, false, false, false, false, arrayList3.size(), l, null, null, 13297)));
                            }
                        } else {
                            do {
                                value = fdiVar.getValue();
                                vn7Var = (vn7) value;
                                gv9<FantasyRoundPlayerUiModel> gv9Var2 = vn7Var.b;
                                arrayList = new ArrayList(k13.r(gv9Var2, 10));
                                for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel5 : gv9Var2) {
                                    if (fantasyRoundPlayerUiModel5.a == i32) {
                                        fantasyRoundPlayerUiModel5 = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel5, null, 0, false, false, false, null, null, 536870891);
                                    }
                                    arrayList.add(fantasyRoundPlayerUiModel5);
                                }
                            } while (!fdiVar.k(value, vn7.a(vn7Var, null, l6g.W(arrayList), ao7Var.m(arrayList), 0, null, null, false, false, false, false, 0, 0, null, null, 16377)));
                        }
                        ao7Var.o();
                        break;
                }
                return Unit.a;
            }
        };
        fantasyRoundPlayerUiModel.getClass();
        if (fantasyRoundPlayerUiModel.v) {
            return null;
        }
        return CollectionsKt.R(ph0.a0(new yy6[]{yy6.REMOVED, yy6.TRANSFERRING_IN}), fantasyRoundPlayerUiModel.c) ? new rse(s67.k, s67.l, function03, function0) : new rse(s67.i, s67.j, function02, function0);
    }
}
