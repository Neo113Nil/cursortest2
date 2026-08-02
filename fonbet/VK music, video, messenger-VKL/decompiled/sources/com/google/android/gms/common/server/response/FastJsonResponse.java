package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import xsna.dq70;
import xsna.exc0;
import xsna.go9;
import xsna.jh;
import xsna.l370;
import xsna.nby;
import xsna.ozg0;
import xsna.z23;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public interface a<I, O> {
    }

    @NonNull
    public static final Object zaD(@NonNull Field field, @Nullable Object obj) {
        a aVar = field.l;
        if (aVar != null) {
            StringToIntConverter stringToIntConverter = (StringToIntConverter) aVar;
            obj = (String) stringToIntConverter.d.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.c.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zaE(Field field, @Nullable Object obj) {
        int i = field.e;
        a aVar = field.l;
        exc0.i(aVar);
        HashMap hashMap = ((StringToIntConverter) aVar).c;
        Integer num = (Integer) hashMap.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) hashMap.get("gms_unknown");
        }
        exc0.i(num2);
        String str = field.g;
        switch (i) {
            case 0:
                setIntegerInternal(field, str, num2.intValue());
                return;
            case 1:
                zat(field, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(field, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(z23.b(i, "Unsupported type for conversion: ", new StringBuilder(String.valueOf(i).length() + 33)));
            case 4:
                zay(field, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zaA(field, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(field, str, ((Boolean) num2).booleanValue());
                return;
            case 7:
                setStringInternal(field, str, (String) num2);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(field, str, (byte[]) num2);
                return;
        }
    }

    private static final void zaF(StringBuilder sb, Field field, Object obj) {
        int i = field.c;
        if (i == 11) {
            Class cls = field.i;
            exc0.i(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(nby.b((String) obj));
            sb.append("\"");
        }
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb.toString());
        }
    }

    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@NonNull Field field, @NonNull String str, @Nullable ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(@NonNull Field field, @NonNull String str, @NonNull T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @NonNull
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @Nullable
    public Object getFieldValue(@NonNull Field field) {
        String str = field.g;
        if (field.i == null) {
            return getValueObject(str);
        }
        if (!(getValueObject(str) == null)) {
            throw new IllegalStateException(go9.b("Concrete field shouldn't be value object: ", str));
        }
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 3 + String.valueOf(substring).length());
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), null).invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public abstract Object getValueObject(@NonNull String str);

    public boolean isFieldSet(@NonNull Field field) {
        if (field.e != 11) {
            return isPrimitiveFieldSet(field.g);
        }
        if (field.f) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(@NonNull String str);

    public void setBooleanInternal(@NonNull Field<?, ?> field, @NonNull String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(@NonNull Field<?, ?> field, @NonNull String str, @Nullable byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(@NonNull Field<?, ?> field, @NonNull String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(@NonNull Field<?, ?> field, @NonNull String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(@NonNull Field<?, ?> field, @NonNull String str, @Nullable String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(@NonNull Field<?, ?> field, @NonNull String str, @Nullable Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(@NonNull Field<?, ?> field, @NonNull String str, @Nullable ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @NonNull
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object zaD = zaD(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(StringUtils.COMMA);
                }
                jh.f(sb, "\"", str, "\":");
                if (zaD != null) {
                    switch (field.e) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            l370.K(sb, (HashMap) zaD);
                            break;
                        default:
                            if (field.d) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append(X3.j.d);
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(StringUtils.COMMA);
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaF(sb, field, obj);
                                    }
                                }
                                sb.append(X3.j.e);
                                break;
                            } else {
                                zaF(sb, field, zaD);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public void zaA(@NonNull Field field, @NonNull String str, @Nullable BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public void zaB(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public void zaC(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zaa(@NonNull Field field, int i) {
        if (field.l != null) {
            zaE(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.g, i);
        }
    }

    public final void zab(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.l != null) {
            zaE(field, arrayList);
        } else {
            zas(field, field.g, arrayList);
        }
    }

    public final void zac(@NonNull Field field, @Nullable BigInteger bigInteger) {
        if (field.l != null) {
            zaE(field, bigInteger);
        } else {
            zat(field, field.g, bigInteger);
        }
    }

    public final void zad(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.l != null) {
            zaE(field, arrayList);
        } else {
            zau(field, field.g, arrayList);
        }
    }

    public final void zae(@NonNull Field field, long j) {
        if (field.l != null) {
            zaE(field, Long.valueOf(j));
        } else {
            setLongInternal(field, field.g, j);
        }
    }

    public final void zaf(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.l != null) {
            zaE(field, arrayList);
        } else {
            zav(field, field.g, arrayList);
        }
    }

    public final void zag(@NonNull Field field, float f) {
        if (field.l != null) {
            zaE(field, Float.valueOf(f));
        } else {
            zaw(field, field.g, f);
        }
    }

    public final void zah(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.l != null) {
            zaE(field, arrayList);
        } else {
            zax(field, field.g, arrayList);
        }
    }

    public final void zai(@NonNull Field field, double d) {
        if (field.l != null) {
            zaE(field, Double.valueOf(d));
        } else {
            zay(field, field.g, d);
        }
    }

    public final void zaj(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.l != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.g, arrayList);
        }
    }

    public final void zak(@NonNull Field field, @Nullable BigDecimal bigDecimal) {
        if (field.l != null) {
            zaE(field, bigDecimal);
        } else {
            zaA(field, field.g, bigDecimal);
        }
    }

    public final void zal(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.l != null) {
            zaE(field, arrayList);
        } else {
            zaB(field, field.g, arrayList);
        }
    }

    public final void zam(@NonNull Field field, boolean z) {
        if (field.l != null) {
            zaE(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.g, z);
        }
    }

    public final void zan(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.l != null) {
            zaE(field, arrayList);
        } else {
            zaC(field, field.g, arrayList);
        }
    }

    public final void zao(@NonNull Field field, @Nullable String str) {
        if (field.l != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.g, str);
        }
    }

    public final void zap(@NonNull Field field, @Nullable ArrayList arrayList) {
        if (field.l != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.g, arrayList);
        }
    }

    public final void zaq(@NonNull Field field, @Nullable byte[] bArr) {
        if (field.l != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.g, bArr);
        }
    }

    public final void zar(@NonNull Field field, @Nullable Map map) {
        if (field.l != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.g, map);
        }
    }

    public void zas(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public void zat(@NonNull Field field, @NonNull String str, @Nullable BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public void zau(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public void zav(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    public void zaw(@NonNull Field field, @NonNull String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public void zax(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public void zay(@NonNull Field field, @NonNull String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public void zaz(@NonNull Field field, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.a CREATOR = new com.google.android.gms.common.server.response.a();
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;
        public final boolean f;

        @NonNull
        public final String g;
        public final int h;

        @Nullable
        public final Class i;

        @Nullable
        public final String j;
        public zan k;

        @Nullable
        public final a l;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, @Nullable String str2, @Nullable zaa zaaVar) {
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
            this.f = z2;
            this.g = str;
            this.h = i4;
            if (str2 == null) {
                this.i = null;
                this.j = null;
            } else {
                this.i = SafeParcelResponse.class;
                this.j = str2;
            }
            if (zaaVar == null) {
                this.l = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaaVar.c;
            if (stringToIntConverter == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.l = stringToIntConverter;
        }

        @NonNull
        public static Field b(int i, @NonNull String str) {
            return new Field(7, true, 7, true, str, i, null);
        }

        @NonNull
        public final String toString() {
            dq70.a aVar = new dq70.a(this);
            aVar.a(Integer.valueOf(this.b), "versionCode");
            aVar.a(Integer.valueOf(this.c), "typeIn");
            aVar.a(Boolean.valueOf(this.d), "typeInArray");
            aVar.a(Integer.valueOf(this.e), "typeOut");
            aVar.a(Boolean.valueOf(this.f), "typeOutArray");
            aVar.a(this.g, "outputFieldName");
            aVar.a(Integer.valueOf(this.h), "safeParcelFieldId");
            String str = this.j;
            if (str == null) {
                str = null;
            }
            aVar.a(str, "concreteTypeName");
            Class cls = this.i;
            if (cls != null) {
                aVar.a(cls.getCanonicalName(), "concreteType.class");
            }
            a aVar2 = this.l;
            if (aVar2 != null) {
                aVar.a(aVar2.getClass().getCanonicalName(), "converterName");
            }
            return aVar.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int w = ozg0.w(20293, parcel);
            ozg0.v(parcel, 1, 4);
            parcel.writeInt(this.b);
            ozg0.v(parcel, 2, 4);
            parcel.writeInt(this.c);
            ozg0.v(parcel, 3, 4);
            parcel.writeInt(this.d ? 1 : 0);
            ozg0.v(parcel, 4, 4);
            parcel.writeInt(this.e);
            ozg0.v(parcel, 5, 4);
            parcel.writeInt(this.f ? 1 : 0);
            ozg0.q(parcel, 6, this.g, false);
            ozg0.v(parcel, 7, 4);
            parcel.writeInt(this.h);
            zaa zaaVar = null;
            String str = this.j;
            if (str == null) {
                str = null;
            }
            ozg0.q(parcel, 8, str, false);
            a aVar = this.l;
            if (aVar != null) {
                if (!(aVar instanceof StringToIntConverter)) {
                    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
                }
                zaaVar = new zaa((StringToIntConverter) aVar);
            }
            ozg0.p(parcel, 9, zaaVar, i, false);
            ozg0.x(w, parcel);
        }

        public Field(int i, boolean z, int i2, boolean z2, @NonNull String str, int i3, @Nullable Class cls) {
            this.b = 1;
            this.c = i;
            this.d = z;
            this.e = i2;
            this.f = z2;
            this.g = str;
            this.h = i3;
            this.i = cls;
            if (cls == null) {
                this.j = null;
            } else {
                this.j = cls.getCanonicalName();
            }
            this.l = null;
        }
    }
}
