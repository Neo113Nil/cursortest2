package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4380wc;
import com.ironsource.Dd;
import com.ironsource.V9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class BannerAdRequest {

    @NotNull
    private final Context a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final AdSize d;

    @Nullable
    private final Bundle e;

    @NotNull
    private final Dd f;

    @NotNull
    private final String g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {

        @NotNull
        private final Context a;

        @NotNull
        private final String b;

        @NotNull
        private final String c;

        @NotNull
        private final AdSize d;

        @Nullable
        private Bundle e;

        public Builder(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull AdSize adSize) {
            context.getClass();
            str.getClass();
            str2.getClass();
            adSize.getClass();
            this.a = context;
            this.b = str;
            this.c = str2;
            this.d = adSize;
        }

        @NotNull
        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.b + ", size: " + this.d.getSizeDescription());
            return new BannerAdRequest(this.a, this.b, this.c, this.d, this.e, null);
        }

        @NotNull
        public final String getAdm() {
            return this.c;
        }

        @NotNull
        public final Context getContext() {
            return this.a;
        }

        @NotNull
        public final String getInstanceId() {
            return this.b;
        }

        @NotNull
        public final AdSize getSize() {
            return this.d;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle bundle) {
            bundle.getClass();
            this.e = bundle;
            return this;
        }
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = adSize;
        this.e = bundle;
        this.f = new C4380wc(str);
        String b = V9.b();
        b.getClass();
        this.g = b;
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.g;
    }

    @NotNull
    public final String getAdm() {
        return this.c;
    }

    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.e;
    }

    @NotNull
    public final String getInstanceId() {
        return this.b;
    }

    @NotNull
    public final Dd getProviderName$mediationsdk_release() {
        return this.f;
    }

    @NotNull
    public final AdSize getSize() {
        return this.d;
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, adSize, bundle);
    }
}
