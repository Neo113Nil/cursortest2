package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4639xc;
import com.ironsource.Ed;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import xsna.zcl;

/* loaded from: classes14.dex */
public final class BannerAdRequest {
    private final Context a;
    private final String b;
    private final String c;
    private final AdSize d;
    private final Bundle e;
    private final Ed f;
    private final String g;

    public static final class Builder {
        private final Context a;
        private final String b;
        private final String c;
        private final AdSize d;
        private Bundle e;

        public Builder(Context context, String str, String str2, AdSize adSize) {
            this.a = context;
            this.b = str;
            this.c = str2;
            this.d = adSize;
        }

        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.b + ", size: " + this.d.getSizeDescription());
            return new BannerAdRequest(this.a, this.b, this.c, this.d, this.e, null);
        }

        public final String getAdm() {
            return this.c;
        }

        public final Context getContext() {
            return this.a;
        }

        public final String getInstanceId() {
            return this.b;
        }

        public final AdSize getSize() {
            return this.d;
        }

        public final Builder withExtraParams(Bundle bundle) {
            this.e = bundle;
            return this;
        }
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, zcl zclVar) {
        this(context, str, str2, adSize, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.g;
    }

    public final String getAdm() {
        return this.c;
    }

    public final Context getContext() {
        return this.a;
    }

    public final Bundle getExtraParams() {
        return this.e;
    }

    public final String getInstanceId() {
        return this.b;
    }

    public final Ed getProviderName$mediationsdk_release() {
        return this.f;
    }

    public final AdSize getSize() {
        return this.d;
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = adSize;
        this.e = bundle;
        this.f = new C4639xc(str);
        this.g = W9.b();
    }
}
