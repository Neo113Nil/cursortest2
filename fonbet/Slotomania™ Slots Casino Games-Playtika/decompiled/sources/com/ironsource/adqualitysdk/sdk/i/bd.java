package com.ironsource.adqualitysdk.sdk.i;

import android.util.TypedValue;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bd extends be {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f772 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f773 = 46072;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f774 = 8306;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f775 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f776 = 30620;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f777 = 47659;

    public bd(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f772 + 27;
        f775 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m6369("\ue62e\uf8b3袈᧼ｶ㈜䥦க", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7).intern();
        int i4 = f775 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f772 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final Class mo6356(String str) {
        int i = 2 % 2;
        int i2 = f772 + 65;
        int i3 = i2 % 128;
        f775 = i3;
        if (i2 % 2 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = i3 + 37;
        f772 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        int i2 = f775 + 67;
        f772 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean mo6370() {
        int i = 2 % 2;
        int i2 = f775;
        int i3 = i2 + 39;
        f772 = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 35;
        f772 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6369(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f776)) ^ ((c2 >>> 5) + f773)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f774) ^ ((c3 + i2) ^ ((c3 << 4) + f777))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
