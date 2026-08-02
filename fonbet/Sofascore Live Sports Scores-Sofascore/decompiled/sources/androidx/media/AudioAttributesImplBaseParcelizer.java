package androidx.media;

import defpackage.kok;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(kok kokVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = kokVar.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = kokVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = kokVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = kokVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, kok kokVar) {
        kokVar.getClass();
        kokVar.j(audioAttributesImplBase.a, 1);
        kokVar.j(audioAttributesImplBase.b, 2);
        kokVar.j(audioAttributesImplBase.c, 3);
        kokVar.j(audioAttributesImplBase.d, 4);
    }
}
