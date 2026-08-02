package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.data;

import B90.C2619v;
import HY.a;
import J.d;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/data/TravelCarriageDetailsDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "mainInfo", "serviceInfo", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/data/TravelCarriageDetailsDTO$CarriageServiceInfo;", "additionalInfo", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/data/TravelCarriageDetailsDTO$CarriageServiceInfo;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getMainInfo", "getServiceInfo", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/data/TravelCarriageDetailsDTO$CarriageServiceInfo;", "getAdditionalInfo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CarriageServiceInfo", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCarriageDetailsDTO {
    public static final int $stable = 8;

    @NotNull
    private final TextAtom additionalInfo;

    @NotNull
    private final TextAtom header;

    @NotNull
    private final TextAtom mainInfo;

    @NotNull
    private final CarriageServiceInfo serviceInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/data/TravelCarriageDetailsDTO$CarriageServiceInfo;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", ResultDTO.CONTENT_TYPE_SERVICES, "", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$IconTextMediumListElement;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getServices", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CarriageServiceInfo {
        public static final int $stable = 8;

        @NotNull
        private final List<ListElementAtom.IconTextMediumListElement> services;

        @NotNull
        private final TextAtom title;

        public CarriageServiceInfo(@NotNull TextAtom title, @NotNull List<ListElementAtom.IconTextMediumListElement> services) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(services, "services");
            this.title = title;
            this.services = services;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CarriageServiceInfo copy$default(CarriageServiceInfo carriageServiceInfo, TextAtom textAtom, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = carriageServiceInfo.title;
            }
            if ((i11 & 2) != 0) {
                list = carriageServiceInfo.services;
            }
            return carriageServiceInfo.copy(textAtom, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final List<ListElementAtom.IconTextMediumListElement> component2() {
            return this.services;
        }

        @NotNull
        public final CarriageServiceInfo copy(@NotNull TextAtom title, @NotNull List<ListElementAtom.IconTextMediumListElement> services) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(services, "services");
            return new CarriageServiceInfo(title, services);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarriageServiceInfo)) {
                return false;
            }
            CarriageServiceInfo carriageServiceInfo = (CarriageServiceInfo) other;
            return Intrinsics.d(this.title, carriageServiceInfo.title) && Intrinsics.d(this.services, carriageServiceInfo.services);
        }

        @NotNull
        public final List<ListElementAtom.IconTextMediumListElement> getServices() {
            return this.services;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.services.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.c("CarriageServiceInfo(title=", this.title, ", services=", this.services, ")");
        }
    }

    public TravelCarriageDetailsDTO(@NotNull TextAtom header, @NotNull TextAtom mainInfo, @NotNull CarriageServiceInfo serviceInfo, @NotNull TextAtom additionalInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(mainInfo, "mainInfo");
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.header = header;
        this.mainInfo = mainInfo;
        this.serviceInfo = serviceInfo;
        this.additionalInfo = additionalInfo;
    }

    public static /* synthetic */ TravelCarriageDetailsDTO copy$default(TravelCarriageDetailsDTO travelCarriageDetailsDTO, TextAtom textAtom, TextAtom textAtom2, CarriageServiceInfo carriageServiceInfo, TextAtom textAtom3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelCarriageDetailsDTO.header;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = travelCarriageDetailsDTO.mainInfo;
        }
        if ((i11 & 4) != 0) {
            carriageServiceInfo = travelCarriageDetailsDTO.serviceInfo;
        }
        if ((i11 & 8) != 0) {
            textAtom3 = travelCarriageDetailsDTO.additionalInfo;
        }
        return travelCarriageDetailsDTO.copy(textAtom, textAtom2, carriageServiceInfo, textAtom3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getMainInfo() {
        return this.mainInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CarriageServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getAdditionalInfo() {
        return this.additionalInfo;
    }

    @NotNull
    public final TravelCarriageDetailsDTO copy(@NotNull TextAtom header, @NotNull TextAtom mainInfo, @NotNull CarriageServiceInfo serviceInfo, @NotNull TextAtom additionalInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(mainInfo, "mainInfo");
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return new TravelCarriageDetailsDTO(header, mainInfo, serviceInfo, additionalInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCarriageDetailsDTO)) {
            return false;
        }
        TravelCarriageDetailsDTO travelCarriageDetailsDTO = (TravelCarriageDetailsDTO) other;
        return Intrinsics.d(this.header, travelCarriageDetailsDTO.header) && Intrinsics.d(this.mainInfo, travelCarriageDetailsDTO.mainInfo) && Intrinsics.d(this.serviceInfo, travelCarriageDetailsDTO.serviceInfo) && Intrinsics.d(this.additionalInfo, travelCarriageDetailsDTO.additionalInfo);
    }

    @NotNull
    public final TextAtom getAdditionalInfo() {
        return this.additionalInfo;
    }

    @NotNull
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    public final TextAtom getMainInfo() {
        return this.mainInfo;
    }

    @NotNull
    public final CarriageServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    public int hashCode() {
        return this.additionalInfo.hashCode() + ((this.serviceInfo.hashCode() + C2619v.b(this.header.hashCode() * 31, 31, this.mainInfo)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.header;
        TextAtom textAtom2 = this.mainInfo;
        CarriageServiceInfo carriageServiceInfo = this.serviceInfo;
        TextAtom textAtom3 = this.additionalInfo;
        StringBuilder a11 = a.a("TravelCarriageDetailsDTO(header=", textAtom, ", mainInfo=", textAtom2, ", serviceInfo=");
        a11.append(carriageServiceInfo);
        a11.append(", additionalInfo=");
        a11.append(textAtom3);
        a11.append(")");
        return a11.toString();
    }
}
