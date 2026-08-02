package com.google.android.gms.internal.mlkit_common;

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
public final class zzsp implements zzrz {
    private InterfaceC10861a zza;
    private final InterfaceC10861a zzb;
    private final zzsb zzc;

    public zzsp(Context context, zzsb zzsbVar) {
        this.zzc = zzsbVar;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f57779e;
        u.c(context);
        final i d11 = u.a().d(aVar);
        if (aVar.e().contains(c.b("json"))) {
            this.zza = new r(new InterfaceC10861a() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // y8.InterfaceC10861a
                public final Object get() {
                    return i.this.a("FIREBASE_ML_SDK", c.b("json"), new g() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // Q6.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new r(new InterfaceC10861a() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // y8.InterfaceC10861a
            public final Object get() {
                return i.this.a("FIREBASE_ML_SDK", c.b("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // Q6.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static d zzb(zzsb zzsbVar, zzry zzryVar) {
        return d.g(zzryVar.zze(zzsbVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.zzc.zza() != 0) {
            ((h) this.zzb.get()).a(zzb(this.zzc, zzryVar));
            return;
        }
        InterfaceC10861a interfaceC10861a = this.zza;
        if (interfaceC10861a != null) {
            ((h) interfaceC10861a.get()).a(zzb(this.zzc, zzryVar));
        }
    }
}
