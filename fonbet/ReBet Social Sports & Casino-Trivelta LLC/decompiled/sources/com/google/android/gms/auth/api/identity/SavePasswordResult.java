package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import z9.q;

@Deprecated
/* loaded from: classes2.dex */
public class SavePasswordResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f32176a;

    public SavePasswordResult(PendingIntent pendingIntent) {
        this.f32176a = (PendingIntent) AbstractC3191o.m(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return AbstractC3189m.b(this.f32176a, ((SavePasswordResult) obj).f32176a);
        }
        return false;
    }

    public PendingIntent g() {
        return this.f32176a;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32176a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 1, g(), i10, false);
        E9.b.b(parcel, a10);
    }
}
