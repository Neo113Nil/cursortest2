package ru.ozon.app.android.cart.ui.customActionHandler.navigateToCartAndRefresh;

import EZ.g;
import Lm0.a;
import Sc.r;
import Sc.s;
import androidx.fragment.app.G;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class NavigateToCartAndRefreshNavigationHandler$navigate$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ g $navigator;
    final /* synthetic */ NavigateToCartAndRefreshNavigationHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigateToCartAndRefreshNavigationHandler$navigate$1(g gVar, NavigateToCartAndRefreshNavigationHandler navigateToCartAndRefreshNavigationHandler) {
        super(0);
        this.$navigator = gVar;
        this.this$0 = navigateToCartAndRefreshNavigationHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object a11;
        G fragmentManager = this.$navigator.getFragmentManager();
        if (fragmentManager.H0()) {
            NavigateToCartAndRefreshNavigationHandler.openPersonalCart$default(this.this$0, false, 1, null);
            return;
        }
        NavigateToCartAndRefreshNavigationHandler navigateToCartAndRefreshNavigationHandler = this.this$0;
        try {
            r.Companion companion = r.INSTANCE;
            navigateToCartAndRefreshNavigationHandler.navigateInternal(fragmentManager);
            a11 = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        NavigateToCartAndRefreshNavigationHandler navigateToCartAndRefreshNavigationHandler2 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            a.f17149a.e(b11);
            navigateToCartAndRefreshNavigationHandler2.openPersonalCart(false);
        }
    }
}
