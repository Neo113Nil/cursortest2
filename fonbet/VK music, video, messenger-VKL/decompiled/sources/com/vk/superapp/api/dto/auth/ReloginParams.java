package com.vk.superapp.api.dto.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.zcl;

/* compiled from: ReloginParams.kt */
/* loaded from: classes6.dex */
public final class ReloginParams implements Parcelable {
    public static final Parcelable.Creator<ReloginParams> CREATOR = new a();
    public final UserId b;
    public final AuthPayload c;

    /* compiled from: ReloginParams.kt */
    public static final class a implements Parcelable.Creator<ReloginParams> {
        @Override // android.os.Parcelable.Creator
        public final ReloginParams createFromParcel(Parcel parcel) {
            return new ReloginParams((UserId) parcel.readParcelable(ReloginParams.class.getClassLoader()), parcel.readInt() == 0 ? null : AuthPayload.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ReloginParams[] newArray(int i) {
            return new ReloginParams[i];
        }
    }

    public ReloginParams(UserId userId, AuthPayload authPayload) {
        this.b = userId;
        this.c = authPayload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        AuthPayload authPayload = this.c;
        if (authPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authPayload.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ReloginParams(UserId userId, AuthPayload authPayload, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : authPayload);
    }
}
