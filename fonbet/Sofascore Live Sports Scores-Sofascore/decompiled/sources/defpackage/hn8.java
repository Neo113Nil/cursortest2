package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hn8 implements wke {
    public final tl2 a;
    public final wke b;

    public hn8(tl2 tl2Var, wke wkeVar) {
        this.a = tl2Var;
        this.b = wkeVar;
    }

    @Override // defpackage.wke
    public final void onAudioSessionIdChanged(int i) {
        this.b.onAudioSessionIdChanged(i);
    }

    @Override // defpackage.wke
    public final void onAvailableCommandsChanged(ske skeVar) {
        this.b.onAvailableCommandsChanged(skeVar);
    }

    @Override // defpackage.wke
    public final void onCues(List list) {
        this.b.onCues(list);
    }

    @Override // defpackage.wke
    public final void onDeviceVolumeChanged(int i, boolean z) {
        this.b.onDeviceVolumeChanged(i, z);
    }

    @Override // defpackage.wke
    public final void onEvents(ale aleVar, uke ukeVar) {
        this.b.onEvents(this.a, ukeVar);
    }

    @Override // defpackage.wke
    public final void onIsLoadingChanged(boolean z) {
        this.b.onIsLoadingChanged(z);
    }

    @Override // defpackage.wke
    public final void onIsPlayingChanged(boolean z) {
        this.b.onIsPlayingChanged(z);
    }

    @Override // defpackage.wke
    public final void onLoadingChanged(boolean z) {
        this.b.onIsLoadingChanged(z);
    }

    @Override // defpackage.wke
    public final void onMediaItemTransition(h6c h6cVar, int i) {
        this.b.onMediaItemTransition(h6cVar, i);
    }

    @Override // defpackage.wke
    public final void onMediaMetadataChanged(q6c q6cVar) {
        this.b.onMediaMetadataChanged(q6cVar);
    }

    @Override // defpackage.wke
    public final void onMetadata(ric ricVar) {
        this.b.onMetadata(ricVar);
    }

    @Override // defpackage.wke
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        this.b.onPlayWhenReadyChanged(z, i);
    }

    @Override // defpackage.wke
    public final void onPlaybackParametersChanged(hke hkeVar) {
        this.b.onPlaybackParametersChanged(hkeVar);
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        this.b.onPlaybackStateChanged(i);
    }

    @Override // defpackage.wke
    public final void onPlaybackSuppressionReasonChanged(int i) {
        this.b.onPlaybackSuppressionReasonChanged(i);
    }

    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        this.b.onPlayerError(dkeVar);
    }

    @Override // defpackage.wke
    public final void onPlayerErrorChanged(dke dkeVar) {
        this.b.onPlayerErrorChanged(dkeVar);
    }

    @Override // defpackage.wke
    public final void onPlayerStateChanged(boolean z, int i) {
        this.b.onPlayerStateChanged(z, i);
    }

    @Override // defpackage.wke
    public final void onPositionDiscontinuity(int i) {
        this.b.onPositionDiscontinuity(i);
    }

    @Override // defpackage.wke
    public final void onRenderedFirstFrame() {
        this.b.onRenderedFirstFrame();
    }

    @Override // defpackage.wke
    public final void onRepeatModeChanged(int i) {
        this.b.onRepeatModeChanged(i);
    }

    @Override // defpackage.wke
    public final void onShuffleModeEnabledChanged(boolean z) {
        this.b.onShuffleModeEnabledChanged(z);
    }

    @Override // defpackage.wke
    public final void onSkipSilenceEnabledChanged(boolean z) {
        this.b.onSkipSilenceEnabledChanged(z);
    }

    @Override // defpackage.wke
    public final void onSurfaceSizeChanged(int i, int i2) {
        this.b.onSurfaceSizeChanged(i, i2);
    }

    @Override // defpackage.wke
    public final void onTimelineChanged(mij mijVar, int i) {
        this.b.onTimelineChanged(mijVar, i);
    }

    @Override // defpackage.wke
    public final void onTrackSelectionParametersChanged(etj etjVar) {
        this.b.onTrackSelectionParametersChanged(etjVar);
    }

    @Override // defpackage.wke
    public final void onTracksChanged(uuj uujVar) {
        this.b.onTracksChanged(uujVar);
    }

    @Override // defpackage.wke
    public final void onVideoSizeChanged(zqk zqkVar) {
        this.b.onVideoSizeChanged(zqkVar);
    }

    @Override // defpackage.wke
    public final void onVolumeChanged(float f) {
        this.b.onVolumeChanged(f);
    }

    @Override // defpackage.wke
    public final void onCues(o74 o74Var) {
        this.b.onCues(o74Var);
    }

    @Override // defpackage.wke
    public final void onPositionDiscontinuity(yke ykeVar, yke ykeVar2, int i) {
        this.b.onPositionDiscontinuity(ykeVar, ykeVar2, i);
    }
}
