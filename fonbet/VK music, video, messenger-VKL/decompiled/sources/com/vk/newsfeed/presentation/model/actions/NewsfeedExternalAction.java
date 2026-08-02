package com.vk.newsfeed.presentation.model.actions;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.fave.entities.FavePage;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.newsfeed.presentation.model.ActionButtonType;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import defpackage.q0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import xsna.asp;
import xsna.bh10;
import xsna.cjl0;
import xsna.ck70;
import xsna.e630;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.iag;
import xsna.k73;
import xsna.k8q0;
import xsna.ms9;
import xsna.o3y0;
import xsna.qoy;
import xsna.qr80;
import xsna.s1c0;
import xsna.shy;
import xsna.tq;
import xsna.u0q;
import xsna.u1c0;
import xsna.urd0;
import xsna.vu5;
import xsna.wix;
import xsna.zjt;
import xsna.zrp;

/* compiled from: NewsfeedExternalAction.kt */
/* loaded from: classes4.dex */
public interface NewsfeedExternalAction {

    /* compiled from: NewsfeedExternalAction.kt */
    public interface Navigation extends NewsfeedExternalAction {

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class OpenMyTargetAds implements Navigation {
            public final Context a;
            public final MyTargetNativeAdEntry b;
            public final a c;
            public final int d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: NewsfeedExternalAction.kt */
            public static final class Element {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Element[] $VALUES;
                public static final Element BANNER;
                public static final Element CARD;

                static {
                    Element element = new Element("BANNER", 0);
                    BANNER = element;
                    Element element2 = new Element("CARD", 1);
                    CARD = element2;
                    Element[] elementArr = {element, element2};
                    $VALUES = elementArr;
                    $ENTRIES = new asp(elementArr);
                }

                public Element() {
                    throw null;
                }

                public static Element valueOf(String str) {
                    return (Element) Enum.valueOf(Element.class, str);
                }

                public static Element[] values() {
                    return (Element[]) $VALUES.clone();
                }
            }

            /* compiled from: NewsfeedExternalAction.kt */
            public static final class a {
                public final Element a;
                public final String b;
                public final int c;
                public final wix d;

                public a(Element element, String str, int i, wix wixVar) {
                    this.a = element;
                    this.b = str;
                    this.c = i;
                    this.d = wixVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
                }

                public final int hashCode() {
                    int a = shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31);
                    wix wixVar = this.d;
                    return a + (wixVar == null ? 0 : wixVar.hashCode());
                }

                public final String toString() {
                    return "Payload(element=" + this.a + ", clickTarget=" + this.b + ", clickTargetV2=" + this.c + ", card=" + this.d + ')';
                }
            }

