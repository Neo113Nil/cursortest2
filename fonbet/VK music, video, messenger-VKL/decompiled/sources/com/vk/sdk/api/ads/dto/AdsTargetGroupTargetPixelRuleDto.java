package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.vq;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AdsTargetGroupTargetPixelRuleDto.kt */
/* loaded from: classes5.dex */
public final class AdsTargetGroupTargetPixelRuleDto {

    @pmi0("event_full_match")
    private final String eventFullMatch;

    @pmi0("event_regex_match")
    private final String eventRegexMatch;

    @pmi0("event_substrings_match")
    private final List<String> eventSubstringsMatch;

    @pmi0("url_full_match")
    private final String urlFullMatch;

    @pmi0("url_regex_match")
    private final String urlRegexMatch;

    @pmi0("url_substrings_match")
    private final List<String> urlSubstringsMatch;

    public AdsTargetGroupTargetPixelRuleDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsTargetGroupTargetPixelRuleDto)) {
            return false;
        }
        AdsTargetGroupTargetPixelRuleDto adsTargetGroupTargetPixelRuleDto = (AdsTargetGroupTargetPixelRuleDto) obj;
        return epx.f(this.urlFullMatch, adsTargetGroupTargetPixelRuleDto.urlFullMatch) && epx.f(this.eventFullMatch, adsTargetGroupTargetPixelRuleDto.eventFullMatch) && epx.f(this.urlSubstringsMatch, adsTargetGroupTargetPixelRuleDto.urlSubstringsMatch) && epx.f(this.eventSubstringsMatch, adsTargetGroupTargetPixelRuleDto.eventSubstringsMatch) && epx.f(this.urlRegexMatch, adsTargetGroupTargetPixelRuleDto.urlRegexMatch) && epx.f(this.eventRegexMatch, adsTargetGroupTargetPixelRuleDto.eventRegexMatch);
    }

    public final int hashCode() {
        String str = this.urlFullMatch;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventFullMatch;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.urlSubstringsMatch;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.eventSubstringsMatch;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.urlRegexMatch;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eventRegexMatch;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.urlFullMatch;
        String str2 = this.eventFullMatch;
        List<String> list = this.urlSubstringsMatch;
        List<String> list2 = this.eventSubstringsMatch;
        String str3 = this.urlRegexMatch;
        String str4 = this.eventRegexMatch;
        StringBuilder a = xe9.a("AdsTargetGroupTargetPixelRuleDto(urlFullMatch=", str, ", eventFullMatch=", str2, ", urlSubstringsMatch=");
        vq.d(a, list, ", eventSubstringsMatch=", list2, ", urlRegexMatch=");
        return h5s.d(a, str3, ", eventRegexMatch=", str4, ")");
    }

    public AdsTargetGroupTargetPixelRuleDto(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        this.urlFullMatch = str;
        this.eventFullMatch = str2;
        this.urlSubstringsMatch = list;
        this.eventSubstringsMatch = list2;
        this.urlRegexMatch = str3;
        this.eventRegexMatch = str4;
    }

    public /* synthetic */ AdsTargetGroupTargetPixelRuleDto(String str, String str2, List list, List list2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
