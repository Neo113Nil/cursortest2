package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zza;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
final class s implements Executor {
    public static final s zza;
    private static final /* synthetic */ s[] zzb;

    static {
        s sVar = new s("INSTANCE", 0);
        zza = sVar;
        zzb = new s[]{sVar};
    }

    public static s[] values() {
        return (s[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        zza zzaVar;
        zzaVar = g.a().f60033a;
        zzaVar.post(runnable);
    }
}
