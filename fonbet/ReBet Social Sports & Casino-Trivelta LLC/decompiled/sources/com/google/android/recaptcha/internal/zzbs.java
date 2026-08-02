package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.gms.common.C3171d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbs {

    @NotNull
    private final C3171d zza;

    public zzbs(@NotNull C3171d c3171d) {
        this.zza = c3171d;
    }

    @NotNull
    public final int zza(@NotNull Context context) {
        int i10 = this.zza.i(context);
        return (i10 == 1 || i10 == 3 || i10 == 9) ? 4 : 3;
    }

    public zzbs() {
        this.zza = C3171d.h();
    }
}
