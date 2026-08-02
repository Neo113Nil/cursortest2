package ru.ozon.app.android.video.player.audioRequestService;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/video/player/audioRequestService/AudioRequestState;", "", "<init>", "()V", "playerHashtagPool", "", "", "getPlayerHashtagPool", "()Ljava/util/Set;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AudioRequestState {

    @NotNull
    public static final AudioRequestState INSTANCE = new AudioRequestState();

    @NotNull
    private static final Set<Integer> playerHashtagPool = new LinkedHashSet();
    public static final int $stable = 8;

    private AudioRequestState() {
    }

    @NotNull
    public final Set<Integer> getPlayerHashtagPool() {
        return playerHashtagPool;
    }
}
