package com.google.ads.interactivemedia.v3.impl.data;

import android.net.Uri;
import defpackage.b2p;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_BridgeConfiguration extends BridgeConfiguration {
    private final Uri baseUri;
    private final String language;
    private final String packageName;
    private final long pageCorrelator;
    private final b2p testingConfiguration;

    public AutoValue_BridgeConfiguration(Uri uri, String str, String str2, b2p b2pVar, long j) {
        if (uri == null) {
            yhk.s("Null baseUri");
            throw null;
        }
        this.baseUri = uri;
        if (str == null) {
            yhk.s("Null language");
            throw null;
        }
        this.language = str;
        if (str2 == null) {
            yhk.s("Null packageName");
            throw null;
        }
        this.packageName = str2;
        if (b2pVar == null) {
            yhk.s("Null testingConfiguration");
            throw null;
        }
        this.testingConfiguration = b2pVar;
        this.pageCorrelator = j;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration
    public Uri baseUri() {
        return this.baseUri;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BridgeConfiguration) {
            BridgeConfiguration bridgeConfiguration = (BridgeConfiguration) obj;
            if (this.baseUri.equals(bridgeConfiguration.baseUri()) && this.language.equals(bridgeConfiguration.language()) && this.packageName.equals(bridgeConfiguration.packageName()) && this.testingConfiguration.equals(bridgeConfiguration.testingConfiguration()) && this.pageCorrelator == bridgeConfiguration.pageCorrelator()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((this.baseUri.hashCode() ^ 1000003) * 1000003) ^ this.language.hashCode()) * 1000003) ^ this.packageName.hashCode()) * 1000003) ^ this.testingConfiguration.hashCode();
        long j = this.pageCorrelator;
        return ((int) (j ^ (j >>> 32))) ^ (hashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration
    public String language() {
        return this.language;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration
    public String packageName() {
        return this.packageName;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration
    public long pageCorrelator() {
        return this.pageCorrelator;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration
    public b2p testingConfiguration() {
        return this.testingConfiguration;
    }

    public String toString() {
        b2p b2pVar = this.testingConfiguration;
        String valueOf = String.valueOf(this.baseUri);
        String valueOf2 = String.valueOf(b2pVar);
        int length = valueOf.length();
        String str = this.language;
        int length2 = String.valueOf(str).length();
        String str2 = this.packageName;
        int length3 = String.valueOf(str2).length();
        int length4 = valueOf2.length();
        long j = this.pageCorrelator;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 14 + length3 + 23 + length4 + 17 + String.valueOf(j).length() + 1);
        bf3.v(sb, "BridgeConfiguration{baseUri=", valueOf, ", language=", str);
        bf3.v(sb, ", packageName=", str2, ", testingConfiguration=", valueOf2);
        return fn0.l(j, ", pageCorrelator=", "}", sb);
    }
}
