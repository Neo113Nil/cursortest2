package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import xsna.fe01;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
@KeepName
/* loaded from: classes12.dex */
public final class BinderWrapper implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new fe01();
    public final IBinder b;

    public BinderWrapper(@NonNull IBinder iBinder) {
        this.b = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeStrongBinder(this.b);
    }
}
