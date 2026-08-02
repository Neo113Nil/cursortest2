package com.google.android.gms.internal.cast;

import android.view.Display;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzes implements qdg0 {
    private final Status zza;

    @Nullable
    private final Display zzb;

    public zzes(Status status) {
        this.zza = status;
        this.zzb = null;
    }

    @Nullable
    public final Display getPresentationDisplay() {
        return this.zzb;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.zza;
    }

    public zzes(Display display) {
        this.zza = Status.f;
        this.zzb = display;
    }
}
