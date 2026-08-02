package io.intercom.android.sdk.m5.home.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeClientState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeClientState;", "", "homeResponse", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/m5/home/data/HomeV2Response;", "openMessengerResponseData", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "isHeaderImageLoaded", "", "<init>", "(Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;Lio/intercom/android/sdk/models/OpenMessengerResponse;Z)V", "getHomeResponse", "()Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "getOpenMessengerResponseData", "()Lio/intercom/android/sdk/models/OpenMessengerResponse;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HomeClientState {
    public static final int $stable = 8;
    private final NetworkResponse<HomeV2Response> homeResponse;
    private final boolean isHeaderImageLoaded;
    private final OpenMessengerResponse openMessengerResponseData;

    public HomeClientState() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeClientState copy$default(HomeClientState homeClientState, NetworkResponse networkResponse, OpenMessengerResponse openMessengerResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            networkResponse = homeClientState.homeResponse;
        }
        if ((i & 2) != 0) {
            openMessengerResponse = homeClientState.openMessengerResponseData;
        }
        if ((i & 4) != 0) {
            z = homeClientState.isHeaderImageLoaded;
        }
        return homeClientState.copy(networkResponse, openMessengerResponse, z);
    }

    public final NetworkResponse<HomeV2Response> component1() {
        return this.homeResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final OpenMessengerResponse getOpenMessengerResponseData() {
        return this.openMessengerResponseData;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsHeaderImageLoaded() {
        return this.isHeaderImageLoaded;
    }

    public final HomeClientState copy(NetworkResponse<HomeV2Response> homeResponse, OpenMessengerResponse openMessengerResponseData, boolean isHeaderImageLoaded) {
        return new HomeClientState(homeResponse, openMessengerResponseData, isHeaderImageLoaded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeClientState)) {
            return false;
        }
        HomeClientState homeClientState = (HomeClientState) other;
        return Intrinsics.areEqual(this.homeResponse, homeClientState.homeResponse) && Intrinsics.areEqual(this.openMessengerResponseData, homeClientState.openMessengerResponseData) && this.isHeaderImageLoaded == homeClientState.isHeaderImageLoaded;
    }

    public int hashCode() {
        NetworkResponse<HomeV2Response> networkResponse = this.homeResponse;
        int hashCode = (networkResponse == null ? 0 : networkResponse.hashCode()) * 31;
        OpenMessengerResponse openMessengerResponse = this.openMessengerResponseData;
        return ((hashCode + (openMessengerResponse != null ? openMessengerResponse.hashCode() : 0)) * 31) + Boolean.hashCode(this.isHeaderImageLoaded);
    }

    public String toString() {
        return "HomeClientState(homeResponse=" + this.homeResponse + ", openMessengerResponseData=" + this.openMessengerResponseData + ", isHeaderImageLoaded=" + this.isHeaderImageLoaded + ')';
    }

    public HomeClientState(NetworkResponse<HomeV2Response> networkResponse, OpenMessengerResponse openMessengerResponse, boolean z) {
        this.homeResponse = networkResponse;
        this.openMessengerResponseData = openMessengerResponse;
        this.isHeaderImageLoaded = z;
    }

    public /* synthetic */ HomeClientState(NetworkResponse networkResponse, OpenMessengerResponse openMessengerResponse, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : networkResponse, (i & 2) != 0 ? null : openMessengerResponse, (i & 4) != 0 ? false : z);
    }

    public final NetworkResponse<HomeV2Response> getHomeResponse() {
        return this.homeResponse;
    }

    public final OpenMessengerResponse getOpenMessengerResponseData() {
        return this.openMessengerResponseData;
    }

    public final boolean isHeaderImageLoaded() {
        return this.isHeaderImageLoaded;
    }
}
