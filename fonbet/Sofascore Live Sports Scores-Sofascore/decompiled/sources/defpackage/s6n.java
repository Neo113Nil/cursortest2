package defpackage;

import com.google.android.gms.internal.measurement.zzabe;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class s6n extends AbstractMap {
    public static final v4n g = new v4n(7);
    public static final v4n h = new v4n(17);
    public static final v4n i = new v4n(22);
    public final /* synthetic */ int a;
    public final Object[] b;
    public final int[] c;
    public Integer d;
    public String e;
    public final AbstractSet f;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x016f, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, s6n] */
    /* JADX WARN: Type inference failed for: r0v1, types: [s6n] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s6n(s6n s6nVar, s6n s6nVar2) {
        int i2;
        Object obj;
        Object[] objArr;
        int i3 = 0;
        r0.a = 0;
        ?? abstractMap = new AbstractMap();
        abstractMap.f = new p6n(abstractMap, -1);
        abstractMap.d = null;
        abstractMap.e = null;
        int size = s6nVar2.size() + s6nVar.size();
        int i4 = s6nVar.c[s6nVar.size()] + s6nVar2.c[s6nVar2.size()];
        int i5 = size + 1;
        Object[] objArr2 = new Object[i4];
        int[] iArr = new int[i5];
        iArr[0] = size;
        Map.Entry d = s6nVar.d(0);
        Map.Entry d2 = s6nVar2.d(0);
        int i6 = 0;
        int i7 = 0;
        int i8 = size;
        int i9 = 0;
        while (true) {
            if (d == null && d2 == null) {
                break;
            }
            int i10 = i9 + 1;
            if (d != null) {
                if (d2 != null) {
                    int compareTo = ((String) d.getKey()).compareTo((String) d2.getKey());
                    if (compareTo == 0) {
                        int i11 = i6 + 1;
                        int i12 = i7 + 1;
                        objArr2[i9] = new AbstractMap.SimpleImmutableEntry((String) d.getKey(), new p6n(abstractMap, i9));
                        p6n p6nVar = (p6n) d.getValue();
                        p6n p6nVar2 = (p6n) d2.getValue();
                        int i13 = 0;
                        int i14 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int d3 = p6nVar.d();
                            s6n s6nVar3 = p6nVar.b;
                            if (i13 >= d3 - p6nVar.c() && i14 >= p6nVar2.d() - p6nVar2.c()) {
                                break;
                            }
                            int i15 = i13 == p6nVar.d() - p6nVar.c() ? 1 : i14 == p6nVar2.d() - p6nVar2.c() ? -1 : 0;
                            if (i15 == 0) {
                                v4n v4nVar = zzabe.b;
                                i2 = i13;
                                i15 = zzabe.b.compare(s6nVar3.b[p6nVar.c() + i13], p6nVar2.b.b[p6nVar2.c() + i14]);
                            } else {
                                i2 = i13;
                            }
                            if (i15 < 0) {
                                i13 = i2 + 1;
                                obj = s6nVar3.b[p6nVar.c() + i2];
                            } else {
                                int i16 = i14 + 1;
                                Object obj2 = p6nVar2.b.b[p6nVar2.c() + i14];
                                if (i15 == 0) {
                                    i14 = i16;
                                    obj = obj2;
                                    i13 = i2 + 1;
                                } else {
                                    i14 = i16;
                                    obj = obj2;
                                    i13 = i2;
                                }
                            }
                            objArr2[i8] = obj;
                            abstractMap = this;
                            i8++;
                        }
                        iArr[i10] = i8;
                        d = s6nVar.d(i12);
                        d2 = s6nVar2.d(i11);
                        i7 = i12;
                        i6 = i11;
                        i9 = i10;
                        i3 = 0;
                    }
                }
                i7++;
                i8 = a(d, i9, i8, objArr2, iArr);
                d = s6nVar.d(i7);
                i9 = i10;
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = d;
            i6++;
            int a = a(d2, i9, i8, objArr2, iArr);
            d2 = s6nVar2.d(i6);
            i8 = a;
            d = entry;
            i9 = i10;
            i3 = 0;
            abstractMap = this;
        }
        int i17 = iArr[i3];
        int i18 = i17 - i9;
        if (i18 != 0) {
            for (int i19 = i3; i19 <= i9; i19++) {
                iArr[i19] = iArr[i19] - i18;
            }
            int i20 = iArr[i9];
            int i21 = i20 - i9;
            if (c(i4, i20)) {
                objArr = new Object[i20];
                System.arraycopy(objArr2, i3, objArr, i3, i9);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i17, objArr, i9, i21);
            objArr2 = objArr;
        }
        abstractMap.b = objArr2;
        int i22 = iArr[i3] + 1;
        abstractMap.c = c(i5, i22) ? Arrays.copyOf(iArr, i22) : iArr;
    }

    public static boolean c(int i2, int i3) {
        return i2 > 16 && i2 * 9 > i3 * 10;
    }

    public int a(Map.Entry entry, int i2, int i3, Object[] objArr, int[] iArr) {
        p6n p6nVar = (p6n) entry.getValue();
        int d = p6nVar.d() - p6nVar.c();
        System.arraycopy(p6nVar.b.b, p6nVar.c(), objArr, i3, d);
        objArr[i2] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new p6n(this, i2));
        int i4 = i3 + d;
        iArr[i2 + 1] = i4;
        return i4;
    }

    public Map.Entry d(int i2) {
        if (i2 < this.c[0]) {
            return (Map.Entry) this.b[i2];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
        }
        return (yg0) this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                Integer num = this.d;
                if (num == null) {
                    num = Integer.valueOf(super.hashCode());
                    this.d = num;
                }
                return num.intValue();
            case 1:
                Integer num2 = this.d;
                if (num2 == null) {
                    num2 = Integer.valueOf(super.hashCode());
                    this.d = num2;
                }
                return num2.intValue();
            default:
                Integer num3 = this.d;
                if (num3 == null) {
                    num3 = Integer.valueOf(super.hashCode());
                    this.d = num3;
                }
                return num3.intValue();
        }
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
            case 0:
                String str = this.e;
                if (str != null) {
                    return str;
                }
                String abstractMap = super.toString();
                this.e = abstractMap;
                return abstractMap;
            case 1:
                String str2 = this.e;
                if (str2 != null) {
                    return str2;
                }
                String abstractMap2 = super.toString();
                this.e = abstractMap2;
                return abstractMap2;
            default:
                String str3 = this.e;
                if (str3 != null) {
                    return str3;
                }
                String abstractMap3 = super.toString();
                this.e = abstractMap3;
                return abstractMap3;
        }
    }

    public s6n(int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                List list = Collections.EMPTY_LIST;
                this.f = new yg0(this, 7);
                this.d = null;
                this.e = null;
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    int size = list.size();
                    Object[] objArr = new Object[size];
                    Iterator it2 = list.iterator();
                    if (!it2.hasNext()) {
                        int[] iArr = {0};
                        if (size > 16 && size * 9 > 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        this.b = objArr;
                        this.c = iArr;
                        return;
                    }
                    throw lnb.i(it2);
                }
                throw lnb.i(it);
            case 2:
                List list2 = Collections.EMPTY_LIST;
                this.f = new yg0(this, 11);
                this.d = null;
                this.e = null;
                Iterator it3 = list2.iterator();
                if (!it3.hasNext()) {
                    int size2 = list2.size();
                    Object[] objArr2 = new Object[size2];
                    Iterator it4 = list2.iterator();
                    if (!it4.hasNext()) {
                        int[] iArr2 = {0};
                        if (size2 > 16 && size2 * 9 > 0) {
                            objArr2 = Arrays.copyOf(objArr2, 0);
                        }
                        this.b = objArr2;
                        this.c = iArr2;
                        return;
                    }
                    throw lnb.i(it4);
                }
                throw lnb.i(it3);
            default:
                List list3 = Collections.EMPTY_LIST;
                this.f = new p6n(this, -1);
                this.d = null;
                this.e = null;
                Iterator it5 = list3.iterator();
                if (!it5.hasNext()) {
                    int size3 = list3.size();
                    Object[] objArr3 = new Object[size3];
                    Iterator it6 = list3.iterator();
                    if (!it6.hasNext()) {
                        int[] iArr3 = {0};
                        this.b = c(size3, 0) ? Arrays.copyOf(objArr3, 0) : objArr3;
                        this.c = iArr3;
                        return;
                    }
                    throw lnb.i(it6);
                }
                throw lnb.i(it5);
        }
    }
}
