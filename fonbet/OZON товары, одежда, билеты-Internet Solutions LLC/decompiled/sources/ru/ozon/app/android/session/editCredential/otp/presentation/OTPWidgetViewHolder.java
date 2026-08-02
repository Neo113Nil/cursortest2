package ru.ozon.app.android.session.editCredential.otp.presentation;

import E.RunnableC2901q;
import FG.a;
import Gu.ViewOnClickListenerC3129b;
import Sc.o;
import V.e;
import a00.C4911f;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.J;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.m;
import ru.ozon.app.android.R;
import ru.ozon.app.android.domain.session.utils.OTPPeriodFormatterBuilder;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.session.databinding.WidgetOtpBinding;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetVO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.wrappers.main.button.ButtonState;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$style;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u000f*\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u001d\u0010%\u001a\u00020\u000f*\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010\u001bJ\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0016H\u0002¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\u000fH\u0002¢\u0006\u0004\b,\u0010\u001bJ\u001b\u0010-\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010\u001eJ\u001b\u0010.\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\u001eJ\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b/\u0010\u0011J\u000f\u00100\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u0010\u001bJ\u001d\u00103\u001a\u00020\u000f*\u00020#2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J3\u0010:\u001a\u00020\u000f*\u0002052\b\u00107\u001a\u0004\u0018\u0001062\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u000108H\u0002¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010?R0\u0010@\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000f\u0018\u0001088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u0001088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER*\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010I8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR0\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u0001088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010A\u001a\u0004\bQ\u0010C\"\u0004\bR\u0010ER8\u0010T\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010S8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetViewHolder;", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetView;", "Lru/ozon/app/android/session/databinding/WidgetOtpBinding;", "binding", "Landroidx/lifecycle/J;", "viewOwner", "Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;", "periodFormatterBuilder", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "<init>", "(Lru/ozon/app/android/session/databinding/WidgetOtpBinding;Landroidx/lifecycle/J;Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;La00/f;)V", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "item", "", "bind", "(Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;)V", "Lru/ozon/app/android/session/editCredential/otp/presentation/TimerAction;", "timerAction", "updateTimer", "(Lru/ozon/app/android/session/editCredential/otp/presentation/TimerAction;)V", "", "message", "onError", "(Ljava/lang/String;)V", "onValidationError", "()V", "onDestroyView", "showDefaultPageState", "(Lru/ozon/app/android/session/databinding/WidgetOtpBinding;Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;)V", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "keyboardUp", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;)V", "showErrorPageState", "Lru/ozon/uni/android/controls/button/ButtonView;", "timeLeft", "setTimerState", "(Lru/ozon/uni/android/controls/button/ButtonView;Ljava/lang/String;)V", "setupListeners", "code", "onCodeTextChanged", "(Ljava/lang/String;Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;)V", "tryToValidateCode", "retryRequestNewCode", "setupCodeInput", "handleOtpSms", "setupTimer", "clear", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", "retryButton", "bindRetryOrGone", "(Lru/ozon/uni/android/controls/button/ButtonView;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "Lkotlin/Function1;", "subtitleClickHandler", "bindSubtitle", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/session/databinding/WidgetOtpBinding;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;", "La00/f;", "setRetryTimer", "Lkotlin/jvm/functions/Function1;", "getSetRetryTimer", "()Lkotlin/jvm/functions/Function1;", "setSetRetryTimer", "(Lkotlin/jvm/functions/Function1;)V", "onTryValidate", "getOnTryValidate", "setOnTryValidate", "Lkotlin/Function0;", "onGetNewCodeClicked", "Lkotlin/jvm/functions/Function0;", "getOnGetNewCodeClicked", "()Lkotlin/jvm/functions/Function0;", "setOnGetNewCodeClicked", "(Lkotlin/jvm/functions/Function0;)V", "onSubtitleClicked", "getOnSubtitleClicked", "setOnSubtitleClicked", "Lkotlin/Function2;", "onDeeplinkClicked", "Lkotlin/jvm/functions/Function2;", "getOnDeeplinkClicked", "()Lkotlin/jvm/functions/Function2;", "setOnDeeplinkClicked", "(Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "Lorg/joda/time/format/m;", "formatter", "Lorg/joda/time/format/m;", "Landroid/text/TextWatcher;", "textWatcher", "Landroid/text/TextWatcher;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OTPWidgetViewHolder implements OTPWidgetView {

    @NotNull
    private final WidgetOtpBinding binding;

    @NotNull
    private final C4911f container;
    private m formatter;
    private OTPWidgetVO item;
    private Function2<? super String, ? super String, Unit> onDeeplinkClicked;
    private Function0<Unit> onGetNewCodeClicked;
    private Function1<? super String, Unit> onSubtitleClicked;
    private Function1<? super String, Unit> onTryValidate;

    @NotNull
    private final OTPPeriodFormatterBuilder periodFormatterBuilder;
    private Function1<? super OTPWidgetDTO.RetryButton, Unit> setRetryTimer;
    private TextWatcher textWatcher;

    @NotNull
    private final J viewOwner;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OTPWidgetDTO.PageType.values().length];
            try {
                iArr[OTPWidgetDTO.PageType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OTPWidgetDTO.PageType.ERROR_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OTPWidgetDTO.PageType.ERROR_TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OTPWidgetViewHolder(@NotNull WidgetOtpBinding binding, @NotNull J viewOwner, @NotNull OTPPeriodFormatterBuilder periodFormatterBuilder, @NotNull C4911f container) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(periodFormatterBuilder, "periodFormatterBuilder");
        Intrinsics.checkNotNullParameter(container, "container");
        this.binding = binding;
        this.viewOwner = viewOwner;
        this.periodFormatterBuilder = periodFormatterBuilder;
        this.container = container;
        setupListeners();
    }

    private final void bindRetryOrGone(ButtonView buttonView, OTPWidgetDTO.RetryButton retryButton) {
        if (retryButton == null) {
            ViewExtKt.gone(buttonView);
            return;
        }
        buttonView.setOnClickListener(new a(this, 24));
        buttonView.setClickable(false);
        buttonView.setTitleText(retryButton.getTitle());
    }

    private final void bindSubtitle(TextAtomV2View textAtomV2View, OzonSpannableString ozonSpannableString, Function1<? super String, Unit> function1) {
        if (ozonSpannableString == null) {
            textAtomV2View.setVisibility(8);
            return;
        }
        if (function1 != null) {
            OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, ozonSpannableString, null, Integer.valueOf(textAtomV2View.getContext().getColor(R.color.text_action)), null, new Pair(textAtomV2View, new OTPWidgetViewHolder$bindSubtitle$1(function1)), 5, null);
        }
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        String str = null;
        TestInfo testInfo = null;
        String str2 = null;
        Map map = null;
        TextDTO textDTO = new TextDTO(ozonSpannableString, TextDTO.TextAlignment.LEADING, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, TextPreset.PARAGRAPH_COMPACT, str, UniColors.TEXT_SECONDARY.getToken(), Integer.MAX_VALUE, testInfo, str2, map, OzonSpannableStringKt.hasClickableSpan(ozonSpannableString), null, null, null, null, null, 515260, null);
        textAtomV2View.setVisibility(0);
        TextHolderKt.bind$default(textAtomV2View, textDTO, null, 2, null);
    }

    private final void clear() {
        this.binding.otpEt.getInputViewGroup().getInputView().setText((CharSequence) null);
    }

    private final void handleOtpSms(WidgetOtpBinding widgetOtpBinding, OTPWidgetVO oTPWidgetVO) {
        String value;
        String otpSms = oTPWidgetVO.getOtpSms();
        if (otpSms == null) {
            return;
        }
        Regex regex = new Regex("\\d{" + oTPWidgetVO.getOtpLength() + "}");
        StringBuilder sb2 = new StringBuilder();
        int length = otpSms.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = otpSms.charAt(i11);
            if (Character.isLetterOrDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        MatchResult b11 = regex.b(0, sb3);
        if (b11 == null || (value = b11.getValue()) == null) {
            return;
        }
        widgetOtpBinding.otpEt.getInputViewGroup().getInputView().setText(value);
    }

    private final void keyboardUp(OzonTextInput ozonTextInput) {
        ozonTextInput.postDelayed(new RunnableC2901q(ozonTextInput, 7), 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keyboardUp$lambda$7(OzonTextInput ozonTextInput) {
        ozonTextInput.requestFocus();
        KeyboardUtilsKt.showKeyboard(ozonTextInput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCodeTextChanged(String code, OTPWidgetVO item) {
        int length = code.length();
        Integer otpLength = item.getOtpLength();
        if (otpLength != null && length == otpLength.intValue()) {
            tryToValidateCode(code);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryRequestNewCode() {
        Function0<Unit> onGetNewCodeClicked = getOnGetNewCodeClicked();
        if (onGetNewCodeClicked != null) {
            onGetNewCodeClicked.invoke();
        }
    }

    private final void setTimerState(ButtonView buttonView, String str) {
        buttonView.setSubtitleText(str);
        buttonView.setButtonState(str == null ? ButtonState.ENABLED : ButtonState.DISABLED);
        buttonView.setClickable(str == null);
    }

    private final void setupCodeInput(WidgetOtpBinding widgetOtpBinding, OTPWidgetVO oTPWidgetVO) {
        String value;
        OzonTextInput inputView = widgetOtpBinding.otpEt.getInputViewGroup().getInputView();
        if (oTPWidgetVO.getOtpLength() == null) {
            inputView.setEnabled(false);
            KeyboardUtilsKt.hideKeyboard(inputView);
            return;
        }
        inputView.clearAnimation();
        inputView.clearFocus();
        inputView.setText((CharSequence) null);
        inputView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(oTPWidgetVO.getOtpLength().intValue())});
        OTPWidgetVO.OtpInput input = oTPWidgetVO.getInput();
        if (Intrinsics.d((input == null || (value = input.getValue()) == null) ? null : Integer.valueOf(value.length()), oTPWidgetVO.getOtpLength())) {
            OzonTextInput inputView2 = widgetOtpBinding.otpEt.getInputViewGroup().getInputView();
            OTPWidgetVO.OtpInput input2 = oTPWidgetVO.getInput();
            inputView2.setText(input2 != null ? input2.getValue() : null);
        } else if (oTPWidgetVO.getOtpSms() != null) {
            handleOtpSms(widgetOtpBinding, oTPWidgetVO);
        }
    }

    private final void setupListeners() {
        OzonTextInput inputView = this.binding.otpEt.getInputViewGroup().getInputView();
        TextWatcher textWatcher = new TextWatcher() { // from class: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetViewHolder$setupListeners$lambda$11$$inlined$doAfterTextChanged$1
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
            
                r0 = r2.this$0.item;
             */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void afterTextChanged(Editable s11) {
                String obj;
                OTPWidgetVO oTPWidgetVO;
                if (s11 == null || (obj = s11.toString()) == null || oTPWidgetVO == null) {
                    return;
                }
                OTPWidgetViewHolder.this.onCodeTextChanged(obj, oTPWidgetVO);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        };
        inputView.addTextChangedListener(textWatcher);
        this.textWatcher = textWatcher;
    }

    private final void setupTimer(OTPWidgetVO item) {
        Integer timerDuration;
        OTPWidgetDTO.RetryButton retryButton = item.getRetryButton();
        if (retryButton == null || (timerDuration = retryButton.getTimerDuration()) == null) {
            return;
        }
        this.formatter = this.periodFormatterBuilder.build(timerDuration.intValue());
        Function1<OTPWidgetDTO.RetryButton, Unit> setRetryTimer = getSetRetryTimer();
        if (setRetryTimer != null) {
            setRetryTimer.invoke(retryButton);
        }
    }

    private final void showDefaultPageState(WidgetOtpBinding widgetOtpBinding, OTPWidgetVO oTPWidgetVO) {
        Group otpDefaultPageGroup = widgetOtpBinding.otpDefaultPageGroup;
        Intrinsics.checkNotNullExpressionValue(otpDefaultPageGroup, "otpDefaultPageGroup");
        ViewExtKt.show(otpDefaultPageGroup);
        Group otpErrorPageGroup = widgetOtpBinding.otpErrorPageGroup;
        Intrinsics.checkNotNullExpressionValue(otpErrorPageGroup, "otpErrorPageGroup");
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.hide(otpErrorPageGroup);
        setupCodeInput(widgetOtpBinding, oTPWidgetVO);
        if (oTPWidgetVO.getInput() == null) {
            OzonTextInputLayout otpEt = widgetOtpBinding.otpEt;
            Intrinsics.checkNotNullExpressionValue(otpEt, "otpEt");
            ViewExtKt.gone(otpEt);
        } else {
            OzonTextInputLayout ozonTextInputLayout = widgetOtpBinding.otpEt;
            ozonTextInputLayout.setStyle(TextInputStyle.INSTANCE.createInput600Style());
            OzonTextInput inputView = ozonTextInputLayout.getInputViewGroup().getInputView();
            Context context = this.binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            inputView.setTextSize(ResourceExtKt.spToPx(context, 20.0f));
            OzonTextInput inputView2 = ozonTextInputLayout.getInputViewGroup().getInputView();
            Context context2 = this.binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            TextViewExtKt.applyStyle(inputView2, context2, R$style.OzonTextAppearance_Headline_500medium);
            ozonTextInputLayout.setKeyboardType(OzonTextInputLayoutModel.KeyboardType.NUMBER);
            ViewExtKt.show(ozonTextInputLayout);
            keyboardUp(ozonTextInputLayout.getInputViewGroup().getInputView());
            String placeholder = oTPWidgetVO.getInput().getPlaceholder();
            if (placeholder != null) {
                widgetOtpBinding.otpEt.setLabelText(placeholder);
            }
        }
        widgetOtpBinding.titleTv.setText(oTPWidgetVO.getTitle());
        ButtonView retrySendCodeButton = widgetOtpBinding.retrySendCodeButton;
        Intrinsics.checkNotNullExpressionValue(retrySendCodeButton, "retrySendCodeButton");
        bindRetryOrGone(retrySendCodeButton, oTPWidgetVO.getRetryButton());
        TextAtomV2View subtitleTv = widgetOtpBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        bindSubtitle(subtitleTv, oTPWidgetVO.getSubtitle(), getOnSubtitleClicked());
        widgetOtpBinding.hintButtonsContainer.removeAllViewsInLayout();
        List<OTPWidgetVO.HintButton> hintButtons = oTPWidgetVO.getHintButtons();
        if (hintButtons != null) {
            for (OTPWidgetVO.HintButton hintButton : hintButtons) {
                LinearLayout linearLayout = widgetOtpBinding.hintButtonsContainer;
                Context context3 = widgetOtpBinding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                TextAtomV2View textAtomV2View = new TextAtomV2View(context3, null, 0, 6, null);
                textAtomV2View.setGravity(1);
                textAtomV2View.setTextIsSelectable(false);
                TextHolderKt.bindOrGone$default(textAtomV2View, hintButton.getText(), null, 2, null);
                textAtomV2View.setOnClickListener(new ViewOnClickListenerC3129b(2, this, hintButton));
                linearLayout.addView(textAtomV2View);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDefaultPageState$lambda$6$lambda$5$lambda$4(OTPWidgetViewHolder oTPWidgetViewHolder, OTPWidgetVO.HintButton hintButton, View view) {
        OTPWidgetVO.HintAction action;
        String deeplink;
        Function2<String, String, Unit> onDeeplinkClicked = oTPWidgetViewHolder.getOnDeeplinkClicked();
        if (onDeeplinkClicked == null || (action = hintButton.getAction()) == null || (deeplink = action.getDeeplink()) == null) {
            return;
        }
        onDeeplinkClicked.invoke(deeplink, hintButton.getTrackClick());
    }

    private final void showErrorPageState(WidgetOtpBinding widgetOtpBinding, OTPWidgetVO oTPWidgetVO) {
        ImageDTO imageDTO;
        Group otpDefaultPageGroup = widgetOtpBinding.otpDefaultPageGroup;
        Intrinsics.checkNotNullExpressionValue(otpDefaultPageGroup, "otpDefaultPageGroup");
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.hide(otpDefaultPageGroup);
        Group otpErrorPageGroup = widgetOtpBinding.otpErrorPageGroup;
        Intrinsics.checkNotNullExpressionValue(otpErrorPageGroup, "otpErrorPageGroup");
        ViewExtKt.show(otpErrorPageGroup);
        ScrollView constraintLayout = widgetOtpBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        KeyboardUtilsKt.hideKeyboard(constraintLayout);
        widgetOtpBinding.otpErrorTitleTextAtomView.setText(OzonSpannableStringKt.toOzonSpannableString(oTPWidgetVO.getTitle()));
        Image otpErrorImageView = widgetOtpBinding.otpErrorImageView;
        Intrinsics.checkNotNullExpressionValue(otpErrorImageView, "otpErrorImageView");
        String errorLogoUrl = oTPWidgetVO.getErrorLogoUrl();
        if (errorLogoUrl != null) {
            imageDTO = new ImageDTO(errorLogoUrl, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null);
        } else {
            imageDTO = null;
        }
        ImageHolderKt.bindOrGone$default(otpErrorImageView, imageDTO, null, 2, null);
        ButtonView otpErrorRetryButton = widgetOtpBinding.otpErrorRetryButton;
        Intrinsics.checkNotNullExpressionValue(otpErrorRetryButton, "otpErrorRetryButton");
        bindRetryOrGone(otpErrorRetryButton, oTPWidgetVO.getRetryButton());
    }

    private final void tryToValidateCode(String code) {
        Function1<String, Unit> onTryValidate = getOnTryValidate();
        if (onTryValidate != null) {
            onTryValidate.invoke(code);
        }
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetView
    public void bind(@NotNull OTPWidgetVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        setupTimer(item);
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getPageType().ordinal()];
        if (i11 == 1) {
            showDefaultPageState(this.binding, item);
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new o();
            }
            showErrorPageState(this.binding, item);
        }
    }

    public Function2<String, String, Unit> getOnDeeplinkClicked() {
        return this.onDeeplinkClicked;
    }

    public Function0<Unit> getOnGetNewCodeClicked() {
        return this.onGetNewCodeClicked;
    }

    public Function1<String, Unit> getOnSubtitleClicked() {
        return this.onSubtitleClicked;
    }

    public Function1<String, Unit> getOnTryValidate() {
        return this.onTryValidate;
    }

    public Function1<OTPWidgetDTO.RetryButton, Unit> getSetRetryTimer() {
        return this.setRetryTimer;
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetView
    public void onDestroyView() {
        TextWatcher textWatcher = this.textWatcher;
        if (textWatcher != null) {
            this.binding.otpEt.getInputViewGroup().getInputView().removeTextChangedListener(textWatcher);
        }
        KeyboardUtilsKt.hideKeyboard(this.binding.otpEt.getInputViewGroup().getInputView());
        WidgetOtpBinding widgetOtpBinding = this.binding;
        widgetOtpBinding.otpCl.removeView(widgetOtpBinding.otpEt);
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetView
    public void onError(String message) {
        OzonSpannableString ozonSpannableString;
        clear();
        ViewGroup rootView = ContextExtKt.getRootView(this.container.i());
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            int i11 = R$drawable.ic_warning;
            if (message == null || (ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message)) == null) {
                ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_universal_network_error));
            }
            FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, 3000L, null, null, this.viewOwner, 57306, null).show();
        }
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetView
    public void onValidationError() {
        clear();
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetView
    public void setOnDeeplinkClicked(Function2<? super String, ? super String, Unit> function2) {
        this.onDeeplinkClicked = function2;
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetView
    public void setOnGetNewCodeClicked(Function0<Unit> function0) {
        this.onGetNewCodeClicked = function0;
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetView
    public void setOnSubtitleClicked(Function1<? super String, Unit> function1) {
        this.onSubtitleClicked = function1;
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetView
    public void setOnTryValidate(Function1<? super String, Unit> function1) {
        this.onTryValidate = function1;
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetView
    public void setSetRetryTimer(Function1<? super OTPWidgetDTO.RetryButton, Unit> function1) {
        this.setRetryTimer = function1;
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetView
    public void updateTimer(@NotNull TimerAction timerAction) {
        Intrinsics.checkNotNullParameter(timerAction, "timerAction");
        Integer timeLeft = timerAction.getTimeLeft();
        String subtitle = timerAction.getSubtitle();
        m mVar = this.formatter;
        WidgetOtpBinding widgetOtpBinding = this.binding;
        if (timeLeft != null && subtitle != null && mVar != null) {
            String b11 = e.b(new Object[]{mVar.e(Period.F(timeLeft.intValue()).E(PeriodType.j()))}, 1, subtitle, "format(...)");
            ButtonView retrySendCodeButton = widgetOtpBinding.retrySendCodeButton;
            Intrinsics.checkNotNullExpressionValue(retrySendCodeButton, "retrySendCodeButton");
            setTimerState(retrySendCodeButton, b11);
            ButtonView otpErrorRetryButton = widgetOtpBinding.otpErrorRetryButton;
            Intrinsics.checkNotNullExpressionValue(otpErrorRetryButton, "otpErrorRetryButton");
            setTimerState(otpErrorRetryButton, b11);
        }
        if (timerAction.getAllowResend()) {
            ButtonView retrySendCodeButton2 = widgetOtpBinding.retrySendCodeButton;
            Intrinsics.checkNotNullExpressionValue(retrySendCodeButton2, "retrySendCodeButton");
            setTimerState(retrySendCodeButton2, null);
            ButtonView otpErrorRetryButton2 = widgetOtpBinding.otpErrorRetryButton;
            Intrinsics.checkNotNullExpressionValue(otpErrorRetryButton2, "otpErrorRetryButton");
            setTimerState(otpErrorRetryButton2, null);
        }
    }
}
