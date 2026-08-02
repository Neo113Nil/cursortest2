package ru.ozon.app.android.search.widgets.tapTags.v2.core;

import C.o0;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\bHÆ\u0003J6\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v2/core/TapTagsV2DTO;", "", "items", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "maxRows", "", "searchText", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getMaxRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSearchText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/search/widgets/tapTags/v2/core/TapTagsV2DTO;", "equals", "", "other", "hashCode", "toString", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TapTagsV2DTO {
    private final List<TagButtonDTO> items;
    private final Integer maxRows;

    @NotNull
    private final String searchText;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v2/core/TapTagsV2DTO$Companion;", "", "<init>", "()V", "createEmptyDTO", "Lru/ozon/app/android/search/widgets/tapTags/v2/core/TapTagsV2DTO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TapTagsV2DTO createEmptyDTO() {
            return new TapTagsV2DTO(K.f71697a, null, "");
        }

        private Companion() {
        }
    }

    public TapTagsV2DTO(List<TagButtonDTO> list, Integer num, @NotNull String searchText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.items = list;
        this.maxRows = num;
        this.searchText = searchText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TapTagsV2DTO copy$default(TapTagsV2DTO tapTagsV2DTO, List list, Integer num, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tapTagsV2DTO.items;
        }
        if ((i11 & 2) != 0) {
            num = tapTagsV2DTO.maxRows;
        }
        if ((i11 & 4) != 0) {
            str = tapTagsV2DTO.searchText;
        }
        return tapTagsV2DTO.copy(list, num, str);
    }

    public final List<TagButtonDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMaxRows() {
        return this.maxRows;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    @NotNull
    public final TapTagsV2DTO copy(List<TagButtonDTO> items, Integer maxRows, @NotNull String searchText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        return new TapTagsV2DTO(items, maxRows, searchText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapTagsV2DTO)) {
            return false;
        }
        TapTagsV2DTO tapTagsV2DTO = (TapTagsV2DTO) other;
        return Intrinsics.d(this.items, tapTagsV2DTO.items) && Intrinsics.d(this.maxRows, tapTagsV2DTO.maxRows) && Intrinsics.d(this.searchText, tapTagsV2DTO.searchText);
    }

    public final List<TagButtonDTO> getItems() {
        return this.items;
    }

    public final Integer getMaxRows() {
        return this.maxRows;
    }

    @NotNull
    public final String getSearchText() {
        return this.searchText;
    }

    public int hashCode() {
        List<TagButtonDTO> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.maxRows;
        return this.searchText.hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        List<TagButtonDTO> list = this.items;
        Integer num = this.maxRows;
        String str = this.searchText;
        StringBuilder sb2 = new StringBuilder("TapTagsV2DTO(items=");
        sb2.append(list);
        sb2.append(", maxRows=");
        sb2.append(num);
        sb2.append(", searchText=");
        return o0.c(sb2, str, ")");
    }
}
