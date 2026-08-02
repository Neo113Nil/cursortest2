package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest {

    @pmi0("api_url")
    private final String apiUrl;

    public CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest(String str) {
        this.apiUrl = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest) && epx.f(this.apiUrl, ((CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest) obj).apiUrl);
    }

    public final int hashCode() {
        return this.apiUrl.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VitrinaTvSocdemRequest(apiUrl="), this.apiUrl, ')');
    }
}
