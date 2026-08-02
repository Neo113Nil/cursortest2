package com.ironsource;

import com.ironsource.AbstractC4379j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;

/* loaded from: classes13.dex */
public final class I4<Smash extends AbstractC4379j3<?>> extends ch<Smash> {
    public I4(int i, boolean z, List<? extends Smash> list) {
        super(i, z, list);
    }

    @Override // com.ironsource.ch
    public void c(Smash smash) {
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
