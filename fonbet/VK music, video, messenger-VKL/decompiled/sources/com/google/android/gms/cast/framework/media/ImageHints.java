package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.vd01;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class ImageHints extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ImageHints> CREATOR = new vd01();
    public final int b;
    public final int c;
    public final int d;

    public ImageHints(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d);
        ozg0.x(w, parcel);
    }
}
