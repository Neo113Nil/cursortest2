package com.ironsource;

import com.ironsource.AbstractC4085g3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class F4<Smash extends AbstractC4085g3<?>> extends Zg<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F4(int i, boolean z, @NotNull List<? extends Smash> list) {
        super(i, z, list);
        list.getClass();
    }

    @Override // com.ironsource.Zg
    public void c(@NotNull Smash smash) {
        smash.getClass();
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
