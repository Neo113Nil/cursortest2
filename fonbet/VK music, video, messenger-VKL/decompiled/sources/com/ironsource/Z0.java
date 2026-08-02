package com.ironsource;

import com.ironsource.X0;
import com.unity3d.mediation.LevelPlay;

/* loaded from: classes13.dex */
public final class Z0 {
    public final X0 a(String str, LevelPlay.AdFormat adFormat, I8 i8) {
        if (str.length() == 0) {
            return new X0.a(Y0.a);
        }
        if (!i8.c()) {
            return new X0.a(Y0.b);
        }
        Va a = i8.a();
        return (a == null || !a.a(str, adFormat)) ? new X0.a(Y0.c) : X0.b.a;
    }
}
