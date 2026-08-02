package m9;

import android.media.MediaPlayer;
import android.util.Log;

/* loaded from: classes9.dex */
public final /* synthetic */ class d implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
        Log.w("e", "Failed to beep " + i11 + ", " + i12);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }
}
