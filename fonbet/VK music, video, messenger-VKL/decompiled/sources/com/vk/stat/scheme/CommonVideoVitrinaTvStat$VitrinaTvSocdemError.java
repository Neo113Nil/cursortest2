package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoVitrinaTvStat$VitrinaTvSocdemError {

    @pmi0("api_url")
    private final String apiUrl;

    @pmi0("error")
    private final String error;

    public CommonVideoVitrinaTvStat$VitrinaTvSocdemError(String str, String str2) {
        this.apiUrl = str;
        this.error = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoVitrinaTvStat$VitrinaTvSocdemError)) {
            return false;
        }
        CommonVideoVitrinaTvStat$VitrinaTvSocdemError commonVideoVitrinaTvStat$VitrinaTvSocdemError = (CommonVideoVitrinaTvStat$VitrinaTvSocdemError) obj;
        return epx.f(this.apiUrl, commonVideoVitrinaTvStat$VitrinaTvSocdemError.apiUrl) && epx.f(this.error, commonVideoVitrinaTvStat$VitrinaTvSocdemError.error);
    }

    public final int hashCode() {
        return this.error.hashCode() + (this.apiUrl.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VitrinaTvSocdemError(apiUrl=");
        sb.append(this.apiUrl);
        sb.append(", error=");
        return ho8.a(sb, this.error, ')');
    }
}
