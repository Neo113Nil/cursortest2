package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view;

import WZ.l;
import WZ.t;
import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.R$string;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonSelectorInputV2View;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonTextInputV2View;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJe\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2(\u0010\u0010\u001a$\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00112\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R8\u0010\u0010\u001a$\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/BirthCertificateInputV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "setConstraints", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$BirthCertificateInputItem;", "item", "Lkotlin/Function4;", "", "", "", "", "onTextInputChanged", "Lkotlin/Function1;", "onSelectorClicked", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$BirthCertificateInputItem;Lfd/o;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "input", "bindSelectorError", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;)V", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "bindTextError", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)V", "inputItem", "bindNewData", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$BirthCertificateInputItem;)V", "dp8", "I", "dash", "Ljava/lang/String;", "Landroidx/constraintlayout/widget/Guideline;", "guidelineG", "Landroidx/constraintlayout/widget/Guideline;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonSelectorInputV2View;", "seriesSelectorInputV2View", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonSelectorInputV2View;", "Landroidx/appcompat/widget/AppCompatTextView;", "dashSeparatorInputV2View", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonTextInputV2View;", "seriesTextInputV2View", "Lru/ozon/app/android/travel/molecules/view/commonInput/v2/view/CommonTextInputV2View;", "Lfd/o;", "boundedData", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$BirthCertificateInputItem;", "LWZ/l;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BirthCertificateInputV2View extends ConstraintLayout {
    private TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem boundedData;

    @NotNull
    private final String dash;

    @NotNull
    private final AppCompatTextView dashSeparatorInputV2View;
    private final int dp8;

    @NotNull
    private final Guideline guidelineG;
    private InterfaceC6512o<? super Integer, ? super String, ? super CharSequence, ? super Boolean, Unit> onTextInputChanged;

    @NotNull
    private final CommonSelectorInputV2View seriesSelectorInputV2View;

    @NotNull
    private final CommonTextInputV2View seriesTextInputV2View;
    private l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasFocus", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.BirthCertificateInputV2View$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem birthCertificateInputItem;
            CommonInputV2VO.SelectorV2 input;
            t clickEvent;
            l lVar;
            if (!z11 || (birthCertificateInputItem = BirthCertificateInputV2View.this.boundedData) == null || (input = birthCertificateInputItem.getInput()) == null || (clickEvent = input.getClickEvent()) == null || (lVar = BirthCertificateInputV2View.this.tokenizedAnalytics) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar, clickEvent, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthCertificateInputV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = UiExtKt.toPx(8, context);
        String string = StringProvider.getString(R$string.travel_common_dash);
        this.dash = string;
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = D40.a.a(guideline, R$id.birthCertificateInputV2Guideline, -2, -2);
        a11.f41615V = 1;
        a11.f41624c = 0.5f;
        guideline.setLayoutParams(a11);
        this.guidelineG = guideline;
        int i11 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet = null;
        int i12 = 0;
        int i13 = 0;
        CommonSelectorInputV2View commonSelectorInputV2View = new CommonSelectorInputV2View(context, attributeSet, i12, i13, i11, defaultConstructorMarker);
        commonSelectorInputV2View.setId(R$id.birthCertificateInputV2SeriesSelector);
        commonSelectorInputV2View.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.seriesSelectorInputV2View = commonSelectorInputV2View;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.birthCertificateInputV2DashSeparator);
        appCompatTextView.setText(string);
        appCompatTextView.setTextAppearance(context, R$style.OzonTextAppearance_Compact_500medium);
        appCompatTextView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.dashSeparatorInputV2View = appCompatTextView;
        CommonTextInputV2View commonTextInputV2View = new CommonTextInputV2View(context, attributeSet, i12, i13, i11, defaultConstructorMarker);
        commonTextInputV2View.setId(R$id.birthCertificateInputV2SeriesText);
        commonTextInputV2View.setLayoutParams(new ConstraintLayout.b(0, -2));
        commonTextInputV2View.setInputFilter(new InputFilter.AllCaps());
        this.seriesTextInputV2View = commonTextInputV2View;
        addView(guideline);
        addView(commonSelectorInputV2View);
        addView(appCompatTextView);
        addView(commonTextInputV2View);
        setConstraints();
        commonTextInputV2View.setTextWatcher(new DebouncedTextWatcher(0L, new AnonymousClass1(), new AnonymousClass2(), 1, null));
        commonTextInputV2View.getBinding().commonInputV2TextInputMtil.addOnFocusChangeListener(new AnonymousClass4());
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new BirthCertificateInputV2View$setConstraints$1(this));
    }

    public final void bind(@NotNull TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem item, InterfaceC6512o<? super Integer, ? super String, ? super CharSequence, ? super Boolean, Unit> onTextInputChanged, Function1<? super Integer, Unit> onSelectorClicked, l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        this.onTextInputChanged = onTextInputChanged;
        this.tokenizedAnalytics = tokenizedAnalytics;
        CommonSelectorInputV2View.bind$default(this.seriesSelectorInputV2View, item.getInput(), null, onSelectorClicked, 2, null);
        CommonTextInputV2View.bind$default(this.seriesTextInputV2View, item.getSeriesTextInput(), false, 2, null);
    }

    public final void bindNewData(@NotNull TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem inputItem) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        this.boundedData = inputItem;
    }

    public final void bindSelectorError(@NotNull CommonInputV2VO.SelectorV2 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.seriesSelectorInputV2View.bindError(input);
    }

    public final void bindTextError(@NotNull CommonInputV2VO.TextInputV2 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.seriesTextInputV2View.bindError(input);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.BirthCertificateInputV2View$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<CharSequence, Unit> {
        AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            CommonInputV2VO.TextInputV2 seriesTextInput;
            InterfaceC6512o interfaceC6512o;
            TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem birthCertificateInputItem = BirthCertificateInputV2View.this.boundedData;
            if (birthCertificateInputItem == null || (seriesTextInput = birthCertificateInputItem.getSeriesTextInput()) == null || (interfaceC6512o = BirthCertificateInputV2View.this.onTextInputChanged) == null) {
                return;
            }
            interfaceC6512o.invoke(Integer.valueOf(seriesTextInput.getId()), seriesTextInput.getValue(), charSequence, Boolean.TRUE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.BirthCertificateInputV2View$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
        AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            if (charSequence == null || charSequence.length() == 0) {
                BirthCertificateInputV2View.this.seriesTextInputV2View.showMaskPattern();
            } else {
                BirthCertificateInputV2View.this.seriesTextInputV2View.hideMaskPattern();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.f71690a;
        }
    }
}
