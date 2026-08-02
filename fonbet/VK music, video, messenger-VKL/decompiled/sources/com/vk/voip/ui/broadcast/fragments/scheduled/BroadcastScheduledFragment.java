package com.vk.voip.ui.broadcast.fragments.scheduled;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.movika.sdk.base.hooks.p;
import com.vk.movika.sdk.base.ui.j;
import com.vk.voip.ui.utils.StaticBottomSheetFragment;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.d;
import xsna.asu0;
import xsna.bpn0;
import xsna.cp0;
import xsna.dh5;
import xsna.dhr0;
import xsna.dvt0;
import xsna.hi8;
import xsna.ii8;
import xsna.ivq;
import xsna.j22;
import xsna.k00;
import xsna.l7s;
import xsna.m40;
import xsna.o40;
import xsna.o6;
import xsna.p40;
import xsna.pd;
import xsna.pd8;
import xsna.r41;
import xsna.rd8;
import xsna.t00;
import xsna.t40;
import xsna.ve0;

/* compiled from: BroadcastScheduledFragment.kt */
/* loaded from: classes7.dex */
public class BroadcastScheduledFragment extends StaticBottomSheetFragment {
    public static final /* synthetic */ int U = 0;
    public hi8 P;
    public final ivq Q = new ivq();
    public final dvt0 R = new dvt0();
    public final b S = new b();
    public final bpn0 T = new bpn0(new o6(4));

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment
    public final View eo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        d<rd8> dVar;
        this.P = new hi8(requireContext(), viewGroup);
        pd8 pd8Var = (pd8) this.T.getValue();
        synchronized (pd8Var) {
            if (!pd8Var.i) {
                throw new IllegalStateException("Instance is destroyed");
            }
            dVar = pd8Var.e;
        }
        asu0 asu0Var = asu0.a;
        c subscribe = new i0(dVar.a0(asu0Var.d()).U(new m40(new p(this, 16), 4)), new o40(new dh5(1), 3)).subscribe(new cp0(new p40(this, 17), 7));
        b bVar = this.S;
        bVar.b(subscribe);
        hi8 hi8Var = this.P;
        hi8Var.a();
        bVar.b(new i0(hi8Var.d.a0(asu0Var.d()).U(new j(new k00(this, 12), 7)), new r41(new ve0(7), 9)).subscribe(new t00(new t40(this, 6), 4)));
        hi8 hi8Var2 = this.P;
        hi8Var2.a();
        bVar.b(hi8Var2.d.b0(ii8.a.class).subscribe(new j22(new pd(this, 13), 8)));
        return this.P.a;
    }

    @Override // com.vk.voip.ui.utils.ContextHolderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        dhr0.a.getClass();
        super.onAttach(new l7s(context, dhr0.u().c));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.S.dispose();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        hi8 hi8Var = this.P;
        if (hi8Var != null) {
            hi8Var.h = false;
        }
        this.P = null;
        this.S.e();
    }
}
