package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.dmi;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzg {
    public final zzg a;
    public final zzaw b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public zzg(zzg zzgVar, zzaw zzawVar) {
        this.a = zzgVar;
        this.b = zzawVar;
    }

    public final zzao a(zzao zzaoVar) {
        return this.b.b(this, zzaoVar);
    }

    public final zzao b(zzae zzaeVar) {
        zzao zzaoVar = zzao.I7;
        Iterator e = zzaeVar.e();
        while (e.hasNext()) {
            zzaoVar = this.b.b(this, zzaeVar.n(((Integer) e.next()).intValue()));
            if (zzaoVar instanceof zzag) {
                break;
            }
        }
        return zzaoVar;
    }

    public final zzg c() {
        return new zzg(this, this.b);
    }

    public final boolean d(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        zzg zzgVar = this.a;
        if (zzgVar != null) {
            return zzgVar.d(str);
        }
        return false;
    }

    public final void e(String str, zzao zzaoVar) {
        zzg zzgVar;
        HashMap hashMap = this.c;
        if (!hashMap.containsKey(str) && (zzgVar = this.a) != null && zzgVar.d(str)) {
            zzgVar.e(str, zzaoVar);
        } else {
            if (this.d.containsKey(str)) {
                return;
            }
            if (zzaoVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, zzaoVar);
            }
        }
    }

    public final void f(String str, zzao zzaoVar) {
        if (this.d.containsKey(str)) {
            return;
        }
        HashMap hashMap = this.c;
        if (zzaoVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, zzaoVar);
        }
    }

    public final zzao g(String str) {
        HashMap hashMap = this.c;
        if (hashMap.containsKey(str)) {
            return (zzao) hashMap.get(str);
        }
        zzg zzgVar = this.a;
        if (zzgVar != null) {
            return zzgVar.g(str);
        }
        a70.p(dmi.y(str, " is not defined"));
        return null;
    }
}
