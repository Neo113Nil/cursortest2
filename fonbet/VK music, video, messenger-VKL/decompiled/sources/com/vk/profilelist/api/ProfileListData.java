package com.vk.profilelist.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;

/* compiled from: ProfileListData.kt */
/* loaded from: classes5.dex */
public final class ProfileListData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ProfileListData> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final List<ProfileListTab> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ProfileListData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProfileListData a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            if (userId == null) {
                userId = UserId.d;
            }
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new ProfileListData(userId, H, serializer.D());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProfileListData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileListData(UserId userId, String str, List<? extends ProfileListTab> list) {
        this.b = userId;
        this.c = str;
        this.d = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.h0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileListData)) {
            return false;
        }
        ProfileListData profileListData = (ProfileListData) obj;
        return epx.f(this.b, profileListData.b) && epx.f(this.c, profileListData.c) && epx.f(this.d, profileListData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileListData(userId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", tabs=");
        return ms9.a(')', sb, this.d);
    }
}
