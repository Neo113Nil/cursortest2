package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.legend;

import D3.g;
import Lc.a;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/MobileLegendBlockV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "image", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "selectionIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "getImage", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "getSelectionIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MobileLegendBlockV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final CommonControlSettings common;

    @NotNull
    private final ThemeImageV1DTO image;

    @NotNull
    private final TextDTO price;

    @NotNull
    private final Icon selectionIcon;

    @NotNull
    private final TextDTO title;

    public MobileLegendBlockV2DTO(@NotNull TextDTO title, @NotNull TextDTO price, @NotNull ThemeImageV1DTO image, @NotNull Icon selectionIcon, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(selectionIcon, "selectionIcon");
        Intrinsics.checkNotNullParameter(common, "common");
        this.title = title;
        this.price = price;
        this.image = image;
        this.selectionIcon = selectionIcon;
        this.common = common;
    }

    public static /* synthetic */ MobileLegendBlockV2DTO copy$default(MobileLegendBlockV2DTO mobileLegendBlockV2DTO, TextDTO textDTO, TextDTO textDTO2, ThemeImageV1DTO themeImageV1DTO, Icon icon, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = mobileLegendBlockV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = mobileLegendBlockV2DTO.price;
        }
        if ((i11 & 4) != 0) {
            themeImageV1DTO = mobileLegendBlockV2DTO.image;
        }
        if ((i11 & 8) != 0) {
            icon = mobileLegendBlockV2DTO.selectionIcon;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = mobileLegendBlockV2DTO.common;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        ThemeImageV1DTO themeImageV1DTO2 = themeImageV1DTO;
        return mobileLegendBlockV2DTO.copy(textDTO, textDTO2, themeImageV1DTO2, icon, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ThemeImageV1DTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Icon getSelectionIcon() {
        return this.selectionIcon;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final MobileLegendBlockV2DTO copy(@NotNull TextDTO title, @NotNull TextDTO price, @NotNull ThemeImageV1DTO image, @NotNull Icon selectionIcon, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(selectionIcon, "selectionIcon");
        Intrinsics.checkNotNullParameter(common, "common");
        return new MobileLegendBlockV2DTO(title, price, image, selectionIcon, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileLegendBlockV2DTO)) {
            return false;
        }
        MobileLegendBlockV2DTO mobileLegendBlockV2DTO = (MobileLegendBlockV2DTO) other;
        return Intrinsics.d(this.title, mobileLegendBlockV2DTO.title) && Intrinsics.d(this.price, mobileLegendBlockV2DTO.price) && Intrinsics.d(this.image, mobileLegendBlockV2DTO.image) && Intrinsics.d(this.selectionIcon, mobileLegendBlockV2DTO.selectionIcon) && Intrinsics.d(this.common, mobileLegendBlockV2DTO.common);
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final ThemeImageV1DTO getImage() {
        return this.image;
    }

    @NotNull
    public final TextDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final Icon getSelectionIcon() {
        return this.selectionIcon;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.common.hashCode() + a.a(this.selectionIcon, (this.image.hashCode() + b.a(this.price, this.title.hashCode() * 31, 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.price;
        ThemeImageV1DTO themeImageV1DTO = this.image;
        Icon icon = this.selectionIcon;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder g10 = g.g("MobileLegendBlockV2DTO(title=", textDTO, ", price=", textDTO2, ", image=");
        g10.append(themeImageV1DTO);
        g10.append(", selectionIcon=");
        g10.append(icon);
        g10.append(", common=");
        return Ak.b.g(g10, commonControlSettings, ")");
    }
}
