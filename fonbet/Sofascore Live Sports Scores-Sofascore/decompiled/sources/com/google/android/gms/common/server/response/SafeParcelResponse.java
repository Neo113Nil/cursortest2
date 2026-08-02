package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.me4;
import defpackage.wt3;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();
    public final int a;
    public final Parcel b;
    public final int c;
    public final zan d;
    public final String e;
    public int f;
    public int g;

    public SafeParcelResponse(int i, Parcel parcel, zan zanVar) {
        this.a = i;
        Preconditions.i(parcel);
        this.b = parcel;
        this.c = 2;
        this.d = zanVar;
        this.e = zanVar == null ? null : zanVar.c;
        this.f = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v46, types: [java.lang.String] */
    public static void i(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel obtain;
        BigInteger[] bigIntegerArr;
        float[] createFloatArray;
        double[] createDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] createBooleanArray;
        Parcel[] parcelArr;
        Object bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).g, entry);
        }
        sb.append('{');
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z) {
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                wt3.A("\"", str, sb, "\":");
                FastJsonResponse.FieldConverter fieldConverter = field.k;
                String str2 = field.i;
                FastJsonResponse.FieldConverter fieldConverter2 = field.k;
                int i = field.d;
                if (fieldConverter != null) {
                    switch (i) {
                        case 0:
                            Object valueOf = Integer.valueOf(SafeParcelReader.v(parcel, readInt));
                            if (fieldConverter2 != 0) {
                                valueOf = fieldConverter2.u0(valueOf);
                            }
                            k(sb, field, valueOf);
                            break;
                        case 1:
                            int z2 = SafeParcelReader.z(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (z2 == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + z2);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            if (fieldConverter2 != 0) {
                                bigInteger2 = fieldConverter2.u0(bigInteger2);
                            }
                            k(sb, field, bigInteger2);
                            break;
                        case 2:
                            Object valueOf2 = Long.valueOf(SafeParcelReader.x(parcel, readInt));
                            if (fieldConverter2 != 0) {
                                valueOf2 = fieldConverter2.u0(valueOf2);
                            }
                            k(sb, field, valueOf2);
                            break;
                        case 3:
                            Object valueOf3 = Float.valueOf(SafeParcelReader.t(parcel, readInt));
                            if (fieldConverter2 != 0) {
                                valueOf3 = fieldConverter2.u0(valueOf3);
                            }
                            k(sb, field, valueOf3);
                            break;
                        case 4:
                            Object valueOf4 = Double.valueOf(SafeParcelReader.r(parcel, readInt));
                            if (fieldConverter2 != 0) {
                                valueOf4 = fieldConverter2.u0(valueOf4);
                            }
                            k(sb, field, valueOf4);
                            break;
                        case 5:
                            Object a = SafeParcelReader.a(parcel, readInt);
                            if (fieldConverter2 != 0) {
                                a = fieldConverter2.u0(a);
                            }
                            k(sb, field, a);
                            break;
                        case 6:
                            Object valueOf5 = Boolean.valueOf(SafeParcelReader.o(parcel, readInt));
                            if (fieldConverter2 != 0) {
                                valueOf5 = fieldConverter2.u0(valueOf5);
                            }
                            k(sb, field, valueOf5);
                            break;
                        case 7:
                            String i2 = SafeParcelReader.i(parcel, readInt);
                            if (fieldConverter2 != 0) {
                                i2 = fieldConverter2.u0(i2);
                            }
                            k(sb, field, i2);
                            break;
                        case 8:
                        case 9:
                            Object c = SafeParcelReader.c(parcel, readInt);
                            if (fieldConverter2 != 0) {
                                c = fieldConverter2.u0(c);
                            }
                            k(sb, field, c);
                            break;
                        case 10:
                            Bundle b = SafeParcelReader.b(parcel, readInt);
                            Object hashMap = new HashMap();
                            for (String str3 : b.keySet()) {
                                String string = b.getString(str3);
                                Preconditions.i(string);
                                hashMap.put(str3, string);
                            }
                            if (fieldConverter2 != 0) {
                                hashMap = fieldConverter2.u0(hashMap);
                            }
                            k(sb, field, hashMap);
                            break;
                        case 11:
                            a70.p("Method does not accept concrete type.");
                            return;
                        default:
                            a70.p(me4.g(i, "Unknown field out type = ", new StringBuilder(String.valueOf(i).length() + 25)));
                            return;
                    }
                } else if (field.e) {
                    sb.append(U3.j.d);
                    switch (i) {
                        case 0:
                            int[] e = SafeParcelReader.e(parcel, readInt);
                            int length = e.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                if (i3 != 0) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                sb.append(e[i3]);
                            }
                            break;
                        case 1:
                            int z3 = SafeParcelReader.z(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (z3 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i4 = 0; i4 < readInt2; i4++) {
                                    bigIntegerArr[i4] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition2 + z3);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i5 = 0; i5 < length2; i5++) {
                                if (i5 != 0) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                sb.append(bigIntegerArr[i5]);
                            }
                            break;
                        case 2:
                            long[] g = SafeParcelReader.g(parcel, readInt);
                            int length3 = g.length;
                            for (int i6 = 0; i6 < length3; i6++) {
                                if (i6 != 0) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                sb.append(g[i6]);
                            }
                            break;
                        case 3:
                            int z4 = SafeParcelReader.z(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (z4 == 0) {
                                createFloatArray = null;
                            } else {
                                createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition3 + z4);
                            }
                            int length4 = createFloatArray.length;
                            for (int i7 = 0; i7 < length4; i7++) {
                                if (i7 != 0) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                sb.append(createFloatArray[i7]);
                            }
                            break;
                        case 4:
                            int z5 = SafeParcelReader.z(parcel, readInt);
                            int dataPosition4 = parcel.dataPosition();
                            if (z5 == 0) {
                                createDoubleArray = null;
                            } else {
                                createDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(dataPosition4 + z5);
                            }
                            int length5 = createDoubleArray.length;
                            for (int i8 = 0; i8 < length5; i8++) {
                                if (i8 != 0) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                sb.append(createDoubleArray[i8]);
                            }
                            break;
                        case 5:
                            int z6 = SafeParcelReader.z(parcel, readInt);
                            int dataPosition5 = parcel.dataPosition();
                            if (z6 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i9 = 0; i9 < readInt3; i9++) {
                                    bigDecimalArr[i9] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition5 + z6);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i10 = 0; i10 < length6; i10++) {
                                if (i10 != 0) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                sb.append(bigDecimalArr[i10]);
                            }
                            break;
                        case 6:
                            int z7 = SafeParcelReader.z(parcel, readInt);
                            int dataPosition6 = parcel.dataPosition();
                            if (z7 == 0) {
                                createBooleanArray = null;
                            } else {
                                createBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(dataPosition6 + z7);
                            }
                            int length7 = createBooleanArray.length;
                            for (int i11 = 0; i11 < length7; i11++) {
                                if (i11 != 0) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                sb.append(createBooleanArray[i11]);
                            }
                            break;
                        case 7:
                            String[] j = SafeParcelReader.j(parcel, readInt);
                            int length8 = j.length;
                            for (int i12 = 0; i12 < length8; i12++) {
                                if (i12 != 0) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                sb.append("\"");
                                sb.append(j[i12]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            a70.m("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            return;
                        case 11:
                            int z8 = SafeParcelReader.z(parcel, readInt);
                            int dataPosition7 = parcel.dataPosition();
                            if (z8 == 0) {
                                parcelArr = null;
                            } else {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i13 = 0; i13 < readInt4; i13++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition8 = parcel.dataPosition();
                                        Parcel obtain2 = Parcel.obtain();
                                        obtain2.appendFrom(parcel, dataPosition8, readInt5);
                                        parcelArr2[i13] = obtain2;
                                        parcel.setDataPosition(dataPosition8 + readInt5);
                                    } else {
                                        parcelArr2[i13] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition7 + z8);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i14 = 0; i14 < length9; i14++) {
                                if (i14 > 0) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                parcelArr[i14].setDataPosition(0);
                                Preconditions.i(str2);
                                Preconditions.i(field.j);
                                Map map2 = (Map) field.j.b.get(str2);
                                Preconditions.i(map2);
                                i(sb, map2, parcelArr[i14]);
                            }
                            break;
                        default:
                            a70.r("Unknown field type out.");
                            return;
                    }
                    sb.append(U3.j.e);
                } else {
                    switch (i) {
                        case 0:
                            sb.append(SafeParcelReader.v(parcel, readInt));
                            break;
                        case 1:
                            int z9 = SafeParcelReader.z(parcel, readInt);
                            int dataPosition9 = parcel.dataPosition();
                            if (z9 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] createByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition9 + z9);
                                bigInteger = new BigInteger(createByteArray2);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(SafeParcelReader.x(parcel, readInt));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.t(parcel, readInt));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.r(parcel, readInt));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.a(parcel, readInt));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.o(parcel, readInt));
                            break;
                        case 7:
                            String i15 = SafeParcelReader.i(parcel, readInt);
                            sb.append("\"");
                            sb.append(JsonUtils.b(i15));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] c2 = SafeParcelReader.c(parcel, readInt);
                            sb.append("\"");
                            sb.append(c2 == null ? null : Base64.encodeToString(c2, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] c3 = SafeParcelReader.c(parcel, readInt);
                            sb.append("\"");
                            sb.append(c3 == null ? null : Base64.encodeToString(c3, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle b2 = SafeParcelReader.b(parcel, readInt);
                            Set<String> keySet = b2.keySet();
                            sb.append("{");
                            boolean z10 = true;
                            for (String str4 : keySet) {
                                if (!z10) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                wt3.A("\"", str4, sb, "\":\"");
                                sb.append(JsonUtils.b(b2.getString(str4)));
                                sb.append("\"");
                                z10 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            int z11 = SafeParcelReader.z(parcel, readInt);
                            int dataPosition10 = parcel.dataPosition();
                            if (z11 == 0) {
                                obtain = null;
                            } else {
                                obtain = Parcel.obtain();
                                obtain.appendFrom(parcel, dataPosition10, z11);
                                parcel.setDataPosition(dataPosition10 + z11);
                            }
                            obtain.setDataPosition(0);
                            Preconditions.i(str2);
                            Preconditions.i(field.j);
                            Map map3 = (Map) field.j.b.get(str2);
                            Preconditions.i(map3);
                            i(sb, map3, obtain);
                            break;
                        default:
                            a70.r("Unknown field type out");
                            return;
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != B) {
            throw new SafeParcelReader.ParseException(me4.g(B, "Overread allowed size end=", new StringBuilder(String.valueOf(B).length() + 26)), parcel);
        }
        sb.append('}');
    }

    public static final void j(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                break;
            case 7:
                sb.append("\"");
                Preconditions.i(obj);
                sb.append(JsonUtils.b(obj.toString()));
                sb.append("\"");
                break;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                break;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                break;
            case 10:
                Preconditions.i(obj);
                MapUtils.a(sb, (HashMap) obj);
                break;
            case 11:
                a70.p("Method does not accept concrete type.");
                break;
            default:
                a70.p(me4.g(i, "Unknown type = ", new StringBuilder(String.valueOf(i).length() + 15)));
                break;
        }
    }

    public static final void k(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        boolean z = field.c;
        int i = field.b;
        if (!z) {
            j(sb, i, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append(U3.j.d);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            }
            j(sb, i, arrayList.get(i2));
        }
        sb.append(U3.j.e);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map a() {
        zan zanVar = this.d;
        if (zanVar == null) {
            return null;
        }
        String str = this.e;
        Preconditions.i(str);
        return (Map) zanVar.b.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean f() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel h() {
        int i = this.f;
        Parcel parcel = this.b;
        if (i != 0) {
            if (i != 1) {
                return parcel;
            }
            SafeParcelWriter.t(parcel, this.g);
            this.f = 2;
            return parcel;
        }
        int s = SafeParcelWriter.s(parcel, 20293);
        this.g = s;
        SafeParcelWriter.t(parcel, s);
        this.f = 2;
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        zan zanVar = this.d;
        Preconditions.j(zanVar, "Cannot convert to JSON on client side.");
        Parcel h = h();
        h.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.e;
        Preconditions.i(str);
        Map map = (Map) zanVar.b.get(str);
        Preconditions.i(map);
        i(sb, map, h);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        Parcel h = h();
        if (h != null) {
            int s2 = SafeParcelWriter.s(parcel, 2);
            parcel.appendFrom(h, 0, h.dataSize());
            SafeParcelWriter.t(parcel, s2);
        }
        SafeParcelWriter.l(parcel, 3, this.c != 0 ? this.d : null, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
