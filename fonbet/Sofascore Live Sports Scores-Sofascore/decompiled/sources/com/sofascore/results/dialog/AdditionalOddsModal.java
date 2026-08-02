package com.sofascore.results.dialog;

import com.sofascore.results.dialog.AdditionalOddsModal;
import defpackage.duf;
import defpackage.joa;
import defpackage.otk;
import defpackage.tc3;
import defpackage.vj;
import defpackage.w1;
import defpackage.x1;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/dialog/AdditionalOddsModal;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "Lvnb;", "Luj;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdditionalOddsModal extends Hilt_AdditionalOddsModal {
    public final otk C;
    public final tc3 D;
    public final tc3 E;

    public AdditionalOddsModal() {
        final int i = 1;
        joa a = ypa.a(ysa.c, new w1(new w1(this, 1), 2));
        this.C = new otk(duf.a.getOrCreateKotlinClass(vj.class), new x1(a, 2), new y1(1, this, a), new x1(a, 3));
        final int i2 = 0;
        this.D = new tc3(1333411097, new Function2(this) { // from class: rj
            public final /* synthetic */ AdditionalOddsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i2;
                AdditionalOddsModal additionalOddsModal = this.b;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                switch (i3) {
                    case 0:
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            e1d x = rfo.x(((vj) additionalOddsModal.C.getValue()).f, av8Var, 0);
                            av8Var.d0(1507813826);
                            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
                            additionalOddsModal.F(a2, null, av8Var, 0);
                            av8Var.s(false);
                            iz8.b((vnb) x.getValue(), a2, av8Var, 0);
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        av8 av8Var2 = (av8) of3Var;
                        if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                            uj ujVar = (uj) ((vnb) rfo.x(((vj) additionalOddsModal.C.getValue()).f, av8Var2, 0).getValue()).a();
                            if (ujVar != null) {
                                av8Var2.d0(782960831);
                                iz8.a(ujVar.b, av8Var2, 0);
                                av8Var2.s(false);
                            } else {
                                av8Var2.d0(783080956);
                                av8Var2.s(false);
                            }
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true);
        this.E = new tc3(1709593670, new Function2(this) { // from class: rj
            public final /* synthetic */ AdditionalOddsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i;
                AdditionalOddsModal additionalOddsModal = this.b;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                switch (i3) {
                    case 0:
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            e1d x = rfo.x(((vj) additionalOddsModal.C.getValue()).f, av8Var, 0);
                            av8Var.d0(1507813826);
                            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
                            additionalOddsModal.F(a2, null, av8Var, 0);
                            av8Var.s(false);
                            iz8.b((vnb) x.getValue(), a2, av8Var, 0);
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        av8 av8Var2 = (av8) of3Var;
                        if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                            uj ujVar = (uj) ((vnb) rfo.x(((vj) additionalOddsModal.C.getValue()).f, av8Var2, 0).getValue()).a();
                            if (ujVar != null) {
                                av8Var2.d0(782960831);
                                iz8.a(ujVar.b, av8Var2, 0);
                                av8Var2.s(false);
                            } else {
                                av8Var2.d0(783080956);
                                av8Var2.s(false);
                            }
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
    public final tc3 getD() {
        return this.D;
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    public final Function2 I() {
        return this.E;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AdditionalOddsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
