package com.ironsource;

/* loaded from: classes4.dex */
public interface Gg {
    static /* synthetic */ Eg a(Gg gg, Mg mg, F f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWaterfall");
        }
        if ((i & 2) != 0) {
            f = null;
        }
        return gg.a(mg, f);
    }

    Eg a(Mg mg, F f);
}
