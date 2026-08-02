package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data;

import Sc.InterfaceC3999a;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImagesDTO;", "", "shipmentId", "", "images", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "horizontalPadding", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "spaceBetween", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/cscore/padding/HorizontalPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getShipmentId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getAction$annotations", "()V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getHorizontalPadding", "()Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "getSpaceBetween", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComposableImagesDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final CommonControlSettings common;

    @NotNull
    private final HorizontalPadding horizontalPadding;
    private final List<ComposableImageDTO> images;
    private final transient String shipmentId;
    private final CommonCellSettings.LayoutPadding spaceBetween;
    private final TextDTO title;

    public ComposableImagesDTO(String str, List<ComposableImageDTO> list, AtomActionDTO atomActionDTO, TextDTO textDTO, CommonControlSettings commonControlSettings, @NotNull HorizontalPadding horizontalPadding, CommonCellSettings.LayoutPadding layoutPadding) {
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        this.shipmentId = str;
        this.images = list;
        this.action = atomActionDTO;
        this.title = textDTO;
        this.common = commonControlSettings;
        this.horizontalPadding = horizontalPadding;
        this.spaceBetween = layoutPadding;
    }

    public static /* synthetic */ ComposableImagesDTO copy$default(ComposableImagesDTO composableImagesDTO, String str, List list, AtomActionDTO atomActionDTO, TextDTO textDTO, CommonControlSettings commonControlSettings, HorizontalPadding horizontalPadding, CommonCellSettings.LayoutPadding layoutPadding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = composableImagesDTO.shipmentId;
        }
        if ((i11 & 2) != 0) {
            list = composableImagesDTO.images;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = composableImagesDTO.action;
        }
        if ((i11 & 8) != 0) {
            textDTO = composableImagesDTO.title;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = composableImagesDTO.common;
        }
        if ((i11 & 32) != 0) {
            horizontalPadding = composableImagesDTO.horizontalPadding;
        }
        if ((i11 & 64) != 0) {
            layoutPadding = composableImagesDTO.spaceBetween;
        }
        HorizontalPadding horizontalPadding2 = horizontalPadding;
        CommonCellSettings.LayoutPadding layoutPadding2 = layoutPadding;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return composableImagesDTO.copy(str, list, atomActionDTO2, textDTO, commonControlSettings2, horizontalPadding2, layoutPadding2);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getAction$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getShipmentId() {
        return this.shipmentId;
    }

    public final List<ComposableImageDTO> component2() {
        return this.images;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonCellSettings.LayoutPadding getSpaceBetween() {
        return this.spaceBetween;
    }

    @NotNull
    public final ComposableImagesDTO copy(String shipmentId, List<ComposableImageDTO> images, AtomActionDTO action, TextDTO title, CommonControlSettings common, @NotNull HorizontalPadding horizontalPadding, CommonCellSettings.LayoutPadding spaceBetween) {
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        return new ComposableImagesDTO(shipmentId, images, action, title, common, horizontalPadding, spaceBetween);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposableImagesDTO)) {
            return false;
        }
        ComposableImagesDTO composableImagesDTO = (ComposableImagesDTO) other;
        return Intrinsics.d(this.shipmentId, composableImagesDTO.shipmentId) && Intrinsics.d(this.images, composableImagesDTO.images) && Intrinsics.d(this.action, composableImagesDTO.action) && Intrinsics.d(this.title, composableImagesDTO.title) && Intrinsics.d(this.common, composableImagesDTO.common) && Intrinsics.d(this.horizontalPadding, composableImagesDTO.horizontalPadding) && this.spaceBetween == composableImagesDTO.spaceBetween;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final List<ComposableImageDTO> getImages() {
        return this.images;
    }

    public final String getShipmentId() {
        return this.shipmentId;
    }

    public final CommonCellSettings.LayoutPadding getSpaceBetween() {
        return this.spaceBetween;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.shipmentId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ComposableImageDTO> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        TextDTO textDTO = this.title;
        int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode5 = (this.horizontalPadding.hashCode() + ((hashCode4 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31)) * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.spaceBetween;
        return hashCode5 + (layoutPadding != null ? layoutPadding.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.shipmentId;
        List<ComposableImageDTO> list = this.images;
        AtomActionDTO atomActionDTO = this.action;
        TextDTO textDTO = this.title;
        CommonControlSettings commonControlSettings = this.common;
        HorizontalPadding horizontalPadding = this.horizontalPadding;
        CommonCellSettings.LayoutPadding layoutPadding = this.spaceBetween;
        StringBuilder f7 = b.f("ComposableImagesDTO(shipmentId=", str, ", images=", ", action=", list);
        f7.append(atomActionDTO);
        f7.append(", title=");
        f7.append(textDTO);
        f7.append(", common=");
        f7.append(commonControlSettings);
        f7.append(", horizontalPadding=");
        f7.append(horizontalPadding);
        f7.append(", spaceBetween=");
        f7.append(layoutPadding);
        f7.append(")");
        return f7.toString();
    }

    public /* synthetic */ ComposableImagesDTO(String str, List list, AtomActionDTO atomActionDTO, TextDTO textDTO, CommonControlSettings commonControlSettings, HorizontalPadding horizontalPadding, CommonCellSettings.LayoutPadding layoutPadding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, list, atomActionDTO, textDTO, commonControlSettings, (i11 & 32) != 0 ? HorizontalPadding.INSTANCE.getDEFAULT_PADDING_500() : horizontalPadding, (i11 & 64) != 0 ? CommonCellSettings.LayoutPadding.PADDING_500 : layoutPadding);
    }
}
