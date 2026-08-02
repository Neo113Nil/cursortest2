package ru.ozon.app.android.session.userAdultModalMobileV2.data.models;

import D3.g;
import De.C2859b;
import N3.C3660k;
import Ns.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "input", "Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO$Input;", "primaryButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "secondaryButton", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO$Input;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getInput", "()Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO$Input;", "getPrimaryButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondaryButton", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Input", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserAdultModalV2DTO {
    public static final int $stable = 8;
    private final Input input;

    @NotNull
    private final ButtonV3DTO primaryButton;
    private final ButtonV3DTO secondaryButton;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO$Input;", "", "label", "", "error", "prevValue", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;)V", "getLabel", "()Ljava/lang/String;", "getError", "getPrevValue", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = TestInfo.$stable;
        private final String error;

        @NotNull
        private final String label;
        private final String prevValue;
        private final TestInfo testInfo;

        public Input(@NotNull String label, String str, String str2, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
            this.error = str;
            this.prevValue = str2;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ Input copy$default(Input input, String str, String str2, String str3, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = input.label;
            }
            if ((i11 & 2) != 0) {
                str2 = input.error;
            }
            if ((i11 & 4) != 0) {
                str3 = input.prevValue;
            }
            if ((i11 & 8) != 0) {
                testInfo = input.testInfo;
            }
            return input.copy(str, str2, str3, testInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPrevValue() {
            return this.prevValue;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final Input copy(@NotNull String label, String error, String prevValue, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new Input(label, error, prevValue, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.label, input.label) && Intrinsics.d(this.error, input.error) && Intrinsics.d(this.prevValue, input.prevValue) && Intrinsics.d(this.testInfo, input.testInfo);
        }

        public final String getError() {
            return this.error;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        public final String getPrevValue() {
            return this.prevValue;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            int hashCode = this.label.hashCode() * 31;
            String str = this.error;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.prevValue;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.label;
            String str2 = this.error;
            String str3 = this.prevValue;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("Input(label=", str, ", error=", str2, ", prevValue=");
            d11.append(str3);
            d11.append(", testInfo=");
            d11.append(testInfo);
            d11.append(")");
            return d11.toString();
        }
    }

    public UserAdultModalV2DTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, Input input, @NotNull ButtonV3DTO primaryButton, ButtonV3DTO buttonV3DTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.title = title;
        this.subtitle = subtitle;
        this.input = input;
        this.primaryButton = primaryButton;
        this.secondaryButton = buttonV3DTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ UserAdultModalV2DTO copy$default(UserAdultModalV2DTO userAdultModalV2DTO, TextDTO textDTO, TextDTO textDTO2, Input input, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = userAdultModalV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = userAdultModalV2DTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            input = userAdultModalV2DTO.input;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = userAdultModalV2DTO.primaryButton;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO2 = userAdultModalV2DTO.secondaryButton;
        }
        if ((i11 & 32) != 0) {
            map = userAdultModalV2DTO.trackingInfo;
        }
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
        Map map2 = map;
        return userAdultModalV2DTO.copy(textDTO, textDTO2, input, buttonV3DTO, buttonV3DTO3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getSecondaryButton() {
        return this.secondaryButton;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final UserAdultModalV2DTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, Input input, @NotNull ButtonV3DTO primaryButton, ButtonV3DTO secondaryButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        return new UserAdultModalV2DTO(title, subtitle, input, primaryButton, secondaryButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAdultModalV2DTO)) {
            return false;
        }
        UserAdultModalV2DTO userAdultModalV2DTO = (UserAdultModalV2DTO) other;
        return Intrinsics.d(this.title, userAdultModalV2DTO.title) && Intrinsics.d(this.subtitle, userAdultModalV2DTO.subtitle) && Intrinsics.d(this.input, userAdultModalV2DTO.input) && Intrinsics.d(this.primaryButton, userAdultModalV2DTO.primaryButton) && Intrinsics.d(this.secondaryButton, userAdultModalV2DTO.secondaryButton) && Intrinsics.d(this.trackingInfo, userAdultModalV2DTO.trackingInfo);
    }

    public final Input getInput() {
        return this.input;
    }

    @NotNull
    public final ButtonV3DTO getPrimaryButton() {
        return this.primaryButton;
    }

    public final ButtonV3DTO getSecondaryButton() {
        return this.secondaryButton;
    }

    @NotNull
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
        int a11 = b.a(this.subtitle, this.title.hashCode() * 31, 31);
        Input input = this.input;
        int c11 = C2859b.c(this.primaryButton, (a11 + (input == null ? 0 : input.hashCode())) * 31, 31);
        ButtonV3DTO buttonV3DTO = this.secondaryButton;
        int hashCode = (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        Input input = this.input;
        ButtonV3DTO buttonV3DTO = this.primaryButton;
        ButtonV3DTO buttonV3DTO2 = this.secondaryButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("UserAdultModalV2DTO(title=", textDTO, ", subtitle=", textDTO2, ", input=");
        g10.append(input);
        g10.append(", primaryButton=");
        g10.append(buttonV3DTO);
        g10.append(", secondaryButton=");
        g10.append(buttonV3DTO2);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
