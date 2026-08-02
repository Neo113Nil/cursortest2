package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation;

import Ak.C2436a;
import B90.C2619v;
import Bi.b;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b%\u0010\u001c¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "feedInfo", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO$CancellationInfoVO;", "cancellationInfo", "", "guests", "price", "priceDescription", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO$CancellationInfoVO;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getFeedInfo", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO$CancellationInfoVO;", "getCancellationInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO$CancellationInfoVO;", "Ljava/util/List;", "getGuests", "()Ljava/util/List;", "getPrice", "getPriceDescription", "CancellationInfoVO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRoomAndGuestsVO {

    @NotNull
    private final CancellationInfoVO cancellationInfo;

    @NotNull
    private final TextAtom feedInfo;

    @NotNull
    private final List<TextAtom> guests;

    @NotNull
    private final String id;

    @NotNull
    private final TextAtom price;

    @NotNull
    private final TextAtom priceDescription;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO$CancellationInfoVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "showCancellationButton", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getShowCancellationButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancellationInfoVO {
        public static final int $stable = ButtonV3Atom.SmallIconButton.$stable | TextAtom.$stable;

        @NotNull
        private final ButtonV3Atom.SmallIconButton showCancellationButton;

        @NotNull
        private final TextAtom title;

        public CancellationInfoVO(@NotNull TextAtom title, @NotNull ButtonV3Atom.SmallIconButton showCancellationButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(showCancellationButton, "showCancellationButton");
            this.title = title;
            this.showCancellationButton = showCancellationButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CancellationInfoVO)) {
                return false;
            }
            CancellationInfoVO cancellationInfoVO = (CancellationInfoVO) other;
            return Intrinsics.d(this.title, cancellationInfoVO.title) && Intrinsics.d(this.showCancellationButton, cancellationInfoVO.showCancellationButton);
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getShowCancellationButton() {
            return this.showCancellationButton;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.showCancellationButton.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CancellationInfoVO(title=" + this.title + ", showCancellationButton=" + this.showCancellationButton + ")";
        }
    }

    public TravelRoomAndGuestsVO(@NotNull String id2, @NotNull TextAtom title, @NotNull TextAtom feedInfo, @NotNull CancellationInfoVO cancellationInfo, @NotNull List<TextAtom> guests, @NotNull TextAtom price, @NotNull TextAtom priceDescription) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(feedInfo, "feedInfo");
        Intrinsics.checkNotNullParameter(cancellationInfo, "cancellationInfo");
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        this.id = id2;
        this.title = title;
        this.feedInfo = feedInfo;
        this.cancellationInfo = cancellationInfo;
        this.guests = guests;
        this.price = price;
        this.priceDescription = priceDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRoomAndGuestsVO)) {
            return false;
        }
        TravelRoomAndGuestsVO travelRoomAndGuestsVO = (TravelRoomAndGuestsVO) other;
        return Intrinsics.d(this.id, travelRoomAndGuestsVO.id) && Intrinsics.d(this.title, travelRoomAndGuestsVO.title) && Intrinsics.d(this.feedInfo, travelRoomAndGuestsVO.feedInfo) && Intrinsics.d(this.cancellationInfo, travelRoomAndGuestsVO.cancellationInfo) && Intrinsics.d(this.guests, travelRoomAndGuestsVO.guests) && Intrinsics.d(this.price, travelRoomAndGuestsVO.price) && Intrinsics.d(this.priceDescription, travelRoomAndGuestsVO.priceDescription);
    }

    @NotNull
    public final CancellationInfoVO getCancellationInfo() {
        return this.cancellationInfo;
    }

    @NotNull
    public final TextAtom getFeedInfo() {
        return this.feedInfo;
    }

    @NotNull
    public final List<TextAtom> getGuests() {
        return this.guests;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getPrice() {
        return this.price;
    }

    @NotNull
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.priceDescription.hashCode() + C2619v.b(g.b((this.cancellationInfo.hashCode() + C2619v.b(C2619v.b(this.id.hashCode() * 31, 31, this.title), 31, this.feedInfo)) * 31, 31, this.guests), 31, this.price);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.feedInfo;
        CancellationInfoVO cancellationInfoVO = this.cancellationInfo;
        List<TextAtom> list = this.guests;
        TextAtom textAtom3 = this.price;
        TextAtom textAtom4 = this.priceDescription;
        StringBuilder d11 = C2436a.d("TravelRoomAndGuestsVO(id=", str, ", title=", ", feedInfo=", textAtom);
        d11.append(textAtom2);
        d11.append(", cancellationInfo=");
        d11.append(cancellationInfoVO);
        d11.append(", guests=");
        d11.append(list);
        d11.append(", price=");
        d11.append(textAtom3);
        d11.append(", priceDescription=");
        return b.g(d11, textAtom4, ")");
    }
}
