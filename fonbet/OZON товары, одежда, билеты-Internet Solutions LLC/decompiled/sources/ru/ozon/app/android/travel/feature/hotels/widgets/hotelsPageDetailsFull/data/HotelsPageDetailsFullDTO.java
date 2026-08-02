package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.data;

import B90.C2619v;
import G.g;
import H3.c;
import I0.C3173b;
import T7.P;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO;", "", "hotelDetails", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$HotelDetails;", "showMoreButtonTitle", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getHotelDetails", "()Ljava/util/List;", "getShowMoreButtonTitle", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "HotelDetails", "Info", "ServicesWrapper", "Services", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageDetailsFullDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<HotelDetails> hotelDetails;
    private final String showMoreButtonTitle;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$HotelDetails;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "info", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$Info;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$Info;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$Info;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HotelDetails {
        public static final int $stable = 8;

        @NotNull
        private final TextAtom header;

        @NotNull
        private final Info info;

        public HotelDetails(@NotNull TextAtom header, @NotNull Info info) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(info, "info");
            this.header = header;
            this.info = info;
        }

        public static /* synthetic */ HotelDetails copy$default(HotelDetails hotelDetails, TextAtom textAtom, Info info, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = hotelDetails.header;
            }
            if ((i11 & 2) != 0) {
                info = hotelDetails.info;
            }
            return hotelDetails.copy(textAtom, info);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getHeader() {
            return this.header;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Info getInfo() {
            return this.info;
        }

        @NotNull
        public final HotelDetails copy(@NotNull TextAtom header, @NotNull Info info) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(info, "info");
            return new HotelDetails(header, info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HotelDetails)) {
                return false;
            }
            HotelDetails hotelDetails = (HotelDetails) other;
            return Intrinsics.d(this.header, hotelDetails.header) && Intrinsics.d(this.info, hotelDetails.info);
        }

        @NotNull
        public final TextAtom getHeader() {
            return this.header;
        }

        @NotNull
        public final Info getInfo() {
            return this.info;
        }

        public int hashCode() {
            return this.info.hashCode() + (this.header.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "HotelDetails(header=" + this.header + ", info=" + this.info + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$Info;", "", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "servicesWrapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$ServicesWrapper;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$ServicesWrapper;)V", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getServicesWrapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$ServicesWrapper;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Info {
        public static final int $stable = 8;
        private final TextAtom description;
        private final ServicesWrapper servicesWrapper;

        public Info(TextAtom textAtom, ServicesWrapper servicesWrapper) {
            this.description = textAtom;
            this.servicesWrapper = servicesWrapper;
        }

        public static /* synthetic */ Info copy$default(Info info, TextAtom textAtom, ServicesWrapper servicesWrapper, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = info.description;
            }
            if ((i11 & 2) != 0) {
                servicesWrapper = info.servicesWrapper;
            }
            return info.copy(textAtom, servicesWrapper);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final ServicesWrapper getServicesWrapper() {
            return this.servicesWrapper;
        }

        @NotNull
        public final Info copy(TextAtom description, ServicesWrapper servicesWrapper) {
            return new Info(description, servicesWrapper);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.d(this.description, info.description) && Intrinsics.d(this.servicesWrapper, info.servicesWrapper);
        }

        public final TextAtom getDescription() {
            return this.description;
        }

        public final ServicesWrapper getServicesWrapper() {
            return this.servicesWrapper;
        }

        public int hashCode() {
            TextAtom textAtom = this.description;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            ServicesWrapper servicesWrapper = this.servicesWrapper;
            return hashCode + (servicesWrapper != null ? servicesWrapper.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Info(description=" + this.description + ", servicesWrapper=" + this.servicesWrapper + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$Services;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "fullServicesSet", "", "shortServicesSet", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getFullServicesSet", "()Ljava/lang/String;", "getShortServicesSet", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Services {
        public static final int $stable = TextAtom.$stable | Icon.$stable;

        @NotNull
        private final String fullServicesSet;

        @NotNull
        private final Icon icon;
        private final String shortServicesSet;

        @NotNull
        private final TextAtom title;

        public Services(@NotNull Icon icon, @NotNull TextAtom title, @NotNull String fullServicesSet, String str) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(fullServicesSet, "fullServicesSet");
            this.icon = icon;
            this.title = title;
            this.fullServicesSet = fullServicesSet;
            this.shortServicesSet = str;
        }

        public static /* synthetic */ Services copy$default(Services services, Icon icon, TextAtom textAtom, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = services.icon;
            }
            if ((i11 & 2) != 0) {
                textAtom = services.title;
            }
            if ((i11 & 4) != 0) {
                str = services.fullServicesSet;
            }
            if ((i11 & 8) != 0) {
                str2 = services.shortServicesSet;
            }
            return services.copy(icon, textAtom, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getFullServicesSet() {
            return this.fullServicesSet;
        }

        /* renamed from: component4, reason: from getter */
        public final String getShortServicesSet() {
            return this.shortServicesSet;
        }

        @NotNull
        public final Services copy(@NotNull Icon icon, @NotNull TextAtom title, @NotNull String fullServicesSet, String shortServicesSet) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(fullServicesSet, "fullServicesSet");
            return new Services(icon, title, fullServicesSet, shortServicesSet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Services)) {
                return false;
            }
            Services services = (Services) other;
            return Intrinsics.d(this.icon, services.icon) && Intrinsics.d(this.title, services.title) && Intrinsics.d(this.fullServicesSet, services.fullServicesSet) && Intrinsics.d(this.shortServicesSet, services.shortServicesSet);
        }

        @NotNull
        public final String getFullServicesSet() {
            return this.fullServicesSet;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public final String getShortServicesSet() {
            return this.shortServicesSet;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(C2619v.b(this.icon.hashCode() * 31, 31, this.title), 31, this.fullServicesSet);
            String str = this.shortServicesSet;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            Icon icon = this.icon;
            TextAtom textAtom = this.title;
            String str = this.fullServicesSet;
            String str2 = this.shortServicesSet;
            StringBuilder sb2 = new StringBuilder("Services(icon=");
            sb2.append(icon);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", fullServicesSet=");
            return C3173b.c(sb2, str, ", shortServicesSet=", str2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$ServicesWrapper;", "", ResultDTO.CONTENT_TYPE_SERVICES, "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$Services;", "<init>", "(Ljava/util/List;)V", "getServices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServicesWrapper {
        public static final int $stable = 8;

        @NotNull
        private final List<Services> services;

        public ServicesWrapper(@NotNull List<Services> services) {
            Intrinsics.checkNotNullParameter(services, "services");
            this.services = services;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ServicesWrapper copy$default(ServicesWrapper servicesWrapper, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = servicesWrapper.services;
            }
            return servicesWrapper.copy(list);
        }

        @NotNull
        public final List<Services> component1() {
            return this.services;
        }

        @NotNull
        public final ServicesWrapper copy(@NotNull List<Services> services) {
            Intrinsics.checkNotNullParameter(services, "services");
            return new ServicesWrapper(services);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ServicesWrapper) && Intrinsics.d(this.services, ((ServicesWrapper) other).services);
        }

        @NotNull
        public final List<Services> getServices() {
            return this.services;
        }

        public int hashCode() {
            return this.services.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("ServicesWrapper(services=", ")", this.services);
        }
    }

    public HotelsPageDetailsFullDTO(@NotNull List<HotelDetails> hotelDetails, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(hotelDetails, "hotelDetails");
        this.hotelDetails = hotelDetails;
        this.showMoreButtonTitle = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsPageDetailsFullDTO copy$default(HotelsPageDetailsFullDTO hotelsPageDetailsFullDTO, List list, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsPageDetailsFullDTO.hotelDetails;
        }
        if ((i11 & 2) != 0) {
            str = hotelsPageDetailsFullDTO.showMoreButtonTitle;
        }
        if ((i11 & 4) != 0) {
            map = hotelsPageDetailsFullDTO.trackingInfo;
        }
        return hotelsPageDetailsFullDTO.copy(list, str, map);
    }

    @NotNull
    public final List<HotelDetails> component1() {
        return this.hotelDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final String getShowMoreButtonTitle() {
        return this.showMoreButtonTitle;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsPageDetailsFullDTO copy(@NotNull List<HotelDetails> hotelDetails, String showMoreButtonTitle, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(hotelDetails, "hotelDetails");
        return new HotelsPageDetailsFullDTO(hotelDetails, showMoreButtonTitle, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageDetailsFullDTO)) {
            return false;
        }
        HotelsPageDetailsFullDTO hotelsPageDetailsFullDTO = (HotelsPageDetailsFullDTO) other;
        return Intrinsics.d(this.hotelDetails, hotelsPageDetailsFullDTO.hotelDetails) && Intrinsics.d(this.showMoreButtonTitle, hotelsPageDetailsFullDTO.showMoreButtonTitle) && Intrinsics.d(this.trackingInfo, hotelsPageDetailsFullDTO.trackingInfo);
    }

    @NotNull
    public final List<HotelDetails> getHotelDetails() {
        return this.hotelDetails;
    }

    public final String getShowMoreButtonTitle() {
        return this.showMoreButtonTitle;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.hotelDetails.hashCode() * 31;
        String str = this.showMoreButtonTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<HotelDetails> list = this.hotelDetails;
        String str = this.showMoreButtonTitle;
        return P.f(C4055a.a("HotelsPageDetailsFullDTO(hotelDetails=", ", showMoreButtonTitle=", str, ", trackingInfo=", list), this.trackingInfo, ")");
    }
}
