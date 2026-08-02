package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.C4639xc;
import com.ironsource.Ed;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import xsna.zcl;

/* loaded from: classes14.dex */
public final class InterstitialAdRequest {
    private final String a;
    private final String b;
    private final Bundle c;
    private final Ed d;
    private final String e;

    public static final class Builder {
        private final String a;
        private final String b;
        private Bundle c;

        public Builder(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.a);
            return new InterstitialAdRequest(this.a, this.b, this.c, null);
        }

        public final String getAdm() {
            return this.b;
        }

        public final String getInstanceId() {
            return this.a;
        }

        public final Builder withExtraParams(Bundle bundle) {
            this.c = bundle;
            return this;
        }
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, zcl zclVar) {
        this(str, str2, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.e;
    }

    public final String getAdm() {
        return this.b;
    }

    public final Bundle getExtraParams() {
        return this.c;
    }

    public final String getInstanceId() {
        return this.a;
    }

    public final Ed getProviderName$mediationsdk_release() {
        return this.d;
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = new C4639xc(str);
        this.e = W9.b();
    }
}
