package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٵ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0486 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final byte[] f1554;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] f1555;

    public C0486(byte[] bArr, byte[] bArr2) {
        this.f1555 = bArr;
        this.f1554 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0486)) {
            return false;
        }
        C0486 c0486 = (C0486) obj;
        return Arrays.equals(this.f1555, c0486.f1555) && Arrays.equals(this.f1554, c0486.f1554);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1554) + (Arrays.hashCode(this.f1555) * 31);
    }

    public final String toString() {
        return StringFog.decrypt("8CAPl4jqD1bZGwKLte4URc4gFZuT7glS/jUesJz7GESI\n", "tVBn8uWPfTc=\n") + Arrays.toString(this.f1555) + StringFog.decrypt("KAXvuOJQ6opPQOaP+Ujmmjk=\n", "BCWfzYA8g+k=\n") + Arrays.toString(this.f1554) + '}';
    }
}
