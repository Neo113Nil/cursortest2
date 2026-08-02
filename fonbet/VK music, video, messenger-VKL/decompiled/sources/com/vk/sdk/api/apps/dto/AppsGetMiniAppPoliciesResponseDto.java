package com.vk.sdk.api.apps.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;
import xsna.zcl;

/* compiled from: AppsGetMiniAppPoliciesResponseDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetMiniAppPoliciesResponseDto {

    @pmi0("privacy_policy")
    private final String privacyPolicy;

    @pmi0("terms")
    private final String terms;

    /* JADX WARN: Multi-variable type inference failed */
    public AppsGetMiniAppPoliciesResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetMiniAppPoliciesResponseDto)) {
            return false;
        }
        AppsGetMiniAppPoliciesResponseDto appsGetMiniAppPoliciesResponseDto = (AppsGetMiniAppPoliciesResponseDto) obj;
        return epx.f(this.privacyPolicy, appsGetMiniAppPoliciesResponseDto.privacyPolicy) && epx.f(this.terms, appsGetMiniAppPoliciesResponseDto.terms);
    }

    public final int hashCode() {
        String str = this.privacyPolicy;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.terms;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ss9.a("AppsGetMiniAppPoliciesResponseDto(privacyPolicy=", this.privacyPolicy, ", terms=", this.terms, ")");
    }

    public AppsGetMiniAppPoliciesResponseDto(String str, String str2) {
        this.privacyPolicy = str;
        this.terms = str2;
    }

    public /* synthetic */ AppsGetMiniAppPoliciesResponseDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
