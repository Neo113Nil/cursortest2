package defpackage;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class wlg extends tmg implements ylg, qmg {
    public HashSet i = null;
    public String j = null;
    public HashSet k = null;
    public HashSet l = null;
    public HashSet m = null;
    public Matrix n;

    @Override // defpackage.qmg
    public final Set b() {
        return this.k;
    }

    @Override // defpackage.qmg
    public final String c() {
        return this.j;
    }

    @Override // defpackage.qmg
    public final void e(HashSet hashSet) {
        this.i = hashSet;
    }

    @Override // defpackage.qmg
    public final Set f() {
        return this.i;
    }

    @Override // defpackage.qmg
    public final void g(HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // defpackage.qmg
    public final void i(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.qmg
    public final void j(String str) {
        this.j = str;
    }

    @Override // defpackage.qmg
    public final void k(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.ylg
    public final void l(Matrix matrix) {
        this.n = matrix;
    }

    @Override // defpackage.qmg
    public final Set m() {
        return this.l;
    }

    @Override // defpackage.qmg
    public final Set n() {
        return this.m;
    }
}
