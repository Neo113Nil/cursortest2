package com.vk.newsfeed.common.util;

import android.os.Parcelable;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.PageHistory;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenNewsItem;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.util.NewsfeedViewPostCache;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsSubscriptionItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeDzenStoryItemView;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeDzenStoryView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bjc;
import xsna.epx;
import xsna.fsx0;
import xsna.hzp0;
import xsna.j5g;
import xsna.sni;
import xsna.u1c0;
import xsna.uzp0;
import xsna.xuo0;
import xsna.yzs;

/* compiled from: PostsAnalytics.kt */
/* loaded from: classes4.dex */
public final class k {
    public static String a = null;
    public static int b = -1;
    public static int c = -1;
    public static final HashMap<String, ArrayList<a>> d = new HashMap<>();

    /* compiled from: PostsAnalytics.kt */
    public static final class a {
        public final NewsEntry a;
        public final int b;
        public final String c;

        public a(NewsEntry newsEntry, int i, String str) {
            this.a = newsEntry;
            this.b = i;
            this.c = str;
        }
    }

    /* compiled from: PostsAnalytics.kt */
    public static final class b {
        public static a a(u1c0 u1c0Var) {
            NewsEntry newsEntry = u1c0Var.b;
            int i = u1c0Var.k;
            String str = u1c0Var.l;
            int i2 = u1c0Var.f;
            if (newsEntry instanceof Post) {
                return new a(newsEntry, i, str);
            }
            if (newsEntry instanceof PromoPost) {
                return new a(((PromoPost) newsEntry).n, i, str);
            }
            if (newsEntry instanceof DzenStory) {
                return new a(newsEntry, i2, null);
            }
            if (newsEntry instanceof DzenNews) {
                return new a(newsEntry, i2, null);
            }
            return null;
        }
    }

