package Gj;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import c1.AbstractC2477a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {
    public final AudioFocusRequest a(AudioManager.OnAudioFocusChangeListener listener) {
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest build;
        Intrinsics.checkNotNullParameter(listener, "listener");
        onAudioFocusChangeListener = AbstractC2477a.a(1).setOnAudioFocusChangeListener(listener);
        audioAttributes = onAudioFocusChangeListener.setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build());
        build = audioAttributes.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
