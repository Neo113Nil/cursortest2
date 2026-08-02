package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view;

import Am.C2438a;
import Em0.c;
import Lo.b;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.text.InputFilter;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.badge.AddNewPassengerFormBadgeAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.badge.AddNewPassengerFormBadgeDecoration;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3TextInputView;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonTextInputV2View;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J©\u0001\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b2(\u0010\u0012\u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b2\"\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u00162\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R*\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00109R8\u0010\u0012\u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010:R2\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010;R\u001e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3TextInputView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/Function4;", "", "", "", "", "onTextInputChanged", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "LEm0/c;", "onSetFormatWatcher", "Lkotlin/Function3;", "onTextInputFocusLost", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem;Lkotlin/jvm/functions/Function1;Lfd/o;Lkotlin/jvm/functions/Function1;Lfd/n;LWZ/l;)V", "inputItem", "bindNewData", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem;)V", "input", "bindError", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)V", "bindSuggests", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/badge/AddNewPassengerFormBadgeAdapter;", "badgesAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/badge/AddNewPassengerFormBadgeAdapter;", "dp8", "I", "dp16", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonTextInputV2View;", "textInputV2View", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonTextInputV2View;", "Landroidx/recyclerview/widget/RecyclerView;", "hintBadgesRV", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "infoTextTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getInfoTextTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "infoTextTAV", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3DisclaimerView;", "disclaimerView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3DisclaimerView;", "Lkotlin/jvm/functions/Function1;", "Lfd/o;", "Lfd/n;", "LWZ/l;", "boundedData", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddNewPassengerFormV3TextInputView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AddNewPassengerFormV3TextInputView.class, "infoTextTAV", "getInfoTextTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final AddNewPassengerFormBadgeAdapter badgesAdapter;
    private TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem boundedData;

    @NotNull
    private final AddNewPassengerFormV3DisclaimerView disclaimerView;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final RecyclerView hintBadgesRV;

    /* renamed from: infoTextTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate infoTextTAV;
    private InterfaceC6512o<? super Integer, ? super String, ? super CharSequence, ? super Boolean, Unit> onTextInputChanged;
    private InterfaceC6511n<? super Integer, ? super String, ? super CharSequence, Unit> onTextInputFocusLost;

    @NotNull
    private final CommonTextInputV2View textInputV2View;
    private l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasFocus", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3TextInputView$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass5() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(AddNewPassengerFormV3TextInputView addNewPassengerFormV3TextInputView) {
            ViewExtKt.gone(addNewPassengerFormV3TextInputView.hintBadgesRV);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            CommonInputV2VO.TextInputV2 input;
            CommonInputV2VO.TextInputV2 input2;
            t focusLostTrackingInfo;
            l lVar;
            CommonInputV2VO.TextInputV2 input3;
            t clickEvent;
            l lVar2;
            if (z11) {
                TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem textInputItem = AddNewPassengerFormV3TextInputView.this.boundedData;
                if (textInputItem == null || (input3 = textInputItem.getInput()) == null || (clickEvent = input3.getClickEvent()) == null || (lVar2 = AddNewPassengerFormV3TextInputView.this.tokenizedAnalytics) == null) {
                    return;
                }
                TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar2, clickEvent, null, 2, null);
                return;
            }
            TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem textInputItem2 = AddNewPassengerFormV3TextInputView.this.boundedData;
            if (textInputItem2 != null && (input2 = textInputItem2.getInput()) != null && (focusLostTrackingInfo = input2.getFocusLostTrackingInfo()) != null && (lVar = AddNewPassengerFormV3TextInputView.this.tokenizedAnalytics) != null) {
                TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar, focusLostTrackingInfo, null, 2, null);
            }
            TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem textInputItem3 = AddNewPassengerFormV3TextInputView.this.boundedData;
            if (textInputItem3 == null || (input = textInputItem3.getInput()) == null) {
                return;
            }
            InterfaceC6511n interfaceC6511n = AddNewPassengerFormV3TextInputView.this.onTextInputFocusLost;
            if (interfaceC6511n != null) {
                interfaceC6511n.invoke(Integer.valueOf(input.getId()), input.getValue(), AddNewPassengerFormV3TextInputView.this.textInputV2View.getValue());
            }
            ViewExtKt.gone(AddNewPassengerFormV3TextInputView.this.getInfoTextTAV());
            RecyclerView recyclerView = AddNewPassengerFormV3TextInputView.this.hintBadgesRV;
            final AddNewPassengerFormV3TextInputView addNewPassengerFormV3TextInputView = AddNewPassengerFormV3TextInputView.this;
            recyclerView.post(new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.a
                @Override // java.lang.Runnable
                public final void run() {
                    AddNewPassengerFormV3TextInputView.AnonymousClass5.invoke$lambda$2(AddNewPassengerFormV3TextInputView.this);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddNewPassengerFormV3TextInputView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AddNewPassengerFormBadgeAdapter addNewPassengerFormBadgeAdapter = new AddNewPassengerFormBadgeAdapter();
        this.badgesAdapter = addNewPassengerFormBadgeAdapter;
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = UiExtKt.toPx(16, context);
        this.dp16 = px2;
        CommonTextInputV2View commonTextInputV2View = new CommonTextInputV2View(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(px2);
        layoutParams.setMarginEnd(px2);
        commonTextInputV2View.setLayoutParams(layoutParams);
        commonTextInputV2View.setInputFilter(new InputFilter.AllCaps());
        this.textInputV2View = commonTextInputV2View;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.hintBadgesRV = recyclerView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.infoTextTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new AddNewPassengerFormV3TextInputView$special$$inlined$preCreationViewPool$default$1(this), new AddNewPassengerFormV3TextInputView$special$$inlined$preCreationViewPool$default$2(this));
        AddNewPassengerFormV3DisclaimerView addNewPassengerFormV3DisclaimerView = new AddNewPassengerFormV3DisclaimerView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = px;
        layoutParams2.bottomMargin = px;
        layoutParams2.setMarginStart(px2);
        layoutParams2.setMarginEnd(px2);
        addNewPassengerFormV3DisclaimerView.setLayoutParams(layoutParams2);
        this.disclaimerView = addNewPassengerFormV3DisclaimerView;
        setOrientation(1);
        addView(commonTextInputV2View);
        addView(recyclerView);
        addView(getInfoTextTAV());
        addView(addNewPassengerFormV3DisclaimerView);
        commonTextInputV2View.setTextWatcher(new DebouncedTextWatcher(0L, new AnonymousClass1(), new AnonymousClass2(), 1, null));
        recyclerView.setAdapter(addNewPassengerFormBadgeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.addItemDecoration(new AddNewPassengerFormBadgeDecoration(context));
        commonTextInputV2View.getBinding().commonInputV2TextInputMtil.addOnFocusChangeListener(new AnonymousClass5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindSuggests$lambda$10(AddNewPassengerFormV3TextInputView addNewPassengerFormV3TextInputView) {
        ViewExtKt.gone(addNewPassengerFormV3TextInputView.hintBadgesRV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindSuggests$lambda$9(AddNewPassengerFormV3TextInputView addNewPassengerFormV3TextInputView, TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem textInputItem) {
        addNewPassengerFormV3TextInputView.badgesAdapter.setItems(textInputItem.getHintBadges());
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(addNewPassengerFormV3TextInputView.hintBadgesRV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getInfoTextTAV() {
        return (TextAtomV2View) this.infoTextTAV.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem item, Function1<? super AtomAction, Unit> actionHandler, InterfaceC6512o<? super Integer, ? super String, ? super CharSequence, ? super Boolean, Unit> onTextInputChanged, Function1<? super CommonInputV2VO.TextInputV2, ? extends c> onSetFormatWatcher, InterfaceC6511n<? super Integer, ? super String, ? super CharSequence, Unit> onTextInputFocusLost, l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onTextInputChanged = onTextInputChanged;
        this.onTextInputFocusLost = onTextInputFocusLost;
        this.textInputV2View.setFormatWatcher(onSetFormatWatcher != null ? onSetFormatWatcher.invoke(item.getInput()) : null);
        this.badgesAdapter.setActionHandler(actionHandler);
        CommonTextInputV2View.bind$default(this.textInputV2View, item.getInput(), false, 2, null);
        this.hintBadgesRV.setVisibility(item.getHintBadges().isEmpty() ? 8 : 0);
        if (item.getHintBadges().isEmpty()) {
            ViewExtKt.gone(this.hintBadgesRV);
        } else {
            this.badgesAdapter.setItems(item.getHintBadges());
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(this.hintBadgesRV);
        }
        TextHolderKt.bindOrGone$default(getInfoTextTAV(), item.getInfoText(), null, 2, null);
        this.disclaimerView.bindOrGone(item.getDisclaimer(), actionHandler);
    }

    public final void bindError(@NotNull CommonInputV2VO.TextInputV2 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.textInputV2View.bindError(input);
    }

    public final void bindNewData(@NotNull TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem inputItem) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        this.boundedData = inputItem;
    }

    public final void bindSuggests(@NotNull TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem inputItem) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        if (inputItem.getHintBadges().isEmpty()) {
            this.hintBadgesRV.post(new B50.l(this, 3));
        } else {
            this.hintBadgesRV.post(new b(3, this, inputItem));
        }
        TextHolderKt.bindOrGone$default(getInfoTextTAV(), inputItem.getInfoText(), null, 2, null);
        this.disclaimerView.bindOrGone(inputItem.getDisclaimer(), this.actionHandler);
        this.textInputV2View.bindError(inputItem.getInput());
        this.textInputV2View.updatePlaceholder(inputItem.getInput());
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3TextInputView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
        AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            if (charSequence == null || charSequence.length() == 0) {
                AddNewPassengerFormV3TextInputView.this.textInputV2View.showMaskPattern();
            } else {
                AddNewPassengerFormV3TextInputView.this.textInputV2View.hideMaskPattern();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3TextInputView$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<CharSequence, Unit> {
        AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            CommonInputV2VO.TextInputV2 input;
            InterfaceC6512o interfaceC6512o;
            TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem textInputItem = AddNewPassengerFormV3TextInputView.this.boundedData;
            if (textInputItem == null || (input = textInputItem.getInput()) == null || !AddNewPassengerFormV3TextInputView.this.textInputV2View.inputIsFocused() || (interfaceC6512o = AddNewPassengerFormV3TextInputView.this.onTextInputChanged) == null) {
                return;
            }
            interfaceC6512o.invoke(Integer.valueOf(input.getId()), input.getValue(), charSequence, Boolean.TRUE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.f71690a;
        }
    }
}
