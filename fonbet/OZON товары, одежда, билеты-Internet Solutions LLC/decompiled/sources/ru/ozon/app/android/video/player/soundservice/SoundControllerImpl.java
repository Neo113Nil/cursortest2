package ru.ozon.app.android.video.player.soundservice;

import Ae.InterfaceC2395h;
import Ge.n;
import Nc.C3667a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.soundservice.soundContentObserver.SoundContentObserver;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/video/player/soundservice/SoundControllerImpl;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver;", "soundContentObserver", "<init>", "(Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver;)V", "", "isSoundMuted", "", "setSoundMutedState", "(Z)V", "LNc/a;", "soundMutedState", "LNc/a;", "getSoundMutedState", "()LNc/a;", "Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver$Listener;", "LAe/h;", "getSoundMutedStateFlow", "()LAe/h;", "soundMutedStateFlow", "isMuted", "()Z", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SoundControllerImpl implements SoundController {

    @NotNull
    private final SoundContentObserver.Listener listener;

    @NotNull
    private final C3667a<Boolean> soundMutedState;

    public SoundControllerImpl(@NotNull SoundContentObserver soundContentObserver) {
        Intrinsics.checkNotNullParameter(soundContentObserver, "soundContentObserver");
        C3667a<Boolean> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.soundMutedState = d11;
        SoundContentObserver.Listener listener = new SoundContentObserver.Listener() { // from class: ru.ozon.app.android.video.player.soundservice.SoundControllerImpl$listener$1
            @Override // ru.ozon.app.android.video.player.soundservice.soundContentObserver.SoundContentObserver.Listener
            public void onMute() {
                SoundControllerImpl.this.setSoundMutedState(true);
            }

            @Override // ru.ozon.app.android.video.player.soundservice.soundContentObserver.SoundContentObserver.Listener
            public void onUnmute() {
                SoundControllerImpl.this.setSoundMutedState(false);
            }
        };
        this.listener = listener;
        soundContentObserver.addListener(listener);
    }

    @Override // ru.ozon.app.android.video.player.soundservice.SoundController
    @NotNull
    public InterfaceC2395h<Boolean> getSoundMutedStateFlow() {
        return n.a(getSoundMutedState());
    }

    @Override // ru.ozon.app.android.video.player.soundservice.SoundController
    public boolean isMuted() {
        return !Intrinsics.d(getSoundMutedState().f(), Boolean.FALSE);
    }

    @Override // ru.ozon.app.android.video.player.soundservice.SoundController
    public void setSoundMutedState(boolean isSoundMuted) {
        getSoundMutedState().onNext(Boolean.valueOf(isSoundMuted));
    }

    @Override // ru.ozon.app.android.video.player.soundservice.SoundController
    @NotNull
    public C3667a<Boolean> getSoundMutedState() {
        return this.soundMutedState;
    }
}
