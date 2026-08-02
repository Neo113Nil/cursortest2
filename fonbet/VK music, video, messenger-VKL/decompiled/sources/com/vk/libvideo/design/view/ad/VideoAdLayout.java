package com.vk.libvideo.design.view.ad;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.view.ad.data.AdLayoutBannerData;
import com.vk.libvideo.design.view.ad.data.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsView;
import one.video.ad.ux.controls.OneVideoAdControlsViewNew;
import xsna.a6z0;
import xsna.b1y;
import xsna.ba30;
import xsna.c5g;
import xsna.eg0;
import xsna.fg0;
import xsna.fpf0;
import xsna.gg0;
import xsna.gzs;
import xsna.je0;
import xsna.jxt0;
import xsna.jzr0;
import xsna.kiw;
import xsna.kva0;
import xsna.kzr0;
import xsna.ltl0;
import xsna.mej0;
import xsna.mo2;
import xsna.n9c0;
import xsna.nc0;
import xsna.nej0;
import xsna.nf3;
import xsna.nzr0;
import xsna.ofy0;
import xsna.ozr0;
import xsna.qcy;
import xsna.rh0;
import xsna.rli0;
import xsna.s3q0;
import xsna.sc0;
import xsna.sh0;
import xsna.sws0;
import xsna.zjw;

/* compiled from: VideoAdLayout.kt */
/* loaded from: classes2.dex */
public final class VideoAdLayout extends FrameLayout {
    public static final /* synthetic */ qcy<Object>[] d;
    public ConstraintLayout b;
    public final nf3 c;

    /* compiled from: VideoAdLayout.kt */
    public final class a implements OneVideoAdBaseControls.a {
        public final ofy0 a;
        public final eg0 b;
        public final kva0 c;

