package com.ironsource;

import com.ironsource.X3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2388df {
    private EnumC2406ef a;

    public C2388df(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = EnumC2406ef.b.a(config.optInt(X3.a.t, EnumC2406ef.CurrentlyLoadedAds.b()));
    }

    public final EnumC2406ef a() {
        return this.a;
    }
}
