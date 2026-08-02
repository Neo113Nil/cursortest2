package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;

/* renamed from: com.ironsource.d0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4269d0 implements InterfaceC4251c0 {
    private final Ac a;

    public C4269d0(Ac ac) {
        this.a = ac;
    }

    @Override // com.ironsource.InterfaceC4251c0
    public void a(Activity activity, K9 k9) {
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + k9.g() + " adInstanceId=" + k9.e());
        this.a.a(activity, k9, new HashMap());
    }

    @Override // com.ironsource.InterfaceC4251c0
    public boolean a(K9 k9) {
        return this.a.a(k9);
    }
}
