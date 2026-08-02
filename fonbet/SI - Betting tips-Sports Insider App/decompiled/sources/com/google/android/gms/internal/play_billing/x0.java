package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 extends f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final x0 f5630g = new x0(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f5631d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f5632e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f5633f;

    public x0(Object obj, Object[] objArr, int i5) {
        this.f5631d = obj;
        this.f5632e = objArr;
        this.f5633f = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019e  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x0 a(int i5, Object[] objArr, androidx.transition.n0 n0Var) {
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
            return f5630g;
        }
        Object obj2 = null;
        boolean z12 = false;
        int i13 = 1;
        if (i12 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new x0(null, objArr2, 1);
        }
        d3.r(i12, objArr2.length >> 1);
        int g10 = j0.g(i12);
        char c10 = 2;
        if (i12 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z11 = false;
            i12 = 1;
            i10 = 1;
        } else {
            int i14 = g10 - 1;
            if (g10 <= 128) {
                byte[] bArr = new byte[g10];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj3 = objArr2[i18];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i18 ^ i13];
                    Objects.requireNonNull(obj4);
                    int c11 = d3.c(obj3.hashCode());
                    while (true) {
                        int i19 = c11 & i14;
                        z7 = z12;
                        i11 = i13;
                        int i20 = bArr[i19] & 255;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArr2[i17] = obj3;
                                objArr2[i17 ^ 1] = obj4;
                            }
                            i16++;
                        } else {
                            if (obj3.equals(objArr2[i20])) {
                                int i21 = i20 ^ 1;
                                Object obj5 = objArr2[i21];
                                Objects.requireNonNull(obj5);
                                e0 e0Var = new e0(obj3, obj4, obj5);
                                objArr2[i21] = obj4;
                                obj2 = e0Var;
                                break;
                            }
                            c11 = i19 + 1;
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
                        int i24 = i23 + i23;
                        int i25 = i22 + i22;
                        Object obj6 = objArr2[i25];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i25 ^ 1];
                        Objects.requireNonNull(obj7);
                        int c12 = d3.c(obj6.hashCode());
                        while (true) {
                            int i26 = c12 & i14;
                            int i27 = iArr[i26];
                            if (i27 == -1) {
                                iArr[i26] = i24;
                                if (i23 < i22) {
                                    objArr2[i24] = obj6;
                                    objArr2[i24 ^ 1] = obj7;
                                }
                                i23++;
                                c8 = c10;
                            } else {
                                c8 = c10;
                                if (obj6.equals(objArr2[i27])) {
                                    int i28 = i27 ^ 1;
                                    Object obj8 = objArr2[i28];
                                    Objects.requireNonNull(obj8);
                                    e0 e0Var2 = new e0(obj6, obj7, obj8);
                                    objArr2[i28] = obj7;
                                    obj2 = e0Var2;
                                    break;
                                }
                                c12 = i26 + 1;
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
                        e0 e0Var3 = (e0) objArr4[c2];
                        if (n0Var == null) {
                            throw e0Var3.a();
                        }
                        n0Var.f2735d = e0Var3;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i10]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj9 = obj10;
                        i12 = intValue;
                    }
                    return new x0(obj9, objArr2, i12);
                }
                sArr = new short[g10];
                Arrays.fill(sArr, (short) -1);
                int i29 = 0;
                for (int i30 = 0; i30 < i12; i30++) {
                    int i31 = i29 + i29;
                    int i32 = i30 + i30;
                    Object obj11 = objArr2[i32];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i32 ^ 1];
                    Objects.requireNonNull(obj12);
                    int c13 = d3.c(obj11.hashCode());
                    while (true) {
                        int i33 = c13 & i14;
                        char c14 = (char) sArr[i33];
                        if (c14 == 65535) {
                            sArr[i33] = (short) i31;
                            if (i29 < i30) {
                                objArr2[i31] = obj11;
                                objArr2[i31 ^ 1] = obj12;
                            }
                            i29++;
                        } else {
                            if (obj11.equals(objArr2[c14])) {
                                int i34 = c14 ^ 1;
                                Object obj13 = objArr2[i34];
                                Objects.requireNonNull(obj13);
                                e0 e0Var4 = new e0(obj11, obj12, obj13);
                                objArr2[i34] = obj12;
                                obj2 = e0Var4;
                                break;
                            }
                            c13 = i33 + 1;
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
        return new x0(obj92, objArr2, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.f0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i5 = this.f5633f;
            Object[] objArr = this.f5632e;
            if (i5 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f5631d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int c2 = d3.c(obj.hashCode());
                        while (true) {
                            int i10 = c2 & length;
                            int i11 = bArr[i10] & 255;
                            if (i11 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i11])) {
                                obj2 = objArr[i11 ^ 1];
                                break;
                            }
                            c2 = i10 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int c8 = d3.c(obj.hashCode());
                        while (true) {
                            int i12 = c8 & length2;
                            char c10 = (char) sArr[i12];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            }
                            c8 = i12 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int c11 = d3.c(obj.hashCode());
                        while (true) {
                            int i13 = c11 & length3;
                            int i14 = iArr[i13];
                            if (i14 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i14])) {
                                obj2 = objArr[i14 ^ 1];
                                break;
                            }
                            c11 = i13 + 1;
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
        return this.f5633f;
    }
}
