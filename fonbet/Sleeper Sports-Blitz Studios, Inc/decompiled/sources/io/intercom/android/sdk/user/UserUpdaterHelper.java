package io.intercom.android.sdk.user;

import io.intercom.android.sdk.IntercomStatusCallbackKt;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.HostAppState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserUpdaterHelper.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0001\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\b0\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u00040\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/user/UserUpdaterHelper;", "", "userUpdaterProvider", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/api/UserUpdater;", "dataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "userIdentityProvider", "Lio/intercom/android/sdk/identity/UserIdentity;", "<init>", "(Lio/intercom/android/sdk/Provider;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/Provider;)V", "userIdentity", "kotlin.jvm.PlatformType", "getUserIdentity", "()Lio/intercom/android/sdk/identity/UserIdentity;", "userUpdater", "getUserUpdater", "()Lio/intercom/android/sdk/api/UserUpdater;", "update", "", "currentTime", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UserUpdaterHelper {
    public static final int $stable = 8;
    private final IntercomDataLayer dataLayer;
    private final Provider<UserIdentity> userIdentityProvider;
    private final Provider<UserUpdater> userUpdaterProvider;

    public UserUpdaterHelper(Provider<UserUpdater> userUpdaterProvider, IntercomDataLayer dataLayer, Provider<UserIdentity> userIdentityProvider) {
        Intrinsics.checkNotNullParameter(userUpdaterProvider, "userUpdaterProvider");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(userIdentityProvider, "userIdentityProvider");
        this.userUpdaterProvider = userUpdaterProvider;
        this.dataLayer = dataLayer;
        this.userIdentityProvider = userIdentityProvider;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentityProvider.get();
    }

    public final UserUpdater getUserUpdater() {
        return this.userUpdaterProvider.get();
    }

    public final void update(long currentTime) {
        HostAppState value = this.dataLayer.getHostAppState().getValue();
        if (currentTime - value.getBackgroundedTimestamp() <= this.dataLayer.getConfig().getValue().getNewSessionThresholdMs() || !getUserIdentity().identityExists() || value.getSessionStartedSinceLastBackgrounded()) {
            return;
        }
        getUserUpdater().updateUser(UserUpdateRequest.create(true, value.isBackgrounded(), true), IntercomStatusCallbackKt.getNoStatusCallback());
    }
}
