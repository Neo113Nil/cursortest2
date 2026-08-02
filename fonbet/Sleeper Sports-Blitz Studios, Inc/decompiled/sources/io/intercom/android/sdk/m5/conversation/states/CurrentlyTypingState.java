package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u001eH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "", "avatarWrapper", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "showAvatar", "", "description", "Lio/intercom/android/sdk/ui/common/StringProvider;", "userType", "Lio/intercom/android/sdk/m5/conversation/states/TypingIndicatorType;", "<init>", "(Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;ZLio/intercom/android/sdk/ui/common/StringProvider;Lio/intercom/android/sdk/m5/conversation/states/TypingIndicatorType;)V", "getAvatarWrapper", "()Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getShowAvatar", "()Z", "getDescription", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "getUserType", "()Lio/intercom/android/sdk/m5/conversation/states/TypingIndicatorType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CurrentlyTypingState {
    public static final int $stable = 8;
    private final AvatarWrapper avatarWrapper;
    private final StringProvider description;
    private final boolean showAvatar;
    private final TypingIndicatorType userType;

    public static /* synthetic */ CurrentlyTypingState copy$default(CurrentlyTypingState currentlyTypingState, AvatarWrapper avatarWrapper, boolean z, StringProvider stringProvider, TypingIndicatorType typingIndicatorType, int i, Object obj) {
        if ((i & 1) != 0) {
            avatarWrapper = currentlyTypingState.avatarWrapper;
        }
        if ((i & 2) != 0) {
            z = currentlyTypingState.showAvatar;
        }
        if ((i & 4) != 0) {
            stringProvider = currentlyTypingState.description;
        }
        if ((i & 8) != 0) {
            typingIndicatorType = currentlyTypingState.userType;
        }
        return currentlyTypingState.copy(avatarWrapper, z, stringProvider, typingIndicatorType);
    }

    /* renamed from: component1, reason: from getter */
    public final AvatarWrapper getAvatarWrapper() {
        return this.avatarWrapper;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowAvatar() {
        return this.showAvatar;
    }

    /* renamed from: component3, reason: from getter */
    public final StringProvider getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final TypingIndicatorType getUserType() {
        return this.userType;
    }

    public final CurrentlyTypingState copy(AvatarWrapper avatarWrapper, boolean showAvatar, StringProvider description, TypingIndicatorType userType) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "avatarWrapper");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(userType, "userType");
        return new CurrentlyTypingState(avatarWrapper, showAvatar, description, userType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentlyTypingState)) {
            return false;
        }
        CurrentlyTypingState currentlyTypingState = (CurrentlyTypingState) other;
        return Intrinsics.areEqual(this.avatarWrapper, currentlyTypingState.avatarWrapper) && this.showAvatar == currentlyTypingState.showAvatar && Intrinsics.areEqual(this.description, currentlyTypingState.description) && this.userType == currentlyTypingState.userType;
    }

    public int hashCode() {
        return (((((this.avatarWrapper.hashCode() * 31) + Boolean.hashCode(this.showAvatar)) * 31) + this.description.hashCode()) * 31) + this.userType.hashCode();
    }

    public String toString() {
        return "CurrentlyTypingState(avatarWrapper=" + this.avatarWrapper + ", showAvatar=" + this.showAvatar + ", description=" + this.description + ", userType=" + this.userType + ')';
    }

    public CurrentlyTypingState(AvatarWrapper avatarWrapper, boolean z, StringProvider description, TypingIndicatorType userType) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "avatarWrapper");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(userType, "userType");
        this.avatarWrapper = avatarWrapper;
        this.showAvatar = z;
        this.description = description;
        this.userType = userType;
    }

    public /* synthetic */ CurrentlyTypingState(AvatarWrapper avatarWrapper, boolean z, StringProvider.StringRes stringRes, TypingIndicatorType typingIndicatorType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AvatarWrapper.INSTANCE.getNULL() : avatarWrapper, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new StringProvider.StringRes(R.string.intercom_thinking, null, 2, null) : stringRes, typingIndicatorType);
    }

    public final AvatarWrapper getAvatarWrapper() {
        return this.avatarWrapper;
    }

    public final boolean getShowAvatar() {
        return this.showAvatar;
    }

    public final StringProvider getDescription() {
        return this.description;
    }

    public final TypingIndicatorType getUserType() {
        return this.userType;
    }
}
