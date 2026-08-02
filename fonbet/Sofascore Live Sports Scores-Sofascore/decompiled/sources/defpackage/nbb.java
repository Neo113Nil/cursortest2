package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nbb extends AbstractMap implements Serializable {
    public static final se7 i = new se7(29);
    public final boolean b;
    public mbb c;
    public final mbb f;
    public kbb g;
    public kbb h;
    public int d = 0;
    public int e = 0;
    public final Comparator a = i;

    public nbb(boolean z) {
        this.b = z;
        this.f = new mbb(z, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final mbb a(Object obj, boolean z) {
        int i2;
        mbb mbbVar;
        mbb mbbVar2 = this.c;
        se7 se7Var = i;
        Comparator comparator = this.a;
        if (mbbVar2 != null) {
            Comparable comparable = comparator == se7Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mbbVar2.b;
                i2 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
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
        mbb mbbVar4 = mbbVar2;
        if (!z) {
            return null;
        }
        mbb mbbVar5 = this.f;
        if (mbbVar4 != null) {
            mbbVar = new mbb(this.b, mbbVar4, obj, mbbVar5, (mbb) mbbVar5.j);
            if (i2 < 0) {
                mbbVar4.g = mbbVar;
            } else {
                mbbVar4.h = mbbVar;
            }
            c(mbbVar4, true);
        } else {
            if (comparator == se7Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mbbVar = new mbb(this.b, mbbVar4, obj, mbbVar5, (mbb) mbbVar5.j);
            this.c = mbbVar;
        }
        this.d++;
        this.e++;
        return mbbVar;
    }

    public final void c(mbb mbbVar, boolean z) {
        while (mbbVar != null) {
            mbb mbbVar2 = (mbb) mbbVar.g;
            mbb mbbVar3 = (mbb) mbbVar.h;
            int i2 = mbbVar2 != null ? mbbVar2.e : 0;
            int i3 = mbbVar3 != null ? mbbVar3.e : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                mbb mbbVar4 = (mbb) mbbVar3.g;
                mbb mbbVar5 = (mbb) mbbVar3.h;
                int i5 = (mbbVar4 != null ? mbbVar4.e : 0) - (mbbVar5 != null ? mbbVar5.e : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    f(mbbVar);
                } else {
                    g(mbbVar3);
                    f(mbbVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                mbb mbbVar6 = (mbb) mbbVar2.g;
                mbb mbbVar7 = (mbb) mbbVar2.h;
                int i6 = (mbbVar6 != null ? mbbVar6.e : 0) - (mbbVar7 != null ? mbbVar7.e : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    g(mbbVar);
                } else {
                    f(mbbVar2);
                    g(mbbVar);
                }
                if (z) {
                    return;
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

    public final void d(mbb mbbVar, boolean z) {
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
                e(mbbVar, mbbVar5);
                mbbVar.g = null;
            } else if (mbbVar6 != null) {
                e(mbbVar, mbbVar6);
                mbbVar.h = null;
            } else {
                e(mbbVar, null);
            }
            c(mbbVar7, false);
            this.d--;
            this.e++;
            return;
        }
        if (mbbVar5.e > mbbVar6.e) {
            Map.Entry entry = mbbVar5.h;
            while (true) {
                mbb mbbVar8 = (mbb) entry;
                mbbVar3 = mbbVar5;
                mbbVar5 = mbbVar8;
                if (mbbVar5 == null) {
                    break;
                } else {
                    entry = mbbVar5.h;
                }
            }
        } else {
            Map.Entry entry2 = mbbVar6.g;
            while (true) {
                mbbVar2 = mbbVar6;
                mbbVar6 = (mbb) entry2;
                if (mbbVar6 == null) {
                    break;
                } else {
                    entry2 = mbbVar6.g;
                }
            }
            mbbVar3 = mbbVar2;
        }
        d(mbbVar3, false);
        mbb mbbVar9 = (mbb) mbbVar.g;
        if (mbbVar9 != null) {
            i2 = mbbVar9.e;
            mbbVar3.g = mbbVar9;
            mbbVar9.f = mbbVar3;
            mbbVar.g = null;
        } else {
            i2 = 0;
        }
        mbb mbbVar10 = (mbb) mbbVar.h;
        if (mbbVar10 != null) {
            i3 = mbbVar10.e;
            mbbVar3.h = mbbVar10;
            mbbVar10.f = mbbVar3;
            mbbVar.h = null;
        }
        mbbVar3.e = Math.max(i2, i3) + 1;
        e(mbbVar, mbbVar3);
    }

    public final void e(mbb mbbVar, mbb mbbVar2) {
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

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        kbb kbbVar = this.g;
        if (kbbVar != null) {
            return kbbVar;
        }
        kbb kbbVar2 = new kbb(this, 0);
        this.g = kbbVar2;
        return kbbVar2;
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
        e(mbbVar, mbbVar3);
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
        e(mbbVar, mbbVar2);
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
        kbb kbbVar = this.h;
        if (kbbVar != null) {
            return kbbVar;
        }
        kbb kbbVar2 = new kbb(this, 1);
        this.h = kbbVar2;
        return kbbVar2;
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
                d(mbbVar, true);
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
}
