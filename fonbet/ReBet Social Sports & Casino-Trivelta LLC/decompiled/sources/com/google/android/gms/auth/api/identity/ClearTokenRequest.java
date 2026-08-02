package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import z9.i;

/* loaded from: classes2.dex */
public class ClearTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ClearTokenRequest> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final String f32132a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32133b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f32134a;

        /* renamed from: b, reason: collision with root package name */
        public String f32135b;

        public /* synthetic */ a(ClearTokenRequest clearTokenRequest, byte[] bArr) {
            this.f32134a = clearTokenRequest.i();
            this.f32135b = clearTokenRequest.j();
        }

        public ClearTokenRequest a() {
            return new ClearTokenRequest(this.f32134a, this.f32135b);
        }

        public final a b(String str) {
            this.f32135b = str;
            return this;
        }
    }

    public ClearTokenRequest(String str, String str2) {
        this.f32132a = str;
        this.f32133b = str2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClearTokenRequest) {
            ClearTokenRequest clearTokenRequest = (ClearTokenRequest) obj;
            if (AbstractC3189m.b(this.f32132a, clearTokenRequest.f32132a) && AbstractC3189m.b(this.f32133b, clearTokenRequest.f32133b)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        return this.f32132a;
    }

    public final a h() {
        return new a(this, null);
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32132a, this.f32133b);
    }

    public final /* synthetic */ String i() {
        return this.f32132a;
    }

    public final /* synthetic */ String j() {
        return this.f32133b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, g(), false);
        E9.b.F(parcel, 2, this.f32133b, false);
        E9.b.b(parcel, a10);
    }
}
