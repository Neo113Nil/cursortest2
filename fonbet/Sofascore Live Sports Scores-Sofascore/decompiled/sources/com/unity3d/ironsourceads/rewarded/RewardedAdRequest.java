package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import com.ironsource.C4380wc;
import com.ironsource.Dd;
import com.ironsource.V9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class RewardedAdRequest {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @Nullable
    private final Bundle c;

    @NotNull
    private final Dd d;

    @NotNull
    private final String e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {

        @NotNull
        private final String a;

        @NotNull
        private final String b;

        @Nullable
        private Bundle c;

        public Builder(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        @NotNull
        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.a);
            return new RewardedAdRequest(this.a, this.b, this.c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.a;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle bundle) {
            bundle.getClass();
            this.c = bundle;
            return this;
        }
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = new C4380wc(str);
        String b = V9.b();
        b.getClass();
        this.e = b;
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.e;
    }

    @NotNull
    public final String getAdm() {
        return this.b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.a;
    }

    @NotNull
    public final Dd getProviderName$mediationsdk_release() {
        return this.d;
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }
}
