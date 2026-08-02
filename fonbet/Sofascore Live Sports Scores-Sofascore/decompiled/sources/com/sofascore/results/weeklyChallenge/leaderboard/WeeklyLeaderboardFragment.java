package com.sofascore.results.weeklyChallenge.leaderboard;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import defpackage.bnk;
import defpackage.ce;
import defpackage.csk;
import defpackage.de;
import defpackage.duf;
import defpackage.joa;
import defpackage.krk;
import defpackage.kt4;
import defpackage.lqj;
import defpackage.otk;
import defpackage.p15;
import defpackage.q4l;
import defpackage.qn3;
import defpackage.r1;
import defpackage.r4l;
import defpackage.rn3;
import defpackage.rq3;
import defpackage.s4l;
import defpackage.sn3;
import defpackage.t4l;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.uri;
import defpackage.wca;
import defpackage.wrh;
import defpackage.yia;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z41;
import defpackage.zzc;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/leaderboard/WeeklyLeaderboardFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lwrh;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeeklyLeaderboardFragment extends Hilt_WeeklyLeaderboardFragment<wrh> {
    public sn3 r;
    public final otk s = new otk(duf.a.getOrCreateKotlinClass(WeeklyChallengeViewModel.class), new t4l(this, 0), new t4l(this, 2), new t4l(this, 1));
    public final de t;
    public final joa u;
    public uri v;

    public WeeklyLeaderboardFragment() {
        de registerForActivityResult = registerForActivityResult(new ce(3), new bnk(this, 3));
        registerForActivityResult.getClass();
        this.t = registerForActivityResult;
        this.u = ypa.a(ysa.c, new q4l(this, 4));
    }

    public final sn3 C() {
        sn3 sn3Var = this.r;
        if (sn3Var != null) {
            return sn3Var;
        }
        Intrinsics.i("consumablePurchaseHelper");
        throw null;
    }

    public final WeeklyChallengeViewModel D() {
        return (WeeklyChallengeViewModel) this.s.getValue();
    }

    public final void E(WeeklyChallengeViewModel.LeaderboardInfoType leaderboardInfoType) {
        Context requireContext = requireContext();
        requireContext.getClass();
        leaderboardInfoType.getClass();
        LeaderboardInfoModal leaderboardInfoModal = new LeaderboardInfoModal();
        Bundle bundle = new Bundle();
        bundle.putSerializable("info_type", leaderboardInfoType);
        leaderboardInfoModal.setArguments(bundle);
        if (requireContext instanceof csk) {
            requireContext = ((csk) requireContext).getBaseContext();
        }
        rq3 rq3Var = null;
        AppCompatActivity appCompatActivity = requireContext instanceof AppCompatActivity ? (AppCompatActivity) requireContext : null;
        if (appCompatActivity != null) {
            wca.x(appCompatActivity.getLifecycle()).b(new r1(leaderboardInfoModal, appCompatActivity, rq3Var, 3));
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return wrh.b(getLayoutInflater(), null, false);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        sn3 C = C();
        BillingClient billingClient = C.g;
        if (billingClient != null) {
            if (!billingClient.isReady()) {
                billingClient = null;
            }
            if (billingClient != null) {
                billingClient.endConnection();
            }
        }
        C.g = null;
        C.c = null;
        C.d = null;
        WeakReference weakReference = C.j;
        if (weakReference != null) {
            weakReference.clear();
        }
        C.j = null;
        this.v = null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f) {
            u();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        FragmentActivity requireActivity = requireActivity();
        BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
        if (baseActivity != null) {
            sn3 C = C();
            C.j = new WeakReference(baseActivity);
            BillingClient billingClient = C.g;
            int i = 1;
            if (billingClient == null) {
                billingClient = BillingClient.newBuilder(C.a).setListener(new qn3(C, i)).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
                C.g = billingClient;
            }
            rn3 rn3Var = new rn3(C, 0);
            if (billingClient != null && billingClient.isReady()) {
                rn3Var.invoke();
                return;
            }
            BillingClient billingClient2 = C.g;
            if (billingClient2 != null) {
                billingClient2.startConnection(new z41(16, C, rn3Var));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        sn3 C = C();
        BillingClient billingClient = C.g;
        if (billingClient != null) {
            if (!billingClient.isReady()) {
                billingClient = null;
            }
            if (billingClient != null) {
                billingClient.endConnection();
            }
        }
        C.g = null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "CurrentWeekTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        this.v = new uri(this, 19);
        sn3 C = C();
        yia yiaVar = new yia(this, 29);
        uri uriVar = this.v;
        C.c = yiaVar;
        C.d = uriVar;
        getParentFragmentManager().i0("REQUEST_REFRESH", this, new kt4(new lqj(this, 16), 25));
        krk krkVar = this.l;
        krkVar.getClass();
        ComposeView composeView = ((wrh) krkVar).b;
        composeView.setBackgroundColor(0);
        composeView.setContent(new tc3(139307058, new s4l(this, composeView, 0), true));
        zzc zzcVar = D().C;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        p15 p15Var = new p15(new r4l(this, 2), 1);
        zzcVar.getClass();
        zzcVar.a.e(viewLifecycleOwner, p15Var);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        D().m();
        if (((Boolean) D().s.a.getValue()).booleanValue()) {
            C().a();
        }
    }
}
