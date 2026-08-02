package ru.ozon.app.android.monetization.widgets.inputSubmit.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001f B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitResponse;", "", "type", "Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitResponse$ResponseType;", "state", "Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitResponse$OrganisationStatus;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "error", "", "<init>", "(Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitResponse$ResponseType;Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitResponse$OrganisationStatus;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)V", "getType", "()Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitResponse$ResponseType;", "getState", "()Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitResponse$OrganisationStatus;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ResponseType", "OrganisationStatus", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InputSubmitResponse {
    public static final int $stable = 0;
    private final AtomActionDTO action;
    private final String error;
    private final OrganisationStatus state;

    @NotNull
    private final ResponseType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitResponse$OrganisationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ORGANISATION_STATUSES_INVALID", "ORGANISATION_STATUSES_NEW", "ORGANISATION_STATUSES_REGISTRATION", "ORGANISATION_STATUSES_OK", "ORGANISATION_STATUSES_RESTRICTED", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OrganisationStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OrganisationStatus[] $VALUES;
        public static final OrganisationStatus ORGANISATION_STATUSES_INVALID = new OrganisationStatus("ORGANISATION_STATUSES_INVALID", 0);
        public static final OrganisationStatus ORGANISATION_STATUSES_NEW = new OrganisationStatus("ORGANISATION_STATUSES_NEW", 1);
        public static final OrganisationStatus ORGANISATION_STATUSES_REGISTRATION = new OrganisationStatus("ORGANISATION_STATUSES_REGISTRATION", 2);
        public static final OrganisationStatus ORGANISATION_STATUSES_OK = new OrganisationStatus("ORGANISATION_STATUSES_OK", 3);
        public static final OrganisationStatus ORGANISATION_STATUSES_RESTRICTED = new OrganisationStatus("ORGANISATION_STATUSES_RESTRICTED", 4);

        private static final /* synthetic */ OrganisationStatus[] $values() {
            return new OrganisationStatus[]{ORGANISATION_STATUSES_INVALID, ORGANISATION_STATUSES_NEW, ORGANISATION_STATUSES_REGISTRATION, ORGANISATION_STATUSES_OK, ORGANISATION_STATUSES_RESTRICTED};
        }

        static {
            OrganisationStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private OrganisationStatus(String str, int i11) {
        }

        public static OrganisationStatus valueOf(String str) {
            return (OrganisationStatus) Enum.valueOf(OrganisationStatus.class, str);
        }

        public static OrganisationStatus[] values() {
            return (OrganisationStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitResponse$ResponseType;", "", "<init>", "(Ljava/lang/String;I)V", "RESPONSE_TYPE_SUCCESS", "RESPONSE_TYPE_ERROR", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ResponseType[] $VALUES;
        public static final ResponseType RESPONSE_TYPE_SUCCESS = new ResponseType("RESPONSE_TYPE_SUCCESS", 0);
        public static final ResponseType RESPONSE_TYPE_ERROR = new ResponseType("RESPONSE_TYPE_ERROR", 1);

        private static final /* synthetic */ ResponseType[] $values() {
            return new ResponseType[]{RESPONSE_TYPE_SUCCESS, RESPONSE_TYPE_ERROR};
        }

        static {
            ResponseType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ResponseType(String str, int i11) {
        }

        public static ResponseType valueOf(String str) {
            return (ResponseType) Enum.valueOf(ResponseType.class, str);
        }

        public static ResponseType[] values() {
            return (ResponseType[]) $VALUES.clone();
        }
    }

    public InputSubmitResponse(@NotNull ResponseType type, OrganisationStatus organisationStatus, AtomActionDTO atomActionDTO, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.state = organisationStatus;
        this.action = atomActionDTO;
        this.error = str;
    }

    public static /* synthetic */ InputSubmitResponse copy$default(InputSubmitResponse inputSubmitResponse, ResponseType responseType, OrganisationStatus organisationStatus, AtomActionDTO atomActionDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            responseType = inputSubmitResponse.type;
        }
        if ((i11 & 2) != 0) {
            organisationStatus = inputSubmitResponse.state;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = inputSubmitResponse.action;
        }
        if ((i11 & 8) != 0) {
            str = inputSubmitResponse.error;
        }
        return inputSubmitResponse.copy(responseType, organisationStatus, atomActionDTO, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ResponseType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final OrganisationStatus getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final InputSubmitResponse copy(@NotNull ResponseType type, OrganisationStatus state, AtomActionDTO action, String error) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new InputSubmitResponse(type, state, action, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputSubmitResponse)) {
            return false;
        }
        InputSubmitResponse inputSubmitResponse = (InputSubmitResponse) other;
        return this.type == inputSubmitResponse.type && this.state == inputSubmitResponse.state && Intrinsics.d(this.action, inputSubmitResponse.action) && Intrinsics.d(this.error, inputSubmitResponse.error);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getError() {
        return this.error;
    }

    public final OrganisationStatus getState() {
        return this.state;
    }

    @NotNull
    public final ResponseType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        OrganisationStatus organisationStatus = this.state;
        int hashCode2 = (hashCode + (organisationStatus == null ? 0 : organisationStatus.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.error;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InputSubmitResponse(type=" + this.type + ", state=" + this.state + ", action=" + this.action + ", error=" + this.error + ")";
    }
}
