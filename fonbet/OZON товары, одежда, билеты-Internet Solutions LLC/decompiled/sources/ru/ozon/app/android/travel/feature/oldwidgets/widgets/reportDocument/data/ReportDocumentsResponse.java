package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data;

import com.google.android.gms.common.Scopes;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse;", "", "inputs", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse$ResponseInputs;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notification", "Lru/ozon/uni/android/flashbar/model/Restriction;", "<init>", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse$ResponseInputs;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "getInputs", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse$ResponseInputs;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotification", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ResponseInputs", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReportDocumentsResponse {
    private final AtomActionDTO action;

    @NotNull
    private final ResponseInputs inputs;
    private final Restriction notification;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse$ResponseInputs;", "", "fromDate", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "toDate", Scopes.EMAIL, "<init>", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;)V", "getFromDate", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "getToDate", "getEmail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResponseInputs {
        private final CommonInputDTO email;
        private final CommonInputDTO fromDate;
        private final CommonInputDTO toDate;

        public ResponseInputs(CommonInputDTO commonInputDTO, CommonInputDTO commonInputDTO2, CommonInputDTO commonInputDTO3) {
            this.fromDate = commonInputDTO;
            this.toDate = commonInputDTO2;
            this.email = commonInputDTO3;
        }

        public static /* synthetic */ ResponseInputs copy$default(ResponseInputs responseInputs, CommonInputDTO commonInputDTO, CommonInputDTO commonInputDTO2, CommonInputDTO commonInputDTO3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonInputDTO = responseInputs.fromDate;
            }
            if ((i11 & 2) != 0) {
                commonInputDTO2 = responseInputs.toDate;
            }
            if ((i11 & 4) != 0) {
                commonInputDTO3 = responseInputs.email;
            }
            return responseInputs.copy(commonInputDTO, commonInputDTO2, commonInputDTO3);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonInputDTO getFromDate() {
            return this.fromDate;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonInputDTO getToDate() {
            return this.toDate;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonInputDTO getEmail() {
            return this.email;
        }

        @NotNull
        public final ResponseInputs copy(CommonInputDTO fromDate, CommonInputDTO toDate, CommonInputDTO email) {
            return new ResponseInputs(fromDate, toDate, email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResponseInputs)) {
                return false;
            }
            ResponseInputs responseInputs = (ResponseInputs) other;
            return Intrinsics.d(this.fromDate, responseInputs.fromDate) && Intrinsics.d(this.toDate, responseInputs.toDate) && Intrinsics.d(this.email, responseInputs.email);
        }

        public final CommonInputDTO getEmail() {
            return this.email;
        }

        public final CommonInputDTO getFromDate() {
            return this.fromDate;
        }

        public final CommonInputDTO getToDate() {
            return this.toDate;
        }

        public int hashCode() {
            CommonInputDTO commonInputDTO = this.fromDate;
            int hashCode = (commonInputDTO == null ? 0 : commonInputDTO.hashCode()) * 31;
            CommonInputDTO commonInputDTO2 = this.toDate;
            int hashCode2 = (hashCode + (commonInputDTO2 == null ? 0 : commonInputDTO2.hashCode())) * 31;
            CommonInputDTO commonInputDTO3 = this.email;
            return hashCode2 + (commonInputDTO3 != null ? commonInputDTO3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ResponseInputs(fromDate=" + this.fromDate + ", toDate=" + this.toDate + ", email=" + this.email + ")";
        }
    }

    public ReportDocumentsResponse(@NotNull ResponseInputs inputs, AtomActionDTO atomActionDTO, Restriction restriction) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.inputs = inputs;
        this.action = atomActionDTO;
        this.notification = restriction;
    }

    public static /* synthetic */ ReportDocumentsResponse copy$default(ReportDocumentsResponse reportDocumentsResponse, ResponseInputs responseInputs, AtomActionDTO atomActionDTO, Restriction restriction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            responseInputs = reportDocumentsResponse.inputs;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = reportDocumentsResponse.action;
        }
        if ((i11 & 4) != 0) {
            restriction = reportDocumentsResponse.notification;
        }
        return reportDocumentsResponse.copy(responseInputs, atomActionDTO, restriction);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ResponseInputs getInputs() {
        return this.inputs;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final Restriction getNotification() {
        return this.notification;
    }

    @NotNull
    public final ReportDocumentsResponse copy(@NotNull ResponseInputs inputs, AtomActionDTO action, Restriction notification) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        return new ReportDocumentsResponse(inputs, action, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportDocumentsResponse)) {
            return false;
        }
        ReportDocumentsResponse reportDocumentsResponse = (ReportDocumentsResponse) other;
        return Intrinsics.d(this.inputs, reportDocumentsResponse.inputs) && Intrinsics.d(this.action, reportDocumentsResponse.action) && Intrinsics.d(this.notification, reportDocumentsResponse.notification);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final ResponseInputs getInputs() {
        return this.inputs;
    }

    public final Restriction getNotification() {
        return this.notification;
    }

    public int hashCode() {
        int hashCode = this.inputs.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Restriction restriction = this.notification;
        return hashCode2 + (restriction != null ? restriction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReportDocumentsResponse(inputs=" + this.inputs + ", action=" + this.action + ", notification=" + this.notification + ")";
    }
}
