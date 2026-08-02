package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view;

import Am.C2438a;
import Em0.c;
import WZ.l;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input.AddNewPassengerFormInputV2Payload;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input.AddNewPassengerFormInputsV2Decoration;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input.AddNewPassengerInputsV2Adapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3View;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jß\u0001\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b2&\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\r2\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b2 \u0010\u0017\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\n0\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u001a2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010$\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000e2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00102\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/Function4;", "", "", "", "", "onTextInputChanged", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "LEm0/c;", "onSetFormatWatcher", "Lkotlin/Function3;", "onTextInputFocusLost", "onDateInputClicked", "onSelectorClicked", "Lkotlin/Function2;", "onCheckboxChanged", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;Lkotlin/jvm/functions/Function1;Lfd/o;Lkotlin/jvm/functions/Function1;Lfd/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LWZ/l;)V", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "inputs", "setInputsList", "(Ljava/util/List;)V", "inputPosition", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/AddNewPassengerFormInputV2Payload;", "payload", "changeInput", "(ILru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/AddNewPassengerFormInputV2Payload;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/AddNewPassengerInputsV2Adapter;", "inputsListAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/AddNewPassengerInputsV2Adapter;", "dp8", "I", "dp10", "dp12", "dp16", "Lru/ozon/uni/android/cell/CellView;", "useBankDetailsCV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getUseBankDetailsCV", "()Lru/ozon/uni/android/cell/CellView;", "useBankDetailsCV", "Landroidx/recyclerview/widget/RecyclerView;", "inputsRV", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "saveButtonBV$delegate", "getSaveButtonBV", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "saveButtonBV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "agreementTV$delegate", "getAgreementTV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "agreementTV", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddNewPassengerFormV3View extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AddNewPassengerFormV3View.class, "useBankDetailsCV", "getUseBankDetailsCV()Lru/ozon/uni/android/cell/CellView;", 0), C2438a.c(AddNewPassengerFormV3View.class, "saveButtonBV", "getSaveButtonBV()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0), C2438a.c(AddNewPassengerFormV3View.class, "agreementTV", "getAgreementTV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};

    /* renamed from: agreementTV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate agreementTV;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final AddNewPassengerInputsV2Adapter inputsListAdapter;

    @NotNull
    private final RecyclerView inputsRV;

    /* renamed from: saveButtonBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate saveButtonBV;

    /* renamed from: useBankDetailsCV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate useBankDetailsCV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddNewPassengerFormV3View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AddNewPassengerInputsV2Adapter addNewPassengerInputsV2Adapter = new AddNewPassengerInputsV2Adapter();
        this.inputsListAdapter = addNewPassengerInputsV2Adapter;
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp10 = UiExtKt.toPx(10, context);
        int px = UiExtKt.toPx(12, context);
        this.dp12 = px;
        this.dp16 = UiExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.useBankDetailsCV = new PreCreationViewPoolDelegate(context2, N.b(CellView.class), new AddNewPassengerFormV3View$special$$inlined$preCreationViewPool$default$1(this), new AddNewPassengerFormV3View$special$$inlined$preCreationViewPool$default$2(this));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = px;
        recyclerView.setLayoutParams(layoutParams);
        this.inputsRV = recyclerView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.saveButtonBV = new PreCreationViewPoolDelegate(context3, N.b(ButtonV3View.class), new AddNewPassengerFormV3View$special$$inlined$preCreationViewPool$default$3(this), new AddNewPassengerFormV3View$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.agreementTV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new AddNewPassengerFormV3View$special$$inlined$preCreationViewPool$default$5(this), new AddNewPassengerFormV3View$special$$inlined$preCreationViewPool$default$6(this));
        setOrientation(1);
        addView(getUseBankDetailsCV());
        addView(recyclerView);
        addView(getSaveButtonBV());
        addView(getAgreementTV());
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        recyclerView.setAdapter(addNewPassengerInputsV2Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new AddNewPassengerFormInputsV2Decoration(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeInput$lambda$9(AddNewPassengerFormV3View addNewPassengerFormV3View, int i11, AddNewPassengerFormInputV2Payload addNewPassengerFormInputV2Payload) {
        addNewPassengerFormV3View.inputsListAdapter.notifyItemChanged(i11, addNewPassengerFormInputV2Payload);
    }

    private final TextAtomV2View getAgreementTV() {
        return (TextAtomV2View) this.agreementTV.getValue(this, $$delegatedProperties[2]);
    }

    private final ButtonV3View getSaveButtonBV() {
        return (ButtonV3View) this.saveButtonBV.getValue(this, $$delegatedProperties[1]);
    }

    private final CellView getUseBankDetailsCV() {
        return (CellView) this.useBankDetailsCV.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull TravelAddNewPassengerFormV3VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC6512o<? super Integer, ? super String, ? super CharSequence, ? super Boolean, Unit> onTextInputChanged, Function1<? super CommonInputV2VO.TextInputV2, ? extends c> onSetFormatWatcher, @NotNull InterfaceC6511n<? super Integer, ? super String, ? super CharSequence, Unit> onTextInputFocusLost, @NotNull Function1<? super Integer, Unit> onDateInputClicked, @NotNull Function1<? super Integer, Unit> onSelectorClicked, @NotNull Function2<? super Integer, ? super Boolean, Unit> onCheckboxChanged, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        Intrinsics.checkNotNullParameter(onTextInputFocusLost, "onTextInputFocusLost");
        Intrinsics.checkNotNullParameter(onDateInputClicked, "onDateInputClicked");
        Intrinsics.checkNotNullParameter(onSelectorClicked, "onSelectorClicked");
        Intrinsics.checkNotNullParameter(onCheckboxChanged, "onCheckboxChanged");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.inputsListAdapter.setupCallbacks(actionHandler, onTextInputChanged, onSetFormatWatcher, onTextInputFocusLost, onDateInputClicked, onSelectorClicked, onCheckboxChanged, tokenizedAnalytics);
        CellHolderKt.bindOrGone(getUseBankDetailsCV(), item.getUseBankDetails(), actionHandler);
        CellDTO useBankDetails = item.getUseBankDetails();
        actionHandler.invoke(new AtomAction.ViewAction(useBankDetails != null ? useBankDetails.getTrackingInfo() : null, null, 2, null));
        ButtonV3HolderKt.bind(getSaveButtonBV(), item.getSaveButton(), actionHandler);
        TextHolderKt.bindOrGone$default(getAgreementTV(), item.getAgreementText(), null, 2, null);
    }

    public final void changeInput(final int inputPosition, final AddNewPassengerFormInputV2Payload payload) {
        this.inputsRV.post(new Runnable() { // from class: bO.a
            @Override // java.lang.Runnable
            public final void run() {
                AddNewPassengerFormV3View.changeInput$lambda$9(AddNewPassengerFormV3View.this, inputPosition, payload);
            }
        });
    }

    public final void setInputsList(@NotNull List<? extends TravelAddNewPassengerFormV3VO.InputItemVO> inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.inputsListAdapter.submitList(inputs);
    }
}
