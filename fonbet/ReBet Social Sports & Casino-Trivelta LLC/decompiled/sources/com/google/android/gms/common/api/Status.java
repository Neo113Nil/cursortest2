package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements l, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f32282a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32283b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f32284c;

    /* renamed from: d, reason: collision with root package name */
    public final ConnectionResult f32285d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f32274e = new Status(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f32275f = new Status(0);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f32276g = new Status(14);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f32277h = new Status(8);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f32278i = new Status(15);

    /* renamed from: j, reason: collision with root package name */
    public static final Status f32279j = new Status(16);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f32280k = new Status(17);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f32281l = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new A();

    public Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f32282a = i10;
        this.f32283b = str;
        this.f32284c = pendingIntent;
        this.f32285d = connectionResult;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f32282a == status.f32282a && AbstractC3189m.b(this.f32283b, status.f32283b) && AbstractC3189m.b(this.f32284c, status.f32284c) && AbstractC3189m.b(this.f32285d, status.f32285d);
    }

    public ConnectionResult g() {
        return this.f32285d;
    }

    @Override // com.google.android.gms.common.api.l
    public Status getStatus() {
        return this;
    }

    public PendingIntent h() {
        return this.f32284c;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f32282a), this.f32283b, this.f32284c, this.f32285d);
    }

    public int i() {
        return this.f32282a;
    }

    public boolean isCanceled() {
        return this.f32282a == 16;
    }

    public String j() {
        return this.f32283b;
    }

    public boolean k() {
        return this.f32284c != null;
    }

    public boolean l() {
        return this.f32282a <= 0;
    }

    public void m(Activity activity, int i10) {
        Bundle bundle;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        if (k()) {
            if (K9.n.j()) {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                bundle = pendingIntentBackgroundActivityStartMode.toBundle();
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            PendingIntent pendingIntent = this.f32284c;
            AbstractC3191o.m(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0, bundle2);
        }
    }

    public String toString() {
        AbstractC3189m.a d10 = AbstractC3189m.d(this);
        d10.a("statusCode", zza());
        d10.a("resolution", this.f32284c);
        return d10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i());
        E9.b.F(parcel, 2, j(), false);
        E9.b.D(parcel, 3, this.f32284c, i10, false);
        E9.b.D(parcel, 4, g(), i10, false);
        E9.b.b(parcel, a10);
    }

    public final String zza() {
        String str = this.f32283b;
        return str != null ? str : c.getStatusCodeString(this.f32282a);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(ConnectionResult connectionResult, String str, int i10) {
        this(i10, str, connectionResult.j(), connectionResult);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
