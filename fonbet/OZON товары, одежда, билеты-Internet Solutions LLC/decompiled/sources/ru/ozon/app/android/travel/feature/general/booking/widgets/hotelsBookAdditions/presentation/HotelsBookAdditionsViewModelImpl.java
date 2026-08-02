package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation;

import UZ.a;
import WZ.e;
import WZ.g;
import WZ.h;
import WZ.t;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModel;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorItem;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModel;", "<init>", "()V", "", "fillStorage", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "storage", "setUpStorage", "(Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;)V", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModel$Action;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;)V", "", "inputId", "", "oldValue", "", "newValue", "onTextInputChanged", "(JLjava/lang/String;Ljava/lang/CharSequence;)V", "onSelectorClicked", "(J)V", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "selectedItem", "onSelectorItemSelected", "(Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;)V", "onFormVisibilitySwitched", "actionLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "", "isFormOpened", "Z", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "cachedFields", "Ljava/util/Map;", "requestedSelectorInputId", "Ljava/lang/Long;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookAdditionsViewModelImpl extends w0 implements HotelsBookAdditionsViewModel {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SingleLiveEvent<HotelsBookAdditionsViewModel.Action> actionLiveData = new SingleLiveEvent<>();

    @NotNull
    private final Map<Long, HotelsBookAdditionsVO.FieldVO> cachedFields = new LinkedHashMap();
    private boolean isFormOpened;
    private Long requestedSelectorInputId;
    private TravelPageKeyValueStorage storage;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModelImpl$Companion;", "", "<init>", "()V", "STATUS_KEY", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void fillStorage() {
        TravelPageKeyValueStorage travelPageKeyValueStorage = this.storage;
        if (travelPageKeyValueStorage != null) {
            Collection<HotelsBookAdditionsVO.FieldVO> values = this.cachedFields.values();
            int h11 = U.h(C7714v.z(values, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
            for (HotelsBookAdditionsVO.FieldVO fieldVO : values) {
                Pair pair = new Pair(fieldVO.getInput().getName(), fieldVO.getInput().getValue());
                linkedHashMap.put(pair.e(), pair.f());
            }
            travelPageKeyValueStorage.putAll(linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g onSelectorItemSelected$lambda$6$lambda$5(SelectorItem selectorItem, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap a11 = h.a(params.b());
        a11.put("status", selectorItem.getName());
        return g.a(params, a11, null, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModel
    public void bind(@NotNull HotelsBookAdditionsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.isFormOpened = item.getIsOpen();
        List<HotelsBookAdditionsVO.FieldVO> fields = item.getFields();
        Map<Long, HotelsBookAdditionsVO.FieldVO> map = this.cachedFields;
        for (Object obj : fields) {
            map.put(Long.valueOf(((HotelsBookAdditionsVO.FieldVO) obj).getInput().getId()), obj);
        }
        fillStorage();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModel
    public void onFormVisibilitySwitched() {
        boolean z11 = !this.isFormOpened;
        this.isFormOpened = z11;
        this.actionLiveData.setValue(new HotelsBookAdditionsViewModel.Action.UpdateVisibility(z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModel
    public void onSelectorClicked(long inputId) {
        HotelsBookAdditionsVO.FieldVO fieldVO = this.cachedFields.get(Long.valueOf(inputId));
        if (fieldVO == null) {
            return;
        }
        CommonInputVO input = fieldVO.getInput();
        e eVar = null;
        Object[] objArr = 0;
        CommonInputVO.Selector selector = input instanceof CommonInputVO.Selector ? (CommonInputVO.Selector) input : null;
        if (selector == null) {
            return;
        }
        t clickEvent = selector.getClickEvent();
        if (clickEvent != null) {
            this.actionLiveData.setValue(new HotelsBookAdditionsViewModel.Action.TrackEvent(clickEvent, eVar, 2, objArr == true ? 1 : 0));
        }
        List<CommonInputVO.Selector.Option> options = selector.getOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(options, 10));
        for (CommonInputVO.Selector.Option option : options) {
            arrayList.add(new SelectorItem(option.getCode(), option.getValue(), Intrinsics.d(selector.getValue(), option.getCode())));
        }
        this.actionLiveData.setValue(new HotelsBookAdditionsViewModel.Action.ShowSelector(selector.getPlaceholder(), arrayList));
        this.requestedSelectorInputId = Long.valueOf(inputId);
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModel
    public void onSelectorItemSelected(@NotNull SelectorItem selectedItem) {
        HotelsBookAdditionsVO.FieldVO fieldVO;
        CommonInputVO.Selector copy;
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Long l11 = this.requestedSelectorInputId;
        if (l11 == null || (fieldVO = this.cachedFields.get(l11)) == null) {
            return;
        }
        CommonInputVO input = fieldVO.getInput();
        Intrinsics.g(input, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO.Selector");
        CommonInputVO.Selector selector = (CommonInputVO.Selector) input;
        copy = selector.copy((r37 & 1) != 0 ? selector.id : 0L, (r37 & 2) != 0 ? selector.name : null, (r37 & 4) != 0 ? selector.value : selectedItem.getCode(), (r37 & 8) != 0 ? selector.isErrorVisible : false, (r37 & 16) != 0 ? selector.error : null, (r37 & 32) != 0 ? selector.scrollOnMount : false, (r37 & 64) != 0 ? selector.text : selectedItem.getName(), (r37 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? selector.placeholder : null, (r37 & 256) != 0 ? selector.isEnabled : false, (r37 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? selector.options : null, (r37 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? selector.onSelectAction : null, (r37 & 2048) != 0 ? selector.defaultOption : null, (r37 & 4096) != 0 ? selector.clickEvent : null, (r37 & 8192) != 0 ? selector.selectEvent : null, (r37 & 16384) != 0 ? selector.rightIcon : null, (r37 & 32768) != 0 ? selector.leftIcon : null);
        this.cachedFields.put(l11, HotelsBookAdditionsVO.FieldVO.copy$default(fieldVO, 0, copy, null, 5, null));
        this.actionLiveData.setValue(new HotelsBookAdditionsViewModel.Action.UpdateFields(C7714v.U0(this.cachedFields.values())));
        this.requestedSelectorInputId = null;
        t selectEvent = selector.getSelectEvent();
        if (selectEvent != null) {
            this.actionLiveData.setValue(new HotelsBookAdditionsViewModel.Action.TrackEvent(selectEvent, new BN.a(selectedItem, 0)));
        }
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModel
    public void onTextInputChanged(long inputId, @NotNull String oldValue, CharSequence newValue) {
        String obj;
        HotelsBookAdditionsVO.FieldVO fieldVO;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        if (newValue == null || (obj = newValue.toString()) == null || Intrinsics.d(oldValue, obj) || (fieldVO = this.cachedFields.get(Long.valueOf(inputId))) == null) {
            return;
        }
        CommonInputVO input = fieldVO.getInput();
        CommonInputVO.TextCommonInputVO textCommonInputVO = input instanceof CommonInputVO.TextCommonInputVO ? (CommonInputVO.TextCommonInputVO) input : null;
        if (textCommonInputVO == null) {
            return;
        }
        this.cachedFields.put(Long.valueOf(inputId), HotelsBookAdditionsVO.FieldVO.copy$default(fieldVO, 0, CommonInputVO.TextCommonInputVO.copy$default(textCommonInputVO, 0L, null, obj, false, null, false, 0, null, false, null, null, false, 0, null, null, null, null, false, null, null, false, 2097139, null), null, 5, null));
        this.actionLiveData.setValue(new HotelsBookAdditionsViewModel.Action.UpdateFields(C7714v.U0(this.cachedFields.values())));
    }

    public void setUpStorage(@NotNull TravelPageKeyValueStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModel
    @NotNull
    public SingleLiveEvent<HotelsBookAdditionsViewModel.Action> getActionLiveData() {
        return this.actionLiveData;
    }
}
