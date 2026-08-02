package com.vk.clips.editor.templates.impl.views.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.editor.TransformOverlayView;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.design.view.templates.ClipsTemplateEditorCropperView;
import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.clips.editor.templates.impl.domain.ClipsVideoTemplateEditorInputModel;
import com.vk.clips.editor.templates.impl.domain.ShortVideoTemplateFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.movika.sdk.base.observable.w;
import com.vkontakte.android.R;
import defpackage.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.a7f;
import xsna.a9o0;
import xsna.aeg0;
import xsna.bwt0;
import xsna.c5g;
import xsna.c8f;
import xsna.d3m;
import xsna.dc50;
import xsna.dhr0;
import xsna.e43;
import xsna.f2l0;
import xsna.f4m;
import xsna.gzs;
import xsna.iah0;
import xsna.ies;
import xsna.ih40;
import xsna.inf;
import xsna.iz;
import xsna.j0;
import xsna.j6f;
import xsna.ja6;
import xsna.k6f;
import xsna.k7f;
import xsna.kf3;
import xsna.l7f;
import xsna.lpj;
import xsna.mgi;
import xsna.mre;
import xsna.msy;
import xsna.mwt0;
import xsna.n7f;
import xsna.nal0;
import xsna.nbl0;
import xsna.nds;
import xsna.nov;
import xsna.o7f;
import xsna.o93;
import xsna.oz50;
import xsna.p6f;
import xsna.pi0;
import xsna.pz;
import xsna.r8f;
import xsna.rdi;
import xsna.s0w0;
import xsna.s3q0;
import xsna.s8f;
import xsna.som0;
import xsna.tb0;
import xsna.u6f;
import xsna.uds;
import xsna.vds;
import xsna.w8;
import xsna.wje;
import xsna.xo2;
import xsna.xwt0;
import xsna.y6f;
import xsna.y7f;
import xsna.y8o0;
import xsna.z6f;
import xsna.z8d;

