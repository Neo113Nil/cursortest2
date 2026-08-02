package com.vk.newsfeed.api.posting.profilefriendslists;

import android.os.Parcel;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.internal.api.GsonHolder;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.fw3;
import xsna.urd0;
import xsna.v1v;

/* compiled from: ProfileFriendItem.kt */
/* loaded from: classes3.dex */
public final class ProfileFriendItem implements Serializer.StreamParcelable {
    public static final Serializer.c<ProfileFriendItem> CREATOR = new b();
    public final UserId b;
    public final String c;
    public final String d;
    public final ImageList e;
    public final List<Integer> f;
    public final boolean g;
    public final String h;

    /* compiled from: ProfileFriendItem.kt */
    public static final class a {
        public static ProfileFriendItem a(JSONObject jSONObject) {
            return b((UsersUserFullDto) GsonHolder.a().fromJson(jSONObject.toString(), UsersUserFullDto.class));
        }

        public static ProfileFriendItem b(UsersUserFullDto usersUserFullDto) {
            UserId s1 = usersUserFullDto.s1();
            String D0 = usersUserFullDto.D0();
            if (D0 == null) {
                D0 = "";
            }
            String x1 = usersUserFullDto.x1();
            String str = x1 != null ? x1 : "";
            Serializer.c<ImageList> cVar = ImageList.CREATOR;
            ImageList a = ImageList.a.a(usersUserFullDto.r2());
            List<Integer> N1 = usersUserFullDto.N1();
            return new ProfileFriendItem(s1, D0, str, a, N1 != null ? new ArrayList(N1) : new ArrayList(), epx.f(usersUserFullDto.h3(), Boolean.TRUE));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ProfileFriendItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProfileFriendItem a(Serializer serializer) {
            return new ProfileFriendItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProfileFriendItem[i];
        }
    }

    public ProfileFriendItem(UserId userId, String str, String str2, ImageList imageList, List<Integer> list, boolean z) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = imageList;
        this.f = list;
        this.g = z;
        this.h = v1v.a(' ', str, str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.U(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileFriendItem)) {
            return false;
        }
        ProfileFriendItem profileFriendItem = (ProfileFriendItem) obj;
        return epx.f(this.b, profileFriendItem.b) && epx.f(this.c, profileFriendItem.c) && epx.f(this.d, profileFriendItem.d) && epx.f(this.e, profileFriendItem.e) && epx.f(this.f, profileFriendItem.f) && this.g == profileFriendItem.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + fw3.a(fw3.a(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e.b), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileFriendItem(id=");
        sb.append(this.b);
        sb.append(", firstName=");
        sb.append(this.c);
        sb.append(", lastName=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", lists=");
        sb.append(this.f);
        sb.append(", imageIsNft=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProfileFriendItem(Serializer serializer) {
        this(r2, r3, r4, r5, r1, serializer.m());
        ArrayList arrayList;
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        String H = serializer.H();
        String H2 = serializer.H();
        ImageList imageList = (ImageList) serializer.A(ImageList.class.getClassLoader());
        ArrayList<Integer> d = serializer.d();
        if (d != null) {
            arrayList = new ArrayList(d);
        } else {
            arrayList = new ArrayList();
        }
    }
}
