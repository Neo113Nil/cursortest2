package ru.ozon.app.android.account.orders.view.maps.ui;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class MapsRouteFragment$onViewCreated$adapter$1 extends C7735q implements Function1<Intent, Unit> {
    MapsRouteFragment$onViewCreated$adapter$1(Object obj) {
        super(1, obj, MapsRouteFragment.class, "openMapApplication", "openMapApplication(Landroid/content/Intent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Intent p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((MapsRouteFragment) this.receiver).openMapApplication(p02);
    }
}
