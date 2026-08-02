package com.google.android.gms.internal.measurement;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.fhh;
import defpackage.vv9;
import defpackage.z1a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzwl {
    public static final zzwj d = zzwj.a();
    public final zzwl a;
    public final fhh b;
    public boolean c = false;

    public /* synthetic */ zzwl(zzwl zzwlVar, fhh fhhVar) {
        if (zzwlVar != null) {
            z1a.s(zzwlVar.c);
        }
        this.a = zzwlVar;
        this.b = fhhVar;
    }

    public static zzwl a(zzwl zzwlVar, zzwl zzwlVar2) {
        zzwlVar.getClass();
        zzwl zzwlVar3 = g.e;
        if (zzwlVar == zzwlVar3) {
            return zzwlVar2;
        }
        zzwlVar2.getClass();
        if (zzwlVar2 == zzwlVar3) {
            return zzwlVar;
        }
        vv9<zzwl> w = vv9.w(zzwlVar, zzwlVar2);
        if (w.isEmpty()) {
            return zzwlVar3;
        }
        if (w.size() == 1) {
            return (zzwl) w.iterator().next();
        }
        int i = 0;
        for (zzwl zzwlVar4 : w) {
            do {
                i += zzwlVar4.b.c;
                zzwlVar4 = zzwlVar4.a;
            } while (zzwlVar4 != null);
        }
        if (i == 0) {
            return g.e;
        }
        fhh fhhVar = new fhh(i);
        for (zzwl zzwlVar5 : w) {
            do {
                int i2 = 0;
                while (true) {
                    fhh fhhVar2 = zzwlVar5.b;
                    if (i2 >= fhhVar2.c) {
                        break;
                    }
                    z1a.q(fhhVar2.g(i2), "Duplicate bindings: %s", fhhVar.put((zzwj) fhhVar2.g(i2), fhhVar2.k(i2)) == null);
                    i2++;
                }
                zzwlVar5 = zzwlVar5.a;
            } while (zzwlVar5 != null);
        }
        return new g(null, fhhVar).b();
    }

    public final zzwl b() {
        if (this.c) {
            a70.r("Already frozen");
            return null;
        }
        this.c = true;
        zzwl zzwlVar = this.a;
        return (zzwlVar == null || !this.b.isEmpty()) ? this : zzwlVar;
    }

    public final boolean c(zzwj zzwjVar) {
        if (this.b.containsKey(zzwjVar)) {
            return true;
        }
        zzwl zzwlVar = this.a;
        return zzwlVar != null && zzwlVar.c(zzwjVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (zzwl zzwlVar = this; zzwlVar != null; zzwlVar = zzwlVar.a) {
            for (int i = 0; i < zzwlVar.b.c; i++) {
                sb.append(U3.j.d);
                sb.append(this.b.k(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
