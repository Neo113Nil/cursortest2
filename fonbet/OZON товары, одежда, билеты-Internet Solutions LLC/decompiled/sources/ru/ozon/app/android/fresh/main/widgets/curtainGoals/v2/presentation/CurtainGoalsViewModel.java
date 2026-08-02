package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation;

import He.b;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import h3.C6788a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$string;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.api.CurtainGoalsApi;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.api.CurtainGoalsResponse;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.android.flashbar.model.Restriction;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsApi;)V", "", "onCleared", "()V", "", "", "couponBody", "onApplyCouponAction", "(Ljava/util/Map;)V", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsApi;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsResponse;", "errorResponse", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsResponse;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Lxe/M;", "safeViewModelScope", "Lxe/M;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "_appliedCouponResult", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "appliedCouponResult", "Landroidx/lifecycle/P;", "getAppliedCouponResult", "()Landroidx/lifecycle/P;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CurtainGoalsViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final SingleLiveEvent<CurtainGoalsResponse> _appliedCouponResult;

    @NotNull
    private final CurtainGoalsApi api;

    @NotNull
    private final P<CurtainGoalsResponse> appliedCouponResult;

    @NotNull
    private final CurtainGoalsResponse errorResponse;

    @NotNull
    private final J exceptionHandler;

    @NotNull
    private final M safeViewModelScope;

    public CurtainGoalsViewModel(@NotNull CurtainGoalsApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.errorResponse = new CurtainGoalsResponse(null, new Restriction(null, StringProvider.getString(R$string.products_in_bot_common_error), null, null, Restriction.Type.WARNING.getValue(), null, null, null, null, null, null, null, 4077, null));
        CurtainGoalsViewModel$special$$inlined$CoroutineExceptionHandler$1 curtainGoalsViewModel$special$$inlined$CoroutineExceptionHandler$1 = new CurtainGoalsViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this);
        this.exceptionHandler = curtainGoalsViewModel$special$$inlined$CoroutineExceptionHandler$1;
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.safeViewModelScope = N.g(N.g(a11, b.f10879b), curtainGoalsViewModel$special$$inlined$CoroutineExceptionHandler$1);
        SingleLiveEvent<CurtainGoalsResponse> singleLiveEvent = new SingleLiveEvent<>();
        this._appliedCouponResult = singleLiveEvent;
        this.appliedCouponResult = singleLiveEvent;
    }

    @NotNull
    public final P<CurtainGoalsResponse> getAppliedCouponResult() {
        return this.appliedCouponResult;
    }

    public final void onApplyCouponAction(@NotNull Map<String, String> couponBody) {
        Intrinsics.checkNotNullParameter(couponBody, "couponBody");
        M m11 = this.safeViewModelScope;
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(m11, b.f10879b, null, new CurtainGoalsViewModel$onApplyCouponAction$1(this, couponBody, null), 2);
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
    }
}
