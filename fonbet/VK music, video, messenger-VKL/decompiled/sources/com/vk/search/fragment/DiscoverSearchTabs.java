package com.vk.search.fragment;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.e43;
import xsna.epx;
import xsna.gzs;
import xsna.ho8;
import xsna.j5g;
import xsna.la0;
import xsna.msy;
import xsna.s3q0;
import xsna.sf3;
import xsna.shy;
import xsna.wzs;
import xsna.zrp;

/* compiled from: DiscoverSearchTabs.kt */
/* loaded from: classes5.dex */
public final class DiscoverSearchTabs {
    public static final Object a = msy.a(LazyThreadSafetyMode.NONE, new la0(9));
    public static final List<SearchTabName> b;
    public static final List<SearchTabName> c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DiscoverSearchTabs.kt */
    public static final class SearchTabName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchTabName[] $VALUES;
        public static final a Companion;
        public static final SearchTabName SearchAll;
        public static final SearchTabName SearchChannels;
        public static final SearchTabName SearchClips;
        public static final SearchTabName SearchGames;
        public static final SearchTabName SearchGoods;
        public static final SearchTabName SearchGroups;
        public static final SearchTabName SearchMiniApps;
        public static final SearchTabName SearchMusic;
        public static final SearchTabName SearchNews;
        public static final SearchTabName SearchPeople;
        public static final SearchTabName SearchVideo;
        private final String tabName;

        /* compiled from: DiscoverSearchTabs.kt */
        public static final class a {
            public static SearchTabName a(String str) {
                Object obj;
                Iterator<E> it = SearchTabName.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((SearchTabName) obj).i(), str)) {
                        break;
                    }
                }
                return (SearchTabName) obj;
            }
        }

        static {
            SearchTabName searchTabName = new SearchTabName("SearchAll", 0, "all");
            SearchAll = searchTabName;
            SearchTabName searchTabName2 = new SearchTabName("SearchPeople", 1, "people");
            SearchPeople = searchTabName2;
            SearchTabName searchTabName3 = new SearchTabName("SearchGroups", 2, "groups");
            SearchGroups = searchTabName3;
            SearchTabName searchTabName4 = new SearchTabName("SearchChannels", 3, RTCStatsConstants.KEY_CHANNELS);
            SearchChannels = searchTabName4;
            SearchTabName searchTabName5 = new SearchTabName("SearchMusic", 4, "music");
            SearchMusic = searchTabName5;
            SearchTabName searchTabName6 = new SearchTabName("SearchMiniApps", 5, "mini_apps");
            SearchMiniApps = searchTabName6;
            SearchTabName searchTabName7 = new SearchTabName("SearchGames", 6, "games");
            SearchGames = searchTabName7;
            SearchTabName searchTabName8 = new SearchTabName("SearchGoods", 7, "goods");
            SearchGoods = searchTabName8;
            SearchTabName searchTabName9 = new SearchTabName("SearchNews", 8, "news");
            SearchNews = searchTabName9;
            SearchTabName searchTabName10 = new SearchTabName("SearchVideo", 9, "video");
            SearchVideo = searchTabName10;
            SearchTabName searchTabName11 = new SearchTabName("SearchClips", 10, "clips");
            SearchClips = searchTabName11;
            SearchTabName[] searchTabNameArr = {searchTabName, searchTabName2, searchTabName3, searchTabName4, searchTabName5, searchTabName6, searchTabName7, searchTabName8, searchTabName9, searchTabName10, searchTabName11};
            $VALUES = searchTabNameArr;
            $ENTRIES = new asp(searchTabNameArr);
            Companion = new a();
        }

        public SearchTabName(String str, int i, String str2) {
            this.tabName = str2;
        }

        public static zrp<SearchTabName> h() {
            return $ENTRIES;
        }

        public static SearchTabName valueOf(String str) {
            return (SearchTabName) Enum.valueOf(SearchTabName.class, str);
        }

        public static SearchTabName[] values() {
            return (SearchTabName[]) $VALUES.clone();
        }

        public final String i() {
            return this.tabName;
        }
    }

    /* compiled from: DiscoverSearchTabs.kt */
    public static final class a {
        public final int a;
        public final gzs<FragmentImpl> b;
        public final wzs<Fragment, Activity, s3q0> c;
        public final int d;
        public final String e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, gzs<? extends FragmentImpl> gzsVar, wzs<? super Fragment, ? super Activity, s3q0> wzsVar, int i2, String str) {
            this.a = i;
            this.b = gzsVar;
            this.c = wzsVar;
            this.d = i2;
            this.e = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = sf3.a(Integer.hashCode(this.a) * 31, 31, this.b);
            wzs<Fragment, Activity, s3q0> wzsVar = this.c;
            return this.e.hashCode() + shy.a(this.d, (a + (wzsVar == null ? 0 : wzsVar.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabInfo(tabTitle=");
            sb.append(this.a);
            sb.append(", newFragment=");
            sb.append(this.b);
            sb.append(", showParamsDialogSheet=");
            sb.append(this.c);
            sb.append(", searchHintId=");
            sb.append(this.d);
            sb.append(", searchTabId=");
            return ho8.a(sb, this.e, ')');
        }
    }

    static {
        ArrayList arrayList;
        List<String> f;
        List<SearchTabName> l = e43.l(SearchTabName.SearchAll, SearchTabName.SearchPeople, SearchTabName.SearchGroups, SearchTabName.SearchGoods, SearchTabName.SearchGames, SearchTabName.SearchMusic, SearchTabName.SearchMiniApps, SearchTabName.SearchVideo, SearchTabName.SearchClips, SearchTabName.SearchChannels, SearchTabName.SearchNews);
        b = l;
        b.d i = b.A.i(Features.Type.FEATURE_SEARCH_GLOBAL_TABS_ORDER);
        ArrayList arrayList2 = null;
        if (i == null || (f = i.f()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str : f) {
                SearchTabName.Companion.getClass();
                SearchTabName a2 = SearchTabName.a.a(str);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Set S0 = j5g.S0(arrayList);
            if (S0.size() == arrayList.size() && !S0.contains(SearchTabName.SearchAll)) {
                if (!S0.contains(SearchTabName.SearchChannels)) {
                    Iterator it = arrayList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (((SearchTabName) it.next()) == SearchTabName.SearchClips) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(arrayList);
                    if (i2 != -1) {
                        arrayList3.add(i2 + 1, SearchTabName.SearchChannels);
                    }
                    arrayList = arrayList3;
                }
                if (arrayList.size() == l.size() - 1) {
                    arrayList2 = arrayList;
                }
            }
        }
        if (arrayList2 != null) {
            l = j5g.u0(arrayList2, Collections.singletonList(SearchTabName.SearchAll));
        }
        c = l;
    }

    public static SearchTabName a(int i) {
        return (SearchTabName) j5g.b0(i, c);
    }

    public static int b(SearchTabName searchTabName) {
        return c.indexOf(searchTabName);
    }
}
