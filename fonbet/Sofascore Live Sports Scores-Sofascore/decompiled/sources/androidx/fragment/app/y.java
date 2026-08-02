package androidx.fragment.app;

import android.view.ViewGroup;
import defpackage.ixh;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y {
    public int a;
    public int b;
    public final Fragment c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final u l;

    public y(int i, int i2, u uVar) {
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        Fragment fragment = uVar.c;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = fragment;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = uVar;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (ixh ixhVar : CollectionsKt.S0(this.k)) {
            ixhVar.getClass();
            if (!ixhVar.b) {
                ixhVar.b(viewGroup);
            }
            ixhVar.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (s.O(2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.mTransitioning = false;
        this.l.i();
    }

    public final void c(ixh ixhVar) {
        ixhVar.getClass();
        ArrayList arrayList = this.j;
        if (arrayList.remove(ixhVar) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        int C = wt3.C(i2);
        Fragment fragment = this.c;
        if (C == 0) {
            if (this.a != 1) {
                if (s.O(2)) {
                    Objects.toString(fragment);
                }
                this.a = i;
                return;
            }
            return;
        }
        if (C != 1) {
            if (C != 2) {
                return;
            }
            if (s.O(2)) {
                Objects.toString(fragment);
            }
            this.a = 1;
            this.b = 3;
            this.i = true;
            return;
        }
        if (this.a == 1) {
            if (s.O(2)) {
                Objects.toString(fragment);
            }
            this.a = 2;
            this.b = 2;
            this.i = true;
        }
    }

    public final String toString() {
        StringBuilder q = wt3.q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        int i = this.a;
        String str = "null";
        q.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        q.append(" lifecycleImpact = ");
        int i2 = this.b;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "ADDING";
        } else if (i2 == 3) {
            str = "REMOVING";
        }
        q.append(str);
        q.append(" fragment = ");
        q.append(this.c);
        q.append('}');
        return q.toString();
    }
}
