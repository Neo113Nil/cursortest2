package com.google.mlkit.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.exc0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes13.dex */
public class MlKitException extends Exception {
    private final int zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(@NonNull String str, int i) {
        super(str);
        exc0.g(str, "Provided message must not be empty.");
        this.zza = i;
    }

    public final int d() {
        return this.zza;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(@NonNull String str, @Nullable Exception exc) {
        super(str, exc);
        exc0.g(str, "Provided message must not be empty.");
        this.zza = 13;
    }
}
