package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import xsna.exc0;
import xsna.jh;
import xsna.l370;
import xsna.nby;
import xsna.ozg0;
import xsna.ppz0;
import xsna.z23;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @NonNull
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new ppz0();
    public final int b;
    public final Parcel c;
    public final int d;
    public final zan e;

    @Nullable
    public final String f;
    public int g;
    public int h;

    public SafeParcelResponse(int i, Parcel parcel, zan zanVar) {
        this.b = i;
        exc0.i(parcel);
        this.c = parcel;
        this.d = 2;
        this.e = zanVar;
        this.f = zanVar == null ? null : zanVar.d;
        this.g = 2;
    }

    public static void f(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel obtain;
        BigInteger[] bigIntegerArr;
        float[] createFloatArray;
        double[] createDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] createBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).h, entry);
        }
        sb.append('{');
        int D = SafeParcelReader.D(parcel);
        boolean z = false;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z) {
                    sb.append(StringUtils.COMMA);
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                jh.f(sb, "\"", str, "\":");
                FastJsonResponse.a aVar = field.l;
                String str2 = field.j;
                int i = field.e;
                if (aVar != null) {
                    switch (i) {
                        case 0:
                            i(sb, field, FastJsonResponse.zaD(field, Integer.valueOf(SafeParcelReader.w(parcel, readInt))));
                            break;
                        case 1:
                            int B = SafeParcelReader.B(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (B == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + B);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            i(sb, field, FastJsonResponse.zaD(field, bigInteger2));
                            break;
                        case 2:
                            i(sb, field, FastJsonResponse.zaD(field, Long.valueOf(SafeParcelReader.z(parcel, readInt))));
                            break;
                        case 3:
                            i(sb, field, FastJsonResponse.zaD(field, Float.valueOf(SafeParcelReader.t(parcel, readInt))));
                            break;
                        case 4:
                            i(sb, field, FastJsonResponse.zaD(field, Double.valueOf(SafeParcelReader.r(parcel, readInt))));
                            break;
                        case 5:
                            i(sb, field, FastJsonResponse.zaD(field, SafeParcelReader.a(parcel, readInt)));
                            break;
                        case 6:
                            i(sb, field, FastJsonResponse.zaD(field, Boolean.valueOf(SafeParcelReader.o(parcel, readInt))));
                            break;
                        case 7:
                            i(sb, field, FastJsonResponse.zaD(field, SafeParcelReader.i(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            i(sb, field, FastJsonResponse.zaD(field, SafeParcelReader.c(parcel, readInt)));
                            break;
                        case 10:
                            Bundle b = SafeParcelReader.b(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str3 : b.keySet()) {
                                String string = b.getString(str3);
                                exc0.i(string);
                                hashMap.put(str3, string);
                            }
                            i(sb, field, FastJsonResponse.zaD(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(z23.b(i, "Unknown field out type = ", new StringBuilder(String.valueOf(i).length() + 25)));
                    }
                } else if (field.f) {
                    sb.append(X3.j.d);
                    switch (i) {
                        case 0:
                            int[] d = SafeParcelReader.d(parcel, readInt);
                            int length = d.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 != 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                sb.append(d[i2]);
                            }
                            break;
                        case 1:
                            int B2 = SafeParcelReader.B(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (B2 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i3 = 0; i3 < readInt2; i3++) {
                                    bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition2 + B2);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i4 = 0; i4 < length2; i4++) {
                                if (i4 != 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                sb.append(bigIntegerArr[i4]);
                            }
                            break;
                        case 2:
                            long[] f = SafeParcelReader.f(parcel, readInt);
                            int length3 = f.length;
                            for (int i5 = 0; i5 < length3; i5++) {
                                if (i5 != 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                sb.append(f[i5]);
                            }
                            break;
                        case 3:
                            int B3 = SafeParcelReader.B(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (B3 == 0) {
                                createFloatArray = null;
                            } else {
                                createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition3 + B3);
                            }
                            int length4 = createFloatArray.length;
                            for (int i6 = 0; i6 < length4; i6++) {
                                if (i6 != 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                sb.append(createFloatArray[i6]);
                            }
                            break;
                        case 4:
                            int B4 = SafeParcelReader.B(parcel, readInt);
                            int dataPosition4 = parcel.dataPosition();
                            if (B4 == 0) {
                                createDoubleArray = null;
                            } else {
                                createDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(dataPosition4 + B4);
                            }
                            int length5 = createDoubleArray.length;
                            for (int i7 = 0; i7 < length5; i7++) {
                                if (i7 != 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                sb.append(createDoubleArray[i7]);
                            }
                            break;
                        case 5:
                            int B5 = SafeParcelReader.B(parcel, readInt);
                            int dataPosition5 = parcel.dataPosition();
                            if (B5 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i8 = 0; i8 < readInt3; i8++) {
                                    bigDecimalArr[i8] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition5 + B5);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i9 = 0; i9 < length6; i9++) {
                                if (i9 != 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                sb.append(bigDecimalArr[i9]);
                            }
                            break;
                        case 6:
                            int B6 = SafeParcelReader.B(parcel, readInt);
                            int dataPosition6 = parcel.dataPosition();
                            if (B6 == 0) {
                                createBooleanArray = null;
                            } else {
                                createBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(dataPosition6 + B6);
                            }
                            int length7 = createBooleanArray.length;
                            for (int i10 = 0; i10 < length7; i10++) {
                                if (i10 != 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                sb.append(createBooleanArray[i10]);
                            }
                            break;
                        case 7:
                            String[] j = SafeParcelReader.j(parcel, readInt);
                            int length8 = j.length;
                            for (int i11 = 0; i11 < length8; i11++) {
                                if (i11 != 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                sb.append("\"");
                                sb.append(j[i11]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int B7 = SafeParcelReader.B(parcel, readInt);
                            int dataPosition7 = parcel.dataPosition();
                            if (B7 == 0) {
                                parcelArr = null;
                            } else {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i12 = 0; i12 < readInt4; i12++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition8 = parcel.dataPosition();
                                        Parcel obtain2 = Parcel.obtain();
                                        obtain2.appendFrom(parcel, dataPosition8, readInt5);
                                        parcelArr2[i12] = obtain2;
                                        parcel.setDataPosition(dataPosition8 + readInt5);
                                    } else {
                                        parcelArr2[i12] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition7 + B7);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i13 = 0; i13 < length9; i13++) {
                                if (i13 > 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                parcelArr[i13].setDataPosition(0);
                                exc0.i(str2);
                                exc0.i(field.k);
                                Map map2 = (Map) field.k.c.get(str2);
                                exc0.i(map2);
                                f(sb, map2, parcelArr[i13]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append(X3.j.e);
                } else {
                    switch (i) {
                        case 0:
                            sb.append(SafeParcelReader.w(parcel, readInt));
                            break;
                        case 1:
                            int B8 = SafeParcelReader.B(parcel, readInt);
                            int dataPosition9 = parcel.dataPosition();
                            if (B8 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] createByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition9 + B8);
                                bigInteger = new BigInteger(createByteArray2);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(SafeParcelReader.z(parcel, readInt));
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
                            String i14 = SafeParcelReader.i(parcel, readInt);
                            sb.append("\"");
                            sb.append(nby.b(i14));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] c = SafeParcelReader.c(parcel, readInt);
                            sb.append("\"");
                            sb.append(c == null ? null : Base64.encodeToString(c, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] c2 = SafeParcelReader.c(parcel, readInt);
                            sb.append("\"");
                            sb.append(c2 == null ? null : Base64.encodeToString(c2, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle b2 = SafeParcelReader.b(parcel, readInt);
                            Set<String> keySet = b2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str4 : keySet) {
                                if (!z2) {
                                    sb.append(StringUtils.COMMA);
                                }
                                jh.f(sb, "\"", str4, "\":\"");
                                sb.append(nby.b(b2.getString(str4)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            int B9 = SafeParcelReader.B(parcel, readInt);
                            int dataPosition10 = parcel.dataPosition();
                            if (B9 == 0) {
                                obtain = null;
                            } else {
                                obtain = Parcel.obtain();
                                obtain.appendFrom(parcel, dataPosition10, B9);
                                parcel.setDataPosition(dataPosition10 + B9);
                            }
                            obtain.setDataPosition(0);
                            exc0.i(str2);
                            exc0.i(field.k);
                            Map map3 = (Map) field.k.c.get(str2);
                            exc0.i(map3);
                            f(sb, map3, obtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != D) {
            throw new SafeParcelReader.ParseException(z23.b(D, "Overread allowed size end=", new StringBuilder(String.valueOf(D).length() + 26)), parcel);
        }
        sb.append('}');
    }

    public static final void g(StringBuilder sb, int i, @Nullable Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                exc0.i(obj);
                sb.append(nby.b(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                return;
            case 10:
                exc0.i(obj);
                l370.K(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(z23.b(i, "Unknown type = ", new StringBuilder(String.valueOf(i).length() + 15)));
        }
    }

    public static final void i(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        boolean z = field.d;
        int i = field.c;
        if (!z) {
            g(sb, i, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append(X3.j.d);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                sb.append(StringUtils.COMMA);
            }
            g(sb, i, arrayList.get(i2));
        }
        sb.append(X3.j.e);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList<T> arrayList) {
        e(field);
        ArrayList arrayList2 = new ArrayList();
        exc0.i(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i)).d());
        }
        int i2 = field.h;
        Parcel parcel = this.c;
        int w = ozg0.w(i2, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i3);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        ozg0.x(w, parcel);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(@NonNull FastJsonResponse.Field field, @NonNull String str, @NonNull T t) {
        e(field);
        Parcel d = ((SafeParcelResponse) t).d();
        int i = field.h;
        Parcel parcel = this.c;
        if (d == null) {
            ozg0.v(parcel, i, 0);
            return;
        }
        int w = ozg0.w(i, parcel);
        parcel.appendFrom(d, 0, d.dataSize());
        ozg0.x(w, parcel);
    }

    @NonNull
    public final Parcel d() {
        int i = this.g;
        Parcel parcel = this.c;
        if (i != 0) {
            if (i != 1) {
                return parcel;
            }
            ozg0.x(this.h, parcel);
            this.g = 2;
            return parcel;
        }
        int w = ozg0.w(20293, parcel);
        this.h = w;
        ozg0.x(w, parcel);
        this.g = 2;
        return parcel;
    }

    public final void e(FastJsonResponse.Field field) {
        if (field.h == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.c;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.h = ozg0.w(20293, parcel);
            this.g = 1;
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @Nullable
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zanVar = this.e;
        if (zanVar == null) {
            return null;
        }
        String str = this.f;
        exc0.i(str);
        return (Map) zanVar.c.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    @NonNull
    public final Object getValueObject(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setBooleanInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, boolean z) {
        e(field);
        int i = field.h;
        Parcel parcel = this.c;
        ozg0.v(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable byte[] bArr) {
        e(field);
        ozg0.e(this.c, field.h, bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, int i) {
        e(field);
        int i2 = field.h;
        Parcel parcel = this.c;
        ozg0.v(parcel, i2, 4);
        parcel.writeInt(i);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setLongInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, long j) {
        e(field);
        int i = field.h;
        Parcel parcel = this.c;
        ozg0.v(parcel, i, 8);
        parcel.writeLong(j);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable String str2) {
        e(field);
        ozg0.q(this.c, field.h, str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringMapInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable Map<String, String> map) {
        e(field);
        Bundle bundle = new Bundle();
        exc0.i(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        ozg0.d(this.c, field.h, bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable ArrayList<String> arrayList) {
        e(field);
        exc0.i(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        ozg0.r(this.c, field.h, strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @NonNull
    public final String toString() {
        zan zanVar = this.e;
        exc0.j(zanVar, "Cannot convert to JSON on client side.");
        Parcel d = d();
        d.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.f;
        exc0.i(str);
        Map map = (Map) zanVar.c.get(str);
        exc0.i(map);
        f(sb, map, d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        Parcel d = d();
        if (d != null) {
            int w2 = ozg0.w(2, parcel);
            parcel.appendFrom(d, 0, d.dataSize());
            ozg0.x(w2, parcel);
        }
        ozg0.p(parcel, 3, this.d != 0 ? this.e : null, i, false);
        ozg0.x(w, parcel);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaA(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable BigDecimal bigDecimal) {
        e(field);
        ozg0.b(this.c, field.h, bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaB(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        e(field);
        exc0.i(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        int i2 = field.h;
        Parcel parcel = this.c;
        int w = ozg0.w(i2, parcel);
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(bigDecimalArr[i3].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i3].scale());
        }
        ozg0.x(w, parcel);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaC(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        e(field);
        exc0.i(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        int i2 = field.h;
        Parcel parcel = this.c;
        int w = ozg0.w(i2, parcel);
        parcel.writeBooleanArray(zArr);
        ozg0.x(w, parcel);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zas(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        e(field);
        exc0.i(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        ozg0.i(this.c, field.h, iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zat(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable BigInteger bigInteger) {
        e(field);
        int i = field.h;
        Parcel parcel = this.c;
        if (bigInteger == null) {
            ozg0.v(parcel, i, 0);
            return;
        }
        int w = ozg0.w(i, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        ozg0.x(w, parcel);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zau(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        e(field);
        exc0.i(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        int i2 = field.h;
        Parcel parcel = this.c;
        int w = ozg0.w(i2, parcel);
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(bigIntegerArr[i3].toByteArray());
        }
        ozg0.x(w, parcel);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zav(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        e(field);
        exc0.i(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        ozg0.m(this.c, field.h, jArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaw(@NonNull FastJsonResponse.Field field, @NonNull String str, float f) {
        e(field);
        int i = field.h;
        Parcel parcel = this.c;
        ozg0.v(parcel, i, 4);
        parcel.writeFloat(f);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zax(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        e(field);
        exc0.i(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        int i2 = field.h;
        Parcel parcel = this.c;
        int w = ozg0.w(i2, parcel);
        parcel.writeFloatArray(fArr);
        ozg0.x(w, parcel);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zay(@NonNull FastJsonResponse.Field field, @NonNull String str, double d) {
        e(field);
        int i = field.h;
        Parcel parcel = this.c;
        ozg0.v(parcel, i, 8);
        parcel.writeDouble(d);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaz(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        e(field);
        exc0.i(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        int i2 = field.h;
        Parcel parcel = this.c;
        int w = ozg0.w(i2, parcel);
        parcel.writeDoubleArray(dArr);
        ozg0.x(w, parcel);
    }
}
