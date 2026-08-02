package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzac;
import com.google.android.gms.cast.internal.zzai;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.jmn;
import defpackage.lv4;
import defpackage.nkn;
import defpackage.wjn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b extends zzai {
    public final /* synthetic */ zzbm a;

    public b(zzbm zzbmVar) {
        this.a = zzbmVar;
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void A2(String str, String str2) {
        zzbm.H.a("Receive (type=text, ns=%s) %s", str, str2);
        this.a.k().post(new lv4(this, str, str2, false, 18));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void B3(int i, long j) {
        this.a.j(i, j);
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void H2(com.google.android.gms.cast.internal.zza zzaVar) {
        this.a.k().post(new wjn(2, this, zzaVar));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void P0() {
        zzbm.H.a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void Z(String str, byte[] bArr) {
        Logger logger = zzbm.H;
        zzbm.H.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void f(int i) {
        this.a.i(i);
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void g(int i) {
        this.a.i(i);
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void h(int i) {
        zzbm zzbmVar = this.a;
        zzbmVar.i(i);
        if (zzbmVar.E != null) {
            zzbmVar.k().post(new jmn(this, i, 2));
        }
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void i(int i) {
        this.a.k().post(new jmn(this, i, 1));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void k(int i) {
        this.a.k().post(new jmn(this, i, 0));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void m4(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        zzbm zzbmVar = this.a;
        zzbmVar.u = applicationMetadata;
        zzbmVar.v = str;
        com.google.android.gms.cast.internal.zzr zzrVar = new com.google.android.gms.cast.internal.zzr(new Status(0, null, null, null), applicationMetadata, str, str2, z);
        synchronized (zzbmVar.s) {
            try {
                TaskCompletionSource taskCompletionSource = zzbmVar.p;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(zzrVar);
                }
                zzbmVar.p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void v3(zzac zzacVar) {
        this.a.k().post(new nkn(this, zzacVar, false, 1));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void zzb(int i) {
        this.a.k().post(new jmn(this, i, 3));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void zzf(int i) {
        this.a.o(i);
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void zzp(long j) {
        this.a.j(0, j);
    }
}
