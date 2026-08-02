package ru.ozon.app.android.travel.molecules.dto.travelSorting;

import G.g;
import Kk.C3532b;
import N3.C3660k;
import T7.P;
import Ul.C4070a;
import c8.C5766e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO;", "", "sortingTypes", "", "Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO$TravelSortingTypeDTO;", "isEnabled", "", "urlBase", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/util/Map;)V", "getSortingTypes", "()Ljava/util/List;", "()Z", "getUrlBase", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "TravelSortingTypeDTO", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelSortingDTO {
    private final boolean isEnabled;

    @NotNull
    private final List<TravelSortingTypeDTO> sortingTypes;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String urlBase;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO$TravelSortingTypeDTO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "isSelected", "", "urlValue", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getName", "()Z", "getUrlValue", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TravelSortingTypeDTO {

        @NotNull
        private final String id;
        private final boolean isSelected;

        @NotNull
        private final String name;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final String urlValue;

        public TravelSortingTypeDTO(@NotNull String id2, @NotNull String name, boolean z11, @NotNull String urlValue, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(urlValue, "urlValue");
            this.id = id2;
            this.name = name;
            this.isSelected = z11;
            this.urlValue = urlValue;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TravelSortingTypeDTO copy$default(TravelSortingTypeDTO travelSortingTypeDTO, String str, String str2, boolean z11, String str3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = travelSortingTypeDTO.id;
            }
            if ((i11 & 2) != 0) {
                str2 = travelSortingTypeDTO.name;
            }
            if ((i11 & 4) != 0) {
                z11 = travelSortingTypeDTO.isSelected;
            }
            if ((i11 & 8) != 0) {
                str3 = travelSortingTypeDTO.urlValue;
            }
            if ((i11 & 16) != 0) {
                map = travelSortingTypeDTO.trackingInfo;
            }
            Map map2 = map;
            boolean z12 = z11;
            return travelSortingTypeDTO.copy(str, str2, z12, str3, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getUrlValue() {
            return this.urlValue;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final TravelSortingTypeDTO copy(@NotNull String id2, @NotNull String name, boolean isSelected, @NotNull String urlValue, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(urlValue, "urlValue");
            return new TravelSortingTypeDTO(id2, name, isSelected, urlValue, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TravelSortingTypeDTO)) {
                return false;
            }
            TravelSortingTypeDTO travelSortingTypeDTO = (TravelSortingTypeDTO) other;
            return Intrinsics.d(this.id, travelSortingTypeDTO.id) && Intrinsics.d(this.name, travelSortingTypeDTO.name) && this.isSelected == travelSortingTypeDTO.isSelected && Intrinsics.d(this.urlValue, travelSortingTypeDTO.urlValue) && Intrinsics.d(this.trackingInfo, travelSortingTypeDTO.trackingInfo);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getUrlValue() {
            return this.urlValue;
        }

        public int hashCode() {
            int a11 = g.a(C3532b.a(g.a(this.id.hashCode() * 31, 31, this.name), 31, this.isSelected), 31, this.urlValue);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.name;
            boolean z11 = this.isSelected;
            String str3 = this.urlValue;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("TravelSortingTypeDTO(id=", str, ", name=", str2, ", isSelected=");
            C5766e.a(", urlValue=", str3, ", trackingInfo=", d11, z11);
            return P.f(d11, map, ")");
        }
    }

    public TravelSortingDTO(@NotNull List<TravelSortingTypeDTO> sortingTypes, boolean z11, @NotNull String urlBase, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(sortingTypes, "sortingTypes");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.sortingTypes = sortingTypes;
        this.isEnabled = z11;
        this.urlBase = urlBase;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelSortingDTO copy$default(TravelSortingDTO travelSortingDTO, List list, boolean z11, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelSortingDTO.sortingTypes;
        }
        if ((i11 & 2) != 0) {
            z11 = travelSortingDTO.isEnabled;
        }
        if ((i11 & 4) != 0) {
            str = travelSortingDTO.urlBase;
        }
        if ((i11 & 8) != 0) {
            map = travelSortingDTO.trackingInfo;
        }
        return travelSortingDTO.copy(list, z11, str, map);
    }

    @NotNull
    public final List<TravelSortingTypeDTO> component1() {
        return this.sortingTypes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUrlBase() {
        return this.urlBase;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelSortingDTO copy(@NotNull List<TravelSortingTypeDTO> sortingTypes, boolean isEnabled, @NotNull String urlBase, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(sortingTypes, "sortingTypes");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        return new TravelSortingDTO(sortingTypes, isEnabled, urlBase, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelSortingDTO)) {
            return false;
        }
        TravelSortingDTO travelSortingDTO = (TravelSortingDTO) other;
        return Intrinsics.d(this.sortingTypes, travelSortingDTO.sortingTypes) && this.isEnabled == travelSortingDTO.isEnabled && Intrinsics.d(this.urlBase, travelSortingDTO.urlBase) && Intrinsics.d(this.trackingInfo, travelSortingDTO.trackingInfo);
    }

    @NotNull
    public final List<TravelSortingTypeDTO> getSortingTypes() {
        return this.sortingTypes;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final String getUrlBase() {
        return this.urlBase;
    }

    public int hashCode() {
        int a11 = g.a(C3532b.a(this.sortingTypes.hashCode() * 31, 31, this.isEnabled), 31, this.urlBase);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        List<TravelSortingTypeDTO> list = this.sortingTypes;
        boolean z11 = this.isEnabled;
        String str = this.urlBase;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TravelSortingDTO(sortingTypes=");
        sb2.append(list);
        sb2.append(", isEnabled=");
        sb2.append(z11);
        sb2.append(", urlBase=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
