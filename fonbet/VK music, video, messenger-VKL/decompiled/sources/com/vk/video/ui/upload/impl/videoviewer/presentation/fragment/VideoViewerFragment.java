package com.vk.video.ui.upload.impl.videoviewer.presentation.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bn50;
import xsna.bwt0;
import xsna.cck0;
import xsna.cst0;
import xsna.e3m;
import xsna.exi0;
import xsna.fpf0;
import xsna.izs;
import xsna.jrt0;
import xsna.krt0;
import xsna.lrt0;
import xsna.msy;
import xsna.nwy;
import xsna.oz50;
import xsna.qcy;
import xsna.s3q0;
import xsna.u1h0;
import xsna.uds;
import xsna.wcy;
import xsna.xds;
import xsna.xpi;

/* compiled from: VideoViewerFragment.kt */
/* loaded from: classes7.dex */
public final class VideoViewerFragment extends FragmentImpl implements xds, uds {
    public static final /* synthetic */ qcy<Object>[] P;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new cck0(this, 18));
    public final u1h0 O;

    /* compiled from: VideoViewerFragment.kt */
    public static final class a extends oz50 {
        public a(VideoViewerArguments videoViewerArguments) {
            super(VideoViewerFragment.class, null, null);
            s(true);
            this.j.putParcelable("arguments", videoViewerArguments);
        }
    }

    /* compiled from: VideoViewerFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<lrt0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(lrt0 lrt0Var) {
            lrt0 lrt0Var2 = lrt0Var;
            VideoViewerFragment videoViewerFragment = (VideoViewerFragment) this.receiver;
            qcy<Object>[] qcyVarArr = VideoViewerFragment.P;
            videoViewerFragment.getClass();
            if (!(lrt0Var2 instanceof lrt0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            VideoViewerResult videoViewerResult = ((lrt0.a) lrt0Var2).a;
            if (videoViewerResult != null) {
                Intent intent = new Intent();
                intent.putExtra("arguments", videoViewerResult);
                s3q0 s3q0Var = s3q0.a;
                videoViewerFragment.Mf(-1, intent);
            } else {
                videoViewerFragment.finish();
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoViewerFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        P = new qcy[]{propertyReference1Impl};
    }

    public VideoViewerFragment() {
        exi0 exi0Var = new exi0(this, 27);
        int i = wcy.c;
        this.O = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(VideoViewerState.class)), wcy.a.a(fpf0.d(VideoViewerState.class)), wcy.a.a(fpf0.d(jrt0.class)), wcy.a.a(fpf0.d(lrt0.class))).toString(), this, this, exi0Var);
    }

    @Override // xsna.xoo0
    public final int l2() {
        return e3m.f(R.attr.vk_ui_vkontakte_palette_black, bwt0.u(requireContext()));
    }

    @Override // xsna.woo0
    public final int o7() {
        return e3m.f(R.attr.vk_ui_vkontakte_palette_black, bwt0.u(requireContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nwy nwyVar = ((VideoViewerFragmentInternalComponent) this.N.getValue()).d;
        qcy<Object> qcyVar = VideoViewerFragmentInternalComponent.f[1];
        krt0 krt0Var = new krt0((cst0) nwyVar.c(), new b(1, this, VideoViewerFragment.class, "handleEvent", "handleEvent(Lcom/vk/video/ui/upload/impl/videoviewer/presentation/feature/entity/VideoViewerEvent;)V", 0));
        ComposeView a2 = xpi.a(layoutInflater.getContext());
        a2.setFitsSystemWindows(true);
        a2.setBackgroundColor(e3m.f(R.attr.vk_ui_vkontakte_palette_black, bwt0.u(a2.getContext())));
        qcy<Object> qcyVar2 = P[0];
        krt0Var.c((bn50) this.O.getValue(), a2);
        return a2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        qcy<Object> qcyVar = P[0];
        ((bn50) this.O.getValue()).b(jrt0.d.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        qcy<Object> qcyVar = P[0];
        ((bn50) this.O.getValue()).b(jrt0.e.b);
        super.onPause();
    }
}
