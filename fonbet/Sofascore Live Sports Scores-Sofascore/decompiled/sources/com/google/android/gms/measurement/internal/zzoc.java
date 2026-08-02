package com.google.android.gms.measurement.internal;

import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcl;
import defpackage.c78;
import defpackage.gvo;
import defpackage.muo;
import defpackage.yao;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzoc extends yao {
    public zzcl d;
    public boolean e;
    public final muo f;
    public final c78 g;
    public final gvo h;

    public zzoc(zzic zzicVar) {
        super(zzicVar);
        this.e = true;
        this.f = new muo(this, 2);
        this.g = new c78(this);
        this.h = new gvo(this);
    }

    @Override // defpackage.yao
    public final boolean T() {
        return false;
    }

    public final void U() {
        Q();
        if (this.d == null) {
            this.d = new zzcl(Looper.getMainLooper());
        }
    }
}
