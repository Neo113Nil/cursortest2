package ru.ozon.app.android.returns.creation.widgets.reasons.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.data.ItemDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/data/ReturnCreationReasonsDTO;", "", "item", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "reasonSelection", "", "Lru/ozon/app/android/returns/creation/widgets/reasons/data/MultipleReasonSelectionDTO;", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;Ljava/util/List;)V", "getItem", "()Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "getReasonSelection", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationReasonsDTO {
    public static final int $stable = 8;
    private final ItemDTO item;

    @NotNull
    private final List<MultipleReasonSelectionDTO> reasonSelection;

    public ReturnCreationReasonsDTO(ItemDTO itemDTO, @NotNull List<MultipleReasonSelectionDTO> reasonSelection) {
        Intrinsics.checkNotNullParameter(reasonSelection, "reasonSelection");
        this.item = itemDTO;
        this.reasonSelection = reasonSelection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnCreationReasonsDTO copy$default(ReturnCreationReasonsDTO returnCreationReasonsDTO, ItemDTO itemDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            itemDTO = returnCreationReasonsDTO.item;
        }
        if ((i11 & 2) != 0) {
            list = returnCreationReasonsDTO.reasonSelection;
        }
        return returnCreationReasonsDTO.copy(itemDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final ItemDTO getItem() {
        return this.item;
    }

    @NotNull
    public final List<MultipleReasonSelectionDTO> component2() {
        return this.reasonSelection;
    }

    @NotNull
    public final ReturnCreationReasonsDTO copy(ItemDTO item, @NotNull List<MultipleReasonSelectionDTO> reasonSelection) {
        Intrinsics.checkNotNullParameter(reasonSelection, "reasonSelection");
        return new ReturnCreationReasonsDTO(item, reasonSelection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationReasonsDTO)) {
            return false;
        }
        ReturnCreationReasonsDTO returnCreationReasonsDTO = (ReturnCreationReasonsDTO) other;
        return Intrinsics.d(this.item, returnCreationReasonsDTO.item) && Intrinsics.d(this.reasonSelection, returnCreationReasonsDTO.reasonSelection);
    }

    public final ItemDTO getItem() {
        return this.item;
    }

    @NotNull
    public final List<MultipleReasonSelectionDTO> getReasonSelection() {
        return this.reasonSelection;
    }

    public int hashCode() {
        ItemDTO itemDTO = this.item;
        return this.reasonSelection.hashCode() + ((itemDTO == null ? 0 : itemDTO.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "ReturnCreationReasonsDTO(item=" + this.item + ", reasonSelection=" + this.reasonSelection + ")";
    }
}
