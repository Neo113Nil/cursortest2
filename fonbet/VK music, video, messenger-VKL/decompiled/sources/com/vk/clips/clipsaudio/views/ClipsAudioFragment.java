package com.vk.clips.clipsaudio.views;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stories.design.view.editor.SelectRangeWaveFormView;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;
import one.video.view.OneVideoPlayerView;
import xsna.ac;
import xsna.ao50;
import xsna.bhd;
import xsna.bpn0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e5;
import xsna.ec;
import xsna.f5;
import xsna.gm50;
import xsna.go1;
import xsna.hb;
import xsna.izs;
import xsna.km50;
import xsna.lfa;
import xsna.lpj;
import xsna.mk50;
import xsna.nds;
import xsna.ngd;
import xsna.oz50;
import xsna.qwe0;
import xsna.s3q0;
import xsna.u2b0;
import xsna.uds;
import xsna.ugd;
import xsna.vds;
import xsna.vk50;
import xsna.w8;
import xsna.xk80;
import xsna.xn50;
import xsna.yg;
import xsna.ygd;
import xsna.zgd;

/* compiled from: ClipsAudioFragment.kt */
/* loaded from: classes16.dex */
public final class ClipsAudioFragment extends MviImplFragment<ugd, bhd, ngd> implements nds, uds, vds {
    public static final /* synthetic */ int Y = 0;
    public hb Q;
    public yg R;
    public go1 S;
    public final qwe0 T = new qwe0(new d(1, this, ClipsAudioFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
    public xk80 U;
    public final TransformController V;
    public final bpn0 W;
    public final bpn0 X;

    /* compiled from: ClipsAudioFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipsAudioFragment.kt */
    public static final class b {
        public final VkToolButton a;
        public final VkToolButton b;
        public final VkText c;
        public final SelectRangeWaveFormView d;
        public final OneVideoPlayerView e;
        public final VkImageSimple f;
        public final VkText g;
        public final VkText h;

        public b(View view) {
            this.a = (VkToolButton) view.findViewById(R.id.clips_audio_dialog_button_close);
            this.b = (VkToolButton) view.findViewById(R.id.clips_audio_dialog_button_done);
            this.c = (VkText) view.findViewById(R.id.clips_audio_dialog_timeline_range);
            this.d = (SelectRangeWaveFormView) view.findViewById(R.id.clips_audio_dialog_range_waveform);
            this.e = (OneVideoPlayerView) view.findViewById(R.id.clips_audio_dialog_video_view);
            this.f = (VkImageSimple) view.findViewById(R.id.clips_audio_dialog_track_play);
            this.g = (VkText) view.findViewById(R.id.clips_audio_dialog_track_title);
            this.h = (VkText) view.findViewById(R.id.clips_audio_dialog_track_artist);
        }
    }

    /* compiled from: ClipsAudioFragment.kt */
    public static final class c extends e.a {
        public c() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void W3(f fVar) {
            ngd.o oVar = new ngd.o(fVar != null ? fVar.h() : 0);
            ClipsAudioFragment clipsAudioFragment = ClipsAudioFragment.this;
            clipsAudioFragment.getClass();
            xn50.a.c(clipsAudioFragment, oVar);
        }
    }

    /* compiled from: ClipsAudioFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<ngd, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ngd ngdVar) {
            ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) this.receiver;
            clipsAudioFragment.getClass();
            xn50.a.c(clipsAudioFragment, ngdVar);
            return s3q0.a;
        }
    }

    public ClipsAudioFragment() {
        VideoFeatures videoFeatures = VideoFeatures.REVERSE_EXP_RENDERER_THREAD;
        videoFeatures.getClass();
        TransformController transformController = null;
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            TransformController transformController2 = new TransformController(null);
            transformController2.f(TransformController.ScaleType.CROP, false);
            transformController = transformController2;
        }
        this.V = transformController;
        this.W = new bpn0(new ac(this, 15));
        this.X = new bpn0(new f5(this, 20));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.clips_audio_dialog);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        bhd bhdVar = (bhd) ao50Var;
        b bVar = new b(view);
        bwt0.i0(bVar.a, new w8(this, 23));
        bwt0.i0(bVar.b, new e5(this, 26));
        SelectRangeWaveFormView selectRangeWaveFormView = bVar.d;
        selectRangeWaveFormView.setWithBoundsOffset(true);
        selectRangeWaveFormView.c = true;
        selectRangeWaveFormView.d = true;
        selectRangeWaveFormView.invalidate();
        selectRangeWaveFormView.setMaxSelectorWidth(null);
        selectRangeWaveFormView.setDarkBackground(true);
        selectRangeWaveFormView.setWithRecommendedTime(true);
        selectRangeWaveFormView.setArrowsOutward(true);
        int f = e3m.f(R.attr.vk_ui_text_secondary, go());
        TextPaint textPaint = selectRangeWaveFormView.A;
        textPaint.setColor(f);
        textPaint.setAlpha(255);
        selectRangeWaveFormView.invalidate();
        selectRangeWaveFormView.setListener(this.T);
        Bundle arguments = getArguments();
        if (arguments != null) {
            MusicTrack musicTrack = (MusicTrack) arguments.getParcelable("clips_audio_track");
            if (musicTrack != null) {
                xn50.a.c(this, new ngd.k(musicTrack));
            }
            ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) arguments.getParcelable("clips_audio_music_info");
            if (clipsEditorMusicInfo != null) {
                xn50.a.c(this, new ngd.j(clipsEditorMusicInfo));
            }
        }
        gm50.a.b(this, bhdVar.a, new lfa(2, this, bVar));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((ugd) vk50Var).f.a(new ec(this, 28), this);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    public final u2b0 fo() {
        return (u2b0) this.W.getValue();
    }

    public final lpj go() {
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        return new lpj(mo2getContext, dhr0.u().c);
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return go().getColor(R.color.vk_black);
    }

    @Override // xsna.woo0
    public final int o7() {
        return go().getColor(R.color.vk_black);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bn(2, R.style.DialogTransparent);
        if (bundle != null) {
            tn();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        yg ygVar = this.R;
        if (ygVar != null) {
            ygVar.invoke();
        }
        this.R = null;
        fo().stop(32);
        fo().release();
        xk80 xk80Var = this.U;
        if (xk80Var != null) {
            xk80Var.T((OneVideoPlayer.d) this.X.getValue());
        }
        xk80 xk80Var2 = this.U;
        if (xk80Var2 != null) {
            xk80Var2.stop();
        }
        xk80 xk80Var3 = this.U;
        if (xk80Var3 != null) {
            xk80Var3.release();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        xk80 xk80Var = this.U;
        if (xk80Var != null) {
            xk80Var.pause();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xk80 xk80Var = this.U;
        if (xk80Var != null) {
            xk80Var.resume();
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new ugd(new ygd(new zgd(null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 0, false, false, false)));
    }
}
