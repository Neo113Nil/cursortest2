package com.vk.catalog.mvi.block.video.impl.video.largelisttablet;

import android.content.Context;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import xsna.hdt0;
import xsna.hng;
import xsna.kpt0;
import xsna.mno0;
import xsna.nno0;
import xsna.pls0;
import xsna.rmw;
import xsna.s2a;
import xsna.smw;
import xsna.w3k0;
import xsna.y5;
import xsna.z5;

/* compiled from: VideoLargeListTabletViewStateMapper.kt */
/* loaded from: classes16.dex */
public final class b implements s2a<VideoLargeListTabletView.State, VideoLargeListTabletView.d> {
    public final Context b;
    public final w3k0 c;
    public final hdt0 d;

    public b(Context context, w3k0 w3k0Var, hdt0 hdt0Var) {
        this.b = context;
        this.c = w3k0Var;
        this.d = hdt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r10 != false) goto L37;
     */
    @Override // xsna.s2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VideoLargeListTabletView.d a(VideoLargeListTabletView.State state) {
        PreviewViewState.d nVar;
        PreviewViewState b;
        boolean z;
        DonutVideoUiModel.PreviewBadge previewBadge;
        DonutVideoUiModel.DescriptionChip descriptionChip;
        VideoLargeListTabletView.State state2 = state;
        VideoFile videoFile = state2.e;
        DonutVideoUiModel donutVideoUiModel = state2.g;
        VideoRestriction O = videoFile.O();
        boolean z2 = true;
        if (!this.d.c(videoFile) || O == null) {
            if (donutVideoUiModel == null || (previewBadge = donutVideoUiModel.b) == null) {
                Integer a = hng.a(videoFile.getPrivacy());
                nVar = kpt0.e(videoFile) ? a != null ? new PreviewViewState.n(new rmw.d(a.intValue()), null, null, VkColorToken.TextContrast, 4) : null : null;
            } else {
                nVar = new PreviewViewState.l(new mno0.a(new z5(previewBadge, 11)), new mno0.i(previewBadge.d));
            }
            PreviewViewState.d dVar = nVar;
            rmw.f f = smw.f(videoFile.getImage());
            mno0 c = kpt0.c(0, videoFile);
            if (MusicFeatures.AUDIO_VIDEO_CARD_TRACK_NOTE.h()) {
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_NOTE_ON_TYPE;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    z = videoFile.t2();
                } else {
                    Integer a6 = videoFile.a6();
                    if (a6.intValue() != 0) {
                        if (a6.intValue() != videoFile.o0()) {
                            z = true;
                        }
                    }
                    z = false;
                }
            }
            z2 = false;
            b = PreviewViewState.a0.b(f, true, new PreviewViewState.DurationBadge(c, false, z2 ? PreviewViewState.DurationBadge.IconState.MusicNote : null, 2), dVar, null, null, null, null, null, null, VkColorToken.BackgroundSecondaryAlpha, 1008);
        } else {
            PlaceholderViewState placeholderViewState = new PlaceholderViewState(new rmw.g(O.h.b), new mno0.i(O.b), null, null, null, 28);
            boolean z3 = O.d;
            PreviewViewState.a0 a0Var = PreviewViewState.a0.a;
            b = z3 ? a0Var.a(new rmw.g(videoFile.getImage().b), true, placeholderViewState) : a0Var.d(true, placeholderViewState);
        }
        PreviewViewState previewViewState = b;
        boolean c2 = this.c.c(videoFile, state2.f, state2.d);
        VideoMetaViewState.c cVar = (donutVideoUiModel == null || (descriptionChip = donutVideoUiModel.c) == null) ? null : new VideoMetaViewState.c(new mno0.a(new y5(descriptionChip, 11)), descriptionChip.d);
        VideoMetaViewState.i iVar = new VideoMetaViewState.i(new mno0.i(videoFile.getTitle()), 2);
        String P = videoFile.P();
        return new VideoLargeListTabletView.d(state2.b, new VideoCellViewState(previewViewState, new VideoCellViewState.g(new VideoMetaViewState(iVar, new VideoMetaViewState.a(null, null, P != null ? new mno0.i(P) : null, videoFile.Y().b, null, null, null, 0, 243), new VideoMetaViewState.a(null, null, null, false, kpt0.g(videoFile), nno0.d(pls0.b(this.b, videoFile)), cVar, 0, 143))), c2 ? null : new VideoCellViewState.c(new rmw.d(R.drawable.vk_icon_more_vertical_24)), null, null, 24));
    }
}
