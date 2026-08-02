package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sii extends IllegalStateException {
    public final int a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sii(int i, int i2) {
        super(r0);
        String k;
        if (i == 0) {
            k = lnb.k(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            k = lnb.k(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            k = lnb.k(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            k = lnb.k(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                zzl.s();
                throw null;
            }
            k = lnb.k(i2, "Player stuck suppressed for ", " ms");
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sii.class != obj.getClass()) {
            return false;
        }
        sii siiVar = (sii) obj;
        return this.a == siiVar.a && this.b == siiVar.b;
    }

    public final int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b;
    }
}
