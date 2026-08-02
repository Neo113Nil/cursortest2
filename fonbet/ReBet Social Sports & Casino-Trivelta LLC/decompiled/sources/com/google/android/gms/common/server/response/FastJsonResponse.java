package com.google.android.gms.common.server.response;

import K9.c;
import K9.l;
import K9.m;
import android.os.Parcel;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class FastJsonResponse {

    public interface a {
        Object e(Object obj);

        Object f(Object obj);
    }

    public static final void b(StringBuilder sb2, Field field, Object obj) {
        int i10 = field.f32796b;
        if (i10 == 11) {
            Class cls = field.f32802h;
            AbstractC3191o.m(cls);
            sb2.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i10 != 7) {
                sb2.append(obj);
                return;
            }
            sb2.append("\"");
            sb2.append(l.a((String) obj));
            sb2.append("\"");
        }
    }

    public static final void c(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    @NonNull
    public static final Object zaD(@NonNull Field field, Object obj) {
        return field.f32805k != null ? field.Z(obj) : obj;
    }

    public final void a(Field field, Object obj) {
        int i10 = field.f32798d;
        Object Y10 = field.Y(obj);
        String str = field.f32800f;
        switch (i10) {
            case 0:
                if (Y10 != null) {
                    setIntegerInternal(field, str, ((Integer) Y10).intValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 1:
                zaf(field, str, (BigInteger) Y10);
                return;
            case 2:
                if (Y10 != null) {
                    setLongInternal(field, str, ((Long) Y10).longValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i10);
            case 4:
                if (Y10 != null) {
                    zan(field, str, ((Double) Y10).doubleValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 5:
                zab(field, str, (BigDecimal) Y10);
                return;
            case 6:
                if (Y10 != null) {
                    setBooleanInternal(field, str, ((Boolean) Y10).booleanValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) Y10);
                return;
            case 8:
            case 9:
                if (Y10 != null) {
                    setDecodedBytesInternal(field, str, (byte[]) Y10);
                    return;
                } else {
                    c(str);
                    return;
                }
        }
    }

    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@NonNull Field field, @NonNull String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(@NonNull Field field, @NonNull String str, @NonNull T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @NonNull
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    public Object getFieldValue(@NonNull Field field) {
        String str = field.f32800f;
        if (field.f32802h == null) {
            return getValueObject(str);
        }
        AbstractC3191o.r(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.f32800f);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(@NonNull Field field) {
        if (field.f32798d != 11) {
            return isPrimitiveFieldSet(field.f32800f);
        }
        if (field.f32799e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(@NonNull Field<?, ?> field, @NonNull String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(@NonNull Field<?, ?> field, @NonNull String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(@NonNull Field<?, ?> field, @NonNull String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(@NonNull Field<?, ?> field, @NonNull String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(@NonNull Field<?, ?> field, @NonNull String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(@NonNull Field<?, ?> field, @NonNull String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(@NonNull Field<?, ?> field, @NonNull String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @NonNull
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object zaD = zaD(field, getFieldValue(field));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (zaD != null) {
                    switch (field.f32798d) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(c.c((byte[]) zaD));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(c.d((byte[]) zaD));
                            sb2.append("\"");
                            break;
                        case 10:
                            m.a(sb2, (HashMap) zaD);
                            break;
                        default:
                            if (field.f32797c) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        b(sb2, field, obj);
                                    }
                                }
                                sb2.append("]");
                                break;
                            } else {
                                b(sb2, field, zaD);
                                break;
                            }
                    }
                } else {
                    sb2.append("null");
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }

    public final void zaA(@NonNull Field field, String str) {
        if (field.f32805k != null) {
            a(field, str);
        } else {
            setStringInternal(field, field.f32800f, str);
        }
    }

    public final void zaB(@NonNull Field field, Map map) {
        if (field.f32805k != null) {
            a(field, map);
        } else {
            setStringMapInternal(field, field.f32800f, map);
        }
    }

    public final void zaC(@NonNull Field field, ArrayList arrayList) {
        if (field.f32805k != null) {
            a(field, arrayList);
        } else {
            setStringsInternal(field, field.f32800f, arrayList);
        }
    }

    public final void zaa(@NonNull Field field, BigDecimal bigDecimal) {
        if (field.f32805k != null) {
            a(field, bigDecimal);
        } else {
            zab(field, field.f32800f, bigDecimal);
        }
    }

    public void zab(@NonNull Field field, @NonNull String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(@NonNull Field field, ArrayList arrayList) {
        if (field.f32805k != null) {
            a(field, arrayList);
        } else {
            zad(field, field.f32800f, arrayList);
        }
    }

    public void zad(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(@NonNull Field field, BigInteger bigInteger) {
        if (field.f32805k != null) {
            a(field, bigInteger);
        } else {
            zaf(field, field.f32800f, bigInteger);
        }
    }

    public void zaf(@NonNull Field field, @NonNull String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(@NonNull Field field, ArrayList arrayList) {
        if (field.f32805k != null) {
            a(field, arrayList);
        } else {
            zah(field, field.f32800f, arrayList);
        }
    }

    public void zah(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(@NonNull Field field, boolean z10) {
        if (field.f32805k != null) {
            a(field, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(field, field.f32800f, z10);
        }
    }

    public final void zaj(@NonNull Field field, ArrayList arrayList) {
        if (field.f32805k != null) {
            a(field, arrayList);
        } else {
            zak(field, field.f32800f, arrayList);
        }
    }

    public void zak(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(@NonNull Field field, byte[] bArr) {
        if (field.f32805k != null) {
            a(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.f32800f, bArr);
        }
    }

    public final void zam(@NonNull Field field, double d10) {
        if (field.f32805k != null) {
            a(field, Double.valueOf(d10));
        } else {
            zan(field, field.f32800f, d10);
        }
    }

    public void zan(@NonNull Field field, @NonNull String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(@NonNull Field field, ArrayList arrayList) {
        if (field.f32805k != null) {
            a(field, arrayList);
        } else {
            zap(field, field.f32800f, arrayList);
        }
    }

    public void zap(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(@NonNull Field field, float f10) {
        if (field.f32805k != null) {
            a(field, Float.valueOf(f10));
        } else {
            zar(field, field.f32800f, f10);
        }
    }

    public void zar(@NonNull Field field, @NonNull String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(@NonNull Field field, ArrayList arrayList) {
        if (field.f32805k != null) {
            a(field, arrayList);
        } else {
            zat(field, field.f32800f, arrayList);
        }
    }

    public void zat(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(@NonNull Field field, int i10) {
        if (field.f32805k != null) {
            a(field, Integer.valueOf(i10));
        } else {
            setIntegerInternal(field, field.f32800f, i10);
        }
    }

    public final void zav(@NonNull Field field, ArrayList arrayList) {
        if (field.f32805k != null) {
            a(field, arrayList);
        } else {
            zaw(field, field.f32800f, arrayList);
        }
    }

    public void zaw(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(@NonNull Field field, long j10) {
        if (field.f32805k != null) {
            a(field, Long.valueOf(j10));
        } else {
            setLongInternal(field, field.f32800f, j10);
        }
    }

    public final void zay(@NonNull Field field, ArrayList arrayList) {
        if (field.f32805k != null) {
            a(field, arrayList);
        } else {
            zaz(field, field.f32800f, arrayList);
        }
    }

    public void zaz(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.a CREATOR = new com.google.android.gms.common.server.response.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f32795a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32796b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f32797c;

        /* renamed from: d, reason: collision with root package name */
        public final int f32798d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f32799e;

        /* renamed from: f, reason: collision with root package name */
        public final String f32800f;

        /* renamed from: g, reason: collision with root package name */
        public final int f32801g;

        /* renamed from: h, reason: collision with root package name */
        public final Class f32802h;

        /* renamed from: i, reason: collision with root package name */
        public final String f32803i;

        /* renamed from: j, reason: collision with root package name */
        public zan f32804j;

        /* renamed from: k, reason: collision with root package name */
        public final a f32805k;

        public Field(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, zaa zaaVar) {
            this.f32795a = i10;
            this.f32796b = i11;
            this.f32797c = z10;
            this.f32798d = i12;
            this.f32799e = z11;
            this.f32800f = str;
            this.f32801g = i13;
            if (str2 == null) {
                this.f32802h = null;
                this.f32803i = null;
            } else {
                this.f32802h = SafeParcelResponse.class;
                this.f32803i = str2;
            }
            if (zaaVar == null) {
                this.f32805k = null;
            } else {
                this.f32805k = zaaVar.h();
            }
        }

        public static Field g(String str, int i10) {
            return new Field(8, false, 8, false, str, i10, null, null);
        }

        public static Field h(String str, int i10, Class cls) {
            return new Field(11, false, 11, false, str, i10, cls, null);
        }

        public static Field i(String str, int i10, Class cls) {
            return new Field(11, true, 11, true, str, i10, cls, null);
        }

        public static Field j(String str, int i10) {
            return new Field(0, false, 0, false, str, i10, null, null);
        }

        public static Field k(String str, int i10) {
            return new Field(7, false, 7, false, str, i10, null, null);
        }

        public static Field l(String str, int i10) {
            return new Field(7, true, 7, true, str, i10, null, null);
        }

        public final zaa N() {
            a aVar = this.f32805k;
            if (aVar == null) {
                return null;
            }
            return zaa.g(aVar);
        }

        public final Object Y(Object obj) {
            AbstractC3191o.m(this.f32805k);
            return AbstractC3191o.m(this.f32805k.f(obj));
        }

        public final Object Z(Object obj) {
            AbstractC3191o.m(this.f32805k);
            return this.f32805k.e(obj);
        }

        public final String a0() {
            String str = this.f32803i;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map d0() {
            AbstractC3191o.m(this.f32803i);
            AbstractC3191o.m(this.f32804j);
            return (Map) AbstractC3191o.m(this.f32804j.h(this.f32803i));
        }

        public final void e0(zan zanVar) {
            this.f32804j = zanVar;
        }

        public final boolean f0() {
            return this.f32805k != null;
        }

        public int m() {
            return this.f32801g;
        }

        public final String toString() {
            AbstractC3189m.a a10 = AbstractC3189m.d(this).a("versionCode", Integer.valueOf(this.f32795a)).a("typeIn", Integer.valueOf(this.f32796b)).a("typeInArray", Boolean.valueOf(this.f32797c)).a("typeOut", Integer.valueOf(this.f32798d)).a("typeOutArray", Boolean.valueOf(this.f32799e)).a("outputFieldName", this.f32800f).a("safeParcelFieldId", Integer.valueOf(this.f32801g)).a("concreteTypeName", a0());
            Class cls = this.f32802h;
            if (cls != null) {
                a10.a("concreteType.class", cls.getCanonicalName());
            }
            a aVar = this.f32805k;
            if (aVar != null) {
                a10.a("converterName", aVar.getClass().getCanonicalName());
            }
            return a10.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int i11 = this.f32795a;
            int a10 = E9.b.a(parcel);
            E9.b.u(parcel, 1, i11);
            E9.b.u(parcel, 2, this.f32796b);
            E9.b.g(parcel, 3, this.f32797c);
            E9.b.u(parcel, 4, this.f32798d);
            E9.b.g(parcel, 5, this.f32799e);
            E9.b.F(parcel, 6, this.f32800f, false);
            E9.b.u(parcel, 7, m());
            E9.b.F(parcel, 8, a0(), false);
            E9.b.D(parcel, 9, N(), i10, false);
            E9.b.b(parcel, a10);
        }

        public Field(int i10, boolean z10, int i11, boolean z11, String str, int i12, Class cls, a aVar) {
            this.f32795a = 1;
            this.f32796b = i10;
            this.f32797c = z10;
            this.f32798d = i11;
            this.f32799e = z11;
            this.f32800f = str;
            this.f32801g = i12;
            this.f32802h = cls;
            if (cls == null) {
                this.f32803i = null;
            } else {
                this.f32803i = cls.getCanonicalName();
            }
            this.f32805k = aVar;
        }
    }
}
