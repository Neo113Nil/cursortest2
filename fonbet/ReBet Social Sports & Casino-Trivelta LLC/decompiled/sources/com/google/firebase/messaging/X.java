package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class X implements Parcelable.Creator {
    public static void c(RemoteMessage remoteMessage, Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.j(parcel, 2, remoteMessage.f37866a, false);
        E9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            if (E9.a.w(E10) != 2) {
                E9.a.M(parcel, E10);
            } else {
                bundle = E9.a.f(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
