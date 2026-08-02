package com.vk.profile.core.tabs.state;

import com.vk.dto.common.id.UserId;
import com.vk.profile.core.content.ContentTab;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.zrp;

/* compiled from: CommunityProfileContent.kt */
/* loaded from: classes5.dex */
public final class CommunityProfileContent {
    public final UserId a;
    public final List<CommunityProfileContentItem> b;
    public final ContentTab c;
    public final String d;
    public final boolean e;
    public final Integer f;
    public final InitialPosition g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Pair<String, String> k;

    /* compiled from: CommunityProfileContent.kt */
    public static final class InitialPosition {
        public final int a;
        public final ScrollToContentType b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CommunityProfileContent.kt */
        public static final class ScrollToContentType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ScrollToContentType[] $VALUES;
            public static final ScrollToContentType BASE;
            public static final ScrollToContentType NONE;
            public static final ScrollToContentType SMOOTH;

            static {
                ScrollToContentType scrollToContentType = new ScrollToContentType("NONE", 0);
                NONE = scrollToContentType;
                ScrollToContentType scrollToContentType2 = new ScrollToContentType("BASE", 1);
                BASE = scrollToContentType2;
                ScrollToContentType scrollToContentType3 = new ScrollToContentType("SMOOTH", 2);
                SMOOTH = scrollToContentType3;
                ScrollToContentType[] scrollToContentTypeArr = {scrollToContentType, scrollToContentType2, scrollToContentType3};
                $VALUES = scrollToContentTypeArr;
                $ENTRIES = new asp(scrollToContentTypeArr);
            }

            public ScrollToContentType() {
                throw null;
            }

            public static ScrollToContentType valueOf(String str) {
                return (ScrollToContentType) Enum.valueOf(ScrollToContentType.class, str);
            }

            public static ScrollToContentType[] values() {
                return (ScrollToContentType[]) $VALUES.clone();
            }
        }

        public InitialPosition(int i, ScrollToContentType scrollToContentType) {
            this.a = i;
            this.b = scrollToContentType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialPosition)) {
                return false;
            }
            InitialPosition initialPosition = (InitialPosition) obj;
            return this.a == initialPosition.a && this.b == initialPosition.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "InitialPosition(position=" + this.a + ", scrollToContentType=" + this.b + ')';
        }
    }

    public CommunityProfileContent() {
        this((UserId) null, (List) null, (ContentTab) null, (String) null, false, (Integer) null, (InitialPosition) null, false, false, (Pair) null, 2047);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CommunityProfileContent a(CommunityProfileContent communityProfileContent, ArrayList arrayList, Integer num, InitialPosition initialPosition, int i) {
        UserId userId = communityProfileContent.a;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = communityProfileContent.b;
        }
        List list2 = list;
        ContentTab contentTab = communityProfileContent.c;
        String str = communityProfileContent.d;
        boolean z = communityProfileContent.e;
        if ((i & 32) != 0) {
            num = communityProfileContent.f;
        }
        Integer num2 = num;
        InitialPosition initialPosition2 = (i & 64) != 0 ? communityProfileContent.g : initialPosition;
        boolean z2 = communityProfileContent.h;
        boolean z3 = (i & 256) != 0 ? communityProfileContent.i : false;
        boolean z4 = communityProfileContent.j;
        Pair<String, String> pair = communityProfileContent.k;
        communityProfileContent.getClass();
        return new CommunityProfileContent(userId, (List<? extends CommunityProfileContentItem>) list2, contentTab, str, z, num2, initialPosition2, z2, z3, z4, pair);
    }

    public final boolean b() {
        CommunityProfileContentItem communityProfileContentItem;
        List<CommunityProfileContentItem> list = this.b;
        ListIterator<CommunityProfileContentItem> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                communityProfileContentItem = null;
                break;
            }
            communityProfileContentItem = listIterator.previous();
            if (communityProfileContentItem.h == 17) {
                break;
            }
        }
        return communityProfileContentItem != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityProfileContent)) {
            return false;
        }
        CommunityProfileContent communityProfileContent = (CommunityProfileContent) obj;
        return epx.f(this.a, communityProfileContent.a) && epx.f(this.b, communityProfileContent.b) && epx.f(this.c, communityProfileContent.c) && epx.f(this.d, communityProfileContent.d) && this.e == communityProfileContent.e && epx.f(this.f, communityProfileContent.f) && epx.f(this.g, communityProfileContent.g) && this.h == communityProfileContent.h && this.i == communityProfileContent.i && this.j == communityProfileContent.j && epx.f(this.k, communityProfileContent.k);
    }

    public final int hashCode() {
        int a = fw3.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        ContentTab contentTab = this.c;
        int hashCode = (a + (contentTab == null ? 0 : contentTab.hashCode())) * 31;
        String str = this.d;
        int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Integer num = this.f;
        int hashCode2 = (b + (num == null ? 0 : num.hashCode())) * 31;
        InitialPosition initialPosition = this.g;
        int b2 = qoy.b(qoy.b(qoy.b((hashCode2 + (initialPosition == null ? 0 : initialPosition.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        Pair<String, String> pair = this.k;
        return b2 + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        return "CommunityProfileContent(communityId=" + this.a + ", items=" + this.b + ", pinnedTab=" + this.c + ", communityName=" + this.d + ", isSettingsButtonVisible=" + this.e + ", selectedPositionAfterReload=" + this.f + ", initialPosition=" + this.g + ", isNeedShowEmptyPlaceholder=" + this.h + ", isItemsFromCache=" + this.i + ", isPromotable=" + this.j + ", adsEasyPromoteCampaigns=" + this.k + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommunityProfileContent(UserId userId, List<? extends CommunityProfileContentItem> list, ContentTab contentTab, String str, boolean z, Integer num, InitialPosition initialPosition, boolean z2, boolean z3, boolean z4, Pair<String, String> pair) {
        this.a = userId;
        this.b = list;
        this.c = contentTab;
        this.d = str;
        this.e = z;
        this.f = num;
        this.g = initialPosition;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = pair;
    }

    public CommunityProfileContent(UserId userId, List list, ContentTab contentTab, String str, boolean z, Integer num, InitialPosition initialPosition, boolean z2, boolean z3, Pair pair, int i) {
        this((i & 1) != 0 ? UserId.d : userId, (List<? extends CommunityProfileContentItem>) ((i & 2) != 0 ? EmptyList.b : list), (i & 4) != 0 ? null : contentTab, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : initialPosition, (i & 128) != 0, (i & 256) != 0 ? false : z2, (i & 512) == 0 ? z3 : false, (Pair<String, String>) ((i & 1024) != 0 ? null : pair));
    }
}
