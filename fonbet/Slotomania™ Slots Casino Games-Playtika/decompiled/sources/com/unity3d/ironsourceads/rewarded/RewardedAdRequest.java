package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import com.ironsource.C2725wc;
import com.ironsource.Ed;
import com.ironsource.V9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RewardedAdRequest {
    private final String a;
    private final String b;
    private final Bundle c;
    private final Ed d;
    private final String e;

    public static final class Builder {
        private final String a;
        private final String b;
        private Bundle c;

        public Builder(String instanceId, String adm) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            this.a = instanceId;
            this.b = adm;
        }

        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.a);
            return new RewardedAdRequest(this.a, this.b, this.c, null);
        }

        public final String getAdm() {
            return this.b;
        }

        public final String getInstanceId() {
            return this.a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.c = extraParams;
            return this;
        }
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
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

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = new C2725wc(str);
        String b = V9.b();
        Intrinsics.checkNotNullExpressionValue(b, "generateMultipleUniqueInstanceId()");
        this.e = b;
    }
}
