package com.google.android.gms.identity.intents;

import E9.b;
import T9.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public List f33024a;

    public UserAddressRequest(List list) {
        this.f33024a = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.J(parcel, 2, this.f33024a, false);
        b.b(parcel, a10);
    }
}
