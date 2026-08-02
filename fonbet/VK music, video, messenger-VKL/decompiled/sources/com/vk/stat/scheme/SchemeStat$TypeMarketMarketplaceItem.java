package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeMarketMarketplaceItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeView.b, SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("ad_campaign")
    private final String adCampaign;

    @pmi0("ad_campaign_id")
    private final Integer adCampaignId;

    @pmi0("ad_campaign_source")
    private final String adCampaignSource;

    @pmi0("block")
    private final String block;

    @pmi0("block_idx")
    private final Integer blockIdx;

    @pmi0("category_id")
    private final Float categoryId;

    @pmi0("banner_name")
    private final FilteredString filteredBannerName;

    @pmi0("section_source")
    private final SectionSource sectionSource;

    @pmi0("selected_city_id")
    private final Float selectedCityId;

    @pmi0("subtype")
    private final Subtype subtype;

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeMarketMarketplaceItem>, a9y<SchemeStat$TypeMarketMarketplaceItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("subtype");
            Object obj = null;
            Subtype subtype = (Subtype) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Subtype.class));
            String C = fai.C(x9yVar, "block");
            Integer A = fai.A(x9yVar, "block_idx");
            String C2 = fai.C(x9yVar, "banner_name");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("section_source");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(q2.k(), (Class<Object>) SectionSource.class);
            }
            return new SchemeStat$TypeMarketMarketplaceItem(subtype, C, A, C2, (SectionSource) obj, fai.z(x9yVar, "category_id"), fai.z(x9yVar, "selected_city_id"), fai.C(x9yVar, "ad_campaign"), fai.A(x9yVar, "ad_campaign_id"), fai.C(x9yVar, "ad_campaign_source"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem = (SchemeStat$TypeMarketMarketplaceItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("subtype", tru.a().toJson(schemeStat$TypeMarketMarketplaceItem.i()));
            x9yVar.o("block", schemeStat$TypeMarketMarketplaceItem.d());
            x9yVar.n("block_idx", schemeStat$TypeMarketMarketplaceItem.e());
            x9yVar.o("banner_name", schemeStat$TypeMarketMarketplaceItem.a);
            x9yVar.o("section_source", tru.a().toJson(schemeStat$TypeMarketMarketplaceItem.g()));
            x9yVar.n("category_id", schemeStat$TypeMarketMarketplaceItem.f());
            x9yVar.n("selected_city_id", schemeStat$TypeMarketMarketplaceItem.h());
            x9yVar.o("ad_campaign", schemeStat$TypeMarketMarketplaceItem.a());
            x9yVar.n("ad_campaign_id", schemeStat$TypeMarketMarketplaceItem.b());
            x9yVar.o("ad_campaign_source", schemeStat$TypeMarketMarketplaceItem.c());
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class SectionSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SectionSource[] $VALUES;

        @pmi0("category_bar")
        public static final SectionSource CATEGORY_BAR;

        @pmi0("category_dropdown")
        public static final SectionSource CATEGORY_DROPDOWN;

        @pmi0("tab")
        public static final SectionSource TAB;

        static {
            SectionSource sectionSource = new SectionSource("TAB", 0);
            TAB = sectionSource;
            SectionSource sectionSource2 = new SectionSource("CATEGORY_BAR", 1);
            CATEGORY_BAR = sectionSource2;
            SectionSource sectionSource3 = new SectionSource("CATEGORY_DROPDOWN", 2);
            CATEGORY_DROPDOWN = sectionSource3;
            SectionSource[] sectionSourceArr = {sectionSource, sectionSource2, sectionSource3};
            $VALUES = sectionSourceArr;
            $ENTRIES = new asp(sectionSourceArr);
        }

        private SectionSource(String str, int i) {
        }

        public static SectionSource valueOf(String str) {
            return (SectionSource) Enum.valueOf(SectionSource.class, str);
        }

        public static SectionSource[] values() {
            return (SectionSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("click_banner")
        public static final Subtype CLICK_BANNER;

        @pmi0("open_marketplace")
        public static final Subtype OPEN_MARKETPLACE;

        @pmi0("select_city")
        public static final Subtype SELECT_CITY;

        @pmi0("transition_to_block")
        public static final Subtype TRANSITION_TO_BLOCK;

        @pmi0("transition_to_section")
        public static final Subtype TRANSITION_TO_SECTION;

        @pmi0("view_banner")
        public static final Subtype VIEW_BANNER;

        static {
            Subtype subtype = new Subtype("OPEN_MARKETPLACE", 0);
            OPEN_MARKETPLACE = subtype;
            Subtype subtype2 = new Subtype("VIEW_BANNER", 1);
            VIEW_BANNER = subtype2;
            Subtype subtype3 = new Subtype("CLICK_BANNER", 2);
            CLICK_BANNER = subtype3;
            Subtype subtype4 = new Subtype("TRANSITION_TO_BLOCK", 3);
            TRANSITION_TO_BLOCK = subtype4;
            Subtype subtype5 = new Subtype("TRANSITION_TO_SECTION", 4);
            TRANSITION_TO_SECTION = subtype5;
            Subtype subtype6 = new Subtype("SELECT_CITY", 5);
            SELECT_CITY = subtype6;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6};
            $VALUES = subtypeArr;
            $ENTRIES = new asp(subtypeArr);
        }

        private Subtype(String str, int i) {
        }

        public static Subtype valueOf(String str) {
            return (Subtype) Enum.valueOf(Subtype.class, str);
        }

        public static Subtype[] values() {
            return (Subtype[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeMarketMarketplaceItem() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final String a() {
        return this.adCampaign;
    }

    public final Integer b() {
        return this.adCampaignId;
    }

    public final String c() {
        return this.adCampaignSource;
    }

    public final String d() {
        return this.block;
    }

    public final Integer e() {
        return this.blockIdx;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMarketMarketplaceItem)) {
            return false;
        }
        SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem = (SchemeStat$TypeMarketMarketplaceItem) obj;
        return this.subtype == schemeStat$TypeMarketMarketplaceItem.subtype && epx.f(this.block, schemeStat$TypeMarketMarketplaceItem.block) && epx.f(this.blockIdx, schemeStat$TypeMarketMarketplaceItem.blockIdx) && epx.f(this.a, schemeStat$TypeMarketMarketplaceItem.a) && this.sectionSource == schemeStat$TypeMarketMarketplaceItem.sectionSource && epx.f(this.categoryId, schemeStat$TypeMarketMarketplaceItem.categoryId) && epx.f(this.selectedCityId, schemeStat$TypeMarketMarketplaceItem.selectedCityId) && epx.f(this.adCampaign, schemeStat$TypeMarketMarketplaceItem.adCampaign) && epx.f(this.adCampaignId, schemeStat$TypeMarketMarketplaceItem.adCampaignId) && epx.f(this.adCampaignSource, schemeStat$TypeMarketMarketplaceItem.adCampaignSource);
    }

    public final Float f() {
        return this.categoryId;
    }

    public final SectionSource g() {
        return this.sectionSource;
    }

    public final Float h() {
        return this.selectedCityId;
    }

    public final int hashCode() {
        Subtype subtype = this.subtype;
        int hashCode = (subtype == null ? 0 : subtype.hashCode()) * 31;
        String str = this.block;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.blockIdx;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.a;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SectionSource sectionSource = this.sectionSource;
        int hashCode5 = (hashCode4 + (sectionSource == null ? 0 : sectionSource.hashCode())) * 31;
        Float f = this.categoryId;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.selectedCityId;
        int hashCode7 = (hashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str3 = this.adCampaign;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.adCampaignId;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.adCampaignSource;
        return hashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Subtype i() {
        return this.subtype;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketMarketplaceItem(subtype=");
        sb.append(this.subtype);
        sb.append(", block=");
        sb.append(this.block);
        sb.append(", blockIdx=");
        sb.append(this.blockIdx);
        sb.append(", bannerName=");
        sb.append(this.a);
        sb.append(", sectionSource=");
        sb.append(this.sectionSource);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", selectedCityId=");
        sb.append(this.selectedCityId);
        sb.append(", adCampaign=");
        sb.append(this.adCampaign);
        sb.append(", adCampaignId=");
        sb.append(this.adCampaignId);
        sb.append(", adCampaignSource=");
        return ho8.a(sb, this.adCampaignSource, ')');
    }

    public SchemeStat$TypeMarketMarketplaceItem(Subtype subtype, String str, Integer num, String str2, SectionSource sectionSource, Float f, Float f2, String str3, Integer num2, String str4) {
        this.subtype = subtype;
        this.block = str;
        this.blockIdx = num;
        this.a = str2;
        this.sectionSource = sectionSource;
        this.categoryId = f;
        this.selectedCityId = f2;
        this.adCampaign = str3;
        this.adCampaignId = num2;
        this.adCampaignSource = str4;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredBannerName = filteredString;
        filteredString.a(str2);
    }

    public /* synthetic */ SchemeStat$TypeMarketMarketplaceItem(Subtype subtype, String str, Integer num, String str2, SectionSource sectionSource, Float f, Float f2, String str3, Integer num2, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : subtype, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : sectionSource, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : f2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : str4);
    }
}
