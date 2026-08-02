package com.blaze.blazesdk.shared.results;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum d0 {
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL_UNEXPECTED("An unexpected error occurred in the SDK operation"),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL_ACCESSIBILITY_SYSTEM_NOT_AVAILABLE("Accessibility system is not available or not supported on this device"),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZATION_INVALID_API_KEY("The provided API key is invalid or malformed"),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZATION_NETWORK_FAILURE("Failed to establish network connection during SDK initialization"),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZATION_ALREADY_INITIALIZED("Attempted to initialize SDK when it's already been initialized"),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZATION_APPLICATION_NOT_INITIALIZED("SDK operation attempted before proper initialization"),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZATION_INVALID_GEO_CODE("The provided geo code is invalid or not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZATION_NO_INTERNET_CONNECTION("SDK Initialization operation requires an internet connection which is not available"),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZATION_INVALID_APP_CONFIG("Failed to retrieve application configuration during initialization"),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZATION_TIME_OUT("Failed to initialize the SDK"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTENT_PREPARATION_ILLEGAL_PREPARE_ON_DATA_SOURCE_TYPE("Preparing is not supported when using this data source type."),
    /* JADX INFO: Fake field, exist only in values array */
    WIDGET_NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE("Widget found no results for the specified data source type"),
    /* JADX INFO: Fake field, exist only in values array */
    WIDGET_INVALID_DATA_SOURCE_TYPE("The specified data source type is invalid for widget"),
    /* JADX INFO: Fake field, exist only in values array */
    WIDGET_FAILED_FETCHING_CONTENT("Failed to fetch content for the widget"),
    /* JADX INFO: Fake field, exist only in values array */
    ENTRY_POINT_NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE("Entry point found no results for the specified data source type"),
    /* JADX INFO: Fake field, exist only in values array */
    ENTRY_POINT_INVALID_DATA_SOURCE_TYPE("The specified data source type is invalid for entry point"),
    /* JADX INFO: Fake field, exist only in values array */
    ENTRY_POINT_FAILED_FETCHING_CONTENT("Failed to fetch content for the entry point"),
    /* JADX INFO: Fake field, exist only in values array */
    ENTRY_POINT_FAILED_PLAYING_STORY("Failed to play the story content"),
    /* JADX INFO: Fake field, exist only in values array */
    ENTRY_POINT_FAILED_PLAYING_MOMENT("Failed to play the moment content"),
    /* JADX INFO: Fake field, exist only in values array */
    ENTRY_POINT_FAILED_PLAYING_VIDEO("Failed to play the video content"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_NO_AVAILABLE_CONTENT_FOR_DATA_SOURCE("Player has no content for the specified data source type"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_INVALID_DATA_SOURCE_TYPE("The provided data source type for the player is invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_FAILED_TO_UPDATE_LIKE("Player failed to update the like status"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_NO_INTERNET_CONNECTION("Player operation requires an internet connection which is not available"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_ASSET_EXPIRED("The requested asset has expired and is no longer available"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_IMAGE_ASSET_LOADING_FAILED("Image asset loading failed due to network or decoding error"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_VIDEO_ASSET_LOADING_FAILED("Video asset loading failed due to network or decoding error"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_MANAGEMENT_USER_CREATION_FAILED("Failed to create new user due to service error"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_MANAGEMENT_UPDATING_USER_FAILED("Failed to update user information due to service error"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_MANAGEMENT_REFRESH_TOKEN_FAILED("Failed to refresh user authentication token"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_MANAGEMENT_SET_EXTERNAL_USER_ID_FAILED("Failed to set external user ID due to service error"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_MANAGEMENT_REQUEST_BELONGS_TO_DIFFERENT_USER("The request belongs to a different user than the one currently authenticated"),
    /* JADX INFO: Fake field, exist only in values array */
    UNIVERSAL_LINK_INVALID_URL("The provided universal link URL is invalid or malformed"),
    /* JADX INFO: Fake field, exist only in values array */
    UNIVERSAL_LINK_INVALID_DOMAIN("Universal link content domain is invalid or not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    UNIVERSAL_LINK_FAILED_HANDLING_UNIVERSAL_LINK("Failed to handle the universal link due to service error"),
    /* JADX INFO: Fake field, exist only in values array */
    PUSH_INVALID_EXTRA_INFO_SCHEME("The notification extra info scheme is invalid or unsupported"),
    /* JADX INFO: Fake field, exist only in values array */
    PUSH_INVALID_BODY_SCHEME("The notification body scheme is invalid or unsupported"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINER_FAILED_TO_PLAY_CONTENT_CONTAINER("Failed to play the content container due to service error"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINER_INVALID_DATA_SOURCE_PROVIDED("The provided data source type for the content container is invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINER_LIFECYCLE_OWNER_NOT_PROVIDED("Lifecycle owner was not provided for the content container"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINER_VIEW_MODEL_STORE_OWNER_NOT_PROVIDED("ViewModel store owner was not provided for the content container"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINER_CONTENT_PREPARATION_FAILED("Content preparation failed for the content container"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINER_ILLEGAL_PREPARE_ON_DATA_SOURCE_TYPE("Preparing is not supported when using this data source type for content container"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINER_FAILED_TO_ADD_PLACEHOLDER_CONTAINER("Failed to add placeholder container due to service error"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINER_FAILED_TO_ADD_PLAYER_CONTAINER("Failed to add player container due to service error"),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_STORAGE_FAILED_TO_SAVE_DATA("Storage operation failed to save data due to disk or permission error"),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_STORAGE_FAILED_TO_RETRIEVE_DATA("Storage operation failed to retrieve data due to disk or permission error"),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_STORAGE_FAILED_TO_DELETE_DATA("Storage operation failed to delete data due to disk or permission error"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARING_FAILED_LAUNCHING_SHARE_INTENT("Failed to launch share intent due to system or application error"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARING_FAILED_CREATING_LINK("Failed to create shareable link due to service or network error"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINER_TABS_DUPLICATES_CONTAINER_IDS("Container tabs have duplicate container IDs which is not allowed"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_CONFIGURATIONS_INVALID_LOOP_AND_ADVANCE_CONFIGURATION("Invalid LoopAndAdvance configuration provided"),
    /* JADX INFO: Fake field, exist only in values array */
    PIP_FAILED_TO_ENTER("Failed to enter Picture-in-Picture mode");

    d0(String str) {
    }
}
