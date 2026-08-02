package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bmh implements Iterator {
    public final /* synthetic */ int a;
    public int b = -1;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ bmh(AbstractMap abstractMap, int i) {
        this.a = i;
        this.e = abstractMap;
    }

    public Iterator a() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                Iterator it = this.d;
                if (it != null) {
                    return it;
                }
                Iterator it2 = ((tlh) abstractMap).c.entrySet().iterator();
                this.d = it2;
                return it2;
            default:
                Iterator it3 = this.d;
                if (it3 != null) {
                    return it3;
                }
                Iterator it4 = ((ulh) abstractMap).b.entrySet().iterator();
                this.d = it4;
                return it4;
        }
    }

    public Iterator b() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 2:
                Iterator it = this.d;
                if (it != null) {
                    return it;
                }
                Iterator it2 = ((ncn) abstractMap).c.entrySet().iterator();
                this.d = it2;
                return it2;
            case 3:
                Iterator it3 = this.d;
                if (it3 != null) {
                    return it3;
                }
                Iterator it4 = ((bdn) abstractMap).c.entrySet().iterator();
                this.d = it4;
                return it4;
            case 4:
                Iterator it5 = this.d;
                if (it5 != null) {
                    return it5;
                }
                Iterator it6 = ((rdn) abstractMap).c.entrySet().iterator();
                this.d = it6;
                return it6;
            case 5:
                Iterator it7 = this.d;
                if (it7 != null) {
                    return it7;
                }
                Iterator it8 = ((i7o) abstractMap).c.entrySet().iterator();
                this.d = it8;
                return it8;
            case 6:
                Iterator it9 = this.d;
                if (it9 != null) {
                    return it9;
                }
                Iterator it10 = ((deo) abstractMap).c.entrySet().iterator();
                this.d = it10;
                return it10;
            case 7:
                Iterator it11 = this.d;
                if (it11 != null) {
                    return it11;
                }
                Iterator it12 = ((apo) abstractMap).c.entrySet().iterator();
                this.d = it12;
                return it12;
            case 8:
                Iterator it13 = this.d;
                if (it13 != null) {
                    return it13;
                }
                Iterator it14 = ((oqo) abstractMap).c.entrySet().iterator();
                this.d = it14;
                return it14;
            case 9:
                Iterator it15 = this.d;
                if (it15 != null) {
                    return it15;
                }
                Iterator it16 = ((k5p) abstractMap).c.entrySet().iterator();
                this.d = it16;
                return it16;
            default:
                Iterator it17 = this.d;
                if (it17 != null) {
                    return it17;
                }
                Iterator it18 = ((ggp) abstractMap).c.entrySet().iterator();
                this.d = it18;
                return it18;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                tlh tlhVar = (tlh) abstractMap;
                if (this.b + 1 >= tlhVar.b.size()) {
                    if (tlhVar.c.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
            case 1:
                ulh ulhVar = (ulh) abstractMap;
                if (this.b + 1 >= ulhVar.a.size()) {
                    if (ulhVar.b.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
            case 2:
                ncn ncnVar = (ncn) abstractMap;
                if (this.b + 1 >= ncnVar.b.size()) {
                    if (ncnVar.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            case 3:
                bdn bdnVar = (bdn) abstractMap;
                if (this.b + 1 >= bdnVar.b) {
                    if (bdnVar.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            case 4:
                rdn rdnVar = (rdn) abstractMap;
                if (this.b + 1 >= rdnVar.b) {
                    if (rdnVar.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            case 5:
                i7o i7oVar = (i7o) abstractMap;
                if (this.b + 1 >= i7oVar.b) {
                    if (i7oVar.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            case 6:
                deo deoVar = (deo) abstractMap;
                if (this.b + 1 >= deoVar.b.size()) {
                    if (deoVar.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            case 7:
                apo apoVar = (apo) abstractMap;
                if (this.b + 1 >= apoVar.b) {
                    if (apoVar.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            case 8:
                oqo oqoVar = (oqo) abstractMap;
                if (this.b + 1 >= oqoVar.b) {
                    if (oqoVar.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            case 9:
                k5p k5pVar = (k5p) abstractMap;
                if (this.b + 1 >= k5pVar.b) {
                    if (k5pVar.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            default:
                ggp ggpVar = (ggp) abstractMap;
                if (this.b + 1 >= ggpVar.b) {
                    if (ggpVar.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                tlh tlhVar = (tlh) abstractMap;
                if (i2 >= tlhVar.b.size()) {
                    break;
                } else {
                    break;
                }
            case 1:
                this.c = true;
                int i3 = this.b + 1;
                this.b = i3;
                ulh ulhVar = (ulh) abstractMap;
                if (i3 >= ulhVar.a.size()) {
                    break;
                } else {
                    break;
                }
            case 2:
                this.c = true;
                int i4 = this.b + 1;
                this.b = i4;
                ncn ncnVar = (ncn) abstractMap;
                if (i4 >= ncnVar.b.size()) {
                    break;
                } else {
                    break;
                }
            case 3:
                this.c = true;
                int i5 = this.b + 1;
                this.b = i5;
                bdn bdnVar = (bdn) abstractMap;
                if (i5 >= bdnVar.b) {
                    break;
                } else {
                    break;
                }
            case 4:
                this.c = true;
                int i6 = this.b + 1;
                this.b = i6;
                rdn rdnVar = (rdn) abstractMap;
                if (i6 >= rdnVar.b) {
                    break;
                } else {
                    break;
                }
            case 5:
                this.c = true;
                int i7 = this.b + 1;
                this.b = i7;
                i7o i7oVar = (i7o) abstractMap;
                if (i7 >= i7oVar.b) {
                    break;
                } else {
                    break;
                }
            case 6:
                this.c = true;
                int i8 = this.b + 1;
                this.b = i8;
                deo deoVar = (deo) abstractMap;
                if (i8 >= deoVar.b.size()) {
                    break;
                } else {
                    break;
                }
            case 7:
                this.c = true;
                int i9 = this.b + 1;
                this.b = i9;
                apo apoVar = (apo) abstractMap;
                if (i9 >= apoVar.b) {
                    break;
                } else {
                    break;
                }
            case 8:
                this.c = true;
                int i10 = this.b + 1;
                this.b = i10;
                oqo oqoVar = (oqo) abstractMap;
                if (i10 >= oqoVar.b) {
                    break;
                } else {
                    break;
                }
            case 9:
                this.c = true;
                int i11 = this.b + 1;
                this.b = i11;
                k5p k5pVar = (k5p) abstractMap;
                if (i11 >= k5pVar.b) {
                    break;
                } else {
                    break;
                }
            default:
                this.c = true;
                int i12 = this.b + 1;
                this.b = i12;
                ggp ggpVar = (ggp) abstractMap;
                if (i12 >= ggpVar.b) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                tlh tlhVar = (tlh) abstractMap;
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    int i2 = tlh.h;
                    tlhVar.c();
                    if (this.b >= tlhVar.b.size()) {
                        a().remove();
                        break;
                    } else {
                        int i3 = this.b;
                        this.b = i3 - 1;
                        tlhVar.h(i3);
                        break;
                    }
                }
            case 1:
                ulh ulhVar = (ulh) abstractMap;
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    int i4 = ulh.f;
                    ulhVar.c();
                    if (this.b >= ulhVar.a.size()) {
                        a().remove();
                        break;
                    } else {
                        int i5 = this.b;
                        this.b = i5 - 1;
                        ulhVar.i(i5);
                        break;
                    }
                }
            case 2:
                ncn ncnVar = (ncn) abstractMap;
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    int i6 = ncn.g;
                    ncnVar.f();
                    if (this.b >= ncnVar.b.size()) {
                        b().remove();
                        break;
                    } else {
                        int i7 = this.b;
                        this.b = i7 - 1;
                        ncnVar.d(i7);
                        break;
                    }
                }
            case 3:
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    bdn bdnVar = (bdn) abstractMap;
                    bdnVar.h();
                    int i8 = this.b;
                    if (i8 >= bdnVar.b) {
                        b().remove();
                        break;
                    } else {
                        this.b = i8 - 1;
                        bdnVar.f(i8);
                        break;
                    }
                }
            case 4:
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    rdn rdnVar = (rdn) abstractMap;
                    rdnVar.g();
                    int i9 = this.b;
                    if (i9 >= rdnVar.b) {
                        b().remove();
                        break;
                    } else {
                        this.b = i9 - 1;
                        rdnVar.e(i9);
                        break;
                    }
                }
            case 5:
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    i7o i7oVar = (i7o) abstractMap;
                    i7oVar.g();
                    int i10 = this.b;
                    if (i10 >= i7oVar.b) {
                        b().remove();
                        break;
                    } else {
                        this.b = i10 - 1;
                        i7oVar.e(i10);
                        break;
                    }
                }
            case 6:
                deo deoVar = (deo) abstractMap;
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    int i11 = deo.g;
                    deoVar.f();
                    if (this.b >= deoVar.b.size()) {
                        b().remove();
                        break;
                    } else {
                        int i12 = this.b;
                        this.b = i12 - 1;
                        deoVar.d(i12);
                        break;
                    }
                }
            case 7:
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    apo apoVar = (apo) abstractMap;
                    int i13 = apo.g;
                    apoVar.h();
                    int i14 = this.b;
                    if (i14 >= apoVar.b) {
                        b().remove();
                        break;
                    } else {
                        this.b = i14 - 1;
                        apoVar.f(i14);
                        break;
                    }
                }
            case 8:
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    oqo oqoVar = (oqo) abstractMap;
                    oqoVar.g();
                    int i15 = this.b;
                    if (i15 >= oqoVar.b) {
                        b().remove();
                        break;
                    } else {
                        this.b = i15 - 1;
                        oqoVar.e(i15);
                        break;
                    }
                }
            case 9:
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    k5p k5pVar = (k5p) abstractMap;
                    int i16 = k5p.g;
                    k5pVar.h();
                    int i17 = this.b;
                    if (i17 >= k5pVar.b) {
                        b().remove();
                        break;
                    } else {
                        this.b = i17 - 1;
                        k5pVar.f(i17);
                        break;
                    }
                }
            default:
                if (!this.c) {
                    a70.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    ggp ggpVar = (ggp) abstractMap;
                    ggpVar.g();
                    int i18 = this.b;
                    if (i18 >= ggpVar.b) {
                        b().remove();
                        break;
                    } else {
                        this.b = i18 - 1;
                        ggpVar.e(i18);
                        break;
                    }
                }
        }
    }
}
