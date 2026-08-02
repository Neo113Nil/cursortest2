package com.unity3d.ads.core.data.model;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.urd0;

/* compiled from: WebViewConfiguration.kt */
/* loaded from: classes14.dex */
public final class WebViewConfiguration {
    private final List<String> additionalFiles;
    private final String entryPoint;
    private final String type;
    private final int version;

    public WebViewConfiguration(int i, String str, List<String> list, String str2) {
        this.version = i;
        this.entryPoint = str;
        this.additionalFiles = list;
        this.type = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i, String str, List list, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = webViewConfiguration.version;
        }
        if ((i2 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i2 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        if ((i2 & 8) != 0) {
            str2 = webViewConfiguration.type;
        }
        return webViewConfiguration.copy(i, str, list, str2);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final List<String> component3() {
        return this.additionalFiles;
    }

    public final String component4() {
        return this.type;
    }

    public final WebViewConfiguration copy(int i, String str, List<String> list, String str2) {
        return new WebViewConfiguration(i, str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && epx.f(this.entryPoint, webViewConfiguration.entryPoint) && epx.f(this.additionalFiles, webViewConfiguration.additionalFiles) && epx.f(this.type, webViewConfiguration.type);
    }

    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.type.hashCode() + fw3.a(urd0.a(Integer.hashCode(this.version) * 31, 31, this.entryPoint), 31, this.additionalFiles);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebViewConfiguration(version=");
        sb.append(this.version);
        sb.append(", entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", additionalFiles=");
        sb.append(this.additionalFiles);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }
}
