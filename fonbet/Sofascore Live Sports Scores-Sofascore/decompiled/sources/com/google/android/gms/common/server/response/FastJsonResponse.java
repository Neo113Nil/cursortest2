package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.dmi;
import defpackage.is8;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class FastJsonResponse {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @ShowFirstParty
    public interface FieldConverter<I, O> {
        String u0(Object obj);
    }

    public static final void g(StringBuilder sb, Field field, Object obj) {
        int i = field.b;
        if (i == 11) {
            Class cls = field.h;
            Preconditions.i(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(JsonUtils.b((String) obj));
            sb.append("\"");
        }
    }

    public abstract Map a();

    public Object b(Field field) {
        String str = field.f;
        if (field.h == null) {
            return c();
        }
        if (!(c() == null)) {
            a70.r(dmi.q("Concrete field shouldn't be value object: ", str));
            return null;
        }
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 3 + substring.length());
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), null).invoke(this, null);
        } catch (Exception e) {
            is8.h(e);
            return null;
        }
    }

    public abstract Object c();

    public boolean d(Field field) {
        if (field.d != 11) {
            return f();
        }
        if (field.e) {
            a70.m("Concrete type arrays not supported");
            return false;
        }
        a70.m("Concrete types not supported");
        return false;
    }

    public abstract boolean f();

    public String toString() {
        Map a = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a.keySet()) {
            Field field = (Field) a.get(str);
            if (d(field)) {
                Object b = b(field);
                FieldConverter fieldConverter = field.k;
                if (fieldConverter != null) {
                    b = fieldConverter.u0(b);
                }
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                wt3.A("\"", str, sb, "\":");
                if (b != null) {
                    switch (field.d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) b, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) b, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.a(sb, (HashMap) b);
                            break;
                        default:
                            if (field.c) {
                                ArrayList arrayList = (ArrayList) b;
                                sb.append(U3.j.d);
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        g(sb, field, obj);
                                    }
                                }
                                sb.append(U3.j.e);
                                break;
                            } else {
                                g(sb, field, b);
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @SafeParcelable.Class
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        public final int a;
        public final int b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final String f;
        public final int g;
        public final Class h;
        public final String i;
        public zan j;
        public final FieldConverter k;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaaVar) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
            this.e = z2;
            this.f = str;
            this.g = i4;
            if (str2 == null) {
                this.h = null;
                this.i = null;
            } else {
                this.h = SafeParcelResponse.class;
                this.i = str2;
            }
            if (zaaVar == null) {
                this.k = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaaVar.b;
            if (stringToIntConverter != null) {
                this.k = stringToIntConverter;
            } else {
                a70.r("There was no converter wrapped in this ConverterWrapper.");
                throw null;
            }
        }

        public static Field Y0(int i, String str) {
            return new Field(7, true, 7, true, str, i, null);
        }

        public final String toString() {
            Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
            toStringHelper.a(Integer.valueOf(this.a), "versionCode");
            toStringHelper.a(Integer.valueOf(this.b), "typeIn");
            toStringHelper.a(Boolean.valueOf(this.c), "typeInArray");
            toStringHelper.a(Integer.valueOf(this.d), "typeOut");
            toStringHelper.a(Boolean.valueOf(this.e), "typeOutArray");
            toStringHelper.a(this.f, "outputFieldName");
            toStringHelper.a(Integer.valueOf(this.g), "safeParcelFieldId");
            String str = this.i;
            if (str == null) {
                str = null;
            }
            toStringHelper.a(str, "concreteTypeName");
            Class cls = this.h;
            if (cls != null) {
                toStringHelper.a(cls.getCanonicalName(), "concreteType.class");
            }
            FieldConverter fieldConverter = this.k;
            if (fieldConverter != null) {
                toStringHelper.a(fieldConverter.getClass().getCanonicalName(), "converterName");
            }
            return toStringHelper.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int s = SafeParcelWriter.s(parcel, 20293);
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.a);
            SafeParcelWriter.r(parcel, 2, 4);
            parcel.writeInt(this.b);
            SafeParcelWriter.r(parcel, 3, 4);
            parcel.writeInt(this.c ? 1 : 0);
            SafeParcelWriter.r(parcel, 4, 4);
            parcel.writeInt(this.d);
            SafeParcelWriter.r(parcel, 5, 4);
            parcel.writeInt(this.e ? 1 : 0);
            SafeParcelWriter.m(parcel, 6, this.f, false);
            SafeParcelWriter.r(parcel, 7, 4);
            parcel.writeInt(this.g);
            zaa zaaVar = null;
            String str = this.i;
            if (str == null) {
                str = null;
            }
            SafeParcelWriter.m(parcel, 8, str, false);
            FieldConverter fieldConverter = this.k;
            if (fieldConverter != null) {
                if (!(fieldConverter instanceof StringToIntConverter)) {
                    Parcelable.Creator<zaa> creator = zaa.CREATOR;
                    a70.p("Unsupported safe parcelable field converter class.");
                    return;
                }
                zaaVar = new zaa((StringToIntConverter) fieldConverter);
            }
            SafeParcelWriter.l(parcel, 9, zaaVar, i, false);
            SafeParcelWriter.t(parcel, s);
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
            this.a = 1;
            this.b = i;
            this.c = z;
            this.d = i2;
            this.e = z2;
            this.f = str;
            this.g = i3;
            this.h = cls;
            if (cls == null) {
                this.i = null;
            } else {
                this.i = cls.getCanonicalName();
            }
            this.k = null;
        }
    }
}
