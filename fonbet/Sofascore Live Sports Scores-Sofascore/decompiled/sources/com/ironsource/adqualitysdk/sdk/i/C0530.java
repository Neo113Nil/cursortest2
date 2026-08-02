package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import jp.maio.sdk.android.AdFullscreenActivity;
import jp.maio.sdk.android.HtmlBasedAdActivity;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsInstance;
import jp.maio.sdk.android.MaioAdsListener;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0530 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1773 = StringFog.decrypt("7t63SoM/P1L5yI9ukSI1ffjJ\n", "nbvDB+JWUBM=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1772 = StringFog.decrypt("5CDZyLawjw==\n", "qUGwp/fU/P8=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1771 = StringFog.decrypt("Y7SNIWUXwhZAppAvShDU\n", "LtXkTiRzsV8=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1770 = StringFog.decrypt("MwVcYOD+u/YXF0Fqz/+6\n", "fmQ1D6GayLo=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1769 = StringFog.decrypt("/SJes71sEXbZMEO5km0Qc943Uq6aaQFf\n", "sEM33PwIYjo=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1768 = StringFog.decrypt("PGlQuQ+nIXwPaHOiIqgmdgtkYrU=\n", "fQ0WzGPLUh8=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1767 = StringFog.decrypt("+KerMszvaavhs+5xzOhi9/2+4XHs4kDw/rv2PN/jY+vTtPE22+9y/A==\n", "kteFX62GBoU=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1766 = StringFog.decrypt("XaC1lr4UkDVxlby7nwGKJnygoQ==\n", "FdTY+vx141A=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1765 = StringFog.decrypt("5+LaL/tkHsb+9p9s+2MVmuL7kGzSeRyEz/OHJ/5MFanu5p0083kI\n", "jZL0QpoNceg=\n");

    public C0530(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        return MaioAds.getSdkVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f1773, new C0599(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        switch (str.hashCode()) {
            case -1799290762:
                if (str.equals(f1772)) {
                    return MaioAds.class;
                }
                return null;
            case -1455130644:
                if (str.equals(f1767)) {
                    return AdFullscreenActivity.class;
                }
                return null;
            case -1303622385:
                if (str.equals(f1769)) {
                    return MaioAdsListenerInterface.class;
                }
                return null;
            case -1069735125:
                if (str.equals(f1771)) {
                    return MaioAdsInstance.class;
                }
                return null;
            case -278703286:
                if (str.equals(f1770)) {
                    return MaioAdsListener.class;
                }
                return null;
            case 357386522:
                if (str.equals(f1766)) {
                    return HtmlBasedAdActivity.class;
                }
                return null;
            case 1819361677:
                if (str.equals(f1768)) {
                    return AdFullscreenActivity.class;
                }
                return null;
            case 1914325723:
                if (str.equals(f1765)) {
                    return HtmlBasedAdActivity.class;
                }
                return null;
            default:
                return null;
        }
    }
}
