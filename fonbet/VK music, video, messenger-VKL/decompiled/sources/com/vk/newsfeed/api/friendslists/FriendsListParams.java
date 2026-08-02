package com.vk.newsfeed.api.friendslists;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.privacy.ListFriends;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: FriendsListParams.kt */
/* loaded from: classes3.dex */
public abstract class FriendsListParams extends Serializer.StreamParcelableAdapter {

    /* compiled from: FriendsListParams.kt */
    public static final class FriendListCreation extends FriendsListParams {
        public static final Serializer.c<FriendListCreation> CREATOR = new a();
        public String b;
        public final boolean c;
        public int d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<FriendListCreation> {
            @Override // com.vk.core.serialize.Serializer.c
            public final FriendListCreation a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                return new FriendListCreation(H, serializer.m(), serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FriendListCreation[i];
            }
        }

        public /* synthetic */ FriendListCreation(String str, boolean z, int i, int i2, zcl zclVar) {
            this(str, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? -1 : i);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.L(this.c ? (byte) 1 : (byte) 0);
            serializer.S(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FriendListCreation)) {
                return false;
            }
            FriendListCreation friendListCreation = (FriendListCreation) obj;
            return epx.f(this.b, friendListCreation.b) && this.c == friendListCreation.c && this.d == friendListCreation.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendListCreation(name=");
            sb.append(this.b);
            sb.append(", canEditName=");
            sb.append(this.c);
            sb.append(", defaultListId=");
            return vu5.b(sb, this.d, ')');
        }

        public FriendListCreation(String str, boolean z, int i) {
            super(null);
            this.b = str;
            this.c = z;
            this.d = i;
        }
    }

    /* compiled from: FriendsListParams.kt */
    public static final class FriendsList extends FriendsListParams {
        public static final Serializer.c<FriendsList> CREATOR = new a();
        public final int b;
        public String c;
        public final int d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<FriendsList> {
            @Override // com.vk.core.serialize.Serializer.c
            public final FriendsList a(Serializer serializer) {
                int u = serializer.u();
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                return new FriendsList(u, H, serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FriendsList[i];
            }
        }

        public FriendsList(int i, String str, int i2) {
            super(null);
            this.b = i;
            this.c = str;
            this.d = i2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.j0(this.c);
            serializer.S(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FriendsList)) {
                return false;
            }
            FriendsList friendsList = (FriendsList) obj;
            return this.b == friendsList.b && epx.f(this.c, friendsList.c) && this.d == friendsList.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendsList(id=");
            sb.append(this.b);
            sb.append(", name=");
            sb.append(this.c);
            sb.append(", position=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: FriendsListParams.kt */
    public static final class FriendsListsWithFriends extends FriendsListParams {
        public static final Serializer.c<FriendsListsWithFriends> CREATOR = new a();
        public final List<ListFriends> b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<FriendsListsWithFriends> {
            @Override // com.vk.core.serialize.Serializer.c
            public final FriendsListsWithFriends a(Serializer serializer) {
                return new FriendsListsWithFriends(serializer.B(ListFriends.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FriendsListsWithFriends[i];
            }
        }

        public FriendsListsWithFriends(List<ListFriends> list) {
            super(null);
            this.b = list;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.f0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FriendsListsWithFriends) && epx.f(this.b, ((FriendsListsWithFriends) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("FriendsListsWithFriends(friendsLists="), this.b);
        }
    }

    /* compiled from: FriendsListParams.kt */
    public static final class HiddenFriendsList extends FriendsListParams {
        public static final Serializer.c<HiddenFriendsList> CREATOR = new a();
        public final List<UserId> b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<HiddenFriendsList> {
            @Override // com.vk.core.serialize.Serializer.c
            public final HiddenFriendsList a(Serializer serializer) {
                return new HiddenFriendsList(serializer.B(UserId.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenFriendsList[i];
            }
        }

        public HiddenFriendsList(List<UserId> list) {
            super(null);
            this.b = list;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.f0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HiddenFriendsList) && epx.f(this.b, ((HiddenFriendsList) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("HiddenFriendsList(hiddenFriends="), this.b);
        }
    }

    public /* synthetic */ FriendsListParams(zcl zclVar) {
        this();
    }

    public FriendsListParams() {
    }

    /* compiled from: FriendsListParams.kt */
    public static final class BestFriendsList extends FriendsListParams {
        public static final BestFriendsList b = new BestFriendsList(null);
        public static final Serializer.c<BestFriendsList> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<BestFriendsList> {
            @Override // com.vk.core.serialize.Serializer.c
            public final BestFriendsList a(Serializer serializer) {
                return BestFriendsList.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BestFriendsList[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
