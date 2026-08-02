package ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel;

import BT.b;
import BT.c;
import Bc.f;
import Bc.i;
import Ib0.c;
import Mc.a;
import Sc.o;
import Tc.d;
import android.os.Build;
import androidx.lifecycle.w0;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.domain.session.api.auth.models.Error;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.api.auth.models.Status;
import ru.ozon.app.android.session.editCredential.newCredentials.data.ResponseModel;
import ru.ozon.app.android.session.editCredential.newCredentials.data.TranslationLexemes;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.InputType;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsVO;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel.NewCredentialsViewModelImpl;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.PhoneNumberUtilsKt;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u0004\u0018\u00010&*\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020+2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001dH\u0014¢\u0006\u0004\b4\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00105R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R \u00108\u001a\b\u0012\u0004\u0012\u00020&078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/presentation/viewmodel/NewCredentialsViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/viewmodel/NewCredentialsViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "checkoutPrefetchController", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;)V", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes;", "lexemes", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/InputType;", "inputType", "", "input", "validateInput", "(Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes;Lru/ozon/app/android/session/editCredential/newCredentials/presentation/InputType;Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsEmpty;", "getEmptyInputError", "(Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsEmpty;Lru/ozon/app/android/session/editCredential/newCredentials/presentation/InputType;)Ljava/lang/String;", Scopes.EMAIL, "", "isInvalidEmail", "(Ljava/lang/String;)Z", "phone", "isInvalidPhone", "action", "bodyFieldKey", "bodyFieldValue", "", "send", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "showError", "()V", "Lru/ozon/app/android/session/editCredential/newCredentials/data/ResponseModel$Error;", "buildError", "()Lru/ozon/app/android/session/editCredential/newCredentials/data/ResponseModel$Error;", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "Lru/ozon/app/android/session/editCredential/newCredentials/data/ResponseModel;", "toResponseModel", "(Lru/ozon/app/android/domain/session/api/auth/models/Response;)Lru/ozon/app/android/session/editCredential/newCredentials/data/ResponseModel;", "onTextChanged", "(Ljava/lang/String;)V", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;", "item", "onButtonClick", "(Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;Ljava/lang/String;)V", "newCredentialsVO", "LIb0/c$a;", "otpFlowResult", "onOtpFlowResult", "(Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;LIb0/c$a;)V", "onCleared", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "liveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lkotlin/text/Regex;", "emailRegex", "Lkotlin/text/Regex;", "Lnc/b;", "disposable", "Lnc/b;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewCredentialsViewModelImpl extends w0 implements NewCredentialsViewModel {

    @NotNull
    private final ActionV2Repository actionRepository;

    @NotNull
    private final CheckoutPrefetchController checkoutPrefetchController;
    private InterfaceC8487b disposable;

    @NotNull
    private final Regex emailRegex;

    @NotNull
    private final SingleLiveEvent<ResponseModel> liveData;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputType.values().length];
            try {
                iArr[InputType.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NewCredentialsViewModelImpl(@NotNull ActionV2Repository actionRepository, @NotNull CheckoutPrefetchController checkoutPrefetchController) {
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(checkoutPrefetchController, "checkoutPrefetchController");
        this.actionRepository = actionRepository;
        this.checkoutPrefetchController = checkoutPrefetchController;
        this.liveData = new SingleLiveEvent<>();
        this.emailRegex = new Regex("[a-zA-Z0-9+._%\\-+]{1,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{1,25})+");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResponseModel.Error buildError() {
        return new ResponseModel.Error(StringProvider.getString(R$string.error_common_message_service_error));
    }

    private final String getEmptyInputError(TranslationLexemes.ValidationLexemes.IsEmpty lexemes, InputType inputType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        if (i11 == 1) {
            return lexemes.getEmail();
        }
        if (i11 == 2) {
            return lexemes.getPhone();
        }
        throw new o();
    }

    private final boolean isInvalidEmail(String email) {
        return !this.emailRegex.f(email);
    }

    private final boolean isInvalidPhone(String phone) {
        return !PhoneNumberUtilsKt.isValidPhoneNumber(phone);
    }

    private final void send(String action, String bodyFieldKey, String bodyFieldValue) {
        d builder = new d();
        if (bodyFieldKey != null) {
            builder.put(bodyFieldKey, bodyFieldValue);
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        builder.put("model", MODEL);
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.disposable = new f(new i(this.actionRepository.callAction(new ActionV2Request(builder.u(), action, false, 4, null), Response.class).j(a.b()).g(C8125a.a()), new AA.d(new NewCredentialsViewModelImpl$send$1(this), 14)), new InterfaceC9019a() { // from class: wJ.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                NewCredentialsViewModelImpl.send$lambda$3(NewCredentialsViewModelImpl.this);
            }
        }).h(new b(new NewCredentialsViewModelImpl$send$3(this), 14), new c(new NewCredentialsViewModelImpl$send$4(this), 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void send$lambda$3(NewCredentialsViewModelImpl newCredentialsViewModelImpl) {
        newCredentialsViewModelImpl.getLiveData().setValue(ResponseModel.HideLoader.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        getLiveData().setValue(buildError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResponseModel toResponseModel(Response response) {
        String otpToken;
        String deeplink;
        Status status = response.getStatus();
        if (status != null ? Intrinsics.d(status.isCompleted(), Boolean.TRUE) : false) {
            Status status2 = response.getStatus();
            return new ResponseModel.Completed(status2 != null ? status2.getMessage() : null);
        }
        Status status3 = response.getStatus();
        String str = "";
        if ((status3 != null ? status3.getDeeplink() : null) != null) {
            Status status4 = response.getStatus();
            if (status4 != null && (deeplink = status4.getDeeplink()) != null) {
                str = deeplink;
            }
            return new ResponseModel.Deeplink(str);
        }
        Status status5 = response.getStatus();
        if ((status5 != null ? status5.getOtpToken() : null) != null) {
            Status status6 = response.getStatus();
            if (status6 != null && (otpToken = status6.getOtpToken()) != null) {
                str = otpToken;
            }
            return new ResponseModel.OtpFlow(str);
        }
        Error error = response.getError();
        if (h.D(error != null ? error.getType() : null, "VALIDATION", true)) {
            Error error2 = response.getError();
            return new ResponseModel.ValidationShowError(error2 != null ? error2.getMessage() : null);
        }
        Error error3 = response.getError();
        if (h.D(error3 != null ? error3.getType() : null, "RESTRICTION", true)) {
            Error error4 = response.getError();
            return new ResponseModel.Error(error4 != null ? error4.getMessage() : null);
        }
        Error error5 = response.getError();
        if (!h.D(error5 != null ? error5.getType() : null, "RELOAD", true)) {
            return null;
        }
        Error error6 = response.getError();
        return new ResponseModel.Reload(error6 != null ? error6.getDeeplink() : null);
    }

    private final String validateInput(TranslationLexemes.ValidationLexemes lexemes, InputType inputType, String input) {
        if (input.length() == 0) {
            return getEmptyInputError(lexemes.isEmpty(), inputType);
        }
        if (inputType == InputType.EMAIL && isInvalidEmail(input)) {
            return lexemes.isInvalid().getEmail();
        }
        if (inputType == InputType.PHONE && isInvalidPhone(input)) {
            return lexemes.isInvalid().getPhone();
        }
        return null;
    }

    @Override // ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel.NewCredentialsViewModel
    public void onButtonClick(@NotNull NewCredentialsVO item, @NotNull String input) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(input, "input");
        InputType inputType = item.getInputType();
        String name = item.getName();
        String confirmButtonAction = item.getConfirmButtonAction();
        if (confirmButtonAction == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (inputType == null) {
            send(confirmButtonAction, name, input);
            return;
        }
        String validateInput = validateInput(item.getTranslationLexemes().getValidationLexemes(), inputType, input);
        if (validateInput != null) {
            getLiveData().setValue(new ResponseModel.ValidationShowError(validateInput));
            return;
        }
        InputType inputType2 = InputType.PHONE;
        if (inputType == inputType2) {
            input = StringExtKt.getDigits(input);
        }
        send(confirmButtonAction, name, input);
        if (inputType == inputType2) {
            this.checkoutPrefetchController.removeAllCache();
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel.NewCredentialsViewModel
    public void onOtpFlowResult(@NotNull NewCredentialsVO newCredentialsVO, @NotNull c.a otpFlowResult) {
        Intrinsics.checkNotNullParameter(newCredentialsVO, "newCredentialsVO");
        Intrinsics.checkNotNullParameter(otpFlowResult, "otpFlowResult");
        if (otpFlowResult instanceof c.a.AbstractC0238a) {
            return;
        }
        if (otpFlowResult instanceof c.a.b) {
            showError();
            return;
        }
        if (otpFlowResult instanceof c.a.AbstractC0239c) {
            String confirmButtonAction = newCredentialsVO.getConfirmButtonAction();
            if (confirmButtonAction == null) {
                showError();
            } else {
                send(confirmButtonAction, "otpResponseToken", ((c.a.AbstractC0239c) otpFlowResult).a());
            }
        }
    }

    @Override // ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel.NewCredentialsViewModel
    public void onTextChanged(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        getLiveData().setValue(ResponseModel.ValidationHideError.INSTANCE);
    }

    @Override // ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel.NewCredentialsViewModel
    @NotNull
    public SingleLiveEvent<ResponseModel> getLiveData() {
        return this.liveData;
    }
}
