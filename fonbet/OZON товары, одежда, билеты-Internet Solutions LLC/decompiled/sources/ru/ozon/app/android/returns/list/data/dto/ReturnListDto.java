package ru.ozon.app.android.returns.list.data.dto;

import H3.c;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/returns/list/data/dto/ReturnListDto;", "", "items", "", "Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnListDto {
    public static final int $stable = 8;

    @NotNull
    private final List<ReturnPreviewDto> items;

    public ReturnListDto(@i(name = "items") @NotNull List<ReturnPreviewDto> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnListDto copy$default(ReturnListDto returnListDto, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = returnListDto.items;
        }
        return returnListDto.copy(list);
    }

    @NotNull
    public final List<ReturnPreviewDto> component1() {
        return this.items;
    }

    @NotNull
    public final ReturnListDto copy(@i(name = "items") @NotNull List<ReturnPreviewDto> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ReturnListDto(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReturnListDto) && Intrinsics.d(this.items, ((ReturnListDto) other).items);
    }

    @NotNull
    public final List<ReturnPreviewDto> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("ReturnListDto(items=", ")", this.items);
    }
}
