package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.BuildConfig;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.d9h0;
import xsna.e9h0;
import xsna.epx;
import xsna.f9h0;
import xsna.fai;
import xsna.g9h0;
import xsna.h9h0;
import xsna.ho8;
import xsna.i9h0;
import xsna.j9h0;
import xsna.k9h0;
import xsna.l9h0;
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
public final class SchemeStat$TypeSuperappScreenItem implements SchemeStat$TypeNavgo.b, SchemeStat$TypeAction.b, SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("action")
    private final Action action;

    @pmi0("action_element_id")
    private final Integer actionElementId;

    @pmi0("action_id")
    private final Integer actionId;

    @pmi0("action_index")
    private final Integer actionIndex;

    @pmi0("action_inner_index")
    private final Integer actionInnerIndex;

    @pmi0("dock")
    private final List<SchemeStat$SuperappMenuItem> dock;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("fintech")
    private final List<SchemeStat$SuperappFintechItem> fintech;

    @pmi0("greeting")
    private final SchemeStat$SuperappGreeting greeting;

    @pmi0("has_kws")
    private final Boolean hasKws;

    @pmi0("horizontal_scroll")
    private final List<String> horizontalScroll;

    @pmi0("is_default")
    private final Boolean isDefault;

    @pmi0("is_vpn")
    private final Boolean isVpn;

    @pmi0("loading_type")
    private final LoadingType loadingType;

    @pmi0("menu")
    private final List<SchemeStat$SuperappMenuItem> menu;

    @pmi0("mini_widgets")
    private final List<String> miniWidgets;

    @pmi0("recommended")
    private final List<SchemeStat$SuperappRecommendMenuItem> recommended;

    @pmi0("recs")
    private final List<SchemeStat$TypeSuperappRecsItem> recs;

    @pmi0("sections")
    private final List<SchemeStat$TypeSuperappSectionItem> sections;

    @pmi0("superapp_feature")
    private final String superappFeature;

    @pmi0("vk_pay")
    private final VkPay vkPay;

    @pmi0("widgets")
    private final List<SchemeStat$TypeSuperappWidgetItem> widgets;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("dock")
        public static final Action DOCK;

        @pmi0("fintech")
        public static final Action FINTECH;

        @pmi0("greeting")
        public static final Action GREETING;

        @pmi0("horizontal_scroll")
        public static final Action HORIZONTAL_SCROLL;

        @pmi0("menu")
        public static final Action MENU;

        @pmi0("mini_widget")
        public static final Action MINI_WIDGET;

        @pmi0("navbar")
        public static final Action NAVBAR;

        @pmi0("recommended")
        public static final Action RECOMMENDED;

        @pmi0("recs")
        public static final Action RECS;

        @pmi0("section")
        public static final Action SECTION;

        @pmi0("settings")
        public static final Action SETTINGS;

        @pmi0("vk_pay")
        public static final Action VK_PAY;

        @pmi0("widget")
        public static final Action WIDGET;

        static {
            Action action = new Action("MENU", 0);
            MENU = action;
            Action action2 = new Action("RECS", 1);
            RECS = action2;
            Action action3 = new Action("RECOMMENDED", 2);
            RECOMMENDED = action3;
            Action action4 = new Action("VK_PAY", 3);
            VK_PAY = action4;
            Action action5 = new Action("WIDGET", 4);
            WIDGET = action5;
            Action action6 = new Action("HORIZONTAL_SCROLL", 5);
            HORIZONTAL_SCROLL = action6;
            Action action7 = new Action("MINI_WIDGET", 6);
            MINI_WIDGET = action7;
            Action action8 = new Action("FINTECH", 7);
            FINTECH = action8;
            Action action9 = new Action("DOCK", 8);
            DOCK = action9;
            Action action10 = new Action("GREETING", 9);
            GREETING = action10;
            Action action11 = new Action("NAVBAR", 10);
            NAVBAR = action11;
            Action action12 = new Action("SECTION", 11);
            SECTION = action12;
            Action action13 = new Action("SETTINGS", 12);
            SETTINGS = action13;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8, action9, action10, action11, action12, action13};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        private Action(String str, int i) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class LoadingType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoadingType[] $VALUES;

        @pmi0("cache")
        public static final LoadingType CACHE;

        @pmi0(BuildConfig.FLAVOR)
        public static final LoadingType DEFAULT;

        @pmi0("skeleton")
        public static final LoadingType SKELETON;

        static {
            LoadingType loadingType = new LoadingType("SKELETON", 0);
            SKELETON = loadingType;
            LoadingType loadingType2 = new LoadingType("CACHE", 1);
            CACHE = loadingType2;
            LoadingType loadingType3 = new LoadingType("DEFAULT", 2);
            DEFAULT = loadingType3;
            LoadingType[] loadingTypeArr = {loadingType, loadingType2, loadingType3};
            $VALUES = loadingTypeArr;
            $ENTRIES = new asp(loadingTypeArr);
        }

        private LoadingType(String str, int i) {
        }

        public static LoadingType valueOf(String str) {
            return (LoadingType) Enum.valueOf(LoadingType.class, str);
        }

        public static LoadingType[] values() {
            return (LoadingType[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeSuperappScreenItem>, a9y<SchemeStat$TypeSuperappScreenItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            List list = (List) tru.a().fromJson(x9yVar.q("menu").k(), new d9h0().getType());
            Gson a = tru.a();
            b9y q = x9yVar.q("vk_pay");
            VkPay vkPay = (VkPay) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), VkPay.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("recs");
            List list2 = (List) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(x9yVar.q("recs").k(), new e9h0().getType()));
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("recommended");
            List list3 = (List) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(x9yVar.q("recommended").k(), new f9h0().getType()));
            Gson a4 = tru.a();
            b9y q4 = x9yVar.q("dock");
            List list4 = (List) ((q4 == null || (q4 instanceof u9y)) ? null : a4.fromJson(x9yVar.q("dock").k(), new g9h0().getType()));
            Gson a5 = tru.a();
            b9y q5 = x9yVar.q("widgets");
            List list5 = (List) ((q5 == null || (q5 instanceof u9y)) ? null : a5.fromJson(x9yVar.q("widgets").k(), new h9h0().getType()));
            Gson a6 = tru.a();
            b9y q6 = x9yVar.q("sections");
            List list6 = (List) ((q6 == null || (q6 instanceof u9y)) ? null : a6.fromJson(x9yVar.q("sections").k(), new i9h0().getType()));
            Gson a7 = tru.a();
            b9y q7 = x9yVar.q("horizontal_scroll");
            List list7 = (List) ((q7 == null || (q7 instanceof u9y)) ? null : a7.fromJson(x9yVar.q("horizontal_scroll").k(), new j9h0().getType()));
            Gson a8 = tru.a();
            b9y q8 = x9yVar.q("mini_widgets");
            List list8 = (List) ((q8 == null || (q8 instanceof u9y)) ? null : a8.fromJson(x9yVar.q("mini_widgets").k(), new k9h0().getType()));
            Gson a9 = tru.a();
            b9y q9 = x9yVar.q("fintech");
            List list9 = (List) ((q9 == null || (q9 instanceof u9y)) ? null : a9.fromJson(x9yVar.q("fintech").k(), new l9h0().getType()));
            Gson a10 = tru.a();
            b9y q10 = x9yVar.q("greeting");
            SchemeStat$SuperappGreeting schemeStat$SuperappGreeting = (SchemeStat$SuperappGreeting) ((q10 == null || (q10 instanceof u9y)) ? null : a10.fromJson(q10.k(), SchemeStat$SuperappGreeting.class));
            Gson a11 = tru.a();
            b9y q11 = x9yVar.q("action");
            Action action = (Action) ((q11 == null || (q11 instanceof u9y)) ? null : a11.fromJson(q11.k(), Action.class));
            Integer A = fai.A(x9yVar, "action_index");
            Integer A2 = fai.A(x9yVar, "action_inner_index");
            Integer A3 = fai.A(x9yVar, "action_element_id");
            Integer A4 = fai.A(x9yVar, "action_id");
            String C = fai.C(x9yVar, "superapp_feature");
            Boolean y = fai.y(x9yVar, "has_kws");
            Boolean y2 = fai.y(x9yVar, "is_default");
            Boolean y3 = fai.y(x9yVar, "is_vpn");
            Gson a12 = tru.a();
            b9y q12 = x9yVar.q("loading_type");
            return new SchemeStat$TypeSuperappScreenItem(list, vkPay, list2, list3, list4, list5, list6, list7, list8, list9, schemeStat$SuperappGreeting, action, A, A2, A3, A4, C, y, y2, y3, (LoadingType) ((q12 == null || (q12 instanceof u9y)) ? null : a12.fromJson(q12.k(), LoadingType.class)), fai.C(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem = (SchemeStat$TypeSuperappScreenItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("menu", tru.a().toJson(schemeStat$TypeSuperappScreenItem.l()));
            x9yVar.o("vk_pay", tru.a().toJson(schemeStat$TypeSuperappScreenItem.r()));
            x9yVar.o("recs", tru.a().toJson(schemeStat$TypeSuperappScreenItem.o()));
            x9yVar.o("recommended", tru.a().toJson(schemeStat$TypeSuperappScreenItem.n()));
            x9yVar.o("dock", tru.a().toJson(schemeStat$TypeSuperappScreenItem.f()));
            x9yVar.o("widgets", tru.a().toJson(schemeStat$TypeSuperappScreenItem.s()));
            x9yVar.o("sections", tru.a().toJson(schemeStat$TypeSuperappScreenItem.p()));
            x9yVar.o("horizontal_scroll", tru.a().toJson(schemeStat$TypeSuperappScreenItem.j()));
            x9yVar.o("mini_widgets", tru.a().toJson(schemeStat$TypeSuperappScreenItem.m()));
            x9yVar.o("fintech", tru.a().toJson(schemeStat$TypeSuperappScreenItem.g()));
            x9yVar.o("greeting", tru.a().toJson(schemeStat$TypeSuperappScreenItem.h()));
            x9yVar.o("action", tru.a().toJson(schemeStat$TypeSuperappScreenItem.a()));
            x9yVar.n("action_index", schemeStat$TypeSuperappScreenItem.d());
            x9yVar.n("action_inner_index", schemeStat$TypeSuperappScreenItem.e());
            x9yVar.n("action_element_id", schemeStat$TypeSuperappScreenItem.b());
            x9yVar.n("action_id", schemeStat$TypeSuperappScreenItem.c());
            x9yVar.o("superapp_feature", schemeStat$TypeSuperappScreenItem.q());
            x9yVar.m(schemeStat$TypeSuperappScreenItem.i(), "has_kws");
            x9yVar.m(schemeStat$TypeSuperappScreenItem.t(), "is_default");
            x9yVar.m(schemeStat$TypeSuperappScreenItem.u(), "is_vpn");
            x9yVar.o("loading_type", tru.a().toJson(schemeStat$TypeSuperappScreenItem.k()));
            x9yVar.o("track_code", schemeStat$TypeSuperappScreenItem.a);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class VkPay {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkPay[] $VALUES;

        @pmi0("no_section")
        public static final VkPay NO_SECTION;

        @pmi0("section")
        public static final VkPay SECTION;

        @pmi0("section_balance")
        public static final VkPay SECTION_BALANCE;

        static {
            VkPay vkPay = new VkPay("NO_SECTION", 0);
            NO_SECTION = vkPay;
            VkPay vkPay2 = new VkPay("SECTION", 1);
            SECTION = vkPay2;
            VkPay vkPay3 = new VkPay("SECTION_BALANCE", 2);
            SECTION_BALANCE = vkPay3;
            VkPay[] vkPayArr = {vkPay, vkPay2, vkPay3};
            $VALUES = vkPayArr;
            $ENTRIES = new asp(vkPayArr);
        }

        private VkPay(String str, int i) {
        }

        public static VkPay valueOf(String str) {
            return (VkPay) Enum.valueOf(VkPay.class, str);
        }

        public static VkPay[] values() {
            return (VkPay[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeSuperappScreenItem(List<SchemeStat$SuperappMenuItem> list, VkPay vkPay, List<SchemeStat$TypeSuperappRecsItem> list2, List<SchemeStat$SuperappRecommendMenuItem> list3, List<SchemeStat$SuperappMenuItem> list4, List<SchemeStat$TypeSuperappWidgetItem> list5, List<SchemeStat$TypeSuperappSectionItem> list6, List<String> list7, List<String> list8, List<SchemeStat$SuperappFintechItem> list9, SchemeStat$SuperappGreeting schemeStat$SuperappGreeting, Action action, Integer num, Integer num2, Integer num3, Integer num4, String str, Boolean bool, Boolean bool2, Boolean bool3, LoadingType loadingType, String str2) {
        this.menu = list;
        this.vkPay = vkPay;
        this.recs = list2;
        this.recommended = list3;
        this.dock = list4;
        this.widgets = list5;
        this.sections = list6;
        this.horizontalScroll = list7;
        this.miniWidgets = list8;
        this.fintech = list9;
        this.greeting = schemeStat$SuperappGreeting;
        this.action = action;
        this.actionIndex = num;
        this.actionInnerIndex = num2;
        this.actionElementId = num3;
        this.actionId = num4;
        this.superappFeature = str;
        this.hasKws = bool;
        this.isDefault = bool2;
        this.isVpn = bool3;
        this.loadingType = loadingType;
        this.a = str2;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredTrackCode = filteredString;
        filteredString.a(str2);
    }

    public final Action a() {
        return this.action;
    }

    public final Integer b() {
        return this.actionElementId;
    }

    public final Integer c() {
        return this.actionId;
    }

    public final Integer d() {
        return this.actionIndex;
    }

    public final Integer e() {
        return this.actionInnerIndex;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeSuperappScreenItem)) {
            return false;
        }
        SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem = (SchemeStat$TypeSuperappScreenItem) obj;
        return epx.f(this.menu, schemeStat$TypeSuperappScreenItem.menu) && this.vkPay == schemeStat$TypeSuperappScreenItem.vkPay && epx.f(this.recs, schemeStat$TypeSuperappScreenItem.recs) && epx.f(this.recommended, schemeStat$TypeSuperappScreenItem.recommended) && epx.f(this.dock, schemeStat$TypeSuperappScreenItem.dock) && epx.f(this.widgets, schemeStat$TypeSuperappScreenItem.widgets) && epx.f(this.sections, schemeStat$TypeSuperappScreenItem.sections) && epx.f(this.horizontalScroll, schemeStat$TypeSuperappScreenItem.horizontalScroll) && epx.f(this.miniWidgets, schemeStat$TypeSuperappScreenItem.miniWidgets) && epx.f(this.fintech, schemeStat$TypeSuperappScreenItem.fintech) && epx.f(this.greeting, schemeStat$TypeSuperappScreenItem.greeting) && this.action == schemeStat$TypeSuperappScreenItem.action && epx.f(this.actionIndex, schemeStat$TypeSuperappScreenItem.actionIndex) && epx.f(this.actionInnerIndex, schemeStat$TypeSuperappScreenItem.actionInnerIndex) && epx.f(this.actionElementId, schemeStat$TypeSuperappScreenItem.actionElementId) && epx.f(this.actionId, schemeStat$TypeSuperappScreenItem.actionId) && epx.f(this.superappFeature, schemeStat$TypeSuperappScreenItem.superappFeature) && epx.f(this.hasKws, schemeStat$TypeSuperappScreenItem.hasKws) && epx.f(this.isDefault, schemeStat$TypeSuperappScreenItem.isDefault) && epx.f(this.isVpn, schemeStat$TypeSuperappScreenItem.isVpn) && this.loadingType == schemeStat$TypeSuperappScreenItem.loadingType && epx.f(this.a, schemeStat$TypeSuperappScreenItem.a);
    }

    public final List<SchemeStat$SuperappMenuItem> f() {
        return this.dock;
    }

    public final List<SchemeStat$SuperappFintechItem> g() {
        return this.fintech;
    }

    public final SchemeStat$SuperappGreeting h() {
        return this.greeting;
    }

    public final int hashCode() {
        int hashCode = this.menu.hashCode() * 31;
        VkPay vkPay = this.vkPay;
        int hashCode2 = (hashCode + (vkPay == null ? 0 : vkPay.hashCode())) * 31;
        List<SchemeStat$TypeSuperappRecsItem> list = this.recs;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<SchemeStat$SuperappRecommendMenuItem> list2 = this.recommended;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SchemeStat$SuperappMenuItem> list3 = this.dock;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<SchemeStat$TypeSuperappWidgetItem> list4 = this.widgets;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<SchemeStat$TypeSuperappSectionItem> list5 = this.sections;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.horizontalScroll;
        int hashCode8 = (hashCode7 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.miniWidgets;
        int hashCode9 = (hashCode8 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<SchemeStat$SuperappFintechItem> list8 = this.fintech;
        int hashCode10 = (hashCode9 + (list8 == null ? 0 : list8.hashCode())) * 31;
        SchemeStat$SuperappGreeting schemeStat$SuperappGreeting = this.greeting;
        int hashCode11 = (hashCode10 + (schemeStat$SuperappGreeting == null ? 0 : schemeStat$SuperappGreeting.hashCode())) * 31;
        Action action = this.action;
        int hashCode12 = (hashCode11 + (action == null ? 0 : action.hashCode())) * 31;
        Integer num = this.actionIndex;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.actionInnerIndex;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.actionElementId;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.actionId;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.superappFeature;
        int hashCode17 = (hashCode16 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasKws;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDefault;
        int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isVpn;
        int hashCode20 = (hashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        LoadingType loadingType = this.loadingType;
        int hashCode21 = (hashCode20 + (loadingType == null ? 0 : loadingType.hashCode())) * 31;
        String str2 = this.a;
        return hashCode21 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Boolean i() {
        return this.hasKws;
    }

    public final List<String> j() {
        return this.horizontalScroll;
    }

    public final LoadingType k() {
        return this.loadingType;
    }

    public final List<SchemeStat$SuperappMenuItem> l() {
        return this.menu;
    }

    public final List<String> m() {
        return this.miniWidgets;
    }

    public final List<SchemeStat$SuperappRecommendMenuItem> n() {
        return this.recommended;
    }

    public final List<SchemeStat$TypeSuperappRecsItem> o() {
        return this.recs;
    }

    public final List<SchemeStat$TypeSuperappSectionItem> p() {
        return this.sections;
    }

    public final String q() {
        return this.superappFeature;
    }

    public final VkPay r() {
        return this.vkPay;
    }

    public final List<SchemeStat$TypeSuperappWidgetItem> s() {
        return this.widgets;
    }

    public final Boolean t() {
        return this.isDefault;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSuperappScreenItem(menu=");
        sb.append(this.menu);
        sb.append(", vkPay=");
        sb.append(this.vkPay);
        sb.append(", recs=");
        sb.append(this.recs);
        sb.append(", recommended=");
        sb.append(this.recommended);
        sb.append(", dock=");
        sb.append(this.dock);
        sb.append(", widgets=");
        sb.append(this.widgets);
        sb.append(", sections=");
        sb.append(this.sections);
        sb.append(", horizontalScroll=");
        sb.append(this.horizontalScroll);
        sb.append(", miniWidgets=");
        sb.append(this.miniWidgets);
        sb.append(", fintech=");
        sb.append(this.fintech);
        sb.append(", greeting=");
        sb.append(this.greeting);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", actionIndex=");
        sb.append(this.actionIndex);
        sb.append(", actionInnerIndex=");
        sb.append(this.actionInnerIndex);
        sb.append(", actionElementId=");
        sb.append(this.actionElementId);
        sb.append(", actionId=");
        sb.append(this.actionId);
        sb.append(", superappFeature=");
        sb.append(this.superappFeature);
        sb.append(", hasKws=");
        sb.append(this.hasKws);
        sb.append(", isDefault=");
        sb.append(this.isDefault);
        sb.append(", isVpn=");
        sb.append(this.isVpn);
        sb.append(", loadingType=");
        sb.append(this.loadingType);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public final Boolean u() {
        return this.isVpn;
    }

    public /* synthetic */ SchemeStat$TypeSuperappScreenItem(List list, VkPay vkPay, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, SchemeStat$SuperappGreeting schemeStat$SuperappGreeting, Action action, Integer num, Integer num2, Integer num3, Integer num4, String str, Boolean bool, Boolean bool2, Boolean bool3, LoadingType loadingType, String str2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : vkPay, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5, (i & 64) != 0 ? null : list6, (i & 128) != 0 ? null : list7, (i & 256) != 0 ? null : list8, (i & 512) != 0 ? null : list9, (i & 1024) != 0 ? null : schemeStat$SuperappGreeting, (i & 2048) != 0 ? null : action, (i & 4096) != 0 ? null : num, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : num3, (i & 32768) != 0 ? null : num4, (i & 65536) != 0 ? null : str, (i & 131072) != 0 ? null : bool, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool2, (i & 524288) != 0 ? null : bool3, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : loadingType, (i & 2097152) != 0 ? null : str2);
    }
}
