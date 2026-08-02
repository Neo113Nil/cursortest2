package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڋ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0494 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] f1569;

    public C0494(byte[] bArr) {
        this.f1569 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0494) {
            return Arrays.equals(this.f1569, ((C0494) obj).f1569);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1569);
    }

    public final String toString() {
        return StringFog.decrypt("DexSQCPCu9Eg/UhHGNegwT79VlwF8KHQJN1SQ0w=\n", "TIkzJHGnyKQ=\n") + Arrays.toString(this.f1569) + '}';
    }
}
