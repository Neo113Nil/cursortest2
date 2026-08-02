package androidx.media;

import android.media.AudioAttributes;
import defpackage.kok;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(kok kokVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) kokVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = kokVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, kok kokVar) {
        kokVar.getClass();
        kokVar.k(audioAttributesImplApi21.a, 1);
        kokVar.j(audioAttributesImplApi21.b, 2);
    }
}
