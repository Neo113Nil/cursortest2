package com.vk.profile.community.impl.ui.profile;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import defpackage.q0;
import java.util.List;
import xsna.ddh;
import xsna.ed0;
import xsna.epx;
import xsna.f5u;
import xsna.gp;
import xsna.ho8;
import xsna.lsh;
import xsna.ms9;
import xsna.o9h;
import xsna.oq;
import xsna.p9h;
import xsna.shy;
import xsna.snz;
import xsna.spg;
import xsna.t8q0;
import xsna.uqi;
import xsna.vu5;
import xsna.xl50;
import xsna.xrh;

/* compiled from: CommunityProfilePatch.kt */
/* loaded from: classes5.dex */
public abstract class d implements xl50 {

    /* compiled from: CommunityProfilePatch.kt */
    public static final class a extends d {
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
            return q0.a(new StringBuilder("ActionLoading(isLoading="), this.b, ')');
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class a0 extends d {
        public static final a0 b = new a0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        public final int hashCode() {
            return -2112404835;
        }

        public final String toString() {
            return "WallInitialized";
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class b extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static final class a extends b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1378325568;
            }

            public final String toString() {
                return "HideBanner";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.d$b$b, reason: collision with other inner class name */
        public static final class C1610b extends b {
            public final spg b;

            public C1610b(spg spgVar) {
                this.b = spgVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1610b) && epx.f(this.b, ((C1610b) obj).b);
            }

            public final int hashCode() {
                spg spgVar = this.b;
                if (spgVar == null) {
                    return 0;
                }
                return spgVar.hashCode();
            }

            public final String toString() {
                return "ShowBanner(bannerData=" + this.b + ')';
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class c extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static final class a extends c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1512583602;
            }

            public final String toString() {
                return "HideBanner";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class b extends c {
            public final ed0 b;

            public b(ed0 ed0Var) {
                this.b = ed0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ShowBanner(bannerData=" + this.b + ')';
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    /* renamed from: com.vk.profile.community.impl.ui.profile.d$d, reason: collision with other inner class name */
    public static final class C1611d extends d {
        public final int b;

        public C1611d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1611d) && this.b == ((C1611d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("AuthorHeaderSettledMediaPageChanged(pageIndex="), this.b, ')');
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class e extends d {
        public final List<String> b;

        public e(List<String> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("AvatarAlbumPhotosLoaded(urls="), this.b);
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class f extends d {
        public final CommunityProfileContentItem b;

        public f(CommunityProfileContentItem communityProfileContentItem) {
            this.b = communityProfileContentItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("ContentItemChanged(contentItem="), this.b, ')');
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class g extends d {
        public final CommunityProfileContent b;

        public g(CommunityProfileContent communityProfileContent) {
            this.b = communityProfileContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ContentLoadItems(content=" + this.b + ')';
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class h extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static final class a extends h {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1325580649;
            }

            public final String toString() {
                return "Hide";
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class i extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static final class a extends i {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
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
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class b extends i {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 2117095837;
            }

            public final String toString() {
                return "StartLoad";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class c extends i {
            public final ExtendedCommunityProfile b;
            public final boolean c;

            public c(ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
                this.b = extendedCommunityProfile;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && this.c == cVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(community=");
                sb.append(this.b);
                sb.append(", canShowLiveCover=");
                return q0.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class j extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static final class a extends j {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -459506810;
            }

            public final String toString() {
                return "HideMenu";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class b extends j {
            public final int b;

            public b(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("RemoveItem(itemId="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class c extends j {
            public final int b;
            public final boolean c;

            public c(int i, boolean z) {
                this.b = i;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.b == cVar.b && this.c == cVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UpdateItemVisibility(itemId=");
                sb.append(this.b);
                sb.append(", isHidden=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.d$j$d, reason: collision with other inner class name */
        public static final class C1612d extends j {
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class k extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static final class a extends k {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -693392553;
            }

            public final String toString() {
                return "Created";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class b extends k {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -164574103;
            }

            public final String toString() {
                return "Destroy";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class c extends k {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 77832741;
            }

            public final String toString() {
                return "Pause";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.d$k$d, reason: collision with other inner class name */
        public static final class C1613d extends k {
            public static final C1613d b = new C1613d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1613d);
            }

            public final int hashCode() {
                return -1821257250;
            }

            public final String toString() {
                return "Resume";
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class l extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static final class a extends l {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                Throwable th = this.b;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class b extends l {
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
                return q0.a(new StringBuilder("Loading(isReload="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class c extends l {
            public final snz b;

            public c(snz snzVar) {
                this.b = snzVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.a.hashCode();
            }

            public final String toString() {
                return "Success(videos=" + this.b + ')';
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class m extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static final class a extends m {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 817671555;
            }

            public final String toString() {
                return "HideOnboarding";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class b extends m {
            public final xrh b;

            public b(xrh xrhVar) {
                this.b = xrhVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "InitOnboarding(onboarding=" + this.b + ')';
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class n extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static abstract class c extends n {

            /* compiled from: CommunityProfilePatch.kt */
            public static abstract class a extends c {

                /* compiled from: CommunityProfilePatch.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.d$n$c$a$a, reason: collision with other inner class name */
                public static final class C1614a extends a {
                    public final ddh.a b;

                    public C1614a(ddh.a aVar) {
                        this.b = aVar;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1614a) && epx.f(this.b, ((C1614a) obj).b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode();
                    }

                    public final String toString() {
                        return "Init(content=" + this.b + ')';
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class b extends a {
                    public final List<o9h> b;
                    public final String c;

                    public b(List<o9h> list, String str) {
                        this.b = list;
                        this.c = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
                    }

                    public final int hashCode() {
                        int hashCode = this.b.hashCode() * 31;
                        String str = this.c;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("NextPageIsLoaded(items=");
                        sb.append(this.b);
                        sb.append(", nextFrom=");
                        return ho8.a(sb, this.c, ')');
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.d$n$c$a$c, reason: collision with other inner class name */
                public static final class C1615c extends a {
                    public final UserId b;

                    public C1615c(UserId userId) {
                        this.b = userId;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1615c) && epx.f(this.b, ((C1615c) obj).b);
                    }

                    public final int hashCode() {
                        UserId userId = this.b;
                        if (userId == null) {
                            return 0;
                        }
                        return Long.hashCode(userId.b);
                    }

                    public final String toString() {
                        return gp.b(new StringBuilder("ResetCart(ownerId="), this.b, ')');
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.d$n$c$a$d, reason: collision with other inner class name */
                public static final class C1616d extends a {
                    public static final C1616d b = new C1616d();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1616d);
                    }

                    public final int hashCode() {
                        return -948016773;
                    }

                    public final String toString() {
                        return "UpdateAfterModifyItems";
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class e extends a {
                    public final List<lsh> b;

                    public e(List<lsh> list) {
                        this.b = list;
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
                        return ms9.a(')', new StringBuilder("UpdateAlbumsItems(items="), this.b);
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class f extends a {
                    public final List<o9h> b;
                    public final String c;
                    public final List<lsh> d;

                    public f(List<o9h> list, String str, List<lsh> list2) {
                        this.b = list;
                        this.c = str;
                        this.d = list2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof f)) {
                            return false;
                        }
                        f fVar = (f) obj;
                        return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d);
                    }

                    public final int hashCode() {
                        int hashCode = this.b.hashCode() * 31;
                        String str = this.c;
                        return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("UpdateAllItemsContent(items=");
                        sb.append(this.b);
                        sb.append(", nextFrom=");
                        sb.append(this.c);
                        sb.append(", albums=");
                        return ms9.a(')', sb, this.d);
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class g extends a {
                    public final long b;
                    public final ProductTileCtaButtonType c;

                    public g(long j, ProductTileCtaButtonType productTileCtaButtonType) {
                        this.b = j;
                        this.c = productTileCtaButtonType;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof g)) {
                            return false;
                        }
                        g gVar = (g) obj;
                        return this.b == gVar.b && this.c == gVar.c;
                    }

                    public final int hashCode() {
                        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
                    }

                    public final String toString() {
                        return "UpdateButtonForItem(itemId=" + this.b + ", buttonType=" + this.c + ')';
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class h extends a {
                    public final String b;

                    public h(String str) {
                        this.b = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode();
                    }

                    public final String toString() {
                        return ho8.a(new StringBuilder("UpdateEditUrl(editUrl="), this.b, ')');
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class i extends a {
                    public final long b;
                    public final boolean c;

                    public i(long j, boolean z) {
                        this.b = j;
                        this.c = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof i)) {
                            return false;
                        }
                        i iVar = (i) obj;
                        return this.b == iVar.b && this.c == iVar.c;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("UpdateFaveForItem(itemId=");
                        sb.append(this.b);
                        sb.append(", isFave=");
                        return q0.a(sb, this.c, ')');
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class j extends a {
                    public final List<o9h> b;
                    public final String c;

                    public j(List<o9h> list, String str) {
                        this.b = list;
                        this.c = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof j)) {
                            return false;
                        }
                        j jVar = (j) obj;
                        return epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c);
                    }

                    public final int hashCode() {
                        int hashCode = this.b.hashCode() * 31;
                        String str = this.c;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("UpdateItems(items=");
                        sb.append(this.b);
                        sb.append(", nextFrom=");
                        return ho8.a(sb, this.c, ')');
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class k extends a {
                    public final int b;

                    public k(int i) {
                        this.b = i;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof k) && this.b == ((k) obj).b;
                    }

                    public final int hashCode() {
                        return Integer.hashCode(this.b);
                    }

                    public final String toString() {
                        return vu5.b(new StringBuilder("UpdateItemsInCart(itemsInCart="), this.b, ')');
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class l extends a {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof l)) {
                            return false;
                        }
                        ((l) obj).getClass();
                        return true;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(false);
                    }

                    public final String toString() {
                        return "UpdateRestriction(isRestricted=false)";
                    }
                }
            }

            /* compiled from: CommunityProfilePatch.kt */
            public static abstract class b extends c {

                /* compiled from: CommunityProfilePatch.kt */
                public static final class a extends b {
                    public final ddh.b b;

                    public a(ddh.b bVar) {
                        this.b = bVar;
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
                        return "Init(content=" + this.b + ')';
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.d$n$c$b$b, reason: collision with other inner class name */
                public static final class C1617b extends b {
                    public final List<p9h> b;
                    public final String c;

                    public C1617b(List<p9h> list, String str) {
                        this.b = list;
                        this.c = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1617b)) {
                            return false;
                        }
                        C1617b c1617b = (C1617b) obj;
                        return epx.f(this.b, c1617b.b) && epx.f(this.c, c1617b.c);
                    }

                    public final int hashCode() {
                        int hashCode = this.b.hashCode() * 31;
                        String str = this.c;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("NextPageIsLoaded(items=");
                        sb.append(this.b);
                        sb.append(", nextFrom=");
                        return ho8.a(sb, this.c, ')');
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.d$n$c$b$c, reason: collision with other inner class name */
                public static final class C1618c extends b {
                    public static final C1618c b = new C1618c();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1618c);
                    }

                    public final int hashCode() {
                        return -1489944813;
                    }

                    public final String toString() {
                        return "UpdateAfterModifyItems";
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.d$n$c$b$d, reason: collision with other inner class name */
                public static final class C1619d extends b {
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class e extends b {
                    public final String b;

                    public e(String str) {
                        this.b = str;
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
                        return ho8.a(new StringBuilder("UpdateEditUrl(editUrl="), this.b, ')');
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class f extends b {
                    public final long b;
                    public final boolean c;

                    public f(long j, boolean z) {
                        this.b = j;
                        this.c = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof f)) {
                            return false;
                        }
                        f fVar = (f) obj;
                        return this.b == fVar.b && this.c == fVar.c;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("UpdateFaveForItem(itemId=");
                        sb.append(this.b);
                        sb.append(", isFave=");
                        return q0.a(sb, this.c, ')');
                    }
                }

                /* compiled from: CommunityProfilePatch.kt */
                public static final class g extends b {
                    public final List<p9h> b;
                    public final String c;

                    public g(List<p9h> list, String str) {
                        this.b = list;
                        this.c = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof g)) {
                            return false;
                        }
                        g gVar = (g) obj;
                        return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
                    }

                    public final int hashCode() {
                        int hashCode = this.b.hashCode() * 31;
                        String str = this.c;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("UpdateItems(items=");
                        sb.append(this.b);
                        sb.append(", nextFrom=");
                        return ho8.a(sb, this.c, ')');
                    }
                }
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
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
                return q0.a(new StringBuilder("Error(isPaginationError="), this.b, ')');
            }

            public a() {
                this(false);
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class b extends n {
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
                return q0.a(new StringBuilder("Loading(isLoadNextPage="), this.b, ')');
            }

            public b() {
                this(false);
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class o extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static final class a extends o {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
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
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class b extends o {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1957176160;
            }

            public final String toString() {
                return "StartLoad";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class c extends o {
            public final ExtendedCommunityProfile b;
            public final boolean c;

            public c(ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
                this.b = extendedCommunityProfile;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && this.c == cVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(community=");
                sb.append(this.b);
                sb.append(", fromCache=");
                return q0.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class p extends d {
        public final ContentTab b;

        public p(ContentTab contentTab) {
            this.b = contentTab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectedTabChanged(tab=" + this.b + ')';
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class q extends d {
        public final String b;

        public q(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.b, ((q) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SetAvatarChangeSource(source="), this.b, ')');
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class r extends d {
        public final t8q0 b;

        public r(t8q0 t8q0Var) {
            this.b = t8q0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.b, ((r) obj).b);
        }

        public final int hashCode() {
            t8q0 t8q0Var = this.b;
            if (t8q0Var == null) {
                return 0;
            }
            return Boolean.hashCode(t8q0Var.a);
        }

        public final String toString() {
            return "ShouldUpdateCommunityOnResume(updateOnResume=" + this.b + ')';
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class s extends d {
        public final boolean b;
        public final boolean c;

        public s(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.b == sVar.b && this.c == sVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateConfigurationDependentData(canShowLiveCover=");
            sb.append(this.b);
            sb.append(", isVerticalOrientation=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class t extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static abstract class a extends t {

            /* compiled from: CommunityProfilePatch.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.d$t$a$a, reason: collision with other inner class name */
            public static final class C1620a extends a {
                public final UserId b;

                public C1620a(UserId userId) {
                    this.b = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1620a) && epx.f(this.b, ((C1620a) obj).b);
                }

                public final int hashCode() {
                    UserId userId = this.b;
                    if (userId == null) {
                        return 0;
                    }
                    return Long.hashCode(userId.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("CancelGoodCtaButtonType(ownerId="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfilePatch.kt */
            public static final class b extends a {
                public final UserId b;
                public final long c;

                public b(long j, UserId userId) {
                    this.b = userId;
                    this.c = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.b, bVar.b) && this.c == bVar.c;
                }

                public final int hashCode() {
                    UserId userId = this.b;
                    return Long.hashCode(this.c) + ((userId == null ? 0 : Long.hashCode(userId.b)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CancelGoodCtaButtonTypeViaBuyNow(ownerId=");
                    sb.append(this.b);
                    sb.append(", itemId=");
                    return vu5.a(')', this.c, sb);
                }
            }

            /* compiled from: CommunityProfilePatch.kt */
            public static final class c extends a {
                public static final c b = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return -272181990;
                }

                public final String toString() {
                    return "ResetMarketCartCount";
                }
            }

            /* compiled from: CommunityProfilePatch.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.d$t$a$d, reason: collision with other inner class name */
            public static final class C1621d extends a {
                public final long b;
                public final ProductTileCtaButtonType c;

                public C1621d(long j, ProductTileCtaButtonType productTileCtaButtonType) {
                    this.b = j;
                    this.c = productTileCtaButtonType;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1621d)) {
                        return false;
                    }
                    C1621d c1621d = (C1621d) obj;
                    return this.b == c1621d.b && this.c == c1621d.c;
                }

                public final int hashCode() {
                    return this.c.hashCode() + (Long.hashCode(this.b) * 31);
                }

                public final String toString() {
                    return "UpdateGoodCtaButtonType(goodId=" + this.b + ", newType=" + this.c + ')';
                }
            }

            /* compiled from: CommunityProfilePatch.kt */
            public static final class e extends a {
                public final f5u b;
                public final boolean c;

                public e(f5u f5uVar, boolean z) {
                    this.b = f5uVar;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return epx.f(this.b, eVar.b) && this.c == eVar.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + (this.b.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("UpdateGoodFaved(item=");
                    sb.append(this.b);
                    sb.append(", isFaved=");
                    return q0.a(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfilePatch.kt */
            public static final class f extends a {
                public final Integer b;

                public f(Integer num) {
                    this.b = num;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
                }

                public final int hashCode() {
                    Integer num = this.b;
                    if (num == null) {
                        return 0;
                    }
                    return num.hashCode();
                }

                public final String toString() {
                    return uqi.b(new StringBuilder("UpdateMarketCartCount(differCount="), this.b, ')');
                }
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static abstract class b extends t {

            /* compiled from: CommunityProfilePatch.kt */
            public static final class a extends b {
                public final f5u b;
                public final boolean c;

                public a(f5u f5uVar, boolean z) {
                    this.b = f5uVar;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.b, aVar.b) && this.c == aVar.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + (this.b.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("UpdateServiceFaved(item=");
                    sb.append(this.b);
                    sb.append(", isFaved=");
                    return q0.a(sb, this.c, ')');
                }
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class u extends d {
        public final boolean b;

        public u(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.b == ((u) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateIsNewCommunity(isNew="), this.b, ')');
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static abstract class v extends d {

        /* compiled from: CommunityProfilePatch.kt */
        public static final class a extends v {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -357693152;
            }

            public final String toString() {
                return "AllowPlayingByUser";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class b extends v {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1393693225;
            }

            public final String toString() {
                return "ShowNext";
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class c extends v {
            public final boolean b;

            public c(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("UpdateAnimationState(isPlaying="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.d$v$d, reason: collision with other inner class name */
        public static final class C1622d extends v {
            public final boolean b;

            public C1622d(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1622d) && this.b == ((C1622d) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("UpdateAutoPlay(canAutoPlay="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class e extends v {
            public final boolean b;

            public e(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.b == ((e) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("UpdateDialogShown(isDialogShown="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class f extends v {
            public final boolean b;

            public f(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.b == ((f) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("UpdateForceExpand(force="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class g extends v {
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
                return vu5.b(new StringBuilder("UpdatePosition(position="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfilePatch.kt */
        public static final class h extends v {
            public final boolean b;

            public h(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.b == ((h) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("UpdateSoundEnabled(isEnabled="), this.b, ')');
            }
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class w extends d {
        public final ExtendedCommunityProfile b;
        public final int c;

        public w(int i, ExtendedCommunityProfile extendedCommunityProfile) {
            this.b = extendedCommunityProfile;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return epx.f(this.b, wVar.b) && this.c == wVar.c;
        }

        public final int hashCode() {
            ExtendedCommunityProfile extendedCommunityProfile = this.b;
            return Integer.hashCode(this.c) + ((extendedCommunityProfile == null ? 0 : extendedCommunityProfile.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateProfile(community=");
            sb.append(this.b);
            sb.append(", failedStoriesCount=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class x extends d {
        public final CommunityProfileState.d b;

        public x(CommunityProfileState.d dVar) {
            this.b = dVar;
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
            return "UpdateToolbarRedesignedJoinState(newState=" + this.b + ')';
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class y extends d {
        public final int b;
        public final int c;
        public final int d;

        public y(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return this.b == yVar.b && this.c == yVar.c && this.d == yVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateUnpublishedPostsCount(postponedCount=");
            sb.append(this.b);
            sb.append(", suggestedCount=");
            sb.append(this.c);
            sb.append(", draftsCount=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: CommunityProfilePatch.kt */
    public static final class z extends d {
        public final VideoFile b;
        public final boolean c;

        public z(VideoFile videoFile, boolean z) {
            this.b = videoFile;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return epx.f(this.b, zVar.b) && this.c == zVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateVideoItemHidden(videoFile=");
            sb.append(this.b);
            sb.append(", isHidden=");
            return q0.a(sb, this.c, ')');
        }
    }
}
