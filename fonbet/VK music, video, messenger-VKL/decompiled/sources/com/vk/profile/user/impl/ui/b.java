package com.vk.profile.user.impl.ui;

import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.domain.donut.state.DonutBannerDonutType;
import com.vkontakte.android.api.ExtendedUserProfile;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.b9x0;
import xsna.epx;
import xsna.gd80;
import xsna.hg3;
import xsna.ho8;
import xsna.kkq0;
import xsna.ms9;
import xsna.pwn;
import xsna.qoy;
import xsna.rc0;
import xsna.vu5;
import xsna.xl50;

/* compiled from: UserProfilePatch.kt */
/* loaded from: classes5.dex */
public abstract class b implements xl50 {

    /* compiled from: UserProfilePatch.kt */
    public static abstract class a extends b {

        /* compiled from: UserProfilePatch.kt */
        /* renamed from: com.vk.profile.user.impl.ui.b$a$a, reason: collision with other inner class name */
        public static final class C1705a extends a {
            public static final C1705a b = new C1705a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1705a);
            }

            public final int hashCode() {
                return 912326331;
            }

            public final String toString() {
                return "Hide";
            }
        }

        /* compiled from: UserProfilePatch.kt */
        /* renamed from: com.vk.profile.user.impl.ui.b$a$b, reason: collision with other inner class name */
        public static final class C1706b extends a {
            public final rc0 b;

            public C1706b(rc0 rc0Var) {
                this.b = rc0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1706b) && epx.f(this.b, ((C1706b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Loaded(adBanner=" + this.b + ')';
            }
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static abstract class a0 extends b {

        /* compiled from: UserProfilePatch.kt */
        public static final class a extends a0 {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -581454856;
            }

            public final String toString() {
                return "HideInterestingBlock";
            }
        }

        /* compiled from: UserProfilePatch.kt */
        /* renamed from: com.vk.profile.user.impl.ui.b$a0$b, reason: collision with other inner class name */
        public static final class C1707b extends a0 {
            public final kkq0 b;

            public C1707b(kkq0 kkq0Var) {
                this.b = kkq0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1707b) && epx.f(this.b, ((C1707b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "InterestingBlockLoaded(stories=" + this.b + ')';
            }
        }

        /* compiled from: UserProfilePatch.kt */
        public static final class c extends a0 {
            public final ArrayList<StoriesContainer> b;

            public c(ArrayList<StoriesContainer> arrayList) {
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Update(storiesContainer="), this.b);
            }
        }
    }

    /* compiled from: UserProfilePatch.kt */
    /* renamed from: com.vk.profile.user.impl.ui.b$b, reason: collision with other inner class name */
    public static final class C1708b extends b {
        public final hg3 b;

        public C1708b(hg3 hg3Var) {
            this.b = hg3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1708b) && epx.f(this.b, ((C1708b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ContentItemAdd(contentItem=" + this.b + ')';
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class b0 extends b {
        public static final b0 b = new b0();
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class c extends b {
        public final CommunityProfileContentItem b;

        public c(CommunityProfileContentItem communityProfileContentItem) {
            this.b = communityProfileContentItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("ContentItemChanged(contentItem="), this.b, ')');
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class c0 extends b {
        public final ExtendedUserProfile b;

        public c0(ExtendedUserProfile extendedUserProfile) {
            this.b = extendedUserProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && epx.f(this.b, ((c0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("UpdateCounterMemories(profile="), this.b, ')');
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class d extends b {
        public final hg3 b;
        public final CommunityProfileContentItem c;

        public d(hg3 hg3Var, b9x0 b9x0Var) {
            this.b = hg3Var;
            this.c = b9x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            CommunityProfileContentItem communityProfileContentItem = this.c;
            return hashCode + (communityProfileContentItem == null ? 0 : communityProfileContentItem.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentItemRemove(contentItem=");
            sb.append(this.b);
            sb.append(", selectTabAfterRemove=");
            return io.reactivex.rxjava3.subjects.b.c(sb, this.c, ')');
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class d0 extends b {
        public static final d0 b = new d0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d0);
        }

        public final int hashCode() {
            return -1557453788;
        }

        public final String toString() {
            return "WallInitialized";
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class e extends b {
        public final CommunityProfileContent b;

        public e(CommunityProfileContent communityProfileContent) {
            this.b = communityProfileContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ContentLoadItems(content=" + this.b + ')';
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class e0 extends b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            ((e0) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "WallModePostCount(postCount=0)";
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static abstract class f extends b {

        /* compiled from: UserProfilePatch.kt */
        public static final class a extends f {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 974999522;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: UserProfilePatch.kt */
        /* renamed from: com.vk.profile.user.impl.ui.b$f$b, reason: collision with other inner class name */
        public static final class C1709b extends f {
            public static final C1709b b = new C1709b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1709b);
            }

            public final int hashCode() {
                return -1908130776;
            }

            public final String toString() {
                return "Hide";
            }
        }

        /* compiled from: UserProfilePatch.kt */
        public static final class c extends f {
            public final pwn b;

            public c(pwn pwnVar) {
                this.b = pwnVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Loaded(donutBanner=" + this.b + ')';
            }
        }

        /* compiled from: UserProfilePatch.kt */
        public static final class d extends f {
            public final List<DonutBannerDonutType> b;

            /* JADX WARN: Multi-variable type inference failed */
            public d(List<? extends DonutBannerDonutType> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("StartLoading(donutTypes="), this.b);
            }
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class g extends b {
        public final int b;

        public g(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("DraftsUpdateCount(count="), this.b, ')');
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class h extends b {
        public static final h b = new h();
    }

    /* compiled from: UserProfilePatch.kt */
    public static abstract class i extends b {

        /* compiled from: UserProfilePatch.kt */
        public static abstract class a extends i {

            /* compiled from: UserProfilePatch.kt */
            /* renamed from: com.vk.profile.user.impl.ui.b$i$a$a, reason: collision with other inner class name */
            public static final class C1710a extends a {
                public static final C1710a b = new C1710a();
            }

            /* compiled from: UserProfilePatch.kt */
            /* renamed from: com.vk.profile.user.impl.ui.b$i$a$b, reason: collision with other inner class name */
            public static final class C1711b extends a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1711b)) {
                        return false;
                    }
                    ((C1711b) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    Boolean.hashCode(false);
                    throw null;
                }

                public final String toString() {
                    return "Data(canShowBanner=false, hint=null)";
                }
            }

            /* compiled from: UserProfilePatch.kt */
            public static final class c extends a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    ((c) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    return Boolean.hashCode(false);
                }

                public final String toString() {
                    return "IsHintLoaded(isHintsLoaded=false)";
                }
            }
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class j extends b {
        public final boolean b;

        public j(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("InitNavigation(showNavigationIcon="), this.b, ')');
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static abstract class k extends b {

        /* compiled from: UserProfilePatch.kt */
        public static final class a extends k {
            public final List<String> b;

            public a(List<String> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("AvatarAlbumUpdated(urls="), this.b);
            }
        }

        /* compiled from: UserProfilePatch.kt */
        /* renamed from: com.vk.profile.user.impl.ui.b$k$b, reason: collision with other inner class name */
        public static abstract class AbstractC1712b extends k {

            /* compiled from: UserProfilePatch.kt */
            /* renamed from: com.vk.profile.user.impl.ui.b$k$b$a */
            public static final class a extends AbstractC1712b {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 979286299;
                }

                public final String toString() {
                    return "SubscribeLoadingFinish";
                }
            }
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class l extends b {
        public final List<gd80> b;

        public l(List<gd80> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("NewUserOnboardingCards(cards="), this.b);
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class m extends b {
        public static final m b = new m();
    }

    /* compiled from: UserProfilePatch.kt */
    public static abstract class n extends b {

        /* compiled from: UserProfilePatch.kt */
        public static final class a extends n {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("DraftPosting(hasDraft="), this.b, ')');
            }
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class o extends b {
        public final int b;

        public o(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PostponedUpdateCount(count="), this.b, ')');
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class p extends b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            ((p) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "ProfileCanSeeArchivedPosts(canSeeArchivedPosts=false)";
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class q extends b {
        public static final q b = new q();
    }

    /* compiled from: UserProfilePatch.kt */
    public static abstract class r extends b {

        /* compiled from: UserProfilePatch.kt */
        public static final class a extends r {
            public static final a b = new a();
        }

        /* compiled from: UserProfilePatch.kt */
        /* renamed from: com.vk.profile.user.impl.ui.b$r$b, reason: collision with other inner class name */
        public static final class C1713b extends r {
            public static final C1713b b = new C1713b();
        }

        /* compiled from: UserProfilePatch.kt */
        public static final class c extends r {
            public static final c b = new c();
        }

        /* compiled from: UserProfilePatch.kt */
        public static final class d extends r {
            public static final d b = new d();
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class s extends b {
        public final ExtendedUserProfile b;
        public final boolean c;
        public final boolean d;

        public s(ExtendedUserProfile extendedUserProfile, boolean z, boolean z2) {
            this.b = extendedUserProfile;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return epx.f(this.b, sVar.b) && this.c == sVar.c && this.d == sVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfilePrivacyChanged(profile=");
            sb.append(this.b);
            sb.append(", isOpen=");
            sb.append(this.c);
            sb.append(", setWasChanged=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class t extends b {
        public final ContentTab b;

        public t(ContentTab contentTab) {
            this.b = contentTab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && epx.f(this.b, ((t) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectedTabChanged(tab=" + this.b + ')';
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class u extends b {
        public final WallGetMode b;

        public u(WallGetMode wallGetMode) {
            this.b = wallGetMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.b == ((u) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectorWallMode(wallMode=" + this.b + ')';
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class v extends b {
        public final String b;

        public v(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && epx.f(this.b, ((v) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SetSourceScreen(screen="), this.b, ')');
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class w extends b {
        public final boolean b;

        public w(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.b == ((w) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ShowFriendsCatalogOnboarding(show="), this.b, ')');
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class x extends b {
        public final List<CatalogedGift> b;

        public x(List<CatalogedGift> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && epx.f(this.b, ((x) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ShowGifts(gifts="), this.b);
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static final class y extends b {
        public final ExtendedUserProfile b;

        public y(ExtendedUserProfile extendedUserProfile) {
            this.b = extendedUserProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && epx.f(this.b, ((y) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("ShowProfile(profile="), this.b, ')');
        }
    }

    /* compiled from: UserProfilePatch.kt */
    public static abstract class z extends b {

        /* compiled from: UserProfilePatch.kt */
        public static final class a extends z {
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
                return "EmptyWall(isMyWall=false)";
            }
        }

        /* compiled from: UserProfilePatch.kt */
        /* renamed from: com.vk.profile.user.impl.ui.b$z$b, reason: collision with other inner class name */
        public static final class C1714b extends z {
            public final boolean b;

            public C1714b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1714b) && this.b == ((C1714b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("ErrorEmptyView(isLoadingWall="), this.b, ')');
            }
        }

        /* compiled from: UserProfilePatch.kt */
        public static final class c extends z {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                ((c) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "Loader(isLoading=false)";
            }
        }

        /* compiled from: UserProfilePatch.kt */
        public static final class d extends z {
        }
    }
}
