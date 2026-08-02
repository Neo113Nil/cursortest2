package com.ironsource;

import com.ironsource.AbstractC2483j3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Rg<Smash extends AbstractC2483j3<?>> {
    private final Wg<Smash> a;

    public Rg(Wg<Smash> smashPicker) {
        Intrinsics.checkNotNullParameter(smashPicker, "smashPicker");
        this.a = smashPicker;
    }

    public final List<Smash> a() {
        return this.a.c();
    }

    public final boolean b() {
        return this.a.c().isEmpty() && this.a.a().isEmpty();
    }

    public final boolean c() {
        return this.a.d() == 0;
    }
}
