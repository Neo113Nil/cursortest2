package ru.ozon.app.android.partpayment.landing.limit.view;

import Bc.f;
import Bc.i;
import Fy.C3065c;
import Gy.a;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.partpayment.landing.limit.data.FormPageLandingLimitRepository;
import ru.ozon.app.android.partpayment.landing.limit.view.LandingLimitViewModel;
import ru.ozon.app.android.partpayment.landing.limit.view.LandingLimitViewModelImpl;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel;", "Lru/ozon/app/android/partpayment/landing/limit/data/FormPageLandingLimitRepository;", "repository", "<init>", "(Lru/ozon/app/android/partpayment/landing/limit/data/FormPageLandingLimitRepository;)V", "", ImagesContract.URL, AppMeasurementSdk.ConditionalUserProperty.NAME, "limitText", "", "sendLimit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onCleared", "()V", "Lru/ozon/app/android/partpayment/landing/limit/data/FormPageLandingLimitRepository;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction;", "noUiAction", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getNoUiAction", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$UiAction;", "uiAction", "getUiAction", "Lnc/a;", "disposables", "Lnc/a;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LandingLimitViewModelImpl extends w0 implements LandingLimitViewModel {

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final BroadcastSingleLiveEvent<LandingLimitViewModel.NoUiAction> noUiAction;

    @NotNull
    private final FormPageLandingLimitRepository repository;

    @NotNull
    private final BroadcastSingleLiveEvent<LandingLimitViewModel.UiAction> uiAction;

    public LandingLimitViewModelImpl(@NotNull FormPageLandingLimitRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.noUiAction = new BroadcastSingleLiveEvent<>();
        this.uiAction = new BroadcastSingleLiveEvent<>();
        this.disposables = new C8486a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendLimit$lambda$1(LandingLimitViewModelImpl landingLimitViewModelImpl) {
        landingLimitViewModelImpl.getNoUiAction().setValue(LandingLimitViewModel.NoUiAction.HideLoader.INSTANCE);
    }

    @NotNull
    public BroadcastSingleLiveEvent<LandingLimitViewModel.NoUiAction> getNoUiAction() {
        return this.noUiAction;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
    }

    @Override // ru.ozon.app.android.partpayment.landing.limit.view.LandingLimitViewModel
    public void sendLimit(@NotNull String url, @NotNull String name, @NotNull String limitText) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(limitText, "limitText");
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = new f(new i(this.repository.passLimit(url, name, limitText).g(C8125a.a()), new DM.i(new LandingLimitViewModelImpl$sendLimit$1(this), 8)), new InterfaceC9019a() { // from class: cC.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                LandingLimitViewModelImpl.sendLimit$lambda$1(LandingLimitViewModelImpl.this);
            }
        }).h(new C3065c(new LandingLimitViewModelImpl$sendLimit$3(name, this), 8), new a(new LandingLimitViewModelImpl$sendLimit$4(this), 4));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // ru.ozon.app.android.partpayment.landing.limit.view.LandingLimitViewModel
    @NotNull
    public BroadcastSingleLiveEvent<LandingLimitViewModel.UiAction> getUiAction() {
        return this.uiAction;
    }
}
