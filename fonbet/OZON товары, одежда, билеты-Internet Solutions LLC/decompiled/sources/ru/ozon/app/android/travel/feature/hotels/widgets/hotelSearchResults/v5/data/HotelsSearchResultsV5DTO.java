package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data;

import D40.d;
import G.g;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.molecules.dto.awardBadge.AwardBadgeDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u0001:\u0002+,Bw\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "", "hotels", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO;", "errorNotification", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "refreshAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "asyncErrorMessage", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "asyncBehaviorType", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$AsyncBehaviorType;", "asyncParams", "", "", "locationPoint", "", "onboardingApp", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "refreshNotificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$AsyncBehaviorType;Ljava/util/Map;Ljava/util/List;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getHotels$annotations", "()V", "getHotels", "()Ljava/util/List;", "getErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "getRefreshAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAsyncErrorMessage", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "getAsyncBehaviorType", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$AsyncBehaviorType;", "getAsyncParams", "()Ljava/util/Map;", "getLocationPoint", "getOnboardingApp", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getRefreshNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "AsyncBehaviorType", "HotelItemDTO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5DTO {
    public static final int $stable = 8;

    @NotNull
    private final AsyncBehaviorType asyncBehaviorType;
    private final EmptyStateDTO asyncErrorMessage;
    private final Map<String, String> asyncParams;
    private final NotificationAtom.NotificationWithIcon errorNotification;

    @NotNull
    private final List<HotelItemDTO> hotels;
    private final List<Double> locationPoint;
    private final OnBoardingDTO onboardingApp;
    private final AtomActionDTO refreshAction;
    private final NotificationDTO refreshNotificationBar;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$AsyncBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACTION", "SKELETON_STATE", "FETCH_STATE", "REFRESH_STATE", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncBehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AsyncBehaviorType[] $VALUES;

        @i(name = "NO_ACTION")
        public static final AsyncBehaviorType NO_ACTION = new AsyncBehaviorType("NO_ACTION", 0);

        @i(name = "SKELETON_STATE")
        public static final AsyncBehaviorType SKELETON_STATE = new AsyncBehaviorType("SKELETON_STATE", 1);

        @i(name = "FETCH_STATE")
        public static final AsyncBehaviorType FETCH_STATE = new AsyncBehaviorType("FETCH_STATE", 2);

        @i(name = "REFRESH_STATE")
        public static final AsyncBehaviorType REFRESH_STATE = new AsyncBehaviorType("REFRESH_STATE", 3);

        private static final /* synthetic */ AsyncBehaviorType[] $values() {
            return new AsyncBehaviorType[]{NO_ACTION, SKELETON_STATE, FETCH_STATE, REFRESH_STATE};
        }

        static {
            AsyncBehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AsyncBehaviorType(String str, int i11) {
        }

        public static AsyncBehaviorType valueOf(String str) {
            return (AsyncBehaviorType) Enum.valueOf(AsyncBehaviorType.class, str);
        }

        public static AsyncBehaviorType[] values() {
            return (AsyncBehaviorType[]) $VALUES.clone();
        }
    }

    public HotelsSearchResultsV5DTO(@NotNull List<HotelItemDTO> hotels, NotificationAtom.NotificationWithIcon notificationWithIcon, AtomActionDTO atomActionDTO, EmptyStateDTO emptyStateDTO, @NotNull AsyncBehaviorType asyncBehaviorType, Map<String, String> map, List<Double> list, OnBoardingDTO onBoardingDTO, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(hotels, "hotels");
        Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
        this.hotels = hotels;
        this.errorNotification = notificationWithIcon;
        this.refreshAction = atomActionDTO;
        this.asyncErrorMessage = emptyStateDTO;
        this.asyncBehaviorType = asyncBehaviorType;
        this.asyncParams = map;
        this.locationPoint = list;
        this.onboardingApp = onBoardingDTO;
        this.refreshNotificationBar = notificationDTO;
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getHotels$annotations() {
    }

    @NotNull
    public final AsyncBehaviorType getAsyncBehaviorType() {
        return this.asyncBehaviorType;
    }

    public final EmptyStateDTO getAsyncErrorMessage() {
        return this.asyncErrorMessage;
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    public final NotificationAtom.NotificationWithIcon getErrorNotification() {
        return this.errorNotification;
    }

    @NotNull
    public final List<HotelItemDTO> getHotels() {
        return this.hotels;
    }

    public final List<Double> getLocationPoint() {
        return this.locationPoint;
    }

    public final OnBoardingDTO getOnboardingApp() {
        return this.onboardingApp;
    }

    public final AtomActionDTO getRefreshAction() {
        return this.refreshAction;
    }

    public final NotificationDTO getRefreshNotificationBar() {
        return this.refreshNotificationBar;
    }

    public HotelsSearchResultsV5DTO(List list, NotificationAtom.NotificationWithIcon notificationWithIcon, AtomActionDTO atomActionDTO, EmptyStateDTO emptyStateDTO, AsyncBehaviorType asyncBehaviorType, Map map, List list2, OnBoardingDTO onBoardingDTO, NotificationDTO notificationDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, notificationWithIcon, atomActionDTO, emptyStateDTO, asyncBehaviorType, map, list2, onBoardingDTO, notificationDTO);
    }

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002ijBý\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\u0010$\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\t\u0010N\u001a\u00020\u0007HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010X\u001a\u00020\u0017HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010Z\u001a\u00020\u0017HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010]\u001a\u00020\u0017HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010a\u001a\u00020#HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010%HÆ\u0003J£\u0002\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%HÆ\u0001J\u0013\u0010d\u001a\u00020\u00172\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010f\u001a\u00020gHÖ\u0001J\t\u0010h\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010<R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u001a\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010<R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b?\u0010-R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u001d\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bB\u0010<R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010 \u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bE\u0010-R\u0013\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bF\u0010-R\u0016\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bI\u0010J¨\u0006k"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO;", "", "hotelId", "", "images", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "rating", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "mainPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDescription", "marketingPrice", "premiumBadge", "imageBadges", "cardBackgroundColor", "marketingHeader", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$ItemHeader;", "stockBar", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "isShimmerState", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "isVisibleCard", "priceErrorMessage", "favoriteButton", "canShowOnboarding", "reviewsIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "reviews", "remainingOptions", "layoutVariant", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;", "awardBadge", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$ItemHeader;Lru/ozon/app/android/atoms/data/stock/StockBar;ZLru/ozon/uni/atoms/data/controls/CommonControlSettings;ZLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;ZLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;)V", "getHotelId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAddress", "getRating", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getMainPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceDescription", "getMarketingPrice", "getPremiumBadge", "getImageBadges", "getCardBackgroundColor", "getMarketingHeader", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$ItemHeader;", "getStockBar", "()Lru/ozon/app/android/atoms/data/stock/StockBar;", "()Z", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getPriceErrorMessage", "getFavoriteButton", "()Ljava/lang/Object;", "getCanShowOnboarding", "getReviewsIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getReviews", "getRemainingOptions", "getLayoutVariant", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;", "getAwardBadge", "()Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "other", "hashCode", "", "toString", "ItemHeader", "CardLayoutVariant", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class HotelItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final TextDTO address;
        private final AwardBadgeDTO awardBadge;
        private final boolean canShowOnboarding;
        private final String cardBackgroundColor;
        private final CommonControlSettings common;
        private final Object favoriteButton;

        @NotNull
        private final String hotelId;

        @NotNull
        private final List<BadgeDTO> imageBadges;

        @NotNull
        private final List<String> images;
        private final boolean isShimmerState;
        private final boolean isVisibleCard;

        @EnumNullFallback
        @NotNull
        private final CardLayoutVariant layoutVariant;
        private final PriceDTO mainPrice;
        private final ItemHeader marketingHeader;
        private final PriceDTO marketingPrice;
        private final BadgeDTO premiumBadge;
        private final TextDTO priceDescription;
        private final TextDTO priceErrorMessage;
        private final BadgeDTO rating;
        private final TextDTO remainingOptions;
        private final TextDTO reviews;
        private final IconDTO reviewsIcon;
        private final StockBar stockBar;

        @NotNull
        private final TextDTO title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;", "", "<init>", "(Ljava/lang/String;I)V", "V1", "V2", "V3", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CardLayoutVariant {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ CardLayoutVariant[] $VALUES;

            /* renamed from: V1, reason: collision with root package name */
            @i(name = "V1")
            public static final CardLayoutVariant f94114V1 = new CardLayoutVariant("V1", 0);

            /* renamed from: V2, reason: collision with root package name */
            @i(name = "V2")
            public static final CardLayoutVariant f94115V2 = new CardLayoutVariant("V2", 1);

            /* renamed from: V3, reason: collision with root package name */
            @i(name = "V3")
            public static final CardLayoutVariant f94116V3 = new CardLayoutVariant("V3", 2);

            private static final /* synthetic */ CardLayoutVariant[] $values() {
                return new CardLayoutVariant[]{f94114V1, f94115V2, f94116V3};
            }

            static {
                CardLayoutVariant[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private CardLayoutVariant(String str, int i11) {
            }

            public static CardLayoutVariant valueOf(String str) {
                return (CardLayoutVariant) Enum.valueOf(CardLayoutVariant.class, str);
            }

            public static CardLayoutVariant[] values() {
                return (CardLayoutVariant[]) $VALUES.clone();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$ItemHeader;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundGradientToken", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundGradientToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ItemHeader {
            public static final int $stable = 0;

            @NotNull
            private final String backgroundGradientToken;

            @NotNull
            private final TextDTO title;

            public ItemHeader(@NotNull TextDTO title, @NotNull String backgroundGradientToken) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(backgroundGradientToken, "backgroundGradientToken");
                this.title = title;
                this.backgroundGradientToken = backgroundGradientToken;
            }

            public static /* synthetic */ ItemHeader copy$default(ItemHeader itemHeader, TextDTO textDTO, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = itemHeader.title;
                }
                if ((i11 & 2) != 0) {
                    str = itemHeader.backgroundGradientToken;
                }
                return itemHeader.copy(textDTO, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getBackgroundGradientToken() {
                return this.backgroundGradientToken;
            }

            @NotNull
            public final ItemHeader copy(@NotNull TextDTO title, @NotNull String backgroundGradientToken) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(backgroundGradientToken, "backgroundGradientToken");
                return new ItemHeader(title, backgroundGradientToken);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ItemHeader)) {
                    return false;
                }
                ItemHeader itemHeader = (ItemHeader) other;
                return Intrinsics.d(this.title, itemHeader.title) && Intrinsics.d(this.backgroundGradientToken, itemHeader.backgroundGradientToken);
            }

            @NotNull
            public final String getBackgroundGradientToken() {
                return this.backgroundGradientToken;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.backgroundGradientToken.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "ItemHeader(title=" + this.title + ", backgroundGradientToken=" + this.backgroundGradientToken + ")";
            }
        }

        public HotelItemDTO(@NotNull String hotelId, @NotNull List<String> images, @NotNull TextDTO title, @NotNull TextDTO address, BadgeDTO badgeDTO, PriceDTO priceDTO, TextDTO textDTO, PriceDTO priceDTO2, BadgeDTO badgeDTO2, @NotNull List<BadgeDTO> imageBadges, String str, ItemHeader itemHeader, StockBar stockBar, boolean z11, CommonControlSettings commonControlSettings, boolean z12, TextDTO textDTO2, @ProtoOneOfSignature(name = "favoriteProductMoleculeV2", type = FavoriteProductMoleculeV2.class) @ProtoOneOf(label = "type") Object obj, boolean z13, IconDTO iconDTO, TextDTO textDTO3, TextDTO textDTO4, @NotNull CardLayoutVariant layoutVariant, AwardBadgeDTO awardBadgeDTO) {
            Intrinsics.checkNotNullParameter(hotelId, "hotelId");
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(imageBadges, "imageBadges");
            Intrinsics.checkNotNullParameter(layoutVariant, "layoutVariant");
            this.hotelId = hotelId;
            this.images = images;
            this.title = title;
            this.address = address;
            this.rating = badgeDTO;
            this.mainPrice = priceDTO;
            this.priceDescription = textDTO;
            this.marketingPrice = priceDTO2;
            this.premiumBadge = badgeDTO2;
            this.imageBadges = imageBadges;
            this.cardBackgroundColor = str;
            this.marketingHeader = itemHeader;
            this.stockBar = stockBar;
            this.isShimmerState = z11;
            this.common = commonControlSettings;
            this.isVisibleCard = z12;
            this.priceErrorMessage = textDTO2;
            this.favoriteButton = obj;
            this.canShowOnboarding = z13;
            this.reviewsIcon = iconDTO;
            this.reviews = textDTO3;
            this.remainingOptions = textDTO4;
            this.layoutVariant = layoutVariant;
            this.awardBadge = awardBadgeDTO;
        }

        public static /* synthetic */ HotelItemDTO copy$default(HotelItemDTO hotelItemDTO, String str, List list, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, PriceDTO priceDTO, TextDTO textDTO3, PriceDTO priceDTO2, BadgeDTO badgeDTO2, List list2, String str2, ItemHeader itemHeader, StockBar stockBar, boolean z11, CommonControlSettings commonControlSettings, boolean z12, TextDTO textDTO4, Object obj, boolean z13, IconDTO iconDTO, TextDTO textDTO5, TextDTO textDTO6, CardLayoutVariant cardLayoutVariant, AwardBadgeDTO awardBadgeDTO, int i11, Object obj2) {
            AwardBadgeDTO awardBadgeDTO2;
            CardLayoutVariant cardLayoutVariant2;
            String str3 = (i11 & 1) != 0 ? hotelItemDTO.hotelId : str;
            List list3 = (i11 & 2) != 0 ? hotelItemDTO.images : list;
            TextDTO textDTO7 = (i11 & 4) != 0 ? hotelItemDTO.title : textDTO;
            TextDTO textDTO8 = (i11 & 8) != 0 ? hotelItemDTO.address : textDTO2;
            BadgeDTO badgeDTO3 = (i11 & 16) != 0 ? hotelItemDTO.rating : badgeDTO;
            PriceDTO priceDTO3 = (i11 & 32) != 0 ? hotelItemDTO.mainPrice : priceDTO;
            TextDTO textDTO9 = (i11 & 64) != 0 ? hotelItemDTO.priceDescription : textDTO3;
            PriceDTO priceDTO4 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hotelItemDTO.marketingPrice : priceDTO2;
            BadgeDTO badgeDTO4 = (i11 & 256) != 0 ? hotelItemDTO.premiumBadge : badgeDTO2;
            List list4 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? hotelItemDTO.imageBadges : list2;
            String str4 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? hotelItemDTO.cardBackgroundColor : str2;
            ItemHeader itemHeader2 = (i11 & 2048) != 0 ? hotelItemDTO.marketingHeader : itemHeader;
            StockBar stockBar2 = (i11 & 4096) != 0 ? hotelItemDTO.stockBar : stockBar;
            boolean z14 = (i11 & 8192) != 0 ? hotelItemDTO.isShimmerState : z11;
            String str5 = str3;
            CommonControlSettings commonControlSettings2 = (i11 & 16384) != 0 ? hotelItemDTO.common : commonControlSettings;
            boolean z15 = (i11 & 32768) != 0 ? hotelItemDTO.isVisibleCard : z12;
            TextDTO textDTO10 = (i11 & 65536) != 0 ? hotelItemDTO.priceErrorMessage : textDTO4;
            Object obj3 = (i11 & 131072) != 0 ? hotelItemDTO.favoriteButton : obj;
            boolean z16 = (i11 & 262144) != 0 ? hotelItemDTO.canShowOnboarding : z13;
            IconDTO iconDTO2 = (i11 & 524288) != 0 ? hotelItemDTO.reviewsIcon : iconDTO;
            TextDTO textDTO11 = (i11 & 1048576) != 0 ? hotelItemDTO.reviews : textDTO5;
            TextDTO textDTO12 = (i11 & 2097152) != 0 ? hotelItemDTO.remainingOptions : textDTO6;
            CardLayoutVariant cardLayoutVariant3 = (i11 & 4194304) != 0 ? hotelItemDTO.layoutVariant : cardLayoutVariant;
            if ((i11 & 8388608) != 0) {
                cardLayoutVariant2 = cardLayoutVariant3;
                awardBadgeDTO2 = hotelItemDTO.awardBadge;
            } else {
                awardBadgeDTO2 = awardBadgeDTO;
                cardLayoutVariant2 = cardLayoutVariant3;
            }
            return hotelItemDTO.copy(str5, list3, textDTO7, textDTO8, badgeDTO3, priceDTO3, textDTO9, priceDTO4, badgeDTO4, list4, str4, itemHeader2, stockBar2, z14, commonControlSettings2, z15, textDTO10, obj3, z16, iconDTO2, textDTO11, textDTO12, cardLayoutVariant2, awardBadgeDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getHotelId() {
            return this.hotelId;
        }

        @NotNull
        public final List<BadgeDTO> component10() {
            return this.imageBadges;
        }

        /* renamed from: component11, reason: from getter */
        public final String getCardBackgroundColor() {
            return this.cardBackgroundColor;
        }

        /* renamed from: component12, reason: from getter */
        public final ItemHeader getMarketingHeader() {
            return this.marketingHeader;
        }

        /* renamed from: component13, reason: from getter */
        public final StockBar getStockBar() {
            return this.stockBar;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getIsShimmerState() {
            return this.isShimmerState;
        }

        /* renamed from: component15, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getIsVisibleCard() {
            return this.isVisibleCard;
        }

        /* renamed from: component17, reason: from getter */
        public final TextDTO getPriceErrorMessage() {
            return this.priceErrorMessage;
        }

        /* renamed from: component18, reason: from getter */
        public final Object getFavoriteButton() {
            return this.favoriteButton;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getCanShowOnboarding() {
            return this.canShowOnboarding;
        }

        @NotNull
        public final List<String> component2() {
            return this.images;
        }

        /* renamed from: component20, reason: from getter */
        public final IconDTO getReviewsIcon() {
            return this.reviewsIcon;
        }

        /* renamed from: component21, reason: from getter */
        public final TextDTO getReviews() {
            return this.reviews;
        }

        /* renamed from: component22, reason: from getter */
        public final TextDTO getRemainingOptions() {
            return this.remainingOptions;
        }

        @NotNull
        /* renamed from: component23, reason: from getter */
        public final CardLayoutVariant getLayoutVariant() {
            return this.layoutVariant;
        }

        /* renamed from: component24, reason: from getter */
        public final AwardBadgeDTO getAwardBadge() {
            return this.awardBadge;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getAddress() {
            return this.address;
        }

        /* renamed from: component5, reason: from getter */
        public final BadgeDTO getRating() {
            return this.rating;
        }

        /* renamed from: component6, reason: from getter */
        public final PriceDTO getMainPrice() {
            return this.mainPrice;
        }

        /* renamed from: component7, reason: from getter */
        public final TextDTO getPriceDescription() {
            return this.priceDescription;
        }

        /* renamed from: component8, reason: from getter */
        public final PriceDTO getMarketingPrice() {
            return this.marketingPrice;
        }

        /* renamed from: component9, reason: from getter */
        public final BadgeDTO getPremiumBadge() {
            return this.premiumBadge;
        }

        @NotNull
        public final HotelItemDTO copy(@NotNull String hotelId, @NotNull List<String> images, @NotNull TextDTO title, @NotNull TextDTO address, BadgeDTO rating, PriceDTO mainPrice, TextDTO priceDescription, PriceDTO marketingPrice, BadgeDTO premiumBadge, @NotNull List<BadgeDTO> imageBadges, String cardBackgroundColor, ItemHeader marketingHeader, StockBar stockBar, boolean isShimmerState, CommonControlSettings common, boolean isVisibleCard, TextDTO priceErrorMessage, @ProtoOneOfSignature(name = "favoriteProductMoleculeV2", type = FavoriteProductMoleculeV2.class) @ProtoOneOf(label = "type") Object favoriteButton, boolean canShowOnboarding, IconDTO reviewsIcon, TextDTO reviews, TextDTO remainingOptions, @NotNull CardLayoutVariant layoutVariant, AwardBadgeDTO awardBadge) {
            Intrinsics.checkNotNullParameter(hotelId, "hotelId");
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(imageBadges, "imageBadges");
            Intrinsics.checkNotNullParameter(layoutVariant, "layoutVariant");
            return new HotelItemDTO(hotelId, images, title, address, rating, mainPrice, priceDescription, marketingPrice, premiumBadge, imageBadges, cardBackgroundColor, marketingHeader, stockBar, isShimmerState, common, isVisibleCard, priceErrorMessage, favoriteButton, canShowOnboarding, reviewsIcon, reviews, remainingOptions, layoutVariant, awardBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HotelItemDTO)) {
                return false;
            }
            HotelItemDTO hotelItemDTO = (HotelItemDTO) other;
            return Intrinsics.d(this.hotelId, hotelItemDTO.hotelId) && Intrinsics.d(this.images, hotelItemDTO.images) && Intrinsics.d(this.title, hotelItemDTO.title) && Intrinsics.d(this.address, hotelItemDTO.address) && Intrinsics.d(this.rating, hotelItemDTO.rating) && Intrinsics.d(this.mainPrice, hotelItemDTO.mainPrice) && Intrinsics.d(this.priceDescription, hotelItemDTO.priceDescription) && Intrinsics.d(this.marketingPrice, hotelItemDTO.marketingPrice) && Intrinsics.d(this.premiumBadge, hotelItemDTO.premiumBadge) && Intrinsics.d(this.imageBadges, hotelItemDTO.imageBadges) && Intrinsics.d(this.cardBackgroundColor, hotelItemDTO.cardBackgroundColor) && Intrinsics.d(this.marketingHeader, hotelItemDTO.marketingHeader) && Intrinsics.d(this.stockBar, hotelItemDTO.stockBar) && this.isShimmerState == hotelItemDTO.isShimmerState && Intrinsics.d(this.common, hotelItemDTO.common) && this.isVisibleCard == hotelItemDTO.isVisibleCard && Intrinsics.d(this.priceErrorMessage, hotelItemDTO.priceErrorMessage) && Intrinsics.d(this.favoriteButton, hotelItemDTO.favoriteButton) && this.canShowOnboarding == hotelItemDTO.canShowOnboarding && Intrinsics.d(this.reviewsIcon, hotelItemDTO.reviewsIcon) && Intrinsics.d(this.reviews, hotelItemDTO.reviews) && Intrinsics.d(this.remainingOptions, hotelItemDTO.remainingOptions) && this.layoutVariant == hotelItemDTO.layoutVariant && Intrinsics.d(this.awardBadge, hotelItemDTO.awardBadge);
        }

        @NotNull
        public final TextDTO getAddress() {
            return this.address;
        }

        public final AwardBadgeDTO getAwardBadge() {
            return this.awardBadge;
        }

        public final boolean getCanShowOnboarding() {
            return this.canShowOnboarding;
        }

        public final String getCardBackgroundColor() {
            return this.cardBackgroundColor;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final Object getFavoriteButton() {
            return this.favoriteButton;
        }

        @NotNull
        public final String getHotelId() {
            return this.hotelId;
        }

        @NotNull
        public final List<BadgeDTO> getImageBadges() {
            return this.imageBadges;
        }

        @NotNull
        public final List<String> getImages() {
            return this.images;
        }

        @NotNull
        public final CardLayoutVariant getLayoutVariant() {
            return this.layoutVariant;
        }

        public final PriceDTO getMainPrice() {
            return this.mainPrice;
        }

        public final ItemHeader getMarketingHeader() {
            return this.marketingHeader;
        }

        public final PriceDTO getMarketingPrice() {
            return this.marketingPrice;
        }

        public final BadgeDTO getPremiumBadge() {
            return this.premiumBadge;
        }

        public final TextDTO getPriceDescription() {
            return this.priceDescription;
        }

        public final TextDTO getPriceErrorMessage() {
            return this.priceErrorMessage;
        }

        public final BadgeDTO getRating() {
            return this.rating;
        }

        public final TextDTO getRemainingOptions() {
            return this.remainingOptions;
        }

        public final TextDTO getReviews() {
            return this.reviews;
        }

        public final IconDTO getReviewsIcon() {
            return this.reviewsIcon;
        }

        public final StockBar getStockBar() {
            return this.stockBar;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = Ns.b.a(this.address, Ns.b.a(this.title, g.b(this.hotelId.hashCode() * 31, 31, this.images), 31), 31);
            BadgeDTO badgeDTO = this.rating;
            int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            PriceDTO priceDTO = this.mainPrice;
            int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            TextDTO textDTO = this.priceDescription;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            PriceDTO priceDTO2 = this.marketingPrice;
            int hashCode4 = (hashCode3 + (priceDTO2 == null ? 0 : priceDTO2.hashCode())) * 31;
            BadgeDTO badgeDTO2 = this.premiumBadge;
            int b11 = g.b((hashCode4 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31, 31, this.imageBadges);
            String str = this.cardBackgroundColor;
            int hashCode5 = (b11 + (str == null ? 0 : str.hashCode())) * 31;
            ItemHeader itemHeader = this.marketingHeader;
            int hashCode6 = (hashCode5 + (itemHeader == null ? 0 : itemHeader.hashCode())) * 31;
            StockBar stockBar = this.stockBar;
            int a12 = C3532b.a((hashCode6 + (stockBar == null ? 0 : stockBar.hashCode())) * 31, 31, this.isShimmerState);
            CommonControlSettings commonControlSettings = this.common;
            int a13 = C3532b.a((a12 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31, 31, this.isVisibleCard);
            TextDTO textDTO2 = this.priceErrorMessage;
            int hashCode7 = (a13 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            Object obj = this.favoriteButton;
            int a14 = C3532b.a((hashCode7 + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.canShowOnboarding);
            IconDTO iconDTO = this.reviewsIcon;
            int hashCode8 = (a14 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO3 = this.reviews;
            int hashCode9 = (hashCode8 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
            TextDTO textDTO4 = this.remainingOptions;
            int hashCode10 = (this.layoutVariant.hashCode() + ((hashCode9 + (textDTO4 == null ? 0 : textDTO4.hashCode())) * 31)) * 31;
            AwardBadgeDTO awardBadgeDTO = this.awardBadge;
            return hashCode10 + (awardBadgeDTO != null ? awardBadgeDTO.hashCode() : 0);
        }

        public final boolean isShimmerState() {
            return this.isShimmerState;
        }

        public final boolean isVisibleCard() {
            return this.isVisibleCard;
        }

        @NotNull
        public String toString() {
            String str = this.hotelId;
            List<String> list = this.images;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.address;
            BadgeDTO badgeDTO = this.rating;
            PriceDTO priceDTO = this.mainPrice;
            TextDTO textDTO3 = this.priceDescription;
            PriceDTO priceDTO2 = this.marketingPrice;
            BadgeDTO badgeDTO2 = this.premiumBadge;
            List<BadgeDTO> list2 = this.imageBadges;
            String str2 = this.cardBackgroundColor;
            ItemHeader itemHeader = this.marketingHeader;
            StockBar stockBar = this.stockBar;
            boolean z11 = this.isShimmerState;
            CommonControlSettings commonControlSettings = this.common;
            boolean z12 = this.isVisibleCard;
            TextDTO textDTO4 = this.priceErrorMessage;
            Object obj = this.favoriteButton;
            boolean z13 = this.canShowOnboarding;
            IconDTO iconDTO = this.reviewsIcon;
            TextDTO textDTO5 = this.reviews;
            TextDTO textDTO6 = this.remainingOptions;
            CardLayoutVariant cardLayoutVariant = this.layoutVariant;
            AwardBadgeDTO awardBadgeDTO = this.awardBadge;
            StringBuilder f7 = Tl.b.f("HotelItemDTO(hotelId=", str, ", images=", ", title=", list);
            d.e(", address=", ", rating=", f7, textDTO, textDTO2);
            f7.append(badgeDTO);
            f7.append(", mainPrice=");
            f7.append(priceDTO);
            f7.append(", priceDescription=");
            f7.append(textDTO3);
            f7.append(", marketingPrice=");
            f7.append(priceDTO2);
            f7.append(", premiumBadge=");
            f7.append(badgeDTO2);
            f7.append(", imageBadges=");
            f7.append(list2);
            f7.append(", cardBackgroundColor=");
            f7.append(str2);
            f7.append(", marketingHeader=");
            f7.append(itemHeader);
            f7.append(", stockBar=");
            f7.append(stockBar);
            f7.append(", isShimmerState=");
            f7.append(z11);
            f7.append(", common=");
            f7.append(commonControlSettings);
            f7.append(", isVisibleCard=");
            f7.append(z12);
            f7.append(", priceErrorMessage=");
            f7.append(textDTO4);
            f7.append(", favoriteButton=");
            f7.append(obj);
            f7.append(", canShowOnboarding=");
            f7.append(z13);
            f7.append(", reviewsIcon=");
            f7.append(iconDTO);
            f7.append(", reviews=");
            d.e(", remainingOptions=", ", layoutVariant=", f7, textDTO5, textDTO6);
            f7.append(cardLayoutVariant);
            f7.append(", awardBadge=");
            f7.append(awardBadgeDTO);
            f7.append(")");
            return f7.toString();
        }

        public HotelItemDTO(String str, List list, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, PriceDTO priceDTO, TextDTO textDTO3, PriceDTO priceDTO2, BadgeDTO badgeDTO2, List list2, String str2, ItemHeader itemHeader, StockBar stockBar, boolean z11, CommonControlSettings commonControlSettings, boolean z12, TextDTO textDTO4, Object obj, boolean z13, IconDTO iconDTO, TextDTO textDTO5, TextDTO textDTO6, CardLayoutVariant cardLayoutVariant, AwardBadgeDTO awardBadgeDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? K.f71697a : list, textDTO, textDTO2, badgeDTO, priceDTO, textDTO3, priceDTO2, badgeDTO2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? K.f71697a : list2, str2, itemHeader, stockBar, z11, commonControlSettings, (32768 & i11) != 0 ? false : z12, textDTO4, obj, (262144 & i11) != 0 ? false : z13, iconDTO, textDTO5, textDTO6, (i11 & 4194304) != 0 ? CardLayoutVariant.f94114V1 : cardLayoutVariant, awardBadgeDTO);
        }
    }
}
