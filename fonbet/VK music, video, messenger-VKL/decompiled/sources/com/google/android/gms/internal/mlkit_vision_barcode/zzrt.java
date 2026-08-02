package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;
import xsna.cqy;
import xsna.f9e0;
import xsna.ijp;
import xsna.plp0;
import xsna.pop0;
import xsna.top0;
import xsna.uop0;
import xsna.vu8;
import xsna.wxp;
import xsna.xl5;
import xsna.zop0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzrt implements zzrb {

    @Nullable
    private f9e0 zza;
    private final f9e0 zzb;
    private final zzrd zzc;

    public zzrt(Context context, zzrd zzrdVar) {
        this.zzc = zzrdVar;
        vu8 vu8Var = vu8.e;
        zop0.b(context);
        final uop0 c = zop0.a().c(vu8Var);
        if (vu8.d.contains(new ijp("json"))) {
            this.zza = new cqy(new f9e0() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrq
                @Override // xsna.f9e0
                public final Object get() {
                    return top0.this.a("FIREBASE_ML_SDK", new ijp("json"), new plp0() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrs
                        @Override // xsna.plp0
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new cqy(new f9e0() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrr
            @Override // xsna.f9e0
            public final Object get() {
                return top0.this.a("FIREBASE_ML_SDK", new ijp("proto"), new plp0() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrp
                    @Override // xsna.plp0
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static wxp zzb(zzrd zzrdVar, zzra zzraVar) {
        int zza = zzrdVar.zza();
        return zzraVar.zza() != 0 ? new xl5(null, zzraVar.zze(zza, false), Priority.DEFAULT, null) : new xl5(null, zzraVar.zze(zza, false), Priority.VERY_LOW, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzrb
    public final void zza(zzra zzraVar) {
        if (this.zzc.zza() != 0) {
            ((pop0) this.zzb.get()).b(zzb(this.zzc, zzraVar));
            return;
        }
        f9e0 f9e0Var = this.zza;
        if (f9e0Var != null) {
            ((pop0) f9e0Var.get()).b(zzb(this.zzc, zzraVar));
        }
    }
}
