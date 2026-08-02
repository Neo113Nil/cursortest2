package com.google.android.gms.internal.ads;

import defpackage.c9o;
import defpackage.d1l;
import defpackage.f0o;
import defpackage.hlo;
import defpackage.ohn;
import defpackage.vlo;
import defpackage.yvn;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfoh {
    public final r a;
    public final ohn b;
    public zzfon d;
    public int e = 1;
    public final ArrayDeque c = new ArrayDeque();

    public zzfoh(r rVar, zzfnh zzfnhVar, ohn ohnVar) {
        this.a = rVar;
        this.b = ohnVar;
        zzfnhVar.a = new d1l(this, 21);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void a() {
        zzfof zzfofVar;
        Object[] objArr;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q7)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().g().zzi().j) {
            this.c.clear();
            return;
        }
        synchronized (this) {
            boolean z = false;
            Object[] objArr2 = 0;
            if ((this.d == null) != false) {
                while (true) {
                    ArrayDeque arrayDeque = this.c;
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    zzfofVar = (zzfof) arrayDeque.pollFirst();
                    if (zzfofVar == null) {
                        break;
                    }
                    if (zzfofVar.zzb() != null) {
                        r rVar = this.a;
                        zzfnv zzb = zzfofVar.zzb();
                        synchronized (rVar) {
                            c9o c9oVar = (c9o) rVar.a.get(zzb);
                            if (c9oVar != null) {
                                zzfns zzfnsVar = rVar.b;
                                c9oVar.a();
                                if (c9oVar.a.size() >= zzfnsVar.e) {
                                    objArr = false;
                                }
                            }
                            objArr = true;
                        }
                        if (objArr != false) {
                            break;
                        }
                    }
                }
                zzfon zzfonVar = new zzfon(this.a, this.b, zzfofVar);
                this.d = zzfonVar;
                f0o f0oVar = new f0o(this, zzfofVar, z, 14);
                synchronized (zzfonVar) {
                    hlo h = zzhcy.h(zzfonVar.b, yvn.m, zzfofVar.zza());
                    h.addListener(new vlo(objArr2 == true ? 1 : 0, h, f0oVar), zzfofVar.zza());
                }
            }
        }
    }
}
