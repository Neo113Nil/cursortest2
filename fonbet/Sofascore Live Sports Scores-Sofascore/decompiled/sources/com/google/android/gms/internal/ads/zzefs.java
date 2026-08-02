package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbbd;
import defpackage.ddb;
import defpackage.hsn;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzefs implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zzddg c;
    public final zziof d;

    public zzefs(zziof zziofVar, zziof zziofVar2, zzddg zzddgVar, zziof zziofVar3) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zzddgVar;
        this.d = zziofVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004c, code lost:
    
        if (java.lang.Integer.toString(r5).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(r2.d))) != false) goto L6;
     */
    @Override // com.google.android.gms.internal.ads.zziol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        ddb submit;
        final zzbbd zzbbdVar = (zzbbd) this.a.zzb();
        final Context a = ((zzcok) this.b).a();
        zzflw a2 = this.c.a();
        long longValue = ((Long) this.d.zzb()).longValue();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.F3)).intValue();
        if (intValue != -1) {
        }
        if (com.google.android.gms.ads.internal.zzt.zzk().a() - longValue < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.H3)).intValue()) {
            final int i = 1;
            submit = hsnVar.submit(new Callable() { // from class: s3o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = i;
                    Context context = a;
                    zzbbd zzbbdVar2 = zzbbdVar;
                    switch (i2) {
                        case 0:
                            return zzbbdVar2.b.zzl(context);
                        default:
                            return zzbbdVar2.b.zzk(context);
                    }
                }
            });
            zzioe.a(submit);
            return submit;
        }
        final int i2 = 0;
        submit = hsnVar.submit(new Callable() { // from class: s3o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i22 = i2;
                Context context = a;
                zzbbd zzbbdVar2 = zzbbdVar;
                switch (i22) {
                    case 0:
                        return zzbbdVar2.b.zzl(context);
                    default:
                        return zzbbdVar2.b.zzk(context);
                }
            }
        });
        zzioe.a(submit);
        return submit;
    }
}
