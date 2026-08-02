package com.vk.dto.user;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;

/* compiled from: RelativeProfile.kt */
/* loaded from: classes18.dex */
public final class RelativeProfile implements Serializer.StreamParcelable {
    public static final Serializer.c<RelativeProfile> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final UserProfile d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RelativeProfile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RelativeProfile a(Serializer serializer) {
            return new RelativeProfile((UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), (UserProfile) serializer.G(UserProfile.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RelativeProfile[i];
        }
    }

    public RelativeProfile(UserId userId, String str, UserProfile userProfile) {
        this.b = userId;
        this.c = str;
        this.d = userProfile;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
