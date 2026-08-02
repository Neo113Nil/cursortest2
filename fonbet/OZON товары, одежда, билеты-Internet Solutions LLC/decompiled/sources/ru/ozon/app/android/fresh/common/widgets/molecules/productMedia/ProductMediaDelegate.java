package ru.ozon.app.android.fresh.common.widgets.molecules.productMedia;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaView;
import xe.B0;
import xe.M;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/ProductMediaDelegate;", "", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "state", "hydrateState", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;)Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "", "setState", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;)V", "Landroidx/lifecycle/v;", "lifecycle", "Lkotlin/Function0;", "Lxe/M;", "coroutineScopeProvider", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "viewProvider", "onAttach", "(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onDetach", "()V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lkotlin/jvm/functions/Function0;", "currentState", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "Lxe/B0;", "adultListenerJob", "Lxe/B0;", "getView", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "view", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductMediaDelegate {

    @NotNull
    private final AdultHandler adultHandler;
    private B0 adultListenerJob;
    private ProductMediaVO currentState;

    @NotNull
    private Function0<ProductMediaView> viewProvider;

    public ProductMediaDelegate(@NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.adultHandler = adultHandler;
        this.viewProvider = ProductMediaDelegate$viewProvider$1.INSTANCE;
    }

    private final ProductMediaView getView() {
        return this.viewProvider.invoke();
    }

    private final ProductMediaVO hydrateState(ProductMediaVO state) {
        return (state.getHasBlurAndNoise() && !this.adultHandler.isUserAnAdult()) != state.getHasBlurAndNoise() ? ProductMediaVO.copy$default(state, null, null, null, null, false, false, null, false, 223, null) : state;
    }

    public final void onAttach(@NotNull AbstractC5434v lifecycle, @NotNull Function0<? extends M> coroutineScopeProvider, @NotNull Function0<ProductMediaView> viewProvider) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        this.viewProvider = viewProvider;
        B0 b02 = this.adultListenerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.adultListenerJob = C2399j.C(new C2408n0(C5427n.a(n.a(this.adultHandler.observeUserAdultState()), lifecycle, AbstractC5434v.b.STARTED), new ProductMediaDelegate$onAttach$1(this, null)), coroutineScopeProvider.invoke());
    }

    public final void onDetach() {
        B0 b02 = this.adultListenerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.adultListenerJob = null;
    }

    public final void setState(@NotNull ProductMediaVO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ProductMediaVO hydrateState = hydrateState(state);
        if (Intrinsics.d(hydrateState, this.currentState)) {
            return;
        }
        this.currentState = hydrateState;
        ProductMediaView view = getView();
        if (view != null) {
            view.bind(hydrateState);
        }
    }
}
