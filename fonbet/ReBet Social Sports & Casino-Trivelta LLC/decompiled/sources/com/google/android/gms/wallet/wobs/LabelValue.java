package com.google.android.gms.wallet.wobs;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ha.e;

/* loaded from: classes2.dex */
public final class LabelValue extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LabelValue> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public String f34646a;

    /* renamed from: b, reason: collision with root package name */
    public String f34647b;

    public LabelValue(String str, String str2) {
        this.f34646a = str;
        this.f34647b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 2, this.f34646a, false);
        b.F(parcel, 3, this.f34647b, false);
        b.b(parcel, a10);
    }
}
