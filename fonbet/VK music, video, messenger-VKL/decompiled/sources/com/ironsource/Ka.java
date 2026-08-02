package com.ironsource;

import com.ironsource.InterfaceC4477ob;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes13.dex */
public final class Ka {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC4477ob<LevelPlayAdInfo> interfaceC4477ob) {
        if (interfaceC4477ob instanceof InterfaceC4477ob.b) {
            return "success";
        }
        if (interfaceC4477ob instanceof InterfaceC4477ob.a) {
            return "failure";
        }
        throw new NoWhenBranchMatchedException();
    }
}
