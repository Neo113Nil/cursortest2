package com.google.android.gms.internal.cast;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.f5o0;
import xsna.ouf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzfu extends b implements zzgb {
    public zzfu(@NonNull Context context, @NonNull zzfz zzfzVar) {
        super(context, (a<zzfz>) zzga.zza, zzfzVar, b.a.c);
    }

    @Override // com.google.android.gms.internal.cast.zzgb
    public final Task zza() {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.cast.zzft
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzgh) ((zzgm) obj).getService()).zze(new zzfs(zzfu.this, (TaskCompletionSource) obj2));
            }
        };
        a.e = 4501;
        return doRead(a.a());
    }
}
