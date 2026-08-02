package ru.ozon.app.android.cart.configurator.interceptors;

import A00.a;
import L00.i;
import QZ.g;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/configurator/interceptors/CartComposerInterceptor;", "LQZ/g;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "<init>", "(Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;)V", "Li10/h;", "state", "LA00/a;", "trigger", "", "needModifyRequest", "(Li10/h;LA00/a;)Z", "modify", "(Li10/h;)Li10/h;", "isNotFirstCartPage", "(Li10/h;)Z", "isNotMainMiniapp", "interceptState", "(Li10/h;LA00/a;)Li10/h;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartComposerInterceptor implements g {

    @NotNull
    private final CartModeManager cartModeManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/configurator/interceptors/CartComposerInterceptor$Companion;", "", "<init>", "()V", "PARAMS_LAYOUT_CONTAINER", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartComposerInterceptor(@NotNull CartModeManager cartModeManager) {
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        this.cartModeManager = cartModeManager;
    }

    private final boolean isNotFirstCartPage(h state) {
        String c11;
        h.c d11 = state.d();
        h.c.a aVar = d11 instanceof h.c.a ? (h.c.a) d11 : null;
        return (aVar == null || (c11 = aVar.c()) == null || !kotlin.text.h.t(c11, "layout_container", false)) ? false : true;
    }

    private final boolean isNotMainMiniapp(h state) {
        String c11;
        h.c d11 = state.d();
        h.c.a aVar = d11 instanceof h.c.a ? (h.c.a) d11 : null;
        return (aVar == null || (c11 = aVar.c()) == null || !kotlin.text.h.t(c11, "miniapp", false)) ? false : true;
    }

    private final h modify(h hVar) {
        return h.a(hVar, null, null, null, new h.a(this.cartModeManager.getDefaultRequestParams(), i10.g.POST), null, 47);
    }

    private final boolean needModifyRequest(h state, a trigger) {
        return (isNotFirstCartPage(state) || isNotMainMiniapp(state) || (!this.cartModeManager.getNeedSetCartViewMode() && !Intrinsics.d(trigger, a.u.c.f253a))) ? false : true;
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h hVar, @NotNull L00.g gVar, @NotNull i iVar) {
        g.a.a(hVar, gVar, iVar);
        return gVar;
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h state, @NotNull a trigger) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (!this.cartModeManager.enabledCartModes()) {
            g.a.b(state, trigger);
            return state;
        }
        if (needModifyRequest(state, trigger)) {
            this.cartModeManager.saveCartMode();
            return modify(state);
        }
        g.a.b(state, trigger);
        return state;
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }
}
