package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Tf {
    private final String a;
    private final String b;
    private final boolean c;
    private final Boolean d;

    public Tf(String str, boolean z, Boolean bool, String str2) {
        this.a = str2;
        this.b = str;
        this.c = z;
        this.d = bool;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return epx.f(this.d, Boolean.TRUE);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a aVar) {
        String str = this.b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Wf wf = Wf.a;
        return epx.f(wf.a(networkSettings), this.b) && wf.a(networkSettings, aVar) == this.c;
    }

    public /* synthetic */ Tf(String str, boolean z, Boolean bool, String str2, int i, zcl zclVar) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }
}
