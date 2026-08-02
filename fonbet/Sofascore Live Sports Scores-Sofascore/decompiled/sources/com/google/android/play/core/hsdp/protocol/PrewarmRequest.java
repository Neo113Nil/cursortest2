package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import defpackage.dyh;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class PrewarmRequest implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<PrewarmRequest> CREATOR = new dyh(24);
    public final String a;
    public final String b;
    public final IBinder c;
    public final Bundle d;

    public /* synthetic */ PrewarmRequest(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.a = readString;
        String readString2 = parcel.readString();
        Objects.requireNonNull(readString2);
        this.b = readString2;
        if (parcel.readByte() != 0) {
            this.c = parcel.readStrongBinder();
        } else {
            this.c = null;
        }
        Bundle readBundle = parcel.readBundle(PrewarmRequest.class.getClassLoader());
        this.d = readBundle == null ? Bundle.EMPTY : readBundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        IBinder iBinder = this.c;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.d);
    }

    public PrewarmRequest(String str, String str2, IBinder iBinder) {
        Objects.requireNonNull(str, "targetPackage cannot be null");
        this.a = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.b = str2;
        this.c = iBinder;
        this.d = Bundle.EMPTY;
    }
}
