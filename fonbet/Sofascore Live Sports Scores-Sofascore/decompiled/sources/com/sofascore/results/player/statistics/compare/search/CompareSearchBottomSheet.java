package com.sofascore.results.player.statistics.compare.search;

import com.mbridge.msdk.MBridgeConstans;
import com.sofascore.results.player.statistics.compare.search.CompareSearchBottomSheet;
import defpackage.duf;
import defpackage.e73;
import defpackage.f63;
import defpackage.fuf;
import defpackage.joa;
import defpackage.otk;
import defpackage.p63;
import defpackage.pyg;
import defpackage.tc3;
import defpackage.w1;
import defpackage.x1;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/sofascore/results/player/statistics/compare/search/CompareSearchBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "", MBridgeConstans.DYNAMIC_VIEW_WX_QUERY, "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompareSearchBottomSheet extends Hilt_CompareSearchBottomSheet {
    public final otk C;
    public final otk D;
    public final joa E;
    public final joa F;
    public final joa G;
    public final tc3 H;
    public final tc3 I;

    public CompareSearchBottomSheet() {
        f63 f63Var = new f63(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new w1(f63Var, 28));
        fuf fufVar = duf.a;
        this.C = new otk(fufVar.getOrCreateKotlinClass(p63.class), new x1(a, 23), new y1(18, this, a), new x1(a, 24));
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.D = new otk(fufVar.getOrCreateKotlinClass(pyg.class), new f63(this, 0), new f63(this, 2), new f63(this, 1));
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: d63
            public final /* synthetic */ CompareSearchBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                CompareSearchBottomSheet compareSearchBottomSheet = this.b;
                switch (i4) {
                    case 0:
                        String string = compareSearchBottomSheet.requireArguments().getString("SLOT_INDEX", "First");
                        string.getClass();
                        return e93.valueOf(string);
                    case 1:
                        String string2 = compareSearchBottomSheet.requireArguments().getString("ENTITY_TYPE", "Player");
                        string2.getClass();
                        return e73.valueOf(string2);
                    default:
                        return compareSearchBottomSheet.requireArguments().getString("SPORT", "");
                }
            }
        });
        this.F = ypa.a(ysaVar, new Function0(this) { // from class: d63
            public final /* synthetic */ CompareSearchBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                CompareSearchBottomSheet compareSearchBottomSheet = this.b;
                switch (i4) {
                    case 0:
                        String string = compareSearchBottomSheet.requireArguments().getString("SLOT_INDEX", "First");
                        string.getClass();
                        return e93.valueOf(string);
                    case 1:
                        String string2 = compareSearchBottomSheet.requireArguments().getString("ENTITY_TYPE", "Player");
                        string2.getClass();
                        return e73.valueOf(string2);
                    default:
                        return compareSearchBottomSheet.requireArguments().getString("SPORT", "");
                }
            }
        });
        this.G = ypa.a(ysaVar, new Function0(this) { // from class: d63
            public final /* synthetic */ CompareSearchBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                CompareSearchBottomSheet compareSearchBottomSheet = this.b;
                switch (i4) {
                    case 0:
                        String string = compareSearchBottomSheet.requireArguments().getString("SLOT_INDEX", "First");
                        string.getClass();
                        return e93.valueOf(string);
                    case 1:
                        String string2 = compareSearchBottomSheet.requireArguments().getString("ENTITY_TYPE", "Player");
                        string2.getClass();
                        return e73.valueOf(string2);
                    default:
                        return compareSearchBottomSheet.requireArguments().getString("SPORT", "");
                }
            }
        });
        this.H = new tc3(-660059649, new Function2(this) { // from class: e63
            public final /* synthetic */ CompareSearchBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                p83 p83Var;
                int i4 = i;
                Object obj3 = nf3.a;
                switch (i4) {
                    case 0:
                        of3 of3Var = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            Object[] objArr = new Object[0];
                            Object O = av8Var.O();
                            if (O == obj3) {
                                O = new wl2(29);
                                av8Var.n0(O);
                            }
                            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, av8Var, 48);
                            String str = (String) e1dVar.getValue();
                            CompareSearchBottomSheet compareSearchBottomSheet = this.b;
                            e73 e73Var = (e73) compareSearchBottomSheet.F.getValue();
                            String str2 = (String) compareSearchBottomSheet.G.getValue();
                            e73Var.getClass();
                            int ordinal = e73Var.ordinal();
                            if (ordinal == 0) {
                                p83Var = m83.f;
                            } else if (ordinal != 1) {
                                zzl.b();
                                break;
                            } else {
                                p83Var = wyh.e(str2) ? n83.f : o83.f;
                            }
                            int i5 = p83Var.d;
                            xtc c0 = l98.c0(bkh.d(utc.a, 1.0f), 16.0f, 8.0f);
                            boolean g = av8Var.g(e1dVar) | av8Var.i(compareSearchBottomSheet);
                            Object O2 = av8Var.O();
                            if (g || O2 == obj3) {
                                O2 = new r82(4, compareSearchBottomSheet, e1dVar);
                                av8Var.n0(O2);
                            }
                            oea.d(str, (Function1) O2, c0, false, i5, 0L, av8Var, 384, 40);
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        of3 of3Var2 = (of3) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                            CompareSearchBottomSheet compareSearchBottomSheet2 = this.b;
                            pyg pygVar = (pyg) compareSearchBottomSheet2.D.getValue();
                            p63 p63Var = (p63) compareSearchBottomSheet2.C.getValue();
                            e93 e93Var = (e93) compareSearchBottomSheet2.E.getValue();
                            boolean i6 = av8Var2.i(compareSearchBottomSheet2);
                            Object O3 = av8Var2.O();
                            if (i6 || O3 == obj3) {
                                Object nyVar = new ny(0, compareSearchBottomSheet2, CompareSearchBottomSheet.class, "dismiss", "dismiss()V", 0, 2);
                                av8Var2.n0(nyVar);
                                O3 = nyVar;
                            }
                            fz8.i(pygVar, p63Var, e93Var, (Function0) ((KFunction) O3), av8Var2, 0);
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true);
        this.I = new tc3(-4487854, new Function2(this) { // from class: e63
            public final /* synthetic */ CompareSearchBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                p83 p83Var;
                int i4 = i2;
                Object obj3 = nf3.a;
                switch (i4) {
                    case 0:
                        of3 of3Var = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            Object[] objArr = new Object[0];
                            Object O = av8Var.O();
                            if (O == obj3) {
                                O = new wl2(29);
                                av8Var.n0(O);
                            }
                            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, av8Var, 48);
                            String str = (String) e1dVar.getValue();
                            CompareSearchBottomSheet compareSearchBottomSheet = this.b;
                            e73 e73Var = (e73) compareSearchBottomSheet.F.getValue();
                            String str2 = (String) compareSearchBottomSheet.G.getValue();
                            e73Var.getClass();
                            int ordinal = e73Var.ordinal();
                            if (ordinal == 0) {
                                p83Var = m83.f;
                            } else if (ordinal != 1) {
                                zzl.b();
                                break;
                            } else {
                                p83Var = wyh.e(str2) ? n83.f : o83.f;
                            }
                            int i5 = p83Var.d;
                            xtc c0 = l98.c0(bkh.d(utc.a, 1.0f), 16.0f, 8.0f);
                            boolean g = av8Var.g(e1dVar) | av8Var.i(compareSearchBottomSheet);
                            Object O2 = av8Var.O();
                            if (g || O2 == obj3) {
                                O2 = new r82(4, compareSearchBottomSheet, e1dVar);
                                av8Var.n0(O2);
                            }
                            oea.d(str, (Function1) O2, c0, false, i5, 0L, av8Var, 384, 40);
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        of3 of3Var2 = (of3) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                            CompareSearchBottomSheet compareSearchBottomSheet2 = this.b;
                            pyg pygVar = (pyg) compareSearchBottomSheet2.D.getValue();
                            p63 p63Var = (p63) compareSearchBottomSheet2.C.getValue();
                            e93 e93Var = (e93) compareSearchBottomSheet2.E.getValue();
                            boolean i6 = av8Var2.i(compareSearchBottomSheet2);
                            Object O3 = av8Var2.O();
                            if (i6 || O3 == obj3) {
                                Object nyVar = new ny(0, compareSearchBottomSheet2, CompareSearchBottomSheet.class, "dismiss", "dismiss()V", 0, 2);
                                av8Var2.n0(nyVar);
                                O3 = nyVar;
                            }
                            fz8.i(pygVar, p63Var, e93Var, (Function0) ((KFunction) O3), av8Var2, 0);
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getI() {
        return this.I;
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    public final Function2 I() {
        return this.H;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return ((e73) this.F.getValue()) == e73.a ? "PlayerSelectionModal" : "TeamSelectionModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getW() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
