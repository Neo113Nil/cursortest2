package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgad {
    public final byte[] a;
    public int b;
    public int c;
    public final /* synthetic */ zzgae d;

    public /* synthetic */ zzgad(zzgae zzgaeVar, byte[] bArr) {
        this.d = zzgaeVar;
        this.a = bArr;
    }

    public final synchronized void a() {
        try {
            zzgae zzgaeVar = this.d;
            if (zzgaeVar.b) {
                zzgah zzgahVar = zzgaeVar.a;
                zzgahVar.y(this.a);
                zzgahVar.g(this.b);
                zzgahVar.h(this.c);
                zzgahVar.M1();
                zzgahVar.zze();
            }
        } catch (RemoteException unused) {
        }
    }
}
