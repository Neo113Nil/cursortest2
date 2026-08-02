package com.google.android.gms.internal.ads;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ddb;
import defpackage.lrn;
import defpackage.u4a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzevt implements zzfdi {
    public final zzexw a;
    public final zzflw b;
    public final Context c;
    public final zzcfv d;

    public zzevt(zzexw zzexwVar, zzflw zzflwVar, Context context, zzcfv zzcfvVar) {
        this.a = zzexwVar;
        this.b = zzflwVar;
        this.c = context;
        this.d = zzcfvVar;
    }

    public static final int b(float f, int i) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return (int) Math.ceil(i / f);
    }

    public static final u4a c(u4a u4aVar, float f) {
        return f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? u4a.e : u4a.c((int) Math.ceil(u4aVar.a / f), (int) Math.ceil(u4aVar.b / f), (int) Math.ceil(u4aVar.c / f), (int) Math.ceil(u4aVar.d / f));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 com.google.android.gms.internal.ads.zzevu, still in use, count: 4, list:
          (r3v1 com.google.android.gms.internal.ads.zzevu) from 0x030d: MOVE (r21v0 com.google.android.gms.internal.ads.zzevu) = (r3v1 com.google.android.gms.internal.ads.zzevu) (LINE:782)
          (r3v1 com.google.android.gms.internal.ads.zzevu) from 0x01a7: MOVE (r21v3 com.google.android.gms.internal.ads.zzevu) = (r3v1 com.google.android.gms.internal.ads.zzevu) (LINE:424)
          (r3v1 com.google.android.gms.internal.ads.zzevu) from 0x01ce: MOVE (r21v5 com.google.android.gms.internal.ads.zzevu) = (r3v1 com.google.android.gms.internal.ads.zzevu) (LINE:463)
          (r3v1 com.google.android.gms.internal.ads.zzevu) from 0x017e: MOVE (r21v7 com.google.android.gms.internal.ads.zzevu) = (r3v1 com.google.android.gms.internal.ads.zzevu) (LINE:383)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final com.google.android.gms.internal.ads.zzevu a() {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevt.a():com.google.android.gms.internal.ads.zzevu");
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return zzhcy.i(this.a.zza(), new lrn(this, 3), zzcgj.h);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 7;
    }
}
