package k5;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.annotation.NonNull;

/* renamed from: k5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7507e extends Y {

    /* renamed from: i, reason: collision with root package name */
    private AudioFocusRequest f70730i;

    @Override // k5.Y
    final int o(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.f70730i = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(10).setContentType(4).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(onAudioFocusChangeListener, d()).build();
        return e().requestAudioFocus(this.f70730i);
    }

    @Override // k5.Y
    final void p(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        if (this.f70730i != null) {
            e().abandonAudioFocusRequest(this.f70730i);
            this.f70730i = null;
        }
    }
}
