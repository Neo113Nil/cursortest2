package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data;

import Ak.b;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest;", "", "inputs", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest$ParamsInputs;", "validateOnly", "", "<init>", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest$ParamsInputs;Z)V", "getInputs", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest$ParamsInputs;", "getValidateOnly", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ParamsInputs", "InputValue", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReportDocumentsRequest {

    @NotNull
    private final ParamsInputs inputs;
    private final boolean validateOnly;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest$ParamsInputs;", "", "fromDate", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest$InputValue;", "toDate", Scopes.EMAIL, "<init>", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest$InputValue;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest$InputValue;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest$InputValue;)V", "getFromDate", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest$InputValue;", "getToDate", "getEmail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ParamsInputs {
        private final InputValue email;
        private final InputValue fromDate;
        private final InputValue toDate;

        public ParamsInputs(InputValue inputValue, InputValue inputValue2, InputValue inputValue3) {
            this.fromDate = inputValue;
            this.toDate = inputValue2;
            this.email = inputValue3;
        }

        public static /* synthetic */ ParamsInputs copy$default(ParamsInputs paramsInputs, InputValue inputValue, InputValue inputValue2, InputValue inputValue3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                inputValue = paramsInputs.fromDate;
            }
            if ((i11 & 2) != 0) {
                inputValue2 = paramsInputs.toDate;
            }
            if ((i11 & 4) != 0) {
                inputValue3 = paramsInputs.email;
            }
            return paramsInputs.copy(inputValue, inputValue2, inputValue3);
        }

        /* renamed from: component1, reason: from getter */
        public final InputValue getFromDate() {
            return this.fromDate;
        }

        /* renamed from: component2, reason: from getter */
        public final InputValue getToDate() {
            return this.toDate;
        }

        /* renamed from: component3, reason: from getter */
        public final InputValue getEmail() {
            return this.email;
        }

        @NotNull
        public final ParamsInputs copy(InputValue fromDate, InputValue toDate, InputValue email) {
            return new ParamsInputs(fromDate, toDate, email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParamsInputs)) {
                return false;
            }
            ParamsInputs paramsInputs = (ParamsInputs) other;
            return Intrinsics.d(this.fromDate, paramsInputs.fromDate) && Intrinsics.d(this.toDate, paramsInputs.toDate) && Intrinsics.d(this.email, paramsInputs.email);
        }

        public final InputValue getEmail() {
            return this.email;
        }

        public final InputValue getFromDate() {
            return this.fromDate;
        }

        public final InputValue getToDate() {
            return this.toDate;
        }

        public int hashCode() {
            InputValue inputValue = this.fromDate;
            int hashCode = (inputValue == null ? 0 : inputValue.hashCode()) * 31;
            InputValue inputValue2 = this.toDate;
            int hashCode2 = (hashCode + (inputValue2 == null ? 0 : inputValue2.hashCode())) * 31;
            InputValue inputValue3 = this.email;
            return hashCode2 + (inputValue3 != null ? inputValue3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ParamsInputs(fromDate=" + this.fromDate + ", toDate=" + this.toDate + ", email=" + this.email + ")";
        }
    }

    public ReportDocumentsRequest(@NotNull ParamsInputs inputs, boolean z11) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.inputs = inputs;
        this.validateOnly = z11;
    }

    public static /* synthetic */ ReportDocumentsRequest copy$default(ReportDocumentsRequest reportDocumentsRequest, ParamsInputs paramsInputs, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paramsInputs = reportDocumentsRequest.inputs;
        }
        if ((i11 & 2) != 0) {
            z11 = reportDocumentsRequest.validateOnly;
        }
        return reportDocumentsRequest.copy(paramsInputs, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ParamsInputs getInputs() {
        return this.inputs;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getValidateOnly() {
        return this.validateOnly;
    }

    @NotNull
    public final ReportDocumentsRequest copy(@NotNull ParamsInputs inputs, boolean validateOnly) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        return new ReportDocumentsRequest(inputs, validateOnly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportDocumentsRequest)) {
            return false;
        }
        ReportDocumentsRequest reportDocumentsRequest = (ReportDocumentsRequest) other;
        return Intrinsics.d(this.inputs, reportDocumentsRequest.inputs) && this.validateOnly == reportDocumentsRequest.validateOnly;
    }

    @NotNull
    public final ParamsInputs getInputs() {
        return this.inputs;
    }

    public final boolean getValidateOnly() {
        return this.validateOnly;
    }

    public int hashCode() {
        return Boolean.hashCode(this.validateOnly) + (this.inputs.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ReportDocumentsRequest(inputs=" + this.inputs + ", validateOnly=" + this.validateOnly + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest$InputValue;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isTouched", "", "<init>", "(Ljava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputValue {
        private final boolean isTouched;

        @NotNull
        private final String value;

        public InputValue(@NotNull String value, boolean z11) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.isTouched = z11;
        }

        public static /* synthetic */ InputValue copy$default(InputValue inputValue, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputValue.value;
            }
            if ((i11 & 2) != 0) {
                z11 = inputValue.isTouched;
            }
            return inputValue.copy(str, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsTouched() {
            return this.isTouched;
        }

        @NotNull
        public final InputValue copy(@NotNull String value, boolean isTouched) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new InputValue(value, isTouched);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputValue)) {
                return false;
            }
            InputValue inputValue = (InputValue) other;
            return Intrinsics.d(this.value, inputValue.value) && this.isTouched == inputValue.isTouched;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isTouched) + (this.value.hashCode() * 31);
        }

        public final boolean isTouched() {
            return this.isTouched;
        }

        @NotNull
        public String toString() {
            return b.f("InputValue(value=", this.value, ", isTouched=", ")", this.isTouched);
        }

        public /* synthetic */ InputValue(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? true : z11);
        }
    }

    public /* synthetic */ ReportDocumentsRequest(ParamsInputs paramsInputs, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(paramsInputs, (i11 & 2) != 0 ? false : z11);
    }
}
