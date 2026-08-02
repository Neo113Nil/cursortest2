package com.vk.libvideo.screen;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.b;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.design.view.swipe.layout.SwipeLayout;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.a;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.video.kidsprofile.restricteduseractions.a;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.a72;
import xsna.afl0;
import xsna.ejf0;
import xsna.ghn0;
import xsna.hfs0;
import xsna.icn0;
import xsna.ies;
import xsna.jet0;
import xsna.kes;
import xsna.ljt0;
import xsna.lyd;
import xsna.msy;
import xsna.oqh0;
import xsna.orj0;
import xsna.oz50;
import xsna.q6s0;
import xsna.qjo0;
import xsna.u9t0;
import xsna.v3t0;
import xsna.vds;
import xsna.vit0;
import xsna.zet0;

/* compiled from: VideoFragment.kt */
/* loaded from: classes3.dex */
public final class VideoFragment extends BaseFragment implements a.b, ies, kes, vds {
    public static final /* synthetic */ int c0 = 0;
    public com.vk.libvideo.screen.a S;
    public a.C1246a T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;

    /* compiled from: VideoFragment.kt */
    public static final class a extends oz50 {
        public a(VideoFile videoFile) {
            super(VideoFragment.class, null, null);
            this.j.putParcelable(X3.i.b, videoFile);
            this.j.putBoolean("_fragment_impl_key_hide_bottom_fragment", false);
        }

        public final void A(String str) {
            this.j.putString("referrer", str);
        }

        public final void B(DeprecatedStatisticInterface deprecatedStatisticInterface) {
            this.j.putParcelable("statistic", deprecatedStatisticInterface);
        }

        public final void C(String str) {
            this.j.putString("track_code", str);
        }

        public final void D(boolean z) {
            this.j.putBoolean("withoutBottom", z);
        }

        public final void E(boolean z) {
            this.j.putBoolean("withoutMenu", z);
        }

        public final void F(boolean z) {
            this.j.putBoolean("withoutPreview", z);
        }

        public final void y(AdsDataProvider adsDataProvider) {
            this.j.putParcelable(b.JSON_KEY_ADS, adsDataProvider);
        }

        public final void z(String str) {
            this.j.putString("context", str);
        }
    }

    public VideoFragment() {
        icn0 icn0Var = new icn0(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, icn0Var);
        this.V = msy.a(lazyThreadSafetyMode, new qjo0(this, 8));
        this.W = msy.a(lazyThreadSafetyMode, new q6s0(this, 1));
        this.X = msy.a(lazyThreadSafetyMode, new afl0(this, 13));
        this.Y = msy.a(lazyThreadSafetyMode, new orj0(this, 19));
        this.Z = msy.a(lazyThreadSafetyMode, new oqh0(this, 13));
        this.a0 = msy.a(lazyThreadSafetyMode, new ghn0(this, 8));
        this.b0 = msy.a(lazyThreadSafetyMode, new ejf0(this, 18));
    }

    @Override // com.vk.libvideo.screen.a.b
    public final a.C1246a Bg() {
        a.C1246a c1246a = this.T;
        if (c1246a == null) {
            return null;
        }
        return c1246a;
    }

    @Override // com.vk.libvideo.screen.a.b
    public final boolean Lj() {
        return kn().isFinishing();
    }

    @Override // xsna.vds
    public final int Q0() {
        return -1;
    }

    @Override // xsna.kes
    public final boolean Xf() {
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.vk.libvideo.screen.a aVar = this.S;
        if (aVar == null) {
            aVar = null;
        }
        VideoView videoView = aVar.w;
        if (videoView != null) {
            videoView.V(configuration);
        }
        VideoView videoView2 = aVar.w;
        if (videoView2 != null) {
            videoView2.postDelayed(new a72(aVar, 26), 100L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        VideoFile videoFile = (VideoFile) requireArguments.getParcelable(X3.i.b);
        AdsDataProvider adsDataProvider = (AdsDataProvider) requireArguments.getParcelable(b.JSON_KEY_ADS);
        String string = requireArguments.getString("context");
        this.T = new a.C1246a(videoFile, adsDataProvider, requireArguments.getString("referrer"), requireArguments.getString("track_code"), (DeprecatedStatisticInterface) requireArguments.getParcelable("statistic"), string, requireArguments.getBoolean("withoutMenu", false), requireArguments.getBoolean("withoutBottom", false), requireArguments.getBoolean("withoutPreview", false), 0L, null, 0, 63104);
        Context requireContext = requireContext();
        NotificationsPermission notificationsPermission = (NotificationsPermission) this.U.getValue();
        jet0 jet0Var = new jet0((vit0) this.V.getValue(), (v3t0) this.W.getValue(), a.C1950a.a.getSTUB(), (u9t0) this.X.getValue());
        ?? r0 = this.Y;
        this.S = new com.vk.libvideo.screen.a(requireContext, this, notificationsPermission, jet0Var, ((VideoShareComponent) r0.getValue()).p0(), (zet0) this.Z.getValue(), (ljt0) this.a0.getValue(), (hfs0) this.b0.getValue(), ((VideoShareComponent) r0.getValue()).S(), null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.vk.libvideo.screen.a aVar = this.S;
        if (aVar == null) {
            aVar = null;
        }
        LayoutInflater layoutInflater2 = getLayoutInflater();
        aVar.getClass();
        View inflate = layoutInflater2.inflate(R.layout.video_fullscreen, viewGroup, false);
        aVar.B = (SwipeLayout) inflate.findViewById(R.id.swipe_layout);
        inflate.setBackground(new ColorDrawable(0));
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.vk.libvideo.screen.a aVar = this.S;
        if (aVar == null) {
            aVar = null;
        }
        com.vk.libvideo.screen.a.e(aVar);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.vk.libvideo.screen.a aVar = this.S;
        if (aVar == null) {
            aVar = null;
        }
        aVar.onPause();
        kn().getWindow().clearFlags(134217728);
        lyd.g().P();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.vk.libvideo.screen.a aVar = this.S;
        if (aVar == null) {
            aVar = null;
        }
        aVar.onResume();
        kn().getWindow().addFlags(134217728);
        lyd.g().B();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.vk.libvideo.screen.a aVar = this.S;
        if (aVar == null) {
            aVar = null;
        }
        aVar.f(view);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        a.C1246a c1246a = this.T;
        if (c1246a == null) {
            c1246a = null;
        }
        Long valueOf = Long.valueOf(c1246a.a.o0());
        a.C1246a c1246a2 = this.T;
        if (c1246a2 == null) {
            c1246a2 = null;
        }
        Long valueOf2 = Long.valueOf(c1246a2.a.I0().b);
        a.C1246a c1246a3 = this.T;
        uiTrackingScreen.f = new SchemeStat$EventItem(type, valueOf, valueOf2, null, (c1246a3 != null ? c1246a3 : null).d, null, 32, null);
    }
}
