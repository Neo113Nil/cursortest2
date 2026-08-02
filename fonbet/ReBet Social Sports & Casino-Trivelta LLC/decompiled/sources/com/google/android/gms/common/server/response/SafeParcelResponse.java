package com.google.android.gms.common.server.response;

import E9.a;
import I9.c;
import K9.l;
import K9.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @NonNull
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f32806a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f32807b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32808c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final zan f32809d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32810e;

    /* renamed from: f, reason: collision with root package name */
    public int f32811f;

    /* renamed from: g, reason: collision with root package name */
    public int f32812g;

    public SafeParcelResponse(int i10, Parcel parcel, zan zanVar) {
        this.f32806a = i10;
        this.f32807b = (Parcel) AbstractC3191o.m(parcel);
        this.f32809d = zanVar;
        this.f32810e = zanVar == null ? null : zanVar.g();
        this.f32811f = 2;
    }

    public static final void g(StringBuilder sb2, int i10, Object obj) {
        switch (i10) {
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
                sb2.append(l.a(AbstractC3191o.m(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(K9.c.c((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(K9.c.d((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                m.a(sb2, (HashMap) AbstractC3191o.m(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i10);
        }
    }

    public static final void h(StringBuilder sb2, FastJsonResponse.Field field, Object obj) {
        if (!field.f32797c) {
            g(sb2, field.f32796b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            g(sb2, field.f32796b, arrayList.get(i10));
        }
        sb2.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        e(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) AbstractC3191o.m(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((SafeParcelResponse) ((FastJsonResponse) arrayList.get(i10))).d());
        }
        E9.b.C(this.f32807b, field.m(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        e(field);
        E9.b.B(this.f32807b, field.m(), ((SafeParcelResponse) fastJsonResponse).d(), true);
    }

    public final Parcel d() {
        int i10 = this.f32811f;
        if (i10 == 0) {
            int a10 = E9.b.a(this.f32807b);
            this.f32812g = a10;
            E9.b.b(this.f32807b, a10);
            this.f32811f = 2;
        } else if (i10 == 1) {
            E9.b.b(this.f32807b, this.f32812g);
            this.f32811f = 2;
        }
        return this.f32807b;
    }

    public final void e(FastJsonResponse.Field field) {
        if (field.f32801g == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f32807b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i10 = this.f32811f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f32812g = E9.b.a(parcel);
            this.f32811f = 1;
        }
    }

    public final void f(StringBuilder sb2, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).m(), entry);
        }
        sb2.append('{');
        int N10 = E9.a.N(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(E9.a.w(E10));
            if (entry2 != null) {
                if (z10) {
                    sb2.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (field.f0()) {
                    int i10 = field.f32798d;
                    switch (i10) {
                        case 0:
                            h(sb2, field, FastJsonResponse.zaD(field, Integer.valueOf(E9.a.G(parcel, E10))));
                            break;
                        case 1:
                            h(sb2, field, FastJsonResponse.zaD(field, E9.a.c(parcel, E10)));
                            break;
                        case 2:
                            h(sb2, field, FastJsonResponse.zaD(field, Long.valueOf(E9.a.I(parcel, E10))));
                            break;
                        case 3:
                            h(sb2, field, FastJsonResponse.zaD(field, Float.valueOf(E9.a.C(parcel, E10))));
                            break;
                        case 4:
                            h(sb2, field, FastJsonResponse.zaD(field, Double.valueOf(E9.a.A(parcel, E10))));
                            break;
                        case 5:
                            h(sb2, field, FastJsonResponse.zaD(field, E9.a.a(parcel, E10)));
                            break;
                        case 6:
                            h(sb2, field, FastJsonResponse.zaD(field, Boolean.valueOf(E9.a.x(parcel, E10))));
                            break;
                        case 7:
                            h(sb2, field, FastJsonResponse.zaD(field, E9.a.q(parcel, E10)));
                            break;
                        case 8:
                        case 9:
                            h(sb2, field, FastJsonResponse.zaD(field, E9.a.g(parcel, E10)));
                            break;
                        case 10:
                            Bundle f10 = E9.a.f(parcel, E10);
                            HashMap hashMap = new HashMap();
                            for (String str2 : f10.keySet()) {
                                hashMap.put(str2, (String) AbstractC3191o.m(f10.getString(str2)));
                            }
                            h(sb2, field, FastJsonResponse.zaD(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i10);
                    }
                } else if (field.f32799e) {
                    sb2.append("[");
                    switch (field.f32798d) {
                        case 0:
                            K9.b.f(sb2, E9.a.k(parcel, E10));
                            break;
                        case 1:
                            K9.b.h(sb2, E9.a.d(parcel, E10));
                            break;
                        case 2:
                            K9.b.g(sb2, E9.a.m(parcel, E10));
                            break;
                        case 3:
                            K9.b.e(sb2, E9.a.j(parcel, E10));
                            break;
                        case 4:
                            K9.b.d(sb2, E9.a.i(parcel, E10));
                            break;
                        case 5:
                            K9.b.h(sb2, E9.a.b(parcel, E10));
                            break;
                        case 6:
                            K9.b.i(sb2, E9.a.e(parcel, E10));
                            break;
                        case 7:
                            K9.b.j(sb2, E9.a.r(parcel, E10));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] o10 = E9.a.o(parcel, E10);
                            int length = o10.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                if (i11 > 0) {
                                    sb2.append(",");
                                }
                                o10[i11].setDataPosition(0);
                                f(sb2, field.d0(), o10[i11]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb2.append("]");
                } else {
                    switch (field.f32798d) {
                        case 0:
                            sb2.append(E9.a.G(parcel, E10));
                            break;
                        case 1:
                            sb2.append(E9.a.c(parcel, E10));
                            break;
                        case 2:
                            sb2.append(E9.a.I(parcel, E10));
                            break;
                        case 3:
                            sb2.append(E9.a.C(parcel, E10));
                            break;
                        case 4:
                            sb2.append(E9.a.A(parcel, E10));
                            break;
                        case 5:
                            sb2.append(E9.a.a(parcel, E10));
                            break;
                        case 6:
                            sb2.append(E9.a.x(parcel, E10));
                            break;
                        case 7:
                            String q10 = E9.a.q(parcel, E10);
                            sb2.append("\"");
                            sb2.append(l.a(q10));
                            sb2.append("\"");
                            break;
                        case 8:
                            byte[] g10 = E9.a.g(parcel, E10);
                            sb2.append("\"");
                            sb2.append(K9.c.c(g10));
                            sb2.append("\"");
                            break;
                        case 9:
                            byte[] g11 = E9.a.g(parcel, E10);
                            sb2.append("\"");
                            sb2.append(K9.c.d(g11));
                            sb2.append("\"");
                            break;
                        case 10:
                            Bundle f11 = E9.a.f(parcel, E10);
                            Set<String> keySet = f11.keySet();
                            sb2.append("{");
                            boolean z11 = true;
                            for (String str3 : keySet) {
                                if (!z11) {
                                    sb2.append(",");
                                }
                                sb2.append("\"");
                                sb2.append(str3);
                                sb2.append("\":\"");
                                sb2.append(l.a(f11.getString(str3)));
                                sb2.append("\"");
                                z11 = false;
                            }
                            sb2.append("}");
                            break;
                        case 11:
                            Parcel n10 = E9.a.n(parcel, E10);
                            n10.setDataPosition(0);
                            f(sb2, field.d0(), n10);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() == N10) {
            sb2.append('}');
            return;
        }
        throw new a.C0068a("Overread allowed size end=" + N10, parcel);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        zan zanVar = this.f32809d;
        if (zanVar == null) {
            return null;
        }
        return zanVar.h((String) AbstractC3191o.m(this.f32810e));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setBooleanInternal(FastJsonResponse.Field field, String str, boolean z10) {
        e(field);
        E9.b.g(this.f32807b, field.m(), z10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(FastJsonResponse.Field field, String str, byte[] bArr) {
        e(field);
        E9.b.l(this.f32807b, field.m(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(FastJsonResponse.Field field, String str, int i10) {
        e(field);
        E9.b.u(this.f32807b, field.m(), i10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setLongInternal(FastJsonResponse.Field field, String str, long j10) {
        e(field);
        E9.b.y(this.f32807b, field.m(), j10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        e(field);
        E9.b.F(this.f32807b, field.m(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringMapInternal(FastJsonResponse.Field field, String str, Map map) {
        e(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) AbstractC3191o.m(map)).keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        E9.b.j(this.f32807b, field.m(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        e(field);
        int size = ((ArrayList) AbstractC3191o.m(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = (String) arrayList.get(i10);
        }
        E9.b.G(this.f32807b, field.m(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        AbstractC3191o.n(this.f32809d, "Cannot convert to JSON on client side.");
        Parcel d10 = d();
        d10.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        f(sb2, (Map) AbstractC3191o.m(this.f32809d.h((String) AbstractC3191o.m(this.f32810e))), d10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32806a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.B(parcel, 2, d(), false);
        int i12 = this.f32808c;
        E9.b.D(parcel, 3, i12 != 0 ? i12 != 1 ? this.f32809d : this.f32809d : null, i10, false);
        E9.b.b(parcel, a10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zab(FastJsonResponse.Field field, String str, BigDecimal bigDecimal) {
        e(field);
        E9.b.c(this.f32807b, field.m(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zad(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        e(field);
        int size = ((ArrayList) AbstractC3191o.m(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        E9.b.d(this.f32807b, field.m(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaf(FastJsonResponse.Field field, String str, BigInteger bigInteger) {
        e(field);
        E9.b.e(this.f32807b, field.m(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zah(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        e(field);
        int size = ((ArrayList) AbstractC3191o.m(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        E9.b.f(this.f32807b, field.m(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zak(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        e(field);
        int size = ((ArrayList) AbstractC3191o.m(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        E9.b.h(this.f32807b, field.m(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zan(FastJsonResponse.Field field, String str, double d10) {
        e(field);
        E9.b.n(this.f32807b, field.m(), d10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zap(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        e(field);
        int size = ((ArrayList) AbstractC3191o.m(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        E9.b.o(this.f32807b, field.m(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zar(FastJsonResponse.Field field, String str, float f10) {
        e(field);
        E9.b.q(this.f32807b, field.m(), f10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zat(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        e(field);
        int size = ((ArrayList) AbstractC3191o.m(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        E9.b.r(this.f32807b, field.m(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaw(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        e(field);
        int size = ((ArrayList) AbstractC3191o.m(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        E9.b.v(this.f32807b, field.m(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaz(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        e(field);
        int size = ((ArrayList) AbstractC3191o.m(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        E9.b.z(this.f32807b, field.m(), jArr, true);
    }
}
