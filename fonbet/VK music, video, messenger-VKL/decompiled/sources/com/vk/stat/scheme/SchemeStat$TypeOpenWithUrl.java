package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeOpenWithUrl implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("referral_url")
    private final String referralUrl;

    @pmi0("url")
    private final String url;

    @pmi0("webview_platform")
    private final WebviewPlatform webviewPlatform;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class WebviewPlatform {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WebviewPlatform[] $VALUES;

        @pmi0("android")
        public static final WebviewPlatform ANDROID;

        static {
            WebviewPlatform webviewPlatform = new WebviewPlatform("ANDROID", 0);
            ANDROID = webviewPlatform;
            WebviewPlatform[] webviewPlatformArr = {webviewPlatform};
            $VALUES = webviewPlatformArr;
            $ENTRIES = new asp(webviewPlatformArr);
        }

        private WebviewPlatform(String str, int i) {
        }

        public static WebviewPlatform valueOf(String str) {
            return (WebviewPlatform) Enum.valueOf(WebviewPlatform.class, str);
        }

        public static WebviewPlatform[] values() {
            return (WebviewPlatform[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeOpenWithUrl() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeOpenWithUrl)) {
            return false;
        }
        SchemeStat$TypeOpenWithUrl schemeStat$TypeOpenWithUrl = (SchemeStat$TypeOpenWithUrl) obj;
        return epx.f(this.referralUrl, schemeStat$TypeOpenWithUrl.referralUrl) && epx.f(this.url, schemeStat$TypeOpenWithUrl.url) && this.webviewPlatform == schemeStat$TypeOpenWithUrl.webviewPlatform;
    }

    public final int hashCode() {
        String str = this.referralUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WebviewPlatform webviewPlatform = this.webviewPlatform;
        return hashCode2 + (webviewPlatform != null ? webviewPlatform.hashCode() : 0);
    }

    public final String toString() {
        return "TypeOpenWithUrl(referralUrl=" + this.referralUrl + ", url=" + this.url + ", webviewPlatform=" + this.webviewPlatform + ')';
    }

    public SchemeStat$TypeOpenWithUrl(String str, String str2, WebviewPlatform webviewPlatform) {
        this.referralUrl = str;
        this.url = str2;
        this.webviewPlatform = webviewPlatform;
    }

    public /* synthetic */ SchemeStat$TypeOpenWithUrl(String str, String str2, WebviewPlatform webviewPlatform, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : webviewPlatform);
    }
}
