package ru.ozon.app.android.video.player.soundservice;

import Ae.InterfaceC2395h;
import io.reactivex.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/video/player/soundservice/SoundController;", "", "", "isSoundMuted", "", "setSoundMutedState", "(Z)V", "Lio/reactivex/p;", "getSoundMutedState", "()Lio/reactivex/p;", "getSoundMutedState$annotations", "()V", "soundMutedState", "LAe/h;", "getSoundMutedStateFlow", "()LAe/h;", "soundMutedStateFlow", "isMuted", "()Z", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SoundController {
    @NotNull
    p<Boolean> getSoundMutedState();

    @NotNull
    InterfaceC2395h<Boolean> getSoundMutedStateFlow();

    boolean isMuted();

    void setSoundMutedState(boolean isSoundMuted);
}
