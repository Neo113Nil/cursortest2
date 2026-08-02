package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.util.Objects;
import xsna.ttz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzcw implements ttz0 {
    final /* synthetic */ zzcx zza;

    public zzcw(zzcx zzcxVar) {
        Objects.requireNonNull(zzcxVar);
        this.zza = zzcxVar;
    }

    @Override // xsna.ttz0
    public final void zza(@Nullable Bitmap bitmap) {
        if (bitmap != null) {
            this.zza.zza().setImageBitmap(bitmap);
        }
    }
}
