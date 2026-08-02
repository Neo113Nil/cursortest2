package defpackage;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ug implements wg {
    public final NativeAd a;

    public ug(NativeAd nativeAd) {
        this.a = nativeAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug) && this.a.equals(((ug) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(nativeAd=" + this.a + ")";
    }
}
