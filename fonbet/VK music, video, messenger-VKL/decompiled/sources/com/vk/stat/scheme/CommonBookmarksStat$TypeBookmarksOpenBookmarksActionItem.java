package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonBookmarksStat.kt */
/* loaded from: classes5.dex */
public final class CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem {

    @pmi0("filter_section")
    private final FilterSection filterSection;

    @pmi0("is_from_snackbar")
    private final Boolean isFromSnackbar;

    @pmi0("tag_id")
    private final Integer tagId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonBookmarksStat.kt */
    public static final class FilterSection {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FilterSection[] $VALUES;

        @pmi0("all")
        public static final FilterSection ALL;

        @pmi0("articles")
        public static final FilterSection ARTICLES;

        @pmi0("classifieds")
        public static final FilterSection CLASSIFIEDS;

        @pmi0("clips")
        public static final FilterSection CLIPS;

        @pmi0("game")
        public static final FilterSection GAME;

        @pmi0("groups")
        public static final FilterSection GROUPS;

        @pmi0("links")
        public static final FilterSection LINKS;

        @pmi0("mini_apps")
        public static final FilterSection MINI_APPS;

        @pmi0("narratives")
        public static final FilterSection NARRATIVES;

        @pmi0("pages")
        public static final FilterSection PAGES;

        @pmi0("podcasts")
        public static final FilterSection PODCASTS;

        @pmi0("posts")
        public static final FilterSection POSTS;

        @pmi0("products")
        public static final FilterSection PRODUCTS;

        @pmi0("unknown")
        public static final FilterSection UNKNOWN;

        @pmi0("users")
        public static final FilterSection USERS;

        @pmi0("videos")
        public static final FilterSection VIDEOS;

        static {
            FilterSection filterSection = new FilterSection("ALL", 0);
            ALL = filterSection;
            FilterSection filterSection2 = new FilterSection("ARTICLES", 1);
            ARTICLES = filterSection2;
            FilterSection filterSection3 = new FilterSection("CLASSIFIEDS", 2);
            CLASSIFIEDS = filterSection3;
            FilterSection filterSection4 = new FilterSection("GAME", 3);
            GAME = filterSection4;
            FilterSection filterSection5 = new FilterSection("GROUPS", 4);
            GROUPS = filterSection5;
            FilterSection filterSection6 = new FilterSection("LINKS", 5);
            LINKS = filterSection6;
            FilterSection filterSection7 = new FilterSection("NARRATIVES", 6);
            NARRATIVES = filterSection7;
            FilterSection filterSection8 = new FilterSection("PAGES", 7);
            PAGES = filterSection8;
            FilterSection filterSection9 = new FilterSection("PODCASTS", 8);
            PODCASTS = filterSection9;
            FilterSection filterSection10 = new FilterSection("POSTS", 9);
            POSTS = filterSection10;
            FilterSection filterSection11 = new FilterSection("PRODUCTS", 10);
            PRODUCTS = filterSection11;
            FilterSection filterSection12 = new FilterSection(GrsBaseInfo.CountryCodeSource.UNKNOWN, 11);
            UNKNOWN = filterSection12;
            FilterSection filterSection13 = new FilterSection("USERS", 12);
            USERS = filterSection13;
            FilterSection filterSection14 = new FilterSection("VIDEOS", 13);
            VIDEOS = filterSection14;
            FilterSection filterSection15 = new FilterSection("CLIPS", 14);
            CLIPS = filterSection15;
            FilterSection filterSection16 = new FilterSection("MINI_APPS", 15);
            MINI_APPS = filterSection16;
            FilterSection[] filterSectionArr = {filterSection, filterSection2, filterSection3, filterSection4, filterSection5, filterSection6, filterSection7, filterSection8, filterSection9, filterSection10, filterSection11, filterSection12, filterSection13, filterSection14, filterSection15, filterSection16};
            $VALUES = filterSectionArr;
            $ENTRIES = new asp(filterSectionArr);
        }

        private FilterSection(String str, int i) {
        }

        public static FilterSection valueOf(String str) {
            return (FilterSection) Enum.valueOf(FilterSection.class, str);
        }

        public static FilterSection[] values() {
            return (FilterSection[]) $VALUES.clone();
        }
    }

    public CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem)) {
            return false;
        }
        CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem = (CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem) obj;
        return this.filterSection == commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem.filterSection && epx.f(this.tagId, commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem.tagId) && epx.f(this.isFromSnackbar, commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem.isFromSnackbar);
    }

    public final int hashCode() {
        FilterSection filterSection = this.filterSection;
        int hashCode = (filterSection == null ? 0 : filterSection.hashCode()) * 31;
        Integer num = this.tagId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isFromSnackbar;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeBookmarksOpenBookmarksActionItem(filterSection=");
        sb.append(this.filterSection);
        sb.append(", tagId=");
        sb.append(this.tagId);
        sb.append(", isFromSnackbar=");
        return tn.a(sb, this.isFromSnackbar, ')');
    }

    public CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem(FilterSection filterSection, Integer num, Boolean bool) {
        this.filterSection = filterSection;
        this.tagId = num;
        this.isFromSnackbar = bool;
    }

    public /* synthetic */ CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem(FilterSection filterSection, Integer num, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : filterSection, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool);
    }
}
