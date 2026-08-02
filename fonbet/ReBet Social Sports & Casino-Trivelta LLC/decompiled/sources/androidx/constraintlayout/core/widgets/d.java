package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.i;
import androidx.constraintlayout.core.widgets.analyzer.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public int f17903b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17904c;

    /* renamed from: d, reason: collision with root package name */
    public final e f17905d;

    /* renamed from: e, reason: collision with root package name */
    public final a f17906e;

    /* renamed from: f, reason: collision with root package name */
    public d f17907f;

    /* renamed from: i, reason: collision with root package name */
    public androidx.constraintlayout.core.i f17910i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f17902a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f17908g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f17909h = Integer.MIN_VALUE;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f17905d = eVar;
        this.f17906e = aVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z10 && !p(dVar)) {
            return false;
        }
        this.f17907f = dVar;
        if (dVar.f17902a == null) {
            dVar.f17902a = new HashSet();
        }
        HashSet hashSet = this.f17907f.f17902a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f17908g = i10;
        this.f17909h = i11;
        return true;
    }

    public void c(int i10, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f17902a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.i.a(((d) it.next()).f17905d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet d() {
        return this.f17902a;
    }

    public int e() {
        if (this.f17904c) {
            return this.f17903b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f17905d.V() == 8) {
            return 0;
        }
        return (this.f17909h == Integer.MIN_VALUE || (dVar = this.f17907f) == null || dVar.f17905d.V() != 8) ? this.f17908g : this.f17909h;
    }

    public final d g() {
        switch (this.f17906e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f17905d.f17933M;
            case TOP:
                return this.f17905d.f17934N;
            case RIGHT:
                return this.f17905d.f17931K;
            case BOTTOM:
                return this.f17905d.f17932L;
            default:
                throw new AssertionError(this.f17906e.name());
        }
    }

    public e h() {
        return this.f17905d;
    }

    public androidx.constraintlayout.core.i i() {
        return this.f17910i;
    }

    public d j() {
        return this.f17907f;
    }

    public a k() {
        return this.f17906e;
    }

    public boolean l() {
        HashSet hashSet = this.f17902a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f17902a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f17904c;
    }

    public boolean o() {
        return this.f17907f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a k10 = dVar.k();
        a aVar = this.f17906e;
        if (k10 == aVar) {
            return aVar != a.BASELINE || (dVar.h().Z() && h().Z());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = k10 == a.LEFT || k10 == a.RIGHT;
                return dVar.h() instanceof h ? z10 || k10 == a.CENTER_X : z10;
            case TOP:
            case BOTTOM:
                boolean z11 = k10 == a.TOP || k10 == a.BOTTOM;
                return dVar.h() instanceof h ? z11 || k10 == a.CENTER_Y : z11;
            case BASELINE:
                return (k10 == a.LEFT || k10 == a.RIGHT) ? false : true;
            case CENTER:
                return (k10 == a.BASELINE || k10 == a.CENTER_X || k10 == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f17906e.name());
        }
    }

    public void q() {
        HashSet hashSet;
        d dVar = this.f17907f;
        if (dVar != null && (hashSet = dVar.f17902a) != null) {
            hashSet.remove(this);
            if (this.f17907f.f17902a.size() == 0) {
                this.f17907f.f17902a = null;
            }
        }
        this.f17902a = null;
        this.f17907f = null;
        this.f17908g = 0;
        this.f17909h = Integer.MIN_VALUE;
        this.f17904c = false;
        this.f17903b = 0;
    }

    public void r() {
        this.f17904c = false;
        this.f17903b = 0;
    }

    public void s(androidx.constraintlayout.core.c cVar) {
        androidx.constraintlayout.core.i iVar = this.f17910i;
        if (iVar == null) {
            this.f17910i = new androidx.constraintlayout.core.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.e();
        }
    }

    public void t(int i10) {
        this.f17903b = i10;
        this.f17904c = true;
    }

    public String toString() {
        return this.f17905d.t() + ":" + this.f17906e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f17909h = i10;
        }
    }
}
