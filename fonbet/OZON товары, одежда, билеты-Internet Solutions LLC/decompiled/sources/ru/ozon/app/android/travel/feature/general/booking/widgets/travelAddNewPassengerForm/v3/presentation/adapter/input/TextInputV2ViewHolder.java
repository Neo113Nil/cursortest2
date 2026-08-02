package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input;

import Em0.c;
import WZ.l;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3TextInputView;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J¡\u0001\u0010#\u001a\u00020\u000b2\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011j\u0004\u0018\u0001`\u00132(\u0010\u001a\u001a$\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u00112\"\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e2\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R8\u0010\u001a\u001a$\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010+R&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010*R2\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u001e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/TextInputV2ViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3TextInputView;", "inputItemView", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3TextInputView;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem;", "item", "", "payloads", "", "bindWithPayloads", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem;Ljava/util/List;)V", "", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;Ljava/util/List;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/Function4;", "", "", "", "", "onTextInputChanged", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "LEm0/c;", "onSetFormatWatcher", "Lkotlin/Function3;", "onTextInputFocusLost", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "setupCallbacks", "(Lkotlin/jvm/functions/Function1;Lfd/o;Lkotlin/jvm/functions/Function1;Lfd/n;LWZ/l;)V", "removeCallbacks", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3TextInputView;", "boundedData", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem;", "Lkotlin/jvm/functions/Function1;", "Lfd/o;", "Lfd/n;", "LWZ/l;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextInputV2ViewHolder extends BaseViewHolder<TravelAddNewPassengerFormV3VO.InputItemVO> {
    private Function1<? super AtomAction, Unit> actionHandler;
    private TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem boundedData;

    @NotNull
    private final AddNewPassengerFormV3TextInputView inputItemView;
    private Function1<? super CommonInputV2VO.TextInputV2, ? extends c> onSetFormatWatcher;
    private InterfaceC6512o<? super Integer, ? super String, ? super CharSequence, ? super Boolean, Unit> onTextInputChanged;
    private InterfaceC6511n<? super Integer, ? super String, ? super CharSequence, Unit> onTextInputFocusLost;
    private l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputV2ViewHolder(@NotNull AddNewPassengerFormV3TextInputView inputItemView) {
        super(inputItemView);
        Intrinsics.checkNotNullParameter(inputItemView, "inputItemView");
        this.inputItemView = inputItemView;
    }

    private final void bindWithPayloads(TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem item, List<?> payloads) {
        for (Object obj : payloads) {
            if (obj instanceof List) {
                bindWithPayloads(item, (List) obj);
            } else if (obj == AddNewPassengerFormInputV2Payload.CHANGE_ERROR) {
                this.inputItemView.bindNewData(item);
                this.inputItemView.bindError(item.getInput());
            } else if (obj == AddNewPassengerFormInputV2Payload.CHANGE_SUGGESTS) {
                this.inputItemView.bindNewData(item);
                this.inputItemView.bindSuggests(item);
            } else if (obj == AddNewPassengerFormInputV2Payload.CHANGE_INPUT_DATA) {
                this.inputItemView.bindNewData(item);
            }
        }
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(TravelAddNewPassengerFormV3VO.InputItemVO inputItemVO, List list) {
        bind2(inputItemVO, (List<? extends Object>) list);
    }

    public final void removeCallbacks() {
        this.actionHandler = null;
        this.onTextInputChanged = null;
        this.onTextInputFocusLost = null;
        this.onSetFormatWatcher = null;
        this.tokenizedAnalytics = null;
    }

    public final void setupCallbacks(Function1<? super AtomAction, Unit> actionHandler, InterfaceC6512o<? super Integer, ? super String, ? super CharSequence, ? super Boolean, Unit> onTextInputChanged, Function1<? super CommonInputV2VO.TextInputV2, ? extends c> onSetFormatWatcher, InterfaceC6511n<? super Integer, ? super String, ? super CharSequence, Unit> onTextInputFocusLost, l tokenizedAnalytics) {
        this.actionHandler = actionHandler;
        this.onTextInputChanged = onTextInputChanged;
        this.onSetFormatWatcher = onSetFormatWatcher;
        this.onTextInputFocusLost = onTextInputFocusLost;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull TravelAddNewPassengerFormV3VO.InputItemVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (item instanceof TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem) {
            TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem textInputItem = (TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem) item;
            this.boundedData = textInputItem;
            if (payloads.isEmpty()) {
                this.inputItemView.bind(textInputItem, new TextInputV2ViewHolder$bind$1(this), new TextInputV2ViewHolder$bind$2(this), new TextInputV2ViewHolder$bind$3(this), new TextInputV2ViewHolder$bind$4(this), this.tokenizedAnalytics);
            } else {
                bindWithPayloads(textInputItem, payloads);
            }
        }
    }
}
