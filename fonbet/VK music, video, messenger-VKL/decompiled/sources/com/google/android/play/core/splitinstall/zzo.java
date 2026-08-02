package com.google.android.play.core.splitinstall;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;
import xsna.gc01;
import xsna.lxz0;
import xsna.xd01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class zzo implements gc01 {
    public static final zzo zza;
    private static final AtomicReference zzb;
    private static final /* synthetic */ zzo[] zzc;

    static {
        zzo zzoVar = new zzo("INSTANCE", 0);
        zza = zzoVar;
        zzc = new zzo[]{zzoVar};
        zzb = new AtomicReference(null);
    }

    public static void i(lxz0 lxz0Var) {
        zzb.set(lxz0Var);
    }

    public static zzo[] values() {
        return (zzo[]) zzc.clone();
    }

    @Nullable
    public final xd01 h() {
        return (xd01) zzb.get();
    }
}