    public static void a(String str, u1c0 u1c0Var) {
        a a2 = b.a(u1c0Var);
        if (a2 == null) {
            return;
        }
        HashMap<String, ArrayList<a>> hashMap = d;
        ArrayList<a> arrayList = hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(a2);
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, arrayList);
    }

    public static JSONArray b(List list) {
        JSONArray jSONArray = new JSONArray();
        List list2 = list;
        if ((list2 instanceof List) && (list2 instanceof RandomAccess)) {
            List list3 = list2;
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                String Ab = ((NewsEntry) list3.get(i)).Ab();
                if (Ab != null) {
                    jSONArray.put(Ab);
                }
            }
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String Ab2 = ((NewsEntry) it.next()).Ab();
                if (Ab2 != null) {
                    jSONArray.put(Ab2);
                }
            }
        }
        return jSONArray;
    }

    public static void c(ArrayList arrayList, List list, ArrayList arrayList2, String str, String str2, long j, long j2, String str3, int i, ArrayList arrayList3) {
        b.d dVar = new b.d("newsfeed_ads_anomaly");
        if (str == null) {
            str = "[null]";
        }
        dVar.b(str, "start_from");
        if (str2 == null) {
            str2 = "[null]";
        }
        dVar.b(str2, "next_from");
        dVar.b(Long.valueOf(j), "time_request ");
        dVar.b(Long.valueOf(j2), "time_answer");
        dVar.b(str3, "event_type");
        dVar.b(Integer.valueOf(i), "anomaly_count");
        dVar.b(b(arrayList), "current_post_ids");
        dVar.b(b(list), "new_post_ids");
        dVar.b(b(arrayList2), "filtered_new_postIds");
        JSONArray jSONArray = new JSONArray();
        if (arrayList3 == null || arrayList3 == null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                jSONArray.put(((PageHistory) it.next()).e5());
            }
        } else {
            int size = arrayList3.size();
            for (int i2 = 0; i2 < size; i2++) {
                jSONArray.put(((PageHistory) arrayList3.get(i2)).e5());
            }
        }
        dVar.b(jSONArray, "pages_history");
        dVar.e();
    }

    public static void d(int i, int i2, String str, String str2, String str3) {
        if (str3.equals(a) || i2 == b) {
            return;
        }
        a = str3;
        b = i2;
        b.d dVar = new b.d("discover_category_change");
        dVar.b(str, "type");
        dVar.b(str2, "from_id");
        dVar.b(str3, "to_id");
        dVar.b(Integer.valueOf(i), "from_index");
        dVar.b(Integer.valueOf(i2), "to_index");
        dVar.e();
    }

    public static void e(String str, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4) {
        b.d a2 = io.reactivex.rxjava3.processors.b.a("news_fresh_items_loaded", "state", str);
        a2.b(Integer.valueOf(i), "scroll_position");
        a2.b(Boolean.valueOf(z), "is_on_screen");
        a2.b(Boolean.valueOf(z3), "is_top");
        a2.b(Integer.valueOf(i2), "list_id");
        a2.b(Boolean.valueOf(z4), "has_fresh");
        a2.b(Boolean.valueOf(z2), "on_top_and_only");
        a2.b(Boolean.valueOf(!z && z2), "on_top_while_hidden");
        a2.e();
    }

    public static final void f(String str, boolean z) {
        b.d dVar = new b.d("ads/click_open_link_url");
        dVar.b(Boolean.valueOf(z), "autolaunched");
        dVar.b(str, "track_code");
        dVar.b(com.vkontakte.android.data.b.h().r, "ads_device_id");
        xuo0.a.getClass();
        dVar.b(Long.valueOf(xuo0.c()), "at");
        dVar.h();
    }

    public static final void g(Html5Entry html5Entry, JSONObject jSONObject) {
        if (html5Entry == null) {
            return;
        }
        b.d dVar = new b.d("ads/html5_inapp_track_event");
        dVar.b(html5Entry.w.b, "track_code");
        xuo0.a.getClass();
        dVar.b(Long.valueOf(xuo0.c()), "at");
        dVar.b(jSONObject, "payload");
        dVar.h();
    }

    public static final void h(boolean z, Html5Entry html5Entry) {
        if (html5Entry == null) {
            return;
        }
        b.d dVar = new b.d("ads/html5_app_launched");
        dVar.b(Boolean.valueOf(z), "autolaunched");
        dVar.b(html5Entry.w.b, "track_code");
        xuo0.a.getClass();
        dVar.b(Long.valueOf(xuo0.c()), "at");
        dVar.e();
    }

    public static void i(Html5Entry html5Entry) {
        if (html5Entry == null) {
            return;
        }
        b.d dVar = new b.d("ads/html5_onerror");
        dVar.b(html5Entry.w.b, "track_code");
        dVar.b("cant_download", "reason");
        xuo0.a.getClass();
        dVar.b(Long.valueOf(xuo0.c()), "at");
        dVar.e();
    }

    public static final void j(Html5Entry html5Entry) {
        if (html5Entry == null) {
            return;
        }
        b.d dVar = new b.d("ads/html5_browser_resumed");
        dVar.b(html5Entry.w.b, "track_code");
        xuo0.a.getClass();
        dVar.b(Long.valueOf(xuo0.c()), "at");
        dVar.e();
    }

    public static void k(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        b.d dVar = new b.d("news_items_replaced");
        dVar.b(Integer.valueOf(i), "scroll_position");
        dVar.b(Boolean.valueOf(z), "is_on_screen");
        dVar.b(Boolean.valueOf(z3), "is_top");
        dVar.b(Integer.valueOf(i2), "list_id");
        dVar.b(Boolean.valueOf(z4), "has_fresh");
        dVar.b(Boolean.valueOf(z2), "on_top_and_only");
        dVar.b(Boolean.valueOf(!z && z2), "on_top_while_hidden");
        dVar.e();
    }

    public static void l(int i, UserId userId, String str, String str2, boolean z) {
        b.d dVar = new b.d("post_event_action");
        dVar.b(userId, "owner_id");
        dVar.b(Integer.valueOf(i), "post_id");
        dVar.b(str2, "type");
        dVar.b(z ? "join" : "leave", "action");
        dVar.b(str, "track_code");
        dVar.e();
    }

    public static void m(String str, yzs yzsVar) {
        ArrayList<a> arrayList = d.get(str);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o(arrayList.get(i), yzsVar);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void n(NewsEntry newsEntry) {
        MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype eventSubtype;
        List<EntryAttachment> N7;
        EntryAttachment entryAttachment;
        fsx0 fsx0Var = newsEntry instanceof fsx0 ? (fsx0) newsEntry : null;
        Attachment attachment = (fsx0Var == null || (N7 = fsx0Var.N7()) == null || (entryAttachment = (EntryAttachment) j5g.a0(N7)) == null) ? null : entryAttachment.b;
        VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
        Parcelable parcelable = videoAttachment != null ? videoAttachment.k : null;
        ClipVideoFile clipVideoFile = parcelable instanceof ClipVideoFile ? (ClipVideoFile) parcelable : null;
        if (clipVideoFile != null) {
            boolean q = sni.q(newsEntry);
            boolean z = !q;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(clipVideoFile.c), Long.valueOf(clipVideoFile.b.b), null, clipVideoFile.W, null, 40, null);
            SchemeStat$TypeClipViewerItem.ScreenType screenType = SchemeStat$TypeClipViewerItem.ScreenType.SUBSCRIPTIONS;
            SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_SUBSCRIPTION_BUTTON;
            if (z) {
                eventSubtype = MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype.SUBSCRIBE;
            } else {
                if (!q) {
                    throw new NoWhenBranchMatchedException();
                }
                eventSubtype = MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype.UNSUBSCRIBE;
            }
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new SchemeStat$TypeClipViewerItem(screenType, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsSubscriptionItem(MobileOfficialAppsClipsStat$ClipsSubscriptionItem.SubscriptionPlace.FEED, eventSubtype), null, null, null, null, null, null, 1065353212, null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, b2, uzp0Var.a).q();
        }
    }

    public static void o(a aVar, yzs yzsVar) {
        List<DzenStory.DzenStoryItem> list;
        DzenStory.DzenStoryItem dzenStoryItem;
        NewsfeedResearch newsfeedResearch;
        String str;
        NewsfeedResearch newsfeedResearch2;
        String str2;
        NewsEntry newsEntry = aVar.a;
        int i = aVar.b;
        if (newsEntry instanceof Post) {
            p((Post) newsEntry, i, aVar.c);
            return;
        }
        hzp0 hzp0Var = null;
        if (newsEntry instanceof DzenStory) {
            DzenStory.DzenStoryItem dzenStoryItem2 = (DzenStory.DzenStoryItem) j5g.b0(i, ((DzenStory) newsEntry).j);
            if (dzenStoryItem2 != null && (str2 = dzenStoryItem2.f) != null) {
                hzp0Var = new hzp0.o(new SchemeStat$EventItem(SchemeStat$EventItem.Type.DZEN_STORY_ITEM, null, null, null, str2, null, 46, null), i, new MobileOfficialAppsFeedStat$TypeDzenStoryItemView(str2));
            }
            if (hzp0Var != null) {
                hzp0Var.a();
            }
            DzenStory.DzenStoryItem dzenStoryItem3 = (DzenStory.DzenStoryItem) j5g.b0(i, ((DzenStory) newsEntry).j);
            if (dzenStoryItem3 == null || (newsfeedResearch2 = dzenStoryItem3.h) == null) {
                return;
            }
            UiTracker uiTracker = UiTracker.a;
            yzsVar.invoke(newsEntry, newsfeedResearch2, UiTracker.c());
            return;
        }
        if (newsEntry instanceof DzenNews) {
            DzenNewsItem dzenNewsItem = (DzenNewsItem) j5g.b0(i, ((DzenNews) newsEntry).j);
            if (dzenNewsItem != null && (str = dzenNewsItem.f) != null) {
                hzp0Var = new hzp0.p(new SchemeStat$EventItem(SchemeStat$EventItem.Type.DZEN_STORY, null, null, null, str, null, 46, null), i, new MobileOfficialAppsFeedStat$TypeDzenStoryView(str));
            }
            if (hzp0Var != null) {
                hzp0Var.a();
            }
            DzenNewsItem dzenNewsItem2 = (DzenNewsItem) j5g.b0(i, ((DzenNews) newsEntry).j);
            if (dzenNewsItem2 == null || (list = dzenNewsItem2.e.j) == null || (dzenStoryItem = (DzenStory.DzenStoryItem) j5g.b0(0, list)) == null || (newsfeedResearch = dzenStoryItem.h) == null) {
                return;
            }
            UiTracker uiTracker2 = UiTracker.a;
            yzsVar.invoke(newsEntry, newsfeedResearch, UiTracker.c());
        }
    }

    public static void p(Post post, int i, String str) {
        String str2;
        String str3 = post.t;
        String Ab = post.Ab();
        NewsEntry.TrackData trackData = post.L;
        if (trackData.e || NewsfeedViewPostCache.a(Ab)) {
            trackData.e = true;
            return;
        }
        trackData.e = true;
        NewsfeedViewPostCache.SetWrapper setWrapper = NewsfeedViewPostCache.a;
        Set<String> set = setWrapper.b;
        Set<String> set2 = setWrapper.b;
        if (set.contains(Ab)) {
            set2.remove(Ab);
        }
        set.add(Ab);
        if (set.size() > 642 && (str2 = (String) j5g.Z(set)) != null) {
            set2.remove(str2);
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        if (epx.f(str3, "post")) {
            str3 = "wall";
        }
        String str5 = post.m + '_' + post.n + '|' + str3 + '|' + str + '|' + i;
        String str6 = trackData.b;
        if (str6 == null) {
            str6 = "";
        }
        Post post2 = post.D;
        if (post2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(post2.m);
            sb.append('_');
            sb.append(post2.n);
            str4 = sb.toString();
        }
        b.d dVar = new b.d("view_post");
        dVar.b = true;
        dVar.b(str6, "track_code");
        dVar.b(str5, "post_ids");
        dVar.b(str4, "repost_ids");
        dVar.e();
    }
}
