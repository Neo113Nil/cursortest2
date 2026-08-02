package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes12.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = versionedParcel.j(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = versionedParcel.j(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = versionedParcel.j(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = versionedParcel.j(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.s(audioAttributesImplBase.a, 1);
        versionedParcel.s(audioAttributesImplBase.b, 2);
        versionedParcel.s(audioAttributesImplBase.c, 3);
        versionedParcel.s(audioAttributesImplBase.d, 4);
    }
}
