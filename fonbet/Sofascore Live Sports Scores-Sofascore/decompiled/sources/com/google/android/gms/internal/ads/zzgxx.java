package com.google.android.gms.internal.ads;

import com.ironsource.U3;
import defpackage.fio;
import defpackage.u0a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgxx extends zzgxs {
    public final void a(Object obj, Object... objArr) {
        List asList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = asList.iterator();
            StringBuilder sb = new StringBuilder(U3.j.d);
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = asList.iterator();
        if (it2.hasNext()) {
            fio fioVar = this.a;
            if (fioVar == null) {
                fioVar = new fio();
                this.a = fioVar;
            }
            zzgxh zzgxhVar = (zzgxh) fioVar.get(obj);
            if (zzgxhVar == null) {
                zzgxhVar = zzgxw.x(asList instanceof Set ? Math.max(4, ((Set) asList).size()) : 4);
                fio fioVar2 = this.a;
                if (fioVar2 == null) {
                    fioVar2 = new fio();
                    this.a = fioVar2;
                }
                fioVar2.put(obj, zzgxhVar);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                u0a.Q(obj, next);
                zzgxhVar.a(next);
            }
        }
    }
}
