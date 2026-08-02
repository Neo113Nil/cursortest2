package ru.ozon.app.android.csma.orderTracking.data;

import D3.g;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/AddressDTO;", "", "deliveryVariantName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "street", "house", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getDeliveryVariantName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStreet", "getHouse", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AddressDTO {

    @NotNull
    private final TextDTO deliveryVariantName;
    private final TextDTO house;

    @NotNull
    private final TextDTO street;

    public AddressDTO(@NotNull TextDTO deliveryVariantName, @NotNull TextDTO street, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(deliveryVariantName, "deliveryVariantName");
        Intrinsics.checkNotNullParameter(street, "street");
        this.deliveryVariantName = deliveryVariantName;
        this.street = street;
        this.house = textDTO;
    }

    public static /* synthetic */ AddressDTO copy$default(AddressDTO addressDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = addressDTO.deliveryVariantName;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = addressDTO.street;
        }
        if ((i11 & 4) != 0) {
            textDTO3 = addressDTO.house;
        }
        return addressDTO.copy(textDTO, textDTO2, textDTO3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getDeliveryVariantName() {
        return this.deliveryVariantName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getStreet() {
        return this.street;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getHouse() {
        return this.house;
    }

    @NotNull
    public final AddressDTO copy(@NotNull TextDTO deliveryVariantName, @NotNull TextDTO street, TextDTO house) {
        Intrinsics.checkNotNullParameter(deliveryVariantName, "deliveryVariantName");
        Intrinsics.checkNotNullParameter(street, "street");
        return new AddressDTO(deliveryVariantName, street, house);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDTO)) {
            return false;
        }
        AddressDTO addressDTO = (AddressDTO) other;
        return Intrinsics.d(this.deliveryVariantName, addressDTO.deliveryVariantName) && Intrinsics.d(this.street, addressDTO.street) && Intrinsics.d(this.house, addressDTO.house);
    }

    @NotNull
    public final TextDTO getDeliveryVariantName() {
        return this.deliveryVariantName;
    }

    public final TextDTO getHouse() {
        return this.house;
    }

    @NotNull
    public final TextDTO getStreet() {
        return this.street;
    }

    public int hashCode() {
        int a11 = b.a(this.street, this.deliveryVariantName.hashCode() * 31, 31);
        TextDTO textDTO = this.house;
        return a11 + (textDTO == null ? 0 : textDTO.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.deliveryVariantName;
        TextDTO textDTO2 = this.street;
        return Tl.b.e(g.g("AddressDTO(deliveryVariantName=", textDTO, ", street=", textDTO2, ", house="), this.house, ")");
    }
}
