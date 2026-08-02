package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.ironsource.O6;
import com.vk.stat.scheme.SchemeStat$EventProductMain;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.qoy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoVitrinaTvStat$TypeVitrinaTv implements SchemeStat$EventProductMain.b {
    public final transient String a;
    public final transient String b;
    public final transient String c;
    public final transient String d;

    @pmi0("client_time_zone_offset")
    private final FilteredString filteredClientTimeZoneOffset;

    @pmi0("epg_id")
    private final FilteredString filteredEpgId;

    @pmi0(O6.e1)
    private final FilteredString filteredSid;

    @pmi0("uid")
    private final FilteredString filteredUid;

    @pmi0("is_tablet")
    private final Boolean isTablet;

    @pmi0("is_web_player")
    private final boolean isWebPlayer;

    @pmi0("subtype_vitrina_tv_ad_creative_click")
    private final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeClick subtypeVitrinaTvAdCreativeClick;

    @pmi0("subtype_vitrina_tv_ad_creative_end")
    private final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd subtypeVitrinaTvAdCreativeEnd;

    @pmi0("subtype_vitrina_tv_ad_creative_loaded")
    private final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded subtypeVitrinaTvAdCreativeLoaded;

    @pmi0("subtype_vitrina_tv_ad_creative_skip")
    private final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip subtypeVitrinaTvAdCreativeSkip;

    @pmi0("subtype_vitrina_tv_ad_creative_start")
    private final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeStart subtypeVitrinaTvAdCreativeStart;

    @pmi0("subtype_vitrina_tv_ad_creative_vast_loaded")
    private final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded subtypeVitrinaTvAdCreativeVastLoaded;

    @pmi0("subtype_vitrina_tv_ad_error")
    private final CommonVideoVitrinaTvStat$VitrinaTvAdError subtypeVitrinaTvAdError;

    @pmi0("subtype_vitrina_tv_ad_request_no_wrapper")
    private final CommonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper subtypeVitrinaTvAdRequestNoWrapper;

    @pmi0("subtype_vitrina_tv_ad_tracking_failed")
    private final CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed subtypeVitrinaTvAdTrackingFailed;

    @pmi0("subtype_vitrina_tv_content_end")
    private final CommonVideoVitrinaTvStat$VitrinaTvContentEnd subtypeVitrinaTvContentEnd;

    @pmi0("subtype_vitrina_tv_first_play_or_ad")
    private final CommonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd subtypeVitrinaTvFirstPlayOrAd;

    @pmi0("subtype_vitrina_tv_heartbeat")
    private final CommonVideoVitrinaTvStat$VitrinaTvHeartbeat subtypeVitrinaTvHeartbeat;

    @pmi0("subtype_vitrina_tv_pause_end")
    private final CommonVideoVitrinaTvStat$VitrinaTvPauseEnd subtypeVitrinaTvPauseEnd;

    @pmi0("subtype_vitrina_tv_pause_start")
    private final CommonVideoVitrinaTvStat$VitrinaTvPauseStart subtypeVitrinaTvPauseStart;

    @pmi0("subtype_vitrina_tv_socdem_error")
    private final CommonVideoVitrinaTvStat$VitrinaTvSocdemError subtypeVitrinaTvSocdemError;

    @pmi0("subtype_vitrina_tv_socdem_load")
    private final CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad subtypeVitrinaTvSocdemLoad;

    @pmi0("subtype_vitrina_tv_socdem_request")
    private final CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest subtypeVitrinaTvSocdemRequest;

    @pmi0("video_id")
    private final long videoId;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    @pmi0("vitrina_subtype")
    private final VitrinaSubtype vitrinaSubtype;

    /* compiled from: CommonVideoVitrinaTvStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoVitrinaTvStat$TypeVitrinaTv>, a9y<CommonVideoVitrinaTvStat$TypeVitrinaTv> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            long q = fai.q(x9yVar, "video_id");
            long q2 = fai.q(x9yVar, "video_owner_id");
            String s = fai.s(x9yVar, O6.e1);
            String s2 = fai.s(x9yVar, "uid");
            String s3 = fai.s(x9yVar, "client_time_zone_offset");
            boolean m = fai.m(x9yVar, "is_web_player");
            VitrinaSubtype vitrinaSubtype = (VitrinaSubtype) dq.f(x9yVar, "vitrina_subtype", tru.a(), VitrinaSubtype.class);
            String C = fai.C(x9yVar, "epg_id");
            Boolean y = fai.y(x9yVar, "is_tablet");
            Gson a = tru.a();
            b9y q3 = x9yVar.q("subtype_vitrina_tv_first_play_or_ad");
            CommonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd commonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd = (CommonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd) ((q3 == null || (q3 instanceof u9y)) ? null : a.fromJson(q3.k(), CommonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd.class));
            Gson a2 = tru.a();
            b9y q4 = x9yVar.q("subtype_vitrina_tv_content_end");
            CommonVideoVitrinaTvStat$VitrinaTvContentEnd commonVideoVitrinaTvStat$VitrinaTvContentEnd = (CommonVideoVitrinaTvStat$VitrinaTvContentEnd) ((q4 == null || (q4 instanceof u9y)) ? null : a2.fromJson(q4.k(), CommonVideoVitrinaTvStat$VitrinaTvContentEnd.class));
            Gson a3 = tru.a();
            b9y q5 = x9yVar.q("subtype_vitrina_tv_heartbeat");
            CommonVideoVitrinaTvStat$VitrinaTvHeartbeat commonVideoVitrinaTvStat$VitrinaTvHeartbeat = (CommonVideoVitrinaTvStat$VitrinaTvHeartbeat) ((q5 == null || (q5 instanceof u9y)) ? null : a3.fromJson(q5.k(), CommonVideoVitrinaTvStat$VitrinaTvHeartbeat.class));
            Gson a4 = tru.a();
            b9y q6 = x9yVar.q("subtype_vitrina_tv_pause_start");
            CommonVideoVitrinaTvStat$VitrinaTvPauseStart commonVideoVitrinaTvStat$VitrinaTvPauseStart = (CommonVideoVitrinaTvStat$VitrinaTvPauseStart) ((q6 == null || (q6 instanceof u9y)) ? null : a4.fromJson(q6.k(), CommonVideoVitrinaTvStat$VitrinaTvPauseStart.class));
            Gson a5 = tru.a();
            b9y q7 = x9yVar.q("subtype_vitrina_tv_pause_end");
            CommonVideoVitrinaTvStat$VitrinaTvPauseEnd commonVideoVitrinaTvStat$VitrinaTvPauseEnd = (CommonVideoVitrinaTvStat$VitrinaTvPauseEnd) ((q7 == null || (q7 instanceof u9y)) ? null : a5.fromJson(q7.k(), CommonVideoVitrinaTvStat$VitrinaTvPauseEnd.class));
            Gson a6 = tru.a();
            b9y q8 = x9yVar.q("subtype_vitrina_tv_socdem_request");
            CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest commonVideoVitrinaTvStat$VitrinaTvSocdemRequest = (CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest) ((q8 == null || (q8 instanceof u9y)) ? null : a6.fromJson(q8.k(), CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest.class));
            Gson a7 = tru.a();
            b9y q9 = x9yVar.q("subtype_vitrina_tv_socdem_error");
            CommonVideoVitrinaTvStat$VitrinaTvSocdemError commonVideoVitrinaTvStat$VitrinaTvSocdemError = (CommonVideoVitrinaTvStat$VitrinaTvSocdemError) ((q9 == null || (q9 instanceof u9y)) ? null : a7.fromJson(q9.k(), CommonVideoVitrinaTvStat$VitrinaTvSocdemError.class));
            Gson a8 = tru.a();
            b9y q10 = x9yVar.q("subtype_vitrina_tv_socdem_load");
            CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad commonVideoVitrinaTvStat$VitrinaTvSocdemLoad = (CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad) ((q10 == null || (q10 instanceof u9y)) ? null : a8.fromJson(q10.k(), CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad.class));
            Gson a9 = tru.a();
            b9y q11 = x9yVar.q("subtype_vitrina_tv_ad_tracking_failed");
            CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed = (CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed) ((q11 == null || (q11 instanceof u9y)) ? null : a9.fromJson(q11.k(), CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.class));
            Gson a10 = tru.a();
            b9y q12 = x9yVar.q("subtype_vitrina_tv_ad_request_no_wrapper");
            CommonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper commonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper = (CommonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper) ((q12 == null || (q12 instanceof u9y)) ? null : a10.fromJson(q12.k(), CommonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper.class));
            Gson a11 = tru.a();
            b9y q13 = x9yVar.q("subtype_vitrina_tv_ad_creative_start");
            CommonVideoVitrinaTvStat$VitrinaTvAdCreativeStart commonVideoVitrinaTvStat$VitrinaTvAdCreativeStart = (CommonVideoVitrinaTvStat$VitrinaTvAdCreativeStart) ((q13 == null || (q13 instanceof u9y)) ? null : a11.fromJson(q13.k(), CommonVideoVitrinaTvStat$VitrinaTvAdCreativeStart.class));
            Gson a12 = tru.a();
            b9y q14 = x9yVar.q("subtype_vitrina_tv_ad_creative_end");
            CommonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd commonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd = (CommonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd) ((q14 == null || (q14 instanceof u9y)) ? null : a12.fromJson(q14.k(), CommonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd.class));
            Gson a13 = tru.a();
            b9y q15 = x9yVar.q("subtype_vitrina_tv_ad_creative_click");
            CommonVideoVitrinaTvStat$VitrinaTvAdCreativeClick commonVideoVitrinaTvStat$VitrinaTvAdCreativeClick = (CommonVideoVitrinaTvStat$VitrinaTvAdCreativeClick) ((q15 == null || (q15 instanceof u9y)) ? null : a13.fromJson(q15.k(), CommonVideoVitrinaTvStat$VitrinaTvAdCreativeClick.class));
            Gson a14 = tru.a();
            b9y q16 = x9yVar.q("subtype_vitrina_tv_ad_creative_skip");
            CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip = (CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip) ((q16 == null || (q16 instanceof u9y)) ? null : a14.fromJson(q16.k(), CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip.class));
            Gson a15 = tru.a();
            b9y q17 = x9yVar.q("subtype_vitrina_tv_ad_creative_loaded");
            CommonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded commonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded = (CommonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded) ((q17 == null || (q17 instanceof u9y)) ? null : a15.fromJson(q17.k(), CommonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded.class));
            Gson a16 = tru.a();
            b9y q18 = x9yVar.q("subtype_vitrina_tv_ad_creative_vast_loaded");
            CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded = (CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded) ((q18 == null || (q18 instanceof u9y)) ? null : a16.fromJson(q18.k(), CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded.class));
            Gson a17 = tru.a();
            b9y q19 = x9yVar.q("subtype_vitrina_tv_ad_error");
            return new CommonVideoVitrinaTvStat$TypeVitrinaTv(q, q2, s, s2, s3, m, vitrinaSubtype, C, y, commonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd, commonVideoVitrinaTvStat$VitrinaTvContentEnd, commonVideoVitrinaTvStat$VitrinaTvHeartbeat, commonVideoVitrinaTvStat$VitrinaTvPauseStart, commonVideoVitrinaTvStat$VitrinaTvPauseEnd, commonVideoVitrinaTvStat$VitrinaTvSocdemRequest, commonVideoVitrinaTvStat$VitrinaTvSocdemError, commonVideoVitrinaTvStat$VitrinaTvSocdemLoad, commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed, commonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper, commonVideoVitrinaTvStat$VitrinaTvAdCreativeStart, commonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd, commonVideoVitrinaTvStat$VitrinaTvAdCreativeClick, commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip, commonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded, commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded, (CommonVideoVitrinaTvStat$VitrinaTvAdError) ((q19 == null || (q19 instanceof u9y)) ? null : a17.fromJson(q19.k(), CommonVideoVitrinaTvStat$VitrinaTvAdError.class)));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoVitrinaTvStat$TypeVitrinaTv commonVideoVitrinaTvStat$TypeVitrinaTv = (CommonVideoVitrinaTvStat$TypeVitrinaTv) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("video_id", Long.valueOf(commonVideoVitrinaTvStat$TypeVitrinaTv.r()));
            x9yVar.n("video_owner_id", Long.valueOf(commonVideoVitrinaTvStat$TypeVitrinaTv.s()));
            x9yVar.o(O6.e1, commonVideoVitrinaTvStat$TypeVitrinaTv.a);
            x9yVar.o("uid", commonVideoVitrinaTvStat$TypeVitrinaTv.b);
            x9yVar.o("client_time_zone_offset", commonVideoVitrinaTvStat$TypeVitrinaTv.c);
            x9yVar.m(Boolean.valueOf(commonVideoVitrinaTvStat$TypeVitrinaTv.v()), "is_web_player");
            x9yVar.o("vitrina_subtype", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.t()));
            x9yVar.o("epg_id", commonVideoVitrinaTvStat$TypeVitrinaTv.d);
            x9yVar.m(commonVideoVitrinaTvStat$TypeVitrinaTv.u(), "is_tablet");
            x9yVar.o("subtype_vitrina_tv_first_play_or_ad", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.k()));
            x9yVar.o("subtype_vitrina_tv_content_end", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.j()));
            x9yVar.o("subtype_vitrina_tv_heartbeat", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.l()));
            x9yVar.o("subtype_vitrina_tv_pause_start", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.n()));
            x9yVar.o("subtype_vitrina_tv_pause_end", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.m()));
            x9yVar.o("subtype_vitrina_tv_socdem_request", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.q()));
            x9yVar.o("subtype_vitrina_tv_socdem_error", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.o()));
            x9yVar.o("subtype_vitrina_tv_socdem_load", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.p()));
            x9yVar.o("subtype_vitrina_tv_ad_tracking_failed", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.i()));
            x9yVar.o("subtype_vitrina_tv_ad_request_no_wrapper", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.h()));
            x9yVar.o("subtype_vitrina_tv_ad_creative_start", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.e()));
            x9yVar.o("subtype_vitrina_tv_ad_creative_end", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.b()));
            x9yVar.o("subtype_vitrina_tv_ad_creative_click", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.a()));
            x9yVar.o("subtype_vitrina_tv_ad_creative_skip", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.d()));
            x9yVar.o("subtype_vitrina_tv_ad_creative_loaded", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.c()));
            x9yVar.o("subtype_vitrina_tv_ad_creative_vast_loaded", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.f()));
            x9yVar.o("subtype_vitrina_tv_ad_error", tru.a().toJson(commonVideoVitrinaTvStat$TypeVitrinaTv.g()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoVitrinaTvStat.kt */
    /* loaded from: classes5.dex */
    public static final class VitrinaSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VitrinaSubtype[] $VALUES;

        @pmi0("vitrina_tv_ad_creative_click")
        public static final VitrinaSubtype VITRINA_TV_AD_CREATIVE_CLICK;

        @pmi0("vitrina_tv_ad_creative_end")
        public static final VitrinaSubtype VITRINA_TV_AD_CREATIVE_END;

        @pmi0("vitrina_tv_ad_creative_loaded")
        public static final VitrinaSubtype VITRINA_TV_AD_CREATIVE_LOADED;

        @pmi0("vitrina_tv_ad_creative_skip")
        public static final VitrinaSubtype VITRINA_TV_AD_CREATIVE_SKIP;

        @pmi0("vitrina_tv_ad_creative_start")
        public static final VitrinaSubtype VITRINA_TV_AD_CREATIVE_START;

        @pmi0("vitrina_tv_ad_creative_vast_loaded")
        public static final VitrinaSubtype VITRINA_TV_AD_CREATIVE_VAST_LOADED;

        @pmi0("vitrina_tv_ad_error")
        public static final VitrinaSubtype VITRINA_TV_AD_ERROR;

        @pmi0("vitrina_tv_ad_request_no_wrapper")
        public static final VitrinaSubtype VITRINA_TV_AD_REQUEST_NO_WRAPPER;

        @pmi0("vitrina_tv_ad_tracking_failed")
        public static final VitrinaSubtype VITRINA_TV_AD_TRACKING_FAILED;

        @pmi0("vitrina_tv_content_end")
        public static final VitrinaSubtype VITRINA_TV_CONTENT_END;

        @pmi0("vitrina_tv_first_play_or_ad")
        public static final VitrinaSubtype VITRINA_TV_FIRST_PLAY_OR_AD;

        @pmi0("vitrina_tv_heartbeat")
        public static final VitrinaSubtype VITRINA_TV_HEARTBEAT;

        @pmi0("vitrina_tv_pause_end")
        public static final VitrinaSubtype VITRINA_TV_PAUSE_END;

        @pmi0("vitrina_tv_pause_start")
        public static final VitrinaSubtype VITRINA_TV_PAUSE_START;

        @pmi0("vitrina_tv_socdem_error")
        public static final VitrinaSubtype VITRINA_TV_SOCDEM_ERROR;

        @pmi0("vitrina_tv_socdem_load")
        public static final VitrinaSubtype VITRINA_TV_SOCDEM_LOAD;

        @pmi0("vitrina_tv_socdem_request")
        public static final VitrinaSubtype VITRINA_TV_SOCDEM_REQUEST;

        static {
            VitrinaSubtype vitrinaSubtype = new VitrinaSubtype("VITRINA_TV_FIRST_PLAY_OR_AD", 0);
            VITRINA_TV_FIRST_PLAY_OR_AD = vitrinaSubtype;
            VitrinaSubtype vitrinaSubtype2 = new VitrinaSubtype("VITRINA_TV_CONTENT_END", 1);
            VITRINA_TV_CONTENT_END = vitrinaSubtype2;
            VitrinaSubtype vitrinaSubtype3 = new VitrinaSubtype("VITRINA_TV_HEARTBEAT", 2);
            VITRINA_TV_HEARTBEAT = vitrinaSubtype3;
            VitrinaSubtype vitrinaSubtype4 = new VitrinaSubtype("VITRINA_TV_PAUSE_START", 3);
            VITRINA_TV_PAUSE_START = vitrinaSubtype4;
            VitrinaSubtype vitrinaSubtype5 = new VitrinaSubtype("VITRINA_TV_PAUSE_END", 4);
            VITRINA_TV_PAUSE_END = vitrinaSubtype5;
            VitrinaSubtype vitrinaSubtype6 = new VitrinaSubtype("VITRINA_TV_AD_TRACKING_FAILED", 5);
            VITRINA_TV_AD_TRACKING_FAILED = vitrinaSubtype6;
            VitrinaSubtype vitrinaSubtype7 = new VitrinaSubtype("VITRINA_TV_AD_REQUEST_NO_WRAPPER", 6);
            VITRINA_TV_AD_REQUEST_NO_WRAPPER = vitrinaSubtype7;
            VitrinaSubtype vitrinaSubtype8 = new VitrinaSubtype("VITRINA_TV_AD_CREATIVE_START", 7);
            VITRINA_TV_AD_CREATIVE_START = vitrinaSubtype8;
            VitrinaSubtype vitrinaSubtype9 = new VitrinaSubtype("VITRINA_TV_AD_CREATIVE_END", 8);
            VITRINA_TV_AD_CREATIVE_END = vitrinaSubtype9;
            VitrinaSubtype vitrinaSubtype10 = new VitrinaSubtype("VITRINA_TV_AD_CREATIVE_CLICK", 9);
            VITRINA_TV_AD_CREATIVE_CLICK = vitrinaSubtype10;
            VitrinaSubtype vitrinaSubtype11 = new VitrinaSubtype("VITRINA_TV_AD_CREATIVE_SKIP", 10);
            VITRINA_TV_AD_CREATIVE_SKIP = vitrinaSubtype11;
            VitrinaSubtype vitrinaSubtype12 = new VitrinaSubtype("VITRINA_TV_AD_ERROR", 11);
            VITRINA_TV_AD_ERROR = vitrinaSubtype12;
            VitrinaSubtype vitrinaSubtype13 = new VitrinaSubtype("VITRINA_TV_AD_CREATIVE_LOADED", 12);
            VITRINA_TV_AD_CREATIVE_LOADED = vitrinaSubtype13;
            VitrinaSubtype vitrinaSubtype14 = new VitrinaSubtype("VITRINA_TV_AD_CREATIVE_VAST_LOADED", 13);
            VITRINA_TV_AD_CREATIVE_VAST_LOADED = vitrinaSubtype14;
            VitrinaSubtype vitrinaSubtype15 = new VitrinaSubtype("VITRINA_TV_SOCDEM_LOAD", 14);
            VITRINA_TV_SOCDEM_LOAD = vitrinaSubtype15;
            VitrinaSubtype vitrinaSubtype16 = new VitrinaSubtype("VITRINA_TV_SOCDEM_ERROR", 15);
            VITRINA_TV_SOCDEM_ERROR = vitrinaSubtype16;
            VitrinaSubtype vitrinaSubtype17 = new VitrinaSubtype("VITRINA_TV_SOCDEM_REQUEST", 16);
            VITRINA_TV_SOCDEM_REQUEST = vitrinaSubtype17;
            VitrinaSubtype[] vitrinaSubtypeArr = {vitrinaSubtype, vitrinaSubtype2, vitrinaSubtype3, vitrinaSubtype4, vitrinaSubtype5, vitrinaSubtype6, vitrinaSubtype7, vitrinaSubtype8, vitrinaSubtype9, vitrinaSubtype10, vitrinaSubtype11, vitrinaSubtype12, vitrinaSubtype13, vitrinaSubtype14, vitrinaSubtype15, vitrinaSubtype16, vitrinaSubtype17};
            $VALUES = vitrinaSubtypeArr;
            $ENTRIES = new asp(vitrinaSubtypeArr);
        }

        private VitrinaSubtype(String str, int i) {
        }

        public static VitrinaSubtype valueOf(String str) {
            return (VitrinaSubtype) Enum.valueOf(VitrinaSubtype.class, str);
        }

        public static VitrinaSubtype[] values() {
            return (VitrinaSubtype[]) $VALUES.clone();
        }
    }

    public CommonVideoVitrinaTvStat$TypeVitrinaTv(long j, long j2, String str, String str2, String str3, boolean z, VitrinaSubtype vitrinaSubtype, String str4, Boolean bool, CommonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd commonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd, CommonVideoVitrinaTvStat$VitrinaTvContentEnd commonVideoVitrinaTvStat$VitrinaTvContentEnd, CommonVideoVitrinaTvStat$VitrinaTvHeartbeat commonVideoVitrinaTvStat$VitrinaTvHeartbeat, CommonVideoVitrinaTvStat$VitrinaTvPauseStart commonVideoVitrinaTvStat$VitrinaTvPauseStart, CommonVideoVitrinaTvStat$VitrinaTvPauseEnd commonVideoVitrinaTvStat$VitrinaTvPauseEnd, CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest commonVideoVitrinaTvStat$VitrinaTvSocdemRequest, CommonVideoVitrinaTvStat$VitrinaTvSocdemError commonVideoVitrinaTvStat$VitrinaTvSocdemError, CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad commonVideoVitrinaTvStat$VitrinaTvSocdemLoad, CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed, CommonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper commonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeStart commonVideoVitrinaTvStat$VitrinaTvAdCreativeStart, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd commonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeClick commonVideoVitrinaTvStat$VitrinaTvAdCreativeClick, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded commonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded, CommonVideoVitrinaTvStat$VitrinaTvAdError commonVideoVitrinaTvStat$VitrinaTvAdError) {
        this.videoId = j;
        this.videoOwnerId = j2;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.isWebPlayer = z;
        this.vitrinaSubtype = vitrinaSubtype;
        this.d = str4;
        this.isTablet = bool;
        this.subtypeVitrinaTvFirstPlayOrAd = commonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd;
        this.subtypeVitrinaTvContentEnd = commonVideoVitrinaTvStat$VitrinaTvContentEnd;
        this.subtypeVitrinaTvHeartbeat = commonVideoVitrinaTvStat$VitrinaTvHeartbeat;
        this.subtypeVitrinaTvPauseStart = commonVideoVitrinaTvStat$VitrinaTvPauseStart;
        this.subtypeVitrinaTvPauseEnd = commonVideoVitrinaTvStat$VitrinaTvPauseEnd;
        this.subtypeVitrinaTvSocdemRequest = commonVideoVitrinaTvStat$VitrinaTvSocdemRequest;
        this.subtypeVitrinaTvSocdemError = commonVideoVitrinaTvStat$VitrinaTvSocdemError;
        this.subtypeVitrinaTvSocdemLoad = commonVideoVitrinaTvStat$VitrinaTvSocdemLoad;
        this.subtypeVitrinaTvAdTrackingFailed = commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed;
        this.subtypeVitrinaTvAdRequestNoWrapper = commonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper;
        this.subtypeVitrinaTvAdCreativeStart = commonVideoVitrinaTvStat$VitrinaTvAdCreativeStart;
        this.subtypeVitrinaTvAdCreativeEnd = commonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd;
        this.subtypeVitrinaTvAdCreativeClick = commonVideoVitrinaTvStat$VitrinaTvAdCreativeClick;
        this.subtypeVitrinaTvAdCreativeSkip = commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip;
        this.subtypeVitrinaTvAdCreativeLoaded = commonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded;
        this.subtypeVitrinaTvAdCreativeVastLoaded = commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded;
        this.subtypeVitrinaTvAdError = commonVideoVitrinaTvStat$VitrinaTvAdError;
        FilteredString filteredString = new FilteredString(lhg.b(36));
        this.filteredSid = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(36));
        this.filteredUid = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(50));
        this.filteredClientTimeZoneOffset = filteredString3;
        FilteredString filteredString4 = new FilteredString(lhg.b(50));
        this.filteredEpgId = filteredString4;
        filteredString.a(str);
        filteredString2.a(str2);
        filteredString3.a(str3);
        filteredString4.a(str4);
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeClick a() {
        return this.subtypeVitrinaTvAdCreativeClick;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd b() {
        return this.subtypeVitrinaTvAdCreativeEnd;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded c() {
        return this.subtypeVitrinaTvAdCreativeLoaded;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip d() {
        return this.subtypeVitrinaTvAdCreativeSkip;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeStart e() {
        return this.subtypeVitrinaTvAdCreativeStart;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoVitrinaTvStat$TypeVitrinaTv)) {
            return false;
        }
        CommonVideoVitrinaTvStat$TypeVitrinaTv commonVideoVitrinaTvStat$TypeVitrinaTv = (CommonVideoVitrinaTvStat$TypeVitrinaTv) obj;
        return this.videoId == commonVideoVitrinaTvStat$TypeVitrinaTv.videoId && this.videoOwnerId == commonVideoVitrinaTvStat$TypeVitrinaTv.videoOwnerId && epx.f(this.a, commonVideoVitrinaTvStat$TypeVitrinaTv.a) && epx.f(this.b, commonVideoVitrinaTvStat$TypeVitrinaTv.b) && epx.f(this.c, commonVideoVitrinaTvStat$TypeVitrinaTv.c) && this.isWebPlayer == commonVideoVitrinaTvStat$TypeVitrinaTv.isWebPlayer && this.vitrinaSubtype == commonVideoVitrinaTvStat$TypeVitrinaTv.vitrinaSubtype && epx.f(this.d, commonVideoVitrinaTvStat$TypeVitrinaTv.d) && epx.f(this.isTablet, commonVideoVitrinaTvStat$TypeVitrinaTv.isTablet) && epx.f(this.subtypeVitrinaTvFirstPlayOrAd, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvFirstPlayOrAd) && epx.f(this.subtypeVitrinaTvContentEnd, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvContentEnd) && epx.f(this.subtypeVitrinaTvHeartbeat, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvHeartbeat) && epx.f(this.subtypeVitrinaTvPauseStart, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvPauseStart) && epx.f(this.subtypeVitrinaTvPauseEnd, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvPauseEnd) && epx.f(this.subtypeVitrinaTvSocdemRequest, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvSocdemRequest) && epx.f(this.subtypeVitrinaTvSocdemError, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvSocdemError) && epx.f(this.subtypeVitrinaTvSocdemLoad, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvSocdemLoad) && epx.f(this.subtypeVitrinaTvAdTrackingFailed, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvAdTrackingFailed) && epx.f(this.subtypeVitrinaTvAdRequestNoWrapper, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvAdRequestNoWrapper) && epx.f(this.subtypeVitrinaTvAdCreativeStart, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvAdCreativeStart) && epx.f(this.subtypeVitrinaTvAdCreativeEnd, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvAdCreativeEnd) && epx.f(this.subtypeVitrinaTvAdCreativeClick, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvAdCreativeClick) && epx.f(this.subtypeVitrinaTvAdCreativeSkip, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvAdCreativeSkip) && epx.f(this.subtypeVitrinaTvAdCreativeLoaded, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvAdCreativeLoaded) && epx.f(this.subtypeVitrinaTvAdCreativeVastLoaded, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvAdCreativeVastLoaded) && epx.f(this.subtypeVitrinaTvAdError, commonVideoVitrinaTvStat$TypeVitrinaTv.subtypeVitrinaTvAdError);
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded f() {
        return this.subtypeVitrinaTvAdCreativeVastLoaded;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvAdError g() {
        return this.subtypeVitrinaTvAdError;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper h() {
        return this.subtypeVitrinaTvAdRequestNoWrapper;
    }

    public final int hashCode() {
        int hashCode = (this.vitrinaSubtype.hashCode() + qoy.b(urd0.a(urd0.a(urd0.a(bh10.a(Long.hashCode(this.videoId) * 31, 31, this.videoOwnerId), 31, this.a), 31, this.b), 31, this.c), 31, this.isWebPlayer)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isTablet;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd commonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd = this.subtypeVitrinaTvFirstPlayOrAd;
        int hashCode4 = (hashCode3 + (commonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvContentEnd commonVideoVitrinaTvStat$VitrinaTvContentEnd = this.subtypeVitrinaTvContentEnd;
        int hashCode5 = (hashCode4 + (commonVideoVitrinaTvStat$VitrinaTvContentEnd == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvContentEnd.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvHeartbeat commonVideoVitrinaTvStat$VitrinaTvHeartbeat = this.subtypeVitrinaTvHeartbeat;
        int hashCode6 = (hashCode5 + (commonVideoVitrinaTvStat$VitrinaTvHeartbeat == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvHeartbeat.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvPauseStart commonVideoVitrinaTvStat$VitrinaTvPauseStart = this.subtypeVitrinaTvPauseStart;
        int hashCode7 = (hashCode6 + (commonVideoVitrinaTvStat$VitrinaTvPauseStart == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvPauseStart.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvPauseEnd commonVideoVitrinaTvStat$VitrinaTvPauseEnd = this.subtypeVitrinaTvPauseEnd;
        int hashCode8 = (hashCode7 + (commonVideoVitrinaTvStat$VitrinaTvPauseEnd == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvPauseEnd.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest commonVideoVitrinaTvStat$VitrinaTvSocdemRequest = this.subtypeVitrinaTvSocdemRequest;
        int hashCode9 = (hashCode8 + (commonVideoVitrinaTvStat$VitrinaTvSocdemRequest == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvSocdemRequest.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvSocdemError commonVideoVitrinaTvStat$VitrinaTvSocdemError = this.subtypeVitrinaTvSocdemError;
        int hashCode10 = (hashCode9 + (commonVideoVitrinaTvStat$VitrinaTvSocdemError == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvSocdemError.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad commonVideoVitrinaTvStat$VitrinaTvSocdemLoad = this.subtypeVitrinaTvSocdemLoad;
        int hashCode11 = (hashCode10 + (commonVideoVitrinaTvStat$VitrinaTvSocdemLoad == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvSocdemLoad.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed = this.subtypeVitrinaTvAdTrackingFailed;
        int hashCode12 = (hashCode11 + (commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper commonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper = this.subtypeVitrinaTvAdRequestNoWrapper;
        int hashCode13 = (hashCode12 + (commonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvAdCreativeStart commonVideoVitrinaTvStat$VitrinaTvAdCreativeStart = this.subtypeVitrinaTvAdCreativeStart;
        int hashCode14 = (hashCode13 + (commonVideoVitrinaTvStat$VitrinaTvAdCreativeStart == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvAdCreativeStart.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd commonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd = this.subtypeVitrinaTvAdCreativeEnd;
        int hashCode15 = (hashCode14 + (commonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvAdCreativeClick commonVideoVitrinaTvStat$VitrinaTvAdCreativeClick = this.subtypeVitrinaTvAdCreativeClick;
        int hashCode16 = (hashCode15 + (commonVideoVitrinaTvStat$VitrinaTvAdCreativeClick == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvAdCreativeClick.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip = this.subtypeVitrinaTvAdCreativeSkip;
        int hashCode17 = (hashCode16 + (commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded commonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded = this.subtypeVitrinaTvAdCreativeLoaded;
        int hashCode18 = (hashCode17 + (commonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded = this.subtypeVitrinaTvAdCreativeVastLoaded;
        int hashCode19 = (hashCode18 + (commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvAdError commonVideoVitrinaTvStat$VitrinaTvAdError = this.subtypeVitrinaTvAdError;
        return hashCode19 + (commonVideoVitrinaTvStat$VitrinaTvAdError != null ? commonVideoVitrinaTvStat$VitrinaTvAdError.hashCode() : 0);
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed i() {
        return this.subtypeVitrinaTvAdTrackingFailed;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvContentEnd j() {
        return this.subtypeVitrinaTvContentEnd;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd k() {
        return this.subtypeVitrinaTvFirstPlayOrAd;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvHeartbeat l() {
        return this.subtypeVitrinaTvHeartbeat;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvPauseEnd m() {
        return this.subtypeVitrinaTvPauseEnd;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvPauseStart n() {
        return this.subtypeVitrinaTvPauseStart;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvSocdemError o() {
        return this.subtypeVitrinaTvSocdemError;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad p() {
        return this.subtypeVitrinaTvSocdemLoad;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest q() {
        return this.subtypeVitrinaTvSocdemRequest;
    }

    public final long r() {
        return this.videoId;
    }

    public final long s() {
        return this.videoOwnerId;
    }

    public final VitrinaSubtype t() {
        return this.vitrinaSubtype;
    }

    public final String toString() {
        return "TypeVitrinaTv(videoId=" + this.videoId + ", videoOwnerId=" + this.videoOwnerId + ", sid=" + this.a + ", uid=" + this.b + ", clientTimeZoneOffset=" + this.c + ", isWebPlayer=" + this.isWebPlayer + ", vitrinaSubtype=" + this.vitrinaSubtype + ", epgId=" + this.d + ", isTablet=" + this.isTablet + ", subtypeVitrinaTvFirstPlayOrAd=" + this.subtypeVitrinaTvFirstPlayOrAd + ", subtypeVitrinaTvContentEnd=" + this.subtypeVitrinaTvContentEnd + ", subtypeVitrinaTvHeartbeat=" + this.subtypeVitrinaTvHeartbeat + ", subtypeVitrinaTvPauseStart=" + this.subtypeVitrinaTvPauseStart + ", subtypeVitrinaTvPauseEnd=" + this.subtypeVitrinaTvPauseEnd + ", subtypeVitrinaTvSocdemRequest=" + this.subtypeVitrinaTvSocdemRequest + ", subtypeVitrinaTvSocdemError=" + this.subtypeVitrinaTvSocdemError + ", subtypeVitrinaTvSocdemLoad=" + this.subtypeVitrinaTvSocdemLoad + ", subtypeVitrinaTvAdTrackingFailed=" + this.subtypeVitrinaTvAdTrackingFailed + ", subtypeVitrinaTvAdRequestNoWrapper=" + this.subtypeVitrinaTvAdRequestNoWrapper + ", subtypeVitrinaTvAdCreativeStart=" + this.subtypeVitrinaTvAdCreativeStart + ", subtypeVitrinaTvAdCreativeEnd=" + this.subtypeVitrinaTvAdCreativeEnd + ", subtypeVitrinaTvAdCreativeClick=" + this.subtypeVitrinaTvAdCreativeClick + ", subtypeVitrinaTvAdCreativeSkip=" + this.subtypeVitrinaTvAdCreativeSkip + ", subtypeVitrinaTvAdCreativeLoaded=" + this.subtypeVitrinaTvAdCreativeLoaded + ", subtypeVitrinaTvAdCreativeVastLoaded=" + this.subtypeVitrinaTvAdCreativeVastLoaded + ", subtypeVitrinaTvAdError=" + this.subtypeVitrinaTvAdError + ')';
    }

    public final Boolean u() {
        return this.isTablet;
    }

    public final boolean v() {
        return this.isWebPlayer;
    }

    public /* synthetic */ CommonVideoVitrinaTvStat$TypeVitrinaTv(long j, long j2, String str, String str2, String str3, boolean z, VitrinaSubtype vitrinaSubtype, String str4, Boolean bool, CommonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd commonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd, CommonVideoVitrinaTvStat$VitrinaTvContentEnd commonVideoVitrinaTvStat$VitrinaTvContentEnd, CommonVideoVitrinaTvStat$VitrinaTvHeartbeat commonVideoVitrinaTvStat$VitrinaTvHeartbeat, CommonVideoVitrinaTvStat$VitrinaTvPauseStart commonVideoVitrinaTvStat$VitrinaTvPauseStart, CommonVideoVitrinaTvStat$VitrinaTvPauseEnd commonVideoVitrinaTvStat$VitrinaTvPauseEnd, CommonVideoVitrinaTvStat$VitrinaTvSocdemRequest commonVideoVitrinaTvStat$VitrinaTvSocdemRequest, CommonVideoVitrinaTvStat$VitrinaTvSocdemError commonVideoVitrinaTvStat$VitrinaTvSocdemError, CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad commonVideoVitrinaTvStat$VitrinaTvSocdemLoad, CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed, CommonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper commonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeStart commonVideoVitrinaTvStat$VitrinaTvAdCreativeStart, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd commonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeClick commonVideoVitrinaTvStat$VitrinaTvAdCreativeClick, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded commonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded, CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded, CommonVideoVitrinaTvStat$VitrinaTvAdError commonVideoVitrinaTvStat$VitrinaTvAdError, int i, zcl zclVar) {
        this(j, j2, str, str2, str3, z, vitrinaSubtype, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvFirstPlayOrAd, (i & 1024) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvContentEnd, (i & 2048) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvHeartbeat, (i & 4096) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvPauseStart, (i & 8192) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvPauseEnd, (i & 16384) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvSocdemRequest, (32768 & i) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvSocdemError, (65536 & i) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvSocdemLoad, (131072 & i) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed, (262144 & i) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvAdRequestNoWrapper, (524288 & i) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvAdCreativeStart, (1048576 & i) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvAdCreativeEnd, (2097152 & i) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvAdCreativeClick, (4194304 & i) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip, (8388608 & i) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvAdCreativeLoaded, (16777216 & i) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded, (i & 33554432) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvAdError);
    }
}
