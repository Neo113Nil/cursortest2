package com.google.android.gms.internal.ads;

import defpackage.mbb;
import defpackage.v4n;
import defpackage.yhk;
import defpackage.yoo;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzide extends AbstractMap implements Serializable {
    public static final v4n i = new v4n(20);
    public final v4n a;
    public final boolean b;
    public mbb c;
    public int d;
    public int e;
    public final mbb f;
    public yoo g;
    public yoo h;

    public zzide(boolean z) {
        this.d = 0;
        this.e = 0;
        this.a = i;
        this.b = z;
        this.f = new mbb(z, 1);
    }

    public final mbb a(Object obj, boolean z) {
        int i2;
        mbb mbbVar;
        mbb mbbVar2 = this.c;
        v4n v4nVar = i;
        v4n v4nVar2 = this.a;
        if (mbbVar2 != null) {
            Comparable comparable = v4nVar2 == v4nVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mbbVar2.b;
                i2 = comparable != null ? comparable.compareTo(obj2) : v4nVar2.compare(obj, obj2);
                if (i2 == 0) {
                    return mbbVar2;
                }
                mbb mbbVar3 = (mbb) (i2 < 0 ? mbbVar2.g : mbbVar2.h);
                if (mbbVar3 == null) {
                    break;
                }
                mbbVar2 = mbbVar3;
            }
        } else {
            i2 = 0;
        }
        int i3 = i2;
        if (!z) {
            return null;
        }
        mbb mbbVar4 = this.f;
        if (mbbVar2 != null) {
            mbb mbbVar5 = mbbVar2;
            mbbVar = new mbb(this.b, mbbVar5, obj, mbbVar4, (mbb) mbbVar4.j, (byte) 0);
            if (i3 < 0) {
                mbbVar5.g = mbbVar;
            } else {
                mbbVar5.h = mbbVar;
            }
            e(mbbVar5, true);
        } else {
            if (v4nVar2 == v4nVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mbbVar = new mbb(this.b, (mbb) null, obj, mbbVar4, (mbb) mbbVar4.j, (byte) 0);
            this.c = mbbVar;
        }
        this.d++;
        this.e++;
        return mbbVar;
    }

    public final void c(mbb mbbVar, boolean z) {
        mbb mbbVar2;
        mbb mbbVar3;
        int i2;
        if (z) {
            mbb mbbVar4 = (mbb) mbbVar.j;
            mbbVar4.i = (mbb) mbbVar.i;
            ((mbb) mbbVar.i).j = mbbVar4;
        }
        mbb mbbVar5 = (mbb) mbbVar.g;
        mbb mbbVar6 = (mbb) mbbVar.h;
        mbb mbbVar7 = (mbb) mbbVar.f;
        int i3 = 0;
        if (mbbVar5 == null || mbbVar6 == null) {
            if (mbbVar5 != null) {
                d(mbbVar, mbbVar5);
                mbbVar.g = null;
            } else if (mbbVar6 != null) {
                d(mbbVar, mbbVar6);
                mbbVar.h = null;
            } else {
                d(mbbVar, null);
            }
            e(mbbVar7, false);
            this.d--;
            this.e++;
            return;
        }
        if (mbbVar5.e > mbbVar6.e) {
            do {
                mbbVar3 = mbbVar5;
                mbbVar5 = (mbb) mbbVar5.h;
            } while (mbbVar5 != null);
        } else {
            do {
                mbbVar2 = mbbVar6;
                mbbVar6 = (mbb) mbbVar6.g;
            } while (mbbVar6 != null);
            mbbVar3 = mbbVar2;
        }
        c(mbbVar3, false);
        mbb mbbVar8 = (mbb) mbbVar.g;
        if (mbbVar8 != null) {
            i2 = mbbVar8.e;
            mbbVar3.g = mbbVar8;
            mbbVar8.f = mbbVar3;
            mbbVar.g = null;
        } else {
            i2 = 0;
        }
        mbb mbbVar9 = (mbb) mbbVar.h;
        if (mbbVar9 != null) {
            i3 = mbbVar9.e;
            mbbVar3.h = mbbVar9;
            mbbVar9.f = mbbVar3;
            mbbVar.h = null;
        }
        mbbVar3.e = Math.max(i2, i3) + 1;
        d(mbbVar, mbbVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        mbb mbbVar = this.f;
        mbbVar.j = mbbVar;
        mbbVar.i = mbbVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        mbb mbbVar = null;
        if (obj != null) {
            try {
                mbbVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return mbbVar != null;
    }

    public final void d(mbb mbbVar, mbb mbbVar2) {
        mbb mbbVar3 = (mbb) mbbVar.f;
        mbbVar.f = null;
        if (mbbVar2 != null) {
            mbbVar2.f = mbbVar3;
        }
        if (mbbVar3 == null) {
            this.c = mbbVar2;
        } else if (((mbb) mbbVar3.g) == mbbVar) {
            mbbVar3.g = mbbVar2;
        } else {
            mbbVar3.h = mbbVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r10 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(mbb mbbVar, boolean z) {
        while (mbbVar != null) {
            mbb mbbVar2 = (mbb) mbbVar.g;
            mbb mbbVar3 = (mbb) mbbVar.h;
            boolean z2 = false;
            int i2 = mbbVar2 != null ? mbbVar2.e : 0;
            int i3 = mbbVar3 != null ? mbbVar3.e : 0;
            int i4 = i2 - i3;
            boolean z3 = true;
            if (i4 == -2) {
                mbb mbbVar4 = (mbb) mbbVar3.g;
                mbb mbbVar5 = (mbb) mbbVar3.h;
                int i5 = (mbbVar4 != null ? mbbVar4.e : 0) - (mbbVar5 != null ? mbbVar5.e : 0);
                if (i5 != -1) {
                    if (i5 != 0) {
                        z3 = z;
                    }
                    g(mbbVar3);
                    f(mbbVar);
                    if (!z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                f(mbbVar);
                z3 = z2;
                if (!z3) {
                }
            } else if (i4 == 2) {
                mbb mbbVar6 = (mbb) mbbVar2.g;
                mbb mbbVar7 = (mbb) mbbVar2.h;
                int i6 = (mbbVar6 != null ? mbbVar6.e : 0) - (mbbVar7 != null ? mbbVar7.e : 0);
                if (i6 != 1) {
                    if (i6 != 0) {
                        z3 = z;
                    }
                    f(mbbVar2);
                    g(mbbVar);
                    if (!z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                g(mbbVar);
                z3 = z2;
                if (!z3) {
                }
            } else if (i4 == 0) {
                mbbVar.e = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                mbbVar.e = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            mbbVar = (mbb) mbbVar.f;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        yoo yooVar = this.g;
        if (yooVar != null) {
            return yooVar;
        }
        yoo yooVar2 = new yoo(this, 0);
        this.g = yooVar2;
        return yooVar2;
    }

    public final void f(mbb mbbVar) {
        mbb mbbVar2 = (mbb) mbbVar.g;
        mbb mbbVar3 = (mbb) mbbVar.h;
        mbb mbbVar4 = (mbb) mbbVar3.g;
        mbb mbbVar5 = (mbb) mbbVar3.h;
        mbbVar.h = mbbVar4;
        if (mbbVar4 != null) {
            mbbVar4.f = mbbVar;
        }
        d(mbbVar, mbbVar3);
        mbbVar3.g = mbbVar;
        mbbVar.f = mbbVar3;
        int max = Math.max(mbbVar2 != null ? mbbVar2.e : 0, mbbVar4 != null ? mbbVar4.e : 0) + 1;
        mbbVar.e = max;
        mbbVar3.e = Math.max(max, mbbVar5 != null ? mbbVar5.e : 0) + 1;
    }

    public final void g(mbb mbbVar) {
        mbb mbbVar2 = (mbb) mbbVar.g;
        mbb mbbVar3 = (mbb) mbbVar.h;
        mbb mbbVar4 = (mbb) mbbVar2.g;
        mbb mbbVar5 = (mbb) mbbVar2.h;
        mbbVar.g = mbbVar5;
        if (mbbVar5 != null) {
            mbbVar5.f = mbbVar;
        }
        d(mbbVar, mbbVar2);
        mbbVar2.h = mbbVar;
        mbbVar.f = mbbVar2;
        int max = Math.max(mbbVar3 != null ? mbbVar3.e : 0, mbbVar5 != null ? mbbVar5.e : 0) + 1;
        mbbVar.e = max;
        mbbVar2.e = Math.max(max, mbbVar4 != null ? mbbVar4.e : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        mbb mbbVar;
        if (obj != null) {
            try {
                mbbVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (mbbVar == null) {
                return mbbVar.d;
            }
            return null;
        }
        mbbVar = null;
        if (mbbVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        yoo yooVar = this.h;
        if (yooVar != null) {
            return yooVar;
        }
        yoo yooVar2 = new yoo(this, 1);
        this.h = yooVar2;
        return yooVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            yhk.s("key == null");
            return null;
        }
        if (obj2 == null && !this.b) {
            yhk.s("value == null");
            return null;
        }
        mbb a = a(obj, true);
        Object obj3 = a.d;
        a.d = obj2;
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
        mbb mbbVar;
        if (obj != null) {
            try {
                mbbVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (mbbVar != null) {
                c(mbbVar, true);
            }
            if (mbbVar == null) {
                return mbbVar.d;
            }
            return null;
        }
        mbbVar = null;
        if (mbbVar != null) {
        }
        if (mbbVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }

    public zzide() {
        this(true);
    }
}
