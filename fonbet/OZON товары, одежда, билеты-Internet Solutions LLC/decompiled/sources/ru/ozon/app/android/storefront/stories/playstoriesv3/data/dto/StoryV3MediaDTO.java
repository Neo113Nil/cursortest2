package ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3MediaDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3TypeDTO;", "items", "", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ItemDTO;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryV3MediaDTO extends StoryV3TypeDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<StoryV3ItemDTO> items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryV3MediaDTO(@NotNull List<StoryV3ItemDTO> items) {
        super(null);
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryV3MediaDTO copy$default(StoryV3MediaDTO storyV3MediaDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = storyV3MediaDTO.items;
        }
        return storyV3MediaDTO.copy(list);
    }

    @NotNull
    public final List<StoryV3ItemDTO> component1() {
        return this.items;
    }

    @NotNull
    public final StoryV3MediaDTO copy(@NotNull List<StoryV3ItemDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new StoryV3MediaDTO(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StoryV3MediaDTO) && Intrinsics.d(this.items, ((StoryV3MediaDTO) other).items);
    }

    @NotNull
    public final List<StoryV3ItemDTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("StoryV3MediaDTO(items=", ")", this.items);
    }
}
