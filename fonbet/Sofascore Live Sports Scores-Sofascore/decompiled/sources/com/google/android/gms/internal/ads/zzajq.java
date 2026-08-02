package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzajq extends zzajz {
    public final byte[] b;

    public zzajq(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajq.class != obj.getClass()) {
            return false;
        }
        zzajq zzajqVar = (zzajq) obj;
        return this.a.equals(zzajqVar.a) && Arrays.equals(this.b, zzajqVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
