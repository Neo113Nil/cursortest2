package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ProxyResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new b(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f4380a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f4381b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4382c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4383d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4384e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f4385f;

    public ProxyResponse(int i5, int i10, PendingIntent pendingIntent, int i11, Bundle bundle, byte[] bArr) {
        this.f4384e = i5;
        this.f4380a = i10;
        this.f4382c = i11;
        this.f4385f = bundle;
        this.f4383d = bArr;
        this.f4381b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4380a);
        h8.b.N(parcel, 2, this.f4381b, i5, false);
        h8.b.U(parcel, 3, 4);
        parcel.writeInt(this.f4382c);
        h8.b.F(parcel, 4, this.f4385f);
        h8.b.G(parcel, 5, this.f4383d, false);
        h8.b.U(parcel, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 4);
        parcel.writeInt(this.f4384e);
        h8.b.W(parcel, V);
    }
}
