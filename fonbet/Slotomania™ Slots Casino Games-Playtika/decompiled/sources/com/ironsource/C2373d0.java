package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2373d0 implements InterfaceC2355c0 {
    private final InterfaceC2779zc a;

    public C2373d0(InterfaceC2779zc networkShowApi) {
        Intrinsics.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC2355c0
    public void a(Activity activity, J9 adInstance) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.a.a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC2355c0
    public boolean a(J9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return this.a.a(adInstance);
    }
}
