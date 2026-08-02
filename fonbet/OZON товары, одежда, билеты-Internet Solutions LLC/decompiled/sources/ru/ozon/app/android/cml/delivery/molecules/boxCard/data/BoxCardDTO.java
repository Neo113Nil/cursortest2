package ru.ozon.app.android.cml.delivery.molecules.boxCard.data;

import G.g;
import Gl.C3124a;
import Kk.C3532b;
import Nh.a;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003JU\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/boxCard/data/BoxCardDTO;", "", "id", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "isSelected", "", "price", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "descriptions", "", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getId", "()Ljava/lang/String;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Z", "getPrice", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDescriptions", "()Ljava/util/List;", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BoxCardDTO {

    @NotNull
    private final CommonControlSettings commonControlSettings;

    @NotNull
    private final List<TextDTO> descriptions;

    @NotNull
    private final String id;

    @NotNull
    private final ImageDTO image;
    private final boolean isSelected;

    @NotNull
    private final BadgeDTO price;

    @NotNull
    private final TextDTO title;

    public BoxCardDTO(@NotNull String id2, @NotNull ImageDTO image, @NotNull TextDTO title, boolean z11, @NotNull BadgeDTO price, @NotNull List<TextDTO> descriptions, @NotNull CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
        this.id = id2;
        this.image = image;
        this.title = title;
        this.isSelected = z11;
        this.price = price;
        this.descriptions = descriptions;
        this.commonControlSettings = commonControlSettings;
    }

    public static /* synthetic */ BoxCardDTO copy$default(BoxCardDTO boxCardDTO, String str, ImageDTO imageDTO, TextDTO textDTO, boolean z11, BadgeDTO badgeDTO, List list, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = boxCardDTO.id;
        }
        if ((i11 & 2) != 0) {
            imageDTO = boxCardDTO.image;
        }
        if ((i11 & 4) != 0) {
            textDTO = boxCardDTO.title;
        }
        if ((i11 & 8) != 0) {
            z11 = boxCardDTO.isSelected;
        }
        if ((i11 & 16) != 0) {
            badgeDTO = boxCardDTO.price;
        }
        if ((i11 & 32) != 0) {
            list = boxCardDTO.descriptions;
        }
        if ((i11 & 64) != 0) {
            commonControlSettings = boxCardDTO.commonControlSettings;
        }
        List list2 = list;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        BadgeDTO badgeDTO2 = badgeDTO;
        TextDTO textDTO2 = textDTO;
        return boxCardDTO.copy(str, imageDTO, textDTO2, z11, badgeDTO2, list2, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BadgeDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final List<TextDTO> component6() {
        return this.descriptions;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    @NotNull
    public final BoxCardDTO copy(@NotNull String id2, @NotNull ImageDTO image, @NotNull TextDTO title, boolean isSelected, @NotNull BadgeDTO price, @NotNull List<TextDTO> descriptions, @NotNull CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
        return new BoxCardDTO(id2, image, title, isSelected, price, descriptions, commonControlSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxCardDTO)) {
            return false;
        }
        BoxCardDTO boxCardDTO = (BoxCardDTO) other;
        return Intrinsics.d(this.id, boxCardDTO.id) && Intrinsics.d(this.image, boxCardDTO.image) && Intrinsics.d(this.title, boxCardDTO.title) && this.isSelected == boxCardDTO.isSelected && Intrinsics.d(this.price, boxCardDTO.price) && Intrinsics.d(this.descriptions, boxCardDTO.descriptions) && Intrinsics.d(this.commonControlSettings, boxCardDTO.commonControlSettings);
    }

    @NotNull
    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    @NotNull
    public final List<TextDTO> getDescriptions() {
        return this.descriptions;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final BadgeDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.commonControlSettings.hashCode() + g.b(C3124a.c(this.price, C3532b.a(b.a(this.title, a.b(this.image, this.id.hashCode() * 31, 31), 31), 31, this.isSelected), 31), 31, this.descriptions);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        boolean z11 = this.isSelected;
        BadgeDTO badgeDTO = this.price;
        List<TextDTO> list = this.descriptions;
        CommonControlSettings commonControlSettings = this.commonControlSettings;
        StringBuilder sb2 = new StringBuilder("BoxCardDTO(id=");
        sb2.append(str);
        sb2.append(", image=");
        sb2.append(imageDTO);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", isSelected=");
        sb2.append(z11);
        sb2.append(", price=");
        sb2.append(badgeDTO);
        sb2.append(", descriptions=");
        sb2.append(list);
        sb2.append(", commonControlSettings=");
        return Ak.b.g(sb2, commonControlSettings, ")");
    }
}
