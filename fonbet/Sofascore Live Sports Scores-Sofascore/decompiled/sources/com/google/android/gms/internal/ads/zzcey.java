package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import defpackage.trn;
import defpackage.xrn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcey implements zzinw {
    public final zzinx a;
    public final zzcel b;

    public zzcey(zzinx zzinxVar, zzcel zzcelVar) {
        this.a = zzinxVar;
        this.b = zzcelVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context context = (Context) this.a.a;
        zzcel zzcelVar = this.b;
        return new xrn(context, new zzcek((Clock) zzcelVar.a.a, (trn) zzcelVar.b.zzb()));
    }
}
