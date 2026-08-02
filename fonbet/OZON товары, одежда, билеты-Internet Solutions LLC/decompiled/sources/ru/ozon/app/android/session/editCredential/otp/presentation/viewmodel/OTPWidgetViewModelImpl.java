package ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel;

import Ae.O0;
import Ae.x0;
import Dp.C2877a;
import I1.w;
import Lz.d;
import Mc.a;
import android.os.Build;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import id.c;
import id.f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.eventBus.UserDataChangedEventBus;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.interactors.AuthInteractor;
import ru.ozon.app.android.domain.session.repository.mappers.AuthFlowMapper;
import ru.ozon.app.android.domain.session.state.AuthState;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO;
import ru.ozon.app.android.session.editCredential.otp.presentation.Action;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetVO;
import ru.ozon.app.android.session.editCredential.otp.presentation.TimerAction;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import sc.C9653a;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\n\u0010#\u001a\u00060!j\u0002`\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b+\u0010\u0014J\u000f\u0010,\u001a\u00020\u0010H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b.\u0010\u0014J\u000f\u0010/\u001a\u00020\u0010H\u0014¢\u0006\u0004\b/\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R \u00105\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u001c098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010?\u001a\b\u0012\u0004\u0012\u00020>098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR+\u0010H\u001a\u00020D2\u0006\u0010E\u001a\u00020D8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/OTPWidgetViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/OTPWidgetViewModel;", "Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "authInteractor", "Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;", "authFlowMapper", "Lru/ozon/app/android/account/eventBus/UserDataChangedEventBus;", "userDataChangedEventBus", "<init>", "(Lru/ozon/app/android/domain/session/interactors/AuthInteractor;Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;Lru/ozon/app/android/account/eventBus/UserDataChangedEventBus;)V", "", "timeLeft", "", "messageFormat", "repeatMsg", "", "updateTimer", "(ILjava/lang/String;Ljava/lang/String;)V", "onTimerCompleted", "(Ljava/lang/String;)V", "action", "", "", "data", "callAction", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "Lru/ozon/app/android/session/editCredential/otp/presentation/Action;", "toAction", "(Lru/ozon/app/android/domain/session/api/auth/models/Response;)Lru/ozon/app/android/session/editCredential/otp/presentation/Action;", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "otpWidgetVO", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "bind", "(Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;LW10/c;)V", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", DynamicElementDTO.TIMER, "setTimer", "(Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;)V", "code", "checkCode", "completeFlow", "()V", "trackClick", "onCleared", "Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;", "Lru/ozon/app/android/account/eventBus/UserDataChangedEventBus;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/PageState;", "pageState", "Landroidx/lifecycle/V;", "getPageState", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "actions", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActions", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/session/editCredential/otp/presentation/TimerAction;", "timerActions", "getTimerActions", "Lnc/a;", "disposables", "Lnc/a;", "", "<set-?>", "isNewCode$delegate", "Lid/f;", "isNewCode", "()Z", "setNewCode", "(Z)V", "LAe/x0;", "Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/TimerState;", "durationFlow", "LAe/x0;", "Lxe/B0;", "durationJob", "Lxe/B0;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OTPWidgetViewModelImpl extends w0 implements OTPWidgetViewModel {

    @NotNull
    private final SingleLiveEvent<Action> actions;

    @NotNull
    private final AuthFlowMapper authFlowMapper;

    @NotNull
    private final AuthInteractor authInteractor;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final x0<TimerState> durationFlow;
    private B0 durationJob;

    /* renamed from: isNewCode$delegate, reason: from kotlin metadata */
    @NotNull
    private final f isNewCode;

    @NotNull
    private final V<PageState> pageState;

    @NotNull
    private final SingleLiveEvent<TimerAction> timerActions;

    @NotNull
    private final UserDataChangedEventBus userDataChangedEventBus;
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {w.c(OTPWidgetViewModelImpl.class, "isNewCode", "isNewCode()Z", 0)};

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/OTPWidgetViewModelImpl$Companion;", "", "<init>", "()V", "TIMER_MIN_MILLIS", "", "TIMER_MIN_SECONDS", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OTPWidgetViewModelImpl(@NotNull AuthInteractor authInteractor, @NotNull AuthFlowMapper authFlowMapper, @NotNull UserDataChangedEventBus userDataChangedEventBus) {
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        Intrinsics.checkNotNullParameter(authFlowMapper, "authFlowMapper");
        Intrinsics.checkNotNullParameter(userDataChangedEventBus, "userDataChangedEventBus");
        this.authInteractor = authInteractor;
        this.authFlowMapper = authFlowMapper;
        this.userDataChangedEventBus = userDataChangedEventBus;
        this.pageState = new V<>();
        this.actions = new SingleLiveEvent<>();
        this.timerActions = new SingleLiveEvent<>();
        this.disposables = new C8486a();
        final Boolean bool = Boolean.FALSE;
        this.isNewCode = new c<Boolean>(bool) { // from class: ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl$special$$inlined$observable$1
            @Override // id.c
            protected void afterChange(m<?> property, Boolean oldValue, Boolean newValue) {
                x0 x0Var;
                Object value;
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = newValue.booleanValue();
                oldValue.getClass();
                if (booleanValue) {
                    this.durationJob = null;
                    x0Var = this.durationFlow;
                    do {
                        value = x0Var.getValue();
                    } while (!x0Var.b(value, new TimerState(null, 0, 3, null)));
                }
            }
        };
        this.durationFlow = O0.a(new TimerState(null, 0, 3, 0 == true ? 1 : 0));
    }

    private final void callAction(String action, Map<String, ? extends Object> data) {
        W10.c cVar;
        PageState value = getPageState().getValue();
        if (value == null || (cVar = value.getTrackingData()) == null) {
            cVar = new W10.c(null, null, null);
        }
        LinkedHashMap u11 = U.u(data);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        u11.put("model", MODEL);
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = this.authInteractor.callActionWithTracking(action, cVar, u11).j(a.b()).g(C8125a.a()).h(new d(new OTPWidgetViewModelImpl$callAction$1(this), 11), new C2877a(new OTPWidgetViewModelImpl$callAction$2(this), 12));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isNewCode() {
        return ((Boolean) this.isNewCode.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimerCompleted(String repeatMsg) {
        PageState pageState;
        OTPWidgetVO copy;
        getTimerActions().setValue(new TimerAction(repeatMsg, null, null, true, 6, null));
        V<PageState> pageState2 = getPageState();
        PageState value = getPageState().getValue();
        if (value != null) {
            copy = r3.copy((r29 & 1) != 0 ? r3.id : 0L, (r29 & 2) != 0 ? r3.title : null, (r29 & 4) != 0 ? r3.subtitle : null, (r29 & 8) != 0 ? r3.action : null, (r29 & 16) != 0 ? r3.input : null, (r29 & 32) != 0 ? r3.retryButton : null, (r29 & 64) != 0 ? r3.hintButtons : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r3.isButtonShowing : Boolean.TRUE, (r29 & 256) != 0 ? r3.otpLength : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r3.errorLogoUrl : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r3.pageType : null, (r29 & 2048) != 0 ? r3.otpSms : null, (r29 & 4096) != 0 ? value.getVo().requestTimes : 0);
            pageState = PageState.copy$default(value, copy, null, true, 2, null);
        } else {
            pageState = null;
        }
        pageState2.setValue(pageState);
    }

    private final void setNewCode(boolean z11) {
        this.isNewCode.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Action toAction(Response response) {
        AuthState mapToState = this.authFlowMapper.mapToState(response);
        if (mapToState instanceof AuthState.Complete) {
            AuthState.Complete complete = (AuthState.Complete) mapToState;
            return new Action.Complete(complete.getMessage(), complete.getDeeplink());
        }
        if (mapToState instanceof AuthState.Redirect) {
            AuthState.Redirect redirect = (AuthState.Redirect) mapToState;
            return new Action.Deeplink(redirect.getDeeplink(), isNewCode(), redirect.getPostData());
        }
        if (mapToState instanceof AuthState.ValidationError) {
            return Action.ValidationError.INSTANCE;
        }
        if (mapToState instanceof AuthState.Restriction) {
            return new Action.Error(((AuthState.Restriction) mapToState).getMessage());
        }
        if (!(mapToState instanceof AuthState.Reload)) {
            return null;
        }
        AuthState.Reload reload = (AuthState.Reload) mapToState;
        return new Action.Reload(reload.getDeeplink(), reload.getPostData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimer(int timeLeft, String messageFormat, String repeatMsg) {
        getTimerActions().setValue(new TimerAction(repeatMsg, messageFormat, Integer.valueOf(timeLeft), false, 8, null));
    }

    public void bind(@NotNull OTPWidgetVO otpWidgetVO, @NotNull W10.c trackingData) {
        Intrinsics.checkNotNullParameter(otpWidgetVO, "otpWidgetVO");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        getPageState().postValue(new PageState(otpWidgetVO, trackingData, false, 4, null));
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModel
    public void checkCode(String code) {
        PageState value = getPageState().getValue();
        if (value == null) {
            return;
        }
        OTPWidgetVO.SubmitAction action = value.getVo().getAction();
        setNewCode(code == null);
        Tc.d builder = new Tc.d();
        Map<String, Object> data = action.getData();
        if (data != null) {
            builder.putAll(data);
        }
        if (code != null) {
            OTPWidgetVO.OtpInput input = value.getVo().getInput();
            String name = input != null ? input.getName() : null;
            if (name == null) {
                name = "";
            }
            builder.put(name, code);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.d u11 = builder.u();
        String action2 = action.getAction();
        if (action2 != null) {
            callAction(action2, u11);
        }
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModel
    public void completeFlow() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new OTPWidgetViewModelImpl$completeFlow$1(this, null), 3);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModel
    public void setTimer(@NotNull OTPWidgetDTO.RetryButton timer) {
        Integer timerDuration;
        Intrinsics.checkNotNullParameter(timer, "timer");
        String subtitle = timer.getSubtitle();
        if (subtitle == null || (timerDuration = timer.getTimerDuration()) == null) {
            return;
        }
        int intValue = timerDuration.intValue();
        int i11 = intValue < 1 ? 1 : intValue;
        B0 b02 = this.durationJob;
        if (b02 == null) {
            updateTimer(i11, timer.getSubtitle(), subtitle);
            this.durationJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new OTPWidgetViewModelImpl$setTimer$1(i11, this, subtitle, timer, null), 3);
            return;
        }
        if (b02.l0()) {
            onTimerCompleted(subtitle);
            return;
        }
        if (b02.isActive()) {
            if (Intrinsics.d(this.durationFlow.getValue().getAction(), timer.getAction())) {
                updateTimer(this.durationFlow.getValue().getDuration() - 1, timer.getSubtitle(), subtitle);
                return;
            }
            B0 b03 = this.durationJob;
            if (b03 != null) {
                b03.j(null);
            }
            this.durationJob = null;
            setTimer(timer);
        }
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModel
    public void trackClick(String trackClick) {
        if (trackClick == null || trackClick.length() == 0) {
            return;
        }
        this.disposables.a(this.authInteractor.sendTrackEvent(trackClick).j(a.b()).g(C8125a.a()).h(C9653a.g(), C9653a.f98525e));
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModel
    @NotNull
    public SingleLiveEvent<Action> getActions() {
        return this.actions;
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModel
    @NotNull
    public V<PageState> getPageState() {
        return this.pageState;
    }

    @Override // ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModel
    @NotNull
    public SingleLiveEvent<TimerAction> getTimerActions() {
        return this.timerActions;
    }
}
