package com.ironsource;

import androidx.lifecycle.ProcessLifecycleOwner;

/* loaded from: classes3.dex */
public final class R5 implements E7 {
    @Override // com.ironsource.E7
    public boolean a() {
        try {
            ProcessLifecycleOwner.INSTANCE.get();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
