package com.google.android.gms.location;

import E9.b;
import V9.F;
import V9.InterfaceC1750f;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzdh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    public final List f33073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33074b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33075c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33076d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f33077a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public int f33078b = 5;

        /* renamed from: c, reason: collision with root package name */
        public String f33079c = "";

        public a a(InterfaceC1750f interfaceC1750f) {
            AbstractC3191o.n(interfaceC1750f, "geofence can't be null.");
            AbstractC3191o.b(interfaceC1750f instanceof zzdh, "Geofence must be created using Geofence.Builder.");
            this.f33077a.add((zzdh) interfaceC1750f);
            return this;
        }

        public a b(List list) {
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC1750f interfaceC1750f = (InterfaceC1750f) it.next();
                    if (interfaceC1750f != null) {
                        a(interfaceC1750f);
                    }
                }
            }
            return this;
        }

        public GeofencingRequest c() {
            AbstractC3191o.b(!this.f33077a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.f33077a, this.f33078b, this.f33079c, null);
        }

        public a d(int i10) {
            this.f33078b = i10 & 7;
            return this;
        }
    }

    public GeofencingRequest(List list, int i10, String str, String str2) {
        this.f33073a = list;
        this.f33074b = i10;
        this.f33075c = str;
        this.f33076d = str2;
    }

    public int g() {
        return this.f33074b;
    }

    public final GeofencingRequest h(String str) {
        return new GeofencingRequest(this.f33073a, this.f33074b, this.f33075c, str);
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f33073a + ", initialTrigger=" + this.f33074b + ", tag=" + this.f33075c + ", attributionTag=" + this.f33076d + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.J(parcel, 1, this.f33073a, false);
        b.u(parcel, 2, g());
        b.F(parcel, 3, this.f33075c, false);
        b.F(parcel, 4, this.f33076d, false);
        b.b(parcel, a10);
    }
}
