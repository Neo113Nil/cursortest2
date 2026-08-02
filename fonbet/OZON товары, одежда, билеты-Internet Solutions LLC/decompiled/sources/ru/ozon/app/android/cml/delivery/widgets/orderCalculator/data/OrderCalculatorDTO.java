package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.data;

import De.C2859b;
import G.g;
import Nh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.data.BoxCardDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002./BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO;", "", "regions", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$RegionsDTO;", "boxList", "", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/data/BoxCardDTO;", "infoText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "createOrderButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "topPatchColor", "", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$RegionsDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getRegions", "()Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$RegionsDTO;", "getBoxList", "()Ljava/util/List;", "getInfoText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCreateOrderButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTopPatchColor", "()Ljava/lang/String;", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "RegionsDTO", "TextFieldDTO", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderCalculatorDTO {
    private final String backgroundColor;

    @NotNull
    private final List<BoxCardDTO> boxList;

    @NotNull
    private final ButtonV3DTO createOrderButton;
    private final TextDTO infoText;

    @NotNull
    private final RegionsDTO regions;
    private final String topPatchColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$RegionsDTO;", "", "source", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$TextFieldDTO;", "destination", "swapButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$TextFieldDTO;Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$TextFieldDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getSource", "()Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$TextFieldDTO;", "getDestination", "getSwapButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegionsDTO {

        @NotNull
        private final TextFieldDTO destination;

        @NotNull
        private final TextFieldDTO source;

        @NotNull
        private final IconButtonV3DTO swapButton;

        public RegionsDTO(@NotNull TextFieldDTO source, @NotNull TextFieldDTO destination, @NotNull IconButtonV3DTO swapButton) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(swapButton, "swapButton");
            this.source = source;
            this.destination = destination;
            this.swapButton = swapButton;
        }

        public static /* synthetic */ RegionsDTO copy$default(RegionsDTO regionsDTO, TextFieldDTO textFieldDTO, TextFieldDTO textFieldDTO2, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textFieldDTO = regionsDTO.source;
            }
            if ((i11 & 2) != 0) {
                textFieldDTO2 = regionsDTO.destination;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = regionsDTO.swapButton;
            }
            return regionsDTO.copy(textFieldDTO, textFieldDTO2, iconButtonV3DTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextFieldDTO getSource() {
            return this.source;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextFieldDTO getDestination() {
            return this.destination;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getSwapButton() {
            return this.swapButton;
        }

        @NotNull
        public final RegionsDTO copy(@NotNull TextFieldDTO source, @NotNull TextFieldDTO destination, @NotNull IconButtonV3DTO swapButton) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(swapButton, "swapButton");
            return new RegionsDTO(source, destination, swapButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RegionsDTO)) {
                return false;
            }
            RegionsDTO regionsDTO = (RegionsDTO) other;
            return Intrinsics.d(this.source, regionsDTO.source) && Intrinsics.d(this.destination, regionsDTO.destination) && Intrinsics.d(this.swapButton, regionsDTO.swapButton);
        }

        @NotNull
        public final TextFieldDTO getDestination() {
            return this.destination;
        }

        @NotNull
        public final TextFieldDTO getSource() {
            return this.source;
        }

        @NotNull
        public final IconButtonV3DTO getSwapButton() {
            return this.swapButton;
        }

        public int hashCode() {
            return this.swapButton.hashCode() + ((this.destination.hashCode() + (this.source.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "RegionsDTO(source=" + this.source + ", destination=" + this.destination + ", swapButton=" + this.swapButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$TextFieldDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextFieldDTO {

        @NotNull
        private final CommonControlSettings commonControlSettings;

        @NotNull
        private final TextDTO text;

        public TextFieldDTO(@NotNull TextDTO text, @NotNull CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
            this.text = text;
            this.commonControlSettings = commonControlSettings;
        }

        public static /* synthetic */ TextFieldDTO copy$default(TextFieldDTO textFieldDTO, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = textFieldDTO.text;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = textFieldDTO.commonControlSettings;
            }
            return textFieldDTO.copy(textDTO, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        @NotNull
        public final TextFieldDTO copy(@NotNull TextDTO text, @NotNull CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
            return new TextFieldDTO(text, commonControlSettings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextFieldDTO)) {
                return false;
            }
            TextFieldDTO textFieldDTO = (TextFieldDTO) other;
            return Intrinsics.d(this.text, textFieldDTO.text) && Intrinsics.d(this.commonControlSettings, textFieldDTO.commonControlSettings);
        }

        @NotNull
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.commonControlSettings.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TextFieldDTO(text=" + this.text + ", commonControlSettings=" + this.commonControlSettings + ")";
        }
    }

    public OrderCalculatorDTO(@NotNull RegionsDTO regions, @NotNull List<BoxCardDTO> boxList, TextDTO textDTO, @NotNull ButtonV3DTO createOrderButton, String str, String str2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(regions, "regions");
        Intrinsics.checkNotNullParameter(boxList, "boxList");
        Intrinsics.checkNotNullParameter(createOrderButton, "createOrderButton");
        this.regions = regions;
        this.boxList = boxList;
        this.infoText = textDTO;
        this.createOrderButton = createOrderButton;
        this.topPatchColor = str;
        this.backgroundColor = str2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ OrderCalculatorDTO copy$default(OrderCalculatorDTO orderCalculatorDTO, RegionsDTO regionsDTO, List list, TextDTO textDTO, ButtonV3DTO buttonV3DTO, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            regionsDTO = orderCalculatorDTO.regions;
        }
        if ((i11 & 2) != 0) {
            list = orderCalculatorDTO.boxList;
        }
        if ((i11 & 4) != 0) {
            textDTO = orderCalculatorDTO.infoText;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = orderCalculatorDTO.createOrderButton;
        }
        if ((i11 & 16) != 0) {
            str = orderCalculatorDTO.topPatchColor;
        }
        if ((i11 & 32) != 0) {
            str2 = orderCalculatorDTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            map = orderCalculatorDTO.trackingInfo;
        }
        String str3 = str2;
        Map map2 = map;
        String str4 = str;
        TextDTO textDTO2 = textDTO;
        return orderCalculatorDTO.copy(regionsDTO, list, textDTO2, buttonV3DTO, str4, str3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RegionsDTO getRegions() {
        return this.regions;
    }

    @NotNull
    public final List<BoxCardDTO> component2() {
        return this.boxList;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getInfoText() {
        return this.infoText;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getCreateOrderButton() {
        return this.createOrderButton;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTopPatchColor() {
        return this.topPatchColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final OrderCalculatorDTO copy(@NotNull RegionsDTO regions, @NotNull List<BoxCardDTO> boxList, TextDTO infoText, @NotNull ButtonV3DTO createOrderButton, String topPatchColor, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(regions, "regions");
        Intrinsics.checkNotNullParameter(boxList, "boxList");
        Intrinsics.checkNotNullParameter(createOrderButton, "createOrderButton");
        return new OrderCalculatorDTO(regions, boxList, infoText, createOrderButton, topPatchColor, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderCalculatorDTO)) {
            return false;
        }
        OrderCalculatorDTO orderCalculatorDTO = (OrderCalculatorDTO) other;
        return Intrinsics.d(this.regions, orderCalculatorDTO.regions) && Intrinsics.d(this.boxList, orderCalculatorDTO.boxList) && Intrinsics.d(this.infoText, orderCalculatorDTO.infoText) && Intrinsics.d(this.createOrderButton, orderCalculatorDTO.createOrderButton) && Intrinsics.d(this.topPatchColor, orderCalculatorDTO.topPatchColor) && Intrinsics.d(this.backgroundColor, orderCalculatorDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, orderCalculatorDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<BoxCardDTO> getBoxList() {
        return this.boxList;
    }

    @NotNull
    public final ButtonV3DTO getCreateOrderButton() {
        return this.createOrderButton;
    }

    public final TextDTO getInfoText() {
        return this.infoText;
    }

    @NotNull
    public final RegionsDTO getRegions() {
        return this.regions;
    }

    public final String getTopPatchColor() {
        return this.topPatchColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.regions.hashCode() * 31, 31, this.boxList);
        TextDTO textDTO = this.infoText;
        int c11 = C2859b.c(this.createOrderButton, (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        String str = this.topPatchColor;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        RegionsDTO regionsDTO = this.regions;
        List<BoxCardDTO> list = this.boxList;
        TextDTO textDTO = this.infoText;
        ButtonV3DTO buttonV3DTO = this.createOrderButton;
        String str = this.topPatchColor;
        String str2 = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("OrderCalculatorDTO(regions=");
        sb2.append(regionsDTO);
        sb2.append(", boxList=");
        sb2.append(list);
        sb2.append(", infoText=");
        sb2.append(textDTO);
        sb2.append(", createOrderButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", topPatchColor=");
        a.h(sb2, str, ", backgroundColor=", str2, ", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
