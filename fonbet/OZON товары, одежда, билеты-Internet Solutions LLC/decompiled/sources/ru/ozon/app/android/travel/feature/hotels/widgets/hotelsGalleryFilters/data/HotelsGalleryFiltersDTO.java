package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.data;

import G.g;
import Gl.C3124a;
import H3.c;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO;", "", "items", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO$FiltersItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FiltersItem", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsGalleryFiltersDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<FiltersItem> items;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO$FiltersItem;", "", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "image", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "tagButton", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getImage", "()Ljava/lang/String;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FiltersItem {
        public static final int $stable = TagButtonDTO.$stable | AspectDTO.$stable;

        @NotNull
        private final AspectDTO aspect;

        @NotNull
        private final BadgeDTO badge;

        @NotNull
        private final String image;

        @NotNull
        private final TagButtonDTO tagButton;

        @NotNull
        private final TextDTO title;

        public FiltersItem(@NotNull AspectDTO aspect, @NotNull String image, @NotNull BadgeDTO badge, @NotNull TextDTO title, @NotNull TagButtonDTO tagButton) {
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            this.aspect = aspect;
            this.image = image;
            this.badge = badge;
            this.title = title;
            this.tagButton = tagButton;
        }

        public static /* synthetic */ FiltersItem copy$default(FiltersItem filtersItem, AspectDTO aspectDTO, String str, BadgeDTO badgeDTO, TextDTO textDTO, TagButtonDTO tagButtonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aspectDTO = filtersItem.aspect;
            }
            if ((i11 & 2) != 0) {
                str = filtersItem.image;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = filtersItem.badge;
            }
            if ((i11 & 8) != 0) {
                textDTO = filtersItem.title;
            }
            if ((i11 & 16) != 0) {
                tagButtonDTO = filtersItem.tagButton;
            }
            TagButtonDTO tagButtonDTO2 = tagButtonDTO;
            BadgeDTO badgeDTO2 = badgeDTO;
            return filtersItem.copy(aspectDTO, str, badgeDTO2, textDTO, tagButtonDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TagButtonDTO getTagButton() {
            return this.tagButton;
        }

        @NotNull
        public final FiltersItem copy(@NotNull AspectDTO aspect, @NotNull String image, @NotNull BadgeDTO badge, @NotNull TextDTO title, @NotNull TagButtonDTO tagButton) {
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            return new FiltersItem(aspect, image, badge, title, tagButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FiltersItem)) {
                return false;
            }
            FiltersItem filtersItem = (FiltersItem) other;
            return Intrinsics.d(this.aspect, filtersItem.aspect) && Intrinsics.d(this.image, filtersItem.image) && Intrinsics.d(this.badge, filtersItem.badge) && Intrinsics.d(this.title, filtersItem.title) && Intrinsics.d(this.tagButton, filtersItem.tagButton);
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final TagButtonDTO getTagButton() {
            return this.tagButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.tagButton.hashCode() + b.a(this.title, C3124a.c(this.badge, g.a(this.aspect.hashCode() * 31, 31, this.image), 31), 31);
        }

        @NotNull
        public String toString() {
            return "FiltersItem(aspect=" + this.aspect + ", image=" + this.image + ", badge=" + this.badge + ", title=" + this.title + ", tagButton=" + this.tagButton + ")";
        }
    }

    public HotelsGalleryFiltersDTO() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsGalleryFiltersDTO copy$default(HotelsGalleryFiltersDTO hotelsGalleryFiltersDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsGalleryFiltersDTO.items;
        }
        return hotelsGalleryFiltersDTO.copy(list);
    }

    @NotNull
    public final List<FiltersItem> component1() {
        return this.items;
    }

    @NotNull
    public final HotelsGalleryFiltersDTO copy(@NotNull List<FiltersItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new HotelsGalleryFiltersDTO(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HotelsGalleryFiltersDTO) && Intrinsics.d(this.items, ((HotelsGalleryFiltersDTO) other).items);
    }

    @NotNull
    public final List<FiltersItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("HotelsGalleryFiltersDTO(items=", ")", this.items);
    }

    public HotelsGalleryFiltersDTO(@NotNull List<FiltersItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    public HotelsGalleryFiltersDTO(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list);
    }
}
