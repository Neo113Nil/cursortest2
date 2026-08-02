package com.ironsource;

import com.ironsource.H;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class G4 extends H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G4(AbstractC2731x0 adUnitData, Jg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.H
    public void a(B instance, H.b loadSelection) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        IronLog.INTERNAL.verbose(instance.d().name() + " - Instance " + instance.q() + " is ready to load");
        loadSelection.a().add(instance);
    }
}
