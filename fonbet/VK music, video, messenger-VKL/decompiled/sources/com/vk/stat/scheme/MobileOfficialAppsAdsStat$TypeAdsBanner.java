package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.vt20;
import xsna.wt20;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsAdsStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsAdsStat$TypeAdsBanner implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("actual_ad_format")
    private final ActualAdFormat actualAdFormat;

    @pmi0("actual_slot_id")
    private final int actualSlotId;
    public final transient String b;

    @pmi0("banner_align")
    private final BannerAlign bannerAlign;

    @pmi0("banner_id")
    private final Integer bannerId;

    @pmi0("banner_location")
    private final BannerLocation bannerLocation;
    public final transient String c;

    @pmi0("ad_source")
    private final FilteredString filteredAdSource;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final FilteredString filteredRequestId;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("has_my_target_ad")
    private final boolean hasMyTargetAd;

    @pmi0("height_type")
    private final HeightType heightType;

    @pmi0("is_embedded")
    private final Boolean isEmbedded;

    @pmi0("is_portrait")
    private final Boolean isPortrait;

    @pmi0(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)
    private final LayoutType layoutType;

    @pmi0("mini_app_id")
    private final int miniAppId;

    @pmi0(X3.i.n)
    private final Orientation orientation;

    @pmi0("skipped_reasons")
    private final List<SchemeStat$AppsAdsSkippedReasonItem> skippedReasons;

    @pmi0("skipped_slots")
    private final List<Integer> skippedSlots;

    @pmi0("type")
    private final Type type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class ActualAdFormat {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActualAdFormat[] $VALUES;

        @pmi0("banner")
        public static final ActualAdFormat BANNER;

        @pmi0("banner_portlet")
        public static final ActualAdFormat BANNER_PORTLET;

        static {
            ActualAdFormat actualAdFormat = new ActualAdFormat("BANNER", 0);
            BANNER = actualAdFormat;
            ActualAdFormat actualAdFormat2 = new ActualAdFormat("BANNER_PORTLET", 1);
            BANNER_PORTLET = actualAdFormat2;
            ActualAdFormat[] actualAdFormatArr = {actualAdFormat, actualAdFormat2};
            $VALUES = actualAdFormatArr;
            $ENTRIES = new asp(actualAdFormatArr);
        }

        private ActualAdFormat(String str, int i) {
        }

        public static ActualAdFormat valueOf(String str) {
            return (ActualAdFormat) Enum.valueOf(ActualAdFormat.class, str);
        }

        public static ActualAdFormat[] values() {
            return (ActualAdFormat[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class BannerAlign {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerAlign[] $VALUES;

        @pmi0(TtmlNode.CENTER)
        public static final BannerAlign CENTER;

        @pmi0(TtmlNode.LEFT)
        public static final BannerAlign LEFT;

        @pmi0(TtmlNode.RIGHT)
        public static final BannerAlign RIGHT;

        static {
            BannerAlign bannerAlign = new BannerAlign("LEFT", 0);
            LEFT = bannerAlign;
            BannerAlign bannerAlign2 = new BannerAlign("CENTER", 1);
            CENTER = bannerAlign2;
            BannerAlign bannerAlign3 = new BannerAlign("RIGHT", 2);
            RIGHT = bannerAlign3;
            BannerAlign[] bannerAlignArr = {bannerAlign, bannerAlign2, bannerAlign3};
            $VALUES = bannerAlignArr;
            $ENTRIES = new asp(bannerAlignArr);
        }

        private BannerAlign(String str, int i) {
        }

        public static BannerAlign valueOf(String str) {
            return (BannerAlign) Enum.valueOf(BannerAlign.class, str);
        }

        public static BannerAlign[] values() {
            return (BannerAlign[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class BannerLocation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerLocation[] $VALUES;

        @pmi0("bottom")
        public static final BannerLocation BOTTOM;

        @pmi0("top")
        public static final BannerLocation TOP;

        static {
            BannerLocation bannerLocation = new BannerLocation("TOP", 0);
            TOP = bannerLocation;
            BannerLocation bannerLocation2 = new BannerLocation("BOTTOM", 1);
            BOTTOM = bannerLocation2;
            BannerLocation[] bannerLocationArr = {bannerLocation, bannerLocation2};
            $VALUES = bannerLocationArr;
            $ENTRIES = new asp(bannerLocationArr);
        }

        private BannerLocation(String str, int i) {
        }

        public static BannerLocation valueOf(String str) {
            return (BannerLocation) Enum.valueOf(BannerLocation.class, str);
        }

        public static BannerLocation[] values() {
            return (BannerLocation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class HeightType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HeightType[] $VALUES;

        @pmi0("compact")
        public static final HeightType COMPACT;

        @pmi0("regular")
        public static final HeightType REGULAR;

        static {
            HeightType heightType = new HeightType("COMPACT", 0);
            COMPACT = heightType;
            HeightType heightType2 = new HeightType("REGULAR", 1);
            REGULAR = heightType2;
            HeightType[] heightTypeArr = {heightType, heightType2};
            $VALUES = heightTypeArr;
            $ENTRIES = new asp(heightTypeArr);
        }

        private HeightType(String str, int i) {
        }

        public static HeightType valueOf(String str) {
            return (HeightType) Enum.valueOf(HeightType.class, str);
        }

        public static HeightType[] values() {
            return (HeightType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class LayoutType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LayoutType[] $VALUES;

        @pmi0("overlay")
        public static final LayoutType OVERLAY;

        @pmi0("resize")
        public static final LayoutType RESIZE;

        static {
            LayoutType layoutType = new LayoutType("RESIZE", 0);
            RESIZE = layoutType;
            LayoutType layoutType2 = new LayoutType("OVERLAY", 1);
            OVERLAY = layoutType2;
            LayoutType[] layoutTypeArr = {layoutType, layoutType2};
            $VALUES = layoutTypeArr;
            $ENTRIES = new asp(layoutTypeArr);
        }

        private LayoutType(String str, int i) {
        }

        public static LayoutType valueOf(String str) {
            return (LayoutType) Enum.valueOf(LayoutType.class, str);
        }

        public static LayoutType[] values() {
            return (LayoutType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class Orientation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;

        @pmi0("horizontal")
        public static final Orientation HORIZONTAL;

        @pmi0("vertical")
        public static final Orientation VERTICAL;

        static {
            Orientation orientation = new Orientation("HORIZONTAL", 0);
            HORIZONTAL = orientation;
            Orientation orientation2 = new Orientation("VERTICAL", 1);
            VERTICAL = orientation2;
            Orientation[] orientationArr = {orientation, orientation2};
            $VALUES = orientationArr;
            $ENTRIES = new asp(orientationArr);
        }

        private Orientation(String str, int i) {
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsAdsStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsAdsStat$TypeAdsBanner>, a9y<MobileOfficialAppsAdsStat$TypeAdsBanner> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            int p = fai.p(x9yVar, "mini_app_id");
            String s = fai.s(x9yVar, "url");
            Type type = (Type) dq.f(x9yVar, "type", tru.a(), Type.class);
            boolean m = fai.m(x9yVar, "has_my_target_ad");
            int p2 = fai.p(x9yVar, "actual_slot_id");
            String C = fai.C(x9yVar, "track_code");
            String C2 = fai.C(x9yVar, "ad_source");
            Gson a = tru.a();
            b9y q = x9yVar.q("actual_ad_format");
            ActualAdFormat actualAdFormat = (ActualAdFormat) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), ActualAdFormat.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("skipped_reasons");
            List list = (List) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(x9yVar.q("skipped_reasons").k(), new vt20().getType()));
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("skipped_slots");
            List list2 = (List) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(x9yVar.q("skipped_slots").k(), new wt20().getType()));
            Integer A = fai.A(x9yVar, "banner_id");
            Boolean y = fai.y(x9yVar, "is_embedded");
            Gson a4 = tru.a();
            b9y q4 = x9yVar.q("banner_location");
            BannerLocation bannerLocation = (BannerLocation) ((q4 == null || (q4 instanceof u9y)) ? null : a4.fromJson(q4.k(), BannerLocation.class));
            Gson a5 = tru.a();
            b9y q5 = x9yVar.q("banner_align");
            BannerAlign bannerAlign = (BannerAlign) ((q5 == null || (q5 instanceof u9y)) ? null : a5.fromJson(q5.k(), BannerAlign.class));
            Gson a6 = tru.a();
            b9y q6 = x9yVar.q(MBridgeConstans.PROPERTIES_LAYOUT_TYPE);
            LayoutType layoutType = (LayoutType) ((q6 == null || (q6 instanceof u9y)) ? null : a6.fromJson(q6.k(), LayoutType.class));
            Gson a7 = tru.a();
            b9y q7 = x9yVar.q("height_type");
            HeightType heightType = (HeightType) ((q7 == null || (q7 instanceof u9y)) ? null : a7.fromJson(q7.k(), HeightType.class));
            Gson a8 = tru.a();
            b9y q8 = x9yVar.q(X3.i.n);
            return new MobileOfficialAppsAdsStat$TypeAdsBanner(p, s, type, m, p2, C, C2, actualAdFormat, list, list2, A, y, bannerLocation, bannerAlign, layoutType, heightType, (Orientation) ((q8 == null || (q8 instanceof u9y)) ? null : a8.fromJson(q8.k(), Orientation.class)), fai.y(x9yVar, "is_portrait"), fai.C(x9yVar, CommonUrlParts.REQUEST_ID));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsAdsStat$TypeAdsBanner mobileOfficialAppsAdsStat$TypeAdsBanner = (MobileOfficialAppsAdsStat$TypeAdsBanner) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("mini_app_id", Integer.valueOf(mobileOfficialAppsAdsStat$TypeAdsBanner.i()));
            x9yVar.o("url", mobileOfficialAppsAdsStat$TypeAdsBanner.n());
            x9yVar.o("type", tru.a().toJson(mobileOfficialAppsAdsStat$TypeAdsBanner.m()));
            x9yVar.m(Boolean.valueOf(mobileOfficialAppsAdsStat$TypeAdsBanner.f()), "has_my_target_ad");
            x9yVar.n("actual_slot_id", Integer.valueOf(mobileOfficialAppsAdsStat$TypeAdsBanner.b()));
            x9yVar.o("track_code", mobileOfficialAppsAdsStat$TypeAdsBanner.a);
            x9yVar.o("ad_source", mobileOfficialAppsAdsStat$TypeAdsBanner.b);
            x9yVar.o("actual_ad_format", tru.a().toJson(mobileOfficialAppsAdsStat$TypeAdsBanner.a()));
            x9yVar.o("skipped_reasons", tru.a().toJson(mobileOfficialAppsAdsStat$TypeAdsBanner.k()));
            x9yVar.o("skipped_slots", tru.a().toJson(mobileOfficialAppsAdsStat$TypeAdsBanner.l()));
            x9yVar.n("banner_id", mobileOfficialAppsAdsStat$TypeAdsBanner.d());
            x9yVar.m(mobileOfficialAppsAdsStat$TypeAdsBanner.o(), "is_embedded");
            x9yVar.o("banner_location", tru.a().toJson(mobileOfficialAppsAdsStat$TypeAdsBanner.e()));
            x9yVar.o("banner_align", tru.a().toJson(mobileOfficialAppsAdsStat$TypeAdsBanner.c()));
            x9yVar.o(MBridgeConstans.PROPERTIES_LAYOUT_TYPE, tru.a().toJson(mobileOfficialAppsAdsStat$TypeAdsBanner.h()));
            x9yVar.o("height_type", tru.a().toJson(mobileOfficialAppsAdsStat$TypeAdsBanner.g()));
            x9yVar.o(X3.i.n, tru.a().toJson(mobileOfficialAppsAdsStat$TypeAdsBanner.j()));
            x9yVar.m(mobileOfficialAppsAdsStat$TypeAdsBanner.p(), "is_portrait");
            x9yVar.o(CommonUrlParts.REQUEST_ID, mobileOfficialAppsAdsStat$TypeAdsBanner.c);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_hide_by_bridge")
        public static final Type TYPE_HIDE_BY_BRIDGE;

        @pmi0("type_hide_by_user")
        public static final Type TYPE_HIDE_BY_USER;

        @pmi0("type_show_auto_update")
        public static final Type TYPE_SHOW_AUTO_UPDATE;

        @pmi0("type_show_by_bridge")
        public static final Type TYPE_SHOW_BY_BRIDGE;

        @pmi0("type_tapped_by_user")
        public static final Type TYPE_TAPPED_BY_USER;

        static {
            Type type = new Type("TYPE_SHOW_BY_BRIDGE", 0);
            TYPE_SHOW_BY_BRIDGE = type;
            Type type2 = new Type("TYPE_SHOW_AUTO_UPDATE", 1);
            TYPE_SHOW_AUTO_UPDATE = type2;
            Type type3 = new Type("TYPE_HIDE_BY_USER", 2);
            TYPE_HIDE_BY_USER = type3;
            Type type4 = new Type("TYPE_HIDE_BY_BRIDGE", 3);
            TYPE_HIDE_BY_BRIDGE = type4;
            Type type5 = new Type("TYPE_TAPPED_BY_USER", 4);
            TYPE_TAPPED_BY_USER = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsAdsStat$TypeAdsBanner(int i, String str, Type type, boolean z, int i2, String str2, String str3, ActualAdFormat actualAdFormat, List<? extends SchemeStat$AppsAdsSkippedReasonItem> list, List<Integer> list2, Integer num, Boolean bool, BannerLocation bannerLocation, BannerAlign bannerAlign, LayoutType layoutType, HeightType heightType, Orientation orientation, Boolean bool2, String str4) {
        this.miniAppId = i;
        this.url = str;
        this.type = type;
        this.hasMyTargetAd = z;
        this.actualSlotId = i2;
        this.a = str2;
        this.b = str3;
        this.actualAdFormat = actualAdFormat;
        this.skippedReasons = list;
        this.skippedSlots = list2;
        this.bannerId = num;
        this.isEmbedded = bool;
        this.bannerLocation = bannerLocation;
        this.bannerAlign = bannerAlign;
        this.layoutType = layoutType;
        this.heightType = heightType;
        this.orientation = orientation;
        this.isPortrait = bool2;
        this.c = str4;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(128));
        this.filteredAdSource = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(36));
        this.filteredRequestId = filteredString3;
        filteredString.a(str2);
        filteredString2.a(str3);
        filteredString3.a(str4);
    }

    public final ActualAdFormat a() {
        return this.actualAdFormat;
    }

    public final int b() {
        return this.actualSlotId;
    }

    public final BannerAlign c() {
        return this.bannerAlign;
    }

    public final Integer d() {
        return this.bannerId;
    }

    public final BannerLocation e() {
        return this.bannerLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsAdsStat$TypeAdsBanner)) {
            return false;
        }
        MobileOfficialAppsAdsStat$TypeAdsBanner mobileOfficialAppsAdsStat$TypeAdsBanner = (MobileOfficialAppsAdsStat$TypeAdsBanner) obj;
        return this.miniAppId == mobileOfficialAppsAdsStat$TypeAdsBanner.miniAppId && epx.f(this.url, mobileOfficialAppsAdsStat$TypeAdsBanner.url) && this.type == mobileOfficialAppsAdsStat$TypeAdsBanner.type && this.hasMyTargetAd == mobileOfficialAppsAdsStat$TypeAdsBanner.hasMyTargetAd && this.actualSlotId == mobileOfficialAppsAdsStat$TypeAdsBanner.actualSlotId && epx.f(this.a, mobileOfficialAppsAdsStat$TypeAdsBanner.a) && epx.f(this.b, mobileOfficialAppsAdsStat$TypeAdsBanner.b) && this.actualAdFormat == mobileOfficialAppsAdsStat$TypeAdsBanner.actualAdFormat && epx.f(this.skippedReasons, mobileOfficialAppsAdsStat$TypeAdsBanner.skippedReasons) && epx.f(this.skippedSlots, mobileOfficialAppsAdsStat$TypeAdsBanner.skippedSlots) && epx.f(this.bannerId, mobileOfficialAppsAdsStat$TypeAdsBanner.bannerId) && epx.f(this.isEmbedded, mobileOfficialAppsAdsStat$TypeAdsBanner.isEmbedded) && this.bannerLocation == mobileOfficialAppsAdsStat$TypeAdsBanner.bannerLocation && this.bannerAlign == mobileOfficialAppsAdsStat$TypeAdsBanner.bannerAlign && this.layoutType == mobileOfficialAppsAdsStat$TypeAdsBanner.layoutType && this.heightType == mobileOfficialAppsAdsStat$TypeAdsBanner.heightType && this.orientation == mobileOfficialAppsAdsStat$TypeAdsBanner.orientation && epx.f(this.isPortrait, mobileOfficialAppsAdsStat$TypeAdsBanner.isPortrait) && epx.f(this.c, mobileOfficialAppsAdsStat$TypeAdsBanner.c);
    }

    public final boolean f() {
        return this.hasMyTargetAd;
    }

    public final HeightType g() {
        return this.heightType;
    }

    public final LayoutType h() {
        return this.layoutType;
    }

    public final int hashCode() {
        int a = shy.a(this.actualSlotId, qoy.b((this.type.hashCode() + urd0.a(Integer.hashCode(this.miniAppId) * 31, 31, this.url)) * 31, 31, this.hasMyTargetAd), 31);
        String str = this.a;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ActualAdFormat actualAdFormat = this.actualAdFormat;
        int hashCode3 = (hashCode2 + (actualAdFormat == null ? 0 : actualAdFormat.hashCode())) * 31;
        List<SchemeStat$AppsAdsSkippedReasonItem> list = this.skippedReasons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.skippedSlots;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.bannerId;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isEmbedded;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        BannerLocation bannerLocation = this.bannerLocation;
        int hashCode8 = (hashCode7 + (bannerLocation == null ? 0 : bannerLocation.hashCode())) * 31;
        BannerAlign bannerAlign = this.bannerAlign;
        int hashCode9 = (hashCode8 + (bannerAlign == null ? 0 : bannerAlign.hashCode())) * 31;
        LayoutType layoutType = this.layoutType;
        int hashCode10 = (hashCode9 + (layoutType == null ? 0 : layoutType.hashCode())) * 31;
        HeightType heightType = this.heightType;
        int hashCode11 = (hashCode10 + (heightType == null ? 0 : heightType.hashCode())) * 31;
        Orientation orientation = this.orientation;
        int hashCode12 = (hashCode11 + (orientation == null ? 0 : orientation.hashCode())) * 31;
        Boolean bool2 = this.isPortrait;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode13 + (str3 != null ? str3.hashCode() : 0);
    }

    public final int i() {
        return this.miniAppId;
    }

    public final Orientation j() {
        return this.orientation;
    }

    public final List<SchemeStat$AppsAdsSkippedReasonItem> k() {
        return this.skippedReasons;
    }

    public final List<Integer> l() {
        return this.skippedSlots;
    }

    public final Type m() {
        return this.type;
    }

    public final String n() {
        return this.url;
    }

    public final Boolean o() {
        return this.isEmbedded;
    }

    public final Boolean p() {
        return this.isPortrait;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAdsBanner(miniAppId=");
        sb.append(this.miniAppId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", hasMyTargetAd=");
        sb.append(this.hasMyTargetAd);
        sb.append(", actualSlotId=");
        sb.append(this.actualSlotId);
        sb.append(", trackCode=");
        sb.append(this.a);
        sb.append(", adSource=");
        sb.append(this.b);
        sb.append(", actualAdFormat=");
        sb.append(this.actualAdFormat);
        sb.append(", skippedReasons=");
        sb.append(this.skippedReasons);
        sb.append(", skippedSlots=");
        sb.append(this.skippedSlots);
        sb.append(", bannerId=");
        sb.append(this.bannerId);
        sb.append(", isEmbedded=");
        sb.append(this.isEmbedded);
        sb.append(", bannerLocation=");
        sb.append(this.bannerLocation);
        sb.append(", bannerAlign=");
        sb.append(this.bannerAlign);
        sb.append(", layoutType=");
        sb.append(this.layoutType);
        sb.append(", heightType=");
        sb.append(this.heightType);
        sb.append(", orientation=");
        sb.append(this.orientation);
        sb.append(", isPortrait=");
        sb.append(this.isPortrait);
        sb.append(", requestId=");
        return ho8.a(sb, this.c, ')');
    }

    public /* synthetic */ MobileOfficialAppsAdsStat$TypeAdsBanner(int i, String str, Type type, boolean z, int i2, String str2, String str3, ActualAdFormat actualAdFormat, List list, List list2, Integer num, Boolean bool, BannerLocation bannerLocation, BannerAlign bannerAlign, LayoutType layoutType, HeightType heightType, Orientation orientation, Boolean bool2, String str4, int i3, zcl zclVar) {
        this(i, str, type, z, i2, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : actualAdFormat, (i3 & 256) != 0 ? null : list, (i3 & 512) != 0 ? null : list2, (i3 & 1024) != 0 ? null : num, (i3 & 2048) != 0 ? null : bool, (i3 & 4096) != 0 ? null : bannerLocation, (i3 & 8192) != 0 ? null : bannerAlign, (i3 & 16384) != 0 ? null : layoutType, (32768 & i3) != 0 ? null : heightType, (65536 & i3) != 0 ? null : orientation, (131072 & i3) != 0 ? null : bool2, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str4);
    }
}
