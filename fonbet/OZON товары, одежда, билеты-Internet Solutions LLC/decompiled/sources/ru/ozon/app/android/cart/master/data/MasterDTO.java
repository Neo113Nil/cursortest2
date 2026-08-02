package ru.ozon.app.android.cart.master.data;

import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/master/data/MasterDTO;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "", "Lru/ozon/app/android/cart/master/data/CartSummaryItemDTO;", "summaryFamily", "nextTabDeeplink", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getTrackingInfo", "()Ljava/util/Map;", "getSummary", "()Ljava/util/List;", "getSummaryFamily", "getNextTabDeeplink", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MasterDTO {
    public static final int $stable = 8;
    private final String nextTabDeeplink;
    private final List<CartSummaryItemDTO> summary;
    private final List<CartSummaryItemDTO> summaryFamily;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public MasterDTO(Map<String, TokenizedTrackingInfo> map, List<CartSummaryItemDTO> list, List<CartSummaryItemDTO> list2, String str) {
        this.trackingInfo = map;
        this.summary = list;
        this.summaryFamily = list2;
        this.nextTabDeeplink = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MasterDTO copy$default(MasterDTO masterDTO, Map map, List list, List list2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = masterDTO.trackingInfo;
        }
        if ((i11 & 2) != 0) {
            list = masterDTO.summary;
        }
        if ((i11 & 4) != 0) {
            list2 = masterDTO.summaryFamily;
        }
        if ((i11 & 8) != 0) {
            str = masterDTO.nextTabDeeplink;
        }
        return masterDTO.copy(map, list, list2, str);
    }

    public final Map<String, TokenizedTrackingInfo> component1() {
        return this.trackingInfo;
    }

    public final List<CartSummaryItemDTO> component2() {
        return this.summary;
    }

    public final List<CartSummaryItemDTO> component3() {
        return this.summaryFamily;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNextTabDeeplink() {
        return this.nextTabDeeplink;
    }

    @NotNull
    public final MasterDTO copy(Map<String, TokenizedTrackingInfo> trackingInfo, List<CartSummaryItemDTO> summary, List<CartSummaryItemDTO> summaryFamily, String nextTabDeeplink) {
        return new MasterDTO(trackingInfo, summary, summaryFamily, nextTabDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MasterDTO)) {
            return false;
        }
        MasterDTO masterDTO = (MasterDTO) other;
        return Intrinsics.d(this.trackingInfo, masterDTO.trackingInfo) && Intrinsics.d(this.summary, masterDTO.summary) && Intrinsics.d(this.summaryFamily, masterDTO.summaryFamily) && Intrinsics.d(this.nextTabDeeplink, masterDTO.nextTabDeeplink);
    }

    public final String getNextTabDeeplink() {
        return this.nextTabDeeplink;
    }

    public final List<CartSummaryItemDTO> getSummary() {
        return this.summary;
    }

    public final List<CartSummaryItemDTO> getSummaryFamily() {
        return this.summaryFamily;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<CartSummaryItemDTO> list = this.summary;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<CartSummaryItemDTO> list2 = this.summaryFamily;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.nextTabDeeplink;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MasterDTO(trackingInfo=" + this.trackingInfo + ", summary=" + this.summary + ", summaryFamily=" + this.summaryFamily + ", nextTabDeeplink=" + this.nextTabDeeplink + ")";
    }
}
