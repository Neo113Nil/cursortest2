package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzeuj implements zzfby {
    private final zzfby zza;
    private final zzfkm zzb;
    private final Context zzc;
    private final zzcer zzd;

    zzeuj(zzewm zzewmVar, zzfkm zzfkmVar, Context context, zzcer zzcerVar) {
        this.zza = zzewmVar;
        this.zzb = zzfkmVar;
        this.zzc = context;
        this.zzd = zzcerVar;
    }

    private static final int zzd(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static final int zze(int i, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f);
    }

    private static final Insets zzf(Insets insets, float f) {
        return f == 0.0f ? Insets.NONE : Insets.of((int) Math.ceil(insets.left / f), (int) Math.ceil(insets.top / f), (int) Math.ceil(insets.right / f), (int) Math.ceil(insets.bottom / f));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return zzhbi.zzk(this.zza.zza(), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzeui
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return zzeuj.this.zzc((zzfch) obj);
            }
        }, zzcff.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 com.google.android.gms.internal.ads.zzeuk, still in use, count: 4, list:
          (r4v1 com.google.android.gms.internal.ads.zzeuk) from 0x02d6: MOVE (r20v0 com.google.android.gms.internal.ads.zzeuk) = (r4v1 com.google.android.gms.internal.ads.zzeuk)
          (r4v1 com.google.android.gms.internal.ads.zzeuk) from 0x0215: MOVE (r20v3 com.google.android.gms.internal.ads.zzeuk) = (r4v1 com.google.android.gms.internal.ads.zzeuk)
          (r4v1 com.google.android.gms.internal.ads.zzeuk) from 0x0263: MOVE (r20v5 com.google.android.gms.internal.ads.zzeuk) = (r4v1 com.google.android.gms.internal.ads.zzeuk)
          (r4v1 com.google.android.gms.internal.ads.zzeuk) from 0x0182: MOVE (r20v6 com.google.android.gms.internal.ads.zzeuk) = (r4v1 com.google.android.gms.internal.ads.zzeuk)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    final /* synthetic */ com.google.android.gms.internal.ads.zzeuk zzc(com.google.android.gms.internal.ads.zzfch r22) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuj.zzc(com.google.android.gms.internal.ads.zzfch):com.google.android.gms.internal.ads.zzeuk");
    }
}
