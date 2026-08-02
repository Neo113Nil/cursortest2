package com.google.android.gms.internal.mlkit_vision_barcode;

import Q6.c;
import Q6.d;
import Q6.g;
import Q6.h;
import Q6.i;
import S6.u;
import android.content.Context;
import n8.r;
import y8.InterfaceC10861a;

/* loaded from: classes9.dex */
public final class zzwx implements zzwf {
    private InterfaceC10861a zza;
    private final InterfaceC10861a zzb;
    private final zzwh zzc;

    public zzwx(Context context, zzwh zzwhVar) {
        this.zzc = zzwhVar;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f57779e;
        u.c(context);
        final i d11 = u.a().d(aVar);
        if (aVar.e().contains(c.b("json"))) {
            this.zza = new r(new InterfaceC10861a() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwu
                @Override // y8.InterfaceC10861a
                public final Object get() {
                    return i.this.a("FIREBASE_ML_SDK", c.b("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzww
                        @Override // Q6.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new r(new InterfaceC10861a() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwv
            @Override // y8.InterfaceC10861a
            public final Object get() {
                return i.this.a("FIREBASE_ML_SDK", c.b("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwt
                    @Override // Q6.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static d zzb(zzwh zzwhVar, zzwe zzweVar) {
        int zza = zzwhVar.zza();
        return zzweVar.zza() != 0 ? d.f(zzweVar.zze(zza, false)) : d.g(zzweVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(zzwe zzweVar) {
        if (this.zzc.zza() != 0) {
            ((h) this.zzb.get()).a(zzb(this.zzc, zzweVar));
            return;
        }
        InterfaceC10861a interfaceC10861a = this.zza;
        if (interfaceC10861a != null) {
            ((h) interfaceC10861a.get()).a(zzb(this.zzc, zzweVar));
        }
    }
}