/* compiled from: ClipsTemplateEditorFragment.kt */
/* loaded from: classes16.dex */
public final class ClipsTemplateEditorFragment extends FragmentImpl implements vds, nds, uds, ies, tb0, k6f {
    public static final /* synthetic */ int h0 = 0;
    public View O;
    public ClipsTemplateEditorFragmentsBottomView P;
    public ClipsTemplateEditorCropperView Q;
    public View R;
    public View S;
    public View T;
    public View U;
    public VkText V;
    public VkButton W;
    public VkButton X;
    public VkButton Y;
    public s8f Z;
    public FrameLayout a0;
    public som0 b0;
    public TransformOverlayView c0;
    public View d0;
    public ClipsStickersView e0;
    public a9o0 f0;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new e(this, 24));
    public final int g0 = -16777216;

    /* compiled from: ClipsTemplateEditorFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(ClipsTemplateEditorFragment.class, null, null);
        }

        public final void y(ClipsVideoTemplateEditorInputModel clipsVideoTemplateEditorInputModel) {
            this.j.putParcelable("key_args", clipsVideoTemplateEditorInputModel);
        }
    }

    /* compiled from: ClipsTemplateEditorFragment.kt */
    public final class b implements c8f.a {
        public b() {
        }

        @Override // xsna.c8f.a
        public final int getLayoutHeight() {
            FrameLayout frameLayout = ClipsTemplateEditorFragment.this.a0;
            if (frameLayout == null) {
                return 0;
            }
            return frameLayout.getHeight() > 0 ? frameLayout.getHeight() : frameLayout.getMeasuredHeight();
        }

        @Override // xsna.c8f.a
        public final int getLayoutWidth() {
            FrameLayout frameLayout = ClipsTemplateEditorFragment.this.a0;
            if (frameLayout == null) {
                return 0;
            }
            return frameLayout.getWidth() > 0 ? frameLayout.getWidth() : frameLayout.getMeasuredWidth();
        }
    }

    @Override // xsna.k6f
    public final void Ai(y7f.f fVar) {
        ClipsTemplateEditorCropperView clipsTemplateEditorCropperView = this.Q;
        if (clipsTemplateEditorCropperView == null) {
            clipsTemplateEditorCropperView = null;
        }
        clipsTemplateEditorCropperView.setProvider(fVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.pbs, xsna.k6f
    public final Context B() {
        Context requireContext = requireContext();
        dhr0.a.getClass();
        return new lpj(requireContext, dhr0.u().c);
    }

    @Override // xsna.k6f
    public final void B4(n7f n7fVar) {
        n7f b2;
        ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem;
        z8d b3;
        ClipsTemplateEditorCropperView clipsTemplateEditorCropperView = this.Q;
        if (clipsTemplateEditorCropperView == null) {
            clipsTemplateEditorCropperView = null;
        }
        z6f z6fVar = clipsTemplateEditorCropperView.t;
        a7f a7fVar = z6fVar.c;
        if (a7fVar == null || (b2 = a7fVar.b()) == null || (clipsTemplateEditorVideoItem = n7fVar.c) == null) {
            return;
        }
        int i = a7fVar.c;
        dc50 dc50Var = a7fVar.a;
        ShortVideoTemplateFragment shortVideoTemplateFragment = n7fVar.b;
        u6f u6fVar = new u6f(i, dc50Var, n7fVar, shortVideoTemplateFragment.b, shortVideoTemplateFragment.d() / clipsTemplateEditorVideoItem.e);
        y6f y6fVar = z6fVar.a.x;
        y6fVar.d = rdi.I(i, u6fVar, y6fVar.d);
        y6fVar.notifyItemChanged(i);
        z6fVar.d(b2);
        p6f p6fVar = z6fVar.d;
        if (p6fVar == null || (b3 = p6fVar.b()) == null) {
            return;
        }
        b3.f();
    }

    @Override // xsna.k6f
    public final boolean B8() {
        ClipsTemplateEditorCropperView clipsTemplateEditorCropperView = this.Q;
        if (clipsTemplateEditorCropperView == null) {
            clipsTemplateEditorCropperView = null;
        }
        return bwt0.K(clipsTemplateEditorCropperView);
    }

    @Override // xsna.k6f
    public final void D8() {
        ClipsTemplateEditorCropperView clipsTemplateEditorCropperView = this.Q;
        if (clipsTemplateEditorCropperView == null) {
            clipsTemplateEditorCropperView = null;
        }
        z6f z6fVar = clipsTemplateEditorCropperView.t;
        p6f p6fVar = z6fVar.d;
        r8f videoView = p6fVar != null ? p6fVar.getVideoView() : null;
        p6f p6fVar2 = z6fVar.d;
        z8d b2 = p6fVar2 != null ? p6fVar2.b() : null;
        if (videoView == null || b2 == null) {
            return;
        }
        b2.e = 0L;
        p6f p6fVar3 = z6fVar.d;
        if (p6fVar3 != null) {
            p6fVar3.c();
        }
    }

    @Override // xsna.k6f
    public final int Fd() {
        FrameLayout frameLayout = this.a0;
        if (frameLayout == null) {
            return 0;
        }
        return iah0.a(10) + (iah0.f().heightPixels - frameLayout.getBottom());
    }

    @Override // xsna.k6f
    public final void H5() {
        VkText vkText = this.V;
        if (vkText == null) {
            vkText = null;
        }
        vkText.setVisibility(0);
    }

    @Override // xsna.k6f
    public final void Hi(a7f a7fVar) {
        ClipsTemplateEditorCropperView clipsTemplateEditorCropperView = this.Q;
        if (clipsTemplateEditorCropperView == null) {
            clipsTemplateEditorCropperView = null;
        }
        z6f z6fVar = clipsTemplateEditorCropperView.t;
        ClipsTemplateEditorCropperView clipsTemplateEditorCropperView2 = z6fVar.a;
        int i = a7fVar.c;
        z6fVar.c = a7fVar;
        List<n7f> list = a7fVar.b;
        List<n7f> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            n7f n7fVar = (n7f) obj;
            dc50 dc50Var = a7fVar.a;
            ShortVideoTemplateFragment shortVideoTemplateFragment = n7fVar.b;
            arrayList.add(new u6f(i2, dc50Var, n7fVar, shortVideoTemplateFragment.b, shortVideoTemplateFragment.d() / n7fVar.c.e));
            i2 = i3;
            clipsTemplateEditorCropperView2 = clipsTemplateEditorCropperView2;
        }
        ClipsTemplateEditorCropperView clipsTemplateEditorCropperView3 = clipsTemplateEditorCropperView2;
        clipsTemplateEditorCropperView3.setPagerItems(arrayList);
        clipsTemplateEditorCropperView3.Q4(i, false);
        z6fVar.d(list.get(i));
    }

    @Override // xsna.k6f
    public final void Jl(a7f a7fVar) {
        ClipsTemplateEditorCropperView clipsTemplateEditorCropperView = this.Q;
        if (clipsTemplateEditorCropperView == null || clipsTemplateEditorCropperView == null) {
            clipsTemplateEditorCropperView = null;
        }
        if (clipsTemplateEditorCropperView != null) {
            clipsTemplateEditorCropperView.setState(a7fVar);
        }
    }

    @Override // xsna.k6f
    public final void Mm(List<o7f> list) {
        ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView = this.P;
        if (clipsTemplateEditorFragmentsBottomView == null) {
            clipsTemplateEditorFragmentsBottomView = null;
        }
        com.vk.lists.a<o7f> aVar = clipsTemplateEditorFragmentsBottomView.f;
        aVar.setItems(list);
        aVar.a();
        clipsTemplateEditorFragmentsBottomView.c();
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // xsna.k6f
    public final void Ui(boolean z, gzs<s3q0> gzsVar) {
        s8f s8fVar = this.Z;
        if (s8fVar == null) {
            s8fVar = null;
        }
        if (s8fVar.h()) {
            View view = this.S;
            if (view == null) {
                view = null;
            }
            f4m.j(view);
        } else {
            View view2 = this.S;
            if (view2 == null) {
                view2 = null;
            }
            view2.setVisibility(0);
        }
        if (z) {
            VkButton vkButton = this.W;
            d3m.e(vkButton == null ? null : vkButton, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
            VkButton vkButton2 = this.X;
            if (vkButton2 == null) {
                vkButton2 = null;
            }
            vkButton2.setVisibility(0);
            VkButton vkButton3 = this.Y;
            if (vkButton3 == null) {
                vkButton3 = null;
            }
            f4m.j(vkButton3);
            VkText vkText = this.V;
            if (vkText == null) {
                vkText = null;
            }
            vkText.setText(getString(R.string.clips_template_editor_under_video_cropper_text));
            ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView = this.P;
            d3m.e(clipsTemplateEditorFragmentsBottomView == null ? null : clipsTemplateEditorFragmentsBottomView, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            ClipsTemplateEditorCropperView clipsTemplateEditorCropperView = this.Q;
            d3m.c(clipsTemplateEditorCropperView == null ? null : clipsTemplateEditorCropperView, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new ja6(gzsVar, 3), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View view3 = this.T;
            d3m.c(view3 == null ? null : view3, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View view4 = this.U;
            d3m.c(view4 == null ? null : view4, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View view5 = this.O;
            if (view5 == null) {
                view5 = null;
            }
            f4m.j(view5);
            ClipsStickersView clipsStickersView = this.e0;
            if (clipsStickersView == null) {
                clipsStickersView = null;
            }
            clipsStickersView.setOnMotionEventListener(new kf3(this, 11));
            ClipsStickersView clipsStickersView2 = this.e0;
            (clipsStickersView2 != null ? clipsStickersView2 : null).setOnEmptySpaceClickListener(new pi0(this, 15));
            return;
        }
        VkButton vkButton4 = this.W;
        d3m.c(vkButton4 == null ? null : vkButton4, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        VkButton vkButton5 = this.X;
        if (vkButton5 == null) {
            vkButton5 = null;
        }
        f4m.j(vkButton5);
        VkButton vkButton6 = this.Y;
        if (vkButton6 == null) {
            vkButton6 = null;
        }
        vkButton6.setVisibility(0);
        VkText vkText2 = this.V;
        if (vkText2 == null) {
            vkText2 = null;
        }
        vkText2.setText(getString(R.string.clips_template_editor_under_video_text));
        ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView2 = this.P;
        d3m.c(clipsTemplateEditorFragmentsBottomView2 == null ? null : clipsTemplateEditorFragmentsBottomView2, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ClipsTemplateEditorCropperView clipsTemplateEditorCropperView2 = this.Q;
        d3m.e(clipsTemplateEditorCropperView2 == null ? null : clipsTemplateEditorCropperView2, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        View view6 = this.R;
        d3m.e(view6 == null ? null : view6, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        View view7 = this.T;
        d3m.e(view7 == null ? null : view7, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        View view8 = this.U;
        d3m.e(view8 == null ? null : view8, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new j0(this, 5), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        ClipsStickersView clipsStickersView3 = this.e0;
        if (clipsStickersView3 == null) {
            clipsStickersView3 = null;
        }
        clipsStickersView3.setOnMotionEventListener(null);
        View view9 = this.O;
        if (view9 == null) {
            view9 = null;
        }
        view9.setVisibility(0);
        ClipsStickersView clipsStickersView4 = this.e0;
        if (clipsStickersView4 == null) {
            clipsStickersView4 = null;
        }
        clipsStickersView4.setOnEmptySpaceClickListener(null);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        eo().a0();
        return true;
    }

    @Override // xsna.k6f
    public final void b2(boolean z) {
        View view = this.S;
        if (view == null) {
            view = null;
        }
        if (z) {
            xo2.d(29, 200L, view);
        } else {
            xo2.e(view, 200L, null, 13);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final j6f eo() {
        return (j6f) this.N.getValue();
    }

    @Override // xsna.k6f
    public final nal0 getStickersInteractor() {
        return this.b0;
    }

    @Override // xsna.k6f
    public final s8f getVideoView() {
        s8f s8fVar = this.Z;
        if (s8fVar != null) {
            return s8fVar;
        }
        return null;
    }

    @Override // xsna.k6f
    public final a7f h4() {
        ClipsTemplateEditorCropperView clipsTemplateEditorCropperView = this.Q;
        if (clipsTemplateEditorCropperView == null) {
            return null;
        }
        if (clipsTemplateEditorCropperView == null) {
            clipsTemplateEditorCropperView = null;
        }
        return clipsTemplateEditorCropperView.getState();
    }

    @Override // xsna.k6f
    public final b hd() {
        return new b();
    }

    @Override // xsna.k6f
    public final TransformOverlayView hm() {
        return this.c0;
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return requireContext().getColor(R.color.vk_black);
    }

    @Override // xsna.woo0
    public final int o7() {
        return this.g0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        eo().onActivityResult(i, i2, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eo().onCreate();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.clips_template_editor_layout_fragment, viewGroup, false);
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.vk.clips.editor.templates.impl.player.a aVar;
        eo().onDestroy();
        s8f s8fVar = this.Z;
        if (s8fVar == null) {
            s8fVar = null;
        }
        if (s8fVar != null && (aVar = s8fVar.a.k) != null) {
            aVar.v(new o93(aVar, 7));
        }
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        eo().onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        eo().onResume();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        nov novVar;
        super.onViewCreated(view, bundle);
        this.P = (ClipsTemplateEditorFragmentsBottomView) view.findViewById(R.id.clips_template_editor_fragments_bottom_view);
        this.Q = (ClipsTemplateEditorCropperView) view.findViewById(R.id.clips_template_editor_fragments_cropper_bottom_view);
        View findViewById = view.findViewById(R.id.clips_template_editor_video_view_cropper_shadow);
        findViewById.setOutlineProvider(new s0w0(getResources().getDimension(R.dimen.clips_template_editor_video_view_corner_radius), 6));
        int i = 1;
        findViewById.setClipToOutline(true);
        this.R = findViewById;
        View findViewById2 = view.findViewById(R.id.clips_template_editor_ripple_view);
        findViewById2.setOutlineProvider(new s0w0(getResources().getDimension(R.dimen.clips_template_editor_item_fragment_corner_radius), 6));
        findViewById2.setClipToOutline(true);
        this.O = findViewById2;
        this.S = view.findViewById(R.id.clips_template_editor_play_view);
        this.T = view.findViewById(R.id.clips_template_editor_cropper_change_item);
        this.U = view.findViewById(R.id.clips_template_editor_cropper_delete_item);
        this.V = (VkText) view.findViewById(R.id.clips_template_editor_info_text);
        this.W = (VkButton) view.findViewById(R.id.clips_template_editor_cancel);
        this.X = (VkButton) view.findViewById(R.id.clips_template_editor_cropper_done);
        this.Y = (VkButton) view.findViewById(R.id.clips_template_editor_next);
        ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView = this.P;
        if (clipsTemplateEditorFragmentsBottomView == null) {
            clipsTemplateEditorFragmentsBottomView = null;
        }
        clipsTemplateEditorFragmentsBottomView.setCallback(new ClipsTemplateEditorFragmentsBottomView.c(new k7f(this, 0)));
        View view2 = this.O;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.i0(view2, new mre(this, 2));
        View view3 = this.T;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.i0(view3, new w8(this, 28));
        View view4 = this.U;
        if (view4 == null) {
            view4 = null;
        }
        bwt0.i0(view4, new wje(this, i));
        VkButton vkButton = this.W;
        if (vkButton == null) {
            vkButton = null;
        }
        bwt0.i0(vkButton, new w(this, 25));
        VkButton vkButton2 = this.X;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        bwt0.i0(vkButton2, new pz(this, 22));
        VkButton vkButton3 = this.Y;
        if (vkButton3 == null) {
            vkButton3 = null;
        }
        bwt0.i0(vkButton3, new iz(this, 27));
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.templates_editor_video_container);
        frameLayout.setOutlineProvider(new s0w0(getResources().getDimension(R.dimen.clips_template_editor_video_view_corner_radius), 6));
        frameLayout.setClipToOutline(true);
        ClipsStickersView clipsStickersView = (ClipsStickersView) view.findViewById(R.id.clips_template_stickers_view);
        nbl0 nbl0Var = new nbl0();
        clipsStickersView.setStickersProvider(nbl0Var);
        this.b0 = new som0(clipsStickersView);
        clipsStickersView.setLockContentStickers(true);
        clipsStickersView.setBackgroundState(-16777216);
        clipsStickersView.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        clipsStickersView.setPivotX(iah0.f().widthPixels / 2.0f);
        xwt0.a(iah0.f().widthPixels, (int) (iah0.f().widthPixels / 0.5625f), clipsStickersView);
        this.e0 = clipsStickersView;
        this.c0 = (TransformOverlayView) view.findViewById(R.id.templates_video_transform_view);
        this.d0 = view.findViewById(R.id.templates_video_overlay_view);
        this.f0 = new a9o0(frameLayout);
        s8f s8fVar = new s8f((lpj) B(), nbl0Var);
        this.Z = s8fVar;
        this.a0 = frameLayout;
        som0 som0Var = this.b0;
        if (som0Var != null) {
            ClipsStickersView clipsStickersView2 = (ClipsStickersView) som0Var.b;
            CopyOnWriteArrayList<nov> copyOnWriteArrayList = clipsStickersView2.getStickersState().b;
            inf infVar = s8fVar.a;
            Class<?> cls = infVar.getClass();
            Iterator<nov> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    novVar = null;
                    break;
                } else {
                    novVar = it.next();
                    if (cls.isAssignableFrom(novVar.getClass())) {
                        break;
                    }
                }
            }
            if (!(novVar instanceof nov)) {
                novVar = null;
            }
            if (novVar == null) {
                float f = f2l0.a;
                clipsStickersView2.f(infVar, new mgi(2));
            }
        }
        View view5 = this.O;
        if (view5 == null) {
            view5 = null;
        }
        view5.setFocusable(true);
        view5.setAccessibilityDelegate(new l7f(this, view5));
        FrameLayout frameLayout2 = this.a0;
        if (frameLayout2 != null) {
            a9o0 a9o0Var = this.f0;
            a9o0 a9o0Var2 = a9o0Var == null ? null : a9o0Var;
            View view6 = this.d0;
            View view7 = view6 == null ? null : view6;
            y8o0 y8o0Var = new y8o0();
            List singletonList = Collections.singletonList(this.c0);
            a9o0Var2.getClass();
            frameLayout2.setAlpha(1.0f);
            frameLayout2.setVisibility(0);
            a9o0Var2.b = view7;
            a9o0Var2.c = singletonList;
            xwt0.a(-1, -1, view7);
            view7.addOnLayoutChangeListener(new mwt0(view7, new ih40(a9o0Var2, view7, y8o0Var, singletonList, 1)));
        }
        ClipsVideoTemplateEditorInputModel clipsVideoTemplateEditorInputModel = (ClipsVideoTemplateEditorInputModel) requireArguments().getParcelable("key_args");
        if (clipsVideoTemplateEditorInputModel != null) {
            eo().p(clipsVideoTemplateEditorInputModel);
        }
    }

    @Override // xsna.k6f
    public final void q9() {
        ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView = this.P;
        if (clipsTemplateEditorFragmentsBottomView == null) {
            clipsTemplateEditorFragmentsBottomView = null;
        }
        clipsTemplateEditorFragmentsBottomView.d();
    }

    @Override // xsna.k6f
    public final void rl(boolean z) {
        VkButton vkButton = this.Y;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setAlpha(z ? 1.0f : 0.64f);
    }

    @Override // xsna.k6f
    public final boolean s1() {
        return (isHidden() || Mn()) ? false : true;
    }
}
