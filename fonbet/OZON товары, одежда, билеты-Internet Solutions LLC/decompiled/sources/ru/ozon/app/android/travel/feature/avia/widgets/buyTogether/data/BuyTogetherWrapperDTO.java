package ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherWrapperDTO;", "", "dto", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO;)V", "getDto", "()Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BuyTogetherWrapperDTO {
    public static final int $stable = 8;
    private final BuyTogetherDTO dto;

    public BuyTogetherWrapperDTO(BuyTogetherDTO buyTogetherDTO) {
        this.dto = buyTogetherDTO;
    }

    public static /* synthetic */ BuyTogetherWrapperDTO copy$default(BuyTogetherWrapperDTO buyTogetherWrapperDTO, BuyTogetherDTO buyTogetherDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buyTogetherDTO = buyTogetherWrapperDTO.dto;
        }
        return buyTogetherWrapperDTO.copy(buyTogetherDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final BuyTogetherDTO getDto() {
        return this.dto;
    }

    @NotNull
    public final BuyTogetherWrapperDTO copy(BuyTogetherDTO dto) {
        return new BuyTogetherWrapperDTO(dto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BuyTogetherWrapperDTO) && Intrinsics.d(this.dto, ((BuyTogetherWrapperDTO) other).dto);
    }

    public final BuyTogetherDTO getDto() {
        return this.dto;
    }

    public int hashCode() {
        BuyTogetherDTO buyTogetherDTO = this.dto;
        if (buyTogetherDTO == null) {
            return 0;
        }
        return buyTogetherDTO.hashCode();
    }

    @NotNull
    public String toString() {
        return "BuyTogetherWrapperDTO(dto=" + this.dto + ")";
    }
}
