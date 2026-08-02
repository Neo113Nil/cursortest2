package com.sofascore.results.stagesport.fragments.category;

import android.os.Bundle;
import android.view.View;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.results.stagesport.fragments.category.StageCategoryOddsFragment;
import defpackage.bte;
import defpackage.duf;
import defpackage.fuf;
import defpackage.fvg;
import defpackage.g1i;
import defpackage.ioe;
import defpackage.j6i;
import defpackage.joa;
import defpackage.o1i;
import defpackage.otk;
import defpackage.ou4;
import defpackage.t1i;
import defpackage.tc3;
import defpackage.wsf;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/category/StageCategoryOddsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageCategoryOddsFragment extends Hilt_StageCategoryOddsFragment {
    public final otk r;
    public final otk s;
    public ou4 t;

    public StageCategoryOddsFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(g1i.class), new t1i(this, 0), new t1i(this, 2), new t1i(this, 1));
        joa a = ypa.a(ysa.c, new o1i(new t1i(this, 3), 1));
        this.s = new otk(fufVar.getOrCreateKotlinClass(j6i.class), new wsf(a, 9), new bte(this, a, 12), new wsf(a, 10));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(-244772510, new fvg(this, 21), true);
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
        final int i = 0;
        ((g1i) this.r.getValue()).i.e(getViewLifecycleOwner(), new ioe(8, new Function1(this) { // from class: s1i
            public final /* synthetic */ StageCategoryOddsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        StageSeason stageSeason = (StageSeason) CollectionsKt.firstOrNull(((f1i) obj).a);
                        if (stageSeason != null) {
                            this.b.D().n(new Stage(stageSeason.getDescription(), ServerType.SEASON, null, stageSeason.getId(), null, null));
                        }
                        break;
                    default:
                        b6i b6iVar = (b6i) obj;
                        StageCategoryOddsFragment stageCategoryOddsFragment = this.b;
                        f6i k = stageCategoryOddsFragment.D().k();
                        Stage stage = stageCategoryOddsFragment.D().g;
                        if (stage != null) {
                            ou4 ou4Var = stageCategoryOddsFragment.t;
                            if (ou4Var != null) {
                                ou4Var.b();
                            }
                            ou4 ou4Var2 = new ou4(1);
                            stageCategoryOddsFragment.t = ou4Var2;
                            ou4Var2.c(stageCategoryOddsFragment.isResumed(), new m61(stageCategoryOddsFragment, stage, b6iVar, k, 22));
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i2 = 1;
        D().m.e(getViewLifecycleOwner(), new ioe(8, new Function1(this) { // from class: s1i
            public final /* synthetic */ StageCategoryOddsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        StageSeason stageSeason = (StageSeason) CollectionsKt.firstOrNull(((f1i) obj).a);
                        if (stageSeason != null) {
                            this.b.D().n(new Stage(stageSeason.getDescription(), ServerType.SEASON, null, stageSeason.getId(), null, null));
                        }
                        break;
                    default:
                        b6i b6iVar = (b6i) obj;
                        StageCategoryOddsFragment stageCategoryOddsFragment = this.b;
                        f6i k = stageCategoryOddsFragment.D().k();
                        Stage stage = stageCategoryOddsFragment.D().g;
                        if (stage != null) {
                            ou4 ou4Var = stageCategoryOddsFragment.t;
                            if (ou4Var != null) {
                                ou4Var.b();
                            }
                            ou4 ou4Var2 = new ou4(1);
                            stageCategoryOddsFragment.t = ou4Var2;
                            ou4Var2.c(stageCategoryOddsFragment.isResumed(), new m61(stageCategoryOddsFragment, stage, b6iVar, k, 22));
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
