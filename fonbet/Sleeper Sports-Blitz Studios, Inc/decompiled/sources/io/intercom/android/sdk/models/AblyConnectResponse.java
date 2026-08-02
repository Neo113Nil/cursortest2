package io.intercom.android.sdk.models;

import com.appsflyer.AppsFlyerProperties;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AblyResponse.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/models/AblyConnectResponse;", "", AppsFlyerProperties.CHANNEL, "", "endpoints", "", "Lio/intercom/android/sdk/models/AblyEndpoint;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getChannel", "()Ljava/lang/String;", "getEndpoints", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AblyConnectResponse {
    public static final int $stable = 8;

    @SerializedName(AppsFlyerProperties.CHANNEL)
    private final String channel;

    @SerializedName("endpoints")
    private final List<AblyEndpoint> endpoints;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AblyConnectResponse copy$default(AblyConnectResponse ablyConnectResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ablyConnectResponse.channel;
        }
        if ((i & 2) != 0) {
            list = ablyConnectResponse.endpoints;
        }
        return ablyConnectResponse.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    public final List<AblyEndpoint> component2() {
        return this.endpoints;
    }

    public final AblyConnectResponse copy(String channel, List<AblyEndpoint> endpoints) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        return new AblyConnectResponse(channel, endpoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AblyConnectResponse)) {
            return false;
        }
        AblyConnectResponse ablyConnectResponse = (AblyConnectResponse) other;
        return Intrinsics.areEqual(this.channel, ablyConnectResponse.channel) && Intrinsics.areEqual(this.endpoints, ablyConnectResponse.endpoints);
    }

    public int hashCode() {
        return (this.channel.hashCode() * 31) + this.endpoints.hashCode();
    }

    public String toString() {
        return "AblyConnectResponse(channel=" + this.channel + ", endpoints=" + this.endpoints + ')';
    }

    public AblyConnectResponse(String channel, List<AblyEndpoint> endpoints) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        this.channel = channel;
        this.endpoints = endpoints;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final List<AblyEndpoint> getEndpoints() {
        return this.endpoints;
    }

    public /* synthetic */ AblyConnectResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
