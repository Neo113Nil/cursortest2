package com.vk.dto.notifications;

import com.vk.core.serialize.Serializer;
import com.vk.dto.user.UserProfile;
import xsna.epx;

/* compiled from: FriendRequestsItem.kt */
/* loaded from: classes18.dex */
public class FriendRequestsItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<FriendRequestsItem> CREATOR = new a();
    public final UserProfile b;
    public final Integer c;
    public final Integer d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FriendRequestsItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FriendRequestsItem a(Serializer serializer) {
            UserProfile userProfile = (UserProfile) serializer.G(FriendRequestsItem.class.getClassLoader());
            int u = serializer.u();
            int u2 = serializer.u();
            return new FriendRequestsItem(userProfile, u >= 0 ? Integer.valueOf(u) : null, u2 >= 0 ? Integer.valueOf(u2) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FriendRequestsItem[i];
        }
    }

    public FriendRequestsItem(UserProfile userProfile, Integer num, Integer num2) {
        this.b = userProfile;
        this.c = num;
        this.d = num2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        Integer num = this.c;
        serializer.S(num != null ? num.intValue() : -1);
        Integer num2 = this.d;
        serializer.S(num2 != null ? num2.intValue() : -1);
    }

    public final int W5() {
        Integer num = this.d;
        if (num != null && (num == null || num.intValue() != 0)) {
            return num.intValue();
        }
        Integer num2 = this.c;
        if (num2 == null) {
            return 0;
        }
        if (num2 != null && num2.intValue() == 0) {
            return 0;
        }
        return num2.intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!epx.f(obj != null ? obj.getClass() : null, getClass())) {
            return false;
        }
        FriendRequestsItem friendRequestsItem = (FriendRequestsItem) obj;
        return epx.f(this.b, friendRequestsItem.b) && epx.f(this.c, friendRequestsItem.c) && epx.f(this.d, friendRequestsItem.d);
    }

    public final int hashCode() {
        UserProfile userProfile = this.b;
        int hashCode = (userProfile != null ? userProfile.hashCode() : 0) * 31;
        Integer num = this.c;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.d;
        return intValue + (num2 != null ? num2.intValue() : 0);
    }
}
