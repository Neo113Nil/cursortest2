package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B0.C2454a;
import BO.b;
import Gy.c;
import Ib0.c;
import Mc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Tc.d;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.w0;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.domain.session.api.auth.models.Error;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.api.auth.models.Status;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.core.PostMessageParser;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.ErrorResponse;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.PostMessageResponse;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.SuccessfulResponse;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.UndefinedResponse;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.OtpResponseModel;
import xe.C10727i;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 52\u00020\u0001:\u00015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00150\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u0011008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/core/PostMessageParser;", "postMessageParser", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "<init>", "(Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/core/PostMessageParser;Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "message", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationVO;", "vo", "", "verificationFlowV1", "(Ljava/lang/String;Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationVO;)V", "verificationOtpFlowV2", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/OtpResponseModel;", "toState", "(Lru/ozon/app/android/domain/session/api/auth/models/Response;)Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/OtpResponseModel;", "Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "proceed", "(Lio/reactivex/y;)V", "onCleared", "()V", "handleMessage", "model", "handleActionResult", "(Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/OtpResponseModel;)V", "LIb0/c$a;", "otpFlowResult", "onOtpFlowResult", "(Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationVO;LIb0/c$a;)V", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/core/PostMessageParser;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lnc/a;", "disposable", "Lnc/a;", "LAe/x0;", "state", "LAe/x0;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/OtpResponseModel$Error;", "otpResponseModelError$delegate", "LSc/j;", "getOtpResponseModelError", "()Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/OtpResponseModel$Error;", "otpResponseModelError", "LAe/M0;", "uiState", "LAe/M0;", "getUiState", "()LAe/M0;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalVerificationViewModel extends w0 {

    @NotNull
    private final ActionV2Repository actionRepository;

    @NotNull
    private C8486a disposable;

    /* renamed from: otpResponseModelError$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j otpResponseModelError;

    @NotNull
    private final PostMessageParser postMessageParser;

    @NotNull
    private final x0<OtpResponseModel> state;

    @NotNull
    private final M0<OtpResponseModel> uiState;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationViewModel$Companion;", "", "<init>", "()V", "VERIFICATION_TOKEN_QUERY_KEY", "", "OTP_RESPONSE_REQUEST_KEY", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ExternalVerificationViewModel(@NotNull PostMessageParser postMessageParser, @NotNull ActionV2Repository actionRepository) {
        Intrinsics.checkNotNullParameter(postMessageParser, "postMessageParser");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        this.postMessageParser = postMessageParser;
        this.actionRepository = actionRepository;
        this.disposable = new C8486a();
        x0<OtpResponseModel> a11 = O0.a(OtpResponseModel.Init.INSTANCE);
        this.state = a11;
        this.otpResponseModelError = k.b(ExternalVerificationViewModel$otpResponseModelError$2.INSTANCE);
        this.uiState = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OtpResponseModel.Error getOtpResponseModelError() {
        return (OtpResponseModel.Error) this.otpResponseModelError.getValue();
    }

    private final void proceed(y<ActionV2Response<Response>> yVar) {
        C5415f.a(this).a(yVar.j(a.b()).g(C8125a.a()).h(new c(new ExternalVerificationViewModel$proceed$1(this), 7), new b(new ExternalVerificationViewModel$proceed$2(this), 12)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OtpResponseModel toState(Response response) {
        String otpToken;
        String deeplink;
        Status status = response.getStatus();
        if (status != null ? Intrinsics.d(status.isCompleted(), Boolean.TRUE) : false) {
            Status status2 = response.getStatus();
            return new OtpResponseModel.Completed(status2 != null ? status2.getMessage() : null);
        }
        Status status3 = response.getStatus();
        String str = "";
        if ((status3 != null ? status3.getDeeplink() : null) != null) {
            Status status4 = response.getStatus();
            if (status4 != null && (deeplink = status4.getDeeplink()) != null) {
                str = deeplink;
            }
            return new OtpResponseModel.Deeplink(str);
        }
        Status status5 = response.getStatus();
        if ((status5 != null ? status5.getOtpToken() : null) != null) {
            Status status6 = response.getStatus();
            if (status6 != null && (otpToken = status6.getOtpToken()) != null) {
                str = otpToken;
            }
            return new OtpResponseModel.StartOtp(str);
        }
        Error error = response.getError();
        if (h.D(error != null ? error.getType() : null, "RESTRICTION", true)) {
            Error error2 = response.getError();
            return new OtpResponseModel.Error(error2 != null ? error2.getMessage() : null);
        }
        Error error3 = response.getError();
        if (!h.D(error3 != null ? error3.getType() : null, "RELOAD", true)) {
            return getOtpResponseModelError();
        }
        Error error4 = response.getError();
        return new OtpResponseModel.Reload(error4 != null ? error4.getDeeplink() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verificationFlowV1(String message, ExternalVerificationVO vo) {
        String errorRedirectUrl;
        String redirectUrl = vo.getRedirectUrl();
        if (redirectUrl == null) {
            return;
        }
        PostMessageResponse parseMessage = this.postMessageParser.parseMessage(message);
        if (parseMessage instanceof SuccessfulResponse) {
            errorRedirectUrl = Uri.parse(redirectUrl).buildUpon().appendQueryParameter("verificationToken", ((SuccessfulResponse) parseMessage).getToken()).build().toString();
        } else if (!(parseMessage instanceof ErrorResponse)) {
            if (!(parseMessage instanceof UndefinedResponse)) {
                throw new o();
            }
            return;
        } else {
            errorRedirectUrl = vo.getErrorRedirectUrl();
            if (errorRedirectUrl == null) {
                return;
            }
        }
        Intrinsics.f(errorRedirectUrl);
        handleActionResult(new OtpResponseModel.Deeplink(errorRedirectUrl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verificationOtpFlowV2(String message, ExternalVerificationVO vo) {
        PostMessageResponse parseMessage = this.postMessageParser.parseMessage(message);
        if (!(parseMessage instanceof SuccessfulResponse)) {
            if (!(parseMessage instanceof ErrorResponse)) {
                if (!(parseMessage instanceof UndefinedResponse)) {
                    throw new o();
                }
                return;
            } else {
                String errorRedirectUrl = vo.getErrorRedirectUrl();
                if (errorRedirectUrl == null) {
                    return;
                }
                handleActionResult(new OtpResponseModel.Deeplink(errorRedirectUrl));
                return;
            }
        }
        String action = vo.getAction();
        if (action == null) {
            return;
        }
        String uri = Uri.parse(action).buildUpon().appendQueryParameter("verificationToken", ((SuccessfulResponse) parseMessage).getToken()).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        d builder = new d();
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        builder.put("model", MODEL);
        Intrinsics.checkNotNullParameter(builder, "builder");
        proceed(this.actionRepository.callAction(new ActionV2Request(builder.u(), uri, false, 4, null), Response.class));
    }

    @NotNull
    public final M0<OtpResponseModel> getUiState() {
        return this.uiState;
    }

    public final void handleActionResult(@NotNull OtpResponseModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.state.setValue(model);
    }

    public final void handleMessage(@NotNull String message, @NotNull ExternalVerificationVO vo) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(vo, "vo");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ExternalVerificationViewModel$handleMessage$1(vo, this, message, null), 3);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposable.dispose();
    }

    public final void onOtpFlowResult(ExternalVerificationVO vo, @NotNull c.a otpFlowResult) {
        Intrinsics.checkNotNullParameter(otpFlowResult, "otpFlowResult");
        String action = vo != null ? vo.getAction() : null;
        if (action == null || action.length() == 0) {
            handleActionResult(getOtpResponseModelError());
            return;
        }
        if (otpFlowResult instanceof c.a.AbstractC0239c) {
            proceed(this.actionRepository.callAction(new ActionV2Request(C2454a.b("otpResponseToken", ((c.a.AbstractC0239c) otpFlowResult).a()), vo.getAction(), false, 4, null), Response.class));
        } else if (otpFlowResult instanceof c.a.b) {
            handleActionResult(getOtpResponseModelError());
        } else if (otpFlowResult instanceof c.a.AbstractC0238a) {
            handleActionResult(OtpResponseModel.CancelOtpFlow.INSTANCE);
        }
    }
}
