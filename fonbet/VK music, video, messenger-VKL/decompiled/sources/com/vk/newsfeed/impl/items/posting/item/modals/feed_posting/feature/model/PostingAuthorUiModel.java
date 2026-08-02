package com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vkontakte.android.api.ExtendedUserProfile;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.mixed.k;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PostingAuthorUiModel.kt */
/* loaded from: classes4.dex */
public abstract class PostingAuthorUiModel implements Parcelable {
    public /* synthetic */ PostingAuthorUiModel(zcl zclVar) {
        this();
    }

    public abstract ExtendedUserProfile d();

    public abstract UserId e();

    public abstract String f();

    public abstract String g();

    public PostingAuthorUiModel() {
    }

    /* compiled from: PostingAuthorUiModel.kt */
    public static final class User extends PostingAuthorUiModel {
        public static final Parcelable.Creator<User> CREATOR = new a();
        public final UserId b;
        public final String c;
        public final String d;
        public final ExtendedUserProfile e;

        /* compiled from: PostingAuthorUiModel.kt */
        public static final class a implements Parcelable.Creator<User> {
            @Override // android.os.Parcelable.Creator
            public final User createFromParcel(Parcel parcel) {
                return new User((UserId) parcel.readParcelable(User.class.getClassLoader()), parcel.readString(), parcel.readString(), null, 8, null);
            }

            @Override // android.os.Parcelable.Creator
            public final User[] newArray(int i) {
                return new User[i];
            }
        }

        public User(PostingAuthor.User user) {
            this(user.b, user.c, user.d, user.e);
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel
        public final ExtendedUserProfile d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel
        public final UserId e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return epx.f(this.b, user.b) && epx.f(this.c, user.c) && epx.f(this.d, user.d) && epx.f(this.e, user.e);
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel
        public final String f() {
            return this.c;
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel
        public final String g() {
            return this.d;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
            ExtendedUserProfile extendedUserProfile = this.e;
            return a2 + (extendedUserProfile == null ? 0 : extendedUserProfile.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("User(id=");
            sb.append(this.b);
            sb.append(", name=");
            sb.append(this.c);
            sb.append(", photoUrl=");
            sb.append(this.d);
            sb.append(", extendedProfile=");
            return k.d(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }

        public /* synthetic */ User(UserId userId, String str, String str2, ExtendedUserProfile extendedUserProfile, int i, zcl zclVar) {
            this(userId, str, str2, (i & 8) != 0 ? null : extendedUserProfile);
        }

        public User(UserId userId, String str, String str2, ExtendedUserProfile extendedUserProfile) {
            super(null);
            this.b = userId;
            this.c = str;
            this.d = str2;
            this.e = extendedUserProfile;
        }
    }

    /* compiled from: PostingAuthorUiModel.kt */
    public static final class Community extends PostingAuthorUiModel {
        public static final Parcelable.Creator<Community> CREATOR = new a();
        public final UserId b;
        public final String c;
        public final String d;
        public final ExtendedUserProfile e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        /* compiled from: PostingAuthorUiModel.kt */
        public static final class a implements Parcelable.Creator<Community> {
            @Override // android.os.Parcelable.Creator
            public final Community createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                UserId userId = (UserId) parcel.readParcelable(Community.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z4 = false;
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Community(userId, readString, readString2, null, z4, z5, z2, z3, 8, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Community[] newArray(int i) {
                return new Community[i];
            }
        }

        public Community(PostingAuthor.Community community) {
            this(community.b, community.c, community.d, community.e, community.f, community.g, community.h, community.i);
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel
        public final ExtendedUserProfile d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel
        public final UserId e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Community)) {
                return false;
            }
            Community community = (Community) obj;
            return epx.f(this.b, community.b) && epx.f(this.c, community.c) && epx.f(this.d, community.d) && epx.f(this.e, community.e) && this.f == community.f && this.g == community.g && this.h == community.h && this.i == community.i;
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel
        public final String f() {
            return this.c;
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel
        public final String g() {
            return this.d;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
            ExtendedUserProfile extendedUserProfile = this.e;
            return Boolean.hashCode(this.i) + qoy.b(qoy.b(qoy.b((a2 + (extendedUserProfile == null ? 0 : extendedUserProfile.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Community(id=");
            sb.append(this.b);
            sb.append(", name=");
            sb.append(this.c);
            sb.append(", photoUrl=");
            sb.append(this.d);
            sb.append(", extendedProfile=");
            sb.append(this.e);
            sb.append(", canPostPosts=");
            sb.append(this.f);
            sb.append(", canPostStories=");
            sb.append(this.g);
            sb.append(", canPostClips=");
            sb.append(this.h);
            sb.append(", canPostVideos=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ Community(UserId userId, String str, String str2, ExtendedUserProfile extendedUserProfile, boolean z, boolean z2, boolean z3, boolean z4, int i, zcl zclVar) {
            this(userId, str, str2, (i & 8) != 0 ? null : extendedUserProfile, z, z2, z3, z4);
        }

        public Community(UserId userId, String str, String str2, ExtendedUserProfile extendedUserProfile, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            this.b = userId;
            this.c = str;
            this.d = str2;
            this.e = extendedUserProfile;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = z4;
        }
    }
}
