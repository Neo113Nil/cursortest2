package androidx.media;

import M2.a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f20458a = aVar.p(audioAttributesImplBase.f20458a, 1);
        audioAttributesImplBase.f20459b = aVar.p(audioAttributesImplBase.f20459b, 2);
        audioAttributesImplBase.f20460c = aVar.p(audioAttributesImplBase.f20460c, 3);
        audioAttributesImplBase.f20461d = aVar.p(audioAttributesImplBase.f20461d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f20458a, 1);
        aVar.F(audioAttributesImplBase.f20459b, 2);
        aVar.F(audioAttributesImplBase.f20460c, 3);
        aVar.F(audioAttributesImplBase.f20461d, 4);
    }
}
