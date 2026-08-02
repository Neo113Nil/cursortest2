package com.ironsource;

import com.facebook.login.LoginLogger;
import com.ironsource.InterfaceC2563nb;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class Ja {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC2563nb<LevelPlayAdInfo> interfaceC2563nb) {
        if (interfaceC2563nb instanceof InterfaceC2563nb.b) {
            return "success";
        }
        if (interfaceC2563nb instanceof InterfaceC2563nb.a) {
            return LoginLogger.EVENT_EXTRAS_FAILURE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
