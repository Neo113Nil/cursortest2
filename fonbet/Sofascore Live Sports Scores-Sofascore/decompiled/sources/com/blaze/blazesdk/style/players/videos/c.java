package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.b6a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements BlazeParcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final int a;
    public final Integer b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public c(int i, @Nullable Integer num) {
        this.a = i;
        this.b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            b6a.h(parcel, num);
        }
    }
}
