package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import z9.o;

/* loaded from: classes2.dex */
public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f32169a;

    public SaveAccountLinkingTokenResult(PendingIntent pendingIntent) {
        this.f32169a = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SaveAccountLinkingTokenResult) {
            return AbstractC3189m.b(this.f32169a, ((SaveAccountLinkingTokenResult) obj).f32169a);
        }
        return false;
    }

    public PendingIntent g() {
        return this.f32169a;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32169a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 1, g(), i10, false);
        E9.b.b(parcel, a10);
    }
}
