package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes5.dex */
public final class g implements DefaultLifecycleObserver {
    public static boolean c;
    public static final g a = new g();
    public static final MutableStateFlow<Boolean> b = StateFlowKt.MutableStateFlow(Boolean.TRUE);
    public static final int d = 8;

    public final void a() {
        if (c) {
            return;
        }
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this);
        c = true;
    }

    public final StateFlow<Boolean> b() {
        return b;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        b.setValue(Boolean.TRUE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        b.setValue(Boolean.FALSE);
    }
}