        public a(ofy0 ofy0Var, eg0 eg0Var, kva0 kva0Var) {
            this.a = ofy0Var;
            this.b = eg0Var;
            this.c = kva0Var;
        }

        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.a
        public final void a(boolean z) {
            this.a.k(z);
        }

        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.a
        public final void b() {
            ((je0) this.a.c).c(this.b.b);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.a
        public final void c() {
            OneVideoAdBaseControls.c state;
            VideoAdLayout videoAdLayout = VideoAdLayout.this;
            ?? r1 = videoAdLayout.b;
            if (r1 == 0 || (state = r1.getState()) == null) {
                return;
            }
            OneVideoAdBaseControls.SoundState soundState = state.b;
            OneVideoAdBaseControls.SoundState soundState2 = OneVideoAdBaseControls.SoundState.ON;
            ofy0 ofy0Var = this.a;
            if (soundState == soundState2) {
                ?? r0 = videoAdLayout.b;
                if (r0 != 0) {
                    r0.setState(OneVideoAdBaseControls.c.a(state, OneVideoAdBaseControls.SoundState.OFF, 0, 0, 29));
                }
                ofy0Var.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            ?? r02 = videoAdLayout.b;
            if (r02 != 0) {
                r02.setState(OneVideoAdBaseControls.c.a(state, soundState2, 0, 0, 29));
            }
            ofy0Var.l(1.0f);
        }

        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.a
        public final void d() {
            je0 je0Var = (je0) this.a.c;
            eg0 eg0Var = this.b;
            boolean z = eg0Var.a;
            boolean z2 = eg0Var.b;
            boolean z3 = eg0Var.c;
            nc0 nc0Var = eg0Var.d;
            je0Var.h(new kzr0(z, z2, z3, nc0Var != null ? new mo2(nc0Var) : null, eg0Var.e));
        }

        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.a
        public final void e() {
            gzs<s3q0> gzsVar;
            kva0 kva0Var = this.c;
            if (kva0Var == null || (gzsVar = kva0Var.b) == null) {
                return;
            }
            gzsVar.invoke();
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(VideoAdLayout.class, "videoAdLayoutToggleConfig", "getVideoAdLayoutToggleConfig()Lcom/vk/libvideo/design/view/ad/VideoAdLayoutToggleConfig;", 0);
        fpf0.a.getClass();
        d = new qcy[]{mutablePropertyReference1Impl};
    }

    public VideoAdLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    public static void g(VideoAdLayout videoAdLayout) {
        OneVideoAdBaseControls.c state;
        ?? r4;
        ?? r0 = videoAdLayout.b;
        if (r0 == 0 || (state = r0.getState()) == null || (r4 = videoAdLayout.b) == 0) {
            return;
        }
        r4.setState(OneVideoAdBaseControls.c.a(state, null, -1, -1, 7));
    }

    private final ozr0 getVideoAdLayoutToggleConfig() {
        return (ozr0) this.c.getValue(this, d[0]);
    }

    private final void setVideoAdLayoutToggleConfig(ozr0 ozr0Var) {
        qcy<Object> qcyVar = d[0];
        this.c.c = ozr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [one.video.ad.ux.controls.OneVideoAdControlsViewNew] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r3v21, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r3v22, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r3v26, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r6v14, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r6v19, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r6v20, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r6v21, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    public final void a(ofy0 ofy0Var, com.vk.libvideo.design.view.ad.data.a aVar, eg0 eg0Var, kva0 kva0Var, ozr0 ozr0Var, Lazy<? extends zjw> lazy) {
        View view;
        rh0 rh0Var;
        n9c0 postView;
        OneVideoAdBaseControls.c state;
        OneVideoAdBaseControls.c state2;
        ?? r6;
        View view2;
        boolean z;
        boolean z2;
        setVideoAdLayoutToggleConfig(ozr0Var);
        if (!(aVar instanceof a.AbstractC1232a)) {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a.b bVar = (a.b) aVar;
            if (this.b == null) {
                OneVideoAdControlsViewNew oneVideoAdControlsViewNew = new OneVideoAdControlsViewNew(getContext(), null, 0, 14, 0);
                this.b = oneVideoAdControlsViewNew;
                oneVideoAdControlsViewNew.setImageLoader(lazy.getValue());
                ?? r4 = this.b;
                if (r4 != 0 && (view = r4.getView()) != null) {
                    addView(view, new FrameLayout.LayoutParams(-1, -1));
                }
            }
            ofy0Var.j().a = eg0Var.c;
            ofy0Var.j();
            e((sws0) ofy0Var.j().b, ofy0Var.j().a, bVar.a);
            return;
        }
        a.AbstractC1232a abstractC1232a = (a.AbstractC1232a) aVar;
        AdLayoutBannerData a2 = abstractC1232a.a();
        if (!(a2 instanceof AdLayoutBannerData.b)) {
            if (!(a2 instanceof AdLayoutBannerData.a)) {
                throw new NoWhenBranchMatchedException();
            }
            throw null;
        }
        AdLayoutBannerData.b bVar2 = (AdLayoutBannerData.b) a2;
        String str = bVar2.a;
        Size size = new Size(bVar2.c, bVar2.d);
        int i = (int) (bVar2.e * 1000.0f);
        boolean z3 = bVar2.b;
        boolean z4 = bVar2.f;
        a6z0 a3 = ((mej0) new b1y(((je0) ofy0Var.c).f(), 11).c).a();
        ArrayList<fg0> arrayList = bVar2.j;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (fg0 fg0Var : arrayList) {
            arrayList2.add(new nej0(fg0Var.a, fg0Var.b, fg0Var.c, fg0Var.g, fg0Var.h, fg0Var.i, fg0Var.d));
        }
        AdLayoutBannerData.AdLayoutRedirectData adLayoutRedirectData = bVar2.g;
        String str2 = adLayoutRedirectData.b;
        Integer num = adLayoutRedirectData.c;
        Integer num2 = adLayoutRedirectData.d;
        String str3 = adLayoutRedirectData.e;
        String str4 = adLayoutRedirectData.f;
        sc0 sc0Var = new sc0(str, size, i, z3, z4, a3, arrayList2, new sh0(str2, num, num2, str3, str4 != null ? new kiw(str4) : null));
        boolean a4 = abstractC1232a.a().a();
        boolean z5 = eg0Var.c;
        eg0 eg0Var2 = (z5 || (z = eg0Var.a) || (z2 = eg0Var.f)) ? eg0Var : new eg0(z, eg0Var.b, z5, eg0Var.d, true, z2);
        boolean z6 = eg0Var2.a;
        if (this.b == null) {
            OneVideoAdControlsView oneVideoAdControlsViewNew2 = !a4 ? new OneVideoAdControlsViewNew(getContext(), null, 0, 14, 0) : new OneVideoAdControlsView(getContext(), null, 0, 14, 0);
            this.b = oneVideoAdControlsViewNew2;
            oneVideoAdControlsViewNew2.setImageLoader(lazy.getValue());
            ?? r62 = this.b;
            if (r62 != 0) {
                r62.setShoppableAdViewListener(new jzr0(ofy0Var));
            }
            ?? r63 = this.b;
            if (r63 != 0) {
                r63.setShowAdShoppableProducts(z6);
            }
            ?? r64 = this.b;
            if (r64 != 0 && (view2 = r64.getView()) != null) {
                addView(view2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        ?? r65 = this.b;
        if (r65 != 0) {
            r65.setListener(new a(ofy0Var, eg0Var2, kva0Var));
        }
        if (getVideoAdLayoutToggleConfig().a) {
            if ((kva0Var != null ? Boolean.valueOf(kva0Var.a) : null) != null && (r6 = this.b) != 0) {
                r6.setPlayPauseControl(kva0Var.a);
            }
        }
        if (!a4) {
            boolean z7 = eg0Var2.c;
            boolean z8 = eg0Var2.e;
            OneVideoAdBaseControls.Type type = z7 ? OneVideoAdBaseControls.Type.FULLSCREEN : (z6 && z8) ? OneVideoAdBaseControls.Type.CATALOG_LARGE : z8 ? OneVideoAdBaseControls.Type.DISCOVERY : eg0Var2.f ? OneVideoAdBaseControls.Type.PIP : OneVideoAdBaseControls.Type.CATALOG_SMALL;
            OneVideoAdBaseControls.SoundState soundState = abstractC1232a.b() == 1.0f ? OneVideoAdBaseControls.SoundState.ON : OneVideoAdBaseControls.SoundState.OFF;
            ?? r3 = this.b;
            if (r3 != 0) {
                r3.setState(new OneVideoAdBaseControls.c(type, soundState, abstractC1232a.c(), -1, -1));
            }
            ?? r32 = this.b;
            if (r32 != 0 && (state = r32.getState()) != null && state.c) {
                ?? r33 = this.b;
                if (((r33 == 0 || (state2 = r33.getState()) == null) ? null : state2.a) == OneVideoAdBaseControls.Type.PIP) {
                    ofy0Var.k(true);
                }
            }
            ?? r34 = this.b;
            if (r34 != 0 && (postView = r34.getPostView()) != null) {
                ((je0) ofy0Var.c).e(postView);
            }
        }
        ?? r1 = this.b;
        if (r1 != 0) {
            r1.setAdBannerData(sc0Var);
        }
        if (this.b == null) {
            return;
        }
        if (!(abstractC1232a instanceof a.AbstractC1232a.b)) {
            if (!(abstractC1232a instanceof a.AbstractC1232a.C1233a)) {
                throw new NoWhenBranchMatchedException();
            }
            throw null;
        }
        a.AbstractC1232a.b bVar3 = (a.AbstractC1232a.b) abstractC1232a;
        gg0 gg0Var = bVar3.e;
        if (gg0Var != null) {
            float f = gg0Var.c;
            AdLayoutBannerData.b bVar4 = bVar3.d;
            int i2 = (int) ((bVar4.e - f) * 1000.0f);
            rh0Var = new rh0(i2, (int) (f * 1000), bVar4.h ? Integer.valueOf(Math.max(((int) (bVar4.i * 1000.0f)) - i2, 0)) : null);
        } else {
            rh0Var = null;
        }
        d(rh0Var, kva0Var != null ? Boolean.valueOf(kva0Var.a) : null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    public final void b() {
        View view;
        OneVideoAdBaseControls.b motionDelegate;
        OneVideoAdBaseControls.b motionDelegate2;
        ?? r0 = this.b;
        if (r0 != 0 && (motionDelegate2 = r0.getMotionDelegate()) != null) {
            motionDelegate2.c(null);
        }
        ?? r02 = this.b;
        if (r02 != 0 && (motionDelegate = r02.getMotionDelegate()) != null) {
            motionDelegate.b(null);
        }
        ?? r03 = this.b;
        if (r03 != 0) {
            r03.V2();
        }
        ?? r04 = this.b;
        if (r04 != 0) {
            r04.setListener(null);
        }
        ?? r05 = this.b;
        if (r05 != 0) {
            r05.setShoppableAdViewListener(null);
        }
        ?? r06 = this.b;
        if (r06 != 0 && (view = r06.getView()) != null) {
            removeView(view);
        }
        this.b = null;
    }

    public final void c(nzr0 nzr0Var, ozr0 ozr0Var) {
        setVideoAdLayoutToggleConfig(ozr0Var);
        if (nzr0Var instanceof nzr0.a) {
            nzr0.a aVar = (nzr0.a) nzr0Var;
            d(aVar.a, aVar.b);
        } else {
            if (!(nzr0Var instanceof nzr0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            nzr0.b bVar = (nzr0.b) nzr0Var;
            e(bVar.a, bVar.b, bVar.c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    public final void d(rh0 rh0Var, Boolean bool) {
        ?? r0 = this.b;
        if (r0 == 0) {
            return;
        }
        if (rh0Var == null) {
            r0.V2();
        } else {
            r0.c1();
            r0.setAdProgress(rh0Var);
        }
        if (!getVideoAdLayoutToggleConfig().a || bool == null) {
            return;
        }
        r0.setPlayPauseControl(bool.booleanValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    public final void e(sws0 sws0Var, boolean z, ba30 ba30Var) {
        OneVideoAdBaseControls.b motionDelegate;
        OneVideoAdBaseControls.b motionDelegate2;
        OneVideoAdBaseControls.b motionDelegate3;
        ?? r0 = this.b;
        if (r0 != 0 && (motionDelegate3 = r0.getMotionDelegate()) != null) {
            motionDelegate3.c(sws0Var);
        }
        ?? r2 = this.b;
        if (r2 != 0 && (motionDelegate2 = r2.getMotionDelegate()) != null) {
            motionDelegate2.a(z);
        }
        ?? r22 = this.b;
        if (r22 == 0 || (motionDelegate = r22.getMotionDelegate()) == null) {
            return;
        }
        motionDelegate.b(ba30Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    public final void f() {
        OneVideoAdBaseControls.c state;
        ?? r1;
        ?? r0 = this.b;
        if (r0 == 0 || (state = r0.getState()) == null || (r1 = this.b) == 0) {
            return;
        }
        r1.setState(OneVideoAdBaseControls.c.a(state, null, 0, 0, 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    public final List<View> getFadeViews() {
        List<View> A;
        ?? r0 = this.b;
        KeyEvent.Callback view = r0 != 0 ? r0.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        return (viewGroup == null || (A = rli0.A(rli0.j(new jxt0(viewGroup), new ltl0(6)))) == null) ? EmptyList.b : A;
    }

    public VideoAdLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.c = new nf3();
        setBackgroundColor(0);
    }
}
