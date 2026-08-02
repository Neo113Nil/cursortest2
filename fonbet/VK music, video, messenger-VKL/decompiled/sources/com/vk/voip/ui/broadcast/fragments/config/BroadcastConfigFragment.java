package com.vk.voip.ui.broadcast.fragments.config;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.movika.sdk.base.ui.p0;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.ui.broadcast.views.config.BroadcastConfigViewParams;
import com.vk.voip.ui.c;
import com.vk.voip.ui.menu.feature.a;
import com.vk.voip.ui.utils.StaticBottomSheetFragment;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.d;
import io.reactivex.rxjava3.subjects.f;
import xsna.ad0;
import xsna.asu0;
import xsna.ayi;
import xsna.bfw0;
import xsna.bpn0;
import xsna.da;
import xsna.dj1;
import xsna.dw20;
import xsna.e05;
import xsna.eh8;
import xsna.f57;
import xsna.fo6;
import xsna.fpf0;
import xsna.ft0;
import xsna.i22;
import xsna.is1;
import xsna.js1;
import xsna.k7m;
import xsna.ke8;
import xsna.kf1;
import xsna.le8;
import xsna.lf1;
import xsna.lxi;
import xsna.m7m;
import xsna.np1;
import xsna.op1;
import xsna.pd8;
import xsna.qd8;
import xsna.r6;
import xsna.rd8;
import xsna.s9;
import xsna.t9;
import xsna.td8;
import xsna.ux0;
import xsna.w8i;
import xsna.xs6;
import xsna.y40;
import xsna.y90;
import xsna.yv2;

/* compiled from: BroadcastConfigFragment.kt */
/* loaded from: classes7.dex */
public class BroadcastConfigFragment extends StaticBottomSheetFragment implements w8i {
    public static final /* synthetic */ int U = 0;
    public ke8 P;
    public final lxi Q = new lxi();
    public final ayi R = new ayi();
    public final b S = new b();
    public final bpn0 T = new bpn0(new xs6(2));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v33, types: [android.os.Parcelable] */
    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment
    public final View eo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        d<rd8> dVar;
        Parcelable parcelable;
        Object parcelable2;
        b bVar = this.S;
        Context requireContext = requireContext();
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("isCallRecordKey") : false;
        td8 td8Var = new td8(0, this, BroadcastConfigFragment.class, "dismissAllowingStateLoss", "dismissAllowingStateLoss()V", 0, 0);
        bfw0 b = ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).getConfiguration().b();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments2.getParcelable("viewParams", BroadcastConfigViewParams.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = arguments2.getParcelable("viewParams");
                parcelable = parcelable3 instanceof BroadcastConfigViewParams ? parcelable3 : null;
            }
            r6 = (BroadcastConfigViewParams) parcelable;
        }
        ke8 ke8Var = new ke8(requireContext, viewGroup, z, td8Var, b, r6);
        bVar.b(new i0(c.I0(c.b).U(new np1(new y40(7), 4)), new e05(new f57(1), 3)).subscribe(new da(new r6(this, 11), 4)));
        pd8 pd8Var = (pd8) this.T.getValue();
        if (pd8Var != null) {
            synchronized (pd8Var) {
                if (!pd8Var.i) {
                    throw new IllegalStateException("Instance is destroyed");
                }
                dVar = pd8Var.e;
            }
            bVar.b(new i0(dVar.a0(asu0.a.d()).U(new ft0(new op1(this, 8), 4)), new ux0(new y90(4), 5)).subscribe(new lf1(new kf1(ke8Var, 5), 5)));
        }
        pd8 pd8Var2 = (pd8) this.T.getValue();
        if (pd8Var2 != null) {
            ke8Var.a();
            f<le8> fVar = ke8Var.w;
            bVar.b(new i0(fVar.a0(asu0.a.d()).U(new p0(new a(this, 9), 4)), new com.vk.movika.sdk.base.hooks.f(new dj1(3), 3)).subscribe(new is1(new s9(pd8Var2, 10), 5)));
            ke8Var.a();
            bVar.b(fVar.b0(le8.f.class).subscribe(new js1(new t9(this, 10), 7)));
            ke8Var.a();
            bVar.b(fVar.b0(le8.d.class).subscribe(new i22(new fo6(4, this, pd8Var2), 3)));
        }
        this.P = ke8Var;
        return ke8Var.f;
    }

    public final eh8 fo() {
        if (ad0.e == null) {
            c.b.getClass();
            ad0.e = new eh8(c.r, ad0.d, new bpn0(new yv2(5)), c.I());
        }
        return ad0.e;
    }

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.I0(c.b).U(new np1(new y40(7), 4));
        if (fo() != null) {
            bpn0 bpn0Var = this.T;
            if (((pd8) bpn0Var.getValue()) != null) {
                pd8 pd8Var = (pd8) bpn0Var.getValue();
                if (pd8Var != null) {
                    Bundle arguments = getArguments();
                    pd8Var.a(new qd8.d(arguments != null ? arguments.getBoolean("isCallRecordKey") : false));
                    return;
                }
                return;
            }
        }
        tn();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.S.dispose();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ke8 ke8Var = this.P;
        if (ke8Var != null && ke8Var.z) {
            ke8Var.y.dispose();
            dw20 dw20Var = ke8Var.v;
            if (dw20Var != null) {
                dw20Var.tn();
            }
            ke8Var.z = false;
        }
        this.P = null;
        this.S.e();
    }
}
