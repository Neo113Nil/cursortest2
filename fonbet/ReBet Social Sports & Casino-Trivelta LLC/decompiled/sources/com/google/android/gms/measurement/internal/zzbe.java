package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.twilio.voice.EventKeys;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzbe extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbe> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f34434a;

    public zzbe(Bundle bundle) {
        this.f34434a = bundle;
    }

    public final Object g(String str) {
        return this.f34434a.get(str);
    }

    public final Long h(String str) {
        return Long.valueOf(this.f34434a.getLong(str));
    }

    public final Double i(String str) {
        return Double.valueOf(this.f34434a.getDouble(EventKeys.VALUE_KEY));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C(this);
    }

    public final String j(String str) {
        return this.f34434a.getString(str);
    }

    public final int k() {
        return this.f34434a.size();
    }

    public final Bundle l() {
        return new Bundle(this.f34434a);
    }

    public final /* synthetic */ Bundle m() {
        return this.f34434a;
    }

    public final String toString() {
        return this.f34434a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.j(parcel, 2, l(), false);
        E9.b.b(parcel, a10);
    }
}
