package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.data;

import N3.C3660k;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003234Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0013\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u007f\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00065"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO;", "", "state", "", "changeEmail", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ChangeEmailInputDTO;", "inputs", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$InputDTO;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "buttons", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ButtonDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ChangeEmailInputDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;)V", "getState", "()Ljava/lang/String;", "getChangeEmail", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ChangeEmailInputDTO;", "getInputs", "()Ljava/util/List;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getButtons", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "ChangeEmailInputDTO", "InputDTO", "ButtonDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChangeEmailDTO {
    public static final int $stable = 8;
    private final List<ButtonDTO> buttons;
    private final CellDTO cell;
    private final ChangeEmailInputDTO changeEmail;
    private final List<InputDTO> inputs;

    @NotNull
    private final String state;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", DynamicElementDTO.TIMER, "", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Integer;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTimer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Integer;)Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ButtonDTO;", "equals", "", "other", "hashCode", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonDTO {
        public static final int $stable = 0;

        @NotNull
        private final ButtonV3DTO button;
        private final Integer timer;

        public ButtonDTO(@NotNull ButtonV3DTO button, Integer num) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.timer = num;
        }

        public static /* synthetic */ ButtonDTO copy$default(ButtonDTO buttonDTO, ButtonV3DTO buttonV3DTO, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = buttonDTO.button;
            }
            if ((i11 & 2) != 0) {
                num = buttonDTO.timer;
            }
            return buttonDTO.copy(buttonV3DTO, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getTimer() {
            return this.timer;
        }

        @NotNull
        public final ButtonDTO copy(@NotNull ButtonV3DTO button, Integer timer) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new ButtonDTO(button, timer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonDTO)) {
                return false;
            }
            ButtonDTO buttonDTO = (ButtonDTO) other;
            return Intrinsics.d(this.button, buttonDTO.button) && Intrinsics.d(this.timer, buttonDTO.timer);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final Integer getTimer() {
            return this.timer;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            Integer num = this.timer;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "ButtonDTO(button=" + this.button + ", timer=" + this.timer + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ChangeEmailInputDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangeEmailInputDTO {
        public static final int $stable = 0;
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO title;

        public ChangeEmailInputDTO(@NotNull TextDTO title, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ ChangeEmailInputDTO copy$default(ChangeEmailInputDTO changeEmailInputDTO, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = changeEmailInputDTO.title;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = changeEmailInputDTO.common;
            }
            return changeEmailInputDTO.copy(textDTO, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final ChangeEmailInputDTO copy(@NotNull TextDTO title, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new ChangeEmailInputDTO(title, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeEmailInputDTO)) {
                return false;
            }
            ChangeEmailInputDTO changeEmailInputDTO = (ChangeEmailInputDTO) other;
            return Intrinsics.d(this.title, changeEmailInputDTO.title) && Intrinsics.d(this.common, changeEmailInputDTO.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            return "ChangeEmailInputDTO(title=" + this.title + ", common=" + this.common + ")";
        }
    }

    public ChangeEmailDTO(@NotNull String state, ChangeEmailInputDTO changeEmailInputDTO, List<InputDTO> list, CellDTO cellDTO, List<ButtonDTO> list2, @NotNull TextDTO title, TextDTO textDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        this.state = state;
        this.changeEmail = changeEmailInputDTO;
        this.inputs = list;
        this.cell = cellDTO;
        this.buttons = list2;
        this.title = title;
        this.subtitle = textDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ChangeEmailDTO copy$default(ChangeEmailDTO changeEmailDTO, String str, ChangeEmailInputDTO changeEmailInputDTO, List list, CellDTO cellDTO, List list2, TextDTO textDTO, TextDTO textDTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = changeEmailDTO.state;
        }
        if ((i11 & 2) != 0) {
            changeEmailInputDTO = changeEmailDTO.changeEmail;
        }
        if ((i11 & 4) != 0) {
            list = changeEmailDTO.inputs;
        }
        if ((i11 & 8) != 0) {
            cellDTO = changeEmailDTO.cell;
        }
        if ((i11 & 16) != 0) {
            list2 = changeEmailDTO.buttons;
        }
        if ((i11 & 32) != 0) {
            textDTO = changeEmailDTO.title;
        }
        if ((i11 & 64) != 0) {
            textDTO2 = changeEmailDTO.subtitle;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = changeEmailDTO.trackingInfo;
        }
        TextDTO textDTO3 = textDTO2;
        Map map2 = map;
        List list3 = list2;
        TextDTO textDTO4 = textDTO;
        return changeEmailDTO.copy(str, changeEmailInputDTO, list, cellDTO, list3, textDTO4, textDTO3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final ChangeEmailInputDTO getChangeEmail() {
        return this.changeEmail;
    }

    public final List<InputDTO> component3() {
        return this.inputs;
    }

    /* renamed from: component4, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    public final List<ButtonDTO> component5() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component7, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final ChangeEmailDTO copy(@NotNull String state, ChangeEmailInputDTO changeEmail, List<InputDTO> inputs, CellDTO cell, List<ButtonDTO> buttons, @NotNull TextDTO title, TextDTO subtitle, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ChangeEmailDTO(state, changeEmail, inputs, cell, buttons, title, subtitle, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeEmailDTO)) {
            return false;
        }
        ChangeEmailDTO changeEmailDTO = (ChangeEmailDTO) other;
        return Intrinsics.d(this.state, changeEmailDTO.state) && Intrinsics.d(this.changeEmail, changeEmailDTO.changeEmail) && Intrinsics.d(this.inputs, changeEmailDTO.inputs) && Intrinsics.d(this.cell, changeEmailDTO.cell) && Intrinsics.d(this.buttons, changeEmailDTO.buttons) && Intrinsics.d(this.title, changeEmailDTO.title) && Intrinsics.d(this.subtitle, changeEmailDTO.subtitle) && Intrinsics.d(this.trackingInfo, changeEmailDTO.trackingInfo);
    }

    public final List<ButtonDTO> getButtons() {
        return this.buttons;
    }

    public final CellDTO getCell() {
        return this.cell;
    }

    public final ChangeEmailInputDTO getChangeEmail() {
        return this.changeEmail;
    }

    public final List<InputDTO> getInputs() {
        return this.inputs;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        ChangeEmailInputDTO changeEmailInputDTO = this.changeEmail;
        int hashCode2 = (hashCode + (changeEmailInputDTO == null ? 0 : changeEmailInputDTO.hashCode())) * 31;
        List<InputDTO> list = this.inputs;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CellDTO cellDTO = this.cell;
        int hashCode4 = (hashCode3 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        List<ButtonDTO> list2 = this.buttons;
        int a11 = b.a(this.title, (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode5 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChangeEmailDTO(state=" + this.state + ", changeEmail=" + this.changeEmail + ", inputs=" + this.inputs + ", cell=" + this.cell + ", buttons=" + this.buttons + ", title=" + this.title + ", subtitle=" + this.subtitle + ", trackingInfo=" + this.trackingInfo + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003Jj\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$InputDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/uni/atoms/data/text/TextDTO;", "required", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "maskOtp", "lexemes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getValue", "getPlaceholder", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getMaskOtp", "getLexemes", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$InputDTO;", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputDTO {
        public static final int $stable = 8;
        private final CommonControlSettings common;
        private final Map<String, String> lexemes;
        private final String maskOtp;

        @NotNull
        private final String name;

        @NotNull
        private final TextDTO placeholder;
        private final Boolean required;
        private final String value;

        public InputDTO(@NotNull String name, String str, @NotNull TextDTO placeholder, Boolean bool, CommonControlSettings commonControlSettings, String str2, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.name = name;
            this.value = str;
            this.placeholder = placeholder;
            this.required = bool;
            this.common = commonControlSettings;
            this.maskOtp = str2;
            this.lexemes = map;
        }

        public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, TextDTO textDTO, Boolean bool, CommonControlSettings commonControlSettings, String str3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputDTO.name;
            }
            if ((i11 & 2) != 0) {
                str2 = inputDTO.value;
            }
            if ((i11 & 4) != 0) {
                textDTO = inputDTO.placeholder;
            }
            if ((i11 & 8) != 0) {
                bool = inputDTO.required;
            }
            if ((i11 & 16) != 0) {
                commonControlSettings = inputDTO.common;
            }
            if ((i11 & 32) != 0) {
                str3 = inputDTO.maskOtp;
            }
            if ((i11 & 64) != 0) {
                map = inputDTO.lexemes;
            }
            String str4 = str3;
            Map map2 = map;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            TextDTO textDTO2 = textDTO;
            return inputDTO.copy(str, str2, textDTO2, bool, commonControlSettings2, str4, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getRequired() {
            return this.required;
        }

        /* renamed from: component5, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMaskOtp() {
            return this.maskOtp;
        }

        public final Map<String, String> component7() {
            return this.lexemes;
        }

        @NotNull
        public final InputDTO copy(@NotNull String name, String value, @NotNull TextDTO placeholder, Boolean required, CommonControlSettings common, String maskOtp, Map<String, String> lexemes) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new InputDTO(name, value, placeholder, required, common, maskOtp, lexemes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputDTO)) {
                return false;
            }
            InputDTO inputDTO = (InputDTO) other;
            return Intrinsics.d(this.name, inputDTO.name) && Intrinsics.d(this.value, inputDTO.value) && Intrinsics.d(this.placeholder, inputDTO.placeholder) && Intrinsics.d(this.required, inputDTO.required) && Intrinsics.d(this.common, inputDTO.common) && Intrinsics.d(this.maskOtp, inputDTO.maskOtp) && Intrinsics.d(this.lexemes, inputDTO.lexemes);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final Map<String, String> getLexemes() {
            return this.lexemes;
        }

        public final String getMaskOtp() {
            return this.maskOtp;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final TextDTO getPlaceholder() {
            return this.placeholder;
        }

        public final Boolean getRequired() {
            return this.required;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.value;
            int a11 = b.a(this.placeholder, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            Boolean bool = this.required;
            int hashCode2 = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            int hashCode3 = (hashCode2 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            String str2 = this.maskOtp;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, String> map = this.lexemes;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.value;
            TextDTO textDTO = this.placeholder;
            Boolean bool = this.required;
            CommonControlSettings commonControlSettings = this.common;
            String str3 = this.maskOtp;
            Map<String, String> map = this.lexemes;
            StringBuilder d11 = C3660k.d("InputDTO(name=", str, ", value=", str2, ", placeholder=");
            d11.append(textDTO);
            d11.append(", required=");
            d11.append(bool);
            d11.append(", common=");
            d11.append(commonControlSettings);
            d11.append(", maskOtp=");
            d11.append(str3);
            d11.append(", lexemes=");
            return P.f(d11, map, ")");
        }

        public /* synthetic */ InputDTO(String str, String str2, TextDTO textDTO, Boolean bool, CommonControlSettings commonControlSettings, String str3, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, textDTO, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : commonControlSettings, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : map);
        }
    }

    public /* synthetic */ ChangeEmailDTO(String str, ChangeEmailInputDTO changeEmailInputDTO, List list, CellDTO cellDTO, List list2, TextDTO textDTO, TextDTO textDTO2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, changeEmailInputDTO, list, cellDTO, (i11 & 16) != 0 ? null : list2, textDTO, textDTO2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map);
    }
}
