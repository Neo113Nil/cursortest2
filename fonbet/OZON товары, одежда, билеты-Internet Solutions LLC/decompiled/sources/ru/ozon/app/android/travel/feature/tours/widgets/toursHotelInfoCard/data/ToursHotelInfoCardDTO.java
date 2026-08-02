package ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.data;

import B90.C2618u;
import Bl.b;
import Cm.e;
import G.g;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001$BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "", "descriptionRepresentation", "Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardDTO$DescriptionInfo;", "hotelFeatures", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "cells", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardDTO$DescriptionInfo;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "()Ljava/lang/String;", "getDescriptionRepresentation", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardDTO$DescriptionInfo;", "getHotelFeatures", "()Ljava/util/List;", "getCells", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "DescriptionInfo", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursHotelInfoCardDTO {
    public static final int $stable = 8;
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> cells;
    private final String description;
    private final DescriptionInfo descriptionRepresentation;
    private final List<Badge> hotelFeatures;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/data/ToursHotelInfoCardDTO$DescriptionInfo;", "", "shortFormLettersCount", "", "showFullButtonText", "", "hideFullButtonText", "showFullButtonTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getShortFormLettersCount", "()I", "getShowFullButtonText", "()Ljava/lang/String;", "getHideFullButtonText", "getShowFullButtonTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DescriptionInfo {
        public static final int $stable = 8;

        @NotNull
        private final String hideFullButtonText;
        private final int shortFormLettersCount;

        @NotNull
        private final String showFullButtonText;
        private final Map<String, TokenizedTrackingInfo> showFullButtonTrackingInfo;

        public DescriptionInfo(int i11, @NotNull String showFullButtonText, @NotNull String hideFullButtonText, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(showFullButtonText, "showFullButtonText");
            Intrinsics.checkNotNullParameter(hideFullButtonText, "hideFullButtonText");
            this.shortFormLettersCount = i11;
            this.showFullButtonText = showFullButtonText;
            this.hideFullButtonText = hideFullButtonText;
            this.showFullButtonTrackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DescriptionInfo copy$default(DescriptionInfo descriptionInfo, int i11, String str, String str2, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = descriptionInfo.shortFormLettersCount;
            }
            if ((i12 & 2) != 0) {
                str = descriptionInfo.showFullButtonText;
            }
            if ((i12 & 4) != 0) {
                str2 = descriptionInfo.hideFullButtonText;
            }
            if ((i12 & 8) != 0) {
                map = descriptionInfo.showFullButtonTrackingInfo;
            }
            return descriptionInfo.copy(i11, str, str2, map);
        }

        /* renamed from: component1, reason: from getter */
        public final int getShortFormLettersCount() {
            return this.shortFormLettersCount;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getShowFullButtonText() {
            return this.showFullButtonText;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getHideFullButtonText() {
            return this.hideFullButtonText;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.showFullButtonTrackingInfo;
        }

        @NotNull
        public final DescriptionInfo copy(int shortFormLettersCount, @NotNull String showFullButtonText, @NotNull String hideFullButtonText, Map<String, TokenizedTrackingInfo> showFullButtonTrackingInfo) {
            Intrinsics.checkNotNullParameter(showFullButtonText, "showFullButtonText");
            Intrinsics.checkNotNullParameter(hideFullButtonText, "hideFullButtonText");
            return new DescriptionInfo(shortFormLettersCount, showFullButtonText, hideFullButtonText, showFullButtonTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DescriptionInfo)) {
                return false;
            }
            DescriptionInfo descriptionInfo = (DescriptionInfo) other;
            return this.shortFormLettersCount == descriptionInfo.shortFormLettersCount && Intrinsics.d(this.showFullButtonText, descriptionInfo.showFullButtonText) && Intrinsics.d(this.hideFullButtonText, descriptionInfo.hideFullButtonText) && Intrinsics.d(this.showFullButtonTrackingInfo, descriptionInfo.showFullButtonTrackingInfo);
        }

        @NotNull
        public final String getHideFullButtonText() {
            return this.hideFullButtonText;
        }

        public final int getShortFormLettersCount() {
            return this.shortFormLettersCount;
        }

        @NotNull
        public final String getShowFullButtonText() {
            return this.showFullButtonText;
        }

        public final Map<String, TokenizedTrackingInfo> getShowFullButtonTrackingInfo() {
            return this.showFullButtonTrackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(g.a(Integer.hashCode(this.shortFormLettersCount) * 31, 31, this.showFullButtonText), 31, this.hideFullButtonText);
            Map<String, TokenizedTrackingInfo> map = this.showFullButtonTrackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.shortFormLettersCount;
            String str = this.showFullButtonText;
            return C4070a.a(e.g(i11, "DescriptionInfo(shortFormLettersCount=", ", showFullButtonText=", str, ", hideFullButtonText="), this.hideFullButtonText, ", showFullButtonTrackingInfo=", this.showFullButtonTrackingInfo, ")");
        }
    }

    public ToursHotelInfoCardDTO(@NotNull TextAtom title, String str, DescriptionInfo descriptionInfo, List<Badge> list, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> list2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.description = str;
        this.descriptionRepresentation = descriptionInfo;
        this.hotelFeatures = list;
        this.cells = list2;
    }

    public static /* synthetic */ ToursHotelInfoCardDTO copy$default(ToursHotelInfoCardDTO toursHotelInfoCardDTO, TextAtom textAtom, String str, DescriptionInfo descriptionInfo, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = toursHotelInfoCardDTO.title;
        }
        if ((i11 & 2) != 0) {
            str = toursHotelInfoCardDTO.description;
        }
        if ((i11 & 4) != 0) {
            descriptionInfo = toursHotelInfoCardDTO.descriptionRepresentation;
        }
        if ((i11 & 8) != 0) {
            list = toursHotelInfoCardDTO.hotelFeatures;
        }
        if ((i11 & 16) != 0) {
            list2 = toursHotelInfoCardDTO.cells;
        }
        List list3 = list2;
        DescriptionInfo descriptionInfo2 = descriptionInfo;
        return toursHotelInfoCardDTO.copy(textAtom, str, descriptionInfo2, list, list3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final DescriptionInfo getDescriptionRepresentation() {
        return this.descriptionRepresentation;
    }

    public final List<Badge> component4() {
        return this.hotelFeatures;
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> component5() {
        return this.cells;
    }

    @NotNull
    public final ToursHotelInfoCardDTO copy(@NotNull TextAtom title, String description, DescriptionInfo descriptionRepresentation, List<Badge> hotelFeatures, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> cells) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ToursHotelInfoCardDTO(title, description, descriptionRepresentation, hotelFeatures, cells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursHotelInfoCardDTO)) {
            return false;
        }
        ToursHotelInfoCardDTO toursHotelInfoCardDTO = (ToursHotelInfoCardDTO) other;
        return Intrinsics.d(this.title, toursHotelInfoCardDTO.title) && Intrinsics.d(this.description, toursHotelInfoCardDTO.description) && Intrinsics.d(this.descriptionRepresentation, toursHotelInfoCardDTO.descriptionRepresentation) && Intrinsics.d(this.hotelFeatures, toursHotelInfoCardDTO.hotelFeatures) && Intrinsics.d(this.cells, toursHotelInfoCardDTO.cells);
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> getCells() {
        return this.cells;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DescriptionInfo getDescriptionRepresentation() {
        return this.descriptionRepresentation;
    }

    public final List<Badge> getHotelFeatures() {
        return this.hotelFeatures;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DescriptionInfo descriptionInfo = this.descriptionRepresentation;
        int hashCode3 = (hashCode2 + (descriptionInfo == null ? 0 : descriptionInfo.hashCode())) * 31;
        List<Badge> list = this.hotelFeatures;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> list2 = this.cells;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        String str = this.description;
        DescriptionInfo descriptionInfo = this.descriptionRepresentation;
        List<Badge> list = this.hotelFeatures;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> list2 = this.cells;
        StringBuilder d11 = b.d("ToursHotelInfoCardDTO(title=", ", description=", str, ", descriptionRepresentation=", textAtom);
        d11.append(descriptionInfo);
        d11.append(", hotelFeatures=");
        d11.append(list);
        d11.append(", cells=");
        return C2618u.h(d11, list2, ")");
    }
}
