package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.user.UserProfile;
import xsna.epx;

/* compiled from: RecommendedProfile.kt */
/* loaded from: classes18.dex */
public class RecommendedProfile implements Serializer.StreamParcelable {
    public static final Serializer.c<RecommendedProfile> CREATOR = new a();
    public final UserProfile b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RecommendedProfile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RecommendedProfile a(Serializer serializer) {
            return new RecommendedProfile((UserProfile) serializer.G(UserProfile.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecommendedProfile[i];
        }
    }

    public RecommendedProfile(UserProfile userProfile) {
        this.b = userProfile;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.i0(d());
    }

    public UserProfile d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return getClass().equals(obj != null ? obj.getClass() : null) && epx.f(d(), ((RecommendedProfile) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
