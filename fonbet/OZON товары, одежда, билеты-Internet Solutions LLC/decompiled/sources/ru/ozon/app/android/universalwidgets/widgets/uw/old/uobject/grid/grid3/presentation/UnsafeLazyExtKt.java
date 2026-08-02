package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation;

import Sc.InterfaceC4008j;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSc/j;", "Landroid/view/View;", "getIfInitialized", "(LSc/j;)Landroid/view/View;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnsafeLazyExtKt {
    public static final View getIfInitialized(@NotNull InterfaceC4008j<? extends View> interfaceC4008j) {
        Intrinsics.checkNotNullParameter(interfaceC4008j, "<this>");
        if (!interfaceC4008j.isInitialized()) {
            interfaceC4008j = null;
        }
        if (interfaceC4008j != null) {
            return interfaceC4008j.getValue();
        }
        return null;
    }
}
