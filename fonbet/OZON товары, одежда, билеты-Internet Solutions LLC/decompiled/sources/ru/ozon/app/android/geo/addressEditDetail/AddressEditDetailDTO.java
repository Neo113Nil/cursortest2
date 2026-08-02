package ru.ozon.app.android.geo.addressEditDetail;

import Fj.c;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.geo.options.data.Options;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDTO;", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "", "Lru/ozon/uni/atoms/data/AtomDTO;", "newAddress", "buttonApp", "openSearchOptions", "Lru/ozon/app/android/geo/options/data/Options;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/geo/options/data/Options;Ljava/util/Map;)V", "getAddress", "()Ljava/util/List;", "getNewAddress", "getButtonApp", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getOpenSearchOptions", "()Lru/ozon/app/android/geo/options/data/Options;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditDetailDTO {
    private final List<AtomDTO> address;
    private final AtomDTO buttonApp;
    private final List<Object> newAddress;
    private final Options openSearchOptions;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditDetailDTO(List<? extends AtomDTO> list, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "element", type = AtomDTO.class), @ProtoOneOfSignature(name = "cellList", type = CheckoutCellListDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> list2, AtomDTO atomDTO, Options options, Map<String, TokenizedTrackingInfo> map) {
        this.address = list;
        this.newAddress = list2;
        this.buttonApp = atomDTO;
        this.openSearchOptions = options;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AddressEditDetailDTO copy$default(AddressEditDetailDTO addressEditDetailDTO, List list, List list2, AtomDTO atomDTO, Options options, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = addressEditDetailDTO.address;
        }
        if ((i11 & 2) != 0) {
            list2 = addressEditDetailDTO.newAddress;
        }
        if ((i11 & 4) != 0) {
            atomDTO = addressEditDetailDTO.buttonApp;
        }
        if ((i11 & 8) != 0) {
            options = addressEditDetailDTO.openSearchOptions;
        }
        if ((i11 & 16) != 0) {
            map = addressEditDetailDTO.trackingInfo;
        }
        Map map2 = map;
        AtomDTO atomDTO2 = atomDTO;
        return addressEditDetailDTO.copy(list, list2, atomDTO2, options, map2);
    }

    public final List<AtomDTO> component1() {
        return this.address;
    }

    public final List<Object> component2() {
        return this.newAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomDTO getButtonApp() {
        return this.buttonApp;
    }

    /* renamed from: component4, reason: from getter */
    public final Options getOpenSearchOptions() {
        return this.openSearchOptions;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final AddressEditDetailDTO copy(List<? extends AtomDTO> address, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "element", type = AtomDTO.class), @ProtoOneOfSignature(name = "cellList", type = CheckoutCellListDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> newAddress, AtomDTO buttonApp, Options openSearchOptions, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new AddressEditDetailDTO(address, newAddress, buttonApp, openSearchOptions, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditDetailDTO)) {
            return false;
        }
        AddressEditDetailDTO addressEditDetailDTO = (AddressEditDetailDTO) other;
        return Intrinsics.d(this.address, addressEditDetailDTO.address) && Intrinsics.d(this.newAddress, addressEditDetailDTO.newAddress) && Intrinsics.d(this.buttonApp, addressEditDetailDTO.buttonApp) && Intrinsics.d(this.openSearchOptions, addressEditDetailDTO.openSearchOptions) && Intrinsics.d(this.trackingInfo, addressEditDetailDTO.trackingInfo);
    }

    public final List<AtomDTO> getAddress() {
        return this.address;
    }

    public final AtomDTO getButtonApp() {
        return this.buttonApp;
    }

    public final List<Object> getNewAddress() {
        return this.newAddress;
    }

    public final Options getOpenSearchOptions() {
        return this.openSearchOptions;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        List<AtomDTO> list = this.address;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Object> list2 = this.newAddress;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        AtomDTO atomDTO = this.buttonApp;
        int hashCode3 = (hashCode2 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        Options options = this.openSearchOptions;
        int hashCode4 = (hashCode3 + (options == null ? 0 : options.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<AtomDTO> list = this.address;
        List<Object> list2 = this.newAddress;
        AtomDTO atomDTO = this.buttonApp;
        Options options = this.openSearchOptions;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = c.d("AddressEditDetailDTO(address=", list, ", newAddress=", ", buttonApp=", list2);
        d11.append(atomDTO);
        d11.append(", openSearchOptions=");
        d11.append(options);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }
}
