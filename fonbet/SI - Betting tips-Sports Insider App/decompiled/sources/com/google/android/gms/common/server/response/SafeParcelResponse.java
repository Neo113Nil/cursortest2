package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import f3.x;
import g6.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import n6.a;
import q6.b;
import q6.c;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @NonNull
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f4592a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f4593b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4594c;

    /* renamed from: d, reason: collision with root package name */
    public final zan f4595d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4596e;

    /* renamed from: f, reason: collision with root package name */
    public int f4597f;

    /* renamed from: g, reason: collision with root package name */
    public int f4598g;

    public SafeParcelResponse(int i5, Parcel parcel, zan zanVar) {
        this.f4592a = i5;
        v.h(parcel);
        this.f4593b = parcel;
        this.f4594c = 2;
        this.f4595d = zanVar;
        this.f4596e = zanVar == null ? null : zanVar.f4607c;
        this.f4597f = 2;
    }

    public static void i(StringBuilder sb2, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel obtain;
        BigInteger[] bigIntegerArr;
        long[] createLongArray;
        float[] createFloatArray;
        double[] createDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] createBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse$Field) entry.getValue()).f4588g, entry);
        }
        sb2.append('{');
        int F0 = x.F0(parcel);
        boolean z5 = false;
        while (parcel.dataPosition() < F0) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z5) {
                    sb2.append(StringUtils.COMMA);
                }
                String str = (String) entry2.getKey();
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) entry2.getValue();
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f4591k;
                String str2 = fastJsonResponse$Field.f4590i;
                int i5 = fastJsonResponse$Field.f4585d;
                if (stringToIntConverter != null) {
                    switch (i5) {
                        case 0:
                            k(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, Integer.valueOf(x.v0(parcel, readInt))));
                            break;
                        case 1:
                            int z0 = x.z0(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (z0 == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + z0);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            k(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, bigInteger2));
                            break;
                        case 2:
                            k(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, Long.valueOf(x.x0(parcel, readInt))));
                            break;
                        case 3:
                            k(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, Float.valueOf(x.t0(parcel, readInt))));
                            break;
                        case 4:
                            x.G0(parcel, readInt, 8);
                            k(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            k(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, x.L(parcel, readInt)));
                            break;
                        case 6:
                            k(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, Boolean.valueOf(x.r0(parcel, readInt))));
                            break;
                        case 7:
                            k(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, x.S(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            k(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, x.N(parcel, readInt)));
                            break;
                        case 10:
                            Bundle M = x.M(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str3 : M.keySet()) {
                                String string = M.getString(str3);
                                v.h(string);
                                hashMap.put(str3, string);
                            }
                            k(sb2, fastJsonResponse$Field, FastSafeParcelableJsonResponse.f(fastJsonResponse$Field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(k.o(new StringBuilder(String.valueOf(i5).length() + 25), "Unknown field out type = ", i5));
                    }
                } else if (fastJsonResponse$Field.f4586e) {
                    sb2.append("[");
                    switch (i5) {
                        case 0:
                            int[] O = x.O(parcel, readInt);
                            int length = O.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                if (i10 != 0) {
                                    sb2.append(StringUtils.COMMA);
                                }
                                sb2.append(O[i10]);
                            }
                            break;
                        case 1:
                            int z02 = x.z0(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (z02 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i11 = 0; i11 < readInt2; i11++) {
                                    bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition2 + z02);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i12 = 0; i12 < length2; i12++) {
                                if (i12 != 0) {
                                    sb2.append(StringUtils.COMMA);
                                }
                                sb2.append(bigIntegerArr[i12]);
                            }
                            break;
                        case 2:
                            int z03 = x.z0(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (z03 == 0) {
                                createLongArray = null;
                            } else {
                                createLongArray = parcel.createLongArray();
                                parcel.setDataPosition(dataPosition3 + z03);
                            }
                            int length3 = createLongArray.length;
                            for (int i13 = 0; i13 < length3; i13++) {
                                if (i13 != 0) {
                                    sb2.append(StringUtils.COMMA);
                                }
                                sb2.append(createLongArray[i13]);
                            }
                            break;
                        case 3:
                            int z04 = x.z0(parcel, readInt);
                            int dataPosition4 = parcel.dataPosition();
                            if (z04 == 0) {
                                createFloatArray = null;
                            } else {
                                createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition4 + z04);
                            }
                            int length4 = createFloatArray.length;
                            for (int i14 = 0; i14 < length4; i14++) {
                                if (i14 != 0) {
                                    sb2.append(StringUtils.COMMA);
                                }
                                sb2.append(createFloatArray[i14]);
                            }
                            break;
                        case 4:
                            int z05 = x.z0(parcel, readInt);
                            int dataPosition5 = parcel.dataPosition();
                            if (z05 == 0) {
                                createDoubleArray = null;
                            } else {
                                createDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(dataPosition5 + z05);
                            }
                            int length5 = createDoubleArray.length;
                            for (int i15 = 0; i15 < length5; i15++) {
                                if (i15 != 0) {
                                    sb2.append(StringUtils.COMMA);
                                }
                                sb2.append(createDoubleArray[i15]);
                            }
                            break;
                        case 5:
                            int z06 = x.z0(parcel, readInt);
                            int dataPosition6 = parcel.dataPosition();
                            if (z06 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i16 = 0; i16 < readInt3; i16++) {
                                    bigDecimalArr[i16] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition6 + z06);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i17 = 0; i17 < length6; i17++) {
                                if (i17 != 0) {
                                    sb2.append(StringUtils.COMMA);
                                }
                                sb2.append(bigDecimalArr[i17]);
                            }
                            break;
                        case 6:
                            int z07 = x.z0(parcel, readInt);
                            int dataPosition7 = parcel.dataPosition();
                            if (z07 == 0) {
                                createBooleanArray = null;
                            } else {
                                createBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(dataPosition7 + z07);
                            }
                            int length7 = createBooleanArray.length;
                            for (int i18 = 0; i18 < length7; i18++) {
                                if (i18 != 0) {
                                    sb2.append(StringUtils.COMMA);
                                }
                                sb2.append(createBooleanArray[i18]);
                            }
                            break;
                        case 7:
                            String[] T = x.T(parcel, readInt);
                            int length8 = T.length;
                            for (int i19 = 0; i19 < length8; i19++) {
                                if (i19 != 0) {
                                    sb2.append(StringUtils.COMMA);
                                }
                                sb2.append("\"");
                                sb2.append(T[i19]);
                                sb2.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int z08 = x.z0(parcel, readInt);
                            int dataPosition8 = parcel.dataPosition();
                            if (z08 == 0) {
                                parcelArr = null;
                            } else {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i20 = 0; i20 < readInt4; i20++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition9 = parcel.dataPosition();
                                        Parcel obtain2 = Parcel.obtain();
                                        obtain2.appendFrom(parcel, dataPosition9, readInt5);
                                        parcelArr2[i20] = obtain2;
                                        parcel.setDataPosition(dataPosition9 + readInt5);
                                    } else {
                                        parcelArr2[i20] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition8 + z08);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i21 = 0; i21 < length9; i21++) {
                                if (i21 > 0) {
                                    sb2.append(StringUtils.COMMA);
                                }
                                parcelArr[i21].setDataPosition(0);
                                v.h(str2);
                                v.h(fastJsonResponse$Field.j);
                                Map map2 = (Map) fastJsonResponse$Field.j.f4606b.get(str2);
                                v.h(map2);
                                i(sb2, map2, parcelArr[i21]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb2.append("]");
                } else {
                    switch (i5) {
                        case 0:
                            sb2.append(x.v0(parcel, readInt));
                            break;
                        case 1:
                            int z09 = x.z0(parcel, readInt);
                            int dataPosition10 = parcel.dataPosition();
                            if (z09 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] createByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition10 + z09);
                                bigInteger = new BigInteger(createByteArray2);
                            }
                            sb2.append(bigInteger);
                            break;
                        case 2:
                            sb2.append(x.x0(parcel, readInt));
                            break;
                        case 3:
                            sb2.append(x.t0(parcel, readInt));
                            break;
                        case 4:
                            x.G0(parcel, readInt, 8);
                            sb2.append(parcel.readDouble());
                            break;
                        case 5:
                            sb2.append(x.L(parcel, readInt));
                            break;
                        case 6:
                            sb2.append(x.r0(parcel, readInt));
                            break;
                        case 7:
                            String S = x.S(parcel, readInt);
                            sb2.append("\"");
                            sb2.append(c.a(S));
                            sb2.append("\"");
                            break;
                        case 8:
                            byte[] N = x.N(parcel, readInt);
                            sb2.append("\"");
                            sb2.append(N == null ? null : Base64.encodeToString(N, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            byte[] N2 = x.N(parcel, readInt);
                            sb2.append("\"");
                            sb2.append(N2 == null ? null : Base64.encodeToString(N2, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            Bundle M2 = x.M(parcel, readInt);
                            Set<String> keySet = M2.keySet();
                            sb2.append("{");
                            boolean z7 = true;
                            for (String str4 : keySet) {
                                if (!z7) {
                                    sb2.append(StringUtils.COMMA);
                                }
                                sb2.append("\"");
                                sb2.append(str4);
                                sb2.append("\":\"");
                                sb2.append(c.a(M2.getString(str4)));
                                sb2.append("\"");
                                z7 = false;
                            }
                            sb2.append("}");
                            break;
                        case 11:
                            int z010 = x.z0(parcel, readInt);
                            int dataPosition11 = parcel.dataPosition();
                            if (z010 == 0) {
                                obtain = null;
                            } else {
                                obtain = Parcel.obtain();
                                obtain.appendFrom(parcel, dataPosition11, z010);
                                parcel.setDataPosition(dataPosition11 + z010);
                            }
                            obtain.setDataPosition(0);
                            v.h(str2);
                            v.h(fastJsonResponse$Field.j);
                            Map map3 = (Map) fastJsonResponse$Field.j.f4606b.get(str2);
                            v.h(map3);
                            i(sb2, map3, obtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z5 = true;
            }
        }
        if (parcel.dataPosition() != F0) {
            throw new h6.a(k.o(new StringBuilder(String.valueOf(F0).length() + 26), "Overread allowed size end=", F0), parcel);
        }
        sb2.append('}');
    }

    public static final void j(StringBuilder sb2, int i5, Object obj) {
        switch (i5) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                v.h(obj);
                sb2.append(c.a(obj.toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                byte[] bArr = (byte[]) obj;
                sb2.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb2.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb2.append("\"");
                return;
            case 10:
                v.h(obj);
                b.i(sb2, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(k.o(new StringBuilder(String.valueOf(i5).length() + 15), "Unknown type = ", i5));
        }
    }

    public static final void k(StringBuilder sb2, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        boolean z5 = fastJsonResponse$Field.f4584c;
        int i5 = fastJsonResponse$Field.f4583b;
        if (!z5) {
            j(sb2, i5, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(StringUtils.COMMA);
            }
            j(sb2, i5, arrayList.get(i10));
        }
        sb2.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Map a() {
        zan zanVar = this.f4595d;
        if (zanVar == null) {
            return null;
        }
        String str = this.f4596e;
        v.h(str);
        return (Map) zanVar.f4606b.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean e() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel h() {
        int i5 = this.f4597f;
        Parcel parcel = this.f4593b;
        if (i5 != 0) {
            if (i5 != 1) {
                return parcel;
            }
            h8.b.W(parcel, this.f4598g);
            this.f4597f = 2;
            return parcel;
        }
        int V = h8.b.V(parcel, 20293);
        this.f4598g = V;
        h8.b.W(parcel, V);
        this.f4597f = 2;
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final String toString() {
        zan zanVar = this.f4595d;
        v.i(zanVar, "Cannot convert to JSON on client side.");
        Parcel h10 = h();
        h10.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        String str = this.f4596e;
        v.h(str);
        Map map = (Map) zanVar.f4606b.get(str);
        v.h(map);
        i(sb2, map, h10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4592a);
        Parcel h10 = h();
        if (h10 != null) {
            int V2 = h8.b.V(parcel, 2);
            parcel.appendFrom(h10, 0, h10.dataSize());
            h8.b.W(parcel, V2);
        }
        h8.b.N(parcel, 3, this.f4594c != 0 ? this.f4595d : null, i5, false);
        h8.b.W(parcel, V);
    }
}
