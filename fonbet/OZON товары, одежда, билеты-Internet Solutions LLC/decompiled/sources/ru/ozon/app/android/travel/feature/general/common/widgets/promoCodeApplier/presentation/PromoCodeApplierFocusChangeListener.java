package ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.presentation;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierFocusChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "view", "Landroid/view/View;", "callback", "Lkotlin/Function0;", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "isFocusCleared", "", "onGlobalFocusChanged", "oldFocus", "newFocus", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoCodeApplierFocusChangeListener implements ViewTreeObserver.OnGlobalFocusChangeListener {

    @NotNull
    private final Function0<Unit> callback;
    private boolean isFocusCleared;

    @NotNull
    private final View view;

    public PromoCodeApplierFocusChangeListener(@NotNull View view, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.view = view;
        this.callback = callback;
        this.isFocusCleared = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View oldFocus, View newFocus) {
        if (newFocus != this.view) {
            this.isFocusCleared = true;
        } else if (this.isFocusCleared) {
            this.isFocusCleared = false;
            this.callback.invoke();
        }
    }
}
