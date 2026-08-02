package com.vk.posting.presentation.video;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.posting.data.PickerTechMetricsSession;
import com.vk.posting.di.PostingComponent;
import com.vk.posting.presentation.model.VideoAttachParams;
import com.vk.posting.presentation.video.a;
import com.vk.posting.presentation.video.model.VideoAlbumParams;
import com.vk.posting.presentation.video.model.VideoPickerFilter;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import xsna.ajd0;
import xsna.ao50;
import xsna.bpn0;
import xsna.d3t0;
import xsna.djl;
import xsna.f5z;
import xsna.fda0;
import xsna.fkq0;
import xsna.fpf0;
import xsna.gm50;
import xsna.i0b0;
import xsna.k2t0;
import xsna.k7m;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.oz50;
import xsna.qc9;
import xsna.vk50;
import xsna.vpn0;
import xsna.w8i;
import xsna.wf90;
import xsna.xn50;
import xsna.y2t0;

/* compiled from: VideoPickerFragment.kt */
/* loaded from: classes5.dex */
public final class VideoPickerFragment extends MviImplFragment<k2t0, h, com.vk.posting.presentation.video.a> implements w8i {
    public static final /* synthetic */ int V = 0;
    public f Q;
    public final b R = new b();
    public final Handler S = new Handler(Looper.getMainLooper());
    public final bpn0 T = new bpn0(new ajd0(this, 21));
    public final Object U = msy.a(LazyThreadSafetyMode.NONE, new vpn0(this, 13));

    /* compiled from: VideoPickerFragment.kt */
    public static final class a extends oz50 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserId userId, VideoAttachParams videoAttachParams, boolean z, VideoAlbumParams videoAlbumParams, int i) {
            super(VideoPickerFragment.class, null, null);
            z = (i & 4) != 0 ? false : z;
            videoAlbumParams = (i & 8) != 0 ? null : videoAlbumParams;
            this.j.putParcelable("user_id_video", userId);
            this.j.putParcelable("playlist_id_key", videoAlbumParams);
            this.j.putParcelable("video_attach_params_key", videoAttachParams);
            this.j.putBoolean("community_posting_key", z);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context requireContext = requireContext();
        f5z viewLifecycleOwner = getViewLifecycleOwner();
        Bundle arguments = getArguments();
        VideoAlbumParams videoAlbumParams = arguments != null ? (VideoAlbumParams) arguments.getParcelable("playlist_id_key") : null;
        Bundle arguments2 = getArguments();
        VideoAttachParams videoAttachParams = arguments2 != null ? (VideoAttachParams) arguments2.getParcelable("video_attach_params_key") : null;
        UserId userId = (UserId) this.T.getValue();
        Bundle arguments3 = getArguments();
        f fVar = new f(requireContext, viewLifecycleOwner, this, videoAlbumParams, videoAttachParams, userId, arguments3 != null ? arguments3.getBoolean("community_posting_key", false) : false);
        this.Q = fVar;
        return new mk50.c(fVar.e);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        h hVar = (h) ao50Var;
        f fVar = this.Q;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        gm50.a.b(fVar, hVar.a, new fda0(fVar, 21));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((k2t0) vk50Var).k.a(new i0b0(this, 29), this);
        this.S.post(new qc9(this, 11));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ((djl) this.U.getValue()).g(this);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            ((djl) this.U.getValue()).f(bundle);
        }
        this.o = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        djl djlVar = (djl) this.U.getValue();
        djlVar.b.e();
        djlVar.c = false;
        super.onDestroyView();
        xn50.a.c(this, a.d.C1536a.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        djl djlVar = (djl) this.U.getValue();
        bundle.putParcelable("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(djlVar.d, djlVar.e));
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        y2t0 c8 = ((PostingComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(PostingComponent.class))).c8();
        Bundle arguments = getArguments();
        VideoAlbumParams videoAlbumParams = arguments != null ? (VideoAlbumParams) arguments.getParcelable("playlist_id_key") : null;
        wf90 wf90Var = new wf90();
        bpn0 bpn0Var = this.T;
        return new k2t0(new d(new d3t0((UserId) bpn0Var.getValue(), null, false, null, false, VideoPickerFilter.VIDEO)), (UserId) bpn0Var.getValue(), wf90Var, c8, videoAlbumParams != null ? Integer.valueOf(videoAlbumParams.b) : null, (djl) this.U.getValue());
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = !requireArguments().getBoolean("community_posting_key", false) ? MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_VIDEO : fkq0.d((UserId) this.T.getValue()) ? MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_VIDEO_PROFILE : MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_VIDEO_COMMUNITY;
    }
}
