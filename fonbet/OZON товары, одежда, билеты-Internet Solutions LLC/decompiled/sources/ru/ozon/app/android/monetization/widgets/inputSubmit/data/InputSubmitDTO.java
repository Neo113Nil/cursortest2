package ru.ozon.app.android.monetization.widgets.inputSubmit.data;

import C.o0;
import De.C2859b;
import G.g;
import N3.C3660k;
import Ns.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitDTO;", "", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitDTO$TextArea;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitDTO$TextArea;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getTextArea", "()Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitDTO$TextArea;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "TextArea", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InputSubmitDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;
    private final TestInfo testInfo;

    @NotNull
    private final TextArea textArea;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitDTO$TextArea;", "", "uploadKey", "", HammersV3BodyDTO.PLACEHOLDER, "errorRequiredText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUploadKey", "()Ljava/lang/String;", "getPlaceholder", "getErrorRequiredText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextArea {
        public static final int $stable = 0;

        @NotNull
        private final String errorRequiredText;

        @NotNull
        private final String placeholder;

        @NotNull
        private final String uploadKey;

        public TextArea(@NotNull String uploadKey, @NotNull String placeholder, @NotNull String errorRequiredText) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            this.uploadKey = uploadKey;
            this.placeholder = placeholder;
            this.errorRequiredText = errorRequiredText;
        }

        public static /* synthetic */ TextArea copy$default(TextArea textArea, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textArea.uploadKey;
            }
            if ((i11 & 2) != 0) {
                str2 = textArea.placeholder;
            }
            if ((i11 & 4) != 0) {
                str3 = textArea.errorRequiredText;
            }
            return textArea.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadKey() {
            return this.uploadKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        @NotNull
        public final TextArea copy(@NotNull String uploadKey, @NotNull String placeholder, @NotNull String errorRequiredText) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            return new TextArea(uploadKey, placeholder, errorRequiredText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextArea)) {
                return false;
            }
            TextArea textArea = (TextArea) other;
            return Intrinsics.d(this.uploadKey, textArea.uploadKey) && Intrinsics.d(this.placeholder, textArea.placeholder) && Intrinsics.d(this.errorRequiredText, textArea.errorRequiredText);
        }

        @NotNull
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            return this.errorRequiredText.hashCode() + g.a(this.uploadKey.hashCode() * 31, 31, this.placeholder);
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            String str2 = this.placeholder;
            return o0.c(C3660k.d("TextArea(uploadKey=", str, ", placeholder=", str2, ", errorRequiredText="), this.errorRequiredText, ")");
        }
    }

    public InputSubmitDTO(@NotNull TextArea textArea, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(button, "button");
        this.textArea = textArea;
        this.button = button;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputSubmitDTO copy$default(InputSubmitDTO inputSubmitDTO, TextArea textArea, ButtonV3DTO buttonV3DTO, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textArea = inputSubmitDTO.textArea;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = inputSubmitDTO.button;
        }
        if ((i11 & 4) != 0) {
            map = inputSubmitDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            testInfo = inputSubmitDTO.testInfo;
        }
        return inputSubmitDTO.copy(textArea, buttonV3DTO, map, testInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextArea getTextArea() {
        return this.textArea;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final InputSubmitDTO copy(@NotNull TextArea textArea, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(button, "button");
        return new InputSubmitDTO(textArea, button, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputSubmitDTO)) {
            return false;
        }
        InputSubmitDTO inputSubmitDTO = (InputSubmitDTO) other;
        return Intrinsics.d(this.textArea, inputSubmitDTO.textArea) && Intrinsics.d(this.button, inputSubmitDTO.button) && Intrinsics.d(this.trackingInfo, inputSubmitDTO.trackingInfo) && Intrinsics.d(this.testInfo, inputSubmitDTO.testInfo);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextArea getTextArea() {
        return this.textArea;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, this.textArea.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (c11 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextArea textArea = this.textArea;
        ButtonV3DTO buttonV3DTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("InputSubmitDTO(textArea=");
        sb2.append(textArea);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", trackingInfo=");
        return b.b(", testInfo=", ")", sb2, map, testInfo);
    }
}
