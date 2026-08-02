package x;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r4.k;
import y.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f25285b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25286c;

    /* renamed from: d, reason: collision with root package name */
    public final d f25287d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25288e;

    /* renamed from: f, reason: collision with root package name */
    public c f25289f;

    /* renamed from: i, reason: collision with root package name */
    public v.g f25292i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f25284a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f25290g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f25291h = Integer.MIN_VALUE;

    public c(d dVar, int i5) {
        this.f25287d = dVar;
        this.f25288e = i5;
    }

    public final void a(c cVar, int i5) {
        b(cVar, i5, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i5, int i10, boolean z5) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z5 && !i(cVar)) {
            return false;
        }
        this.f25289f = cVar;
        if (cVar.f25284a == null) {
            cVar.f25284a = new HashSet();
        }
        HashSet hashSet = this.f25289f.f25284a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f25290g = i5;
        this.f25291h = i10;
        return true;
    }

    public final void c(int i5, ArrayList arrayList, m mVar) {
        HashSet hashSet = this.f25284a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                y.g.b(((c) it.next()).f25287d, i5, arrayList, mVar);
            }
        }
    }

    public final int d() {
        if (this.f25286c) {
            return this.f25285b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f25287d.f25305g0 == 8) {
            return 0;
        }
        int i5 = this.f25291h;
        return (i5 == Integer.MIN_VALUE || (cVar = this.f25289f) == null || cVar.f25287d.f25305g0 != 8) ? this.f25290g : i5;
    }

    public final c f() {
        int i5 = this.f25288e;
        int d10 = v.f.d(i5);
        d dVar = this.f25287d;
        switch (d10) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(k.t(i5));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f25284a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f25289f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(c cVar) {
        if (cVar != null) {
            d dVar = cVar.f25287d;
            int i5 = cVar.f25288e;
            int i10 = this.f25288e;
            if (i5 != i10) {
                switch (v.f.d(i10)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z5 = i5 == 2 || i5 == 4;
                        if (!(dVar instanceof h)) {
                            return z5;
                        }
                        if (z5 || i5 == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z7 = i5 == 3 || i5 == 5;
                        if (!(dVar instanceof h)) {
                            return z7;
                        }
                        if (z7 || i5 == 9) {
                        }
                        break;
                    case 5:
                        if (i5 == 2 || i5 == 4) {
                        }
                        break;
                    case 6:
                        if (i5 == 6 || i5 == 8 || i5 == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(k.t(i10));
                }
            } else if (i10 != 6 || (dVar.E && this.f25287d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f25289f;
        if (cVar != null && (hashSet = cVar.f25284a) != null) {
            hashSet.remove(this);
            if (this.f25289f.f25284a.size() == 0) {
                this.f25289f.f25284a = null;
            }
        }
        this.f25284a = null;
        this.f25289f = null;
        this.f25290g = 0;
        this.f25291h = Integer.MIN_VALUE;
        this.f25286c = false;
        this.f25285b = 0;
    }

    public final void k() {
        v.g gVar = this.f25292i;
        if (gVar == null) {
            this.f25292i = new v.g(1);
        } else {
            gVar.c();
        }
    }

    public final void l(int i5) {
        this.f25285b = i5;
        this.f25286c = true;
    }

    public final String toString() {
        return this.f25287d.f25307h0 + StringUtils.PROCESS_POSTFIX_DELIMITER + k.t(this.f25288e);
    }
}
