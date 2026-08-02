package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ao01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class NotificationAction extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<NotificationAction> CREATOR = new ao01();
    public final String b;
    public final int c;
    public final String d;

    public NotificationAction(String str, int i, String str2) {
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.x(w, parcel);
    }
}
