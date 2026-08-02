package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEvent {

    @pmi0("app_initialized")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized appInitialized;

    @pmi0("app_started")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted appStarted;

    @pmi0("cache_loading_started")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted cacheLoadingStarted;

    @pmi0("cached_news_appeared")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared cachedNewsAppeared;

    @pmi0("consecutive_ads")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds consecutiveAds;

    @pmi0("doubles")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventDoubles doubles;

    @pmi0("empty_feed")
    private final x emptyFeed;

    @pmi0("empty_page")
    private final y emptyPage;

    @pmi0("feed_ended")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded feedEnded;

    @pmi0("loaded_news_appeared")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared loadedNewsAppeared;

    @pmi0("loader_appeared")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared loaderAppeared;

    @pmi0("loader_view")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventLoaderView loaderView;

    @pmi0("network_wait_time")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime networkWaitTime;

    @pmi0("network_wait_time_ttfb")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb networkWaitTimeTtfb;

    @pmi0("network_wait_timeout")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout networkWaitTimeout;

    @pmi0("news_item_parsing_error")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError newsItemParsingError;

    @pmi0("news_item_parsing_time")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime newsItemParsingTime;

    @pmi0("news_item_rendering_error")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError newsItemRenderingError;

    @pmi0("news_item_rendering_time")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime newsItemRenderingTime;

    @pmi0("rendering_error")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError renderingError;

    @pmi0("rendering_time")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime renderingTime;

    @pmi0("request_sent")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventRequestSent requestSent;

    @pmi0("response_parsing_error")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError responseParsingError;

    @pmi0("response_parsing_time")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime responseParsingTime;

    @pmi0("response_received")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived responseReceived;

    @pmi0("response_to_json_parsing_time")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime responseToJsonParsingTime;

    @pmi0("response_validation_error")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError responseValidationError;

    @pmi0("total_time")
    private final MobileOfficialAppsFeedStat$FeedTimelineEventTotalTime totalTime;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("app_initialized")
        public static final Type APP_INITIALIZED;

        @pmi0("app_started")
        public static final Type APP_STARTED;

        @pmi0("cached_news_appeared")
        public static final Type CACHED_NEWS_APPEARED;

        @pmi0("cache_loading_started")
        public static final Type CACHE_LOADING_STARTED;

        @pmi0("consecutive_ads")
        public static final Type CONSECUTIVE_ADS;

        @pmi0("doubles")
        public static final Type DOUBLES;

        @pmi0("empty_feed")
        public static final Type EMPTY_FEED;

        @pmi0("empty_page")
        public static final Type EMPTY_PAGE;

        @pmi0("feed_ended")
        public static final Type FEED_ENDED;

        @pmi0("loaded_news_appeared")
        public static final Type LOADED_NEWS_APPEARED;

        @pmi0("loader_appeared")
        public static final Type LOADER_APPEARED;

        @pmi0("loader_view")
        public static final Type LOADER_VIEW;

        @pmi0("network_wait_time")
        public static final Type NETWORK_WAIT_TIME;

        @pmi0("network_wait_timeout")
        public static final Type NETWORK_WAIT_TIMEOUT;

        @pmi0("network_wait_time_ttfb")
        public static final Type NETWORK_WAIT_TIME_TTFB;

        @pmi0("news_item_parsing_error")
        public static final Type NEWS_ITEM_PARSING_ERROR;

        @pmi0("news_item_parsing_time")
        public static final Type NEWS_ITEM_PARSING_TIME;

        @pmi0("news_item_rendering_error")
        public static final Type NEWS_ITEM_RENDERING_ERROR;

        @pmi0("news_item_rendering_time")
        public static final Type NEWS_ITEM_RENDERING_TIME;

        @pmi0("rendering_error")
        public static final Type RENDERING_ERROR;

        @pmi0("rendering_time")
        public static final Type RENDERING_TIME;

        @pmi0("request_sent")
        public static final Type REQUEST_SENT;

        @pmi0("response_parsing_error")
        public static final Type RESPONSE_PARSING_ERROR;

        @pmi0("response_parsing_time")
        public static final Type RESPONSE_PARSING_TIME;

        @pmi0("response_received")
        public static final Type RESPONSE_RECEIVED;

        @pmi0("response_to_json_parsing_time")
        public static final Type RESPONSE_TO_JSON_PARSING_TIME;

        @pmi0("response_validation_error")
        public static final Type RESPONSE_VALIDATION_ERROR;

        @pmi0("total_time")
        public static final Type TOTAL_TIME;

        static {
            Type type = new Type("APP_STARTED", 0);
            APP_STARTED = type;
            Type type2 = new Type("APP_INITIALIZED", 1);
            APP_INITIALIZED = type2;
            Type type3 = new Type("LOADER_APPEARED", 2);
            LOADER_APPEARED = type3;
            Type type4 = new Type("REQUEST_SENT", 3);
            REQUEST_SENT = type4;
            Type type5 = new Type("RESPONSE_RECEIVED", 4);
            RESPONSE_RECEIVED = type5;
            Type type6 = new Type("CACHE_LOADING_STARTED", 5);
            CACHE_LOADING_STARTED = type6;
            Type type7 = new Type("CACHED_NEWS_APPEARED", 6);
            CACHED_NEWS_APPEARED = type7;
            Type type8 = new Type("LOADED_NEWS_APPEARED", 7);
            LOADED_NEWS_APPEARED = type8;
            Type type9 = new Type("EMPTY_PAGE", 8);
            EMPTY_PAGE = type9;
            Type type10 = new Type("EMPTY_FEED", 9);
            EMPTY_FEED = type10;
            Type type11 = new Type("FEED_ENDED", 10);
            FEED_ENDED = type11;
            Type type12 = new Type("NETWORK_WAIT_TIME_TTFB", 11);
            NETWORK_WAIT_TIME_TTFB = type12;
            Type type13 = new Type("NETWORK_WAIT_TIME", 12);
            NETWORK_WAIT_TIME = type13;
            Type type14 = new Type("NETWORK_WAIT_TIMEOUT", 13);
            NETWORK_WAIT_TIMEOUT = type14;
            Type type15 = new Type("RESPONSE_VALIDATION_ERROR", 14);
            RESPONSE_VALIDATION_ERROR = type15;
            Type type16 = new Type("RESPONSE_TO_JSON_PARSING_TIME", 15);
            RESPONSE_TO_JSON_PARSING_TIME = type16;
            Type type17 = new Type("NEWS_ITEM_PARSING_TIME", 16);
            NEWS_ITEM_PARSING_TIME = type17;
            Type type18 = new Type("RESPONSE_PARSING_TIME", 17);
            RESPONSE_PARSING_TIME = type18;
            Type type19 = new Type("NEWS_ITEM_PARSING_ERROR", 18);
            NEWS_ITEM_PARSING_ERROR = type19;
            Type type20 = new Type("RESPONSE_PARSING_ERROR", 19);
            RESPONSE_PARSING_ERROR = type20;
            Type type21 = new Type("NEWS_ITEM_RENDERING_TIME", 20);
            NEWS_ITEM_RENDERING_TIME = type21;
            Type type22 = new Type("RENDERING_TIME", 21);
            RENDERING_TIME = type22;
            Type type23 = new Type("NEWS_ITEM_RENDERING_ERROR", 22);
            NEWS_ITEM_RENDERING_ERROR = type23;
            Type type24 = new Type("RENDERING_ERROR", 23);
            RENDERING_ERROR = type24;
            Type type25 = new Type("DOUBLES", 24);
            DOUBLES = type25;
            Type type26 = new Type("CONSECUTIVE_ADS", 25);
            CONSECUTIVE_ADS = type26;
            Type type27 = new Type("TOTAL_TIME", 26);
            TOTAL_TIME = type27;
            Type type28 = new Type("LOADER_VIEW", 27);
            LOADER_VIEW = type28;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28};
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

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class a {
        public static MobileOfficialAppsFeedStat$FeedTimelineEvent a(b bVar) {
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.APP_STARTED, (MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870908, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.APP_INITIALIZED, null, (MobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870906, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.LOADER_APPEARED, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870902, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventRequestSent) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.REQUEST_SENT, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventRequestSent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870894, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.RESPONSE_RECEIVED, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870878, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.CACHE_LOADING_STARTED, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870846, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.CACHED_NEWS_APPEARED, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870782, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.LOADED_NEWS_APPEARED, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870654, null);
            }
            if (bVar instanceof y) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.EMPTY_PAGE, null, null, null, null, null, null, null, null, null, null, null, (y) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536866814, null);
            }
            if (bVar instanceof x) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.EMPTY_FEED, null, null, null, null, null, null, null, null, null, null, null, null, (x) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536862718, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.FEED_ENDED, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536854526, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.NETWORK_WAIT_TIME_TTFB, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536868862, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.NETWORK_WAIT_TIME, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536869886, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.NETWORK_WAIT_TIMEOUT, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870398, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.RESPONSE_VALIDATION_ERROR, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError) bVar, null, null, null, null, null, null, null, null, null, null, 536608766, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.RESPONSE_TO_JSON_PARSING_TIME, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime) bVar, null, null, null, null, null, null, null, null, null, null, null, 536739838, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.NEWS_ITEM_PARSING_TIME, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime) bVar, null, null, null, null, null, null, null, null, null, null, null, null, 536805374, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.RESPONSE_PARSING_TIME, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, 536838142, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.NEWS_ITEM_PARSING_ERROR, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError) bVar, null, null, null, null, null, null, null, null, 535822334, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.RESPONSE_PARSING_ERROR, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError) bVar, null, null, null, null, null, null, null, null, null, 536346622, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.NEWS_ITEM_RENDERING_TIME, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime) bVar, null, null, null, null, 520093694, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.RENDERING_TIME, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime) bVar, null, null, null, null, null, 528482302, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.NEWS_ITEM_RENDERING_ERROR, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError) bVar, null, null, null, null, null, null, 532676606, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.RENDERING_ERROR, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError) bVar, null, null, null, null, null, null, null, 534773758, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventDoubles) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.DOUBLES, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventDoubles) bVar, null, null, null, 503316478, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.CONSECUTIVE_ADS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds) bVar, null, null, 469762046, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventTotalTime) {
                return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.TOTAL_TIME, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventTotalTime) bVar, null, 402653182, null);
            }
            if (!(bVar instanceof MobileOfficialAppsFeedStat$FeedTimelineEventLoaderView)) {
                throw new IllegalArgumentException("payload must be one of(FeedTimelineEventAppStarted, FeedTimelineEventAppInitialized, FeedTimelineEventLoaderAppeared, FeedTimelineEventRequestSent, FeedTimelineEventResponseReceived, FeedTimelineEventCacheLoadingStarted, FeedTimelineEventCachedNewsAppeared, FeedTimelineEventLoadedNewsAppeared, FeedTimelineEventEmptyPage, FeedTimelineEventEmptyFeed, FeedTimelineEventFeedEnded, FeedTimelineEventNetworkWaitTimeTtfb, FeedTimelineEventNetworkWaitTime, FeedTimelineEventNetworkWaitTimeout, FeedTimelineEventResponseValidationError, FeedTimelineEventResponseToJsonParsingTime, FeedTimelineEventNewsItemParsingTime, FeedTimelineEventResponseParsingTime, FeedTimelineEventNewsItemParsingError, FeedTimelineEventResponseParsingError, FeedTimelineEventNewsItemRenderingTime, FeedTimelineEventRenderingTime, FeedTimelineEventNewsItemRenderingError, FeedTimelineEventRenderingError, FeedTimelineEventDoubles, FeedTimelineEventConsecutiveAds, FeedTimelineEventTotalTime, FeedTimelineEventLoaderView)");
            }
            return new MobileOfficialAppsFeedStat$FeedTimelineEvent(Type.LOADER_VIEW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimelineEventLoaderView) bVar, 268435454, null);
        }
    }

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public interface b {
    }

    private MobileOfficialAppsFeedStat$FeedTimelineEvent(Type type, MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted mobileOfficialAppsFeedStat$FeedTimelineEventAppStarted, MobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized mobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized, MobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared mobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared, MobileOfficialAppsFeedStat$FeedTimelineEventRequestSent mobileOfficialAppsFeedStat$FeedTimelineEventRequestSent, MobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived mobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived, MobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted mobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted, MobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared mobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared, MobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared mobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared, MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout, MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime, MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb, y yVar, x xVar, MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded mobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded, MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime, MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime, MobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime mobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime, MobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError mobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError, MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError, MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError, MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError mobileOfficialAppsFeedStat$FeedTimelineEventRenderingError, MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError, MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime mobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime, MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime, MobileOfficialAppsFeedStat$FeedTimelineEventDoubles mobileOfficialAppsFeedStat$FeedTimelineEventDoubles, MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds mobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds, MobileOfficialAppsFeedStat$FeedTimelineEventTotalTime mobileOfficialAppsFeedStat$FeedTimelineEventTotalTime, MobileOfficialAppsFeedStat$FeedTimelineEventLoaderView mobileOfficialAppsFeedStat$FeedTimelineEventLoaderView) {
        this.type = type;
        this.appStarted = mobileOfficialAppsFeedStat$FeedTimelineEventAppStarted;
        this.appInitialized = mobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized;
        this.loaderAppeared = mobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared;
        this.requestSent = mobileOfficialAppsFeedStat$FeedTimelineEventRequestSent;
        this.responseReceived = mobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived;
        this.cacheLoadingStarted = mobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted;
        this.cachedNewsAppeared = mobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared;
        this.loadedNewsAppeared = mobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared;
        this.networkWaitTimeout = mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout;
        this.networkWaitTime = mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime;
        this.networkWaitTimeTtfb = mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb;
        this.emptyPage = yVar;
        this.emptyFeed = xVar;
        this.feedEnded = mobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded;
        this.responseParsingTime = mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime;
        this.newsItemParsingTime = mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime;
        this.responseToJsonParsingTime = mobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime;
        this.responseValidationError = mobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError;
        this.responseParsingError = mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError;
        this.newsItemParsingError = mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError;
        this.renderingError = mobileOfficialAppsFeedStat$FeedTimelineEventRenderingError;
        this.newsItemRenderingError = mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError;
        this.renderingTime = mobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime;
        this.newsItemRenderingTime = mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime;
        this.doubles = mobileOfficialAppsFeedStat$FeedTimelineEventDoubles;
        this.consecutiveAds = mobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds;
        this.totalTime = mobileOfficialAppsFeedStat$FeedTimelineEventTotalTime;
        this.loaderView = mobileOfficialAppsFeedStat$FeedTimelineEventLoaderView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEvent)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedTimelineEvent mobileOfficialAppsFeedStat$FeedTimelineEvent = (MobileOfficialAppsFeedStat$FeedTimelineEvent) obj;
        return this.type == mobileOfficialAppsFeedStat$FeedTimelineEvent.type && epx.f(this.appStarted, mobileOfficialAppsFeedStat$FeedTimelineEvent.appStarted) && epx.f(this.appInitialized, mobileOfficialAppsFeedStat$FeedTimelineEvent.appInitialized) && epx.f(this.loaderAppeared, mobileOfficialAppsFeedStat$FeedTimelineEvent.loaderAppeared) && epx.f(this.requestSent, mobileOfficialAppsFeedStat$FeedTimelineEvent.requestSent) && epx.f(this.responseReceived, mobileOfficialAppsFeedStat$FeedTimelineEvent.responseReceived) && epx.f(this.cacheLoadingStarted, mobileOfficialAppsFeedStat$FeedTimelineEvent.cacheLoadingStarted) && epx.f(this.cachedNewsAppeared, mobileOfficialAppsFeedStat$FeedTimelineEvent.cachedNewsAppeared) && epx.f(this.loadedNewsAppeared, mobileOfficialAppsFeedStat$FeedTimelineEvent.loadedNewsAppeared) && epx.f(this.networkWaitTimeout, mobileOfficialAppsFeedStat$FeedTimelineEvent.networkWaitTimeout) && epx.f(this.networkWaitTime, mobileOfficialAppsFeedStat$FeedTimelineEvent.networkWaitTime) && epx.f(this.networkWaitTimeTtfb, mobileOfficialAppsFeedStat$FeedTimelineEvent.networkWaitTimeTtfb) && epx.f(this.emptyPage, mobileOfficialAppsFeedStat$FeedTimelineEvent.emptyPage) && epx.f(this.emptyFeed, mobileOfficialAppsFeedStat$FeedTimelineEvent.emptyFeed) && epx.f(this.feedEnded, mobileOfficialAppsFeedStat$FeedTimelineEvent.feedEnded) && epx.f(this.responseParsingTime, mobileOfficialAppsFeedStat$FeedTimelineEvent.responseParsingTime) && epx.f(this.newsItemParsingTime, mobileOfficialAppsFeedStat$FeedTimelineEvent.newsItemParsingTime) && epx.f(this.responseToJsonParsingTime, mobileOfficialAppsFeedStat$FeedTimelineEvent.responseToJsonParsingTime) && epx.f(this.responseValidationError, mobileOfficialAppsFeedStat$FeedTimelineEvent.responseValidationError) && epx.f(this.responseParsingError, mobileOfficialAppsFeedStat$FeedTimelineEvent.responseParsingError) && epx.f(this.newsItemParsingError, mobileOfficialAppsFeedStat$FeedTimelineEvent.newsItemParsingError) && epx.f(this.renderingError, mobileOfficialAppsFeedStat$FeedTimelineEvent.renderingError) && epx.f(this.newsItemRenderingError, mobileOfficialAppsFeedStat$FeedTimelineEvent.newsItemRenderingError) && epx.f(this.renderingTime, mobileOfficialAppsFeedStat$FeedTimelineEvent.renderingTime) && epx.f(this.newsItemRenderingTime, mobileOfficialAppsFeedStat$FeedTimelineEvent.newsItemRenderingTime) && epx.f(this.doubles, mobileOfficialAppsFeedStat$FeedTimelineEvent.doubles) && epx.f(this.consecutiveAds, mobileOfficialAppsFeedStat$FeedTimelineEvent.consecutiveAds) && epx.f(this.totalTime, mobileOfficialAppsFeedStat$FeedTimelineEvent.totalTime) && epx.f(this.loaderView, mobileOfficialAppsFeedStat$FeedTimelineEvent.loaderView);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted mobileOfficialAppsFeedStat$FeedTimelineEventAppStarted = this.appStarted;
        int hashCode2 = (hashCode + (mobileOfficialAppsFeedStat$FeedTimelineEventAppStarted == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventAppStarted.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized mobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized = this.appInitialized;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared mobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared = this.loaderAppeared;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventRequestSent mobileOfficialAppsFeedStat$FeedTimelineEventRequestSent = this.requestSent;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsFeedStat$FeedTimelineEventRequestSent == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventRequestSent.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived mobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived = this.responseReceived;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted mobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted = this.cacheLoadingStarted;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared mobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared = this.cachedNewsAppeared;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared mobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared = this.loadedNewsAppeared;
        int hashCode9 = (hashCode8 + (mobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout = this.networkWaitTimeout;
        int hashCode10 = (hashCode9 + (mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime = this.networkWaitTime;
        int hashCode11 = (hashCode10 + (mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb = this.networkWaitTimeTtfb;
        int hashCode12 = (hashCode11 + (mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb.hashCode())) * 31;
        y yVar = this.emptyPage;
        int hashCode13 = (hashCode12 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        x xVar = this.emptyFeed;
        int hashCode14 = (hashCode13 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded mobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded = this.feedEnded;
        int hashCode15 = (hashCode14 + (mobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime = this.responseParsingTime;
        int hashCode16 = (hashCode15 + (mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime = this.newsItemParsingTime;
        int hashCode17 = (hashCode16 + (mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime mobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime = this.responseToJsonParsingTime;
        int hashCode18 = (hashCode17 + (mobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError mobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError = this.responseValidationError;
        int hashCode19 = (hashCode18 + (mobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError = this.responseParsingError;
        int hashCode20 = (hashCode19 + (mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError = this.newsItemParsingError;
        int hashCode21 = (hashCode20 + (mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError mobileOfficialAppsFeedStat$FeedTimelineEventRenderingError = this.renderingError;
        int hashCode22 = (hashCode21 + (mobileOfficialAppsFeedStat$FeedTimelineEventRenderingError == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventRenderingError.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError = this.newsItemRenderingError;
        int hashCode23 = (hashCode22 + (mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime mobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime = this.renderingTime;
        int hashCode24 = (hashCode23 + (mobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime = this.newsItemRenderingTime;
        int hashCode25 = (hashCode24 + (mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventDoubles mobileOfficialAppsFeedStat$FeedTimelineEventDoubles = this.doubles;
        int hashCode26 = (hashCode25 + (mobileOfficialAppsFeedStat$FeedTimelineEventDoubles == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventDoubles.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds mobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds = this.consecutiveAds;
        int hashCode27 = (hashCode26 + (mobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventTotalTime mobileOfficialAppsFeedStat$FeedTimelineEventTotalTime = this.totalTime;
        int hashCode28 = (hashCode27 + (mobileOfficialAppsFeedStat$FeedTimelineEventTotalTime == null ? 0 : mobileOfficialAppsFeedStat$FeedTimelineEventTotalTime.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimelineEventLoaderView mobileOfficialAppsFeedStat$FeedTimelineEventLoaderView = this.loaderView;
        return hashCode28 + (mobileOfficialAppsFeedStat$FeedTimelineEventLoaderView != null ? mobileOfficialAppsFeedStat$FeedTimelineEventLoaderView.hashCode() : 0);
    }

    public final String toString() {
        return "FeedTimelineEvent(type=" + this.type + ", appStarted=" + this.appStarted + ", appInitialized=" + this.appInitialized + ", loaderAppeared=" + this.loaderAppeared + ", requestSent=" + this.requestSent + ", responseReceived=" + this.responseReceived + ", cacheLoadingStarted=" + this.cacheLoadingStarted + ", cachedNewsAppeared=" + this.cachedNewsAppeared + ", loadedNewsAppeared=" + this.loadedNewsAppeared + ", networkWaitTimeout=" + this.networkWaitTimeout + ", networkWaitTime=" + this.networkWaitTime + ", networkWaitTimeTtfb=" + this.networkWaitTimeTtfb + ", emptyPage=" + this.emptyPage + ", emptyFeed=" + this.emptyFeed + ", feedEnded=" + this.feedEnded + ", responseParsingTime=" + this.responseParsingTime + ", newsItemParsingTime=" + this.newsItemParsingTime + ", responseToJsonParsingTime=" + this.responseToJsonParsingTime + ", responseValidationError=" + this.responseValidationError + ", responseParsingError=" + this.responseParsingError + ", newsItemParsingError=" + this.newsItemParsingError + ", renderingError=" + this.renderingError + ", newsItemRenderingError=" + this.newsItemRenderingError + ", renderingTime=" + this.renderingTime + ", newsItemRenderingTime=" + this.newsItemRenderingTime + ", doubles=" + this.doubles + ", consecutiveAds=" + this.consecutiveAds + ", totalTime=" + this.totalTime + ", loaderView=" + this.loaderView + ')';
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedTimelineEvent(Type type, MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted mobileOfficialAppsFeedStat$FeedTimelineEventAppStarted, MobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized mobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized, MobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared mobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared, MobileOfficialAppsFeedStat$FeedTimelineEventRequestSent mobileOfficialAppsFeedStat$FeedTimelineEventRequestSent, MobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived mobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived, MobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted mobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted, MobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared mobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared, MobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared mobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared, MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout, MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime, MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb, y yVar, x xVar, MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded mobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded, MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime, MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime, MobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime mobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime, MobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError mobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError, MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError, MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError, MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError mobileOfficialAppsFeedStat$FeedTimelineEventRenderingError, MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError, MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime mobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime, MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime, MobileOfficialAppsFeedStat$FeedTimelineEventDoubles mobileOfficialAppsFeedStat$FeedTimelineEventDoubles, MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds mobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds, MobileOfficialAppsFeedStat$FeedTimelineEventTotalTime mobileOfficialAppsFeedStat$FeedTimelineEventTotalTime, MobileOfficialAppsFeedStat$FeedTimelineEventLoaderView mobileOfficialAppsFeedStat$FeedTimelineEventLoaderView, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventAppStarted, (i & 4) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized, (i & 8) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared, (i & 16) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventRequestSent, (i & 32) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventResponseReceived, (i & 64) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted, (i & 128) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared, (i & 256) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventLoadedNewsAppeared, (i & 512) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeout, (i & 1024) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime, (i & 2048) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb, (i & 4096) != 0 ? null : yVar, (i & 8192) != 0 ? null : xVar, (i & 16384) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded, (i & 32768) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime, (i & 65536) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime, (i & 131072) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventResponseValidationError, (i & 524288) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingError, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError, (i & 2097152) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventRenderingError, (i & 4194304) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingError, (i & 8388608) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime, (i & 33554432) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventDoubles, (i & 67108864) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds, (i & 134217728) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventTotalTime, (i & 268435456) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimelineEventLoaderView);
    }
}
