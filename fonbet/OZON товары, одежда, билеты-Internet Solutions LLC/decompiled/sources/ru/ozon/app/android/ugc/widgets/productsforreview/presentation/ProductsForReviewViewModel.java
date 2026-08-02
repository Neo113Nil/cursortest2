package ru.ozon.app.android.ugc.widgets.productsforreview.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductsForReviewViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "productId", "", "onComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;J)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/x0;", "_removeWidget", "LAe/x0;", "LAe/M0;", "removeWidget", "LAe/M0;", "getRemoveWidget", "()LAe/M0;", "Lze/h;", "_error", "Lze/h;", "LAe/h;", "error", "LAe/h;", "getError", "()LAe/h;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsForReviewViewModel extends w0 {

    @NotNull
    private final h<Unit> _error;

    @NotNull
    private final x0<Long> _removeWidget;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final InterfaceC2395h<Unit> error;

    @NotNull
    private final M0<Long> removeWidget;

    public ProductsForReviewViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        x0<Long> a11 = O0.a(null);
        this._removeWidget = a11;
        this.removeWidget = C2399j.b(a11);
        C11115c a12 = k.a(0, 7, null);
        this._error = a12;
        this.error = C2399j.H(a12);
    }

    @NotNull
    public final InterfaceC2395h<Unit> getError() {
        return this.error;
    }

    @NotNull
    public final M0<Long> getRemoveWidget() {
        return this.removeWidget;
    }

    public final void onComposerAction(@NotNull AtomAction.ComposerAction action, long productId) {
        Intrinsics.checkNotNullParameter(action, "action");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ProductsForReviewViewModel$onComposerAction$1(this, action, productId, null), 3);
    }
}
