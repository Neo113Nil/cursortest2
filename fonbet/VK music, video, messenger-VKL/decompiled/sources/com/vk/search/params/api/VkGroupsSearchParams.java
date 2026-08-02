package com.vk.search.params.api;

import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.search.params.api.domain.model.SearchLocation;
import com.vkontakte.android.R;
import java.util.Objects;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: VkGroupsSearchParams.kt */
/* loaded from: classes5.dex */
public final class VkGroupsSearchParams extends SearchParamsWithCity {
    public CommunityType c;
    public SortType d;
    public boolean e;
    public SearchLocation f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public static final CommunityType m = CommunityType.ANY;
    public static final SortType n = SortType.RELEVANT;
    public static final Serializer.c<VkGroupsSearchParams> CREATOR = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkGroupsSearchParams.kt */
    public static final class CommunityType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CommunityType[] $VALUES;
        public static final CommunityType ANY;
        public static final a Companion;
        public static final CommunityType EVENT;
        public static final CommunityType GROUP;
        public static final CommunityType PAGE;
        private final String apiValue;
        private final int p;
        private final int resId;

        /* compiled from: VkGroupsSearchParams.kt */
        public static final class a {
        }

        static {
            CommunityType communityType = new CommunityType(0, 0, R.string.vk_discover_search_group_type_any, "ANY", "");
            ANY = communityType;
            CommunityType communityType2 = new CommunityType(1, 1, R.string.vk_discover_search_group_type_group, "GROUP", "group");
            GROUP = communityType2;
            CommunityType communityType3 = new CommunityType(2, 2, R.string.vk_discover_search_group_type_page, "PAGE", "page");
            PAGE = communityType3;
            CommunityType communityType4 = new CommunityType(3, 3, R.string.vk_discover_search_group_type_event, "EVENT", NotificationCompat.CATEGORY_EVENT);
            EVENT = communityType4;
            CommunityType[] communityTypeArr = {communityType, communityType2, communityType3, communityType4};
            $VALUES = communityTypeArr;
            $ENTRIES = new asp(communityTypeArr);
            Companion = new a();
        }

        public CommunityType(int i, int i2, int i3, String str, String str2) {
            this.p = i2;
            this.apiValue = str2;
            this.resId = i3;
        }

        public static zrp<CommunityType> h() {
            return $ENTRIES;
        }

        public static CommunityType valueOf(String str) {
            return (CommunityType) Enum.valueOf(CommunityType.class, str);
        }

        public static CommunityType[] values() {
            return (CommunityType[]) $VALUES.clone();
        }

        public final int i() {
            return this.p;
        }

        public final int j() {
            return this.resId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkGroupsSearchParams.kt */
    public static final class SortType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SortType[] $VALUES;
        public static final a Companion;
        public static final SortType MEMBERS;
        public static final SortType POPULARITY;
        public static final SortType RELEVANT;
        private final String apiValue;
        private final int p;
        private final int resId;

        /* compiled from: VkGroupsSearchParams.kt */
        public static final class a {
        }

        static {
            SortType sortType = new SortType(0, 0, R.string.vk_discover_search_group_sort_type_relevant, "RELEVANT", "relevant");
            RELEVANT = sortType;
            SortType sortType2 = new SortType(1, 1, R.string.vk_discover_search_group_sort_type_popularity, "POPULARITY", "popularity");
            POPULARITY = sortType2;
            SortType sortType3 = new SortType(2, 2, R.string.vk_discover_search_group_sort_type_members, "MEMBERS", "members");
            MEMBERS = sortType3;
            SortType[] sortTypeArr = {sortType, sortType2, sortType3};
            $VALUES = sortTypeArr;
            $ENTRIES = new asp(sortTypeArr);
            Companion = new a();
        }

        public SortType(int i, int i2, int i3, String str, String str2) {
            this.p = i2;
            this.apiValue = str2;
            this.resId = i3;
        }

        public static zrp<SortType> h() {
            return $ENTRIES;
        }

        public static SortType valueOf(String str) {
            return (SortType) Enum.valueOf(SortType.class, str);
        }

        public static SortType[] values() {
            return (SortType[]) $VALUES.clone();
        }

        public final int i() {
            return this.p;
        }

        public final int j() {
            return this.resId;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkGroupsSearchParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkGroupsSearchParams a(Serializer serializer) {
            VkGroupsSearchParams vkGroupsSearchParams = new VkGroupsSearchParams();
            vkGroupsSearchParams.b = (City) serializer.A(City.class.getClassLoader());
            CommunityType communityType = (CommunityType) serializer.C();
            if (communityType == null) {
                communityType = vkGroupsSearchParams.c;
            }
            vkGroupsSearchParams.c = communityType;
            SortType sortType = (SortType) serializer.C();
            if (sortType == null) {
                sortType = vkGroupsSearchParams.d;
            }
            vkGroupsSearchParams.d = sortType;
            vkGroupsSearchParams.e = serializer.m();
            vkGroupsSearchParams.f = (SearchLocation) serializer.A(SearchLocation.class.getClassLoader());
            vkGroupsSearchParams.g = serializer.m();
            vkGroupsSearchParams.h = serializer.m();
            vkGroupsSearchParams.i = serializer.m();
            vkGroupsSearchParams.j = serializer.m();
            vkGroupsSearchParams.k = serializer.m();
            vkGroupsSearchParams.l = serializer.m();
            return vkGroupsSearchParams;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkGroupsSearchParams[i];
        }
    }

    public VkGroupsSearchParams() {
        super(null);
        this.c = m;
        this.d = n;
        this.e = true;
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final boolean I() {
        return (!super.I() || this.c != m || this.d != n || !this.e || this.f != null || this.g || this.h || this.i || this.j || this.k || this.l) ? false : true;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.g0(this.c);
        serializer.g0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.e0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.search.params.api.SearchParams
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final VkGroupsSearchParams copy() {
        VkGroupsSearchParams vkGroupsSearchParams = new VkGroupsSearchParams();
        vkGroupsSearchParams.h5(this);
        return vkGroupsSearchParams;
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity
    public final boolean equals(Object obj) {
        if ((obj instanceof VkGroupsSearchParams) && super.equals(obj)) {
            VkGroupsSearchParams vkGroupsSearchParams = (VkGroupsSearchParams) obj;
            if (this.c == vkGroupsSearchParams.c && this.d == vkGroupsSearchParams.d && this.e == vkGroupsSearchParams.e && epx.f(this.f, vkGroupsSearchParams.f) && this.g == vkGroupsSearchParams.g && this.h == vkGroupsSearchParams.h && this.i == vkGroupsSearchParams.i && this.j == vkGroupsSearchParams.j && this.k == vkGroupsSearchParams.k && this.l == vkGroupsSearchParams.l) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final <T extends SearchParams> void h5(T t) {
        super.h5(t);
        if (t instanceof VkGroupsSearchParams) {
            VkGroupsSearchParams vkGroupsSearchParams = (VkGroupsSearchParams) t;
            this.c = vkGroupsSearchParams.c;
            this.d = vkGroupsSearchParams.d;
            this.e = vkGroupsSearchParams.e;
            this.f = vkGroupsSearchParams.f;
            this.g = vkGroupsSearchParams.g;
            this.h = vkGroupsSearchParams.h;
            this.i = vkGroupsSearchParams.i;
            this.j = vkGroupsSearchParams.j;
            this.k = vkGroupsSearchParams.k;
            this.l = vkGroupsSearchParams.l;
        }
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(d()), this.c, this.d, Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l));
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final void reset() {
        this.b = null;
        this.c = m;
        this.d = n;
        this.e = true;
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
    }
}
