package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class caa implements fm8 {
    public final q9k a;

    public caa(q9k q9kVar) {
        this.a = q9kVar;
    }

    @Override // defpackage.fm8
    public final int a() {
        return IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof caa) && this.a.equals(((caa) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IntroDescriptionCard(description=" + this.a + ", durationMilliseconds=3000)";
    }
}
