package ru.ozon.app.android.video.player.audioRequestService;

import android.content.Context;
import android.media.AudioManager;
import androidx.media.AudioAttributesCompat;
import androidx.media.a;
import androidx.media.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zY.C11007a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/video/player/audioRequestService/AudioRequestServiceImpl;", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/media/a;", "getAudioFocusRequest", "()Landroidx/media/a;", "createAudioFocusRequest", "", "playerHashtag", "", "removePlayerFromPool", "(I)Z", "addPlayerToPool", "isPlayerPoolIsClear", "()Z", "playerHashCode", "", "requestAudioFocus", "(I)V", "abandonAudioFocusRequest", "Landroid/content/Context;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "audioFocusRequest", "Landroidx/media/a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AudioRequestServiceImpl implements AudioRequestService {
    private a audioFocusRequest;

    @NotNull
    private final AudioManager audioManager;

    @NotNull
    private final Context context;

    public AudioRequestServiceImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("audio");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
    }

    private final boolean addPlayerToPool(int playerHashtag) {
        return AudioRequestState.INSTANCE.getPlayerHashtagPool().add(Integer.valueOf(playerHashtag));
    }

    private final a createAudioFocusRequest() {
        AudioAttributesCompat.a aVar = new AudioAttributesCompat.a();
        aVar.b();
        aVar.c();
        AudioAttributesCompat a11 = aVar.a();
        a.b bVar = new a.b();
        bVar.b(a11);
        bVar.d();
        bVar.c(new C11007a());
        a a12 = bVar.a();
        Intrinsics.checkNotNullExpressionValue(a12, "build(...)");
        return a12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAudioFocusRequest$lambda$1(int i11) {
    }

    private final a getAudioFocusRequest() {
        a aVar = this.audioFocusRequest;
        if (aVar != null) {
            return aVar;
        }
        a createAudioFocusRequest = createAudioFocusRequest();
        this.audioFocusRequest = createAudioFocusRequest;
        return createAudioFocusRequest;
    }

    private final boolean isPlayerPoolIsClear() {
        return AudioRequestState.INSTANCE.getPlayerHashtagPool().isEmpty();
    }

    private final boolean removePlayerFromPool(int playerHashtag) {
        return AudioRequestState.INSTANCE.getPlayerHashtagPool().remove(Integer.valueOf(playerHashtag));
    }

    @Override // ru.ozon.app.android.video.player.audioRequestService.AudioRequestService
    public void abandonAudioFocusRequest(int playerHashCode) {
        removePlayerFromPool(playerHashCode);
        if (isPlayerPoolIsClear()) {
            b.a(this.audioManager, getAudioFocusRequest());
        }
    }

    @Override // ru.ozon.app.android.video.player.audioRequestService.AudioRequestService
    public void requestAudioFocus(int playerHashCode) {
        addPlayerToPool(playerHashCode);
        b.b(this.audioManager, getAudioFocusRequest());
    }
}
