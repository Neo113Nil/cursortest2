package com.google.android.gms.fido.fido2.api.common;

import R9.EnumC1550a;
import R9.EnumC1551b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.fido.fido2.api.common.a f32902a;

    public static class a extends Exception {
        public a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    public COSEAlgorithmIdentifier(com.google.android.gms.fido.fido2.api.common.a aVar) {
        this.f32902a = (com.google.android.gms.fido.fido2.api.common.a) AbstractC3191o.m(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier a(int i10) {
        EnumC1551b enumC1551b;
        if (i10 == EnumC1551b.LEGACY_RS1.a()) {
            enumC1551b = EnumC1551b.RS1;
        } else {
            EnumC1551b[] values = EnumC1551b.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (EnumC1551b enumC1551b2 : EnumC1550a.values()) {
                        if (enumC1551b2.a() == i10) {
                            enumC1551b = enumC1551b2;
                        }
                    }
                    throw new a(i10);
                }
                EnumC1551b enumC1551b3 = values[i11];
                if (enumC1551b3.a() == i10) {
                    enumC1551b = enumC1551b3;
                    break;
                }
                i11++;
            }
        }
        return new COSEAlgorithmIdentifier(enumC1551b);
    }

    public int b() {
        return this.f32902a.a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f32902a.a() == ((COSEAlgorithmIdentifier) obj).f32902a.a();
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32902a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32902a.a());
    }
}
