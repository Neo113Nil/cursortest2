package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.SessionTransferCallback;
import com.google.android.gms.cast.internal.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzm extends SessionTransferCallback {
    public final /* synthetic */ zzn a;

    public zzm(zzn zznVar) {
        this.a = zznVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionTransferCallback
    public final void a(int i, int i2) {
        Logger logger = zzn.j;
        zzn.j.a("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i), Integer.valueOf(i2));
        zzn zznVar = this.a;
        zznVar.e();
        zzp zzpVar = zznVar.c;
        zzo zzoVar = zznVar.g;
        zzj zzjVar = zznVar.a;
        zzqq b = zzpVar.b(zzoVar);
        zzqf o = zzqg.o(b.e());
        o.b();
        ((zzqg) o.b).z(i);
        o.b();
        ((zzqg) o.b).A(i2);
        b.f((zzqg) o.c());
        zzjVar.a((zzqr) b.c(), 232);
        zznVar.i = false;
    }

    @Override // com.google.android.gms.cast.framework.SessionTransferCallback
    public final void b(int i) {
        Logger logger = zzn.j;
        zzn.j.a("onTransferred with type = %d", Integer.valueOf(i));
        zzn zznVar = this.a;
        zznVar.e();
        zzp zzpVar = zznVar.c;
        zzo zzoVar = zznVar.g;
        zzj zzjVar = zznVar.a;
        zzqq b = zzpVar.b(zzoVar);
        zzqf o = zzqg.o(b.e());
        o.b();
        ((zzqg) o.b).z(i);
        b.f((zzqg) o.c());
        zzjVar.a((zzqr) b.c(), 231);
        zznVar.i = false;
        zznVar.g = null;
    }
}
