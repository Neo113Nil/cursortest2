package zY;

import android.media.AudioManager;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestServiceImpl;

/* renamed from: zY.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C11007a implements AudioManager.OnAudioFocusChangeListener {
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i11) {
        AudioRequestServiceImpl.createAudioFocusRequest$lambda$1(i11);
    }
}
