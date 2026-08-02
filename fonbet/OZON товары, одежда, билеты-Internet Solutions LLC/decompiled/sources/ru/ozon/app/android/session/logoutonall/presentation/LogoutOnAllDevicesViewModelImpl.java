package ru.ozon.app.android.session.logoutonall.presentation;

import B90.C2617t;
import Bc.e;
import Bc.i;
import Mc.a;
import W10.c;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllRepository;
import ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewModel;
import ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewModelImpl;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel;", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllRepository;", "repository", "<init>", "(Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllRepository;)V", "", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "onConfirmClick", "(Ljava/lang/String;LW10/c;)V", "onCleared", "()V", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action;", "actionLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutOnAllDevicesViewModelImpl extends w0 implements LogoutOnAllDevicesViewModel {

    @NotNull
    private final SingleLiveEvent<LogoutOnAllDevicesViewModel.Action> actionLiveData;

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final LogoutOnAllRepository repository;

    public LogoutOnAllDevicesViewModelImpl(@NotNull LogoutOnAllRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.actionLiveData = new SingleLiveEvent<>();
        this.compositeDisposable = new C8486a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfirmClick$lambda$1(LogoutOnAllDevicesViewModelImpl logoutOnAllDevicesViewModelImpl) {
        logoutOnAllDevicesViewModelImpl.getActionLiveData().setValue(new LogoutOnAllDevicesViewModel.Action.Loading(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfirmClick$lambda$2(LogoutOnAllDevicesViewModelImpl logoutOnAllDevicesViewModelImpl, Object obj) {
        logoutOnAllDevicesViewModelImpl.getActionLiveData().setValue(LogoutOnAllDevicesViewModel.Action.ToHome.INSTANCE);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }

    @Override // ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewModel
    public void onConfirmClick(@NotNull String actionName, @NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        C8486a c8486a = this.compositeDisposable;
        InterfaceC8487b h11 = new e(new i(this.repository.logoutOnAll(actionName).j(a.b()).g(C8125a.a()), new DJ.c(new LogoutOnAllDevicesViewModelImpl$onConfirmClick$1(this), 0)), new InterfaceC9019a() { // from class: DJ.d
            @Override // qc.InterfaceC9019a
            public final void run() {
                LogoutOnAllDevicesViewModelImpl.onConfirmClick$lambda$1(LogoutOnAllDevicesViewModelImpl.this);
            }
        }).h(new C2617t(this), new DJ.e(new LogoutOnAllDevicesViewModelImpl$onConfirmClick$4(this), 0));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewModel
    @NotNull
    public SingleLiveEvent<LogoutOnAllDevicesViewModel.Action> getActionLiveData() {
        return this.actionLiveData;
    }
}
