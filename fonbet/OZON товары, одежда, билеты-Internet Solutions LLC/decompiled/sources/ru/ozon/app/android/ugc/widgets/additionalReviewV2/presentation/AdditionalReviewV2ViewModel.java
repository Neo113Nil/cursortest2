package ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "itemId", "", "removeItem", "(J)V", "addItem", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "onComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;J)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/x0;", "", "_items", "LAe/x0;", "LAe/M0;", "items", "LAe/M0;", "getItems", "()LAe/M0;", "Lze/h;", "_error", "Lze/h;", "LAe/h;", "error", "LAe/h;", "getError", "()LAe/h;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdditionalReviewV2ViewModel extends w0 {

    @NotNull
    private final h<Unit> _error;

    @NotNull
    private final x0<List<Long>> _items;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final InterfaceC2395h<Unit> error;

    @NotNull
    private final M0<List<Long>> items;

    public AdditionalReviewV2ViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        x0<List<Long>> a11 = O0.a(K.f71697a);
        this._items = a11;
        this.items = C2399j.b(a11);
        C11115c a12 = k.a(0, 7, null);
        this._error = a12;
        this.error = C2399j.H(a12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeItem(long itemId) {
        List<Long> value;
        x0<List<Long>> x0Var = this._items;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, C7714v.k0(value, Long.valueOf(itemId))));
    }

    public final void addItem(long itemId) {
        List<Long> value;
        List<Long> list;
        x0<List<Long>> x0Var = this._items;
        do {
            value = x0Var.getValue();
            list = value;
            if (!list.contains(Long.valueOf(itemId))) {
                list = C7714v.q0(Long.valueOf(itemId), list);
            }
        } while (!x0Var.b(value, list));
    }

    @NotNull
    public final InterfaceC2395h<Unit> getError() {
        return this.error;
    }

    @NotNull
    public final M0<List<Long>> getItems() {
        return this.items;
    }

    public final void onComposerAction(@NotNull AtomAction.ComposerAction action, long itemId) {
        Intrinsics.checkNotNullParameter(action, "action");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdditionalReviewV2ViewModel$onComposerAction$1(this, action, itemId, null), 3);
    }
}
