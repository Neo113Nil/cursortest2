package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4028d0 implements InterfaceC4010c0 {

    @NotNull
    private final InterfaceC4434zc a;

    public C4028d0(@NotNull InterfaceC4434zc interfaceC4434zc) {
        interfaceC4434zc.getClass();
        this.a = interfaceC4434zc;
    }

    @Override // com.ironsource.InterfaceC4010c0
    public void a(@NotNull Activity activity, @NotNull J9 j9) {
        activity.getClass();
        j9.getClass();
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + j9.g() + " adInstanceId=" + j9.e());
        this.a.a(activity, j9, new HashMap());
    }

    @Override // com.ironsource.InterfaceC4010c0
    public boolean a(@NotNull J9 j9) {
        j9.getClass();
        return this.a.a(j9);
    }
}
