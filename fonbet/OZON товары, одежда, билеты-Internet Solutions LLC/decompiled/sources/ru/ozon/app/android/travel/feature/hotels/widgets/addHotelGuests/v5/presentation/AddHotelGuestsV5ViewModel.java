package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation;

import An.C2439a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorItem;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001!J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0010J9\u0010\u0019\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel;", "", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent;", "getBroadcastEventLiveData", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;", "room", "", "bindRoom", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;)V", "", "roomId", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "onAddGuestClicked", "(ILru/ozon/uni/atoms/af/AtomAction$Click;)V", "onRemoveGuestClicked", "formId", "", "inputId", "", "oldValue", "", "newValue", "onTextInputChanged", "(IIJLjava/lang/String;Ljava/lang/CharSequence;)V", "onSelectorClicked", "(IIJ)V", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "selectedItem", "onSelectorItemSelected", "(Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;)V", "RoomEvent", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AddHotelGuestsV5ViewModel {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent;", "", "", "roomId", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action;", "action", "<init>", "(ILru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRoomId", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action;", "getAction", "()Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action;", "Action", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RoomEvent {

        @NotNull
        private final Action action;
        private final int roomId;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action;", "", "UpdateForms", "ShowSelector", "TrackEvent", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action$ShowSelector;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action$TrackEvent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action$UpdateForms;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Action {

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action$ShowSelector;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "selectorItems", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getSelectorItems", "()Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ShowSelector implements Action {

                @NotNull
                private final List<SelectorItem> selectorItems;

                @NotNull
                private final String title;

                public ShowSelector(@NotNull String title, @NotNull List<SelectorItem> selectorItems) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(selectorItems, "selectorItems");
                    this.title = title;
                    this.selectorItems = selectorItems;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ShowSelector)) {
                        return false;
                    }
                    ShowSelector showSelector = (ShowSelector) other;
                    return Intrinsics.d(this.title, showSelector.title) && Intrinsics.d(this.selectorItems, showSelector.selectorItems);
                }

                @NotNull
                public final List<SelectorItem> getSelectorItems() {
                    return this.selectorItems;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.selectorItems.hashCode() + (this.title.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return C2439a.a("ShowSelector(title=", this.title, ", selectorItems=", ")", this.selectorItems);
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action$TrackEvent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TrackEvent implements Action {

                @NotNull
                private final t tokenizedEvent;

                public TrackEvent(@NotNull t tokenizedEvent) {
                    Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
                    this.tokenizedEvent = tokenizedEvent;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TrackEvent) && Intrinsics.d(this.tokenizedEvent, ((TrackEvent) other).tokenizedEvent);
                }

                @NotNull
                public final t getTokenizedEvent() {
                    return this.tokenizedEvent;
                }

                public int hashCode() {
                    return this.tokenizedEvent.hashCode();
                }

                @NotNull
                public String toString() {
                    return "TrackEvent(tokenizedEvent=" + this.tokenizedEvent + ")";
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action$UpdateForms;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent$Action;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "forms", "", "isAddGuestButtonVisible", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getForms", "()Ljava/util/List;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class UpdateForms implements Action {

                @NotNull
                private final List<AddHotelGuestsV5VO.GuestFormVO> forms;
                private final Boolean isAddGuestButtonVisible;

                public UpdateForms(@NotNull List<AddHotelGuestsV5VO.GuestFormVO> forms, Boolean bool) {
                    Intrinsics.checkNotNullParameter(forms, "forms");
                    this.forms = forms;
                    this.isAddGuestButtonVisible = bool;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UpdateForms)) {
                        return false;
                    }
                    UpdateForms updateForms = (UpdateForms) other;
                    return Intrinsics.d(this.forms, updateForms.forms) && Intrinsics.d(this.isAddGuestButtonVisible, updateForms.isAddGuestButtonVisible);
                }

                @NotNull
                public final List<AddHotelGuestsV5VO.GuestFormVO> getForms() {
                    return this.forms;
                }

                public int hashCode() {
                    int hashCode = this.forms.hashCode() * 31;
                    Boolean bool = this.isAddGuestButtonVisible;
                    return hashCode + (bool == null ? 0 : bool.hashCode());
                }

                /* renamed from: isAddGuestButtonVisible, reason: from getter */
                public final Boolean getIsAddGuestButtonVisible() {
                    return this.isAddGuestButtonVisible;
                }

                @NotNull
                public String toString() {
                    return "UpdateForms(forms=" + this.forms + ", isAddGuestButtonVisible=" + this.isAddGuestButtonVisible + ")";
                }

                public /* synthetic */ UpdateForms(List list, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(list, (i11 & 2) != 0 ? null : bool);
                }
            }
        }

        public RoomEvent(int i11, @NotNull Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.roomId = i11;
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoomEvent)) {
                return false;
            }
            RoomEvent roomEvent = (RoomEvent) other;
            return this.roomId == roomEvent.roomId && Intrinsics.d(this.action, roomEvent.action);
        }

        @NotNull
        public final Action getAction() {
            return this.action;
        }

        public final int getRoomId() {
            return this.roomId;
        }

        public int hashCode() {
            return this.action.hashCode() + (Integer.hashCode(this.roomId) * 31);
        }

        @NotNull
        public String toString() {
            return "RoomEvent(roomId=" + this.roomId + ", action=" + this.action + ")";
        }
    }

    void bindRoom(@NotNull AddHotelGuestsV5VO room);

    @NotNull
    BroadcastSingleLiveEvent<RoomEvent> getBroadcastEventLiveData();

    void onAddGuestClicked(int roomId, @NotNull AtomAction.Click action);

    void onRemoveGuestClicked(int roomId, @NotNull AtomAction.Click action);

    void onSelectorClicked(int roomId, int formId, long inputId);

    void onSelectorItemSelected(@NotNull SelectorItem selectedItem);

    void onTextInputChanged(int roomId, int formId, long inputId, @NotNull String oldValue, CharSequence newValue);
}
