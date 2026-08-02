package com.vk.libvideo.design.view.fullscreen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import com.vk.fullscreenvideo.design.view.bottom.a;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.buc0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e43;
import xsna.epx;
import xsna.etn;
import xsna.fxc0;
import xsna.gpt0;
import xsna.gsi0;
import xsna.i5g;
import xsna.iah0;
import xsna.izs;
import xsna.j6e0;
import xsna.jds0;
import xsna.msy;
import xsna.n1j0;
import xsna.rli0;
import xsna.s3q0;
import xsna.ta50;
import xsna.ulp0;
import xsna.v1v;
import xsna.vxs;
import xsna.yms0;

/* compiled from: VideoFullscreenBottomBarView.kt */
/* loaded from: classes2.dex */
public final class VideoFullscreenBottomBarView extends FrameLayout {
    public static final int l = iah0.a(48);
    public final ViewStub b;
    public izs<? super a, s3q0> c;
    public final etn d;
    public com.vk.fullscreenvideo.design.view.bottom.a e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final List<a.d> i;
    public n1j0 j;
    public Pair<String, ? extends List<a.C1075a>> k;

    public VideoFullscreenBottomBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.video.kidsprofile.restricteduseractions.a getRestrictedUserActionsRepository() {
        return (com.vk.video.kidsprofile.restricteduseractions.a) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(vxs vxsVar) {
        List<a.C1075a> A;
        boolean z;
        com.vk.fullscreenvideo.design.view.bottom.a aVar;
        boolean z2;
        boolean z3 = vxsVar.f;
        boolean z4 = vxsVar.b;
        VideoFile videoFile = vxsVar.d;
        c(videoFile);
        boolean z5 = vxsVar.a;
        b(videoFile, z5);
        List<Image> list = vxsVar.c;
        StringBuilder b = v1v.b(videoFile.a1(), '_');
        b.append(list.hashCode());
        String sb = b.toString();
        Pair<String, ? extends List<a.C1075a>> pair = this.k;
        boolean z6 = true;
        if (epx.f(pair != null ? pair.i() : null, sb)) {
            Pair<String, ? extends List<a.C1075a>> pair2 = this.k;
            if (pair2 == null || (A = pair2.j()) == null) {
                A = EmptyList.b;
            }
        } else {
            int size = list.size();
            if (size > 1) {
                size = 1;
            }
            A = rli0.A(new ulp0(rli0.y(rli0.t(new i5g(list), new j6e0(18)), size), yms0.b));
            this.k = new Pair<>(sb, A);
        }
        List<a.C1075a> list2 = A;
        boolean z7 = z4 && !z5 && this.d.k(Boolean.valueOf(videoFile.T1())) && getResources().getConfiguration().screenWidthDp < 375;
        if (z4) {
            z = z5 ? d.v().c : d.w().c;
        } else {
            z = false;
        }
        com.vk.fullscreenvideo.design.view.bottom.a aVar2 = this.e;
        if (aVar2 != null) {
            boolean z8 = vxsVar.a;
            ControlsState.ScreenState screenState = z4 ? ControlsState.ScreenState.FULLSCREEN : ControlsState.ScreenState.DISCOVERY;
            boolean z9 = vxsVar.e;
            if (!gpt0.D(videoFile) || fxc0.B().b0().e(videoFile)) {
                aVar = aVar2;
                z2 = false;
            } else {
                aVar = aVar2;
                z2 = true;
            }
            ?? r6 = this.h;
            if (z4 && !z5) {
                z3 = z3 && !((Boolean) r6.getValue()).booleanValue();
            }
            getRestrictedUserActionsRepository().getClass();
            if (!z4 || (!z5 ? ((Boolean) r6.getValue()).booleanValue() : ((Boolean) this.g.getValue()).booleanValue())) {
                z6 = false;
            }
            aVar.setState(new a.b(z8, screenState, videoFile, z2, z9, z3, z6, z7, z, list2, null));
        }
    }

    public final void b(VideoFile videoFile, boolean z) {
        List<a.d> l2;
        boolean h = this.d.h(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null);
        if (!z || h) {
            l2 = e43.l(new a.d.b.C1073b(videoFile != null ? videoFile.l1() : 0), new a.d.b.C1072a(videoFile != null ? videoFile.c1() : 0), new a.d.b.c(videoFile != null ? videoFile.W7() : 0), a.d.c.a, a.d.j.a, a.d.e.a);
        } else {
            l2 = this.i;
        }
        com.vk.fullscreenvideo.design.view.bottom.a aVar = this.e;
        if (aVar != null) {
            aVar.setControls(l2);
        }
    }

    public final void c(VideoFile videoFile) {
        if (this.d.e(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null)) {
            ViewStub viewStub = this.b;
            if (bwt0.J(viewStub)) {
                return;
            }
            viewStub.inflate();
        }
    }

    public final n1j0 getSettingsDialog() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n1j0 n1j0Var = this.j;
        if (n1j0Var != null) {
            n1j0Var.dismiss();
        }
        this.j = null;
        this.k = null;
    }

    public final void setAreCommentsDisabled(boolean z) {
        c(null);
        com.vk.fullscreenvideo.design.view.bottom.a aVar = this.e;
        if (aVar != null) {
            aVar.setAreCommentsDisabled(z);
        }
    }

    public final void setOnClickActionListener$core_release(izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar) {
        this.c = izsVar;
    }

    public final void setSettingsDialog(n1j0 n1j0Var) {
        this.j = n1j0Var;
    }

    public final void setShowPlaylistButton(boolean z) {
        c(null);
        com.vk.fullscreenvideo.design.view.bottom.a aVar = this.e;
        if (aVar != null) {
            aVar.setShowPlaylistButton(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoFullscreenBottomBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        int i2 = 2;
        this.d = gsi0.b();
        jds0 jds0Var = new jds0(this, i2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, jds0Var);
        this.g = msy.a(lazyThreadSafetyMode, new buc0(14));
        this.h = msy.a(lazyThreadSafetyMode, new ta50(16));
        this.i = e43.l(a.d.h.a, a.d.C1074d.a, a.d.i.a);
        dhr0.a.getClass();
        LayoutInflater.from(dhr0.t(context)).inflate(R.layout.video_fullscreen_bottom_view, (ViewGroup) this, true);
        ViewStub viewStub = (ViewStub) getRootView().findViewById(R.id.fullscreen_bottom_controls_stub);
        this.b = viewStub;
        viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: xsna.vms0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub2, View view) {
                com.vk.fullscreenvideo.design.view.bottom.a aVar;
                if (view instanceof com.vk.fullscreenvideo.design.view.bottom.a) {
                    int i3 = VideoFullscreenBottomBarView.l;
                    aVar = (com.vk.fullscreenvideo.design.view.bottom.a) view;
                } else {
                    aVar = null;
                }
                VideoFullscreenBottomBarView videoFullscreenBottomBarView = VideoFullscreenBottomBarView.this;
                videoFullscreenBottomBarView.e = aVar;
                videoFullscreenBottomBarView.b(null, iah0.r(videoFullscreenBottomBarView.getContext()));
                com.vk.fullscreenvideo.design.view.bottom.a aVar2 = videoFullscreenBottomBarView.e;
                if (aVar2 != null) {
                    aVar2.setDownloadButtonProvider(new wms0(videoFullscreenBottomBarView));
                }
                com.vk.fullscreenvideo.design.view.bottom.a aVar3 = videoFullscreenBottomBarView.e;
                if (aVar3 != null) {
                    aVar3.setOnClickAction(new alj0(videoFullscreenBottomBarView, 22));
                }
            }
        });
    }
}
