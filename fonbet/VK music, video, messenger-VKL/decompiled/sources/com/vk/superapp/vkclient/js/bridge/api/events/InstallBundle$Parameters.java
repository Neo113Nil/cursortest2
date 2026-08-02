package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: InstallBundle.kt */
/* loaded from: classes6.dex */
public final class InstallBundle$Parameters implements ad6 {

    @pmi0("app_title")
    private final String appTitle;

    @pmi0("package_name")
    private final String packageName;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("url")
    private final String url;

    @pmi0("version_code")
    private final Integer versionCode;

    @pmi0("version_name")
    private final String versionName;

    public InstallBundle$Parameters(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.url = str;
        this.requestId = str2;
        this.packageName = str3;
        this.appTitle = str4;
        this.versionName = str5;
        this.versionCode = num;
    }

    public static final InstallBundle$Parameters a(InstallBundle$Parameters installBundle$Parameters) {
        return installBundle$Parameters.requestId == null ? new InstallBundle$Parameters(installBundle$Parameters.url, "default_request_id", installBundle$Parameters.packageName, installBundle$Parameters.appTitle, installBundle$Parameters.versionName, installBundle$Parameters.versionCode) : installBundle$Parameters;
    }

    public static final void b(InstallBundle$Parameters installBundle$Parameters) {
        if (installBundle$Parameters.url == null) {
            throw new IllegalArgumentException("Value of non-nullable member url cannot be\n                        null");
        }
        if (installBundle$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallBundle$Parameters)) {
            return false;
        }
        InstallBundle$Parameters installBundle$Parameters = (InstallBundle$Parameters) obj;
        return epx.f(this.url, installBundle$Parameters.url) && epx.f(this.requestId, installBundle$Parameters.requestId) && epx.f(this.packageName, installBundle$Parameters.packageName) && epx.f(this.appTitle, installBundle$Parameters.appTitle) && epx.f(this.versionName, installBundle$Parameters.versionName) && epx.f(this.versionCode, installBundle$Parameters.versionCode);
    }

    public final int hashCode() {
        int a = urd0.a(this.url.hashCode() * 31, 31, this.requestId);
        String str = this.packageName;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.versionName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.versionCode;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(url=");
        sb.append(this.url);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", packageName=");
        sb.append(this.packageName);
        sb.append(", appTitle=");
        sb.append(this.appTitle);
        sb.append(", versionName=");
        sb.append(this.versionName);
        sb.append(", versionCode=");
        return uqi.b(sb, this.versionCode, ')');
    }

    public /* synthetic */ InstallBundle$Parameters(String str, String str2, String str3, String str4, String str5, Integer num, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num);
    }
}
