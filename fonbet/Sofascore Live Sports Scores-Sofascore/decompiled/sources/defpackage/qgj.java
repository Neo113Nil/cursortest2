package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qgj implements lic {
    public final long a;

    public qgj(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qgj.class == obj.getClass() && this.a == ((qgj) obj).a;
    }

    public final int hashCode() {
        return jaa.F(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }
}
