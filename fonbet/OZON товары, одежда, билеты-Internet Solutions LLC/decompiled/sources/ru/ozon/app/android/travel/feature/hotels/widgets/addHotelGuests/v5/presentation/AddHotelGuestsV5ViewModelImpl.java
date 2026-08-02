package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation;

import Am.C2438a;
import B0.C2454a;
import P4.f;
import Vc.a;
import WZ.t;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data.AddHotelGuestsV5RoomModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModel;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorItem;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002KLB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00192\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00192\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b3\u00102J9\u0010:\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u00192\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u00192\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR,\u0010E\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0D0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010J¨\u0006M"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel;", "<init>", "()V", "", "fillStorage", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5RoomModel;", "collectRooms", "()Ljava/util/List;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "forms", "", "", "collectGuests", "(Ljava/util/Collection;)Ljava/util/List;", "formVO", "removeForm", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;)Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "input", "clearInput", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "", "formIndex", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "optionalPostfix", "", "isFormOptional", "provideTitle", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Z)Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "storage", "setUpStorage", "(Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;)V", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent;", "getBroadcastEventLiveData", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;", "room", "bindRoom", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;)V", "roomId", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "onAddGuestClicked", "(ILru/ozon/uni/atoms/af/AtomAction$Click;)V", "onRemoveGuestClicked", "formId", "", "inputId", "oldValue", "", "newValue", "onTextInputChanged", "(IIJLjava/lang/String;Ljava/lang/CharSequence;)V", "onSelectorClicked", "(IIJ)V", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "selectedItem", "onSelectorItemSelected", "(Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;)V", "broadcastEventLiveData", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "", "cachedForms", "Ljava/util/Map;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModelImpl$ModifiedInputInfo;", "requestedSelectorInputInfo", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModelImpl$ModifiedInputInfo;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "Companion", "ModifiedInputInfo", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddHotelGuestsV5ViewModelImpl extends w0 implements AddHotelGuestsV5ViewModel {

    @NotNull
    private final BroadcastSingleLiveEvent<AddHotelGuestsV5ViewModel.RoomEvent> broadcastEventLiveData = new BroadcastSingleLiveEvent<>();

    @NotNull
    private final Map<Integer, Map<Integer, AddHotelGuestsV5VO.GuestFormVO>> cachedForms = new LinkedHashMap();
    private ModifiedInputInfo requestedSelectorInputInfo;
    private TravelPageKeyValueStorage storage;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModelImpl$Companion;", "", "<init>", "()V", "KEY_FORM_ID", "", "KEY_ROOMS", "KEY_GUEST_ID", "COMMA", "", "SPACE", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModelImpl$ModifiedInputInfo;", "", "", "roomId", "formId", "", "inputId", "<init>", "(IIJ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRoomId", "getFormId", "J", "getInputId", "()J", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class ModifiedInputInfo {
        private final int formId;
        private final long inputId;
        private final int roomId;

        public ModifiedInputInfo(int i11, int i12, long j11) {
            this.roomId = i11;
            this.formId = i12;
            this.inputId = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ModifiedInputInfo)) {
                return false;
            }
            ModifiedInputInfo modifiedInputInfo = (ModifiedInputInfo) other;
            return this.roomId == modifiedInputInfo.roomId && this.formId == modifiedInputInfo.formId && this.inputId == modifiedInputInfo.inputId;
        }

        public final int getFormId() {
            return this.formId;
        }

        public final long getInputId() {
            return this.inputId;
        }

        public final int getRoomId() {
            return this.roomId;
        }

        public int hashCode() {
            return Long.hashCode(this.inputId) + C2454a.a(this.formId, Integer.hashCode(this.roomId) * 31, 31);
        }

        @NotNull
        public String toString() {
            return f.a(this.inputId, ")", C2438a.a("ModifiedInputInfo(roomId=", this.roomId, ", formId=", ", inputId=", this.formId));
        }
    }

    private final CommonInputVO clearInput(CommonInputVO input) {
        CommonInputVO.Selector copy;
        if (input instanceof CommonInputVO.TextCommonInputVO) {
            CommonInputVO.TextCommonInputVO textCommonInputVO = (CommonInputVO.TextCommonInputVO) input;
            return CommonInputVO.TextCommonInputVO.copy$default(textCommonInputVO, 0L, null, textCommonInputVO.getDefaultValue(), false, null, false, 0, null, false, null, null, false, 0, null, null, null, null, false, null, null, false, 2097139, null);
        }
        if (!(input instanceof CommonInputVO.Selector)) {
            return null;
        }
        CommonInputVO.Selector selector = (CommonInputVO.Selector) input;
        CommonInputVO.Selector.Option defaultOption = selector.getDefaultOption();
        String code = defaultOption != null ? defaultOption.getCode() : null;
        String str = code == null ? "" : code;
        CommonInputVO.Selector.Option defaultOption2 = selector.getDefaultOption();
        String value = defaultOption2 != null ? defaultOption2.getValue() : null;
        copy = selector.copy((r37 & 1) != 0 ? selector.id : 0L, (r37 & 2) != 0 ? selector.name : null, (r37 & 4) != 0 ? selector.value : str, (r37 & 8) != 0 ? selector.isErrorVisible : false, (r37 & 16) != 0 ? selector.error : null, (r37 & 32) != 0 ? selector.scrollOnMount : false, (r37 & 64) != 0 ? selector.text : value == null ? "" : value, (r37 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? selector.placeholder : null, (r37 & 256) != 0 ? selector.isEnabled : false, (r37 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? selector.options : null, (r37 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? selector.onSelectAction : null, (r37 & 2048) != 0 ? selector.defaultOption : null, (r37 & 4096) != 0 ? selector.clickEvent : null, (r37 & 8192) != 0 ? selector.selectEvent : null, (r37 & 16384) != 0 ? selector.rightIcon : null, (r37 & 32768) != 0 ? selector.leftIcon : null);
        return copy;
    }

    private final List<Map<String, String>> collectGuests(Collection<AddHotelGuestsV5VO.GuestFormVO> forms) {
        ArrayList arrayList = new ArrayList();
        for (AddHotelGuestsV5VO.GuestFormVO guestFormVO : forms) {
            if (guestFormVO.getIsFormVisible()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String guestId = guestFormVO.getGuestId();
                if (guestId != null) {
                    linkedHashMap.put("guestId", guestId);
                }
                for (CommonInputVO commonInputVO : guestFormVO.getInputs()) {
                    Pair pair = new Pair(commonInputVO.getName(), commonInputVO.getValue());
                    linkedHashMap.put(pair.e(), pair.f());
                }
                arrayList.add(linkedHashMap);
            }
        }
        return arrayList;
    }

    private final List<AddHotelGuestsV5RoomModel> collectRooms() {
        List I02 = C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModelImpl$collectRooms$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return a.b((Integer) ((Map.Entry) t2).getKey(), (Integer) ((Map.Entry) t11).getKey());
            }
        }, this.cachedForms.entrySet());
        ArrayList arrayList = new ArrayList(C7714v.z(I02, 10));
        Iterator it = I02.iterator();
        while (it.hasNext()) {
            arrayList.add(new AddHotelGuestsV5RoomModel(collectGuests(((Map) ((Map.Entry) it.next()).getValue()).values())));
        }
        return arrayList;
    }

    private final void fillStorage() {
        TravelPageKeyValueStorage travelPageKeyValueStorage = this.storage;
        if (travelPageKeyValueStorage != null) {
            travelPageKeyValueStorage.put("rooms", collectRooms());
        }
    }

    private final TextDTO provideTitle(int formIndex, TextDTO title, TextDTO optionalPostfix, boolean isFormOptional) {
        if (title == null || !isFormOptional) {
            return title;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(title.getText()).append((CharSequence) " ").append((CharSequence) String.valueOf(formIndex + 1));
        if (optionalPostfix != null) {
            if (!h.f0(optionalPostfix.getText(), ',') && !h.f0(optionalPostfix.getText(), ' ')) {
                append.append(' ');
            }
            append.append((CharSequence) optionalPostfix.getText());
        }
        Intrinsics.f(append);
        return TextDTO.copy$default(title, OzonSpannableStringKt.toOzonSpannableString(append), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
    }

    private final AddHotelGuestsV5VO.GuestFormVO removeForm(AddHotelGuestsV5VO.GuestFormVO formVO) {
        List<CommonInputVO> inputs = formVO.getInputs();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = inputs.iterator();
        while (it.hasNext()) {
            CommonInputVO clearInput = clearInput((CommonInputVO) it.next());
            if (clearInput != null) {
                arrayList.add(clearInput);
            }
        }
        return AddHotelGuestsV5VO.GuestFormVO.copy$default(formVO, 0, null, null, null, null, arrayList, false, false, null, null, 927, null);
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModel
    public void bindRoom(@NotNull AddHotelGuestsV5VO room) {
        Intrinsics.checkNotNullParameter(room, "room");
        Map<Integer, Map<Integer, AddHotelGuestsV5VO.GuestFormVO>> map = this.cachedForms;
        Integer valueOf = Integer.valueOf(room.getRoomId());
        List<AddHotelGuestsV5VO.GuestFormVO> forms = room.getForms();
        LinkedHashMap linkedHashMap = new LinkedHashMap(room.getForms().size());
        for (Object obj : forms) {
            linkedHashMap.put(Integer.valueOf(((AddHotelGuestsV5VO.GuestFormVO) obj).getId()), obj);
        }
        map.put(valueOf, linkedHashMap);
        fillStorage();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModel
    @NotNull
    public BroadcastSingleLiveEvent<AddHotelGuestsV5ViewModel.RoomEvent> getBroadcastEventLiveData() {
        return this.broadcastEventLiveData;
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModel
    public void onAddGuestClicked(int roomId, @NotNull AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Map map = this.cachedForms.get(Integer.valueOf(roomId));
        if (map == null) {
            return;
        }
        Set entrySet = map.entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (!((AddHotelGuestsV5VO.GuestFormVO) ((Map.Entry) obj).getValue()).getIsFormVisible()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (Map.Entry entry : arrayList) {
            map.put(entry.getKey(), AddHotelGuestsV5VO.GuestFormVO.copy$default((AddHotelGuestsV5VO.GuestFormVO) entry.getValue(), 0, null, null, null, null, null, true, false, null, null, 959, null));
        }
        this.broadcastEventLiveData.setValue(new AddHotelGuestsV5ViewModel.RoomEvent(roomId, new AddHotelGuestsV5ViewModel.RoomEvent.Action.UpdateForms(C7714v.U0(map.values()), Boolean.FALSE)));
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModel
    public void onRemoveGuestClicked(int roomId, @NotNull AtomAction.Click action) {
        Map<String, String> params;
        String str;
        Integer w02;
        AddHotelGuestsV5VO.GuestFormVO remove;
        Intrinsics.checkNotNullParameter(action, "action");
        Map<Integer, AddHotelGuestsV5VO.GuestFormVO> map = this.cachedForms.get(Integer.valueOf(roomId));
        if (map == null || (params = action.getParams()) == null || (str = params.get("formId")) == null || (w02 = h.w0(str)) == null || (remove = map.remove(w02)) == null) {
            return;
        }
        map.put(w02, removeForm(remove));
        int i11 = 0;
        for (Object obj : map.values()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AddHotelGuestsV5VO.GuestFormVO guestFormVO = (AddHotelGuestsV5VO.GuestFormVO) obj;
            TextDTO provideTitle = provideTitle(i11, guestFormVO.getTitle(), guestFormVO.getOptionalGuestTitlePostfix(), guestFormVO.getIsOptionalForm());
            if (!Intrinsics.d(guestFormVO.getResultTitle(), provideTitle)) {
                map.put(Integer.valueOf(guestFormVO.getId()), AddHotelGuestsV5VO.GuestFormVO.copy$default(guestFormVO, 0, null, null, provideTitle, null, null, false, false, null, null, 1015, null));
            }
            i11 = i12;
        }
        this.broadcastEventLiveData.setValue(new AddHotelGuestsV5ViewModel.RoomEvent(roomId, new AddHotelGuestsV5ViewModel.RoomEvent.Action.UpdateForms(C7714v.U0(map.values()), Boolean.TRUE)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModel
    public void onSelectorClicked(int roomId, int formId, long inputId) {
        AddHotelGuestsV5VO.GuestFormVO guestFormVO;
        CommonInputVO.Selector selector;
        Map<Integer, AddHotelGuestsV5VO.GuestFormVO> map = this.cachedForms.get(Integer.valueOf(roomId));
        if (map == null || (guestFormVO = map.get(Integer.valueOf(formId))) == null) {
            return;
        }
        Iterator it = guestFormVO.getInputs().iterator();
        while (true) {
            if (it.hasNext()) {
                selector = it.next();
                if (((CommonInputVO) selector).getId() == inputId) {
                    break;
                }
            } else {
                selector = 0;
                break;
            }
        }
        CommonInputVO.Selector selector2 = selector instanceof CommonInputVO.Selector ? selector : null;
        if (selector2 == null) {
            return;
        }
        t clickEvent = selector2.getClickEvent();
        if (clickEvent != null) {
            this.broadcastEventLiveData.setValue(new AddHotelGuestsV5ViewModel.RoomEvent(roomId, new AddHotelGuestsV5ViewModel.RoomEvent.Action.TrackEvent(clickEvent)));
        }
        List<CommonInputVO.Selector.Option> options = selector2.getOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(options, 10));
        for (CommonInputVO.Selector.Option option : options) {
            arrayList.add(new SelectorItem(option.getCode(), option.getValue(), Intrinsics.d(selector2.getValue(), option.getCode())));
        }
        this.broadcastEventLiveData.setValue(new AddHotelGuestsV5ViewModel.RoomEvent(roomId, new AddHotelGuestsV5ViewModel.RoomEvent.Action.ShowSelector(selector2.getPlaceholder(), arrayList)));
        this.requestedSelectorInputInfo = new ModifiedInputInfo(roomId, formId, inputId);
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModel
    public void onSelectorItemSelected(@NotNull SelectorItem selectedItem) {
        Map<Integer, AddHotelGuestsV5VO.GuestFormVO> map;
        AddHotelGuestsV5VO.GuestFormVO guestFormVO;
        CommonInputVO.Selector copy;
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        ModifiedInputInfo modifiedInputInfo = this.requestedSelectorInputInfo;
        if (modifiedInputInfo == null || (map = this.cachedForms.get(Integer.valueOf(modifiedInputInfo.getRoomId()))) == null || (guestFormVO = map.get(Integer.valueOf(modifiedInputInfo.getFormId()))) == null) {
            return;
        }
        Iterator<CommonInputVO> it = guestFormVO.getInputs().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getId() == modifiedInputInfo.getInputId()) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (i11 < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            CommonInputVO commonInputVO = guestFormVO.getInputs().get(intValue);
            CommonInputVO.Selector selector = commonInputVO instanceof CommonInputVO.Selector ? (CommonInputVO.Selector) commonInputVO : null;
            if (selector == null) {
                return;
            }
            copy = selector.copy((r37 & 1) != 0 ? selector.id : 0L, (r37 & 2) != 0 ? selector.name : null, (r37 & 4) != 0 ? selector.value : selectedItem.getCode(), (r37 & 8) != 0 ? selector.isErrorVisible : false, (r37 & 16) != 0 ? selector.error : null, (r37 & 32) != 0 ? selector.scrollOnMount : false, (r37 & 64) != 0 ? selector.text : selectedItem.getName(), (r37 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? selector.placeholder : null, (r37 & 256) != 0 ? selector.isEnabled : false, (r37 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? selector.options : null, (r37 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? selector.onSelectAction : null, (r37 & 2048) != 0 ? selector.defaultOption : null, (r37 & 4096) != 0 ? selector.clickEvent : null, (r37 & 8192) != 0 ? selector.selectEvent : null, (r37 & 16384) != 0 ? selector.rightIcon : null, (r37 & 32768) != 0 ? selector.leftIcon : null);
            ArrayList W02 = C7714v.W0(guestFormVO.getInputs());
            W02.set(intValue, copy);
            map.put(Integer.valueOf(modifiedInputInfo.getFormId()), AddHotelGuestsV5VO.GuestFormVO.copy$default(guestFormVO, 0, null, null, null, null, W02, false, false, null, null, 991, null));
            this.broadcastEventLiveData.setValue(new AddHotelGuestsV5ViewModel.RoomEvent(modifiedInputInfo.getRoomId(), new AddHotelGuestsV5ViewModel.RoomEvent.Action.UpdateForms(C7714v.U0(map.values()), null, 2, null)));
            this.requestedSelectorInputInfo = null;
        }
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModel
    public void onTextInputChanged(int roomId, int formId, long inputId, @NotNull String oldValue, CharSequence newValue) {
        String obj;
        Map<Integer, AddHotelGuestsV5VO.GuestFormVO> map;
        AddHotelGuestsV5VO.GuestFormVO guestFormVO;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        if (newValue == null || (obj = newValue.toString()) == null || Intrinsics.d(oldValue, obj) || (map = this.cachedForms.get(Integer.valueOf(roomId))) == null || (guestFormVO = map.get(Integer.valueOf(formId))) == null) {
            return;
        }
        Iterator<CommonInputVO> it = guestFormVO.getInputs().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getId() == inputId) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (i11 < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            CommonInputVO commonInputVO = guestFormVO.getInputs().get(intValue);
            Intrinsics.g(commonInputVO, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.TextCommonInputVO");
            CommonInputVO.TextCommonInputVO copy$default = CommonInputVO.TextCommonInputVO.copy$default((CommonInputVO.TextCommonInputVO) commonInputVO, 0L, null, obj, false, null, false, 0, null, false, null, null, false, 0, null, null, null, null, false, null, null, false, 1966067, null);
            ArrayList W02 = C7714v.W0(guestFormVO.getInputs());
            W02.set(intValue, copy$default);
            map.put(Integer.valueOf(formId), AddHotelGuestsV5VO.GuestFormVO.copy$default(guestFormVO, 0, null, null, null, null, W02, false, false, null, null, 991, null));
            this.broadcastEventLiveData.setValue(new AddHotelGuestsV5ViewModel.RoomEvent(roomId, new AddHotelGuestsV5ViewModel.RoomEvent.Action.UpdateForms(C7714v.U0(map.values()), null, 2, null)));
        }
    }

    public void setUpStorage(@NotNull TravelPageKeyValueStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
    }
}
