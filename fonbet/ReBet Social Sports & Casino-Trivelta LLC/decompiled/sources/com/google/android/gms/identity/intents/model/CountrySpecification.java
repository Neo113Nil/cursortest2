package com.google.android.gms.identity.intents.model;

import E9.b;
import U9.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class CountrySpecification extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f33025a;

    public CountrySpecification(String str) {
        this.f33025a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 2, this.f33025a, false);
        b.b(parcel, a10);
    }
}
