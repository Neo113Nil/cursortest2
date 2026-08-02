package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class rmg extends tmg implements smg, qmg {
    public ArrayList i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override // defpackage.smg
    public final List a() {
        return this.i;
    }

    @Override // defpackage.qmg
    public final Set b() {
        return null;
    }

    @Override // defpackage.qmg
    public final String c() {
        return this.k;
    }

    @Override // defpackage.qmg
    public final void e(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // defpackage.qmg
    public final Set f() {
        return this.j;
    }

    public void h(wmg wmgVar) {
        this.i.add(wmgVar);
    }

    @Override // defpackage.qmg
    public final void i(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.qmg
    public final void j(String str) {
        this.k = str;
    }

    @Override // defpackage.qmg
    public final void k(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.qmg
    public final Set m() {
        return this.l;
    }

    @Override // defpackage.qmg
    public final Set n() {
        return this.m;
    }

    @Override // defpackage.qmg
    public final void g(HashSet hashSet) {
    }
}
