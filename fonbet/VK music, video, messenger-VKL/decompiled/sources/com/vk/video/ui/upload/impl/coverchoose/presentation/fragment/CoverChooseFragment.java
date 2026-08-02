package com.vk.video.ui.upload.impl.coverchoose.presentation.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseResult;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bn50;
import xsna.bwt0;
import xsna.e3m;
import xsna.f0k;
import xsna.fpf0;
import xsna.g1k;
import xsna.i0k;
import xsna.izs;
import xsna.j0k;
import xsna.k0k;
import xsna.l0k;
import xsna.m0k;
import xsna.m3g;
import xsna.msy;
import xsna.nvg;
import xsna.nwy;
import xsna.oz50;
import xsna.qcy;
import xsna.s3q0;
import xsna.u1h0;
import xsna.uds;
import xsna.vds;
import xsna.wcy;
import xsna.xds;
import xsna.xpi;

/* compiled from: CoverChooseFragment.kt */
/* loaded from: classes7.dex */
public final class CoverChooseFragment extends FragmentImpl implements xds, uds, vds {
    public static final /* synthetic */ qcy<Object>[] P;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new m3g(this, 8));
    public final u1h0 O;

    /* compiled from: CoverChooseFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: CoverChooseFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<m0k, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(m0k m0kVar) {
            CoverChooseResult.Error.ErrorType errorType;
            m0k m0kVar2 = m0kVar;
            CoverChooseFragment coverChooseFragment = (CoverChooseFragment) this.receiver;
            qcy<Object>[] qcyVarArr = CoverChooseFragment.P;
            coverChooseFragment.getClass();
            if (m0kVar2 instanceof l0k) {
                coverChooseFragment.Mf(0, null);
            } else if (m0kVar2 instanceof j0k) {
                Intent intent = new Intent();
                intent.putExtra("arguments", new CoverChooseResult.Saved(((j0k) m0kVar2).a.getPath()));
                s3q0 s3q0Var = s3q0.a;
                coverChooseFragment.Mf(-1, intent);
            } else {
                if (!(m0kVar2 instanceof k0k)) {
                    throw new NoWhenBranchMatchedException();
                }
                k0k k0kVar = (k0k) m0kVar2;
                if (k0kVar instanceof k0k.b) {
                    errorType = CoverChooseResult.Error.ErrorType.LOAD;
                } else if (k0kVar instanceof k0k.a) {
                    errorType = CoverChooseResult.Error.ErrorType.DRAW_ON_CANVAS;
                } else {
                    if (!(k0kVar instanceof k0k.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    errorType = CoverChooseResult.Error.ErrorType.SAVE;
                }
                Intent intent2 = new Intent();
                intent2.putExtra("arguments", new CoverChooseResult.Error(errorType));
                s3q0 s3q0Var2 = s3q0.a;
                coverChooseFragment.Mf(-1, intent2);
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CoverChooseFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        P = new qcy[]{propertyReference1Impl};
    }

    public CoverChooseFragment() {
        nvg nvgVar = new nvg(this, 9);
        int i = wcy.c;
        this.O = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(CoverChooseState.class)), wcy.a.a(fpf0.d(CoverChooseState.class)), wcy.a.a(fpf0.d(f0k.class)), wcy.a.a(fpf0.d(m0k.class))).toString(), this, this, nvgVar);
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        qcy<Object> qcyVar = P[0];
        ((bn50) this.O.getValue()).b(f0k.a.b);
        return true;
    }

    @Override // xsna.xoo0
    public final int l2() {
        return e3m.f(R.attr.vk_ui_background, bwt0.u(requireContext()));
    }

    @Override // xsna.woo0
    public final int o7() {
        return e3m.f(R.attr.vk_ui_background, bwt0.u(requireContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nwy nwyVar = ((CoverChooseFragmentInternalComponent) this.N.getValue()).d;
        qcy<Object> qcyVar = CoverChooseFragmentInternalComponent.f[2];
        i0k i0kVar = new i0k((g1k) nwyVar.c(), new b(1, this, CoverChooseFragment.class, "handleEvent", "handleEvent(Lcom/vk/video/ui/upload/impl/coverchoose/presentation/feature/entity/CoverChooseEvent;)V", 0));
        ComposeView a2 = xpi.a(layoutInflater.getContext());
        qcy<Object> qcyVar2 = P[0];
        i0kVar.c((bn50) this.O.getValue(), a2);
        return a2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        qcy<Object> qcyVar = P[0];
        ((bn50) this.O.getValue()).b(f0k.c.b);
    }
}
