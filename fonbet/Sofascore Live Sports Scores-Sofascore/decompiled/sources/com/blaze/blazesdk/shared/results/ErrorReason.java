package com.blaze.blazesdk.shared.results;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u00106\u001a\u000207J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000207R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5¨\u0006="}, d2 = {"Lcom/blaze/blazesdk/shared/results/ErrorReason;", "Landroid/os/Parcelable;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNEXPECTED", "INVALID_API_KEY", "NETWORK_FAILURE", "INVALID_APP_CONFIG", "TIME_OUT", "SDK_ALREADY_INITIALIZED", "APPLICATION_NOT_INITIALIZED", "NO_INTERNET_CONNECTION", "FAILED_CREATING_USER", "FAILED_UPDATING_USER", "FAILED_REFRESHING_TOKENS", "INVALID_DATA_SOURCE_TYPE_PROVIDED", "NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE", "FAILED_FETCHING_CONTENT", "EXPIRED_ASSET", "FAILED_TO_UPDATE_LIKE", "FAILED_TO_LOAD_IMAGE_ASSET", "FAILED_TO_LOAD_VIDEO_ASSET", "FAILED_PLAYING_STORY", "FAILED_PLAYING_MOMENT", "FAILED_PLAYING_VIDEO", "FAILED_PLAYING_CONTENT_CONTAINER", "FAILED_ADDING_PLACEHOLDER_CONTAINER", "FAILED_ADDING_PLAYER_CONTAINER", "LIFECYCLE_OWNER_NOT_PROVIDED", "VIEW_MODEL_STORE_OWNER_NOT_PROVIDED", "INVALID_LINK", "FAILED_HANDLING_UNIVERSAL_LINK", "INVALID_DOMAIN", "REQUEST_BELONGS_TO_DIFFERENT_USER", "INVALID_GEO_RESTRICTION_CODE", "INVALID_NOTIFICATION_EXTRAS_SCHEME", "INVALID_NOTIFICATION_BODY_SCHEME", "ILLEGAL_PREPARE_ON_DATA_SOURCE_TYPE", "CONTENT_PREPARATION_FAILED", "FAILED_TO_SAVE_DATA", "FAILED_TO_RETRIEVE_DATA", "FAILED_TO_DELETE_DATA", "FAILED_CREATING_LINK", "FAILED_LAUNCHING_SHARE_INTENT", "DUPLICATE_CONTAINER_ID", "FAILED_TO_SET_EXTERNAL_USER_ID", "ACCESSIBILITY_SYSTEM_NOT_AVAILABLE", "INVALID_LOOP_AND_ADVANCE_CONFIGURATION", "FAILED_TO_ENTER_PIP", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorReason implements Parcelable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ErrorReason[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ErrorReason> CREATOR;

    @NotNull
    private final String value;
    public static final ErrorReason UNEXPECTED = new ErrorReason("UNEXPECTED", 0, "unexpected");
    public static final ErrorReason INVALID_API_KEY = new ErrorReason("INVALID_API_KEY", 1, "invalidApiKey");
    public static final ErrorReason NETWORK_FAILURE = new ErrorReason("NETWORK_FAILURE", 2, "networkFailure");
    public static final ErrorReason INVALID_APP_CONFIG = new ErrorReason("INVALID_APP_CONFIG", 3, "invalidAppConfig");
    public static final ErrorReason TIME_OUT = new ErrorReason("TIME_OUT", 4, "timeOut");
    public static final ErrorReason SDK_ALREADY_INITIALIZED = new ErrorReason("SDK_ALREADY_INITIALIZED", 5, "alreadyInitialized");
    public static final ErrorReason APPLICATION_NOT_INITIALIZED = new ErrorReason("APPLICATION_NOT_INITIALIZED", 6, "applicationNotInitialised");
    public static final ErrorReason NO_INTERNET_CONNECTION = new ErrorReason("NO_INTERNET_CONNECTION", 7, "noInternetConnection");
    public static final ErrorReason FAILED_CREATING_USER = new ErrorReason("FAILED_CREATING_USER", 8, "failedCreatingUser");
    public static final ErrorReason FAILED_UPDATING_USER = new ErrorReason("FAILED_UPDATING_USER", 9, "failedUpdatingUser");
    public static final ErrorReason FAILED_REFRESHING_TOKENS = new ErrorReason("FAILED_REFRESHING_TOKENS", 10, "failedRefreshingTokens");
    public static final ErrorReason INVALID_DATA_SOURCE_TYPE_PROVIDED = new ErrorReason("INVALID_DATA_SOURCE_TYPE_PROVIDED", 11, "invalidDataSourceTypeProvided");
    public static final ErrorReason NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE = new ErrorReason("NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE", 12, "noResultsForGivenDataSourceType");
    public static final ErrorReason FAILED_FETCHING_CONTENT = new ErrorReason("FAILED_FETCHING_CONTENT", 13, "failedFetchingContent");
    public static final ErrorReason EXPIRED_ASSET = new ErrorReason("EXPIRED_ASSET", 14, "expiredAsset");
    public static final ErrorReason FAILED_TO_UPDATE_LIKE = new ErrorReason("FAILED_TO_UPDATE_LIKE", 15, "failedToUpdateLike");
    public static final ErrorReason FAILED_TO_LOAD_IMAGE_ASSET = new ErrorReason("FAILED_TO_LOAD_IMAGE_ASSET", 16, "failedToLoadImageAsset");
    public static final ErrorReason FAILED_TO_LOAD_VIDEO_ASSET = new ErrorReason("FAILED_TO_LOAD_VIDEO_ASSET", 17, "failedToLoadVideoAsset");
    public static final ErrorReason FAILED_PLAYING_STORY = new ErrorReason("FAILED_PLAYING_STORY", 18, "failedPlayingStory");
    public static final ErrorReason FAILED_PLAYING_MOMENT = new ErrorReason("FAILED_PLAYING_MOMENT", 19, "failedPlayingMoment");
    public static final ErrorReason FAILED_PLAYING_VIDEO = new ErrorReason("FAILED_PLAYING_VIDEO", 20, "failedPlayingVideo");
    public static final ErrorReason FAILED_PLAYING_CONTENT_CONTAINER = new ErrorReason("FAILED_PLAYING_CONTENT_CONTAINER", 21, "failedPlayingContentContainer");
    public static final ErrorReason FAILED_ADDING_PLACEHOLDER_CONTAINER = new ErrorReason("FAILED_ADDING_PLACEHOLDER_CONTAINER", 22, "failedAddingPlaceholderContainer");
    public static final ErrorReason FAILED_ADDING_PLAYER_CONTAINER = new ErrorReason("FAILED_ADDING_PLAYER_CONTAINER", 23, "failedAddingPlayerContainer");
    public static final ErrorReason LIFECYCLE_OWNER_NOT_PROVIDED = new ErrorReason("LIFECYCLE_OWNER_NOT_PROVIDED", 24, "lifecycleOwnerNotProvided");
    public static final ErrorReason VIEW_MODEL_STORE_OWNER_NOT_PROVIDED = new ErrorReason("VIEW_MODEL_STORE_OWNER_NOT_PROVIDED", 25, "viewModelStoreOwnerNotProvided");
    public static final ErrorReason INVALID_LINK = new ErrorReason("INVALID_LINK", 26, "invalidLink");
    public static final ErrorReason FAILED_HANDLING_UNIVERSAL_LINK = new ErrorReason("FAILED_HANDLING_UNIVERSAL_LINK", 27, "failedHandlingUniversalLink");
    public static final ErrorReason INVALID_DOMAIN = new ErrorReason("INVALID_DOMAIN", 28, "invalidDomain");
    public static final ErrorReason REQUEST_BELONGS_TO_DIFFERENT_USER = new ErrorReason("REQUEST_BELONGS_TO_DIFFERENT_USER", 29, "requestBelongsToDifferentUser");
    public static final ErrorReason INVALID_GEO_RESTRICTION_CODE = new ErrorReason("INVALID_GEO_RESTRICTION_CODE", 30, "invalidGeoRestrictionCode");
    public static final ErrorReason INVALID_NOTIFICATION_EXTRAS_SCHEME = new ErrorReason("INVALID_NOTIFICATION_EXTRAS_SCHEME", 31, "invalidNotificationExtrasScheme");
    public static final ErrorReason INVALID_NOTIFICATION_BODY_SCHEME = new ErrorReason("INVALID_NOTIFICATION_BODY_SCHEME", 32, "invalidNotificationBodyScheme");
    public static final ErrorReason ILLEGAL_PREPARE_ON_DATA_SOURCE_TYPE = new ErrorReason("ILLEGAL_PREPARE_ON_DATA_SOURCE_TYPE", 33, "illegalPrepareOnDataSourceType");
    public static final ErrorReason CONTENT_PREPARATION_FAILED = new ErrorReason("CONTENT_PREPARATION_FAILED", 34, "contentPreparationFailed");
    public static final ErrorReason FAILED_TO_SAVE_DATA = new ErrorReason("FAILED_TO_SAVE_DATA", 35, "failedToSaveData");
    public static final ErrorReason FAILED_TO_RETRIEVE_DATA = new ErrorReason("FAILED_TO_RETRIEVE_DATA", 36, "failedToRetrieveData");
    public static final ErrorReason FAILED_TO_DELETE_DATA = new ErrorReason("FAILED_TO_DELETE_DATA", 37, "failedToDeleteData");
    public static final ErrorReason FAILED_CREATING_LINK = new ErrorReason("FAILED_CREATING_LINK", 38, "failedCreatingLink");
    public static final ErrorReason FAILED_LAUNCHING_SHARE_INTENT = new ErrorReason("FAILED_LAUNCHING_SHARE_INTENT", 39, "failedLaunchingShareIntent");
    public static final ErrorReason DUPLICATE_CONTAINER_ID = new ErrorReason("DUPLICATE_CONTAINER_ID", 40, "duplicateContainerId");
    public static final ErrorReason FAILED_TO_SET_EXTERNAL_USER_ID = new ErrorReason("FAILED_TO_SET_EXTERNAL_USER_ID", 41, "failedToSetExternalUserId");
    public static final ErrorReason ACCESSIBILITY_SYSTEM_NOT_AVAILABLE = new ErrorReason("ACCESSIBILITY_SYSTEM_NOT_AVAILABLE", 42, "accessibilitySystemNotAvailable");
    public static final ErrorReason INVALID_LOOP_AND_ADVANCE_CONFIGURATION = new ErrorReason("INVALID_LOOP_AND_ADVANCE_CONFIGURATION", 43, "invalidLoopAndAdvanceConfiguration");
    public static final ErrorReason FAILED_TO_ENTER_PIP = new ErrorReason("FAILED_TO_ENTER_PIP", 44, "failedToEnterPip");

    private static final /* synthetic */ ErrorReason[] $values() {
        return new ErrorReason[]{UNEXPECTED, INVALID_API_KEY, NETWORK_FAILURE, INVALID_APP_CONFIG, TIME_OUT, SDK_ALREADY_INITIALIZED, APPLICATION_NOT_INITIALIZED, NO_INTERNET_CONNECTION, FAILED_CREATING_USER, FAILED_UPDATING_USER, FAILED_REFRESHING_TOKENS, INVALID_DATA_SOURCE_TYPE_PROVIDED, NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE, FAILED_FETCHING_CONTENT, EXPIRED_ASSET, FAILED_TO_UPDATE_LIKE, FAILED_TO_LOAD_IMAGE_ASSET, FAILED_TO_LOAD_VIDEO_ASSET, FAILED_PLAYING_STORY, FAILED_PLAYING_MOMENT, FAILED_PLAYING_VIDEO, FAILED_PLAYING_CONTENT_CONTAINER, FAILED_ADDING_PLACEHOLDER_CONTAINER, FAILED_ADDING_PLAYER_CONTAINER, LIFECYCLE_OWNER_NOT_PROVIDED, VIEW_MODEL_STORE_OWNER_NOT_PROVIDED, INVALID_LINK, FAILED_HANDLING_UNIVERSAL_LINK, INVALID_DOMAIN, REQUEST_BELONGS_TO_DIFFERENT_USER, INVALID_GEO_RESTRICTION_CODE, INVALID_NOTIFICATION_EXTRAS_SCHEME, INVALID_NOTIFICATION_BODY_SCHEME, ILLEGAL_PREPARE_ON_DATA_SOURCE_TYPE, CONTENT_PREPARATION_FAILED, FAILED_TO_SAVE_DATA, FAILED_TO_RETRIEVE_DATA, FAILED_TO_DELETE_DATA, FAILED_CREATING_LINK, FAILED_LAUNCHING_SHARE_INTENT, DUPLICATE_CONTAINER_ID, FAILED_TO_SET_EXTERNAL_USER_ID, ACCESSIBILITY_SYSTEM_NOT_AVAILABLE, INVALID_LOOP_AND_ADVANCE_CONFIGURATION, FAILED_TO_ENTER_PIP};
    }

    static {
        ErrorReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        CREATOR = new Parcelable.Creator() { // from class: com.blaze.blazesdk.shared.results.ErrorReason.a
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return ErrorReason.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ErrorReason[i];
            }
        };
    }

    private ErrorReason(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static ErrorReason valueOf(String str) {
        return (ErrorReason) Enum.valueOf(ErrorReason.class, str);
    }

    public static ErrorReason[] values() {
        return (ErrorReason[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }
}
