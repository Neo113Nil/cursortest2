package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import xsna.moz0;
import xsna.ozg0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes13.dex */
public final class zag extends AbstractSafeParcelable implements qdg0 {
    public static final Parcelable.Creator<zag> CREATOR = new moz0();
    public final List b;

    @Nullable
    public final String c;

    public zag(List list, @Nullable String str) {
        this.b = list;
        this.c = str;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.c != null ? Status.f : Status.j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.s(parcel, this.b, 1);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.x(w, parcel);
    }
}
