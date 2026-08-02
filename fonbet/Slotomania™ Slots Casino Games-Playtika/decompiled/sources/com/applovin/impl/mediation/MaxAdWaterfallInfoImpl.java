package com.applovin.impl.mediation;

import com.applovin.impl.a3;
import com.applovin.impl.c3;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {
    private final a3 a;
    private final String b;
    private final String c;
    private final List d;
    private final long e;
    private final c3 f;
    private final List g;
    private final String h;
    private final String i;

    public MaxAdWaterfallInfoImpl(a3 a3Var, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(a3Var, a3Var.X(), a3Var.Y(), j, list, a3Var.Q(), a3Var.W(), str, a3Var.T());
    }

    public String getEventId() {
        return this.i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.a;
    }

    public String getMCode() {
        return this.h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.d;
    }

    public List<String> getPostbackUrls() {
        return this.g;
    }

    public c3 getRequestParameters() {
        return this.f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.b + ", testName=" + this.c + ", networkResponses=" + this.d + ", latencyMillis=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    public MaxAdWaterfallInfoImpl(a3 a3Var, String str, String str2, long j, List<MaxNetworkResponseInfo> list, c3 c3Var, List<String> list2, String str3, String str4) {
        this.a = a3Var;
        this.b = str;
        this.c = str2;
        this.e = j;
        this.d = list;
        this.f = c3Var;
        this.g = list2;
        this.h = str3;
        this.i = str4;
    }
}
