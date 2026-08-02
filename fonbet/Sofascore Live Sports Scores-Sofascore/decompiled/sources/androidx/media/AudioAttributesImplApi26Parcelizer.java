package androidx.media;

import android.media.AudioAttributes;
import defpackage.kok;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(kok kokVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) kokVar.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = kokVar.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, kok kokVar) {
        kokVar.getClass();
        kokVar.k(audioAttributesImplApi26.a, 1);
        kokVar.j(audioAttributesImplApi26.b, 2);
    }
}
