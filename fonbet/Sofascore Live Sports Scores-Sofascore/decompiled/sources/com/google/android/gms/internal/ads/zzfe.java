package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfe extends IllegalStateException {
    public final int a;
    public final int b;

    public zzfe(int i, int i2) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? fn0.k(i2, "Player stuck suppressed for ", " ms", new StringBuilder(String.valueOf(i2).length() + 31)) : fn0.k(i2, "Player stuck playing without ending for ", " ms", new StringBuilder(String.valueOf(i2).length() + 43)) : fn0.k(i2, "Player stuck playing with no progress for ", " ms", new StringBuilder(String.valueOf(i2).length() + 45)) : fn0.k(i2, "Player stuck buffering with no progress for ", " ms", new StringBuilder(String.valueOf(i2).length() + 47)) : fn0.k(i2, "Player stuck buffering and not loading for ", " ms", new StringBuilder(String.valueOf(i2).length() + 46)));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzfe.class != obj.getClass()) {
            return false;
        }
        zzfe zzfeVar = (zzfe) obj;
        return this.a == zzfeVar.a && this.b == zzfeVar.b;
    }

    public final int hashCode() {
        return ((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b;
    }
}
