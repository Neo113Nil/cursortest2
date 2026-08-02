package com.ironsource;

import com.ironsource.AbstractC2483j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class I4<Smash extends AbstractC2483j3<?>> extends Wg<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I4(int i, boolean z, List<? extends Smash> waterfall) {
        super(i, z, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
    }

    @Override // com.ironsource.Wg
    public void c(Smash smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
