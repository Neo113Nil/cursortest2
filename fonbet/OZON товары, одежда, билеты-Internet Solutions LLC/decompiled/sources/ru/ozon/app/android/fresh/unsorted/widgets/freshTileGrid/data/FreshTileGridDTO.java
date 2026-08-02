package ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.data;

import C.o0;
import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.header.CommonHeaderDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/data/FreshTileGridDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;", "items", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO;", "backgroundColor", "", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;Ljava/util/List;Ljava/lang/String;)V", "getHeader", "()Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;", "getItems", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshTileGridDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;
    private final CommonHeaderDTO header;

    @NotNull
    private final List<FreshTileDTO> items;

    public FreshTileGridDTO(CommonHeaderDTO commonHeaderDTO, @NotNull List<FreshTileDTO> items, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.header = commonHeaderDTO;
        this.items = items;
        this.backgroundColor = backgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreshTileGridDTO copy$default(FreshTileGridDTO freshTileGridDTO, CommonHeaderDTO commonHeaderDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonHeaderDTO = freshTileGridDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = freshTileGridDTO.items;
        }
        if ((i11 & 4) != 0) {
            str = freshTileGridDTO.backgroundColor;
        }
        return freshTileGridDTO.copy(commonHeaderDTO, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonHeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<FreshTileDTO> component2() {
        return this.items;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final FreshTileGridDTO copy(CommonHeaderDTO header, @NotNull List<FreshTileDTO> items, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new FreshTileGridDTO(header, items, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshTileGridDTO)) {
            return false;
        }
        FreshTileGridDTO freshTileGridDTO = (FreshTileGridDTO) other;
        return Intrinsics.d(this.header, freshTileGridDTO.header) && Intrinsics.d(this.items, freshTileGridDTO.items) && Intrinsics.d(this.backgroundColor, freshTileGridDTO.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonHeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<FreshTileDTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        CommonHeaderDTO commonHeaderDTO = this.header;
        return this.backgroundColor.hashCode() + g.b((commonHeaderDTO == null ? 0 : commonHeaderDTO.hashCode()) * 31, 31, this.items);
    }

    @NotNull
    public String toString() {
        CommonHeaderDTO commonHeaderDTO = this.header;
        List<FreshTileDTO> list = this.items;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("FreshTileGridDTO(header=");
        sb2.append(commonHeaderDTO);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str, ")");
    }

    public FreshTileGridDTO(CommonHeaderDTO commonHeaderDTO, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(commonHeaderDTO, (i11 & 2) != 0 ? K.f71697a : list, (i11 & 4) != 0 ? UniColors.LAYER_FLOOR_1.getToken() : str);
    }
}