            public OpenMyTargetAds(Context context, MyTargetNativeAdEntry myTargetNativeAdEntry, a aVar, int i) {
                this.a = context;
                this.b = myTargetNativeAdEntry;
                this.c = aVar;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenMyTargetAds)) {
                    return false;
                }
                OpenMyTargetAds openMyTargetAds = (OpenMyTargetAds) obj;
                return epx.f(this.a, openMyTargetAds.a) && epx.f(this.b, openMyTargetAds.b) && epx.f(this.c, openMyTargetAds.c) && this.d == openMyTargetAds.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenMyTargetAds(context=");
                sb.append(this.a);
                sb.append(", entry=");
                sb.append(this.b);
                sb.append(", payload=");
                sb.append(this.c);
                sb.append(", position=");
                return vu5.b(sb, this.d, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class a implements Navigation {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -405729263;
            }

            public final String toString() {
                return "FriendsSuggestions";
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public interface b extends Navigation {

            /* compiled from: NewsfeedExternalAction.kt */
            public static final class a implements b {
                public final NewsEntry a;
                public final int b;

                public a(int i, NewsEntry newsEntry) {
                    this.a = newsEntry;
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
                    StringBuilder sb = new StringBuilder("Open(item=");
                    sb.append(this.a);
                    sb.append(", listItemPosition=");
                    return vu5.b(sb, this.b, ')');
                }
            }

            /* compiled from: NewsfeedExternalAction.kt */
            /* renamed from: com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction$Navigation$b$b, reason: collision with other inner class name */
            public static final class C1436b implements b {
                public final NewsEntry a;

                public C1436b(NewsEntry newsEntry) {
                    this.a = newsEntry;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1436b) && epx.f(this.a, ((C1436b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ck70.a(new StringBuilder("OpenComments(item="), this.a, ')');
                }
            }

            /* compiled from: NewsfeedExternalAction.kt */
            public static class c implements b {
                public final NewsEntry a;
                public final qr80 b;

                public c(NewsEntry newsEntry, qr80 qr80Var) {
                    this.a = newsEntry;
                    this.b = qr80Var;
                }
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class c implements Navigation {
            public final Context a;
            public final ShitAttachment b;
            public final int c;
            public final AdClickContext d;

            public c(Context context, ShitAttachment shitAttachment, int i, AdClickContext adClickContext) {
                this.a = context;
                this.b = shitAttachment;
                this.c = i;
                this.d = adClickContext;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
            }

            public final String toString() {
                return "OpenAds(context=" + this.a + ", entry=" + this.b + ", position=" + this.c + ", adClickContext=" + this.d + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class d implements Navigation {
            public static final d a = new d();
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class e implements Navigation {
            public final MusicTrack a;
            public final ClipAudioTemplate b;
            public final Context c;

            public e(MusicTrack musicTrack, ClipAudioTemplate clipAudioTemplate, Context context) {
                this.a = musicTrack;
                this.b = clipAudioTemplate;
                this.c = context;
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
                int hashCode = this.a.hashCode() * 31;
                ClipAudioTemplate clipAudioTemplate = this.b;
                return this.c.hashCode() + ((hashCode + (clipAudioTemplate == null ? 0 : clipAudioTemplate.b.hashCode())) * 31);
            }

            public final String toString() {
                return "OpenClipMusicGrid(track=" + this.a + ", audioTemplate=" + this.b + ", context=" + this.c + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class f implements Navigation {
            public final Post a;

            public f(Post post) {
                this.a = post;
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
                return "OpenCoowners(post=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class g implements Navigation {
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class h implements Navigation {
            public final UserId a;
            public final int b;
            public final String c;

            public h(UserId userId, int i, String str) {
                this.a = userId;
                this.b = i;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.a, hVar.a) && this.b == hVar.b && epx.f(this.c, hVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenDonutRegularSupportUrl(ownerId=");
                sb.append(this.a);
                sb.append(", itemId=");
                sb.append(this.b);
                sb.append(", actionUrl=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class i implements Navigation {
            public final Context a;
            public final String b;

            public i(Context context, String str) {
                this.a = context;
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
                Context context = this.a;
                return this.b.hashCode() + ((context == null ? 0 : context.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenDzenArticle(context=");
                sb.append(this.a);
                sb.append(", articleId=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class j implements Navigation {
            public final FavePage a;

            public j(FavePage favePage) {
                this.a = favePage;
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class k implements Navigation {
            public final View a;
            public final NewsEntry b;
            public final GeoAttachment c;
            public final u1c0 d;

            public k(View view, NewsEntry newsEntry, GeoAttachment geoAttachment, u1c0 u1c0Var) {
                this.a = view;
                this.b = newsEntry;
                this.c = geoAttachment;
                this.d = u1c0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return epx.f(this.a, kVar.a) && epx.f(this.b, kVar.b) && epx.f(this.c, kVar.c) && epx.f(this.d, kVar.d);
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + e630.b(this.a.hashCode() * 31, 31, this.b)) * 31;
                u1c0 u1c0Var = this.d;
                return hashCode + (u1c0Var == null ? 0 : u1c0Var.hashCode());
            }

            public final String toString() {
                return "OpenGeo(view=" + this.a + ", entry=" + this.b + ", attachment=" + this.c + ", displayItem=" + this.d + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class l implements Navigation {
            public final Context a;
            public final Html5Entry b;

            public l(Context context, Html5Entry html5Entry) {
                this.a = context;
                this.b = html5Entry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "OpenHtml5(context=" + this.a + ", entry=" + this.b + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class m implements Navigation {
            public final Context a;
            public final NewsEntry b;
            public final String c;
            public final String d;

            public m(Context context, NewsEntry newsEntry, String str, String str2) {
                this.a = context;
                this.b = newsEntry;
                this.c = str;
                this.d = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return epx.f(this.a, mVar.a) && epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c) && epx.f(this.d, mVar.d);
            }

            public final int hashCode() {
                int b = e630.b(this.a.hashCode() * 31, 31, this.b);
                String str = this.c;
                int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenLiveByGroup(context=");
                sb.append(this.a);
                sb.append(", item=");
                sb.append(this.b);
                sb.append(", refer=");
                sb.append(this.c);
                sb.append(", trackCode=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class n implements Navigation {
            public final MyTargetNativeAdEntry a;

            public n(MyTargetNativeAdEntry myTargetNativeAdEntry) {
                this.a = myTargetNativeAdEntry;
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
                return "OpenMyTargetBrandLiftSurvey(entry=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class o implements Navigation {
            public static final o a = new o();
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class p implements Navigation {
            public final u1c0 a;
            public final PollAttachment b;

            public p(u1c0 u1c0Var, PollAttachment pollAttachment) {
                this.a = u1c0Var;
                this.b = pollAttachment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof p)) {
                    return false;
                }
                p pVar = (p) obj;
                return epx.f(this.a, pVar.a) && epx.f(this.b, pVar.b);
            }

            public final int hashCode() {
                return this.b.f.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "OpenPollV3Modal(displayItem=" + this.a + ", attachment=" + this.b + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class q implements Navigation {
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class r implements Navigation {
            public final Context a;
            public final PromoPost b;
            public final String c;
            public final String d;
            public final int e;

            public r(Context context, PromoPost promoPost, String str, String str2, int i) {
                this.a = context;
                this.b = promoPost;
                this.c = str;
                this.d = str2;
                this.e = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof r)) {
                    return false;
                }
                r rVar = (r) obj;
                return epx.f(this.a, rVar.a) && epx.f(this.b, rVar.b) && epx.f(this.c, rVar.c) && epx.f(this.d, rVar.d) && this.e == rVar.e;
            }

            public final int hashCode() {
                int hashCode = (this.b.n.hashCode() + (this.a.hashCode() * 31)) * 31;
                String str = this.c;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                return Integer.hashCode(this.e) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenPromoPost(context=");
                sb.append(this.a);
                sb.append(", entry=");
                sb.append(this.b);
                sb.append(", ref=");
                sb.append(this.c);
                sb.append(", trackCode=");
                sb.append(this.d);
                sb.append(", position=");
                return vu5.b(sb, this.e, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class s implements Navigation {
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class t implements Navigation {
            public final SituationalSuggest a;

            public t(SituationalSuggest situationalSuggest) {
                this.a = situationalSuggest;
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
                return "OpenSitPosting(situationalSuggest=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class u implements Navigation {
            public final Context a;
            public final zjt b;
            public final NewsEntry c;
            public final String d;
            public final String e;
            public final MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick.EntryPoint f;

            public u(Context context, zjt zjtVar, NewsEntry newsEntry, String str, String str2, MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick.EntryPoint entryPoint) {
                this.a = context;
                this.b = zjtVar;
                this.c = newsEntry;
                this.d = str;
                this.e = str2;
                this.f = entryPoint;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof u)) {
                    return false;
                }
                u uVar = (u) obj;
                return epx.f(this.a, uVar.a) && this.b.equals(uVar.b) && this.c.equals(uVar.c) && epx.f(this.d, uVar.d) && epx.f(this.e, uVar.e) && this.f == uVar.f;
            }

            public final int hashCode() {
                Context context = this.a;
                int b = e630.b((this.b.hashCode() + ((context == null ? 0 : context.hashCode()) * 31)) * 31, 31, this.c);
                String str = this.d;
                int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.e;
                return this.f.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "OpenStories(context=" + this.a + ", view=" + this.b + ", item=" + this.c + ", ref=" + this.d + ", trackCode=" + this.e + ", feedOpenStoryEntryPoint=" + this.f + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class v implements Navigation {
            public final Post a;
            public final String b;

            public v(String str, Post post) {
                this.a = post;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof v)) {
                    return false;
                }
                v vVar = (v) obj;
                return epx.f(this.a, vVar.a) && epx.f(this.b, vVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenStoryCamera(post=");
                sb.append(this.a);
                sb.append(", refer=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class w implements Navigation {
            public static final w a = new w();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof w);
            }

            public final int hashCode() {
                return 1534379406;
            }

            public final String toString() {
                return "SearchPeople";
            }
        }
    }

    /* compiled from: NewsfeedExternalAction.kt */
    public static final class a implements NewsfeedExternalAction {
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
            return Boolean.hashCode(false) + (Boolean.hashCode(false) * 31);
        }

        public final String toString() {
            return "EnableSmartNews(enable=false, reloadFeed=false)";
        }
    }

    /* compiled from: NewsfeedExternalAction.kt */
    public static abstract class b implements NewsfeedExternalAction {

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class a extends b {
            public final NewsEntry a;
            public final String b;
            public final String c;
            public final MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint d;
            public final NewsEntry e;

            public a(NewsEntry newsEntry, String str, String str2, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint, NewsEntry newsEntry2) {
                this.a = newsEntry;
                this.b = str;
                this.c = str2;
                this.d = entryPoint;
                this.e = newsEntry2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                int hashCode3 = (this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                NewsEntry newsEntry = this.e;
                return hashCode3 + (newsEntry != null ? newsEntry.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenProfile(item=");
                sb.append(this.a);
                sb.append(", refer=");
                sb.append(this.b);
                sb.append(", trackCode=");
                sb.append(this.c);
                sb.append(", feedOpenUserEntryPoint=");
                sb.append(this.d);
                sb.append(", repostRootEntry=");
                return ck70.a(sb, this.e, ')');
            }
        }
    }

    /* compiled from: NewsfeedExternalAction.kt */
    public interface d extends NewsfeedExternalAction {

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class a implements d {
            public final NewsEntry a;
            public final NewsEntry b;
            public final int c;
            public final int d;

            public a(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
                this.a = newsEntry;
                this.b = newsEntry2;
                this.c = i;
                this.d = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                NewsEntry newsEntry = this.b;
                return Integer.hashCode(this.d) + shy.a(this.c, (hashCode + (newsEntry == null ? 0 : newsEntry.hashCode())) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Action(entry=");
                sb.append(this.a);
                sb.append(", rootEntry=");
                sb.append(this.b);
                sb.append(", actionId=");
                sb.append(this.c);
                sb.append(", listItemPosition=");
                return vu5.b(sb, this.d, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class b implements d {
            public final View a;
            public final NewsEntry b;
            public final NewsEntry c;
            public final int d;
            public final s1c0 e;

            public b(View view, NewsEntry newsEntry, NewsEntry newsEntry2, int i, s1c0 s1c0Var) {
                this.a = view;
                this.b = newsEntry;
                this.c = newsEntry2;
                this.d = i;
                this.e = s1c0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                int b = e630.b(this.a.hashCode() * 31, 31, this.b);
                NewsEntry newsEntry = this.c;
                return this.e.hashCode() + shy.a(this.d, (b + (newsEntry == null ? 0 : newsEntry.hashCode())) * 31, 31);
            }

            public final String toString() {
                return "Show(view=" + this.a + ", item=" + this.b + ", root=" + this.c + ", listItemPosition=" + this.d + ", displayContext=" + this.e + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class c implements d {
            public final NewsEntry a;

            public c(NewsEntry newsEntry) {
                this.a = newsEntry;
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
                return ck70.a(new StringBuilder("Update(entry="), this.a, ')');
            }
        }
    }

    /* compiled from: NewsfeedExternalAction.kt */
    public interface e extends NewsfeedExternalAction {

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class a implements e {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1804718658;
            }

            public final String toString() {
                return "OnDismiss";
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class b implements e {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 388779081;
            }

            public final String toString() {
                return "OnShow";
            }
        }
    }

    /* compiled from: NewsfeedExternalAction.kt */
    public interface c extends NewsfeedExternalAction {

        /* compiled from: NewsfeedExternalAction.kt */
        public interface a extends c {

            /* compiled from: NewsfeedExternalAction.kt */
            /* renamed from: com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction$c$a$a, reason: collision with other inner class name */
            public static final class C1437a implements a {
                public final View a;
                public final NewsEntry b;
                public final String c;
                public final MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint d;

                public C1437a(View view, NewsEntry newsEntry, String str, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint) {
                    this.a = view;
                    this.b = newsEntry;
                    this.c = str;
                    this.d = entryPoint;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1437a)) {
                        return false;
                    }
                    C1437a c1437a = (C1437a) obj;
                    return epx.f(this.a, c1437a.a) && epx.f(this.b, c1437a.b) && epx.f(this.c, c1437a.c) && this.d == c1437a.d;
                }

                public final int hashCode() {
                    int b = e630.b(this.a.hashCode() * 31, 31, this.b);
                    String str = this.c;
                    return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    return "ToggleSubscription(anchor=" + this.a + ", entry=" + this.b + ", ref=" + this.c + ", followClickEntryPoint=" + this.d + ')';
                }
            }

            /* compiled from: NewsfeedExternalAction.kt */
            public static final class b implements a {
                public final View a;
                public final Context b;
                public final NewsEntry c;
                public final String d;
                public final MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint e;

                public b(View view, Context context, NewsEntry newsEntry, String str, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint) {
                    this.a = view;
                    this.b = context;
                    this.c = newsEntry;
                    this.d = str;
                    this.e = entryPoint;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e;
                }

                public final int hashCode() {
                    int b = e630.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
                    String str = this.d;
                    return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    return "ToggleSubscriptionWithConfirmation(anchor=" + this.a + ", context=" + this.b + ", entry=" + this.c + ", refer=" + this.d + ", followClickEntryPoint=" + this.e + ')';
                }
            }

            /* compiled from: NewsfeedExternalAction.kt */
            /* renamed from: com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction$c$a$c, reason: collision with other inner class name */
            public static final class C1438c implements a {
                public final Context a;
                public final NewsEntry b;
                public final String c;
                public final MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint d;
                public final ActionButtonType e;

                public C1438c(Context context, NewsEntry newsEntry, String str, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint, ActionButtonType actionButtonType) {
                    this.a = context;
                    this.b = newsEntry;
                    this.c = str;
                    this.d = entryPoint;
                    this.e = actionButtonType;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1438c)) {
                        return false;
                    }
                    C1438c c1438c = (C1438c) obj;
                    return epx.f(this.a, c1438c.a) && epx.f(this.b, c1438c.b) && epx.f(this.c, c1438c.c) && this.d == c1438c.d && this.e == c1438c.e;
                }

                public final int hashCode() {
                    int b = e630.b(this.a.hashCode() * 31, 31, this.b);
                    String str = this.c;
                    return this.e.hashCode() + ((this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31);
                }

                public final String toString() {
                    return "ToggleSubscriptionWithoutDialog(context=" + this.a + ", entry=" + this.b + ", ref=" + this.c + ", followClickEntryPoint=" + this.d + ", actionButtonType=" + this.e + ')';
                }
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class a0 implements c {
            public final NewsEntry a;

            public a0(NewsEntry newsEntry) {
                this.a = newsEntry;
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
                return ck70.a(new StringBuilder("ShowInlineFeedbackConfirmation(entry="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class b implements c {
            public final Post a;

            public b(Post post) {
                this.a = post;
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
                return "ArchivePost(post=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class b0 implements c {
            public final Post a;

            public b0(Post post) {
                this.a = post;
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
                return "TogglePinned(post=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        /* renamed from: com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction$c$c, reason: collision with other inner class name */
        public interface InterfaceC1439c extends c {

            /* compiled from: NewsfeedExternalAction.kt */
            /* renamed from: com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction$c$c$a */
            public static final class a implements InterfaceC1439c {
                public final NewsEntry a;
                public final Map<String, Set<String>> b;

                /* JADX WARN: Multi-variable type inference failed */
                public a(NewsEntry newsEntry, Map<String, ? extends Set<String>> map) {
                    this.a = newsEntry;
                    this.b = map;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Finish(entry=");
                    sb.append(this.a);
                    sb.append(", selectedAnswers=");
                    return cjl0.a(sb, this.b, ')');
                }
            }

            /* compiled from: NewsfeedExternalAction.kt */
            /* renamed from: com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction$c$c$b */
            public static final class b implements InterfaceC1439c {
                public final View a;
                public final NewsEntry b;

                public b(View view, NewsEntry newsEntry) {
                    this.a = view;
                    this.b = newsEntry;
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
                    StringBuilder sb = new StringBuilder("HandleClick(view=");
                    sb.append(this.a);
                    sb.append(", entry=");
                    return ck70.a(sb, this.b, ')');
                }
            }

            /* compiled from: NewsfeedExternalAction.kt */
            /* renamed from: com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction$c$c$c, reason: collision with other inner class name */
            public static final class C1440c implements InterfaceC1439c {
                public final NewsEntry a;

                public C1440c(NewsEntry newsEntry) {
                    this.a = newsEntry;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1440c) && epx.f(this.a, ((C1440c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ck70.a(new StringBuilder("NextQuestion(entry="), this.a, ')');
                }
            }

            /* compiled from: NewsfeedExternalAction.kt */
            /* renamed from: com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction$c$c$d */
            public static final class d implements InterfaceC1439c {
                public final NewsEntry a;

                public d(NewsEntry newsEntry) {
                    this.a = newsEntry;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ck70.a(new StringBuilder("PrevQuestion(entry="), this.a, ')');
                }
            }

            /* compiled from: NewsfeedExternalAction.kt */
            /* renamed from: com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction$c$c$e */
            public static final class e implements InterfaceC1439c {
                public final NewsEntry a;
                public final Object b;

                public e(MyTargetNativeAdEntry myTargetNativeAdEntry, Map map) {
                    this.a = myTargetNativeAdEntry;
                    this.b = map;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return epx.f(this.a, eVar.a) && this.b.equals(eVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("SaveSelectedAnswers(entry=");
                    sb.append(this.a);
                    sb.append(", selectedAnswers=");
                    return k73.c(sb, this.b, ')');
                }
            }

            /* compiled from: NewsfeedExternalAction.kt */
            /* renamed from: com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction$c$c$f */
            public static final class f implements InterfaceC1439c {
                public final NewsEntry a;
                public final String b;
                public final String c;
                public final boolean d;

                public f(NewsEntry newsEntry, String str, String str2, boolean z) {
                    this.a = newsEntry;
                    this.b = str;
                    this.c = str2;
                    this.d = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    f fVar = (f) obj;
                    return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && this.d == fVar.d;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.d) + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("UpdateAnswersState(entry=");
                    sb.append(this.a);
                    sb.append(", questionId=");
                    sb.append(this.b);
                    sb.append(", answerId=");
                    sb.append(this.c);
                    sb.append(", isChecked=");
                    return q0.a(sb, this.d, ')');
                }
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class c0 implements c {
            public final NewsEntry a;
            public final String b;

            public c0(String str, NewsEntry newsEntry) {
                this.a = newsEntry;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c0)) {
                    return false;
                }
                c0 c0Var = (c0) obj;
                return epx.f(this.a, c0Var.a) && epx.f(this.b, c0Var.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ToggleVideoAddedState(faveEntry=");
                sb.append(this.a);
                sb.append(", listRef=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class d implements c {
            public final NewsEntry a;

            public d(NewsEntry newsEntry) {
                this.a = newsEntry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ck70.a(new StringBuilder("CancelReportAd(entry="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class d0 implements c {
            public final Post a;

            public d0(Post post) {
                this.a = post;
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
                return "Translated(post=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class e implements c {
            public final NewsEntry a;
            public final UserId b;
            public final Integer c;
            public final Integer d;
            public final boolean e;

            public e() {
                this(null, null, null, null, true);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && this.e == eVar.e;
            }

            public final int hashCode() {
                NewsEntry newsEntry = this.a;
                int hashCode = (newsEntry == null ? 0 : newsEntry.hashCode()) * 31;
                UserId userId = this.b;
                int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
                Integer num = this.c;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.d;
                return Boolean.hashCode(this.e) + ((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ChangeNewsEntryObsceneTextFilterState(entry=");
                sb.append(this.a);
                sb.append(", commentOwnerId=");
                sb.append(this.b);
                sb.append(", commentItemId=");
                sb.append(this.c);
                sb.append(", commentId=");
                sb.append(this.d);
                sb.append(", isObsceneTextVisible=");
                return q0.a(sb, this.e, ')');
            }

            public e(NewsEntry newsEntry, UserId userId, Integer num, Integer num2, boolean z) {
                this.a = newsEntry;
                this.b = userId;
                this.c = num;
                this.d = num2;
                this.e = z;
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class e0 implements c {
            public final Post a;

            public e0(Post post) {
                this.a = post;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e0) && epx.f(this.a, ((e0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "UnarchivePost(post=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class f implements c {
            public final boolean a;

            public f(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("ChangeObsceneTextFilterState(isEnabled="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class g implements c {
            public final NewsEntry a;

            public g(NewsEntry newsEntry) {
                this.a = newsEntry;
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
                return ck70.a(new StringBuilder("DismissFeedback(entry="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class g0 implements c {
            public final u0q a;

            public g0(u0q u0qVar) {
                this.a = u0qVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g0) && epx.f(this.a, ((g0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "UpdateAfterRepost(payload=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class h implements c {
            public final Photo a;

            public h(Photo photo) {
                this.a = photo;
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
                return tq.c(new StringBuilder("DropBlurredPhotoRestriction(photo="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class h0 implements c {
            public final Attachment a;

            public h0(Attachment attachment) {
                this.a = attachment;
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
                return "UpdateAttachment(attachment=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class i implements c {
            public final Photo a;
            public final UserId b;

            public i(Photo photo, UserId userId) {
                this.a = photo;
                this.b = userId;
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
                return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DropBlurredPhotoRestrictionByOwnerId(photo=");
                sb.append(this.a);
                sb.append(", ownerId=");
                return gp.b(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class i0 implements c {
            public final JSONObject a;

            public i0(JSONObject jSONObject) {
                this.a = jSONObject;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i0) && epx.f(this.a, ((i0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "UpdateEasyPromote(json=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class j implements c {
            public final NewsEntryWithAttachments a;

            public j(NewsEntryWithAttachments newsEntryWithAttachments) {
                this.a = newsEntryWithAttachments;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ExpandAttachmentsCut(entry=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class j0 implements c {
            public final NewsEntry a;

            public j0(NewsEntry newsEntry) {
                this.a = newsEntry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j0) && epx.f(this.a, ((j0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ck70.a(new StringBuilder("UpdateFavouriteState(entry="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class k implements c {
            public final DzenNews a;

            public k(DzenNews dzenNews) {
                this.a = dzenNews;
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
                return "ExpandDzenNews(dzenNews=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class k0 implements c {
            public final Photo a;

            public k0(Photo photo) {
                this.a = photo;
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
                return tq.c(new StringBuilder("UpdatePhoto(photo="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class l implements c {
            public final iag a;
            public final UserId b;
            public final int c;

            public l(int i, UserId userId, iag iagVar) {
                this.a = iagVar;
                this.b = userId;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b) && this.c == lVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("InlineCommentChanged(comment=");
                sb.append(this.a);
                sb.append(", ownerId=");
                sb.append(this.b);
                sb.append(", itemId=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class l0 implements c {
            public final Photo a;

            public l0(Photo photo) {
                this.a = photo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l0) && epx.f(this.a, ((l0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tq.c(new StringBuilder("UpdatePhotoLikeCompanion(photo="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class m implements c {
            public final NewsEntry a;

            public m(NewsEntry newsEntry) {
                this.a = newsEntry;
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
                return ck70.a(new StringBuilder("InsertAtTop(entry="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class n implements c {
            public final NewsEntry a;
            public final Comment b;
            public final String c;
            public final qr80 d;

            public n(NewsEntry newsEntry, Comment comment, String str, qr80 qr80Var) {
                this.a = newsEntry;
                this.b = comment;
                this.c = str;
                this.d = qr80Var;
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class o implements c {
            public final Post a;
            public final Comment b;

            public o(Post post, Comment comment) {
                this.a = post;
                this.b = comment;
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class p implements c {
            public final o3y0 a;

            public p(o3y0 o3y0Var) {
                this.a = o3y0Var;
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
                return "OpenWritebarOverlay(options=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class q implements c {
            public final UserId a;

            public q(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof q) && epx.f(this.a, ((q) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ReloadDonutPostsByOwnerId(userId="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class r implements c {
            public final NewsEntry a;

            public r(NewsEntry newsEntry) {
                this.a = newsEntry;
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
                return ck70.a(new StringBuilder("Remove(entry="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class s implements c {
            public final Post a;

            public s(Post post) {
                this.a = post;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof s) && epx.f(this.a, ((s) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "RemoveActivity(entry=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class t implements c {
            public final Attachment a;

            public t(Attachment attachment) {
                this.a = attachment;
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
                return "RemoveAttachment(attachment=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class u implements c {
            public final UserId a;

            public u(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u) && epx.f(this.a, ((u) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("RemoveByOwnerId(ownerId="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class v implements c {
            public final List<Class<? extends NewsEntry>> a;

            /* JADX WARN: Multi-variable type inference failed */
            public v(List<? extends Class<? extends NewsEntry>> list) {
                this.a = list;
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
                return ms9.a(')', new StringBuilder("RemoveByType(classes="), this.a);
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class w implements c {
            public final UserId a;
            public final int b;
            public final boolean c;
            public final boolean d;
            public final boolean e;
            public final boolean f;

            public w(UserId userId, int i, boolean z, boolean z2, boolean z3, boolean z4) {
                this.a = userId;
                this.b = i;
                this.c = z;
                this.d = z2;
                this.e = z3;
                this.f = z4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof w)) {
                    return false;
                }
                w wVar = (w) obj;
                return epx.f(this.a, wVar.a) && this.b == wVar.b && this.c == wVar.c && this.d == wVar.d && this.e == wVar.e && this.f == wVar.f;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RemovePost(ownerId=");
                sb.append(this.a);
                sb.append(", postId=");
                sb.append(this.b);
                sb.append(", isPostponed=");
                sb.append(this.c);
                sb.append(", isSuggested=");
                sb.append(this.d);
                sb.append(", isDraft=");
                sb.append(this.e);
                sb.append(", isDonut=");
                return q0.a(sb, this.f, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class x implements c {
            public final NewsEntry a;
            public final NewsEntry b;

            public x(NewsEntry newsEntry, NewsEntry newsEntry2) {
                this.a = newsEntry;
                this.b = newsEntry2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof x)) {
                    return false;
                }
                x xVar = (x) obj;
                return epx.f(this.a, xVar.a) && epx.f(this.b, xVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Replace(original=");
                sb.append(this.a);
                sb.append(", replacement=");
                return ck70.a(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class y implements c {
            public final NewsEntry a;
            public final String b;

            public y(String str, NewsEntry newsEntry) {
                this.a = newsEntry;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof y)) {
                    return false;
                }
                y yVar = (y) obj;
                return epx.f(this.a, yVar.a) && epx.f(this.b, yVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ReportAd(entry=");
                sb.append(this.a);
                sb.append(", adChoiceOptionTitle=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class z implements c {
            public final View a;

            public z(View view) {
                this.a = view;
            }
        }

        /* compiled from: NewsfeedExternalAction.kt */
        public static final class f0 implements c {
            public final NewsEntry a;
            public final k8q0 b;

            public f0(NewsEntry newsEntry, k8q0 k8q0Var) {
                this.a = newsEntry;
                this.b = k8q0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f0)) {
                    return false;
                }
                f0 f0Var = (f0) obj;
                return epx.f(this.a, f0Var.a) && epx.f(this.b, f0Var.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Update(entry=" + this.a + ", intent=" + this.b + ')';
            }

            public /* synthetic */ f0(NewsEntry newsEntry) {
                this(newsEntry, k8q0.b.a);
            }
        }
    }
}
