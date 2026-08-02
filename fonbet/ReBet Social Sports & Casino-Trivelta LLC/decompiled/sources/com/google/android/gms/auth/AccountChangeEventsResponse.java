package com.google.android.gms.auth;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import v9.C6671f;

/* loaded from: classes2.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new C6671f();

    /* renamed from: a, reason: collision with root package name */
    public final int f32010a;

    /* renamed from: b, reason: collision with root package name */
    public final List f32011b;

    public AccountChangeEventsResponse(int i10, List list) {
        this.f32010a = i10;
        this.f32011b = (List) AbstractC3191o.m(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f32010a);
        b.J(parcel, 2, this.f32011b, false);
        b.b(parcel, a10);
    }
}
