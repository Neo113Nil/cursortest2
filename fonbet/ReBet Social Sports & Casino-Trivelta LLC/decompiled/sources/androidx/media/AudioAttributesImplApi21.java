package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f20456a;

    /* renamed from: b, reason: collision with root package name */
    public int f20457b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f20456a.equals(((AudioAttributesImplApi21) obj).f20456a);
        }
        return false;
    }

    public int hashCode() {
        return this.f20456a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f20456a;
    }
}
