package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.ArrayList;
import java.util.List;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f4255a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4256b;

    public AccountChangeEventsResponse(ArrayList arrayList, int i5) {
        this.f4255a = i5;
        v.h(arrayList);
        this.f4256b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4255a);
        h8.b.R(parcel, 2, this.f4256b, false);
        h8.b.W(parcel, V);
    }
}
