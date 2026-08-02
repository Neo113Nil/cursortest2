package com.google.android.gms.internal.cast;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;
import defpackage.a70;
import defpackage.b6a;
import defpackage.epo;
import defpackage.fqo;
import defpackage.me4;
import defpackage.spo;
import defpackage.wno;
import defpackage.wt3;
import defpackage.xpo;
import defpackage.yhk;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzhy implements Map, Serializable {
    public transient zzhz a;
    public transient zzhz b;
    public transient zzhr c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0235  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Set set) {
        int i;
        boolean z;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        int i2;
        boolean z2;
        ?? r16;
        boolean z3;
        boolean z4;
        int size;
        Object[] objArr;
        int length;
        int size2;
        boolean z5 = set instanceof Collection;
        zzhx zzhxVar = new zzhx(z5 ? set.size() : 4);
        if (z5 && (size2 = (size = set.size()) + size) > (length = (objArr = zzhxVar.a).length)) {
            zzhxVar.a = Arrays.copyOf(objArr, zzhq.a(length, size2));
        }
        Iterator it = set.iterator();
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                wno wnoVar = zzhxVar.c;
                if (wnoVar != null) {
                    throw wnoVar.a();
                }
                int i4 = zzhxVar.b;
                Object[] objArr2 = zzhxVar.a;
                if (i4 == 0) {
                    fqo fqoVar = fqo.g;
                } else {
                    fqo fqoVar2 = fqo.g;
                    Object obj2 = null;
                    boolean z6 = false;
                    if (i4 == 1) {
                        Objects.requireNonNull(objArr2[0]);
                        Objects.requireNonNull(objArr2[1]);
                        new fqo(1, null, objArr2);
                    } else {
                        zzhd.b(i4, objArr2.length >> 1);
                        int r = zzhz.r(i4);
                        char c3 = 2;
                        if (i4 == 1) {
                            Objects.requireNonNull(objArr2[0]);
                            Objects.requireNonNull(objArr2[1]);
                            i = 1;
                            i4 = 1;
                            z4 = false;
                        } else {
                            int i5 = r - 1;
                            if (r <= 128) {
                                byte[] bArr = new byte[r];
                                Arrays.fill(bArr, (byte) -1);
                                int i6 = 0;
                                int i7 = 0;
                                while (i6 < i4) {
                                    int i8 = i7 + i7;
                                    int i9 = i6 + i6;
                                    Object obj3 = objArr2[i9];
                                    Objects.requireNonNull(obj3);
                                    Object obj4 = objArr2[i9 ^ i3];
                                    Objects.requireNonNull(obj4);
                                    int F = b6a.F(obj3.hashCode());
                                    while (true) {
                                        int i10 = F & i5;
                                        i2 = i3;
                                        z2 = z6;
                                        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                        if (i11 == 255) {
                                            bArr[i10] = (byte) i8;
                                            if (i7 < i6) {
                                                objArr2[i8] = obj3;
                                                objArr2[i8 ^ 1] = obj4;
                                            }
                                            i7++;
                                        } else {
                                            if (obj3.equals(objArr2[i11])) {
                                                int i12 = i11 ^ 1;
                                                Object obj5 = objArr2[i12];
                                                Objects.requireNonNull(obj5);
                                                obj2 = new wno(obj3, obj4, obj5);
                                                objArr2[i12] = obj4;
                                                break;
                                            }
                                            F = i10 + 1;
                                            i3 = i2;
                                            z6 = z2;
                                        }
                                    }
                                    i6++;
                                    i3 = i2;
                                    z6 = z2;
                                }
                                i = i3;
                                z = z6;
                                if (i7 == i4) {
                                    obj2 = bArr;
                                    z4 = z;
                                } else {
                                    sArr = new Object[3];
                                    sArr[z ? 1 : 0] = bArr;
                                    sArr[i] = Integer.valueOf(i7);
                                    sArr[2] = obj2;
                                    obj2 = sArr;
                                    z4 = z;
                                }
                            } else {
                                i = 1;
                                z = false;
                                if (r <= 32768) {
                                    sArr = new short[r];
                                    Arrays.fill(sArr, (short) -1);
                                    int i13 = 0;
                                    for (int i14 = 0; i14 < i4; i14++) {
                                        int i15 = i13 + i13;
                                        int i16 = i14 + i14;
                                        Object obj6 = objArr2[i16];
                                        Objects.requireNonNull(obj6);
                                        Object obj7 = objArr2[i16 ^ 1];
                                        Objects.requireNonNull(obj7);
                                        int F2 = b6a.F(obj6.hashCode());
                                        while (true) {
                                            int i17 = F2 & i5;
                                            char c4 = (char) sArr[i17];
                                            if (c4 == 65535) {
                                                sArr[i17] = (short) i15;
                                                if (i13 < i14) {
                                                    objArr2[i15] = obj6;
                                                    objArr2[i15 ^ 1] = obj7;
                                                }
                                                i13++;
                                            } else {
                                                if (obj6.equals(objArr2[c4])) {
                                                    int i18 = c4 ^ 1;
                                                    Object obj8 = objArr2[i18];
                                                    Objects.requireNonNull(obj8);
                                                    wno wnoVar2 = new wno(obj6, obj7, obj8);
                                                    objArr2[i18] = obj7;
                                                    obj2 = wnoVar2;
                                                    break;
                                                }
                                                F2 = i17 + 1;
                                            }
                                        }
                                    }
                                    if (i13 != i4) {
                                        obj2 = new Object[]{sArr, Integer.valueOf(i13), obj2};
                                        z4 = z;
                                    }
                                    obj2 = sArr;
                                    z4 = z;
                                } else {
                                    int[] iArr = new int[r];
                                    Arrays.fill(iArr, -1);
                                    int i19 = 0;
                                    int i20 = 0;
                                    while (i19 < i4) {
                                        int i21 = i20 + i20;
                                        int i22 = i19 + i19;
                                        Object obj9 = objArr2[i22];
                                        Objects.requireNonNull(obj9);
                                        Object obj10 = objArr2[i22 ^ 1];
                                        Objects.requireNonNull(obj10);
                                        int F3 = b6a.F(obj9.hashCode());
                                        while (true) {
                                            int i23 = F3 & i5;
                                            int i24 = iArr[i23];
                                            if (i24 == -1) {
                                                iArr[i23] = i21;
                                                if (i20 < i19) {
                                                    objArr2[i21] = obj9;
                                                    objArr2[i21 ^ 1] = obj10;
                                                }
                                                i20++;
                                                c2 = c3;
                                            } else {
                                                c2 = c3;
                                                if (obj9.equals(objArr2[i24])) {
                                                    int i25 = i24 ^ 1;
                                                    Object obj11 = objArr2[i25];
                                                    Objects.requireNonNull(obj11);
                                                    wno wnoVar3 = new wno(obj9, obj10, obj11);
                                                    objArr2[i25] = obj10;
                                                    obj2 = wnoVar3;
                                                    break;
                                                }
                                                F3 = i23 + 1;
                                                c3 = c2;
                                            }
                                        }
                                        i19++;
                                        c3 = c2;
                                    }
                                    c = c3;
                                    if (i20 == i4) {
                                        obj = iArr;
                                        r16 = z;
                                    } else {
                                        Object[] objArr3 = new Object[3];
                                        objArr3[0] = iArr;
                                        objArr3[1] = Integer.valueOf(i20);
                                        objArr3[c] = obj2;
                                        obj = objArr3;
                                        r16 = z;
                                    }
                                    z3 = obj instanceof Object[];
                                    Object obj12 = obj;
                                    if (z3) {
                                        Object[] objArr4 = (Object[]) obj;
                                        zzhxVar.c = (wno) objArr4[c];
                                        Object obj13 = objArr4[r16];
                                        int intValue = ((Integer) objArr4[i]).intValue();
                                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                                        obj12 = obj13;
                                        i4 = intValue;
                                    }
                                    new fqo(i4, obj12, objArr2);
                                }
                            }
                        }
                        c = 2;
                        obj = obj2;
                        r16 = z4;
                        z3 = obj instanceof Object[];
                        Object obj122 = obj;
                        if (z3) {
                        }
                        new fqo(i4, obj122, objArr2);
                    }
                }
                wno wnoVar4 = zzhxVar.c;
                if (wnoVar4 != null) {
                    throw wnoVar4.a();
                }
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i26 = zzhxVar.b + 1;
            Object[] objArr5 = zzhxVar.a;
            int length2 = objArr5.length;
            int i27 = i26 + i26;
            if (i27 > length2) {
                objArr5 = Arrays.copyOf(objArr5, zzhq.a(length2, i27));
                zzhxVar.a = objArr5;
            }
            if (key == null) {
                yhk.s("null key in entry: null=".concat(String.valueOf(value)));
                return;
            }
            if (value == null) {
                String obj14 = key.toString();
                yhk.s(wt3.m("null value in entry: ", obj14, new StringBuilder(obj14.length() + 26), "=null"));
                return;
            } else {
                int i28 = zzhxVar.b;
                int i29 = i28 + i28;
                objArr5[i29] = key;
                objArr5[i29 + 1] = value;
                zzhxVar.b = i28 + 1;
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zzhr zzhrVar = this.c;
        if (zzhrVar == null) {
            zzhrVar = h();
            this.c = zzhrVar;
        }
        return zzhrVar.contains(obj);
    }

    public abstract epo d();

    @Override // java.util.Map
    public final Set entrySet() {
        zzhz zzhzVar = this.a;
        if (zzhzVar != null) {
            return zzhzVar;
        }
        epo d = d();
        this.a = d;
        return d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract spo g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract xpo h();

    @Override // java.util.Map
    public final int hashCode() {
        zzhz zzhzVar = this.a;
        if (zzhzVar == null) {
            zzhzVar = d();
            this.a = zzhzVar;
        }
        Iterator it = zzhzVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzhz zzhzVar = this.b;
        if (zzhzVar != null) {
            return zzhzVar;
        }
        spo g = g();
        this.b = g;
        return g;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            a70.p(me4.g(size, "size cannot be negative but was: ", new StringBuilder(String.valueOf(size).length() + 33)));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(C4427z5.U);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zzhr zzhrVar = this.c;
        if (zzhrVar != null) {
            return zzhrVar;
        }
        xpo h = h();
        this.c = h;
        return h;
    }
}
