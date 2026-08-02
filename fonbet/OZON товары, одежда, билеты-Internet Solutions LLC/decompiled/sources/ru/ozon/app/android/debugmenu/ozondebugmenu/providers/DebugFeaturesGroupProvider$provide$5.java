package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.debugmenu.debugscreen.abtool.AbToggleRouter;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class DebugFeaturesGroupProvider$provide$5 extends C7735q implements Function1<Context, Unit> {
    DebugFeaturesGroupProvider$provide$5(Object obj) {
        super(1, obj, AbToggleRouter.class, "openFeatureFlags", "openFeatureFlags(Landroid/content/Context;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Context context) {
        invoke2(context);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Context p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AbToggleRouter) this.receiver).openFeatureFlags(p02);
    }
}
