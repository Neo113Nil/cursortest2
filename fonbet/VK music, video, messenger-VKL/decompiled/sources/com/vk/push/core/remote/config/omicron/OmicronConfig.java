package com.vk.push.core.remote.config.omicron;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.remote.config.omicron.deviceid.DeviceIdProvider;
import com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint;
import com.vk.push.core.remote.config.omicron.retriever.DefaultHttpRequestExecutor;
import com.vk.push.core.remote.config.omicron.retriever.RequestExecutor;
import com.vk.push.core.remote.config.omicron.timetable.SimpleTimeProvider;
import com.vk.push.core.remote.config.omicron.timetable.TimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class OmicronConfig {
    public static final int p = (int) TimeUnit.DAYS.toMinutes(1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List<OmicronFingerprint> e;
    public final AnalyticsHandler f;
    public final int g;
    public final OmicronEnvironment h;
    public final float i;
    public final UpdateBehaviour j;
    public final String k;
    public final boolean l;
    public final RequestExecutor m;
    public final TimeProvider n;
    public final DeviceIdProvider o;

    public static final class Builder {
        public String a;
        public OmicronEnvironment h;
        public String k;
        public boolean l;
        public HttpClient n;
        public String b = HttpRequest.DEFAULT_SCHEME;
        public String c = "e.mail.ru";
        public String d = "api/v1/omicron/get";
        public List<OmicronFingerprint> e = new ArrayList(4);
        public AnalyticsHandler f = new a();
        public int g = OmicronConfig.p;
        public float i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public UpdateBehaviour j = UpdateBehaviour.DEFAULT;
        public RequestExecutor m = null;
        public TimeProvider o = new SimpleTimeProvider();
        public DeviceIdProvider p = null;

        @NonNull
        public Builder analyticsHandler(AnalyticsHandler analyticsHandler) {
            this.f = analyticsHandler;
            return this;
        }

        @NonNull
        public Builder apiHost(String str) {
            this.c = str;
            return this;
        }

        @NonNull
        public Builder apiPath(String str) {
            this.d = str;
            return this;
        }

        @NonNull
        public Builder apiScheme(String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public Builder appId(String str) {
            this.a = str;
            return this;
        }

        @NonNull
        public OmicronConfig build() {
            if (TextUtils.isEmpty(this.a)) {
                throw new IllegalArgumentException("appId is required");
            }
            if (this.h == null) {
                throw new IllegalArgumentException("environment is required");
            }
            RequestExecutor requestExecutor = this.m;
            if (requestExecutor != null && this.n != null) {
                throw new IllegalArgumentException("you must pass HttpClient or custom RequestExecutor before build");
            }
            if (requestExecutor == null) {
                this.m = new DefaultHttpRequestExecutor(this.n);
            }
            if (this.p != null) {
                return new OmicronConfig(this);
            }
            throw new IllegalArgumentException("deviceIdProvider is required");
        }

        @NonNull
        public Builder clearDataOnInit(boolean z) {
            this.l = z;
            return this;
        }

        @NonNull
        public Builder deviceIdProvider(@NonNull DeviceIdProvider deviceIdProvider) {
            this.p = deviceIdProvider;
            return this;
        }

        @NonNull
        public Builder environment(OmicronEnvironment omicronEnvironment) {
            this.h = omicronEnvironment;
            return this;
        }

        @NonNull
        public Builder fingerprints(List<OmicronFingerprint> list) {
            this.e = list;
            return this;
        }

        @NonNull
        public Builder firstLoadTimeout(float f) {
            this.i = f;
            return this;
        }

        @NonNull
        public Builder requestExecutor(@Nullable RequestExecutor requestExecutor) {
            this.m = requestExecutor;
            return this;
        }

        @NonNull
        public Builder timeProvider(@Nullable TimeProvider timeProvider) {
            this.o = timeProvider;
            return this;
        }

        @NonNull
        public Builder updateBehaviour(UpdateBehaviour updateBehaviour) {
            this.j = updateBehaviour;
            return this;
        }

        @NonNull
        public Builder updateInterval(int i) {
            this.g = i;
            return this;
        }

        @NonNull
        public Builder useDefaultRequestExecutor(HttpClient httpClient) {
            this.n = httpClient;
            return this;
        }

        @NonNull
        public Builder userId(String str) {
            this.k = str;
            return this;
        }
    }

    public static class a extends DefaultAnalyticsHandler {
    }

    public OmicronConfig(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
        this.l = builder.l;
        this.m = builder.m;
        this.n = builder.o;
        this.o = builder.p;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
