package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation;

import Bc.f;
import Bc.i;
import Bc.m;
import Bc.r;
import CJ.b;
import DM.e;
import Mc.a;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import io.reactivex.C;
import io.reactivex.p;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.account.orders.OrdersCountStorage;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountRepository;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data.ConfirmDeleteOtpDTO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpVO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModelImpl;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R \u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModelImpl;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository;", "repository", "Lru/ozon/app/android/account/orders/OrdersCountStorage;", "ordersCountStorage", "<init>", "(Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository;Lru/ozon/app/android/account/orders/OrdersCountStorage;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Timer;", DynamicElementDTO.TIMER, "", "setTimer", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO$Timer;)V", "Lio/reactivex/y;", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse;", "Lnc/b;", "processOtpResponse", "(Lio/reactivex/y;)Lnc/b;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$Action;", "toAction", "(Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse;)Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$Action;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO;", "data", "bind", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO;)V", "", "code", "onValidateCode", "(Ljava/lang/String;)V", "onContinueClicked", "()V", "onResendCodeClicked", "onCleared", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository;", "Lru/ozon/app/android/account/orders/OrdersCountStorage;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$State;", "state", "Landroidx/lifecycle/V;", "getState", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "timerDisposable", "Lnc/b;", "Lnc/a;", "disposables", "Lnc/a;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfirmDeleteOtpViewModelImpl extends w0 implements ConfirmDeleteOtpViewModel {

    @NotNull
    private final SingleLiveEvent<ConfirmDeleteOtpViewModel.Action> action;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final OrdersCountStorage ordersCountStorage;

    @NotNull
    private final DeleteAccountRepository repository;

    @NotNull
    private final V<ConfirmDeleteOtpViewModel.State> state;
    private InterfaceC8487b timerDisposable;

    public ConfirmDeleteOtpViewModelImpl(@NotNull DeleteAccountRepository repository, @NotNull OrdersCountStorage ordersCountStorage) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(ordersCountStorage, "ordersCountStorage");
        this.repository = repository;
        this.ordersCountStorage = ordersCountStorage;
        this.state = new V<>();
        this.action = new SingleLiveEvent<>();
        this.disposables = new C8486a();
    }

    private final InterfaceC8487b processOtpResponse(y<DeleteAccountApiResponse> yVar) {
        InterfaceC8487b h11 = new f(new i(new m(new r(yVar.j(a.b()), new DM.a(new ConfirmDeleteOtpViewModelImpl$processOtpResponse$1(this), 8)), new CJ.a(new ConfirmDeleteOtpViewModelImpl$processOtpResponse$2(this), 8)).g(C8125a.a()), new b(new ConfirmDeleteOtpViewModelImpl$processOtpResponse$3(this), 10)), new InterfaceC9019a() { // from class: tJ.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                ConfirmDeleteOtpViewModelImpl.processOtpResponse$lambda$7(ConfirmDeleteOtpViewModelImpl.this);
            }
        }).h(new BF.b(new ConfirmDeleteOtpViewModelImpl$processOtpResponse$5(this), 14), new DM.b(new ConfirmDeleteOtpViewModelImpl$processOtpResponse$6(this), 10));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        return h11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfirmDeleteOtpViewModel.Action processOtpResponse$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ConfirmDeleteOtpViewModel.Action) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C processOtpResponse$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processOtpResponse$lambda$7(ConfirmDeleteOtpViewModelImpl confirmDeleteOtpViewModelImpl) {
        confirmDeleteOtpViewModelImpl.getAction().setValue(ConfirmDeleteOtpViewModel.Action.FinishLoading.INSTANCE);
    }

    private final void setTimer(final ConfirmDeleteOtpDTO.Timer timer) {
        if (timer == null) {
            return;
        }
        final String repeatMsg = timer.getRepeatMsg();
        int duration = timer.getDuration();
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.timerDisposable = p.intervalRange(0L, duration + 1, 0L, 1L, TimeUnit.SECONDS).observeOn(C8125a.a()).doOnComplete(new InterfaceC9019a() { // from class: tJ.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                ConfirmDeleteOtpViewModelImpl.setTimer$lambda$0(ConfirmDeleteOtpViewModelImpl.this, timer, repeatMsg);
            }
        }).doOnSubscribe(new Fw.b(new ConfirmDeleteOtpViewModelImpl$setTimer$2(this, timer, repeatMsg, duration), 11)).subscribe(new e(new ConfirmDeleteOtpViewModelImpl$setTimer$3(this, timer, duration, repeatMsg), 11), new DM.f(new ConfirmDeleteOtpViewModelImpl$setTimer$4(Lm0.a.f17149a), 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTimer$lambda$0(ConfirmDeleteOtpViewModelImpl confirmDeleteOtpViewModelImpl, ConfirmDeleteOtpDTO.Timer timer, String str) {
        confirmDeleteOtpViewModelImpl.getAction().setValue(new ConfirmDeleteOtpViewModel.Action.UpdateTimer(true, timer.getMessageFormat(), str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfirmDeleteOtpViewModel.Action toAction(DeleteAccountApiResponse deleteAccountApiResponse) {
        if (!deleteAccountApiResponse.getStatus().isCompleted()) {
            return deleteAccountApiResponse.getError() == null ? new ConfirmDeleteOtpViewModel.Action.Navigate(deleteAccountApiResponse.getStatus().getDeeplink()) : new ConfirmDeleteOtpViewModel.Action.Error(deleteAccountApiResponse.getError().getMessage());
        }
        String deeplink = deleteAccountApiResponse.getStatus().getDeeplink();
        String uri = LinkGenerator.INSTANCE.home().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        if (h.t(deeplink, uri, false)) {
            deeplink = null;
        }
        return new ConfirmDeleteOtpViewModel.Action.Complete(deeplink);
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel
    public void bind(@NotNull ConfirmDeleteOtpVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getState().setValue(new ConfirmDeleteOtpViewModel.State(data));
        setTimer(data.getTimer());
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        super.onCleared();
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel
    public void onContinueClicked() {
        ConfirmDeleteOtpVO data;
        ConfirmDeleteOtpVO.Button button;
        ConfirmDeleteOtpViewModel.State value = getState().getValue();
        if (value == null || (data = value.getData()) == null || (button = data.getButton()) == null) {
            return;
        }
        RxExtKt.plusAssign(this.disposables, processOtpResponse(DeleteAccountRepository.deleteAccountRequest$default(this.repository, button.getAction(), null, 2, null)));
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel
    public void onResendCodeClicked() {
        ConfirmDeleteOtpVO data;
        String action;
        ConfirmDeleteOtpViewModel.State value = getState().getValue();
        if (value == null || (data = value.getData()) == null || (action = data.getAction()) == null) {
            return;
        }
        RxExtKt.plusAssign(this.disposables, processOtpResponse(DeleteAccountRepository.deleteAccountRequest$default(this.repository, action, null, 2, null)));
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel
    public void onValidateCode(@NotNull String code) {
        ConfirmDeleteOtpVO data;
        String action;
        ConfirmDeleteOtpVO.Input input;
        Intrinsics.checkNotNullParameter(code, "code");
        ConfirmDeleteOtpViewModel.State value = getState().getValue();
        if (value == null || (data = value.getData()) == null || (action = data.getAction()) == null || (input = data.getInput()) == null) {
            return;
        }
        RxExtKt.plusAssign(this.disposables, processOtpResponse(this.repository.deleteAccountRequest(action, new Pair<>(input.getName(), code))));
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel
    @NotNull
    public SingleLiveEvent<ConfirmDeleteOtpViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel
    @NotNull
    public V<ConfirmDeleteOtpViewModel.State> getState() {
        return this.state;
    }
}
