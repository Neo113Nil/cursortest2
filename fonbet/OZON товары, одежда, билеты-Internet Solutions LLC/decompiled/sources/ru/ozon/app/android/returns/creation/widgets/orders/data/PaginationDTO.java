package ru.ozon.app.android.returns.creation.widgets.orders.data;

import De.C2859b;
import Ep.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/orders/data/PaginationDTO;", "", "previous", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "next", "scrollKey", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Integer;)V", "getPrevious", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNext", "getScrollKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Integer;)Lru/ozon/app/android/returns/creation/widgets/orders/data/PaginationDTO;", "equals", "", "other", "hashCode", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaginationDTO {
    public static final int $stable = 0;

    @NotNull
    private final ButtonV3DTO next;

    @NotNull
    private final ButtonV3DTO previous;
    private final Integer scrollKey;

    public PaginationDTO(@NotNull ButtonV3DTO previous, @NotNull ButtonV3DTO next, Integer num) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(next, "next");
        this.previous = previous;
        this.next = next;
        this.scrollKey = num;
    }

    public static /* synthetic */ PaginationDTO copy$default(PaginationDTO paginationDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = paginationDTO.previous;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO2 = paginationDTO.next;
        }
        if ((i11 & 4) != 0) {
            num = paginationDTO.scrollKey;
        }
        return paginationDTO.copy(buttonV3DTO, buttonV3DTO2, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getPrevious() {
        return this.previous;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getNext() {
        return this.next;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getScrollKey() {
        return this.scrollKey;
    }

    @NotNull
    public final PaginationDTO copy(@NotNull ButtonV3DTO previous, @NotNull ButtonV3DTO next, Integer scrollKey) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(next, "next");
        return new PaginationDTO(previous, next, scrollKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginationDTO)) {
            return false;
        }
        PaginationDTO paginationDTO = (PaginationDTO) other;
        return Intrinsics.d(this.previous, paginationDTO.previous) && Intrinsics.d(this.next, paginationDTO.next) && Intrinsics.d(this.scrollKey, paginationDTO.scrollKey);
    }

    @NotNull
    public final ButtonV3DTO getNext() {
        return this.next;
    }

    @NotNull
    public final ButtonV3DTO getPrevious() {
        return this.previous;
    }

    public final Integer getScrollKey() {
        return this.scrollKey;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.next, this.previous.hashCode() * 31, 31);
        Integer num = this.scrollKey;
        return c11 + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        ButtonV3DTO buttonV3DTO = this.previous;
        ButtonV3DTO buttonV3DTO2 = this.next;
        Integer num = this.scrollKey;
        StringBuilder sb2 = new StringBuilder("PaginationDTO(previous=");
        sb2.append(buttonV3DTO);
        sb2.append(", next=");
        sb2.append(buttonV3DTO2);
        sb2.append(", scrollKey=");
        return a.c(sb2, num, ")");
    }

    public /* synthetic */ PaginationDTO(ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonV3DTO, buttonV3DTO2, (i11 & 4) != 0 ? null : num);
    }
}
