package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class CardRequirements extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CardRequirements> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f34503a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34504b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34505c;

    /* renamed from: d, reason: collision with root package name */
    public int f34506d;

    public CardRequirements(ArrayList arrayList, boolean z10, boolean z11, int i10) {
        this.f34503a = arrayList;
        this.f34504b = z10;
        this.f34505c = z11;
        this.f34506d = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.w(parcel, 1, this.f34503a, false);
        E9.b.g(parcel, 2, this.f34504b);
        E9.b.g(parcel, 3, this.f34505c);
        E9.b.u(parcel, 4, this.f34506d);
        E9.b.b(parcel, a10);
    }
}
