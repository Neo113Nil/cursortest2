package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import xsna.for0;

/* loaded from: classes12.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        for0 for0Var = audioAttributesCompat.a;
        if (versionedParcel.h(1)) {
            for0Var = versionedParcel.m();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) for0Var;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        versionedParcel.n(1);
        versionedParcel.v(audioAttributesImpl);
    }
}
