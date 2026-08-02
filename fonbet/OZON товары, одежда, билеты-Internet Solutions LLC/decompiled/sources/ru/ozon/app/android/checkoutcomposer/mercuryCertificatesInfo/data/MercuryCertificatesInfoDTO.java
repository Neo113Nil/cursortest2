package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.data;

import B0.A0;
import D3.g;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002,-BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003Jg\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "aspectList", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$AspectListDTO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "caption", "settings", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$SettingsDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$AspectListDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$SettingsDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAspectList", "()Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$AspectListDTO;", "getAddress", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCaption", "getSettings", "()Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$SettingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "AspectListDTO", "SettingsDTO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MercuryCertificatesInfoDTO {
    public static final int $stable = 8;
    private final CellDTO address;
    private final AspectListDTO aspectList;
    private final TextDTO caption;
    private final SettingsDTO settings;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$AspectListDTO;", "", "items", "", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$AspectListDTO$AspectItemDTO;", "selectedItemIndex", "", "<init>", "(Ljava/util/List;I)V", "getItems", "()Ljava/util/List;", "getSelectedItemIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "AspectItemDTO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AspectListDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<AspectItemDTO> items;
        private final int selectedItemIndex;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$AspectListDTO$AspectItemDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AspectItemDTO {
            public static final int $stable = 0;
            private final CommonControlSettings common;

            @NotNull
            private final TextDTO text;

            public AspectItemDTO(@NotNull TextDTO text, CommonControlSettings commonControlSettings) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.common = commonControlSettings;
            }

            public static /* synthetic */ AspectItemDTO copy$default(AspectItemDTO aspectItemDTO, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = aspectItemDTO.text;
                }
                if ((i11 & 2) != 0) {
                    commonControlSettings = aspectItemDTO.common;
                }
                return aspectItemDTO.copy(textDTO, commonControlSettings);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final CommonControlSettings getCommon() {
                return this.common;
            }

            @NotNull
            public final AspectItemDTO copy(@NotNull TextDTO text, CommonControlSettings common) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new AspectItemDTO(text, common);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AspectItemDTO)) {
                    return false;
                }
                AspectItemDTO aspectItemDTO = (AspectItemDTO) other;
                return Intrinsics.d(this.text, aspectItemDTO.text) && Intrinsics.d(this.common, aspectItemDTO.common);
            }

            public final CommonControlSettings getCommon() {
                return this.common;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                CommonControlSettings commonControlSettings = this.common;
                return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
            }

            @NotNull
            public String toString() {
                return "AspectItemDTO(text=" + this.text + ", common=" + this.common + ")";
            }
        }

        public AspectListDTO(@NotNull List<AspectItemDTO> items, int i11) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.selectedItemIndex = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AspectListDTO copy$default(AspectListDTO aspectListDTO, List list, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = aspectListDTO.items;
            }
            if ((i12 & 2) != 0) {
                i11 = aspectListDTO.selectedItemIndex;
            }
            return aspectListDTO.copy(list, i11);
        }

        @NotNull
        public final List<AspectItemDTO> component1() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSelectedItemIndex() {
            return this.selectedItemIndex;
        }

        @NotNull
        public final AspectListDTO copy(@NotNull List<AspectItemDTO> items, int selectedItemIndex) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new AspectListDTO(items, selectedItemIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AspectListDTO)) {
                return false;
            }
            AspectListDTO aspectListDTO = (AspectListDTO) other;
            return Intrinsics.d(this.items, aspectListDTO.items) && this.selectedItemIndex == aspectListDTO.selectedItemIndex;
        }

        @NotNull
        public final List<AspectItemDTO> getItems() {
            return this.items;
        }

        public final int getSelectedItemIndex() {
            return this.selectedItemIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.selectedItemIndex) + (this.items.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AspectListDTO(items=" + this.items + ", selectedItemIndex=" + this.selectedItemIndex + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$SettingsDTO;", "", "backgroundColor", "", "<init>", "(Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsDTO {
        public static final int $stable = 0;
        private final String backgroundColor;

        public SettingsDTO(String str) {
            this.backgroundColor = str;
        }

        public static /* synthetic */ SettingsDTO copy$default(SettingsDTO settingsDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = settingsDTO.backgroundColor;
            }
            return settingsDTO.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final SettingsDTO copy(String backgroundColor) {
            return new SettingsDTO(backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SettingsDTO) && Intrinsics.d(this.backgroundColor, ((SettingsDTO) other).backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("SettingsDTO(backgroundColor=", this.backgroundColor, ")");
        }
    }

    public MercuryCertificatesInfoDTO(@NotNull TextDTO title, TextDTO textDTO, AspectListDTO aspectListDTO, CellDTO cellDTO, TextDTO textDTO2, SettingsDTO settingsDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = textDTO;
        this.aspectList = aspectListDTO;
        this.address = cellDTO;
        this.caption = textDTO2;
        this.settings = settingsDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ MercuryCertificatesInfoDTO copy$default(MercuryCertificatesInfoDTO mercuryCertificatesInfoDTO, TextDTO textDTO, TextDTO textDTO2, AspectListDTO aspectListDTO, CellDTO cellDTO, TextDTO textDTO3, SettingsDTO settingsDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = mercuryCertificatesInfoDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = mercuryCertificatesInfoDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            aspectListDTO = mercuryCertificatesInfoDTO.aspectList;
        }
        if ((i11 & 8) != 0) {
            cellDTO = mercuryCertificatesInfoDTO.address;
        }
        if ((i11 & 16) != 0) {
            textDTO3 = mercuryCertificatesInfoDTO.caption;
        }
        if ((i11 & 32) != 0) {
            settingsDTO = mercuryCertificatesInfoDTO.settings;
        }
        if ((i11 & 64) != 0) {
            map = mercuryCertificatesInfoDTO.trackingInfo;
        }
        SettingsDTO settingsDTO2 = settingsDTO;
        Map map2 = map;
        TextDTO textDTO4 = textDTO3;
        AspectListDTO aspectListDTO2 = aspectListDTO;
        return mercuryCertificatesInfoDTO.copy(textDTO, textDTO2, aspectListDTO2, cellDTO, textDTO4, settingsDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AspectListDTO getAspectList() {
        return this.aspectList;
    }

    /* renamed from: component4, reason: from getter */
    public final CellDTO getAddress() {
        return this.address;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getCaption() {
        return this.caption;
    }

    /* renamed from: component6, reason: from getter */
    public final SettingsDTO getSettings() {
        return this.settings;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final MercuryCertificatesInfoDTO copy(@NotNull TextDTO title, TextDTO subtitle, AspectListDTO aspectList, CellDTO address, TextDTO caption, SettingsDTO settings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new MercuryCertificatesInfoDTO(title, subtitle, aspectList, address, caption, settings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MercuryCertificatesInfoDTO)) {
            return false;
        }
        MercuryCertificatesInfoDTO mercuryCertificatesInfoDTO = (MercuryCertificatesInfoDTO) other;
        return Intrinsics.d(this.title, mercuryCertificatesInfoDTO.title) && Intrinsics.d(this.subtitle, mercuryCertificatesInfoDTO.subtitle) && Intrinsics.d(this.aspectList, mercuryCertificatesInfoDTO.aspectList) && Intrinsics.d(this.address, mercuryCertificatesInfoDTO.address) && Intrinsics.d(this.caption, mercuryCertificatesInfoDTO.caption) && Intrinsics.d(this.settings, mercuryCertificatesInfoDTO.settings) && Intrinsics.d(this.trackingInfo, mercuryCertificatesInfoDTO.trackingInfo);
    }

    public final CellDTO getAddress() {
        return this.address;
    }

    public final AspectListDTO getAspectList() {
        return this.aspectList;
    }

    public final TextDTO getCaption() {
        return this.caption;
    }

    public final SettingsDTO getSettings() {
        return this.settings;
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
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        AspectListDTO aspectListDTO = this.aspectList;
        int hashCode3 = (hashCode2 + (aspectListDTO == null ? 0 : aspectListDTO.hashCode())) * 31;
        CellDTO cellDTO = this.address;
        int hashCode4 = (hashCode3 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.caption;
        int hashCode5 = (hashCode4 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        SettingsDTO settingsDTO = this.settings;
        int hashCode6 = (hashCode5 + (settingsDTO == null ? 0 : settingsDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        AspectListDTO aspectListDTO = this.aspectList;
        CellDTO cellDTO = this.address;
        TextDTO textDTO3 = this.caption;
        SettingsDTO settingsDTO = this.settings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("MercuryCertificatesInfoDTO(title=", textDTO, ", subtitle=", textDTO2, ", aspectList=");
        g10.append(aspectListDTO);
        g10.append(", address=");
        g10.append(cellDTO);
        g10.append(", caption=");
        g10.append(textDTO3);
        g10.append(", settings=");
        g10.append(settingsDTO);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }
}
