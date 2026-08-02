package ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation;

import B90.C2619v;
import Bl.C2639a;
import Kk.C3532b;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001DB\u0099\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b\u000b\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b5\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b6\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b7\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b8\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b9\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b=\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "badges", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "payUntilBadge", "", "isVisibleBadges", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "hotelName", "hotelAddress", "checkInTitle", "checkInDateWithTime", "checkOutTitle", "checkOutDateWithTime", "Lru/ozon/uni/atoms/data/price/Price;", "totalPrice", "priceDescription", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO$PendingAction;", "pendingAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLjava/util/List;Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;ZLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO$PendingAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "getPayUntilBadge", "()Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "Z", "()Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHotelName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHotelAddress", "getCheckInTitle", "getCheckInDateWithTime", "getCheckOutTitle", "getCheckOutDateWithTime", "Lru/ozon/uni/atoms/data/price/Price;", "getTotalPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getPriceDescription", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO$PendingAction;", "getPendingAction", "()Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO$PendingAction;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "PendingAction", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelHotelCardV3VO implements c {
    private final List<Badge> badges;
    private final TextAtom checkInDateWithTime;
    private final TextAtom checkInTitle;
    private final TextAtom checkOutDateWithTime;
    private final TextAtom checkOutTitle;
    private final TextAtom hotelAddress;

    @NotNull
    private final TextAtom hotelName;
    private final long id;
    private final boolean isVisibleBadges;
    private final TimerDTO payUntilBadge;
    private final PendingAction pendingAction;
    private final TextAtom priceDescription;
    private final Price totalPrice;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO$PendingAction;", "", "", "timeLeft", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(ILru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTimeLeft", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PendingAction {
        public static final int $stable = AtomAction.$stable;

        @NotNull
        private final AtomAction action;
        private final int timeLeft;

        public PendingAction(int i11, @NotNull AtomAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.timeLeft = i11;
            this.action = action;
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
        public final AtomAction getAction() {
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

    public TravelHotelCardV3VO(long j11, List<Badge> list, TimerDTO timerDTO, boolean z11, @NotNull TextAtom hotelName, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, TextAtom textAtom4, TextAtom textAtom5, Price price, TextAtom textAtom6, PendingAction pendingAction, t tVar) {
        Intrinsics.checkNotNullParameter(hotelName, "hotelName");
        this.id = j11;
        this.badges = list;
        this.payUntilBadge = timerDTO;
        this.isVisibleBadges = z11;
        this.hotelName = hotelName;
        this.hotelAddress = textAtom;
        this.checkInTitle = textAtom2;
        this.checkInDateWithTime = textAtom3;
        this.checkOutTitle = textAtom4;
        this.checkOutDateWithTime = textAtom5;
        this.totalPrice = price;
        this.priceDescription = textAtom6;
        this.pendingAction = pendingAction;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelHotelCardV3VO)) {
            return false;
        }
        TravelHotelCardV3VO travelHotelCardV3VO = (TravelHotelCardV3VO) other;
        return this.id == travelHotelCardV3VO.id && Intrinsics.d(this.badges, travelHotelCardV3VO.badges) && Intrinsics.d(this.payUntilBadge, travelHotelCardV3VO.payUntilBadge) && this.isVisibleBadges == travelHotelCardV3VO.isVisibleBadges && Intrinsics.d(this.hotelName, travelHotelCardV3VO.hotelName) && Intrinsics.d(this.hotelAddress, travelHotelCardV3VO.hotelAddress) && Intrinsics.d(this.checkInTitle, travelHotelCardV3VO.checkInTitle) && Intrinsics.d(this.checkInDateWithTime, travelHotelCardV3VO.checkInDateWithTime) && Intrinsics.d(this.checkOutTitle, travelHotelCardV3VO.checkOutTitle) && Intrinsics.d(this.checkOutDateWithTime, travelHotelCardV3VO.checkOutDateWithTime) && Intrinsics.d(this.totalPrice, travelHotelCardV3VO.totalPrice) && Intrinsics.d(this.priceDescription, travelHotelCardV3VO.priceDescription) && Intrinsics.d(this.pendingAction, travelHotelCardV3VO.pendingAction) && Intrinsics.d(this.viewEvent, travelHotelCardV3VO.viewEvent);
    }

    public final List<Badge> getBadges() {
        return this.badges;
    }

    public final TextAtom getCheckInDateWithTime() {
        return this.checkInDateWithTime;
    }

    public final TextAtom getCheckInTitle() {
        return this.checkInTitle;
    }

    public final TextAtom getCheckOutDateWithTime() {
        return this.checkOutDateWithTime;
    }

    public final TextAtom getCheckOutTitle() {
        return this.checkOutTitle;
    }

    public final TextAtom getHotelAddress() {
        return this.hotelAddress;
    }

    @NotNull
    public final TextAtom getHotelName() {
        return this.hotelName;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Price getTotalPrice() {
        return this.totalPrice;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        List<Badge> list = this.badges;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        TimerDTO timerDTO = this.payUntilBadge;
        int b11 = C2619v.b(C3532b.a((hashCode2 + (timerDTO == null ? 0 : timerDTO.hashCode())) * 31, 31, this.isVisibleBadges), 31, this.hotelName);
        TextAtom textAtom = this.hotelAddress;
        int hashCode3 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.checkInTitle;
        int hashCode4 = (hashCode3 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        TextAtom textAtom3 = this.checkInDateWithTime;
        int hashCode5 = (hashCode4 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31;
        TextAtom textAtom4 = this.checkOutTitle;
        int hashCode6 = (hashCode5 + (textAtom4 == null ? 0 : textAtom4.hashCode())) * 31;
        TextAtom textAtom5 = this.checkOutDateWithTime;
        int hashCode7 = (hashCode6 + (textAtom5 == null ? 0 : textAtom5.hashCode())) * 31;
        Price price = this.totalPrice;
        int hashCode8 = (hashCode7 + (price == null ? 0 : price.hashCode())) * 31;
        TextAtom textAtom6 = this.priceDescription;
        int hashCode9 = (hashCode8 + (textAtom6 == null ? 0 : textAtom6.hashCode())) * 31;
        PendingAction pendingAction = this.pendingAction;
        int hashCode10 = (hashCode9 + (pendingAction == null ? 0 : pendingAction.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode10 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isVisibleBadges, reason: from getter */
    public final boolean getIsVisibleBadges() {
        return this.isVisibleBadges;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Badge> list = this.badges;
        TimerDTO timerDTO = this.payUntilBadge;
        boolean z11 = this.isVisibleBadges;
        TextAtom textAtom = this.hotelName;
        TextAtom textAtom2 = this.hotelAddress;
        TextAtom textAtom3 = this.checkInTitle;
        TextAtom textAtom4 = this.checkInDateWithTime;
        TextAtom textAtom5 = this.checkOutTitle;
        TextAtom textAtom6 = this.checkOutDateWithTime;
        Price price = this.totalPrice;
        TextAtom textAtom7 = this.priceDescription;
        PendingAction pendingAction = this.pendingAction;
        t tVar = this.viewEvent;
        StringBuilder b11 = b.b(j11, "TravelHotelCardV3VO(id=", ", badges=", list);
        b11.append(", payUntilBadge=");
        b11.append(timerDTO);
        b11.append(", isVisibleBadges=");
        b11.append(z11);
        C2639a.e(", hotelName=", ", hotelAddress=", b11, textAtom, textAtom2);
        C2639a.e(", checkInTitle=", ", checkInDateWithTime=", b11, textAtom3, textAtom4);
        C2639a.e(", checkOutTitle=", ", checkOutDateWithTime=", b11, textAtom5, textAtom6);
        b11.append(", totalPrice=");
        b11.append(price);
        b11.append(", priceDescription=");
        b11.append(textAtom7);
        b11.append(", pendingAction=");
        b11.append(pendingAction);
        b11.append(", viewEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
