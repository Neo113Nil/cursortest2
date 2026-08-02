package com.my.tracker.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.obfuscated.e0;
import java.util.concurrent.Executor;
import xsna.asu0;

/* loaded from: classes14.dex */
public final class PluginEventTracker {
    private static final Executor b = asu0.C();
    private final e0 a;

    private PluginEventTracker(e0 e0Var) {
        this.a = e0Var;
    }

    public static PluginEventTracker a(e0 e0Var) {
        return new PluginEventTracker(e0Var);
    }

    public static void onBackground(@NonNull Runnable runnable) {
        b.execute(runnable);
    }

    public void trackPluginEvent(int i, @NonNull byte[] bArr, boolean z, boolean z2, @Nullable Runnable runnable) {
        this.a.a(i, bArr, z, z2, runnable);
    }
}
