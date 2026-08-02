package ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data;

import B90.C2619v;
import Co.a;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002:;B{\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003J\u0091\u0001\u00103\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO;", "", "badges", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "payUntilBadge", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "checkInDate", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$DateV3;", "checkOutDate", "totalPrice", "Lru/ozon/uni/atoms/data/price/Price;", "priceDescription", "pendingAction", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$PendingAction;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$DateV3;Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$DateV3;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$PendingAction;Ljava/util/Map;)V", "getBadges", "()Ljava/util/List;", "getPayUntilBadge", "()Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAddress", "getCheckInDate", "()Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$DateV3;", "getCheckOutDate", "getTotalPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getPriceDescription", "getPendingAction", "()Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$PendingAction;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "DateV3", "PendingAction", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelHotelCardV3DTO {
    public static final int $stable = 8;
    private final TextAtom address;
    private final List<Badge> badges;
    private final DateV3 checkInDate;
    private final DateV3 checkOutDate;

    @NotNull
    private final TextAtom name;
    private final TimerDTO payUntilBadge;
    private final PendingAction pendingAction;
    private final TextAtom priceDescription;
    private final Price totalPrice;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$DateV3;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "dateWithTime", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDateWithTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateV3 {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom dateWithTime;

        @NotNull
        private final TextAtom title;

        public DateV3(@NotNull TextAtom title, @NotNull TextAtom dateWithTime) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dateWithTime, "dateWithTime");
            this.title = title;
            this.dateWithTime = dateWithTime;
        }

        public static /* synthetic */ DateV3 copy$default(DateV3 dateV3, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = dateV3.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = dateV3.dateWithTime;
            }
            return dateV3.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getDateWithTime() {
            return this.dateWithTime;
        }

        @NotNull
        public final DateV3 copy(@NotNull TextAtom title, @NotNull TextAtom dateWithTime) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dateWithTime, "dateWithTime");
            return new DateV3(title, dateWithTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateV3)) {
                return false;
            }
            DateV3 dateV3 = (DateV3) other;
            return Intrinsics.d(this.title, dateV3.title) && Intrinsics.d(this.dateWithTime, dateV3.dateWithTime);
        }

        @NotNull
        public final TextAtom getDateWithTime() {
            return this.dateWithTime;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.dateWithTime.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.a("DateV3(title=", this.title, ", dateWithTime=", this.dateWithTime, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$PendingAction;", "", "timeLeft", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(ILru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTimeLeft", "()I", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PendingAction {
        public static final int $stable = 0;

        @NotNull
        private final AtomActionDTO action;
        private final int timeLeft;

        public PendingAction(int i11, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.timeLeft = i11;
            this.action = action;
        }

        public static /* synthetic */ PendingAction copy$default(PendingAction pendingAction, int i11, AtomActionDTO atomActionDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = pendingAction.timeLeft;
            }
            if ((i12 & 2) != 0) {
                atomActionDTO = pendingAction.action;
            }
            return pendingAction.copy(i11, atomActionDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTimeLeft() {
            return this.timeLeft;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final PendingAction copy(int timeLeft, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new PendingAction(timeLeft, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingAction)) {
                return false;
            }
            PendingAction pendingAction = (PendingAction) other;
            return this.timeLeft == pendingAction.timeLeft && Intrinsics.d(this.action, pendingAction.action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final int getTimeLeft() {
            return this.timeLeft;
        }

        public int hashCode() {
            return this.action.hashCode() + (Integer.hashCode(this.timeLeft) * 31);
        }

        @NotNull
        public String toString() {
            return "PendingAction(timeLeft=" + this.timeLeft + ", action=" + this.action + ")";
        }
    }

    public TravelHotelCardV3DTO(List<Badge> list, TimerDTO timerDTO, @NotNull TextAtom name, TextAtom textAtom, DateV3 dateV3, DateV3 dateV32, Price price, TextAtom textAtom2, PendingAction pendingAction, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.badges = list;
        this.payUntilBadge = timerDTO;
        this.name = name;
        this.address = textAtom;
        this.checkInDate = dateV3;
        this.checkOutDate = dateV32;
        this.totalPrice = price;
        this.priceDescription = textAtom2;
        this.pendingAction = pendingAction;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TravelHotelCardV3DTO copy$default(TravelHotelCardV3DTO travelHotelCardV3DTO, List list, TimerDTO timerDTO, TextAtom textAtom, TextAtom textAtom2, DateV3 dateV3, DateV3 dateV32, Price price, TextAtom textAtom3, PendingAction pendingAction, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelHotelCardV3DTO.badges;
        }
        if ((i11 & 2) != 0) {
            timerDTO = travelHotelCardV3DTO.payUntilBadge;
        }
        if ((i11 & 4) != 0) {
            textAtom = travelHotelCardV3DTO.name;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = travelHotelCardV3DTO.address;
        }
        if ((i11 & 16) != 0) {
            dateV3 = travelHotelCardV3DTO.checkInDate;
        }
        if ((i11 & 32) != 0) {
            dateV32 = travelHotelCardV3DTO.checkOutDate;
        }
        if ((i11 & 64) != 0) {
            price = travelHotelCardV3DTO.totalPrice;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            textAtom3 = travelHotelCardV3DTO.priceDescription;
        }
        if ((i11 & 256) != 0) {
            pendingAction = travelHotelCardV3DTO.pendingAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = travelHotelCardV3DTO.trackingInfo;
        }
        PendingAction pendingAction2 = pendingAction;
        Map map2 = map;
        Price price2 = price;
        TextAtom textAtom4 = textAtom3;
        DateV3 dateV33 = dateV3;
        DateV3 dateV34 = dateV32;
        return travelHotelCardV3DTO.copy(list, timerDTO, textAtom, textAtom2, dateV33, dateV34, price2, textAtom4, pendingAction2, map2);
    }

    public final List<Badge> component1() {
        return this.badges;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final TimerDTO getPayUntilBadge() {
        return this.payUntilBadge;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getAddress() {
        return this.address;
    }

    /* renamed from: component5, reason: from getter */
    public final DateV3 getCheckInDate() {
        return this.checkInDate;
    }

    /* renamed from: component6, reason: from getter */
    public final DateV3 getCheckOutDate() {
        return this.checkOutDate;
    }

    /* renamed from: component7, reason: from getter */
    public final Price getTotalPrice() {
        return this.totalPrice;
    }

    /* renamed from: component8, reason: from getter */
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    /* renamed from: component9, reason: from getter */
    public final PendingAction getPendingAction() {
        return this.pendingAction;
    }

    @NotNull
    public final TravelHotelCardV3DTO copy(List<Badge> badges, TimerDTO payUntilBadge, @NotNull TextAtom name, TextAtom address, DateV3 checkInDate, DateV3 checkOutDate, Price totalPrice, TextAtom priceDescription, PendingAction pendingAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new TravelHotelCardV3DTO(badges, payUntilBadge, name, address, checkInDate, checkOutDate, totalPrice, priceDescription, pendingAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelHotelCardV3DTO)) {
            return false;
        }
        TravelHotelCardV3DTO travelHotelCardV3DTO = (TravelHotelCardV3DTO) other;
        return Intrinsics.d(this.badges, travelHotelCardV3DTO.badges) && Intrinsics.d(this.payUntilBadge, travelHotelCardV3DTO.payUntilBadge) && Intrinsics.d(this.name, travelHotelCardV3DTO.name) && Intrinsics.d(this.address, travelHotelCardV3DTO.address) && Intrinsics.d(this.checkInDate, travelHotelCardV3DTO.checkInDate) && Intrinsics.d(this.checkOutDate, travelHotelCardV3DTO.checkOutDate) && Intrinsics.d(this.totalPrice, travelHotelCardV3DTO.totalPrice) && Intrinsics.d(this.priceDescription, travelHotelCardV3DTO.priceDescription) && Intrinsics.d(this.pendingAction, travelHotelCardV3DTO.pendingAction) && Intrinsics.d(this.trackingInfo, travelHotelCardV3DTO.trackingInfo);
    }

    public final TextAtom getAddress() {
        return this.address;
    }

    public final List<Badge> getBadges() {
        return this.badges;
    }

    public final DateV3 getCheckInDate() {
        return this.checkInDate;
    }

    public final DateV3 getCheckOutDate() {
        return this.checkOutDate;
    }

    @NotNull
    public final TextAtom getName() {
        return this.name;
    }

    public final TimerDTO getPayUntilBadge() {
        return this.payUntilBadge;
    }

    public final PendingAction getPendingAction() {
        return this.pendingAction;
    }

    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    public final Price getTotalPrice() {
        return this.totalPrice;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        List<Badge> list = this.badges;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        TimerDTO timerDTO = this.payUntilBadge;
        int b11 = C2619v.b((hashCode + (timerDTO == null ? 0 : timerDTO.hashCode())) * 31, 31, this.name);
        TextAtom textAtom = this.address;
        int hashCode2 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        DateV3 dateV3 = this.checkInDate;
        int hashCode3 = (hashCode2 + (dateV3 == null ? 0 : dateV3.hashCode())) * 31;
        DateV3 dateV32 = this.checkOutDate;
        int hashCode4 = (hashCode3 + (dateV32 == null ? 0 : dateV32.hashCode())) * 31;
        Price price = this.totalPrice;
        int hashCode5 = (hashCode4 + (price == null ? 0 : price.hashCode())) * 31;
        TextAtom textAtom2 = this.priceDescription;
        int hashCode6 = (hashCode5 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        PendingAction pendingAction = this.pendingAction;
        int hashCode7 = (hashCode6 + (pendingAction == null ? 0 : pendingAction.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Badge> list = this.badges;
        TimerDTO timerDTO = this.payUntilBadge;
        TextAtom textAtom = this.name;
        TextAtom textAtom2 = this.address;
        DateV3 dateV3 = this.checkInDate;
        DateV3 dateV32 = this.checkOutDate;
        Price price = this.totalPrice;
        TextAtom textAtom3 = this.priceDescription;
        PendingAction pendingAction = this.pendingAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TravelHotelCardV3DTO(badges=");
        sb2.append(list);
        sb2.append(", payUntilBadge=");
        sb2.append(timerDTO);
        sb2.append(", name=");
        C4636t5.c(", address=", ", checkInDate=", sb2, textAtom, textAtom2);
        sb2.append(dateV3);
        sb2.append(", checkOutDate=");
        sb2.append(dateV32);
        sb2.append(", totalPrice=");
        sb2.append(price);
        sb2.append(", priceDescription=");
        sb2.append(textAtom3);
        sb2.append(", pendingAction=");
        sb2.append(pendingAction);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }
}
