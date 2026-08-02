package com.sofascore.results.profile.predictions;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.database.VoteType;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import defpackage.bbf;
import defpackage.cbf;
import defpackage.ce;
import defpackage.de;
import defpackage.duf;
import defpackage.fbf;
import defpackage.fuf;
import defpackage.ioe;
import defpackage.joa;
import defpackage.kr9;
import defpackage.krk;
import defpackage.lk0;
import defpackage.mqi;
import defpackage.naf;
import defpackage.oo8;
import defpackage.otk;
import defpackage.p15;
import defpackage.ppa;
import defpackage.sj4;
import defpackage.taf;
import defpackage.u4g;
import defpackage.u6b;
import defpackage.uaf;
import defpackage.vce;
import defpackage.wca;
import defpackage.wxf;
import defpackage.x2e;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zzc;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/profile/predictions/ProfilePredictionsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfilePredictionsFragment extends Hilt_ProfilePredictionsFragment<oo8> {
    public final otk r;
    public final otk s;
    public boolean t;
    public int u;
    public VoteType v;
    public final joa w;
    public ConstraintLayout x;
    public final mqi y;
    public final de z;

    public ProfilePredictionsFragment() {
        final int i = 0;
        uaf uafVar = new uaf(this, 0);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new vce(uafVar, 14));
        fuf fufVar = duf.a;
        final int i2 = 1;
        this.r = new otk(fufVar.getOrCreateKotlinClass(fbf.class), new x2e(a, 17), new taf(this, a, i2), new x2e(a, 18));
        joa a2 = ypa.a(ysaVar, new vce(new uaf(this, 1), 15));
        this.s = new otk(fufVar.getOrCreateKotlinClass(u4g.class), new x2e(a2, 19), new taf(this, a2, i), new x2e(a2, 20));
        this.v = VoteType.WHO_WILL_WIN;
        this.w = ypa.a(ysaVar, new Function0(this) { // from class: paf
            public final /* synthetic */ ProfilePredictionsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                ProfilePredictionsFragment profilePredictionsFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = profilePredictionsFragment.requireContext();
                        requireContext.getClass();
                        yk ykVar = new yk(requireContext);
                        ykVar.setOnDismissListener(new j0(profilePredictionsFragment, 3));
                        return ykVar;
                    default:
                        Context requireContext2 = profilePredictionsFragment.requireContext();
                        requireContext2.getClass();
                        return new cbf(requireContext2, ((fbf) profilePredictionsFragment.r.getValue()).h, false, new t1d(profilePredictionsFragment, 18), new naf(profilePredictionsFragment, 4));
                }
            }
        });
        this.y = ypa.b(new Function0(this) { // from class: paf
            public final /* synthetic */ ProfilePredictionsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ProfilePredictionsFragment profilePredictionsFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = profilePredictionsFragment.requireContext();
                        requireContext.getClass();
                        yk ykVar = new yk(requireContext);
                        ykVar.setOnDismissListener(new j0(profilePredictionsFragment, 3));
                        return ykVar;
                    default:
                        Context requireContext2 = profilePredictionsFragment.requireContext();
                        requireContext2.getClass();
                        return new cbf(requireContext2, ((fbf) profilePredictionsFragment.r.getValue()).h, false, new t1d(profilePredictionsFragment, 18), new naf(profilePredictionsFragment, 4));
                }
            }
        });
        de registerForActivityResult = registerForActivityResult(new ce(3), new kr9(this, 24));
        registerForActivityResult.getClass();
        this.z = registerForActivityResult;
    }

    public final cbf C() {
        return (cbf) this.y.getValue();
    }

    public final u4g D() {
        return (u4g) this.s.getValue();
    }

    public final void E(int i, VoteType voteType) {
        Intent intent;
        wxf wxfVar = EventActivity.h0;
        Context requireContext = requireContext();
        requireContext.getClass();
        if (voteType != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("changeVote", true);
            intent2.putExtra("voteType", voteType);
            intent = intent2;
        } else {
            intent = null;
        }
        this.z.a(wxf.o(wxfVar, requireContext, i, null, null, null, null, intent, false, 188), null);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        u();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        int ordinal = ((fbf) this.r.getValue()).g.ordinal();
        if (ordinal == 0) {
            return "FinishedPredictionsTab";
        }
        if (ordinal == 1) {
            return "UpcomingPredictionsTab";
        }
        zzl.b();
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        l();
        krk krkVar = this.l;
        krkVar.getClass();
        int i = 0;
        ((oo8) krkVar).e.setEnabled(false);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.setAdapter(C());
        cbf C = C();
        bbf[] bbfVarArr = bbf.a;
        krk krkVar3 = this.l;
        krkVar3.getClass();
        sj4 sj4Var = new sj4(C, ((oo8) krkVar3).d);
        int i2 = 1;
        sj4Var.d = true;
        recyclerView.addItemDecoration(sj4Var);
        otk otkVar = this.r;
        this.i.b = ((fbf) otkVar.getValue()).h ? "own_profile" : "other_profile";
        ((fbf) otkVar.getValue()).i.e(getViewLifecycleOwner(), new ioe(4, new naf(this, i)));
        xw3.L(wca.x(getLifecycle()), null, null, new ppa(this, null, 25), 3);
        D().l.e(this, new ioe(4, new naf(this, i2)));
        D().h.e(getViewLifecycleOwner(), new ioe(4, new naf(this, 2)));
        zzc zzcVar = D().j;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        p15 p15Var = new p15(new naf(this, 3), i2);
        zzcVar.getClass();
        zzcVar.a.e(viewLifecycleOwner, p15Var);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        lk0 lk0Var = C().b.h;
        lk0Var.getClass();
        if (Build.ID != null) {
            Log.isLoggable("Paging", 3);
        }
        lk0Var.c.k();
    }
}
