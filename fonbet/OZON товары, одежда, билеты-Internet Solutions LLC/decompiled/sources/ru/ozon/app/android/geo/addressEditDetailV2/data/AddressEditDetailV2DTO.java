package ru.ozon.app.android.geo.addressEditDetailV2.data;

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
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetailV2/data/AddressEditDetailV2DTO;", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "", "openSearchOptions", "Lru/ozon/app/android/geo/options/data/Options;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/geo/options/data/Options;Ljava/util/Map;)V", "getAddress", "()Ljava/util/List;", "getOpenSearchOptions", "()Lru/ozon/app/android/geo/options/data/Options;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditDetailV2DTO {
    private final List<Object> address;
    private final Options openSearchOptions;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AddressEditDetailV2DTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellList", type = CheckoutCellListDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> list, Options options, Map<String, TokenizedTrackingInfo> map) {
        this.address = list;
        this.openSearchOptions = options;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressEditDetailV2DTO copy$default(AddressEditDetailV2DTO addressEditDetailV2DTO, List list, Options options, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = addressEditDetailV2DTO.address;
        }
        if ((i11 & 2) != 0) {
            options = addressEditDetailV2DTO.openSearchOptions;
        }
        if ((i11 & 4) != 0) {
            map = addressEditDetailV2DTO.trackingInfo;
        }
        return addressEditDetailV2DTO.copy(list, options, map);
    }

    public final List<Object> component1() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final Options getOpenSearchOptions() {
        return this.openSearchOptions;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final AddressEditDetailV2DTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellList", type = CheckoutCellListDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> address, Options openSearchOptions, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new AddressEditDetailV2DTO(address, openSearchOptions, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditDetailV2DTO)) {
            return false;
        }
        AddressEditDetailV2DTO addressEditDetailV2DTO = (AddressEditDetailV2DTO) other;
        return Intrinsics.d(this.address, addressEditDetailV2DTO.address) && Intrinsics.d(this.openSearchOptions, addressEditDetailV2DTO.openSearchOptions) && Intrinsics.d(this.trackingInfo, addressEditDetailV2DTO.trackingInfo);
    }

    public final List<Object> getAddress() {
        return this.address;
    }

    public final Options getOpenSearchOptions() {
        return this.openSearchOptions;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        List<Object> list = this.address;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Options options = this.openSearchOptions;
        int hashCode2 = (hashCode + (options == null ? 0 : options.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Object> list = this.address;
        Options options = this.openSearchOptions;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AddressEditDetailV2DTO(address=");
        sb2.append(list);
        sb2.append(", openSearchOptions=");
        sb2.append(options);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
