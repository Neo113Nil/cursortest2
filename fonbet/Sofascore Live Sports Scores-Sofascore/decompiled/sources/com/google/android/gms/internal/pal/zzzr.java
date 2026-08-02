package com.google.android.gms.internal.pal;

import defpackage.mfp;
import defpackage.v4n;
import defpackage.xfp;
import defpackage.yhk;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzzr extends AbstractMap implements Serializable {
    public static final v4n h = new v4n(25);
    public xfp b;
    public mfp f;
    public mfp g;
    public int c = 0;
    public int d = 0;
    public final xfp e = new xfp();
    public final v4n a = h;

    public final xfp a(Object obj, boolean z) {
        int i;
        xfp xfpVar;
        xfp xfpVar2 = this.b;
        v4n v4nVar = h;
        v4n v4nVar2 = this.a;
        if (xfpVar2 != null) {
            Comparable comparable = v4nVar2 == v4nVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = xfpVar2.f;
                i = comparable != null ? comparable.compareTo(obj2) : v4nVar2.compare(obj, obj2);
                if (i == 0) {
                    return xfpVar2;
                }
                xfp xfpVar3 = i < 0 ? xfpVar2.b : xfpVar2.c;
                if (xfpVar3 == null) {
                    break;
                }
                xfpVar2 = xfpVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        xfp xfpVar4 = this.e;
        if (xfpVar2 != null) {
            xfp xfpVar5 = new xfp(xfpVar2, obj, xfpVar4, xfpVar4.e);
            if (i < 0) {
                xfpVar2.b = xfpVar5;
            } else {
                xfpVar2.c = xfpVar5;
            }
            d(xfpVar2, true);
            xfpVar = xfpVar5;
        } else {
            if (v4nVar2 == v4nVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            xfpVar = new xfp(null, obj, xfpVar4, xfpVar4.e);
            this.b = xfpVar;
        }
        this.c++;
        this.d++;
        return xfpVar;
    }

    public final void c(xfp xfpVar, boolean z) {
        xfp xfpVar2;
        xfp xfpVar3;
        int i;
        if (z) {
            xfp xfpVar4 = xfpVar.e;
            xfpVar4.d = xfpVar.d;
            xfpVar.d.e = xfpVar4;
        }
        xfp xfpVar5 = xfpVar.b;
        xfp xfpVar6 = xfpVar.c;
        xfp xfpVar7 = xfpVar.a;
        int i2 = 0;
        if (xfpVar5 == null || xfpVar6 == null) {
            if (xfpVar5 != null) {
                e(xfpVar, xfpVar5);
                xfpVar.b = null;
            } else if (xfpVar6 != null) {
                e(xfpVar, xfpVar6);
                xfpVar.c = null;
            } else {
                e(xfpVar, null);
            }
            d(xfpVar7, false);
            this.c--;
            this.d++;
            return;
        }
        if (xfpVar5.h > xfpVar6.h) {
            do {
                xfpVar3 = xfpVar5;
                xfpVar5 = xfpVar5.c;
            } while (xfpVar5 != null);
        } else {
            do {
                xfpVar2 = xfpVar6;
                xfpVar6 = xfpVar6.b;
            } while (xfpVar6 != null);
            xfpVar3 = xfpVar2;
        }
        c(xfpVar3, false);
        xfp xfpVar8 = xfpVar.b;
        if (xfpVar8 != null) {
            i = xfpVar8.h;
            xfpVar3.b = xfpVar8;
            xfpVar8.a = xfpVar3;
            xfpVar.b = null;
        } else {
            i = 0;
        }
        xfp xfpVar9 = xfpVar.c;
        if (xfpVar9 != null) {
            i2 = xfpVar9.h;
            xfpVar3.c = xfpVar9;
            xfpVar9.a = xfpVar3;
            xfpVar.c = null;
        }
        xfpVar3.h = Math.max(i, i2) + 1;
        e(xfpVar, xfpVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        xfp xfpVar = this.e;
        xfpVar.e = xfpVar;
        xfpVar.d = xfpVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        xfp xfpVar = null;
        if (obj != null) {
            try {
                xfpVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return xfpVar != null;
    }

    public final void d(xfp xfpVar, boolean z) {
        while (xfpVar != null) {
            xfp xfpVar2 = xfpVar.b;
            xfp xfpVar3 = xfpVar.c;
            int i = xfpVar2 != null ? xfpVar2.h : 0;
            int i2 = xfpVar3 != null ? xfpVar3.h : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                xfp xfpVar4 = xfpVar3.b;
                xfp xfpVar5 = xfpVar3.c;
                int i4 = (xfpVar4 != null ? xfpVar4.h : 0) - (xfpVar5 != null ? xfpVar5.h : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    f(xfpVar);
                } else {
                    g(xfpVar3);
                    f(xfpVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                xfp xfpVar6 = xfpVar2.b;
                xfp xfpVar7 = xfpVar2.c;
                int i5 = (xfpVar6 != null ? xfpVar6.h : 0) - (xfpVar7 != null ? xfpVar7.h : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    g(xfpVar);
                } else {
                    f(xfpVar2);
                    g(xfpVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                xfpVar.h = i + 1;
                if (z) {
                    return;
                }
            } else {
                xfpVar.h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            xfpVar = xfpVar.a;
        }
    }

    public final void e(xfp xfpVar, xfp xfpVar2) {
        xfp xfpVar3 = xfpVar.a;
        xfpVar.a = null;
        if (xfpVar2 != null) {
            xfpVar2.a = xfpVar3;
        }
        if (xfpVar3 == null) {
            this.b = xfpVar2;
        } else if (xfpVar3.b == xfpVar) {
            xfpVar3.b = xfpVar2;
        } else {
            xfpVar3.c = xfpVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        mfp mfpVar = this.f;
        if (mfpVar != null) {
            return mfpVar;
        }
        mfp mfpVar2 = new mfp(this, 0);
        this.f = mfpVar2;
        return mfpVar2;
    }

    public final void f(xfp xfpVar) {
        xfp xfpVar2 = xfpVar.b;
        xfp xfpVar3 = xfpVar.c;
        xfp xfpVar4 = xfpVar3.b;
        xfp xfpVar5 = xfpVar3.c;
        xfpVar.c = xfpVar4;
        if (xfpVar4 != null) {
            xfpVar4.a = xfpVar;
        }
        e(xfpVar, xfpVar3);
        xfpVar3.b = xfpVar;
        xfpVar.a = xfpVar3;
        int max = Math.max(xfpVar2 != null ? xfpVar2.h : 0, xfpVar4 != null ? xfpVar4.h : 0) + 1;
        xfpVar.h = max;
        xfpVar3.h = Math.max(max, xfpVar5 != null ? xfpVar5.h : 0) + 1;
    }

    public final void g(xfp xfpVar) {
        xfp xfpVar2 = xfpVar.b;
        xfp xfpVar3 = xfpVar.c;
        xfp xfpVar4 = xfpVar2.b;
        xfp xfpVar5 = xfpVar2.c;
        xfpVar.b = xfpVar5;
        if (xfpVar5 != null) {
            xfpVar5.a = xfpVar;
        }
        e(xfpVar, xfpVar2);
        xfpVar2.c = xfpVar;
        xfpVar.a = xfpVar2;
        int max = Math.max(xfpVar3 != null ? xfpVar3.h : 0, xfpVar5 != null ? xfpVar5.h : 0) + 1;
        xfpVar.h = max;
        xfpVar2.h = Math.max(max, xfpVar4 != null ? xfpVar4.h : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        xfp xfpVar;
        if (obj != null) {
            try {
                xfpVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (xfpVar == null) {
                return xfpVar.g;
            }
            return null;
        }
        xfpVar = null;
        if (xfpVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        mfp mfpVar = this.g;
        if (mfpVar != null) {
            return mfpVar;
        }
        mfp mfpVar2 = new mfp(this, 1);
        this.g = mfpVar2;
        return mfpVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            yhk.s("key == null");
            return null;
        }
        xfp a = a(obj, true);
        Object obj3 = a.g;
        a.g = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        xfp xfpVar;
        if (obj != null) {
            try {
                xfpVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (xfpVar != null) {
                c(xfpVar, true);
            }
            if (xfpVar == null) {
                return xfpVar.g;
            }
            return null;
        }
        xfpVar = null;
        if (xfpVar != null) {
        }
        if (xfpVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }
}
