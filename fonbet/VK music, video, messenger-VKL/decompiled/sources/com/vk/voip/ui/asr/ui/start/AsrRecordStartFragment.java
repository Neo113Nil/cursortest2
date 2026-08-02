package com.vk.voip.ui.asr.ui.start;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.movika.sdk.base.observable.m;
import com.vk.voip.ui.c;
import com.vk.voip.ui.utils.StaticBottomSheetFragment;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.d;
import xsna.asu0;
import xsna.dg1;
import xsna.dhr0;
import xsna.iw3;
import xsna.iz;
import xsna.jw3;
import xsna.jz;
import xsna.kf3;
import xsna.l7s;
import xsna.ov3;
import xsna.ow3;
import xsna.pv3;
import xsna.qw3;
import xsna.u8;
import xsna.v8;
import xsna.w8;
import xsna.wh1;
import xsna.y8;
import xsna.yv3;
import xsna.z8;
import xsna.zv3;

/* compiled from: AsrRecordStartFragment.kt */
/* loaded from: classes7.dex */
public final class AsrRecordStartFragment extends StaticBottomSheetFragment {
    public static final /* synthetic */ int U = 0;
    public final ov3 P;
    public ow3 Q;
    public final zv3 R;
    public final qw3 S;
    public final b T;

    public AsrRecordStartFragment() {
        c.b.getClass();
        this.P = c.G().j;
        this.R = new zv3();
        this.S = new qw3();
        this.T = new b();
    }

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment
    public final View eo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ow3 ow3Var = new ow3(requireContext(), viewGroup, new jw3(0, this, AsrRecordStartFragment.class, "dismissAllowingStateLoss", "dismissAllowingStateLoss()V", 0, 0));
        ov3 ov3Var = this.P;
        ov3Var.b();
        d<yv3> dVar = ov3Var.c;
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = new i0(dVar.a0(asu0Var.d()).U(new dg1(new w8(this, 5), 3)), new z8(new y8(1), 1)).subscribe(new jz(new iz(this, 1), 2));
        b bVar = this.T;
        bVar.b(subscribe);
        ow3Var.a();
        bVar.b(new i0(ow3Var.g.a0(asu0Var.d()).U(new kf3(new m(this, 9), 1)), new iw3(new wh1(3), 0)).subscribe(new v8(new u8(this, 6), 6)));
        this.Q = ow3Var;
        return ow3Var.c;
    }

    @Override // com.vk.voip.ui.utils.ContextHolderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        dhr0.a.getClass();
        super.onAttach(new l7s(context, dhr0.u().c));
    }

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.P.a(pv3.b.a);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.T.dispose();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ow3 ow3Var = this.Q;
        if (ow3Var != null && ow3Var.j) {
            ow3Var.i.dispose();
            ow3Var.j = false;
        }
        this.Q = null;
        this.T.e();
    }
}
