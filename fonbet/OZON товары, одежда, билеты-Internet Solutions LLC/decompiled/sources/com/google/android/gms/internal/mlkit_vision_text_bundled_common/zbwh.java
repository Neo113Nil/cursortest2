package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes9.dex */
class zbwh extends AbstractMap {
    private Object[] zba;
    private int zbb;
    private Map zbc;
    private boolean zbd;
    private volatile zbwf zbe;
    private Map zbf;

    private zbwh() {
        Map map = Collections.EMPTY_MAP;
        this.zbc = map;
        this.zbf = map;
    }

    private final int zbl(Comparable comparable) {
        int i11 = this.zbb;
        int i12 = i11 - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int compareTo = comparable.compareTo(((zbwb) this.zba[i12]).zba());
            if (compareTo > 0) {
                return -(i11 + 1);
            }
            if (compareTo == 0) {
                return i12;
            }
        }
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int compareTo2 = comparable.compareTo(((zbwb) this.zba[i14]).zba());
            if (compareTo2 < 0) {
                i12 = i14 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i14;
                }
                i13 = i14 + 1;
            }
        }
        return -(i13 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zbm(int i11) {
        zbo();
        Object value = ((zbwb) this.zba[i11]).getValue();
        Object[] objArr = this.zba;
        System.arraycopy(objArr, i11 + 1, objArr, i11, (this.zbb - i11) - 1);
        this.zbb--;
        if (!this.zbc.isEmpty()) {
            Iterator it = zbn().entrySet().iterator();
            Object[] objArr2 = this.zba;
            int i12 = this.zbb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i12] = new zbwb(this, (Comparable) entry.getKey(), entry.getValue());
            this.zbb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zbn() {
        zbo();
        if (this.zbc.isEmpty() && !(this.zbc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zbc = treeMap;
            this.zbf = treeMap.descendingMap();
        }
        return (SortedMap) this.zbc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zbo() {
        if (this.zbd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zbo();
        if (this.zbb != 0) {
            this.zba = null;
            this.zbb = 0;
        }
        if (this.zbc.isEmpty()) {
            return;
        }
        this.zbc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zbl(comparable) >= 0 || this.zbc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zbe == null) {
            this.zbe = new zbwf(this, null);
        }
        return this.zbe;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbwh)) {
            return super.equals(obj);
        }
        zbwh zbwhVar = (zbwh) obj;
        int size = size();
        if (size != zbwhVar.size()) {
            return false;
        }
        int i11 = this.zbb;
        if (i11 != zbwhVar.zbb) {
            return entrySet().equals(zbwhVar.entrySet());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!zbg(i12).equals(zbwhVar.zbg(i12))) {
                return false;
            }
        }
        if (i11 != size) {
            return this.zbc.equals(zbwhVar.zbc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zbl = zbl(comparable);
        return zbl >= 0 ? ((zbwb) this.zba[zbl]).getValue() : this.zbc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i11 = this.zbb;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += this.zba[i13].hashCode();
        }
        return this.zbc.size() > 0 ? this.zbc.hashCode() + i12 : i12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zbo();
        Comparable comparable = (Comparable) obj;
        int zbl = zbl(comparable);
        if (zbl >= 0) {
            return zbm(zbl);
        }
        if (this.zbc.isEmpty()) {
            return null;
        }
        return this.zbc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zbc.size() + this.zbb;
    }

    public void zba() {
        if (this.zbd) {
            return;
        }
        this.zbc = this.zbc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zbc);
        this.zbf = this.zbf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zbf);
        this.zbd = true;
    }

    public final int zbc() {
        return this.zbb;
    }

    public final Iterable zbd() {
        return this.zbc.isEmpty() ? Collections.EMPTY_SET : this.zbc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zbf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zbo();
        int zbl = zbl(comparable);
        if (zbl >= 0) {
            return ((zbwb) this.zba[zbl]).setValue(obj);
        }
        zbo();
        if (this.zba == null) {
            this.zba = new Object[16];
        }
        int i11 = -(zbl + 1);
        if (i11 >= 16) {
            return zbn().put(comparable, obj);
        }
        if (this.zbb == 16) {
            zbwb zbwbVar = (zbwb) this.zba[15];
            this.zbb = 15;
            zbn().put(zbwbVar.zba(), zbwbVar.getValue());
        }
        Object[] objArr = this.zba;
        int length = objArr.length;
        System.arraycopy(objArr, i11, objArr, i11 + 1, 15 - i11);
        this.zba[i11] = new zbwb(this, comparable, obj);
        this.zbb++;
        return null;
    }

    public final Map.Entry zbg(int i11) {
        if (i11 < this.zbb) {
            return (zbwb) this.zba[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11);
    }

    public final boolean zbj() {
        return this.zbd;
    }

    /* synthetic */ zbwh(zbwg zbwgVar) {
        Map map = Collections.EMPTY_MAP;
        this.zbc = map;
        this.zbf = map;
    }
}
