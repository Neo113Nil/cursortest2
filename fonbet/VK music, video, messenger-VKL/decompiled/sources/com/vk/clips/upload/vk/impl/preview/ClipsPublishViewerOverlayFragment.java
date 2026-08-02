package com.vk.clips.upload.vk.impl.preview;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.clips.upload.vk.api.navigation.preview.ClipPreviewInputParams;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.b0f;
import xsna.bwt0;
import xsna.c0f;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4z;
import xsna.fpf0;
import xsna.fre;
import xsna.gy0;
import xsna.il1;
import xsna.km50;
import xsna.lze;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.nds;
import xsna.nf3;
import xsna.oz50;
import xsna.qcy;
import xsna.sze;
import xsna.tze;
import xsna.uds;
import xsna.vds;
import xsna.vk50;
import xsna.vze;

/* compiled from: ClipsPublishViewerOverlayFragment.kt */
/* loaded from: classes.dex */
public final class ClipsPublishViewerOverlayFragment extends MviImplFragment<tze, c0f, lze> implements vds, nds, uds {
    public static final /* synthetic */ qcy<Object>[] T;
    public final nf3 Q = new nf3();
    public final Object R;
    public final Object S;

    /* compiled from: ClipsPublishViewerOverlayFragment.kt */
    /* loaded from: classes17.dex */
    public static final class a extends oz50 {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ClipsPublishViewerOverlayFragment.class, "contentView", "getContentView()Lcom/vk/clips/upload/vk/impl/preview/compose/ClipsPublishViewerOverlayView;", 0);
        fpf0.a.getClass();
        T = new qcy[]{mutablePropertyReference1Impl};
    }

    public ClipsPublishViewerOverlayFragment() {
        il1 il1Var = new il1(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, il1Var);
        this.S = msy.a(lazyThreadSafetyMode, new gy0(this, 26));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        b0f b0fVar = new b0f(requireContext(), this, ((Boolean) this.S.getValue()).booleanValue(), new c0f.b(((ClipPreviewInputParams) this.R.getValue()).d()));
        qcy<Object> qcyVar = T[0];
        nf3 nf3Var = this.Q;
        nf3Var.c = b0fVar;
        return new mk50.c(((b0f) nf3Var.getValue(this, qcyVar)).getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((b0f) this.Q.getValue(this, T[0])).f((c0f) ao50Var, new vze(this));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((f4z) ((tze) vk50Var).U()).a(new fre(this, 3), this);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return !dhr0.a.c(requireContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        if (!((Boolean) this.S.getValue()).booleanValue()) {
            return super.mo2getContext();
        }
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext != null) {
            return bwt0.u(mo2getContext);
        }
        return null;
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return e3m.f(R.attr.vk_ui_background_content, requireContext());
    }

    @Override // xsna.woo0
    public final int o7() {
        if (dhr0.a.c(requireContext())) {
            Context requireContext = requireContext();
            e3m.a aVar = e3m.a;
            return requireContext.getColor(R.color.vk_black);
        }
        Context requireContext2 = requireContext();
        e3m.a aVar2 = e3m.a;
        return requireContext2.getColor(R.color.vk_white);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        sze szeVar = new sze(m7m.d(this));
        return new tze((ClipPreviewInputParams) this.R.getValue(), szeVar.a().Yb(requireContext().getApplicationContext(), "publish-overlay-preview-player"), szeVar);
    }
}
