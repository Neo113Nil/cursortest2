package com.vk.profile.user.impl.ui;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.cover.ProfileCover;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.user.api.domain.UserProfileMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.api.ExtendedUserProfile;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.gd80;
import xsna.hyn;
import xsna.idc0;
import xsna.km50;
import xsna.qoy;
import xsna.s1z;
import xsna.sdx;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.yc0;
import xsna.zz70;

/* compiled from: UserProfileState.kt */
/* loaded from: classes5.dex */
public final class g implements km50 {
    public final b b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final zz70 f;
    public final CommunityProfileContent g;
    public final ContentTab h;
    public final ContentTab i;
    public final ExtendedUserProfile j;
    public final List<CatalogedGift> k;
    public final boolean l;
    public final List<UserProfileAdapterItem> m;
    public final d n;
    public final WallGetMode o;
    public final a p;
    public final idc0 q;
    public final List<gd80> r;
    public final hyn s;
    public final s1z t;
    public final sdx u;
    public final String v;
    public final boolean w;
    public final yc0 x;

    /* compiled from: UserProfileState.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final b f;
        public final C1728a g;
        public final ProfileCover h;
        public final UserProfileMode i;
        public final boolean j;

        /* compiled from: UserProfileState.kt */
        /* renamed from: com.vk.profile.user.impl.ui.g$a$a, reason: collision with other inner class name */
        public static final class C1728a {
            public final boolean a;
            public final boolean b;

