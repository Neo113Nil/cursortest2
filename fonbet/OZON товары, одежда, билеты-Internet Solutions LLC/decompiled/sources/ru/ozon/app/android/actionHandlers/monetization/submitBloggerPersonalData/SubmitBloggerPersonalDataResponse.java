package ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData;

import De.C2859b;
import HY.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse;", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "success", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse$Success;", "error", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse$Error;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse$Success;Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse$Error;)V", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getSuccess", "()Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse$Success;", "getError", "()Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse$Error;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Success", "Error", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SubmitBloggerPersonalDataResponse {
    private final Error error;
    private final NotificationDTO notificationBar;
    private final Success success;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse$Error;", "", "errors", "", "", "<init>", "(Ljava/util/Map;)V", "getErrors", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error {
        private final Map<String, String> errors;

        public Error(Map<String, String> map) {
            this.errors = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = error.errors;
            }
            return error.copy(map);
        }

        public final Map<String, String> component1() {
            return this.errors;
        }

        @NotNull
        public final Error copy(Map<String, String> errors) {
            return new Error(errors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.d(this.errors, ((Error) other).errors);
        }

        public final Map<String, String> getErrors() {
            return this.errors;
        }

        public int hashCode() {
            Map<String, String> map = this.errors;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @NotNull
        public String toString() {
            return b.b("Error(errors=", ")", this.errors);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse$Success;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success {
        private final AtomActionDTO action;

        public Success(AtomActionDTO atomActionDTO) {
            this.action = atomActionDTO;
        }

        public static /* synthetic */ Success copy$default(Success success, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = success.action;
            }
            return success.copy(atomActionDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Success copy(AtomActionDTO action) {
            return new Success(action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.d(this.action, ((Success) other).action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public int hashCode() {
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                return 0;
            }
            return atomActionDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return C2859b.f("Success(action=", ")", this.action);
        }
    }

    public SubmitBloggerPersonalDataResponse(NotificationDTO notificationDTO, Success success, Error error) {
        this.notificationBar = notificationDTO;
        this.success = success;
        this.error = error;
    }

    public static /* synthetic */ SubmitBloggerPersonalDataResponse copy$default(SubmitBloggerPersonalDataResponse submitBloggerPersonalDataResponse, NotificationDTO notificationDTO, Success success, Error error, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notificationDTO = submitBloggerPersonalDataResponse.notificationBar;
        }
        if ((i11 & 2) != 0) {
            success = submitBloggerPersonalDataResponse.success;
        }
        if ((i11 & 4) != 0) {
            error = submitBloggerPersonalDataResponse.error;
        }
        return submitBloggerPersonalDataResponse.copy(notificationDTO, success, error);
    }

    /* renamed from: component1, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    /* renamed from: component2, reason: from getter */
    public final Success getSuccess() {
        return this.success;
    }

    /* renamed from: component3, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final SubmitBloggerPersonalDataResponse copy(NotificationDTO notificationBar, Success success, Error error) {
        return new SubmitBloggerPersonalDataResponse(notificationBar, success, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitBloggerPersonalDataResponse)) {
            return false;
        }
        SubmitBloggerPersonalDataResponse submitBloggerPersonalDataResponse = (SubmitBloggerPersonalDataResponse) other;
        return Intrinsics.d(this.notificationBar, submitBloggerPersonalDataResponse.notificationBar) && Intrinsics.d(this.success, submitBloggerPersonalDataResponse.success) && Intrinsics.d(this.error, submitBloggerPersonalDataResponse.error);
    }

    public final Error getError() {
        return this.error;
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final Success getSuccess() {
        return this.success;
    }

    public int hashCode() {
        NotificationDTO notificationDTO = this.notificationBar;
        int hashCode = (notificationDTO == null ? 0 : notificationDTO.hashCode()) * 31;
        Success success = this.success;
        int hashCode2 = (hashCode + (success == null ? 0 : success.hashCode())) * 31;
        Error error = this.error;
        return hashCode2 + (error != null ? error.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubmitBloggerPersonalDataResponse(notificationBar=" + this.notificationBar + ", success=" + this.success + ", error=" + this.error + ")";
    }
}
