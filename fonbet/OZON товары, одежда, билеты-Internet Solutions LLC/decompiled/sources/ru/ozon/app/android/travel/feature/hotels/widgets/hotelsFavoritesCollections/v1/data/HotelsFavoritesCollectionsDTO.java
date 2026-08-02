package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.data;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ6\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0005\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0007\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/data/HotelsFavoritesCollectionsDTO;", "", "collections", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/data/HotelsFavoritesCollectionsDTO$FavCollection;", "isFirstPortion", "", "isLastPortion", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCollections", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/data/HotelsFavoritesCollectionsDTO;", "equals", "other", "hashCode", "", "toString", "", "FavCollection", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsFavoritesCollectionsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<FavCollection> collections;
    private final Boolean isFirstPortion;
    private final Boolean isLastPortion;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/data/HotelsFavoritesCollectionsDTO$FavCollection;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "imagesLinks", "", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getImagesLinks", "()Ljava/util/List;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FavCollection {
        public static final int $stable = 8;
        private final CommonControlSettings common;

        @NotNull
        private final List<String> imagesLinks;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public FavCollection(@NotNull TextDTO title, TextDTO textDTO, @NotNull List<String> imagesLinks, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imagesLinks, "imagesLinks");
            this.title = title;
            this.subtitle = textDTO;
            this.imagesLinks = imagesLinks;
            this.common = commonControlSettings;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FavCollection copy$default(FavCollection favCollection, TextDTO textDTO, TextDTO textDTO2, List list, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = favCollection.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = favCollection.subtitle;
            }
            if ((i11 & 4) != 0) {
                list = favCollection.imagesLinks;
            }
            if ((i11 & 8) != 0) {
                commonControlSettings = favCollection.common;
            }
            return favCollection.copy(textDTO, textDTO2, list, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final List<String> component3() {
            return this.imagesLinks;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final FavCollection copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull List<String> imagesLinks, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imagesLinks, "imagesLinks");
            return new FavCollection(title, subtitle, imagesLinks, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FavCollection)) {
                return false;
            }
            FavCollection favCollection = (FavCollection) other;
            return Intrinsics.d(this.title, favCollection.title) && Intrinsics.d(this.subtitle, favCollection.subtitle) && Intrinsics.d(this.imagesLinks, favCollection.imagesLinks) && Intrinsics.d(this.common, favCollection.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final List<String> getImagesLinks() {
            return this.imagesLinks;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int b11 = g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.imagesLinks);
            CommonControlSettings commonControlSettings = this.common;
            return b11 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            List<String> list = this.imagesLinks;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder g10 = D3.g.g("FavCollection(title=", textDTO, ", subtitle=", textDTO2, ", imagesLinks=");
            g10.append(list);
            g10.append(", common=");
            g10.append(commonControlSettings);
            g10.append(")");
            return g10.toString();
        }
    }

    public HotelsFavoritesCollectionsDTO(@NotNull List<FavCollection> collections, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(collections, "collections");
        this.collections = collections;
        this.isFirstPortion = bool;
        this.isLastPortion = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsFavoritesCollectionsDTO copy$default(HotelsFavoritesCollectionsDTO hotelsFavoritesCollectionsDTO, List list, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsFavoritesCollectionsDTO.collections;
        }
        if ((i11 & 2) != 0) {
            bool = hotelsFavoritesCollectionsDTO.isFirstPortion;
        }
        if ((i11 & 4) != 0) {
            bool2 = hotelsFavoritesCollectionsDTO.isLastPortion;
        }
        return hotelsFavoritesCollectionsDTO.copy(list, bool, bool2);
    }

    @NotNull
    public final List<FavCollection> component1() {
        return this.collections;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsFirstPortion() {
        return this.isFirstPortion;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsLastPortion() {
        return this.isLastPortion;
    }

    @NotNull
    public final HotelsFavoritesCollectionsDTO copy(@NotNull List<FavCollection> collections, Boolean isFirstPortion, Boolean isLastPortion) {
        Intrinsics.checkNotNullParameter(collections, "collections");
        return new HotelsFavoritesCollectionsDTO(collections, isFirstPortion, isLastPortion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsFavoritesCollectionsDTO)) {
            return false;
        }
        HotelsFavoritesCollectionsDTO hotelsFavoritesCollectionsDTO = (HotelsFavoritesCollectionsDTO) other;
        return Intrinsics.d(this.collections, hotelsFavoritesCollectionsDTO.collections) && Intrinsics.d(this.isFirstPortion, hotelsFavoritesCollectionsDTO.isFirstPortion) && Intrinsics.d(this.isLastPortion, hotelsFavoritesCollectionsDTO.isLastPortion);
    }

    @NotNull
    public final List<FavCollection> getCollections() {
        return this.collections;
    }

    public int hashCode() {
        int hashCode = this.collections.hashCode() * 31;
        Boolean bool = this.isFirstPortion;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isLastPortion;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isFirstPortion() {
        return this.isFirstPortion;
    }

    public final Boolean isLastPortion() {
        return this.isLastPortion;
    }

    @NotNull
    public String toString() {
        List<FavCollection> list = this.collections;
        Boolean bool = this.isFirstPortion;
        Boolean bool2 = this.isLastPortion;
        StringBuilder sb2 = new StringBuilder("HotelsFavoritesCollectionsDTO(collections=");
        sb2.append(list);
        sb2.append(", isFirstPortion=");
        sb2.append(bool);
        sb2.append(", isLastPortion=");
        return D3.g.d(sb2, bool2, ")");
    }
}
