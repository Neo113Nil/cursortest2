package ru.ozon.app.android.pdp.widgets.wholesaleInputButton.data;

import G.g;
import K00.b;
import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/data/WholesaleInputButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "textInput", "Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/data/WholesaleInputButtonDTO$TextInput;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/data/WholesaleInputButtonDTO$TextInput;Ljava/util/Map;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTextInput", "()Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/data/WholesaleInputButtonDTO$TextInput;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "TextInput", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WholesaleInputButtonDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final TextInput textInput;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/data/WholesaleInputButtonDTO$TextInput;", "", "errorText", "", "hintText", "minCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getErrorText", "()Ljava/lang/String;", "getHintText", "getMinCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextInput {
        public static final int $stable = 0;

        @NotNull
        private final String errorText;

        @NotNull
        private final String hintText;
        private final int minCount;

        public TextInput(@NotNull String errorText, @NotNull String hintText, int i11) {
            Intrinsics.checkNotNullParameter(errorText, "errorText");
            Intrinsics.checkNotNullParameter(hintText, "hintText");
            this.errorText = errorText;
            this.hintText = hintText;
            this.minCount = i11;
        }

        public static /* synthetic */ TextInput copy$default(TextInput textInput, String str, String str2, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = textInput.errorText;
            }
            if ((i12 & 2) != 0) {
                str2 = textInput.hintText;
            }
            if ((i12 & 4) != 0) {
                i11 = textInput.minCount;
            }
            return textInput.copy(str, str2, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getErrorText() {
            return this.errorText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getHintText() {
            return this.hintText;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMinCount() {
            return this.minCount;
        }

        @NotNull
        public final TextInput copy(@NotNull String errorText, @NotNull String hintText, int minCount) {
            Intrinsics.checkNotNullParameter(errorText, "errorText");
            Intrinsics.checkNotNullParameter(hintText, "hintText");
            return new TextInput(errorText, hintText, minCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextInput)) {
                return false;
            }
            TextInput textInput = (TextInput) other;
            return Intrinsics.d(this.errorText, textInput.errorText) && Intrinsics.d(this.hintText, textInput.hintText) && this.minCount == textInput.minCount;
        }

        @NotNull
        public final String getErrorText() {
            return this.errorText;
        }

        @NotNull
        public final String getHintText() {
            return this.hintText;
        }

        public final int getMinCount() {
            return this.minCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.minCount) + g.a(this.errorText.hashCode() * 31, 31, this.hintText);
        }

        @NotNull
        public String toString() {
            return b.e(this.minCount, ")", C3660k.d("TextInput(errorText=", this.errorText, ", hintText=", this.hintText, ", minCount="));
        }
    }

    public WholesaleInputButtonDTO(@NotNull ButtonV3DTO button, @NotNull TextInput textInput, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(textInput, "textInput");
        this.button = button;
        this.textInput = textInput;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WholesaleInputButtonDTO copy$default(WholesaleInputButtonDTO wholesaleInputButtonDTO, ButtonV3DTO buttonV3DTO, TextInput textInput, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = wholesaleInputButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            textInput = wholesaleInputButtonDTO.textInput;
        }
        if ((i11 & 4) != 0) {
            map = wholesaleInputButtonDTO.trackingInfo;
        }
        return wholesaleInputButtonDTO.copy(buttonV3DTO, textInput, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextInput getTextInput() {
        return this.textInput;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final WholesaleInputButtonDTO copy(@NotNull ButtonV3DTO button, @NotNull TextInput textInput, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(textInput, "textInput");
        return new WholesaleInputButtonDTO(button, textInput, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WholesaleInputButtonDTO)) {
            return false;
        }
        WholesaleInputButtonDTO wholesaleInputButtonDTO = (WholesaleInputButtonDTO) other;
        return Intrinsics.d(this.button, wholesaleInputButtonDTO.button) && Intrinsics.d(this.textInput, wholesaleInputButtonDTO.textInput) && Intrinsics.d(this.trackingInfo, wholesaleInputButtonDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final TextInput getTextInput() {
        return this.textInput;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.textInput.hashCode() + (this.button.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        ButtonV3DTO buttonV3DTO = this.button;
        TextInput textInput = this.textInput;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("WholesaleInputButtonDTO(button=");
        sb2.append(buttonV3DTO);
        sb2.append(", textInput=");
        sb2.append(textInput);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
