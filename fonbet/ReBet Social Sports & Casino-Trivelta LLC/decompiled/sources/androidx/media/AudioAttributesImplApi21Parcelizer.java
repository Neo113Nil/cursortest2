package androidx.media;

import M2.a;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f20456a = (AudioAttributes) aVar.r(audioAttributesImplApi21.f20456a, 1);
        audioAttributesImplApi21.f20457b = aVar.p(audioAttributesImplApi21.f20457b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.x(false, false);
        aVar.H(audioAttributesImplApi21.f20456a, 1);
        aVar.F(audioAttributesImplApi21.f20457b, 2);
    }
}
