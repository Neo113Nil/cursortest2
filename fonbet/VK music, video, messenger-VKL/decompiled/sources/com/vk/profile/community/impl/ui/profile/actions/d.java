package com.vk.profile.community.impl.ui.profile.actions;

import android.graphics.Rect;
import android.view.View;
import com.vk.api.base.Document;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Good;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupChat;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesRefSource;
import com.vk.profile.community.creationonboarding.api.models.CommunityData;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTask;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import defpackage.q0;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.at;
import xsna.ay00;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.ho8;
import xsna.i5s;
import xsna.iea0;
import xsna.jq;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.sst0;
import xsna.uc;
import xsna.uqi;
import xsna.urd0;
import xsna.vu5;
import xsna.vzd0;
import xsna.yq;

/* compiled from: CommunityProfileSideEffect.kt */
/* loaded from: classes5.dex */
public abstract class d {

    /* compiled from: CommunityProfileSideEffect.kt */
    public static final class a extends d {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2058180557;
        }

        public final String toString() {
            return "AvatarChanged";
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static abstract class b extends d {

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class a extends b {
            public final UserId a;
            public final boolean b;

            public a(UserId userId, boolean z) {
                this.a = userId;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Clip(communityId=");
                sb.append(this.a);
                sb.append(", postedToWall=");
                return q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$b$b, reason: collision with other inner class name */
        public static final class C1592b extends b {
            public final String a;

            public C1592b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1592b) && epx.f(this.a, ((C1592b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Story(ownerStoryId="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class c extends b {
            public final VideoFile a;
            public final boolean b;

            public c(VideoFile videoFile, boolean z) {
                this.a = videoFile;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && this.b == cVar.b;
            }

            public final int hashCode() {
                VideoFile videoFile = this.a;
                return Boolean.hashCode(this.b) + ((videoFile == null ? 0 : videoFile.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Video(video=");
                sb.append(this.a);
                sb.append(", postedToWall=");
                return q0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static abstract class c extends d {
        public final int a;
        public final Integer b;
        public final int c;

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class a extends c {
            public a(int i, int i2, Integer num) {
                super(i, R.attr.vk_ui_icon_negative, (i2 & 2) != 0 ? null : num);
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class b extends c {
            public b(int i, int i2, Integer num) {
                super(i, R.attr.vk_ui_icon_positive, (i2 & 2) != 0 ? null : num);
            }
        }

        public c(int i, int i2, Integer num) {
            this.a = i;
            this.b = num;
            this.c = i2;
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC1593d extends d {

        /* compiled from: CommunityProfileSideEffect.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$d$a */
        public static final class a extends AbstractC1593d {
            public final String a;

            public a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Copy(link="), this.a, ')');
            }
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static final class e extends d {
        public final ExtendedCommunityProfile a;
        public final boolean b;

        public e(ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
            this.a = extendedCommunityProfile;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LeaveCommunity(community=");
            sb.append(this.a);
            sb.append(", fromToolbarButton=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static abstract class f extends d {

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class a extends f {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2096983420;
            }

            public final String toString() {
                return "Pause";
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class b extends f {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -521081505;
            }

            public final String toString() {
                return "Resume";
            }
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static abstract class g extends d {

        /* compiled from: CommunityProfileSideEffect.kt */
        public static abstract class a extends g {

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$g$a$a, reason: collision with other inner class name */
            public static final class C1594a extends a {
                public final Narrative a;
                public final WeakReference<View> b;

                public C1594a(Narrative narrative, WeakReference<View> weakReference) {
                    this.a = narrative;
                    this.b = weakReference;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1594a)) {
                        return false;
                    }
                    C1594a c1594a = (C1594a) obj;
                    return epx.f(this.a, c1594a.a) && epx.f(this.b, c1594a.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "ShowAdminMenu(narrative=" + this.a + ", anchor=" + this.b + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class b extends a {
                public final Narrative a;
                public final WeakReference<View> b;

                public b(Narrative narrative, WeakReference<View> weakReference) {
                    this.a = narrative;
                    this.b = weakReference;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "ShowUserMenu(narrative=" + this.a + ", anchor=" + this.b + ')';
                }
            }
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static final class h extends d {
        public final ay00 a;

        public h(ay00 ay00Var) {
            this.a = ay00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MarketEventReceived(event=" + this.a + ')';
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static final class i extends d {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 3658990;
        }

        public final String toString() {
            return "ModerationRestrictionsDismissed";
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static abstract class j extends d {

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class a extends j {
            public final ExtendedCommunityProfile a;
            public final boolean b;

            public a(ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
                this.a = extendedCommunityProfile;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("APlusDialog(community=");
                sb.append(this.a);
                sb.append(", reopenDetailsOnDismiss=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class a0 extends j {
            public final ExtendedCommunityProfile a;

            public a0(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a0) && epx.f(this.a, ((a0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("Links(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class a1 extends j {
            public final String a;

            public a1(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a1) && epx.f(this.a, ((a1) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                return (str == null ? 0 : str.hashCode()) * 31;
            }

            public final String toString() {
                return i5s.a(new StringBuilder("OpenServiceCreationForm(url="), this.a, ", source=null)");
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class b extends j {
            public final ExtendedCommunityProfile a;

            public b(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("ActionsBottomSheet(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class b0 extends j {
            public final ExtendedCommunityProfile a;

            public b0(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b0) && epx.f(this.a, ((b0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("NonProfitOrganization(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class b1 extends j {
            public final ExtendedCommunityProfile a;

            public b1(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b1) && epx.f(this.a, ((b1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("OpenShopConditionsSheet(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class c extends j {
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class c0 extends j {
            public final ExtendedCommunityProfile a;

            public c0(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c0) && epx.f(this.a, ((c0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("NotificationsPopup(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class c1 extends j {
            public static final c1 a = new c1();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c1);
            }

            public final int hashCode() {
                return -1564678537;
            }

            public final String toString() {
                return "OpenTabbarSettings";
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$d, reason: collision with other inner class name */
        public static abstract class AbstractC1595d extends j {
            public final ExtendedCommunityProfile a;
            public final ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType b;

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$d$a */
            public static final class a extends AbstractC1595d {
                public final ExtendedCommunityProfile c;

                public a(ExtendedCommunityProfile extendedCommunityProfile) {
                    super(extendedCommunityProfile, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.CHATS);
                    this.c = extendedCommunityProfile;
                }

                @Override // com.vk.profile.community.impl.ui.profile.actions.d.j.AbstractC1595d
                public final ExtendedCommunityProfile a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.c, ((a) obj).c);
                }

                public final int hashCode() {
                    return this.c.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Chats(community="), this.c, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$d$b */
            public static final class b extends AbstractC1595d {
                public final ExtendedCommunityProfile c;

                public b(ExtendedCommunityProfile extendedCommunityProfile) {
                    super(extendedCommunityProfile, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.SHORT_VIDEOS);
                    this.c = extendedCommunityProfile;
                }

                @Override // com.vk.profile.community.impl.ui.profile.actions.d.j.AbstractC1595d
                public final ExtendedCommunityProfile a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.c, ((b) obj).c);
                }

                public final int hashCode() {
                    return this.c.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Clips(community="), this.c, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$d$c */
            public static final class c extends AbstractC1595d {
                public final ExtendedCommunityProfile c;

                public c(ExtendedCommunityProfile extendedCommunityProfile) {
                    super(extendedCommunityProfile, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.DISCUSSIONS);
                    this.c = extendedCommunityProfile;
                }

                @Override // com.vk.profile.community.impl.ui.profile.actions.d.j.AbstractC1595d
                public final ExtendedCommunityProfile a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.c, ((c) obj).c);
                }

                public final int hashCode() {
                    return this.c.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Discussions(community="), this.c, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$d$d, reason: collision with other inner class name */
            public static final class C1596d extends AbstractC1595d {
                public final ExtendedCommunityProfile c;

                public C1596d(ExtendedCommunityProfile extendedCommunityProfile) {
                    super(extendedCommunityProfile, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.FILES);
                    this.c = extendedCommunityProfile;
                }

                @Override // com.vk.profile.community.impl.ui.profile.actions.d.j.AbstractC1595d
                public final ExtendedCommunityProfile a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1596d) && epx.f(this.c, ((C1596d) obj).c);
                }

                public final int hashCode() {
                    return this.c.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Documents(community="), this.c, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$d$e */
            public static final class e extends AbstractC1595d {
                public final ExtendedCommunityProfile c;
                public final String d;

                public e(ExtendedCommunityProfile extendedCommunityProfile, String str) {
                    super(extendedCommunityProfile, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.MARKET);
                    this.c = extendedCommunityProfile;
                    this.d = str;
                }

                @Override // com.vk.profile.community.impl.ui.profile.actions.d.j.AbstractC1595d
                public final ExtendedCommunityProfile a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
                }

                public final int hashCode() {
                    int hashCode = this.c.hashCode() * 31;
                    String str = this.d;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Goods(community=");
                    sb.append(this.c);
                    sb.append(", editUrl=");
                    return ho8.a(sb, this.d, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$d$f */
            public static final class f extends AbstractC1595d {
                public final ExtendedCommunityProfile c;

                public f(ExtendedCommunityProfile extendedCommunityProfile) {
                    super(extendedCommunityProfile, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.NARRATIVES);
                    this.c = extendedCommunityProfile;
                }

                @Override // com.vk.profile.community.impl.ui.profile.actions.d.j.AbstractC1595d
                public final ExtendedCommunityProfile a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && epx.f(this.c, ((f) obj).c);
                }

                public final int hashCode() {
                    return this.c.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Narrative(community="), this.c, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$d$g */
            public static final class g extends AbstractC1595d {
                public final ExtendedCommunityProfile c;

                public g(ExtendedCommunityProfile extendedCommunityProfile) {
                    super(extendedCommunityProfile, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.PHOTOS);
                    this.c = extendedCommunityProfile;
                }

                @Override // com.vk.profile.community.impl.ui.profile.actions.d.j.AbstractC1595d
                public final ExtendedCommunityProfile a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof g) && epx.f(this.c, ((g) obj).c);
                }

                public final int hashCode() {
                    return this.c.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Photos(community="), this.c, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$d$h */
            public static final class h extends AbstractC1595d {
                public final ExtendedCommunityProfile c;
                public final String d;

                public h(ExtendedCommunityProfile extendedCommunityProfile, String str) {
                    super(extendedCommunityProfile, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.SERVICES);
                    this.c = extendedCommunityProfile;
                    this.d = str;
                }

                @Override // com.vk.profile.community.impl.ui.profile.actions.d.j.AbstractC1595d
                public final ExtendedCommunityProfile a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof h)) {
                        return false;
                    }
                    h hVar = (h) obj;
                    return epx.f(this.c, hVar.c) && epx.f(this.d, hVar.d);
                }

                public final int hashCode() {
                    int hashCode = this.c.hashCode() * 31;
                    String str = this.d;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Services(community=");
                    sb.append(this.c);
                    sb.append(", editUrl=");
                    return ho8.a(sb, this.d, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$d$i */
            public static final class i extends AbstractC1595d {
                public final ExtendedCommunityProfile c;

                public i(ExtendedCommunityProfile extendedCommunityProfile) {
                    super(extendedCommunityProfile, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.VIDEOS);
                    this.c = extendedCommunityProfile;
                }

                @Override // com.vk.profile.community.impl.ui.profile.actions.d.j.AbstractC1595d
                public final ExtendedCommunityProfile a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof i) && epx.f(this.c, ((i) obj).c);
                }

                public final int hashCode() {
                    return this.c.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Videos(community="), this.c, ')');
                }
            }

            public AbstractC1595d(ExtendedCommunityProfile extendedCommunityProfile, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType strikeRestrictionType) {
                this.a = extendedCommunityProfile;
                this.b = strikeRestrictionType;
            }

            public ExtendedCommunityProfile a() {
                return this.a;
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class d0 extends j {
            public final String a;

            public d0(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d0) && epx.f(this.a, ((d0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenAdBloggerPage(url="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class d1 extends j {
            public final ExtendedCommunityProfile a;

            public d1(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d1) && epx.f(this.a, ((d1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("OpenTrustMarksBottomSheet(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class e extends j {
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class e0 extends j {
            public final UserId a;

            public e0(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e0) && epx.f(this.a, ((e0) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenAddGoodsAlbum(communityId="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class e1 extends j {
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class f extends j {
            public final ExtendedCommunityProfile a;

            public f(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("AdminMessages(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class f0 extends j {
            public final ExtendedCommunityProfile a;
            public final Address b;
            public final boolean c;

            public f0(ExtendedCommunityProfile extendedCommunityProfile, Address address, boolean z) {
                this.a = extendedCommunityProfile;
                this.b = address;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f0)) {
                    return false;
                }
                f0 f0Var = (f0) obj;
                return epx.f(this.a, f0Var.a) && epx.f(this.b, f0Var.b) && this.c == f0Var.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenAddresses(community=");
                sb.append(this.a);
                sb.append(", address=");
                sb.append(this.b);
                sb.append(", isOldAddress=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class f1 extends j {
            public final ExtendedCommunityProfile a;

            public f1(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f1) && epx.f(this.a, ((f1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("ProfilePhotos(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class g extends j {
            public final ExtendedCommunityProfile a;

            public g(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("AgeWarningNotificationPopup(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class g0 extends j {
            public final String a;

            public g0(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g0) && epx.f(this.a, ((g0) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                return (str == null ? 0 : str.hashCode()) * 31;
            }

            public final String toString() {
                return i5s.a(new StringBuilder("OpenAdsMiniApp(url="), this.a, ", source=null)");
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class g1 extends j {
            public final CommunityProfileDeeplinkParams a;

            public g1(CommunityProfileDeeplinkParams communityProfileDeeplinkParams) {
                this.a = communityProfileDeeplinkParams;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g1) && epx.f(this.a, ((g1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ReviewDeeplink(params=" + this.a + ')';
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class h0 extends j {
            public final Artist a;

            public h0(Artist artist) {
                this.a = artist;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h0) && epx.f(this.a, ((h0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenArtist(artist=" + this.a + ')';
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class h1 extends j {
            public final UserId a;
            public final boolean b = true;

            public h1(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h1)) {
                    return false;
                }
                h1 h1Var = (h1) obj;
                return epx.f(this.a, h1Var.a) && this.b == h1Var.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ReviewItems(communityId=");
                sb.append(this.a);
                sb.append(", isUserHasItemsForReview=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class i extends j {
            public final ExtendedCommunityProfile a;
            public final String b;

            public i(ExtendedCommunityProfile extendedCommunityProfile, String str) {
                this.a = extendedCommunityProfile;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Call(community=");
                sb.append(this.a);
                sb.append(", source=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class i0 extends j {
            public final ExtendedCommunityProfile a;
            public final Integer b;

            public i0(ExtendedCommunityProfile extendedCommunityProfile, Integer num) {
                this.a = extendedCommunityProfile;
                this.b = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i0)) {
                    return false;
                }
                i0 i0Var = (i0) obj;
                return epx.f(this.a, i0Var.a) && epx.f(this.b, i0Var.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Integer num = this.b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenAvitoDialog(community=");
                sb.append(this.a);
                sb.append(", status=");
                return uqi.b(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class i1 extends j {
            public final ExtendedCommunityProfile a;

            public i1(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i1) && epx.f(this.a, ((i1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("Reviews(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$j, reason: collision with other inner class name */
        public static final class C1597j extends j {
            public final String a;

            public C1597j(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1597j) && epx.f(this.a, ((C1597j) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CallToPhone(phone="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class j0 extends j {
            public final UserId a;
            public final String b = "creation_onboarding_block";

            public j0(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j0)) {
                    return false;
                }
                j0 j0Var = (j0) obj;
                return epx.f(this.a, j0Var.a) && epx.f(this.b, j0Var.b);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.a.b) * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenCTASetting(communityId=");
                sb.append(this.a);
                sb.append(", source=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class j1 extends j {
            public final ExtendedCommunityProfile a;

            public j1(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j1) && epx.f(this.a, ((j1) obj).a);
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Search(community=" + this.a + ", isVoice=false)";
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class k extends j {
            public final CatchUpBanner a;

            public k(CatchUpBanner catchUpBanner) {
                this.a = catchUpBanner;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "CatchUp(banner=" + this.a + ')';
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class k0 extends j {
            public final String a;

            public k0(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k0) && epx.f(this.a, ((k0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenChannel(url="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class k1 extends j {
            public final ExtendedCommunityProfile a;
            public final vzd0 b;
            public final View c;
            public final String d;

            public k1(ExtendedCommunityProfile extendedCommunityProfile, vzd0 vzd0Var, View view, String str) {
                this.a = extendedCommunityProfile;
                this.b = vzd0Var;
                this.c = view;
                this.d = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k1)) {
                    return false;
                }
                k1 k1Var = (k1) obj;
                return epx.f(this.a, k1Var.a) && epx.f(this.b, k1Var.b) && epx.f(this.c, k1Var.c) && epx.f(this.d, k1Var.d);
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
                String str = this.d;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Stories(community=");
                sb.append(this.a);
                sb.append(", profileStoriesController=");
                sb.append(this.b);
                sb.append(", anchorView=");
                sb.append(this.c);
                sb.append(", ref=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class l extends j {
            public final ExtendedCommunityProfile a;

            public l(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("CommunityManage(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class l0 extends d {
            public final UserId a;

            public l0(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l0) && epx.f(this.a, ((l0) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenClipsCoAuthorInvitationsDialog(profileId="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class l1 extends j {
            public final UserId a;

            public l1(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l1) && epx.f(this.a, ((l1) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("TabsOrderSettings(communityId="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class m extends j {
            public final ExtendedCommunityProfile a;

            public m(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("ConfirmDeleteAvatar(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class m0 extends j {
            public final ExtendedCommunityProfile a;
            public final boolean b;

            public m0(ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
                this.a = extendedCommunityProfile;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m0)) {
                    return false;
                }
                m0 m0Var = (m0) obj;
                return epx.f(this.a, m0Var.a) && this.b == m0Var.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenCoverActionSheet(community=");
                sb.append(this.a);
                sb.append(", isLiveCover=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class m1 extends j {
            public final ExtendedCommunityProfile a;

            public m1(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m1) && epx.f(this.a, ((m1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("VerifiedNonProfitOrganization(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static abstract class n extends j {

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class a extends n {
                public final ExtendedCommunityProfile a;

                public a(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Articles(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class b extends n {
                public final ExtendedCommunityProfile a;

                public b(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("AudioAlbums(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class c extends n {
                public final ExtendedCommunityProfile a;

                public c(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Audios(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$n$d, reason: collision with other inner class name */
            public static final class C1598d extends n {
                public final ExtendedCommunityProfile a;

                public C1598d(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1598d) && epx.f(this.a, ((C1598d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Chats(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class e extends n {
                public final ExtendedCommunityProfile a;

                public e(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Clips(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class f extends n {
                public final ExtendedCommunityProfile a;

                public f(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Discussions(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class g extends n {
                public final ExtendedCommunityProfile a;

                public g(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Documents(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class h extends n {
                public final UserId a;
                public final CommonMarketStat$TypeRefSource b;

                public h(UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
                    this.a = userId;
                    this.b = commonMarketStat$TypeRefSource;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof h)) {
                        return false;
                    }
                    h hVar = (h) obj;
                    return epx.f(this.a, hVar.a) && this.b == hVar.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
                }

                public final String toString() {
                    return "Goods(communityId=" + this.a + ", refSource=" + this.b + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class i extends n {
                public final UserId a;

                public i(UserId userId) {
                    this.a = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
                }

                public final int hashCode() {
                    return Long.hashCode(this.a.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("GoodsAlbums(communityId="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$n$j, reason: collision with other inner class name */
            public static final class C1599j extends n {
                public final ExtendedCommunityProfile a;

                public C1599j(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1599j) && epx.f(this.a, ((C1599j) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Narratives(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class k extends n {
                public final ExtendedCommunityProfile a;

                public k(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("PhotoAlbums(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class l extends n {
                public final ExtendedCommunityProfile a;

                public l(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Photos(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class m extends n {
                public final ExtendedCommunityProfile a;

                public m(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Podcasts(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$n$n, reason: collision with other inner class name */
            public static final class C1600n extends n {
                public final UserId a;
                public final StorefrontServicesRefSource b;

                public C1600n(UserId userId, StorefrontServicesRefSource storefrontServicesRefSource) {
                    this.a = userId;
                    this.b = storefrontServicesRefSource;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1600n)) {
                        return false;
                    }
                    C1600n c1600n = (C1600n) obj;
                    return epx.f(this.a, c1600n.a) && this.b == c1600n.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
                }

                public final String toString() {
                    return "Services(communityId=" + this.a + ", refSource=" + this.b + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class o extends n {
                public final UserId a;

                public o(UserId userId) {
                    this.a = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof o) && epx.f(this.a, ((o) obj).a);
                }

                public final int hashCode() {
                    return Long.hashCode(this.a.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("ServicesAlbums(communityId="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class p extends n {
                public final ExtendedCommunityProfile a;

                public p(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof p) && epx.f(this.a, ((p) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("VideoAlbums(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class q extends n {
                public final ExtendedCommunityProfile a;

                public q(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof q) && epx.f(this.a, ((q) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Videos(community="), this.a, ')');
                }
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class n0 extends j {
            public final ExtendedCommunityProfile a;

            public n0(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n0) && epx.f(this.a, ((n0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("OpenDetailsSheet(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class n1 extends j {
            public final ExtendedCommunityProfile a;

            public n1(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n1) && epx.f(this.a, ((n1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("VerifyBcs(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class o extends j {
            public static final o a = new o();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof o);
            }

            public final int hashCode() {
                return -1609680032;
            }

            public final String toString() {
                return "CreateReview";
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class o0 extends j {
            public final String a;

            public o0(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o0) && epx.f(this.a, ((o0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenDonutLevels(link="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class p extends j {
            public final ExtendedCommunityProfile a;

            public p(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && epx.f(this.a, ((p) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("CreateStory(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class p0 extends j {
            public final sst0.b.C3688b a;
            public final ExtendedCommunityProfile b;

            public p0(sst0.b.C3688b c3688b, ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = c3688b;
                this.b = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof p0)) {
                    return false;
                }
                p0 p0Var = (p0) obj;
                return epx.f(this.a, p0Var.a) && epx.f(this.b, p0Var.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                ExtendedCommunityProfile extendedCommunityProfile = this.b;
                return hashCode + (extendedCommunityProfile == null ? 0 : extendedCommunityProfile.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenDonutModalHint(donutLevel=");
                sb.append(this.a);
                sb.append(", community=");
                return at.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static abstract class q extends j {

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class a extends q {
                public final ExtendedCommunityProfile a;

                public a(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("Clips(community="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class b extends q {
                public final String a;
                public final String b;
                public final String c;
                public final List<CommunityData> d;
                public final String e;

                public b(String str, String str2, String str3, ListBuilder listBuilder, String str4) {
                    this.a = str;
                    this.b = str2;
                    this.c = str3;
                    this.d = listBuilder;
                    this.e = str4;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
                }

                public final int hashCode() {
                    int a = fw3.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
                    String str = this.e;
                    return a + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("FinishDialog(title=");
                    sb.append(this.a);
                    sb.append(", description=");
                    sb.append(this.b);
                    sb.append(", imageUrl=");
                    sb.append(this.c);
                    sb.append(", communities=");
                    sb.append(this.d);
                    sb.append(", buttonText=");
                    return ho8.a(sb, this.e, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class c extends q {
                public final String a;
                public final String b;
                public final String c;
                public final String d;
                public final Good e;

                public c(String str, String str2, String str3, String str4, Good good) {
                    this.a = str;
                    this.b = str2;
                    this.c = str3;
                    this.d = str4;
                    this.e = good;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
                }

                public final int hashCode() {
                    int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
                    String str = this.d;
                    return this.e.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    return "OpenGood(title=" + this.a + ", subtitle=" + this.b + ", buttonText=" + this.c + ", tooltip=" + this.d + ", good=" + this.e + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$q$d, reason: collision with other inner class name */
            public static final class C1601d extends q {
                public final ExtendedCommunityProfile a;
                public final String b;

                public C1601d(ExtendedCommunityProfile extendedCommunityProfile, String str) {
                    this.a = extendedCommunityProfile;
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1601d)) {
                        return false;
                    }
                    C1601d c1601d = (C1601d) obj;
                    return epx.f(this.a, c1601d.a) && epx.f(this.b, c1601d.b);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    String str = this.b;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Posting(community=");
                    sb.append(this.a);
                    sb.append(", tooltip=");
                    return ho8.a(sb, this.b, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class e extends q {
                public final UserId a;
                public final boolean b;

                public e(UserId userId, boolean z) {
                    this.a = userId;
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return epx.f(this.a, eVar.a) && this.b == eVar.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("SkipCreationOnboarding(groupId=");
                    sb.append(this.a);
                    sb.append(", skipAll=");
                    return defpackage.q0.a(sb, this.b, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class f extends q {
                public final String a;
                public final String b;
                public final String c;
                public final List<OnBoardingTask> d;
                public final UserId e;
                public final String f;
                public final String g;

                public f(String str, String str2, String str3, ListBuilder listBuilder, UserId userId, String str4, String str5) {
                    this.a = str;
                    this.b = str2;
                    this.c = str3;
                    this.d = listBuilder;
                    this.e = userId;
                    this.f = str4;
                    this.g = str5;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    f fVar = (f) obj;
                    return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f) && epx.f(this.g, fVar.g);
                }

                public final int hashCode() {
                    return this.g.hashCode() + urd0.a(bh10.a(fw3.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e.b), 31, this.f);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("TasksDialog(title=");
                    sb.append(this.a);
                    sb.append(", image=");
                    sb.append(this.b);
                    sb.append(", description=");
                    sb.append(this.c);
                    sb.append(", tasks=");
                    sb.append(this.d);
                    sb.append(", communityId=");
                    sb.append(this.e);
                    sb.append(", communityUrl=");
                    sb.append(this.f);
                    sb.append(", communityName=");
                    return ho8.a(sb, this.g, ')');
                }
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class q0 extends j {
            public final String a;
            public final int b;
            public final UserId c;
            public final CommonMarketStat$TypeRefSource d;

            public q0(String str, int i, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
                this.a = str;
                this.b = i;
                this.c = userId;
                this.d = commonMarketStat$TypeRefSource;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof q0)) {
                    return false;
                }
                q0 q0Var = (q0) obj;
                return epx.f(this.a, q0Var.a) && this.b == q0Var.b && epx.f(this.c, q0Var.c) && this.d == q0Var.d;
            }

            public final int hashCode() {
                int a = bh10.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c.b);
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.d;
                return a + (commonMarketStat$TypeRefSource == null ? 0 : commonMarketStat$TypeRefSource.hashCode());
            }

            public final String toString() {
                return "OpenGoodsAlbum(title=" + this.a + ", albumId=" + this.b + ", ownerId=" + this.c + ", refSource=" + this.d + ')';
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class r extends j {
            public final ExtendedCommunityProfile a;

            public r(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof r) && epx.f(this.a, ((r) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("EditAvatar(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static abstract class r0 extends j {

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class a extends r0 {
                public final Article a;

                public a(Article article) {
                    this.a = article;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Article(article=" + this.a + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class b extends r0 {
                public final MusicTrack a;
                public final UserId b;
                public final List<MusicTrack> c;

                public b(UserId userId, MusicTrack musicTrack, List list) {
                    this.a = musicTrack;
                    this.b = userId;
                    this.c = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
                }

                public final int hashCode() {
                    int a = bh10.a(this.a.hashCode() * 31, 31, this.b.b);
                    List<MusicTrack> list = this.c;
                    return a + (list == null ? 0 : list.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Audio(musicTrack=");
                    sb.append(this.a);
                    sb.append(", communityId=");
                    sb.append(this.b);
                    sb.append(", preload=");
                    return ms9.a(')', sb, this.c);
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class c extends r0 {
                public final Playlist a;

                public c(Playlist playlist) {
                    this.a = playlist;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "AudioAlbum(playlist=" + this.a + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$r0$d, reason: collision with other inner class name */
            public static final class C1602d extends r0 {
                public final GroupChat a;

                public C1602d(GroupChat groupChat) {
                    this.a = groupChat;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1602d) && epx.f(this.a, ((C1602d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Chat(chat=" + this.a + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class e extends r0 {
                public final Clips a;
                public final VideoFile b;
                public final WeakReference<View> c;
                public final ExtendedCommunityProfile d;

                public e(Clips clips, VideoFile videoFile, WeakReference<View> weakReference, ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = clips;
                    this.b = videoFile;
                    this.c = weakReference;
                    this.d = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
                }

                public final int hashCode() {
                    int b = jq.b(this.b, this.a.hashCode() * 31, 31);
                    WeakReference<View> weakReference = this.c;
                    return this.d.hashCode() + ((b + (weakReference == null ? 0 : weakReference.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Clip(item=");
                    sb.append(this.a);
                    sb.append(", videoFile=");
                    sb.append(this.b);
                    sb.append(", anchor=");
                    sb.append(this.c);
                    sb.append(", profile=");
                    return at.a(sb, this.d, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class f extends r0 {
                public final ClipsPlaylist a;

                public f(ClipsPlaylist clipsPlaylist) {
                    this.a = clipsPlaylist;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "ClipsPlaylist(item=" + this.a + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class g extends r0 {
                public final int a;
                public final ExtendedCommunityProfile b;

                public g(int i, ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = i;
                    this.b = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof g)) {
                        return false;
                    }
                    g gVar = (g) obj;
                    return this.a == gVar.a && epx.f(this.b, gVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Discussion(discussionId=");
                    sb.append(this.a);
                    sb.append(", profile=");
                    return at.a(sb, this.b, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class h extends r0 {
                public final Document a;

                public h(Document document) {
                    this.a = document;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Document(item=" + this.a + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class i extends r0 {
                public final UserId a;

                public i(UserId userId) {
                    this.a = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
                }

                public final int hashCode() {
                    return Long.hashCode(this.a.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("DraftsClips(profileId="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$r0$j, reason: collision with other inner class name */
            public static final class C1603j extends r0 {
                public final Group a;

                public C1603j(Group group) {
                    this.a = group;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1603j) && epx.f(this.a, ((C1603j) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Event(item=" + this.a + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class k extends r0 {
                public final Good a;
                public final CommonMarketStat$TypeRefSource b;

                public k(Good good, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
                    this.a = good;
                    this.b = commonMarketStat$TypeRefSource;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof k)) {
                        return false;
                    }
                    k kVar = (k) obj;
                    return epx.f(this.a, kVar.a) && this.b == kVar.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Good(item=" + this.a + ", refSource=" + this.b + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class l extends r0 {
                public final long a;
                public final UserId b;
                public final CommonMarketStat$TypeRefSource c;

                public l(long j, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
                    this.a = j;
                    this.b = userId;
                    this.c = commonMarketStat$TypeRefSource;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof l)) {
                        return false;
                    }
                    l lVar = (l) obj;
                    return this.a == lVar.a && epx.f(this.b, lVar.b) && this.c == lVar.c;
                }

                public final int hashCode() {
                    return this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
                }

                public final String toString() {
                    return "GoodIds(itemId=" + this.a + ", ownerId=" + this.b + ", refSource=" + this.c + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class m extends r0 {
                public final GoodAlbum a;

                public m(GoodAlbum goodAlbum) {
                    this.a = goodAlbum;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "GoodsAlbum(item=" + this.a + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class n extends r0 {
                public final List<Narrative> a;
                public final Narrative b;
                public final WeakReference<View> c;

                public n(List<Narrative> list, Narrative narrative, WeakReference<View> weakReference) {
                    this.a = list;
                    this.b = narrative;
                    this.c = weakReference;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof n)) {
                        return false;
                    }
                    n nVar = (n) obj;
                    return epx.f(this.a, nVar.a) && epx.f(this.b, nVar.b) && epx.f(this.c, nVar.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "Narrative(narratives=" + this.a + ", item=" + this.b + ", anchor=" + this.c + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class o extends r0 {
                public final iea0 a;
                public final Photo b;
                public final WeakReference<View> c;
                public final int d;
                public final ExtendedCommunityProfile e;

                public o(iea0 iea0Var, Photo photo, WeakReference<View> weakReference, int i, ExtendedCommunityProfile extendedCommunityProfile) {
                    this.a = iea0Var;
                    this.b = photo;
                    this.c = weakReference;
                    this.d = i;
                    this.e = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof o)) {
                        return false;
                    }
                    o oVar = (o) obj;
                    return epx.f(this.a, oVar.a) && epx.f(this.b, oVar.b) && epx.f(this.c, oVar.c) && this.d == oVar.d && epx.f(this.e, oVar.e);
                }

                public final int hashCode() {
                    return this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Photo(item=");
                    sb.append(this.a);
                    sb.append(", photo=");
                    sb.append(this.b);
                    sb.append(", anchor=");
                    sb.append(this.c);
                    sb.append(", positionOffset=");
                    sb.append(this.d);
                    sb.append(", profile=");
                    return at.a(sb, this.e, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class p extends r0 {
                public final PhotoAlbum a;

                public p(PhotoAlbum photoAlbum) {
                    this.a = photoAlbum;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof p) && epx.f(this.a, ((p) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "PhotoAlbum(photoAlbum=" + this.a + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class q extends r0 {
                public final MusicTrack a;
                public final List<MusicTrack> b;
                public final UserId c;

                public q(UserId userId, MusicTrack musicTrack, List list) {
                    this.a = musicTrack;
                    this.b = list;
                    this.c = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof q)) {
                        return false;
                    }
                    q qVar = (q) obj;
                    return epx.f(this.a, qVar.a) && epx.f(this.b, qVar.b) && epx.f(this.c, qVar.c);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    List<MusicTrack> list = this.b;
                    return Long.hashCode(this.c.b) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Podcast(track=");
                    sb.append(this.a);
                    sb.append(", preload=");
                    sb.append(this.b);
                    sb.append(", communityId=");
                    return gp.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class r extends r0 {
                public final UserId a;

                public r(UserId userId) {
                    this.a = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof r) && epx.f(this.a, ((r) obj).a);
                }

                public final int hashCode() {
                    return Long.hashCode(this.a.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("ScheduledClips(profileId="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class s extends r0 {
                public final long a;
                public final UserId b;
                public final CommonMarketStat$TypeRefSource c;

                public s(long j, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
                    this.a = j;
                    this.b = userId;
                    this.c = commonMarketStat$TypeRefSource;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof s)) {
                        return false;
                    }
                    s sVar = (s) obj;
                    return this.a == sVar.a && epx.f(this.b, sVar.b) && this.c == sVar.c;
                }

                public final int hashCode() {
                    return this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
                }

                public final String toString() {
                    return "Service(itemId=" + this.a + ", ownerId=" + this.b + ", refSource=" + this.c + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class t extends r0 {
                public final GoodAlbum a;

                public t(GoodAlbum goodAlbum) {
                    this.a = goodAlbum;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof t) && epx.f(this.a, ((t) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "ServicesAlbum(item=" + this.a + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class u extends r0 {
                public final VideoFile a;
                public final uc b;

                public u(VideoFile videoFile, uc ucVar) {
                    this.a = videoFile;
                    this.b = ucVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof u)) {
                        return false;
                    }
                    u uVar = (u) obj;
                    return epx.f(this.a, uVar.a) && epx.f(this.b, uVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Video(item=" + this.a + ", autoPlayDelegate=" + this.b + ')';
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class v extends r0 {
                public final VideoAlbum a;

                public v(VideoAlbum videoAlbum) {
                    this.a = videoAlbum;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof v) && epx.f(this.a, ((v) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "VideoAlbum(videoAlbum=" + this.a + ')';
                }
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class s extends j {
            public static final s a = new s();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof s);
            }

            public final int hashCode() {
                return 1335130726;
            }

            public final String toString() {
                return "GovernmentOrganizationInfoDialog";
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class t extends j {
            public final MarketItemLabelActionDto a;

            public t(MarketItemLabelActionDto marketItemLabelActionDto) {
                this.a = marketItemLabelActionDto;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && epx.f(this.a, ((t) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "HandleMarketInfoBlockAction(action=" + this.a + ')';
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class t0 extends j {
            public final ExtendedCommunityProfile a;
            public final CommonMarketStat$TypeRefSource b;

            public t0(ExtendedCommunityProfile extendedCommunityProfile, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
                this.a = extendedCommunityProfile;
                this.b = commonMarketStat$TypeRefSource;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof t0)) {
                    return false;
                }
                t0 t0Var = (t0) obj;
                return epx.f(this.a, t0Var.a) && this.b == t0Var.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "OpenMarketCart(community=" + this.a + ", refSource=" + this.b + ')';
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class u extends j {
            public final ExtendedCommunityProfile a;

            public u(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u) && epx.f(this.a, ((u) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("History(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class u0 extends j {
            public final String a;

            public u0(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u0) && epx.f(this.a, ((u0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenMarketPromote(promoteUrl="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static abstract class v extends j {

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class a extends v {
                public final UserId a;

                public a(UserId userId) {
                    this.a = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                }

                public final int hashCode() {
                    return Long.hashCode(this.a.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("AddItem(groupID="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class b extends v {
                public final int a;
                public final UserId b;

                public b(int i, UserId userId) {
                    this.a = i;
                    this.b = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.a == bVar.a && epx.f(this.b, bVar.b);
                }

                public final int hashCode() {
                    return Long.hashCode(this.b.b) + (Integer.hashCode(this.a) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("EditItem(itemID=");
                    sb.append(this.a);
                    sb.append(", groupID=");
                    return gp.b(sb, this.b, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class c extends v {
                public final UserId a;

                public c(UserId userId) {
                    this.a = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
                }

                public final int hashCode() {
                    return Long.hashCode(this.a.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("EditOrder(groupID="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$v$d, reason: collision with other inner class name */
            public static final class C1604d extends v {
                public final String a;

                public C1604d(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1604d) && epx.f(this.a, ((C1604d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("NavigateByLink(link="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class e extends v {
                public final UserId a;

                public e(UserId userId) {
                    this.a = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
                }

                public final int hashCode() {
                    return Long.hashCode(this.a.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("OpenMenu(groupID="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static final class f extends v {
                public final String a;

                public f(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("ShareLink(link="), this.a, ')');
                }
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class v0 extends j {
            public final String a;

            public v0(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof v0) && epx.f(this.a, ((v0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenMarketSectionSettings(link="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class w extends j {
            public final ExtendedCommunityProfile a;

            public w(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof w) && epx.f(this.a, ((w) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("InviteFriends(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class w0 extends j {
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class x extends j {
            public final ExtendedCommunityProfile a;
            public final boolean b;

            public x(ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
                this.a = extendedCommunityProfile;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof x)) {
                    return false;
                }
                x xVar = (x) obj;
                return epx.f(this.a, xVar.a) && this.b == xVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("JoinPopup(community=");
                sb.append(this.a);
                sb.append(", fromToolbar=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class x0 extends j {
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static abstract class y extends j {

            /* compiled from: CommunityProfileSideEffect.kt */
            public static abstract class a extends y {

                /* compiled from: CommunityProfileSideEffect.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$y$a$a, reason: collision with other inner class name */
                public static final class C1605a extends a {
                    public final ExtendedCommunityProfile a;
                    public final View b;
                    public final Rect c;

                    public C1605a(ExtendedCommunityProfile extendedCommunityProfile, View view, Rect rect) {
                        this.a = extendedCommunityProfile;
                        this.b = view;
                        this.c = rect;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1605a)) {
                            return false;
                        }
                        C1605a c1605a = (C1605a) obj;
                        return epx.f(this.a, c1605a.a) && epx.f(this.b, c1605a.b) && epx.f(this.c, c1605a.c);
                    }

                    public final int hashCode() {
                        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                        Rect rect = this.c;
                        return hashCode + (rect == null ? 0 : rect.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("JoinPopupIfNeeded(community=");
                        sb.append(this.a);
                        sb.append(", parentView=");
                        sb.append(this.b);
                        sb.append(", anchorRect=");
                        return yq.c(sb, this.c, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                public static final class b extends a {
                    public final ExtendedCommunityProfile a;
                    public final View b;
                    public final Rect c;

                    public b(ExtendedCommunityProfile extendedCommunityProfile, View view, Rect rect) {
                        this.a = extendedCommunityProfile;
                        this.b = view;
                        this.c = rect;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("NotificationsContextMenu(community=");
                        sb.append(this.a);
                        sb.append(", parentView=");
                        sb.append(this.b);
                        sb.append(", anchorRect=");
                        return yq.c(sb, this.c, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                public static final class c extends a {
                    public final ExtendedCommunityProfile a;

                    public c(ExtendedCommunityProfile extendedCommunityProfile) {
                        this.a = extendedCommunityProfile;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
                    }

                    public final int hashCode() {
                        return this.a.hashCode();
                    }

                    public final String toString() {
                        return at.a(new StringBuilder("OpenMessages(community="), this.a, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$y$a$d, reason: collision with other inner class name */
                public static final class C1606d extends a {
                    public final String a;

                    public C1606d(String str) {
                        this.a = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1606d) && epx.f(this.a, ((C1606d) obj).a);
                    }

                    public final int hashCode() {
                        return this.a.hashCode();
                    }

                    public final String toString() {
                        return ho8.a(new StringBuilder("OpenPromotionUrl(url="), this.a, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                public static final class e extends a {
                    public final ExtendedCommunityProfile a;
                    public final View b;
                    public final Rect c;

                    public e(ExtendedCommunityProfile extendedCommunityProfile, View view, Rect rect) {
                        this.a = extendedCommunityProfile;
                        this.b = view;
                        this.c = rect;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof e)) {
                            return false;
                        }
                        e eVar = (e) obj;
                        return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("SubscriptionOptionsPopup(community=");
                        sb.append(this.a);
                        sb.append(", parentView=");
                        sb.append(this.b);
                        sb.append(", anchorRect=");
                        return yq.c(sb, this.c, ')');
                    }
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static abstract class b extends y {

                /* compiled from: CommunityProfileSideEffect.kt */
                public static final class a extends b {
                    public final ExtendedCommunityProfile a;

                    public a(ExtendedCommunityProfile extendedCommunityProfile) {
                        this.a = extendedCommunityProfile;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                    }

                    public final int hashCode() {
                        return this.a.hashCode();
                    }

                    public final String toString() {
                        return at.a(new StringBuilder("AddContacts(community="), this.a, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$y$b$b, reason: collision with other inner class name */
                public static final class C1607b extends b {
                    public final UserId a;

                    public C1607b(UserId userId) {
                        this.a = userId;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1607b) && epx.f(this.a, ((C1607b) obj).a);
                    }

                    public final int hashCode() {
                        return Long.hashCode(this.a.b);
                    }

                    public final String toString() {
                        return gp.b(new StringBuilder("AddDescription(communityId="), this.a, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                public static final class c extends b {
                    public final ExtendedCommunityProfile a;
                    public final View b;
                    public final Rect c;

                    public c(ExtendedCommunityProfile extendedCommunityProfile, View view, Rect rect) {
                        this.a = extendedCommunityProfile;
                        this.b = view;
                        this.c = rect;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof c)) {
                            return false;
                        }
                        c cVar = (c) obj;
                        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("ManageRelationPopup(community=");
                        sb.append(this.a);
                        sb.append(", parentView=");
                        sb.append(this.b);
                        sb.append(", anchorRect=");
                        return yq.c(sb, this.c, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$y$b$d, reason: collision with other inner class name */
                public static final class C1608d extends b {
                    public final String a;

                    public C1608d(String str) {
                        this.a = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1608d) && epx.f(this.a, ((C1608d) obj).a);
                    }

                    public final int hashCode() {
                        return this.a.hashCode();
                    }

                    public final String toString() {
                        return ho8.a(new StringBuilder("OpenArtistCard(artistId="), this.a, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                public static final class e extends b {
                    public final String a;

                    public e(String str) {
                        this.a = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
                    }

                    public final int hashCode() {
                        return this.a.hashCode();
                    }

                    public final String toString() {
                        return ho8.a(new StringBuilder("OpenCuratorCard(curatorId="), this.a, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                public static final class f extends b {
                    public final ExtendedCommunityProfile a;

                    public f(ExtendedCommunityProfile extendedCommunityProfile) {
                        this.a = extendedCommunityProfile;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
                    }

                    public final String toString() {
                        return "OpenMembers(community=" + this.a + ", startFromFriends=false)";
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                public static final class g extends b {
                    public final String a;

                    public g(String str) {
                        this.a = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
                    }

                    public final int hashCode() {
                        return this.a.hashCode();
                    }

                    public final String toString() {
                        return ho8.a(new StringBuilder("OpenUrl(url="), this.a, ')');
                    }
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            public static abstract class c extends y {

                /* compiled from: CommunityProfileSideEffect.kt */
                public static final class a extends c {
                    public final ExtendedCommunityProfile a;
                    public final int b;

                    public a(int i, ExtendedCommunityProfile extendedCommunityProfile) {
                        this.a = extendedCommunityProfile;
                        this.b = i;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof a)) {
                            return false;
                        }
                        a aVar = (a) obj;
                        return epx.f(this.a, aVar.a) && this.b == aVar.b;
                    }

                    public final int hashCode() {
                        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("OpenProfilePhotos(community=");
                        sb.append(this.a);
                        sb.append(", photoPosition=");
                        return vu5.b(sb, this.b, ')');
                    }
                }
            }

            /* compiled from: CommunityProfileSideEffect.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$y$d, reason: collision with other inner class name */
            public static abstract class AbstractC1609d extends y {

                /* compiled from: CommunityProfileSideEffect.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$y$d$b */
                public static final class b extends AbstractC1609d {
                    public final ExtendedCommunityProfile a;
                    public final Rect b;

                    public b(ExtendedCommunityProfile extendedCommunityProfile, Rect rect) {
                        this.a = extendedCommunityProfile;
                        this.b = rect;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode() + (this.a.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("NotificationsContextMenu(community=");
                        sb.append(this.a);
                        sb.append(", anchorRect=");
                        return yq.c(sb, this.b, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$y$d$c */
                public static final class c extends AbstractC1609d {
                    public final ExtendedCommunityProfile a;
                    public final Rect b;

                    public c(ExtendedCommunityProfile extendedCommunityProfile, Rect rect) {
                        this.a = extendedCommunityProfile;
                        this.b = rect;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof c)) {
                            return false;
                        }
                        c cVar = (c) obj;
                        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode() + (this.a.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("OverflowContextMenu(community=");
                        sb.append(this.a);
                        sb.append(", anchorRect=");
                        return yq.c(sb, this.b, ')');
                    }
                }

                /* compiled from: CommunityProfileSideEffect.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.actions.d$j$y$d$a */
                public static final class a extends AbstractC1609d {
                    public final boolean a;

                    public a(boolean z) {
                        this.a = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && this.a == ((a) obj).a;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.a);
                    }

                    public final String toString() {
                        return defpackage.q0.a(new StringBuilder("Back(useDefaultNativeNavigation="), this.a, ')');
                    }

                    public a() {
                        this(false);
                    }
                }
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class y0 extends j {
            public final ExtendedCommunityProfile a;

            public y0(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof y0) && epx.f(this.a, ((y0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("OpenPostingSheet(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class z extends j {
            public final ExtendedCommunityProfile a;

            public z(ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof z) && epx.f(this.a, ((z) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return at.a(new StringBuilder("LgbtWarningNotificationPopup(community="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class z0 extends j {
            public final String a;

            public z0(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof z0) && epx.f(this.a, ((z0) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                return (str == null ? 0 : str.hashCode()) * 31;
            }

            public final String toString() {
                return i5s.a(new StringBuilder("OpenProductCreationForm(url="), this.a, ", source=null)");
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class h extends j {
            public final boolean a;

            public h(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a == ((h) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Back(useDefaultNativeNavigation="), this.a, ')');
            }

            public h() {
                this(false);
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class s0 extends j {
            public final UserId a;
            public final String b;

            public s0(UserId userId, String str) {
                this.a = userId;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof s0)) {
                    return false;
                }
                s0 s0Var = (s0) obj;
                return epx.f(this.a, s0Var.a) && epx.f(this.b, s0Var.b);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.a.b) * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenLoadCover(communityId=");
                sb.append(this.a);
                sb.append(", source=");
                return ho8.a(sb, this.b, ')');
            }

            public /* synthetic */ s0(UserId userId) {
                this(userId, null);
            }
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static final class k extends d {
        public final ExtendedCommunityProfile a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public k(ExtendedCommunityProfile extendedCommunityProfile, boolean z, boolean z2, boolean z3) {
            this.a = extendedCommunityProfile;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && this.b == kVar.b && this.c == kVar.c && this.d == kVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfileLoaded(profile=");
            sb.append(this.a);
            sb.append(", isReload=");
            sb.append(this.b);
            sb.append(", fullReload=");
            sb.append(this.c);
            sb.append(", fromCache=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static abstract class l extends d {

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class a extends l {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1241307813;
            }

            public final String toString() {
                return "ActivateSearch";
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class b extends l {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1291250601;
            }

            public final String toString() {
                return "DisactivateSearch";
            }
        }

        /* compiled from: CommunityProfileSideEffect.kt */
        public static final class c extends l {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("QueryChanged(query="), this.a, ')');
            }

            public c() {
                this("");
            }
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static final class m extends d {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -882821692;
        }

        public final String toString() {
            return "SendInviteSuccess";
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static final class n extends d {
        public final ContentTab a;

        public n(ContentTab contentTab) {
            this.a = contentTab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.a, ((n) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TabSelected(tab=" + this.a + ')';
        }
    }

    /* compiled from: CommunityProfileSideEffect.kt */
    public static final class o extends d {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 875467653;
        }

        public final String toString() {
            return "TabsOrderSaved";
        }
    }
}
