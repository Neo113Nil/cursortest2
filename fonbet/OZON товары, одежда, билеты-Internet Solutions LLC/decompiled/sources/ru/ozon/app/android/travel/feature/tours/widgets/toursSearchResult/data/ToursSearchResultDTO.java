package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data;

import B90.C2616s;
import B90.C2619v;
import Fj.c;
import Ih.a;
import Kk.C3532b;
import Sh.b;
import T7.P;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003ABCB\u0087\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J¤\u0001\u0010:\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00032\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\bHÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u0012\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO;", "", "hotels", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$Hotel;", "isAllDone", "", "timeoutDate", "", "timeoutMs", "", "timeoutAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "errorNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "errorMessage", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "lazyLoadAction", "pollingAction", "loaderStates", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$LoaderState;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Ljava/util/Map;)V", "getHotels$annotations", "()V", "getHotels", "()Ljava/util/List;", "()Z", "getTimeoutDate", "()Ljava/lang/String;", "getTimeoutMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimeoutAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getErrorMessage", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "getLazyLoadAction", "getPollingAction", "getLoaderStates", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO;", "equals", "other", "hashCode", "", "toString", "Hotel", "TourOption", "LoaderState", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ToursSearchResultDTO {
    public static final int $stable = 8;

    @NotNull
    private final EmptyStateDTO errorMessage;
    private final NotificationDTO errorNotification;
    private final List<Hotel> hotels;
    private final boolean isAllDone;
    private final AtomActionDTO lazyLoadAction;
    private final List<LoaderState> loaderStates;

    @NotNull
    private final AtomActionDTO pollingAction;
    private final AtomActionDTO timeoutAction;
    private final String timeoutDate;
    private final Long timeoutMs;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J³\u0001\u00101\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$Hotel;", "", "images", "", "", "badges", "Lru/ozon/uni/atoms/data/badge/Badge;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "hotelFeatures", "tourOptions", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$TourOption;", "price", "dates", "selectAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "galleryTrackingInfo", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;)V", "getImages", "()Ljava/util/List;", "getBadges", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getHotelFeatures", "getTourOptions", "getPrice", "getDates", "getSelectAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getGalleryTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Hotel {
        public static final int $stable = 8;
        private final List<Badge> badges;

        @NotNull
        private final TextAtom dates;
        private final TextAtom description;
        private final Map<String, TokenizedTrackingInfo> galleryTrackingInfo;
        private final List<Badge> hotelFeatures;

        @NotNull
        private final List<String> images;

        @NotNull
        private final TextAtom price;

        @NotNull
        private final AtomActionDTO selectAction;

        @NotNull
        private final TextAtom title;
        private final List<TourOption> tourOptions;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Hotel(@NotNull List<String> images, List<Badge> list, @NotNull TextAtom title, TextAtom textAtom, List<Badge> list2, List<TourOption> list3, @NotNull TextAtom price, @NotNull TextAtom dates, @NotNull AtomActionDTO selectAction, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(dates, "dates");
            Intrinsics.checkNotNullParameter(selectAction, "selectAction");
            this.images = images;
            this.badges = list;
            this.title = title;
            this.description = textAtom;
            this.hotelFeatures = list2;
            this.tourOptions = list3;
            this.price = price;
            this.dates = dates;
            this.selectAction = selectAction;
            this.trackingInfo = map;
            this.galleryTrackingInfo = map2;
        }

        public static /* synthetic */ Hotel copy$default(Hotel hotel, List list, List list2, TextAtom textAtom, TextAtom textAtom2, List list3, List list4, TextAtom textAtom3, TextAtom textAtom4, AtomActionDTO atomActionDTO, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = hotel.images;
            }
            if ((i11 & 2) != 0) {
                list2 = hotel.badges;
            }
            if ((i11 & 4) != 0) {
                textAtom = hotel.title;
            }
            if ((i11 & 8) != 0) {
                textAtom2 = hotel.description;
            }
            if ((i11 & 16) != 0) {
                list3 = hotel.hotelFeatures;
            }
            if ((i11 & 32) != 0) {
                list4 = hotel.tourOptions;
            }
            if ((i11 & 64) != 0) {
                textAtom3 = hotel.price;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                textAtom4 = hotel.dates;
            }
            if ((i11 & 256) != 0) {
                atomActionDTO = hotel.selectAction;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = hotel.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                map2 = hotel.galleryTrackingInfo;
            }
            Map map3 = map;
            Map map4 = map2;
            TextAtom textAtom5 = textAtom4;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            List list5 = list4;
            TextAtom textAtom6 = textAtom3;
            List list6 = list3;
            TextAtom textAtom7 = textAtom;
            return hotel.copy(list, list2, textAtom7, textAtom2, list6, list5, textAtom6, textAtom5, atomActionDTO2, map3, map4);
        }

        @NotNull
        public final List<String> component1() {
            return this.images;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component11() {
            return this.galleryTrackingInfo;
        }

        public final List<Badge> component2() {
            return this.badges;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        public final List<Badge> component5() {
            return this.hotelFeatures;
        }

        public final List<TourOption> component6() {
            return this.tourOptions;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final TextAtom getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final TextAtom getDates() {
            return this.dates;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final AtomActionDTO getSelectAction() {
            return this.selectAction;
        }

        @NotNull
        public final Hotel copy(@NotNull List<String> images, List<Badge> badges, @NotNull TextAtom title, TextAtom description, List<Badge> hotelFeatures, List<TourOption> tourOptions, @NotNull TextAtom price, @NotNull TextAtom dates, @NotNull AtomActionDTO selectAction, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> galleryTrackingInfo) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(dates, "dates");
            Intrinsics.checkNotNullParameter(selectAction, "selectAction");
            return new Hotel(images, badges, title, description, hotelFeatures, tourOptions, price, dates, selectAction, trackingInfo, galleryTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hotel)) {
                return false;
            }
            Hotel hotel = (Hotel) other;
            return Intrinsics.d(this.images, hotel.images) && Intrinsics.d(this.badges, hotel.badges) && Intrinsics.d(this.title, hotel.title) && Intrinsics.d(this.description, hotel.description) && Intrinsics.d(this.hotelFeatures, hotel.hotelFeatures) && Intrinsics.d(this.tourOptions, hotel.tourOptions) && Intrinsics.d(this.price, hotel.price) && Intrinsics.d(this.dates, hotel.dates) && Intrinsics.d(this.selectAction, hotel.selectAction) && Intrinsics.d(this.trackingInfo, hotel.trackingInfo) && Intrinsics.d(this.galleryTrackingInfo, hotel.galleryTrackingInfo);
        }

        public final List<Badge> getBadges() {
            return this.badges;
        }

        @NotNull
        public final TextAtom getDates() {
            return this.dates;
        }

        public final TextAtom getDescription() {
            return this.description;
        }

        public final Map<String, TokenizedTrackingInfo> getGalleryTrackingInfo() {
            return this.galleryTrackingInfo;
        }

        public final List<Badge> getHotelFeatures() {
            return this.hotelFeatures;
        }

        @NotNull
        public final List<String> getImages() {
            return this.images;
        }

        @NotNull
        public final TextAtom getPrice() {
            return this.price;
        }

        @NotNull
        public final AtomActionDTO getSelectAction() {
            return this.selectAction;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final List<TourOption> getTourOptions() {
            return this.tourOptions;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.images.hashCode() * 31;
            List<Badge> list = this.badges;
            int b11 = C2619v.b((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.title);
            TextAtom textAtom = this.description;
            int hashCode2 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            List<Badge> list2 = this.hotelFeatures;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<TourOption> list3 = this.tourOptions;
            int b12 = a.b(this.selectAction, C2619v.b(C2619v.b((hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.price), 31, this.dates), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (b12 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.galleryTrackingInfo;
            return hashCode4 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<String> list = this.images;
            List<Badge> list2 = this.badges;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.description;
            List<Badge> list3 = this.hotelFeatures;
            List<TourOption> list4 = this.tourOptions;
            TextAtom textAtom3 = this.price;
            TextAtom textAtom4 = this.dates;
            AtomActionDTO atomActionDTO = this.selectAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.galleryTrackingInfo;
            StringBuilder d11 = c.d("Hotel(images=", list, ", badges=", ", title=", list2);
            C4636t5.c(", description=", ", hotelFeatures=", d11, textAtom, textAtom2);
            C2616s.g(", tourOptions=", ", price=", d11, list3, list4);
            C4636t5.c(", dates=", ", selectAction=", d11, textAtom3, textAtom4);
            b.f(d11, atomActionDTO, ", trackingInfo=", map, ", galleryTrackingInfo=");
            return P.f(d11, map2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$LoaderState;", "", "percent", "", "text", "", "<init>", "(ILjava/lang/String;)V", "getPercent", "()I", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoaderState {
        public static final int $stable = 0;
        private final int percent;

        @NotNull
        private final String text;

        public LoaderState(int i11, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.percent = i11;
            this.text = text;
        }

        public static /* synthetic */ LoaderState copy$default(LoaderState loaderState, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = loaderState.percent;
            }
            if ((i12 & 2) != 0) {
                str = loaderState.text;
            }
            return loaderState.copy(i11, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final LoaderState copy(int percent, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new LoaderState(percent, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoaderState)) {
                return false;
            }
            LoaderState loaderState = (LoaderState) other;
            return this.percent == loaderState.percent && Intrinsics.d(this.text, loaderState.text);
        }

        public final int getPercent() {
            return this.percent;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (Integer.hashCode(this.percent) * 31);
        }

        @NotNull
        public String toString() {
            return Nh.a.c(this.percent, "LoaderState(percent=", ", text=", this.text, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$TourOption;", "", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "date", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "selectAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getPrice", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDate", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getSelectAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TourOption {
        public static final int $stable = 8;

        @NotNull
        private final TextAtom date;

        @NotNull
        private final Icon icon;

        @NotNull
        private final TextAtom price;

        @NotNull
        private final AtomActionDTO selectAction;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public TourOption(@NotNull TextAtom price, @NotNull TextAtom date, @NotNull Icon icon, @NotNull AtomActionDTO selectAction, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(selectAction, "selectAction");
            this.price = price;
            this.date = date;
            this.icon = icon;
            this.selectAction = selectAction;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TourOption copy$default(TourOption tourOption, TextAtom textAtom, TextAtom textAtom2, Icon icon, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = tourOption.price;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = tourOption.date;
            }
            if ((i11 & 4) != 0) {
                icon = tourOption.icon;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = tourOption.selectAction;
            }
            if ((i11 & 16) != 0) {
                map = tourOption.trackingInfo;
            }
            Map map2 = map;
            Icon icon2 = icon;
            return tourOption.copy(textAtom, textAtom2, icon2, atomActionDTO, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getDate() {
            return this.date;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getSelectAction() {
            return this.selectAction;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final TourOption copy(@NotNull TextAtom price, @NotNull TextAtom date, @NotNull Icon icon, @NotNull AtomActionDTO selectAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(selectAction, "selectAction");
            return new TourOption(price, date, icon, selectAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TourOption)) {
                return false;
            }
            TourOption tourOption = (TourOption) other;
            return Intrinsics.d(this.price, tourOption.price) && Intrinsics.d(this.date, tourOption.date) && Intrinsics.d(this.icon, tourOption.icon) && Intrinsics.d(this.selectAction, tourOption.selectAction) && Intrinsics.d(this.trackingInfo, tourOption.trackingInfo);
        }

        @NotNull
        public final TextAtom getDate() {
            return this.date;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getPrice() {
            return this.price;
        }

        @NotNull
        public final AtomActionDTO getSelectAction() {
            return this.selectAction;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.selectAction, Lc.a.a(this.icon, C2619v.b(this.price.hashCode() * 31, 31, this.date), 31), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.price;
            TextAtom textAtom2 = this.date;
            Icon icon = this.icon;
            AtomActionDTO atomActionDTO = this.selectAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder a11 = HY.a.a("TourOption(price=", textAtom, ", date=", textAtom2, ", icon=");
            a11.append(icon);
            a11.append(", selectAction=");
            a11.append(atomActionDTO);
            a11.append(", trackingInfo=");
            return P.f(a11, map, ")");
        }
    }

    public ToursSearchResultDTO(List<Hotel> list, boolean z11, String str, Long l11, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, @NotNull EmptyStateDTO errorMessage, AtomActionDTO atomActionDTO2, @NotNull AtomActionDTO pollingAction, List<LoaderState> list2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(pollingAction, "pollingAction");
        this.hotels = list;
        this.isAllDone = z11;
        this.timeoutDate = str;
        this.timeoutMs = l11;
        this.timeoutAction = atomActionDTO;
        this.errorNotification = notificationDTO;
        this.errorMessage = errorMessage;
        this.lazyLoadAction = atomActionDTO2;
        this.pollingAction = pollingAction;
        this.loaderStates = list2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ToursSearchResultDTO copy$default(ToursSearchResultDTO toursSearchResultDTO, List list, boolean z11, String str, Long l11, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, EmptyStateDTO emptyStateDTO, AtomActionDTO atomActionDTO2, AtomActionDTO atomActionDTO3, List list2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = toursSearchResultDTO.hotels;
        }
        if ((i11 & 2) != 0) {
            z11 = toursSearchResultDTO.isAllDone;
        }
        if ((i11 & 4) != 0) {
            str = toursSearchResultDTO.timeoutDate;
        }
        if ((i11 & 8) != 0) {
            l11 = toursSearchResultDTO.timeoutMs;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = toursSearchResultDTO.timeoutAction;
        }
        if ((i11 & 32) != 0) {
            notificationDTO = toursSearchResultDTO.errorNotification;
        }
        if ((i11 & 64) != 0) {
            emptyStateDTO = toursSearchResultDTO.errorMessage;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomActionDTO2 = toursSearchResultDTO.lazyLoadAction;
        }
        if ((i11 & 256) != 0) {
            atomActionDTO3 = toursSearchResultDTO.pollingAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            list2 = toursSearchResultDTO.loaderStates;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = toursSearchResultDTO.trackingInfo;
        }
        List list3 = list2;
        Map map2 = map;
        AtomActionDTO atomActionDTO4 = atomActionDTO2;
        AtomActionDTO atomActionDTO5 = atomActionDTO3;
        NotificationDTO notificationDTO2 = notificationDTO;
        EmptyStateDTO emptyStateDTO2 = emptyStateDTO;
        AtomActionDTO atomActionDTO6 = atomActionDTO;
        String str2 = str;
        return toursSearchResultDTO.copy(list, z11, str2, l11, atomActionDTO6, notificationDTO2, emptyStateDTO2, atomActionDTO4, atomActionDTO5, list3, map2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getHotels$annotations() {
    }

    public final List<Hotel> component1() {
        return this.hotels;
    }

    public final List<LoaderState> component10() {
        return this.loaderStates;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAllDone() {
        return this.isAllDone;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTimeoutDate() {
        return this.timeoutDate;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getTimeoutAction() {
        return this.timeoutAction;
    }

    /* renamed from: component6, reason: from getter */
    public final NotificationDTO getErrorNotification() {
        return this.errorNotification;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final EmptyStateDTO getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getLazyLoadAction() {
        return this.lazyLoadAction;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final AtomActionDTO getPollingAction() {
        return this.pollingAction;
    }

    @NotNull
    public final ToursSearchResultDTO copy(List<Hotel> hotels, boolean isAllDone, String timeoutDate, Long timeoutMs, AtomActionDTO timeoutAction, NotificationDTO errorNotification, @NotNull EmptyStateDTO errorMessage, AtomActionDTO lazyLoadAction, @NotNull AtomActionDTO pollingAction, List<LoaderState> loaderStates, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(pollingAction, "pollingAction");
        return new ToursSearchResultDTO(hotels, isAllDone, timeoutDate, timeoutMs, timeoutAction, errorNotification, errorMessage, lazyLoadAction, pollingAction, loaderStates, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursSearchResultDTO)) {
            return false;
        }
        ToursSearchResultDTO toursSearchResultDTO = (ToursSearchResultDTO) other;
        return Intrinsics.d(this.hotels, toursSearchResultDTO.hotels) && this.isAllDone == toursSearchResultDTO.isAllDone && Intrinsics.d(this.timeoutDate, toursSearchResultDTO.timeoutDate) && Intrinsics.d(this.timeoutMs, toursSearchResultDTO.timeoutMs) && Intrinsics.d(this.timeoutAction, toursSearchResultDTO.timeoutAction) && Intrinsics.d(this.errorNotification, toursSearchResultDTO.errorNotification) && Intrinsics.d(this.errorMessage, toursSearchResultDTO.errorMessage) && Intrinsics.d(this.lazyLoadAction, toursSearchResultDTO.lazyLoadAction) && Intrinsics.d(this.pollingAction, toursSearchResultDTO.pollingAction) && Intrinsics.d(this.loaderStates, toursSearchResultDTO.loaderStates) && Intrinsics.d(this.trackingInfo, toursSearchResultDTO.trackingInfo);
    }

    @NotNull
    public final EmptyStateDTO getErrorMessage() {
        return this.errorMessage;
    }

    public final NotificationDTO getErrorNotification() {
        return this.errorNotification;
    }

    public final List<Hotel> getHotels() {
        return this.hotels;
    }

    public final AtomActionDTO getLazyLoadAction() {
        return this.lazyLoadAction;
    }

    public final List<LoaderState> getLoaderStates() {
        return this.loaderStates;
    }

    @NotNull
    public final AtomActionDTO getPollingAction() {
        return this.pollingAction;
    }

    public final AtomActionDTO getTimeoutAction() {
        return this.timeoutAction;
    }

    public final String getTimeoutDate() {
        return this.timeoutDate;
    }

    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        List<Hotel> list = this.hotels;
        int a11 = C3532b.a((list == null ? 0 : list.hashCode()) * 31, 31, this.isAllDone);
        String str = this.timeoutDate;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.timeoutMs;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.timeoutAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        NotificationDTO notificationDTO = this.errorNotification;
        int hashCode4 = (this.errorMessage.hashCode() + ((hashCode3 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31)) * 31;
        AtomActionDTO atomActionDTO2 = this.lazyLoadAction;
        int b11 = a.b(this.pollingAction, (hashCode4 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31, 31);
        List<LoaderState> list2 = this.loaderStates;
        int hashCode5 = (b11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isAllDone() {
        return this.isAllDone;
    }

    @NotNull
    public String toString() {
        List<Hotel> list = this.hotels;
        boolean z11 = this.isAllDone;
        String str = this.timeoutDate;
        Long l11 = this.timeoutMs;
        AtomActionDTO atomActionDTO = this.timeoutAction;
        NotificationDTO notificationDTO = this.errorNotification;
        EmptyStateDTO emptyStateDTO = this.errorMessage;
        AtomActionDTO atomActionDTO2 = this.lazyLoadAction;
        AtomActionDTO atomActionDTO3 = this.pollingAction;
        List<LoaderState> list2 = this.loaderStates;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ToursSearchResultDTO(hotels=");
        sb2.append(list);
        sb2.append(", isAllDone=");
        sb2.append(z11);
        sb2.append(", timeoutDate=");
        sb2.append(str);
        sb2.append(", timeoutMs=");
        sb2.append(l11);
        sb2.append(", timeoutAction=");
        sb2.append(atomActionDTO);
        sb2.append(", errorNotification=");
        sb2.append(notificationDTO);
        sb2.append(", errorMessage=");
        sb2.append(emptyStateDTO);
        sb2.append(", lazyLoadAction=");
        sb2.append(atomActionDTO2);
        sb2.append(", pollingAction=");
        sb2.append(atomActionDTO3);
        sb2.append(", loaderStates=");
        sb2.append(list2);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
