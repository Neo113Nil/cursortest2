package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.data;

import G.g;
import T7.E;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JS\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/data/TopTravelModalDTO;", "", "topImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "items", "", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "backgroundImage", "", "backgroundColor", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTopImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getItems", "()Ljava/util/List;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBackgroundImage", "()Ljava/lang/String;", "getBackgroundColor", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ItemSpacerDTO", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TopTravelModalDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;
    private final String backgroundImage;
    private final IconButtonV3DTO closeButton;
    private final CommonControlSettings common;

    @NotNull
    private final List<Object> items;
    private final ImageDTO topImage;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/data/TopTravelModalDTO$ItemSpacerDTO;", "", "height", "", "<init>", "(I)V", "getHeight", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemSpacerDTO {
        public static final int $stable = 0;
        private final int height;

        public ItemSpacerDTO(int i11) {
            this.height = i11;
        }

        public static /* synthetic */ ItemSpacerDTO copy$default(ItemSpacerDTO itemSpacerDTO, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = itemSpacerDTO.height;
            }
            return itemSpacerDTO.copy(i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final ItemSpacerDTO copy(int height) {
            return new ItemSpacerDTO(height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ItemSpacerDTO) && this.height == ((ItemSpacerDTO) other).height;
        }

        public final int getHeight() {
            return this.height;
        }

        public int hashCode() {
            return Integer.hashCode(this.height);
        }

        @NotNull
        public String toString() {
            return E.a(this.height, "ItemSpacerDTO(height=", ")");
        }
    }

    public TopTravelModalDTO(ImageDTO imageDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "badge", type = BadgeDTO.class), @ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "spacer", type = ItemSpacerDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, IconButtonV3DTO iconButtonV3DTO, String str, @NotNull String backgroundColor, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.topImage = imageDTO;
        this.items = items;
        this.closeButton = iconButtonV3DTO;
        this.backgroundImage = str;
        this.backgroundColor = backgroundColor;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ TopTravelModalDTO copy$default(TopTravelModalDTO topTravelModalDTO, ImageDTO imageDTO, List list, IconButtonV3DTO iconButtonV3DTO, String str, String str2, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = topTravelModalDTO.topImage;
        }
        if ((i11 & 2) != 0) {
            list = topTravelModalDTO.items;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = topTravelModalDTO.closeButton;
        }
        if ((i11 & 8) != 0) {
            str = topTravelModalDTO.backgroundImage;
        }
        if ((i11 & 16) != 0) {
            str2 = topTravelModalDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = topTravelModalDTO.common;
        }
        String str3 = str2;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return topTravelModalDTO.copy(imageDTO, list, iconButtonV3DTO, str, str3, commonControlSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getTopImage() {
        return this.topImage;
    }

    @NotNull
    public final List<Object> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final TopTravelModalDTO copy(ImageDTO topImage, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "badge", type = BadgeDTO.class), @ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "spacer", type = ItemSpacerDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, IconButtonV3DTO closeButton, String backgroundImage, @NotNull String backgroundColor, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new TopTravelModalDTO(topImage, items, closeButton, backgroundImage, backgroundColor, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopTravelModalDTO)) {
            return false;
        }
        TopTravelModalDTO topTravelModalDTO = (TopTravelModalDTO) other;
        return Intrinsics.d(this.topImage, topTravelModalDTO.topImage) && Intrinsics.d(this.items, topTravelModalDTO.items) && Intrinsics.d(this.closeButton, topTravelModalDTO.closeButton) && Intrinsics.d(this.backgroundImage, topTravelModalDTO.backgroundImage) && Intrinsics.d(this.backgroundColor, topTravelModalDTO.backgroundColor) && Intrinsics.d(this.common, topTravelModalDTO.common);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final ImageDTO getTopImage() {
        return this.topImage;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.topImage;
        int b11 = g.b((imageDTO == null ? 0 : imageDTO.hashCode()) * 31, 31, this.items);
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode = (b11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        String str = this.backgroundImage;
        int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.backgroundColor);
        CommonControlSettings commonControlSettings = this.common;
        return a11 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TopTravelModalDTO(topImage=" + this.topImage + ", items=" + this.items + ", closeButton=" + this.closeButton + ", backgroundImage=" + this.backgroundImage + ", backgroundColor=" + this.backgroundColor + ", common=" + this.common + ")";
    }

    public TopTravelModalDTO(ImageDTO imageDTO, List list, IconButtonV3DTO iconButtonV3DTO, String str, String str2, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDTO, (i11 & 2) != 0 ? K.f71697a : list, iconButtonV3DTO, str, str2, commonControlSettings);
    }
}
