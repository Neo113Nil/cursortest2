package com.vk.catalog2.common.dto.api.search;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;
import xsna.asp;
import xsna.hda;
import xsna.rsg0;
import xsna.wba;
import xsna.zrp;

/* compiled from: CatalogGetSearchAll.kt */
/* loaded from: classes16.dex */
public final class CatalogGetSearchAll extends rsg0<hda> {
    public final wba s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetSearchAll.kt */
    public static final class EntryMethod {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryMethod[] $VALUES;
        public static final EntryMethod FeedScreenSearchIcon;
        public static final EntryMethod HomeBottomIconLongTap;
        public static final EntryMethod LeftTabletMenuSearchIconClick;
        public static final EntryMethod OtherTab;
        public static final EntryMethod OverviewBottomIconLongTap;
        public static final EntryMethod OverviewScreenSearchIcon;
        public static final EntryMethod ServiceBottomIconLongTap;
        public static final EntryMethod ServiceScreenQueryView;
        public static final EntryMethod ServiceScreenSearchIcon;
        public static final EntryMethod Unknown;
        private final String apiName;

        static {
            EntryMethod entryMethod = new EntryMethod(DeviceInfo.STR_TYPE_UNKNOWN, 0, "unknown");
            Unknown = entryMethod;
            EntryMethod entryMethod2 = new EntryMethod("OtherTab", 1, "other_tab");
            OtherTab = entryMethod2;
            EntryMethod entryMethod3 = new EntryMethod("FeedScreenSearchIcon", 2, "feed_screen_search_icon");
            FeedScreenSearchIcon = entryMethod3;
            EntryMethod entryMethod4 = new EntryMethod("ServiceScreenSearchIcon", 3, "service_screen_search_icon");
            ServiceScreenSearchIcon = entryMethod4;
            EntryMethod entryMethod5 = new EntryMethod("ServiceScreenQueryView", 4, "service_screen_query_view");
            ServiceScreenQueryView = entryMethod5;
            EntryMethod entryMethod6 = new EntryMethod("ServiceBottomIconLongTap", 5, "service_bottom_icon_long_tap");
            ServiceBottomIconLongTap = entryMethod6;
            EntryMethod entryMethod7 = new EntryMethod("HomeBottomIconLongTap", 6, "home_bottom_icon_long_tap");
            HomeBottomIconLongTap = entryMethod7;
            EntryMethod entryMethod8 = new EntryMethod("LeftTabletMenuSearchIconClick", 7, "left_menu_search_icon");
            LeftTabletMenuSearchIconClick = entryMethod8;
            EntryMethod entryMethod9 = new EntryMethod("OverviewScreenSearchIcon", 8, "overview_screen_search_icon");
            OverviewScreenSearchIcon = entryMethod9;
            EntryMethod entryMethod10 = new EntryMethod("OverviewBottomIconLongTap", 9, "overview_bottom_icon_long_tap");
            OverviewBottomIconLongTap = entryMethod10;
            EntryMethod[] entryMethodArr = {entryMethod, entryMethod2, entryMethod3, entryMethod4, entryMethod5, entryMethod6, entryMethod7, entryMethod8, entryMethod9, entryMethod10};
            $VALUES = entryMethodArr;
            $ENTRIES = new asp(entryMethodArr);
        }

        public EntryMethod(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static EntryMethod valueOf(String str) {
            return (EntryMethod) Enum.valueOf(EntryMethod.class, str);
        }

        public static EntryMethod[] values() {
            return (EntryMethod[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }
    }

    public /* synthetic */ CatalogGetSearchAll(wba wbaVar, String str, String str2, boolean z, boolean z2, SearchRequestFactory.InputMethod inputMethod) {
        this(wbaVar, str, str2, z, z2, null, inputMethod, null);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        hda c = this.s.c(jSONObject.getJSONObject("response"));
        CatalogSection Ab = ((CatalogCatalog) c.a).Ab();
        return new hda(Ab, c.b, Ab.e);
    }

    public CatalogGetSearchAll(wba wbaVar, String str, String str2, boolean z, boolean z2, EntryMethod entryMethod, SearchRequestFactory.InputMethod inputMethod, String str3) {
        super("catalog.getSearchAll");
        this.s = wbaVar;
        K(CampaignEx.JSON_KEY_AD_Q, str);
        K("tab", str2);
        C(20, "count");
        K("entry_method", entryMethod != null ? entryMethod.h() : null);
        K("input_method", inputMethod != null ? inputMethod.h() : null);
        R("is_ptr", z2);
        K(CommonUrlParts.DEVICE_TYPE, (z ? CatalogDevice.TABLET : CatalogDevice.MOBILE).h());
        C(1, "safe_search");
        C(1, "need_blocks");
        K("ad_campaign_source", str3);
        C(0, "show_suggests");
    }
}
