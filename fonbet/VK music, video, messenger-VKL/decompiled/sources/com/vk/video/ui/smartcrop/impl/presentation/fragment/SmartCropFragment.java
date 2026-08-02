package com.vk.video.ui.smartcrop.impl.presentation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bn50;
import xsna.bpn0;
import xsna.d4k0;
import xsna.dhr0;
import xsna.f4k0;
import xsna.f880;
import xsna.fnj;
import xsna.fpf0;
import xsna.g4k0;
import xsna.g7s0;
import xsna.iah0;
import xsna.ies;
import xsna.ikv0;
import xsna.izs;
import xsna.ksg0;
import xsna.m960;
import xsna.msy;
import xsna.nwy;
import xsna.oz50;
import xsna.qcy;
import xsna.r5k0;
import xsna.s3q0;
import xsna.tbe0;
import xsna.u1h0;
import xsna.uds;
import xsna.vds;
import xsna.wcy;
import xsna.x2j0;
import xsna.xds;
import xsna.xpi;

/* compiled from: SmartCropFragment.kt */
/* loaded from: classes7.dex */
public final class SmartCropFragment extends FragmentImpl implements uds, vds, xds, ies {
    public static final /* synthetic */ qcy<Object>[] Q;
    public final bpn0 N = new bpn0(new f880(this, 21));
    public final Object O = msy.a(LazyThreadSafetyMode.NONE, new x2j0(this, 1));
    public final u1h0 P;

    /* compiled from: SmartCropFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: SmartCropFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<g4k0, s3q0> {
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(g4k0 g4k0Var) {
            g4k0 g4k0Var2 = g4k0Var;
            SmartCropFragment smartCropFragment = (SmartCropFragment) this.receiver;
            qcy<Object>[] qcyVarArr = SmartCropFragment.Q;
            smartCropFragment.getClass();
            bpn0 bpn0Var = smartCropFragment.N;
            if (g4k0Var2 instanceof g4k0.b) {
                g4k0.b bVar = (g4k0.b) g4k0Var2;
                String str = bVar.a;
                boolean z = bVar.b;
                nwy nwyVar = ((SmartCropFragmentInternalComponent) smartCropFragment.O.getValue()).f;
                qcy<Object> qcyVar = SmartCropFragmentInternalComponent.h[4];
                ((g7s0) nwyVar.c()).e0(smartCropFragment.kn(), str, ((SmartCropArguments) bpn0Var.getValue()).b.o, new UserId(((SmartCropArguments) bpn0Var.getValue()).b.n), Boolean.valueOf(z), new m960(smartCropFragment, 29), new tbe0(smartCropFragment, 9));
            } else {
                if (!(g4k0Var2 instanceof g4k0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((g4k0.a) g4k0Var2).a) {
                    FragmentActivity kn = smartCropFragment.kn();
                    ikv0.a aVar = new ikv0.a(kn);
                    aVar.t = ikv0.c.b.a;
                    aVar.u = new ikv0.d(new ikv0.d.c(kn.getString(R.string.smart_crop_snackbar_load_error_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    HashSet hashSet = iah0.a;
                    if (fnj.d(kn)) {
                        aVar.k = 1;
                        aVar.g(1);
                    }
                    aVar.b().c();
                }
                smartCropFragment.finish();
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SmartCropFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        Q = new qcy[]{propertyReference1Impl};
    }

    public SmartCropFragment() {
        ksg0 ksg0Var = new ksg0(this, 4);
        int i = wcy.c;
        this.P = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(SmartCropState.class)), wcy.a.a(fpf0.d(SmartCropState.class)), wcy.a.a(fpf0.d(d4k0.class)), wcy.a.a(fpf0.d(g4k0.class))).toString(), this, this, ksg0Var);
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        eo().b(d4k0.b.b);
        return true;
    }

    public final bn50<SmartCropState, SmartCropState, d4k0, g4k0> eo() {
        qcy<Object> qcyVar = Q[0];
        return (bn50) this.P.getValue();
    }

    @Override // xsna.xoo0
    public final int l2() {
        dhr0 dhr0Var = dhr0.a;
        Context requireContext = requireContext();
        dhr0Var.getClass();
        return dhr0.Y(R.attr.vk_ui_background, dhr0.t(requireContext));
    }

    @Override // xsna.woo0
    public final int o7() {
        dhr0 dhr0Var = dhr0.a;
        Context requireContext = requireContext();
        dhr0Var.getClass();
        return dhr0.Y(R.attr.vk_ui_background, dhr0.t(requireContext));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nwy nwyVar = ((SmartCropFragmentInternalComponent) this.O.getValue()).e;
        qcy<Object> qcyVar = SmartCropFragmentInternalComponent.h[3];
        f4k0 f4k0Var = new f4k0((r5k0) nwyVar.c(), new b(1, this, SmartCropFragment.class, "handleEvent", "handleEvent(Lcom/vk/video/ui/smartcrop/impl/presentation/feature/entity/SmartCropEvent;)V", 0));
        ComposeView a2 = xpi.a(layoutInflater.getContext());
        f4k0Var.c(eo(), a2);
        return a2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        eo().b(d4k0.e.b);
        super.onDestroy();
    }
}
