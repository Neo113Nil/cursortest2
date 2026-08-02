package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.a70;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯾ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC1069 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Charset f3368 = Charset.forName(StringFog.decrypt("Hk16PR4=\n", "Sxk8ECZDwmg=\n"));

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m641(byte[] bArr, C1075 c1075, C0506 c0506) {
        if (bArr.length < 29) {
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("msS8OLjvbCbo1aAn9/J3LLrV9Wg=\n", "yKHPSNeBH0M=\n"));
            sb.append(bArr.length);
            a70.p(AbstractC1133.m662("WmbiMYTJ\n", "egSbReG6fDM=\n", sb));
            return null;
        }
        int i = (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + 1;
        if (i > bArr.length) {
            a70.p(StringFog.decrypt("jO9+bxGNat3+/n9qEIB4zLvuLX4Kw3fXsOlo\n", "3ooNH37jGbg=\n"));
            return null;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i, bArr.length);
        if (copyOfRange2.length < 16) {
            a70.p(StringFog.decrypt("GdktIf5/a+VryCwk/3J59C7YfjDlMXvpO9Q7I+V0YPQ=\n", "S7xeUZERGIA=\n"));
            return null;
        }
        c0506.getClass();
        byte[] bArr2 = C0506.f1696;
        byte[] bArr3 = new byte[bArr2.length + 3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        bArr3[bArr2.length] = 0;
        bArr3[bArr2.length + 1] = 1;
        bArr3[bArr2.length + 2] = 2;
        return c0506.m338(c0506.m337(c1075.f3378, copyOfRange, bArr3), copyOfRange, copyOfRange2, c1075.f3379.getBytes(f3368));
    }
}
