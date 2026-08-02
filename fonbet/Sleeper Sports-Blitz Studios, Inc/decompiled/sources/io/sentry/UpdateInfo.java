package io.sentry;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public final class UpdateInfo {
    private final String appName;
    private final int buildNumber;
    private final String buildVersion;
    private final String createdDate;
    private final String downloadUrl;
    private final String id;
    private final List<String> installGroups;

    public UpdateInfo(String str, String str2, int i, String str3, String str4, String str5, List<String> list) {
        this.id = str;
        this.buildVersion = str2;
        this.buildNumber = i;
        this.downloadUrl = str3;
        this.appName = str4;
        this.createdDate = str5;
        this.installGroups = list;
    }

    public String getId() {
        return this.id;
    }

    public String getBuildVersion() {
        return this.buildVersion;
    }

    public int getBuildNumber() {
        return this.buildNumber;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public List<String> getInstallGroups() {
        return this.installGroups;
    }

    public String toString() {
        return "UpdateInfo{id='" + this.id + "', buildVersion='" + this.buildVersion + "', buildNumber=" + this.buildNumber + ", downloadUrl='" + this.downloadUrl + "', appName='" + this.appName + "', createdDate='" + this.createdDate + "', installGroups=" + this.installGroups + AbstractJsonLexerKt.END_OBJ;
    }
}
