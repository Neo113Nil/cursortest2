package com.vk.dto.push;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FriendRequestInfo.kt */
/* loaded from: classes18.dex */
public final class FriendRequestInfo implements Serializer.StreamParcelable {
    public static final Serializer.c<FriendRequestInfo> CREATOR = new a();
    public final Image b;
    public final String c;
    public final String d;
    public final MutualFriends e;

    /* compiled from: FriendRequestInfo.kt */
    public static final class MutualFriends implements Serializer.StreamParcelable {
        public static final Serializer.c<MutualFriends> CREATOR = new a();
        public final String b;
        public final List<Image> c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<MutualFriends> {
            @Override // com.vk.core.serialize.Serializer.c
            public final MutualFriends a(Serializer serializer) {
                String H = serializer.H();
                List k = serializer.k(Image.class);
                if (k == null) {
                    k = EmptyList.b;
                }
                return new MutualFriends(H, k);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MutualFriends[i];
            }
        }

        public MutualFriends(String str, List<Image> list) {
            this.b = str;
            this.c = list;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.W(this.c);
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

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FriendRequestInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FriendRequestInfo a(Serializer serializer) {
            return new FriendRequestInfo((Image) serializer.G(Image.class.getClassLoader()), serializer.H(), serializer.H(), (MutualFriends) serializer.G(MutualFriends.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FriendRequestInfo[i];
        }
    }

    public FriendRequestInfo(Image image, String str, String str2, MutualFriends mutualFriends) {
        this.b = image;
        this.c = str;
        this.d = str2;
        this.e = mutualFriends;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
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
