package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgxo;
import com.google.android.gms.internal.ads.zzgxp;
import com.google.android.gms.internal.ads.zzgxw;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class njo extends zzgxp {
    public static final njo g = new njo(0, null, new Object[0]);
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public njo(int i, Object obj, Object[] objArr) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
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
    public static njo i(int i, Object[] objArr, zzgxo zzgxoVar) {
        boolean z;
        int i2;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        boolean z4;
        int i4 = i;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return g;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new njo(1, null, objArr2);
        }
        zzguk.j(i4, objArr2.length >> 1);
        int t = zzgxw.t(i4);
        char c3 = 2;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z4 = false;
            i4 = 1;
            i2 = 1;
        } else {
            int i6 = t - 1;
            if (t <= 128) {
                byte[] bArr = new byte[t];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj3 = objArr2[i10];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i10 ^ i5];
                    Objects.requireNonNull(obj4);
                    int I = d2a.I(obj3.hashCode());
                    while (true) {
                        int i11 = I & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArr2[i9] = obj3;
                                objArr2[i9 ^ 1] = obj4;
                            }
                            i8++;
                        } else {
                            if (obj3.equals(objArr2[i12])) {
                                int i13 = i12 ^ 1;
                                Object obj5 = objArr2[i13];
                                Objects.requireNonNull(obj5);
                                oio oioVar = new oio(obj3, obj4, obj5);
                                objArr2[i13] = obj4;
                                obj2 = oioVar;
                                break;
                            }
                            I = i11 + 1;
                            z5 = z2;
                            i5 = i3;
                        }
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    obj2 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (t > 32768) {
                    int[] iArr = new int[t];
                    Arrays.fill(iArr, -1);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i4) {
                        int i16 = i15 + i15;
                        int i17 = i14 + i14;
                        Object obj6 = objArr2[i17];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i17 ^ 1];
                        Objects.requireNonNull(obj7);
                        int I2 = d2a.I(obj6.hashCode());
                        while (true) {
                            int i18 = I2 & i6;
                            int i19 = iArr[i18];
                            if (i19 == -1) {
                                iArr[i18] = i16;
                                if (i15 < i14) {
                                    objArr2[i16] = obj6;
                                    objArr2[i16 ^ 1] = obj7;
                                }
                                i15++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj6.equals(objArr2[i19])) {
                                    int i20 = i19 ^ 1;
                                    Object obj8 = objArr2[i20];
                                    Objects.requireNonNull(obj8);
                                    oio oioVar2 = new oio(obj6, obj7, obj8);
                                    objArr2[i20] = obj7;
                                    obj2 = oioVar2;
                                    break;
                                }
                                I2 = i18 + 1;
                                c3 = c2;
                            }
                        }
                        i14++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i15 == i4) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i15);
                        objArr3[c] = obj2;
                        obj = objArr3;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z3) {
                        Object[] objArr4 = (Object[]) obj;
                        oio oioVar3 = (oio) objArr4[c];
                        if (zzgxoVar == null) {
                            throw oioVar3.a();
                        }
                        zzgxoVar.c = oioVar3;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i2]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj9 = obj10;
                        i4 = intValue;
                    }
                    return new njo(i4, obj9, objArr2);
                }
                sArr = new short[t];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i4; i22++) {
                    int i23 = i21 + i21;
                    int i24 = i22 + i22;
                    Object obj11 = objArr2[i24];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i24 ^ 1];
                    Objects.requireNonNull(obj12);
                    int I3 = d2a.I(obj11.hashCode());
                    while (true) {
                        int i25 = I3 & i6;
                        char c4 = (char) sArr[i25];
                        if (c4 == 65535) {
                            sArr[i25] = (short) i23;
                            if (i21 < i22) {
                                objArr2[i23] = obj11;
                                objArr2[i23 ^ 1] = obj12;
                            }
                            i21++;
                        } else {
                            if (obj11.equals(objArr2[c4])) {
                                int i26 = c4 ^ 1;
                                Object obj13 = objArr2[i26];
                                Objects.requireNonNull(obj13);
                                oio oioVar4 = new oio(obj11, obj12, obj13);
                                objArr2[i26] = obj12;
                                obj2 = oioVar4;
                                break;
                            }
                            I3 = i25 + 1;
                        }
                    }
                }
                if (i21 != i4) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i21), obj2};
                    z4 = z;
                }
                obj2 = sArr;
                z4 = z;
            }
        }
        c = 2;
        obj = obj2;
        r16 = z4;
        z3 = obj instanceof Object[];
        Object obj92 = obj;
        if (z3) {
        }
        return new njo(i4, obj92, objArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final kjo d() {
        return new kjo(this, this.e, this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final ljo g() {
        return new ljo(this, new mjo(0, this.f, this.e));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzgxp, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.f;
            Object[] objArr = this.e;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int I = d2a.I(obj.hashCode());
                        while (true) {
                            int i2 = I & length;
                            int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            I = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int I2 = d2a.I(obj.hashCode());
                        while (true) {
                            int i4 = I2 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            I2 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int I3 = d2a.I(obj.hashCode());
                        while (true) {
                            int i5 = I3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            I3 = i5 + 1;
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

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final mjo h() {
        return new mjo(1, this.f, this.e);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }
}
