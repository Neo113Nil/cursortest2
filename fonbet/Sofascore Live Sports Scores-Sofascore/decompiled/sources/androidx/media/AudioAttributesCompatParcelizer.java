package androidx.media;

import defpackage.kok;
import defpackage.mok;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(kok kokVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        mok mokVar = audioAttributesCompat.a;
        if (kokVar.e(1)) {
            mokVar = kokVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) mokVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, kok kokVar) {
        kokVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        kokVar.i(1);
        kokVar.l(audioAttributesImpl);
    }
}
