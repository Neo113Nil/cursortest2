package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import defpackage.ntn;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzclb extends zzchl {
    public final zzcig c;
    public zzclc d;
    public zzcht e;
    public boolean f;
    public int g;

    public zzclb(Context context, zzcig zzcigVar) {
        super(context);
        this.g = 1;
        this.f = false;
        this.c = zzcigVar;
        zzcigVar.a(this);
    }

    public final boolean C() {
        int i = this.g;
        return (i == 1 || i == 2 || this.d == null) ? false : true;
    }

    public final void D(int i) {
        zzcij zzcijVar = this.b;
        zzcig zzcigVar = this.c;
        if (i == 4) {
            zzcigVar.d();
            zzcijVar.d = true;
            zzcijVar.a();
        } else if (this.g == 4) {
            zzcigVar.m = false;
            zzcijVar.d = false;
            zzcijVar.a();
        }
        this.g = i;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final String h() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void i(zzcht zzchtVar) {
        this.e = zzchtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void j(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.d = new zzclc();
            D(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new ntn(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void k() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzclc zzclcVar = this.d;
        if (zzclcVar != null) {
            zzclcVar.a.set(false);
            this.d = null;
            D(1);
        }
        this.c.b();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void l() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (C()) {
            this.d.a.set(true);
            D(4);
            this.a.c = true;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new ntn(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void m() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (C() && this.d.a.get()) {
            this.d.a.set(false);
            D(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new ntn(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int n() {
        return C() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void p(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int r() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int s() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long t() {
        return 0L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzclb.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return wt3.m(name, "@", new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long u() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int w() {
        return C() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void x() {
        if (this.d != null) {
            this.b.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void q(float f, float f2) {
    }
}
