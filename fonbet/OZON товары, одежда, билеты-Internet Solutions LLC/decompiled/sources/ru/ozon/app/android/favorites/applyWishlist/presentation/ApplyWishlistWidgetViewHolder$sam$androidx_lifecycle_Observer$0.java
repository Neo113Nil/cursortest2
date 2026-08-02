package ru.ozon.app.android.favorites.applyWishlist.presentation;

import Sc.InterfaceC4003e;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ApplyWishlistWidgetViewHolder$sam$androidx_lifecycle_Observer$0 implements W, InterfaceC7732n {
    private final /* synthetic */ Function1 function;

    ApplyWishlistWidgetViewHolder$sam$androidx_lifecycle_Observer$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
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

    @Override // androidx.lifecycle.W
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
