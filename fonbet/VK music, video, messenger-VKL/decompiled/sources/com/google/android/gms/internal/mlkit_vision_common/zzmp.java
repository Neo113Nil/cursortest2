package com.google.android.gms.internal.mlkit_vision_common;

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

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes12.dex */
public final class zzmp implements zzmc {

    @Nullable
    private f9e0 zza;
    private final f9e0 zzb;
    private final zzme zzc;

    public zzmp(Context context, zzme zzmeVar) {
        this.zzc = zzmeVar;
        vu8 vu8Var = vu8.e;
        zop0.b(context);
        final uop0 c = zop0.a().c(vu8Var);
        if (vu8.d.contains(new ijp("json"))) {
            this.zza = new cqy(new f9e0() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmm
                @Override // xsna.f9e0
                public final Object get() {
                    return top0.this.a("FIREBASE_ML_SDK", new ijp("json"), new plp0() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmo
                        @Override // xsna.plp0
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new cqy(new f9e0() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmn
            @Override // xsna.f9e0
            public final Object get() {
                return top0.this.a("FIREBASE_ML_SDK", new ijp("proto"), new plp0() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzml
                    @Override // xsna.plp0
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static wxp zzb(zzme zzmeVar, zzmb zzmbVar) {
        return new xl5(null, zzmbVar.zzd(zzmeVar.zza(), false), Priority.VERY_LOW, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        if (this.zzc.zza() != 0) {
            ((pop0) this.zzb.get()).b(zzb(this.zzc, zzmbVar));
            return;
        }
        f9e0 f9e0Var = this.zza;
        if (f9e0Var != null) {
            ((pop0) f9e0Var.get()).b(zzb(this.zzc, zzmbVar));
        }
    }
}
