package ru.ozon.app.android.abtool.data.network;

import G.g;
import Kk.C3532b;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/abtool/data/network/ConfigsRequest;", "", "namespace", "", ResultDTO.CONTENT_TYPE_SERVICES, "", "debug", "", "additionalParams", "", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/util/Map;)V", "getNamespace", "()Ljava/lang/String;", "getServices", "()Ljava/util/List;", "getDebug", "()Z", "getAdditionalParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConfigsRequest {
    private final transient Map<String, Object> additionalParams;
    private final boolean debug;

    @NotNull
    private final String namespace;

    @NotNull
    private final List<String> services;

    public ConfigsRequest(@NotNull String namespace, @NotNull List<String> services, boolean z11, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(services, "services");
        this.namespace = namespace;
        this.services = services;
        this.debug = z11;
        this.additionalParams = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigsRequest copy$default(ConfigsRequest configsRequest, String str, List list, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = configsRequest.namespace;
        }
        if ((i11 & 2) != 0) {
            list = configsRequest.services;
        }
        if ((i11 & 4) != 0) {
            z11 = configsRequest.debug;
        }
        if ((i11 & 8) != 0) {
            map = configsRequest.additionalParams;
        }
        return configsRequest.copy(str, list, z11, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    @NotNull
    public final List<String> component2() {
        return this.services;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDebug() {
        return this.debug;
    }

    public final Map<String, Object> component4() {
        return this.additionalParams;
    }

    @NotNull
    public final ConfigsRequest copy(@NotNull String namespace, @NotNull List<String> services, boolean debug, Map<String, ? extends Object> additionalParams) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(services, "services");
        return new ConfigsRequest(namespace, services, debug, additionalParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigsRequest)) {
            return false;
        }
        ConfigsRequest configsRequest = (ConfigsRequest) other;
        return Intrinsics.d(this.namespace, configsRequest.namespace) && Intrinsics.d(this.services, configsRequest.services) && this.debug == configsRequest.debug && Intrinsics.d(this.additionalParams, configsRequest.additionalParams);
    }

    public final Map<String, Object> getAdditionalParams() {
        return this.additionalParams;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    @NotNull
    public final List<String> getServices() {
        return this.services;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.b(this.namespace.hashCode() * 31, 31, this.services), 31, this.debug);
        Map<String, Object> map = this.additionalParams;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.namespace;
        List<String> list = this.services;
        boolean z11 = this.debug;
        Map<String, Object> map = this.additionalParams;
        StringBuilder f7 = b.f("ConfigsRequest(namespace=", str, ", services=", ", debug=", list);
        f7.append(z11);
        f7.append(", additionalParams=");
        f7.append(map);
        f7.append(")");
        return f7.toString();
    }

    public /* synthetic */ ConfigsRequest(String str, List list, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z11, (i11 & 8) != 0 ? null : map);
    }
}
