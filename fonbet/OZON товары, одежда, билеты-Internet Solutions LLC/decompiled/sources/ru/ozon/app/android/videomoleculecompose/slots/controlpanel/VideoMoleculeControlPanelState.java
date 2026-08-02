package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

import Kk.C3532b;
import Pk0.a;
import Pk0.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarState;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010#R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\f\u0010#R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b\r\u0010#R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b\u000e\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculeControlPanelState;", "", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;", "timeline", "Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculePlayPauseState;", "playPause", "Lkotlin/Function1;", "", "", "timeFormatter", "", "isCompact", "isFullscreen", "isFinished", "isScrubbing", "<init>", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculePlayPauseState;Lkotlin/jvm/functions/Function1;ZZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;", "getTimeline", "()Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;", "Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculePlayPauseState;", "getPlayPause", "()Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculePlayPauseState;", "Lkotlin/jvm/functions/Function1;", "getTimeFormatter", "()Lkotlin/jvm/functions/Function1;", "Z", "()Z", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoMoleculeControlPanelState {
    private final boolean isCompact;
    private final boolean isFinished;
    private final boolean isFullscreen;
    private final boolean isScrubbing;

    @NotNull
    private final VideoMoleculePlayPauseState playPause;

    @NotNull
    private final Function1<Long, String> timeFormatter;

    @NotNull
    private final SlimTimeBarState timeline;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoMoleculeControlPanelState(@NotNull SlimTimeBarState timeline, @NotNull VideoMoleculePlayPauseState playPause, @NotNull Function1<? super Long, String> timeFormatter, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        Intrinsics.checkNotNullParameter(playPause, "playPause");
        Intrinsics.checkNotNullParameter(timeFormatter, "timeFormatter");
        this.timeline = timeline;
        this.playPause = playPause;
        this.timeFormatter = timeFormatter;
        this.isCompact = z11;
        this.isFullscreen = z12;
        this.isFinished = z13;
        this.isScrubbing = z14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoMoleculeControlPanelState)) {
            return false;
        }
        VideoMoleculeControlPanelState videoMoleculeControlPanelState = (VideoMoleculeControlPanelState) other;
        return Intrinsics.d(this.timeline, videoMoleculeControlPanelState.timeline) && Intrinsics.d(this.playPause, videoMoleculeControlPanelState.playPause) && Intrinsics.d(this.timeFormatter, videoMoleculeControlPanelState.timeFormatter) && this.isCompact == videoMoleculeControlPanelState.isCompact && this.isFullscreen == videoMoleculeControlPanelState.isFullscreen && this.isFinished == videoMoleculeControlPanelState.isFinished && this.isScrubbing == videoMoleculeControlPanelState.isScrubbing;
    }

    @NotNull
    public final VideoMoleculePlayPauseState getPlayPause() {
        return this.playPause;
    }

    @NotNull
    public final Function1<Long, String> getTimeFormatter() {
        return this.timeFormatter;
    }

    @NotNull
    public final SlimTimeBarState getTimeline() {
        return this.timeline;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isScrubbing) + C3532b.a(C3532b.a(C3532b.a((this.timeFormatter.hashCode() + ((this.playPause.hashCode() + (this.timeline.hashCode() * 31)) * 31)) * 31, 31, this.isCompact), 31, this.isFullscreen), 31, this.isFinished);
    }

    /* renamed from: isCompact, reason: from getter */
    public final boolean getIsCompact() {
        return this.isCompact;
    }

    /* renamed from: isFinished, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    /* renamed from: isFullscreen, reason: from getter */
    public final boolean getIsFullscreen() {
        return this.isFullscreen;
    }

    /* renamed from: isScrubbing, reason: from getter */
    public final boolean getIsScrubbing() {
        return this.isScrubbing;
    }

    @NotNull
    public String toString() {
        SlimTimeBarState slimTimeBarState = this.timeline;
        VideoMoleculePlayPauseState videoMoleculePlayPauseState = this.playPause;
        Function1<Long, String> function1 = this.timeFormatter;
        boolean z11 = this.isCompact;
        boolean z12 = this.isFullscreen;
        boolean z13 = this.isFinished;
        boolean z14 = this.isScrubbing;
        StringBuilder sb2 = new StringBuilder("VideoMoleculeControlPanelState(timeline=");
        sb2.append(slimTimeBarState);
        sb2.append(", playPause=");
        sb2.append(videoMoleculePlayPauseState);
        sb2.append(", timeFormatter=");
        sb2.append(function1);
        sb2.append(", isCompact=");
        sb2.append(z11);
        sb2.append(", isFullscreen=");
        f.c(", isFinished=", ", isScrubbing=", sb2, z12, z13);
        return a.a(")", sb2, z14);
    }
}
