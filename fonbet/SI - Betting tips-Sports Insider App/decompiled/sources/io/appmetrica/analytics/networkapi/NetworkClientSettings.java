package io.appmetrica.analytics.networkapi;

import d9.e;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001!J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lio/appmetrica/analytics/networkapi/NetworkClientSettings;", "", "", "toString", "", "a", "Ljava/lang/Integer;", "getConnectTimeout", "()Ljava/lang/Integer;", "connectTimeout", "b", "getReadTimeout", "readTimeout", "Ljavax/net/ssl/SSLSocketFactory;", "c", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "", "d", "Ljava/lang/Boolean;", "getUseCaches", "()Ljava/lang/Boolean;", "useCaches", "e", "getInstanceFollowRedirects", "instanceFollowRedirects", "f", "I", "getMaxResponseSize", "()I", "maxResponseSize", "Builder", "network-api_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class NetworkClientSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Integer connectTimeout;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer readTimeout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SSLSocketFactory sslSocketFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Boolean useCaches;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Boolean instanceFollowRedirects;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int maxResponseSize;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0015"}, d2 = {"Lio/appmetrica/analytics/networkapi/NetworkClientSettings$Builder;", "", "", "connectTimeout", "withConnectTimeout", "readTimeout", "withReadTimeout", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "withSslSocketFactory", "", "useCaches", "withUseCaches", "instanceFollowRedirects", "withInstanceFollowRedirects", "maxResponseSize", "withMaxResponseSize", "Lio/appmetrica/analytics/networkapi/NetworkClientSettings;", "build", "<init>", "()V", "network-api_release"}, k = 1, mv = {1, 6, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Integer f15143a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f15144b;

        /* renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f15145c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f15146d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f15147e;

        /* renamed from: f, reason: collision with root package name */
        private int f15148f = Integer.MAX_VALUE;

        @NotNull
        public final NetworkClientSettings build() {
            return new NetworkClientSettings(this.f15143a, this.f15144b, this.f15145c, this.f15146d, this.f15147e, this.f15148f, null);
        }

        @NotNull
        public final Builder withConnectTimeout(int connectTimeout) {
            this.f15143a = Integer.valueOf(connectTimeout);
            return this;
        }

        @NotNull
        public final Builder withInstanceFollowRedirects(boolean instanceFollowRedirects) {
            this.f15147e = Boolean.valueOf(instanceFollowRedirects);
            return this;
        }

        @NotNull
        public final Builder withMaxResponseSize(int maxResponseSize) {
            this.f15148f = maxResponseSize;
            return this;
        }

        @NotNull
        public final Builder withReadTimeout(int readTimeout) {
            this.f15144b = Integer.valueOf(readTimeout);
            return this;
        }

        @NotNull
        public final Builder withSslSocketFactory(@Nullable SSLSocketFactory sslSocketFactory) {
            this.f15145c = sslSocketFactory;
            return this;
        }

        @NotNull
        public final Builder withUseCaches(boolean useCaches) {
            this.f15146d = Boolean.valueOf(useCaches);
            return this;
        }
    }

    public /* synthetic */ NetworkClientSettings(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, sSLSocketFactory, bool, bool2, i5);
    }

    @Nullable
    public final Integer getConnectTimeout() {
        return this.connectTimeout;
    }

    @Nullable
    public final Boolean getInstanceFollowRedirects() {
        return this.instanceFollowRedirects;
    }

    public final int getMaxResponseSize() {
        return this.maxResponseSize;
    }

    @Nullable
    public final Integer getReadTimeout() {
        return this.readTimeout;
    }

    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @Nullable
    public final Boolean getUseCaches() {
        return this.useCaches;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkClientSettings(connectTimeout=");
        sb2.append(this.connectTimeout);
        sb2.append(", readTimeout=");
        sb2.append(this.readTimeout);
        sb2.append(", sslSocketFactory=");
        sb2.append(this.sslSocketFactory);
        sb2.append(", useCaches=");
        sb2.append(this.useCaches);
        sb2.append(", instanceFollowRedirects=");
        sb2.append(this.instanceFollowRedirects);
        sb2.append(", maxResponseSize=");
        return e.i(sb2, this.maxResponseSize, ')');
    }

    private NetworkClientSettings(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, int i5) {
        this.connectTimeout = num;
        this.readTimeout = num2;
        this.sslSocketFactory = sSLSocketFactory;
        this.useCaches = bool;
        this.instanceFollowRedirects = bool2;
        this.maxResponseSize = i5;
    }
}
