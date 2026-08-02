package com.unity3d.mediation;

import com.ironsource.C4498pe;
import xsna.gq;

/* loaded from: classes14.dex */
public final class LevelPlayInitError {
    private final int a;
    private final String b;

    public LevelPlayInitError(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int getErrorCode() {
        return this.a;
    }

    public final String getErrorMessage() {
        return this.b;
    }

    public String toString() {
        return gq.b(this.a, "LevelPlayError(errorCode=", ", errorMessage='", this.b, "')");
    }

    public LevelPlayInitError(C4498pe c4498pe) {
        this(c4498pe.c(), c4498pe.d());
    }
}
