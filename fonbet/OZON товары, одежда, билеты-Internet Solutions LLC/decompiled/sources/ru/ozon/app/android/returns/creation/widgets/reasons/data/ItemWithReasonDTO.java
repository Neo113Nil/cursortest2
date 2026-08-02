package ru.ozon.app.android.returns.creation.widgets.reasons.data;

import B90.C2618u;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.data.ItemDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/data/ItemWithReasonDTO;", "", "item", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/returns/creation/widgets/reasons/data/HeaderDTO;", "reasons", "", "Lru/ozon/app/android/returns/creation/widgets/reasons/data/ReasonDTO;", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;Lru/ozon/app/android/returns/creation/widgets/reasons/data/HeaderDTO;Ljava/util/List;)V", "getItem", "()Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "getHeader", "()Lru/ozon/app/android/returns/creation/widgets/reasons/data/HeaderDTO;", "getReasons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ItemWithReasonDTO {
    public static final int $stable = 8;
    private final HeaderDTO header;
    private final ItemDTO item;

    @NotNull
    private final List<ReasonDTO> reasons;

    public ItemWithReasonDTO(ItemDTO itemDTO, HeaderDTO headerDTO, @NotNull List<ReasonDTO> reasons) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.item = itemDTO;
        this.header = headerDTO;
        this.reasons = reasons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemWithReasonDTO copy$default(ItemWithReasonDTO itemWithReasonDTO, ItemDTO itemDTO, HeaderDTO headerDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            itemDTO = itemWithReasonDTO.item;
        }
        if ((i11 & 2) != 0) {
            headerDTO = itemWithReasonDTO.header;
        }
        if ((i11 & 4) != 0) {
            list = itemWithReasonDTO.reasons;
        }
        return itemWithReasonDTO.copy(itemDTO, headerDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final ItemDTO getItem() {
        return this.item;
    }

    /* renamed from: component2, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<ReasonDTO> component3() {
        return this.reasons;
    }

    @NotNull
    public final ItemWithReasonDTO copy(ItemDTO item, HeaderDTO header, @NotNull List<ReasonDTO> reasons) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        return new ItemWithReasonDTO(item, header, reasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemWithReasonDTO)) {
            return false;
        }
        ItemWithReasonDTO itemWithReasonDTO = (ItemWithReasonDTO) other;
        return Intrinsics.d(this.item, itemWithReasonDTO.item) && Intrinsics.d(this.header, itemWithReasonDTO.header) && Intrinsics.d(this.reasons, itemWithReasonDTO.reasons);
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final ItemDTO getItem() {
        return this.item;
    }

    @NotNull
    public final List<ReasonDTO> getReasons() {
        return this.reasons;
    }

    public int hashCode() {
        ItemDTO itemDTO = this.item;
        int hashCode = (itemDTO == null ? 0 : itemDTO.hashCode()) * 31;
        HeaderDTO headerDTO = this.header;
        return this.reasons.hashCode() + ((hashCode + (headerDTO != null ? headerDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        ItemDTO itemDTO = this.item;
        HeaderDTO headerDTO = this.header;
        List<ReasonDTO> list = this.reasons;
        StringBuilder sb2 = new StringBuilder("ItemWithReasonDTO(item=");
        sb2.append(itemDTO);
        sb2.append(", header=");
        sb2.append(headerDTO);
        sb2.append(", reasons=");
        return C2618u.h(sb2, list, ")");
    }
}
