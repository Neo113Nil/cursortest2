package com.google.android.gms.common.server.converter;

import E9.b;
import H9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f32790a;

    /* renamed from: b, reason: collision with root package name */
    public final StringToIntConverter f32791b;

    public zaa(int i10, StringToIntConverter stringToIntConverter) {
        this.f32790a = i10;
        this.f32791b = stringToIntConverter;
    }

    public static zaa g(FastJsonResponse.a aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final FastJsonResponse.a h() {
        StringToIntConverter stringToIntConverter = this.f32791b;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32790a;
        int a10 = b.a(parcel);
        b.u(parcel, 1, i11);
        b.D(parcel, 2, this.f32791b, i10, false);
        b.b(parcel, a10);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f32790a = 1;
        this.f32791b = stringToIntConverter;
    }
}
