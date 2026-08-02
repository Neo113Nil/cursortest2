package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "items", "", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/ItemDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ItemDTO> items;
    private final TextDTO title;

    public DeliveryDTO(TextDTO textDTO, @NotNull List<ItemDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = textDTO;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryDTO copy$default(DeliveryDTO deliveryDTO, TextDTO textDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = deliveryDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = deliveryDTO.items;
        }
        return deliveryDTO.copy(textDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<ItemDTO> component2() {
        return this.items;
    }

    @NotNull
    public final DeliveryDTO copy(TextDTO title, @NotNull List<ItemDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new DeliveryDTO(title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDTO)) {
            return false;
        }
        DeliveryDTO deliveryDTO = (DeliveryDTO) other;
        return Intrinsics.d(this.title, deliveryDTO.title) && Intrinsics.d(this.items, deliveryDTO.items);
    }

    @NotNull
    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        return this.items.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "DeliveryDTO(title=" + this.title + ", items=" + this.items + ")";
    }
}
