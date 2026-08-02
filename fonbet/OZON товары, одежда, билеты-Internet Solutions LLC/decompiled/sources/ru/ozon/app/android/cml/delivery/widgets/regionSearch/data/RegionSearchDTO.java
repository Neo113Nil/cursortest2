package ru.ozon.app.android.cml.delivery.widgets.regionSearch.data;

import Ak.b;
import Co.a;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/regionSearch/data/RegionSearchDTO;", "", "backgroundColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "input", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/data/RegionSearchDTO$TextFieldDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cml/delivery/widgets/regionSearch/data/RegionSearchDTO$TextFieldDTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getInput", "()Lru/ozon/app/android/cml/delivery/widgets/regionSearch/data/RegionSearchDTO$TextFieldDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "TextFieldDTO", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RegionSearchDTO {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final TextFieldDTO input;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/regionSearch/data/RegionSearchDTO$TextFieldDTO;", "", "label", "", "inputDelay", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getLabel", "()Ljava/lang/String;", "getInputDelay", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextFieldDTO {

        @NotNull
        private final CommonControlSettings commonControlSettings;
        private final String inputDelay;

        @NotNull
        private final String label;

        public TextFieldDTO(@NotNull String label, String str, @NotNull CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
            this.label = label;
            this.inputDelay = str;
            this.commonControlSettings = commonControlSettings;
        }

        public static /* synthetic */ TextFieldDTO copy$default(TextFieldDTO textFieldDTO, String str, String str2, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textFieldDTO.label;
            }
            if ((i11 & 2) != 0) {
                str2 = textFieldDTO.inputDelay;
            }
            if ((i11 & 4) != 0) {
                commonControlSettings = textFieldDTO.commonControlSettings;
            }
            return textFieldDTO.copy(str, str2, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInputDelay() {
            return this.inputDelay;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        @NotNull
        public final TextFieldDTO copy(@NotNull String label, String inputDelay, @NotNull CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
            return new TextFieldDTO(label, inputDelay, commonControlSettings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextFieldDTO)) {
                return false;
            }
            TextFieldDTO textFieldDTO = (TextFieldDTO) other;
            return Intrinsics.d(this.label, textFieldDTO.label) && Intrinsics.d(this.inputDelay, textFieldDTO.inputDelay) && Intrinsics.d(this.commonControlSettings, textFieldDTO.commonControlSettings);
        }

        @NotNull
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        public final String getInputDelay() {
            return this.inputDelay;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int hashCode = this.label.hashCode() * 31;
            String str = this.inputDelay;
            return this.commonControlSettings.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.label;
            String str2 = this.inputDelay;
            return b.g(C3660k.d("TextFieldDTO(label=", str, ", inputDelay=", str2, ", commonControlSettings="), this.commonControlSettings, ")");
        }
    }

    public RegionSearchDTO(@NotNull String backgroundColor, @NotNull TextDTO title, @NotNull TextFieldDTO input, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.input = input;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegionSearchDTO copy$default(RegionSearchDTO regionSearchDTO, String str, TextDTO textDTO, TextFieldDTO textFieldDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = regionSearchDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            textDTO = regionSearchDTO.title;
        }
        if ((i11 & 4) != 0) {
            textFieldDTO = regionSearchDTO.input;
        }
        if ((i11 & 8) != 0) {
            map = regionSearchDTO.trackingInfo;
        }
        return regionSearchDTO.copy(str, textDTO, textFieldDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextFieldDTO getInput() {
        return this.input;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final RegionSearchDTO copy(@NotNull String backgroundColor, @NotNull TextDTO title, @NotNull TextFieldDTO input, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        return new RegionSearchDTO(backgroundColor, title, input, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionSearchDTO)) {
            return false;
        }
        RegionSearchDTO regionSearchDTO = (RegionSearchDTO) other;
        return Intrinsics.d(this.backgroundColor, regionSearchDTO.backgroundColor) && Intrinsics.d(this.title, regionSearchDTO.title) && Intrinsics.d(this.input, regionSearchDTO.input) && Intrinsics.d(this.trackingInfo, regionSearchDTO.trackingInfo);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TextFieldDTO getInput() {
        return this.input;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.input.hashCode() + Ns.b.a(this.title, this.backgroundColor.hashCode() * 31, 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        TextDTO textDTO = this.title;
        TextFieldDTO textFieldDTO = this.input;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = a.b("RegionSearchDTO(backgroundColor=", textDTO, str, ", title=", ", input=");
        b11.append(textFieldDTO);
        b11.append(", trackingInfo=");
        b11.append(map);
        b11.append(")");
        return b11.toString();
    }
}
