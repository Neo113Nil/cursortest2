package ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation;

import AA.c;
import Bc.e;
import Bc.i;
import Lz.C3602a;
import Mc.a;
import android.content.Context;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountRepository;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountStartResponse;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation.DeleteAccountButtonViewModel;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation.DeleteAccountButtonViewModelImpl;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModelImpl;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository;", "repository", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository;Landroid/content/Context;)V", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountStartResponse;", "response", "", "processResponse", "(Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountStartResponse;)V", "", "it", "processError", "(Ljava/lang/Throwable;)V", "", "actionName", "deleteAccountStartRequest", "(Ljava/lang/String;)V", "onCleared", "()V", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository;", "Landroid/content/Context;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "disposable", "Lnc/a;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteAccountButtonViewModelImpl extends w0 implements DeleteAccountButtonViewModel {

    @NotNull
    private final SingleLiveEvent<DeleteAccountButtonViewModel.Action> action;

    @NotNull
    private final Context context;

    @NotNull
    private final C8486a disposable;

    @NotNull
    private final DeleteAccountRepository repository;

    public DeleteAccountButtonViewModelImpl(@NotNull DeleteAccountRepository repository, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.repository = repository;
        this.context = context;
        this.action = new SingleLiveEvent<>();
        this.disposable = new C8486a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteAccountStartRequest$lambda$1(DeleteAccountButtonViewModelImpl deleteAccountButtonViewModelImpl) {
        deleteAccountButtonViewModelImpl.getAction().postValue(DeleteAccountButtonViewModel.Action.HideLoading.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processError(Throwable it) {
        getAction().setValue(new DeleteAccountButtonViewModel.Action.Restriction(ScreenStateExtKt.toMessage(it, this.context)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processResponse(DeleteAccountStartResponse response) {
        V action = getAction();
        String type = response.getType();
        action.setValue(WhenExtKt.getExhaustive(Intrinsics.d(type, DeleteAccountStartResponse.Type.SLIDE.getValue()) ? new DeleteAccountButtonViewModel.Action.NavigateBottomSheet(response.getDeeplink()) : Intrinsics.d(type, DeleteAccountStartResponse.Type.PAGE.getValue()) ? new DeleteAccountButtonViewModel.Action.Navigate(response.getDeeplink()) : new DeleteAccountButtonViewModel.Action.Restriction(StringProvider.getString(R$string.common_universal_network_error))));
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation.DeleteAccountButtonViewModel
    public void deleteAccountStartRequest(@NotNull String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C8486a c8486a = this.disposable;
        InterfaceC8487b h11 = new e(new i(this.repository.deleteAccountStartRequest(actionName).j(a.b()).g(C8125a.a()), new HX.a(new DeleteAccountButtonViewModelImpl$deleteAccountStartRequest$1(this), 8)), new InterfaceC9019a() { // from class: rJ.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                DeleteAccountButtonViewModelImpl.deleteAccountStartRequest$lambda$1(DeleteAccountButtonViewModelImpl.this);
            }
        }).h(new C3602a(new DeleteAccountButtonViewModelImpl$deleteAccountStartRequest$3(this), 8), new c(new DeleteAccountButtonViewModelImpl$deleteAccountStartRequest$4(this), 7));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposable.d();
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation.DeleteAccountButtonViewModel
    @NotNull
    public SingleLiveEvent<DeleteAccountButtonViewModel.Action> getAction() {
        return this.action;
    }
}
