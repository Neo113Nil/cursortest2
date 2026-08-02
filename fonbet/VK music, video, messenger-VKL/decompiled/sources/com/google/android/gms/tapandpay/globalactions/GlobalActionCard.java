package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.ha01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class GlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalActionCard> CREATOR = new ha01();
    public int b;
    public String c;
    public Bitmap d;
    public String e;

    @Nullable
    public String f;

    @Nullable
    public String g;

    @Nullable
    public Bitmap h;
    public PendingIntent i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            if (dq70.b(Integer.valueOf(this.b), Integer.valueOf(globalActionCard.b)) && dq70.b(this.c, globalActionCard.c) && dq70.b(this.d, globalActionCard.d) && dq70.b(this.e, globalActionCard.e) && dq70.b(this.f, globalActionCard.f) && dq70.b(this.g, globalActionCard.g) && dq70.b(this.h, globalActionCard.h) && dq70.b(this.i, globalActionCard.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.b;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.q(parcel, 5, this.f, false);
        ozg0.p(parcel, 6, this.h, i, false);
        ozg0.p(parcel, 7, this.i, i, false);
        ozg0.q(parcel, 8, this.g, false);
        ozg0.x(w, parcel);
    }
}
