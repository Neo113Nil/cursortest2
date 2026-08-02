package ru.ozon.app.android.returns.cancels.cancelReasons.data;

import De.C2859b;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002*+BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JS\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO;", "", "cancelReasons", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "input", "Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$InputDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "sticky", "Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$StickyDTO;", "state", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$InputDTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$StickyDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;)V", "getCancelReasons", "()Ljava/util/List;", "getInput", "()Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$InputDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getSticky", "()Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$StickyDTO;", "getState", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "InputDTO", "StickyDTO", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectCancelReasonDTO {

    @NotNull
    private final List<CellDTO> cancelReasons;
    private final DisclaimerDTO disclaimer;
    private final InputDTO input;
    private final String state;

    @NotNull
    private final StickyDTO sticky;
    private final TestInfo testInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$InputDTO;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "placeHolder", "maxCount", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getValue", "()Ljava/lang/String;", "getPlaceHolder", "getMaxCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$InputDTO;", "equals", "", "other", "hashCode", "toString", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputDTO {
        private final CommonControlSettings common;
        private final Integer maxCount;
        private final String placeHolder;
        private final String value;

        public InputDTO(String str, String str2, Integer num, CommonControlSettings commonControlSettings) {
            this.value = str;
            this.placeHolder = str2;
            this.maxCount = num;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, Integer num, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputDTO.value;
            }
            if ((i11 & 2) != 0) {
                str2 = inputDTO.placeHolder;
            }
            if ((i11 & 4) != 0) {
                num = inputDTO.maxCount;
            }
            if ((i11 & 8) != 0) {
                commonControlSettings = inputDTO.common;
            }
            return inputDTO.copy(str, str2, num, commonControlSettings);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlaceHolder() {
            return this.placeHolder;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getMaxCount() {
            return this.maxCount;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final InputDTO copy(String value, String placeHolder, Integer maxCount, CommonControlSettings common) {
            return new InputDTO(value, placeHolder, maxCount, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputDTO)) {
                return false;
            }
            InputDTO inputDTO = (InputDTO) other;
            return Intrinsics.d(this.value, inputDTO.value) && Intrinsics.d(this.placeHolder, inputDTO.placeHolder) && Intrinsics.d(this.maxCount, inputDTO.maxCount) && Intrinsics.d(this.common, inputDTO.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final Integer getMaxCount() {
            return this.maxCount;
        }

        public final String getPlaceHolder() {
            return this.placeHolder;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.placeHolder;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.maxCount;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.value;
            String str2 = this.placeHolder;
            Integer num = this.maxCount;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder d11 = C3660k.d("InputDTO(value=", str, ", placeHolder=", str2, ", maxCount=");
            d11.append(num);
            d11.append(", common=");
            d11.append(commonControlSettings);
            d11.append(")");
            return d11.toString();
        }
    }

    public SelectCancelReasonDTO(@NotNull List<CellDTO> cancelReasons, InputDTO inputDTO, DisclaimerDTO disclaimerDTO, @NotNull StickyDTO sticky, String str, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(cancelReasons, "cancelReasons");
        Intrinsics.checkNotNullParameter(sticky, "sticky");
        this.cancelReasons = cancelReasons;
        this.input = inputDTO;
        this.disclaimer = disclaimerDTO;
        this.sticky = sticky;
        this.state = str;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ SelectCancelReasonDTO copy$default(SelectCancelReasonDTO selectCancelReasonDTO, List list, InputDTO inputDTO, DisclaimerDTO disclaimerDTO, StickyDTO stickyDTO, String str, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = selectCancelReasonDTO.cancelReasons;
        }
        if ((i11 & 2) != 0) {
            inputDTO = selectCancelReasonDTO.input;
        }
        if ((i11 & 4) != 0) {
            disclaimerDTO = selectCancelReasonDTO.disclaimer;
        }
        if ((i11 & 8) != 0) {
            stickyDTO = selectCancelReasonDTO.sticky;
        }
        if ((i11 & 16) != 0) {
            str = selectCancelReasonDTO.state;
        }
        if ((i11 & 32) != 0) {
            testInfo = selectCancelReasonDTO.testInfo;
        }
        String str2 = str;
        TestInfo testInfo2 = testInfo;
        return selectCancelReasonDTO.copy(list, inputDTO, disclaimerDTO, stickyDTO, str2, testInfo2);
    }

    @NotNull
    public final List<CellDTO> component1() {
        return this.cancelReasons;
    }

    /* renamed from: component2, reason: from getter */
    public final InputDTO getInput() {
        return this.input;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final StickyDTO getSticky() {
        return this.sticky;
    }

    /* renamed from: component5, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final SelectCancelReasonDTO copy(@NotNull List<CellDTO> cancelReasons, InputDTO input, DisclaimerDTO disclaimer, @NotNull StickyDTO sticky, String state, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(cancelReasons, "cancelReasons");
        Intrinsics.checkNotNullParameter(sticky, "sticky");
        return new SelectCancelReasonDTO(cancelReasons, input, disclaimer, sticky, state, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectCancelReasonDTO)) {
            return false;
        }
        SelectCancelReasonDTO selectCancelReasonDTO = (SelectCancelReasonDTO) other;
        return Intrinsics.d(this.cancelReasons, selectCancelReasonDTO.cancelReasons) && Intrinsics.d(this.input, selectCancelReasonDTO.input) && Intrinsics.d(this.disclaimer, selectCancelReasonDTO.disclaimer) && Intrinsics.d(this.sticky, selectCancelReasonDTO.sticky) && Intrinsics.d(this.state, selectCancelReasonDTO.state) && Intrinsics.d(this.testInfo, selectCancelReasonDTO.testInfo);
    }

    @NotNull
    public final List<CellDTO> getCancelReasons() {
        return this.cancelReasons;
    }

    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    public final InputDTO getInput() {
        return this.input;
    }

    public final String getState() {
        return this.state;
    }

    @NotNull
    public final StickyDTO getSticky() {
        return this.sticky;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public int hashCode() {
        int hashCode = this.cancelReasons.hashCode() * 31;
        InputDTO inputDTO = this.input;
        int hashCode2 = (hashCode + (inputDTO == null ? 0 : inputDTO.hashCode())) * 31;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        int hashCode3 = (this.sticky.hashCode() + ((hashCode2 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31)) * 31;
        String str = this.state;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SelectCancelReasonDTO(cancelReasons=" + this.cancelReasons + ", input=" + this.input + ", disclaimer=" + this.disclaimer + ", sticky=" + this.sticky + ", state=" + this.state + ", testInfo=" + this.testInfo + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$StickyDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "caption", "Lru/ozon/uni/atoms/data/text/TextDTO;", "state", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCaption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getState", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyDTO {

        @NotNull
        private final ButtonV3DTO button;
        private final TextDTO caption;
        private final CellDTO cell;
        private final transient String state;

        public StickyDTO(CellDTO cellDTO, @NotNull ButtonV3DTO button, TextDTO textDTO, String str) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.cell = cellDTO;
            this.button = button;
            this.caption = textDTO;
            this.state = str;
        }

        public static /* synthetic */ StickyDTO copy$default(StickyDTO stickyDTO, CellDTO cellDTO, ButtonV3DTO buttonV3DTO, TextDTO textDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = stickyDTO.cell;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = stickyDTO.button;
            }
            if ((i11 & 4) != 0) {
                textDTO = stickyDTO.caption;
            }
            if ((i11 & 8) != 0) {
                str = stickyDTO.state;
            }
            return stickyDTO.copy(cellDTO, buttonV3DTO, textDTO, str);
        }

        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getCaption() {
            return this.caption;
        }

        /* renamed from: component4, reason: from getter */
        public final String getState() {
            return this.state;
        }

        @NotNull
        public final StickyDTO copy(CellDTO cell, @NotNull ButtonV3DTO button, TextDTO caption, String state) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new StickyDTO(cell, button, caption, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickyDTO)) {
                return false;
            }
            StickyDTO stickyDTO = (StickyDTO) other;
            return Intrinsics.d(this.cell, stickyDTO.cell) && Intrinsics.d(this.button, stickyDTO.button) && Intrinsics.d(this.caption, stickyDTO.caption) && Intrinsics.d(this.state, stickyDTO.state);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final TextDTO getCaption() {
            return this.caption;
        }

        public final CellDTO getCell() {
            return this.cell;
        }

        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            CellDTO cellDTO = this.cell;
            int c11 = C2859b.c(this.button, (cellDTO == null ? 0 : cellDTO.hashCode()) * 31, 31);
            TextDTO textDTO = this.caption;
            int hashCode = (c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            String str = this.state;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "StickyDTO(cell=" + this.cell + ", button=" + this.button + ", caption=" + this.caption + ", state=" + this.state + ")";
        }

        public /* synthetic */ StickyDTO(CellDTO cellDTO, ButtonV3DTO buttonV3DTO, TextDTO textDTO, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(cellDTO, buttonV3DTO, textDTO, (i11 & 8) != 0 ? null : str);
        }
    }
}
