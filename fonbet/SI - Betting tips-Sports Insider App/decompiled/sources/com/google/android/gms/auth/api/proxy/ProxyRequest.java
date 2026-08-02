package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ProxyRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new b(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f4374a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4375b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4376c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4377d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4378e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f4379f;

    public ProxyRequest(int i5, String str, int i10, long j, byte[] bArr, Bundle bundle) {
        this.f4378e = i5;
        this.f4374a = str;
        this.f4375b = i10;
        this.f4376c = j;
        this.f4377d = bArr;
        this.f4379f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f4374a + ", method: " + this.f4375b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4374a, false);
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f4375b);
        h8.b.U(parcel, 3, 8);
        parcel.writeLong(this.f4376c);
        h8.b.G(parcel, 4, this.f4377d, false);
        h8.b.F(parcel, 5, this.f4379f);
        h8.b.U(parcel, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 4);
        parcel.writeInt(this.f4378e);
        h8.b.W(parcel, V);
    }
}
