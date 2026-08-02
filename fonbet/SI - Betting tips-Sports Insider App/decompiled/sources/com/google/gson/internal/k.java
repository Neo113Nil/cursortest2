package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.coordinatorlayout.widget.i f6336i = new androidx.coordinatorlayout.widget.i(5);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6338b;

    /* renamed from: c, reason: collision with root package name */
    public j f6339c;

    /* renamed from: f, reason: collision with root package name */
    public final j f6342f;

    /* renamed from: g, reason: collision with root package name */
    public i f6343g;

    /* renamed from: h, reason: collision with root package name */
    public i f6344h;

    /* renamed from: d, reason: collision with root package name */
    public int f6340d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f6341e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f6337a = f6336i;

    public k(boolean z5) {
        this.f6338b = z5;
        this.f6342f = new j(z5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final j a(Object obj, boolean z5) {
        int i5;
        j jVar;
        j jVar2 = this.f6339c;
        androidx.coordinatorlayout.widget.i iVar = f6336i;
        Comparator comparator = this.f6337a;
        if (jVar2 != null) {
            Comparable comparable = comparator == iVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = jVar2.f6332f;
                i5 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i5 == 0) {
                    return jVar2;
                }
                j jVar3 = i5 < 0 ? jVar2.f6328b : jVar2.f6329c;
                if (jVar3 == null) {
                    break;
                }
                jVar2 = jVar3;
            }
        } else {
            i5 = 0;
        }
        j jVar4 = jVar2;
        if (!z5) {
            return null;
        }
        j jVar5 = this.f6342f;
        if (jVar4 != null) {
            jVar = new j(this.f6338b, jVar4, obj, jVar5, jVar5.f6331e);
            if (i5 < 0) {
                jVar4.f6328b = jVar;
            } else {
                jVar4.f6329c = jVar;
            }
            c(jVar4, true);
        } else {
            if (comparator == iVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            jVar = new j(this.f6338b, jVar4, obj, jVar5, jVar5.f6331e);
            this.f6339c = jVar;
        }
        this.f6340d++;
        this.f6341e++;
        return jVar;
    }

    public final void c(j jVar, boolean z5) {
        while (jVar != null) {
            j jVar2 = jVar.f6328b;
            j jVar3 = jVar.f6329c;
            int i5 = jVar2 != null ? jVar2.f6335i : 0;
            int i10 = jVar3 != null ? jVar3.f6335i : 0;
            int i11 = i5 - i10;
            if (i11 == -2) {
                j jVar4 = jVar3.f6328b;
                j jVar5 = jVar3.f6329c;
                int i12 = (jVar4 != null ? jVar4.f6335i : 0) - (jVar5 != null ? jVar5.f6335i : 0);
                if (i12 == -1 || (i12 == 0 && !z5)) {
                    f(jVar);
                } else {
                    g(jVar3);
                    f(jVar);
                }
                if (z5) {
                    return;
                }
            } else if (i11 == 2) {
                j jVar6 = jVar2.f6328b;
                j jVar7 = jVar2.f6329c;
                int i13 = (jVar6 != null ? jVar6.f6335i : 0) - (jVar7 != null ? jVar7.f6335i : 0);
                if (i13 == 1 || (i13 == 0 && !z5)) {
                    g(jVar);
                } else {
                    f(jVar2);
                    g(jVar);
                }
                if (z5) {
                    return;
                }
            } else if (i11 == 0) {
                jVar.f6335i = i5 + 1;
                if (z5) {
                    return;
                }
            } else {
                jVar.f6335i = Math.max(i5, i10) + 1;
                if (!z5) {
                    return;
                }
            }
            jVar = jVar.f6327a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f6339c = null;
        this.f6340d = 0;
        this.f6341e++;
        j jVar = this.f6342f;
        jVar.f6331e = jVar;
        jVar.f6330d = jVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        j jVar = null;
        if (obj != null) {
            try {
                jVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return jVar != null;
    }

    public final void d(j jVar, boolean z5) {
        j jVar2;
        j jVar3;
        int i5;
        if (z5) {
            j jVar4 = jVar.f6331e;
            jVar4.f6330d = jVar.f6330d;
            jVar.f6330d.f6331e = jVar4;
        }
        j jVar5 = jVar.f6328b;
        j jVar6 = jVar.f6329c;
        j jVar7 = jVar.f6327a;
        int i10 = 0;
        if (jVar5 == null || jVar6 == null) {
            if (jVar5 != null) {
                e(jVar, jVar5);
                jVar.f6328b = null;
            } else if (jVar6 != null) {
                e(jVar, jVar6);
                jVar.f6329c = null;
            } else {
                e(jVar, null);
            }
            c(jVar7, false);
            this.f6340d--;
            this.f6341e++;
            return;
        }
        if (jVar5.f6335i > jVar6.f6335i) {
            j jVar8 = jVar5.f6329c;
            while (true) {
                j jVar9 = jVar8;
                jVar3 = jVar5;
                jVar5 = jVar9;
                if (jVar5 == null) {
                    break;
                } else {
                    jVar8 = jVar5.f6329c;
                }
            }
        } else {
            j jVar10 = jVar6.f6328b;
            while (true) {
                jVar2 = jVar6;
                jVar6 = jVar10;
                if (jVar6 == null) {
                    break;
                } else {
                    jVar10 = jVar6.f6328b;
                }
            }
            jVar3 = jVar2;
        }
        d(jVar3, false);
        j jVar11 = jVar.f6328b;
        if (jVar11 != null) {
            i5 = jVar11.f6335i;
            jVar3.f6328b = jVar11;
            jVar11.f6327a = jVar3;
            jVar.f6328b = null;
        } else {
            i5 = 0;
        }
        j jVar12 = jVar.f6329c;
        if (jVar12 != null) {
            i10 = jVar12.f6335i;
            jVar3.f6329c = jVar12;
            jVar12.f6327a = jVar3;
            jVar.f6329c = null;
        }
        jVar3.f6335i = Math.max(i5, i10) + 1;
        e(jVar, jVar3);
    }

    public final void e(j jVar, j jVar2) {
        j jVar3 = jVar.f6327a;
        jVar.f6327a = null;
        if (jVar2 != null) {
            jVar2.f6327a = jVar3;
        }
        if (jVar3 == null) {
            this.f6339c = jVar2;
        } else if (jVar3.f6328b == jVar) {
            jVar3.f6328b = jVar2;
        } else {
            jVar3.f6329c = jVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        i iVar = this.f6343g;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, 0);
        this.f6343g = iVar2;
        return iVar2;
    }

    public final void f(j jVar) {
        j jVar2 = jVar.f6328b;
        j jVar3 = jVar.f6329c;
        j jVar4 = jVar3.f6328b;
        j jVar5 = jVar3.f6329c;
        jVar.f6329c = jVar4;
        if (jVar4 != null) {
            jVar4.f6327a = jVar;
        }
        e(jVar, jVar3);
        jVar3.f6328b = jVar;
        jVar.f6327a = jVar3;
        int max = Math.max(jVar2 != null ? jVar2.f6335i : 0, jVar4 != null ? jVar4.f6335i : 0) + 1;
        jVar.f6335i = max;
        jVar3.f6335i = Math.max(max, jVar5 != null ? jVar5.f6335i : 0) + 1;
    }

    public final void g(j jVar) {
        j jVar2 = jVar.f6328b;
        j jVar3 = jVar.f6329c;
        j jVar4 = jVar2.f6328b;
        j jVar5 = jVar2.f6329c;
        jVar.f6328b = jVar5;
        if (jVar5 != null) {
            jVar5.f6327a = jVar;
        }
        e(jVar, jVar2);
        jVar2.f6329c = jVar;
        jVar.f6327a = jVar2;
        int max = Math.max(jVar3 != null ? jVar3.f6335i : 0, jVar5 != null ? jVar5.f6335i : 0) + 1;
        jVar.f6335i = max;
        jVar2.f6335i = Math.max(max, jVar4 != null ? jVar4.f6335i : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        j jVar;
        if (obj != null) {
            try {
                jVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (jVar == null) {
                return jVar.f6334h;
            }
            return null;
        }
        jVar = null;
        if (jVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        i iVar = this.f6344h;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, 1);
        this.f6344h = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f6338b) {
            throw new NullPointerException("value == null");
        }
        j a7 = a(obj, true);
        Object obj3 = a7.f6334h;
        a7.f6334h = obj2;
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
        j jVar;
        if (obj != null) {
            try {
                jVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (jVar != null) {
                d(jVar, true);
            }
            if (jVar == null) {
                return jVar.f6334h;
            }
            return null;
        }
        jVar = null;
        if (jVar != null) {
        }
        if (jVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6340d;
    }
}
