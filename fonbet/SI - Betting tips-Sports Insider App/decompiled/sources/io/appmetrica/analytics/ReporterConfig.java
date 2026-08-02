package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0191h0;
import io.appmetrica.analytics.impl.C0348n5;
import io.appmetrica.analytics.impl.En;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ReporterConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @NonNull
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    public final Boolean dataSendingEnabled;
    public final Integer dispatchPeriodSeconds;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final String userProfileID;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Builder {

        /* renamed from: l, reason: collision with root package name */
        private static final En f11359l = new En(new C0191h0());

        /* renamed from: a, reason: collision with root package name */
        private final C0348n5 f11360a;

        /* renamed from: b, reason: collision with root package name */
        private final String f11361b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f11362c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f11363d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f11364e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f11365f;

        /* renamed from: g, reason: collision with root package name */
        private String f11366g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f11367h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f11368i;
        private final HashMap j;

        /* renamed from: k, reason: collision with root package name */
        private final HashMap f11369k;

        public /* synthetic */ Builder(String str, int i5) {
            this(str);
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, Object obj) {
            this.f11369k.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(String str, String str2) {
            this.j.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z5) {
            this.f11364e = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i5) {
            this.f11367h = Integer.valueOf(i5);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f11363d = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i5) {
            this.f11368i = Integer.valueOf(i5);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i5) {
            this.f11365f = Integer.valueOf(this.f11360a.a(i5));
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i5) {
            this.f11362c = Integer.valueOf(i5);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(String str) {
            this.f11366g = str;
            return this;
        }

        private Builder(String str) {
            this.j = new HashMap();
            this.f11369k = new HashMap();
            f11359l.a(str);
            this.f11360a = new C0348n5(str);
            this.f11361b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i5) {
        this(builder);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f11361b;
        this.sessionTimeout = builder.f11362c;
        this.logs = builder.f11363d;
        this.dataSendingEnabled = builder.f11364e;
        this.maxReportsInDatabaseCount = builder.f11365f;
        this.userProfileID = builder.f11366g;
        this.dispatchPeriodSeconds = builder.f11367h;
        this.maxReportsCount = builder.f11368i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f11369k);
    }
}
