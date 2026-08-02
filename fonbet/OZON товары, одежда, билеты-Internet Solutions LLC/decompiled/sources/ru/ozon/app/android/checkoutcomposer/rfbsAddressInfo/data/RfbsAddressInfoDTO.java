package ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/data/RfbsAddressInfoDTO;", "", "dynamicElements", "", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO;", "<init>", "(Ljava/util/List;)V", "getDynamicElements$annotations", "()V", "getDynamicElements", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RfbsAddressInfoDTO {
    public static final int $stable = 8;
    private final List<DynamicElementDTO> dynamicElements;

    /* JADX WARN: Multi-variable type inference failed */
    public RfbsAddressInfoDTO(List<? extends DynamicElementDTO> list) {
        this.dynamicElements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RfbsAddressInfoDTO copy$default(RfbsAddressInfoDTO rfbsAddressInfoDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = rfbsAddressInfoDTO.dynamicElements;
        }
        return rfbsAddressInfoDTO.copy(list);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getDynamicElements$annotations() {
    }

    public final List<DynamicElementDTO> component1() {
        return this.dynamicElements;
    }

    @NotNull
    public final RfbsAddressInfoDTO copy(List<? extends DynamicElementDTO> dynamicElements) {
        return new RfbsAddressInfoDTO(dynamicElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RfbsAddressInfoDTO) && Intrinsics.d(this.dynamicElements, ((RfbsAddressInfoDTO) other).dynamicElements);
    }

    public final List<DynamicElementDTO> getDynamicElements() {
        return this.dynamicElements;
    }

    public int hashCode() {
        List<DynamicElementDTO> list = this.dynamicElements;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("RfbsAddressInfoDTO(dynamicElements=", ")", this.dynamicElements);
    }
}
