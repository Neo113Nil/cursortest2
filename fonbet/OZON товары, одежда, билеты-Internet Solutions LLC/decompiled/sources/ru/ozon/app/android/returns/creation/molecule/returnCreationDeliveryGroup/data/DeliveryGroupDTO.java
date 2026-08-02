package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupTitleDTO;", "deliveries", "", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryDTO;", "<init>", "(Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupTitleDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupTitleDTO;", "getDeliveries", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryGroupDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<DeliveryDTO> deliveries;

    @NotNull
    private final DeliveryGroupTitleDTO title;

    public DeliveryGroupDTO(@NotNull DeliveryGroupTitleDTO title, @NotNull List<DeliveryDTO> deliveries) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        this.title = title;
        this.deliveries = deliveries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryGroupDTO copy$default(DeliveryGroupDTO deliveryGroupDTO, DeliveryGroupTitleDTO deliveryGroupTitleDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deliveryGroupTitleDTO = deliveryGroupDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = deliveryGroupDTO.deliveries;
        }
        return deliveryGroupDTO.copy(deliveryGroupTitleDTO, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DeliveryGroupTitleDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<DeliveryDTO> component2() {
        return this.deliveries;
    }

    @NotNull
    public final DeliveryGroupDTO copy(@NotNull DeliveryGroupTitleDTO title, @NotNull List<DeliveryDTO> deliveries) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        return new DeliveryGroupDTO(title, deliveries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryGroupDTO)) {
            return false;
        }
        DeliveryGroupDTO deliveryGroupDTO = (DeliveryGroupDTO) other;
        return Intrinsics.d(this.title, deliveryGroupDTO.title) && Intrinsics.d(this.deliveries, deliveryGroupDTO.deliveries);
    }

    @NotNull
    public final List<DeliveryDTO> getDeliveries() {
        return this.deliveries;
    }

    @NotNull
    public final DeliveryGroupTitleDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.deliveries.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DeliveryGroupDTO(title=" + this.title + ", deliveries=" + this.deliveries + ")";
    }
}
