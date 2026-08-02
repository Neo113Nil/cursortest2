package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import h8.b;
import o6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FastJsonResponse$Field<I, O> extends AbstractSafeParcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f4582a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4583b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4584c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4585d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4586e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4587f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4588g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f4589h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4590i;
    public zan j;

    /* renamed from: k, reason: collision with root package name */
    public final StringToIntConverter f4591k;

    public FastJsonResponse$Field(int i5, int i10, boolean z5, int i11, boolean z7, String str, int i12, String str2, zaa zaaVar) {
        this.f4582a = i5;
        this.f4583b = i10;
        this.f4584c = z5;
        this.f4585d = i11;
        this.f4586e = z7;
        this.f4587f = str;
        this.f4588g = i12;
        if (str2 == null) {
            this.f4589h = null;
            this.f4590i = null;
        } else {
            this.f4589h = SafeParcelResponse.class;
            this.f4590i = str2;
        }
        if (zaaVar == null) {
            this.f4591k = null;
            return;
        }
        StringToIntConverter stringToIntConverter = zaaVar.f4578b;
        if (stringToIntConverter == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.f4591k = stringToIntConverter;
    }

    public static FastJsonResponse$Field c(int i5, String str) {
        return new FastJsonResponse$Field(7, true, 7, true, str, i5, null);
    }

    public final String toString() {
        l1.a aVar = new l1.a(this);
        aVar.i(Integer.valueOf(this.f4582a), "versionCode");
        aVar.i(Integer.valueOf(this.f4583b), "typeIn");
        aVar.i(Boolean.valueOf(this.f4584c), "typeInArray");
        aVar.i(Integer.valueOf(this.f4585d), "typeOut");
        aVar.i(Boolean.valueOf(this.f4586e), "typeOutArray");
        aVar.i(this.f4587f, "outputFieldName");
        aVar.i(Integer.valueOf(this.f4588g), "safeParcelFieldId");
        String str = this.f4590i;
        if (str == null) {
            str = null;
        }
        aVar.i(str, "concreteTypeName");
        Class cls = this.f4589h;
        if (cls != null) {
            aVar.i(cls.getCanonicalName(), "concreteType.class");
        }
        StringToIntConverter stringToIntConverter = this.f4591k;
        if (stringToIntConverter != null) {
            aVar.i(stringToIntConverter.getClass().getCanonicalName(), "converterName");
        }
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4582a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4583b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4584c ? 1 : 0);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f4585d);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f4586e ? 1 : 0);
        b.O(parcel, 6, this.f4587f, false);
        b.U(parcel, 7, 4);
        parcel.writeInt(this.f4588g);
        zaa zaaVar = null;
        String str = this.f4590i;
        if (str == null) {
            str = null;
        }
        b.O(parcel, 8, str, false);
        StringToIntConverter stringToIntConverter = this.f4591k;
        if (stringToIntConverter != null) {
            if (!(stringToIntConverter instanceof StringToIntConverter)) {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
            zaaVar = new zaa(stringToIntConverter);
        }
        b.N(parcel, 9, zaaVar, i5, false);
        b.W(parcel, V);
    }

    public FastJsonResponse$Field(int i5, boolean z5, int i10, boolean z7, String str, int i11, Class cls) {
        this.f4582a = 1;
        this.f4583b = i5;
        this.f4584c = z5;
        this.f4585d = i10;
        this.f4586e = z7;
        this.f4587f = str;
        this.f4588g = i11;
        this.f4589h = cls;
        if (cls == null) {
            this.f4590i = null;
        } else {
            this.f4590i = cls.getCanonicalName();
        }
        this.f4591k = null;
    }
}
