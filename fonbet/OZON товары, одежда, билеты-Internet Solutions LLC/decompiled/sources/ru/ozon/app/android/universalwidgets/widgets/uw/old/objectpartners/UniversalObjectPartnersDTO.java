package ru.ozon.app.android.universalwidgets.widgets.uw.old.objectpartners;

import N3.C3660k;
import Nh.a;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.common.dto.UniversalBaseDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.common.footer.UniversalFooterDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.common.header.UniversalHeaderDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/dto/UniversalBaseDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/header/UniversalHeaderDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/footer/UniversalFooterDTO;", "designType", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$DesignTypeDTO;", "items", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$ItemDTO;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/header/UniversalHeaderDTO;Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/footer/UniversalFooterDTO;Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$DesignTypeDTO;Ljava/util/List;)V", "getHeader", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/header/UniversalHeaderDTO;", "getFooter", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/footer/UniversalFooterDTO;", "getDesignType", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$DesignTypeDTO;", "getItems", "()Ljava/util/List;", "DesignTypeDTO", "ItemDTO", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectPartnersDTO extends UniversalBaseDTO {

    @NotNull
    private final DesignTypeDTO designType;
    private final UniversalFooterDTO footer;
    private final UniversalHeaderDTO header;

    @NotNull
    private final List<ItemDTO> items;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$DesignTypeDTO;", "", "options", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$DesignTypeDTO$Options;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$DesignTypeDTO$Options;)V", "getOptions", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$DesignTypeDTO$Options;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Options", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class DesignTypeDTO {
        private final Options options;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$DesignTypeDTO$Options;", "", "backgroundColor", "", "footerTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getFooterTextColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Options {
            private final String backgroundColor;
            private final String footerTextColor;

            public Options(String str, String str2) {
                this.backgroundColor = str;
                this.footerTextColor = str2;
            }

            public static /* synthetic */ Options copy$default(Options options, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = options.backgroundColor;
                }
                if ((i11 & 2) != 0) {
                    str2 = options.footerTextColor;
                }
                return options.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2, reason: from getter */
            public final String getFooterTextColor() {
                return this.footerTextColor;
            }

            @NotNull
            public final Options copy(String backgroundColor, String footerTextColor) {
                return new Options(backgroundColor, footerTextColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Options)) {
                    return false;
                }
                Options options = (Options) other;
                return Intrinsics.d(this.backgroundColor, options.backgroundColor) && Intrinsics.d(this.footerTextColor, options.footerTextColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getFooterTextColor() {
                return this.footerTextColor;
            }

            public int hashCode() {
                String str = this.backgroundColor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.footerTextColor;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return e.a("Options(backgroundColor=", this.backgroundColor, ", footerTextColor=", this.footerTextColor, ")");
            }
        }

        public DesignTypeDTO(Options options) {
            this.options = options;
        }

        public static /* synthetic */ DesignTypeDTO copy$default(DesignTypeDTO designTypeDTO, Options options, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                options = designTypeDTO.options;
            }
            return designTypeDTO.copy(options);
        }

        /* renamed from: component1, reason: from getter */
        public final Options getOptions() {
            return this.options;
        }

        @NotNull
        public final DesignTypeDTO copy(Options options) {
            return new DesignTypeDTO(options);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DesignTypeDTO) && Intrinsics.d(this.options, ((DesignTypeDTO) other).options);
        }

        public final Options getOptions() {
            return this.options;
        }

        public int hashCode() {
            Options options = this.options;
            if (options == null) {
                return 0;
            }
            return options.hashCode();
        }

        @NotNull
        public String toString() {
            return "DesignTypeDTO(options=" + this.options + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J[\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$ItemDTO;", "", "image", "", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getDeeplink", "getTitle", "getSubtitle", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemDTO {
        private final ButtonV3Atom.SmallButton button;
        private final String deeplink;

        @NotNull
        private final String image;
        private final String subtitle;
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ItemDTO(@NotNull String image, String str, String str2, String str3, ButtonV3Atom.SmallButton smallButton, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.deeplink = str;
            this.title = str2;
            this.subtitle = str3;
            this.button = smallButton;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, String str, String str2, String str3, String str4, ButtonV3Atom.SmallButton smallButton, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = itemDTO.image;
            }
            if ((i11 & 2) != 0) {
                str2 = itemDTO.deeplink;
            }
            if ((i11 & 4) != 0) {
                str3 = itemDTO.title;
            }
            if ((i11 & 8) != 0) {
                str4 = itemDTO.subtitle;
            }
            if ((i11 & 16) != 0) {
                smallButton = itemDTO.button;
            }
            if ((i11 & 32) != 0) {
                map = itemDTO.trackingInfo;
            }
            ButtonV3Atom.SmallButton smallButton2 = smallButton;
            Map map2 = map;
            return itemDTO.copy(str, str2, str3, str4, smallButton2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final ItemDTO copy(@NotNull String image, String deeplink, String title, String subtitle, ButtonV3Atom.SmallButton button, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new ItemDTO(image, deeplink, title, subtitle, button, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.image, itemDTO.image) && Intrinsics.d(this.deeplink, itemDTO.deeplink) && Intrinsics.d(this.title, itemDTO.title) && Intrinsics.d(this.subtitle, itemDTO.subtitle) && Intrinsics.d(this.button, itemDTO.button) && Intrinsics.d(this.trackingInfo, itemDTO.trackingInfo);
        }

        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.deeplink;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ButtonV3Atom.SmallButton smallButton = this.button;
            int hashCode5 = (hashCode4 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.deeplink;
            String str3 = this.title;
            String str4 = this.subtitle;
            ButtonV3Atom.SmallButton smallButton = this.button;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("ItemDTO(image=", str, ", deeplink=", str2, ", title=");
            a.h(d11, str3, ", subtitle=", str4, ", button=");
            d11.append(smallButton);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(")");
            return d11.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalObjectPartnersDTO(UniversalHeaderDTO universalHeaderDTO, UniversalFooterDTO universalFooterDTO, @NotNull DesignTypeDTO designType, @NotNull List<ItemDTO> items) {
        super(universalHeaderDTO, universalFooterDTO);
        Intrinsics.checkNotNullParameter(designType, "designType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.header = universalHeaderDTO;
        this.footer = universalFooterDTO;
        this.designType = designType;
        this.items = items;
    }

    @NotNull
    public final DesignTypeDTO getDesignType() {
        return this.designType;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.common.dto.UniversalBaseDTO
    public UniversalFooterDTO getFooter() {
        return this.footer;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.common.dto.UniversalBaseDTO
    public UniversalHeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<ItemDTO> getItems() {
        return this.items;
    }
}
