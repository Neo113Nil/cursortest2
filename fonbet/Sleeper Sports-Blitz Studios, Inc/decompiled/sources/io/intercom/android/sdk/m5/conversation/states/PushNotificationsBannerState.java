package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;", "", "askUsersToAllowNotifications", "", "<init>", "(Z)V", "getAskUsersToAllowNotifications", "()Z", "component1", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PushNotificationsBannerState {
    public static final int $stable = 0;
    private final boolean askUsersToAllowNotifications;

    public PushNotificationsBannerState() {
        this(false, 1, null);
    }

    public static /* synthetic */ PushNotificationsBannerState copy$default(PushNotificationsBannerState pushNotificationsBannerState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pushNotificationsBannerState.askUsersToAllowNotifications;
        }
        return pushNotificationsBannerState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    public final PushNotificationsBannerState copy(boolean askUsersToAllowNotifications) {
        return new PushNotificationsBannerState(askUsersToAllowNotifications);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PushNotificationsBannerState) && this.askUsersToAllowNotifications == ((PushNotificationsBannerState) other).askUsersToAllowNotifications;
    }

    public int hashCode() {
        return Boolean.hashCode(this.askUsersToAllowNotifications);
    }

    public String toString() {
        return "PushNotificationsBannerState(askUsersToAllowNotifications=" + this.askUsersToAllowNotifications + ')';
    }

    public PushNotificationsBannerState(boolean z) {
        this.askUsersToAllowNotifications = z;
    }

    public /* synthetic */ PushNotificationsBannerState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }
}
