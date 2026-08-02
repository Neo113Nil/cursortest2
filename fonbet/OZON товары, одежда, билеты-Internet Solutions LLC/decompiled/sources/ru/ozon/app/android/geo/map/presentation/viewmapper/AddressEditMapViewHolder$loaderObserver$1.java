package ru.ozon.app.android.geo.map.presentation.viewmapper;

import Sc.InterfaceC4003e;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AddressEditMapViewHolder$loaderObserver$1 implements W, InterfaceC7732n {
    final /* synthetic */ AddressEditMapViewHolder $tmp0;

    AddressEditMapViewHolder$loaderObserver$1(AddressEditMapViewHolder addressEditMapViewHolder) {
        this.$tmp0 = addressEditMapViewHolder;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(1, this.$tmp0, AddressEditMapViewHolder.class, "loaderHandler", "loaderHandler(Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.W
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged(((Boolean) obj).booleanValue());
    }

    public final void onChanged(boolean z11) {
        this.$tmp0.loaderHandler(z11);
    }
}
