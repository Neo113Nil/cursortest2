package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.AdFullscreenActivity;
import jp.maio.sdk.android.HtmlBasedAdActivity;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsInstance;
import jp.maio.sdk.android.MaioAdsListener;
import jp.maio.sdk.android.MaioAdsListenerInterface;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class bu extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1065 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1066 = {'9', 'k', 'R', 'X', 'l', 'e', 'W', 252, 252, 265, 250, 266, 259, 259, 268, 221, 251, 216, 272, 267, 256, 269, 256, 267, 250, 216, 261, 153, 303, 295, 296, 296, 295, 292, 267, 272, 290, 286, 292, 291, 292, 296, 293, 297, 278, 270, 267, 240, 258, 287, 293, 297, 292, 290, 288, 256, 261, 288, 292, 265, 263, 293, 286, 288, 262, 264, 294, Typography.dollar, '^', 'p', 'l', 'W', 'Q', 'j', 'l', GMTDateParser.DAY_OF_MONTH, 'R', 'R', 'R', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '5', GMTDateParser.MINUTES, 'O', GMTDateParser.MONTH, 'g', 'e', 'l', 'N', 'P', 'k', 'g', 'L', 'G', 'g', 'i', 'k', 'p', 'l', 'f', 'I', ';', '^', 'p', 'l', 'W', 'Q', 'j', 'l', GMTDateParser.DAY_OF_MONTH, 'R', 'R', 'R', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '2', GMTDateParser.DAY_OF_MONTH, GMTDateParser.HOURS, 'g', 'j', GMTDateParser.SECONDS, 'p', AbstractJsonLexerKt.BEGIN_LIST, '^', 'k', 'R', 'X', 'l', 'e', 'W', '9', 'k', 'i', 'i', 'l', GMTDateParser.SECONDS, 'n', 'Z', '_', 'k', 'R', 'X', 'l', 'e', 'W', 'n', 220, 218, 219, 228, 227, 228, 233, 211, 213, 227, 225, 225, 228, 235, 230, 210, Typography.times, 227, 202, 208, 228, 221, 207, '9', 'k', 'i', 'i', 'l', GMTDateParser.SECONDS, 'n', 'Z', '_', 'k', 'R', 'X', 'l', 'e', 'W', '`', 'l', 'l'};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1067;

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6753(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i = 2 % 2;
        int i2 = f1065 + 23;
        f1067 = i2 % 128;
        int i3 = i2 % 2;
        m6752(maioAdsListenerInterface);
        int i4 = f1067 + 33;
        f1065 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public bu(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        String sdkVersion;
        int i = 2 % 2;
        int i2 = f1067 + 113;
        f1065 = i2 % 128;
        if (i2 % 2 == 0) {
            sdkVersion = MaioAds.getSdkVersion();
            int i3 = 31 / 0;
        } else {
            sdkVersion = MaioAds.getSdkVersion();
        }
        int i4 = f1067 + 31;
        f1065 = i4 % 128;
        if (i4 % 2 != 0) {
            return sdkVersion;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (r9.equals(m6751("\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000", new int[]{155, 24, 120, 0}, true).intern()) != false) goto L30;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        int i = 2 % 2;
        char c = 7;
        switch (str.hashCode()) {
            case -1799290762:
                if (!(!str.equals(m6751("\u0001\u0001\u0001\u0000\u0000\u0000\u0000", new int[]{0, 7, 0, 0}, true).intern()))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455130644:
                if (str.equals(m6751("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000", new int[]{27, 40, 185, 0}, true).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1303622385:
                break;
            case -1069735125:
                if (str.equals(m6751("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000", new int[]{Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 15, 0, 0}, true).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -278703286:
                if (str.equals(m6751("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000", new int[]{140, 15, 0, 0}, true).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 357386522:
                if (str.equals(m6751("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{67, 19, 0, 0}, false).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1819361677:
                if (str.equals(m6751(null, new int[]{7, 20, 151, 11}, true).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1914325723:
                if (str.equals(m6751("\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{86, 39, 0, 0}, false).intern())) {
                    int i2 = f1067 + 13;
                    f1065 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                int i4 = f1067 + 43;
                f1065 = i4 % 128;
                int i5 = i4 % 2;
                return MaioAds.class;
            case 1:
            case 2:
                int i6 = f1065 + 47;
                f1067 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 48 / 0;
                }
                return AdFullscreenActivity.class;
            case 3:
            case 4:
                return HtmlBasedAdActivity.class;
            case 5:
                return MaioAdsInstance.class;
            case 6:
                return MaioAdsListener.class;
            case 7:
                return MaioAdsListenerInterface.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6751("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{179, 18, 0, 0}, true).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bu.m6753((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        int i2 = f1067 + 95;
        f1065 = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m6752(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i = 2 % 2;
        int i2 = f1067 + 113;
        f1065 = i2 % 128;
        int i3 = i2 % 2;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6751(String str, int[] iArr, boolean z) {
        String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        synchronized (h.f2286) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f1066, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                h.f2287 = 0;
                char c = 0;
                while (h.f2287 < i2) {
                    if (bArr2[h.f2287] == 1) {
                        cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c);
                    } else {
                        cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c);
                    }
                    c = cArr2[h.f2287];
                    h.f2287++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr4[h.f2287] = cArr[(i2 - h.f2287) - 1];
                    h.f2287++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                    h.f2287++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
