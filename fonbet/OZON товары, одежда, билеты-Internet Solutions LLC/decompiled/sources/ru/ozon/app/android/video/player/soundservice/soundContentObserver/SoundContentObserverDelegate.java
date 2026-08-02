package ru.ozon.app.android.video.player.soundservice.soundContentObserver;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.soundservice.soundContentObserver.SoundContentObserver;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserverDelegate;", "", "handleOnVolumeChange", "", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver$Listener;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SoundContentObserverDelegate {
    void addListener(@NotNull SoundContentObserver.Listener listener);

    void handleOnVolumeChange();
}
