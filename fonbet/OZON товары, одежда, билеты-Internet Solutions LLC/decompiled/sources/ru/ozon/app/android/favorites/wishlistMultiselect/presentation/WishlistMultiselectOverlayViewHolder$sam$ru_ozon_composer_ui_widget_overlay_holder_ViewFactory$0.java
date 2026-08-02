package ru.ozon.app.android.favorites.wishlistMultiselect.presentation;

import Sc.InterfaceC4003e;
import android.view.View;
import android.view.ViewGroup;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WishlistMultiselectOverlayViewHolder$sam$ru_ozon_composer_ui_widget_overlay_holder_ViewFactory$0 implements InterfaceC6068e, InterfaceC7732n {
    private final /* synthetic */ Function1 function;

    WishlistMultiselectOverlayViewHolder$sam$ru_ozon_composer_ui_widget_overlay_holder_ViewFactory$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // d20.InterfaceC6068e
    public final /* synthetic */ View create(ViewGroup viewGroup) {
        return (View) this.function.invoke(viewGroup);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC6068e) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    @NotNull
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
