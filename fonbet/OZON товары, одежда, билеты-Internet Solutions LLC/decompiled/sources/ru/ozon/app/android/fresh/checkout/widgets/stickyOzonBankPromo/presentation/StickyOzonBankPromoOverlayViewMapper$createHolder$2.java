package ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.presentation;

import Sc.InterfaceC4003e;
import android.view.View;
import android.view.ViewGroup;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class StickyOzonBankPromoOverlayViewMapper$createHolder$2 implements InterfaceC6068e, InterfaceC7732n {
    final /* synthetic */ StickyOzonBankPromoOverlayViewMapper $tmp0;

    StickyOzonBankPromoOverlayViewMapper$createHolder$2(StickyOzonBankPromoOverlayViewMapper stickyOzonBankPromoOverlayViewMapper) {
        this.$tmp0 = stickyOzonBankPromoOverlayViewMapper;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup p02) {
        View createView;
        Intrinsics.checkNotNullParameter(p02, "p0");
        createView = this.$tmp0.createView(p02);
        return createView;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC6068e) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(1, this.$tmp0, StickyOzonBankPromoOverlayViewMapper.class, "createView", "createView(Landroid/view/ViewGroup;)Landroid/view/View;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
