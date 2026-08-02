package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.entities.PromoInfo;
import com.vk.dto.user.UserProfile;
import xsna.drm0;
import xsna.epx;
import xsna.fkq0;
import xsna.ozl;
import xsna.z230;
import xsna.zcl;

/* compiled from: StoryOwner.kt */
/* loaded from: classes18.dex */
public abstract class StoryOwner extends Serializer.StreamParcelableAdapter {
    public boolean b;

    /* compiled from: StoryOwner.kt */
    public static final class Community extends StoryOwner {
        public static final Serializer.c<Community> CREATOR = new a();
        public final Group c;
        public final PromoInfo d;
        public final boolean e;
        public final UserId f;
        public final String g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final String k;
        public final String l;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Community> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Community a(Serializer serializer) {
                return new Community((Group) serializer.G(Group.class.getClassLoader()), (PromoInfo) serializer.G(PromoInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Community[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Community(Group group) {
            this(group, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Ab(int i) {
            Image image;
            Group group = this.c;
            if (group != null && (image = group.g) != null) {
                Serializer.c<com.vk.dto.newsfeed.Owner> cVar = com.vk.dto.newsfeed.Owner.CREATOR;
                String a2 = Owner.a.a(i, image);
                if (a2 != null) {
                    return a2;
                }
            }
            if (group != null) {
                return group.e;
            }
            return null;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Bb() {
            return this.g;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Cb() {
            return this.l;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Db() {
            return this.k;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Eb() {
            return null;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final UserId Fb() {
            return this.f;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Gb() {
            return null;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Hb() {
            return this.i;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Jb() {
            return this.e;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Lb() {
            return this.h;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Mb() {
            return this.j;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.c);
            serializer.i0(this.d);
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final VerifyInfo Y() {
            Group group = this.c;
            if (group != null) {
                return group.y;
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Community)) {
                return false;
            }
            Community community = (Community) obj;
            return epx.f(this.c, community.c) && epx.f(this.d, community.d);
        }

        public final int hashCode() {
            Group group = this.c;
            int hashCode = (group == null ? 0 : group.hashCode()) * 31;
            PromoInfo promoInfo = this.d;
            return hashCode + (promoInfo != null ? promoInfo.hashCode() : 0);
        }

        public final String toString() {
            return "Community(group=" + this.c + ", promoInfo=" + this.d + ')';
        }

        public /* synthetic */ Community(Group group, PromoInfo promoInfo, int i, zcl zclVar) {
            this(group, (i & 2) != 0 ? null : promoInfo);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Community(Group group, PromoInfo promoInfo) {
            super(0 == true ? 1 : 0);
            UserId userId;
            String str = null;
            this.c = group;
            this.d = promoInfo;
            this.e = group != null && group.E;
            this.f = (group == null || (userId = group.c) == null) ? UserId.d : fkq0.e(userId);
            this.g = group != null ? group.e : null;
            if (group != null) {
                VerifyInfo verifyInfo = group.y;
            }
            if (group != null) {
                VerifyInfo verifyInfo2 = group.y;
            }
            this.h = group != null && group.n0;
            this.i = group != null && group.U;
            this.j = promoInfo != null;
            if (promoInfo != null && (r6 = promoInfo.c) != null) {
                String str2 = drm0.N(str2) ? null : str2;
                if (str2 != null) {
                    str = str2;
                    this.k = str;
                    this.l = str;
                }
            }
            if (group != null) {
                str = group.d;
            }
            this.k = str;
            this.l = str;
        }
    }

    /* compiled from: StoryOwner.kt */
    public static final class Owner extends StoryOwner {
        public static final Serializer.c<Owner> CREATOR = new a();
        public final com.vk.dto.newsfeed.Owner c;
        public final boolean d;
        public final UserId e;
        public final String f;
        public final boolean g;
        public final boolean h;
        public final String i;
        public final String j;
        public final String k;
        public final boolean l;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Owner> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Owner a(Serializer serializer) {
                return new Owner((com.vk.dto.newsfeed.Owner) serializer.G(com.vk.dto.newsfeed.Owner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Owner[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Owner(com.vk.dto.newsfeed.Owner owner) {
            super(0 == true ? 1 : 0);
            UserId userId;
            this.c = owner;
            if (owner != null) {
                owner.l();
            }
            boolean z = false;
            this.d = owner != null && owner.i(2);
            this.e = (owner == null || (userId = owner.b) == null) ? UserId.d : userId;
            this.f = owner != null ? owner.e : null;
            if (owner != null) {
                VerifyInfo verifyInfo = owner.f;
            }
            if (owner != null) {
                VerifyInfo verifyInfo2 = owner.f;
            }
            this.g = owner != null && owner.i(1024);
            this.h = owner != null && owner.q;
            String str = owner != null ? owner.c : null;
            this.i = str;
            this.j = owner != null ? owner.h : null;
            this.k = str;
            if (owner != null && fkq0.b(owner.b)) {
                z = true;
            }
            this.l = z;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Ab(int i) {
            com.vk.dto.newsfeed.Owner owner = this.c;
            if (owner != null) {
                return owner.f(i);
            }
            return null;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Bb() {
            return this.f;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Cb() {
            return this.k;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Db() {
            return this.i;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Eb() {
            return this.j;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final UserId Fb() {
            return this.e;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Gb() {
            return null;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Hb() {
            return this.h;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Jb() {
            return this.d;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Lb() {
            return this.g;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Mb() {
            return false;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.c);
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final VerifyInfo Y() {
            com.vk.dto.newsfeed.Owner owner = this.c;
            if (owner != null) {
                return owner.f;
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Owner) && epx.f(this.c, ((Owner) obj).c);
        }

        public final int hashCode() {
            com.vk.dto.newsfeed.Owner owner = this.c;
            if (owner == null) {
                return 0;
            }
            return owner.hashCode();
        }

        public final String toString() {
            return "Owner(owner=" + this.c + ')';
        }
    }

    /* compiled from: StoryOwner.kt */
    public static final class User extends StoryOwner {
        public static final Serializer.c<User> CREATOR = new a();
        public final UserProfile c;
        public final PromoInfo d;
        public final UserId e;
        public final String f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<User> {
            @Override // com.vk.core.serialize.Serializer.c
            public final User a(Serializer serializer) {
                return new User((UserProfile) serializer.G(UserProfile.class.getClassLoader()), (PromoInfo) serializer.G(PromoInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new User[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public User(UserProfile userProfile) {
            this(userProfile, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Ab(int i) {
            UserProfile userProfile = this.c;
            if (userProfile != null) {
                return userProfile.u(i);
            }
            return null;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Bb() {
            return this.f;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Cb() {
            return this.m;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Db() {
            return this.k;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Eb() {
            return this.l;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final UserId Fb() {
            return this.e;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final String Gb() {
            return this.n;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Hb() {
            return this.i;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Jb() {
            return false;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Lb() {
            return this.h;
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final boolean Mb() {
            return this.j;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.c);
            serializer.i0(this.d);
        }

        @Override // com.vk.dto.stories.model.StoryOwner
        public final VerifyInfo Y() {
            UserProfile userProfile = this.c;
            if (userProfile != null) {
                return userProfile.B;
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return epx.f(this.c, user.c) && epx.f(this.d, user.d);
        }

        public final int hashCode() {
            UserProfile userProfile = this.c;
            int hashCode = (userProfile == null ? 0 : userProfile.hashCode()) * 31;
            PromoInfo promoInfo = this.d;
            return hashCode + (promoInfo != null ? promoInfo.hashCode() : 0);
        }

        public final String toString() {
            return "User(userProfile=" + this.c + ", promoInfo=" + this.d + ')';
        }

        public /* synthetic */ User(UserProfile userProfile, PromoInfo promoInfo, int i, zcl zclVar) {
            this(userProfile, (i & 2) != 0 ? null : promoInfo);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:
        
            if (r1 == null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0085, code lost:
        
            if (r1 == null) goto L64;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public User(UserProfile userProfile, PromoInfo promoInfo) {
            super(0 == true ? 1 : 0);
            String str;
            String str2;
            UserId userId;
            String str3 = null;
            this.c = userProfile;
            this.d = promoInfo;
            if (userProfile != null) {
                userProfile.K().equals(Boolean.TRUE);
            }
            this.e = (userProfile == null || (userId = userProfile.c) == null) ? UserId.d : userId;
            this.f = userProfile != null ? userProfile.h : null;
            if (userProfile != null) {
                VerifyInfo verifyInfo = userProfile.B;
            }
            if (userProfile != null) {
                VerifyInfo verifyInfo2 = userProfile.B;
            }
            this.g = userProfile != null && userProfile.z;
            this.h = userProfile != null && userProfile.Y;
            this.i = userProfile != null && userProfile.T;
            this.j = promoInfo != null;
            if (promoInfo != null && (str = promoInfo.c) != null) {
                str = drm0.N(str) ? null : str;
            }
            str = userProfile != null ? userProfile.e : null;
            this.k = str;
            this.l = userProfile != null ? userProfile.D() : null;
            if (promoInfo != null && (str2 = promoInfo.c) != null) {
                str2 = drm0.N(str2) ? null : str2;
            }
            str2 = userProfile != null ? userProfile.d : null;
            this.m = str2;
            if (promoInfo != null && (r6 = promoInfo.c) != null) {
                String str4 = drm0.N(str4) ? null : str4;
                if (str4 != null) {
                    str3 = str4;
                    this.n = str3;
                }
            }
            if (userProfile != null) {
                str3 = userProfile.f;
            }
            this.n = str3;
        }
    }

    public /* synthetic */ StoryOwner(zcl zclVar) {
        this();
    }

    public abstract String Ab(int i);

    public abstract String Bb();

    public abstract String Cb();

    public abstract String Db();

    public abstract String Eb();

    public abstract UserId Fb();

    public abstract String Gb();

    public abstract boolean Hb();

    public final boolean Ib(UserId userId) {
        return epx.f(userId != null ? fkq0.a(userId) : null, fkq0.a(Fb()));
    }

    public abstract boolean Jb();

    @ozl
    public final boolean Kb() {
        return epx.f(z230.b.c(), Fb());
    }

    public abstract boolean Lb();

    public abstract boolean Mb();

    public abstract VerifyInfo Y();

    public final User zb() {
        if (this instanceof User) {
            return (User) this;
        }
        return null;
    }

    public StoryOwner() {
    }
}
