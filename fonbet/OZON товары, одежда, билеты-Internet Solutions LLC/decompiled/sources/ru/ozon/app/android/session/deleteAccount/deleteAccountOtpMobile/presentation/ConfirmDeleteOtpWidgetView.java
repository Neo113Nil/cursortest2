package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation;

import Ar.b;
import FM.a;
import V.e;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.m;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.domain.session.utils.OTPPeriodFormatterBuilder;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.session.databinding.WidgetConfirmDeleteOtpLayoutBinding;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data.ConfirmDeleteOtpDTO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpVO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R.\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00100\u001a\b\u0012\u0004\u0012\u00020\f0)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpWidgetView;", "", "Lru/ozon/app/android/session/databinding/WidgetConfirmDeleteOtpLayoutBinding;", "binding", "Landroidx/lifecycle/J;", "viewOwner", "Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;", "periodFormatterBuilder", "<init>", "(Lru/ozon/app/android/session/databinding/WidgetConfirmDeleteOtpLayoutBinding;Landroidx/lifecycle/J;Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Input;", "input", "", "prepareCodeInput", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO$Input;)V", "Landroid/view/View;", "keyboardUp", "(Landroid/view/View;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO;", "item", "bind", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO;)V", "", "message", "showError", "(Ljava/lang/String;)V", "showMessage", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$Action$UpdateTimer;", DynamicElementDTO.TIMER, "updateTimerButton", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$Action$UpdateTimer;)V", "Lru/ozon/app/android/session/databinding/WidgetConfirmDeleteOtpLayoutBinding;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;", "Lkotlin/Function1;", "onTryValidate", "Lkotlin/jvm/functions/Function1;", "getOnTryValidate", "()Lkotlin/jvm/functions/Function1;", "setOnTryValidate", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onContinueClicked", "Lkotlin/jvm/functions/Function0;", "getOnContinueClicked", "()Lkotlin/jvm/functions/Function0;", "setOnContinueClicked", "(Lkotlin/jvm/functions/Function0;)V", "onResendCodeClicked", "getOnResendCodeClicked", "setOnResendCodeClicked", "Lorg/joda/time/format/m;", "formatter", "Lorg/joda/time/format/m;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfirmDeleteOtpWidgetView {

    @NotNull
    private final WidgetConfirmDeleteOtpLayoutBinding binding;
    private m formatter;
    private ConfirmDeleteOtpVO item;

    @NotNull
    private Function0<Unit> onContinueClicked;

    @NotNull
    private Function0<Unit> onResendCodeClicked;

    @NotNull
    private Function1<? super String, Unit> onTryValidate;

    @NotNull
    private final OTPPeriodFormatterBuilder periodFormatterBuilder;

    @NotNull
    private final J viewOwner;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpWidgetView$Companion;", "", "<init>", "()V", "SHOW_KEYBOARD_DELAY", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ConfirmDeleteOtpWidgetView(@NotNull WidgetConfirmDeleteOtpLayoutBinding binding, @NotNull J viewOwner, @NotNull OTPPeriodFormatterBuilder periodFormatterBuilder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(periodFormatterBuilder, "periodFormatterBuilder");
        this.binding = binding;
        this.viewOwner = viewOwner;
        this.periodFormatterBuilder = periodFormatterBuilder;
        this.onTryValidate = ConfirmDeleteOtpWidgetView$onTryValidate$1.INSTANCE;
        this.onContinueClicked = ConfirmDeleteOtpWidgetView$onContinueClicked$1.INSTANCE;
        this.onResendCodeClicked = ConfirmDeleteOtpWidgetView$onResendCodeClicked$1.INSTANCE;
        EditText otpEt = binding.otpEt;
        Intrinsics.checkNotNullExpressionValue(otpEt, "otpEt");
        otpEt.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpWidgetView$_init_$lambda$3$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                ConfirmDeleteOtpVO confirmDeleteOtpVO;
                String obj;
                confirmDeleteOtpVO = ConfirmDeleteOtpWidgetView.this.item;
                if (confirmDeleteOtpVO == null || s11 == null || (obj = s11.toString()) == null || obj.length() != confirmDeleteOtpVO.getOtpLength()) {
                    return;
                }
                ConfirmDeleteOtpWidgetView.this.getOnTryValidate().invoke(obj);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        binding.resendCodeLBBV.setOnClickListener(new a(this, 18));
        binding.continueLBV.setOnClickListener(new b(this, 10));
    }

    private final void keyboardUp(View view) {
        view.postDelayed(new IC.b(view, 5), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keyboardUp$lambda$8(View view) {
        view.requestFocus();
        KeyboardUtilsKt.showKeyboard(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$1(ConfirmDeleteOtpWidgetView confirmDeleteOtpWidgetView, View view) {
        confirmDeleteOtpWidgetView.onResendCodeClicked.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(ConfirmDeleteOtpWidgetView confirmDeleteOtpWidgetView, View view) {
        confirmDeleteOtpWidgetView.onContinueClicked.invoke();
    }

    private final void prepareCodeInput(ConfirmDeleteOtpVO.Input input) {
        EditText editText = this.binding.otpEt;
        editText.clearAnimation();
        editText.clearFocus();
        editText.setText((CharSequence) null);
        if ((input != null ? input.getInputType() : null) == null) {
            ViewExtKt.gone(editText);
            KeyboardUtilsKt.hideKeyboard(editText);
        } else {
            editText.setInputType(input.getInputType().intValue());
            ViewExtKt.show(editText);
            keyboardUp(editText);
        }
    }

    public final void bind(@NotNull ConfirmDeleteOtpVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        WidgetConfirmDeleteOtpLayoutBinding widgetConfirmDeleteOtpLayoutBinding = this.binding;
        widgetConfirmDeleteOtpLayoutBinding.titleTAV.setText(item.getTitle());
        widgetConfirmDeleteOtpLayoutBinding.descriptionTAV.setText(item.getText());
        prepareCodeInput(item.getInput());
        LargeBorderlessButtonView resendCodeLBBV = widgetConfirmDeleteOtpLayoutBinding.resendCodeLBBV;
        Intrinsics.checkNotNullExpressionValue(resendCodeLBBV, "resendCodeLBBV");
        ViewExtKt.showOrGoneByPresence(resendCodeLBBV, item.getTimer());
        LargeButtonView continueLBV = widgetConfirmDeleteOtpLayoutBinding.continueLBV;
        Intrinsics.checkNotNullExpressionValue(continueLBV, "continueLBV");
        ViewExtKt.showOrGoneByPresence(continueLBV, item.getButton());
        LargeButtonView largeButtonView = widgetConfirmDeleteOtpLayoutBinding.continueLBV;
        ConfirmDeleteOtpVO.Button button = item.getButton();
        largeButtonView.setText(button != null ? button.getTitle() : null);
        ConfirmDeleteOtpDTO.Timer timer = item.getTimer();
        this.formatter = timer != null ? this.periodFormatterBuilder.build(timer.getDuration()) : null;
    }

    @NotNull
    public final Function1<String, Unit> getOnTryValidate() {
        return this.onTryValidate;
    }

    public final void setOnContinueClicked(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onContinueClicked = function0;
    }

    public final void setOnResendCodeClicked(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onResendCodeClicked = function0;
    }

    public final void setOnTryValidate(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onTryValidate = function1;
    }

    public final void showError(String message) {
        this.binding.otpEt.setText((CharSequence) null);
        showMessage(message);
    }

    public final void showMessage(String message) {
        String string = message == null ? StringProvider.getString(R$string.common_universal_network_error) : message;
        View rootView = this.binding.getConstraintLayout().getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, viewGroup, null, OzonSpannableStringKt.toOzonSpannableString(string), null, null, Integer.valueOf(R$drawable.ic_warning), null, null, null, null, null, null, null, 3000L, null, null, this.viewOwner, 57306, null).show();
        }
    }

    public final void updateTimerButton(@NotNull ConfirmDeleteOtpViewModel.Action.UpdateTimer timer) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        Context context = this.binding.resendCodeLBBV.getContext();
        m mVar = this.formatter;
        Integer timeLeft = timer.getTimeLeft();
        String repeatMsg = (mVar == null || timeLeft == null) ? timer.getRepeatMsg() : e.b(new Object[]{mVar.e(Period.F(timeLeft.intValue()).E(PeriodType.j()))}, 1, timer.getMessageFormat(), "format(...)");
        LargeBorderlessButtonView largeBorderlessButtonView = this.binding.resendCodeLBBV;
        largeBorderlessButtonView.setEnabled(timer.getIsResendAllowing());
        int i11 = timer.getIsResendAllowing() ? R$attr.oz_semantic_accent_primary : R$attr.oz_semantic_text_primary;
        Intrinsics.f(context);
        largeBorderlessButtonView.setTextColor(ThemeExtKt.themeColor(context, i11));
        TextViewExtKt.setTextOrGone(largeBorderlessButtonView, repeatMsg);
    }
}
