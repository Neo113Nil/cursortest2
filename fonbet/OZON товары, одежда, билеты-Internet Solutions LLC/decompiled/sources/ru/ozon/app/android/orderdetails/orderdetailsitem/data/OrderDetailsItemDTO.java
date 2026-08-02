package ru.ozon.app.android.orderdetails.orderdetailsitem.data;

import Pk0.h;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImagesDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.ButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jd\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdetailsitem/data/OrderDetailsItemDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "cell", "Lru/ozon/uni/atoms/data/cell/ButtonTitleSubtitleCellDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "images", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "hasSeparator", "", "buttonsInRow", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/cell/ButtonTitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;Ljava/lang/Boolean;Ljava/util/List;Lru/ozon/uni/atoms/data/TestInfo;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCell", "()Lru/ozon/uni/atoms/data/cell/ButtonTitleSubtitleCellDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getImages", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "getHasSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getButtonsInRow", "()Ljava/util/List;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/cell/ButtonTitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;Ljava/lang/Boolean;Ljava/util/List;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/orderdetails/orderdetailsitem/data/OrderDetailsItemDTO;", "equals", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderDetailsItemDTO {
    public static final int $stable = 8;
    private final ButtonV3DTO button;
    private final List<ButtonV3DTO> buttonsInRow;

    @NotNull
    private final ButtonTitleSubtitleCellDTO cell;
    private final Boolean hasSeparator;

    @NotNull
    private final IconDTO icon;
    private final ImagesDTO images;
    private final TestInfo testInfo;

    public OrderDetailsItemDTO(@NotNull IconDTO icon, @NotNull ButtonTitleSubtitleCellDTO cell, ButtonV3DTO buttonV3DTO, ImagesDTO imagesDTO, Boolean bool, List<ButtonV3DTO> list, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.icon = icon;
        this.cell = cell;
        this.button = buttonV3DTO;
        this.images = imagesDTO;
        this.hasSeparator = bool;
        this.buttonsInRow = list;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ OrderDetailsItemDTO copy$default(OrderDetailsItemDTO orderDetailsItemDTO, IconDTO iconDTO, ButtonTitleSubtitleCellDTO buttonTitleSubtitleCellDTO, ButtonV3DTO buttonV3DTO, ImagesDTO imagesDTO, Boolean bool, List list, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = orderDetailsItemDTO.icon;
        }
        if ((i11 & 2) != 0) {
            buttonTitleSubtitleCellDTO = orderDetailsItemDTO.cell;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = orderDetailsItemDTO.button;
        }
        if ((i11 & 8) != 0) {
            imagesDTO = orderDetailsItemDTO.images;
        }
        if ((i11 & 16) != 0) {
            bool = orderDetailsItemDTO.hasSeparator;
        }
        if ((i11 & 32) != 0) {
            list = orderDetailsItemDTO.buttonsInRow;
        }
        if ((i11 & 64) != 0) {
            testInfo = orderDetailsItemDTO.testInfo;
        }
        List list2 = list;
        TestInfo testInfo2 = testInfo;
        Boolean bool2 = bool;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        return orderDetailsItemDTO.copy(iconDTO, buttonTitleSubtitleCellDTO, buttonV3DTO2, imagesDTO, bool2, list2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonTitleSubtitleCellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component4, reason: from getter */
    public final ImagesDTO getImages() {
        return this.images;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHasSeparator() {
        return this.hasSeparator;
    }

    public final List<ButtonV3DTO> component6() {
        return this.buttonsInRow;
    }

    /* renamed from: component7, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OrderDetailsItemDTO copy(@NotNull IconDTO icon, @NotNull ButtonTitleSubtitleCellDTO cell, ButtonV3DTO button, ImagesDTO images, Boolean hasSeparator, List<ButtonV3DTO> buttonsInRow, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new OrderDetailsItemDTO(icon, cell, button, images, hasSeparator, buttonsInRow, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailsItemDTO)) {
            return false;
        }
        OrderDetailsItemDTO orderDetailsItemDTO = (OrderDetailsItemDTO) other;
        return Intrinsics.d(this.icon, orderDetailsItemDTO.icon) && Intrinsics.d(this.cell, orderDetailsItemDTO.cell) && Intrinsics.d(this.button, orderDetailsItemDTO.button) && Intrinsics.d(this.images, orderDetailsItemDTO.images) && Intrinsics.d(this.hasSeparator, orderDetailsItemDTO.hasSeparator) && Intrinsics.d(this.buttonsInRow, orderDetailsItemDTO.buttonsInRow) && Intrinsics.d(this.testInfo, orderDetailsItemDTO.testInfo);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final List<ButtonV3DTO> getButtonsInRow() {
        return this.buttonsInRow;
    }

    @NotNull
    public final ButtonTitleSubtitleCellDTO getCell() {
        return this.cell;
    }

    public final Boolean getHasSeparator() {
        return this.hasSeparator;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final ImagesDTO getImages() {
        return this.images;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public int hashCode() {
        int hashCode = (this.cell.hashCode() + (this.icon.hashCode() * 31)) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        ImagesDTO imagesDTO = this.images;
        int hashCode3 = (hashCode2 + (imagesDTO == null ? 0 : imagesDTO.hashCode())) * 31;
        Boolean bool = this.hasSeparator;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<ButtonV3DTO> list = this.buttonsInRow;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode5 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        ButtonTitleSubtitleCellDTO buttonTitleSubtitleCellDTO = this.cell;
        ButtonV3DTO buttonV3DTO = this.button;
        ImagesDTO imagesDTO = this.images;
        Boolean bool = this.hasSeparator;
        List<ButtonV3DTO> list = this.buttonsInRow;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("OrderDetailsItemDTO(icon=");
        sb2.append(iconDTO);
        sb2.append(", cell=");
        sb2.append(buttonTitleSubtitleCellDTO);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", images=");
        sb2.append(imagesDTO);
        sb2.append(", hasSeparator=");
        sb2.append(bool);
        sb2.append(", buttonsInRow=");
        sb2.append(list);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }
}
