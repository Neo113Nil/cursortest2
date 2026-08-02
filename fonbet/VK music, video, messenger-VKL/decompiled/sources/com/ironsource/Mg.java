package com.ironsource;

/* loaded from: classes13.dex */
public interface Mg {
    static /* synthetic */ Kg a(Mg mg, Sg sg2, F f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWaterfall");
        }
        if ((i & 2) != 0) {
            f = null;
        }
        return mg.a(sg2, f);
    }

    Kg a(Sg sg2, F f);
}
