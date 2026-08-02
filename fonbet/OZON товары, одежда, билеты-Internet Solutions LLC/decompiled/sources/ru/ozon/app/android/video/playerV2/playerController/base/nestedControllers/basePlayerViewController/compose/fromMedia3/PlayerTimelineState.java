package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3;

import S0.C3959g1;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3974n0;
import S0.InterfaceC3978p0;
import S0.n1;
import j3.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.utils.PlayerStatusSnapshot;
import ru.ozon.app.android.video.playerV2.utils.PlayerStatusSnapshotKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR+\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R+\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R+\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010'\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R+\u0010*\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R+\u0010-\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%¨\u0006/"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "", "Lj3/y;", "player", "<init>", "(Lj3/y;)V", "", "updateStatus", "()V", "updateProgress", "resetProgress", "update$video_prodGoogleAllVendorsRelease", "update", "Lj3/y;", "", "<set-?>", "positionMs$delegate", "LS0/n0;", "getPositionMs", "()J", "setPositionMs", "(J)V", "positionMs", "bufferedPositionMs$delegate", "getBufferedPositionMs", "setBufferedPositionMs", "bufferedPositionMs", "durationMs$delegate", "getDurationMs", "setDurationMs", "durationMs", "", "isSeekEnabled$delegate", "LS0/p0;", "isSeekEnabled", "()Z", "setSeekEnabled", "(Z)V", "isPlaying$delegate", "isPlaying", "setPlaying", "isFinished$delegate", "isFinished", "setFinished", "isBuffering$delegate", "isBuffering", "setBuffering", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayerTimelineState {

    /* renamed from: bufferedPositionMs$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3974n0 bufferedPositionMs;

    /* renamed from: durationMs$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3974n0 durationMs;

    /* renamed from: isBuffering$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 isBuffering;

    /* renamed from: isFinished$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 isFinished;

    /* renamed from: isPlaying$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 isPlaying;

    /* renamed from: isSeekEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 isSeekEnabled;

    @NotNull
    private final y player;

    /* renamed from: positionMs$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3974n0 positionMs;

    public PlayerTimelineState(@NotNull y player) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        Intrinsics.checkNotNullParameter(player, "player");
        this.player = player;
        this.positionMs = C3959g1.a(0L);
        this.bufferedPositionMs = C3959g1.a(0L);
        this.durationMs = C3959g1.a(0L);
        Boolean bool = Boolean.FALSE;
        f7 = n1.f(bool, D1.f25195a);
        this.isSeekEnabled = f7;
        f11 = n1.f(bool, D1.f25195a);
        this.isPlaying = f11;
        f12 = n1.f(bool, D1.f25195a);
        this.isFinished = f12;
        f13 = n1.f(bool, D1.f25195a);
        this.isBuffering = f13;
    }

    private final void resetProgress() {
        setPositionMs(0L);
        setBufferedPositionMs(0L);
        setDurationMs(0L);
        setSeekEnabled(false);
    }

    private final void setBufferedPositionMs(long j11) {
        this.bufferedPositionMs.t(j11);
    }

    private final void setBuffering(boolean z11) {
        this.isBuffering.setValue(Boolean.valueOf(z11));
    }

    private final void setDurationMs(long j11) {
        this.durationMs.t(j11);
    }

    private final void setFinished(boolean z11) {
        this.isFinished.setValue(Boolean.valueOf(z11));
    }

    private final void setPlaying(boolean z11) {
        this.isPlaying.setValue(Boolean.valueOf(z11));
    }

    private final void setPositionMs(long j11) {
        this.positionMs.t(j11);
    }

    private final void setSeekEnabled(boolean z11) {
        this.isSeekEnabled.setValue(Boolean.valueOf(z11));
    }

    private final void updateProgress() {
        if (!this.player.l(16)) {
            resetProgress();
            return;
        }
        setDurationMs(PlayerStatusSnapshotKt.toTimelineValue(this.player.q()));
        Long valueOf = Long.valueOf(getDurationMs());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : Long.MAX_VALUE;
        long timelineValue = PlayerStatusSnapshotKt.toTimelineValue(this.player.O());
        if (timelineValue > longValue) {
            timelineValue = longValue;
        }
        setPositionMs(timelineValue);
        setBufferedPositionMs(h.g(PlayerStatusSnapshotKt.toTimelineValue(this.player.x()), getPositionMs(), longValue));
        setSeekEnabled(getDurationMs() > 0 && this.player.l(5));
    }

    private final void updateStatus() {
        PlayerStatusSnapshot playerStatusSnapshot = PlayerStatusSnapshotKt.playerStatusSnapshot(this.player);
        setPlaying(playerStatusSnapshot.getIsPlaying());
        setFinished(playerStatusSnapshot.getIsFinished());
        setBuffering(playerStatusSnapshot.getIsBuffering());
    }

    public final long getBufferedPositionMs() {
        return this.bufferedPositionMs.n();
    }

    public final long getDurationMs() {
        return this.durationMs.n();
    }

    public final long getPositionMs() {
        return this.positionMs.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isBuffering() {
        return ((Boolean) this.isBuffering.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isFinished() {
        return ((Boolean) this.isFinished.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPlaying() {
        return ((Boolean) this.isPlaying.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSeekEnabled() {
        return ((Boolean) this.isSeekEnabled.getValue()).booleanValue();
    }

    public final void update$video_prodGoogleAllVendorsRelease() {
        updateStatus();
        updateProgress();
    }
}
