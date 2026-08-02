package com.google.android.gms.internal.mlkit_vision_text_common;

import Q6.c;
import Q6.d;
import Q6.g;
import Q6.h;
import Q6.i;
import S6.u;
import android.content.Context;
import com.google.android.datatransport.cct.a;
import n8.r;
import y8.InterfaceC10861a;

/* loaded from: classes9.dex */
public final class zzuk implements zzts {
    private InterfaceC10861a zza;
    private final InterfaceC10861a zzb;
    private final zztu zzc;

    public zzuk(Context context, zztu zztuVar) {
        this.zzc = zztuVar;
        a aVar = a.f57779e;
        u.c(context);
        final i d11 = u.a().d(aVar);
        if (aVar.e().contains(c.b("json"))) {
            this.zza = new r(new InterfaceC10861a() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuh
                @Override // y8.InterfaceC10861a
                public final Object get() {
                    return i.this.a("FIREBASE_ML_SDK", c.b("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuj
                        @Override // Q6.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new r(new InterfaceC10861a() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzui
            @Override // y8.InterfaceC10861a
            public final Object get() {
                return i.this.a("FIREBASE_ML_SDK", c.b("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzug
                    @Override // Q6.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static d zzb(zztu zztuVar, zztr zztrVar) {
        int zza = zztuVar.zza();
        return zztrVar.zza() != 0 ? d.f(zztrVar.zze(zza, false)) : d.g(zztrVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza(zztr zztrVar) {
        if (this.zzc.zza() != 0) {
            ((h) this.zzb.get()).a(zzb(this.zzc, zztrVar));
            return;
        }
        InterfaceC10861a interfaceC10861a = this.zza;
        if (interfaceC10861a != null) {
            ((h) interfaceC10861a.get()).a(zzb(this.zzc, zztrVar));
        }
    }
}
