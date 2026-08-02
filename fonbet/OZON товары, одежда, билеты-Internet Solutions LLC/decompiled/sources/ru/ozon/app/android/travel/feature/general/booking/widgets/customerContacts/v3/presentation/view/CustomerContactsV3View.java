package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.view;

import Am.C2438a;
import Em0.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3VO;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonTextInputV2View;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJE\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J/\u00103\u001a\u00020\u00062 \u00102\u001a\u001c\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u00020\u00060.¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0006¢\u0006\u0004\b5\u0010\bJ!\u00107\u001a\u00020\u00062\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b7\u00108R\u0014\u00109\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R*\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\u0004\u0018\u0001`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010NR\u001b\u0010R\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010NR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010C\u001a\u0004\bU\u0010VR\"\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010@¨\u0006Y"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/view/CustomerContactsV3View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "setupRoot", "()V", "addViews", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "processedActionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "phoneNumber", "bindPhoneNumber", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)V", Scopes.EMAIL, "bindEmail", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "bindCell", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "bindCellInfo", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "checkboxStatus", "bindCheckboxStatus", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "bindButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "LEm0/c;", "formatWatcher", "setFormatWatcher", "(LEm0/c;)V", "Lkotlin/Function3;", "", "", "", "onTextInputChanged", "setInputTextWatcher", "(Lfd/n;)V", "clearInputFocus", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCheckBoxStateChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "dp4", "I", "dp8", "dp16", "cashedPhoneNumberVO", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "cashedEmailVO", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonTextInputV2View;", "phoneNumberIV", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonTextInputV2View;", "emailIV", "Lru/ozon/uni/android/cell/CellView;", "cellV$delegate", "getCellV", "()Lru/ozon/uni/android/cell/CellView;", "cellV", "cellInfoView$delegate", "getCellInfoView", "cellInfoView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonBV$delegate", "getButtonBV", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonBV", "onCheckBoxStateChangeListener", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomerContactsV3View extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(CustomerContactsV3View.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(CustomerContactsV3View.class, "cellV", "getCellV()Lru/ozon/uni/android/cell/CellView;", 0), C2438a.c(CustomerContactsV3View.class, "cellInfoView", "getCellInfoView()Lru/ozon/uni/android/cell/CellView;", 0), C2438a.c(CustomerContactsV3View.class, "buttonBV", "getButtonBV()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};
    private Function1<? super AtomAction, Unit> actionHandler;

    /* renamed from: buttonBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate buttonBV;
    private CommonInputV2VO.TextInputV2 cashedEmailVO;
    private CommonInputV2VO.TextInputV2 cashedPhoneNumberVO;

    /* renamed from: cellInfoView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate cellInfoView;

    /* renamed from: cellV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate cellV;
    private final int dp16;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final CommonTextInputV2View emailIV;

    @NotNull
    private Function1<? super CheckBoxDTO.CheckboxStatus, Unit> onCheckBoxStateChangeListener;

    @NotNull
    private final CommonTextInputV2View phoneNumberIV;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasFocus", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.view.CustomerContactsV3View$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            CommonInputV2VO.TextInputV2 textInputV2;
            AtomAction onClick;
            Function1 function1;
            if (!z11 || (textInputV2 = CustomerContactsV3View.this.cashedPhoneNumberVO) == null || (onClick = textInputV2.getOnClick()) == null || (function1 = CustomerContactsV3View.this.actionHandler) == null) {
                return;
            }
            function1.invoke(onClick);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasFocus", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.view.CustomerContactsV3View$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            CommonInputV2VO.TextInputV2 textInputV2;
            AtomAction onClick;
            Function1 function1;
            if (!z11 || (textInputV2 = CustomerContactsV3View.this.cashedEmailVO) == null || (onClick = textInputV2.getOnClick()) == null || (function1 = CustomerContactsV3View.this.actionHandler) == null) {
                return;
            }
            function1.invoke(onClick);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<unused var>", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "checkboxStatus", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.view.CustomerContactsV3View$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements InterfaceC6511n<CheckBoxView, CheckBoxDTO.CheckboxStatus, Boolean, Unit> {
        AnonymousClass3() {
            super(3);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(CheckBoxView checkBoxView, CheckBoxDTO.CheckboxStatus checkboxStatus, Boolean bool) {
            invoke(checkBoxView, checkboxStatus, bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(CheckBoxView checkBoxView, CheckBoxDTO.CheckboxStatus checkboxStatus, boolean z11) {
            Intrinsics.checkNotNullParameter(checkBoxView, "<unused var>");
            Intrinsics.checkNotNullParameter(checkboxStatus, "checkboxStatus");
            CustomerContactsV3View.this.onCheckBoxStateChangeListener.invoke(checkboxStatus);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerContactsV3View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        this.dp16 = ResourceExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new CustomerContactsV3View$special$$inlined$preCreationViewPool$default$1(this), new CustomerContactsV3View$special$$inlined$preCreationViewPool$default$2());
        int i11 = 0;
        int i12 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        CommonTextInputV2View commonTextInputV2View = new CommonTextInputV2View(context, null, 0, i11, i12, defaultConstructorMarker);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, px, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        commonTextInputV2View.setLayoutParams(layoutParams);
        this.phoneNumberIV = commonTextInputV2View;
        CommonTextInputV2View commonTextInputV2View2 = new CommonTextInputV2View(context, null, 0, i11, i12, defaultConstructorMarker);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, px, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        commonTextInputV2View2.setLayoutParams(layoutParams2);
        this.emailIV = commonTextInputV2View2;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.cellV = new PreCreationViewPoolDelegate(context3, N.b(CellView.class), new CustomerContactsV3View$special$$inlined$preCreationViewPool$default$3(this), new CustomerContactsV3View$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.cellInfoView = new PreCreationViewPoolDelegate(context4, N.b(CellView.class), new CustomerContactsV3View$special$$inlined$preCreationViewPool$default$5(this), new CustomerContactsV3View$special$$inlined$preCreationViewPool$default$6(this));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.buttonBV = new PreCreationViewPoolDelegate(context5, N.b(ButtonV3View.class), new CustomerContactsV3View$special$$inlined$preCreationViewPool$default$7(this), new CustomerContactsV3View$special$$inlined$preCreationViewPool$default$8(this));
        this.onCheckBoxStateChangeListener = CustomerContactsV3View$onCheckBoxStateChangeListener$1.INSTANCE;
        setupRoot();
        addViews();
        commonTextInputV2View.getBinding().commonInputV2TextInputMtil.addOnFocusChangeListener(new AnonymousClass1());
        commonTextInputV2View2.getBinding().commonInputV2TextInputMtil.addOnFocusChangeListener(new AnonymousClass2());
        getCellInfoView().getLeftBlock().getCheckBoxView().setOnStateChangeListener(new AnonymousClass3());
    }

    private final void addViews() {
        addView(getTitleTAV());
        addView(this.phoneNumberIV);
        addView(this.emailIV);
        addView(getCellV());
        addView(getCellInfoView());
        addView(getButtonBV());
    }

    private final ButtonV3View getButtonBV() {
        return (ButtonV3View) this.buttonBV.getValue(this, $$delegatedProperties[3]);
    }

    private final CellView getCellInfoView() {
        return (CellView) this.cellInfoView.getValue(this, $$delegatedProperties[2]);
    }

    private final CellView getCellV() {
        return (CellView) this.cellV.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupRoot() {
        setOrientation(1);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackground(roundedBackgroundProducer.produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), 0.0f));
        int i11 = this.dp16;
        setPadding(i11, i11, i11, i11);
    }

    public final void bind(@NotNull CustomerContactsV3VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super AtomAction, Unit> processedActionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(processedActionHandler, "processedActionHandler");
        this.actionHandler = actionHandler;
        TextHolderKt.bind$default(getTitleTAV(), item.getTitle(), null, 2, null);
        CellHolderKt.bindOrGone(getCellV(), item.getCell(), actionHandler);
        CellHolderKt.bindOrGone$default(getCellInfoView(), item.getCellInfo(), null, 2, null);
        ButtonV3HolderKt.bindOrGone(getButtonBV(), item.getButton(), processedActionHandler);
    }

    public final void bindButton(ButtonV3DTO button) {
        ButtonV3HolderKt.bindOrGone(getButtonBV(), button, this.actionHandler);
    }

    public final void bindCell(CellDTO cell) {
        CellHolderKt.bindOrGone(getCellV(), cell, this.actionHandler);
    }

    public final void bindCellInfo(CellDTO cell) {
        CellHolderKt.bindOrGone$default(getCellInfoView(), cell, null, 2, null);
    }

    public final void bindCheckboxStatus(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        if (checkboxStatus != null) {
            getCellInfoView().getLeftBlock().getCheckBoxView().setCheckboxState(checkboxStatus);
        }
    }

    public final void bindEmail(CommonInputV2VO.TextInputV2 email) {
        this.emailIV.bindOrGone(email);
        this.cashedEmailVO = email;
    }

    public final void bindPhoneNumber(CommonInputV2VO.TextInputV2 phoneNumber) {
        this.phoneNumberIV.bindOrGone(phoneNumber);
        this.cashedPhoneNumberVO = phoneNumber;
    }

    public final void bindTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextHolderKt.bind$default(getTitleTAV(), title, null, 2, null);
    }

    public final void clearInputFocus() {
        View findFocus = findFocus();
        if (findFocus == null) {
            return;
        }
        findFocus.clearFocus();
        if (findFocus instanceof CommonTextInputV2View) {
            KeyboardUtilsKt.hideKeyboard(findFocus);
        }
    }

    public final void setCheckBoxStateChangeListener(@NotNull Function1<? super CheckBoxDTO.CheckboxStatus, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onCheckBoxStateChangeListener = listener;
    }

    public final void setFormatWatcher(c formatWatcher) {
        this.phoneNumberIV.setFormatWatcher(formatWatcher);
    }

    public final void setInputTextWatcher(@NotNull InterfaceC6511n<? super Integer, ? super String, ? super CharSequence, Unit> onTextInputChanged) {
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        this.phoneNumberIV.setTextWatcher(new DebouncedTextWatcher(0L, null, new CustomerContactsV3View$setInputTextWatcher$1(this, onTextInputChanged), 3, null));
        this.emailIV.setTextWatcher(new DebouncedTextWatcher(0L, null, new CustomerContactsV3View$setInputTextWatcher$3(this, onTextInputChanged), 3, null));
    }
}
