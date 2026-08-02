package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room;

import De.C2859b;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b\t\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b1\u0010(R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b\u0010\u0010*R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b5\u0010-R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/ToursRoomsListV2RoomVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "", "images", "", "isImagesVisible", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "detailBadge", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "details", "isDetailsVisible", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "priceDescription", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "selectButton", "Lru/ozon/uni/atoms/af/AtomAction;", "selectAction", "<init>", "(JLjava/util/List;ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;ZLru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDetailBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDetails", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceDescription", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSelectButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ToursRoomsListV2RoomVO implements c {
    private final BadgeDTO detailBadge;

    @NotNull
    private final List<CellDTO> details;
    private final long id;

    @NotNull
    private final List<String> images;
    private final boolean isDetailsVisible;
    private final boolean isImagesVisible;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final TextDTO priceDescription;
    private final AtomAction selectAction;

    @NotNull
    private final ButtonV3DTO selectButton;

    @NotNull
    private final TextDTO title;

    public ToursRoomsListV2RoomVO(long j11, @NotNull List<String> images, boolean z11, @NotNull TextDTO title, BadgeDTO badgeDTO, @NotNull List<CellDTO> details, boolean z12, @NotNull PriceDTO price, @NotNull TextDTO priceDescription, @NotNull ButtonV3DTO selectButton, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        this.id = j11;
        this.images = images;
        this.isImagesVisible = z11;
        this.title = title;
        this.detailBadge = badgeDTO;
        this.details = details;
        this.isDetailsVisible = z12;
        this.price = price;
        this.priceDescription = priceDescription;
        this.selectButton = selectButton;
        this.selectAction = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursRoomsListV2RoomVO)) {
            return false;
        }
        ToursRoomsListV2RoomVO toursRoomsListV2RoomVO = (ToursRoomsListV2RoomVO) other;
        return this.id == toursRoomsListV2RoomVO.id && Intrinsics.d(this.images, toursRoomsListV2RoomVO.images) && this.isImagesVisible == toursRoomsListV2RoomVO.isImagesVisible && Intrinsics.d(this.title, toursRoomsListV2RoomVO.title) && Intrinsics.d(this.detailBadge, toursRoomsListV2RoomVO.detailBadge) && Intrinsics.d(this.details, toursRoomsListV2RoomVO.details) && this.isDetailsVisible == toursRoomsListV2RoomVO.isDetailsVisible && Intrinsics.d(this.price, toursRoomsListV2RoomVO.price) && Intrinsics.d(this.priceDescription, toursRoomsListV2RoomVO.priceDescription) && Intrinsics.d(this.selectButton, toursRoomsListV2RoomVO.selectButton) && Intrinsics.d(this.selectAction, toursRoomsListV2RoomVO.selectAction);
    }

    public final BadgeDTO getDetailBadge() {
        return this.detailBadge;
    }

    @NotNull
    public final List<CellDTO> getDetails() {
        return this.details;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<String> getImages() {
        return this.images;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final TextDTO getPriceDescription() {
        return this.priceDescription;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final AtomAction getSelectAction() {
        return this.selectAction;
    }

    @NotNull
    public final ButtonV3DTO getSelectButton() {
        return this.selectButton;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, C3532b.a(g.b(Long.hashCode(this.id) * 31, 31, this.images), 31, this.isImagesVisible), 31);
        BadgeDTO badgeDTO = this.detailBadge;
        int c11 = C2859b.c(this.selectButton, b.a(this.priceDescription, C3051a.b(this.price, C3532b.a(g.b((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.details), 31, this.isDetailsVisible), 31), 31), 31);
        AtomAction atomAction = this.selectAction;
        return c11 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    /* renamed from: isDetailsVisible, reason: from getter */
    public final boolean getIsDetailsVisible() {
        return this.isDetailsVisible;
    }

    /* renamed from: isImagesVisible, reason: from getter */
    public final boolean getIsImagesVisible() {
        return this.isImagesVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<String> list = this.images;
        boolean z11 = this.isImagesVisible;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.detailBadge;
        List<CellDTO> list2 = this.details;
        boolean z12 = this.isDetailsVisible;
        PriceDTO priceDTO = this.price;
        TextDTO textDTO2 = this.priceDescription;
        ButtonV3DTO buttonV3DTO = this.selectButton;
        AtomAction atomAction = this.selectAction;
        StringBuilder b11 = Lh.b.b(j11, "ToursRoomsListV2RoomVO(id=", ", images=", list);
        b11.append(", isImagesVisible=");
        b11.append(z11);
        b11.append(", title=");
        b11.append(textDTO);
        b11.append(", detailBadge=");
        b11.append(badgeDTO);
        b11.append(", details=");
        b11.append(list2);
        b11.append(", isDetailsVisible=");
        b11.append(z12);
        b11.append(", price=");
        b11.append(priceDTO);
        b11.append(", priceDescription=");
        b11.append(textDTO2);
        b11.append(", selectButton=");
        b11.append(buttonV3DTO);
        b11.append(", selectAction=");
        b11.append(atomAction);
        b11.append(")");
        return b11.toString();
    }
}
