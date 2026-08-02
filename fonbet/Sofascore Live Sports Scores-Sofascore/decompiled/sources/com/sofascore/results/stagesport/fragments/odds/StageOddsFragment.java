package com.sofascore.results.stagesport.fragments.odds;

import android.os.Bundle;
import android.view.View;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.stagesport.fragments.odds.StageOddsFragment;
import defpackage.bte;
import defpackage.duf;
import defpackage.fuf;
import defpackage.fvg;
import defpackage.ioe;
import defpackage.j6i;
import defpackage.joa;
import defpackage.n4i;
import defpackage.o1i;
import defpackage.otk;
import defpackage.ou4;
import defpackage.t5i;
import defpackage.tc3;
import defpackage.wsf;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/odds/StageOddsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageOddsFragment extends Hilt_StageOddsFragment {
    public final otk r;
    public final otk s;
    public ou4 t;

    public StageOddsFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(n4i.class), new t5i(this, 0), new t5i(this, 2), new t5i(this, 1));
        joa a = ypa.a(ysa.c, new o1i(new t5i(this, 3), 11));
        this.s = new otk(fufVar.getOrCreateKotlinClass(j6i.class), new wsf(a, 23), new bte(this, a, 19), new wsf(a, 24));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(-434428984, new fvg(this, 27), true);
    }

    public final j6i D() {
        return (j6i) this.s.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ou4 ou4Var = this.t;
        if (ou4Var != null) {
            ou4Var.b();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ou4 ou4Var = this.t;
        if (ou4Var != null) {
            ou4Var.f();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "AdditionalOddsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        otk otkVar = this.r;
        final int i = 0;
        ((n4i) otkVar.getValue()).m.e(getViewLifecycleOwner(), new ioe(15, new Function1(this) { // from class: s5i
            public final /* synthetic */ StageOddsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                StageOddsFragment stageOddsFragment = this.b;
                switch (i2) {
                    case 0:
                        Stage stage = (Stage) obj;
                        j6i D = stageOddsFragment.D();
                        stage.getClass();
                        D.n(stage);
                        break;
                    case 1:
                        List list = (List) obj;
                        j6i D2 = stageOddsFragment.D();
                        list.getClass();
                        D2.h = list;
                        if (D2.g != null) {
                            xw3.L(un0.z(D2), null, null, new i6i(D2, null, 1), 3);
                        }
                        break;
                    default:
                        b6i b6iVar = (b6i) obj;
                        StageOddsFragment stageOddsFragment2 = this.b;
                        f6i k = stageOddsFragment2.D().k();
                        Stage stage2 = stageOddsFragment2.D().g;
                        if (stage2 != null) {
                            ou4 ou4Var = stageOddsFragment2.t;
                            if (ou4Var != null) {
                                ou4Var.b();
                            }
                            ou4 ou4Var2 = new ou4(1);
                            stageOddsFragment2.t = ou4Var2;
                            ou4Var2.c(stageOddsFragment2.isResumed(), new m61(stageOddsFragment2, stage2, b6iVar, k, 23));
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i2 = 1;
        ((n4i) otkVar.getValue()).o.e(getViewLifecycleOwner(), new ioe(15, new Function1(this) { // from class: s5i
            public final /* synthetic */ StageOddsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                StageOddsFragment stageOddsFragment = this.b;
                switch (i22) {
                    case 0:
                        Stage stage = (Stage) obj;
                        j6i D = stageOddsFragment.D();
                        stage.getClass();
                        D.n(stage);
                        break;
                    case 1:
                        List list = (List) obj;
                        j6i D2 = stageOddsFragment.D();
                        list.getClass();
                        D2.h = list;
                        if (D2.g != null) {
                            xw3.L(un0.z(D2), null, null, new i6i(D2, null, 1), 3);
                        }
                        break;
                    default:
                        b6i b6iVar = (b6i) obj;
                        StageOddsFragment stageOddsFragment2 = this.b;
                        f6i k = stageOddsFragment2.D().k();
                        Stage stage2 = stageOddsFragment2.D().g;
                        if (stage2 != null) {
                            ou4 ou4Var = stageOddsFragment2.t;
                            if (ou4Var != null) {
                                ou4Var.b();
                            }
                            ou4 ou4Var2 = new ou4(1);
                            stageOddsFragment2.t = ou4Var2;
                            ou4Var2.c(stageOddsFragment2.isResumed(), new m61(stageOddsFragment2, stage2, b6iVar, k, 23));
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i3 = 2;
        D().m.e(getViewLifecycleOwner(), new ioe(15, new Function1(this) { // from class: s5i
            public final /* synthetic */ StageOddsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i3;
                StageOddsFragment stageOddsFragment = this.b;
                switch (i22) {
                    case 0:
                        Stage stage = (Stage) obj;
                        j6i D = stageOddsFragment.D();
                        stage.getClass();
                        D.n(stage);
                        break;
                    case 1:
                        List list = (List) obj;
                        j6i D2 = stageOddsFragment.D();
                        list.getClass();
                        D2.h = list;
                        if (D2.g != null) {
                            xw3.L(un0.z(D2), null, null, new i6i(D2, null, 1), 3);
                        }
                        break;
                    default:
                        b6i b6iVar = (b6i) obj;
                        StageOddsFragment stageOddsFragment2 = this.b;
                        f6i k = stageOddsFragment2.D().k();
                        Stage stage2 = stageOddsFragment2.D().g;
                        if (stage2 != null) {
                            ou4 ou4Var = stageOddsFragment2.t;
                            if (ou4Var != null) {
                                ou4Var.b();
                            }
                            ou4 ou4Var2 = new ou4(1);
                            stageOddsFragment2.t = ou4Var2;
                            ou4Var2.c(stageOddsFragment2.isResumed(), new m61(stageOddsFragment2, stage2, b6iVar, k, 23));
                        }
                        break;
                }
                return Unit.a;
            }
        }));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        D().l(false);
    }
}
