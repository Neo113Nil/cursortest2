package com.google.android.gms.location;

import E9.b;
import V9.S;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new S();

    /* renamed from: a, reason: collision with root package name */
    public final List f33132a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33133b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33134c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f33135a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public boolean f33136b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f33137c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f33135a.add(locationRequest);
            }
            return this;
        }

        public LocationSettingsRequest b() {
            return new LocationSettingsRequest(this.f33135a, this.f33136b, this.f33137c);
        }
    }

    public LocationSettingsRequest(List list, boolean z10, boolean z11) {
        this.f33132a = list;
        this.f33133b = z10;
        this.f33134c = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.J(parcel, 1, Collections.unmodifiableList(this.f33132a), false);
        b.g(parcel, 2, this.f33133b);
        b.g(parcel, 3, this.f33134c);
        b.b(parcel, a10);
    }
}
