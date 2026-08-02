package ru.ozon.app.android.storefront.widgets.financeWidgetV2.data;

import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetV2DTO;", "", "leftCard", "Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;", "rightCard", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;Ljava/lang/String;Ljava/util/Map;)V", "getLeftCard", "()Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;", "getRightCard", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FinanceWidgetV2DTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final FinanceWidgetCardDTO leftCard;
    private final FinanceWidgetCardDTO rightCard;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public FinanceWidgetV2DTO(@NotNull FinanceWidgetCardDTO leftCard, FinanceWidgetCardDTO financeWidgetCardDTO, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(leftCard, "leftCard");
        this.leftCard = leftCard;
        this.rightCard = financeWidgetCardDTO;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinanceWidgetV2DTO copy$default(FinanceWidgetV2DTO financeWidgetV2DTO, FinanceWidgetCardDTO financeWidgetCardDTO, FinanceWidgetCardDTO financeWidgetCardDTO2, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            financeWidgetCardDTO = financeWidgetV2DTO.leftCard;
        }
        if ((i11 & 2) != 0) {
            financeWidgetCardDTO2 = financeWidgetV2DTO.rightCard;
        }
        if ((i11 & 4) != 0) {
            str = financeWidgetV2DTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            map = financeWidgetV2DTO.trackingInfo;
        }
        return financeWidgetV2DTO.copy(financeWidgetCardDTO, financeWidgetCardDTO2, str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FinanceWidgetCardDTO getLeftCard() {
        return this.leftCard;
    }

    /* renamed from: component2, reason: from getter */
    public final FinanceWidgetCardDTO getRightCard() {
        return this.rightCard;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final FinanceWidgetV2DTO copy(@NotNull FinanceWidgetCardDTO leftCard, FinanceWidgetCardDTO rightCard, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(leftCard, "leftCard");
        return new FinanceWidgetV2DTO(leftCard, rightCard, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinanceWidgetV2DTO)) {
            return false;
        }
        FinanceWidgetV2DTO financeWidgetV2DTO = (FinanceWidgetV2DTO) other;
        return Intrinsics.d(this.leftCard, financeWidgetV2DTO.leftCard) && Intrinsics.d(this.rightCard, financeWidgetV2DTO.rightCard) && Intrinsics.d(this.backgroundColor, financeWidgetV2DTO.backgroundColor) && Intrinsics.d(this.trackingInfo, financeWidgetV2DTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final FinanceWidgetCardDTO getLeftCard() {
        return this.leftCard;
    }

    public final FinanceWidgetCardDTO getRightCard() {
        return this.rightCard;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.leftCard.hashCode() * 31;
        FinanceWidgetCardDTO financeWidgetCardDTO = this.rightCard;
        int hashCode2 = (hashCode + (financeWidgetCardDTO == null ? 0 : financeWidgetCardDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        FinanceWidgetCardDTO financeWidgetCardDTO = this.leftCard;
        FinanceWidgetCardDTO financeWidgetCardDTO2 = this.rightCard;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("FinanceWidgetV2DTO(leftCard=");
        sb2.append(financeWidgetCardDTO);
        sb2.append(", rightCard=");
        sb2.append(financeWidgetCardDTO2);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
