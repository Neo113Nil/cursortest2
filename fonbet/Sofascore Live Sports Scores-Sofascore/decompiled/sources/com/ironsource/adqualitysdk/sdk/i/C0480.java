package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.a70;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ه, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0480 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] f1548;

    public C0480(byte[] bArr) {
        if (bArr.length == 65) {
            if (bArr[0] == 4) {
                this.f1548 = Arrays.copyOf(bArr, bArr.length);
                return;
            } else {
                a70.p(StringFog.decrypt("OgKHyszeYNIPDsXL0M40mRkDhNTRnTfQHh/Flt2NdJlCAovFytAwyw8ElsPBnTDWAxmRjw==\n", "anflpqW9QLk=\n"));
                throw null;
            }
        }
        throw new IllegalArgumentException(StringFog.decrypt("vnyO3h1zQMGLcMzfAWMUioxszIRBMALTmmyfklxlDsmBZJzAEWMTz4opv/c3IUmGzm6DxlQ=\n", "7gnssnQQYKo=\n") + Integer.valueOf(bArr.length));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0480 m297(String str) {
        if (str.startsWith(StringFog.decrypt("qBI=\n", "mGrBxmLq2Ao=\n")) || str.startsWith(StringFog.decrypt("R8U=\n", "d53YnzQoh9E=\n"))) {
            str = str.substring(2);
        }
        if (str.length() % 2 != 0) {
            a70.p(StringFog.decrypt("WooX94M2tFt8iE+6hTGyEnqOGbLQJ7BXfM8Dsp4lslo=\n", "Eu9v1/BCxjI=\n"));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return new C0480(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0480) {
            return Arrays.equals(this.f1548, ((C0480) obj).f1548);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1548) + 31;
    }

    public final String toString() {
        return StringFog.decrypt("bGutJum3W99Cd50RsQ==\n", "Jw7UdYzDILQ=\n") + 1 + StringFog.decrypt("zY38tmlU9w6qyPWBckz7Htw=\n", "4a2Mwws4nm0=\n") + Arrays.toString(this.f1548) + '}';
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m298() {
        byte[] bArr = this.f1548;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
