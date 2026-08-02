package com.vk.sdk.api.bugtracker.dto;

import xsna.epx;
import xsna.i5s;
import xsna.kr;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: BugtrackerGetDownloadVersionUrlResponseDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerGetDownloadVersionUrlResponseDto {

    @pmi0("app_title")
    private final String appTitle;

    @pmi0("build_id")
    private final Integer buildId;

    @pmi0("build_title")
    private final String buildTitle;

    @pmi0("bundle_name")
    private final String bundleName;

    @pmi0("url")
    private final String url;

    public BugtrackerGetDownloadVersionUrlResponseDto(String str, String str2, String str3, Integer num, String str4) {
        this.url = str;
        this.appTitle = str2;
        this.bundleName = str3;
        this.buildId = num;
        this.buildTitle = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugtrackerGetDownloadVersionUrlResponseDto)) {
            return false;
        }
        BugtrackerGetDownloadVersionUrlResponseDto bugtrackerGetDownloadVersionUrlResponseDto = (BugtrackerGetDownloadVersionUrlResponseDto) obj;
        return epx.f(this.url, bugtrackerGetDownloadVersionUrlResponseDto.url) && epx.f(this.appTitle, bugtrackerGetDownloadVersionUrlResponseDto.appTitle) && epx.f(this.bundleName, bugtrackerGetDownloadVersionUrlResponseDto.bundleName) && epx.f(this.buildId, bugtrackerGetDownloadVersionUrlResponseDto.buildId) && epx.f(this.buildTitle, bugtrackerGetDownloadVersionUrlResponseDto.buildTitle);
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.appTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bundleName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.buildId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.buildTitle;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.url;
        String str2 = this.appTitle;
        String str3 = this.bundleName;
        Integer num = this.buildId;
        String str4 = this.buildTitle;
        StringBuilder a = xe9.a("BugtrackerGetDownloadVersionUrlResponseDto(url=", str, ", appTitle=", str2, ", bundleName=");
        kr.b(num, str3, ", buildId=", ", buildTitle=", a);
        return i5s.a(a, str4, ")");
    }

    public /* synthetic */ BugtrackerGetDownloadVersionUrlResponseDto(String str, String str2, String str3, Integer num, String str4, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4);
    }
}
