package com.vk.superapp.base.js.bridge;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: Responses.kt */
/* loaded from: classes6.dex */
public final class Responses$ClientError {

    @pmi0("error_data")
    private final ErrorData errorData;

    @pmi0("error_type")
    private final String errorType;

    @pmi0("requestId")
    private final String requestId;

    public Responses$ClientError(String str, ErrorData errorData, String str2) {
        this.errorType = str;
        this.errorData = errorData;
        this.requestId = str2;
    }

    public final ErrorData a() {
        return this.errorData;
    }

    public final String b() {
        return this.errorType;
    }

    public final String c() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Responses$ClientError)) {
            return false;
        }
        Responses$ClientError responses$ClientError = (Responses$ClientError) obj;
        return epx.f(this.errorType, responses$ClientError.errorType) && epx.f(this.errorData, responses$ClientError.errorData) && epx.f(this.requestId, responses$ClientError.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.errorData.hashCode() + (this.errorType.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientError(errorType=");
        sb.append(this.errorType);
        sb.append(", errorData=");
        sb.append(this.errorData);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ Responses$ClientError(String str, ErrorData errorData, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "client_error" : str, errorData, (i & 4) != 0 ? null : str2);
    }

    /* compiled from: Responses.kt */
    public static final class ErrorData {

        @pmi0("error_description")
        private final String errorDescription;

        @pmi0("reason_access_denied")
        private final Responses$ReasonAccessDenied reasonAccessDenied;

        @pmi0("reason_action_cant_use_in_background")
        private final Responses$ReasonActionCantUseInBackground reasonActionCantUseInBackground;

        @pmi0("reason_already_in_progress")
        private final Responses$ReasonAlreadyInProgress reasonAlreadyInProgress;

        @pmi0("reason_connection_lost")
        private final Responses$ReasonConnectionLost reasonConnectionLost;

        @pmi0("reason_custom")
        private final Responses$ReasonCustom reasonCustom;

        @pmi0("reason_invalid_params")
        private final Responses$ReasonInvalidParams reasonInvalidParams;

        @pmi0("reason_missing_params")
        private final Responses$ReasonMissingParams reasonMissingParams;

        @pmi0("reason_need_user_permission")
        private final Responses$ReasonNeedUserPermission reasonNeedUserPermission;

        @pmi0("reason_no_ads")
        private final Responses$ReasonNoAds reasonNoAds;

        @pmi0("reason_no_device_permission")
        private final Responses$ReasonNoDevicePermission reasonNoDevicePermission;

        @pmi0("reason_requests_limit_reached")
        private final Responses$ReasonRequestsLimitReached reasonRequestsLimitReached;

        @pmi0("reason_uninitialized_app")
        private final Responses$ReasonUninitializedApp reasonUninitializedApp;

        @pmi0("reason_unknown_error")
        private final Responses$ReasonUnknownError reasonUnknownError;

        @pmi0("reason_unsupported_platform")
        private final Responses$ReasonUnsupportedPlatform reasonUnsupportedPlatform;

        @pmi0("reason_user_denied")
        private final Responses$ReasonUserDenied reasonUserDenied;

        @pmi0("type")
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Responses.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @pmi0("reason_access_denied")
            public static final Type REASON_ACCESS_DENIED;

            @pmi0("reason_action_cant_use_in_background")
            public static final Type REASON_ACTION_CANT_USE_IN_BACKGROUND;

            @pmi0("reason_already_in_progress")
            public static final Type REASON_ALREADY_IN_PROGRESS;

            @pmi0("reason_connection_lost")
            public static final Type REASON_CONNECTION_LOST;

            @pmi0("reason_custom")
            public static final Type REASON_CUSTOM;

            @pmi0("reason_invalid_params")
            public static final Type REASON_INVALID_PARAMS;

            @pmi0("reason_missing_params")
            public static final Type REASON_MISSING_PARAMS;

            @pmi0("reason_need_user_permission")
            public static final Type REASON_NEED_USER_PERMISSION;

            @pmi0("reason_no_ads")
            public static final Type REASON_NO_ADS;

            @pmi0("reason_no_device_permission")
            public static final Type REASON_NO_DEVICE_PERMISSION;

            @pmi0("reason_requests_limit_reached")
            public static final Type REASON_REQUESTS_LIMIT_REACHED;

            @pmi0("reason_uninitialized_app")
            public static final Type REASON_UNINITIALIZED_APP;

            @pmi0("reason_unknown_error")
            public static final Type REASON_UNKNOWN_ERROR;

            @pmi0("reason_unsupported_platform")
            public static final Type REASON_UNSUPPORTED_PLATFORM;

            @pmi0("reason_user_denied")
            public static final Type REASON_USER_DENIED;

            static {
                Type type = new Type("REASON_UNKNOWN_ERROR", 0);
                REASON_UNKNOWN_ERROR = type;
                Type type2 = new Type("REASON_MISSING_PARAMS", 1);
                REASON_MISSING_PARAMS = type2;
                Type type3 = new Type("REASON_CONNECTION_LOST", 2);
                REASON_CONNECTION_LOST = type3;
                Type type4 = new Type("REASON_USER_DENIED", 3);
                REASON_USER_DENIED = type4;
                Type type5 = new Type("REASON_INVALID_PARAMS", 4);
                REASON_INVALID_PARAMS = type5;
                Type type6 = new Type("REASON_UNSUPPORTED_PLATFORM", 5);
                REASON_UNSUPPORTED_PLATFORM = type6;
                Type type7 = new Type("REASON_NO_DEVICE_PERMISSION", 6);
                REASON_NO_DEVICE_PERMISSION = type7;
                Type type8 = new Type("REASON_NEED_USER_PERMISSION", 7);
                REASON_NEED_USER_PERMISSION = type8;
                Type type9 = new Type("REASON_ACTION_CANT_USE_IN_BACKGROUND", 8);
                REASON_ACTION_CANT_USE_IN_BACKGROUND = type9;
                Type type10 = new Type("REASON_REQUESTS_LIMIT_REACHED", 9);
                REASON_REQUESTS_LIMIT_REACHED = type10;
                Type type11 = new Type("REASON_ACCESS_DENIED", 10);
                REASON_ACCESS_DENIED = type11;
                Type type12 = new Type("REASON_UNINITIALIZED_APP", 11);
                REASON_UNINITIALIZED_APP = type12;
                Type type13 = new Type("REASON_CUSTOM", 12);
                REASON_CUSTOM = type13;
                Type type14 = new Type("REASON_NO_ADS", 13);
                REASON_NO_ADS = type14;
                Type type15 = new Type("REASON_ALREADY_IN_PROGRESS", 14);
                REASON_ALREADY_IN_PROGRESS = type15;
                Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            private Type(String str, int i) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public ErrorData(Type type, String str, Responses$ReasonUnknownError responses$ReasonUnknownError, Responses$ReasonMissingParams responses$ReasonMissingParams, Responses$ReasonConnectionLost responses$ReasonConnectionLost, Responses$ReasonUserDenied responses$ReasonUserDenied, Responses$ReasonInvalidParams responses$ReasonInvalidParams, Responses$ReasonUnsupportedPlatform responses$ReasonUnsupportedPlatform, Responses$ReasonNoDevicePermission responses$ReasonNoDevicePermission, Responses$ReasonNeedUserPermission responses$ReasonNeedUserPermission, Responses$ReasonActionCantUseInBackground responses$ReasonActionCantUseInBackground, Responses$ReasonRequestsLimitReached responses$ReasonRequestsLimitReached, Responses$ReasonAccessDenied responses$ReasonAccessDenied, Responses$ReasonUninitializedApp responses$ReasonUninitializedApp, Responses$ReasonCustom responses$ReasonCustom, Responses$ReasonNoAds responses$ReasonNoAds, Responses$ReasonAlreadyInProgress responses$ReasonAlreadyInProgress) {
            this.type = type;
            this.errorDescription = str;
            this.reasonUnknownError = responses$ReasonUnknownError;
            this.reasonMissingParams = responses$ReasonMissingParams;
            this.reasonConnectionLost = responses$ReasonConnectionLost;
            this.reasonUserDenied = responses$ReasonUserDenied;
            this.reasonInvalidParams = responses$ReasonInvalidParams;
            this.reasonUnsupportedPlatform = responses$ReasonUnsupportedPlatform;
            this.reasonNoDevicePermission = responses$ReasonNoDevicePermission;
            this.reasonNeedUserPermission = responses$ReasonNeedUserPermission;
            this.reasonActionCantUseInBackground = responses$ReasonActionCantUseInBackground;
            this.reasonRequestsLimitReached = responses$ReasonRequestsLimitReached;
            this.reasonAccessDenied = responses$ReasonAccessDenied;
            this.reasonUninitializedApp = responses$ReasonUninitializedApp;
            this.reasonCustom = responses$ReasonCustom;
            this.reasonNoAds = responses$ReasonNoAds;
            this.reasonAlreadyInProgress = responses$ReasonAlreadyInProgress;
        }

        public final String a() {
            return this.errorDescription;
        }

        public final Type b() {
            return this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorData)) {
                return false;
            }
            ErrorData errorData = (ErrorData) obj;
            return this.type == errorData.type && epx.f(this.errorDescription, errorData.errorDescription) && epx.f(this.reasonUnknownError, errorData.reasonUnknownError) && epx.f(this.reasonMissingParams, errorData.reasonMissingParams) && epx.f(this.reasonConnectionLost, errorData.reasonConnectionLost) && epx.f(this.reasonUserDenied, errorData.reasonUserDenied) && epx.f(this.reasonInvalidParams, errorData.reasonInvalidParams) && epx.f(this.reasonUnsupportedPlatform, errorData.reasonUnsupportedPlatform) && epx.f(this.reasonNoDevicePermission, errorData.reasonNoDevicePermission) && epx.f(this.reasonNeedUserPermission, errorData.reasonNeedUserPermission) && epx.f(this.reasonActionCantUseInBackground, errorData.reasonActionCantUseInBackground) && epx.f(this.reasonRequestsLimitReached, errorData.reasonRequestsLimitReached) && epx.f(this.reasonAccessDenied, errorData.reasonAccessDenied) && epx.f(this.reasonUninitializedApp, errorData.reasonUninitializedApp) && epx.f(this.reasonCustom, errorData.reasonCustom) && epx.f(this.reasonNoAds, errorData.reasonNoAds) && epx.f(this.reasonAlreadyInProgress, errorData.reasonAlreadyInProgress);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.errorDescription;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Responses$ReasonUnknownError responses$ReasonUnknownError = this.reasonUnknownError;
            int hashCode3 = (hashCode2 + (responses$ReasonUnknownError == null ? 0 : responses$ReasonUnknownError.hashCode())) * 31;
            Responses$ReasonMissingParams responses$ReasonMissingParams = this.reasonMissingParams;
            int hashCode4 = (hashCode3 + (responses$ReasonMissingParams == null ? 0 : responses$ReasonMissingParams.hashCode())) * 31;
            Responses$ReasonConnectionLost responses$ReasonConnectionLost = this.reasonConnectionLost;
            int hashCode5 = (hashCode4 + (responses$ReasonConnectionLost == null ? 0 : responses$ReasonConnectionLost.hashCode())) * 31;
            Responses$ReasonUserDenied responses$ReasonUserDenied = this.reasonUserDenied;
            int hashCode6 = (hashCode5 + (responses$ReasonUserDenied == null ? 0 : responses$ReasonUserDenied.hashCode())) * 31;
            Responses$ReasonInvalidParams responses$ReasonInvalidParams = this.reasonInvalidParams;
            int hashCode7 = (hashCode6 + (responses$ReasonInvalidParams == null ? 0 : responses$ReasonInvalidParams.hashCode())) * 31;
            Responses$ReasonUnsupportedPlatform responses$ReasonUnsupportedPlatform = this.reasonUnsupportedPlatform;
            int hashCode8 = (hashCode7 + (responses$ReasonUnsupportedPlatform == null ? 0 : responses$ReasonUnsupportedPlatform.hashCode())) * 31;
            Responses$ReasonNoDevicePermission responses$ReasonNoDevicePermission = this.reasonNoDevicePermission;
            int hashCode9 = (hashCode8 + (responses$ReasonNoDevicePermission == null ? 0 : responses$ReasonNoDevicePermission.hashCode())) * 31;
            Responses$ReasonNeedUserPermission responses$ReasonNeedUserPermission = this.reasonNeedUserPermission;
            int hashCode10 = (hashCode9 + (responses$ReasonNeedUserPermission == null ? 0 : responses$ReasonNeedUserPermission.hashCode())) * 31;
            Responses$ReasonActionCantUseInBackground responses$ReasonActionCantUseInBackground = this.reasonActionCantUseInBackground;
            int hashCode11 = (hashCode10 + (responses$ReasonActionCantUseInBackground == null ? 0 : responses$ReasonActionCantUseInBackground.hashCode())) * 31;
            Responses$ReasonRequestsLimitReached responses$ReasonRequestsLimitReached = this.reasonRequestsLimitReached;
            int hashCode12 = (hashCode11 + (responses$ReasonRequestsLimitReached == null ? 0 : responses$ReasonRequestsLimitReached.hashCode())) * 31;
            Responses$ReasonAccessDenied responses$ReasonAccessDenied = this.reasonAccessDenied;
            int hashCode13 = (hashCode12 + (responses$ReasonAccessDenied == null ? 0 : responses$ReasonAccessDenied.hashCode())) * 31;
            Responses$ReasonUninitializedApp responses$ReasonUninitializedApp = this.reasonUninitializedApp;
            int hashCode14 = (hashCode13 + (responses$ReasonUninitializedApp == null ? 0 : responses$ReasonUninitializedApp.hashCode())) * 31;
            Responses$ReasonCustom responses$ReasonCustom = this.reasonCustom;
            int hashCode15 = (hashCode14 + (responses$ReasonCustom == null ? 0 : responses$ReasonCustom.hashCode())) * 31;
            Responses$ReasonNoAds responses$ReasonNoAds = this.reasonNoAds;
            int hashCode16 = (hashCode15 + (responses$ReasonNoAds == null ? 0 : responses$ReasonNoAds.hashCode())) * 31;
            Responses$ReasonAlreadyInProgress responses$ReasonAlreadyInProgress = this.reasonAlreadyInProgress;
            return hashCode16 + (responses$ReasonAlreadyInProgress != null ? responses$ReasonAlreadyInProgress.hashCode() : 0);
        }

        public final String toString() {
            return "ErrorData(type=" + this.type + ", errorDescription=" + this.errorDescription + ", reasonUnknownError=" + this.reasonUnknownError + ", reasonMissingParams=" + this.reasonMissingParams + ", reasonConnectionLost=" + this.reasonConnectionLost + ", reasonUserDenied=" + this.reasonUserDenied + ", reasonInvalidParams=" + this.reasonInvalidParams + ", reasonUnsupportedPlatform=" + this.reasonUnsupportedPlatform + ", reasonNoDevicePermission=" + this.reasonNoDevicePermission + ", reasonNeedUserPermission=" + this.reasonNeedUserPermission + ", reasonActionCantUseInBackground=" + this.reasonActionCantUseInBackground + ", reasonRequestsLimitReached=" + this.reasonRequestsLimitReached + ", reasonAccessDenied=" + this.reasonAccessDenied + ", reasonUninitializedApp=" + this.reasonUninitializedApp + ", reasonCustom=" + this.reasonCustom + ", reasonNoAds=" + this.reasonNoAds + ", reasonAlreadyInProgress=" + this.reasonAlreadyInProgress + ')';
        }

        public /* synthetic */ ErrorData(Type type, String str, Responses$ReasonUnknownError responses$ReasonUnknownError, Responses$ReasonMissingParams responses$ReasonMissingParams, Responses$ReasonConnectionLost responses$ReasonConnectionLost, Responses$ReasonUserDenied responses$ReasonUserDenied, Responses$ReasonInvalidParams responses$ReasonInvalidParams, Responses$ReasonUnsupportedPlatform responses$ReasonUnsupportedPlatform, Responses$ReasonNoDevicePermission responses$ReasonNoDevicePermission, Responses$ReasonNeedUserPermission responses$ReasonNeedUserPermission, Responses$ReasonActionCantUseInBackground responses$ReasonActionCantUseInBackground, Responses$ReasonRequestsLimitReached responses$ReasonRequestsLimitReached, Responses$ReasonAccessDenied responses$ReasonAccessDenied, Responses$ReasonUninitializedApp responses$ReasonUninitializedApp, Responses$ReasonCustom responses$ReasonCustom, Responses$ReasonNoAds responses$ReasonNoAds, Responses$ReasonAlreadyInProgress responses$ReasonAlreadyInProgress, int i, zcl zclVar) {
            this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : responses$ReasonUnknownError, (i & 8) != 0 ? null : responses$ReasonMissingParams, (i & 16) != 0 ? null : responses$ReasonConnectionLost, (i & 32) != 0 ? null : responses$ReasonUserDenied, (i & 64) != 0 ? null : responses$ReasonInvalidParams, (i & 128) != 0 ? null : responses$ReasonUnsupportedPlatform, (i & 256) != 0 ? null : responses$ReasonNoDevicePermission, (i & 512) != 0 ? null : responses$ReasonNeedUserPermission, (i & 1024) != 0 ? null : responses$ReasonActionCantUseInBackground, (i & 2048) != 0 ? null : responses$ReasonRequestsLimitReached, (i & 4096) != 0 ? null : responses$ReasonAccessDenied, (i & 8192) != 0 ? null : responses$ReasonUninitializedApp, (i & 16384) != 0 ? null : responses$ReasonCustom, (i & 32768) != 0 ? null : responses$ReasonNoAds, (i & 65536) != 0 ? null : responses$ReasonAlreadyInProgress);
        }
    }
}
