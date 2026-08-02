package com.google.android.gms.internal.ads;

import android.os.Handler;
import defpackage.lv4;
import defpackage.m10;
import defpackage.pyn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzatj {
    public final m10 a;

    public zzatj(Handler handler) {
        this.a = new m10(this, handler);
    }

    public final void a(zzats zzatsVar, zzaty zzatyVar, pyn pynVar) {
        zzatsVar.zzp();
        zzatsVar.zzc("post-response");
        this.a.b.post(new lv4(zzatsVar, zzatyVar, pynVar, false, 15));
    }
}
