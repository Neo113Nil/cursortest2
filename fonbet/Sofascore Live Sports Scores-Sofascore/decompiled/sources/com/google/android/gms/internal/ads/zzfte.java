package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import defpackage.ddb;
import defpackage.een;
import defpackage.hsn;
import defpackage.utn;
import defpackage.vlo;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfte {
    public final Context a;
    public final hsn b;
    public final zzhdj c;
    public final zzu d;
    public final zzfsw e;
    public final zzfrj f;
    public final zzcny g;

    public zzfte(Context context, hsn hsnVar, zzhdj zzhdjVar, zzu zzuVar, zzfsw zzfswVar, zzfrj zzfrjVar, zzcny zzcnyVar) {
        this.a = context;
        this.b = hsnVar;
        this.c = zzhdjVar;
        this.d = zzuVar;
        this.e = zzfswVar;
        this.f = zzfrjVar;
        this.g = zzcnyVar;
    }

    public final void a(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), zzvVar, null, null);
        }
    }

    public final void b(String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfrg zzfrgVar, zzdge zzdgeVar) {
        ddb submit;
        zzfqw zzfqwVar = null;
        if (zzfrj.a() && ((Boolean) zzbla.d.c()).booleanValue()) {
            zzfqwVar = zzfqw.e(14, this.a);
            zzfqwVar.zza();
        }
        zzfqw zzfqwVar2 = zzfqwVar;
        if (zzvVar != null) {
            submit = new zzfsv(zzvVar.zza(), this.d, this.c, this.e, this.g).a(str);
        } else {
            submit = this.c.submit(new een(10, this, str));
        }
        submit.addListener(new vlo(0, submit, new utn(this, zzfqwVar2, zzfrgVar, zzdgeVar, 7)), this.b);
    }
}