            public C1728a(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1728a)) {
                    return false;
                }
                C1728a c1728a = (C1728a) obj;
                return this.a == c1728a.a && this.b == c1728a.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Notification(show=");
                sb.append(this.a);
                sb.append(", hasSubscription=");
                return q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileState.kt */
        public static final class b {
            public final boolean a;
            public final int b;

            public b(boolean z, int i) {
                this.a = z;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Services(show=");
                sb.append(this.a);
                sb.append(", counter=");
                return vu5.b(sb, this.b, ')');
            }
        }

        public a(String str, String str2, boolean z, boolean z2, boolean z3, b bVar, C1728a c1728a, ProfileCover profileCover, UserProfileMode userProfileMode, boolean z4) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = bVar;
            this.g = c1728a;
            this.h = profileCover;
            this.i = userProfileMode;
            this.j = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j;
        }

        public final int hashCode() {
            int hashCode = (this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31;
            ProfileCover profileCover = this.h;
            return Boolean.hashCode(this.j) + ((this.i.hashCode() + ((hashCode + (profileCover == null ? 0 : profileCover.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderItem(fullUserName=");
            sb.append(this.a);
            sb.append(", domain=");
            sb.append(this.b);
            sb.append(", showNavigation=");
            sb.append(this.c);
            sb.append(", showMenu=");
            sb.append(this.d);
            sb.append(", showSearch=");
            sb.append(this.e);
            sb.append(", services=");
            sb.append(this.f);
            sb.append(", notification=");
            sb.append(this.g);
            sb.append(", cover=");
            sb.append(this.h);
            sb.append(", mode=");
            sb.append(this.i);
            sb.append(", useDefaultNativeNavigation=");
            return q0.a(sb, this.j, ')');
        }
    }

    /* compiled from: UserProfileState.kt */
    public static final class b {
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = z2;
            this.e = z3;
            this.f = z4;
        }

        public static b a(b bVar, boolean z) {
            String str = bVar.b;
            String str2 = bVar.c;
            boolean z2 = bVar.d;
            boolean z3 = bVar.e;
            boolean z4 = bVar.f;
            bVar.getClass();
            return new b(str, str2, z, z2, z3, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return Boolean.hashCode(this.f) + qoy.b(qoy.b((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateSkeleton(show=");
            sb.append(this.a);
            sb.append(", fullUserName=");
            sb.append(this.b);
            sb.append(", avatarUrl=");
            sb.append(this.c);
            sb.append(", isAvatarNft=");
            sb.append(this.d);
            sb.append(", hasUnseenStories=");
            sb.append(this.e);
            sb.append(", isCurrentUser=");
            return q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: UserProfileState.kt */
    public static abstract class c implements km50 {

        /* compiled from: UserProfileState.kt */
        public static final class a extends c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "EmptyView(isMyWall=false)";
            }
        }

        /* compiled from: UserProfileState.kt */
        public static final class b extends c {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("ErrorEmptyView(isLoadingWall="), this.b, ')');
            }
        }

        /* compiled from: UserProfileState.kt */
        /* renamed from: com.vk.profile.user.impl.ui.g$c$c, reason: collision with other inner class name */
        public static final class C1729c extends c {
            public static final C1729c b = new C1729c();
        }
    }

    /* compiled from: UserProfileState.kt */
    public static final class d implements km50 {
        public final c b;
        public final int c;
        public final boolean d;

        public d() {
            this(0);
        }

        public static d a(d dVar, c cVar, boolean z, int i) {
            if ((i & 1) != 0) {
                cVar = dVar.b;
            }
            int i2 = (i & 2) != 0 ? dVar.c : 0;
            if ((i & 4) != 0) {
                z = dVar.d;
            }
            dVar.getClass();
            return new d(cVar, i2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateWallBlock(state=");
            sb.append(this.b);
            sb.append(", countPosts=");
            sb.append(this.c);
            sb.append(", isLoading=");
            return q0.a(sb, this.d, ')');
        }

        public d(c cVar, int i, boolean z) {
            this.b = cVar;
            this.c = i;
            this.d = z;
        }

        public /* synthetic */ d(int i) {
            this(c.C1729c.b, 0, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(b bVar, boolean z, boolean z2, boolean z3, zz70 zz70Var, CommunityProfileContent communityProfileContent, ContentTab contentTab, ContentTab contentTab2, ExtendedUserProfile extendedUserProfile, List<CatalogedGift> list, boolean z4, List<? extends UserProfileAdapterItem> list2, d dVar, WallGetMode wallGetMode, a aVar, idc0 idc0Var, List<gd80> list3, hyn hynVar, s1z s1zVar, sdx sdxVar, String str, boolean z5, yc0 yc0Var) {
        this.b = bVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = zz70Var;
        this.g = communityProfileContent;
        this.h = contentTab;
        this.i = contentTab2;
        this.j = extendedUserProfile;
        this.k = list;
        this.l = z4;
        this.m = list2;
        this.n = dVar;
        this.o = wallGetMode;
        this.p = aVar;
        this.q = idc0Var;
        this.r = list3;
        this.s = hynVar;
        this.t = s1zVar;
        this.u = sdxVar;
        this.v = str;
        this.w = z5;
        this.x = yc0Var;
    }

    public static g a(g gVar, b bVar, boolean z, boolean z2, boolean z3, zz70 zz70Var, CommunityProfileContent communityProfileContent, ContentTab contentTab, ContentTab contentTab2, ExtendedUserProfile extendedUserProfile, List list, boolean z4, List list2, d dVar, WallGetMode wallGetMode, a aVar, idc0 idc0Var, List list3, hyn hynVar, s1z s1zVar, sdx sdxVar, String str, boolean z5, yc0 yc0Var, int i) {
        b bVar2 = (i & 1) != 0 ? gVar.b : bVar;
        boolean z6 = (i & 2) != 0 ? gVar.c : z;
        boolean z7 = (i & 4) != 0 ? gVar.d : z2;
        boolean z8 = (i & 8) != 0 ? gVar.e : z3;
        zz70 zz70Var2 = (i & 16) != 0 ? gVar.f : zz70Var;
        CommunityProfileContent communityProfileContent2 = (i & 32) != 0 ? gVar.g : communityProfileContent;
        ContentTab contentTab3 = (i & 64) != 0 ? gVar.h : contentTab;
        ContentTab contentTab4 = (i & 128) != 0 ? gVar.i : contentTab2;
        ExtendedUserProfile extendedUserProfile2 = (i & 256) != 0 ? gVar.j : extendedUserProfile;
        List list4 = (i & 512) != 0 ? gVar.k : list;
        boolean z9 = (i & 1024) != 0 ? gVar.l : z4;
        List list5 = (i & 2048) != 0 ? gVar.m : list2;
        d dVar2 = (i & 4096) != 0 ? gVar.n : dVar;
        WallGetMode wallGetMode2 = (i & 8192) != 0 ? gVar.o : wallGetMode;
        b bVar3 = bVar2;
        a aVar2 = (i & 16384) != 0 ? gVar.p : aVar;
        idc0 idc0Var2 = (i & 32768) != 0 ? gVar.q : idc0Var;
        List list6 = (i & 65536) != 0 ? gVar.r : list3;
        hyn hynVar2 = (i & 131072) != 0 ? gVar.s : hynVar;
        s1z s1zVar2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? gVar.t : s1zVar;
        sdx sdxVar2 = (i & 524288) != 0 ? gVar.u : sdxVar;
        String str2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? gVar.v : str;
        boolean z10 = (i & 2097152) != 0 ? gVar.w : z5;
        yc0 yc0Var2 = (i & 4194304) != 0 ? gVar.x : yc0Var;
        gVar.getClass();
        return new g(bVar3, z6, z7, z8, zz70Var2, communityProfileContent2, contentTab3, contentTab4, extendedUserProfile2, list4, z9, list5, dVar2, wallGetMode2, aVar2, idc0Var2, list6, hynVar2, s1zVar2, sdxVar2, str2, z10, yc0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return epx.f(this.b, gVar.b) && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e && epx.f(this.f, gVar.f) && epx.f(this.g, gVar.g) && epx.f(this.h, gVar.h) && epx.f(this.i, gVar.i) && epx.f(this.j, gVar.j) && epx.f(this.k, gVar.k) && this.l == gVar.l && epx.f(this.m, gVar.m) && epx.f(this.n, gVar.n) && this.o == gVar.o && epx.f(this.p, gVar.p) && epx.f(this.q, gVar.q) && epx.f(this.r, gVar.r) && epx.f(this.s, gVar.s) && epx.f(this.t, gVar.t) && epx.f(this.u, gVar.u) && epx.f(this.v, gVar.v) && this.w == gVar.w && epx.f(this.x, gVar.x);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31;
        CommunityProfileContent communityProfileContent = this.g;
        int hashCode2 = (hashCode + (communityProfileContent == null ? 0 : communityProfileContent.hashCode())) * 31;
        ContentTab contentTab = this.h;
        int hashCode3 = (hashCode2 + (contentTab == null ? 0 : contentTab.hashCode())) * 31;
        ContentTab contentTab2 = this.i;
        int hashCode4 = (hashCode3 + (contentTab2 == null ? 0 : contentTab2.hashCode())) * 31;
        ExtendedUserProfile extendedUserProfile = this.j;
        int a2 = fw3.a((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + fw3.a(qoy.b(fw3.a((hashCode4 + (extendedUserProfile == null ? 0 : extendedUserProfile.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m)) * 31)) * 31)) * 31)) * 31, 31, this.r);
        hyn hynVar = this.s;
        int hashCode5 = (a2 + (hynVar == null ? 0 : hynVar.hashCode())) * 31;
        s1z s1zVar = this.t;
        int hashCode6 = (hashCode5 + (s1zVar == null ? 0 : s1zVar.hashCode())) * 31;
        sdx sdxVar = this.u;
        int hashCode7 = (hashCode6 + (sdxVar == null ? 0 : sdxVar.hashCode())) * 31;
        String str = this.v;
        int b2 = qoy.b((hashCode7 + (str == null ? 0 : str.hashCode())) * 31, 31, this.w);
        yc0 yc0Var = this.x;
        return b2 + (yc0Var != null ? yc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UserProfileState(stateSkeleton=" + this.b + ", showLoading=" + this.c + ", showError=" + this.d + ", showSwipeRefresh=" + this.e + ", oldUserHintBlock=" + this.f + ", contentTabs=" + this.g + ", pinnedTab=" + this.h + ", selectedTab=" + this.i + ", profile=" + this.j + ", gifts=" + this.k + ", privacyWasChanged=" + this.l + ", profileItems=" + this.m + ", stateWall=" + this.n + ", wallMode=" + this.o + ", headerItem=" + this.p + ", postingBlock=" + this.q + ", onboardingCards=" + this.r + ", donutBanner=" + this.s + ", legoHeaderState=" + this.t + ", interestingStories=" + this.u + ", sourceScreen=" + this.v + ", showFriendsCatalogOnboarding=" + this.w + ", adBanner=" + this.x + ')';
    }
}
