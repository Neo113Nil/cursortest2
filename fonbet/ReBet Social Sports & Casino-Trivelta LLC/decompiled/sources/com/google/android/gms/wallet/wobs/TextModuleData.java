package com.google.android.gms.wallet.wobs;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ha.i;

/* loaded from: classes2.dex */
public final class TextModuleData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TextModuleData> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public String f34660a;

    /* renamed from: b, reason: collision with root package name */
    public String f34661b;

    public TextModuleData(String str, String str2) {
        this.f34660a = str;
        this.f34661b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 2, this.f34660a, false);
        b.F(parcel, 3, this.f34661b, false);
        b.b(parcel, a10);
    }
}
