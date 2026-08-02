package f8;

import androidx.transition.n0;
import com.google.android.gms.internal.measurement.d5;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends h {

    /* renamed from: g, reason: collision with root package name */
    public static final q f9528g = new q(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f9529d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f9530e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f9531f;

    public q(Object obj, Object[] objArr, int i5) {
        this.f9529d = obj;
        this.f9530e = objArr;
        this.f9531f = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q c(int i5, Object[] objArr, n0 n0Var) {
        boolean z5;
        int i10;
        char c2;
        Object obj;
        char c8;
        short[] sArr;
        boolean z7;
        int i11;
        ?? r16;
        boolean z10;
        boolean z11;
        int i12 = i5;
        Object[] objArr2 = objArr;
        if (i12 == 0) {
            return f9528g;
        }
        Object obj2 = null;
        boolean z12 = false;
        int i13 = 1;
        if (i12 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new q(null, objArr2, 1);
        }
        d5.g(i12, objArr2.length >> 1);
        int g10 = j.g(i12);
        char c10 = 2;
        if (i12 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z11 = false;
            i10 = 1;
        } else {
            int i14 = g10 - 1;
            if (g10 <= 128) {
                byte[] bArr = new byte[g10];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i15 * 2;
                    int i18 = i16 * 2;
                    Object obj3 = objArr2[i17];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i17 ^ i13];
                    Objects.requireNonNull(obj4);
                    int y5 = m4.g.y(obj3.hashCode());
                    while (true) {
                        int i19 = y5 & i14;
                        z7 = z12;
                        i11 = i13;
                        int i20 = bArr[i19] & 255;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i18;
                            if (i16 < i15) {
                                objArr2[i18] = obj3;
                                objArr2[i18 ^ 1] = obj4;
                            }
                            i16++;
                        } else {
                            if (obj3.equals(objArr2[i20])) {
                                int i21 = i20 ^ 1;
                                Object obj5 = objArr2[i21];
                                Objects.requireNonNull(obj5);
                                obj2 = new f(obj3, obj4, obj5);
                                objArr2[i21] = obj4;
                                break;
                            }
                            y5 = i19 + 1;
                            z12 = z7;
                            i13 = i11;
                        }
                    }
                    i15++;
                    z12 = z7;
                    i13 = i11;
                }
                z5 = z12;
                i10 = i13;
                if (i16 == i12) {
                    obj2 = bArr;
                    z11 = z5;
                } else {
                    sArr = new Object[3];
                    sArr[z5 ? 1 : 0] = bArr;
                    sArr[i10] = Integer.valueOf(i16);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z11 = z5;
                }
            } else {
                z5 = false;
                i10 = 1;
                if (g10 > 32768) {
                    int[] iArr = new int[g10];
                    Arrays.fill(iArr, -1);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < i12) {
                        int i24 = i22 * 2;
                        int i25 = i23 * 2;
                        Object obj6 = objArr2[i24];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i24 ^ 1];
                        Objects.requireNonNull(obj7);
                        int y10 = m4.g.y(obj6.hashCode());
                        while (true) {
                            int i26 = y10 & i14;
                            int i27 = iArr[i26];
                            if (i27 == -1) {
                                iArr[i26] = i25;
                                if (i23 < i22) {
                                    objArr2[i25] = obj6;
                                    objArr2[i25 ^ 1] = obj7;
                                }
                                i23++;
                                c8 = c10;
                            } else {
                                c8 = c10;
                                if (obj6.equals(objArr2[i27])) {
                                    int i28 = i27 ^ 1;
                                    Object obj8 = objArr2[i28];
                                    Objects.requireNonNull(obj8);
                                    obj2 = new f(obj6, obj7, obj8);
                                    objArr2[i28] = obj7;
                                    break;
                                }
                                y10 = i26 + 1;
                                c10 = c8;
                            }
                        }
                        i22++;
                        c10 = c8;
                    }
                    c2 = c10;
                    if (i23 == i12) {
                        obj = iArr;
                        r16 = z5;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i23);
                        objArr3[c2] = obj2;
                        obj = objArr3;
                        r16 = z5;
                    }
                    z10 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z10) {
                        Object[] objArr4 = (Object[]) obj;
                        f fVar = (f) objArr4[c2];
                        if (n0Var == null) {
                            throw fVar.a();
                        }
                        n0Var.f2735d = fVar;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i10]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                        obj9 = obj10;
                        i12 = intValue;
                    }
                    return new q(obj9, objArr2, i12);
                }
                sArr = new short[g10];
                Arrays.fill(sArr, (short) -1);
                int i29 = 0;
                for (int i30 = 0; i30 < i12; i30++) {
                    int i31 = i30 * 2;
                    int i32 = i29 * 2;
                    Object obj11 = objArr2[i31];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i31 ^ 1];
                    Objects.requireNonNull(obj12);
                    int y11 = m4.g.y(obj11.hashCode());
                    while (true) {
                        int i33 = y11 & i14;
                        int i34 = sArr[i33] & 65535;
                        if (i34 == 65535) {
                            sArr[i33] = (short) i32;
                            if (i29 < i30) {
                                objArr2[i32] = obj11;
                                objArr2[i32 ^ 1] = obj12;
                            }
                            i29++;
                        } else {
                            if (obj11.equals(objArr2[i34])) {
                                int i35 = i34 ^ 1;
                                Object obj13 = objArr2[i35];
                                Objects.requireNonNull(obj13);
                                obj2 = new f(obj11, obj12, obj13);
                                objArr2[i35] = obj12;
                                break;
                            }
                            y11 = i33 + 1;
                        }
                    }
                }
                if (i29 != i12) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i29), obj2};
                    z11 = z5;
                }
                obj2 = sArr;
                z11 = z5;
            }
        }
        c2 = 2;
        obj = obj2;
        r16 = z11;
        z10 = obj instanceof Object[];
        Object obj92 = obj;
        if (z10) {
        }
        return new q(obj92, objArr2, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // f8.h, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.f9530e;
            if (this.f9531f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f9529d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int y5 = m4.g.y(obj.hashCode());
                        while (true) {
                            int i5 = y5 & length;
                            int i10 = bArr[i5] & 255;
                            if (i10 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i10])) {
                                obj2 = objArr[i10 ^ 1];
                                break;
                            }
                            y5 = i5 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int y10 = m4.g.y(obj.hashCode());
                        while (true) {
                            int i11 = y10 & length2;
                            int i12 = sArr[i11] & 65535;
                            if (i12 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            y10 = i11 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int y11 = m4.g.y(obj.hashCode());
                        while (true) {
                            int i13 = y11 & length3;
                            int i14 = iArr[i13];
                            if (i14 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i14])) {
                                obj2 = objArr[i14 ^ 1];
                                break;
                            }
                            y11 = i13 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9531f;
    }
}
